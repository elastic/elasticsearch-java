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

package co.elastic.clients.documentation.troubleshooting;

import co.elastic.clients.documentation.DocTestsTransport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperFeatures;
import jakarta.json.stream.JsonGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.util.Collections;

public class TroubleShootingTests extends Assertions {

    @Test
    public void testMapProperty() {

        SearchResponse<Void> searchResponse = new SearchResponse.Builder<Void>()
            .aggregations(
                "price", _2 -> _2
                    .avg(_3 -> _3.value(3.14))
            )
            // Required properties on a SearchResponse
            .took(1)
            .shards(_1 -> _1.successful(1).failed(0).total(1))
            .hits(_1 -> _1
                .total(_2 -> _2.value(0).relation(TotalHitsRelation.Eq))
                .hits(Collections.emptyList())
            )
            .timedOut(false)
            .build();

        String json = "{\"took\":1,\"timed_out\":false,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0}," +
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]},\"aggregations\":{\"avg#price\":{\"value\":3.14}}}";

        DocTestsTransport transport = new DocTestsTransport();
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        {
            //tag::aggregation-typed-keys
            JsonpMapper mapper = esClient._jsonpMapper();

            StringWriter writer = new StringWriter();
            try (JsonGenerator generator = mapper.jsonProvider().createGenerator(writer)) {
                mapper.serialize(searchResponse, generator);
            }
            String result = writer.toString();

            // The aggregation property provides the "avg" type and "price" name
            assertTrue(result.contains("\"aggregations\":{\"avg#price\":{\"value\":3.14}}}"));
            //end::aggregation-typed-keys
        }

        {
            //tag::aggregation-no-typed-keys
            // Create a new mapper with the typed_keys feature disabled
            JsonpMapper mapper = esClient._jsonpMapper()
                .withAttribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, false);

            StringWriter writer = new StringWriter();
            try (JsonGenerator generator = mapper.jsonProvider().createGenerator(writer)) {
                mapper.serialize(searchResponse, generator);
            }
            String result = writer.toString();

            // The aggregation only provides the "price" name
            assertTrue(result.contains("\"aggregations\":{\"price\":{\"value\":3.14}}}"));
            //end::aggregation-no-typed-keys
        }
    }
}
