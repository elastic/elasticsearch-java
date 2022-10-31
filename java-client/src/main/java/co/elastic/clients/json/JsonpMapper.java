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

import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.lang.reflect.Type;

/**
 * A {@code JsonpMapper} combines a JSON-P provider and object serialization/deserialization based on JSON-P events.
 */

// Note: we could have used JSON-B for object mapping, but this API lacks an important feature: it only works with
// bytes and character streams, and not JSON-P events. Since we process request and response as JSON-P streams, using
// JSON-B would require to serialize the incoming JSON events and pass them to JSON-B that would parse them again.
// Since this is very inefficient, this API allows for faster implementations that bypass this serialization/reparsing
// phase (e.g. JacksonJsonpMapper)

public interface JsonpMapper {
    /**
     * Return the JSON-P provider, to create JSON parsers and generators.
     */
    JsonProvider jsonProvider();

    /**
     * Deserialize an object, given its class.
     */
    default <T> T deserialize(JsonParser parser, Class<T> clazz) {
        return deserialize(parser, (Type)clazz);
    }

    /**
     * Deserialize an object, given its type.
     */
    <T> T deserialize(JsonParser parser, Type type);

    /**
     * Serialize an object.
     */
    <T> void serialize(T value, JsonGenerator generator);

    /**
     * Should object parsers in the API client be lenient and silently ignore unknown fields?
     *
     * @return {@code true} by default.
     */
    default boolean ignoreUnknownFields() {
        return true;
    }

    /**
     * Get a named attribute associated to this mapper.
     */
    @Nullable
    default <T> T attribute(String name) {
        return null;
    }

    /**
     * Get a named attribute associated to this mapper, with a default value.
     */
    default <T> T attribute(String name, T defaultValue) {
        T v = attribute(name);
        return v != null ? v : defaultValue;
    }

    /**
     * Create a new mapper with an additional attribute.
     * <p>
     * The {@link JsonpMapperFeatures} class contains the names of attributes that all implementations of
     * <code>JsonpMapper</code> must implement.
     *
     * @see JsonpMapperFeatures
     */
    <T> JsonpMapper withAttribute(String name, T value);
}
