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

package co.elastic.clients.transport.instrumentation;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.BinaryData;
import jakarta.json.stream.JsonParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Nullable;
import java.io.InputStream;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Default {@link SpanAttributeProvider} that stamps the Elasticsearch cluster identity onto spans for self-managed
 * clusters.
 * <p>
 * When a response carries the cluster-name header ({@code X-Found-Handling-Cluster}, added by the Elastic Cloud proxy),
 * the core {@link OpenTelemetryForElasticsearch} instrumentation already stamps {@code db.elasticsearch.cluster.name}
 * directly from it. This provider does not duplicate that: if the header is present it does nothing.
 * <p>
 * On a self-managed cluster the name is not available passively — data-plane responses ({@code _search},
 * {@code _bulk}, …) never return {@code cluster_name}. So when there is no header, this provider issues a single
 * {@code GET /} through the client's own transport (inheriting the configured authentication, TLS/mTLS, proxy and node
 * selection), reads {@code cluster_name} (and optionally {@code cluster_uuid}) from the response, caches it per client
 * and refreshes it on an interval so the name follows a cluster rename without an application restart. Every failure
 * (permission denied, timeout, unsupported version) is swallowed: the real request is never blocked or affected.
 * <p>
 * The transport used for discovery is injected by {@link OpenTelemetryForElasticsearch} once the client has been built;
 * until then the provider contributes nothing and the core header capture still applies.
 *
 * <h2>Usage</h2>
 * <pre>{@code
 * ElasticsearchClient client = ElasticsearchClient.of(b -> b
 *     .host("https://localhost:9200")
 *     .apiKey(apiKey)
 *     .instrumentation(OpenTelemetryForElasticsearch.builder(openTelemetry)
 *         .addProvider(ClusterInfoProvider.create())          // defaults: 30-minute refresh, name only
 *         .build())
 * );
 * }</pre>
 * or, configuring the refresh interval and enabling the UUID:
 * <pre>{@code
 * .addProvider(ClusterInfoProvider.builder()
 *     .refreshInterval(Duration.ofMinutes(10))
 *     .captureClusterUuid(true)
 *     .build())
 * }</pre>
 */
public class ClusterInfoProvider implements SpanAttributeProvider {

    /** Attribute holding the cluster name, matching what the .NET client already emits. */
    static final String ATTR_CLUSTER_NAME = "db.elasticsearch.cluster.name";
    /** Attribute holding the stable cluster UUID (opt-in), a unique identifier that survives a rename. */
    static final String ATTR_CLUSTER_UUID = "db.elasticsearch.cluster.uuid";

    /** Header added by the Elastic Cloud proxy carrying the cluster name. */
    static final String CLOUD_CLUSTER_HEADER = "X-Found-Handling-Cluster";

    /** Default refresh interval: re-resolve the cluster name every 30 minutes. */
    static final Duration DEFAULT_REFRESH_INTERVAL = Duration.ofMinutes(30);

    /** Fields read from the {@code GET /} (info) response. */
    private static final String FIELD_CLUSTER_NAME = "cluster_name";
    private static final String FIELD_CLUSTER_UUID = "cluster_uuid";

    private static final Log logger = LogFactory.getLog(ClusterInfoProvider.class);

    private final long refreshIntervalMillis;
    private final boolean captureClusterUuid;

    // Cached cluster identity, resolved lazily and refreshed on the configured interval.
    private volatile String clusterName;
    private volatile String clusterUuid;
    private volatile long resolvedAtMillis;
    private final AtomicBoolean discoveryInFlight = new AtomicBoolean(false);

    // Transport handle for active discovery, injected after the client is built (may stay null).
    @Nullable
    private volatile TransportHttpClient httpClient;
    @Nullable
    private volatile TransportOptions transportOptions;
    @Nullable
    private volatile JsonpMapper mapper;

    private ClusterInfoProvider(Builder builder) {
        this.refreshIntervalMillis = builder.refreshInterval.toMillis();
        this.captureClusterUuid = builder.captureClusterUuid;
    }

    /**
     * Public no-argument constructor with default settings (30-minute refresh, cluster name only). Required so the
     * provider can be discovered and instantiated through {@link java.util.ServiceLoader} when it is declared in a
     * {@code META-INF/services/co.elastic.clients.transport.instrumentation.SpanAttributeProvider} file. For any other
     * use prefer {@link #create()} or {@link #builder()}.
     */
    public ClusterInfoProvider() {
        this(new Builder());
    }

    /**
     * Creates a provider with default settings: a 30-minute refresh interval, capturing the cluster name only.
     */
    public static ClusterInfoProvider create() {
        return builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Injects the transport and JSON mapper used for the {@code GET /} fallback. Called by
     * {@link OpenTelemetryForElasticsearch} once the transport is available. Package-private: not part of the public
     * provider API.
     */
    void setTransport(TransportHttpClient httpClient, @Nullable TransportOptions transportOptions, JsonpMapper mapper) {
        this.httpClient = httpClient;
        this.transportOptions = transportOptions;
        this.mapper = mapper;
    }

    @Override
    public void contribute(SpanAttributeContext context) {
        try {
            // The core instrumentation already stamps db.elasticsearch.cluster.name whenever the response carries the
            // cluster-name header. If it is present, there is nothing to add here and no need for the GET / fallback.
            String headerName = context.responseHeader(CLOUD_CLUSTER_HEADER);
            if (headerName != null && !headerName.isEmpty()) {
                return;
            }

            // No header (self-managed): stamp whatever we currently know from the cache.
            context.setAttribute(ATTR_CLUSTER_NAME, this.clusterName);
            if (captureClusterUuid) {
                context.setAttribute(ATTR_CLUSTER_UUID, this.clusterUuid);
            }

            // Refresh via GET / when the cache is empty or stale, at most one fetch in flight at a time.
            if (isStale() && httpClient != null && discoveryInFlight.compareAndSet(false, true)) {
                CompletableFuture.runAsync(this::discoverClusterInfo)
                    .whenComplete((v, t) -> discoveryInFlight.set(false));
            }
        } catch (RuntimeException e) {
            // Instrumentation must never affect the real request.
            logger.debug("Failed contributing cluster info to the OpenTelemetry span.", e);
        }
    }

    private boolean isStale() {
        if (clusterName == null) {
            return true;
        }
        if (refreshIntervalMillis <= 0) {
            return false; // never refresh once resolved
        }
        return (System.currentTimeMillis() - resolvedAtMillis) > refreshIntervalMillis;
    }

    private void discoverClusterInfo() {
        TransportHttpClient client = this.httpClient;
        JsonpMapper jsonpMapper = this.mapper;
        if (client == null || jsonpMapper == null) {
            return;
        }
        try {
            TransportHttpClient.Request request = new TransportHttpClient.Request(
                "GET", "/", Collections.emptyMap(), Collections.emptyMap(), null
            );
            TransportHttpClient.Response response =
                client.performRequest("cluster-info", null, request, this.transportOptions);

            BinaryData body = response.body();
            if (body == null) {
                return;
            }

            String name = null;
            String uuid = null;
            // Read only the two fields we need with the streaming parser (createParser). We intentionally use the
            // streaming API rather than the object-model reader (createReader/JsonObject): the default Jackson-backed
            // JsonpMapper implements createParser but not createReader (the latter throws
            // UnsupportedOperationException), whereas the streaming parser is supported by every JsonpMapper backend.
            // We also don't bind to the generated InfoResponse model, to keep the transport layer independent of the
            // high-level API types.
            try (InputStream in = body.asInputStream();
                 JsonParser parser = jsonpMapper.jsonProvider().createParser(in)) {
                if (parser.hasNext() && parser.next() == JsonParser.Event.START_OBJECT) {
                    while (parser.hasNext()) {
                        JsonParser.Event event = parser.next();
                        if (event == JsonParser.Event.END_OBJECT) {
                            break;
                        }
                        if (event != JsonParser.Event.KEY_NAME) {
                            continue;
                        }
                        String key = parser.getString();
                        JsonParser.Event valueEvent = parser.next();
                        if (FIELD_CLUSTER_NAME.equals(key) && valueEvent == JsonParser.Event.VALUE_STRING) {
                            name = parser.getString();
                        } else if (FIELD_CLUSTER_UUID.equals(key) && valueEvent == JsonParser.Event.VALUE_STRING) {
                            uuid = parser.getString();
                        } else {
                            skipValue(parser, valueEvent);
                        }
                    }
                }
            }

            if (name != null) {
                this.clusterName = name;
                this.clusterUuid = uuid;
                this.resolvedAtMillis = System.currentTimeMillis();
            }
        } catch (Exception e) {
            // 403, timeout, older ES versions, malformed body: fall back silently.
            logger.debug("Active cluster-name discovery (GET /) failed; keeping previous value.", e);
        }
    }

    /**
     * Consumes and discards the current value while scanning top-level fields. Scalar values are already consumed by
     * the preceding {@code next()}; nested objects/arrays are skipped in full so the scan stays at the top level.
     */
    private static void skipValue(JsonParser parser, JsonParser.Event valueEvent) {
        if (valueEvent != JsonParser.Event.START_OBJECT && valueEvent != JsonParser.Event.START_ARRAY) {
            return;
        }
        int depth = 1;
        while (depth > 0 && parser.hasNext()) {
            JsonParser.Event event = parser.next();
            if (event == JsonParser.Event.START_OBJECT || event == JsonParser.Event.START_ARRAY) {
                depth++;
            } else if (event == JsonParser.Event.END_OBJECT || event == JsonParser.Event.END_ARRAY) {
                depth--;
            }
        }
    }

    public static class Builder {
        private Duration refreshInterval = DEFAULT_REFRESH_INTERVAL;
        private boolean captureClusterUuid = false;

        /**
         * How often to re-resolve the cluster name via {@code GET /}. A cluster name can change when a node restarts,
         * so refreshing lets the attribute follow a rename without an application restart. Defaults to 30 minutes. A
         * zero or negative duration resolves the name once and never refreshes it.
         */
        public Builder refreshInterval(Duration refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        /**
         * Also capture {@code db.elasticsearch.cluster.uuid} from the same {@code GET /} response. The UUID is a stable
         * unique identifier that survives a cluster rename. Defaults to {@code false}.
         */
        public Builder captureClusterUuid(boolean captureClusterUuid) {
            this.captureClusterUuid = captureClusterUuid;
            return this;
        }

        public ClusterInfoProvider build() {
            return new ClusterInfoProvider(this);
        }
    }
}
