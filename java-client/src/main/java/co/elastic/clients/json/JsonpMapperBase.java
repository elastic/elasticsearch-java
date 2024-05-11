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

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class JsonpMapperBase implements JsonpMapper {

    /** Get a serializer when none of the builtin ones are applicable */
    protected abstract <T> JsonpDeserializer<T> getDefaultDeserializer(Type type);

    private Map<String, Object> attributes;

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <T> T attribute(String name) {
        return attributes == null ? null : (T)attributes.get(name);
    }

    /**
     * Updates attributes to a copy of the current ones with an additional key/value pair.
     *
     * Mutates the current mapper, intended to be used in implementations of {@link #withAttribute(String, Object)}
     */
    protected JsonpMapperBase addAttribute(String name, Object value) {
        if (attributes == null) {
            this.attributes = Collections.singletonMap(name, value);
        } else {
            Map<String, Object> newAttrs = new HashMap<>(attributes.size() + 1);
            newAttrs.putAll(attributes);
            newAttrs.put(name, value);
            this.attributes = newAttrs;
        }
        return this;
    }

    @Override
    public <T> T deserialize(JsonParser parser, Type type) {
        JsonpDeserializer<T> deserializer = findDeserializer(type);
        if (deserializer != null) {
            return deserializer.deserialize(parser, this);
        }

        @SuppressWarnings("unchecked")
        T result = (T)getDefaultDeserializer(type).deserialize(parser, this);
        return result;
    }

    @Nullable
    public static <T> JsonpDeserializer<T> findDeserializer(Class<T> clazz) {
        return findDeserializer((Type)clazz);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> JsonpDeserializer<T> findDeserializer(Type type) {
        if (type instanceof Class<?>) {
            Class<?> clazz = (Class<?>)type;
            JsonpDeserializable annotation = clazz.getAnnotation(JsonpDeserializable.class);
            if (annotation != null) {
                try {
                    Field field = clazz.getDeclaredField(annotation.field());
                    return (JsonpDeserializer<T>)field.get(null);
                } catch (Exception e) {
                    throw new RuntimeException("No deserializer found in '" + clazz.getName() + "." + annotation.field() + "'");
                }
            }
        }

        if (type == Void.class) {
            return (JsonpDeserializer<T>)JsonpDeserializerBase.VOID;
        }

        return null;
    }

    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> JsonpSerializer<T> findSerializer(T value) {
        Class<?> valueClass = value.getClass();
        if (JsonpSerializable.class.isAssignableFrom(valueClass)) {
            return (JsonpSerializer<T>) JsonpSerializableSerializer.INSTANCE;
        }

        if (JsonValue.class.isAssignableFrom(valueClass)) {
            return (JsonpSerializer<T>) JsonpValueSerializer.INSTANCE;
        }

        return null;
    }

    protected static class JsonpSerializableSerializer<T extends JsonpSerializable> implements JsonpSerializer<T> {
        @Override
        public void serialize(T value, JsonGenerator generator, JsonpMapper mapper) {
            value.serialize(generator, mapper);
        }

        protected static final JsonpSerializer<?> INSTANCE = new JsonpSerializableSerializer<>();

    }

    protected static class JsonpValueSerializer implements JsonpSerializer<JsonValue> {
        @Override
        public void serialize(JsonValue value, JsonGenerator generator, JsonpMapper mapper) {
            generator.write(value);
        }

        protected static final JsonpSerializer<?> INSTANCE = new JsonpValueSerializer();

    }

}
