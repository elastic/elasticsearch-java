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

import co.elastic.clients.json.BufferingJsonGenerator;
import co.elastic.clients.json.BufferingJsonpMapper;
import co.elastic.clients.json.DelegatingJsonGenerator;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpDeserializerBase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperBase;
import co.elastic.clients.json.JsonpSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;

import java.lang.reflect.Type;
import java.util.EnumSet;

public class Jackson3JsonpMapper extends JsonpMapperBase implements BufferingJsonpMapper {

    private final Jackson3JsonProvider provider;
    private final JsonMapper objectMapper;

    private Jackson3JsonpMapper(JsonMapper objectMapper, Jackson3JsonProvider provider) {
        // No need to configure here, as this constructor is only called with the objectMapper
        // of an existing JacksonJsonpMapper, and has therefore alredy been configured.
        this.objectMapper = objectMapper;
        this.provider = provider;
    }

    public Jackson3JsonpMapper(JsonMapper objectMapper) {
        this.objectMapper = configure(objectMapper);
        // Order is important as JacksonJsonProvider(this) will get ObjectMapper
        this.provider = new Jackson3JsonProvider(this);
    }

    public Jackson3JsonpMapper() {

        this(JsonMapper.builder()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .changeDefaultPropertyInclusion(p -> p
                .withValueInclusion(JsonInclude.Include.NON_NULL))
            .build()
        );
    }

    private static JsonMapper configure(JsonMapper builder) {
        // Accept single objects as collections. This is useful in the context of Elasticsearch since
        // Lucene has no concept of multivalued field and fields with a single value will be returned
        // as a single object even if other instances of the same field have multiple values.
        return builder.rebuild()
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)
            .build();
    }

    @Override
    public <T> JsonpMapper withAttribute(String name, T value) {
        return new Jackson3JsonpMapper(this.objectMapper, this.provider).addAttribute(name, value);
    }

    /**
     * Returns the underlying Jackson mapper.
     */
    public JsonMapper objectMapper() {
        return this.objectMapper;
    }

    @Override
    public JsonProvider jsonProvider() {
        return provider;
    }

    @Override
    protected <T> JsonpDeserializer<T> getDefaultDeserializer(Type type) {
        return new JacksonValueParser<>(type);
    }

    @Override
    public <T> void serialize(T value, JsonGenerator generator) {

        JsonpSerializer<T> serializer = findSerializer(value);
        if (serializer != null) {
            serializer.serialize(value, generator, this);
            return;
        }

        // Delegating generators are used in higher levels of serialization (e.g. filter empty top-level
        // objects).
        // At this point the object is not a JsonpSerializable and we can assume we're in a nested property
        // holding
        // a user-provided type and can unwrap to find the underlying non-delegating generator.
        while (generator instanceof DelegatingJsonGenerator) {
            generator = ((DelegatingJsonGenerator) generator).unwrap();
        }

        if (!(generator instanceof Jackson3JsonpGenerator)) {
            throw new IllegalArgumentException("Jackson's ObjectMapper can only be used with the " +
                                               "JacksonJsonpProvider");
        }

        tools.jackson.core.JsonGenerator jkGenerator = ((Jackson3JsonpGenerator) generator).jacksonGenerator();
        objectMapper.writeValue(jkGenerator, value);
    }

    @Override
    public BufferingJsonGenerator createBufferingGenerator() {
        return new Jackson3JsonpGenerator.Buffering(this);
    }

    private class JacksonValueParser<T> extends JsonpDeserializerBase<T> {

        private final Type type;

        protected JacksonValueParser(Type type) {
            super(EnumSet.allOf(JsonParser.Event.class));
            this.type = type;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

            if (!(parser instanceof Jackson3JsonpParser)) {
                throw new IllegalArgumentException("Jackson's ObjectMapper can only be used with the " +
                                                   "JacksonJsonpProvider");
            }

            tools.jackson.core.JsonParser jkParser = ((Jackson3JsonpParser) parser).jacksonParser();

            return objectMapper.readValue(jkParser, objectMapper().constructType(type));
        }
    }
}
