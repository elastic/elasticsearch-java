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

package co.elastic.clients.elasticsearch.experiments.containers;

import co.elastic.clients.elasticsearch.experiments.containers.container_members.VariantA;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

public class SomeContainerTest extends Assert {

    SomeContainer foo = new SomeContainer.Builder()
        .variantA(a_ -> a_
            .containerProp("foo")
            .variantAProp("bar")
        ).build();

    String json = "{\"container_prop\":\"foo\",\"variant_a\":{\"variant_a_prop\":\"bar\"}}";

    @Test
    public void testContainerBuilder() {
        assertEquals("foo", foo.containerProp());
        assertEquals("variant_a", foo.someContainerType());
        assertEquals("bar", ((VariantA)foo).variantAProp());
    }

    @Test
    public void testDeserialization() {
        JsonProvider provider = JsonProvider.provider();
        JsonParser parser = provider.createParser(new StringReader(json));

        SomeContainer c = SomeContainer.DESERIALIZER.deserialize(parser, new JsonbJsonpMapper());

        assertEquals("foo", foo.containerProp());
        assertEquals("variant_a", foo.someContainerType());
        assertEquals("bar", ((VariantA)foo).variantAProp());
    }

    @Test
    public void testSerialization() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonProvider provider = JsonProvider.provider();
        JsonGenerator generator = provider.createGenerator(baos);
        foo.serialize(generator, new JsonbJsonpMapper());

        generator.close();

        assertEquals(json, baos.toString());

    }

    @Test
    public void testDuplicateVariantDeserialization() {
        String json = "{\"container_prop\":\"foo\",\"variant_a\":{\"variant_a_prop\":\"bar\"}, \"variant_b" +
            "\":{\"variant_b_prop\":\"baz\"}, }";

        JsonProvider provider = JsonProvider.provider();
        JsonParser parser = provider.createParser(new StringReader(json));

        JsonParsingException e = assertThrows(JsonParsingException.class, () -> {
            SomeContainer c = SomeContainer.DESERIALIZER.deserialize(parser, new JsonbJsonpMapper());
        });

        assertTrue(e.getMessage().startsWith("Only one variant can be specified"));
    }

    @Test
    public void testMissingVariantDeserialization() {
        String json = "{\"container_prop\":\"foo\"}";

        JsonProvider provider = JsonProvider.provider();
        JsonParser parser = provider.createParser(new StringReader(json));

        JsonParsingException e = assertThrows(JsonParsingException.class, () -> {
            SomeContainer c = SomeContainer.DESERIALIZER.deserialize(parser, new JsonbJsonpMapper());
        });

        assertEquals("No variant found", e.getMessage());
    }

}
