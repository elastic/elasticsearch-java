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

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.FieldSort;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.elasticsearch._types.GeoShapeRelation;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.SortOptionsBuilders;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.query_dsl.FunctionScoreQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MultiValueMode;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.ShapeQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import co.elastic.clients.elasticsearch.connector.UpdateIndexNameRequest;
import co.elastic.clients.elasticsearch.core.rank_eval.RankEvalQuery;
import co.elastic.clients.elasticsearch.core.search.SourceFilter;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.LazyDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.util.MapBuilder;
import org.junit.jupiter.api.Test;

public class BehaviorsTest extends ModelTestCase {

    /**
     * Test for SingleKeyDictionary transformed to a behavior. For regular fields, see NamedValue tests in {@link ClassStructureTest}
     */
    @Test
    public void testSingleKeyDictionary() {
        TermQuery q = new TermQuery.Builder()
            .queryName("query-name")
            .field("field-name")
            .value(FieldValue.of("some-value"))
            .build();

        q = checkJsonRoundtrip(q, "{\"field-name\":{\"_name\":\"query-name\",\"value\":\"some-value\"}}");

        assertEquals("query-name", q.queryName());
        assertEquals("field-name", q.field());
        assertEquals("some-value", q.value().stringValue());
    }

    @Test
    public void testAdditionalPropertyOnClass() {
        ShapeQuery q = new ShapeQuery.Builder()
            .queryName("query-name")
            .field("field-name")
            .shape(_0 -> _0
                .relation(GeoShapeRelation.Disjoint)
            )
            .ignoreUnmapped(true)
            .build();

        q = checkJsonRoundtrip(q,
            "{\"field-name\":{\"relation\":\"disjoint\"},\"_name\":\"query-name\",\"ignore_unmapped\":true}"
        );

        assertEquals("query-name", q.queryName());
        assertTrue(q.ignoreUnmapped());
        assertEquals(GeoShapeRelation.Disjoint, q.shape().relation());
    }

    @Test
    public void testAdditionalPropertyOnContainer() {
        // Regular variant
        {
            SortOptions so = SortOptions.of(_0 -> _0
                .doc(_1 -> _1.order(SortOrder.Asc))
            );

            so = checkJsonRoundtrip(so, "{\"_doc\":{\"order\":\"asc\"}}");
            assertEquals(SortOptions.Kind.Doc, so._kind());
            assertEquals(SortOrder.Asc, so.doc().order());
        }

        // Regular variant
        {
            SortOptions so = SortOptionsBuilders.geoDistance()
                .field("foo")
                .location(GeoLocation.of(_b -> _b.text("someWKT")))
                .build()
                ._toSortOptions();

            so = checkJsonRoundtrip(so, "{\"_geo_distance\":{\"foo\":[\"someWKT\"]}}");
            assertEquals(SortOptions.Kind.GeoDistance, so._kind());
            assertEquals("foo", so.geoDistance().field());
            assertEquals("someWKT", so.geoDistance().location().get(0).text());
        }

        {
            SortOptions so = SortOptions.of(_0 -> _0
                .score(_1 -> _1.order(SortOrder.Asc)));

            so = checkJsonRoundtrip(so, "{\"_score\":{\"order\":\"asc\"}}");
            assertEquals(SortOptions.Kind.Score, so._kind());
            assertEquals(SortOrder.Asc, so.score().order());
        }

        {
            SortOptions so = SortOptions.of(_0 -> _0
                .script(_1 -> _1.script(_3 -> _3.source("blah")))
            );
            so = checkJsonRoundtrip(so, "{\"_script\":{\"script\":{\"source\":\"blah\"}}}");
            assertEquals("blah", so.script().script().source());

        }

        // Additional property variant
        {
            SortOptions so = SortOptions.of(_0 -> _0
                .field(_1 -> _1.field("foo").order(SortOrder.Desc))
            );

            so = checkJsonRoundtrip(so, "{\"foo\":{\"order\":\"desc\"}}");
            assertEquals(SortOptions.Kind.Field, so._kind());
            assertEquals("foo", so.field().field());
            assertEquals(SortOrder.Desc, so.field().order());
        }
    }

    @Test
    public void testAdditionalProperties() {
        // Check that additional property map is initialized even if not set explicitly
        ErrorCause err = new ErrorCause.Builder()
            .reason("Foo")
            .type("Bar")
            .build();
        assertEquals(0, err.metadata().size());

        err = new ErrorCause.Builder()
            .reason("Some failure")
            .type("Some type")
            .metadata(MapBuilder.of(
                "index", JsonData.of("test"),
                "retries", JsonData.of(1)
            ))
            .build();

        err = checkJsonRoundtrip(err, "{\"index\":\"test\",\"retries\":1,\"type\":\"Some type\",\"reason\":\"Some failure\"}");

        assertEquals("Some failure", err.reason());
        assertEquals(1, err.metadata().get("retries").to(int.class).intValue());
        assertEquals("test", err.metadata().get("index").to(String.class));
    }

    @Test
    public void testPrimitiveShortcutProperty() {

        // All-in-one: a variant, wrapping a single-key dictionary with a shortcut property
        String json = "{\"term\":{\"some-field\":\"some-value\"}}";
        Query q = fromJson(json, Query.class);

        assertEquals("some-field", q.term().field());
        assertEquals("some-value", q.term().value().stringValue());

    }

    @Test
    public void testArrayShortcutProperty() {

        // Check that don't look ahead to handle the shortcut
        ObjectDeserializer<?> deser = (ObjectDeserializer<?>) LazyDeserializer.unwrap(SourceFilter._DESERIALIZER);
        assertEquals("includes", deser.shortcutProperty());
        assertFalse(deser.shortcutIsObject());

        // Regular form
        SourceFilter sf = fromJson("{\"includes\":[\"foo\",\"bar\"]}", SourceFilter.class);
        assertEquals(2, sf.includes().size());
        assertEquals("foo", sf.includes().get(0));
        assertEquals("bar", sf.includes().get(1));

        // Shortcut with an array value
        sf = fromJson("[\"foo\",\"bar\"]", SourceFilter.class);
        assertEquals(2, sf.includes().size());
        assertEquals("foo", sf.includes().get(0));
        assertEquals("bar", sf.includes().get(1));

        // Shortcut with a single value (lenient array)
        sf = fromJson("\"foo\"]", SourceFilter.class);
        assertEquals(1, sf.includes().size());
        assertEquals("foo", sf.includes().get(0));
    }

    @Test
    public void testEnumShortcutProperty() {

        // Check that we don't look ahead to handle the shortcut
        ObjectDeserializer<?> deser = (ObjectDeserializer<?>) LazyDeserializer.unwrap(FieldSort._DESERIALIZER);
        assertEquals("order", deser.shortcutProperty());
        assertFalse(deser.shortcutIsObject());

        // We have to test on the enclosing SortOption as FieldSort is used as a single-key dict
        SortOptions so = fromJson("{\"foo\":{\"order\":\"asc\"}}", SortOptions.class);

        assertEquals("foo", so.field().field());
        assertEquals(SortOrder.Asc, so.field().order());

        so = fromJson("{\"foo\":\"asc\"}", SortOptions.class);

        assertEquals("foo", so.field().field());
        assertEquals(SortOrder.Asc, so.field().order());
    }

    @Test
    public void testObjectShortcutProperty() {

        // Check that we look ahead to handle the shortcut
        ObjectDeserializer<?> deser = (ObjectDeserializer<?>) LazyDeserializer.unwrap(RankEvalQuery._DESERIALIZER);
        assertEquals("query", deser.shortcutProperty());
        assertTrue(deser.shortcutIsObject());

        // Standard form
        RankEvalQuery req = fromJson("{\"query\":{\"term\":{\"foo\":{\"value\":\"bar\"}}}}", RankEvalQuery.class);

        assertEquals("foo", req.query().term().field());
        assertEquals("bar", req.query().term().value().stringValue());

        // Shortcut form
        req = fromJson("{\"term\":{\"foo\":{\"value\":\"bar\"}}}", RankEvalQuery.class);

        assertEquals("foo", req.query().term().field());
        assertEquals("bar", req.query().term().value().stringValue());

        // Nested shortcuts
        req = fromJson("{\"term\":{\"foo\":\"bar\"}}", RankEvalQuery.class);

        assertEquals("foo", req.query().term().field());
        assertEquals("bar", req.query().term().value().stringValue());
    }
    
    @Test
    public void testFunctionScoreQuery() {
        String shortcut =
            "{" +
            "  \"gauss\": {" +
            "    \"date\": {" +
            "      \"origin\": \"2013-09-17\", " +
            "      \"scale\": \"10d\"," +
            "      \"offset\": \"5d\",         " +
            "      \"decay\": 0.5" +
            "    }," +
            "    \"multi_value_mode\": \"avg\"" +
            "  }" +
            "}";

        String full =
            "{" +
            "  \"functions\": [" +
            "    {" +
            "      \"gauss\": {" +
            "        \"date\": {" +
            "          \"origin\": \"2013-09-17\"," +
            "          \"scale\": \"10d\"," +
            "          \"offset\": \"5d\"," +
            "          \"decay\": 0.5" +
            "        }," +
            "        \"multi_value_mode\": \"avg\"" +
            "      }" +
            "    }" +
            "  ]" +
            "}";

        FunctionScoreQuery fsq;

        fsq = fromJson(full, FunctionScoreQuery.class);
        assertEquals(MultiValueMode.Avg, fsq.functions().get(0).gauss().untyped().multiValueMode());

        fsq = fromJson(shortcut, FunctionScoreQuery.class);
        assertEquals(MultiValueMode.Avg, fsq.functions().get(0).gauss().untyped().multiValueMode());
    }

    @Test
    public void testWithNull() {

        String jsonValue = "{\"index_name\":\"value\"}";
        String jsonNull = "{\"index_name\":null}";
        UpdateIndexNameRequest updateValue = UpdateIndexNameRequest.of(u -> u.connectorId("connector").indexName("value"));
        UpdateIndexNameRequest updateNull = UpdateIndexNameRequest.of(u -> u.connectorId("connector").indexNameWithNull());

        assertEquals(jsonValue,toJson(updateValue));
        assertEquals(jsonNull,toJson(updateNull));
    }
}
