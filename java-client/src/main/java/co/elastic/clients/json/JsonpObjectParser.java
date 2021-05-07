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

import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import javax.json.stream.JsonParsingException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class JsonpObjectParser<ObjectType> extends JsonpValueParser<ObjectType> {

    /** A field parser parses a value and calls the setter on the target object. */
    public abstract class FieldParser {
        protected final String name;
        protected final String deprecatedNames[];

        public FieldParser(String name, String[] deprecatedNames) {
            this.name = name;
            this.deprecatedNames = deprecatedNames;
        }
        public abstract void parse(JsonParser parser, Params params, String fieldName, ObjectType object);
    }

    /** Field parser for objects (and boxed primitives) */
    public class FieldObjectParser<FieldType> extends FieldParser {
        private final BiConsumer<ObjectType, FieldType> setter;
        private final JsonpValueParser<FieldType> valueParser;

        public FieldObjectParser(
            BiConsumer<ObjectType, FieldType> setter, JsonpValueParser<FieldType> valueParser,
            String name, String[] deprecatedNames
        ) {
            super(name, deprecatedNames);
            this.setter = setter;
            this.valueParser = valueParser;
        }

        public String name() {
            return this.name;
        }

        public void parse(JsonParser parser, Params params, String fieldName, ObjectType object) {

            if (!params.allowDeprecation() && !fieldName.equals(this.name)) {
                // FIXME: handle deprecations
            }

            FieldType fieldValue = valueParser.parse(parser, params);
            setter.accept(object, fieldValue);
        }
    }

    //---------------------------------------------------------------------------------------------

    private Supplier<ObjectType> valueBuilder;
    private Map<String, FieldParser> fieldParsers;

    public JsonpObjectParser(Supplier<ObjectType> valueBuilder) {
        super(EnumSet.of(Event.START_OBJECT));
        this.valueBuilder = valueBuilder;
        this.fieldParsers = new HashMap<>();
    }

    public ObjectType parse(JsonParser parser, Params params, Event event) {
        ensureAccepts(parser, event);

        ObjectType value = valueBuilder.get();

        // Read all properties until we reach the end of the object
        while((event = parser.next()) != Event.END_OBJECT) {

            JsonpUtils.expectEvent(parser, Event.KEY_NAME, event);
            String fieldName = parser.getString();

            FieldParser fieldParser = fieldParsers.get(fieldName);
            if (fieldParser == null) {
                parseUnknownField(parser, params, fieldName, value);
            } else {
                fieldParser.parse(parser, params, fieldName, value);
            }
        }

        return value;
    }

    protected void parseUnknownField(JsonParser parser, Params params, String fieldName, ObjectType object) {
        if (params.ignoreUnknownFields()) {
            JsonpUtils.consumeValue(parser);
        } else {
            throw new JsonParsingException(
                "Unknown field [" + fieldName + "] for type [" + object.getClass().getSimpleName() +"]",
                parser.getLocation()
            );
        }
    }

    //----- Object types

    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpValueParser<FieldType> valueParser,
        String name, String... deprecatedNames
    ) {
        this.fieldParsers.put(name, new FieldObjectParser<FieldType>(setter, valueParser, name, deprecatedNames));
    }

    //----- Primitive types

    public void add(ObjIntConsumer<ObjectType> setter, String name, String... deprecatedNames) {
        // FIXME (perf): add specialized parser to avoid intermediate boxing
        add(setter::accept, integerParser(), name, deprecatedNames);
    }

// Experiment: avoid boxing, allow multiple primitive parsers (e.g. int as number & string)
//    public void add(
//        ObjIntConsumer<Value> setter,
//        JsonpIntParser vp,
//        String name, String... deprecatedNames
//    ) {
//        this.fieldParsers.put(name, new FieldParser(name, deprecatedNames) {
//            @Override
//            public void parse(JsonParser parser, Params params, String fieldName, Value object) {
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
