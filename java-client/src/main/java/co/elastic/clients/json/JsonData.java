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

import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParser;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.EnumSet;

/**
 * A raw JSON value. It can be converted to a JSON node tree or to an arbitrary object using a {@link JsonpMapper}.
 * <p>
 * This type is used in API types for values that don't have a statically-defined type or that cannot be represented
 * as a generic parameter of the enclosing data structure.
 * <p>
 * Instances of this class returned by API clients keep a reference to the client's {@link JsonpMapper} and can be
 * converted to arbitrary types using {@link #to(Class)} without requiring an explicit mapper.
 */
@JsonpDeserializable
public interface JsonData extends JsonpSerializable {

    /**
     * Converts this object to a JSON node tree. A mapper must have been provided at creation time.
     *
     * @throws IllegalStateException if no mapper was provided at creation time.
     */
    JsonValue toJson();

    /**
     * Converts this object to a JSON node tree.
     */
    JsonValue toJson(JsonpMapper mapper);

    /**
     * Converts this object to a target class. A mapper must have been provided at creation time.
     *
     * @throws IllegalStateException if no mapper was provided at creation time.
     */
    default <T> T to(Class<T> clazz) {
        return to((Type)clazz);
    }

    /**
     * Converts this object to a target type. A mapper must have been provided at creation time.
     *
     * @throws IllegalStateException if no mapper was provided at creation time.
     */
    <T> T to(Type type);

    /**
     * Converts this object to a target class.
     */
     default <T> T to(Class<T> clazz, JsonpMapper mapper) {
         return to((Type)clazz, mapper);
     }

    /**
     * Converts this object to a target type.
     */
    <T> T to(Type type, JsonpMapper mapper);

    /**
     * Converts this object using a deserializer. A mapper must have been provided at creation time.
     *
     * @throws IllegalStateException if no mapper was provided at creation time.
     */
     <T> T deserialize(JsonpDeserializer<T> deserializer);

    /**
     * Converts this object using a deserializer.
     */
     <T> T deserialize(JsonpDeserializer<T> deserializer, JsonpMapper mapper);

    /**
     * Creates a raw JSON value from an existing object. A mapper will be needed to convert the result.
     */
    static <T> JsonData of(T value) {
        if (value instanceof JsonData) {
            return (JsonData) value;
        } else {
            return new JsonDataImpl(value, null);
        }
    }

    /**
     * Creates a raw JSON value from an existing object, along with the mapper to use for further conversions.
     */
    static <T> JsonData of(T value, JsonpMapper mapper) {
        return new JsonDataImpl(value, mapper);
    }

    /**
     * Creates a raw JSON value from a reader.
     * <p>
     * <b>Note:</b> this method is not called {@code from} like {@link #from(Reader)} or {@link #from(InputStream)} to avoid
     * ambiguities with {@link #of(Object)} that will create a JSON string value instead of parsing the JSON text.
     */
    static JsonData fromJson(String json) {
        return from(new StringReader(json));
    }

    /**
     * Creates a raw JSON value from a reader.
     */
    static JsonData from(Reader json) {
        JsonProvider provider = JsonpUtils.provider();
        try(JsonParser parser = provider.createParser(json)) {
            parser.next();
            return new JsonDataImpl(parser.getValue(), null);
        }
    }

    /**
     * Creates a raw JSON value from an input stream.
     */
    static JsonData from(InputStream json) {
        JsonProvider provider = JsonpUtils.provider();
        try(JsonParser parser = provider.createParser(json)) {
            parser.next();
            return new JsonDataImpl(parser.getValue(), null);
        }
    }

    /**
     * Creates a raw JSON value from a parser. The provider mapper will be used for conversions unless one is
     * explicitly provided using {@link #to(Class, JsonpMapper)}, {@link #toJson(JsonpMapper)} or
     * {@link #deserialize(JsonpDeserializer)}.
     */
    static JsonData from(JsonParser parser, JsonpMapper mapper) {
        return from(parser, mapper, parser.next());
    }

    /**
     * Creates a raw JSON value from a parser. The provider mapper will be used for conversions unless one is
     * explicitly provided using {@link #to(Class, JsonpMapper)}, {@link #toJson(JsonpMapper)} or
     * {@link #deserialize(JsonpDeserializer)}.
     */
    static JsonData from(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
        if (parser instanceof BufferingJsonParser) {
            return ((BufferingJsonParser)parser).getJsonData();
        } else {
            return of(parser.getValue(), mapper);
        }
    }

    JsonpDeserializer<JsonData> _DESERIALIZER = JsonpDeserializer.of(
        EnumSet.allOf(JsonParser.Event.class), ((parser, mapper, event) -> JsonData.from(parser, mapper, event))
    );
}
