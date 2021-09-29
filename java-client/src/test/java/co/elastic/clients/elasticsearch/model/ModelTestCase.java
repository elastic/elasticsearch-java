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

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.junit.Assert;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * Base class for tests that encode/decode json
 */
public abstract class ModelTestCase extends Assert {

    // Same value for all tests in a test run
    private static final int RAND = new Random().nextInt(100);

    protected final JsonpMapper mapper;

    private JsonpMapper setupMapper(int rand) {
        // Randomly choose json-b or jackson
        if (rand % 2 == 0) {;
            System.out.println("Using a JsonB mapper (rand = " + rand + ").");
            return new JsonbJsonpMapper() {
                @Override
                public boolean ignoreUnknownFields() {
                    return false;
                }
            };
        } else {
            System.out.println("Using a Jackson mapper (rand = " + rand + ").");
            return new JacksonJsonpMapper() {
                @Override
                public boolean ignoreUnknownFields() {
                    return false;
                }
            };
        }
    }

    protected ModelTestCase() {
        this(RAND);
    }

    protected ModelTestCase(int rand) {
        mapper = setupMapper(rand);
    }

    protected <T> String toJson(T value) {
        return toJson(value, mapper);
    }

    public static <T> String toJson(T value, JsonpMapper mapper) {
        StringWriter sw = new StringWriter();
        JsonProvider provider = mapper.jsonProvider();
        JsonGenerator generator = provider.createGenerator(sw);
        mapper.serialize(value, generator);
        generator.close();
        return sw.toString();
    }

    public static <T> T fromJson(String json, Class<T> clazz, JsonpMapper mapper) {
        JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));
        return mapper.deserialize(parser, clazz);
    }

    protected <T> T fromJson(String json, Class<T> clazz) {
        return fromJson(json, clazz, mapper);
    }

    @SuppressWarnings("unchecked")
    protected <T> T checkJsonRoundtrip(T value, String expectedJson) {
        assertEquals(expectedJson, toJson(value));
        return fromJson(expectedJson, (Class<T>)value.getClass());
    }

    public static void assertGetterType(Class<?> expected, Class<?> clazz, String name) {
        Method method;
        try {
            method = clazz.getMethod(name);
        } catch (NoSuchMethodException e) {
            Assert.fail("Getter '" + clazz.getName() + "." + name + "' doesn't exist");
            return;
        }

        Assert.assertSame(expected, method.getReturnType());
    }
}
