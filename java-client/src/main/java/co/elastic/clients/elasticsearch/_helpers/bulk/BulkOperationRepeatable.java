package co.elastic.clients.elasticsearch._helpers.bulk;

import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Optional;

public class BulkOperationRepeatable<Context> {
    private final BulkOperation operation;
    private final Context context;
    private final Optional<Iterator<Long>> retries;
    private Instant nextRetry;

    public BulkOperationRepeatable(BulkOperation request, Context context, Optional<Iterator<Long>> retries) {
        this.operation = request;
        this.context = context;
        this.retries = retries;
        this.nextRetry = Instant.now().plus(retries.map(Iterator::next).orElse(0L), ChronoUnit.MILLIS);
    }

    public BulkOperation getOperation() {
        return operation;
    }

    public Context getContext() {
        return context;
    }

    public Optional<Iterator<Long>> getRetries() {
        return retries;
    }

    public Instant getNextRetry() {
        return this.nextRetry;
    }

    public boolean canRetry() {
        return this.retries.map(Iterator::hasNext).orElse(true);
    }
}
