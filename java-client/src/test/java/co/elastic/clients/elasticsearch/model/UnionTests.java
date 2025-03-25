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

import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.elasticsearch._types.LatLonGeoLocation;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.query_dsl.DistanceFeatureQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MultiValueMode;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.RangeRelation;
import co.elastic.clients.elasticsearch._types.query_dsl.TermRangeQuery;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.testkit.ModelTestCase;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.stream.JsonParser;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class UnionTests extends ModelTestCase {

    @Test
    public void testScriptDeserializer() {
        // A union discriminated by its field names (source -> inline, id -> stored)
        {
            Script s = Script.of(_1 -> _1
                    .source("a script")
            );
            s = checkJsonRoundtrip(s, "{\"source\":\"a script\"}");
            assertEquals("a script", s.source());
        }

        {
            Script s = Script.of(_1 -> _1
                    .id("script_id")
            );
            s = checkJsonRoundtrip(s, "{\"id\":\"script_id\"}");
            assertEquals("script_id", s.id());
        }

        {
            // Test shortcut property
            Script s = fromJson("\"a script\"", Script.class);
            assertEquals("a script", s.source());
        }
    }

    @Test
    public void testOpenContainer() {
        String json = "{\"foo\":{\"bar\":42}}";

        JsonParser parser = Json.createParser(new StringReader("{ \"bar\": 42 }"));
        parser.next();
        JsonObject value = parser.getObject();

        Query obj = Query.of(b -> b._custom("foo", value));
        assertEquals(json, toJson(obj));

        obj = checkJsonRoundtrip(obj, json);

        assertEquals(Query.Kind._Custom, obj._kind());
        assertEquals("foo", obj._customKind());
        assertEquals(42, obj._custom().toJson().asJsonObject().getInt("bar"));
    }

    @Test
    public void testOpenInternalUnion() {
        String json = "{\"type\":\"foo\",\"bar\":42}";

        JsonParser parser = Json.createParser(new StringReader(json));
        parser.next();
        JsonObject value = parser.getObject();

        Property obj = Property.of(b -> b._custom("foo", value));
        assertEquals(json, toJson(obj));

        obj = checkJsonRoundtrip(obj, json);

        assertEquals(Property.Kind._Custom, obj._kind());
        assertEquals("foo", obj._customKind());
        assertEquals(42, obj._custom().toJson().asJsonObject().getInt("bar"));
    }

    @Test
    public void testOpenTypedKeysUnion() {
        String requiredFields =
            "{\"took\":1,\"timed_out\":false,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0}," +
                "\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]}}";

        String customAgg = "{\"bar\":42}";

        JsonParser parser = Json.createParser(new StringReader(customAgg));
        parser.next();
        JsonObject value = parser.getObject();

        SearchResponse<Object> obj = SearchResponse.of(b -> b
            .withJson(new StringReader(requiredFields))
            .aggregations("custom-agg", a -> a._custom("foo", value))
        );

        String json = toJson(obj);
        System.out.println(json);
        assertTrue(json.contains("\"aggregations\":{\"foo#custom-agg\":{\"bar\":42}}"));

        @SuppressWarnings("unchecked")
        SearchResponse<Object> obj2 = fromJson(json, SearchResponse.class);

        Aggregate aggregate = obj2.aggregations().get("custom-agg");
        assertEquals(Aggregate.Kind._Custom, aggregate._kind());
        assertEquals("foo", aggregate._customKind());
        assertEquals(42, aggregate._custom().toJson().asJsonObject().getInt("bar"));


    }

    @Test
    public void testUntaggedUnion() {
        // Range queries
        Query numberRangeQuery = Query.of(q -> q.range(r -> r
            .number(n -> n
                .field("age")
                .gte(10D)
                .lte(20D)
                .boost(1.0F)
                .relation(RangeRelation.Contains))));

        String expectedNumberRangeQuery = "{\"range\":{\"age\":{\"boost\":1.0,\"relation\":\"contains\"," +
            "\"gte\":10.0,\"lte\":20.0}}}";

        assertEquals(expectedNumberRangeQuery, toJson(numberRangeQuery));

        Query dateRangeQuery = Query.of(q -> q.range(r -> r
            .date(d -> d
                .field("day")
                .gte("20-06-24")
                .lte("20-07-24")
                .boost(1.0F)
                .format("some-format")
                .relation(RangeRelation.Contains))));

        String expectedDateRangeQuery = "{\"range\":{\"day\":{\"boost\":1.0,\"relation\":\"contains\"," +
            "\"gte\":\"20-06-24\",\"lte\":\"20-07-24\",\"format\":\"some-format\"}}}";

        assertEquals(expectedDateRangeQuery, toJson(dateRangeQuery));

        Query termRangeQuery = Query.of(q -> q.range(r -> r
            .term(d -> d
                .field("word")
                .gte("some")
                .lte("word")
                .boost(1.0F)
                .relation(RangeRelation.Contains))));

        String expectedTermRangeQuery = "{\"range\":{\"word\":{\"boost\":1.0,\"relation\":\"contains\"," +
            "\"gte\":\"some\",\"lte\":\"word\"}}}";

        assertEquals(expectedTermRangeQuery, toJson(termRangeQuery));

        String jsonNumberRangeQuery = "{\n" +
            "    \"range\": {\n" +
            "      \"age\": {\n" +
            "        \"gte\": 10,\n" +
            "        \"lte\": 20,\n" +
            "        \"boost\": 1.0,\n" +
            "        \"relation\": \"contains\"\n" +
            "      }\n" +
            "    }\n" +
            "  }";

        Query numberRangeQueryFromJson = Query.of(q -> q.withJson(new StringReader(jsonNumberRangeQuery)));

        assertTrue(numberRangeQueryFromJson.range().isUntyped());
        assertEquals(10, numberRangeQueryFromJson.range().untyped().gte().to(Integer.class));
        assertEquals(20, numberRangeQueryFromJson.range().untyped().lte().to(Integer.class));
        assertEquals(RangeRelation.Contains, numberRangeQueryFromJson.range().untyped().relation());

        Query converted =
            TermRangeQuery.of(trq -> trq.field("a").gte("b").lte("c"))._toRangeQuery()._toQuery();
        assertTrue(converted.isRange());

        // Distance feature queries

        Query geoDistanceFeatureQuery = Query.of(q -> q.bool(b -> b
            .must(m -> m.matchAll(mm -> mm))
            .should(sh -> sh.distanceFeature(df -> df
                .geo(g -> g
                    .field("location")
                    .pivot("1000m")
                    .origin(GeoLocation.of(gl -> gl.latlon(LatLonGeoLocation.of(ll -> ll.lon(-71.3).lat(41.15))))))))));

        String expectedGeoDistFeatQuery = "{\"bool\":{\"must\":[{\"match_all\":{}}]," +
            "\"should\":[{\"distance_feature\":{\"origin\":{\"lat\":41.15,\"lon\":-71.3}," +
            "\"pivot\":\"1000m\",\"field\":\"location\"}}]}}";
        assertEquals(expectedGeoDistFeatQuery, toJson(geoDistanceFeatureQuery));


        Query dateDistanceFeatureQuery = Query.of(q -> q.bool(b -> b
            .must(m -> m.matchAll(mm -> mm))
            .should(sh -> sh.distanceFeature(df -> df
                .date(d -> d
                    .field("date")
                    .pivot(Time.of(t -> t.time("7d")))
                    .origin("now"))))));

        String expectedDateDistFeatQuery = "{\"bool\":{\"must\":[{\"match_all\":{}}]," +
            "\"should\":[{\"distance_feature\":{\"origin\":\"now\",\"pivot\":\"7d\",\"field\":\"date\"}}]}}";
        assertEquals(expectedDateDistFeatQuery, toJson(dateDistanceFeatureQuery));

        String distDateQuery = "{\n" +
            "    \"bool\": {\n" +
            "      \"must\": {\n" +
            "        \"match_all\": {}\n" +
            "      },\n" +
            "      \"should\": {\n" +
            "        \"distance_feature\": {\n" +
            "          \"field\": \"date\",\n" +
            "          \"pivot\": \"7d\",\n" +
            "          \"origin\": \"now\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }";

        Query distDateQueryFromJson = Query.of(q -> q.withJson(new StringReader(distDateQuery)));
        assertTrue(distDateQueryFromJson.bool().should().get(0).distanceFeature().isUntyped());
        assertEquals("7d",
            distDateQueryFromJson.bool().should().get(0).distanceFeature().untyped().pivot().to(String.class));
        assertEquals("date",
            distDateQueryFromJson.bool().should().get(0).distanceFeature().untyped().field().toString());


        String distGeoQuery = "{\n" +
            "    \"bool\": {\n" +
            "      \"must\": {\n" +
            "        \"match_all\": {}\n" +
            "      },\n" +
            "      \"should\": {\n" +
            "        \"distance_feature\": {\n" +
            "          \"field\": \"location\",\n" +
            "          \"pivot\": \"1000m\",\n" +
            "          \"origin\": [-71.3, 41.15]\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }";

        Query distGeoQueryFromJson = Query.of(q -> q.withJson(new StringReader(distGeoQuery)));
        assertTrue(distGeoQueryFromJson.bool().should().get(0).distanceFeature().isUntyped());
        assertEquals("1000m",
            distGeoQueryFromJson.bool().should().get(0).distanceFeature().untyped().pivot().to(String.class));
        assertEquals("location",
            distGeoQueryFromJson.bool().should().get(0).distanceFeature().untyped().field());


        Query convertedDist = DistanceFeatureQuery.of(dfq -> dfq.date(d -> d
            .field("date")
            .pivot(Time.of(t -> t.time("7d")))
            .origin("now")))._toQuery();

        assertTrue(convertedDist.isDistanceFeature());

        //Decay Function / Function Score queries

        Query functionScoreQueryGaussDate = Query.of(q -> q.functionScore(fs -> fs
            .functions(fn -> fn
                .gauss(g -> g
                    .date(d -> d.field("date").placement(pl -> pl
                        .origin("2013-09-17")
                        .scale(Time.of(t -> t.time("10d")))
                        .offset(Time.of(t -> t.time("5d")))
                        .decay(0.5D)))))));

        String expectedFunctionScoreQueryGaussDate = "{\"function_score\":{\"functions\":[{\"gauss" +
            "\":{\"date\":{\"decay\":0.5,\"offset\":\"5d\",\"scale\":\"10d\",\"origin\":\"2013-09-17\"}}}]}}";
        assertEquals(expectedFunctionScoreQueryGaussDate, toJson(functionScoreQueryGaussDate));

        Query functionScoreQueryExpGeo = Query.of(q -> q.functionScore(fs -> fs
            .functions(fn -> fn
                .exp(g -> g
                    .geo(d -> d.field("location").placement(pl -> pl
                        .origin(GeoLocation.of(gl -> gl.latlon(LatLonGeoLocation.of(ll -> ll.lon(-71.3).lat(41.15)))))
                        .scale("1km")
                        .offset("2km")
                        .decay(0.5D)))))));

        String expectedFunctionScoreQueryExpGeo = "{\"function_score\":{\"functions\":[{\"exp\":{\"location" +
            "\":{\"decay\":0.5,\"offset\":\"2km\",\"scale\":\"1km\",\"origin\":{\"lat\":41.15,\"lon\":-71" +
            ".3}}}}]}}";
        assertEquals(expectedFunctionScoreQueryExpGeo, toJson(functionScoreQueryExpGeo));

        Query functionScoreQueryLinearNumeric = Query.of(q -> q.functionScore(fs -> fs
            .functions(fn -> fn
                .linear(g -> g
                    .numeric(d -> d.field("nums").placement(pl -> pl
                        .origin(2D)
                        .scale(3D)
                        .offset(4D)
                        .decay(0.5D)))))));

        String expectedFunctionScoreQueryLinearNumeric = "{\"function_score\":{\"functions\":[{\"linear" +
            "\":{\"nums\":{\"decay\":0.5,\"offset\":4.0,\"scale\":3.0,\"origin\":2.0}}}]}}";
        assertEquals(expectedFunctionScoreQueryLinearNumeric, toJson(functionScoreQueryLinearNumeric));

        String funScoreQuery =
            " {\n" +
                "\"function_score\": {\n" +
                "  \"functions\": [\n" +
                "{\n" +
                "  \"gauss\": {\n" +
                "\"date\": {\n" +
                "  \"origin\": \"2013-09-17\",\n" +
                "  \"scale\": \"10d\",\n" +
                "  \"offset\": \"5d\",\n" +
                "  \"decay\": 0.5\n" +
                "},\n" +
                "\"multi_value_mode\": \"avg\"\n" +
                "  }\n" +
                "}\n" +
                "  ]\n" +
                "}\n" +
                "  }";

        Query funScoreQueryFromJson = Query.of(q -> q.withJson(new StringReader(funScoreQuery)));
        assertTrue(funScoreQueryFromJson.functionScore().functions().get(0).gauss().isUntyped());
        assertEquals("2013-09-17",
            funScoreQueryFromJson.functionScore().functions().get(0).gauss().untyped().placement().origin().to(String.class));
        assertEquals(MultiValueMode.Avg,
            funScoreQueryFromJson.functionScore().functions().get(0).gauss().untyped().multiValueMode());


    }
}
