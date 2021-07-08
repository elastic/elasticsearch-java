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
import jakarta.json.stream.JsonParsingException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class ObjectDeserializer<ObjectType> extends DelegatingDeserializer<ObjectType> {

    /** A field deserializer parses a value and calls the setter on the target object. */
    public abstract static class FieldDeserializer<ObjectType> {
        protected final String name;
        protected final String[] deprecatedNames;

        public FieldDeserializer(String name, String[] deprecatedNames) {
            this.name = name;
            this.deprecatedNames = deprecatedNames;
        }
        public abstract void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object);
    }

    /** Field deserializer for objects (and boxed primitives) */
    public static class FieldObjectDeserializer<ObjectType, FieldType> extends FieldDeserializer<ObjectType> {
        private final BiConsumer<ObjectType, FieldType> setter;
        private final JsonpDeserializer<FieldType> deserializer;

        public FieldObjectDeserializer(
            BiConsumer<ObjectType, FieldType> setter, JsonpDeserializer<FieldType> deserializer,
            String name, String[] deprecatedNames
        ) {
            super(name, deprecatedNames);
            this.setter = setter;
            this.deserializer = deserializer;
        }

        public String name() {
            return this.name;
        }

        public void deserialize(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
            // Note: we handle `null` as a missing value. We may want to be more strict and distinguish nullable and
            // optional values.
            JsonParser.Event event = parser.next();
            if (event != Event.VALUE_NULL) {
                FieldType fieldValue = deserializer.deserialize(parser, mapper, event);
                setter.accept(object, fieldValue);
            }
        }
    }

    //---------------------------------------------------------------------------------------------

    private final Supplier<ObjectType> constructor;
    private final Map<String, FieldDeserializer<?>> fieldDeserializers;
    private QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler;

    public ObjectDeserializer(Supplier<ObjectType> constructor) {
        super(EnumSet.of(Event.START_OBJECT));
        this.constructor = constructor;
        this.fieldDeserializers = new HashMap<>();
    }

    public ObjectType deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
        ensureAccepts(parser, event);

        ObjectType value = constructor.get();

        // Read all properties until we reach the end of the object
        while((event = parser.next()) != Event.END_OBJECT) {

            JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
            String fieldName = parser.getString();

            @SuppressWarnings("unchecked")
            FieldDeserializer<ObjectType> fieldDeserializer = (FieldDeserializer<ObjectType>) fieldDeserializers.get(fieldName);
            if (fieldDeserializer == null) {
                parseUnknownField(parser, mapper, fieldName, value);
            } else {
                fieldDeserializer.deserialize(parser, mapper, fieldName, value);
            }
        }

        return value;
    }

    protected void parseUnknownField(JsonParser parser, JsonpMapper mapper, String fieldName, ObjectType object) {
        if (this.unknownFieldHandler != null) {
            this.unknownFieldHandler.accept(object, fieldName, parser, mapper);

        } else if (mapper.ignoreUnknownFields()) {
            JsonpUtils.skipValue(parser);

        } else {
            throw new JsonParsingException(
                "Unknown field [" + fieldName + "] for type [" + object.getClass().getSimpleName() +"]",
                parser.getLocation()
            );
        }
    }

    public void setUnknownFieldHandler(QuadConsumer<ObjectType, String, JsonParser, JsonpMapper> unknownFieldHandler) {
        this.unknownFieldHandler = unknownFieldHandler;
    }

    //----- Object types

    @Override
    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> deserializer,
        String name, String... deprecatedNames
    ) {
        FieldObjectDeserializer<ObjectType, FieldType> fieldDeserializer =
            new FieldObjectDeserializer<>(setter, deserializer, name, deprecatedNames);
        this.fieldDeserializers.put(name, fieldDeserializer);
        for (String alias: deprecatedNames) {
            this.fieldDeserializers.put(alias, fieldDeserializer);
        }
    }

    //----- Primitive types

    public void add(ObjIntConsumer<ObjectType> setter, String name, String... deprecatedNames) {
        // FIXME (perf): add specialized deserializer to avoid intermediate boxing
        add(setter::accept, integerDeserializer(), name, deprecatedNames);
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
