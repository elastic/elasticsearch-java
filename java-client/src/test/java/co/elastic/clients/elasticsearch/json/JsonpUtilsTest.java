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

package co.elastic.clients.elasticsearch.json;

import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.AllowForbiddenApis;
import jakarta.json.JsonException;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.function.Consumer;

public class JsonpUtilsTest extends Assertions {

    @Test
    @AllowForbiddenApis("Testing JsonpUtil.provider()")
    public void testProviderLoading() {
        // See https://github.com/elastic/elasticsearch-java/issues/163

        // Create an empty non-delegating classloader and set it as the context classloader. It simulates a
        // plugin system that doesn't set the context classloader to the plugins classloader.
        ClassLoader emptyLoader = new ClassLoader() {
            @Override
            public Enumeration<URL> getResources(String name) {
                return Collections.emptyEnumeration();
            }
        };

        ClassLoader savedLoader = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(emptyLoader);

            assertThrows(JsonException.class, () -> {
                assertNotNull(JsonProvider.provider());
            });

            assertNotNull(JsonpUtils.provider());

        } finally {
            Thread.currentThread().setContextClassLoader(savedLoader);
        }
    }

    @Test
    public void testObjectToString() {
        // Test that we call toString() on application classes.
        Hit<SomeUserData> hit = Hit.of(h -> h
            .source(new SomeUserData())
            .index("idx")
            .id("id1")
        );
        assertEquals("Hit: {\"_index\":\"idx\",\"_id\":\"id1\",\"_source\":\"Some user data\"}", hit.toString());
    }

    private static class SomeUserData {
        @Override
        public String toString() {
            return "Some user data";
        }
    }

    @Test
    public void testLargeObjectToString() {
        // Build a large string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1001; i++) {
            sb.append("0123456789");
        }

        String text = sb.toString();
        assertEquals(10010, text.length());

        Hit<String> hit = Hit.of(h -> h
            .source(text)
            .index("idx")
            .id("id1")
        );

        String toString = hit.toString();

        assertEquals(10000 + "Hit: ".length() + "...".length(), toString.length());
        assertTrue(toString.startsWith("Hit: "));
        assertTrue(toString.endsWith("..."));
    }

    @Test
    public void testSerializeDoubleOrNull() {
        // ---- Double values
        assertEquals("{\"a\":null}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, Double.NaN, Double.NaN)));
        assertEquals("{\"a\":1.0}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, 1.0, Double.NaN)));

        assertEquals("{\"a\":null}",
            orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
        assertEquals("{\"a\":1.0}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, 1.0, Double.POSITIVE_INFINITY)));

        assertEquals("{\"a\":null}",
            orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
        assertEquals("{\"a\":1.0}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, 1.0, Double.NEGATIVE_INFINITY)));

        assertEquals("{\"a\":null}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, Double.NaN, 0.0)));

        // Serialize defined default values
        assertEquals("{\"a\":0.0}", orNullHelper(g -> JsonpUtils.serializeDoubleOrNull(g, 0.0, 0.0)));

    }

    @Test
    public void testSerializeIntOrNull() {
        assertEquals("{\"a\":null}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, Integer.MAX_VALUE, Integer.MAX_VALUE)));
        assertEquals("{\"a\":1}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, 1, Integer.MAX_VALUE)));
        assertEquals("{\"a\":1}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, 1, 0)));

        // Integer.MAX_VALUE is valid if not the default value
        assertEquals("{\"a\":2147483647}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, Integer.MAX_VALUE, 0)));
        assertEquals("{\"a\":2147483647}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, Integer.MAX_VALUE, Integer.MIN_VALUE)));

        // Serialize non infinite default values
        assertEquals("{\"a\":0}", orNullHelper(g -> JsonpUtils.serializeIntOrNull(g, 0, 0)));
    }

    private static String orNullHelper(Consumer<JsonGenerator> c) {
        StringWriter sw = new StringWriter();
        JsonGenerator generator = JsonpUtils.provider().createGenerator(sw);

        generator.writeStartObject();
        generator.writeKey("a");
        c.accept(generator);
        generator.writeEnd();
        generator.close();

        return sw.toString();
    }
}
