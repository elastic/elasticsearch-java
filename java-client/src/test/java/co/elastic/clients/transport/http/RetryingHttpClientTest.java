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

import co.elastic.clients.transport.BackoffPolicy;
import co.elastic.clients.transport.DefaultTransportOptions;
import co.elastic.clients.transport.RetryConfig;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.BinaryData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

class RetryingHttpClientTest extends Assertions {

    private ScheduledExecutorService scheduler;

    @BeforeEach
    void setUp() {
        scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "retry-test-scheduler");
            t.setDaemon(true);
            return t;
        });
    }

    @AfterEach
    void tearDown() {
        scheduler.shutdownNow();
    }

    private static final TransportHttpClient.Request REQ = new TransportHttpClient.Request(
        "GET", "/", Collections.emptyMap(), Collections.emptyMap(), null
    );

    private RetryingHttpClient wrap(TransportHttpClient delegate) {
        return new RetryingHttpClient(delegate, scheduler);
    }

    // The retry configuration is now read from each request's TransportOptions, so tests inject it there.
    private static TransportOptions opts(RetryConfig config) {
        return new DefaultTransportOptions.Builder().retryConfig(config).build();
    }

    private static TransportOptions opts(BackoffPolicy policy) {
        return opts(RetryConfig.of(r -> r.backoffPolicy(policy)));
    }

    private static BackoffPolicy fixed(long ms, int retries) {
        return BackoffPolicy.constantBackoff(ms, retries);
    }

    // A mock transport instance that returns the next scripted outcome on each call.
    static class MockedClient implements TransportHttpClient {
        final List<Function<Boolean, ?>> script = new ArrayList<>();
        final AtomicInteger calls = new AtomicInteger();

        // Add a response outcome.
        MockedClient andRespond(int statusCode) {
            script.add(b -> new FakeResponse(statusCode, Collections.emptyMap()));
            return this;
        }

        MockedClient andThrow(Throwable t) {
            script.add(b -> { throw new FakeException(t); });
            return this;
        }

        @Override
        public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                       TransportOptions options) throws IOException {
            int i = calls.getAndIncrement();
            Function<Boolean, ?> step = script.get(Math.min(i, script.size() - 1));
            try {
                Object out = step.apply(true);
                return (Response) out;
            } catch (FakeException se) {
                if (se.cause instanceof IOException) throw (IOException) se.cause;
                if (se.cause instanceof RuntimeException) throw (RuntimeException) se.cause;
                throw new RuntimeException(se.cause);
            }
        }

        @Override
        public CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node, Request request,
                                                               TransportOptions options) {
            int i = calls.getAndIncrement();
            Function<Boolean, ?> step = script.get(Math.min(i, script.size() - 1));
            CompletableFuture<Response> f = new CompletableFuture<>();
            try {
                Object out = step.apply(true);
                f.complete((Response) out);
            } catch (FakeException se) {
                f.completeExceptionally(se.cause);
            }
            return f;
        }

        @Override
        public void close() {}
    }

    static final class FakeException extends RuntimeException {
        final Throwable cause;
        FakeException(Throwable c) { this.cause = c; }
    }

    static final class FakeResponse implements TransportHttpClient.Response {
        private final int status;
        private final java.util.Map<String, String> headers;
        boolean closed;

        FakeResponse(int status, java.util.Map<String, String> headers) {
            this.status = status;
            this.headers = headers;
        }
        @Override public TransportHttpClient.Node node() { return new TransportHttpClient.Node("http://localhost/"); }
        @Override public int statusCode() { return status; }
        @Override public String header(String name) { return headers.get(name); }
        @Override public List<String> headers(String name) {
            String v = headers.get(name);
            return v == null ? Collections.emptyList() : Collections.singletonList(v);
        }
        @Override public BinaryData body() { return null; }
        @Override public Object originalResponse() { return this; }
        @Override public void close() { closed = true; }
    }

    @Test
    void syncRetriesOn5xxThenSucceeds() throws IOException {
        MockedClient client = new MockedClient()
            .andRespond(503).andRespond(502).andRespond(500).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 5)));

        assertEquals(200, resp.statusCode());
        assertEquals(4, client.calls.get());
    }

    @Test
    void syncRetriesOn429() throws IOException {
        MockedClient client = new MockedClient().andRespond(429).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 3)));

        assertEquals(200, resp.statusCode());
        assertEquals(2, client.calls.get());
    }

    @Test
    void syncDoesNotRetryOn501() throws IOException {
        MockedClient client = new MockedClient().andRespond(501).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 3)));

        assertEquals(501, resp.statusCode());
        assertEquals(1, client.calls.get());
    }

    @Test
    void customRetryableStatusesOnly() throws IOException {
        // Configure to retry only on 418 - a 503 should pass through
        RetryConfig cfg = RetryConfig.of(r -> r
            .backoffPolicy(fixed(1L, 3))
            .retryableStatuses(418));

        MockedClient client = new MockedClient().andRespond(503).andRespond(200);
        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(cfg));

        assertEquals(503, resp.statusCode());
        assertEquals(1, client.calls.get());
    }

    @Test
    void customRetryableStatusesIncludingNonStandard() throws IOException {
        // Configure to retry on 408 (Request Timeout) - not in the default set
        RetryConfig cfg = RetryConfig.of(r -> r
            .backoffPolicy(fixed(1L, 3))
            .retryableStatuses(408, 503));

        MockedClient client = new MockedClient().andRespond(408).andRespond(200);
        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(cfg));

        assertEquals(200, resp.statusCode());
        assertEquals(2, client.calls.get());
    }

    @Test
    void customRetryableExceptionsOnly() throws IOException {
        // Narrow exception retries to SocketTimeoutException - a plain SocketException must not retry
        RetryConfig cfg = RetryConfig.of(r -> r
            .backoffPolicy(fixed(1L, 3))
            .retryableExceptions(java.net.SocketTimeoutException.class));

        MockedClient client = new MockedClient().andThrow(new SocketException("not a timeout")).andRespond(200);
        IOException thrown = assertThrows(IOException.class,
            () -> wrap(client).performRequest("ep", null, REQ, opts(cfg)));
        assertEquals("not a timeout", thrown.getMessage());
        assertEquals(1, client.calls.get());
    }

    @Test
    void emptyRetryableStatusesDisablesStatusRetries() throws IOException {
        // Exception-based retries only - a 503 response should NOT trigger a retry
        RetryConfig cfg = RetryConfig.of(r -> r
            .backoffPolicy(fixed(1L, 3))
            .retryableStatuses(new HashSet<>()));

        MockedClient client = new MockedClient().andRespond(503).andRespond(200);
        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(cfg));

        assertEquals(503, resp.statusCode());
        assertEquals(1, client.calls.get());
    }

    @Test
    void emptyRetryableExceptionsDisablesExceptionRetries() {
        // Status-based retries only - a SocketException should NOT trigger a retry
        RetryConfig cfg = RetryConfig.of(r -> r
            .backoffPolicy(fixed(1L, 3))
            .retryableExceptions(new HashSet<>()));

        MockedClient client = new MockedClient().andThrow(new SocketException("io")).andRespond(200);
        assertThrows(IOException.class, () -> wrap(client).performRequest("ep", null, REQ, opts(cfg)));
        assertEquals(1, client.calls.get());
    }

    @Test
    void retryConfigDefensivelyCopiesStatusSet() {
        HashSet<Integer> mutable = new HashSet<>();
        mutable.add(429);
        mutable.add(503);
        RetryConfig cfg = RetryConfig.of(r -> r.retryableStatuses(mutable));

        // Mutating the original set after building must not affect the config.
        mutable.add(418);
        assertFalse(cfg.retryableStatuses().contains(418));

        // The returned set itself must be immutable.
        assertThrows(UnsupportedOperationException.class,
            () -> cfg.retryableStatuses().add(999));
    }

    @Test
    void syncDoesNotRetryOn4xx() throws IOException {
        MockedClient client = new MockedClient().andRespond(404).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 3)));

        assertEquals(404, resp.statusCode());
        assertEquals(1, client.calls.get());
    }

    @Test
    void syncRetriesOnIOExceptionButNotOnRuntimeException() {
        MockedClient client1 = new MockedClient()
            .andThrow(new SocketException("boom")).andRespond(200);
        try {
            TransportHttpClient.Response r = wrap(client1).performRequest("ep", null, REQ, opts(fixed(1L, 3)));
            assertEquals(200, r.statusCode());
            assertEquals(2, client1.calls.get());
        } catch (IOException e) {
            fail("did not expect exception", e);
        }

        MockedClient client2 = new MockedClient()
            .andThrow(new IllegalStateException("bad")).andRespond(200);
        assertThrows(IllegalStateException.class,
            () -> wrap(client2).performRequest("ep", null, REQ, opts(fixed(1L, 3))));
        assertEquals(1, client2.calls.get());
    }

    @Test
    void syncReturnsLastResponseWhenRetriesExhausted() throws IOException {
        MockedClient client = new MockedClient()
            .andRespond(503).andRespond(503).andRespond(503);

        TransportHttpClient.Response resp = wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 2)));

        assertEquals(503, resp.statusCode());
        assertEquals(3, client.calls.get());
    }

    @Test
    void syncThrowsLastIOExceptionWhenRetriesExhausted() {
        MockedClient client = new MockedClient()
            .andThrow(new SocketException("first"))
            .andThrow(new SocketException("second"))
            .andThrow(new SocketException("third"));

        IOException e = assertThrows(IOException.class,
            () -> wrap(client).performRequest("ep", null, REQ, opts(fixed(1L, 2))));
        assertEquals("third", e.getMessage());
        assertEquals(3, client.calls.get());
    }

    @Test
    void asyncRetriesOn5xxThenSucceeds() throws Exception {
        MockedClient client = new MockedClient()
            .andRespond(503).andRespond(502).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequestAsync("ep", null, REQ, opts(fixed(1L, 5)))
            .get(5, TimeUnit.SECONDS);

        assertEquals(200, resp.statusCode());
        assertEquals(3, client.calls.get());
    }

    @Test
    void asyncRetriesOnIOExceptionThenSucceeds() throws Exception {
        MockedClient client = new MockedClient()
            .andThrow(new SocketException("nope")).andRespond(200);

        TransportHttpClient.Response resp = wrap(client).performRequestAsync("ep", null, REQ, opts(fixed(1L, 3)))
            .get(5, TimeUnit.SECONDS);

        assertEquals(200, resp.statusCode());
        assertEquals(2, client.calls.get());
    }

    @Test
    void asyncDoesNotRetryOnRuntimeException() {
        MockedClient client = new MockedClient()
            .andThrow(new IllegalArgumentException("nope")).andRespond(200);

        CompletableFuture<TransportHttpClient.Response> f =
            wrap(client).performRequestAsync("ep", null, REQ, opts(fixed(1L, 3)));
        CompletionException ex = assertThrows(CompletionException.class, f::join);
        assertTrue(ex.getCause() instanceof IllegalArgumentException);
        assertEquals(1, client.calls.get());
    }

    @Test
    void asyncReturnsLastResponseWhenRetriesExhausted() throws Exception {
        MockedClient client = new MockedClient()
            .andRespond(503).andRespond(503).andRespond(503);

        TransportHttpClient.Response resp = wrap(client).performRequestAsync("ep", null, REQ, opts(fixed(1L, 2)))
            .get(5, TimeUnit.SECONDS);

        assertEquals(503, resp.statusCode());
        assertEquals(3, client.calls.get());
    }

    @Test
    void disabledRetryConfigForwardsToDelegate() throws IOException {
        // A disabled RetryConfig must not retry: a 503 is returned as-is on the first attempt.
        MockedClient client = new MockedClient().andRespond(503).andRespond(200);

        TransportHttpClient.Response resp = wrap(client)
            .performRequest("ep", null, REQ, opts(RetryConfig.disabled()));

        assertEquals(503, resp.statusCode());
        assertEquals(1, client.calls.get());
    }

    /**
     * Verifies that cancelling the result future stops pending retries: with a long backoff (1 hour),
     * after we cancel during the first delay, the delegate must not be called again.
     */
    @Test
    void asyncCancellationStopsPendingRetries() throws Exception {
        CountDownLatch firstCallReturned = new CountDownLatch(1);
        AtomicInteger calls = new AtomicInteger();
        TransportHttpClient delegate = new TransportHttpClient() {
            @Override
            public Response performRequest(String endpointId, @Nullable Node node, Request request, TransportOptions options) {
                throw new UnsupportedOperationException();
            }

            @Override
            public CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node,
                                                                   Request request, TransportOptions options) {
                calls.incrementAndGet();
                CompletableFuture<Response> f = new CompletableFuture<>();
                f.complete(new FakeResponse(503, Collections.emptyMap()));
                firstCallReturned.countDown();
                return f;
            }

            @Override public void close() {}
        };

        RetryingHttpClient retry = wrap(delegate);

        // 1h delay so the retry stays pending until we cancel
        CompletableFuture<TransportHttpClient.Response> result = retry.performRequestAsync(
            "ep", null, REQ, opts(BackoffPolicy.constantBackoff(3_600_000L, 5)));

        // Wait for the first attempt to complete (we know it returned 503, so a retry is scheduled)
        assertTrue(firstCallReturned.await(5, TimeUnit.SECONDS));

        // Give the whenComplete handler a moment to schedule the retry
        Thread.sleep(50);

        result.cancel(true);

        // The cancellation should be observable
        assertThrows(CancellationException.class, () -> result.get(1, TimeUnit.SECONDS));

        // No further calls should happen
        Thread.sleep(100);
        assertEquals(1, calls.get(), "delegate should not be called again after cancellation");
    }

    // ---------- retryability classifiers ----------

    @Test
    void exceptionClassifierUsesConfiguredTypes() {
        RetryingHttpClient client = wrap(new MockedClient());

        // Default behaviour: any IOException (and its subclasses) is retryable
        RetryConfig defaultCfg = RetryConfig.of(r -> r.backoffPolicy(fixed(1L, 1)));
        assertTrue(client.isRetryableException(defaultCfg, new SocketException("io")));
        assertTrue(client.isRetryableException(defaultCfg, new RuntimeException(new IOException("wrapped"))));
        assertFalse(client.isRetryableException(defaultCfg, new IllegalArgumentException("bad")));
        assertFalse(client.isRetryableException(defaultCfg, new NullPointerException()));

        // Narrowed to a specific subclass: only that subclass is retryable
        RetryConfig narrowCfg = RetryConfig.of(r -> r.backoffPolicy(fixed(1L, 1)).retryableExceptions(SocketException.class));
        assertTrue(client.isRetryableException(narrowCfg, new SocketException("io")));
        assertFalse(client.isRetryableException(narrowCfg, new IOException("plain io")));
    }

    @Test
    void responseClassifierUsesConfiguredStatuses() {
        RetryingHttpClient client = wrap(new MockedClient());

        RetryConfig defaultCfg = RetryConfig.of(r -> r.backoffPolicy(fixed(1L, 1)));
        assertTrue(client.isRetryableStatus(defaultCfg, new FakeResponse(500, Collections.emptyMap())));
        assertTrue(client.isRetryableStatus(defaultCfg, new FakeResponse(429, Collections.emptyMap())));
        assertTrue(client.isRetryableStatus(defaultCfg, new FakeResponse(503, Collections.emptyMap())));
        assertFalse(client.isRetryableStatus(defaultCfg, new FakeResponse(501, Collections.emptyMap())));
        assertFalse(client.isRetryableStatus(defaultCfg, new FakeResponse(404, Collections.emptyMap())));
        assertFalse(client.isRetryableStatus(defaultCfg, new FakeResponse(200, Collections.emptyMap())));

        RetryConfig customCfg = RetryConfig.of(r -> r.backoffPolicy(fixed(1L, 1)).retryableStatuses(418));
        assertTrue(client.isRetryableStatus(customCfg, new FakeResponse(418, Collections.emptyMap())));
        assertFalse(client.isRetryableStatus(customCfg, new FakeResponse(503, Collections.emptyMap())));
    }
}
