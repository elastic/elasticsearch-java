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

package co.elastic.clients.documentation;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * A transport implementation that always returns the same result. Used for doc snippets where we can to check
 * compilation and do very simple tests.
 */
public class DocTestsTransport implements ElasticsearchTransport {

    private final JsonpMapper mapper = new JacksonJsonpMapper();

    private final ThreadLocal<Object> result = new ThreadLocal<>();

    private final TransportOptions options = new TransportOptions() {
        @Override
        public Collection<Map.Entry<String, String>> headers() {
            return Collections.emptyList();
        }

        @Override
        public Map<String, String> queryParameters() {
            return Collections.emptyMap();
        }

        @Override
        public Function<List<String>, Boolean> onWarnings() {
            return null;
        }

        @Override
        public Builder toBuilder() {
            return null;
        }
    };

    public void setResult(Object result) {
        this.result.set(result);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {
        return (ResponseT) result.get();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(RequestT request, Endpoint<RequestT, ResponseT,
        ErrorT> endpoint, @Nullable TransportOptions options) {
        CompletableFuture<ResponseT> future = new CompletableFuture<>();
        future.complete((ResponseT) result.get());
        return future;
    }

    @Override
    public JsonpMapper jsonpMapper() {
        return mapper;
    }

    @Override
    public TransportOptions options() {
        return options;
    }

    @Override
    public void close() throws IOException {
    }
}
