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

package co.elastic.clients.transport.endpoints;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.transport.JsonEndpoint;

import java.util.Map;
import java.util.function.Function;

public class SimpleEndpoint<RequestT, ResponseT> extends EndpointBase<RequestT, ResponseT>
    implements JsonEndpoint<RequestT, ResponseT, ErrorResponse> {

    private final JsonpDeserializer<ResponseT> responseParser;

    public SimpleEndpoint(
        String id,
        Function<RequestT, String> method,
        Function<RequestT, String> requestUrl,
        Function<RequestT, Map<String, String>> pathParameters,
        Function<RequestT, Map<String, String>> queryParameters,
        Function<RequestT, Map<String, String>> headers,
        Function<RequestT, Object> body,
        JsonpDeserializer<ResponseT> responseParser
    ) {
        super(id, method, requestUrl, pathParameters, queryParameters, headers, body);
        this.responseParser = responseParser;
    }

    public SimpleEndpoint(
        String id,
        Function<RequestT, String> method,
        Function<RequestT, String> requestUrl,
        Function<RequestT, Map<String, String>> pathParameters,
        Function<RequestT, Map<String, String>> queryParameters,
        Function<RequestT, Map<String, String>> headers,
        boolean hasResponseBody,
        JsonpDeserializer<ResponseT> responseParser
    ) {
        this(
            id,
            method,
            requestUrl,
            pathParameters,
            queryParameters,
            headers,
            hasResponseBody ? returnSelf() : returnNull(),
            responseParser
        );
    }

    @Override
    public JsonpDeserializer<ResponseT> responseDeserializer() {
        return this.responseParser;
    }

    @Override
    public JsonpDeserializer<ErrorResponse> errorDeserializer(int statusCode) {
        return ErrorResponse._DESERIALIZER;
    }

    public <NewResponseT> SimpleEndpoint<RequestT, NewResponseT> withResponseDeserializer(
        JsonpDeserializer<NewResponseT> newResponseParser
    ) {
        return new SimpleEndpoint<>(
            id,
            method,
            requestUrl,
            pathParameters,
            queryParameters,
            headers,
            body,
            newResponseParser
        );
    }
}
