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

package co.elastic.clients.transport.http;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Map;

class HeaderMapTest extends Assertions {

    @Test
    public void testCaseSensitivity() {
        HeaderMap headers = new HeaderMap();

        headers.put("Foo", "bar");
        assertEquals("bar", headers.get("Foo"));
        assertEquals("bar", headers.get("foo"));
        assertEquals("bar", headers.get("fOO"));

        headers.put("foo", "baz");
        assertEquals("baz", headers.get("Foo"));
        assertEquals("baz", headers.get("foo"));
        assertEquals("baz", headers.get("fOO"));
    }

    @Test
    public void testLock() {
        HeaderMap headers = new HeaderMap();

        headers.put("foo", "bar");

        HeaderMap locked = headers.locked();
        assertEquals("bar", headers.get("Foo"));

        assertThrows(UnsupportedOperationException.class, () -> {
            locked.put("foo", "baz");
        });

        assertThrows(UnsupportedOperationException.class, () -> {
            Iterator<Map.Entry<String, String>> iterator = locked.entrySet().iterator();
            assertEquals("bar", iterator.next().getValue());
            iterator.remove();
        });

        headers.put("foo", "baz");
        assertEquals("baz", headers.get("Foo"));
        assertEquals("bar", locked.get("Foo"));
    }

    @Test
    public void testAdd() {
        HeaderMap headers = new HeaderMap();

        headers.add("Foo", "bar");
        headers.add("foo", "baz");

        assertEquals("bar; baz", headers.get("Foo"));
    }
}
