package co.elastic.clients.transport.rest_client;

import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class RetryRestClientHttpClient implements TransportHttpClient {

    private TransportHttpClient delegate;

    @Override
    public Response performRequest(String endpointId, @Nullable Node node, Request request, TransportOptions options) throws IOException {
        return delegate.performRequest(endpointId, node, request, options);
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(String endpointId, @Nullable Node node, Request request, TransportOptions options) {
        return delegate.performRequestAsync(endpointId, node, request, options);
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }
}
