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

package co.elastic.clients.elasticsearch.experiments.containers.container_members;

import co.elastic.clients.elasticsearch.experiments.containers.SomeContainer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

public class VariantB implements SomeContainer {

    // Each variant pulls container properties
    private final String containerProp;

    // and has its own properties
    private final String variantBProp;

    public VariantB(Builder builder) {
        this.containerProp = builder.$parent.containerProp;
        this.variantBProp = builder.variantBProp;
    }

    @Override
    public String containerProp() {
        return containerProp;
    }

    public String variantBProp() {
        return variantBProp;
    }

    /**
     * The `SomeContainer` variant name of this class.
     * @see SomeContainer
     */
    @Override
    public String someContainerType() {
        return SomeContainer.VARIANT_B;
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
        generator.write("variant_b_prop", this.variantBProp);
        generator.writeEnd();

        generator.writeEnd();
    }

    public static class Builder implements ObjectBuilder<VariantB> {

        private final $Helper $parent;

        private String variantBProp;

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

        public Builder variantBProp(String value) {
            this.variantBProp = value;
            return this;
        }

        @Override
        public VariantB build() {
            return new VariantB(this);
        }
    }

    public static ObjectDeserializer<VariantB.Builder> $builderDeserializer() {
        ObjectDeserializer<VariantB.Builder> od = new ObjectDeserializer<>(null);
        od.add(VariantB.Builder::variantBProp, JsonpDeserializer.stringDeserializer(), "variant_b_prop");
        return od;
    }
}

