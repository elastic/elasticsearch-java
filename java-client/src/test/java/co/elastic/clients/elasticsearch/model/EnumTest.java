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

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.mapping.GeoOrientation;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EnumTest extends ModelTestCase {

    @Test
    public void testSimpleEnum() {
        assertNull(Bytes.GigaBytes.aliases());
        assertEquals(Bytes.GigaBytes, Bytes._DESERIALIZER.parse("gb"));
    }

    @Test
    public void testEnumWithAliases() {
        assertEquals("left", GeoOrientation.Left.jsonValue());
        assertNotNull(GeoOrientation.Left.aliases());

        Arrays.asList("right", "RIGHT", "counterclockwise", "ccw").forEach(alias -> {
            assertEquals(GeoOrientation.Right, GeoOrientation._DESERIALIZER.parse(alias));
        });
    }

    @Test
    public void testBooleanEnum() {
        // Quoted value
        assertEquals(Refresh.WaitFor, checkJsonRoundtrip(Refresh.WaitFor, "\"wait_for\""));

        // Unquoted boolean values
        assertEquals(Refresh.True, checkJsonRoundtrip(Refresh.True, "true"));
        assertEquals(Refresh.False, checkJsonRoundtrip(Refresh.False, "false"));

        // true/false as strings
        assertEquals(Refresh.True, fromJson("\"true\"", Refresh.class));
        assertEquals(Refresh.False, fromJson("\"false\"", Refresh.class));
    }
}
