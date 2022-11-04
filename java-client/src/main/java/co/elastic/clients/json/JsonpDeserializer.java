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

import co.elastic.clients.util.TriFunction;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public interface JsonpDeserializer<V> {

    /**
     * The native JSON events this deserializer accepts as a starting point. For example, native events for
     * a boolean are {@link Event#VALUE_TRUE} and {@link Event#VALUE_FALSE}.
     */
    EnumSet<Event> nativeEvents();

    /**
     * The JSON events this deserializer accepts as a starting point. For example, events for a boolean are
     * {@link Event#VALUE_TRUE}, {@link Event#VALUE_FALSE} and {@link Event#VALUE_STRING}, the latter being
     * converted to a boolean using {@link Boolean#parseBoolean(String)}.
     */
    EnumSet<Event> acceptedEvents();

    /**
     * Convenience method for {@code acceptedEvents().contains(event)}
     */
    default boolean accepts(Event event) {
        return acceptedEvents().contains(event);
    }

    /**
     * Deserialize a value. The value starts at the next state in the JSON stream.
     * <p>
     * Default implementation delegates to {@link #deserialize(JsonParser, JsonpMapper, Event)}
     * after having checked that the next event is part of the accepted events.
     * <p>
     * If the next event is {@link Event#VALUE_NULL}, {@code null} is returned unless {@link Event#VALUE_NULL}
     * is part of the deserializer's accepted events.
     *
     * @param parser the JSON parser
     * @param mapper the JSON-P mapper
     * @return the parsed value or null
     */
    default V deserialize(JsonParser parser, JsonpMapper mapper) {
        JsonParser.Event event = parser.next();
        // JSON null: return null unless the deserializer can handle it
        if (event == JsonParser.Event.VALUE_NULL && !accepts(Event.VALUE_NULL)) {
            return null;
        }
        JsonpUtils.ensureAccepts(this, parser, event);
        return deserialize(parser, mapper, event);
    }

    /**
     * Deserialize a value. The value starts at the current state in the JSON stream.
     *
     * @param parser the JSON parser
     * @param mapper the JSON-P mapper
     * @param event the current state of {@code parser}, which must be part of {@link #acceptedEvents}
     * @return the parsed value
     */
    V deserialize(JsonParser parser, JsonpMapper mapper, Event event);

    //---------------------------------------------------------------------------------------------

//    /**
//     * Creates a deserializer for a class that delegates to the mapper provided to
//     * {@link #deserialize(JsonParser, JsonpMapper)}.
//     */
//    static <T>JsonpDeserializer<T> of(Class<T> clazz) {
//        return of((Type)clazz);
//    }

    /**
     * Creates a deserializer for a type that delegates to the mapper provided to
     * {@link #deserialize(JsonParser, JsonpMapper)}.
     */
    static <T>JsonpDeserializer<T> of(Type type) {
        return new JsonpDeserializerBase<T>(EnumSet.allOf(JsonParser.Event.class)) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper) {
                return mapper.deserialize(parser, type);
            }

            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                throw new UnsupportedOperationException();
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
                throw new UnsupportedOperationException();
            }
        };
    }

    static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, TriFunction<JsonParser, JsonpMapper, JsonParser.Event, T> fn) {
        return new JsonpDeserializerBase<T>(acceptedEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return fn.apply(parser, mapper, event);
            }
        };
    }

    static <T> JsonpDeserializer<T> lazy(Supplier<JsonpDeserializer<T>> ctor) {
        return new LazyDeserializer<>(ctor);
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

    /** A {@code double} deserializer that will return a default value when the JSON value is {@code null} */
    static JsonpDeserializer<Double> doubleOrNullDeserializer(double defaultValue) {
        return new JsonpDeserializerBase.DoubleOrNullDeserializer(defaultValue);
    }

    /** An {@code integer} deserializer that will return a default value when the JSON value is {@code null} */
    static JsonpDeserializer<Integer> intOrNullDeserializer(int defaultValue) {
        return new JsonpDeserializerBase.IntOrNullDeserializer(defaultValue);
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

    static <K extends JsonEnum, V> JsonpDeserializer<Map<K, V>> enumMapDeserializer(
        JsonpDeserializer<K> keyDeserializer, JsonpDeserializer<V> valueDeserializer
    ) {
        return new JsonpDeserializerBase.EnumMapDeserializer<>(keyDeserializer, valueDeserializer);
    }

    /**
     * Creates a deserializer that will accept a value both as regular JSON and as JSON-in-a-string.
     */
    static <T> JsonpDeserializer<T> jsonString(JsonpDeserializer<T> valueDeserializer) {
        EnumSet<Event> acceptedEvents = EnumSet.copyOf(valueDeserializer.acceptedEvents());
        acceptedEvents.add(Event.VALUE_STRING);

        EnumSet<Event> nativeEvents = EnumSet.copyOf(valueDeserializer.nativeEvents());
        nativeEvents.add(Event.VALUE_STRING);

        return new JsonpDeserializerBase<T>(acceptedEvents, nativeEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    JsonParser stringParser = mapper.jsonProvider().createParser(new StringReader(parser.getString()));
                    return valueDeserializer.deserialize(stringParser, mapper);
                } else {
                    return valueDeserializer.deserialize(parser, mapper, event);
                }
            }
        };
    }
}
