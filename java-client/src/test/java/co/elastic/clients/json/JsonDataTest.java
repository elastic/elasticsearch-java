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

import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonDataTest extends ModelTestCase {

//    public JsonDataTest() {
//        super(JsonImpl.Jackson);
//    }

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
        if (jsonImpl == JsonImpl.Simple) {
            return; // Doesn't support user-defined object mapping
        }

        String json = "{\"children\":[{\"doubleValue\":3.2,\"intValue\":2}],\"doubleValue\":2.1,\"intValue\":1," +
            "\"stringValue\":\"foo\"}";

        JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));

        JsonData data = JsonData.from(parser, mapper);
        checkClass(data);
        assertEquals("foo", data.toJson().asJsonObject().getString("stringValue"));

        JsonpMapperTest.SomeClass to = data.to(JsonpMapperTest.SomeClass.class);
        assertEquals("foo", to.getStringValue());
    }

    @Test
    public void testSerializeObject() {
        if (jsonImpl == JsonImpl.Simple) {
            return; // Doesn't support user-defined object mapping
        }

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
    public void testSerializeValueOrBuffer() {
        String json = "{\"children\":[{\"doubleValue\":3.2,\"intValue\":2}],\"doubleValue\":2.1,\"intValue\":1," +
            "\"stringValue\":\"foo\"}";

        JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));

        JsonData data = JsonData.from(parser, mapper);
        checkClass(data);

        assertEquals(json, toJson(data, mapper));
    }

    @Test
    public void testConvert() {

        JsonData json = JsonData.of("foo");

        final JsonValue value = json.toJson(mapper);

        assertEquals(JsonValue.ValueType.STRING, value.getValueType());
        assertEquals("foo", ((JsonString)value).getString());
    }

    @Test
    public void testFieldValues() {
        // Specific test for https://github.com/elastic/elasticsearch-java/issues/548 which led to buffered JsonData

        String json = "{\"_index\":\"idx\",\"_id\":\"doc_id\",\"fields\":{\"bar\":\"Bar value\",\"foo\":1}}";

        Hit<Void> hit = fromJson(json, Hit.createHitDeserializer(JsonpDeserializer.voidDeserializer()));

        assertEquals(1, hit.fields().get("foo").to(Integer.class));
        assertEquals("Bar value", hit.fields().get("bar").to(String.class));

        checkClass(hit.fields().get("foo"));
        checkClass(hit.fields().get("bar"));

        assertEquals(json, toJson(hit));
    }

    private void checkClass(JsonData data) {
        String name = data.getClass().getName();
        switch (jsonImpl) {
            case Jackson:
                assertEquals(name, "co.elastic.clients.json.jackson.JacksonJsonBuffer");
                break;

            case Jsonb:
            case Simple:
                assertEquals(name, "co.elastic.clients.json.JsonDataImpl");
        }
    }
}
