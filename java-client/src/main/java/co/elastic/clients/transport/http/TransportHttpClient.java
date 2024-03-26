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

import co.elastic.clients.transport.DefaultTransportOptions;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.BinaryData;

import javax.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * Minimal http client interface needed to implement an Elasticsearch transport.
 */
public interface TransportHttpClient {

    /**
     * Create a client-specific options value from an existing option object. If {@code null}, this must
     * create the default options to which additional options can be added.
     * <p>
     * This method allows implementations to return subclasses with more features (that applications can use by downcasting the result).
     * By default, it will use {@link DefaultTransportOptions}.
     */
    default TransportOptions createOptions(@Nullable TransportOptions options) {
        return options == null ? DefaultTransportOptions.EMPTY : options;
    }

    /**
     * Perform a blocking request.
     *
     * @param endpointId the endpoint identifier. Can be used to have specific strategies depending on the endpoint.
     * @param node the node to send the request to. If {@code null}, the implementation has to choose which node to send the request to,
     *             or throw an {@code IllegalArgumentException}.
     * @param request the request
     * @param options additional options for the http client. Headers and request parameters set in the options have precedence over
     *                those defined by the request and should replace them in the final request sent.
     *
     * @return the response
     * @throws IllegalArgumentException if {@code node} is {@code is null} and the implementation cannot decide of
     *         a node to use.
     */
    Response performRequest(String endpointId, @Nullable Node node, Request request, TransportOptions options) throws IOException;

    /**
     * Perform an asynchronous request.
     * <p>
     * Implementations should return a {@code CompletableFuture} whose cancellation also cancels any http request in flight and frees
     * the associated resources. This allows applications to implement scenarios like timeouts or "first to respond" fan-out without
     * leaking resources.
     *
     * @param endpointId the endpoint identifier. Can be used to have specific strategies depending on the endpoint.
     * @param node the node to send the request to. If {@code null}, the implementation has to choose which node to send the request to,
     *             or throw an {@code IllegalArgumentException}.
     * @param request the request
     * @param options additional options for the http client. Headers and request parameters set in the options have precedence over
     *                those defined by the request and should replace them in the final request sent.
     *
     * @return a future that will be completed with the response.
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
         *
         * @param uri the node's URI
         * @param roles the node's roles (such as "master", "ingest", etc). This can be used for routing decisions by multi-node
         *              implementations.
         * @param attributes the node's attributes. This can be used for routing decisions by multi-node implementations.
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

        /**
         * The URI of this node. This is an absolute URL with a path ending with a "/".
         */
        public URI uri() {
            return this.uri;
        }

        @Override
        public String toString() {
            return uri.toString();
        }

        /**
         * Two nodes are considered equal if their URIs are equal. Roles and attributes are ignored.
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node node = (Node) o;
            return Objects.equals(uri, node.uri);
        }

        /**
         * A node's hash code is that of its URI. Roles and attributes are ignored.
         */
        @Override
        public int hashCode() {
            return Objects.hash(uri);
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
        private final Map<String, String> headers;
        @Nullable
        private final Iterable<ByteBuffer> body;

        public Request(
            String method,
            String path,
            Map<String, String> queryParams,
            Map<String, String> headers,
            @Nullable Iterable<ByteBuffer> body
        ) {
            this.method = method;
            this.path = path;
            this.queryParams = queryParams;
            this.headers = headers;
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

        public Map<String, String> headers() {
            return headers;
        }

        @Nullable
        public Iterable<ByteBuffer> body() {
            return body;
        }
    }

    /**
     * An http response.
     */
    interface Response extends Closeable {

        /**
         * The host/node that was used to send the request. It may be different from the one that was provided with the request
         * if the http client has a multi-node retry strategy.
         */
        Node node();

        /**
         * The response status code.
         */
        int statusCode();

        /**
         * Get a header value, or the first value if the header has multiple values.
         * <p>
         * Note: header names are case-insensitive
         */
        @Nullable
        String header(String name);

        /**
         * Get all values for a given header name.
         * <p>
         * Note: header names are case-insensitive
         */
        List<String> headers(String name);

        /**
         * The response body, if any.
         */
        @Nullable
        BinaryData body() throws IOException;

        /**
         * The original response of the underlying http library, if available.
         */
        @Nullable
        Object originalResponse();

        /**
         * Close this response, freeing its associated resources if needed, such as consuming the response body.
         */
        void close() throws IOException;
    }
}
