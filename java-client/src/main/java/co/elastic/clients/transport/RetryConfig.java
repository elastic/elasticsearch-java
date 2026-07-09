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

package co.elastic.clients.transport;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Configuration for transport-level retries. A request is retried when:
 * <ul>
 *   <li>it results in a response — even one carried by an exception, such as the low-level clients'
 *       {@code ResponseException} — whose status code is in {@link #retryableStatuses()}, or</li>
 *   <li>it fails with an exception that matches one of {@link #retryableExceptions()}.</li>
 * </ul>
 * Either set may be empty to disable that retry route.
 * <p>
 * Delays and the maximum number of attempts are controlled by {@link #backoffPolicy()}, which must be set for
 * retries to happen: retries are always opt-in.
 * <p>
 * <b>Scope:</b> retries reissue the same logical request to the underlying transport. Node selection is delegated
 * to that transport (e.g. {@code Rest5Client}, {@code RestClient}), which manages its own node-rotation and
 * dead-node tracking independently. Configuring retries here does not control which node a retried
 * request is sent to. Note that for some failures (e.g. 502/503/504 responses and connection errors) the
 * underlying client already tries every configured node before reporting the failure, so the total number of
 * attempts on the cluster can be up to {@code nodes × (retries + 1)}.
 * <p>
 * <b>Idempotency:</b> a retried request may have already been received and processed by the server (e.g. when the
 * connection drops after the request was sent), giving at-least-once semantics. Most Elasticsearch APIs are
 * idempotent, but retrying operations that are not (e.g. bulk indexing without user-provided document ids) can
 * duplicate their effects. Choose {@link #retryableExceptions()} accordingly.
 * <p>
 * <b>Memory:</b> the request body stays referenced for the whole retry sequence, including backoff waits. With
 * large requests (e.g. big bulks) and long backoffs, this pins the corresponding buffers in memory until the
 * request completes or fails definitively.
 */
public final class RetryConfig {

    /**
     * Default set of HTTP status codes that trigger a retry: {@code 429, 500, 502, 503, 504}.
     */
    public static final Set<Integer> DEFAULT_RETRYABLE_STATUSES = Set.of(429, 500, 502, 503, 504);

    /**
     * Default set of exceptions that trigger a retry: {@link IOException} (and all subclasses).
     */
    public static final Set<Class<? extends Throwable>> DEFAULT_RETRYABLE_EXCEPTIONS = Set.of(IOException.class);

    private static final RetryConfig DISABLED = new RetryConfig(
        BackoffPolicy.noBackoff(), DEFAULT_RETRYABLE_STATUSES, DEFAULT_RETRYABLE_EXCEPTIONS
    );

    private final BackoffPolicy backoffPolicy;
    private final Set<Integer> retryableStatuses;
    private final Set<Class<? extends Throwable>> retryableExceptions;

    private RetryConfig(BackoffPolicy backoffPolicy, Set<Integer> retryableStatuses,
                        Set<Class<? extends Throwable>> retryableExceptions) {
        this.backoffPolicy = Objects.requireNonNull(backoffPolicy, "backoffPolicy");
        this.retryableStatuses = retryableStatuses;
        this.retryableExceptions = retryableExceptions;
    }

    private RetryConfig(Builder builder) {
        this(builder.backoffPolicy, builder.retryableStatuses, builder.retryableExceptions);
    }

    /**
     * Disabled retry configuration, equivalent to {@link BackoffPolicy#noBackoff()} with the default status set.
     * No retries will happen.
     */
    public static RetryConfig disabled() {
        return DISABLED;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryConfig of(Consumer<Builder> fn) {
        Builder b = new Builder();
        fn.accept(b);
        return b.build();
    }

    /**
     * The backoff policy controlling delays and the maximum number of retry attempts. {@link BackoffPolicy#noBackoff()}
     * means no retries are performed.
     */
    public BackoffPolicy backoffPolicy() {
        return backoffPolicy;
    }

    public boolean isEnabled() {
        return backoffPolicy != BackoffPolicy.noBackoff();
    }

    /**
     * The HTTP status codes that should trigger a retry. Defaults to {@link #DEFAULT_RETRYABLE_STATUSES}.
     */
    public Set<Integer> retryableStatuses() {
        return retryableStatuses;
    }

    /**
     * The exception types that should trigger a retry. Wrapped exceptions are also considered.
     * Defaults to {@link #DEFAULT_RETRYABLE_EXCEPTIONS}.
     */
    public Set<Class<? extends Throwable>> retryableExceptions() {
        return retryableExceptions;
    }


    public Builder toBuilder() {
        return new Builder()
            .backoffPolicy(backoffPolicy)
            .retryableStatuses(retryableStatuses)
            .retryableExceptions(retryableExceptions);
    }

    public static final class Builder {
        // Null means "not set", which build() rejects: enabling retries requires an explicit backoff policy,
        // and a config accidentally built without one must fail fast rather than silently never retry.
        @Nullable
        private BackoffPolicy backoffPolicy;
        private Set<Integer> retryableStatuses = DEFAULT_RETRYABLE_STATUSES;
        private Set<Class<? extends Throwable>> retryableExceptions = DEFAULT_RETRYABLE_EXCEPTIONS;

        /**
         * Sets the backoff policy controlling delays and the maximum number of retry attempts. Required.
         * Passing {@link BackoffPolicy#noBackoff()} (or {@code null}) explicitly disables retries, like
         * {@link RetryConfig#disabled()}.
         */
        public Builder backoffPolicy(@Nullable BackoffPolicy policy) {
            this.backoffPolicy = policy == null ? BackoffPolicy.noBackoff() : policy;
            return this;
        }

        /**
         * Sets the HTTP status codes that should trigger a retry. Pass an empty set to disable status-based retries.
         */
        public Builder retryableStatuses(Set<Integer> statuses) {
            this.retryableStatuses = Set.copyOf(Objects.requireNonNull(statuses, "retryableStatuses"));
            return this;
        }

        public Builder retryableStatuses(Integer... statuses) {
            return retryableStatuses(Set.of(statuses));
        }

        /**
         * Sets the exception types that should trigger a retry. Pass an empty set to disable exception-based retries.
         */
        public Builder retryableExceptions(Set<Class<? extends Throwable>> exceptions) {
            this.retryableExceptions = Set.copyOf(Objects.requireNonNull(exceptions, "retryableExceptions"));
            return this;
        }

        @SafeVarargs
        public final Builder retryableExceptions(Class<? extends Throwable>... exceptions) {
            return retryableExceptions(Set.of(exceptions));
        }

        public RetryConfig build() {
            if (backoffPolicy == null) {
                throw new IllegalStateException(
                    "A backoff policy is required to enable retries: set RetryConfig.Builder#backoffPolicy," +
                        " e.g. BackoffPolicy.exponentialBackoff(). To explicitly disable retries, use" +
                        " RetryConfig.disabled() or BackoffPolicy.noBackoff()."
                );
            }
            return new RetryConfig(this);
        }
    }
}
