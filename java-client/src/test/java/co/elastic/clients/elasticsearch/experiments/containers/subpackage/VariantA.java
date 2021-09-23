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

package co.elastic.clients.elasticsearch.experiments.containers.subpackage;

import co.elastic.clients.elasticsearch.experiments.containers.SomeContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

public class VariantA implements SomeContainer {

    // Each variant pulls container properties
    private String containerProp;

    // and has its own properties
    private String variantAProp;

    public VariantA(VariantA.Builder builder) {
        this.containerProp = builder.$parent.containerProp;
        this.variantAProp = builder.variantAProp;
    }

    @Override
    public String containerProp() {
        return containerProp;
    }

    public String variantAProp() {
        return variantAProp;
    }

    /**
     * The `SomeContainer` variant name of this class.
     * @see SomeContainer
     */
    @Override
    public String someContainerType() {
        return SomeContainer.VARIANT_A;
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        // Output { "container_prop": "...", "variant_a": { "variant_prop": "..." }}
        generator.writeStartObject();

        // Container properties
        generator.write("container_prop", this.containerProp);

        // Variant properties
        // If part of several containers2, just pick one: the name has to be the same in all containers2
        generator.writeStartObject(someContainerType());
        generator.write("variant_a_prop", this.variantAProp);
        generator.writeEnd();

        generator.writeEnd();
    }

    public static class Builder implements ObjectBuilder<VariantA> {

        private final $Helper $parent;

        private String variantAProp;

        public Builder() {
            this(new $Helper());
        }

        public Builder($Helper value) {
            this.$parent = value;
        }

        public Builder containerProp(String value) {
            $parent.containerProp(value);
            return this;
        }

        public Builder variantAProp(String value) {
            this.variantAProp = value;
            return this;
        }

        @Override
        public VariantA build() {
            return new VariantA(this);
        }
    }

    public static final InstanceDeserializer<Builder, Builder> $BUILDER_DESERIALIZER =
        ObjectBuilderDeserializer.createForBuilder(
            VariantA::setupVariantADeserializer
        );

    protected static void setupVariantADeserializer(DelegatingDeserializer<VariantA.Builder> op) {
        op.add(Builder::variantAProp, JsonpDeserializer.stringDeserializer(), "variant_a_prop");
    }
}
