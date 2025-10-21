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

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.util.TokenBuffer;

import java.io.StringWriter;
import java.lang.reflect.Type;

class Jackson3JsonBuffer implements JsonBuffer, JsonData {
    private final TokenBuffer buffer;
    private final Jackson3JsonpMapper mapper;

    Jackson3JsonBuffer(TokenBuffer buffer, Jackson3JsonpMapper mapper) {
        this.buffer = buffer;
        this.mapper = mapper;
    }

    @Override
    public JsonParser asParser() {
        return new Jackson3JsonpParser(buffer.asParser(), mapper);
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
        if (generator instanceof Jackson3JsonpGenerator) {
            Jackson3JsonpGenerator jkGenerator = (Jackson3JsonpGenerator) generator;
            try {
                buffer.serialize(jkGenerator.jacksonGenerator());
            } catch (JacksonException e) {
                throw Jackson3Utils.convertException(e);
            }
        } else {
            try (JsonParser parser = asParser()) {
                JsonpUtils.copy(parser, generator);
            }
        }
    }

    /**
     * Renders this buffer as a JSON string for debugger and logging convenience.
     */
    @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        try (Jackson3JsonpGenerator generator =
                 new Jackson3JsonpGenerator(mapper.objectMapper().createGenerator(writer))) {
            serialize(generator, mapper);
            generator.close();
            return writer.toString();
        }
    }
}
