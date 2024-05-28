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

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.aggregations.HistogramAggregate;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch.cat.NodesResponse;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.ClearScrollResponse;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.MsearchResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.bulk.OperationType;
import co.elastic.clients.elasticsearch.core.msearch.RequestItem;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.elasticsearch.indices.DiskUsageResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.elasticsearch.indices.GetIndicesSettingsResponse;
import co.elastic.clients.elasticsearch.indices.GetMappingResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ContentType;
import co.elastic.clients.util.DateTime;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RequestTest extends Assertions {

    static ElasticsearchClient client;

    @BeforeAll
    public static void setup() {
        client = ElasticsearchTestServer.global().client();
    }

    @Test
    public void testCount() throws Exception {
        // Tests that a no-parameter method exists for endpoints that only have optional properties
        assertTrue(client.count().count() >= 0);
    }

    @Test
    public void testBuildTime() throws Exception {
        DateTime buildTime = client.info().version().buildDate();
        Instant early2020 = DateTimeFormatter.ISO_INSTANT.parse("2020-01-01T00:00:00Z", Instant::from);

        assertTrue(early2020.isBefore(buildTime.toInstant()));
    }

    @Test
    public void testIndexCreation() throws Exception {
        ElasticsearchAsyncClient asyncClient = new ElasticsearchAsyncClient(client._transport());

        // Ping the server
        assertTrue(client.ping().value());

        // Create an index...
        final CreateIndexResponse createResponse = client.indices().create(b -> b.index("my-index"));
        assertTrue(createResponse.acknowledged());
        assertTrue(createResponse.shardsAcknowledged());

        // Find info about it, using the async client
        CompletableFuture<GetIndexResponse> futureResponse = asyncClient.indices().get(b -> b.index("my-index"));
        GetIndexResponse response = futureResponse.get(10, TimeUnit.SECONDS);

        Map<String, IndexState> indices = response.result();

        assertEquals(1, indices.size());
        assertNotNull(indices.get("my-index"));
    }

    @Test
    public void testDataIngestion() throws Exception {

        String index = "ingest-test";

        // Create an index
        CreateIndexResponse createIndexResponse = client.indices().create(b -> b
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
            .refresh(Refresh.True) // Make it visible for search
        ).id();

        assertEquals("my/Id", docId);

        // Check auto-created mapping
        GetMappingResponse mapping = client.indices().getMapping(b -> b.index(index));
        assertEquals(
            Property.Kind.Long,
            mapping.get("ingest-test").mappings().properties().get("intValue")._kind()
        );

        // Query by id
        AppData esData = client.get(b -> b
                .index(index)
                .id(docId)
            , AppData.class
        ).source();

        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());

        // Query by id a non-existing document
        final GetResponse<AppData> notExists = client.get(b -> b
                .index(index)
                .id("some-random-id")
            , AppData.class
        );

        assertFalse(notExists.found());
        assertNull(notExists.source());

        // Search
        SearchResponse<AppData> search = client.search(b -> b
                .index(index)
                , AppData.class
        );

        long hits = search.hits().total().value();
        assertEquals(1, hits);

        esData = search.hits().hits().get(0).source();
        assertEquals(1337, esData.getIntValue());
        assertEquals("foo", esData.getMsg());

        RequestItem item = RequestItem.of(_1 -> _1
                .header(_2 -> _2.index("test"))
                .body(_2 -> _2.size(4))
            );

        // MSearch: 1st search on an existing index, 2nd one on a non-existing index
        final MsearchResponse<AppData> msearch = client.msearch(_0 -> _0
            .searches(_1 -> _1
                .header(_3 -> _3.index(index))
                .body(_3 -> _3.query(_4 -> _4.matchAll(_5 -> _5)))
            ).searches(_1 -> _1
                .header(_3 -> _3.index("non-existing"))
                .body(_3 -> _3.query(_4 -> _4.matchAll(_5 -> _5)))
            )
        , AppData.class);

        assertEquals(2, msearch.responses().size());
        assertTrue(msearch.responses().get(0).isResult());
        assertEquals(1, msearch.responses().get(0).result().hits().hits().size());
        assertTrue(msearch.responses().get(1).isFailure());
        assertEquals(404, msearch.responses().get(1).failure().status());
    }

    @Test
    public void testBinaryDataIngestion() throws IOException {
        String index = "binary-ingestion-test";
        String id = "foo-bar";

        BinaryData data = BinaryData.of("{\"foo\":\"bar\"}".getBytes(), ContentType.APPLICATION_JSON);

        client.index(i -> i
            .index(index)
            .id(id)
            .document(data)
            .refresh(Refresh.True)
        );

        GetResponse<BinaryData> getResponse = client.get(g -> g
                .index(index)
                .id(id)
            , BinaryData.class
        );

        assertEquals(id, getResponse.id());
        assertEquals(
            "{\"foo\":\"bar\"}",
            new String(getResponse.source().asByteBuffer().array(), StandardCharsets.UTF_8)
        );
    }

    @Test
    public void testMappingWithType() throws IOException {
        String index = "mapping-with-type";

        // Ingest some data
        Map<String, AppData> map = new HashMap<>();
        AppData appData = new AppData();
        appData.setIntValue(1);
        appData.setMsg("foo");
        map.put("foo", appData);
        appData = new AppData();
        appData.setIntValue(2);
        appData.setMsg("bar");
        map.put("bar", appData);

        String id = client.index(i -> i.index(index).document(map)).id();

        TypeReference<Map<String, AppData>> typeRef = new TypeReference<Map<String, AppData>>() {};

        Map<String, AppData> result = client.<Map<String, AppData>>get(g -> g.index(index).id(id), typeRef.getType()).source();
        assertEquals(1, result.get("foo").intValue);
        assertEquals(2, result.get("bar").intValue);

    }

    @Test
    public void testCatRequest() throws IOException {
        // Cat requests should have the "format=json" added by the transport
        NodesResponse nodes = client.cat().nodes(_0 -> _0);
        System.out.println(ModelTestCase.toJson(nodes, client._transport().jsonpMapper()));

        assertEquals(1, nodes.valueBody().size());
        assertEquals("*", nodes.valueBody().get(0).master());
    }

    @Test
    public void testBulkRequest() throws IOException {
        AppData appData = new AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        BulkResponse bulk = client.bulk(_0 -> _0
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("abc")
                    .document(appData)
            ))
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("def")
                    .document(appData)
            ))
            .operations(_1 -> _1
                .update(_2 -> _2
                    .index("foo")
                    .id("gh")
                    .action(_3 -> _3
                        .docAsUpsert(true)
                        .doc(appData))
                )
            )
        );

        assertFalse(bulk.errors());
        assertEquals(3, bulk.items().size());
        assertEquals(OperationType.Create, bulk.items().get(0).operationType());
        assertEquals("foo", bulk.items().get(0).index());
        assertEquals(1L, bulk.items().get(0).version().longValue());
        assertEquals("foo", bulk.items().get(1).index());
        assertEquals(1L, bulk.items().get(1).version().longValue());
        assertEquals(42, client.get(b -> b.index("foo").id("gh"), AppData.class).source().intValue);
    }

    @Test
    public void testRefresh() throws IOException {
        AppData appData = new AppData();
        appData.setIntValue(42);
        appData.setMsg("Some message");

        IndexResponse ir = client.index(_0 -> _0
            .index("test")
            .id("1")
            .document(appData)
            .refresh(Refresh.WaitFor)
        );

        assertEquals("1", ir.id());
    }

    @Test public void errorResponse() throws Exception {
        BooleanResponse exists = client.exists(_0 -> _0.index("doesnotexist").id("reallynot"));
        assertFalse(exists.value());

        ElasticsearchException ex = assertThrows(ElasticsearchException.class, () -> {
            GetResponse<String> response = client.get(
                _0 -> _0.index("doesnotexist").id("reallynot"), String.class
            );
        });

        assertEquals("es/get", ex.endpointId());
        assertEquals(404, ex.status());
        assertEquals("index_not_found_exception", ex.error().type());
        assertEquals("doesnotexist", ex.error().metadata().get("index").to(String.class));


        ExecutionException ee = assertThrows(ExecutionException.class, () -> {
            ElasticsearchAsyncClient aClient = new ElasticsearchAsyncClient(client._transport());
            GetResponse<String> response = aClient.get(
                _0 -> _0.index("doesnotexist").id("reallynot"), String.class
            ).get();
        });

        ex = ((ElasticsearchException) ee.getCause());
        assertEquals("es/get", ex.endpointId());
        assertEquals(404, ex.status());
        assertEquals("index_not_found_exception", ex.error().type());
    }

    @Test
    public void testErrorStatusCodeWithValidResponse() throws IOException {
        // https://github.com/elastic/elasticsearch-java/issues/36

        // Some endpoints return a faulty status code 404 with a valid response.
        // Transports should first try to decode an error, and if they fail because of missing properties for
        // the error type, then try to decode the regular request.

        final ClearScrollResponse clearResponse = client.clearScroll(b -> b.scrollId(
            "DXF1ZXJ5QW5kRmV0Y2gBAAAAAAAAAD4WYm9laVYtZndUQlNsdDcwakFMNjU1QQ==")
        );
        assertEquals(0, clearResponse.numFreed());

        final ClosePointInTimeResponse closeResponse = client.closePointInTime(b -> b.id(
            "46ToAwMDaWR5BXV1aWQyKwZub2RlXzMAAAAAAAAAACoBYwADaWR4BXV1aWQxAgZub2RlXzEAAAAAAAAAAAEBY" +
                "QADaWR5BXV1aWQyKgZub2RlXzIAAAAAAAAAAAwBYgACBXV1aWQyAAAFdXVpZDEAAQltYXRjaF9hbGw_gAAAAA=="));
        assertEquals(0, closeResponse.numFreed());
    }

    @Test
    public void testSearchAggregation() throws IOException {

        client.create(_1 -> _1.index("products").id("A").document(new Product(5)).refresh(Refresh.True));
        client.create(_1 -> _1.index("products").id("B").document(new Product(15)).refresh(Refresh.True));
        client.create(_1 -> _1.index("products").id("C").document(new Product(25)).refresh(Refresh.True));

        SearchResponse<Product> searchResponse = client.search(_1 -> _1
            .index("products")
            .size(0)
            .aggregations(
                "prices", _3 -> _3
                .histogram(_4 -> _4
                    .field("price")
                    .interval(10.0)
                ).aggregations(
                    "average", _5 -> _5
                    .avg(_6 -> _6.field("price"))
                )
            )
            , Product.class
        );

        HistogramAggregate prices = searchResponse.aggregations().get("prices").histogram();
        assertEquals(3, prices.buckets().array().size());
        assertEquals(1, prices.buckets().array().get(0).docCount());
        assertEquals(5.0, prices.buckets().array().get(0).aggregations().get("average").avg().value(), 0.01);

        // We've set "size" to zero
        assertEquals(0, searchResponse.hits().hits().size());

    }

    @Test
    public void testGetMapping() throws Exception {
        // See also VariantsTest.testNestedTaggedUnionWithDefaultTag()
        // and https://github.com/elastic/elasticsearch-java/issues/45
        String index = "testindex";

        Map<String, Property> fields = Collections.singletonMap("keyword", Property.of(p -> p.keyword(k -> k.ignoreAbove(256))));
        Property text = Property.of(p -> p.text(t -> t.fields(fields)));

        client.indices().create(c -> c
            .index(index)
            .mappings(m -> m
                .properties("id", text)
                .properties("name", p -> p
                    .object(o -> o
                        .properties("first", text)
                        .properties("last", text)
                    )
                )
            )
        );

        GetMappingResponse mr = client.indices().getMapping(mrb -> mrb.index(index));

        assertNotNull(mr.result().get(index));
        assertNotNull(mr.result().get(index).mappings().properties().get("name").object());
    }

    @Test
    public void testDefaultIndexSettings() throws IOException {
        //https://github.com/elastic/elasticsearch-java/issues/46

        String index = "index-settings";
        client.index(_1 -> _1.index(index).document(new Product(5)).refresh(Refresh.True));

        GetIndicesSettingsResponse settings;
        settings = client.indices().getSettings(b -> b.index(index).includeDefaults(true));
        assertNotNull(settings.get(index).defaults());

        settings = client.indices().getSettings(b -> b.index(index));
        assertNull(settings.get(index).defaults());
    }

    @Test
    public void testValueBodyResponse() throws Exception {
        DiskUsageResponse resp = client.indices().diskUsage(b -> b
            .index("*")
            .allowNoIndices(true)
            .runExpensiveTasks(true)
        );

        assertNotNull(resp.valueBody().toJson().asJsonObject().get("_shards"));
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

    public static class Product {
        public double price;

        public Product() {}
        public Product(double price) {
            this.price = price;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
