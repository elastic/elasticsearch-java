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

import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;

import java.util.Iterator;
import java.util.Optional;

class RetryableBulkOperation<Context> {
    private final BulkOperation operation;
    private final Context context;
    private final Iterator<Long> retries;
    private final Long retryTime;

    RetryableBulkOperation(BulkOperation request, Context context, Iterator<Long> retries) {
        this.operation = request;
        this.context = context;
        this.retries = retries;
        // if the retries iterator is null it means that it's not a retry, otherwise calculating retry time
        long currentMillis = currentMillis();
        this.retryTime = Optional.ofNullable(retries).map(r -> currentMillis + r.next()).orElse(currentMillis);
    }

    public BulkOperation operation() {
        return operation;
    }

    public Context context() {
        return context;
    }

    public Iterator<Long> retries() {
        return retries;
    }

    public long currentRetryTimeDelay() {
        return this.retryTime - currentMillis();
    }

    public boolean canRetry() {
        return Optional.ofNullable(retries).map(Iterator::hasNext).orElse(true);
    }

    public boolean isSendable() {
        return (this.retryTime - currentMillis()) <= 0;
    }

    private Long currentMillis(){
        return System.nanoTime()/1_000_000L;
    }
}
