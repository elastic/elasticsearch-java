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
package co.elastic.clients.transport.rest5_client.low_level;

import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.core5.concurrent.CancellableDependency;

import java.util.concurrent.CancellationException;

/**
 * Represents an operation that can be cancelled.
 * Returned when executing async requests through
 * {@link Rest5Client#performRequestAsync(Request, ResponseListener)}, so that the request
 * can be cancelled if needed. Cancelling a request will result in calling
 * {@link HttpUriRequestBase#abort()} on the underlying
 * request object, which will in turn cancel its corresponding {@link java.util.concurrent.Future}.
 * Note that cancelling a request does not automatically translate to aborting its execution on the server
 * side, which needs to be specifically implemented in each API.
 */
public abstract class Cancellable implements org.apache.hc.core5.concurrent.Cancellable {

    /**
     * Executes some arbitrary code iff the on-going request has not been cancelled, otherwise throws
     * {@link CancellationException}.
     */
    abstract void runIfNotCancelled(Runnable runnable);

    static final Cancellable NO_OP = new Cancellable() {
        @Override
        public boolean cancel() {
            throw new UnsupportedOperationException();
        }

        @Override
        void runIfNotCancelled(Runnable runnable) {
            throw new UnsupportedOperationException();
        }
    };

    static Cancellable fromRequest(HttpUriRequestBase httpRequest) {
        return new RequestCancellable(httpRequest);
    }

    private static class RequestCancellable extends Cancellable {

        private final CancellableDependency httpRequest;

        private RequestCancellable(HttpUriRequestBase httpRequest) {
            this.httpRequest = httpRequest;
        }

        public synchronized boolean cancel() {
           return this.httpRequest.cancel();
        }

        /**
         * Executes some arbitrary code iff the on-going request has not been cancelled, otherwise throws
         * {@link CancellationException}.
         * This is needed to guarantee that cancelling a request works correctly even in case
         * {@link #cancel()} is called between different
         * attempts of the same request. The low-level client reuses the same instance of the
         * {@link HttpUriRequestBase} by
         * calling
         * {@link HttpUriRequestBase#reset()} between subsequent retries. The {@link #cancel()}
         * method can be called at anytime,
         * and we need to handle the case where it gets called while there is no request being executed as
         * one attempt may have failed and
         * the subsequent attempt has not been started yet.
         * If the request has already been cancelled we don't go ahead with the next attempt, and
         * artificially raise the
         * {@link CancellationException}, otherwise we run the provided {@link Runnable} which will reset
         * the request and send the next
         * attempt.
         * Note that this method must be synchronized as well as the {@link #cancel()} method, to prevent a
         * request from being cancelled
         * when there is no future to cancel, which would make cancelling the request a no-op.
         */
        synchronized void runIfNotCancelled(Runnable runnable) {
            if (this.httpRequest.isCancelled()) {
                throw newCancellationException();
            }
            runnable.run();
        }
    }

    static CancellationException newCancellationException() {
        return new CancellationException("request was cancelled");
    }
}
