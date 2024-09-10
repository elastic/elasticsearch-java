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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._helpers.esql.jdbc.ResultSetEsqlAdapter;
import co.elastic.clients.elasticsearch._helpers.esql.objects.ObjectsEsqlAdapter;
import co.elastic.clients.elasticsearch.esql.query.EsqlFormat;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.testkit.MockHttpClient;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Types;

public class EsqlAdapterTest extends Assertions {

    String json = "{\n" +
        "  \"columns\": [\n" +
        "\t{\"name\": \"avg_salary\", \"type\": \"double\"},\n" +
        "\t{\"name\": \"lang\",   \t\"type\": \"keyword\"}\n" +
        "  ],\n" +
        "  \"values\": [\n" +
        "\t[43760.0, \"Spanish\"],\n" +
        "\t[48644.0, \"French\"],\n" +
        "\t[48832.0, \"German\"]\n" +
        "  ]\n" +
        "}\n";

    ElasticsearchClient esClient = new MockHttpClient()
        .add("/_query", "application/json", json)
        .client(new JacksonJsonpMapper()); // object deserializer needs a buffering mapper

    public static class Data {
        public double avg_salary;
        public String lang;
    }

    @Test
    public void testObjectDeserializer() throws IOException {

        BinaryResponse response = esClient.esql().query(q -> q
            .query("FROM foo")
            .format(EsqlFormat.Json)
        );

        Iterable<Data> data = esClient.esql().query(
            new ObjectsEsqlAdapter<>(Data.class),
            "FROM employees | STATS avg_salary = AVG(salary) by country"
        );

        for (Data d: data) {
            System.out.println(d.lang + " " + d.avg_salary);
        }
    }

    @Test
    public void testResultSetAdapter() throws Exception {

        ResultSet resultSet = esClient.esql().query(
            ResultSetEsqlAdapter.INSTANCE,
            "FROM employees | STATS avg_salary = AVG(salary) by country"
        );

        assertEquals(2, resultSet.getMetaData().getColumnCount());
        assertEquals(Types.DOUBLE, resultSet.getMetaData().getColumnType(1));
        assertEquals(Types.VARCHAR, resultSet.getMetaData().getColumnType(2));

        while (resultSet.next()) {
            System.out.println(resultSet.getDouble("avg_salary") + " " + resultSet.getString(2));
        }
    }
}
