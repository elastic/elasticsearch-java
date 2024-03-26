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
import co.elastic.clients.json.JsonpDeserializerBase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMappingException;
import co.elastic.clients.json.JsonpUtils;
import jakarta.json.stream.JsonParser;

import java.util.EnumSet;
import java.util.function.Function;

/**
 * A key/value pair. Used to represent pairs where the name is not a string (generally an enum).
 * <p>
 * The key must have a string representation in JSON.
 */
public class Pair<K, V> {

    private final K name;
    private final V value;

    public Pair(K name, V value) {
        this.name = name;
        this.value = value;
    }

    public K key() {
        return this.name;
    }

    public V value() {
        return this.value;
    }

    public static <K, V> Pair<K, V> of(K name, V value) {
        return new Pair<>(name, value);
    }

    public static <K, V> JsonpDeserializer<Pair<K, V>> deserializer(
        Function<String, K> keyDeserializer, JsonpDeserializer<V> valueDeserializer
    ) {
        return new JsonpDeserializerBase<Pair<K, V>>(EnumSet.of(JsonParser.Event.START_OBJECT)) {
            @Override
            public Pair<K, V> deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

                JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);
                String name = parser.getString();

                try {
                    K key = keyDeserializer.apply(parser.getString());
                    V value = valueDeserializer.deserialize(parser, mapper);
                    JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);

                    return new Pair<>(key, value);
                } catch (Exception e) {
                    throw JsonpMappingException.from(e, null, name, parser);
                }
            }
        };
    }
}
