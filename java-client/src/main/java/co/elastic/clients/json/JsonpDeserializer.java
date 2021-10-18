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
import co.elastic.clients.util.StringEnum;
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
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
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
            // Disabled for now. Only happens with the experimental Union2 and is caused by string and number
            // parsers leniency. Need to be replaced with a check on a preferred event type.
            //if (!Collections.disjoint(result, set)) {
            //    throw new IllegalArgumentException("Deserializer accepted events are not disjoint");
            //}

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
    public V deserialize(JsonParser parser, JsonpMapper mapper) {
        Event event = parser.next();
        if (event == Event.VALUE_NULL) {
            return null;
        }
        ensureAccepts(parser, event);
        return deserialize(parser, mapper, event);
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

    /**
     * Creates a deserializer for a class that delegates to the mapper provided to
     * {@link #deserialize(JsonParser, JsonpMapper)}.
     */
    public static <T>JsonpDeserializer<T> of (Class<T> clazz) {
        return new JsonpDeserializer<T>(EnumSet.allOf(JsonParser.Event.class)) {
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

    public static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, TriFunction<JsonParser, JsonpMapper, Event, T> fn) {
        return new JsonpDeserializer<T>(acceptedEvents) {
            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                return fn.apply(parser, mapper, event);
            }
        };
    }

    public static <T> JsonpDeserializer<T> of(EnumSet<Event> acceptedEvents, BiFunction<JsonParser, JsonpMapper, T> fn) {
        return new JsonpDeserializer<T>(acceptedEvents) {
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

    //----- Lazily created parser

    public static <T> JsonpDeserializer<T> lazy(Supplier<JsonpDeserializer<T>> builder) {
        //return new LazyDeserializer<>(builder, EnumSet.of(Event.START_OBJECT));
        return new LazyDeserializer<>(builder, EnumSet.allOf(Event.class));
    }

    public static <T> JsonpDeserializer<T> lazy(Supplier<JsonpDeserializer<T>> builder, EnumSet<Event> acceptedEvents) {
        return new LazyDeserializer<>(builder, acceptedEvents);
    }

    public static <B, T> JsonpDeserializer<T> lazy(
        Supplier<B> builderCtor,
        Consumer<DelegatingDeserializer<B>> builderSetup,
        Function<B, T> buildFn
    ) {
        return lazy(() -> {
            ObjectDeserializer<B> builderDeser = new ObjectDeserializer<B>(builderCtor);
            builderSetup.accept(builderDeser);
            return new BuildFunctionDeserializer<>(builderDeser, buildFn);
        });
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

    public static <B, T> InstanceDeserializer<B, ObjectBuilder<T>> lazyInstance(
        Supplier<B> builderCtor,
        Consumer<DelegatingDeserializer<B>> builderSetup,
        Function<B, T> buildFn
    ) {
        return new LazyInstanceDeserializer<B, ObjectBuilder<T>>(() -> {
            ObjectDeserializer<B> builderDeser = new ObjectDeserializer<B>(builderCtor);
            builderSetup.accept(builderDeser);
            return new BuildFunctionInstanceDeserializer<>(builderDeser, buildFn);
        });
    }

    private static class LazyInstanceDeserializer<B, T> implements InstanceDeserializer<B, T> {
        private final Supplier<InstanceDeserializer<B, T>> ctor;
        private volatile InstanceDeserializer<B, T> deserializer = null;

        private LazyInstanceDeserializer(Supplier<InstanceDeserializer<B, T>> ctor) {
            this.ctor = ctor;
        }

        @Override
        public T deserialize(B instance, JsonParser parser, JsonpMapper mapper, Event event) {
            // See SEI CERT LCK10-J https://wiki.sei.cmu.edu/confluence/x/6zdGBQ
            InstanceDeserializer<B, T> d = deserializer;
            if (d == null) {
                synchronized (this) {
                    if (deserializer == null) {
                        d = ctor.get();
                        deserializer = d;
                    }
                }
            }

            return d.deserialize(instance, parser, mapper, event);
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

    //----- Empty object

    public static <T> JsonpDeserializer<T> emptyObject(T value) {
        return new JsonpDeserializer<T>(EnumSet.of(Event.START_OBJECT)) {
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

    //----- String

    public static JsonpDeserializer<String> stringDeserializer() {
        return STRING;
    }

    private static final JsonpDeserializer<String> STRING =
        // String parsing is lenient and accepts any other primitive type
        new JsonpDeserializer<String>(
            EnumSet.of(Event.KEY_NAME, Event.VALUE_STRING, Event.VALUE_NUMBER, Event.VALUE_FALSE, Event.VALUE_TRUE)
        ) {
            @Override
            public String deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_TRUE) {
                    return "true";
                }
                if (event == Event.VALUE_FALSE) {
                    return "false";
                }
                return parser.getString(); // also accepts numbers
            }
        };

    //----- Integer

    private static final JsonpDeserializer<Integer> INTEGER =
        new JsonpDeserializer<Integer>(EnumSet.of(Event.VALUE_NUMBER, Event.VALUE_STRING)) {
            @Override
            public Integer deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    return Integer.valueOf(parser.getString());
                }
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
                return event == Event.VALUE_TRUE;
            }
        };

    public static JsonpDeserializer<Boolean> booleanDeserializer() {
        return BOOLEAN;
    }

    //----- Long

    private static final JsonpDeserializer<Long> LONG =
        new JsonpDeserializer<Long>(EnumSet.of(Event.VALUE_NUMBER, Event.VALUE_STRING)) {
            @Override
            public Long deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    return Long.valueOf(parser.getString());
                }
                return parser.getLong();
            }
        };

    public static JsonpDeserializer<Long> longDeserializer() {
        return LONG;
    }

    //----- Float

    private static final JsonpDeserializer<Float> FLOAT =
        new JsonpDeserializer<Float>(EnumSet.of(Event.VALUE_NUMBER, Event.VALUE_STRING)) {
            @Override
            public Float deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    return Float.valueOf(parser.getString());
                }
                return ((JsonNumber)parser.getValue()).numberValue().floatValue();
            }
        };

    public static JsonpDeserializer<Float> floatDeserializer() {
        return FLOAT;
    }

    //----- Double

    private static final JsonpDeserializer<Double> DOUBLE =
        new JsonpDeserializer<Double>(EnumSet.of(Event.VALUE_NUMBER, Event.VALUE_STRING)) {
            @Override
            public Double deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    return Double.valueOf(parser.getString());
                }
                return ((JsonNumber)parser.getValue()).doubleValue();
            }
        };

    public static JsonpDeserializer<Double> doubleDeserializer() {
        return DOUBLE;
    }

    //----- Number

    private static final JsonpDeserializer<Number> NUMBER =
        new JsonpDeserializer<Number>(EnumSet.of(Event.VALUE_NUMBER, Event.VALUE_STRING)) {
            @Override
            public Number deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                if (event == Event.VALUE_STRING) {
                    return Double.valueOf(parser.getString());
                }
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

        private static <T> EnumSet<Event> lenientEvents(JsonpDeserializer<T> itemDeserializer) {
            EnumSet<Event> set = EnumSet.of(Event.START_ARRAY);
            set.addAll(itemDeserializer.acceptedEvents());
            return set;
        }

        protected ArrayDeserializer(JsonpDeserializer<T> itemDeserializer) {
            // Also accept single values?
            super(lenientEvents(itemDeserializer));
            this.itemDeserializer = itemDeserializer;
        }

        @Override
        public List<T> deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            if (event == Event.START_ARRAY) {
                List<T> result = new ArrayList<>();
                while ((event = parser.next()) != Event.END_ARRAY) {
                    itemDeserializer.ensureAccepts(parser, event);
                    result.add(itemDeserializer.deserialize(parser, mapper, event));
                }
                return result;
            } else {
                // Single-value mode
                itemDeserializer.ensureAccepts(parser, event);
                return Collections.singletonList(itemDeserializer.deserialize(parser, mapper, event));
            }
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

    private static class EnumMapDeserializer<K, V> extends JsonpDeserializer<Map<K, V>> {
        private final JsonpDeserializer<K> keyDeserializer;
        private final JsonpDeserializer<V> valueDeserializer;

        protected EnumMapDeserializer(JsonpDeserializer<K> keyDeserializer, JsonpDeserializer<V> valueDeserializer) {
            super(EnumSet.of(Event.START_OBJECT));
            this.keyDeserializer = keyDeserializer;
            this.valueDeserializer = valueDeserializer;
        }

        @Override
        public Map<K, V> deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            Map<K, V> result = new HashMap<>();
            while ((event = parser.next()) != Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
                K key = keyDeserializer.deserialize(parser, mapper, event);
                V value = valueDeserializer.deserialize(parser, mapper);
                result.put(key, value);
            }
            return result;
        }
    }

    public static <K extends StringEnum, V> JsonpDeserializer<Map<K, V>> enumMapDeserializer(
        JsonpDeserializer<K> keyDeserializer, JsonpDeserializer<V> valueDeserializer
    ) {
        return new EnumMapDeserializer<K, V>(keyDeserializer, valueDeserializer);
    }
}
