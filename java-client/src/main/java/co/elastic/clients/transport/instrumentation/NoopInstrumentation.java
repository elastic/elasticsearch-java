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
 * A no-operation instrumentation. Used when no instrumentation has been set. It can also be used to
 * bypass OpenTelemetry automatic discovery.
 */
public class NoopInstrumentation implements Instrumentation {

    public static NoopInstrumentation INSTANCE = new NoopInstrumentation();

    private NoopInstrumentation() {}

    @Override
    public <TRequest> Context newContext(TRequest request, Endpoint<TRequest, ?, ?> endpoint) {
        return CONTEXT;
    }

    private static final NoopContext CONTEXT = new NoopContext();
    private static final NoopScope SCOPE = new NoopScope();

    private static class NoopContext implements Instrumentation.Context {
        @Override
        public ThreadScope makeCurrent() {
            return SCOPE;
        }

        @Override
        public void beforeSendingHttpRequest(TransportHttpClient.Request httpRequest, TransportOptions options) {}

        @Override
        public void afterReceivingHttpResponse(TransportHttpClient.Response httpResponse) {}

        @Override
        public <TResponse> void afterDecodingApiResponse(TResponse apiResponse) {}

        @Override
        public void recordException(Throwable thr) {}

        @Override
        public void close() {}
    }

    private static class NoopScope implements Instrumentation.ThreadScope {
        @Override
        public void close() {}
    }
}
