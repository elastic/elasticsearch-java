package co.elastic.clients.elasticsearch._helpers.bulk;

import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Optional;

public class BulkOperationRepeatable<Context> {
    private final BulkOperation operation;
    private final Context context;
    private final Iterator<Long> retries;
    private Instant retryTime;

    public BulkOperationRepeatable(BulkOperation request, Context context, Iterator<Long> retries) {
        this.operation = request;
        this.context = context;
        this.retries = retries;
        // if the retries iterator is null it means that it's not a retry, otherwise calculating retry time
        this.retryTime = Optional.ofNullable(retries).map(r -> Instant.now().plus(r.next(), ChronoUnit.MILLIS)).orElse(Instant.now());
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

//    public Instant getCurrentRetryTime() {
//        return this.retryTime;
//    }
//
//    public Instant getNextRetryTime() {
//        return Instant.now().plus(retries.next(), ChronoUnit.MILLIS);
//    }

    public boolean isSendable() {
        return retryTime.isBefore(Instant.now());
    }
}
