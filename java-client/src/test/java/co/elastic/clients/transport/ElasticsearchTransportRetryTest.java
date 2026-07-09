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

import co.elastic.clients.elasticsearch.core.CountRequest;
import co.elastic.clients.elasticsearch.core.CountResponse;
import co.elastic.clients.testkit.MockHttpClient;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.transport.http.RetryingHttpClient;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.BinaryData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Verifies how {@link ElasticsearchTransportBase} routes requests depending on where retries are configured:
 * <ul>
 *   <li>enabled at the client level, and</li>
 *   <li>enabled only for a single request on an otherwise non-retrying client.</li>
 * </ul>
 * In both cases requests go through a single, lazily-created, shared retry wrapper; requests without retries go
 * straight to the bare http client.
 */
public class ElasticsearchTransportRetryTest extends ModelTestCase {

    private static final BackoffPolicy FAST = BackoffPolicy.constantBackoff(1L, 3);

    private static TransportOptions retryOptions() {
        return new DefaultTransportOptions.Builder()
            .retryConfig(RetryConfig.of(r -> r.backoffPolicy(FAST)))
            .build();
    }

    private static TransportOptions disabledRetryOptions() {
        return new DefaultTransportOptions.Builder()
            .retryConfig(RetryConfig.disabled())
            .build();
    }

    // An http client that returns `failuresBeforeSuccess` retryable 503 responses, then a valid 200 _count response.
    private ScriptedHttpClient scriptedClient(int failuresBeforeSuccess) {
        ScriptedHttpClient client = new ScriptedHttpClient(failuresBeforeSuccess);
        client.add("/_count", "application/json", toJson(CountResponse.of(c -> c
            .count(1)
            .shards(s -> s.successful(1).failed(0).total(1))
        )));
        return client;
    }

    private ElasticsearchTransportBase transport(MockHttpClient httpClient, TransportOptions clientOptions) {
        return new ElasticsearchTransportBase(httpClient, clientOptions, mapper) {};
    }

    @Test
    public void clientLevelRetryRetriesAndSucceeds() throws IOException {
        ScriptedHttpClient http = scriptedClient(2);
        ElasticsearchTransportBase transport = transport(http, retryOptions());

        // No per-request options: the client-level RetryConfig (carried by transportOptions) applies.
        CountResponse resp = transport.performRequest(CountRequest.of(c -> c), CountRequest._ENDPOINT, null);

        assertEquals(1L, resp.count());
        assertEquals(3, http.calls.get());
    }

    @Test
    public void perRequestRetryRetriesAndSucceedsSync() throws IOException {
        ScriptedHttpClient http = scriptedClient(1);
        // Client has NO retries: the retry is requested only for this call.
        ElasticsearchTransportBase transport = transport(http, null);

        CountResponse resp = transport.performRequest(CountRequest.of(c -> c), CountRequest._ENDPOINT, retryOptions());

        assertEquals(1L, resp.count());
        assertEquals(2, http.calls.get());
    }

    @Test
    public void perRequestRetryRetriesAndSucceedsAsync() throws Exception {
        ScriptedHttpClient http = scriptedClient(1);
        ElasticsearchTransportBase transport = transport(http, null);

        CompletableFuture<CountResponse> future =
            transport.performRequestAsync(CountRequest.of(c -> c), CountRequest._ENDPOINT, retryOptions());
        CountResponse resp = future.get(5, TimeUnit.SECONDS);

        assertEquals(1L, resp.count());
        assertEquals(2, http.calls.get());
    }

    @Test
    public void noRetryConfiguredMakesSingleAttempt() {
        ScriptedHttpClient http = scriptedClient(5);
        ElasticsearchTransportBase transport = transport(http, null);

        // Neither client nor request enable retries: the 503 surfaces immediately.
        assertThrows(TransportException.class,
            () -> transport.performRequest(CountRequest.of(c -> c), CountRequest._ENDPOINT, null));
        assertEquals(1, http.calls.get());
    }

    /**
     * Cancelling a per-request retrying call must stop pending retries and not call the delegate again,
     * without surfacing spurious exceptions.
     */
    @Test
    public void perRequestRetryAsyncCancellationStopsRetries() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        CountDownLatch firstCall = new CountDownLatch(1);

        TransportHttpClient delegate = new TransportHttpClient() {
            @Override
            public Response performRequest(String endpointId, Node node, Request request, TransportOptions options) {
                throw new UnsupportedOperationException();
            }

            @Override
            public CompletableFuture<Response> performRequestAsync(String endpointId, Node node, Request request,
                                                                   TransportOptions options) {
                calls.incrementAndGet();
                CompletableFuture<Response> f = new CompletableFuture<>();
                f.complete(new StatusResponse(503));
                firstCall.countDown();
                return f;
            }

            @Override
            public void close() {
            }
        };

        ElasticsearchTransportBase transport = new ElasticsearchTransportBase(delegate, null, mapper) {};

        // Long backoff so the retry stays pending until we cancel.
        TransportOptions longRetry = new DefaultTransportOptions.Builder()
            .retryConfig(RetryConfig.of(r -> r.backoffPolicy(BackoffPolicy.constantBackoff(3_600_000L, 5))))
            .build();

        CompletableFuture<CountResponse> future =
            transport.performRequestAsync(CountRequest.of(c -> c), CountRequest._ENDPOINT, longRetry);

        assertTrue(firstCall.await(5, TimeUnit.SECONDS));
        // Give the retry a moment to be scheduled before we cancel.
        Thread.sleep(50);
        future.cancel(true);

        assertThrows(CancellationException.class, () -> future.get(1, TimeUnit.SECONDS));

        // No further attempts after cancellation.
        Thread.sleep(100);
        assertEquals(1, calls.get(), "delegate must not be called again after cancellation");
    }

    @Test
    public void alreadyRetryingHttpClientIsNotWrappedAgain() throws IOException {
        // If the http client handed to the transport already retries, the transport must not add a second
        // retry layer: both layers would read the same RetryConfig and multiply attempts.
        ScriptedHttpClient http = scriptedClient(100);
        ElasticsearchTransportBase transport =
            new ElasticsearchTransportBase(new RetryingHttpClient(http), retryOptions(), mapper) {};

        assertThrows(TransportException.class,
            () -> transport.performRequest(CountRequest.of(c -> c), CountRequest._ENDPOINT, null));

        // FAST allows 3 retries: 4 attempts with a single retry layer, 16 with an accidental double layer.
        assertEquals(4, http.calls.get());
        transport.close();
    }

    @Test
    public void perRequestDisableOverridesClientRetry() {
        ScriptedHttpClient http = scriptedClient(5);
        // Client enables retries, but this specific request opts out.
        ElasticsearchTransportBase transport = transport(http, retryOptions());

        assertThrows(TransportException.class,
            () -> transport.performRequest(CountRequest.of(c -> c), CountRequest._ENDPOINT, disabledRetryOptions()));
        assertEquals(1, http.calls.get());
    }

    static class ScriptedHttpClient extends MockHttpClient {
        final AtomicInteger calls = new AtomicInteger();
        private final int failuresBeforeSuccess;

        ScriptedHttpClient(int failuresBeforeSuccess) {
            this.failuresBeforeSuccess = failuresBeforeSuccess;
        }

        @Override
        public Response performRequest(String endpointId, Node node, Request request, TransportOptions option)
            throws IOException {
            int i = calls.getAndIncrement();
            if (i < failuresBeforeSuccess) {
                return new StatusResponse(503);
            }
            return super.performRequest(endpointId, node, request, option);
        }

        @Override
        public CompletableFuture<Response> performRequestAsync(String endpointId, Node node, Request request,
                                                               TransportOptions options) {
            CompletableFuture<Response> f = new CompletableFuture<>();
            try {
                f.complete(performRequest(endpointId, node, request, options));
            } catch (Exception e) {
                f.completeExceptionally(e);
            }
            return f;
        }
    }

    static final class StatusResponse implements TransportHttpClient.Response {
        private final int status;

        StatusResponse(int status) {
            this.status = status;
        }

        @Override
        public TransportHttpClient.Node node() {
            return null;
        }

        @Override
        public int statusCode() {
            return status;
        }

        @Override
        public String header(String name) {
            return null;
        }

        @Override
        public List<String> headers(String name) {
            return null;
        }

        @Override
        public BinaryData body() {
            return null;
        }

        @Override
        public Object originalResponse() {
            return null;
        }

        @Override
        public void close() {
        }
    }
}
