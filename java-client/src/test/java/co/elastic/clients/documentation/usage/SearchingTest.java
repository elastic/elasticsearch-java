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
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.RangeQuery;
import co.elastic.clients.elasticsearch.core.PutScriptResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.TotalHits;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.json.JsonData;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchingTest {

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
    );

    @Test
    public void searchSimpleMatch() throws Exception {
        transport.setResult(searchResponse);

        //tag::search-getting-started
        String searchText = "bike";

        SearchResponse<Product> response = esClient.search(s -> s
                .index("products")
                .query(q -> q
                    .match(t -> t
                        .field("name")
                        .query(searchText)
                    )
                ),
            Product.class
        );
        //end::search-getting-started
    }
    @Test
    public void searchMatch() throws Exception {

        transport.setResult(searchResponse);
        //tag::search-simple

        String searchText = "bike";

        SearchResponse<Product> response = esClient.search(s -> s
            .index("products") // <1>
            .query(q -> q      // <2>
                .match(t -> t   // <3>
                    .field("name")  // <4>
                    .query(searchText)
                )
            ),
            Product.class      // <5>
        );

        TotalHits total = response.hits().total();
        boolean isExactResult = total.relation() == TotalHitsRelation.Eq;

        if (isExactResult) {
            logger.info("There are " + total.value() + " results");
        } else {
            logger.info("There are more than " + total.value() + " results");
        }

        List<Hit<Product>> hits = response.hits().hits();
        for (Hit<Product> hit: hits) {
            Product product = hit.source();
            logger.info("Found product " + product.getSku() + ", score " + hit.score());
        }
        //end::search-simple
    }

    @Test
    public void searchNested() throws Exception {
        transport.setResult(searchResponse);
        //tag::search-nested
        String searchText = "bike";
        double maxPrice = 200.0;

        // Search by product name
        Query byName = MatchQuery.of(m -> m // <1>
            .field("name")
            .query(searchText)
        )._toQuery(); // <2>

        // Search by max price
        Query byMaxPrice = RangeQuery.of(r -> r
            .number(n -> n
            .field("price")
            .gte(maxPrice)) // <3>
        )._toQuery();

        // Combine name and price queries to search the product index
        SearchResponse<Product> response = esClient.search(s -> s
            .index("products")
            .query(q -> q
                .bool(b -> b // <4>
                    .must(byName) // <5>
                    .must(byMaxPrice)
                )
            ),
            Product.class
        );

        List<Hit<Product>> hits = response.hits().hits();
        for (Hit<Product> hit: hits) {
            Product product = hit.source();
            logger.info("Found product " + product.getSku() + ", score " + hit.score());
        }
        //end::search-nested
    }

    @Test
    public void searchTemplate() throws Exception {

        transport.setResult(PutScriptResponse.of(r -> r.acknowledged(true)));

        //tag::search-template-script
        // Create a script
        esClient.putScript(r -> r
            .id("query-script") // <1>
            .script(s -> s
                .lang("mustache")
                .source("{\"query\":{\"match\":{\"{{field}}\":\"{{value}}\"}}}")
            ));
        //end::search-template-script

        transport.setResult(SearchTemplateResponse.<JsonData>of(r -> r
            .hits(searchResponse.hits())
            .took(searchResponse.took())
            .timedOut(false)
            .shards(searchResponse.shards())
        ));

        //tag::search-template-query
        SearchTemplateResponse<Product> response = esClient.searchTemplate(r -> r
                .index("some-index")
                .id("query-script") // <1>
                .params("field", JsonData.of("some-field")) // <2>
                .params("value", JsonData.of("some-data")),
            Product.class
        );

        List<Hit<Product>> hits = response.hits().hits();
        for (Hit<Product> hit: hits) {
            Product product = hit.source();
            logger.info("Found product " + product.getSku() + ", score " + hit.score());
        }
        //end::search-template-query
    }
}
