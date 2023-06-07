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

package co.elastic.clients.transport;

import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.transport.endpoints.BinaryDataResponse;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BooleanEndpoint;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ByteArrayBinaryData;
import co.elastic.clients.util.ContentType;
import co.elastic.clients.util.MissingRequiredPropertyException;
import co.elastic.clients.util.NoCopyByteArrayOutputStream;
import jakarta.json.JsonException;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public abstract class ElasticsearchTransportBase<
    Options extends TransportOptions
    > implements ElasticsearchTransport {

    public static final String JsonContentType;

    static {
        if (Version.VERSION == null) {
            JsonContentType = ContentType.APPLICATION_JSON;
        } else {
            JsonContentType =
                "application/vnd.elasticsearch+json; compatible-with=" +
                Version.VERSION.major();
        }
    }

    private final TransportHttpClient<Options> httpClient;

    @Override
    public void close() throws IOException {
        httpClient.close();
    }

    private final JsonpMapper mapper;
    protected final Options transportOptions;

    public ElasticsearchTransportBase(JsonpMapper jsonpMapper, TransportHttpClient<Options> httpClient, Options options) {
        this.mapper = jsonpMapper;
        this.httpClient = httpClient;
        this.transportOptions = options == null ? httpClient.createOptions(null) : options;
    }

    @Override
    public final JsonpMapper jsonpMapper() {
        return mapper;
    }

    @Override
    public final TransportOptions options() {
        return transportOptions;
    }

    @Override
    public final <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {
        TransportHttpClient.Request req = prepareTransportRequest(request, endpoint, options);
        Options opts = options == null ? transportOptions : httpClient.createOptions(options);
        TransportHttpClient.Response resp = httpClient.performRequest(endpoint.id(), null, req, opts);
        return getApiResponse(resp, endpoint);
    }

    @Override
    public final <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) {
        TransportHttpClient.Request clientReq;
        try {
            clientReq = prepareTransportRequest(request, endpoint, options);
        } catch (Exception e) {
            // Terminate early
            CompletableFuture<ResponseT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }

        // Propagate required property checks to the thread that will decode the response
        boolean disableRequiredChecks = ApiTypeHelper.requiredPropertiesCheckDisabled();

        CompletableFuture<TransportHttpClient.Response> clientFuture = httpClient.performRequestAsync(
            endpoint.id(), null, clientReq, httpClient.createOptions(options)
        );

        // Cancelling the result will cancel the upstream future created by the http client, allowing to stop in-flight requests
        CompletableFuture<ResponseT> future = new CompletableFuture<ResponseT>() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean cancelled = super.cancel(mayInterruptIfRunning);
                if (cancelled) {
                    clientFuture.cancel(mayInterruptIfRunning);
                }
                return cancelled;
            }
        };

        clientFuture.handle((clientResp, thr) -> {
            if (thr != null) {
                future.completeExceptionally(thr);
            } else {
                try (ApiTypeHelper.DisabledChecksHandle h =
                         ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(disableRequiredChecks)) {

                    ResponseT response = getApiResponse(clientResp, endpoint);
                    future.complete(response);

                } catch (Throwable e) {
                    future.completeExceptionally(e);
                }
            }
            return null;
        });

        return future;
    }

    private <RequestT, ResponseT, ErrorT> TransportHttpClient.Request prepareTransportRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException {
        String method = endpoint.method(request);
        String path = endpoint.requestUrl(request);
        Map<String, String> params = endpoint.queryParameters(request);

        List<ByteBuffer> bodyBuffers = null;
        String contentType = null;

        Object body = endpoint.body(request);
        if (body != null) {
            // Request has a body
            if (body instanceof NdJsonpSerializable) {
                bodyBuffers = new ArrayList<>();
                collectNdJsonLines(bodyBuffers, (NdJsonpSerializable) request);
                contentType = JsonContentType;

            } else if (body instanceof BinaryData) {
                BinaryData data = (BinaryData)body;

                // ES expects the Accept and Content-Type headers to be consistent.
                String dataContentType = data.contentType();
                if (ContentType.APPLICATION_JSON.equals(dataContentType)) {
                    // Fast path
                    contentType = JsonContentType;
                } else {
                    contentType = dataContentType;
                }
                bodyBuffers = Collections.singletonList(data.asByteBuffer());

            } else {
                NoCopyByteArrayOutputStream baos = new NoCopyByteArrayOutputStream();
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(body, generator);
                generator.close();
                bodyBuffers = Collections.singletonList(baos.asByteBuffer());
                contentType = JsonContentType;
            }
        }

        return new TransportHttpClient.Request(method, path, params, contentType, bodyBuffers);
    }

    private static final ByteBuffer NdJsonSeparator = ByteBuffer.wrap("\n".getBytes(StandardCharsets.UTF_8));

    private void collectNdJsonLines(List<ByteBuffer> lines, NdJsonpSerializable value) throws IOException {
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

    private <ResponseT, ErrorT> ResponseT getApiResponse(
        TransportHttpClient.Response clientResp,
        Endpoint<?, ResponseT, ErrorT> endpoint
    ) throws IOException {

        int statusCode = clientResp.statusCode();

        try {
            if (statusCode == 200) {
                checkProductHeader(clientResp, endpoint);
            }

            if (endpoint.isError(statusCode)) {
                JsonpDeserializer<ErrorT> errorDeserializer = endpoint.errorDeserializer(statusCode);
                if (errorDeserializer == null) {
                    throw new TransportException(
                        statusCode,
                        "Request failed with status code '" + statusCode + "'",
                        endpoint.id(), clientResp.createException()
                    );
                }

                BinaryData entity = clientResp.body();
                if (entity == null) {
                    throw new TransportException(
                        statusCode,
                        "Expecting a response body, but none was sent",
                        endpoint.id(), clientResp.createException()
                    );
                }

                // We may have to replay it.
                if (!entity.isRepeatable()) {
                    entity = new ByteArrayBinaryData(entity);
                }

                try (InputStream content = entity.asInputStream()) {
                    try (JsonParser parser = mapper.jsonProvider().createParser(content)) {
                        ErrorT error = errorDeserializer.deserialize(parser, mapper);
                        // TODO: have the endpoint provide the exception constructor
                        throw new ElasticsearchException(endpoint.id(), (ErrorResponse) error);
                    }
                } catch(JsonException | MissingRequiredPropertyException errorEx) {
                    // Could not decode exception, try the response type
                    try {
                        ResponseT response = decodeTransportResponse(statusCode, entity, clientResp, endpoint);
                        return response;
                    } catch(Exception respEx) {
                        // No better luck: throw the original error decoding exception
                        throw new TransportException(statusCode,
                            "Failed to decode error response, check exception cause for additional details", endpoint.id(),
                            clientResp.createException()
                        );
                    }
                }
            } else {
                return decodeTransportResponse(statusCode, clientResp.body(), clientResp, endpoint);
            }


        } finally {
            // Consume the entity unless this is a successful binary endpoint, where the user must consume the entity
            if (!(endpoint instanceof BinaryEndpoint && !endpoint.isError(statusCode))) {
                clientResp.close();
            }
        }
    }

    private <ResponseT> ResponseT decodeTransportResponse(
        int statusCode, @Nullable BinaryData entity, TransportHttpClient.Response clientResp, Endpoint<?, ResponseT, ?> endpoint
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
                        statusCode,
                        "Expecting a response body, but none was sent",
                        endpoint.id(), clientResp.createException()
                    );
                }
                try (
                    InputStream content = entity.asInputStream();
                    JsonParser parser = mapper.jsonProvider().createParser(content)
                ) {
                    response = responseParser.deserialize(parser, mapper);
                } catch (Exception e) {
                    throw new TransportException(
                        statusCode,
                        "Failed to decode response",
                        endpoint.id(),
                        e
                    );
                }
            }
            return response;

        } else if(endpoint instanceof BooleanEndpoint) {
            BooleanEndpoint<?> bep = (BooleanEndpoint<?>) endpoint;

            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT) new BooleanResponse(bep.getResult(statusCode));
            return response;


        } else if (endpoint instanceof BinaryEndpoint) {
            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT) new BinaryDataResponse(entity);
            return response;

        } else {
            throw new TransportException(statusCode, "Unhandled endpoint type: '" + endpoint.getClass().getName() + "'", endpoint.id());
        }
    }

    // Endpoints that (incorrectly) do not return the Elastic product header
    private static final Set<String> endpointsMissingProductHeader = new HashSet<>(Arrays.asList(
        "es/snapshot.create" // #74 / elastic/elasticsearch#82358
    ));

    private void checkProductHeader(TransportHttpClient.Response clientResp, Endpoint<?, ?, ?> endpoint) throws IOException {
        String header = clientResp.header("X-Elastic-Product");
        if (header == null) {
            if (endpointsMissingProductHeader.contains(endpoint.id())) {
                return;
            }
            throw new TransportException(
                clientResp.statusCode(),
                "Missing [X-Elastic-Product] header. Please check that you are connecting to an Elasticsearch "
                    + "instance, and that any networking filters are preserving that header.",
                endpoint.id(),
                clientResp.createException()
            );
        }

        if (!"Elasticsearch".equals(header)) {
            throw new TransportException(
                clientResp.statusCode(),
                "Invalid value '" + header + "' for 'X-Elastic-Product' header.",
                endpoint.id(),
                clientResp.createException()
            );
        }
    }
}
