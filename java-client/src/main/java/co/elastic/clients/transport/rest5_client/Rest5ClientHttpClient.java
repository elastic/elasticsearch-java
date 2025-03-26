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

package co.elastic.clients.transport.rest5_client;

import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.HeaderMap;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.transport.rest5_client.low_level.Cancellable;
import co.elastic.clients.transport.rest5_client.low_level.ESRequest;
import co.elastic.clients.transport.rest5_client.low_level.ESResponse;
import co.elastic.clients.transport.rest5_client.low_level.ResponseListener;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.NoCopyByteArrayOutputStream;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HeaderElement;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicHeaderValueParser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class Rest5ClientHttpClient implements TransportHttpClient {

    private static final ConcurrentHashMap<String, ContentType> ContentTypeCache = new ConcurrentHashMap<>();

    /**
     * The {@code Future} implementation returned by async requests.
     * It wraps the Rest5Client's cancellable and propagates cancellation.
     */
    private static class RequestFuture<T> extends CompletableFuture<T> {
        private volatile Cancellable cancellable;

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled && cancellable != null) {
                cancellable.cancel();
            }
            return cancelled;
        }
    }

    private final Rest5Client restClient;

    public Rest5ClientHttpClient(Rest5Client restClient) {
        this.restClient = restClient;
    }

    /**
     * Returns the underlying low level Rest Client used by this transport.
     */
    public Rest5Client restClient() {
        return this.restClient;
    }

    @Override
    public Rest5ClientOptions createOptions(@Nullable TransportOptions options) {
        return Rest5ClientOptions.of(options);
    }

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                   TransportOptions options) throws IOException {
        Rest5ClientOptions rcOptions = Rest5ClientOptions.of(options);
        ESRequest restRequest = createRestRequest(request, rcOptions);
        ESResponse restResponse = restClient.performRequest(restRequest);
        return new RestResponse(restResponse);
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(
        String endpointId, @Nullable Node node, Request request, TransportOptions options
    ) {

        RequestFuture<Response> future = new RequestFuture<>();
        ESRequest restRequest;

        try {
            Rest5ClientOptions rcOptions = Rest5ClientOptions.of(options);
            restRequest = createRestRequest(request, rcOptions);
        } catch (Throwable thr) {
            // Terminate early
            future.completeExceptionally(thr);
            return future;
        }

        future.cancellable = restClient.performRequestAsync(restRequest, new ResponseListener() {
            @Override
            public void onSuccess(ESResponse response) {
                future.complete(new RestResponse(response));
            }

            @Override
            public void onFailure(Exception exception) {
                future.completeExceptionally(exception);
            }
        });

        return future;
    }

    @Override
    public void close() throws IOException {
        this.restClient.close();
    }

    private ESRequest createRestRequest(Request request, Rest5ClientOptions options) {
        ESRequest clientReq = new ESRequest(
            request.method(), request.path()
        );

        Iterable<ByteBuffer> body = request.body();

        Map<String, String> requestHeaders = request.headers();
        if (!requestHeaders.isEmpty()) {

            int headerCount = requestHeaders.size();
            if ((body == null && headerCount != 3) || headerCount != 4) {
                if (options == null) {
                    options = Rest5ClientOptions.initialOptions();
                }

                Rest5ClientOptions.Builder builder = options.toBuilder();
                for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
                    builder.setHeader(header.getKey(), header.getValue());
                }
                // Original option headers have precedence
                for (Map.Entry<String, String> header : options.headers()) {
                    builder.setHeader(header.getKey(), header.getValue());
                }
                options = builder.build();
            }
        }

        if (options != null) {
            clientReq.setOptions(options.restClientRequestOptions());
        }

        clientReq.addParameters(request.queryParams());

        if (body != null) {
            ContentType ct = null;
            String ctStr;
            if ((ctStr = requestHeaders.get(HeaderMap.CONTENT_TYPE)) != null) {
                ct = ContentTypeCache.computeIfAbsent(ctStr, ContentType::parse);
            }
            clientReq.setEntity(new MultiBufferEntity(body, ct));
        }

        return clientReq;
    }

    static class RestResponse implements Response {
        private final ESResponse restResponse;

        RestResponse(ESResponse restResponse) {
            this.restResponse = restResponse;
        }

        @Override
        public Node node() {
            return new Node(restResponse.getHost().toURI());
        }

        @Override
        public int statusCode() {
            return restResponse.getStatusCode();
        }

        @Override
        public String header(String name) {
            return restResponse.getHeader(name);
        }

        @Override
        public List<String> headers(String name) {
            Header[] headers = restResponse.getHeaders();
            for (int i = 0; i < headers.length; i++) {
                Header header = headers[i];
                if (header.getName().equalsIgnoreCase(name)) {
                    BasicHeaderValueParser elementParser = new BasicHeaderValueParser();
                    HeaderElement[] elements = elementParser.parseElements(header.getValue(), null);
                    return new AbstractList<>() {
                        @Override
                        public String get(int index) {
                            return elements[index].getValue();
                        }

                        @Override
                        public int size() {
                            return elements.length;
                        }
                    };
                }
            }
            return Collections.emptyList();
        }

        @Nullable
        @Override
        public BinaryData body() throws IOException {
            HttpEntity entity = restResponse.getEntity();
            return entity == null ? null : new HttpEntityBinaryData(restResponse.getEntity());
        }

        @Nullable
        @Override
        public ESResponse originalResponse() {
            return this.restResponse;
        }

        @Override
        public void close() throws IOException {
            EntityUtils.consume(restResponse.getEntity());
        }
    }

    private static class HttpEntityBinaryData implements BinaryData {
        private final HttpEntity entity;

        HttpEntityBinaryData(HttpEntity entity) {
            this.entity = entity;
        }

        @Override
        public String contentType() {
            String h = entity.getContentType();
            return h == null ? "application/octet-stream" : h;
        }

        @Override
        public void writeTo(OutputStream out) throws IOException {
            entity.writeTo(out);
        }

        @Override
        public ByteBuffer asByteBuffer() throws IOException {
            NoCopyByteArrayOutputStream out = new NoCopyByteArrayOutputStream();
            entity.writeTo(out);
            return out.asByteBuffer();
        }

        @Override
        public InputStream asInputStream() throws IOException {
            return entity.getContent();
        }

        @Override
        public boolean isRepeatable() {
            return entity.isRepeatable();
        }

        @Override
        public long size() {
            long len = entity.getContentLength();
            return len < 0 ? -1 : entity.getContentLength();
        }
    }
}
