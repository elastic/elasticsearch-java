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

package co.elastic.clients.elasticsearch.json.jackson;

import co.elastic.clients.json.jackson.JacksonJsonProvider;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class JacksonJsonpParserTest extends Assert {

    private static final String json = "{ 'foo': 'fooValue', 'bar': { 'baz': 1}, 'quux': [true] }".replace('\'', '"');

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
        } catch(IllegalStateException e) {
            // expected
        }
    }
}
