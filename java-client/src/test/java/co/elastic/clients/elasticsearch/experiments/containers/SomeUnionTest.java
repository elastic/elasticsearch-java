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

import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

public class SomeUnionTest extends ModelTestCase {

    SomeUnion su = new SomeUnion.Builder()
        .variantA(a_ -> a_
            .name("a-name")
        ).build();

    String json = "{\"type\":\"variant_a\",\"name\":\"a-name\"}";

    @Test
    public void testContainerBuilder() {
        assertEquals("a-name", su.variantA().name());
    }

    @Test
    public void testDeserialization() {
        SomeUnion u = fromJson(json, SomeUnion.class);
        UVariantA uVariantA = u.variantA();
        assertEquals("a-name", uVariantA.name());
    }

    @Test
    public void testSerialization() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonProvider provider = JsonpUtils.provider();
        JsonGenerator generator = provider.createGenerator(baos);

        su.serialize(generator, new JsonbJsonpMapper());
        generator.close();

        System.out.println(baos.toString());

        assertEquals(json, baos.toString());

    }

    @Test
    public void testMissingVariantDeserialization() {
        String json = "{}";

        JsonProvider provider = JsonpUtils.provider();
        JsonParser parser = provider.createParser(new StringReader(json));

        JsonParsingException e = assertThrows(JsonParsingException.class, () -> {
            SomeUnion c = SomeUnion._DESERIALIZER.deserialize(parser, new JsonbJsonpMapper());
        });

        assertTrue(e.getMessage().contains("Property 'type' not found"));
    }
}
