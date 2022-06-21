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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperBase;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonDataTest extends Assertions {


    public static <T, B extends ObjectBuilder<T>> B withJson(B builder, Reader json, ElasticsearchClient client) {
        return withJson(builder, json, client._transport().jsonpMapper());
    }

    public static <T, B extends ObjectBuilder<T>> B withJson(B builder, Reader json, JsonpMapper mapper) {
        JsonpDeserializer<?> classDeser = JsonpMapperBase.findDeserializer(builder.getClass().getEnclosingClass());

        @SuppressWarnings("unchecked")
        ObjectDeserializer<B> builderDeser = (ObjectDeserializer<B>)DelegatingDeserializer.unwrap(classDeser);

        JsonParser parser = mapper.jsonProvider().createParser(json);
        builderDeser.deserialize(builder, parser, mapper, parser.next());
        return builder;
    }

    @Test
    public void testBuilderDeserializerHack() {

        CreateIndexRequest.Builder b = new CreateIndexRequest.Builder();

        // Required request parameter
        b.index("foo");

        // Read body from JSON
        withJson(b, new StringReader("{\"aliases\": {\"foo\": {\"is_hidden\": true}}}"), new JacksonJsonpMapper());

        CreateIndexRequest createIndexRequest = b.build();
    }

    @Test
    public void testParsing() {
        JsonpMapper mapper = new JsonbJsonpMapper();
        String json = "{\"children\":[{\"doubleValue\":3.2,\"intValue\":2}],\"doubleValue\":2.1,\"intValue\":1," +
            "\"stringValue\":\"foo\"}";

        JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));

        JsonData data = JsonData.from(parser, mapper);
        assertEquals("foo", data.toJson().asJsonObject().getString("stringValue"));

        JsonpMapperTest.SomeClass to = data.to(JsonpMapperTest.SomeClass.class);
        assertEquals("foo", to.getStringValue());
    }

    @Test
    public void testSerialize() {

        JsonpMapper mapper = new JsonbJsonpMapper();
        String json = "{\"children\":[{\"doubleValue\":3.2,\"intValue\":2}],\"doubleValue\":2.1,\"intValue\":1," +
            "\"stringValue\":\"foo\"}";

        JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));
        JsonpMapperTest.SomeClass sc =
            mapper.deserialize(parser, JsonpMapperTest.SomeClass.class);

        assertEquals("foo", sc.getStringValue());
        assertEquals(1, sc.getChildren().size());
        assertEquals(2, sc.getChildren().get(0).getIntValue());
        // All good

        JsonData data = JsonData.of(sc);

        StringWriter sw = new StringWriter();
        JsonGenerator generator = mapper.jsonProvider().createGenerator(sw);

        data.serialize(generator, mapper);
        generator.close();

        assertEquals(json, sw.toString());
    }

    @Test
    public void testConvert() {

        JsonData json = JsonData.of("foo");

        final JsonValue value = json.toJson(new JsonbJsonpMapper());

        assertEquals(JsonValue.ValueType.STRING, value.getValueType());
        assertEquals("foo", ((JsonString)value).getString());
    }
}
