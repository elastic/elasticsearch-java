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

import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpDeserializer;

import jakarta.json.JsonObject;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.function.BiFunction;

public class TaggedUnionParsers {

    public static <T extends Enum<T> & StringEnum, V, TU extends TaggedUnion<T, V>> JsonpDeserializer<TU> externallyTagged(
        BiFunction<T, V, TU> unionCtor,
        EnumMap<T, JsonpDeserializer<? extends V>> variantParsers,
        StringEnum.Deserializer<T> tagParser
    ) {

        return JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT), (parser, params, event) -> {
            JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);

            String tagValue = parser.getString();
            T tag = tagParser.deserialize(tagValue, parser);

            JsonpDeserializer<? extends V> variantParser = variantParsers.get(tag);
            if (variantParser == null) {
                throw new JsonParsingException("No parser for variant '" + tag.jsonValue() + "'", parser.getLocation());
            }

            V value = variantParser.deserialize(parser, params);
            JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);

            return unionCtor.apply(tag, value);
        });
    }

    public static <T extends Enum<T> & StringEnum, V, TU extends TaggedUnion<T, V>> JsonpDeserializer<TU> internallyTagged(
        String tagField,
        BiFunction<T, V, TU> unionCtor,
        EnumMap<T, JsonpDeserializer<? extends V>> variantParsers,
        StringEnum.Deserializer<T> tagParser
    ) {

        return JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT), (parser, params, event) -> {

            // FIXME (perf): buffer events until we see the tag property instead of materializing the json tree
            JsonObject object = parser.getObject();

            String tagValue = object.getString(tagField);
            T tag = tagParser.deserialize(tagValue, parser);

            JsonpDeserializer<? extends V> variantParser = variantParsers.get(tag);
            if (variantParser == null) {
                throw new JsonParsingException("No parser for variant '" + tag.jsonValue() + "'", parser.getLocation());
            }

            JsonParser objectParser = params.jsonpProvider().createParserFactory(null).createParser(object);
            V value = variantParser.deserialize(objectParser, params);

            return unionCtor.apply(tag, value);
        });
    }

    /**
     * Externally tagged representation with a key that has already been parsed. Typically used for typed_keys
     */
    public static <T extends Enum<T> & StringEnum, V, TU extends TaggedUnion<T, V>> JsonpDeserializer<TU> externallyTagged(
        BiFunction<T, V, TU> unionCtor,
        EnumMap<T, JsonpDeserializer<? extends V>> variantParsers,
        StringEnum.Deserializer<T> tagParser,
        String tagValue
    ) {
        return JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT), (parser, params, event) -> {

            T tag = tagParser.deserialize(tagValue, parser);

            JsonpDeserializer<? extends V> variantParser = variantParsers.get(tag);
            if (variantParser == null) {
                throw new JsonParsingException("No parser for variant '" + tag.jsonValue() + "'", parser.getLocation());
            }

            V value = variantParser.deserialize(parser, params);
            return unionCtor.apply(tag, value);
        });
    }
}
