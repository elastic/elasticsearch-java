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

import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Configuration for transport-level retries. A request is retried when:
 * <ul>
 *   <li>it fails with an exception that matches one of {@link #retryableExceptions()}, or</li>
 *   <li>it returns a response whose status code is in {@link #retryableStatuses()}.</li>
 * </ul>
 * Either set may be empty to disable that retry route.
 * <p>
 * Delays and the maximum number of attempts are controlled by {@link #backoffPolicy()}.
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
     * Disabled retry configuration — equivalent to {@link BackoffPolicy#noBackoff()} with the default status set.
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

    /**
     * The HTTP status codes that should trigger a retry. Defaults to {@link #DEFAULT_RETRYABLE_STATUSES}.
     */
    public Set<Integer> retryableStatuses() {
        return retryableStatuses;
    }

    /**
     * The exception types that should trigger a retry. Matched by {@code instanceof}, walking the immediate cause
     * so wrapped exceptions (e.g. {@code RuntimeException(IOException)}) are also caught.
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
        private BackoffPolicy backoffPolicy = BackoffPolicy.noBackoff();
        private Set<Integer> retryableStatuses = DEFAULT_RETRYABLE_STATUSES;
        private Set<Class<? extends Throwable>> retryableExceptions = DEFAULT_RETRYABLE_EXCEPTIONS;

        public Builder backoffPolicy(BackoffPolicy policy) {
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
            return new RetryConfig(this);
        }
    }
}
