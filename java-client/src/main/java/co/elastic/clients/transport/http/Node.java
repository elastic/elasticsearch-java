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

import javax.annotation.Nullable;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * A node/host to send requests to.
 */
public class Node {
    private final URI uri;
    private final String name;
    private final String version;
    private final Set<String> roles;
    private final Map<String, String> attributes;
    private final List<String> boundHosts;

    /**
     * Create a node with its URI, roles and attributes.
     * <p>
     * If the URI doesn't end with a '{@code /}', then one is added.
     *
     * @param uri        the node's URI
     * @param name       the node name/identifier
     * @param version    the node's version, if known
     * @param roles      the node's roles (such as "master", "ingest", etc).
     * @param attributes the node's attributes. This can be used for routing decisions by multi-node implementations.
     * @param boundHosts addresses on which the node is listening. Useful to find a host based on any address it's listening to.
     */
    public Node(
        URI uri,
        @Nullable String name,
        @Nullable String version,
        @Nullable Set<String> roles,
        @Nullable Map<String, String> attributes,
        @Nullable List<String> boundHosts
    ) {

        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Node URIs must be absolute: " + uri);
        }

        if (!uri.getRawPath().endsWith("/")) {
            uri = uri.resolve(uri.getRawPath() + "/");
        }

        this.uri = uri;
        this.name = name;
        this.version = version;
        this.roles = roles;
        this.attributes = attributes;
        this.boundHosts = boundHosts;
    }

    public Node(URI uri) {
        this(uri, null, null, null, null, null);
    }

    public Node(String uri) {
        this(URI.create(uri), null, null, null, null, null);
    }

    /**
     * The URI of this node. This is an absolute URL with a path ending with a "/".
     */
    public URI uri() {
        return this.uri;
    }

    /**
     * The node name/identifier
     */
    @Nullable
    public String name() {
        return name;
    }

    @Nullable
    public String version() {
        return version;
    }

    @Nullable
    public Set<String> roles() {
        return roles;
    }

    @Nullable
    public Map<String, String> attributes() {
        return attributes;
    }

    @Nullable
    public List<String> boundHosts() {
        return boundHosts;
    }

    @Override
    public String toString() {
        return uri.toString();
    }

    /**
     * Two nodes are considered equal if their URIs are equal. Other properties are ignored.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node node)) return false;
        return Objects.equals(uri, node.uri);
    }

    /**
     * A node's hash code is that of its URI. Other properties are ignored.
     */
    @Override
    public int hashCode() {
        return Objects.hash(uri);
    }
}
