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

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch._helpers.esql.jdbc.ResultSetEsqlAdapter;
import co.elastic.clients.elasticsearch._helpers.esql.objects.ObjectsEsqlAdapter;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.http.TransportHttpClient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class EsqlAdapterEndToEndTest extends Assertions {

    static ElasticsearchClient esClient;

    @BeforeAll
    public static void setup() throws Exception {
        var server = ElasticsearchTestServer.global();
        esClient = ElasticsearchTestClient.createClient(server.url(), new JacksonJsonpMapper(), server.sslContext(), null);

        // Make sure index is empty
        esClient.indices().delete(d -> d.index("employees").ignoreUnavailable(true));

        // Upload bulk data
        TransportHttpClient httpClient = ((ElasticsearchTransportBase)esClient._transport()).httpClient();
        ByteBuffer body;
        try (InputStream data = EsqlAdapterTest.class.getResourceAsStream("employees.ndjson")) {
            body = ByteBuffer.wrap(data.readAllBytes());
        }

        TransportHttpClient.Request request = new TransportHttpClient.Request(
            "POST", "/employees/_bulk",
            Map.of("refresh", "true"),
            Map.of("Content-Type", "application/vnd.elasticsearch+json; compatible-with=9" /*, "Accept", "application/json"*/),
            List.of(body)
        );

        var response = httpClient.performRequest("bulk", null, request, null);

        if (response.statusCode() != 200) {
            fail("Unexpected response code: " + response.statusCode() + " - "
                + new String(response.body().asByteBuffer().array(), StandardCharsets.UTF_8));
        }
    }

    @Test
    public void resultSetTest() throws Exception {

        ResultSet rs = esClient.esql().query(
            ResultSetEsqlAdapter.INSTANCE,
            "FROM employees | WHERE emp_no == ? or emp_no == ? | KEEP emp_no, job_positions, hire_date | " +
                "SORT emp_no | LIMIT 300",
            // Testing parameters. Note that FROM and LIMIT do not accept parameters
            "10042", "10002"
        );

        {
            assertTrue(rs.next());
            assertEquals("10002", rs.getString("emp_no"));

            // Single valued fields come back as single value even if other rows have multiple values
            @SuppressWarnings("unchecked")
            String job = (String) rs.getObject("job_positions");
            assertEquals("Senior Team Lead", job);
        }

        {
            assertTrue(rs.next());
            assertEquals("10042", rs.getString("emp_no"));

            java.sql.Date hireDate = rs.getDate("hire_date");
            assertEquals("1993-03-21", hireDate.toString());

            Timestamp hireDate1 = rs.getTimestamp("hire_date");
            assertEquals(
                "1993-03-21T00:00:00Z[UTC]",
                DateTimeFormatter.ISO_DATE_TIME.format(hireDate1.toInstant().atZone(ZoneId.of("UTC")))
            );

            @SuppressWarnings("unchecked")
            List<String> jobs = (List<String>) rs.getObject("job_positions");

            assertEquals(4, jobs.size());
            assertEquals("Architect", jobs.get(0));
        }

        assertFalse(rs.next());
    }

    @Test
    public void objectsTest() throws Exception {
        Iterable<EmpData> result = esClient.esql().query(
            ObjectsEsqlAdapter.of(EmpData.class),
            "FROM employees | WHERE emp_no == ? or emp_no == ? | KEEP emp_no, job_positions, hire_date | " +
                "SORT emp_no | LIMIT 300",
            // Testing parameters. Note that FROM and LIMIT do not accept parameters
            "10042", "10002"
        );

        Iterator<EmpData> it = result.iterator();

        {
            EmpData emp = it.next();
            assertEquals("10002", emp.empNo);
            List<String> jobPositions = emp.jobPositions;
            // In addition to the value, this tests that single strings are correctly deserialized as a list
            assertEquals(Arrays.asList("Senior Team Lead"), emp.jobPositions);
        }

        {
            EmpData emp = it.next();
            assertEquals("10042", emp.empNo);
            assertEquals(4, emp.jobPositions.size());
            assertTrue(emp.jobPositions.contains("Architect"));
            assertTrue(emp.jobPositions.contains("Business Analyst"));
            assertTrue(emp.jobPositions.contains("Internship"));
            assertTrue(emp.jobPositions.contains("Junior Developer"));

            assertEquals("1993-03-21T00:00:00Z[UTC]",
                DateTimeFormatter.ISO_DATE_TIME.format(emp.hireDate.toInstant().atZone(ZoneId.of("UTC")))
            );
        }

        assertFalse(it.hasNext());

    }

    @Test
    public void asyncObjects() throws Exception {

        ElasticsearchAsyncClient asyncClient = new ElasticsearchAsyncClient(esClient._transport(),
            esClient._transportOptions());


        CompletableFuture<Iterable<EmpData>> future = asyncClient.esql().query(
            ObjectsEsqlAdapter.of(EmpData.class),
            "FROM employees | WHERE emp_no == ? or emp_no == ? | KEEP emp_no, job_positions, hire_date | " +
                "SORT emp_no | LIMIT 300",
            // Testing parameters. Note that FROM and LIMIT do not accept parameters
            "10042", "10002"
        );

        future.thenApply(result -> {
                Iterator<EmpData> it = result.iterator();

                {
                    EmpData emp = it.next();
                    assertEquals("10002", emp.empNo);
                    List<String> jobPositions = emp.jobPositions;
                    // In addition to the value, this tests that single strings are correctly deserialized
                    // as a list
                    assertEquals(Arrays.asList("Senior Team Lead"), emp.jobPositions);
                }

                {
                    EmpData emp = it.next();
                    assertEquals("10042", emp.empNo);
                    assertEquals(4, emp.jobPositions.size());
                    assertTrue(emp.jobPositions.contains("Architect"));
                    assertTrue(emp.jobPositions.contains("Business Analyst"));
                    assertTrue(emp.jobPositions.contains("Internship"));
                    assertTrue(emp.jobPositions.contains("Junior Developer"));

                    assertEquals("1993-03-21T00:00:00Z[UTC]",
                        DateTimeFormatter.ISO_DATE_TIME.format(emp.hireDate.toInstant().atZone(ZoneId.of(
                            "UTC")))
                    );
                }

                assertFalse(it.hasNext());
                return null;
            }
        ).get();
    }

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EmpData {
        public String empNo;
        public java.util.Date hireDate;
        public List<String> jobPositions;
    }
}
