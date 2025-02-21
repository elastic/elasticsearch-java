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
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Provides a set of generic backoff policies. Backoff policies are used to calculate the number of times an action will be retried
 * and the intervals between those retries.
 *
 * Notes for implementing custom subclasses:
 *
 * The underlying mathematical principle of <code>BackoffPolicy</code> are progressions which can be either finite or infinite although
 * the latter should not be used for retrying. A progression can be mapped to a <code>java.util.Iterator</code> with the following
 * semantics:
 *
 * <ul>
 *     <li><code>#hasNext()</code> determines whether the progression has more elements. Return <code>true</code> for infinite progressions
 *     </li>
 *     <li><code>#next()</code> determines the next element in the progression, i.e. the next wait time period</li>
 * </ul>
 *
 * Note that backoff policies are exposed as <code>Iterables</code> in order to be consumed multiple times.
 */
public abstract class BackoffPolicy implements Iterable<Long> {
    private static final BackoffPolicy NO_BACKOFF = new NoBackoff();

    /**
     * Creates a backoff policy that will not allow any backoff, i.e. an operation will fail after the first attempt.
     *
     * @return A backoff policy without any backoff period. The returned instance is thread safe.
     */
    public static BackoffPolicy noBackoff() {
        return NO_BACKOFF;
    }

    /**
     * Creates an new constant backoff policy with the provided configuration.
     *
     * @param delay              The delay defines how long to wait between retry attempts. Must not be null.
     *                           Must be &lt;= <code>Integer.MAX_VALUE</code> ms.
     * @param maxNumberOfRetries The maximum number of retries. Must be a non-negative number.
     * @return A backoff policy with a constant wait time between retries. The returned instance is thread safe but each
     * iterator created from it should only be used by a single thread.
     */
    public static BackoffPolicy constantBackoff(Long delay, int maxNumberOfRetries) {
        return new ConstantBackoff(checkDelay(delay), maxNumberOfRetries);
    }

    /**
     * Creates an new exponential backoff policy with a default configuration of 50 ms initial wait period and 8 retries taking
     * roughly 5.1 seconds in total.
     *
     * @return A backoff policy with an exponential increase in wait time for retries. The returned instance is thread safe but each
     * iterator created from it should only be used by a single thread.
     */
    public static BackoffPolicy exponentialBackoff() {
        return exponentialBackoff(50L, 8);
    }

    /**
     * Creates an new exponential backoff policy with the provided configuration.
     *
     * @param initialDelay       The initial delay defines how long to wait for the first retry attempt. Must not be null.
     *                           Must be &lt;= <code>Integer.MAX_VALUE</code> ms.
     * @param maxNumberOfRetries The maximum number of retries. Must be a non-negative number.
     * @return A backoff policy with an exponential increase in wait time for retries. The returned instance is thread safe but each
     * iterator created from it should only be used by a single thread.
     */
    public static BackoffPolicy exponentialBackoff(Long initialDelay, int maxNumberOfRetries) {
        return new ExponentialBackoff(checkDelay(initialDelay), maxNumberOfRetries);
    }

    /**
     * Creates a new linear backoff policy with the provided configuration
     *
     * @param delayIncrement The amount by which to increment the delay on each retry
     * @param maxNumberOfRetries The maximum number of retries
     * @param maximumDelay The maximum delay
     * @return A backoff policy with linear increase in wait time for retries.
     */
    public static BackoffPolicy linearBackoff(Long delayIncrement, int maxNumberOfRetries, Long maximumDelay) {
        return new LinearBackoff(delayIncrement, maxNumberOfRetries, maximumDelay);
    }

    /**
     * Wraps the backoff policy in one that calls a method every time a new backoff is taken from the policy.
     */
    public static BackoffPolicy wrap(BackoffPolicy delegate, Runnable onBackoff) {
        return new WrappedBackoffPolicy(delegate, onBackoff);
    }

    private static Long checkDelay(Long delay) {
        if (delay > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("delay must be <= " + Integer.MAX_VALUE + " ms");
        }
        return delay;
    }

    private static class NoBackoff extends BackoffPolicy {
        @Override
        public Iterator<Long> iterator() {
            return Collections.emptyIterator();
        }

        @Override
        public String toString() {
            return "NoBackoff";
        }
    }

    private static class ExponentialBackoff extends BackoffPolicy {
        private final Long start;

        private final int numberOfElements;

        private ExponentialBackoff(Long start, int numberOfElements) {
            assert start >= 0;
            assert numberOfElements >= 0;
            this.start = start;
            this.numberOfElements = numberOfElements;
        }

        @Override
        public Iterator<Long> iterator() {
            return new ExponentialBackoffIterator(start, numberOfElements);
        }

        @Override
        public String toString() {
            return "ExponentialBackoff{start=" + start + ", numberOfElements=" + numberOfElements + '}';
        }
    }

    private static class ExponentialBackoffIterator implements Iterator<Long> {
        private final int numberOfElements;

        private final Long start;

        private int currentlyConsumed;

        private ExponentialBackoffIterator(Long start, int numberOfElements) {
            this.start = start;
            this.numberOfElements = numberOfElements;
        }

        @Override
        public boolean hasNext() {
            return currentlyConsumed < numberOfElements;
        }

        @Override
        public Long next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Only up to " + numberOfElements + " elements");
            }
            Long result = start + 10L * ((int) Math.exp(0.8d * (currentlyConsumed)) - 1);
            currentlyConsumed++;
            return result;
        }
    }

    private static final class ConstantBackoff extends BackoffPolicy {
        private final Long delay;

        private final int numberOfElements;

        ConstantBackoff(Long delay, int numberOfElements) {
            assert numberOfElements >= 0;
            this.delay = delay;
            this.numberOfElements = numberOfElements;
        }

        @Override
        public Iterator<Long> iterator() {
            return new ConstantBackoffIterator(delay, numberOfElements);
        }

        @Override
        public String toString() {
            return "ConstantBackoff{delay=" + delay + ", numberOfElements=" + numberOfElements + '}';
        }
    }

    private static final class ConstantBackoffIterator implements Iterator<Long> {
        private final Long delay;
        private final int numberOfElements;
        private int curr;

        ConstantBackoffIterator(Long delay, int numberOfElements) {
            this.delay = delay;
            this.numberOfElements = numberOfElements;
        }

        @Override
        public boolean hasNext() {
            return curr < numberOfElements;
        }

        @Override
        public Long next() {
            if (hasNext() == false) {
                throw new NoSuchElementException();
            }
            curr++;
            return delay;
        }
    }

    private static final class WrappedBackoffPolicy extends BackoffPolicy {
        private final BackoffPolicy delegate;
        private final Runnable onBackoff;

        WrappedBackoffPolicy(BackoffPolicy delegate, Runnable onBackoff) {
            this.delegate = delegate;
            this.onBackoff = onBackoff;
        }

        @Override
        public Iterator<Long> iterator() {
            return new WrappedBackoffIterator(delegate.iterator(), onBackoff);
        }

        @Override
        public String toString() {
            return "WrappedBackoffPolicy{delegate=" + delegate + ", onBackoff=" + onBackoff + '}';
        }
    }

    private static final class WrappedBackoffIterator implements Iterator<Long> {
        private final Iterator<Long> delegate;
        private final Runnable onBackoff;

        WrappedBackoffIterator(Iterator<Long> delegate, Runnable onBackoff) {
            this.delegate = delegate;
            this.onBackoff = onBackoff;
        }

        @Override
        public boolean hasNext() {
            return delegate.hasNext();
        }

        @Override
        public Long next() {
            if (false == delegate.hasNext()) {
                throw new NoSuchElementException();
            }
            onBackoff.run();
            return delegate.next();
        }
    }

    private static final class LinearBackoff extends BackoffPolicy {

        private final Long delayIncrement;
        private final int maxNumberOfRetries;
        private final Long maximumDelay;

        private LinearBackoff(Long delayIncrement, int maxNumberOfRetries, @Nullable Long maximumDelay) {
            this.delayIncrement = delayIncrement;
            this.maxNumberOfRetries = maxNumberOfRetries;
            this.maximumDelay = maximumDelay;
        }

        @Override
        public Iterator<Long> iterator() {
            return new LinearBackoffIterator(delayIncrement, maxNumberOfRetries, maximumDelay);
        }

        @Override
        public String toString() {
            return "LinearBackoff{"
                + "delayIncrement="
                + delayIncrement
                + ", maxNumberOfRetries="
                + maxNumberOfRetries
                + ", maximumDelay="
                + maximumDelay
                + '}';
        }
    }

    private static final class LinearBackoffIterator implements Iterator<Long> {

        private final Long delayIncrement;
        private final int maxNumberOfRetries;
        private final Long maximumDelay;
        private int curr;

        private LinearBackoffIterator(Long delayIncrement, int maxNumberOfRetries, @Nullable Long maximumDelay) {
            this.delayIncrement = delayIncrement;
            this.maxNumberOfRetries = maxNumberOfRetries;
            this.maximumDelay = maximumDelay;
        }

        @Override
        public boolean hasNext() {
            return curr < maxNumberOfRetries;
        }

        @Override
        public Long next() {
            curr++;
            Long Long = curr * delayIncrement;
            return maximumDelay == null ? Long : Long.compareTo(maximumDelay) < 0 ? Long : maximumDelay;
        }
    }
}
