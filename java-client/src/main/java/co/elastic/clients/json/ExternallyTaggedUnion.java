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

import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import static jakarta.json.stream.JsonParser.Event;

/**
 * Utilities for union types whose discriminant is not directly part of the structure, either as an enclosing property name or as
 * an inner property. This is used for Elasticsearch aggregation results and suggesters, using the {@code typed_keys} parameter that
 * encodes a name+type in a single JSON property.
 *
 * @see <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-aggregations.html#return-agg-type">
 *      Documentation of the <code>typed_keys</code> parameter.</a>
 */
public interface ExternallyTaggedUnion {

    /**
     * A deserializer for externally-tagged unions. Since the union variant discriminant is provided externally, this cannot be a
     * regular {@link JsonpDeserializer} as the caller has to provide the discriminant value.
     */
    class Deserializer<Union extends TaggedUnion<?, Member>, Member> {
        private final Map<String, JsonpDeserializer<? extends Member>> deserializers;
        private final BiFunction<String, Member, Union> unionCtor;

        public Deserializer(Map<String, JsonpDeserializer<? extends Member>> deserializers, BiFunction<String, Member, Union> unionCtor) {
            this.deserializers = deserializers;
            this.unionCtor = unionCtor;
        }

        /**
         * Deserialize a union value, given its type.
         */
        public Union deserialize(String type, JsonParser parser, JsonpMapper mapper, Event event) {
            JsonpDeserializer<? extends Member> deserializer = deserializers.get(type);
            if (deserializer == null) {
                throw new JsonpMappingException("Unknown variant type '" + type + "'", parser.getLocation());
            }

            return unionCtor.apply(type, deserializer.deserialize(parser, mapper, event));
        }

        /**
         * Deserialize an externally tagged union encoded as typed keys, a JSON dictionary whose property names combine type and name
         * in a single string.
         */
        public TypedKeysDeserializer<Union> typedKeys() {
            return new TypedKeysDeserializer<>(this);
        }
    }

    class TypedKeysDeserializer<Union extends TaggedUnion<?, ?>> extends JsonpDeserializerBase<Map<String, Union>> {
        Deserializer<Union, ?> deserializer;
        protected TypedKeysDeserializer(Deserializer<Union, ?> deser) {
            super(EnumSet.of(Event.START_OBJECT));
            this.deserializer = deser;
        }

        @Override
        public Map<String, Union> deserialize(JsonParser parser, JsonpMapper mapper, Event event) {
            Map<String, Union> result = new HashMap<>();
            while ((event = parser.next()) != Event.END_OBJECT) {
                JsonpUtils.expectEvent(parser, event, Event.KEY_NAME);
                deserializeEntry(parser.getString(), parser, mapper, result);
            }
            return result;
        }

        public void deserializeEntry(String key, JsonParser parser, JsonpMapper mapper, Map<String, Union> targetMap) {
            int hashPos = key.indexOf('#');
            if (hashPos == -1) {
                throw new JsonpMappingException(
                    "Property name '" + key + "' is not in the 'type#name' format. Make sure the request has 'typed_keys' set.",
                    parser.getLocation()
                );
            }

            String type = key.substring(0, hashPos);
            String name = key.substring(hashPos + 1);

            targetMap.put(name, deserializer.deserialize(type, parser, mapper, parser.next()));
        }
    }

    static <T extends TaggedUnion<?, ?>> JsonpDeserializer<Map<String, List<T>>> arrayMapDeserializer(
        TypedKeysDeserializer<T> deserializer
    ) {
        return JsonpDeserializer.of(
            EnumSet.of(Event.START_OBJECT),
            (parser, mapper, event) -> {
                Map<String, List<T>> result = new HashMap<>();
                String key = null;
                try {
                    while ((event = parser.next()) != Event.END_OBJECT) {
                        JsonpUtils.expectEvent(parser, event, Event.KEY_NAME);
                        // Split key and type
                        key = parser.getString();
                        int hashPos = key.indexOf('#');
                        if (hashPos == -1) {
                            throw new JsonpMappingException(
                                "Property name '" + key + "' is not in the 'type#name' format. Make sure the request has 'typed_keys' set.",
                                parser.getLocation()
                            ).prepend(null, key);
                        }

                        String type = key.substring(0, hashPos);
                        String name = key.substring(hashPos + 1);

                        List<T> list = new ArrayList<>();
                        JsonpUtils.expectNextEvent(parser, Event.START_ARRAY);
                        try {
                            while ((event = parser.next()) != Event.END_ARRAY) {
                                list.add(deserializer.deserializer.deserialize(type, parser, mapper, event));
                            }
                        } catch (Exception e) {
                            throw JsonpMappingException.from(e, list.size(), parser);
                        }
                        result.put(name, list);
                    }
                } catch (Exception e) {
                    throw JsonpMappingException.from(e, null, key, parser);
                }
                return result;
            }
        );
    }

    /**
     * Serialize a map of externally tagged union objects.
     * <p>
     * If {@link JsonpMapperFeatures#SERIALIZE_TYPED_KEYS} is <code>true</code> (the default), the typed keys encoding
     * (<code>type#name</code>) is used.
     */
    static <T extends JsonpSerializable & TaggedUnion<? extends JsonEnum, ?>> void serializeTypedKeys(
        Map<String, T> map, JsonGenerator generator, JsonpMapper mapper
    ) {
        generator.writeStartObject();
        serializeTypedKeysInner(map, generator, mapper);
        generator.writeEnd();
    }

    /**
     * Serialize a map of externally tagged union object arrays.
     * <p>
     * If {@link JsonpMapperFeatures#SERIALIZE_TYPED_KEYS} is <code>true</code> (the default), the typed keys encoding
     * (<code>type#name</code>) is used.
     */
    static <T extends JsonpSerializable & TaggedUnion<? extends JsonEnum, ?>> void serializeTypedKeysArray(
        Map<String, List<T>> map, JsonGenerator generator, JsonpMapper mapper
    ) {
        generator.writeStartObject();

        if (mapper.attribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, true)) {
            for (Map.Entry<String, List<T>> entry: map.entrySet()) {
                List<T> list = entry.getValue();
                if (list.isEmpty()) {
                    continue; // We can't know the kind, skip this entry
                }

                generator.writeKey(list.get(0)._kind().jsonValue() + "#" + entry.getKey());
                generator.writeStartArray();
                for (T value: list) {
                    value.serialize(generator, mapper);
                }
                generator.writeEnd();
            }
        } else {
            for (Map.Entry<String, List<T>> entry: map.entrySet()) {
                generator.writeKey(entry.getKey());
                generator.writeStartArray();
                for (T value: entry.getValue()) {
                    value.serialize(generator, mapper);
                }
                generator.writeEnd();
            }
        }

        generator.writeEnd();
    }

    /**
     * Serialize a map of externally tagged union objects, without the enclosing start/end object.
     * <p>
     * If {@link JsonpMapperFeatures#SERIALIZE_TYPED_KEYS} is <code>true</code> (the default), the typed keys encoding
     * (<code>type#name</code>) is used.
     */
    static <T extends JsonpSerializable & TaggedUnion<? extends JsonEnum, ?>> void serializeTypedKeysInner(
        Map<String, T> map, JsonGenerator generator, JsonpMapper mapper
    ) {
        if (mapper.attribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, true)) {
            for (Map.Entry<String, T> entry: map.entrySet()) {
                T value = entry.getValue();
                generator.writeKey(value._kind().jsonValue() + "#" + entry.getKey());
                value.serialize(generator, mapper);
            }
        } else {
            for (Map.Entry<String, T> entry: map.entrySet()) {
                generator.writeKey(entry.getKey());
                entry.getValue().serialize(generator, mapper);
            }
        }
    }
}
