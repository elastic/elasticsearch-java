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

import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;

import javax.annotation.Nullable;
import java.io.StringReader;
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static String expectKeyName(JsonParser parser, JsonParser.Event event) {
        JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
        return parser.getString();
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

    /**
     * Throws a {@link JsonParsingException} because some unknown property name was encountered
     */
    public static void unknownKey(JsonParser parser, String keyName) {
        throw new JsonParsingException("Unknown property " + keyName , parser.getLocation());
    }

    public static String ensureSingleVariant(JsonParser parser, String variant1, String variant2) {
        if (variant1 != null && variant2 != null) {
            throw new JsonParsingException(
                "Only one variant can be specified, found '" + variant1 + "' and '" + variant2 + "'",
                parser.getLocation()
            );
        }
        return variant2;
    }

    public static <T> T buildVariant(JsonParser parser, ObjectBuilder<T> builder) {
        if (builder == null) {
            throw new JsonParsingException("No variant found" , parser.getLocation());
        }
        return builder.build();
    }

    public static <T> void serialize(T value, JsonGenerator generator, @Nullable JsonpSerializer<T> serializer, JsonpMapper mapper) {
        if (serializer != null) {
            serializer.serialize(value, generator, mapper);
        } else if (value instanceof JsonpSerializable) {
            ((JsonpSerializable) value).serialize(generator, mapper);
        } else {
            mapper.serialize(value, generator);
        }
    }

    /**
     * Looks ahead a field value in the Json object from the upcoming object in a parser, which should be on the
     * START_OBJECT event.
     *
     * Returns a pair containing that value and a parser that should be used to actually parse the object
     * (the object has been consumed from the original one).
     */
    public static Map.Entry<String, JsonParser> lookAheadFieldValue(String name, JsonParser parser, JsonpMapper mapper) {
        // FIXME: need a buffering parser wrapper so that we don't roundtrip through a JsonObject and a String
        // FIXME: resulting parser should return locations that are offset with the original parser's location
        JsonObject object = parser.getObject();
        String result = object.getString(name, null);
        if (result == null) {
            throw new JsonParsingException("Property '" + name + "' not found", parser.getLocation());
        }
        String strObject = object.toString();
        JsonParser newParser = mapper.jsonProvider().createParser(new StringReader(strObject));
        return new AbstractMap.SimpleImmutableEntry<>(result, newParser);
    }

    public static String toString(JsonValue value) {
        switch(value.getValueType()) {
            case OBJECT:
                throw new IllegalArgumentException("Json objects cannot be used as string");

            case ARRAY:
                return value.asJsonArray().stream()
                    .map(JsonpUtils::toString)
                    .collect(Collectors.joining(","));

            case STRING:
                return ((JsonString)value).getString();

            case TRUE:
                return "true";

            case FALSE:
                return "false";

            case NULL:
                return "null";

            case NUMBER:
                return value.toString();

            default:
                throw new IllegalArgumentException("Unknown json value type: " + value);
        }
    }
}
