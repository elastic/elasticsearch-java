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
            if (e.getResponse().getStatusLine().getStatusCode() == 503) { // TODO list of statuses, configurable or hardcoded?
                // synchronous retry
                if (backoffIter.hasNext()) {
                    try {
                        Thread.sleep(backoffIter.next());
                    } catch (InterruptedException ie) {
                        throw e; // TODO okay with masking IE and just returning original exception?
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
        RequestFuture<Response> futureResult = new RequestFuture<>();
        return performRequestAsyncRetry(endpointId, node, request, options, backoffPolicy.iterator(),
            futureResult);
    }

    public CompletableFuture<Response> performRequestAsyncRetry(String endpointId, @Nullable Node node,
                                                                Request request,
                                                                TransportOptions options,
                                                                Iterator<Long> backoffIter,
                                                                CompletableFuture<Response> futureResult) {
        CompletableFuture<Response> res = delegate.performRequestAsync(endpointId, node, request, options);

        res.whenComplete((resp, e) -> {
            if (e != null) {
                if (e instanceof ResponseException) {
                    if (((ResponseException) e).getResponse().getStatusLine().getStatusCode() == 503) { // TODO list of statuses, configurable or hardcoded?
                        if (backoffIter.hasNext()) {
                            try {
                                Thread.sleep(backoffIter.next());
                            } catch (InterruptedException ie) {
                                // TODO okay with masking IE and just returning original exception?
                                futureResult.completeExceptionally(e);
                            }
                            System.out.println("Retrying");
                            performRequestAsyncRetry(endpointId, node, request, options, backoffIter,futureResult);
                        }
                    }
                }
            }
            else {
                futureResult.complete(resp);
            }
        });

        return futureResult;
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }
}
