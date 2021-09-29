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

package co.elastic.clients.elasticsearch.experiments.containers;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import javax.annotation.Nullable;

@JsonpDeserializable
public class UVariantA implements SomeUnionVariant, JsonpSerializable {

    private final String name;

    @Override
    public String _variantType() {
        return "variant_a";
    }

    @Nullable
    public String name() {
        return this.name;
    }

    public UVariantA(UVariantA.Builder builder) {
        this.name = builder.name;
    }

    @Override
    public void serialize(JsonGenerator builder, JsonpMapper mapper) {
        builder.writeStartObject();
        // Write variant value
        builder.write("type", _variantType());
        if (this.name != null) builder.write("name", this.name);
        builder.writeEnd();
    }

    public static class Builder implements ObjectBuilder<UVariantA> {
        private String name;

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public UVariantA build() {
            return new UVariantA(this);
        }
    }

    public static final JsonpDeserializer<UVariantA> _DESERIALIZER;

    static {
        ObjectDeserializer<UVariantA.Builder> op = new ObjectDeserializer<>(UVariantA.Builder::new);
        op.add(UVariantA.Builder::name, JsonpDeserializer.stringDeserializer(), "name");
        op.ignore("type");
        _DESERIALIZER = new ObjectBuilderDeserializer<>(op);
    }
}
