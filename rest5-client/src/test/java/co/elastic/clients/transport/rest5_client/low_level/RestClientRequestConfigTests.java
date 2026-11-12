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
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.util.Timeout;
import org.elasticsearch.mocksocket.MockHttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

/**
 * Tests that the {@link RequestConfig} of {@link RequestOptions} applies to the request, overriding the client's
 * default request config.
 */
public class RestClientRequestConfigTests extends RestClientTestCase {

    // Timeouts are checked by the I/O reactor once per second: the delay must leave some margin
    private static final long RESPONSE_DELAY_MILLIS = 3000;

    private HttpServer httpServer;
    private final CountDownLatch stopping = new CountDownLatch(1);

    @BeforeEach
    public void startHttpServer() throws Exception {
        httpServer = MockHttpServer.createHttp(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        httpServer.createContext("/", exchange -> {
            try {
                stopping.await(RESPONSE_DELAY_MILLIS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
        });
        httpServer.start();
    }

    @AfterEach
    public void stopHttpServer() {
        stopping.countDown();
        httpServer.stop(0);
    }

    @Test
    public void testShorterResponseTimeout() throws Exception {
        try (Rest5Client restClient = newRestClient(Timeout.ofSeconds(30))) {
            Request request = newRequest(Timeout.ofMilliseconds(100));
            assertThrows(SocketTimeoutException.class, () -> restClient.performRequest(request));
        }
    }

    @Test
    public void testShorterResponseTimeoutAsync() throws Exception {
        try (Rest5Client restClient = newRestClient(Timeout.ofSeconds(30))) {
            CompletableFuture<Response> future = new CompletableFuture<>();
            restClient.performRequestAsync(newRequest(Timeout.ofMilliseconds(100)), new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    future.complete(response);
                }

                @Override
                public void onFailure(Exception exception) {
                    future.completeExceptionally(exception);
                }
            });
            ExecutionException e = assertThrows(ExecutionException.class, () -> future.get(10, TimeUnit.SECONDS));
            assertTrue(e.getCause().toString(), e.getCause() instanceof SocketTimeoutException);
        }
    }

    @Test
    public void testLongerResponseTimeout() throws Exception {
        try (Rest5Client restClient = newRestClient(Timeout.ofMilliseconds(100))) {
            Response response = restClient.performRequest(newRequest(Timeout.ofSeconds(30)));
            assertEquals(200, response.getStatusCode());
        }
    }

    private Rest5Client newRestClient(Timeout defaultResponseTimeout) {
        return Rest5Client.builder(new HttpHost("http", httpServer.getAddress().getHostString(),
                httpServer.getAddress().getPort()))
            .setRequestConfigCallback(r -> r.setResponseTimeout(defaultResponseTimeout))
            .build();
    }

    private static Request newRequest(Timeout responseTimeout) {
        Request request = new Request("GET", "/");
        request.setOptions(RequestOptions.DEFAULT.toBuilder()
            .setRequestConfig(RequestConfig.custom().setResponseTimeout(responseTimeout).build()));
        return request;
    }
}
