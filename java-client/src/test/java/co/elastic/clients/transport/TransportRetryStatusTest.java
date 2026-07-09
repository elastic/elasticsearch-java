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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Verifies status-based retries through the <em>real</em> http clients. Both low-level clients surface
 * retryable statuses as {@code ResponseException} rather than as a plain response (the rest5 client for 5xx,
 * the legacy client for every non-ignored error status), so these tests ensure the retry classification
 * extracts status codes from those exceptions instead of matching them as generic {@link IOException}s.
 * Exception-based retries are deliberately narrowed or disabled in these tests: they must not be the reason
 * a request is retried.
 */
public class TransportRetryStatusTest extends Assertions {

    private HttpServer server;
    private final AtomicInteger hits = new AtomicInteger();

    @BeforeEach
    public void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        server.start();
    }

    @AfterEach
    public void tearDown() {
        server.stop(0);
    }

    // Responds to ping (HEAD /) with the scripted statuses, then 200 for any further request.
    private String scriptedPingServer(int... statuses) {
        server.createContext("/", exchange -> {
            int i = hits.getAndIncrement();
            int status = i < statuses.length ? statuses[i] : 200;
            if (status == 200) {
                exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            }
            exchange.sendResponseHeaders(status, -1);
            exchange.close();
        });
        var address = server.getAddress();
        return "http://" + address.getHostString() + ":" + address.getPort();
    }

    private ElasticsearchClient client(
        String url,
        Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory,
        RetryConfig retryConfig
    ) {
        return ElasticsearchClient.of(b -> b
            .host(url)
            .transportFactory(transportFactory)
            .retryConfig(retryConfig)
        );
    }

    @Test
    public void rest5RetriesOn5xxStatusWithNarrowedExceptions() throws IOException {
        // The rest5 client reports a 503 as a ResponseException. With exception retries narrowed to
        // SocketException, only the status route can trigger the retries.
        String url = scriptedPingServer(503, 503);

        RetryConfig config = RetryConfig.of(r -> r
            .backoffPolicy(BackoffPolicy.constantBackoff(1L, 5))
            .retryableStatuses(503)
            .retryableExceptions(SocketException.class));

        try (ElasticsearchClient client = client(url, Rest5ClientTransport::new, config)) {
            assertTrue(client.ping().value());
        }
        assertEquals(3, hits.get());
    }

    @Test
    public void rest5DoesNotRetryStatusesOutsideTheConfiguredSet() throws IOException {
        // A 501 also surfaces as a ResponseException (an IOException). It must be classified by its status
        // code - not in the default retryable set - and not retried as a generic IOException.
        String url = scriptedPingServer(501);

        RetryConfig config = RetryConfig.of(r -> r.backoffPolicy(BackoffPolicy.constantBackoff(1L, 5)));

        try (ElasticsearchClient client = client(url, Rest5ClientTransport::new, config)) {
            assertThrows(IOException.class, () -> client.ping());
        }
        assertEquals(1, hits.get());
    }

    @Test
    public void legacyRetriesOnStatusWithExceptionRetriesDisabled() throws IOException {
        // The legacy client reports every non-ignored error status (429 included) as a ResponseException,
        // which is accessed reflectively. Exception-based retries are fully disabled here: only the status
        // route can trigger the retries.
        String url = scriptedPingServer(429, 429);

        RetryConfig config = RetryConfig.of(r -> r
            .backoffPolicy(BackoffPolicy.constantBackoff(1L, 5))
            .retryableStatuses(429)
            .retryableExceptions(Set.of()));

        try (ElasticsearchClient client = client(url, RestClientTransport::new, config)) {
            assertTrue(client.ping().value());
        }
        assertEquals(3, hits.get());
    }
}
