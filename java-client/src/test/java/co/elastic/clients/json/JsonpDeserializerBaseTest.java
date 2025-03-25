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

package co.elastic.clients.json;

import co.elastic.clients.testkit.ModelTestCase;
import jakarta.json.stream.JsonParser;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JsonpDeserializerBaseTest extends ModelTestCase {

    @Test
    public void testArrayDeserializer() {

        JsonpDeserializer<List<Integer>> deser =
            JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer());

        assertFalse(deser.nativeEvents().contains(JsonParser.Event.VALUE_NUMBER));
        assertTrue(deser.acceptedEvents().contains(JsonParser.Event.VALUE_NUMBER));

        List<Integer> values = fromJson("[ 42, 43 ]", deser);
        assertEquals(2, values.size());
        assertEquals(42, values.get(0));
        assertEquals(43, values.get(1));

        // Single value representation
        values = fromJson("42", deser);
        assertEquals(1, values.size());
        assertEquals(42, values.get(0));

    }
}
