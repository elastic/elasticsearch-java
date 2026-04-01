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

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * Verifies that cancelling an in-flight ES client request closes the underlying HTTP connection.
 */
public class InterruptSyncRequestTest extends Assertions {

    /**
     * Creates an HttpServer whose {@code /_count} handler streams bytes until
     * the client disconnects (causing a write failure) or 30 seconds elapse.
     * If the client disconnects, the resulting {@code IOException} is delivered
     * via {@code serverException}.
     */
    private static HttpServer createSlowServer(
        CountDownLatch requestArrived, CompletableFuture<Exception> serverException
    ) throws Exception {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        httpServer.createContext("/_count", exchange -> {
            try (exchange; OutputStream out = exchange.getResponseBody()) {
                exchange.getResponseHeaders().put("X-Elastic-Product", Collections.singletonList("Elasticsearch"));
                exchange.getResponseHeaders().put("Content-Type", Collections.singletonList("application/json"));
                exchange.sendResponseHeaders(200, 0);

                requestArrived.countDown();

                // Stream data slowly for 30 seconds. Throws IOException on client disconnect.
                for (int i = 0; i < 30_000; i++) {
                    out.write(' ');
                    out.flush();
                    LockSupport.parkNanos(1_000_000L);
                }
            } catch (Exception e) {
                serverException.complete(e);
            } finally {
                serverException.complete(null);
            }
        });

        return httpServer;
    }

    @Test
    @Timeout(10)
    public void syncRequestShouldStopWhenCallingThreadIsInterrupted() throws Exception {
        CountDownLatch requestArrived = new CountDownLatch(1);
        CompletableFuture<Exception> serverException = new CompletableFuture<>();

        HttpServer httpServer = createSlowServer(requestArrived, serverException);
        httpServer.start();
        try {
            ElasticsearchClient client = ElasticsearchTestClient.createClient(httpServer, null);

            Thread clientThread = new Thread(() -> {
                try { client.count(); } catch (Exception e) { }
            });
            clientThread.start();

            assertTrue(requestArrived.await(5, TimeUnit.SECONDS));
            clientThread.interrupt();

            // The server should get an IOException from writing to the closed connection.
            // If the connection leaked, the future completes with null after the handler finishes.
            assertInstanceOf(IOException.class, serverException.join(),
                "HTTP connection should have been closed after thread interruption");
        } finally {
            httpServer.stop(0);
        }
    }

    @Test
    @Timeout(10)
    public void asyncRequestShouldStopWhenFutureIsCancelled() throws Exception {
        CountDownLatch requestArrived = new CountDownLatch(1);
        CompletableFuture<Exception> serverException = new CompletableFuture<>();

        HttpServer httpServer = createSlowServer(requestArrived, serverException);
        httpServer.start();
        try {
            ElasticsearchClient syncClient = ElasticsearchTestClient.createClient(httpServer, null);
            ElasticsearchAsyncClient client = new ElasticsearchAsyncClient(syncClient._transport());

            CompletableFuture<?> future = client.count();

            assertTrue(requestArrived.await(5, TimeUnit.SECONDS));
            future.cancel(true);

            // The server should get an IOException from writing to the closed connection.
            // If the connection leaked, the future completes with null after the handler finishes.
            assertInstanceOf(IOException.class, serverException.join(),
                "HTTP connection should have been closed after future cancellation");
        } finally {
            httpServer.stop(0);
        }
    }
}
