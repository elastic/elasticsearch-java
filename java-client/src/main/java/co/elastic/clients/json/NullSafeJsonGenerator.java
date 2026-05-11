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
 * A {@link DelegatingJsonGenerator} that translates {@code write(...)} calls with a {@code null} reference value
 * into a {@link JsonGenerator#writeNull() writeNull} call. The {@code write(name, value)} overloads in
 * {@link DelegatingJsonGenerator} are {@code final} and split into {@code writeKey(name)} + {@code write(value)},
 * so overriding the value-only methods here is enough to also cover the name+value variants via virtual dispatch.
 *
 * <p>This is used as a safety net when {@link co.elastic.clients.util.ApiTypeHelper#DANGEROUS_disableRequiredPropertiesCheck(boolean)}
 * is active: with the workaround enabled, deserialization can leave required reference fields as {@code null},
 * and the generated {@code serializeInternal} methods would otherwise call e.g. {@code generator.write((String) null)},
 * which throws {@link NullPointerException} in JSON-P providers such as Parsson.
 *
 * <p>See <a href="https://github.com/elastic/elasticsearch-java/issues/557">#557</a>.
 */
class NullSafeJsonGenerator extends DelegatingJsonGenerator {

    NullSafeJsonGenerator(JsonGenerator delegate) {
        super(delegate);
    }

    @Override
    public JsonGenerator write(String value) {
        if (value == null) {
            generator.writeNull();
            return this;
        }
        return super.write(value);
    }

    @Override
    public JsonGenerator write(BigDecimal value) {
        if (value == null) {
            generator.writeNull();
            return this;
        }
        return super.write(value);
    }

    @Override
    public JsonGenerator write(BigInteger value) {
        if (value == null) {
            generator.writeNull();
            return this;
        }
        return super.write(value);
    }

    @Override
    public JsonGenerator write(JsonValue value) {
        if (value == null) {
            generator.writeNull();
            return this;
        }
        return super.write(value);
    }
}
