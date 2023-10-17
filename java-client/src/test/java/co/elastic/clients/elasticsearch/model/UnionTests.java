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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
                .inline(_2 -> _2
                    .source("a script")
                )
            );
            s = checkJsonRoundtrip(s, "{\"source\":\"a script\"}");
            assertEquals("a script", s.inline().source());
        }

        {
            Script s = Script.of(_1 -> _1
                .stored(_2 -> _2
                    .id("script_id")
                )
            );
            s = checkJsonRoundtrip(s, "{\"id\":\"script_id\"}");
            assertEquals("script_id", s.stored().id());
        }

        {
            // Test shortcut property
            Script s = fromJson("\"a script\"", Script.class);
            assertEquals("a script", s.inline().source());
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
}
