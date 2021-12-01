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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.aggregations.StatsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.StringStatsAggregate;
import co.elastic.clients.elasticsearch._types.query_dsl.SpanGapQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import org.junit.Test;

import java.util.List;

public class BuiltinTypesTest extends ModelTestCase {

    @Test
    public void testPrimitiveTypes() {

        assertGetterType(Integer.class, SearchRequest.class, "size");

        // Lenient boolean: 'query_string.lenient'?: boolean | string
        // Also tests field names with '.'
        assertGetterType(Boolean.class, IndexSettings.class, "queryStringLenient");

    }

    @Test
    public void testLenientArray() {
        // index: Indices --> type Indices = IndexName | IndexName[]
        assertGetterType(List.class, SearchRequest.class, "index");
    }

    @Test
    public void testSpanGapQuery() {
        // Hand-written class
        SpanGapQuery q = SpanGapQuery.of(b -> b
            .field("a-field")
            .spanWidth(12)
        );

        q = checkJsonRoundtrip(q, "{\"a-field\":12}");

        assertEquals("a-field", q.field());
        assertEquals(12, q.spanWidth());
    }

    @Test
    public void testSortOptions() {
        // Has a custom deserializer
        // Examples: see https://www.elastic.co/guide/en/elasticsearch/reference/current/sort-search-results.html

        String json;
        SortOptions sort;

        // Arbitrary field
        sort = fromJson(
            "{ \"post_date\" : {\"order\" : \"asc\", \"format\": \"strict_date_optional_time_nanos\"}}",
            SortOptions.class);

        assertEquals("post_date", sort.field().field());
        assertEquals(SortOrder.Asc, sort.field().order());

        sort = fromJson("{\n" +
            "          \"offer.price\" : {\n" +
            "             \"mode\" :  \"avg\",\n" +
            "             \"order\" : \"asc\",\n" +
            "             \"nested\": {\n" +
            "                \"path\": \"offer\",\n" +
            "                \"filter\": {\n" +
            "                   \"term\" : { \"offer.color\" : \"blue\" }\n" +
            "                }\n" +
            "             }\n" +
            "          }\n" +
            "       }", SortOptions.class);

        assertEquals("blue", sort.field().nested().filter().term().value().stringValue());

        // Geo distance
        sort = fromJson("{\n" +
            "      \"_geo_distance\" : {\n" +
            "        \"pin.location\" : {\n" +
            "          \"lat\" : 40,\n" +
            "          \"lon\" : -70\n" +
            "        },\n" +
            "        \"order\" : \"asc\",\n" +
            "        \"unit\" : \"km\"\n" +
            "      }\n" +
            "    }", SortOptions.class);

        assertEquals(40, sort.geoDistance().location().get(0).latlon().lat(), 0.1);

        // Simple string shortcuts
        sort = fromJson("\"user\"", SortOptions.class);
        assertEquals("user", sort.field().field());

        sort = fromJson("\"_doc\"", SortOptions.class);
        assertTrue(sort.isDoc());

        sort = fromJson("\"_score\"", SortOptions.class);
        assertTrue(sort.isScore());
    }

    @Test
    public void testFieldValue() {

        FieldValue f;

        f = FieldValue.of(b -> b.nullValue());
        f = checkJsonRoundtrip(f, "null");
        assertTrue(f.isNull());
        assertEquals("null", f._toJsonString());

        f = FieldValue.of(b -> b.doubleValue(1.23));
        f = checkJsonRoundtrip(f, "1.23");
        assertTrue(f.isDouble());
        assertEquals(1.23, f.doubleValue(), 0.01);
        assertEquals("1.23", f._toJsonString());

        f = FieldValue.of(b -> b.longValue(123));
        f = checkJsonRoundtrip(f, "123");
        assertTrue(f.isLong());
        assertEquals(123, f.longValue());
        assertEquals("123", f._toJsonString());

        f = FieldValue.of(b -> b.booleanValue(true));
        f = checkJsonRoundtrip(f, "true");
        assertTrue(f.isBoolean());
        assertTrue(f.booleanValue());
        assertEquals("true", f._toJsonString());

        f = FieldValue.of(b -> b.booleanValue(false));
        f = checkJsonRoundtrip(f, "false");
        assertTrue(f.isBoolean());
        assertFalse(f.booleanValue());
        assertEquals("false", f._toJsonString());

        f = FieldValue.of(b -> b.stringValue("foo"));
        f = checkJsonRoundtrip(f, "\"foo\"");
        assertTrue(f.isString());
        assertEquals("foo", f.stringValue());
        assertEquals("foo", f._toJsonString());

    }

    @Test
    public void testNullableDouble() {
        StatsAggregate stats;

        // Regular values
        stats = StatsAggregate.statsAggregateOf(b -> b // Parent classes can't have an overloaded "of" method
            .count(10)
            .min(1.0)
            .avg(1.5)
            .max(2.0)
            .sum(5.0)
        );

        stats = checkJsonRoundtrip(stats, "{\"count\":10,\"min\":1.0,\"max\":2.0,\"avg\":1.5,\"sum\":5.0}");
        assertEquals(10, stats.count());
        assertEquals(1.0, stats.min(), 0.01);
        assertEquals(1.5, stats.avg(), 0.01);
        assertEquals(2.0, stats.max(), 0.01);
        assertEquals(5.0, stats.sum(), 0.01);

        // Missing values (JSON null, Java infinite)
        String json = "{\"count\":0,\"min\":null,\"max\":null,\"avg\":null,\"sum\":0.0}";
        stats = fromJson(json, StatsAggregate.class);

        assertEquals(0, stats.count());
        assertTrue(Double.isInfinite(stats.min()));
        assertEquals(0.0, stats.avg(), 0.01);
        assertTrue(Double.isInfinite(stats.max()));
        assertEquals(0.0, stats.sum(), 0.01);

        // We don't serialize finite default values as null
        assertEquals("{\"count\":0,\"min\":null,\"max\":null,\"avg\":0.0,\"sum\":0.0}", toJson(stats));
    }

    @Test
    public void testNullableInt() {
        StringStatsAggregate stats = StringStatsAggregate.of(b -> b
            .count(1)
            .minLength(2)
            .avgLength(3)
            .maxLength(4)
            .entropy(0)
        );

        stats = checkJsonRoundtrip(stats, "{\"count\":1,\"min_length\":2,\"max_length\":4,\"avg_length\":3.0,\"entropy\":0.0}");
        assertEquals(2, stats.minLength());
        assertEquals(4, stats.maxLength());

        // Missing values
        String json = "{\"count\":1,\"min_length\":null,\"max_length\":null,\"avg_length\":null,\"entropy\":null}";
        stats = fromJson(json, StringStatsAggregate.class);
        assertEquals(0, stats.minLength());
        assertEquals(0, stats.maxLength());
        assertEquals(0.0, stats.entropy(), 0.01);
    }
}
