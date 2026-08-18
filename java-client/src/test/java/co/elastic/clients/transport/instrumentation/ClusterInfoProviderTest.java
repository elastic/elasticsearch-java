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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.TransportTest;
import com.sun.net.httpserver.HttpServer;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link ClusterInfoProvider}: the header-first path, the active {@code GET /} discovery fallback, refresh on
 * a cluster rename, and that no cluster attribute is stamped when the provider is not registered.
 */
public class ClusterInfoProviderTest {

    private static final String INDEX = "test-index";
    private static final String ID_NO_HEADER = "no-header";
    private static final String ID_WITH_HEADER = "with-header";
    private static final String CLOUD_CLUSTER = "cloud-cluster-a";

    private static final AttributeKey<String> CLUSTER_NAME = AttributeKey.stringKey("db.elasticsearch.cluster.name");
    private static final AttributeKey<String> CLUSTER_UUID = AttributeKey.stringKey("db.elasticsearch.cluster.uuid");

    private static final String DOC_RESPONSE = "{\n" +
        "  \"_index\": \"" + INDEX + "\",\n" +
        "  \"_id\": \"1\",\n" +
        "  \"_version\": 1,\n" +
        "  \"found\": true,\n" +
        "  \"_source\": { \"message\": \"hello\" }\n" +
        "}";

    private static String infoJson(String clusterName, String clusterUuid) {
        return "{\n" +
            "  \"name\": \"node-1\",\n" +
            "  \"cluster_name\": \"" + clusterName + "\",\n" +
            "  \"cluster_uuid\": \"" + clusterUuid + "\",\n" +
            "  \"version\": { \"number\": \"8.15.0\" },\n" +
            "  \"tagline\": \"You Know, for Search\"\n" +
            "}";
    }

    private static HttpServer httpServer;
    private static OpenTelemetry openTelemetry;
    private static MockSpanExporter spanExporter;
    private static ElasticsearchTransportBase baseTransport;

    // The body returned by the GET / (info) handler; mutable so a test can simulate a cluster rename.
    private static final AtomicReference<String> infoResponse =
        new AtomicReference<>(infoJson("discovered-cluster", "uuid-abc-123"));

    @BeforeAll
    public static void setup() throws IOException {
        setupOTel();
        setupHttpServer();
        baseTransport = (ElasticsearchTransportBase) ElasticsearchTestClient.createClient(httpServer, null)._transport();
    }

    @AfterAll
    public static void cleanUp() throws IOException {
        httpServer.stop(0);
        baseTransport.close();
    }

    @BeforeEach
    public void reset() {
        spanExporter.reset();
        infoResponse.set(infoJson("discovered-cluster", "uuid-abc-123"));
    }

    private static void setupOTel() {
        spanExporter = new MockSpanExporter();
        SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
            .addSpanProcessor(SimpleSpanProcessor.create(spanExporter))
            .build();
        openTelemetry = OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();
    }

    private static void setupHttpServer() throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        // Info endpoint (GET /) used by the active-discovery fallback.
        httpServer.createContext("/", exchange -> {
            if ("/".equals(exchange.getRequestURI().getPath())) {
                byte[] body = infoResponse.get().getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, body.length);
                try (OutputStream out = exchange.getResponseBody()) {
                    out.write(body);
                }
            } else {
                exchange.sendResponseHeaders(404, -1);
                exchange.close();
            }
        });

        // Data request whose response does NOT carry the cloud header (self-managed shape).
        httpServer.createContext("/" + INDEX + "/_doc/" + ID_NO_HEADER, exchange -> writeDoc(exchange, null));

        // Data request whose response carries the Elastic Cloud proxy header.
        httpServer.createContext("/" + INDEX + "/_doc/" + ID_WITH_HEADER, exchange -> writeDoc(exchange, CLOUD_CLUSTER));

        httpServer.start();
    }

    private static void writeDoc(com.sun.net.httpserver.HttpExchange exchange, String cloudCluster) throws IOException {
        byte[] body = DOC_RESPONSE.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        if (cloudCluster != null) {
            exchange.getResponseHeaders().set("X-Found-Handling-Cluster", cloudCluster);
        }
        exchange.sendResponseHeaders(200, body.length);
        try (OutputStream out = exchange.getResponseBody()) {
            out.write(body);
        }
    }

    private ElasticsearchClient clientWith(SpanAttributeProvider... providers) {
        OpenTelemetryForElasticsearch.Builder builder = OpenTelemetryForElasticsearch.builder(openTelemetry);
        for (SpanAttributeProvider provider : providers) {
            builder.addProvider(provider);
        }
        ElasticsearchTransportBase transport =
            TransportTest.cloneTransportWith(baseTransport, null, null, builder.build());
        return new ElasticsearchClient(transport);
    }

    /**
     * Issues repeated GETs against {@code id} until the cluster-name attribute on the produced span equals
     * {@code expected}, or the timeout elapses. Each GET drives the (asynchronous) discovery forward.
     */
    private boolean awaitClusterName(ElasticsearchClient client, String id, String expected, long timeoutMillis)
        throws Exception {
        long deadline = System.currentTimeMillis() + timeoutMillis;
        while (System.currentTimeMillis() < deadline) {
            spanExporter.reset();
            client.get(r -> r.index(INDEX).id(id), Object.class);
            List<SpanData> spans = spanExporter.getSpans();
            if (!spans.isEmpty() && expected.equals(spans.get(0).getAttributes().get(CLUSTER_NAME))) {
                return true;
            }
            Thread.sleep(100);
        }
        return false;
    }

    @Test
    public void testHeaderShortCircuitsProviderDiscovery() throws Exception {
        // The response carries X-Found-Handling-Cluster, which the core instrumentation stamps. The provider must
        // short-circuit on the header: it neither re-stamps the name nor issues a GET /. UUID capture is enabled and a
        // tiny refresh interval is set; if the provider had run discovery, the UUID would appear — it must not.
        ElasticsearchClient client = clientWith(
            ClusterInfoProvider.builder().captureClusterUuid(true).refreshInterval(Duration.ofMillis(1)).build()
        );

        for (int i = 0; i < 5; i++) {
            spanExporter.reset();
            client.get(r -> r.index(INDEX).id(ID_WITH_HEADER), Object.class);
            Thread.sleep(50);
        }

        SpanData span = spanExporter.getSpans().get(0);
        assertEquals(CLOUD_CLUSTER, span.getAttributes().get(CLUSTER_NAME));
        assertNull(span.getAttributes().get(CLUSTER_UUID),
            "the provider must not run GET / when the header is present, so no UUID is captured");
    }

    @Test
    public void testClusterNameFromActiveDiscovery() throws Exception {
        // No cloud header on the data response, so the name is resolved via a background GET / and appears on a
        // subsequent span. UUID capture is enabled to verify it is read from the same response.
        ElasticsearchClient client = clientWith(
            ClusterInfoProvider.builder().captureClusterUuid(true).build()
        );

        assertTrue(
            awaitClusterName(client, ID_NO_HEADER, "discovered-cluster", 5000),
            "cluster name should be discovered via GET / and stamped on a later span"
        );

        SpanData span = spanExporter.getSpans().get(0);
        assertEquals("discovered-cluster", span.getAttributes().get(CLUSTER_NAME));
        assertEquals("uuid-abc-123", span.getAttributes().get(CLUSTER_UUID));
    }

    @Test
    public void testClusterNameRefreshesOnRename() throws Exception {
        // A tiny refresh interval means every request re-checks, so a rename is picked up without restarting.
        ElasticsearchClient client = clientWith(
            ClusterInfoProvider.builder().refreshInterval(Duration.ofMillis(1)).build()
        );

        assertTrue(awaitClusterName(client, ID_NO_HEADER, "discovered-cluster", 5000),
            "initial cluster name should be discovered");

        // Simulate a cluster rename: GET / now returns a different name.
        infoResponse.set(infoJson("renamed-cluster", "uuid-abc-123"));

        assertTrue(awaitClusterName(client, ID_NO_HEADER, "renamed-cluster", 5000),
            "renamed cluster name should be picked up after the refresh interval, without an application restart");
    }

    @Test
    public void testCloudHeaderCapturedWithoutProvider() throws IOException {
        // The Elastic Cloud cluster-name header is captured automatically by the core instrumentation, with no
        // provider registered and no configuration — matching the .NET client.
        ElasticsearchTransportBase transport = TransportTest.cloneTransportWith(
            baseTransport, null, null, new OpenTelemetryForElasticsearch(openTelemetry, false));
        ElasticsearchClient client = new ElasticsearchClient(transport);

        client.get(r -> r.index(INDEX).id(ID_WITH_HEADER), Object.class);

        assertEquals(1, spanExporter.getSpans().size());
        assertEquals(CLOUD_CLUSTER, spanExporter.getSpans().get(0).getAttributes().get(CLUSTER_NAME));
    }

    @Test
    public void testActiveDiscoveryWithJacksonMapper() throws Exception {
        // Regression: the default Jackson-backed JsonpMapper does not implement the object-model reader
        // (createReader throws UnsupportedOperationException) — only the streaming parser. Active discovery must
        // therefore parse GET / with the streaming parser so it works under Jackson, which is what real apps use.
        // (The other tests use the JSON-B mapper, whose createReader works, so they didn't catch this.)
        ElasticsearchTransportBase jacksonTransport = (ElasticsearchTransportBase)
            ElasticsearchTestClient.createClient(httpServer, new JacksonJsonpMapper())._transport();
        try {
            OpenTelemetryForElasticsearch.Builder builder = OpenTelemetryForElasticsearch.builder(openTelemetry);
            builder.addProvider(ClusterInfoProvider.builder().captureClusterUuid(true).build());
            ElasticsearchTransportBase transport =
                TransportTest.cloneTransportWith(jacksonTransport, null, null, builder.build());
            ElasticsearchClient client = new ElasticsearchClient(transport);

            assertTrue(
                awaitClusterName(client, ID_NO_HEADER, "discovered-cluster", 5000),
                "cluster name must be discovered via GET / even with the Jackson JsonpMapper"
            );
            assertEquals("uuid-abc-123", spanExporter.getSpans().get(0).getAttributes().get(CLUSTER_UUID));
        } finally {
            jacksonTransport.close();
        }
    }

    @Test
    public void testNoActiveDiscoveryWithoutProvider() throws IOException {
        // Without a provider there is no GET / fallback: a self-managed response (no cloud header) yields no cluster
        // attribute. Active discovery is strictly opt-in.
        ElasticsearchTransportBase transport = TransportTest.cloneTransportWith(
            baseTransport, null, null, new OpenTelemetryForElasticsearch(openTelemetry, false));
        ElasticsearchClient client = new ElasticsearchClient(transport);

        client.get(r -> r.index(INDEX).id(ID_NO_HEADER), Object.class);

        assertEquals(1, spanExporter.getSpans().size());
        assertNull(spanExporter.getSpans().get(0).getAttributes().get(CLUSTER_NAME));
    }

    private static class MockSpanExporter implements SpanExporter {
        private final List<SpanData> spans = new ArrayList<>();

        @Override
        public synchronized CompletableResultCode export(Collection<SpanData> spans) {
            this.spans.addAll(spans);
            return CompletableResultCode.ofSuccess();
        }

        @Override
        public CompletableResultCode flush() {
            return CompletableResultCode.ofSuccess();
        }

        @Override
        public CompletableResultCode shutdown() {
            reset();
            return CompletableResultCode.ofSuccess();
        }

        public synchronized List<SpanData> getSpans() {
            return new ArrayList<>(spans);
        }

        public synchronized void reset() {
            spans.clear();
        }
    }
}
