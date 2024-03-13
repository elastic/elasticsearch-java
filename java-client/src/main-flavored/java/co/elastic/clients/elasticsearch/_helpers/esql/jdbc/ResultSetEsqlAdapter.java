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

package co.elastic.clients.elasticsearch._helpers.esql.jdbc;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlAdapterBase;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlMetadata;
import co.elastic.clients.elasticsearch.esql.QueryRequest;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import jakarta.json.stream.JsonParser;

import java.sql.ResultSet;

import java.io.IOException;

public class ResultSetEsqlAdapter extends EsqlAdapterBase<ResultSet> {

    public static final ResultSetEsqlAdapter INSTANCE = new ResultSetEsqlAdapter();

    @Override
    public String format() {
        return "json";
    }

    @Override
    public boolean columnar() {
        return false;
    }

    @Override
    public ResultSet deserialize(ApiClient<ElasticsearchTransport, ?> client, QueryRequest request, BinaryResponse response)
        throws IOException {
        JsonpMapper mapper = client._jsonpMapper();
        JsonParser parser = mapper.jsonProvider().createParser(response.content());
        EsqlMetadata metadata = EsqlAdapterBase.readHeader(parser, mapper);
        return new JdbcResultSet(new JsonpCursor(metadata, parser, mapper));
    }
}
