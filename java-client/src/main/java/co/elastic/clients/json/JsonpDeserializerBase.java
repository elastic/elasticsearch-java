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

import jakarta.json.JsonNumber;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Base class for {@link JsonpDeserializer} implementations that accept a set of JSON events known at instanciation time.
 */
public abstract class JsonpDeserializerBase<V> implements JsonpDeserializer<V> {

    private final EnumSet<JsonParser.Event> acceptedEvents;

    protected JsonpDeserializerBase(EnumSet<JsonParser.Event> acceptedEvents) {
        this.acceptedEvents = acceptedEvents;
    }

    /** Combines accepted events from a number of deserializers */
    protected static EnumSet<JsonParser.Event> allAcceptedEvents(JsonpDeserializer<?>... deserializers) {
        EnumSet<JsonParser.Event> result = EnumSet.noneOf(JsonParser.Event.class);
        for (JsonpDeserializer<?> deserializer: deserializers) {

            EnumSet<JsonParser.Event> set = deserializer.acceptedEvents();
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
    public final EnumSet<JsonParser.Event> acceptedEvents() {
        return acceptedEvents;
    }

    /**
     * Convenience method for {@code acceptedEvents.contains(event)}
     */
    public final boolean accepts(JsonParser.Event event) {
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
        JsonParser.Event event = parser.next();
        if (event == JsonParser.Event.VALUE_NULL) {
            return null;
        }
        ensureAccepts(parser, event);
        return deserialize(parser, mapper, event);
    }


    //---------------------------------------------------------------------------------------------

    //----- Lazy deserializers

    static class LazyDeserializer<T> extends JsonpDeserializerBase<T> {

        private final Supplier<JsonpDeserializer<T>> builder;
        private volatile JsonpDeserializer<T> deserializer = null;

        LazyDeserializer(Supplier<JsonpDeserializer<T>> builder, EnumSet<JsonParser.Event> acceptedEvents) {
            super(acceptedEvents);
            this.builder = builder;
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
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

    //----- Builtin types

    static final JsonpDeserializer<String> STRING =
        // String parsing is lenient and accepts any other primitive type
        new JsonpDeserializerBase<String>(EnumSet.of(
            JsonParser.Event.KEY_NAME, JsonParser.Event.VALUE_STRING, JsonParser.Event.VALUE_NUMBER,
            JsonParser.Event.VALUE_FALSE, JsonParser.Event.VALUE_TRUE
        )) {
            @Override
            public String deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_TRUE) {
                    return "true";
                }
                if (event == JsonParser.Event.VALUE_FALSE) {
                    return "false";
                }
                return parser.getString(); // also accepts numbers
            }
        };

    static final JsonpDeserializer<Integer> INTEGER =
        new JsonpDeserializerBase<Integer>(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING)) {
            @Override
            public Integer deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_STRING) {
                    return Integer.valueOf(parser.getString());
                }
                return parser.getInt();
            }
        };

    static final JsonpDeserializer<Boolean> BOOLEAN =
        new JsonpDeserializerBase<Boolean>(EnumSet.of(JsonParser.Event.VALUE_FALSE, JsonParser.Event.VALUE_TRUE)) {
            @Override
            public Boolean deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                return event == JsonParser.Event.VALUE_TRUE;
            }
        };

    static final JsonpDeserializer<Long> LONG =
        new JsonpDeserializerBase<Long>(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING)) {
            @Override
            public Long deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_STRING) {
                    return Long.valueOf(parser.getString());
                }
                return parser.getLong();
            }
        };

    static final JsonpDeserializer<Float> FLOAT =
        new JsonpDeserializerBase<Float>(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING)) {
            @Override
            public Float deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_STRING) {
                    return Float.valueOf(parser.getString());
                }
                return ((JsonNumber)parser.getValue()).numberValue().floatValue();
            }
        };

    static final JsonpDeserializer<Double> DOUBLE =
        new JsonpDeserializerBase<Double>(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING)) {
            @Override
            public Double deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_STRING) {
                    return Double.valueOf(parser.getString());
                }
                return ((JsonNumber)parser.getValue()).doubleValue();
            }
        };

    static final JsonpDeserializer<Number> NUMBER =
        new JsonpDeserializerBase<Number>(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING)) {
            @Override
            public Number deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                if (event == JsonParser.Event.VALUE_STRING) {
                    return Double.valueOf(parser.getString());
                }
                return ((JsonNumber)parser.getValue()).numberValue();
            }
        };

    static final JsonpDeserializer<JsonValue> JSON_VALUE =
        new JsonpDeserializerBase<JsonValue>(EnumSet.allOf(JsonParser.Event.class)) {
            @Override
            public JsonValue deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                return parser.getValue();
            }
        };

    static final JsonpDeserializer<Void> VOID = new JsonpDeserializerBase<Void>(EnumSet.noneOf(JsonParser.Event.class)) {
        @Override
        public Void deserialize(JsonParser parser, JsonpMapper mapper) {
            throw new JsonParsingException("Void types should not have any value", parser.getLocation());
        }

        @Override
        public Void deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            return deserialize(parser, mapper);
        }
    };

    //----- Collections

    static class ArrayDeserializer<T> extends JsonpDeserializerBase<List<T>> {
        private final JsonpDeserializer<T> itemDeserializer;

        private static <T> EnumSet<JsonParser.Event> lenientEvents(JsonpDeserializer<T> itemDeserializer) {
            EnumSet<JsonParser.Event> set = EnumSet.of(JsonParser.Event.START_ARRAY);
            set.addAll(itemDeserializer.acceptedEvents());
            return set;
        }

        protected ArrayDeserializer(JsonpDeserializer<T> itemDeserializer) {
            // Also accept single values?
            super(lenientEvents(itemDeserializer));
            this.itemDeserializer = itemDeserializer;
        }

        @Override
        public List<T> deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            if (event == JsonParser.Event.START_ARRAY) {
                List<T> result = new ArrayList<>();
                while ((event = parser.next()) != JsonParser.Event.END_ARRAY) {
                    JsonpUtils.ensureAccepts(itemDeserializer, parser, event);
                    result.add(itemDeserializer.deserialize(parser, mapper, event));
                }
                return result;
            } else {
                // Single-value mode
                JsonpUtils.ensureAccepts(itemDeserializer, parser, event);
                return Collections.singletonList(itemDeserializer.deserialize(parser, mapper, event));
            }
        }
    }

    static class StringMapDeserializer<T> extends JsonpDeserializerBase<Map<String, T>> {
        private final JsonpDeserializer<T> itemDeserializer;

        protected StringMapDeserializer(JsonpDeserializer<T> itemDeserializer) {
            super(EnumSet.of(JsonParser.Event.START_OBJECT));
            this.itemDeserializer = itemDeserializer;
        }

        @Override
        public Map<String, T> deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            Map<String, T> result = new HashMap<>();
            while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
                String key = parser.getString();
                T value = itemDeserializer.deserialize(parser, mapper);
                result.put(key, value);
            }
            return result;
        }
    }

    static class EnumMapDeserializer<K, V> extends JsonpDeserializerBase<Map<K, V>> {
        private final JsonpDeserializer<K> keyDeserializer;
        private final JsonpDeserializer<V> valueDeserializer;

        protected EnumMapDeserializer(JsonpDeserializer<K> keyDeserializer, JsonpDeserializer<V> valueDeserializer) {
            super(EnumSet.of(JsonParser.Event.START_OBJECT));
            this.keyDeserializer = keyDeserializer;
            this.valueDeserializer = valueDeserializer;
        }

        @Override
        public Map<K, V> deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            Map<K, V> result = new HashMap<>();
            while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
                K key = keyDeserializer.deserialize(parser, mapper, event);
                V value = valueDeserializer.deserialize(parser, mapper);
                result.put(key, value);
            }
            return result;
        }
    }



}
