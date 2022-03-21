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

import jakarta.json.JsonException;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;

public abstract class JsonpMapperBase implements JsonpMapper {

    /** Get a serializer when none of the builtin ones are applicable */
    protected abstract <T> JsonpDeserializer<T> getDefaultDeserializer(Class<T> clazz);

    @Override
    public <T> T deserialize(JsonParser parser, Class<T> clazz) {
        JsonpDeserializer<T> deserializer = findDeserializer(clazz);
        if (deserializer != null) {
            return deserializer.deserialize(parser, this);
        }

        return getDefaultDeserializer(clazz).deserialize(parser, this);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    public static <T> JsonpDeserializer<T> findDeserializer(Class<T> clazz) {
        JsonpDeserializable annotation = clazz.getAnnotation(JsonpDeserializable.class);
        if (annotation != null) {
            try {
                Field field = clazz.getDeclaredField(annotation.field());
                return (JsonpDeserializer<T>)field.get(null);
            } catch (Exception e) {
                throw new RuntimeException("No deserializer found in '" + clazz.getName() + "." + annotation.field() + "'");
            }
        }

        if (clazz == Void.class) {
            return (JsonpDeserializer<T>)JsonpDeserializerBase.VoidDeserializer.INSTANCE;
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

    @Override
    public <T> String serializeToString(T value) {
        JsonpSerializer<T> serializer = findSerializer(value);

        if (serializer != null) {
            StringWriter writer = new StringWriter();
            JsonGenerator generator = jsonProvider().createGenerator(writer);
            serializer.serialize(value, generator, this);
            generator.close();
            return writer.toString();
        } else {
            throw new JsonException(
                    "Cannot find a serializer for type " + value.getClass().getName() +
                            ". Consider using a full-featured JsonpMapper"
            );
        }
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
