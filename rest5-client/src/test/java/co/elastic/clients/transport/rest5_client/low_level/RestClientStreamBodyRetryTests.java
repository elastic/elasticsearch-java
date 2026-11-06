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

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.InputStreamEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.nio.AsyncRequestProducer;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.elasticsearch.mocksocket.MockHttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests that {@link Rest5Client} does not retry requests when the body is a non-repeatable
 * entity (e.g. backed by an InputStream), since the stream is consumed on the first attempt
 * and cannot be re-read.
 */
public class RestClientStreamBodyRetryTests extends RestClientTestCase {

    private final ExecutorService exec = Executors.newFixedThreadPool(1);

    @AfterEach
    public void shutdownExec() {
        exec.shutdown();
    }

    /**
     * A retryable status code (502/503/504) must not cause a stream body to be sent again.
     */
    @Test
    public void testNoRetryWithStreamBodyOnRetryableStatusCode() throws Exception {
        AtomicInteger requestCount = new AtomicInteger(0);
        CloseableHttpAsyncClient httpClient = mockHttpClientWithCounter(exec, requestCount, 503);
        Rest5Client restClient = newRestClient(httpClient);

        ResponseException e = assertThrows(ResponseException.class, () -> restClient.performRequest(newStreamBodyRequest()));

        assertEquals(503, e.getResponse().getStatusCode());
        assertEquals(1, requestCount.get());
    }

    /**
     * A retryable IOException must not cause a stream body to be sent again.
     */
    @Test
    public void testNoRetryWithStreamBodyOnIOException() throws Exception {
        AtomicInteger requestCount = new AtomicInteger(0);
        CloseableHttpAsyncClient httpClient = mockHttpClientThatThrows(exec, requestCount);
        Rest5Client restClient = newRestClient(httpClient);

        assertThrows(IOException.class, () -> restClient.performRequest(newStreamBodyRequest()));

        assertEquals(1, requestCount.get());
    }

    /**
     * Requests with a repeatable entity are still retried on all nodes.
     */
    @Test
    public void testRetryStillWorksWithRepeatableEntity() throws Exception {
        AtomicInteger requestCount = new AtomicInteger(0);
        CloseableHttpAsyncClient httpClient = mockHttpClientWithCounter(exec, requestCount, 503);
        Rest5Client restClient = newRestClient(httpClient);

        Request request = new Request("POST", "/hello");
        request.setJsonEntity("{\"hello\":\"world\"}");

        ResponseException e = assertThrows(ResponseException.class, () -> restClient.performRequest(request));

        assertEquals(503, e.getResponse().getStatusCode());
        assertEquals(3, requestCount.get());
    }

    /**
     * Same as {@link #testNoRetryWithStreamBodyOnRetryableStatusCode()} for the asynchronous API.
     */
    @Test
    public void testNoRetryWithStreamBodyOnRetryableStatusCodeAsync() throws Exception {
        AtomicInteger requestCount = new AtomicInteger(0);
        CloseableHttpAsyncClient httpClient = mockHttpClientWithCounter(exec, requestCount, 503);

        Exception failure = performAsyncAndGetFailure(newRestClient(httpClient), newStreamBodyRequest());

        assertTrue(failure instanceof ResponseException);
        assertEquals(503, ((ResponseException) failure).getResponse().getStatusCode());
        assertEquals(1, requestCount.get());
    }

    /**
     * Same as {@link #testNoRetryWithStreamBodyOnIOException()} for the asynchronous API.
     */
    @Test
    public void testNoRetryWithStreamBodyOnIOExceptionAsync() throws Exception {
        AtomicInteger requestCount = new AtomicInteger(0);
        CloseableHttpAsyncClient httpClient = mockHttpClientThatThrows(exec, requestCount);

        Exception failure = performAsyncAndGetFailure(newRestClient(httpClient), newStreamBodyRequest());

        assertTrue(failure instanceof IOException);
        assertEquals(1, requestCount.get());
    }

    /**
     * Against real http servers: the first node answers 503, and the stream must not be sent to the second
     * one, as it would receive an empty body.
     */
    @Test
    public void testStreamBodyIsNotResentToNextNode() throws Exception {
        List<String> receivedBodies = Collections.synchronizedList(new ArrayList<>());
        HttpHandler handler = exchange -> {
            receivedBodies.add(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            exchange.sendResponseHeaders(receivedBodies.size() == 1 ? 503 : 200, -1);
            exchange.close();
        };
        HttpServer first = MockHttpServer.createHttp(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        HttpServer second = MockHttpServer.createHttp(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        first.createContext("/", handler);
        second.createContext("/", handler);
        first.start();
        second.start();

        String body = "{\"hello\":\"world\"}";
        Request request = new Request("POST", "/hello");
        request.setEntity(new InputStreamEntity(
            new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)), ContentType.APPLICATION_JSON
        ));

        try (Rest5Client restClient = Rest5Client.builder(
            new HttpHost(first.getAddress().getHostString(), first.getAddress().getPort()),
            new HttpHost(second.getAddress().getHostString(), second.getAddress().getPort())
        ).build()) {
            restClient.performRequest(request);
        } catch (ResponseException e) {
            assertEquals(503, e.getResponse().getStatusCode());
        } finally {
            first.stop(0);
            second.stop(0);
        }

        assertEquals(List.of(body), receivedBodies);
    }

    private static Rest5Client newRestClient(CloseableHttpAsyncClient httpClient) {
        List<Node> nodes = asList(
            new Node(new HttpHost("localhost", 9200)),
            new Node(new HttpHost("localhost", 9201)),
            new Node(new HttpHost("localhost", 9202))
        );
        return new Rest5Client(
            httpClient,
            new Header[0],
            nodes,
            null,
            new HostsTrackingFailureListener(),
            NodeSelector.ANY,
            false,
            false,
            false
        );
    }

    private static Request newStreamBodyRequest() {
        byte[] body = "{\"hello\":\"world\"}".getBytes(StandardCharsets.UTF_8);
        Request request = new Request("POST", "/hello");
        request.setEntity(new InputStreamEntity(
            new ByteArrayInputStream(body), body.length, ContentType.APPLICATION_JSON
        ));
        return request;
    }

    private static Exception performAsyncAndGetFailure(Rest5Client restClient, Request request) throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        AtomicReference<Exception> failure = new AtomicReference<>();
        restClient.performRequestAsync(request, new ResponseListener() {
            @Override
            public void onSuccess(Response response) {
                latch.countDown();
            }

            @Override
            public void onFailure(Exception exception) {
                failure.set(exception);
                latch.countDown();
            }
        });
        assertTrue(latch.await(30, TimeUnit.SECONDS));
        assertNotNull(failure.get());
        return failure.get();
    }

    @SuppressWarnings("unchecked")
    private static CloseableHttpAsyncClient mockHttpClientWithCounter(
        ExecutorService exec, AtomicInteger requestCount, int statusCode
    ) {
        CloseableHttpAsyncClient httpClient = mock(CloseableHttpAsyncClient.class);
        when(
            httpClient.<HttpResponse>execute(
                any(AsyncRequestProducer.class),
                any(AsyncResponseConsumer.class),
                any(HttpClientContext.class),
                nullable(FutureCallback.class)
            )
        ).thenAnswer((Answer<Future<HttpResponse>>) invocationOnMock -> {
            final FutureCallback<HttpResponse> futureCallback =
                (FutureCallback<HttpResponse>) invocationOnMock.getArguments()[3];
            return exec.submit(() -> {
                requestCount.incrementAndGet();
                BasicClassicHttpResponse response = new BasicClassicHttpResponse(statusCode, "");
                if (futureCallback != null) {
                    futureCallback.completed(response);
                    return null;
                }
                return (HttpResponse) response;
            });
        });
        return httpClient;
    }

    @SuppressWarnings("unchecked")
    private static CloseableHttpAsyncClient mockHttpClientThatThrows(
        ExecutorService exec, AtomicInteger requestCount
    ) {
        CloseableHttpAsyncClient httpClient = mock(CloseableHttpAsyncClient.class);
        when(
            httpClient.<HttpResponse>execute(
                any(AsyncRequestProducer.class),
                any(AsyncResponseConsumer.class),
                any(HttpClientContext.class),
                nullable(FutureCallback.class)
            )
        ).thenAnswer((Answer<Future<HttpResponse>>) invocationOnMock -> {
            final FutureCallback<HttpResponse> futureCallback =
                (FutureCallback<HttpResponse>) invocationOnMock.getArguments()[3];
            return exec.submit(() -> {
                requestCount.incrementAndGet();
                IOException exception = new IOException("Connection failed");
                if (futureCallback != null) {
                    futureCallback.failed(exception);
                    return null;
                }
                throw exception;
            });
        });
        return httpClient;
    }
}
