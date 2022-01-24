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

import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch.cluster.ClusterStatsResponse;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import jakarta.json.stream.JsonParser;
import org.junit.Test;

import java.io.InputStream;

/**
 * Test issues related to the API specifications.
 *
 * Depending on the feedback provided, this may involve either loading a JSON file or sending requests to an ES server.
 */
public class SpecIssuesTest extends ModelTestCase {

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
                .buckets().array().get(0).key());

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

    private <T> T loadRsrc(String res, JsonpDeserializer<T> deser) {
        InputStream is = this.getClass().getResourceAsStream(res);
        assertNotNull("Resource not found: " + res, is);
        JsonParser parser = mapper.jsonProvider().createParser(is);
        return deser.deserialize(parser, mapper);
    }
}
