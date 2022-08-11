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
import jakarta.json.stream.JsonParsingException;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static jakarta.json.stream.JsonParser.Event;

/**
 * Base interface for enumerations in API types. Members have a JSON representation and also accept
 * aliases when parsed from a string value.
 */
public interface JsonEnum extends JsonpSerializable {
    String jsonValue();

    @Nullable
    default String[] aliases() {
        return null;
    }

    @Override
    default void serialize(JsonGenerator generator, JsonpMapper params) {
        generator.write(jsonValue());
    }

    class Deserializer<T extends JsonEnum> extends JsonpDeserializerBase<T> {

        private static final EnumSet<Event> acceptedEvents = EnumSet.of(Event.VALUE_STRING, Event.KEY_NAME);
        private static final EnumSet<Event> nativeEvents = EnumSet.of(Event.VALUE_STRING);

        private final Map<String, T> lookupTable;

        public Deserializer(T[] values) {
            this(values, acceptedEvents);
        }

        protected Deserializer(T[] values, EnumSet<Event> acceptedEvents) {
            super(acceptedEvents, nativeEvents);

            // Use the same size calculation as in java.lang.Enum.enumConstantDirectory
            this.lookupTable = new HashMap<>((int)(values.length / 0.75f) + 1);
            for (T member : values) {
                String jsonValue = member.jsonValue();
                if (jsonValue != null) { // _Custom enum members have a null jsonValue
                    this.lookupTable.put(jsonValue, member);
                }
                String[] aliases = member.aliases();
                if (aliases != null) {
                    for (String alias: aliases) {
                        this.lookupTable.put(alias, member);
                    }
                }
            }
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            String value = parser.getString();
            return deserialize(value, parser);
        }

        /**
         * Get the enum member for a JSON string value
         *
         * @param value the JSON value
         * @param parser parsing context
         * @return the enum member
         * @throws JsonParsingException if no matching enum was found
         */
        public T deserialize(String value, JsonParser parser) {
            T result = this.lookupTable.get(value);
            if (result == null) {
                throw new JsonpMappingException("Invalid enum '" + value + "'", parser.getLocation());
            }
            return result;
        }

        /**
         * Get the enum member for a JSON string value
         *
         * @param value the JSON value
         * @return the enum member
         * @throws IllegalArgumentException if no matching enum was found
         */
        public T parse(String value) {
            T result = this.lookupTable.get(value);
            if (result == null) {
                throw new NoSuchElementException("Invalid enum '" + value + "'");
            }
            return result;
        }

        /**
         * An enum deserializer that also accepts boolean values. Used for a few properties that started as two-state booleans
         * and evolved into enums over time.
         */
        public static class AllowingBooleans<T extends JsonEnum> extends Deserializer<T> {

            private static final EnumSet<Event> acceptedEventsAndBoolean =
                EnumSet.of(Event.VALUE_STRING, Event.KEY_NAME, Event.VALUE_TRUE, Event.VALUE_FALSE);

            public AllowingBooleans(T[] values) {
                super(values, acceptedEventsAndBoolean);
            }

            @Override
            public T deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
                String value;
                if (event == Event.VALUE_TRUE) {
                    value = "true";
                } else if (event == Event.VALUE_FALSE) {
                    value = "false";
                } else {
                    value = parser.getString();
                }

                return deserialize(value, parser);
            }
        }
    }
}
