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

package co.elastic.clients.elasticsearch.model;

import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.aggregations.AvgAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.StringTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.StringTermsBucket;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.util.MapBuilder;
import org.junit.Test;

import java.util.Collections;

public class TypedKeysTest extends ModelTestCase {

    @Test
    public void testMapProperty() {

        SearchResponse<Void> resp = new SearchResponse.Builder<Void>()
            .aggregations(_1 -> _1
                .entry("foo", _2 -> _2.avg(_3 -> _3
                    .value(3.14)
                ))
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
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]},\"aggregations\":{\"avg#foo\":{\"value\":3.14}}}";

        assertEquals(json, toJson(resp));

        resp = fromJson(json, SearchResponse.createSearchResponseDeserializer(JsonpDeserializer.voidDeserializer()));

        assertEquals(1, resp.took());
        assertEquals(3.14, resp.aggregations().get("foo").avg().value(), 0.001);

    }

    @Test
    public void testAdditionalProperties() {

        Aggregate avg1 = AvgAggregate.of(_1 -> _1.value(1.0))._toAggregate();
        Aggregate avg2 = AvgAggregate.of(_1 -> _1.value(2.0))._toAggregate();

        Aggregate aggregate = new StringTermsAggregate.Builder()
            .sumOtherDocCount(1)
            .buckets(
                StringTermsBucket.of(_1 -> _1
                    .key("key_1")
                    .docCount(1)
                    .aggregations(MapBuilder.of("bar", avg1))),
                StringTermsBucket.of(_1 -> _1
                    .key("key_2")
                    .docCount(2)
                    .aggregations(MapBuilder.of("bar", avg2)))

            )
            .build()
            ._toAggregate();

        SearchResponse<Void> resp = new SearchResponse.Builder<Void>()
            .aggregations(_1 -> _1
                .entry("foo", aggregate)
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
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]}," +
            "\"aggregations\":{\"sterms#foo\":{\"buckets\":[" +
                "{\"avg#bar\":{\"value\":1.0},\"doc_count\":1,\"key\":\"key_1\"}," +
                "{\"avg#bar\":{\"value\":2.0},\"doc_count\":2,\"key\":\"key_2\"}" +
            "],\"sum_other_doc_count\":1}}}";

        assertEquals(json, toJson(resp));
        resp = fromJson(json, SearchResponse.createSearchResponseDeserializer(JsonpDeserializer.voidDeserializer()));

        StringTermsAggregate foo = resp.aggregations().get("foo").sterms();
        assertEquals(1, foo.sumOtherDocCount());
        assertEquals(1, foo.buckets().get(0).docCount());
        assertEquals("key_1", foo.buckets().get(0).key());
        assertEquals(1.0, foo.buckets().get(0).aggregations().get("bar").avg().value(), 0.01);
        assertEquals("key_2", foo.buckets().get(1).key());
        assertEquals(2.0, foo.buckets().get(1).aggregations().get("bar").avg().value(), 0.01);
    }
}
