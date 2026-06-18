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

import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Configuration for transport-level retries: which {@link BackoffPolicy} to apply between attempts and which HTTP
 * status codes should trigger a retry. {@link java.io.IOException}s thrown by the underlying transport are always
 * retried (independently of {@link #retryableStatuses()}).
 */
public final class RetryConfig {

    /**
     * Default set of HTTP status codes that trigger a retry: {@code 429, 500, 502, 503, 504}.
     */
    public static final Set<Integer> DEFAULT_RETRYABLE_STATUSES = Set.of(429, 500, 502, 503, 504);

    private static final RetryConfig DISABLED = new RetryConfig(BackoffPolicy.noBackoff(), DEFAULT_RETRYABLE_STATUSES);

    private final BackoffPolicy backoffPolicy;
    private final Set<Integer> retryableStatuses;

    private RetryConfig(BackoffPolicy backoffPolicy, Set<Integer> retryableStatuses) {
        this.backoffPolicy = Objects.requireNonNull(backoffPolicy, "backoffPolicy");
        this.retryableStatuses = retryableStatuses;
    }

    private RetryConfig(Builder builder) {
        this(builder.backoffPolicy, builder.retryableStatuses);
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


    public Builder toBuilder() {
        return new Builder()
            .backoffPolicy(backoffPolicy)
            .retryableStatuses(retryableStatuses);
    }

    public static final class Builder {
        private BackoffPolicy backoffPolicy = BackoffPolicy.noBackoff();
        private Set<Integer> retryableStatuses = DEFAULT_RETRYABLE_STATUSES;

        public Builder backoffPolicy(BackoffPolicy policy) {
            this.backoffPolicy = policy == null ? BackoffPolicy.noBackoff() : policy;
            return this;
        }

        public Builder retryableStatuses(Set<Integer> statuses) {
            if (statuses == null || statuses.isEmpty()) {
                throw new IllegalArgumentException("retryableStatuses must not be null or empty");
            }
            this.retryableStatuses = Set.copyOf(statuses);
            return this;
        }

        public Builder retryableStatuses(Integer... statuses) {
            return retryableStatuses(Set.of(statuses));
        }

        public RetryConfig build() {
            return new RetryConfig(this);
        }
    }
}
