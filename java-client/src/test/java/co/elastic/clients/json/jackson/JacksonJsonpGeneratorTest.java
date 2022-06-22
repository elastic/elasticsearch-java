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

import jakarta.json.Json;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;

public class JacksonJsonpGeneratorTest extends Assertions {

    @Test
    public void testWrite(){
        StringWriter sw = new StringWriter();
        JsonGenerator generator = new JacksonJsonpMapper().jsonProvider().createGenerator(sw);

        generator.writeStartObject();

        // Boolean
        generator.write("bool1", true);
        generator.writeKey("bool2");
        generator.write(false);

        // String
        generator.write("str1", "foo");
        generator.writeKey("str2");
        generator.write("bar");

        // Integer
        generator.write("int1", 42);
        generator.writeKey("int2");
        generator.write(1337);

        // Long
        generator.write("long1", 123456789012345L);
        generator.writeKey("long2");
        generator.write(123456789012345L);

        generator.write("double1", 0.001);
        generator.writeKey("double2");
        generator.write(12345.6789);

        // JsonValue
        JsonValue jsonValue = Json.createObjectBuilder()
            .add("bool", true)
            .add("str", "foo")
            .add("int", 42)
            .add("long", 123456789012345L)
            .add("double", 12345.6789)
            .build();

        generator.write("value", jsonValue);

        generator.close();

        assertEquals("{" +
            "\"bool1\":true," +
            "\"bool2\":false," +
            "\"str1\":\"foo\"," +
            "\"str2\":\"bar\"," +
            "\"int1\":42," +
            "\"int2\":1337," +
            "\"long1\":123456789012345," +
            "\"long2\":123456789012345," +
            "\"double1\":0.001," +
            "\"double2\":12345.6789," +
            "\"value\":{\"bool\":true,\"str\":\"foo\",\"int\":42,\"long\":123456789012345,\"double\":12345.6789}" +
            "}", sw.toString());
    }
}
