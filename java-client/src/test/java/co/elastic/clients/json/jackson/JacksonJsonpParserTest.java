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

package co.elastic.clients.json.jackson;

import co.elastic.clients.elasticsearch.core.MsearchResponse;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.testkit.ModelTestCase;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class JacksonJsonpParserTest extends ModelTestCase {

    private static final String json =
        "{ 'foo': 'fooValue', 'bar': { 'baz': 1}, 'quux': [true] }".replace('\'', '"');

    @Test
    public void testEventStream() {

        JacksonJsonProvider provider = new JacksonJsonProvider();
        JsonParser parser = provider.createParser(new StringReader(json));

        assertEquals(Event.START_OBJECT, parser.next());

        assertEquals(Event.KEY_NAME, parser.next());
        assertEquals("foo", parser.getString());

        assertEquals(Event.VALUE_STRING, parser.next());
        assertEquals("fooValue", parser.getString());

        // test it sometimes, but not always to detect invalid state management
        assertTrue(parser.hasNext());

        assertEquals(Event.KEY_NAME, parser.next());
        assertEquals("bar", parser.getString());

        assertEquals(Event.START_OBJECT, parser.next());

        assertEquals(Event.KEY_NAME, parser.next());
        assertEquals("baz", parser.getString());

        assertTrue(parser.hasNext());
        assertEquals(Event.VALUE_NUMBER, parser.next());
        assertEquals(1, parser.getInt());

        assertEquals(Event.END_OBJECT, parser.next());

        assertEquals(Event.KEY_NAME, parser.next());
        assertEquals("quux", parser.getString());

        assertEquals(Event.START_ARRAY, parser.next());

        assertEquals(Event.VALUE_TRUE, parser.next());

        assertEquals(Event.END_ARRAY, parser.next());
        assertEquals(Event.END_OBJECT, parser.next());

        assertFalse(parser.hasNext());
    }

    @Test
    public void testForbidValueGettersAfterHasNext() {

        JacksonJsonProvider provider = new JacksonJsonProvider();
        JsonParser parser = provider.createParser(new StringReader(json));

        assertEquals(Event.START_OBJECT, parser.next());
        assertEquals(Event.KEY_NAME, parser.next());
        assertEquals(Event.VALUE_STRING, parser.next());
        assertEquals("fooValue", parser.getString());

        assertTrue(parser.hasNext());

        try {
            assertEquals("fooValue", parser.getString());
            fail();
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    void testMultiSearchResponse() {
        String json =
            "{\n" +
                "  \"took\" : 1,\n" +
                "  \"responses\" : [\n" +
                "    {\n" +
                "      \"error\" : {\n" +
                "        \"root_cause\" : [\n" +
                "          {\n" +
                "            \"type\" : \"index_not_found_exception\",\n" +
                "            \"reason\" : \"no such index [foo_bar]\",\n" +
                "            \"resource.type\" : \"index_or_alias\",\n" +
                "            \"resource.id\" : \"foo_bar\",\n" +
                "            \"index_uuid\" : \"_na_\",\n" +
                "            \"index\" : \"foo_bar\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"type\" : \"index_not_found_exception\",\n" +
                "        \"reason\" : \"no such index [foo_bar]\",\n" +
                "        \"resource.type\" : \"index_or_alias\",\n" +
                "        \"resource.id\" : \"foo_bar\",\n" +
                "        \"index_uuid\" : \"_na_\",\n" +
                "        \"index\" : \"foo_bar\"\n" +
                "      },\n" +
                "      \"status\" : 404\n" +
                "    },\n" +
                "    {\n" +
                "      \"took\" : 1,\n" +
                "      \"timed_out\" : false,\n" +
                "      \"_shards\" : {\n" +
                "        \"total\" : 1,\n" +
                "        \"successful\" : 1,\n" +
                "        \"skipped\" : 0,\n" +
                "        \"failed\" : 0\n" +
                "      },\n" +
                "      \"hits\" : {\n" +
                "        \"total\" : {\n" +
                "          \"value\" : 5,\n" +
                "          \"relation\" : \"eq\"\n" +
                "        },\n" +
                "        \"max_score\" : 1.0,\n" +
                "        \"hits\" : [\n" +
                "          {\n" +
                "            \"_index\" : \"foo\",\n" +
                "            \"_id\" : \"Wr0ApoEBa_iiaABtVM57\",\n" +
                "            \"_score\" : 1.0,\n" +
                "            \"_source\" : {\n" +
                "              \"x\" : 1,\n" +
                "              \"y\" : true\n" +
                "            }\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"status\" : 200\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";

        JsonpMapper mapper = new JacksonJsonpMapper();
        mapper = mapper.withAttribute("co.elastic.clients:Deserializer:_global.msearch.Response.TDocument",
            JsonpDeserializer.of(Foo.class));
        @SuppressWarnings("unchecked")
        MsearchResponse<Foo> response = fromJson(json, MsearchResponse.class, mapper);

        assertEquals(2, response.responses().size());
        assertEquals(404, response.responses().get(0).failure().status());
        assertEquals(200, response.responses().get(1).result().status());
    }

    public static class Foo {
        private int x;
        private boolean y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public boolean isY() {
            return y;
        }

        public void setY(boolean y) {
            this.y = y;
        }
    }

}
