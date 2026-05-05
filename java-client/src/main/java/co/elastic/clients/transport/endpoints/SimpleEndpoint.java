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
import co.elastic.clients.json.DelegatingJsonGenerator;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.transport.JsonEndpoint;
import jakarta.json.stream.JsonGenerator;

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
        boolean hasRequestBody,
        JsonpDeserializer<ResponseT> responseParser
    ) {
        this(
            id,
            method,
            requestUrl,
            pathParameters,
            queryParameters,
            headers,
            hasRequestBody ? returnSelf() : returnNull(),
            responseParser
        );
    }

    @Override
    public JsonpDeserializer<ResponseT> responseDeserializer() {
        return this.responseParser;
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

    /**
     * Wraps a function's result with a serializable object that will serialize to nothing if the wrapped
     * object's serialization has no property, i.e. it will either produce an empty object or nothing.
     */
    public static <T, U extends JsonpSerializable> Function<T, Object> nonEmptyJsonObject(Function<T, U> getter) {
        return (x -> x == null ? null : new NonEmptySerializable(getter.apply(x)));
    }

    private static final class NonEmptySerializable implements JsonpSerializable {
        private final Object value;

        NonEmptySerializable(Object value) {
            this.value = value;
        }

        @Override
        public void serialize(JsonGenerator generator, JsonpMapper mapper) {
            // Track the first property to start the top-level object, and end it if needed in close()
            JsonGenerator filter = new DelegatingJsonGenerator(generator) {
                boolean gotKey = false;

                @Override
                public JsonGenerator writeStartObject() {
                    if (gotKey) {
                        super.writeStartObject();
                    }
                    return this;
                }

                @Override
                public JsonGenerator writeKey(String s) {
                    if (!gotKey) {
                        gotKey = true;
                        super.writeStartObject();
                    }
                    super.writeKey(s);
                    return this;
                }

                @Override
                public JsonGenerator writeEnd() {
                    if (gotKey) {
                        super.writeEnd();
                    }
                    return this;
                }
            };

            mapper.serialize(value, filter);
        }
    }
}
