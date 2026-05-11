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

package co.elastic.clients.transport.instrumentation;

import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;

/**
 * Instrumentation for an Elasticsearch client. It allows creating a {@link Instrumentation.Context} for each request,
 * with callbacks for the various stages of request and response processing.
 */
public interface Instrumentation {

    /**
     * Create a context for a given request and the corresponding endpoint.
     */
    <TRequest> Context newContext(TRequest request, Endpoint<TRequest, ?, ?> endpoint);

    /**
     * A context with lifecycle callbacks for the various stages of request and response processing. Must be {@link #close()}d.
     */
    interface Context extends AutoCloseable {

        /**
         * Sets this context (or the underlying abstraction) as the current thread's scope, so that neste call can
         * nest child contexts.
         */
        ThreadScope makeCurrent();

        /**
         * Called once the initial API request has been serialized and the http request has been prepared.
         */
        void beforeSendingHttpRequest(TransportHttpClient.Request httpRequest, TransportOptions options);

        /**
         * Called after the http response has been received, and before analyzing it.
         */
        void afterReceivingHttpResponse(TransportHttpClient.Response httpResponse);

        /**
         * Called after the http response has been deserialized
         */
        <TResponse> void afterDecodingApiResponse(TResponse apiResponse);

        /**
         * Called when any stage of request processing caused a failure.
         */
        void recordException(Throwable thr);

        @Override
        void close();
    }

    /**
     * A thread scope. Closing it will detach the scope from the current thread.
     */
    interface ThreadScope extends AutoCloseable {
        @Override
        void close();
    }
}
