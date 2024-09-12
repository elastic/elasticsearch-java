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

package co.elastic.clients.elasticsearch._helpers.bulk;

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.core.bulk.OperationType;
import co.elastic.clients.elasticsearch.end_to_end.RequestTest;
import co.elastic.clients.elasticsearch.indices.IndicesStatsResponse;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.SimpleJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

class BulkIngesterTest extends Assertions {

    private static final BulkResponseItem successItem = BulkResponseItem.of(i -> i
        .index("foo")
        .status(200)
        .operationType(OperationType.Delete)
    );

    private static final BulkOperation operation = BulkOperation.of(op -> op
        .delete(d -> d.index("foo").id("bar"))
    );

    private void printStats(BulkIngester<?> ingester) {
        System.out.printf("Ingester - operations: %d (%d), requests: %d (%d)%n",
            ingester.operationsCount(), ingester.operationContentionsCount(),
            ingester.requestCount(), ingester.requestContentionsCount()
        );
    }

    private void printStats(CountingListener listener) {
        System.out.printf("Listener - operations: %d, requests: %d%n",
            listener.operations.get(),
            listener.requests.get()
        );
    }

    private void printStats(TestTransport transport) {
        System.out.printf("Transport - operations: %d, requests: %d (%d completed)%n",
            transport.operations.get(),
            transport.requestsStarted.get(),
            transport.requestsCompleted.get()
        );
    }

    @Test
    public void basicTestFlush() throws Exception {
        // Prime numbers, so that we have leftovers to flush before shutting down
        multiThreadTest(7, 3, 5, 101, true);
    }

    @Test
    public void basicTestFlushWithInternalScheduler() throws Exception {
        // Prime numbers, so that we have leftovers to flush before shutting down
        multiThreadTest(7, 3, 5, 101, false);
    }

    @Test
    public void basicTestNoFlush() throws Exception {
        // Will have nothing to flush on close.
        multiThreadTest(10, 3, 5, 100, true);
    }

    @Test
    public void basicTestNoFlushWithInternalScheduler() throws Exception {
        // Will have nothing to flush on close.
        multiThreadTest(10, 3, 5, 100, false);
    }

    private void multiThreadTest(int maxOperations, int maxRequests, int numThreads, int numOperations,
                                 boolean externalScheduler) throws Exception {

        CountingListener listener = new CountingListener();
        TestTransport transport = new TestTransport();
        ElasticsearchAsyncClient client = new ElasticsearchAsyncClient(transport);
        ScheduledExecutorService scheduler;
        if (externalScheduler) {
            scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
                Thread t = Executors.defaultThreadFactory().newThread(r);
                t.setName("my-bulk-ingester-executor#");
                t.setDaemon(true);
                return t;
            });
        } else {
            scheduler = null;
        }

        BulkIngester<Void> ingester = BulkIngester.of(b -> b
            .client(client)
            .maxOperations(maxOperations)
            .maxConcurrentRequests(maxRequests)
            .scheduler(scheduler)
            .listener(listener)
        );

        CountDownLatch latch = new CountDownLatch(numThreads);
        for (int i = 0; i < numThreads; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep((long)(Math.random() * 100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int j = 0; j < numOperations; j++) {
                    ingester.add(operation);
                }

                latch.countDown();
            }).start();
        }

        latch.await();

        ingester.close();
        transport.close();
        if (scheduler != null) scheduler.shutdownNow();

        printStats(ingester);
        printStats(listener);
        printStats(transport);

        int expectedOperations = numThreads * numOperations;
        assertEquals(expectedOperations, ingester.operationsCount());
        assertEquals(expectedOperations, listener.operations.get());
        assertEquals(expectedOperations, transport.operations.get());

        int expectedRequests = expectedOperations / maxOperations + ((expectedOperations % maxOperations == 0) ? 0 : 1) ;

        assertEquals(expectedRequests, ingester.requestCount());
        assertEquals(expectedRequests, listener.requests.get());
        assertEquals(expectedRequests, transport.requestsStarted.get());
    }

    @Test
    public void multiThreadStressTest() throws InterruptedException, IOException {

        String index = "bulk-ingester-stress-test";
        ElasticsearchClient client = ElasticsearchTestServer.global().client();

        // DISCLAIMER: this configuration is highly inefficient and only used here to showcase an extreme
        // situation where the number of adding threads greatly exceeds the number of concurrent requests
        // handled by the ingester. It's strongly recommended to always tweak maxConcurrentRequests accordingly.
        BulkIngester<?> ingester = BulkIngester.of(b -> b
                .client(client)
                .globalSettings(s -> s.index(index))
                .flushInterval(5, TimeUnit.SECONDS)
        );

        RequestTest.AppData appData = new RequestTest.AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        ExecutorService executor = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 100000; i++) {
            int ii = i;
            Runnable thread = () -> {
                int finalI = ii;
                ingester.add(_1 -> _1
                    .create(_2 -> _2
                        .id(String.valueOf(finalI))
                        .document(appData)
                    ));
            };
            executor.submit(thread);
        }

        executor.awaitTermination(10,TimeUnit.SECONDS);
        ingester.close();

        client.indices().refresh();

        IndicesStatsResponse indexStats = client.indices().stats(g -> g.index(index));

        assertTrue(indexStats.indices().get(index).primaries().docs().count()==100000);
    }

    @Test
    public void sizeLimitTest() throws Exception {
        TestTransport transport = new TestTransport();

        long operationSize = IngesterOperation.of(operation, transport.jsonpMapper()).size();

        BulkIngester<?> ingester = BulkIngester.of(b -> b
            .client(new ElasticsearchAsyncClient(transport))
            // Set size limit just above operation's size, leading to 2 operations per request
            .maxSize(operationSize + 1)
        );

        for (int i = 0; i < 10; i++) {
            ingester.add(operation);
        }

        ingester.close();
        transport.close();

        assertEquals(10, ingester.operationsCount());
        assertEquals(5, ingester.requestCount());
    }

    @Test
    public void periodicFlushTest() throws Exception {
        TestTransport transport = new TestTransport();

        BulkIngester<?> ingester = BulkIngester.of(b -> b
            .client(new ElasticsearchAsyncClient(transport))
            // Flush every 50 ms
            .flushInterval(50, TimeUnit.MILLISECONDS)
            // Disable other flushing limits
            .maxSize(-1)
            .maxOperations(-1)
            .maxConcurrentRequests(Integer.MAX_VALUE-1)
        );

        // Add an operation every 100 ms to give time
        // to the flushing timer to kick in.
        for (int i = 0; i < 10; i++) {
            ingester.add(operation);
            Thread.sleep(100);
        }

        ingester.close();
        transport.close();

        // We should have one operation per request
        assertEquals(10, ingester.operationsCount());
        assertEquals(10, ingester.requestCount());
    }

    @Test
    public void failingListener() throws Exception {
        TestTransport transport = new TestTransport();
        AtomicInteger failureCount = new AtomicInteger();
        AtomicReference<List<Void>> lastContexts = new AtomicReference<>();
        AtomicReference<BulkRequest> lastRequest = new AtomicReference<>();

        BulkListener<Void> listener = new BulkListener<Void>() {
            @Override
            public void beforeBulk(long executionId, BulkRequest request, List<Void> contexts) {
                // So that we can test that it's non-empty
                lastContexts.set(contexts);
                lastRequest.set(request);

                if (executionId == 1) {
                    // Fail before the request is sent
                    failureCount.incrementAndGet();
                    throw new RuntimeException("Before bulk failure");
                }
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<Void> contexts, BulkResponse response) {
                if (executionId == 2) {
                    // Fail after the request is sent
                    failureCount.incrementAndGet();
                    throw new RuntimeException("After bulk failure");
                }
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<Void> contexts, Throwable failure) {

            }
        };

        BulkIngester<Void> ingester = BulkIngester.of(b -> b
            .client(new ElasticsearchAsyncClient(transport))
            // Flush every 50 ms
            .flushInterval(50, TimeUnit.MILLISECONDS)
            // Disable other flushing limits
            .maxSize(-1)
            .maxOperations(-1)
            .maxConcurrentRequests(Integer.MAX_VALUE - 1)
            .listener(listener)
        );

        // Add an operation every 100 ms to give time
        // to the flushing timer to kick in.
        for (int i = 0; i < 10; i++) {
            ingester.add(operation);
            Thread.sleep(100);
        }

        ingester.close();
        transport.close();

        // We should have one operation per request
        assertEquals(10, ingester.operationsCount());
        assertEquals(10, ingester.requestCount());
        // Transport hasn't seen the request where beforeBulk failed
        assertEquals(9, transport.requestsStarted.get());

        assertEquals(2, failureCount.get());

        // Also test context list when no values were provided
        assertTrue(lastRequest.get().operations().size() > 0);
        assertEquals(lastRequest.get().operations().size(), lastContexts.get().size());
    }

    @Test
    public void withContextValues() throws Exception {
        TestTransport transport = new TestTransport();
        List<BulkRequest> allRequests = Collections.synchronizedList(new ArrayList<>());
        List<List<Integer>> allContexts = Collections.synchronizedList(new ArrayList<>());

        BulkListener<Integer> listener = new BulkListener<Integer>() {
            @Override
            public void beforeBulk(long executionId, BulkRequest request, List<Integer> contexts) {
                allRequests.add(request);
                allContexts.add(contexts);
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<Integer> contexts, BulkResponse response) {
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<Integer> contexts, Throwable failure) {
            }
        };

        BulkIngester<Integer> ingester = BulkIngester.of(b -> b
            .client(new ElasticsearchAsyncClient(transport))
            // Split every 10 operations
            .maxOperations(10)
            .listener(listener)
        );

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Set a context only after 5, so that we test filling with nulls.
                Integer context = j < 5 ? null : i*10 + j;
                ingester.add(operation, context);
            }
        }

        ingester.close();
        transport.close();

        // We should have 10 operations per request
        assertEquals(100, ingester.operationsCount());
        assertEquals(10, ingester.requestCount());

        for (int i = 0; i < 10; i++) {
            List<Integer> contexts = allContexts.get(i);
            for (int j = 0; j < 10; j++) {
                if (j < 5) {
                    assertNull(contexts.get(j));
                } else {
                    assertEquals(contexts.get(j), i*10 + j);
                }
            }
        }
    }

    @Test
    public void testGlobalSettings() throws Exception {
        AtomicReference<BulkRequest> storedRequest = new AtomicReference<>();

        TestTransport transport = new TestTransport();
        CountingListener listener = new CountingListener() {
            @Override
            public void beforeBulk(long executionId, BulkRequest request, List<Void> contexts) {
                super.beforeBulk(executionId, request, contexts);
                storedRequest.set(request);
            }
        };

        BulkIngester<Void> ingester = BulkIngester.of(b -> b
            .client(new ElasticsearchAsyncClient(transport))
            .listener(listener)
            .globalSettings(s -> s
                .index("foo")
                .routing("bar")
            )
        );

        ingester.add(operation);

        ingester.close();
        transport.close();

        assertEquals(1, ingester.operationsCount());
        assertEquals(1, ingester.requestCount());

        assertEquals("foo", storedRequest.get().index());
        assertEquals("bar", storedRequest.get().routing());
    }

    @Test
    public void pipelineTest() {
        String json = "{\"create\":{\"_id\":\"some_id\",\"_index\":\"some_idx\",\"pipeline\":\"pipe\",\"require_alias\":true}}";
        JsonpMapper mapper = new SimpleJsonpMapper();

        BulkOperation create = BulkOperation.of(o -> o.create(c -> c
                .pipeline("pipe")
                .requireAlias(true)
                .index("some_idx")
                .id("some_id")
                .document("Some doc")
        ));

        String createStr = JsonpUtils.toJsonString(create, mapper);
        assertEquals(json, createStr);

        BulkOperation create1 = IngesterOperation.of(create, mapper).operation();

        String create1Str = JsonpUtils.toJsonString(create1, mapper);
        assertEquals(json, create1Str);
    }

    @Test
    public void endToEndTest() throws Exception {
        String index = "bulk-ingester-test";
        ElasticsearchClient client = ElasticsearchTestServer.global().client();

        BulkIngester<?> ingester = BulkIngester.of(b -> b
            .client(client)
            .globalSettings(s -> s.index(index))
        );

        RequestTest.AppData appData = new RequestTest.AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        ingester.add(_1 -> _1
            .create(_2 -> _2
                .id("abc")
                .document(appData)
            ));

        ingester.add(_1 -> _1
            .create(_2 -> _2
                .id("def")
                .document(appData)
            ));

        ingester.add(_1 -> _1
            .update(_2 -> _2
                .id("gh")
                .action(_3 -> _3
                    .docAsUpsert(true)
                    .doc(appData))
            ));

        // Closing waits until all pending requests are completed
        ingester.close();

        for (String id : Arrays.asList("abc", "def", "gh")) {
            assertEquals(
                42,
                client.get(b -> b
                    .index(index)
                    .id(id),
                    RequestTest.AppData.class
                ).source().getIntValue()
            );
        }

        client.indices().delete(d -> d.index(index));

    }

    @Test
    public void testConfigValidation() {

        BulkIngester.Builder<Void> b = new BulkIngester.Builder<>();

        assertThrows(IllegalArgumentException.class, () -> {
            b.flushInterval(-1, TimeUnit.MILLISECONDS);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            b.maxConcurrentRequests(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            b.maxSize(-2);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            b.maxOperations(-2);
        });

        assertThrows(IllegalStateException.class, () -> {
            b.maxSize(-1).maxOperations(-1).build();
        });
    }

    //-----------------------------------------------------------------------------------------------------------------

    private static class CountingListener implements BulkListener<Void> {
        public final AtomicInteger operations = new AtomicInteger();
        public final AtomicInteger requests = new AtomicInteger();
        @Override
        public void beforeBulk(long executionId, BulkRequest request, List<Void> contexts) {

        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Void> contexts, BulkResponse response) {
            operations.addAndGet(request.operations().size());
            requests.incrementAndGet();
        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Void> contexts, Throwable failure) {
            failure.printStackTrace();
            operations.addAndGet(request.operations().size());
            requests.incrementAndGet();
        }
    }

    private static class TestTransport implements ElasticsearchTransport {
        public final AtomicInteger requestsStarted = new AtomicInteger();
        public final AtomicInteger requestsCompleted = new AtomicInteger();
        public final AtomicInteger operations = new AtomicInteger();

        private final ExecutorService executor = Executors.newCachedThreadPool();

        @Override
        public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
            RequestT request,
            Endpoint<RequestT, ResponseT, ErrorT> endpoint,
            @Nullable TransportOptions options
        ) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(RequestT request, Endpoint<RequestT,
            ResponseT, ErrorT> endpoint, @Nullable TransportOptions options) {

            BulkRequest bulk = (BulkRequest) request;
            requestsStarted.incrementAndGet();
            operations.addAndGet(bulk.operations().size());

            if (bulk.operations().size() == 0) {
                System.out.println("No operations!");
            }

            List<BulkResponseItem> items = new ArrayList<>();
            for (int i = 0; i < bulk.operations().size(); i++) {
                items.add(successItem);
            }

            CompletableFuture<BulkResponse> response = new CompletableFuture<>();
            executor.submit(() -> {
                requestsCompleted.incrementAndGet();
                response.complete(BulkResponse.of(r -> r.errors(false).items(items).took(3)));
            });

            @SuppressWarnings("unchecked")
            CompletableFuture<ResponseT> result = (CompletableFuture<ResponseT>)response;
            return result;
        }

        @Override
        public JsonpMapper jsonpMapper() {
            return SimpleJsonpMapper.INSTANCE;
        }

        @Override
        public TransportOptions options() {
            return null;
        }

        @Override
        public void close() throws IOException {
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
