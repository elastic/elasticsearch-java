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

import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.TransportException;
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BooleanEndpoint;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.MissingRequiredPropertyException;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Cancellable;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseException;
import org.elasticsearch.client.ResponseListener;
import org.elasticsearch.client.RestClient;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class RestClientTransport implements ElasticsearchTransport {

    static final ContentType JsonContentType;

    static {

        if (Version.VERSION == null) {
            JsonContentType = ContentType.APPLICATION_JSON;
        } else {
            JsonContentType = ContentType.create(
                "application/vnd.elasticsearch+json",
                new BasicNameValuePair("compatible-with", String.valueOf(Version.VERSION.major()))
            );
        }
    }

    /**
     * The {@code Future} implementation returned by async requests.
     * It wraps the RestClient's cancellable and progagates cancellation.
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
    private final JsonpMapper mapper;
    private final RestClientOptions transportOptions;

    public RestClientTransport(RestClient restClient, JsonpMapper mapper, @Nullable TransportOptions options) {
        this.restClient = restClient;
        this.mapper = mapper;
        this.transportOptions = options == null ? RestClientOptions.initialOptions() : RestClientOptions.of(options);
    }

    public RestClientTransport(RestClient restClient, JsonpMapper mapper) {
        this(restClient, mapper, null);
    }

    /**
     * Returns the underlying low level Rest Client used by this transport.
     */
    public RestClient restClient() {
        return this.restClient;
    }

    /**
     * Copies this {@link #RestClientTransport} with specific request options.
     */
    public RestClientTransport withRequestOptions(@Nullable TransportOptions options) {
        return new RestClientTransport(this.restClient, this.mapper, options);
    }

    @Override
    public JsonpMapper jsonpMapper() {
        return mapper;
    }

    @Override
    public TransportOptions options() {
        return transportOptions;
    }

    @Override
    public void close() throws IOException {
        this.restClient.close();
    }

    public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {

        org.elasticsearch.client.Request clientReq = prepareLowLevelRequest(request, endpoint, options);
        org.elasticsearch.client.Response clientResp = restClient.performRequest(clientReq);
        return getHighLevelResponse(clientResp, endpoint);
    }

    public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) {
        RequestFuture<ResponseT> future = new RequestFuture<>();
        org.elasticsearch.client.Request clientReq;
        try {
            clientReq = prepareLowLevelRequest(request, endpoint, options);
        } catch (Exception e) {
            // Terminate early
            future.completeExceptionally(e);
            return future;
        }

        // Propagate required property checks to the thread that will decode the response
        boolean disableRequiredChecks = ApiTypeHelper.requiredPropertiesCheckDisabled();

        future.cancellable = restClient.performRequestAsync(clientReq, new ResponseListener() {
            @Override
            public void onSuccess(Response clientResp) {
                try (ApiTypeHelper.DisabledChecksHandle h =
                         ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(disableRequiredChecks)) {

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

    private <RequestT> org.elasticsearch.client.Request prepareLowLevelRequest(
        RequestT request,
        Endpoint<RequestT, ?, ?> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {
        String method = endpoint.method(request);
        String path = endpoint.requestUrl(request);
        Map<String, String> params = endpoint.queryParameters(request);

        org.elasticsearch.client.Request clientReq = new org.elasticsearch.client.Request(method, path);

        RequestOptions restOptions = options == null ?
            transportOptions.restClientRequestOptions() :
            RestClientOptions.of(options).restClientRequestOptions();

        if (restOptions != null) {
            clientReq.setOptions(restOptions);
        }

        clientReq.addParameters(params);

        if (endpoint.hasRequestBody()) {
            // Request has a body and must implement JsonpSerializable or NdJsonpSerializable

            if (request instanceof NdJsonpSerializable) {
                List<ByteBuffer> lines = new ArrayList<>();
                collectNdJsonLines(lines, (NdJsonpSerializable)request);
                clientReq.setEntity(new MultiBufferEntity(lines, JsonContentType));
            } else {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(request, generator);
                generator.close();
                clientReq.setEntity(new ByteArrayEntity(baos.toByteArray(), JsonContentType));
            }
        }
        // Request parameter intercepted by LLRC
        clientReq.addParameter("ignore", "400,401,403,404,405");
        return clientReq;
    }

    private static final ByteBuffer NdJsonSeparator = ByteBuffer.wrap("\n".getBytes(StandardCharsets.UTF_8));

    private void collectNdJsonLines(List<ByteBuffer> lines, NdJsonpSerializable value) {
        Iterator<?> values = value._serializables();
        while(values.hasNext()) {
            Object item = values.next();
            if (item == null) {
                // Skip
            } else if (item instanceof NdJsonpSerializable && item != value) { // do not recurse on the item itself
                collectNdJsonLines(lines, (NdJsonpSerializable)item);
            } else {
                // TODO: items that aren't already BinaryData could be serialized to ByteBuffers lazily
                // to reduce the number of buffers to keep in memory
                lines.add(BinaryData.of(item, this.mapper).asByteBuffer());
                lines.add(NdJsonSeparator);
            }
        }
    }

    /**
     * Write an nd-json value by serializing each of its items on a separate line, recursing if its items themselves implement
     * {@link NdJsonpSerializable} to flattening nested structures.
     */
    private void writeNdJson(NdJsonpSerializable value, ByteArrayOutputStream baos) throws IOException {
        Iterator<?> values = value._serializables();
        while(values.hasNext()) {
            Object item = values.next();
            if (item instanceof NdJsonpSerializable && item != value) { // do not recurse on the item itself
                writeNdJson((NdJsonpSerializable) item, baos);
            } else {
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(item, generator);
                generator.close();
                baos.write('\n');
            }
        }
    }

    private <ResponseT, ErrorT> ResponseT getHighLevelResponse(
        org.elasticsearch.client.Response clientResp,
        Endpoint<?, ResponseT, ErrorT> endpoint
    ) throws IOException {

        int statusCode = clientResp.getStatusLine().getStatusCode();
        try {

            if (statusCode == 200) {
                checkProductHeader(clientResp, endpoint);
            }

            if (endpoint.isError(statusCode)) {
                JsonpDeserializer<ErrorT> errorDeserializer = endpoint.errorDeserializer(statusCode);
                if (errorDeserializer == null) {
                    throw new TransportException(
                        "Request failed with status code '" + statusCode + "'",
                        endpoint.id(), new ResponseException(clientResp)
                    );
                }

                HttpEntity entity = clientResp.getEntity();
                if (entity == null) {
                    throw new TransportException(
                        "Expecting a response body, but none was sent",
                        endpoint.id(), new ResponseException(clientResp)
                    );
                }

                // We may have to replay it.
                entity = new BufferedHttpEntity(entity);

                try {
                    InputStream content = entity.getContent();
                    try (JsonParser parser = mapper.jsonProvider().createParser(content)) {
                        ErrorT error = errorDeserializer.deserialize(parser, mapper);
                        // TODO: have the endpoint provide the exception constructor
                        throw new ElasticsearchException(endpoint.id(), (ErrorResponse) error);
                    }
                } catch(MissingRequiredPropertyException errorEx) {
                    // Could not decode exception, try the response type
                    try {
                        ResponseT response = decodeResponse(statusCode, entity, clientResp, endpoint);
                        return response;
                    } catch(Exception respEx) {
                        // No better luck: throw the original error decoding exception
                        throw new TransportException("Failed to decode error response", endpoint.id(), new ResponseException(clientResp));
                    }
                }
            } else {
                return decodeResponse(statusCode, clientResp.getEntity(), clientResp, endpoint);
            }
        } finally {
            // Consume the entity unless this is a successful binary endpoint, where the user must consume the entity
            if (!(endpoint instanceof BinaryEndpoint && !endpoint.isError(statusCode))) {
                EntityUtils.consume(clientResp.getEntity());
            }
        }
    }

    private <ResponseT> ResponseT decodeResponse(
        int statusCode, @Nullable HttpEntity entity, Response clientResp, Endpoint<?, ResponseT, ?> endpoint
    ) throws IOException {

        if (endpoint instanceof JsonEndpoint) {
            @SuppressWarnings("unchecked")
            JsonEndpoint<?, ResponseT, ?> jsonEndpoint = (JsonEndpoint<?, ResponseT, ?>) endpoint;
            // Successful response
            ResponseT response = null;
            JsonpDeserializer<ResponseT> responseParser = jsonEndpoint.responseDeserializer();
            if (responseParser != null) {
                // Expecting a body
                if (entity == null) {
                    throw new TransportException(
                        "Expecting a response body, but none was sent",
                        endpoint.id(), new ResponseException(clientResp)
                    );
                }
                InputStream content = entity.getContent();
                try (JsonParser parser = mapper.jsonProvider().createParser(content)) {
                    response = responseParser.deserialize(parser, mapper);
                }
            }
            return response;

        } else if(endpoint instanceof BooleanEndpoint) {
            BooleanEndpoint<?> bep = (BooleanEndpoint<?>) endpoint;

            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT) new BooleanResponse(bep.getResult(statusCode));
            return response;


        } else if (endpoint instanceof BinaryEndpoint) {
            BinaryEndpoint<?> bep = (BinaryEndpoint<?>) endpoint;

            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT) new HttpClientBinaryResponse(entity);
            return response;

        } else {
            throw new TransportException("Unhandled endpoint type: '" + endpoint.getClass().getName() + "'", endpoint.id());
        }
    }

    // Endpoints that (incorrectly) do not return the Elastic product header
    private static final Set<String> endpointsMissingProductHeader = new HashSet<>(Arrays.asList(
        "es/snapshot.create" // #74 / elastic/elasticsearch#82358
    ));

    private void checkProductHeader(Response clientResp, Endpoint<?, ?, ?> endpoint) throws IOException {
        String header = clientResp.getHeader("X-Elastic-Product");
        if (header == null) {
            if (endpointsMissingProductHeader.contains(endpoint.id())) {
                return;
            }
            throw new TransportException(
                "Missing [X-Elastic-Product] header. Please check that you are connecting to an Elasticsearch "
                    + "instance, and that any networking filters are preserving that header.",
                endpoint.id(),
                new ResponseException(clientResp)
            );
        }

        if (!"Elasticsearch".equals(header)) {
            throw new TransportException("Invalid value '" + header + "' for 'X-Elastic-Product' header.",
                endpoint.id(),
                new ResponseException(clientResp)
            );
        }
    }
}
