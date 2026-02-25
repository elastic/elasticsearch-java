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
import co.elastic.clients.elasticsearch.core.bulk.BulkOperationBase;
import co.elastic.clients.elasticsearch.core.bulk.CreateOperation;
import co.elastic.clients.elasticsearch.core.bulk.DeleteOperation;
import co.elastic.clients.elasticsearch.core.bulk.IndexOperation;
import co.elastic.clients.elasticsearch.core.bulk.UpdateOperation;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.util.BinaryData;

import javax.annotation.Nullable;
import java.util.List;

/**
 * A bulk operation whose size has been calculated and content turned to a binary blob (to compute its size).
 */
class IngesterOperation<Context> {
    private final RetryableBulkOperation<Context> repeatableOp;
    private final long size;

    IngesterOperation(RetryableBulkOperation<Context> repeatableOp, long size) {
        this.repeatableOp = repeatableOp;
        this.size = size;
    }

    public static <Context> IngesterOperation<Context> of(RetryableBulkOperation<Context> repeatableOp, JsonpMapper mapper) {
        switch (repeatableOp.operation()._kind()) {
            case Create:
                return createOperation(repeatableOp, mapper);
            case Index:
                return indexOperation(repeatableOp, mapper);
            case Update:
                return updateOperation(repeatableOp, mapper);
            case Delete:
                return deleteOperation(repeatableOp);
            default:
                throw new IllegalStateException("Unknown bulk operation type " + repeatableOp.operation()._kind());
        }
    }

    public RetryableBulkOperation<Context> repeatableOperation() {
        return this.repeatableOp;
    }

    public long size() {
        return this.size;
    }

    public BulkOperation operation() {
        return repeatableOp.operation();
    }

    public Context context() {
        return repeatableOp.context();
    }

    public boolean isSendable() {
        return repeatableOp.isSendable();
    }

    public boolean canRetry() {
        return repeatableOp.canRetry();
    }

    private static <Context> IngesterOperation<Context> createOperation(RetryableBulkOperation<Context> repeatableOp, JsonpMapper mapper) {
        CreateOperation<?> create = repeatableOp.operation().create();
        RetryableBulkOperation<Context> newOperation;

        long size = basePropertiesSize(create);

        if (create.document() instanceof BinaryData) {
            newOperation = repeatableOp;
            size += ((BinaryData) create.document()).size();

        } else {
            BinaryData binaryDoc = BinaryData.of(create.document(), mapper);
            size += binaryDoc.size();
            newOperation = new RetryableBulkOperation<>(BulkOperation.of(bo -> bo.create(idx -> {
                copyCreateProperties(create, idx);
                return idx.document(binaryDoc);
            })),repeatableOp.context(),repeatableOp.retries());
        }

        return new IngesterOperation<>(newOperation, size);
    }

    private static <Context> IngesterOperation<Context> indexOperation(RetryableBulkOperation<Context> repeatableOp, JsonpMapper mapper) {
        IndexOperation<?> index = repeatableOp.operation().index();
        RetryableBulkOperation<Context> newOperation;

        long size = basePropertiesSize(index);

        if (index.document() instanceof BinaryData) {
            newOperation = repeatableOp;
            size += ((BinaryData) index.document()).size();

        } else {
            BinaryData binaryDoc = BinaryData.of(index.document(), mapper);
            size += binaryDoc.size();
            newOperation = new RetryableBulkOperation<>(BulkOperation.of(bo -> bo.index(idx -> {
                copyIndexProperties(index, idx);
                return idx.document(binaryDoc);
            })),repeatableOp.context(),repeatableOp.retries());
        }

        return new IngesterOperation<>(newOperation, size);
    }

    private static <Context> IngesterOperation<Context> updateOperation(RetryableBulkOperation<Context> repeatableOp, JsonpMapper mapper) {
        UpdateOperation<?, ?> update = repeatableOp.operation().update();
        RetryableBulkOperation<Context> newOperation;

        long size = basePropertiesSize(update) +
            size("retry_on_conflict", update.retryOnConflict()) +
            size("require_alias", update.requireAlias());

        if (update.binaryAction() != null) {
            newOperation = repeatableOp;
            size += update.binaryAction().size();

        } else {
            BinaryData action = BinaryData.of(update.action(), mapper);
            size += action.size();
            newOperation = new RetryableBulkOperation<>(BulkOperation.of(bo -> bo.update(u -> {
                copyBaseProperties(update, u);
                return u
                    .binaryAction(action)
                    .requireAlias(update.requireAlias())
                    .retryOnConflict(update.retryOnConflict());
            })),repeatableOp.context(),repeatableOp.retries());
        }

        return new IngesterOperation<>(newOperation, size);
    }

    private static <Context> IngesterOperation<Context> deleteOperation(RetryableBulkOperation<Context> repeatableOp) {
        DeleteOperation delete = repeatableOp.operation().delete();
        return new IngesterOperation<>(repeatableOp, basePropertiesSize(delete));
    }


    private static void copyBaseProperties(BulkOperationBase op, BulkOperationBase.AbstractBuilder<?> builder) {
        builder
            .id(op.id())
            .index(op.index())
            .ifPrimaryTerm(op.ifPrimaryTerm())
            .ifSeqNo(op.ifSeqNo())
            .routing(op.routing())
            .version(op.version())
            .versionType(op.versionType());
    }

    private static void copyIndexProperties(IndexOperation<?> op, IndexOperation.Builder<?> builder) {
        copyBaseProperties(op, builder);
        builder.pipeline(op.pipeline());
        builder.requireAlias(op.requireAlias());
    }

    private static void copyCreateProperties(CreateOperation<?> op, CreateOperation.Builder<?> builder) {
        copyBaseProperties(op, builder);
        builder.pipeline(op.pipeline());
        builder.requireAlias(op.requireAlias());
    }

    private static int size(String name, @Nullable Boolean value) {
        if (value != null) {
            return name.length() + 12; // 12 added chars for "name":"false",
        } else {
            return 0;
        }
    }

    private static int size(String name, @Nullable String value) {
        if (value != null) {
            return name.length() + value.length() + 6; // 6 added chars for "name":"value",
        } else {
            return 0;
        }
    }

    private static int size(String name, @Nullable Long value) {
        if (value != null) {
            // Borrowed from Long.toUnsignedString0, shift = 3 (base 10 is closer to 3 than 4)
            int mag = Integer.SIZE - Long.numberOfLeadingZeros(value);
            int chars = Math.max(((mag + (3 - 1)) / 3), 1);
            return name.length() + chars + 4; // 4 added chars for "name":,
        } else {
            return 0;
        }
    }

    private static int size(String name, @Nullable Integer value) {
        if (value != null) {
            // Borrowed from Integer.toUnsignedString0, shift = 3 (base 10 is closer to 3 than 4)
            int mag = Integer.SIZE - Integer.numberOfLeadingZeros(value);
            int chars = Math.max(((mag + (3 - 1)) / 3), 1);
            return name.length() + chars + 4;
        } else {
            return 0;
        }
    }

    private static int size(String name, @Nullable JsonEnum value) {
        if (value != null) {
            return name.length() + value.jsonValue().length() + 6;
        } else {
            return 0;
        }
    }

    private static int size(String name, @Nullable List<String> value) {
        if (value != null) {
            if (value.isEmpty()) {
                return name.length() + 6; // 6 added chars for empty array "name":[],
            }
            int listSize = 0;
            for (String item : value) {
                listSize += item.length();
                listSize += 2; // +2 quotes each item
            }
            listSize += value.size()-1 ; // +1 comma between each item
            return name.length() + listSize + 6; // "name":["item1","item2","item3"],
        } else {
            return 0;
        }
    }

    private static int basePropertiesSize(BulkOperationBase op) {
        return
            size("id", op.id()) +
                size("index", op.index()) +
                size("if_primary_term", op.ifPrimaryTerm()) +
                size("if_seq_no", op.ifSeqNo()) +
                size("routing", op.routing()) +
                size("version", op.version()) +
                size("version_type", op.versionType()) +
                4; // Open/closing brace, 2 newlines
    }
}
