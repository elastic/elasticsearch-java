package co.elastic.clients.elasticsearch._helpers.bulk;

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
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
import co.elastic.clients.transport.TransportException;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.RepeatableBodyResponse;
import co.elastic.clients.transport.http.TransportHttpClient;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BulkIngesterRetryPolicyTest {

    protected static ElasticsearchClient client;
    protected static TestTransport transport;
    protected static CountingListener listener;

    private BulkOperation create = BulkOperation.of(b -> b.create(c -> c.index("foo").id("1").document("1")));
    private BulkOperation index = BulkOperation.of(b -> b.index(c -> c.index("fooo").id("2").document("2")));
    private BulkOperation indexFail = BulkOperation.of(b -> b.index(c -> c.index("fail").id("2").document("2")));
    private BulkOperation delete = BulkOperation.of(b -> b.delete(c -> c.index("foooo").id("3")));
    private BulkOperation deleteFail = BulkOperation.of(b -> b.delete(c -> c.index("fail").id("3")));

    @BeforeAll
    public static void setup(){
        transport = new TestTransport();
        client = new ElasticsearchClient(transport);
        listener = new CountingListener();
    }

    @Test
    public void retryTestNoScheduledFlushNoContext() throws Exception {

        // First test, partial success, other will succeed after retrying
        {
            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

            ingester.add(create);
            ingester.add(index);
            ingester.add(index);

            ingester.close();

            // 1 instant success, 2 retried, but succeeded. can be either 2 or 3 depending if the retries
            // get scheduled at the same exact time
            assertTrue(listener.requests.get() == 2 || listener.requests.get() == 3);
            // eventually all 3 have to succeed
            assertTrue(listener.successOperations.get() == 3);
        }

        // Second test, all requests will succeed after retrying
        {
            transport.reset();
            listener.reset();

            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(index);
            ingester.add(index);
            ingester.add(index);

            ingester.close();

            // between 1 and 4, depending on scheduler
            assertTrue(listener.requests.get() >= 1 && listener.requests.get() <= 4);
            // eventually all 4 have to succeed
            assertTrue(listener.successOperations.get() == 4);
        }

        // Third test, only one retryable (will succeed), other permanent failures
        {
            transport.reset();
            listener.reset();

            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(delete);
            ingester.add(delete);

            ingester.close();

            // 2 failed will be handled together, then 1 retry
            assertTrue(listener.requests.get() == 2);

            assertTrue(listener.successOperations.get() == 1);
            assertTrue(listener.errorOperations.get() == 2);
        }

        // Fourth test, all requests will be retried until policy allows, then fail
        {
            transport.reset();
            listener.reset();

            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

            ingester.add(indexFail);
            ingester.add(indexFail);
            ingester.add(indexFail);

            ingester.close();

            // from 1 to 3 depending on scheduling
            assertTrue(listener.requests.get() >= 1 && listener.requests.get() <= 3);

            assertTrue(listener.successOperations.get() == 0);
            assertTrue(listener.errorOperations.get() == 3);
        }

        // Fifth test, one exception that will make everything else fail, no retries triggered
        {
            transport.reset();
            listener.reset();

            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

            ingester.add(index);
            ingester.add(create);
            ingester.add(deleteFail);

            ingester.close();

            // just the one
            assertTrue(listener.requests.get() == 1);

            assertTrue(listener.successOperations.get() == 0);
            assertTrue(listener.errorOperations.get() == 3);
        }

        // Sixth test, a mix of everything
        {
            transport.reset();
            listener.reset();

            BulkIngester<Void> ingester = newBasicBulkIngester(listener);

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
        }

        transport.close();
    }

    @Test
    public void retryTestFlushAndContextExponentialBackoff() throws Exception {

        TestTransport transport = new TestTransport();
        ElasticsearchClient client = new ElasticsearchClient(transport);
        CountingListener listener = new CountingListener();

        // TODO

        transport.close();
    }


    private static class TestTransport implements ElasticsearchTransport {
        public final AtomicInteger requestsStarted = new AtomicInteger();
        public final AtomicInteger requestsCompleted = new AtomicInteger();
        public final AtomicInteger operations = new AtomicInteger();

        public final AtomicInteger retryFailures = new AtomicInteger();


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
            // Index will always 429 for 3 times, then 200. Index with index name "fail" will only 429.
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
                            boolean isStillRetrying = retryFailures.incrementAndGet() > 2;
                            error = isStillRetrying && !index.equals("fail") ? null : ErrorCause.of(e -> e.reason("some error"));
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
            }
            catch (RuntimeException e){
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
            retryFailures.set(0);
        }
    }

    private static class CountingListener implements BulkListener<Void> {
        public final AtomicInteger successOperations = new AtomicInteger();
        public final AtomicInteger errorOperations = new AtomicInteger();
        public final AtomicInteger requests = new AtomicInteger();

        @Override
        public void beforeBulk(long executionId, BulkRequest request, List<Void> contexts) {

        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Void> contexts,
                              BulkResponse response) {
            for (BulkResponseItem item : response.items()) {
                if(item.error() != null) {
                    errorOperations.incrementAndGet();
                }
                else{
                    successOperations.incrementAndGet();
                }
            }
            requests.incrementAndGet();
        }

        @Override
        public void afterBulk(long executionId, BulkRequest request, List<Void> contexts, Throwable failure) {
            failure.printStackTrace();
            errorOperations.addAndGet(request.operations().size());
            requests.incrementAndGet();
        }

        public void reset() {
            successOperations.set(0);
            errorOperations.set(0);
            requests.set(0);
        }
    }

    private BulkIngester<Void> newBasicBulkIngester(BulkListener<Void> listener){
        return BulkIngester.of(b -> b
            .client(client)
            .maxOperations(10)
            .maxConcurrentRequests(10)
            .listener(listener)
            .backoffPolicy(BackoffPolicy.constantBackoff(50L,8))
        );
    }
}
