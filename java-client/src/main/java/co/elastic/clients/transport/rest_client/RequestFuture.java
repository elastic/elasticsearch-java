package co.elastic.clients.transport.rest_client;

import org.elasticsearch.client.Cancellable;

import java.util.concurrent.CompletableFuture;

/**
 * The {@code Future} implementation returned by async requests.
 * It wraps the RestClient's cancellable and propagates cancellation.
 */
public class RequestFuture<T> extends CompletableFuture<T> {
    private volatile Cancellable cancellable;

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        boolean cancelled = super.cancel(mayInterruptIfRunning);
        if (cancelled && cancellable != null) {
            cancellable.cancel();
        }
        return cancelled;
    }

    public void setCancellable(Cancellable cancellable) {
        this.cancellable = cancellable;
    }
}
