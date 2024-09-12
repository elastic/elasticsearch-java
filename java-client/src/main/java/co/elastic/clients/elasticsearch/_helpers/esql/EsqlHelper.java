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

package co.elastic.clients.elasticsearch._helpers.esql;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch.esql.ElasticsearchEsqlAsyncClient;
import co.elastic.clients.elasticsearch.esql.ElasticsearchEsqlClient;
import co.elastic.clients.elasticsearch.esql.QueryRequest;
import co.elastic.clients.elasticsearch.esql.query.EsqlFormat;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.transport.endpoints.BinaryResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EsqlHelper {

    //----- Synchronous

    public static <T> T query(
        ElasticsearchEsqlClient client, EsqlAdapter<T> adapter, String query, Object... params
    ) throws IOException {
        QueryRequest request = buildRequest(adapter, query, params);
        BinaryResponse response = client.query(request);
        return adapter.deserialize(client, request, response);
    }

    public static <T> T query(ElasticsearchEsqlClient client, EsqlAdapter<T> adapter, QueryRequest request) throws IOException {
        request = buildRequest(adapter, request);
        BinaryResponse response = client.query(request);
        return adapter.deserialize(client, request, response);
    }

    //----- Asynchronous

    public static <T> CompletableFuture<T> queryAsync(
        ElasticsearchEsqlAsyncClient client, EsqlAdapter<T> adapter, String query, Object... params
    ) {
        return doQueryAsync(client, adapter, buildRequest(adapter, query, params));
    }

    public static <T> CompletableFuture<T> queryAsync(
        ElasticsearchEsqlAsyncClient client, EsqlAdapter<T> adapter, QueryRequest request
    ) {
        return doQueryAsync(client, adapter, buildRequest(adapter, request));
    }

    private static <T> CompletableFuture<T> doQueryAsync(
        ElasticsearchEsqlAsyncClient client, EsqlAdapter<T> adapter, QueryRequest request
    ) {
        return client
            .query(request)
            .thenApply(r -> {
                try {
                    return adapter.deserialize(client, request, r);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
    }

    //----- Utilities

    private static QueryRequest buildRequest(EsqlAdapter<?> adapter, String query, Object... params) {
        return QueryRequest.of(esql -> esql
            .format(EsqlFormat._DESERIALIZER.parse(adapter.format()))
            .columnar(adapter.columnar())
            .query(query)
            .params(asFieldValues(params))
        );
    }

    private static QueryRequest buildRequest(EsqlAdapter<?> adapter, QueryRequest request) {
        return QueryRequest.of(q -> q
            // Set/override format and columnar
            .format(EsqlFormat._DESERIALIZER.parse(adapter.format()))
            .columnar(adapter.columnar())

            .delimiter(request.delimiter())
            .filter(request.filter())
            .locale(request.locale())
            .params(request.params())
            .query(request.query())
        );
    }

    private static List<FieldValue> asFieldValues(Object... objects) {

        List<FieldValue> result = new ArrayList<>(objects.length);
        for (Object object: objects) {
            result.add(FieldValue.of(JsonData.of(object)));
        }

        return result;
    }
}
