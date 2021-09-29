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

package co.elastic.clients.util;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import jakarta.json.stream.JsonParser;

import java.util.EnumSet;
import java.util.function.Supplier;

public class NamedValue<T> {

    private final String name;
    private final T value;

    public NamedValue(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String name() {
        return this.name;
    }

    public T value() {
        return this.value;
    }

    public static <T> JsonpDeserializer<NamedValue<T>> deserializer(Supplier<JsonpDeserializer<T>> valueParserBuilder) {
        return new JsonpDeserializer<NamedValue<T>>(EnumSet.of(JsonParser.Event.START_OBJECT)) {
            @Override
            public NamedValue<T> deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

                JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
                String name = parser.getString();

                T value = valueParserBuilder.get().deserialize(parser, mapper);
                JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);

                return new NamedValue<>(name, value);
            }
        };
    }
}
