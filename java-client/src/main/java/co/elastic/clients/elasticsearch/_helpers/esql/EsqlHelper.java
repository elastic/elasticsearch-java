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
import co.elastic.clients.elasticsearch.esql.ElasticsearchEsqlClient;
import co.elastic.clients.elasticsearch.esql.QueryRequest;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.transport.endpoints.BinaryResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EsqlHelper {

    public static <T> T query(ElasticsearchEsqlClient client, EsqlAdapter<T> deserializer, String query, Object... params)
        throws IOException {

        QueryRequest request = QueryRequest.of(esql -> esql
            .format(deserializer.format())
            .columnar(deserializer.columnar())
            .query(query)
            .params(asFieldValues(params))
        );

        String json = JsonpUtils.toJsonString(request, client._jsonpMapper());

        BinaryResponse response = client.query(request);
        return deserializer.deserialize(client, request, response);
    }

    public static <T> T query(ElasticsearchEsqlClient client, EsqlAdapter<T> deserializer, QueryRequest request) throws IOException {

        QueryRequest esql = QueryRequest.of(q -> q
            // Set/override format and columnar
            .format(deserializer.format())
            .columnar(deserializer.columnar())

            .delimiter(request.delimiter())
            .filter(request.filter())
            .locale(request.locale())
            .params(request.params())
            .query(request.query())
        );

        // FIXME: set columnar and format form adapter
        BinaryResponse response = client.query(request);
        return deserializer.deserialize(client, request, response);
    }

    private static List<FieldValue> asFieldValues(Object... objects) {

        List<FieldValue> result = new ArrayList<>(objects.length);
        for (Object object: objects) {
            result.add(FieldValue.of(JsonData.of(object)));
        }

        return result;
    }
}
