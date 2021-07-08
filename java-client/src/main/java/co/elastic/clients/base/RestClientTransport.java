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

package co.elastic.clients.base;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ToJsonp;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.elasticsearch.client.Cancellable;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseListener;
import org.elasticsearch.client.RestClient;

import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class RestClientTransport implements Transport {

    private final RestClient restClient;
    private final JsonpMapper mapper;

    public RestClientTransport(RestClient restClient, JsonpMapper mapper) {
        this.restClient = restClient;
        this.mapper = mapper;
    }

    @Override
    public JsonpMapper jsonpMapper() {
        return mapper;
    }

    public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        RequestOptions options
    ) throws IOException {

        org.elasticsearch.client.Request clientReq = prepareLowLevelRequest(request, endpoint, options);
        org.elasticsearch.client.Response clientResp = restClient.performRequest(clientReq);
        return getHighLevelResponse(clientResp, endpoint);
    }

    public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        RequestOptions options
    ) {
        org.elasticsearch.client.Request clientReq = prepareLowLevelRequest(request, endpoint, options);

        RequestFuture<ResponseT> future = new RequestFuture<>();

        future.cancellable = restClient.performRequestAsync(clientReq, new ResponseListener() {
            @Override
            public void onSuccess(Response clientResp) {
                try {
                    ResponseT response = getHighLevelResponse(clientResp, endpoint);
                    future.complete(response);
                } catch (Exception e) {
                    future.completeExceptionally(e);
                }
            }

            @Override
            public void onFailure(Exception e) {
                future.completeExceptionally(e);
            }
        });

        return future;
    }

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

    private <RequestT> org.elasticsearch.client.Request prepareLowLevelRequest(
        RequestT request,
        Endpoint<RequestT, ?, ?> endpoint,
        RequestOptions options
    ) {
        String method = endpoint.method(request);
        String path = endpoint.requestUrl(request);
        Map<String, String> params = endpoint.queryParameters(request);

        org.elasticsearch.client.Request clientReq = new org.elasticsearch.client.Request(method, path);
        clientReq.addParameters(params);
        if (options != null) {
            clientReq.setOptions(options);
        }

        if (endpoint.hasRequestBody()) {
            // Request has a body and must implement ToJsonp
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JsonGenerator generator = mapper.jsonpProvider().createGenerator(baos);
            ((ToJsonp) request).toJsonp(generator, mapper);
            generator.close();

            clientReq.setEntity(new ByteArrayEntity(baos.toByteArray(), ContentType.APPLICATION_JSON));
        }

        return clientReq;
    }

    private <ResponseT, ErrorT> ResponseT getHighLevelResponse(
        org.elasticsearch.client.Response clientResp,
        Endpoint<?, ResponseT, ErrorT> endpoint
    ) throws IOException {

        int statusCode = clientResp.getStatusLine().getStatusCode();

        if (endpoint.isError(statusCode)) {
            // API error
            ErrorT error = null;
            JsonpDeserializer<ErrorT> errorParser = endpoint.errorParser(statusCode);
            if (errorParser != null) {
                // Expecting a body
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                clientResp.getEntity().writeTo(baos);
                JsonParser parser = mapper.jsonpProvider().createParser(new ByteArrayInputStream(baos.toByteArray()));
                error = errorParser.deserialize(parser, mapper);
            }

            throw new ApiException(error);

        } else if (endpoint instanceof Endpoint.Boolean) {
            Endpoint.Boolean<?> bep = (Endpoint.Boolean<?>)endpoint;

            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT)new BooleanResponse(bep.getResult(statusCode));

            return response;

        } else {
            // Successful response
            ResponseT response = null;
            JsonpDeserializer<ResponseT> responseParser = endpoint.responseParser();
            if (responseParser != null) {
                // Expecting a body
                InputStream content = clientResp.getEntity().getContent();
                JsonParser parser = mapper.jsonpProvider().createParser(content);
                response = responseParser.deserialize(parser, mapper);
            }
            return response;
        }
    }
}
