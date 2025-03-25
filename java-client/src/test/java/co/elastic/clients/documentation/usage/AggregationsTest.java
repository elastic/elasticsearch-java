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

package co.elastic.clients.documentation.usage;

import co.elastic.clients.documentation.DocTestsTransport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.aggregations.HistogramBucket;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.JsonData;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AggregationsTest  extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient esClient = new ElasticsearchClient(transport);

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final SearchResponse<JsonData> searchResponse = SearchResponse.of(b -> b
        .aggregations(new HashMap<>())
        .took(0)
        .timedOut(false)
        .hits(h -> h
            .total(t -> t.value(0).relation(TotalHitsRelation.Eq))
            .hits(new ArrayList<>())
        )
        .shards(s -> s
            .total(1)
            .failed(0)
            .successful(1)
        )
        .aggregations("price-histogram", a -> a.histogram(h -> h
            .buckets(bu -> bu.array(Collections.singletonList(HistogramBucket.of(hb -> hb
                .key(50).docCount(1)
            ))))
        ))
    );

    @Test
    public void priceHistogram() throws Exception {

        transport.setResult(searchResponse);

        //tag::price-histo-request
        String searchText = "bike";

        Query query = MatchQuery.of(m -> m
            .field("name")
            .query(searchText)
        )._toQuery();

        SearchResponse<Void> response = esClient.search(b -> b
            .index("products")
            .size(0) // <1>
            .query(query) // <2>
            .aggregations("price-histogram", a -> a // <3>
                .histogram(h -> h // <4>
                    .field("price")
                    .interval(50.0)
                )
            ),
            Void.class // <5>
        );
        //end::price-histo-request

        //tag::price-histo-response
        List<HistogramBucket> buckets = response.aggregations()
            .get("price-histogram") // <1>
            .histogram() // <2>
            .buckets().array(); // <3>

        for (HistogramBucket bucket: buckets) {
            logger.info("There are " + bucket.docCount() +
                " bikes under " + bucket.key());
        }

        //end::price-histo-response
    }
}
