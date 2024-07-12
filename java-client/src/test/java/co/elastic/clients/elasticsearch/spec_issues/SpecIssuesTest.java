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

package co.elastic.clients.elasticsearch.spec_issues;

import co.elastic.clients.documentation.usage.Product;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.analysis.LimitTokenCountTokenFilter;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeFieldType;
import co.elastic.clients.elasticsearch.cluster.ClusterStatsResponse;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Suggester;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.GetFieldMappingRequest;
import co.elastic.clients.elasticsearch.indices.GetFieldMappingResponse;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.elasticsearch.snapshot.RestoreResponse;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import jakarta.json.stream.JsonParser;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.StringReader;

/**
 * Test issues related to the API specifications.
 *
 * Depending on the feedback provided, this may involve either loading a JSON file or sending requests to an ES server.
 */
public class SpecIssuesTest extends ModelTestCase {

    @Test
    public void i0328_charFilter() throws Exception {
        // Both mappings and mappings_path are optional
        String json =
            "{\n" +
                "    \"analysis\": { \n" +
                "        \"char_filter\": {\n" +
                "            \"multi_char_filter\": {\n" +
                "                \"type\": \"mapping\",\n" +
//                "                \"mappings\": [\n" +
//                "                    \"xyz => xyz\"\n" +
//                "                ],\n" +
                "                \"mappings_path\": \"analysis/multi-char-replacement.txt\"\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";

        IndexSettings.of(b -> b.withJson(new StringReader(json)));
    }

    @Disabled("Not fixed yet")
    @Test
    public void i0201_restoreResponse() throws Exception {
        RestoreResponse restoreResponse = fromJson("{\"acknowledged\":true}", RestoreResponse.class);
    }

    @Test
    public void i0298_runtimeMappings() throws Exception {
        ElasticsearchClient client = ElasticsearchTestServer.global().client();

        String index = "i0298";

        Product p = new Product("p1", "p2", 42.0);

        client.index(ir -> ir
            .index(index)
            .document(p));

        client.indices().flush(f -> f.index(index));

        RuntimeField runtimeField = RuntimeField.of(rf -> rf
            .type(RuntimeFieldType.Double)
            .script(Script.of(s -> s
                .source("emit(doc['price'].value * 1.19)")
            ))
        );

        client.search(sr -> sr
                .index(index)
                .runtimeMappings("priceWithTax", runtimeField), // NOTE: the builder accepts only lists here
            Product.class);
    }

    @Test
    public void i0297_mappingSettings() {

        CreateIndexRequest request = CreateIndexRequest.of(r -> r
            .index("i0297")
            .settings(s -> s
                // This is "mapping" and not "mappings"
                .mapping(m -> m.totalFields(totalFields -> totalFields.limit(1001L)))
                .otherSettings("foo", JsonData.of("bar"))
            )
        );

        assertEquals("{\"settings\":{\"foo\":\"bar\",\"mapping\":{\"total_fields\":{\"limit\":1001}}}}", toJson(request));
    }

    @Test
    public void i0295_mappingSettings() {
        String json = "{\n" +
            "  \"mappings\": {\n" +
            "    \"properties\": {\n" +
            "      \"myfield\": {\n" +
            "        \"type\": \"text\"\n" +
            "      }\n" +
            "    }\n" +
            "  },\n" +
            "  \"settings\": {\n" +
            "    \"index\": {\n" +
            "      \"max_result_window\": 1000000,\n" +
            "      \"mapping\": {\n" +
            "        \"nested_objects\": {\n" +
            "          \"limit\": 10000\n" +
            "        }\n" +
            "      },\n" +
            "      \"requests\": {\n" +
            "        \"cache\": {\n" +
            "          \"enable\": true\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

        CreateIndexRequest request = CreateIndexRequest.of(r -> r
            .index("i0295")
            .withJson(new StringReader(json))
        );
    }

    @Test
    public void i0254_suggesterTest() throws Exception {
        new Suggester.Builder().suggesters("song-suggest", s -> s.completion(c->c.field("suggest"))).build();
    }

    @Test
    // update: icu_collation_keyword has been released and added to the spec
    public void i0249_variantKind() throws Exception {
        try (ElasticsearchTestServer server = new ElasticsearchTestServer("analysis-icu").start()) {

            ElasticsearchClient esClient = server.client();

            esClient.indices().create(r -> r
                .index("i0249")
                .withJson(new StringReader("{\n" +
                    "  \"mappings\": {\n" +
                    "    \"properties\": {\n" +
                    "      \"name\": {   \n" +
                    "        \"type\": \"text\",\n" +
                    "        \"fields\": {\n" +
                    "          \"sort\": {  \n" +
                    "            \"type\": \"icu_collation_keyword\",\n" +
                    "            \"index\": false,\n" +
                    "            \"language\": \"de\",\n" +
                    "            \"country\": \"DE\",\n" +
                    "            \"variant\": \"@collation=phonebook\"\n" +
                    "          }\n" +
                    "        }\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}\n"))
            );

            GetFieldMappingResponse fm = esClient.indices().getFieldMapping(b -> b
                .index("i0249")
                .fields("*")
            );

            Property property = fm.get("i0249").mappings().get("name").mapping().get("name").text().fields().get("sort");

            assertFalse(property._isCustom());
            assertEquals(Property.Kind.IcuCollationKeyword, property._kind());
        }
    }

    @Test
    public void i0199_consumeAllTokensOptional() {
        // https://github.com/elastic/elasticsearch-java/issues/199
        // Most filter properties are optional
        LimitTokenCountTokenFilter filter = LimitTokenCountTokenFilter.of(b -> b);
    }

    @Test
    public void i0166_multiFieldMapping() throws Exception {
        // https://github.com/elastic/elasticsearch-java/issues/166
        ElasticsearchClient client = ElasticsearchTestServer.global().client();

        String indexName = "i0166_multi_field_mapping";

        client.index(r -> r
            .index(indexName)
            .withJson(new StringReader("{\"a\":1,\"b\":2}"))
        );

        GetFieldMappingRequest gfmRequest =  GetFieldMappingRequest.of (b -> b
            .index(indexName)
            .fields("a", "b")
        );

        GetFieldMappingResponse gfmResponse = client.indices().getFieldMapping(gfmRequest);

        assertEquals(2, gfmResponse.get(indexName).mappings().size());
        assertEquals("a", gfmResponse.get(indexName).mappings().get("a").fullName());
        assertEquals("b", gfmResponse.get(indexName).mappings().get("b").fullName());
    }

    @Test
    public void i0107_rangeBucketKey() {
        // https://github.com/elastic/elasticsearch-java/issues/107
        loadRsrc("issue-0107-response.json", SearchResponse.createSearchResponseDeserializer(JsonData._DESERIALIZER));
    }

    @Test
    public void i0088_clusterStats() {
        // https://github.com/elastic/elasticsearch-java/issues/88
        loadRsrc("issue-0088-response.json", ClusterStatsResponse._DESERIALIZER);
    }

    @Test
    public void i0087_filterAggSubAggregation() {
        // https://github.com/elastic/elasticsearch-java/issues/87
        SearchResponse<JsonData> resp = loadRsrc("issue-0087-response.json",
            SearchResponse.createSearchResponseDeserializer(JsonData._DESERIALIZER));

        assertEquals(
            "cnn.com",
            resp.aggregations().get("login_filter").filter()
                .aggregations().get("to_domain").sterms()
                .buckets().array().get(0).key().stringValue());
    }

    @Test
    public void i0080_simpleError() {
        // https://github.com/elastic/elasticsearch-java/issues/80
        // When requesting a missing index, the error response in compact format.
        // Fixed by adding ErrorCause.reason as a shortcut property
        String json = "{\"error\":\"alias [not-existing-alias] missing\",\"status\":404}";
        ErrorResponse err = fromJson(json, ErrorResponse.class);

        assertEquals("alias [not-existing-alias] missing", err.error().reason());
    }

    @Test
    public void i0078_deserializeSearchRequest() {
        // https://github.com/elastic/elasticsearch-java/issues/78
        loadRsrc("issue-0078.json", SearchRequest._DESERIALIZER);
    }

    @Test
    public void i0057_suggestDeserialization() {
        // https://github.com/elastic/elasticsearch-java/issues/57
        // Note: the _type properties have been removed so that the test works in 8.x too.
        SearchResponse<JsonData> resp = loadRsrc("issue-0057-response.json",
            SearchResponse.createSearchResponseDeserializer(JsonData._DESERIALIZER));

        assertEquals(1, resp.suggest().get("completion:completion1").size());
        assertEquals("hash", resp.suggest().get("completion:completion1").get(0).completion().text());
        assertEquals("HashMap-Complete1", resp.suggest().get("completion:completion1").get(0).completion().options().get(0).text());
    }

    @Test
    public void i0056_hitsMetadataTotal() throws Exception {
        // https://github.com/elastic/elasticsearch-java/issues/56
        SearchResponse<JsonData> res = ElasticsearchTestServer.global().client()
            .search(srb -> srb
                .trackTotalHits(thb -> thb.enabled(false)), JsonData.class);
    }

    @Test
    public void gettingVersionFromNodes() throws Exception {
        ElasticsearchTestServer.global().client()
            .nodes().info().nodes().entrySet().forEach(node ->
                assertNotNull(node.getValue().version()));
    }
    
    private <T> T loadRsrc(String res, JsonpDeserializer<T> deser) {
        InputStream is = this.getClass().getResourceAsStream(res);
        assertNotNull(is, "Resource not found: " + res);
        JsonParser parser = mapper.jsonProvider().createParser(is);
        return deser.deserialize(parser, mapper);
    }

    private <T> T loadRsrc(String res, Class<T> clazz) {
        return loadRsrc(res, JsonpDeserializer.of(clazz));
    }
}
