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
import co.elastic.clients.json.JsonpMappingException;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.testkit.MockHttpClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class EsqlAdapterTest extends Assertions {

    String json = "{\n" +
        "  \"took\": 10," +
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
    public void testMissingColumns() throws IOException {
        String badJson = "{\n" +
            "  \"took\": 10," +
            "  \"values\": [\n" +
            "\t[43760.0, \"Spanish\"],\n" +
            "\t[48644.0, \"French\"],\n" +
            "\t[48832.0, \"German\"]\n" +
            "  ]\n" +
            "}\n";

        ElasticsearchClient esClient = new MockHttpClient()
            .add("/_query", "application/json", badJson)
            .client(new JacksonJsonpMapper());

        JsonpMappingException jsonMappingException = assertThrows(JsonpMappingException.class, () -> {
            esClient.esql().query(
                ResultSetEsqlAdapter.INSTANCE,
                "FROM employees | STATS avg_salary = AVG(salary) by country"
            );
        });
        assertTrue(jsonMappingException.getMessage().contains("Expecting a 'columns' property"));
    }

    @Test
    public void testProfilingInfo() throws IOException {
        String badJson = "            {\n" +
                         "               \"took\": 10,\n" +
                         "               \"columns\": [\n" +
                         "                 {\"name\": \"avg_salary\", \"type\": \"double\"},\n" +
                         "                 {\"name\": \"lang\", \"type\": \"keyword\"}\n" +
                         "               ],\n" +
                         "               \"values\": [\n" +
                         "                 [43760.0, \"Spanish\"],\n" +
                         "                 [48644.0, \"French\"],\n" +
                         "                 [48832.0, \"German\"]\n" +
                         "               ],\n" +
                         "               \"profile\": {\n" +
                         "                 \"query\": {\n" +
                         "                   \"start_millis\": 1760459492830,\n" +
                         "                   \"stop_millis\": 1760459492853,\n" +
                         "                   \"took_millis\": 23,\n" +
                         "                   \"took_nanos\": 23290250\n" +
                         "                 }\n" +
                         "               }\n" +
                         "            }";

        ElasticsearchClient esClient = new MockHttpClient()
            .add("/_query", "application/json", badJson)
            .client(new JacksonJsonpMapper());

        esClient.esql().query(
            new ObjectsEsqlAdapter<>(Data.class),
            "FROM employees | STATS avg_salary = AVG(salary) by country"
        );
    }

    @Test
    public void testObjectDeserializer() throws IOException {

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

    @Test
    public void testDenseVector() throws IOException, SQLException {

        String jsonEmbeddings = "{\n" +
                                "  \"took\": 8,\n" +
                                "  \"is_partial\": false,\n" +
                                "  \"completion_time_in_millis\": 1776348683193,\n" +
                                "  \"documents_found\": 1,\n" +
                                "  \"values_loaded\": 252725,\n" +
                                "  \"start_time_in_millis\": 1776348683185,\n" +
                                "  \"expiration_time_in_millis\": 1776780683134,\n" +
                                "  \"columns\": [\n" +
                                "    {\n" +
                                "      \"name\": \"content\",\n" +
                                "      \"type\": \"text\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "      \"name\": \"content.keyword\",\n" +
                                "      \"type\": \"keyword\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "      \"name\": \"embedding\",\n" +
                                "      \"type\": \"dense_vector\"\n" +
                                "    }\n" +
                                "    ],\n" +
                                "  \"values\": [\n" +
                                "[\"some text\",\"id\",[0.1,0.2,0.3]]\n" +
                                "]\n" +
                                "}";

        ElasticsearchClient esClient = new MockHttpClient()
            .add("/_query", "application/json", jsonEmbeddings)
            .client(new JacksonJsonpMapper());

        ResultSet resultSet = esClient.esql().query(
                ResultSetEsqlAdapter.INSTANCE,
                "FROM embeddings");

        assertEquals(3, resultSet.getMetaData().getColumnCount());
        assertEquals(Types.VARCHAR, resultSet.getMetaData().getColumnType(1));
        assertEquals(Types.VARCHAR, resultSet.getMetaData().getColumnType(2));
        assertEquals(Types.ARRAY, resultSet.getMetaData().getColumnType(3));

        while (resultSet.next()) {
            List vec = resultSet.getObject("embedding", List.class);
            assertEquals(3,vec.size());
            System.out.println(resultSet.getString("embedding"));
        }
    }
}
