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

package co.elastic.clients.transport.rest5_client.low_level;

import com.sun.net.httpserver.HttpServer;
import org.apache.hc.core5.http.HttpHost;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verifies that {@link Rest5Client#performRequest(Request)} cancels the underlying HTTP request
 * when the calling thread is interrupted.
 */
public class RestClientInterruptTests {

    private HttpServer httpServer;
    private Rest5Client restClient;
    private CountDownLatch requestArrived;
    private CompletableFuture<Exception> serverException;

    @BeforeEach
    public void setUp() throws Exception {
        requestArrived = new CountDownLatch(1);
        serverException = new CompletableFuture<>();

        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        httpServer.createContext("/slow", exchange -> {
            try (exchange; OutputStream out = exchange.getResponseBody()) {
                exchange.sendResponseHeaders(200, 0);
                requestArrived.countDown();

                // Stream data slowly for 30 seconds. Throws IOException on client disconnect.
                for (int i = 0; i < 30_000; i++) {
                    out.write(' ');
                    out.flush();
                    LockSupport.parkNanos(1_000_000L);
                }
            } catch (IOException e) {
                serverException.complete(e);
            } finally {
                serverException.complete(null);
            }
        });
        httpServer.start();

        InetSocketAddress address = httpServer.getAddress();
        HttpHost host = new HttpHost("http", address.getHostName(), address.getPort());
        restClient = Rest5Client.builder(host).build();
    }

    @AfterEach
    public void tearDown() throws Exception {
        restClient.close();
        httpServer.stop(0);
    }

    @Test
    @Timeout(10)
    public void syncRequestShouldCancelOnThreadInterruption() throws Exception {
        Thread clientThread = new Thread(() -> {
            try { restClient.performRequest(new Request("GET", "/slow")); } catch (Exception e) { }
        });
        clientThread.start();

        assertTrue(requestArrived.await(5, TimeUnit.SECONDS));
        clientThread.interrupt();

        // The server should get an IOException from writing to the closed connection.
        assertInstanceOf(IOException.class, serverException.join(),
            "HTTP connection should have been closed after thread interruption");
    }

    @Test
    @Timeout(10)
    public void asyncRequestShouldCancelOnFutureCancellation() throws Exception {
        CompletableFuture<Response> responseFuture = new CompletableFuture<>();
        Cancellable cancellable = restClient.performRequestAsync(new Request("GET", "/slow"), new ResponseListener() {
            @Override
            public void onSuccess(Response response) {
                responseFuture.complete(response);
            }

            @Override
            public void onFailure(Exception exception) {
                responseFuture.completeExceptionally(exception);
            }
        });

        assertTrue(requestArrived.await(5, TimeUnit.SECONDS));
        cancellable.cancel();

        assertInstanceOf(IOException.class, serverException.join(),
            "HTTP connection should have been closed after future cancellation");
    }
}
