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

package co.elastic.clients.transport.rest_client;

import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.NoCopyByteArrayOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Cancellable;
import org.elasticsearch.client.ResponseException;
import org.elasticsearch.client.ResponseListener;
import org.elasticsearch.client.RestClient;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class RestClientHttpClient implements TransportHttpClient<RestClientOptions> {

    private static final ConcurrentHashMap<String, ContentType> ContentTypeCache = new ConcurrentHashMap<>();

    /**
     * The {@code Future} implementation returned by async requests.
     * It wraps the RestClient's cancellable and propagates cancellation.
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

    private final RestClient restClient;

    public RestClientHttpClient(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * Returns the underlying low level Rest Client used by this transport.
     */
    public RestClient restClient() {
        return this.restClient;
    }

    @Override
    public RestClientOptions createOptions(@Nullable TransportOptions options) {
        return options == null ? RestClientOptions.initialOptions() : RestClientOptions.of(options);
    }

    @Override
    public Response performRequest(String endpointId, Request request, RestClientOptions options) throws IOException {
        org.elasticsearch.client.Request restRequest = createRestRequest(request, options);
        org.elasticsearch.client.Response restResponse = restClient.performRequest(restRequest);
        return new RestResponse(restResponse);
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(String endpointId, Request request, RestClientOptions options) {

        RequestFuture<Response> future = new RequestFuture<>();
        org.elasticsearch.client.Request restRequest;

        try {
            restRequest = createRestRequest(request, options);
        } catch(Throwable thr) {
            // Terminate early
            future.completeExceptionally(thr);
            return future;
        }

        future.cancellable = restClient.performRequestAsync(restRequest, new ResponseListener() {
            @Override
            public void onSuccess(org.elasticsearch.client.Response response) {
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

    private org.elasticsearch.client.Request createRestRequest(Request request, RestClientOptions options) {
        org.elasticsearch.client.Request clientReq = new org.elasticsearch.client.Request(
            request.method(), request.path()
        );

        if (options != null) {
            clientReq.setOptions(options.restClientRequestOptions());
        }

        clientReq.addParameters(request.queryParams());

        Iterable<ByteBuffer> body = request.body();
        if (body != null) {
            ContentType ct = ContentTypeCache.computeIfAbsent(request.contentType(), ContentType::parse);
            clientReq.setEntity(new MultiBufferEntity(body, ct));
        }

        // Request parameter intercepted by LLRC
        clientReq.addParameter("ignore", "400,401,403,404,405");
        return clientReq;
    }

    private static class RestResponse implements Response {
        private final org.elasticsearch.client.Response restResponse;

        RestResponse(org.elasticsearch.client.Response restResponse) {
            this.restResponse = restResponse;
        }

        @Override
        public int statusCode() {
            return restResponse.getStatusLine().getStatusCode();
        }

        @Override
        public String getHeader(String name) {
            return restResponse.getHeader(name);
        }

        @Nullable
        @Override
        public BinaryData getBody() throws IOException {
            HttpEntity entity = restResponse.getEntity();
            return entity == null ? null : new HttpEntityBinaryData(restResponse.getEntity());
        }

        @Override
        public Throwable createException() throws IOException {
            return new ResponseException(this.restResponse);
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
            Header h = entity.getContentType();
            return h == null ? "application/octet-stream" : h.getValue();
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
