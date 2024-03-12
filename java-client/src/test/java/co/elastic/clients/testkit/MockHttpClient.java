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

package co.elastic.clients.testkit;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.TransportException;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.BinaryData;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class MockHttpClient implements TransportHttpClient {

    private static final Response NotFound = new MockResponse(404, null);

    Map<String, Response> responses = new ConcurrentHashMap<>();

    public MockHttpClient add(String path, String contentType, byte[] data) {
        responses.put(path, new MockResponse(200, BinaryData.of(data, contentType)));
        return this;
    }

    public MockHttpClient add(String path, String contentType, String text) {
        responses.put(path, new MockResponse(200, BinaryData.of(text.getBytes(StandardCharsets.UTF_8), contentType)));
        return this;
    }

    public ElasticsearchClient client() {
        return client(new ModelTestCase() {}.mapper);
    }

    public ElasticsearchClient client(JsonpMapper mapper) {
        return new ElasticsearchClient(new ElasticsearchTransportBase(this, null, mapper) {
            @Override
            public void close() throws IOException {
                super.close();
            }
        });
    }


    @Override
    public Response performRequest(
        String endpointId, @Nullable TransportHttpClient.Node node, Request request, TransportOptions option
    ) throws IOException {
        Response response = responses.get(request.path());

        if (response == null) {
            throw new TransportException(NotFound, "Not found", endpointId);
        }

        return response;
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(
        String endpointId, @Nullable TransportHttpClient.Node node, Request request, TransportOptions options
    ) {
        CompletableFuture<Response> result = new CompletableFuture<>();
        try {
            Response response = performRequest(endpointId, node, request, options);
            result.complete(response);
        } catch (Exception e) {
            result.completeExceptionally(e);
        }
        return result;
    }

    @Override
    public void close() throws IOException {
    }

    private static class MockResponse implements TransportHttpClient.Response {

        private final int statusCode;
        private final BinaryData body;
        private final Map<String, String> headers;

        MockResponse(int statusCode, BinaryData body) {
            this.statusCode = statusCode;
            this.headers = new HashMap<>();
            this.body = body;

            if (body != null) {
                headers.put("content-type", body.contentType());
            }
            headers.put("x-elastic-product", "Elasticsearch");
        }

        @Override
        public Node node() {
            return null;
        }

        @Override
        public int statusCode() {
            return statusCode;
        }

        @Nullable
        @Override
        public String header(String name) {
            return headers.get(name.toLowerCase());
        }

        @Override
        public List<String> headers(String name) {
            String header = header(name);
            return header == null ? null : Collections.singletonList(header);
        }

        @Nullable
        @Override
        public BinaryData body() throws IOException {
            return body;
        }

        @Nullable
        @Override
        public Object originalResponse() {
            return null;
        }

        @Override
        public void close() throws IOException {
        }
    }
}
