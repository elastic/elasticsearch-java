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

import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TriFunction;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public interface JsonpDeserializer<V> {

    /**
     * The json events this deserializer accepts as a starting point
     */
    EnumSet<Event> acceptedEvents();

    /**
     * Convenience method for {@code acceptedEvents().contains(event)}
     */
    default boolean accepts(Event event) {
        return acceptedEvents().contains(event);
    }

    /**
     * Deserialize a value. The value starts at the next state in the json stream.
     *
     * @param parser the json parser
     * @param mapper the jsonp mapper
     * @return the parsed value
     */
    V deserialize(JsonParser parser, JsonpMapper mapper);

    /**
     * Deserialize a value. The value starts at the current state in the json stream.
     *
     * @param parser the json parser
     * @param mapper the jsonp mapper
     * @param event the current state of {@code parser}, which must be part of {@link #acceptedEvents}
     * @return the parsed value
     */
    V deserialize(JsonParser parser, JsonpMapper mapper, Event event);

    //---------------------------------------------------------------------------------------------

    /**
     * Creates a deserializer for a class that delegates to the mapper provided to
     * {@link #deserialize(JsonParser, JsonpMapper)}.
     */
    static <T>JsonpDeserializer<T> of (Class<T> clazz) {
        return new JsonpDeserializerBase<T>(EnumSet.allOf(JsonParser.Event.class)) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper) {
                return mapper.deserialize(parser, clazz);
            }

            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                throw new UnsupportedOperationException();
            }
        };
    }

    static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, TriFunction<JsonParser, JsonpMapper, Event, T> fn) {
        return new JsonpDeserializerBase<T>(acceptedEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return fn.apply(parser, mapper, event);
            }
        };
    }

    static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, BiFunction<JsonParser, JsonpMapper, T> fn) {
        return new JsonpDeserializerBase<T>(acceptedEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper) {
                return fn.apply(parser, mapper);
            }

            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                throw new UnsupportedOperationException("Should not reach this point");
            }
        };
    }

    //----- Builtin types

    static <T> JsonpDeserializer<T> fixedValue(T value) {
        return new JsonpDeserializerBase<T>(EnumSet.noneOf(Event.class)) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return value;
            }
        };
    }

    static <T> JsonpDeserializer<T> emptyObject(T value) {
        return new JsonpDeserializerBase<T>(EnumSet.of(Event.START_OBJECT)) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_NULL) {
                    return null;
                }

                JsonpUtils.expectNextEvent(parser, Event.END_OBJECT);
                return value;
            }
        };
    }

    static JsonpDeserializer<String> stringDeserializer() {
        return JsonpDeserializerBase.STRING;
    }

    static JsonpDeserializer<Integer> integerDeserializer() {
        return JsonpDeserializerBase.INTEGER;
    }

    static JsonpDeserializer<Boolean> booleanDeserializer() {
        return JsonpDeserializerBase.BOOLEAN;
    }

    static JsonpDeserializer<Long> longDeserializer() {
        return JsonpDeserializerBase.LONG;
    }

    static JsonpDeserializer<Float> floatDeserializer() {
        return JsonpDeserializerBase.FLOAT;
    }

    static JsonpDeserializer<Double> doubleDeserializer() {
        return JsonpDeserializerBase.DOUBLE;
    }

    static JsonpDeserializer<Number> numberDeserializer() {
        return JsonpDeserializerBase.NUMBER;
    }

    static JsonpDeserializer<JsonValue> jsonValueDeserializer() {
        return JsonpDeserializerBase.JSON_VALUE;
    }

    static JsonpDeserializer<Void> voidDeserializer() {
        return JsonpDeserializerBase.VOID;
    }

    static <T> JsonpDeserializer<List<T>> arrayDeserializer(JsonpDeserializer<T> itemDeserializer) {
        return new JsonpDeserializerBase.ArrayDeserializer<>(itemDeserializer);
    }

    static <T> JsonpDeserializer<Map<String, T>> stringMapDeserializer(JsonpDeserializer<T> itemDeserializer) {
        return new JsonpDeserializerBase.StringMapDeserializer<T>(itemDeserializer);
    }

    static <K extends StringEnum, V> JsonpDeserializer<Map<K, V>> enumMapDeserializer(
        JsonpDeserializer<K> keyDeserializer, JsonpDeserializer<V> valueDeserializer
    ) {
        return new JsonpDeserializerBase.EnumMapDeserializer<K, V>(keyDeserializer, valueDeserializer);
    }
}
