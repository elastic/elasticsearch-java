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

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
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
 *   <li>the delegate throws (or completes its future exceptionally with) an {@link IOException}, or</li>
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

    // Instance counter, to name the retry thread
    private static final AtomicInteger idCounter = new AtomicInteger();

    private final TransportHttpClient delegate;
    private final BackoffPolicy backoffPolicy;
    private final Set<Integer> retryableStatuses;
    private final ScheduledExecutorService retryScheduler;
    private final boolean isExternalScheduler;

    public RetryingHttpClient(TransportHttpClient delegate, RetryConfig retryConfig) {
        this(delegate, retryConfig, defaultRetryScheduler(), false);
    }

    /**
     * Build a retrying client using a user-provided scheduler. The scheduler won't be shut down
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
            InterruptedIOException io = new InterruptedIOException("Retry was interrupted");
            io.initCause(ie);
            throw io;
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

        CompletableFuture<Response> attempt;
        try {
            attempt = delegate.performRequestAsync(endpointId, node, request, options);
        } catch (Throwable t) {
            attempt = new CompletableFuture<>();
            attempt.completeExceptionally(t);
        }
        result.setInFlight(attempt);

        attempt.whenComplete((resp, err) -> {
            if (result.isCancelled()) {
                if (resp != null) {
                    closeQuietly(resp);
                }
                return;
            }
            result.clearInFlight();

            Throwable cause = unwrap(err);

            long delayMs;
            if (err != null) {
                if (!isRetryable(cause) || !backoffIter.hasNext()) {
                    result.completeExceptionally(cause);
                    return;
                }
                delayMs = backoffIter.next();
            } else if (isRetryable(resp)) {
                if (!backoffIter.hasNext()) {
                    result.complete(resp);
                    return;
                }
                delayMs = backoffIter.next();
                closeQuietly(resp);
            } else {
                result.complete(resp);
                return;
            }

            if (delayMs <= 0) {
                attemptAsync(endpointId, node, request, options, backoffIter, result);
                return;
            }
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

    static boolean isRetryable(Throwable err) {
        Throwable t = err;
        while (t != null) {
            if (t instanceof IOException) {
                return true;
            }
            t = t.getCause() == t ? null : t.getCause();
        }
        return false;
    }

    boolean isRetryable(Response resp) {
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
            // best effort
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

        void setInFlight(CompletableFuture<Response> f) {
            this.inFlight = f;
            if (isCancelled()) {
                f.cancel(true);
            }
        }

        void clearInFlight() {
            this.inFlight = null;
        }

        void setScheduledRetry(ScheduledFuture<?> sf) {
            this.scheduledRetry = sf;
            if (isCancelled()) {
                sf.cancel(false);
            }
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled) {
                CompletableFuture<Response> f = inFlight;
                if (f != null) {
                    f.cancel(mayInterruptIfRunning);
                }
                ScheduledFuture<?> sf = scheduledRetry;
                if (sf != null) {
                    sf.cancel(false);
                }
            }
            return cancelled;
        }
    }
}
