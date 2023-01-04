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

/**
 * A bulk operation whose size has been calculated and content turned to a binary blob (to compute its size).
 */
public class IngesterOperation {
    private final BulkOperation operation;
    private final long size;

    public IngesterOperation(BulkOperation operation, long size) {
        this.operation = operation;
        this.size = size;
    }

    public static IngesterOperation of(BulkOperation operation, JsonpMapper mapper) {
        switch (operation._kind()) {
            case Create:
                return createOperation(operation, mapper);
            case Index:
                return indexOperation(operation, mapper);
            case Update:
                return updateOperation(operation, mapper);
            case Delete:
                return deleteOperation(operation);
            default:
                throw new IllegalStateException("Unknown bulk operation type " + operation._kind());
        }
    }

    public BulkOperation operation() {
        return this.operation;
    }

    public long size() {
        return this.size;
    }

    private static IngesterOperation createOperation(BulkOperation operation, JsonpMapper mapper) {
        CreateOperation<?> create = operation.create();
        BulkOperation newOperation;

        long size = basePropertiesSize(create);

        if (create.document() instanceof BinaryData) {
            newOperation = operation;
            size += ((BinaryData) create.document()).size();

        } else {
            BinaryData binaryDoc = BinaryData.of(create.document(), mapper);
            size += binaryDoc.size();
            newOperation = BulkOperation.of(bo -> bo.create(idx -> {
                copyBaseProperties(create, idx);
                return idx.document(binaryDoc);
            }));
        }

        return new IngesterOperation(newOperation, size);
    }

    private static IngesterOperation indexOperation(BulkOperation operation, JsonpMapper mapper) {
        IndexOperation<?> index = operation.index();
        BulkOperation newOperation;

        long size = basePropertiesSize(index);

        if (index.document() instanceof BinaryData) {
            newOperation = operation;
            size += ((BinaryData) index.document()).size();

        } else {
            BinaryData binaryDoc = BinaryData.of(index.document(), mapper);
            size += binaryDoc.size();
            newOperation = BulkOperation.of(bo -> bo.index(idx -> {
                copyBaseProperties(index, idx);
                return idx.document(binaryDoc);
            }));
        }

        return new IngesterOperation(newOperation, size);
    }

    private static IngesterOperation updateOperation(BulkOperation operation, JsonpMapper mapper) {
        UpdateOperation<?, ?> update = operation.update();
        BulkOperation newOperation;

        long size = basePropertiesSize(update) +
            size("retry_on_conflict", update.retryOnConflict()) +
            size("require_alias", update.requireAlias());

        if (update.binaryAction() != null) {
            newOperation = operation;
            size += update.binaryAction().size();

        } else {
            BinaryData action = BinaryData.of(update.action(), mapper);
            size += action.size();
            newOperation = BulkOperation.of(bo -> bo.update(u -> {
                copyBaseProperties(update, u);
                return u
                    .binaryAction(action)
                    .requireAlias(update.requireAlias())
                    .retryOnConflict(update.retryOnConflict());
            }));
        }

        return new IngesterOperation(newOperation, size);
    }

    private static IngesterOperation deleteOperation(BulkOperation operation) {
        DeleteOperation delete = operation.delete();
        return new IngesterOperation(operation, basePropertiesSize(delete));
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
