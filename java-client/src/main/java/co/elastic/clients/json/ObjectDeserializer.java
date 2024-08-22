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

import co.elastic.clients.util.QuadConsumer;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class ObjectDeserializer<ObjectType> implements JsonpDeserializer<ObjectType> {

    /** A field deserializer parses a value and calls the setter on the target object. */
    public abstract static class FieldDeserializer<ObjectType> {
        protected final String name;

        public FieldDeserializer(String name) {
            this.name = name;
        }

        public abstract EnumSet<Event> acceptedEvents();

        public abstract void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object);

        public abstract void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object, Event event);
    }

    /** Field deserializer for objects (and boxed primitives) */
    public static class FieldObjectDeserializer<ObjectType, FieldType> extends FieldDeserializer<ObjectType> {
        private final BiConsumer<ObjectType, FieldType> setter;
        private final JsonpDeserializer<FieldType> deserializer;

        public FieldObjectDeserializer(
            BiConsumer<ObjectType, FieldType> setter, JsonpDeserializer<FieldType> deserializer,
            String name
        ) {
            super(name);
            this.setter = setter;
            this.deserializer = deserializer;
        }

        public String name() {
            return this.name;
        }

        @Override
        public EnumSet<Event> acceptedEvents() {
            return deserializer.acceptedEvents();
        }

        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
            FieldType fieldValue = deserializer.deserialize(parser, mapper);
            setter.accept(object, fieldValue);
        }

        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object, Event event) {
            JsonpUtils.ensureAccepts(deserializer, parser, event);
            FieldType fieldValue = deserializer.deserialize(parser, mapper, event);
            setter.accept(object, fieldValue);
        }
    }

    private static final FieldDeserializer<?> IGNORED_FIELD = new FieldDeserializer<Object>("-") {

        @Override
        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, Object object) {
            JsonpUtils.skipValue(parser);
        }

        @Override
        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, Object object, Event event) {
            JsonpUtils.skipValue(parser, event);
        }

        @Override
        public EnumSet<Event> acceptedEvents() {
            return EnumSet.allOf(Event.class);
        }
    };

    //---------------------------------------------------------------------------------------------
    private static final EnumSet<Event> EventSetObject = EnumSet.of(Event.START_OBJECT, Event.KEY_NAME);

    private EnumSet<Event> acceptedEvents = EventSetObject; // May be changed in `shortcutProperty()`
    private final Supplier<ObjectType> constructor;
    protected final Map<String, FieldDeserializer<ObjectType>> fieldDeserializers;
    private FieldDeserializer<ObjectType> singleKey;
    private String typeProperty;
    private String defaultType;
    private FieldDeserializer<ObjectType> shortcutProperty;
    private boolean shortcutIsObject;
    private QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler;

    public ObjectDeserializer(Supplier<ObjectType> constructor) {
        this.constructor = constructor;
        this.fieldDeserializers = new HashMap<>();
    }

    /**
     * Return the top-level property names of the target type for this deserializer.
     */
    public Set<String> fieldNames() {
        return Collections.unmodifiableSet(fieldDeserializers.keySet());
    }

    public @Nullable String shortcutProperty() {
        return this.shortcutProperty == null ? null : this.shortcutProperty.name;
    }

    public boolean shortcutIsObject() {
        return this.shortcutIsObject;
    }

    @Override
    public EnumSet<Event> nativeEvents() {
        // May also return string if we have a shortcut property. This is needed to identify ambiguous unions.
        return acceptedEvents;
    }

    @Override
    public EnumSet<Event> acceptedEvents() {
        return acceptedEvents;
    }

    public ObjectType deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
        if (event == Event.VALUE_NULL) {
            return null;
        }

        ObjectType value = constructor.get();
        deserialize(value, parser, mapper, event);
        return value;
    }

    public void deserialize(ObjectType value, JsonParser parser, JsonpMapper mapper, Event event) {
        // Note: method is public as it's called by `withJson` to augment an already created object

        if (singleKey == null) {
            // Nominal case
            deserializeInner(value, parser, mapper, event);

        } else {
            // Single key dictionary: there's a wrapping property whose name is the key value
            if (event == Event.START_OBJECT) {
                event = JsonpUtils.expectNextEvent(parser, Event.KEY_NAME);
            }

            String keyName = parser.getString();
            try {
                singleKey.deserialize(parser, mapper, null, value, event);
                event = parser.next();
                deserializeInner(value, parser, mapper, event);
            } catch (Exception e) {
                throw JsonpMappingException.from(e, value, keyName, parser);
            }

            JsonpUtils.expectNextEvent(parser, Event.END_OBJECT);
        }
    }

    private void deserializeInner(ObjectType value, JsonParser parser, JsonpMapper mapper, Event event) {
        String fieldName = null;

        try {
            if ((parser = deserializeWithShortcut(value, parser, mapper, event)) == null) {
                // We found the shortcut form
                return;
            }

            if (typeProperty == null) {
                if (event != Event.START_OBJECT && event != Event.KEY_NAME) {
                    // Report we're waiting for a start_object, since this is the most common beginning for object parser
                    JsonpUtils.expectEvent(parser, Event.START_OBJECT, event);
                }

                if (event == Event.START_OBJECT) {
                    event = parser.next();
                }
                // Regular object: read all properties until we reach the end of the object
                while (event != Event.END_OBJECT) {
                    JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
                    fieldName = parser.getString();

                    FieldDeserializer<ObjectType> fieldDeserializer = fieldDeserializers.get(fieldName);
                    if (fieldDeserializer == null) {
                        parseUnknownField(parser, mapper, fieldName, value);
                    } else {
                        fieldDeserializer.deserialize(parser, mapper, fieldName, value);
                    }
                    event = parser.next();
                }
                fieldName = null;
            } else {
                // Union variant: find the property to find the proper deserializer
                // We cannot start with a key name here.
                JsonpUtils.expectEvent(parser, Event.START_OBJECT, event);
                Map.Entry<String, JsonParser> unionInfo = JsonpUtils.lookAheadFieldValue(typeProperty, defaultType, parser, mapper);
                String variant = unionInfo.getKey();
                JsonParser innerParser = unionInfo.getValue();

                FieldDeserializer<ObjectType> fieldDeserializer = fieldDeserializers.get(variant);
                if (fieldDeserializer == null) {
                    parseUnknownField(innerParser, mapper, variant, value);
                } else {
                    fieldDeserializer.deserialize(innerParser, mapper, variant, value);
                }
            }
        } catch (Exception e) {
            // Add field name if present
            throw JsonpMappingException.from(e, value, fieldName, parser);
        }
    }

    /**
     * Try to deserialize the value with its shortcut property, if any.
     *
     * @return {@code null} if the shortcut form was found, and otherwise a parser that should be used to parse the
     *         non-shortcut form. It may be different from the orginal parser if look-ahead was needed.
     */
    private JsonParser deserializeWithShortcut(ObjectType value, JsonParser parser, JsonpMapper mapper, Event event) {
        if (shortcutProperty != null) {
            if (!shortcutIsObject) {
                if (event != Event.START_OBJECT && event != Event.KEY_NAME) {
                    // This is the shortcut property (should be a value or array event, this will be checked by its deserializer)
                    shortcutProperty.deserialize(parser, mapper, shortcutProperty.name, value, event);
                    return null;
                }
            } else {
                // Fast path: we don't need to look ahead if the current event isn't an object
                if (event != Event.START_OBJECT) {
                    shortcutProperty.deserialize(parser, mapper, shortcutProperty.name, value, event);
                    return null;
                }

                // Look ahead: does the shortcut property exist? If yes, the shortcut is used
                Map.Entry<Object, JsonParser> shortcut = JsonpUtils.findVariant(
                    Collections.singletonMap(shortcutProperty.name, Boolean.TRUE /* arbitrary non-null value */),
                    parser, mapper
                );

                // Parse the buffered events
                parser = shortcut.getValue();
                event = parser.next();

                // If shortcut property was not found, this is a shortcut. Otherwise, keep deserializing as usual
                if (shortcut.getKey() == null) {
                    shortcutProperty.deserialize(parser, mapper, shortcutProperty.name, value, event);
                    return null;
                }
            }
        }

        return parser;
    }

    protected void parseUnknownField(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
        if (this.unknownFieldHandler != null) {
            this.unknownFieldHandler.accept(object, fieldName, parser, mapper);

        } else if (mapper.ignoreUnknownFields()) {
            JsonpUtils.skipValue(parser);

        } else {
            // Context is added by the caller
            throw new JsonpMappingException("Unknown field '" + fieldName + "'", parser.getLocation());
        }
    }

    /**
     * Sets a handler for unknown fields.
     * <p>
     * Note: on failure, handlers should not report the field name in their exception: this is handled by the caller.
     */
    public void setUnknownFieldHandler(QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler) {
        this.unknownFieldHandler = unknownFieldHandler;
    }

    @SuppressWarnings("unchecked")
    public void ignore(String name) {
        this.fieldDeserializers.put(name, (FieldDeserializer<ObjectType>) IGNORED_FIELD);
    }

    public void shortcutProperty(String name) {
        shortcutProperty(name, false);
    }

    public void shortcutProperty(String name, boolean isObject) {
        this.shortcutProperty = this.fieldDeserializers.get(name);
        if (this.shortcutProperty == null) {
            throw new NoSuchElementException("No deserializer was setup for '" + name + "'");
        }

        acceptedEvents = EnumSet.copyOf(acceptedEvents);
        acceptedEvents.addAll(shortcutProperty.acceptedEvents());
        this.shortcutIsObject = isObject;
    }

    //----- Object types

    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> deserializer,
        String name
    ) {
        FieldObjectDeserializer<ObjectType, FieldType> fieldDeserializer =
            new FieldObjectDeserializer<>(setter, deserializer, name);
        this.fieldDeserializers.put(name, fieldDeserializer);
    }

    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> deserializer,
        String name, String... aliases
    ) {
        FieldObjectDeserializer<ObjectType, FieldType> fieldDeserializer =
            new FieldObjectDeserializer<>(setter, deserializer, name);
        this.fieldDeserializers.put(name, fieldDeserializer);
        for (String alias: aliases) {
            this.fieldDeserializers.put(alias, fieldDeserializer);
        }
    }

    public <FieldType> void setKey(BiConsumer<ObjectType, FieldType> setter, JsonpDeserializer<FieldType> deserializer) {
        this.singleKey = new FieldObjectDeserializer<>(setter, deserializer, null);
    }

    public void setTypeProperty(String name, String defaultType) {
        this.typeProperty = name;
        this.defaultType = defaultType;
        if (this.unknownFieldHandler == null) {
            this.unknownFieldHandler = (o, value, parser, mapper) -> {
                // Context is added by the caller
                throw new JsonpMappingException("Unknown '" + name + "' value: '" + value + "'", parser.getLocation());
            };
        }
    }

    //----- Primitive types

    public void add(ObjIntConsumer<ObjectType> setter, String name, String... deprecatedNames) {
        // FIXME (perf): add specialized deserializer to avoid intermediate boxing
        add(setter::accept, JsonpDeserializer.integerDeserializer(), name, deprecatedNames);
    }

// Experiment: avoid boxing, allow multiple primitive parsers (e.g. int as number & string)
//    public void add(
//        ObjIntConsumer<ObjectType> setter,
//        JsonpIntParser vp,
//        String name, String... deprecatedNames
//    ) {
//        this.fieldDeserializers.put(name, new FieldDeserializer<ObjectType>(name, deprecatedNames) {
//            @Override
//            public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
//                JsonpUtils.expectNextEvent(parser, Event.VALUE_NUMBER);
//                setter.accept(object, vp.parse(parser));
//            }
//        });
//    }
//
//    public static class JsonpIntParser {
//        public int parse(JsonParser parser) {
//            JsonpUtils.expectNextEvent(parser, Event.VALUE_NUMBER);
//            return parser.getInt();
//        }
//    }

}
