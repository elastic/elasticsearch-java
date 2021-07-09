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

package co.elastic.clients.elasticsearch.experiments;


import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.RestClientTransport;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._global.SearchResponse;
import co.elastic.clients.elasticsearch.indices.CreateResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.JsonValue;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

public class RequestTest extends Assert {

    private static ElasticsearchContainer container;

    @BeforeClass
    public static void setup() {
        container = new ElasticsearchContainer("docker.elastic.co/elasticsearch/elasticsearch:7.12.1")
            .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
            .withStartupTimeout(Duration.ofSeconds(30));
        container.start();

    }

    @AfterClass
    public static void tearDown() {
        if (container != null) {
            container.stop();
        }
    }

    @Test
    public void testIndexCreation() throws IOException {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new RestClientTransport(restClient, new JsonbJsonpMapper());
        ElasticsearchClient client = new ElasticsearchClient(transport);

        // Ping the server
        assertTrue(client.ping().value());

        // Create an index...
        final CreateResponse createResponse = client.indices().create(b -> b.index("my-index"));
        assertTrue(createResponse.acknowledged());
        assertTrue(createResponse.shardsAcknowledged());

        //
        final Map<String, IndexState> indices = client.indices().get(b -> b.index("my-index")).value();
        assertEquals(1, indices.size());

        assertNotNull(indices.get("my-index"));
    }

    @Test
    public void testDataIngestion() throws Exception {

        // Create the low-level client
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        // Build the high-level client
        Transport transport = new RestClientTransport(restClient, new JsonbJsonpMapper());
        ElasticsearchClient client = new ElasticsearchClient(transport);

        // Create an index
        CreateResponse createIndexResponse = client.indices().create(b -> b
            .index("test")
        );

        assertEquals("test", createIndexResponse.index());

        // Check that it actually exists. Example of a boolean response
        BooleanResponse existsResponse = client.indices().exists(b -> b.index("test"));
        assertTrue(existsResponse.value());

        // Ingest some data
        AppData appData = new AppData();
        appData.setIntValue(1337);
        appData.setMsg("foo");

        String docId = client.index(b -> b
            .index("test")
            .id("myId")
            .value(appData)
            .refresh(JsonValue.TRUE) // Make it visible for search
        ).id();

        // Query by id
        AppData esData = client.get(b -> b
                .index("test")
                .id(docId)
            , AppData.class
        ).source();

        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());

        // Search, adding some request options
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
            .addHeader("x-super-header", "bar")
            .build();

        SearchResponse<AppData> search = client
            .withRequestOptions(options)
            .search(b -> b
                .index("test")
                , AppData.class
        );

        int hits = search.hits().total().asJsonObject().getInt("value"); // union types not handled yet
        assertEquals(1, hits);

        esData = search.hits().hits().get(0).source();
        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());
    }

    public static class AppData {
        private int intValue;
        private String msg;

        public int getIntValue() {
            return intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
