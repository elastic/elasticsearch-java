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

package co.elastic.clients.base;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ToJsonp;

import javax.annotation.Nullable;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AdditionalProperties<TKey, TValue> implements ToJsonp {
    private final Map<String, TValue> value;

    @Nullable
    private final JsonpSerializer<TKey> tKeySerializer;

    @Nullable
    private final JsonpSerializer<TValue> tValueSerializer;

    // ---------------------------------------------------------------------------------------------

    protected AdditionalProperties(AbstractBuilder<TKey, TValue, ?> builder) {

        this.value = builder.value;
        this.tKeySerializer = builder.tKeySerializer;
        this.tValueSerializer = builder.tValueSerializer;

    }

    /**
     * Returns the map of additional properties.
     */
    public Map<String, TValue> value() {
        return this.value != null ? value : Collections.emptyMap();
    }

    /**
     * Serialize this value to JSON.
     */
    public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        this.toJsonpInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
        for (Map.Entry<String, TValue> item0 : this.value.entrySet()) {
            generator.writeKey(item0.getKey());
            JsonpUtils.serialize(item0.getValue(), generator, tValueSerializer, mapper);
        }
    }

    protected abstract static class AbstractBuilder<TKey, TValue, BuilderT extends AbstractBuilder<TKey, TValue, BuilderT>> {
        private Map<String, TValue> value;

        @Nullable
        private JsonpSerializer<TKey> tKeySerializer;

        @Nullable
        private JsonpSerializer<TValue> tValueSerializer;

        /**
         * Response value.
         *
         * API name: {@code value}
         */
        public BuilderT value(Map<String, TValue> value) {
            this.value = value;
            return self();
        }

        /**
         * Add a key/value to {@link #value(Map)}, creating the map if needed.
         */
        public BuilderT putValue(String key, TValue value) {
            if (this.value == null) {
                this.value = new HashMap<>();
            }
            this.value.put(key, value);
            return self();
        }

        /**
         * Serializer for TKey. If not set, an attempt will be made to find a serializer
         * from the JSON context.
         *
         */
        public BuilderT tKeySerializer(@Nullable JsonpSerializer<TKey> value) {
            this.tKeySerializer = value;
            return self();
        }

        /**
         * Serializer for TValue. If not set, an attempt will be made to find a
         * serializer from the JSON context.
         *
         */
        public BuilderT tValueSerializer(@Nullable JsonpSerializer<TValue> value) {
            this.tValueSerializer = value;
            return self();
        }

        protected abstract BuilderT self();

    }

    // ---------------------------------------------------------------------------------------------
    protected static <TKey, TValue, BuilderT extends AbstractBuilder<TKey, TValue, BuilderT>> void setupAdditionalPropertiesDeserializer(
        DelegatingDeserializer<BuilderT> op, JsonpDeserializer<TKey> tKeyParser,
        JsonpDeserializer<TValue> tValueParser) {

        @SuppressWarnings("unckecked")
        ObjectDeserializer<BuilderT> op1 = (ObjectDeserializer<BuilderT>)op;
        op1.setUnknownFieldHandler((builder, name, parser, params) -> {
            builder.putValue(name, tValueParser.deserialize(parser, params));
        });
    }
}
