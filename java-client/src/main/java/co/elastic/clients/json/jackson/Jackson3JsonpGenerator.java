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
import co.elastic.clients.json.JsonData;
import jakarta.json.JsonNumber;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerationException;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import tools.jackson.core.TokenStreamContext;
import tools.jackson.databind.util.TokenBuffer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * A JSONP generator implementation on top of Jackson.
 */
public class Jackson3JsonpGenerator implements JsonGenerator {

    private tools.jackson.core.JsonGenerator generator;

    public Jackson3JsonpGenerator(tools.jackson.core.JsonGenerator generator) {
        this.generator = generator;
    }

    public static class Buffering extends Jackson3JsonpGenerator implements BufferingJsonGenerator {

        private final Jackson3JsonpMapper mapper;

        public Buffering(Jackson3JsonpMapper mapper) {
            super(TokenBuffer.forGeneration());
            this.mapper = mapper;
        }

        @Override
        public JsonData getJsonData() {
            this.close();
            return new Jackson3JsonBuffer((TokenBuffer) jacksonGenerator(), mapper);
        }

        @Override
        public JsonParser getParser() {
            this.close();
            TokenBuffer tokenBuffer = (TokenBuffer) jacksonGenerator();
            return new Jackson3JsonpParser(tokenBuffer.asParser(), mapper);
        }

        @Override
        public void copyValue(JsonParser parser) {
            if (!(parser instanceof Jackson3JsonpGenerator)) {
                throw new IllegalArgumentException("Can only be used with a JacksonJsonpGenerator");
            }

            tools.jackson.core.JsonParser jkParser = ((Jackson3JsonpParser) parser).jacksonParser();
            jacksonGenerator().copyCurrentStructure(jkParser);
        }
    }

    /**
     * Returns the underlying Jackson generator.
     */
    public tools.jackson.core.JsonGenerator jacksonGenerator() {
        return generator;
    }

    @Override
    public JsonGenerator writeStartObject() {
        generator.writeStartObject();
        return this;
    }

    @Override
    public JsonGenerator writeStartObject(String name) {
        generator.writeName(name);
        generator.writeStartObject();
        return this;
    }

    @Override
    public JsonGenerator writeStartArray() {
        generator.writeStartArray();
        return this;
    }

    @Override
    public JsonGenerator writeStartArray(String name) {
        generator.writeName(name);
        generator.writeStartArray();
        return this;
    }

    @Override
    public JsonGenerator writeKey(String name) {
        generator.writeName(name);
        return this;
    }

    @Override
    public JsonGenerator write(String name, JsonValue value) {
        generator.writeName(name);
        writeValue(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, String value) {
        generator.writeName(name);
        generator.writeString(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, BigInteger value) {
        generator.writeName(name);
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, BigDecimal value) {
        generator.writeName(name);
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, int value) {
        generator.writeName(name);
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, long value) {
        generator.writeName(name);
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, double value) {
        generator.writeName(name);
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(String name, boolean value) {
        generator.writeName(name);
        generator.writeBoolean(value);

        return this;
    }

    @Override
    public JsonGenerator writeNull(String name) {
        generator.writeName(name);
        generator.writeNull();
        return this;
    }

    @Override
    public JsonGenerator writeEnd() {
        TokenStreamContext ctx = generator.streamWriteContext();
        if (ctx.inObject()) {
            generator.writeEndObject();
        } else if (ctx.inArray()) {
            generator.writeEndArray();
        } else {
            throw new JsonGenerationException("Unexpected context: '" + ctx.typeDesc() + "'");
        }
        return this;
    }

    @Override
    public JsonGenerator write(JsonValue value) {
        writeValue(value);
        return this;
    }

    @Override
    public JsonGenerator write(String value) {
        generator.writeString(value);
        return this;
    }

    @Override
    public JsonGenerator write(BigDecimal value) {
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(BigInteger value) {
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(int value) {
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(long value) {
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(double value) {
        generator.writeNumber(value);
        return this;
    }

    @Override
    public JsonGenerator write(boolean value) {
        generator.writeBoolean(value);
        return this;
    }

    @Override
    public JsonGenerator writeNull() {
        generator.writeNull();
        return this;
    }

    @Override
    public void close() {
        generator.close();
    }

    @Override
    public void flush() {
        generator.flush();
    }

    private void writeValue(JsonValue value) {
        switch (value.getValueType()) {
            case OBJECT:
                generator.writeStartObject();
                for (Map.Entry<String, JsonValue> entry : value.asJsonObject().entrySet()) {
                    generator.writeName(entry.getKey());
                    writeValue(entry.getValue());
                }
                generator.writeEndObject();
                break;

            case ARRAY:
                generator.writeStartArray();
                for (JsonValue item : value.asJsonArray()) {
                    writeValue(item);
                }
                generator.writeEndArray();
                break;

            case STRING:
                generator.writeString(((JsonString) value).getString());
                break;

            case FALSE:
                generator.writeBoolean(false);
                break;

            case TRUE:
                generator.writeBoolean(true);
                break;

            case NULL:
                generator.writeNull();
                break;

            case NUMBER:
                JsonNumber n = (JsonNumber) value;
                if (n.isIntegral()) {
                    generator.writeNumber(n.longValue());
                } else {
                    generator.writeNumber(n.doubleValue());
                }
                break;
        }
    }
}
