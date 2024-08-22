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

package co.elastic.clients.elasticsearch._helpers.bulk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/**
 * A helper to make {@link Condition} easier and less error-prone to use.
 * <p>
 * It takes a {@code Lock} and a readiness predicate.
 */
class FnCondition {
    private final Lock lock;
    public final Condition condition;
    private final BooleanSupplier ready;
    private long invocations;
    private long contentions;
    private String name;

    FnCondition(Lock lock, BooleanSupplier ready, String name) {
        this.lock = lock;
        this.condition = lock.newCondition();
        this.ready = ready;
        this.name = name;
    }

    public void whenReady(Runnable fn) {
        whenReadyIf(null, () -> {
            fn.run();
            return null;
        });
    }

    /**
     * Runs a function when the condition variable is ready.
     */
    public <T> T whenReady(Supplier<T> fn) {
        return whenReadyIf(null, fn);
    }

    /**
     * Runs a function when the condition variable is ready, after verifying in that it can actually run.
     * <p>
     * {@code canRun} and {@code fn} are executed withing the lock.
     *
     * @param canRun a predicate indicating if {@code fn} is ready to run. If not, returns {@code null} immediately.
     * @param fn the function to run once the condition variable allows it.
     * @return the result of {@code fn}.
     */
    public <T> T whenReadyIf(BooleanSupplier canRun, Supplier<T> fn) {
        lock.lock();
        try {
            if (canRun != null && !canRun.getAsBoolean()) {
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and I cannot run current condition = " + name);
                return null;
            }

            invocations++;
            boolean firstLoop = true;
            while (!ready.getAsBoolean()) {
                if (firstLoop) {
                    contentions++;
                    firstLoop = false;
                }
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and I'm about to get stuck - condition = " + name);
                condition.awaitUninterruptibly();
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and I managed to wake up - condition = " + name);
            }

            if (canRun != null && !canRun.getAsBoolean()) {
                return null;
            }

            return fn.get();
        } finally {
            lock.unlock();
        }
    }

    public void signalIfReady() {
        lock.lock();
        try {
            if (ready.getAsBoolean()) {
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and in theory I should free another thread - condition = " + name);
                this.condition.signal(); // THIS ONE
            }
        } finally {
            lock.unlock();
        }
    }

    public void signalAllIfReady() {
        lock.lock();
        try {
            if (ready.getAsBoolean()) {
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and in theory I should free all threads - condition = " + name);
                this.condition.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public void signalIfReadyAfter(Runnable r) {
        lock.lock();
        try {
            r.run();
            if (ready.getAsBoolean()) {
                System.out.println("I'm thread " + Thread.currentThread().getName() + " and in theory I should free another thread after - condition = " + name);
                this.condition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Number of invocations of {@code whenReady}.
     */
    public long invocations() {
        return this.invocations;
    }

    /**
     * Number of invocations of {@code whenReady} that contended and required to wait on the condition variable.
     */
    public long contentions() {
        return this.contentions;
    }
}
