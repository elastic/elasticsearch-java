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
import co.elastic.clients.transport.Endpoint;

import javax.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class EndpointBase<RequestT, ResponseT> implements Endpoint<RequestT, ResponseT, ErrorResponse> {

    private static final Function<?, Map<String, String>> EMPTY_MAP = x -> Collections.emptyMap();
    private static final Function<?, Object> RETURN_NULL = x -> null;
    private static final Function<?, ?> RETURN_SELF = x -> x;

    /**
     * Returns a function that always returns an empty String to String map. Useful to avoid creating lots of
     * duplicate lambdas in endpoints that don't have headers or parameters.
     */
    @SuppressWarnings("unchecked")
    public static <T> Function<T, Map<String, String>> emptyMap() {
        return (Function<T, Map<String, String>>) EMPTY_MAP;
    }

    /**
     * Returns a function that always returns {@code null}.
     */
    @SuppressWarnings("unchecked")
    static <T, U> Function<T, U> returnNull() {
        return (Function<T, U>) RETURN_NULL;
    }

    /**
     * Returns a function that always returns its parameter. It's similar to {@code Function.identity()} with the difference
     * that the input and output generic parameters are different, making it suitable for use in a wider range of use cases.
     */
    @SuppressWarnings("unchecked")
    static <T, U> Function<T, U> returnSelf() {
        return (Function<T, U>) RETURN_SELF;
    }

    protected final String id;
    protected final Function<RequestT, String> method;
    protected final Function<RequestT, String> requestUrl;
    protected final Function<RequestT, Map<String, String>> pathParameters;
    protected final Function<RequestT, Map<String, String>> queryParameters;
    protected final Function<RequestT, Map<String, String>> headers;
    protected final Function<RequestT, Object> body;

    public EndpointBase(
        String id,
        Function<RequestT, String> method,
        Function<RequestT, String> requestUrl,
        Function<RequestT, Map<String, String>> pathParameters,
        Function<RequestT, Map<String, String>> queryParameters,
        Function<RequestT, Map<String, String>> headers,
        Function<RequestT, Object> body
    ) {
        this.id = id;
        this.method = method;
        this.requestUrl = requestUrl;
        this.pathParameters = pathParameters;
        this.queryParameters = queryParameters;
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public String method(RequestT request) {
        return this.method.apply(request);
    }

    @Override
    public String requestUrl(RequestT request) {
        return this.requestUrl.apply(request);
    }

    @Override
    public Map<String, String> pathParameters(RequestT request) {
        return this.pathParameters.apply(request);
    }

    @Override
    public Map<String, String> queryParameters(RequestT request) {
        return this.queryParameters.apply(request);
    }

    @Override
    public Map<String, String> headers(RequestT request) {
        return this.headers.apply(request);
    }

    @Nullable
    @Override
    public Object body(RequestT request) {
        return this.body.apply(request);
    }

    // ES-specific
    @Override
    public boolean isError(int statusCode) {
        return statusCode >= 400;
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

    public static RuntimeException noPathTemplateFound(String what) {
        return new RuntimeException("Could not find a request " + what + " with this set of properties. " +
            "Please check the API documentation, or raise an issue if this should be a valid request.");
    }

    private static final BitSet PATH_SAFE;
    private static final char[] HEX_CHARS;

    static {
        PATH_SAFE   = new BitSet(256);
        // From RFC 3986
        // unreserved = ALPHA / DIGIT / "-" / "." / "_" / "~"
        PATH_SAFE.set('a', 'z'+1);
        PATH_SAFE.set('A', 'Z'+1);
        PATH_SAFE.set('0', '9'+1);
        PATH_SAFE.set('-');
        PATH_SAFE.set('.');
        PATH_SAFE.set('_');
        PATH_SAFE.set('~');

        // sub-delims  = "!" / "$" / "&" / "'" / "(" / ")" / "*" / "+" / "," / ";" / "="
        PATH_SAFE.set('!');
        PATH_SAFE.set('$');
        PATH_SAFE.set('&');
        PATH_SAFE.set('\'');
        PATH_SAFE.set('(');
        PATH_SAFE.set(')');
        PATH_SAFE.set('*');
        PATH_SAFE.set('+');
        PATH_SAFE.set(',');
        PATH_SAFE.set(';');
        PATH_SAFE.set('=');

        // pchar = unreserved / pct-encoded / sub-delims / ":" / "@"
        PATH_SAFE.set(':');
        PATH_SAFE.set('@');

        HEX_CHARS = "0123456789ABCDEF".toCharArray();
    }

    public static void pathEncode(final String src, StringBuilder dest) {
        final ByteBuffer buf = StandardCharsets.UTF_8.encode(src);
        // In UTF-8 multibyte encoding, all bytes have the high bit set. This means we can iterate
        // on all bytes and percent-encode without having to care about code point context.
        while (buf.hasRemaining()) {
            int b = buf.get() & 0xff;
            if (PATH_SAFE.get(b)) {
                dest.append((char) b);
            } else {
                dest.append("%");
                dest.append(HEX_CHARS[b >> 4 & 0xF]);
                dest.append(HEX_CHARS[b & 0xF]);
            }
        }
    }
}
