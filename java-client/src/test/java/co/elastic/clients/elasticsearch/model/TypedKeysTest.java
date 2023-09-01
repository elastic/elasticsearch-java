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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperFeatures;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.MapBuilder;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.util.Collections;

public class TypedKeysTest extends ModelTestCase {

    @Test
    public void testMapProperty() {

        SearchResponse<Void> resp = new SearchResponse.Builder<Void>()
            .aggregations(
                "foo", _2 -> _2
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
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]},\"aggregations\":{\"avg#foo\":{\"value\":3.14}}}";

        assertEquals(json, toJson(resp));

        resp = fromJson(json, SearchResponse.createSearchResponseDeserializer(JsonpDeserializer.voidDeserializer()));

        assertEquals(1, resp.took());
        assertEquals(3.14, resp.aggregations().get("foo").avg().value(), 0.001);

    }

    @Test
    public void testMapPropertyWithoutTypedKeys() {

        SearchResponse<Void> resp = new SearchResponse.Builder<Void>()
            .aggregations(
                "foo", _2 -> _2
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

        // Note "foo" and not "avg#foo" below
        String json = "{\"took\":1,\"timed_out\":false,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0}," +
            "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]},\"aggregations\":{\"foo\":{\"value\":3.14}}}";

        JsonpMapper newMapper = mapper.withAttribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, false);

        assertEquals(json, toJson(resp, newMapper));
    }


    @Test
    public void testAdditionalProperties() {

        Aggregate avg1 = AvgAggregate.of(_1 -> _1.value(1.0))._toAggregate();
        Aggregate avg2 = AvgAggregate.of(_1 -> _1.value(2.0))._toAggregate();

        Aggregate aggregate = StringTermsAggregate.of(_0 -> _0
            .sumOtherDocCount(1L)
            .buckets(b -> b.array(
                ListBuilder.of(StringTermsBucket.Builder::new)
                .add(_1 -> _1
                    .key("key_1")
                    .docCount(1)
                    .aggregations(MapBuilder.of("bar", avg1))
                )
                .add(_1 -> _1
                    .key("key_2")
                    .docCount(2)
                    .aggregations(MapBuilder.of("bar", avg2))
                )
                .build()
            ))
        )
        ._toAggregate();

        SearchResponse<Void> resp = new SearchResponse.Builder<Void>()
            .aggregations("foo", aggregate)
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
        assertEquals(1, foo.buckets().array().get(0).docCount());
        assertEquals("key_1", foo.buckets().array().get(0).key().stringValue());
        assertEquals(1.0, foo.buckets().array().get(0).aggregations().get("bar").avg().value(), 0.01);
        assertEquals("key_2", foo.buckets().array().get(1).key().stringValue());
        assertEquals(2.0, foo.buckets().array().get(1).aggregations().get("bar").avg().value(), 0.01);
    }

    // Example taken from
    // https://www.elastic.co/guide/en/elasticsearch/reference/8.2/search-aggregations-bucket-reverse-nested-aggregation.html
    private static final String nestedJsonWithTypedKeys = "{\n" +
        "  \"took\": 0," +
        "  \"timed_out\": false," +
        "  \"_shards\": {\n" +
        "    \"successful\": 1,\n" +
        "    \"failed\": 0,\n" +
        "    \"skipped\": 0,\n" +
        "    \"total\": 1\n" +
        "  },\n" +
        "  \"hits\": {\n" +
        "    \"hits\": [],\n" +
        "    \"total\": {\n" +
        "      \"relation\": \"eq\",\n" +
        "      \"value\": 5\n" +
        "    },\n" +
        "    \"max_score\": null\n" +
        "  }," +
        "  \"aggregations\" : {\n" +
        "    \"nested#comments\" : {\n" +
        "      \"doc_count\" : 3,\n" +
        "      \"sterms#top_usernames\" : {\n" +
        "        \"doc_count_error_upper_bound\" : 0,\n" +
        "        \"sum_other_doc_count\" : 0,\n" +
        "        \"buckets\" : [\n" +
        "          {\n" +
        "            \"key\" : \"dan\",\n" +
        "            \"doc_count\" : 3,\n" +
        "            \"reverse_nested#comment_to_issue\" : {\n" +
        "              \"doc_count\" : 1,\n" +
        "              \"sterms#top_tags_per_comment\" : {\n" +
        "                \"doc_count_error_upper_bound\" : 0,\n" +
        "                \"sum_other_doc_count\" : 0,\n" +
        "                \"buckets\" : [\n" +
        "                  {\n" +
        "                    \"key\" : \"tag1\",\n" +
        "                    \"doc_count\" : 1\n" +
        "                  },\n" +
        "                  {\n" +
        "                    \"key\" : \"tag2\",\n" +
        "                    \"doc_count\" : 1\n" +
        "                  }\n" +
        "                ]\n" +
        "              }\n" +
        "            }\n" +
        "          }\n" +
        "        ]\n" +
        "      }\n" +
        "    }\n" +
        "  }\n" +
        "}";

    @Test
    public void testSerializeNested() {

        SearchResponse<?> response = fromJson(nestedJsonWithTypedKeys, SearchResponse.class);

        // Check some deeply nested properties
        StringTermsBucket bucket = response
            .aggregations().get("comments").nested()
            .aggregations().get("top_usernames").sterms()
            .buckets().array().get(0)
            .aggregations().get("comment_to_issue").reverseNested()
            .aggregations().get("top_tags_per_comment").sterms()
            .buckets().array().get(0);

        assertEquals("tag1", bucket.key().stringValue());
        assertEquals(1, bucket.docCount());

        // Check that it's typed_keys encoded
        String serialized = toJson(response);
        assertTrue(serialized.contains("nested#comments"));
        assertTrue(serialized.contains("sterms#top_usernames"));
        assertTrue(serialized.contains("reverse_nested#comment_to_issue"));
        assertTrue(serialized.contains("sterms#top_tags_per_comment"));

        {
            // Test direct serialization
            JsonProvider jsonProvider = mapper.jsonProvider();
            StringWriter stringWriter = new StringWriter();
            JsonGenerator generator = jsonProvider.createGenerator(stringWriter);
            response.serialize(generator, mapper);
            generator.close();

            String directSerialized = stringWriter.toString();
            assertTrue(directSerialized.contains("nested#comments"));
            assertTrue(directSerialized.contains("sterms#top_usernames"));
            assertTrue(directSerialized.contains("reverse_nested#comment_to_issue"));
            assertTrue(directSerialized.contains("sterms#top_tags_per_comment"));

        }

        // Re-parse and re-check
        response = fromJson(serialized, SearchResponse.class);

        bucket = response
            .aggregations().get("comments").nested()
            .aggregations().get("top_usernames").sterms()
            .buckets().array().get(0)
            .aggregations().get("comment_to_issue").reverseNested()
            .aggregations().get("top_tags_per_comment").sterms()
            .buckets().array().get(0);

        assertEquals("tag1", bucket.key().stringValue());
        assertEquals(1, bucket.docCount());


        JsonProvider jsonProvider = mapper.jsonProvider();
        StringWriter stringWriter = new StringWriter();
        JsonGenerator generator = jsonProvider.createGenerator(stringWriter);
        response.serialize(generator, mapper);
        generator.close();

        System.out.println(stringWriter.toString());
    }

    @Test
    public void testSerializeNestedWithoutTypedKeys() {

        SearchResponse<?> response = fromJson(nestedJsonWithTypedKeys, SearchResponse.class);

        // Check that it's typed_keys encoded
        String serialized = toJson(response);
        assertTrue(serialized.contains("nested#comments"));
        assertTrue(serialized.contains("sterms#top_usernames"));
        assertTrue(serialized.contains("reverse_nested#comment_to_issue"));
        assertTrue(serialized.contains("sterms#top_tags_per_comment"));

        // Build the non-typed_keys version (replace 'type#' with 'type#name')
        serialized = serialized.replaceAll("\"[^\"]*#", "\"");
        assertFalse(serialized.contains("nested#comments"));
        assertFalse(serialized.contains("sterms#top_usernames"));
        assertFalse(serialized.contains("reverse_nested#comment_to_issue"));
        assertFalse(serialized.contains("sterms#top_tags_per_comment"));

        // Serialize without typed keys
        JsonpMapper newMapper = mapper.withAttribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, false);
        assertEquals(serialized, toJson(response, newMapper));

    }
}
