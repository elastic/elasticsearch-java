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

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

public class JsonpMapperTest extends Assert {

    @Test
    public void testJsonb() {

        JsonpMapper mapper = new JsonbJsonpMapper();
        String json = "{\"children\":[{\"doubleValue\":3.2,\"intValue\":2}],\"doubleValue\":2.1,\"intValue\":1," +
            "\"stringValue\":\"foo\"}";

        testSerialize(mapper, json);
        testDeserialize(mapper, json);
    }

    @Test
    public void testJackson() {
        JacksonJsonpMapper mapper = new JacksonJsonpMapper();

        // With the default settings Jackson will serialize null values
        String json = "{\"children\":[{\"children\":null,\"doubleValue\":3.2,\"intValue\":2,\"stringValue\":null}]," +
            "\"doubleValue\":2.1,\"intValue\":1,\"stringValue\":\"foo\"}";

        testSerialize(new JacksonJsonpMapper(), json);
        testDeserialize(new JacksonJsonpMapper(), json);
    }

    @Test
    public void testJacksonCustomMapper() {
        ObjectMapper jkMapper = new ObjectMapper();
        jkMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        jkMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        JacksonJsonpMapper mapper = new JacksonJsonpMapper(jkMapper);

        String json = "{\"children\":[{\"double_value\":3.2,\"int_value\":2}],\"double_value\":2.1,\"int_value\":1," +
            "\"string_value\":\"foo\"}";

        testSerialize(mapper, json);
        testDeserialize(mapper, json);
    }

    private void testSerialize(JsonpMapper mapper, String expected) {

        SomeClass something = new SomeClass();
        something.setIntValue(1);
        something.setDoubleValue(2.1);
        something.setStringValue("foo");

        SomeClass other = new SomeClass();
        other.setIntValue(2);
        other.setDoubleValue(3.2);
        something.setChildren(Collections.singletonList(other));

        StringWriter strw = new StringWriter();
        JsonGenerator generator = mapper.jsonpProvider().createGenerator(strw);

        mapper.serialize(something, generator);

        generator.close();

        assertEquals(expected, strw.getBuffer().toString());
    }

    private void testDeserialize(JsonpMapper mapper, String json) {

        JsonParser parser = mapper.jsonpProvider().createParser(new StringReader(json));
        SomeClass parsed = mapper.getDeserializer(SomeClass.class).deserialize(parser, mapper);

        assertEquals(1, parsed.getIntValue());
        assertEquals(2.1, parsed.getDoubleValue(), 0.0);
        assertEquals("foo", parsed.getStringValue());

        List<SomeClass> children = parsed.getChildren();
        assertEquals(1, children.size());

        SomeClass child = children.get(0);

        assertEquals(2, child.getIntValue());
        assertEquals(3.2, child.getDoubleValue(), 0.0);
        assertNull(child.getStringValue());
        assertNull(child.getChildren());
    }

    public static class SomeClass {
        private List<SomeClass> children;
        private double doubleValue;
        private int intValue;
        private String stringValue;

        public int getIntValue() {
            return intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        public double getDoubleValue() {
            return doubleValue;
        }

        public void setDoubleValue(double doubleValue) {
            this.doubleValue = doubleValue;
        }

        public List<SomeClass> getChildren() {
            return children;
        }

        public void setChildren(List<SomeClass> children) {
            this.children = children;
        }
    }
}
