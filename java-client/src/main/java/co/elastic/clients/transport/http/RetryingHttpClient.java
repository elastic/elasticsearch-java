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

import co.elastic.clients.transport.BackoffPolicy;
import co.elastic.clients.transport.RetryConfig;
import co.elastic.clients.transport.TransportOptions;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A {@link TransportHttpClient} wrapper that retries failed requests according to a {@link RetryConfig}.
 * <p>
 * A request is retried when:
 * <ul>
 *   <li>the delegate fails with an exception matching {@link RetryConfig#retryableExceptions()}, or</li>
 *   <li>the delegate returns a response whose status code is in {@link RetryConfig#retryableStatuses()}.</li>
 * </ul>
 * <p>
 * Notes:
 * <ul>
 *   <li>Retries assume the underlying request is safe to repeat. Most Elasticsearch APIs are idempotent at the user level,
 *       but users using custom non-idempotent operations should think twice before enabling retries.</li>
 *   <li>The async path uses a {@link ScheduledExecutorService} to defer retries without blocking the calling thread pool.
 *       A single-thread daemon scheduler is created by default and is shut down by {@link #close()}; users can supply
 *       their own scheduler via {@link #RetryingHttpClient(TransportHttpClient, RetryConfig, ScheduledExecutorService)}
 *       in which case its lifecycle is the user's responsibility.</li>
 * </ul>
 */
public final class RetryingHttpClient implements TransportHttpClient {

    private static final Log logger = LogFactory.getLog(RetryingHttpClient.class);

    // Instance counter, to name the retry thread
    private static final AtomicInteger idCounter = new AtomicInteger();

    private final TransportHttpClient delegate;
    private final BackoffPolicy backoffPolicy;
    private final Set<Integer> retryableStatuses;
    private final Set<Class<? extends Throwable>> retryableExceptions;
    private final ScheduledExecutorService retryScheduler;
    private final boolean isExternalScheduler;

    public RetryingHttpClient(TransportHttpClient delegate, RetryConfig retryConfig) {
        this(delegate, retryConfig, defaultRetryScheduler(), false);
    }

    /**
     * Build a retrying client using a user-provided scheduler. The external scheduler won't be shut down
     * by {@link #close()}.
     */
    public RetryingHttpClient(TransportHttpClient delegate, RetryConfig retryConfig, ScheduledExecutorService scheduler) {
        this(delegate, retryConfig, scheduler, true);
    }

    private RetryingHttpClient(TransportHttpClient delegate, RetryConfig retryConfig,
                               ScheduledExecutorService scheduler, boolean isExternalScheduler) {
        this.delegate = Objects.requireNonNull(delegate, "delegate");
        RetryConfig cfg = retryConfig == null ? RetryConfig.disabled() : retryConfig;
        this.backoffPolicy = cfg.backoffPolicy();
        this.retryableStatuses = cfg.retryableStatuses();
        this.retryableExceptions = cfg.retryableExceptions();
        this.retryScheduler = Objects.requireNonNull(scheduler, "scheduler");
        this.isExternalScheduler = isExternalScheduler;
    }

    @Override
    public TransportOptions createOptions(@Nullable TransportOptions options) {
        return delegate.createOptions(options);
    }

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                   TransportOptions options) throws IOException {
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
        RetryFuture result = new RetryFuture();
        attemptAsync(endpointId, node, request, options, backoffPolicy.iterator(), result);
        return result;
    }

    private void attemptAsync(String endpointId, @Nullable Node node, Request request, TransportOptions options,
                              Iterator<Long> backoffIter, RetryFuture result) {
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

            // Early return if there's no more retries
            if (!backoffIter.hasNext()) {
                logger.warn("Retries exhausted for [" + endpointId + "]");
                if (err != null) {
                    result.completeExceptionally(unwrap(err));
                } else {
                    result.complete(resp);
                }
                return;
            }

            // Checking if exception/status is retryable
            Throwable cause = null;
            if (err != null) {
                cause = unwrap(err);
                if (!isRetryableException(cause)) {
                    result.completeExceptionally(cause);
                    return;
                }
            } else if (isRetryableStatus(resp)) {
                // Need to close existing response before triggering a retry
                closeQuietly(resp);
            } else {
                result.complete(resp);
                return;
            }

            long delayMs = backoffIter.next();
            logger.warn("Retrying [" + endpointId + "] in " + delayMs + " ms");

            try {
                ScheduledFuture<?> scheduled = retryScheduler.schedule(
                    () -> attemptAsync(endpointId, node, request, options, backoffIter, result),
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
            if (!isExternalScheduler) {
                retryScheduler.shutdownNow();
            }
        }
    }

    boolean isRetryableException(Throwable err) {
        return matchesRetryable(err) || matchesRetryable(err.getCause());
    }

    private boolean matchesRetryable(@Nullable Throwable t) {
        if (t == null) {
            return false;
        }
        for (Class<? extends Throwable> ex : retryableExceptions) {
            if (ex.isInstance(t)) {
                return true;
            }
        }
        return false;
    }

    boolean isRetryableStatus(Response resp) {
        return retryableStatuses.contains(resp.statusCode());
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

    private static ScheduledExecutorService defaultRetryScheduler() {
        int clientId = idCounter.incrementAndGet();
        return Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setName("elasticsearch-java-retry#" + clientId + "#" + t.getId());
            t.setDaemon(true);
            return t;
        });
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
