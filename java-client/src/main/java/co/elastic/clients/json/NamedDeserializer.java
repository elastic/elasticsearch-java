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

import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import java.util.EnumSet;

/**
 * A deserializer that delegates to another deserializer provided as a JSON mapper attribute.
 */
public class NamedDeserializer<T> implements JsonpDeserializer<T> {

    private static final EnumSet<JsonParser.Event> events = EnumSet.of(
        Event.START_OBJECT,
        Event.START_ARRAY,
        Event.VALUE_FALSE,
        Event.VALUE_TRUE,
        Event.VALUE_NUMBER,
        Event.VALUE_STRING,
        Event.VALUE_NULL
    );

    private final String name;

    public NamedDeserializer(String name) {
        this.name = name;
    }

    @Override
    public EnumSet<JsonParser.Event> nativeEvents() {
        return events;
    }

    @Override
    public EnumSet<JsonParser.Event> acceptedEvents() {
        return events;
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper) {
        if (mapper.<JsonpDeserializer<T>>attribute(name) == null) {
            throw new JsonParsingException("Missing deserializer", parser.getLocation());
        }
        return mapper.<JsonpDeserializer<T>>attribute(name).deserialize(parser, mapper);
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
        if (mapper.<JsonpDeserializer<T>>attribute(name) == null) {
            throw new JsonParsingException("Missing deserializer", parser.getLocation());
        }
        return mapper.<JsonpDeserializer<T>>attribute(name).deserialize(parser, mapper, event);
    }
}
