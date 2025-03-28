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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.core.bulk.CreateOperation;
import co.elastic.clients.elasticsearch.core.bulk.DeleteOperation;
import co.elastic.clients.elasticsearch.core.bulk.IndexOperation;
import co.elastic.clients.elasticsearch.core.bulk.OperationType;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.SimpleJsonpMapper;
import co.elastic.clients.transport.BackoffPolicy;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BulkIngesterRetryPolicyTest {

    protected static ElasticsearchClient client;
    protected static TestTransport transport;
    protected static CountingListener listener;

    private BulkOperation create = BulkOperation.of(b -> b.create(c -> c.index("foo").id("1").document("1")));
    private BulkOperation index = BulkOperation.of(b -> b.index(c -> c.index("fooo").id("2").document("2")));
    private BulkOperation indexFail = BulkOperation.of(b -> b.index(c -> c.index("fail").id("2").document(
        "2")));
    private BulkOperation delete = BulkOperation.of(b -> b.delete(c -> c.index("foooo").id("3")));
    private BulkOperation deleteFail = BulkOperation.of(b -> b.delete(c -> c.index("fail").id("3")));

    @BeforeEach
    public void setup() {
        transport = new TestTransport();
        client = new ElasticsearchClient(transport);
        listener = new CountingListener();
    }

    @Test
    public void retryTestNoScheduledFlushNoContext() throws Exception {

        // First test, partial success, other will succeed after retrying
        {
            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(create);
            ingester.add(index);
            ingester.add(index);

            ingester.close();

            // 1 instant success, 2 retried, but succeeded. can be either 2 or 3 depending on the retries,
            // if they get scheduled at the same exact time
            assertTrue(listener.requests.get() == 2 || listener.requests.get() == 3);
            // eventually all 3 have to succeed
            assertTrue(listener.successOperations.get() == 3);

            // 1 for the create and first try for the indexes, 2 + 2 for both index retries,
            // which could be scheduled at the same time, so from 3 to 5
            assertTrue(listener.sentRequestsTotal.get() >= 3 && listener.sentRequestsTotal.get() <= 5);
        }

        // Second test, all requests will succeed after retrying
        {
            transport.reset();
            listener.reset();

            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(index);
            ingester.add(index);
            ingester.add(index);

            ingester.close();

            // between 1 and 4, depending on scheduler
            assertTrue(listener.requests.get() >= 1 && listener.requests.get() <= 4);
            // eventually all 4 have to succeed
            assertTrue(listener.successOperations.get() == 4);
            // between 3 and 9, depending on scheduler
            assertTrue(listener.sentRequestsTotal.get() >= 3 && listener.sentRequestsTotal.get() <= 9);
        }

        // Third test, only one retryable (will succeed), other permanent failures
        {
            transport.reset();
            listener.reset();

            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(delete);
            ingester.add(delete);

            ingester.close();

            // 2 failed will be handled together, then 1 retry
            assertTrue(listener.requests.get() == 2);

            assertTrue(listener.successOperations.get() == 1);
            assertTrue(listener.errorOperations.get() == 2);
            // 1 initial + 2 retries
            assertTrue(listener.sentRequestsTotal.get() == 3);
        }

        // Fourth test, all requests will be retried until policy allows, then fail
        {
            transport.reset();
            listener.reset();

            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(indexFail);
            ingester.add(indexFail);
            ingester.add(indexFail);

            ingester.close();

            // from 1 to 3 depending on scheduling
            assertTrue(listener.requests.get() >= 1 && listener.requests.get() <= 3);

            assertTrue(listener.successOperations.get() == 0);
            assertTrue(listener.errorOperations.get() == 3);
            // between 8 and 24, depending on scheduler
            assertTrue(listener.sentRequestsTotal.get() >= 8 && listener.sentRequestsTotal.get() <= 24);
        }

        // Fifth test, one exception that will make everything else fail, no retries triggered
        {
            transport.reset();
            listener.reset();

            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(create);
            ingester.add(deleteFail);

            ingester.close();

            // just the one
            assertTrue(listener.requests.get() == 1);

            assertTrue(listener.successOperations.get() == 0);
            assertTrue(listener.errorOperations.get() == 3);

            // just the one
            assertTrue(listener.sentRequestsTotal.get() == 1);
        }

        // Sixth test, a mix of everything
        {
            transport.reset();
            listener.reset();

            BulkIngester<Integer> ingester = newBasicBulkIngester(listener);

            ingester.add(create);
            ingester.add(index);
            ingester.add(indexFail);
            ingester.add(delete);
            ingester.add(create);
            ingester.add(index);
            ingester.add(indexFail);
            ingester.add(delete);

            ingester.close();

            // from 2 to 4 depending on scheduling
            assertTrue(listener.requests.get() >= 1 && listener.successOperations.get() <= 4);

            assertTrue(listener.successOperations.get() == 4);
            assertTrue(listener.errorOperations.get() == 4);

            // between 8 and 18, depending on scheduler
            assertTrue(listener.sentRequestsTotal.get() >= 8 && listener.sentRequestsTotal.get() <= 18);
        }

        transport.close();
    }

    @Test
    public void retryTestFlushAndContextExponentialBackoff() throws Exception {

        // One success, other will succeed after retrying, other will fail eventually
        {
            BulkIngester<Integer> ingester = newBulkIngesterWithFlushAndContextAndLongExponential(listener);

            ingester.add(create, 1);
            ingester.add(indexFail, 2);
            ingester.add(index, 3);

            ingester.close();

            // should be 3 separate requests sent, one instant, one after a few retries, the last one error.
            assertTrue(listener.requests.get() == 3);
            // 2 will succeed, one will fail
            assertTrue(listener.successOperations.get() == 2);
            assertTrue(listener.errorOperations.get() == 1);
            // between 8 and 10, depending on scheduler (first one + 2 retries for index + 8 retries for
            // indexfail)
            assertTrue(listener.sentRequestsTotal.get() >= 8 && listener.sentRequestsTotal.get() <= 11);
            // checking order of contexts after send confirmed
            Iterator iter = listener.sentContexts.iterator();
            // first one being completed is create
            assertTrue(iter.next().equals(1));
            // second one is index, which will take only 2 retries
            assertTrue(iter.next().equals(3));
            // last one is indexFail, taking 8 retries to fail
            assertTrue(iter.next().equals(2));
        }

        transport.close();
    }

    @Test
    public void retryTestNoFlushAndContextExponentialBackoff() throws Exception {

        // One success, other will succeed after retrying, other will fail eventually
        {
            BulkIngester<Integer> ingester = newBulkIngesterNoFlushAndContextAndLongExponential(listener);

            ingester.add(create, 1);
            ingester.add(indexFail, 2);
            ingester.add(index, 3);

            ingester.close();

            // should be 3 separate requests sent, one instant, one after a few retries, the last one error.
            assertTrue(listener.requests.get() == 3);
            // 2 will succeed, one will fail
            assertTrue(listener.successOperations.get() == 2);
            assertTrue(listener.errorOperations.get() == 1);
            // between 8 and 10, depending on scheduler (first one + 2 retries for index + 8 retries for
            // indexfail)
            assertTrue(listener.sentRequestsTotal.get() >= 8 && listener.sentRequestsTotal.get() <= 11);
            // checking order of contexts after send confirmed
            Iterator iter = listener.sentContexts.iterator();
            // first one being completed is create
            assertTrue(iter.next().equals(1));
            // second one is index, which will take only 2 retries
            assertTrue(iter.next().equals(3));
            // last one is indexFail, taking 8 retries to fail
            assertTrue(iter.next().equals(2));
        }

        transport.close();
    }

    @Test
    @DisabledIf("isGithubBuild")
    public void retryMultiThreadStressTest() throws InterruptedException, IOException {

        // DISCLAIMER: this configuration is highly inefficient and only used here to showcase an extreme
        // situation where the number of adding threads greatly exceeds the number of concurrent requests
        // handled by the ingester. It's strongly recommended to always tweak maxConcurrentRequests
        // accordingly.
        BulkIngester<Integer> ingester = BulkIngester.of(b -> b
            .client(client)
            .listener(listener)
            .flushInterval(5, TimeUnit.SECONDS)
            .backoffPolicy(BackoffPolicy.constantBackoff(50L, 8)));

        ExecutorService executor = Executors.newFixedThreadPool(50);

        // sends create operations, but once every 1000, one index operation will be sent,
        // and once every 5000 an indexFail
        for (int i = 0; i < 100000; i++) {
            int ii = i;
            Runnable thread = () -> {
                int finalI = ii;
                if (ii % 1000 == 0) {
                    ingester.add(index, ii);
                } else if (ii % 5000 == 0) {
                    ingester.add(indexFail, ii);
                } else {
                    ingester.add(create, ii);
                }
            };
            executor.submit(thread);
        }

        executor.awaitTermination(10, TimeUnit.SECONDS);
        ingester.close();

        // all operations will succeed eventually, so the total has to be 100000
        assertTrue(listener.successOperations.get() == 100000);
        assertTrue(listener.sentContexts.size() == 100000);
        assertTrue(listener.errorOperations.get() == 0);
        // it's difficult to predict how many requests will be sent, but considering they will be sent
        // in batches of 1000, without retries it should be exactly 100, considering that 100 out of
        // 100000 will be retried 3 times and 20 will be retried 8 times, if they don't get batched together
        // with the others it could result in a total of 560, which is highly unlikely.
        // more reasonably there will be between 100 and 300 requests sent.
        assertTrue(listener.sentRequestsTotal.get() >= 100 && listener.sentRequestsTotal.get() <= 300);
        // same reasoning
        assertTrue(listener.requests.get() >= 100 && listener.requests.get() <= 300);

        transport.close();
    }


    private static class TestTransport implements ElasticsearchTransport {
        public final AtomicInteger requestsStarted = new AtomicInteger();
        public final AtomicInteger requestsCompleted = new AtomicInteger();
        public final AtomicInteger operations = new AtomicInteger();

        public ConcurrentHashMap<BulkOperation, Integer> retryFailures = new ConcurrentHashMap<>();


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

            if (bulk.operations().isEmpty()) {
                System.out.println("No operations!");
            }

            // For testing purposes, different result depending on the operation type.
            // Create will always succeed
            // Index will always return 429 for 2 times, then 200. Index with index name "fail" will only
            // return 429.
            // Delete will always return 404. Delete with index name "fail" will throw transport exception.

            try {

                List<BulkResponseItem> items = new ArrayList<>();
                for (BulkOperation op : bulk.operations()) {
                    OperationType operationType = OperationType.Create;
                    ErrorCause error = null;
                    int status = 200;
                    String index = null;
                    switch (op._kind()) {
                        case Index:
                            index = ((IndexOperation) op._get()).index();
                            operationType = OperationType.Index;
                            retryFailures.putIfAbsent(op, 0);
                            boolean isStillRetrying = retryFailures.computeIfPresent(op, (k, v) -> v + 1) > 2;
                            error = isStillRetrying && !index.equals("fail") ? null :
                                ErrorCause.of(e -> e.reason("some error"));
                            status = isStillRetrying && !index.equals("fail") ? 200 : 429;
                            break;
                        case Delete:
                            index = ((DeleteOperation) op._get()).index();
                            if (index.equals("fail")) {
                                throw new RuntimeException("error");
                            }
                            operationType = OperationType.Delete;
                            error = ErrorCause.of(e -> e.reason("some error"));
                            status = 404;
                            break;
                        default:
                            index = ((CreateOperation) op._get()).index();
                            break;
                    }
                    ErrorCause finalError = error;
                    int finalStatus = status;
                    OperationType finalOperationType = operationType;
                    String finalIndex = index;
                    items.add(BulkResponseItem.of(b -> b
                        .index(finalIndex)
                        .operationType(finalOperationType)
                        .status(finalStatus)
                        .error(finalError)));
                }

                CompletableFuture<BulkResponse> response = new CompletableFuture<>();
                executor.submit(() -> {
                    requestsCompleted.incrementAndGet();
                    response.complete(BulkResponse.of(r -> r.errors(false).items(items).took(3)));
                });

                @SuppressWarnings("unchecked")
                CompletableFuture<ResponseT> result = (CompletableFuture<ResponseT>) response;
                return result;
            } catch (RuntimeException e) {
                CompletableFuture<ResponseT> future = new CompletableFuture<>();
                future.completeExceptionally(e);
                executor.submit(() -> {
                    future.completeExceptionally(e);
                });
                return future;
            }
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

        public void reset() {
            requestsStarted.set(0);
            requestsCompleted.set(0);
            operations.set(0);
            retryFailures = new ConcurrentHashMap<>();
        }
    }

    private static class CountingListener implements BulkListener<Integer> {
        public final AtomicInteger sentRequestsTotal = new AtomicInteger();
        public final AtomicInteger successOperations = new AtomicInteger();
        public final AtomicInteger errorOperations = new AtomicInteger();
        public final AtomicInteger requests = new AtomicInteger();
        public final ConcurrentLinkedQueue<Integer> sentContexts = new ConcurrentLinkedQueue<>();

        @Override
        public void beforeBulk(long executionId, BulkRequest request, List<Integer> contexts) {
            sentRequestsTotal.incrementAndGet();
        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Integer> contexts,
                              BulkResponse response) {
            for (BulkResponseItem item : response.items()) {
                if (item.error() != null) {
                    errorOperations.incrementAndGet();
                } else {
                    successOperations.incrementAndGet();
                }
            }
            if (contexts.stream().anyMatch(Objects::nonNull)) {
                sentContexts.addAll(contexts);
            }
            requests.incrementAndGet();
        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Integer> contexts,
                              Throwable failure) {
            failure.printStackTrace();
            errorOperations.addAndGet(request.operations().size());
            if (contexts.stream().anyMatch(Objects::nonNull)) {
                sentContexts.addAll(contexts);
            }
            requests.incrementAndGet();
        }

        public void reset() {
            successOperations.set(0);
            errorOperations.set(0);
            requests.set(0);
            sentRequestsTotal.set(0);
        }
    }

    private BulkIngester<Integer> newBasicBulkIngester(BulkListener<Integer> listener) {
        return BulkIngester.of(b -> b
            .client(client)
            .maxOperations(10)
            .maxConcurrentRequests(10)
            .listener(listener)
            .backoffPolicy(BackoffPolicy.constantBackoff(50L, 8))
        );
    }

    private BulkIngester<Integer> newBulkIngesterWithFlushAndContextAndLongExponential(BulkListener<Integer> listener) {
        return BulkIngester.of(b -> b
            .client(client)
            .maxOperations(10)
            .maxConcurrentRequests(10)
            .listener(listener)
            .flushInterval(1000, TimeUnit.MILLISECONDS)
            .backoffPolicy(BackoffPolicy.exponentialBackoff(100L, 8))
        );
    }

    private BulkIngester<Integer> newBulkIngesterNoFlushAndContextAndLongExponential(BulkListener<Integer> listener) {
        return BulkIngester.of(b -> b
            .client(client)
            .maxOperations(10)
            .maxConcurrentRequests(10)
            .listener(listener)
            .backoffPolicy(BackoffPolicy.exponentialBackoff(100L, 8))
        );
    }

    private boolean isGithubBuild(){
        return Optional.ofNullable(System.getenv("github_test"))
            .map(Boolean::valueOf).orElse(false);
    }
}
