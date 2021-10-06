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

package co.elastic.clients.elasticsearch.end_to_end;

import co.elastic.clients.base.ApiException;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.rest_client.RestClientTransport;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._core.BulkResponse;
import co.elastic.clients.elasticsearch._core.IndexResponse;
import co.elastic.clients.elasticsearch._core.SearchResponse;
import co.elastic.clients.elasticsearch._core.bulk.ResponseItem;
import co.elastic.clients.elasticsearch.cat.NodesResponse;
import co.elastic.clients.elasticsearch.indices.CreateResponse;
import co.elastic.clients.elasticsearch.indices.GetResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.Json;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RequestTest extends Assert {

    private static ElasticsearchContainer container;
    private final JsonpMapper mapper = new JsonbJsonpMapper();

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
    public void testIndexCreation() throws Exception {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);
        ElasticsearchAsyncClient asyncClient = new ElasticsearchAsyncClient(transport);

        // Ping the server
        assertTrue(client.ping().value());

        // Create an index...
        final CreateResponse createResponse = client.indices().create(b -> b.index("my-index"));
        assertTrue(createResponse.acknowledged());
        assertTrue(createResponse.shardsAcknowledged());

        // Find info about it, using the async client
        CompletableFuture<GetResponse> futureResponse = asyncClient.indices().get(b -> b.index("my-index"));
        GetResponse response = futureResponse.get(10, TimeUnit.SECONDS);

        Map<String, IndexState> indices = response.result();

        assertEquals(1, indices.size());
        assertNotNull(indices.get("my-index"));
    }

    @Test
    public void testDataIngestion() throws Exception {

        // Create the low-level client
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        // Build the high-level client
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        String index = "ingest-test";

        // Create an index
        CreateResponse createIndexResponse = client.indices().create(b -> b
            .index(index)
        );

        assertEquals(index, createIndexResponse.index());

        // Check that it actually exists. Example of a boolean response
        BooleanResponse existsResponse = client.indices().exists(b -> b.index(index));
        assertTrue(existsResponse.value());

        // Ingest some data
        AppData appData = new AppData();
        appData.setIntValue(1337);
        appData.setMsg("foo");

        String docId = client.index(b -> b
            .index(index)
            .id("my/Id") // test with url-unsafe string
            .document(appData)
            .refresh(JsonValue.TRUE) // Make it visible for search
        ).id();

        assertEquals("my/Id", docId);

        // Query by id
        AppData esData = client.get(b -> b
                .index(index)
                .id(docId)
            , AppData.class
        ).source();

        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());

        // Search, adding some request options
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
            .addHeader("x-super-header", "bar")
            .build();

        SearchResponse<AppData> search = new ElasticsearchClient(
            ((RestClientTransport) client._transport()).withRequestOptions(options)
        )
            .search(b -> b
                .index(index)
                , AppData.class
        );

        long hits = search.hits().total().value();
        assertEquals(1, hits);

        esData = search.hits().hits().get(0).source();
        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());
    }

    @Test
    public void testCatRequest() throws IOException {
        // Cat requests should have the "format=json" added by the transport

        // Create the low-level client
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        // Build the high-level client
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        NodesResponse nodes = client.cat().nodes(_0 -> _0);
        System.out.println(ModelTestCase.toJson(nodes, mapper));

        assertEquals(1, nodes.valueBody().size());
        assertEquals("*", nodes.valueBody().get(0).master());

    }

    @Test
    public void testBulkRequest() throws IOException {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        AppData appData = new AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        BulkResponse bulk = client.bulk(_0 -> _0
            .addOperation(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("abc")
                )
            )
            .addDocument(appData)
        );

        assertFalse(bulk.errors());
        assertEquals(1, bulk.items().size());
        assertEquals(ResponseItem.CREATE, bulk.items().get(0)._type());
        assertEquals("foo", bulk.items().get(0).create().index());
        assertEquals(1L, bulk.items().get(0).create().version().longValue());
    }

    @Test
    public void testRefresh() throws IOException {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        AppData appData = new AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        IndexResponse ir = client.index(_0 -> _0
            .index("test")
            .id("1")
            .document(appData)
            .refresh(Json.createValue("wait_for"))
        );

        assertEquals("1", ir.id());
    }

    @Test public void errorResponse() throws Exception {

        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new RestClientTransport(restClient, mapper);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        BooleanResponse exists = client.exists(_0 -> _0.index("doesnotexist").id("reallynot"));
        assertFalse(exists.value());

        try {
            co.elastic.clients.elasticsearch._core.GetResponse<String> response = client.get(
                _0 -> _0.index("doesnotexist").id("reallynot"), String.class
            );
        } catch(ApiException apie) {
            ElasticsearchError error = (ElasticsearchError) apie.error();
            assertEquals(404, error.status());
            assertEquals("index_not_found_exception", error.error().asJsonObject().getString("type"));
        }

        try {
            ElasticsearchAsyncClient aClient = new ElasticsearchAsyncClient(transport);
            co.elastic.clients.elasticsearch._core.GetResponse<String> response = aClient.get(
                _0 -> _0.index("doesnotexist").id("reallynot"), String.class
            ).get();
        } catch(ExecutionException ee) {
            ApiException apie = ((ApiException) ee.getCause());
            ElasticsearchError error = (ElasticsearchError) apie.error();
            assertEquals(404, error.status());
            assertEquals("index_not_found_exception", error.error().asJsonObject().getString("type"));
        }
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
