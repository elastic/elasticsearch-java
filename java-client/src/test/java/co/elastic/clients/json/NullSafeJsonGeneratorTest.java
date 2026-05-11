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
import co.elastic.clients.util.ApiTypeHelper;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

public class NullSafeJsonGeneratorTest extends ModelTestCase {

    @Test
    public void testNullReferencesAreWrittenAsJsonNull() {
        StringWriter writer = new StringWriter();
        try (JsonGenerator generator = new NullSafeJsonGenerator(mapper.jsonProvider().createGenerator(writer))) {
            generator.writeStartObject();

            // writeKey + write(value) overloads with null reference values
            generator.writeKey("string_field");
            generator.write((String) null);
            generator.writeKey("decimal_field");
            generator.write((BigDecimal) null);
            generator.writeKey("integer_field");
            generator.write((BigInteger) null);
            generator.writeKey("json_value_field");
            generator.write((JsonValue) null);

            // name+value overloads with null reference values — DelegatingJsonGenerator splits these into
            // writeKey(name) + write(value), so they reach the overrides above via virtual dispatch.
            generator.write("named_string", (String) null);
            generator.write("named_decimal", (BigDecimal) null);
            generator.write("named_integer", (BigInteger) null);
            generator.write("named_json_value", (JsonValue) null);

            generator.writeEnd();
        }

        assertEquals(
            "{" +
                "\"string_field\":null," +
                "\"decimal_field\":null," +
                "\"integer_field\":null," +
                "\"json_value_field\":null," +
                "\"named_string\":null," +
                "\"named_decimal\":null," +
                "\"named_integer\":null," +
                "\"named_json_value\":null" +
            "}",
            writer.toString()
        );
    }

    @Test
    public void testNonNullValuesPassThrough() {
        StringWriter writer = new StringWriter();
        try (JsonGenerator generator = new NullSafeJsonGenerator(mapper.jsonProvider().createGenerator(writer))) {
            generator.writeStartObject();
            generator.write("string_field", "hello");
            generator.write("int_field", 42);
            generator.write("long_field", 10000000000L);
            generator.write("double_field", 1.5);
            generator.write("bool_field", true);
            generator.write("decimal_field", new BigDecimal("3.14"));
            generator.write("integer_field", new BigInteger("12345"));
            generator.writeEnd();
        }

        assertEquals(
            "{" +
                "\"string_field\":\"hello\"," +
                "\"int_field\":42," +
                "\"long_field\":10000000000," +
                "\"double_field\":1.5," +
                "\"bool_field\":true," +
                "\"decimal_field\":3.14," +
                "\"integer_field\":12345" +
            "}",
            writer.toString()
        );
    }

    @Test
    public void testToJsonStringWithMapWhileWorkaroundActive() {
        // SimpleJsonpMapper only serializes types registered in the Java client and doesn't support arbitrary Maps.
        Assumptions.assumeFalse(jsonImpl == JsonImpl.Simple, "SimpleJsonpMapper does not support arbitrary Map serialization");
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", "two");

        try (ApiTypeHelper.DisabledChecksHandle h =
                 ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(true)) {
            assertEquals("{\"a\":1,\"b\":\"two\"}", JsonpUtils.toJsonString(map, mapper));
        }
    }

    @Test
    public void testToJsonStringWithPojoWhileWorkaroundActive() {
        Assumptions.assumeFalse(jsonImpl == JsonImpl.Simple, "SimpleJsonpMapper does not support POJO serialization");
        SomePojo pojo = new SomePojo();
        pojo.name = "test";
        pojo.value = 42;

        try (ApiTypeHelper.DisabledChecksHandle h =
                 ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(true)) {
            String json = JsonpUtils.toJsonString(pojo, mapper);
            assertTrue(json.contains("\"name\":\"test\""), "Expected name field, got: " + json);
            assertTrue(json.contains("\"value\":42"), "Expected value field, got: " + json);
        }
    }

    public static class SomePojo {
        public String name;
        public int value;
    }
}
