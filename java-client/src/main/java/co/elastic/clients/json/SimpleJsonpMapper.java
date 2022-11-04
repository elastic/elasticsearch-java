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
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple implementation of <code>JsonpMapper</code> that only handles classes of the Java API client.
 * <p>
 * To handle application classes serialization and deserialization, consider using <code>JacksonJsonpMapper</code> or
 * <code>JsonbJsonpMapper</code>.
 */
public class SimpleJsonpMapper extends JsonpMapperBase {

    public static SimpleJsonpMapper INSTANCE = new SimpleJsonpMapper(true);
    public static SimpleJsonpMapper INSTANCE_REJECT_UNKNOWN_FIELDS = new SimpleJsonpMapper(false);

    private static final Map<Type, JsonpSerializer<?>> serializers = new HashMap<>();
    private static final Map<Type, JsonpDeserializer<?>> deserializers = new HashMap<>();

    static {
        serializers.put(String.class, (JsonpSerializer<String>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Boolean.class, (JsonpSerializer<Boolean>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Boolean.TYPE, (JsonpSerializer<Boolean>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Integer.class, (JsonpSerializer<Integer>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Integer.TYPE, (JsonpSerializer<Integer>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Long.class, (JsonpSerializer<Long>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Long.TYPE, (JsonpSerializer<Long>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Float.class, (JsonpSerializer<Float>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Float.TYPE, (JsonpSerializer<Float>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Double.class, (JsonpSerializer<Double>) (value, generator, mapper) -> generator.write(value));
        serializers.put(Double.TYPE, (JsonpSerializer<Double>) (value, generator, mapper) -> generator.write(value));

        deserializers.put(String.class, JsonpDeserializer.stringDeserializer());
        deserializers.put(Boolean.class, JsonpDeserializer.booleanDeserializer());
        deserializers.put(Boolean.TYPE, JsonpDeserializer.booleanDeserializer());
        deserializers.put(Integer.class, JsonpDeserializer.integerDeserializer());
        deserializers.put(Integer.TYPE, JsonpDeserializer.integerDeserializer());
        deserializers.put(Long.class, JsonpDeserializer.longDeserializer());
        deserializers.put(Long.TYPE, JsonpDeserializer.longDeserializer());
        deserializers.put(Float.class, JsonpDeserializer.floatDeserializer());
        deserializers.put(Float.TYPE, JsonpDeserializer.floatDeserializer());
        deserializers.put(Double.class, JsonpDeserializer.doubleDeserializer());
        deserializers.put(Double.TYPE, JsonpDeserializer.doubleDeserializer());
    }

    private final boolean ignoreUnknownFields;

    public SimpleJsonpMapper(boolean ignoreUnknownFields) {
        this.ignoreUnknownFields = ignoreUnknownFields;
    }

    public SimpleJsonpMapper() {
        // Lenient by default
        this(true);
    }

    @Override
    public <T> JsonpMapper withAttribute(String name, T value) {
        return new SimpleJsonpMapper(this.ignoreUnknownFields).addAttribute(name, value);
    }

    @Override
    public boolean ignoreUnknownFields() {
        return ignoreUnknownFields;
    }

    @Override
    public JsonProvider jsonProvider() {
        return JsonpUtils.provider();
    }

    @Override
    public <T> void serialize(T value, JsonGenerator generator) {
        JsonpSerializer<T> serializer = findSerializer(value);

        if (serializer == null) {
            @SuppressWarnings("unchecked")
            JsonpSerializer<T> serializer_ = (JsonpSerializer<T>)serializers.get(value.getClass());
            serializer = serializer_;
        }

        if (serializer == null) {
            serializer = getDefaultSerializer(value);
        }

        if (serializer != null) {
            serializer.serialize(value, generator, this);
        } else {
            throw new JsonException(
                "Cannot find a serializer for type " + value.getClass().getName() +
                ". Consider using a full-featured JsonpMapper"
            );
        }
    }

    @Override
    protected <T> JsonpDeserializer<T> getDefaultDeserializer(Type type) {
        @SuppressWarnings("unchecked")
        JsonpDeserializer<T> deserializer = (JsonpDeserializer<T>) deserializers.get(type);
        if (deserializer != null) {
            return deserializer;
        } else {
            throw new JsonException(
                "Cannot find a deserializer for type " + type.getTypeName() +
                    ". Consider using a full-featured JsonpMapper"
            );
        }
    }

    protected <T> JsonpSerializer<T> getDefaultSerializer(T value) {
        return null;
    }
}
