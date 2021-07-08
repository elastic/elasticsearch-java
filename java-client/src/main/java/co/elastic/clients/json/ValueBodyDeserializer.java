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

import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;
import java.util.EnumSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * Deserializer for bodies of type `ValueOf`. It is modelled after {@link ObjectDeserializer} (with an
 * {@code add} method) to fit into the same code generation structure with no additional runtime cost.
 */
public class ValueBodyDeserializer<ObjectType> extends DelegatingDeserializer<ObjectType> {

    private static final EnumSet<Event> allStartEvents = EnumSet.of(
        Event.START_OBJECT,
        Event.START_ARRAY,
        Event.VALUE_STRING,
        Event.VALUE_NUMBER,
        Event.VALUE_TRUE,
        Event.VALUE_FALSE,
        Event.VALUE_NULL
    );

    private final Supplier<ObjectType> constructor;
    private BiConsumer<ObjectType, Object> setter;
    private JsonpDeserializer<?> valueDeserializer;

    public ValueBodyDeserializer(Supplier<ObjectType> constructor) {
        super(allStartEvents);
        this.constructor = constructor;
    }

    @Override
    public ObjectType deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
        ObjectType object = constructor.get();
        Object value = valueDeserializer.deserialize(parser, mapper, event);
        setter.accept(object, value);
        return object;
    }

    @Override
    public <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> valueParser,
        String name, String... deprecatedNames
    ) {
        @SuppressWarnings("unchecked")
        BiConsumer<ObjectType, Object> tempSetter = (BiConsumer<ObjectType, Object>) setter;
        this.setter = tempSetter;
        this.valueDeserializer = valueParser;
    }
}
