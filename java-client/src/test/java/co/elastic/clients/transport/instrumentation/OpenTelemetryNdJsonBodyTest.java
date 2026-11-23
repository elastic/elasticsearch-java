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
import co.elastic.clients.elasticsearch.core.MsearchRequest;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.TransportTest;
import com.sun.net.httpserver.HttpServer;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.semconv.DbAttributes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Capturing the body of concurrent NDJSON requests must not alter the bodies that are sent.
 */
public class OpenTelemetryNdJsonBodyTest {

    private static final int SEARCHES = 50;

    private static final String MSEARCH_RESPONSE = "{\"took\":1,\"responses\":[" +
        String.join(",", Collections.nCopies(SEARCHES,
            "{\"took\":1,\"timed_out\":false,\"_shards\":{\"total\":1,\"successful\":1,\"skipped\":0,\"failed\":0}," +
            "\"hits\":{\"hits\":[]},\"status\":200}"
        )) +
        "]}";

    private HttpServer httpServer;
    private ExecutorService serverExecutor;
    private final AtomicInteger validBodies = new AtomicInteger();
    private final List<String> invalidBodies = new ArrayList<>();

    @BeforeEach
    public void setup() throws Exception {
        serverExecutor = Executors.newFixedThreadPool(16);
        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        httpServer.setExecutor(serverExecutor);
        httpServer.createContext("/_msearch", exchange -> {
            String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            // Each search is a header line and a body line, each line terminated by a newline
            if (body.endsWith("\n") && body.split("\n", -1).length == 2 * SEARCHES + 1) {
                validBodies.incrementAndGet();
            } else {
                synchronized (invalidBodies) {
                    invalidBodies.add(body);
                }
            }
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write(MSEARCH_RESPONSE.getBytes(StandardCharsets.UTF_8));
            exchange.close();
        });
        httpServer.start();
    }

    @AfterEach
    public void cleanUp() throws Exception {
        httpServer.stop(0);
        serverExecutor.shutdownNow();
        // The separator is shared by all transports: restore it so that a failure doesn't affect other tests
        Field field = ElasticsearchTransportBase.class.getDeclaredField("NdJsonSeparator");
        field.setAccessible(true);
        ((ByteBuffer) field.get(null)).clear();
    }

    @Test
    public void testConcurrentMsearchWithBodyCapture() throws Exception {
        AtomicInteger capturedBodies = new AtomicInteger();
        SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
            .addSpanProcessor(new SpanProcessor() {
                @Override
                public void onStart(Context parentContext,
                                    ReadWriteSpan span) {
                }

                @Override
                public boolean isStartRequired() {
                    return false;
                }

                @Override
                public void onEnd(ReadableSpan span) {
                    if (span.getAttribute(DbAttributes.DB_QUERY_TEXT) != null) {
                        capturedBodies.incrementAndGet();
                    }
                }

                @Override
                public boolean isEndRequired() {
                    return true;
                }
            })
            .build();
        OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();

        var transport = (ElasticsearchTransportBase) ElasticsearchTestClient.createClient(httpServer, null)._transport();
        transport = TransportTest.cloneTransportWith(transport, null, null,
            new OpenTelemetryForElasticsearch(openTelemetry, true));

        try (ElasticsearchClient client = new ElasticsearchClient(transport)) {
            MsearchRequest.Builder builder = new MsearchRequest.Builder();
            for (int i = 0; i < SEARCHES; i++) {
                String value = "value-" + i;
                builder.searches(s -> s
                    .header(h -> h.index("foo"))
                    .body(b -> b.query(q -> q.term(t -> t.field("x").value(value))))
                );
            }
            MsearchRequest request = builder.build();

            int threads = 16;
            int requestsPerThread = 200;
            ExecutorService executor = Executors.newFixedThreadPool(threads);
            try {
                List<Future<?>> futures = new ArrayList<>();
                for (int i = 0; i < threads; i++) {
                    futures.add(executor.submit(() -> {
                        for (int j = 0; j < requestsPerThread; j++) {
                            client.msearch(request, Object.class);
                        }
                        return null;
                    }));
                }
                for (Future<?> future : futures) {
                    future.get();
                }
            } finally {
                executor.shutdownNow();
            }

            int total = threads * requestsPerThread;
            Assertions.assertTrue(capturedBodies.get() > 0, "No request body was captured");
            Assertions.assertTrue(invalidBodies.isEmpty(), () -> invalidBodies.size() + "/" + total +
                " bodies with missing newlines, first one: " + invalidBodies.get(0).replace("\n", "\\n"));
            Assertions.assertEquals(total, validBodies.get());
        } finally {
            tracerProvider.close();
        }
    }
}
