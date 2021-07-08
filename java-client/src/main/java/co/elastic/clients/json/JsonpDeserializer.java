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

import jakarta.json.JsonNumber;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import jakarta.json.stream.JsonParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public abstract class JsonpDeserializer<V> {

    private final EnumSet<Event> acceptedEvents;

    protected JsonpDeserializer(EnumSet<Event> acceptedEvents) {
        this.acceptedEvents = acceptedEvents;
    }

    /** Combines accepted events from a number of deserializers */
    protected static EnumSet<JsonParser.Event> allAcceptedEvents(JsonpDeserializer<?>... deserializers) {
        EnumSet<JsonParser.Event> result = EnumSet.noneOf(JsonParser.Event.class);
        for (JsonpDeserializer<?> deserializer: deserializers) {

            EnumSet<Event> set = deserializer.acceptedEvents();
            if (!Collections.disjoint(result, set)) {
                throw new IllegalArgumentException("Deserializer accepted events are not disjoint");
            }

            result.addAll(set);
        }
        return result;
    }

    /**
     * The json events this deserializer accepts as a starting point
     */
    public final EnumSet<Event> acceptedEvents() {
        return acceptedEvents;
    }

    /**
     * Convenience method for {@code acceptedEvents.contains(event)}
     */
    public final boolean accepts(Event event) {
        return acceptedEvents.contains(event);
    }

    protected final void ensureAccepts(JsonParser parser, JsonParser.Event event) {
        if (!acceptedEvents.contains(event)) {
            throw new JsonParsingException(
                String.format("Unexpected JSON event '%s', expected %s", event, acceptedEvents.toString()),
                parser.getLocation()
            );
        }
    }

    /**
     * Parse a value. The value starts at the next state in the json stream.
     *
     * @param parser the json parser
     * @param mapper the jsonp mapper
     * @return the parsed value
     */
    public final V deserialize(JsonParser parser, JsonpMapper mapper) {
        return deserialize(parser, mapper, parser.next());
    }

    /**
     * Parse a value. The value starts at the current state in the json stream.
     *
     * This method will usually start with {@code ensureAccepts(parser, event)} to ensure correctness of the
     * starting state.
     *
     * @param parser the json parser
     * @param mapper the jsonp mapper
     * @param event the current state of {@code parser}, which must be part of {@link #acceptedEvents}
     * @return the parsed value
     */
    public abstract V deserialize(JsonParser parser, JsonpMapper mapper, Event event);

    //---------------------------------------------------------------------------------------------

    public static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, TriFunction<JsonParser, JsonpMapper, Event, T> fn) {
        return new JsonpDeserializer<T>(acceptedEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return fn.apply(parser, mapper, event);
            }
        };
    }

    //----- Lazily created parser

    public static <T> JsonpDeserializer<T> lazy(Supplier<JsonpDeserializer<T>> builder) {
        return new LazyDeserializer<>(builder, EnumSet.of(Event.START_OBJECT));
    }

    public static <T> JsonpDeserializer<T> lazy(Supplier<JsonpDeserializer<T>> builder, EnumSet<Event> acceptedEvents) {
        return new LazyDeserializer<>(builder, acceptedEvents);
    }

    private static class LazyDeserializer<T> extends JsonpDeserializer<T> {

        private final Supplier<JsonpDeserializer<T>> builder;
        private volatile JsonpDeserializer<T> deserializer = null;

        private LazyDeserializer(Supplier<JsonpDeserializer<T>> builder, EnumSet<Event> acceptedEvents) {
            super(acceptedEvents);
            this.builder = builder;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            // See SEI CERT LCK10-J https://wiki.sei.cmu.edu/confluence/x/6zdGBQ
            JsonpDeserializer<T> d = deserializer;
            if (d == null) {
                synchronized (this) {
                    if (deserializer == null) {
                        d = builder.get();
                        deserializer = d;
                    }
                }
            }
            return d.deserialize(parser, mapper, event);
        }
    }

    //----- Fixed value

    public static <T> JsonpDeserializer<T> fixedValue(T value) {
        return new JsonpDeserializer<T>(EnumSet.noneOf(Event.class)) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return value;
            }
        };
    }

    //----- String

    public static JsonpDeserializer<String> stringDeserializer() {
        return STRING;
    }

    private static final JsonpDeserializer<String> STRING =
        new JsonpDeserializer<String>(EnumSet.of(Event.VALUE_STRING)) {
            @Override
            public String deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return parser.getString();
            }
        };

    //----- Integer

    private static final JsonpDeserializer<Integer> INTEGER =
        new JsonpDeserializer<Integer>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Integer deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return parser.getInt();
            }
        };

    public static JsonpDeserializer<Integer> integerDeserializer() {
        return INTEGER;
    }

    //----- Boolean

    private static final JsonpDeserializer<Boolean> BOOLEAN =
        new JsonpDeserializer<Boolean>(EnumSet.of(Event.VALUE_FALSE, Event.VALUE_TRUE)) {
            @Override
            public Boolean deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return event == Event.VALUE_TRUE;
            }
        };

    public static JsonpDeserializer<Boolean> booleanDeserializer() {
        return BOOLEAN;
    }

    //----- Long

    private static final JsonpDeserializer<Long> LONG =
        new JsonpDeserializer<Long>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Long deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return parser.getLong();
            }
        };

    public static JsonpDeserializer<Long> longParser() {
        return LONG;
    }

    //----- Float

    private static final JsonpDeserializer<Float> FLOAT =
        new JsonpDeserializer<Float>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Float deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).numberValue().floatValue();
            }
        };

    public static JsonpDeserializer<Float> floatParser() {
        return FLOAT;
    }

    //----- Double

    private static final JsonpDeserializer<Double> DOUBLE =
        new JsonpDeserializer<Double>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Double deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).doubleValue();
            }
        };

    public static JsonpDeserializer<Double> doubleDeserializer() {
        return DOUBLE;
    }

    //----- Number

    private static final JsonpDeserializer<Number> NUMBER =
        new JsonpDeserializer<Number>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Number deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).numberValue();
            }
        };

    public static JsonpDeserializer<Number> numberDeserializer() {
        return NUMBER;
    }

    //----- JsonValue

    private static final JsonpDeserializer<JsonValue> JSON_VALUE =
        new JsonpDeserializer<JsonValue>(EnumSet.allOf(Event.class)) {
            @Override
            public JsonValue deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return parser.getValue();
            }
        };

    public static JsonpDeserializer<JsonValue> jsonValueDeserializer() {
        return JSON_VALUE;
    }

    //----- Array

    private static class ArrayDeserializer<T> extends JsonpDeserializer<List<T>> {
        private final JsonpDeserializer<T> itemDeserializer;

        protected ArrayDeserializer(JsonpDeserializer<T> itemDeserializer) {
            // Also accept single values?
            super(EnumSet.of(Event.START_ARRAY));
            this.itemDeserializer = itemDeserializer;
        }

        @Override
        public List<T> deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            ensureAccepts(parser, event);

            List<T> result = new ArrayList<>();
            while ((event = parser.next()) != Event.END_ARRAY) {
                result.add(itemDeserializer.deserialize(parser, mapper, event));
            }
            return result;
        }
    }

    public static <T> JsonpDeserializer<List<T>> arrayDeserializer(JsonpDeserializer<T> itemDeserializer) {
        return new ArrayDeserializer<>(itemDeserializer);
    }

    //----- Map

    private static class StringMapDeserializer<T> extends JsonpDeserializer<Map<String, T>> {
        private final JsonpDeserializer<T> itemDeserializer;

        protected StringMapDeserializer(JsonpDeserializer<T> itemDeserializer) {
            super(EnumSet.of(Event.START_OBJECT));
            this.itemDeserializer = itemDeserializer;
        }

        @Override
        public Map<String, T> deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            ensureAccepts(parser, event);

            Map<String, T> result = new HashMap<>();
            while ((event = parser.next()) != Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
                String key = parser.getString();
                T value = itemDeserializer.deserialize(parser, mapper);
                result.put(key, value);
            }
            return result;
        }
    }

    public static <T> JsonpDeserializer<Map<String, T>> stringMapDeserializer(JsonpDeserializer<T> itemDeserializer) {
        return new StringMapDeserializer<T>(itemDeserializer);
    }
}
