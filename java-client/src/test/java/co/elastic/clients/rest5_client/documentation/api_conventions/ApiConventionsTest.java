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

package clients.rest5_client.documentation.api_conventions;

import co.elastic.clients.documentation.DocTestsTransport;
import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.NodeStatistics;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.indices.Alias;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.util.ApiTypeHelper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiConventionsTest extends Assertions {

    private static class SomeApplicationData {}

    private DocTestsTransport transport = new DocTestsTransport();
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void blockingAndAsync() throws Exception {

        //tag::blocking-and-async
        // Synchronous blocking client
        ElasticsearchClient client = new ElasticsearchClient(transport);

        if (client.exists(b -> b.index("products").id("foo")).value()) {
            logger.info("product exists");
        }

        // Asynchronous non-blocking client
        ElasticsearchAsyncClient asyncClient =
            new ElasticsearchAsyncClient(transport);

        asyncClient
            .exists(b -> b.index("products").id("foo"))
            .whenComplete((response, exception) -> {
                if (exception != null) {
                    logger.error("Failed to index", exception);
                } else {
                    logger.info("Product exists");
                }
            });
        //end::blocking-and-async

    }

    public void builders() throws Exception {
        ElasticsearchClient client = new ElasticsearchClient(transport);

        //tag::builders
        CreateIndexResponse createResponse = client.indices().create(
            new CreateIndexRequest.Builder()
                .index("my-index")
                .aliases("foo",
                    new Alias.Builder().isWriteIndex(true).build()
                )
                .build()
        );
        //end::builders
    }

    public void builderLambdas() throws Exception {
        ElasticsearchClient client = new ElasticsearchClient(transport);

        //tag::builder-lambdas
        CreateIndexResponse createResponse = client.indices()
            .create(createIndexBuilder -> createIndexBuilder
                .index("my-index")
                .aliases("foo", aliasBuilder -> aliasBuilder
                    .isWriteIndex(true)
                )
            );
        //end::builder-lambdas
    }

    public void builderLambdasShort() throws Exception {
        ElasticsearchClient client = new ElasticsearchClient(transport);

        //tag::builder-lambdas-short
        CreateIndexResponse createResponse = client.indices()
            .create(c -> c
                .index("my-index")
                .aliases("foo", a -> a
                    .isWriteIndex(true)
                )
            );
        //end::builder-lambdas-short
    }

    public void builderIntervals() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        //tag::builder-intervals
        SearchResponse<SomeApplicationData> results = client
            .search(b0 -> b0
                .query(b1 -> b1
                    .intervals(b2 -> b2
                        .field("my_text")
                        .allOf(b3 -> b3
                            .ordered(true)
                            .intervals(b4 -> b4
                                .match(b5 -> b5
                                    .query("my favorite food")
                                    .maxGaps(0)
                                    .ordered(true)
                                )
                            )
                            .intervals(b4 -> b4
                                .anyOf(b5 -> b5
                                    .intervals(b6 -> b6
                                        .match(b7 -> b7
                                            .query("hot water")
                                        )
                                    )
                                    .intervals(b6 -> b6
                                        .match(b7 -> b7
                                            .query("cold porridge")
                                        )
                                    )
                                )
                            )
                        )
                    )
                ),
            SomeApplicationData.class // <1>
        );
        //end::builder-intervals
    }

    @Test
    public void variantCreation() {
        //tag::variant-creation
        Query query = new Query.Builder()
            .term(t -> t                          // <1>
                .field("name")                    // <2>
                .value(v -> v.stringValue("foo"))
            )
            .build();                             // <3>
        //end::variant-creation

        //tag::variant-navigation
        assertEquals("foo", query.term().value().stringValue());
        //end::variant-navigation

        //tag::variant-kind
        if (query.isTerm()) { // <1>
            doSomething(query.term());
        }

        switch(query._kind()) { // <2>
            case Term:
                doSomething(query.term());
                break;
            case Intervals:
                doSomething(query.intervals());
                break;
            default:
                doSomething(query._kind(), query._get()); // <3>
        }
        //end::variant-kind
    }

    //tag::custom-variant-types
    public static class SphereDistanceAggregate {
        private final List<Bucket> buckets;
        @JsonCreator
        public SphereDistanceAggregate(
            @JsonProperty("buckets") List<Bucket> buckets
        ) {
            this.buckets = buckets;
        }
        public List<Bucket> buckets() {
            return buckets;
        };
    }

    public static class Bucket {
        private final double key;
        private final double docCount;
        @JsonCreator
        public Bucket(
            @JsonProperty("key") double key,
            @JsonProperty("doc_count") double docCount) {
            this.key = key;
            this.docCount = docCount;
        }
        public double key() {
            return key;
        }
        public double docCount() {
            return docCount;
        }
    }
    //end::custom-variant-types

    @Test
    public void customVariants() throws Exception {

        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        String json = "{\"took\":1,\"timed_out\":false,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0},\n" +
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]},\n" +
            "\"aggregations\":{\"sphere-distance#neighbors\":{\"buckets\":[{\"key\": 1.0,\"doc_count\":1}]}}}";

        transport.setResult(SearchResponse.of(b -> b.withJson(
            transport.jsonpMapper().jsonProvider().createParser(new StringReader(json)),
            transport.jsonpMapper())
        ));

        //tag::custom-variant-creation
        Map<String, Object> params = new HashMap<>(); // <1>
        params.put("interval", 10);
        params.put("scale", "log");
        params.put("origin", new Double[]{145.0, 12.5, 1649.0});

        SearchRequest request = SearchRequest.of(r -> r
            .index("stars")
            .aggregations("neighbors", agg -> agg
                ._custom("sphere-distance", params) // <2>
            )
        );
        //end::custom-variant-creation

        {
            //tag::custom-variant-navigation-json
            SearchResponse<Void> response = esClient.search(request, Void.class); // <1>

            JsonData neighbors = response
                .aggregations().get("neighbors")
                ._custom(); // <2>

            JsonArray buckets = neighbors.toJson() // <3>
                .asJsonObject()
                .getJsonArray("buckets");

            for (JsonValue item : buckets) {
                JsonObject bucket = item.asJsonObject();
                double key = bucket.getJsonNumber("key").doubleValue();
                double docCount = bucket.getJsonNumber("doc_count").longValue();
                doSomething(key, docCount);
            }
            //end::custom-variant-navigation-json
        }

        {
            //tag::custom-variant-navigation-typed
            SearchResponse<Void> response = esClient.search(request, Void.class);

            SphereDistanceAggregate neighbors = response
                .aggregations().get("neighbors")
                ._custom()
                .to(SphereDistanceAggregate.class); // <1>

            for (Bucket bucket : neighbors.buckets()) {
                doSomething(bucket.key(), bucket.docCount());
            }
            //end::custom-variant-navigation-typed
        }
    }

    @Test
    public void collections() {
        //tag::collections-list
        // Prepare a list of index names
        List<String> names = Arrays.asList("idx-a", "idx-b", "idx-c");

        // Prepare cardinality aggregations for fields "foo" and "bar"
        Map<String, Aggregation> cardinalities = new HashMap<>();
        cardinalities.put("foo-count", Aggregation.of(a -> a.cardinality(c -> c.field("foo"))));
        cardinalities.put("bar-count", Aggregation.of(a -> a.cardinality(c -> c.field("bar"))));

        // Prepare an aggregation that computes the average of the "size" field
        final Aggregation avgSize = Aggregation.of(a -> a.avg(v -> v.field("size")));

        SearchRequest search = SearchRequest.of(r -> r
            // Index list:
            // - add all elements of a list
            .index(names)
            // - add a single element
            .index("idx-d")
            // - add a vararg list of elements
            .index("idx-e", "idx-f", "idx-g")

            // Sort order list: add elements defined by builder lambdas
            .sort(s -> s.field(f -> f.field("foo").order(SortOrder.Asc)))
            .sort(s -> s.field(f -> f.field("bar").order(SortOrder.Desc)))

            // Aggregation map:
            // - add all entries of an existing map
            .aggregations(cardinalities)
            // - add a key/value entry
            .aggregations("avg-size", avgSize)
            // - add a key/value defined by a builder lambda
            .aggregations("price-histogram",
                a -> a.histogram(h -> h.field("price")))
        );
        //end::collections-list

    }

    @Test
    public void optionalCollections() {
        //tag::optional-collections
        NodeStatistics stats = NodeStatistics.of(b -> b
            .total(1)
            .failed(0)
            .successful(1)
        );

        // The `failures` list was not provided.
        // - it's not null
        assertNotNull(stats.failures());
        // - it's empty
        assertEquals(0, stats.failures().size());
        // - and if needed we can know it was actually not defined
        assertFalse(ApiTypeHelper.isDefined(stats.failures()));
        //end::optional-collections
    }

    private void doSomething(Object... o) {

    }
}
