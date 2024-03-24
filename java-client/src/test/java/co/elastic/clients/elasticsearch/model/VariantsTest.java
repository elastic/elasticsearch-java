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

import co.elastic.clients.elasticsearch._types.analysis.Analyzer;
import co.elastic.clients.elasticsearch._types.analysis.Normalizer;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch._types.query_dsl.FunctionScore;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.indices.GetMappingResponse;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class VariantsTest extends ModelTestCase {

    @Test
    public void testNested() {
        // nested containers: query > intervals > interval
        // intervals is a single key dictionary
        // query has container properties

        Query q = Query.of(_0 -> _0
            .intervals(_1 -> _1
                .queryName("my-query")
                .field("a_field")
                .anyOf(_2 -> _2
                    .intervals(_3 -> _3
                        .match(
                            _5 -> _5
                                .query("match-query")
                                .analyzer("lowercase")
                            )
                        )
                )
            )
        );

        assertEquals(Query.Kind.Intervals, q._kind());
        assertNotNull(q.intervals());
        assertEquals("a_field", q.intervals().field());
        assertEquals(1, q.intervals().anyOf().intervals().size());
        assertEquals("lowercase", q.intervals().anyOf().intervals().get(0).match().analyzer());

        String json = toJson(q);

        assertEquals("{\"intervals\":{\"a_field\":{\"_name\":\"my-query\"," +
            "\"any_of\":{\"intervals\":[{\"match\":{\"analyzer\":\"lowercase\",\"query\":\"match-query\"}}]}}}}", json);

        Query q2 = fromJson(json, Query.class);
        assertEquals(json, toJson(q2));

        assertEquals(Query.Kind.Intervals, q2._kind());
        assertNotNull(q2.intervals());
        assertEquals("a_field", q2.intervals().field());
        assertEquals(1, q2.intervals().anyOf().intervals().size());
        assertEquals("lowercase", q2.intervals().anyOf().intervals().get(0).match().analyzer());

    }

    @Test
    public void testInternalTag() {
        String expected = "{\"type\":\"ip\",\"fields\":{\"a-field\":{\"type\":\"float\",\"coerce\":true}},\"boost\":1" +
            ".0,\"index\":true}";

        Property p = Property.of(_0 -> _0
            .ip(_1 -> _1
                .index(true)
                .boost(1.0)
                .fields(
                    "a-field", _3 -> _3
                    .float_(_4 -> _4
                        .coerce(true)
                    )
                )
            )
        );

        assertEquals(expected, toJson(p));

        Property property = fromJson(expected, Property.class);
        assertTrue(property.ip().index());
        assertEquals(1.0, property.ip().boost().doubleValue(), 0.09);

        assertTrue(property.ip().fields().get("a-field").float_().coerce());
    }

    @Test
    public void testDefaultInternalTagForAnalyzer() {

        Consumer<String> test = s -> {
            Analyzer a = fromJson(s, Analyzer.class);
            assertEquals(Analyzer.Kind.Custom, a._kind());
            assertEquals("some-filter", a.custom().filter().get(0));
            assertTrue(a.custom().charFilter().isEmpty());
            assertEquals("some-tokenizer", a.custom().tokenizer());
        };

        // Explicit type
        test.accept("{\"type\":\"custom\",\"filter\":[\"some-filter\"],\"tokenizer\":\"some-tokenizer\"}");

        // Default type
        test.accept("{\"filter\":[\"some-filter\"],\"tokenizer\":\"some-tokenizer\"}");
    }

    @Test
    public void testDefaultInternalTagForNormalizer() {

        Consumer<String> test = s -> {
            Normalizer normalizer = fromJson(s, Normalizer.class);
            assertEquals(Normalizer.Kind.Custom, normalizer._kind());
            assertEquals("some-filter", normalizer.custom().filter().get(0));
            assertEquals("some-char-filter", normalizer.custom().charFilter().get(0));
        };

        // Explicit type
        test.accept("{\"type\":\"custom\",\"filter\":[\"some-filter\"],\"char_filter\":[\"some-char-filter\"]}");

        // Default type
        test.accept("{\"filter\":[\"some-filter\"],\"char_filter\":[\"some-char-filter\"]}");
    }

    @Test
    public void testBuilders() {
        String json = "{\"exists\":{\"field\":\"foo\"}}";
        Query q;

        q = new Query(QueryBuilders.exists().field("foo").build());
        assertEquals(json, toJson(q));

        q = QueryBuilders.exists(e -> e.field("foo"));
        assertEquals(json, toJson(q));
    }


    @Test
    public void testNestedTaggedUnionWithDefaultTag() {
        // https://github.com/elastic/elasticsearch-java/issues/45

        // Object fields don't really exist in ES and are based on a naming convention where field names
        // are dot-separated paths. The hierarchy is rebuilt from these names and ES doesn't send back
        // "type": "object" for object properties.
        // See https://www.elastic.co/guide/en/elasticsearch/reference/current/object.html
        //
        // Mappings are therefore a hierarchy of internally-tagged unions based on the "type" property
        // with a default "object" tag value if the "type" property is missing.

        String json =
            "{\n" +
            "  \"testindex\" : {\n" +
            "    \"mappings\" : {\n" +
            "      \"properties\" : {\n" +
            "        \"id\" : {\n" +
            "          \"type\" : \"text\",\n" +
            "          \"fields\" : {\n" +
            "            \"keyword\" : {\n" +
            "              \"type\" : \"keyword\",\n" +
            "              \"ignore_above\" : 256\n" +
            "            }\n" +
            "          }\n" +
            "        },\n" +
            "        \"name\" : {\n" +
            "          \"properties\" : {\n" +
            "            \"first\" : {\n" +
            "              \"type\" : \"text\",\n" +
            "              \"fields\" : {\n" +
            "                \"keyword\" : {\n" +
            "                  \"type\" : \"keyword\",\n" +
            "                  \"ignore_above\" : 256\n" +
            "                }\n" +
            "              }\n" +
            "            },\n" +
            "            \"last\" : {\n" +
            "              \"type\" : \"text\",\n" +
            "              \"fields\" : {\n" +
            "                \"keyword\" : {\n" +
            "                  \"type\" : \"keyword\",\n" +
            "                  \"ignore_above\" : 256\n" +
            "                }\n" +
            "              }\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

        GetMappingResponse response = fromJson(json, GetMappingResponse.class);

        TypeMapping mappings = response.get("testindex").mappings();
        assertTrue(mappings.properties().get("name").isObject());

        assertEquals(256, mappings
            .properties().get("name").object()
            .properties().get("first").text()
            .fields().get("keyword").keyword().
            ignoreAbove().longValue()
        );

        assertTrue(mappings.properties().get("id").isText());

        assertEquals(256, mappings.properties().get("id").text().fields().get("keyword").keyword().ignoreAbove().longValue());
    }

    @Test
    public void testEmptyProperty() {
        // Edge case where we have a property with no fields and no type
        String json = "{}";
        Property property = fromJson(json, Property.class);
        assertEquals(Property.Kind.Object, property._kind());
    }

    @Test
    public void testNestedVariantsWithContainerProperties() {

        SearchRequest search = SearchRequest.of(s -> s
            .aggregations(
                "agg1", a -> a
                    .meta("m1", JsonData.of("m1 value"))
                    // Here we can choose any aggregation type, but build() isn't accessible
                    .valueCount(v -> v.field("f"))
                    // Here we can only set container properties (meta and (sub)aggregations) or build()
                    .meta("m2", JsonData.of("m2 value"))
            )
        );

        assertEquals("m1 value", search.aggregations().get("agg1").meta().get("m1").to(String.class));
        assertEquals("m2 value", search.aggregations().get("agg1").meta().get("m2").to(String.class));
    }

    @Test
    public void testContainerWithOptionalVariants() {
        // FunctionScore is the only occurrence of this

        Query q = QueryBuilders.term(t -> t.field("foo").value("bar"));

        // No variant
        {
            Query fsq = QueryBuilders.functionScore(fs -> fs
                .query(q)
                .functions(f -> f.weight(1.0))
            );

            String json = "{\"function_score\":{\"functions\":[{\"weight\":1.0}]," +
                "\"query\":{\"term\":{\"foo\":{\"value\":\"bar\"}}}}}";
            assertEquals(json, toJson(fsq));

            Query fsq2 = checkJsonRoundtrip(fsq, json);

            assertNull(fsq2.functionScore().functions().get(0)._kind());
            assertEquals(1.0, fsq2.functionScore().functions().get(0).weight(), 0.001);
        }

        // With a variant
        {
            Query fsq = QueryBuilders.functionScore(fs -> fs
                .query(q)
                .functions(f -> f
                    .weight(1.0)
                    .linear(l -> l
                        .field("foo")
                        .placement(p -> p.decay(2.0))
                    )
                )
            );

            String json = "{\"function_score\":{\"functions\":[{\"weight\":1.0,\"linear\":{\"foo\":{\"decay\":2.0}}}]," +
                "\"query\":{\"term\":{\"foo\":{\"value\":\"bar\"}}}}}";
            assertEquals(json, toJson(fsq));

            Query fsq2 = checkJsonRoundtrip(fsq, json);

            assertEquals(FunctionScore.Kind.Linear, fsq2.functionScore().functions().get(0)._kind());
            assertEquals(1.0, fsq2.functionScore().functions().get(0).weight(), 0.001);
            assertEquals(2.0, fsq2.functionScore().functions().get(0).linear().placement().decay(), 0.001);
        }
    }
}
