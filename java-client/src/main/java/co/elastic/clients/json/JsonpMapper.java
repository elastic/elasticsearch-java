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

/**
 * A {@code JsonpMapper} combines a jsonp provider and object serialization/deserialization based on jsonp events.
 */

// Note: we could have used jsonb for object mapping, but this API lacks an important feature: it only works with
// bytes and character streams, and not jsonp events. Since we process request and response as jsonb streams, using
// jsonb would require to serialize the incoming json events and pass them to jsonb that would parse them again.
// Since this is very inefficient, this API allows for faster implementations that bypass this serialization/reparsing
// phase (e.g. JacksonJsonpMapper)

public interface JsonpMapper {
    /**
     * Return the jsonp provider, to create JSON parsers and generators.
     */
    JsonProvider jsonpProvider();

    /**
     * Get the deserializer for a class.
     */
    <T> JsonpDeserializer<T> getDeserializer(Class<T> clazz);

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
}
