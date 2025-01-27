package co.elastic.clients.elasticsearch._helpers.bulk;

import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Optional;

class BulkOperationRepeatable<Context> {
    private final BulkOperation operation;
    private final Context context;
    private final Iterator<Long> retries;
    private Long retryTime;

    public BulkOperationRepeatable(BulkOperation request, Context context, Iterator<Long> retries) {
        this.operation = request;
        this.context = context;
        this.retries = retries;
        // if the retries iterator is null it means that it's not a retry, otherwise calculating retry time
        long currentMillis = getCurrentMillis();
        this.retryTime = Optional.ofNullable(retries).map(r -> currentMillis + r.next()).orElse(currentMillis);
    }

    public BulkOperation getOperation() {
        return operation;
    }

    public Context getContext() {
        return context;
    }

    public Iterator<Long> getRetries() {
        return retries;
    }

    public Long getCurrentRetryTime() {
        return this.retryTime;
    }

    public long getCurrentRetryTimeDelay() {
        return this.retryTime - getCurrentMillis();
    }

    public boolean canRetry() {
        return Optional.ofNullable(retries).map(Iterator::hasNext).orElse(true);
    }

    public boolean isSendable() {
        return (this.retryTime - getCurrentMillis()) <= 0;
    }

    private Long getCurrentMillis(){
        return System.nanoTime()/1_000_000L;
    }
}
