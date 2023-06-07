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

package co.elastic.clients.transport.http;

import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.BinaryData;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * Minimal http client interface needed to implement an Elasticsearch transport.
 *
 * @param <Options> the client's options type
 */
public interface TransportHttpClient<Options extends TransportOptions> {

    /**
     * Create a client-specific options value from an existing option object. If {@code null}, this must
     * create the default options to which additional options can be added.
     */
    Options createOptions(@Nullable TransportOptions options);

    /**
     * Perform a blocking request.
     *
     * @param endpointId the endpoint identifier. Can be used to have specific strategies depending on the endpoint.
     * @param request the request
     * @param options additional options for the http client
     *
     * @return the request response
     */
    Response performRequest(String endpointId, @Nullable Node node, Request request, TransportOptions options) throws IOException;

    /**
     * Perform an asynchronous request.
     *
     * @param endpointId the endpoint identifier. Can be used to have specific strategies depending on the endpoint.
     * @param request the request
     * @param options additional options for the http client
     *
     * @return the request response
     */
    CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node, Request request, TransportOptions options);

    /**
     * Close this client, freeing associated resources.
     */
    void close() throws IOException;

    /**
     * A node/host to send requests to.
     */
    class Node {
        private final URI uri;
        private final Set<String> roles;
        private final Map<String, String> attributes;

        /**
         * Create a node with its URI, roles and attributes.
         * <p>
         * If the URI doesn't end with a '{@code /}', then one is added.
         */
        public Node(URI uri, Set<String> roles, Map<String, String> attributes) {
            if (!uri.isAbsolute()) {
                throw new IllegalArgumentException("Node URIs must be absolute: " + uri);
            }

            if (!uri.getRawPath().endsWith("/")) {
                uri = uri.resolve(uri.getRawPath() + "/");
            }

            this.uri = uri;
            this.roles = roles;
            this.attributes = attributes;
        }

        public Node(URI uri) {
            this(uri, Collections.emptySet(), Collections.emptyMap());
        }

        public Node(String uri) {
            this(URI.create(uri), Collections.emptySet(), Collections.emptyMap());
        }

        public URI uri() {
            return this.uri;
        }

        public URI uriForPath(String path) {
            // Make sure the path will be appended to the node's URI path if it exists, and will not replace it.
            if (this.uri.getRawPath().length() > 1) {
                if (path.charAt(0) == '/') {
                    path = path.substring(1);
                }
            }

            return uri.resolve(path);
        }

        @Override
        public String toString() {
            return uri.toString();
        }
    }

    /**
     * An http request.
     */
    class Request {
        @Nullable
        private final String method;
        private final String path;
        private final Map<String, String> queryParams;
        @Nullable
        private final String contentType;
        @Nullable
        private final Iterable<ByteBuffer> body;

        public Request(String method, String path, Map<String, String> queryParams, @Nullable String contentType,
            @Nullable Iterable<ByteBuffer> body) {
            this.method = method;
            this.path = path;
            this.queryParams = queryParams;
            this.contentType = contentType;
            this.body = body;
        }

        public String method() {
            return method;
        }

        public String path() {
            return path;
        }

        public Map<String, String> queryParams() {
            return queryParams;
        }

        @Nullable
        public String contentType() {
            return contentType;
        }

        @Nullable
        public Iterable<ByteBuffer> body() {
            return body;
        }
    }

    /**
     * An http response.
     */
    interface Response {

        /**
         * The host/node that was used to send the request. It may be different from the one that was provided with the request
         * if the http client has an internal retry mechanism.
         */
        Node node();

        /**
         * The response status code.
         */
        int statusCode();

        /**
         * Get a header value, or the first value if the header has multiple values.
         */
        String header(String name);

        /**
         * The response body, if any.
         */
        @Nullable
        BinaryData body() throws IOException;


        Throwable createException() throws IOException;

        /**
         * Close this response, freeing its associated resource, consuming the remaining body, if needed.
         */
        void close() throws IOException;
    }
}
