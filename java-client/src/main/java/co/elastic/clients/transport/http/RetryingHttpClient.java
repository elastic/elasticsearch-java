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
 *   <li>the delegate returns a response — or fails with an exception that the delegate recognizes as carrying
 *       a response, see {@link TransportHttpClient#responseStatusCode(Throwable)} — whose status code is in
 *       {@link RetryConfig#retryableStatuses()}, or</li>
 *   <li>the delegate fails with an exception matching {@link RetryConfig#retryableExceptions()}. Exceptions
 *       carrying a response are always classified by their status code, never by exception type.</li>
 * </ul>
 * <p>
 * Notes:
 * <ul>
 *   <li>Retries assume the underlying request is safe to repeat. Most Elasticsearch APIs are idempotent at the user
 *       level, but users issuing custom non-idempotent operations should think twice before enabling retries.</li>
 *   <li>Retries reissue the same logical request to the {@code delegate}. Node selection (and any node-rotation /
 *       dead-node tracking) is the delegate's responsibility: this wrapper does not influence which node a retried
 *       request is sent to.</li>
 *   <li>When retries are enabled, blocking requests are executed through the delegate's asynchronous path, so
 *       exception stack traces reflect the async machinery rather than the calling thread.</li>
 *   <li>Backoff delays are scheduled on a {@link ScheduledExecutorService}. A single daemon-thread
 *       scheduler is created with this client and shut down by {@link #close()}; its thread is started lazily on
 *       the first retry and stopped while idle. A scheduler can also be supplied via
 *       {@link #RetryingHttpClient(TransportHttpClient, ScheduledExecutorService)}, in which case its lifecycle is
 *       the caller's responsibility.</li>
 * </ul>
 */
public final class RetryingHttpClient implements TransportHttpClient {

    private static final Log logger = LogFactory.getLog(RetryingHttpClient.class);

    // Instance counter, to name the retry thread
    private static final AtomicInteger idCounter = new AtomicInteger();

    // Idle time (ms) after which the retry worker thread is stopped. During waits longer than this the worker
    // wakes up once per interval, which is cheap; there is no need to track the backoff delays in use.
    private static final long RETRY_SCHEDULER_KEEP_ALIVE_MS = 10_000L;

    private final TransportHttpClient delegate;

    // The scheduler used to defer retries. Its (single, daemon) worker thread is only started on the first
    // scheduled retry and is stopped while idle (see defaultRetryScheduler), so a client that isn't actively
    // retrying holds no retry thread.
    private final ScheduledExecutorService retryScheduler;
    // Same instance as retryScheduler when we created it ourselves, null for a user-supplied scheduler, whose
    // lifecycle is the caller's responsibility. Used to shut down a scheduler we own on close().
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

    @Nullable
    @Override
    public Integer responseStatusCode(Throwable exception) {
        return delegate.responseStatusCode(exception);
    }

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                   TransportOptions options) throws IOException {
        // No retries configured for this request: forward to the delegate unchanged (no async indirection).
        if (!configOf(options).isEnabled()) {
            return delegate.performRequest(endpointId, node, request, options);
        }
        CompletableFuture<Response> future = performRequestAsync(endpointId, node, request, options);
        try {
            return future.get();
        } catch (InterruptedException ie) {
            // The caller has given up: stop the in-flight attempt and any pending retries, so they don't
            // keep running (and holding the request body and a connection) with nobody waiting.
            future.cancel(true);
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
                ? isRetryableFailure(config, cause)
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

    /**
     * Decides whether a failed attempt is retryable. Failures that the delegate recognizes as carrying an http
     * response (see {@link TransportHttpClient#responseStatusCode(Throwable)}) are classified by their status
     * code only: the server did answer, so the exception type must not make an otherwise non-retryable status
     * retryable. Other failures are classified by exception type.
     */
    boolean isRetryableFailure(RetryConfig config, Throwable err) {
        Integer status = delegate.responseStatusCode(err);
        if (status == null && err.getCause() != null) {
            status = delegate.responseStatusCode(err.getCause());
        }
        if (status != null) {
            return config.retryableStatuses().contains(status);
        }
        return isRetryableException(config, err);
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
        // on the first scheduled retry, stopped once it has been idle for the keep-alive window, and recreated on
        // demand. A pending scheduled retry always keeps the worker alive (the pool never stops its last worker
        // while the queue is non-empty), so an in-progress sequence is never affected.
        scheduler.setKeepAliveTime(RETRY_SCHEDULER_KEEP_ALIVE_MS, TimeUnit.MILLISECONDS);
        scheduler.allowCoreThreadTimeOut(true);
        // Cancelled retries (e.g. after request cancellation) are removed from the queue immediately so they
        // don't keep the worker alive or delay it being stopped.
        scheduler.setRemoveOnCancelPolicy(true);
        return scheduler;
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
