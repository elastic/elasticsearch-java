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

import javax.json.JsonNumber;
import javax.json.JsonValue;
import javax.json.spi.JsonProvider;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import javax.json.stream.JsonParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public abstract class JsonpValueParser<V> {

    /**
     * Deserialization parameters
     */
    public static class Params {

        private final JsonProvider jsonProvider;

        public Params(JsonProvider provider) {
            this.jsonProvider = provider;
        }

        public boolean allowDeprecation() {
            return true;
        }

        public boolean ignoreUnknownFields() {
            return true;
        }

        public JsonProvider jsonProvider() {
            return this.jsonProvider;
        }
    }

    public static final Params DEFAULT_PARAMS = new Params(JsonProvider.provider());

    //---------------------------------------------------------------------------------------------

    private final EnumSet<Event> acceptedEvents;

    protected JsonpValueParser(EnumSet<Event> acceptedEvents) {
        this.acceptedEvents = acceptedEvents;
    }

    /** Combines accepted events from a number of parsers */
    protected static EnumSet<JsonParser.Event> allAcceptedEvents(JsonpValueParser<?>... parsers) {
        EnumSet<JsonParser.Event> result = EnumSet.noneOf(JsonParser.Event.class);
        for (JsonpValueParser<?> parser: parsers) {

            EnumSet<Event> set = parser.acceptedEvents();
            if (!Collections.disjoint(result, set)) {
                throw new IllegalArgumentException("Parser accepted events are not disjoint");
            }

            result.addAll(set);
        }
        return result;
    }

    /**
     * The json events this parser accepts as a starting point
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
                String.format("Unexpected JSON event '%s'", event),
                parser.getLocation()
            );
        }
    }

    /**
     * Parse a value. The value starts at the next state in the json stream.
     *
     * @param parser the json parser
     * @param params deserialization parameters
     * @return the parsed value
     */
    public final V parse(JsonParser parser, Params params) {
        return parse(parser, params, parser.next());
    }

    /**
     * Parse a value. The value starts at the current state in the json stream.
     *
     * This method will usually start with {@code ensureAccepts(parser, event)} to ensure correctness of the
     * starting state.
     *
     * @param parser the json parser
     * @param params deserialization parameters
     * @param event the current state of {@code parser}, which must be part of {@link #acceptedEvents}
     * @return the parsed value
     */
    public abstract V parse(JsonParser parser, Params params, JsonParser.Event event);

    //---------------------------------------------------------------------------------------------

    public static <T> JsonpValueParser<T> of(EnumSet<Event> acceptedEvents, TriFunction<JsonParser, Params, Event, T> fn) {
        return new JsonpValueParser<T>(acceptedEvents) {
            @Override
            public T parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return fn.apply(parser, params, event);
            }
        };
    }

    //----- Lazily created parser

    public static <T> JsonpValueParser<T> lazy(Supplier<JsonpValueParser<T>> builder) {
        return new LazyParser<>(builder, EnumSet.of(Event.START_OBJECT));
    }

    public static <T> JsonpValueParser<T> lazy(Supplier<JsonpValueParser<T>> builder, EnumSet<Event> acceptedEvents) {
        return new LazyParser<>(builder, acceptedEvents);
    }

    private static class LazyParser<T> extends JsonpValueParser<T> {

        private final Supplier<JsonpValueParser<T>> builder;
        private volatile JsonpValueParser<T> valueParser = null;

        private LazyParser(Supplier<JsonpValueParser<T>> builder, EnumSet<Event> acceptedEvents) {
            super(acceptedEvents);
            this.builder = builder;
        }

        @Override
        public T parse(JsonParser parser, Params params, Event event) {
            // See SEI CERT LCK10-J https://wiki.sei.cmu.edu/confluence/x/6zdGBQ
            JsonpValueParser<T> p = valueParser;
            if (p == null) {
                synchronized (this) {
                    if (valueParser == null) {
                        p = builder.get();
                        valueParser = p;
                    }
                }
            }
            return p.parse(parser, params, event);
        }
    }

    //----- Fixed value

    public static <T> JsonpValueParser<T> fixedValue(T value) {
        return new JsonpValueParser<T>(EnumSet.noneOf(Event.class)) {
            @Override
            public T parse(JsonParser parser, Params params, Event event) {
                return value;
            }
        };
    }

    //----- String

    public static JsonpValueParser<String> stringParser() {
        return STRING;
    }

    private static final JsonpValueParser<String> STRING =
        new JsonpValueParser<String>(EnumSet.of(Event.VALUE_STRING)) {
            @Override
            public String parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return parser.getString();
            }
        };

    //----- Integer

    private static final JsonpValueParser<Integer> INTEGER =
        new JsonpValueParser<Integer>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Integer parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return parser.getInt();
            }
        };

    public static JsonpValueParser<Integer> integerParser() {
        return INTEGER;
    }

    //----- Boolean

    private static final JsonpValueParser<Boolean> BOOLEAN =
        new JsonpValueParser<Boolean>(EnumSet.of(Event.VALUE_FALSE, Event.VALUE_TRUE)) {
            @Override
            public Boolean parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return event == Event.VALUE_TRUE;
            }
        };

    public static JsonpValueParser<Boolean> booleanParser() {
        return BOOLEAN;
    }

    //----- Long

    private static final JsonpValueParser<Long> LONG =
        new JsonpValueParser<Long>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Long parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return parser.getLong();
            }
        };

    public static JsonpValueParser<Long> longParser() {
        return LONG;
    }

    //----- Float

    private static final JsonpValueParser<Float> FLOAT =
        new JsonpValueParser<Float>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Float parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).numberValue().floatValue();
            }
        };

    public static JsonpValueParser<Float> floatParser() {
        return FLOAT;
    }

    //----- Double

    private static final JsonpValueParser<Double> DOUBLE =
        new JsonpValueParser<Double>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Double parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).doubleValue();
            }
        };

    public static JsonpValueParser<Double> doubleParser() {
        return DOUBLE;
    }

    //----- Number

    private static final JsonpValueParser<Number> NUMBER =
        new JsonpValueParser<Number>(EnumSet.of(Event.VALUE_NUMBER)) {
            @Override
            public Number parse(JsonParser parser, Params params, Event event) {
                ensureAccepts(parser, event);
                return ((JsonNumber)parser.getValue()).numberValue();
            }
        };

    public static JsonpValueParser<Number> numberParser() {
        return NUMBER;
    }

    //----- JsonValue

    private static final JsonpValueParser<JsonValue> JSON_VALUE =
        new JsonpValueParser<JsonValue>(EnumSet.allOf(Event.class)) {
            @Override
            public JsonValue parse(JsonParser parser, Params params, Event event) {
                return parser.getValue();
            }
        };

    public static JsonpValueParser<JsonValue> jsonValueParser() {
        return JSON_VALUE;
    }

    //----- Array

    private static class ArrayParser<T> extends JsonpValueParser<List<T>> {
        private final JsonpValueParser<T> itemParser;

        protected ArrayParser(JsonpValueParser<T> itemParser) {
            // Also accept single values?
            super(EnumSet.of(Event.START_ARRAY));
            this.itemParser = itemParser;
        }

        @Override
        public List<T> parse(JsonParser parser, Params params, Event event) {
            ensureAccepts(parser, event);

            List<T> result = new ArrayList<>();
            while ((event = parser.next()) != Event.END_ARRAY) {
                result.add(itemParser.parse(parser, params, event));
            }
            return result;
        }
    }

    public static <T> JsonpValueParser<List<T>> arrayParser(JsonpValueParser<T> itemParser) {
        return new ArrayParser<>(itemParser);
    }

    //----- Map

    private static class StringMapParser<T> extends JsonpValueParser<Map<String, T>> {
        private final JsonpValueParser<T> itemParser;

        protected StringMapParser(JsonpValueParser<T> itemParser) {
            super(EnumSet.of(Event.START_OBJECT));
            this.itemParser = itemParser;
        }

        @Override
        public Map<String, T> parse(JsonParser parser, Params params, Event event) {
            ensureAccepts(parser, event);

            Map<String, T> result = new HashMap<>();
            while ((event = parser.next()) != Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
                String key = parser.getString();
                T value = itemParser.parse(parser, params);
                result.put(key, value);
            }
            return result;
        }
    }

    public static <T> JsonpValueParser<Map<String, T>> stringMapParser(JsonpValueParser<T> itemParser) {
        return new StringMapParser(itemParser);
    }
}
