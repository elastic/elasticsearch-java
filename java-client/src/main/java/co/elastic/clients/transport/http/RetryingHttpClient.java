/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.transport.http;

import co.elastic.clients.transport.RetryConfig;
import co.elastic.clients.transport.TransportOptions;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A {@link TransportHttpClient} wrapper that retries failed requests according to the {@link RetryConfig}
 * carried by each request's {@link TransportOptions}.
 * <p>
 * The retry configuration is read from the {@link TransportOptions} passed to every call (see
 * {@link TransportOptions#retryConfig()}), so it can be set globally on the client or overridden per request,
 * exactly like headers or query parameters. When the effective configuration is disabled
 * ({@link RetryConfig#isEnabled()} returns {@code false}), the call is forwarded to the delegate unchanged.
 * <p>
 * A request is retried when:
 * <ul>
 *   <li>the delegate fails with an exception matching {@link RetryConfig#retryableExceptions()}, or</li>
 *   <li>the delegate returns a response whose status code is in {@link RetryConfig#retryableStatuses()}.</li>
 * </ul>
 * <p>
 * Notes:
 * <ul>
 *   <li>Retries assume the underlying request is safe to repeat. Most Elasticsearch APIs are idempotent at the user
 *       level, but users issuing custom non-idempotent operations should think twice before enabling retries.</li>
 *   <li>Retries reissue the same logical request to the {@code delegate}. Node selection (and any node-rotation /
 *       dead-node tracking) is the delegate's responsibility: this wrapper does not influence which node a retried
 *       request is sent to.</li>
 *   <li>The async path uses a {@link ScheduledExecutorService} to defer retries without blocking the calling thread
 *       pool. A single-thread daemon scheduler is created with this client and shut down by {@link #close()}. Its
 *       worker thread is started on the first actual retry and reaped once it has been idle longer than the largest
 *       backoff delay seen so far (then recreated on demand), so a client that isn't actively retrying holds no retry
 *       thread, while an in-progress retry sequence never reaps its worker between attempts. Users can supply their
 *       own scheduler via {@link #RetryingHttpClient(TransportHttpClient, ScheduledExecutorService)}, in which case
 *       its lifecycle (and idle behavior) is the user's responsibility.</li>
 * </ul>
 */
public final class RetryingHttpClient implements TransportHttpClient {

    private static final Log logger = LogFactory.getLog(RetryingHttpClient.class);

    // Instance counter, to name the retry thread
    private static final AtomicInteger idCounter = new AtomicInteger();

    // Margin added on top of a retry's backoff delay when sizing the worker's idle keep-alive, so the worker
    // comfortably outlives the wait between two attempts. It also acts as the minimum idle window (for very short
    // backoffs) and as the initial keep-alive before any retry is scheduled. See keepWorkerAliveFor.
    private static final long IDLE_KEEP_ALIVE_MARGIN_MS = 1000L;

    private final TransportHttpClient delegate;

    // The scheduler used to defer retries. Its (single, daemon) worker thread is only started on the first
    // scheduled retry and is reaped while idle (see defaultRetryScheduler / keepWorkerAliveFor), so a client
    // that isn't actively retrying holds no retry thread.
    private final ScheduledExecutorService retryScheduler;
    // Same instance as retryScheduler when we created it ourselves, null for a user-supplied scheduler. Used to
    // shut down and tune the idle keep-alive of a scheduler we own; we never reconfigure one we don't.
    @Nullable
    private final ScheduledThreadPoolExecutor managedScheduler;

    public RetryingHttpClient(TransportHttpClient delegate) {
        this.delegate = Objects.requireNonNull(delegate, "delegate");
        ScheduledThreadPoolExecutor scheduler = defaultRetryScheduler();
        this.retryScheduler = scheduler;
        this.managedScheduler = scheduler;
    }

    /**
     * Build a retrying client using a user-provided scheduler. The external scheduler won't be shut down or
     * reconfigured by this client.
     */
    public RetryingHttpClient(TransportHttpClient delegate, ScheduledExecutorService scheduler) {
        this.delegate = Objects.requireNonNull(delegate, "delegate");
        this.retryScheduler = Objects.requireNonNull(scheduler, "scheduler");
        this.managedScheduler = null;
    }

    @Override
    public TransportOptions createOptions(@Nullable TransportOptions options) {
        return delegate.createOptions(options);
    }

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                   TransportOptions options) throws IOException {
        // No retries configured for this request: forward to the delegate unchanged (no async indirection).
        if (!configOf(options).isEnabled()) {
            return delegate.performRequest(endpointId, node, request, options);
        }
        try {
            return performRequestAsync(endpointId, node, request, options).get();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("thread waiting for the response was interrupted", ie);
        } catch (ExecutionException ee) {
            Throwable cause = ee.getCause();
            if (cause instanceof IOException) {
                throw (IOException) cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException) cause;
            }
            if (cause instanceof Error) {
                throw (Error) cause;
            }
            throw new IOException(cause);
        }
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node, Request request,
                                                           TransportOptions options) {
        RetryConfig config = configOf(options);
        if (!config.isEnabled()) {
            return delegate.performRequestAsync(endpointId, node, request, options);
        }
        RetryFuture result = new RetryFuture();
        attemptAsync(endpointId, node, request, options, config, config.backoffPolicy().iterator(), result);
        return result;
    }

    private void attemptAsync(String endpointId, @Nullable Node node, Request request, TransportOptions options,
                              RetryConfig config, Iterator<Long> backoffIter, RetryFuture result) {
        if (result.isDone()) {
            return;
        }

        CompletableFuture<Response> attempt = delegate.performRequestAsync(endpointId, node, request, options);
        result.setInFlight(attempt);

        attempt.whenComplete((resp, err) -> {
            // Early return if request was cancelled
            if (result.isCancelled()) {
                if (resp != null) {
                    closeQuietly(resp);
                }
                return;
            }
            result.clearInFlight();

            // Classify the outcome
            Throwable cause = err != null ? unwrap(err) : null;
            boolean retryable = cause != null
                ? isRetryableException(config, cause)
                : isRetryableStatus(config, resp);

            // Not retryable, or no retries left: complete with whatever we got
            if (!retryable || !backoffIter.hasNext()) {
                if (retryable) {
                    logger.warn("Retries exhausted for [" + endpointId + "]");
                }
                if (cause != null) {
                    result.completeExceptionally(cause);
                } else if (!result.complete(resp)) {
                    // The future was already completed/cancelled elsewhere: avoid leaking the response
                    closeQuietly(resp);
                }
                return;
            }

            // Retryable with budget left: close any response before triggering a retry
            if (resp != null) {
                closeQuietly(resp);
            }

            long delayMs = backoffIter.next();
            if (logger.isDebugEnabled()) {
                logger.debug("Retrying [" + endpointId + "] in " + delayMs + " ms");
            }

            try {
                // Make sure the worker survives this wait so the sequence doesn't churn its thread.
                keepWorkerAliveFor(delayMs);
                ScheduledFuture<?> scheduled = retryScheduler.schedule(
                    () -> attemptAsync(endpointId, node, request, options, config, backoffIter, result),
                    delayMs, TimeUnit.MILLISECONDS
                );
                result.setScheduledRetry(scheduled);
            } catch (RejectedExecutionException rex) {
                result.completeExceptionally(cause != null ? cause : rex);
            }
        });
    }

    @Override
    public void close() throws IOException {
        try {
            delegate.close();
        } finally {
            // Only shut down a scheduler we created; a user-supplied one is the caller's responsibility.
            if (managedScheduler != null) {
                managedScheduler.shutdownNow();
            }
        }
    }

    boolean isRetryableException(RetryConfig config, Throwable err) {
        return matchesRetryable(config, err) || matchesRetryable(config, err.getCause());
    }

    private boolean matchesRetryable(RetryConfig config, @Nullable Throwable t) {
        if (t == null) {
            return false;
        }
        for (Class<? extends Throwable> ex : config.retryableExceptions()) {
            if (ex.isInstance(t)) {
                return true;
            }
        }
        return false;
    }

    boolean isRetryableStatus(RetryConfig config, Response resp) {
        return config.retryableStatuses().contains(resp.statusCode());
    }

    private static RetryConfig configOf(@Nullable TransportOptions options) {
        RetryConfig config = options == null ? null : options.retryConfig();
        return config == null ? RetryConfig.disabled() : config;
    }

    private static Throwable unwrap(Throwable t) {
        while (t instanceof CompletionException && t.getCause() != null && t.getCause() != t) {
            t = t.getCause();
        }
        return t;
    }

    private static void closeQuietly(Response resp) {
        try {
            resp.close();
        } catch (IOException ignored) {
            // ignored
        }
    }

    private static ScheduledThreadPoolExecutor defaultRetryScheduler() {
        int clientId = idCounter.incrementAndGet();
        ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1, r -> {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setName("elasticsearch-java-retry#" + clientId + "#" + t.getId());
            t.setDaemon(true);
            return t;
        });
        // Don't keep an idle worker parked between (potentially infrequent) retry sequences: the thread is started
        // on the first scheduled retry, reaped once it sits idle, and recreated on demand. The idle window starts
        // at the margin below and is grown to track the backoff in use (see keepWorkerAliveFor) so an active
        // sequence never reaps its worker between attempts.
        scheduler.setKeepAliveTime(IDLE_KEEP_ALIVE_MARGIN_MS, TimeUnit.MILLISECONDS);
        scheduler.allowCoreThreadTimeOut(true);
        // Cancelled retries (e.g. after request cancellation) are removed from the queue immediately so they
        // don't keep the worker alive or delay its reaping.
        scheduler.setRemoveOnCancelPolicy(true);
        return scheduler;
    }

    /**
     * Grows the managed scheduler's idle keep-alive so its single worker outlives the wait before the next attempt
     * ({@code delayMs} plus a margin) and isn't reaped/recreated mid-sequence. We only ever increase it, so it ends
     * up tracking the largest backoff delay seen; an idle scheduler then reaps its worker after that window. No-op
     * for a user-supplied scheduler, which we never reconfigure.
     */
    private void keepWorkerAliveFor(long delayMs) {
        ScheduledThreadPoolExecutor scheduler = managedScheduler;
        if (scheduler == null || delayMs <= 0) {
            return;
        }
        long desiredMs = delayMs + IDLE_KEEP_ALIVE_MARGIN_MS;
        if (desiredMs > 0 && scheduler.getKeepAliveTime(TimeUnit.MILLISECONDS) < desiredMs) {
            scheduler.setKeepAliveTime(desiredMs, TimeUnit.MILLISECONDS);
        }
    }

    /**
     * Result future that propagates cancellation to both the in-flight delegate request and any pending scheduled retry.
     */
    private static final class RetryFuture extends CompletableFuture<Response> {
        private volatile CompletableFuture<Response> inFlight;
        private volatile ScheduledFuture<?> scheduledRetry;

        void setInFlight(CompletableFuture<Response> future) {
            this.inFlight = future;
            if (isCancelled()) {
                future.cancel(true);
            }
        }

        void clearInFlight() {
            this.inFlight = null;
        }

        void setScheduledRetry(ScheduledFuture<?> scheduledFuture) {
            this.scheduledRetry = scheduledFuture;
            if (isCancelled()) {
                scheduledFuture.cancel(false);
            }
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled) {
                CompletableFuture<Response> future = inFlight;
                if (future != null) {
                    future.cancel(mayInterruptIfRunning);
                }
                ScheduledFuture<?> scheduledFuture = scheduledRetry;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
            }
            return cancelled;
        }
    }
}
