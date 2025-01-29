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
import co.elastic.clients.transport.TransportOptions;
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

    private BulkOperation create = BulkOperation.of(b -> b.create(c -> c.index("foo").id("1").document("1")));
    private BulkOperation index = BulkOperation.of(b -> b.index(c -> c.index("fooo").id("2").document("2")));
    private BulkOperation delete = BulkOperation.of(b -> b.delete(c -> c.index("foooo").id("3")));

    @BeforeAll
    public static void beforeAll() {
        TestTransport transport = new TestTransport();
        ElasticsearchAsyncClient client = new ElasticsearchAsyncClient(transport);
    }

    @Test
    public void retryTestNoScheduledFlushNoContext() throws Exception {
        TestTransport transport = new TestTransport();
        ElasticsearchClient client = new ElasticsearchClient(transport);
        CountingListener listener = new CountingListener();


        BulkIngester<Void> ingester = BulkIngester.of(b -> b
            .client(client)
            .maxOperations(3)
            .maxConcurrentRequests(3)
            .listener(listener)
            .backoffPolicy(BackoffPolicy.constantBackoff(50L,8))
        );

        // First test, partial success
        {
            ingester.add(create);
            ingester.add(index);
            ingester.add(index);

            ingester.close();

            // at most it should be 1 instant success + 2 retries, at minimum just 3 instant successes
            assertTrue(listener.requests.get() > 0 && listener.requests.get() < 4);
            // eventually all 3 have to succeed
            assertTrue(listener.successOperations.get() == 3);
        }
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
            // Index will always 429 for 3 times, then 200
            // Delete will always return 404

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
                        error = isStillRetrying ? null : ErrorCause.of(e -> e.reason("some error"));
                        status =  isStillRetrying ? 200 : 429;
                        break;
                    case Delete:
                        index = ((DeleteOperation) op._get()).index();
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
    }
}
