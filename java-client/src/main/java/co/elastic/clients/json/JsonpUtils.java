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

import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import javax.annotation.Nullable;

public class JsonpUtils {

    /**
     * Advances the parser to the next event and checks that this even is the expected one.
     *
     * @return the expected event
     *
     * @throws jakarta.json.JsonException if an i/o error occurs (IOException would be cause of JsonException)
     * @throws JsonParsingException if the event is not the expected one, or if the parser encounters invalid
     *         JSON when advancing to next state.
     * @throws java.util.NoSuchElementException if there are no more parsing states.
     */
    public static JsonParser.Event expectNextEvent(JsonParser parser, JsonParser.Event expected) {
        JsonParser.Event event = parser.next();
        expectEvent(parser, expected, event);
        return event;
    }

    public static void expectEvent(JsonParser parser, JsonParser.Event expected, JsonParser.Event event) {
        if (event != expected) {
            throw new UnexpectedJsonEventException(parser, event, expected);
        }
    }

    /**
     * Skip the value at the next position of the parser.
     */
    public static void skipValue(JsonParser parser) {
        skipValue(parser, parser.next());
    }

    /**
     * Skip the value at the current position of the parser.
     */
    public static void skipValue(JsonParser parser, Event event) {
        switch(event) {
            case START_OBJECT:
                parser.skipObject();
                break;

            case START_ARRAY:
                parser.skipArray();
                break;

            default:
                // Not a structure, no additional skipping needed
                break;
        }
    }

    public static <T> void serialize(T value, JsonGenerator generator, @Nullable JsonpSerializer<T> serializer, JsonpMapper mapper) {
        if (serializer != null) {
            serializer.toJsonp(value, generator, mapper);
        } else if (value instanceof ToJsonp) {
            ((ToJsonp) value).toJsonp(generator, mapper);
        } else {
            mapper.serialize(value, generator);
        }
    }
}
