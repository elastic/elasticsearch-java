package co.elastic.clients.transport.rest_client;

import co.elastic.clients.transport.BackoffPolicy;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import org.elasticsearch.client.ResponseException;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

public class RetryRestClientHttpClient implements TransportHttpClient {

    private TransportHttpClient delegate;
    private BackoffPolicy backoffPolicy;

    public RetryRestClientHttpClient(TransportHttpClient delegate, BackoffPolicy backoffPolicy) {
        this.delegate = delegate;
        this.backoffPolicy = backoffPolicy;
    }

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request,
                                   TransportOptions options) throws IOException {
        return performRequestRetry(endpointId, node, request, options, backoffPolicy.iterator());
    }

    public Response performRequestRetry(String endpointId, @Nullable Node node, Request request,
                                        TransportOptions options, Iterator<Long> backoffIter) throws IOException {
        try {
            return delegate.performRequest(endpointId, node, request, options);
        } catch (ResponseException e) {
            if (e.getResponse().getStatusLine().getStatusCode() == 503) { // TODO list of statuses
                // synchronous retry
                if (backoffIter.hasNext()) {
                    try {
                        Thread.sleep(backoffIter.next()); // TODO ... no?
                    } catch (InterruptedException ie) {
                    }
                    System.out.println("Retrying");
                    return performRequestRetry(endpointId, node, request, options, backoffIter);
                }
            }
            // error not retryable
            throw e;
        }
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node,
                                                           Request request, TransportOptions options) {
        return performRequestAsyncRetry(endpointId, node, request, options, backoffPolicy.iterator());
    }

    public CompletableFuture<Response> performRequestAsyncRetry(String endpointId, @Nullable Node node,
                                                                Request request,
                                                                TransportOptions options,
                                                                Iterator<Long> backoffIter) {
        CompletableFuture<Response> fut = delegate.performRequestAsync(endpointId, node, request, options);
        try {
            fut.get(); // TODO is this problematic?
            return fut;
        } catch (Exception e) {
            if (e.getCause() instanceof ResponseException) {
                if (((ResponseException) e.getCause()).getResponse().getStatusLine().getStatusCode() == 503) { // TODO list of statuses
                    if (backoffIter.hasNext()) {
                        try {
                            Thread.sleep(backoffIter.next()); // TODO ... no?
                        } catch (InterruptedException ie) {
                            fut.completeExceptionally(e); // TODO masking internal errors and just returning original error okay?
                        }
                        System.out.println("Retrying");
                        return performRequestAsyncRetry(endpointId, node, request, options, backoffIter);
                    }
                }
            }
            return fut;
        }
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }
}
