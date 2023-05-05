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

import co.elastic.clients.json.JsonBuffer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.io.IOException;
import java.lang.reflect.Type;

class JacksonJsonBuffer implements JsonBuffer, JsonData {
    private final TokenBuffer buffer;
    private final JacksonJsonpMapper mapper;

    JacksonJsonBuffer(TokenBuffer buffer, JacksonJsonpMapper mapper) {
        this.buffer = buffer;
        this.mapper = mapper;
    }

    @Override
    public JsonParser asParser() {
        return new JacksonJsonpParser(buffer.asParser(), mapper);
    }

    @Override
    public JsonValue toJson() {
        try (JsonParser parser = asParser()) {
            parser.next(); // move to first event
            return parser.getValue();
        }
    }

    @Override
    public JsonValue toJson(JsonpMapper mapper) {
        // We don't need the mapper
        return toJson();
    }

    @Override
    public <T> T to(Type type) {
        return to(type, this.mapper);
    }

    @Override
    public <T> T to(Type type, JsonpMapper mapper) {
        try (JsonParser parser = asParser()) {
            return mapper.deserialize(parser, type);
        }
    }

    @Override
    public <T> T deserialize(JsonpDeserializer<T> deserializer) {
        return deserialize(deserializer, this.mapper);
    }

    @Override
    public <T> T deserialize(JsonpDeserializer<T> deserializer, JsonpMapper mapper) {
        try (JsonParser parser = asParser()) {
            return deserializer.deserialize(parser, mapper);
        }
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        if (generator instanceof JacksonJsonpGenerator) {
            JacksonJsonpGenerator jkGenerator = (JacksonJsonpGenerator) generator;
            try {
                buffer.serialize(jkGenerator.jacksonGenerator());
            } catch (IOException e) {
                throw JacksonUtils.convertException(e);
            }
        } else {
            try (JsonParser parser = asParser()) {
                JsonpUtils.copy(parser, generator);
            }
        }
    }
}
