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

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A {@link JsonGenerator} that delegates all calls to a wrapped generator, but translates {@code write(...)} calls
 * with a {@code null} reference value into the appropriate {@link JsonGenerator#writeNull() writeNull} call.
 *
 * <p>This is used as a safety net when {@link co.elastic.clients.util.ApiTypeHelper#DANGEROUS_disableRequiredPropertiesCheck(boolean)}
 * is active: with the workaround enabled, deserialization can leave required reference fields as {@code null},
 * and the generated {@code serializeInternal} methods would otherwise call e.g. {@code generator.write((String) null)},
 * which throws {@link NullPointerException} in JSON-P providers such as Parsson.
 *
 * <p>See <a href="https://github.com/elastic/elasticsearch-java/issues/557">#557</a>.
 */
class NullSafeJsonGenerator implements JsonGenerator {

    private final JsonGenerator delegate;

    NullSafeJsonGenerator(JsonGenerator delegate) {
        this.delegate = delegate;
    }

    //----- Methods with nullable reference values: rewrite to writeNull on null

    @Override
    public JsonGenerator write(String value) {
        if (value == null) {
            return delegate.writeNull();
        }
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(BigDecimal value) {
        if (value == null) {
            return delegate.writeNull();
        }
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(BigInteger value) {
        if (value == null) {
            return delegate.writeNull();
        }
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(JsonValue value) {
        if (value == null) {
            return delegate.writeNull();
        }
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(String name, String value) {
        if (value == null) {
            return delegate.writeNull(name);
        }
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, BigDecimal value) {
        if (value == null) {
            return delegate.writeNull(name);
        }
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, BigInteger value) {
        if (value == null) {
            return delegate.writeNull(name);
        }
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, JsonValue value) {
        if (value == null) {
            return delegate.writeNull(name);
        }
        return delegate.write(name, value);
    }

    //----- Pure delegation for everything else

    @Override
    public JsonGenerator writeStartObject() {
        return delegate.writeStartObject();
    }

    @Override
    public JsonGenerator writeStartObject(String name) {
        return delegate.writeStartObject(name);
    }

    @Override
    public JsonGenerator writeKey(String name) {
        return delegate.writeKey(name);
    }

    @Override
    public JsonGenerator writeStartArray() {
        return delegate.writeStartArray();
    }

    @Override
    public JsonGenerator writeStartArray(String name) {
        return delegate.writeStartArray(name);
    }

    @Override
    public JsonGenerator writeEnd() {
        return delegate.writeEnd();
    }

    @Override
    public JsonGenerator write(String name, int value) {
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, long value) {
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, double value) {
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator write(String name, boolean value) {
        return delegate.write(name, value);
    }

    @Override
    public JsonGenerator writeNull(String name) {
        return delegate.writeNull(name);
    }

    @Override
    public JsonGenerator write(int value) {
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(long value) {
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(double value) {
        return delegate.write(value);
    }

    @Override
    public JsonGenerator write(boolean value) {
        return delegate.write(value);
    }

    @Override
    public JsonGenerator writeNull() {
        return delegate.writeNull();
    }

    @Override
    public void close() {
        delegate.close();
    }

    @Override
    public void flush() {
        delegate.flush();
    }
}
