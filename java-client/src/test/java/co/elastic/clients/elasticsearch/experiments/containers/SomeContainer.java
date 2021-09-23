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

import co.elastic.clients.elasticsearch.experiments.containers.subpackage.VariantA;
import co.elastic.clients.elasticsearch.experiments.containers.subpackage.VariantB;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;

import java.util.EnumSet;
import java.util.function.Function;

/*
  // @variants container
  interface SomeContainer {
    // @variant container_property
    container_prop: String

    variant_a: VariantA
    variant_b: VariantB
  }

  interface VariantA {
    variant_a_prop: String
  }

  interface VariantB {
    variant_b_prop: String
  }
*/

// Container becomes an interface with the variant's name getter and container property getters
public interface SomeContainer extends JsonpSerializable {

    // Constants for variant names. Avoids the use of magic strings, and contrarily to an enum keeps enumerations
    // open for those containers2 that can be extended using plugins.

    String VARIANT_A = "variant_a";
    String VARIANT_B = "variant_b";

    String someContainerType();

    String containerProp();

    //-----------------------------------------------------------------------------------------------------------------

    class Builder {
        // This "builder" doesn't allow building objects. It only contains methods to set a variant.
        // These methods return a builder class with no other methods. This enforces the choice of one and only one
        // variant at the type level (i.e. at compile time).

        // variant_a

        public ObjectBuilder<SomeContainer> variantA(VariantA value) {
            return ObjectBuilder.constant(value);
        }

        public ObjectBuilder<SomeContainer> variantA(Function<VariantA.Builder, VariantA.Builder> fn) {
            return this.variantA(fn.apply(new VariantA.Builder()).build());
        }

        // variant_b

        public ObjectBuilder<SomeContainer> variantB(VariantB value) {
            return ObjectBuilder.constant(value);
        }

        public ObjectBuilder<SomeContainer> variantB(Function<VariantB.Builder, VariantB.Builder> fn) {
            return this.variantB(fn.apply(new VariantB.Builder()).build());
        }
    }

    // Container properties, variant deserialization

    class $Helper {

        // Container properties

        public String containerProp;

        public void containerProp(String value) {
            this.containerProp = value;
        }

        private static SomeContainer deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

            $Helper cb = new $Helper();
            ObjectBuilder<? extends SomeContainer> builder = null;
            String variant = null;

            while((event = parser.next()) != JsonParser.Event.END_OBJECT) {
                String fieldName = JsonpUtils.expectKeyName(parser, event);
                switch (fieldName) {
                    case "container_prop": {
                        cb.containerProp(JsonpDeserializer.stringDeserializer().deserialize(parser, mapper));
                        break;
                    }
                    case "variant_a": {
                        variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
                        builder = VariantA.$BUILDER_DESERIALIZER.deserialize(new VariantA.Builder(cb), parser, mapper, parser.next());
                        break;
                    }
                    case "variant_b": {
                        variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
                        builder = VariantB.$builderDeserializer().deserialize(new VariantB.Builder(cb), parser, mapper, parser.next());
                        break;
                    }
                    default: {
                        JsonpUtils.unknownKey(parser, fieldName);
                    }
                }
            }

            return JsonpUtils.buildVariant(parser, builder);
        }
    }

    JsonpDeserializer<SomeContainer> DESERIALIZER = JsonpDeserializer.of(
        EnumSet.of(JsonParser.Event.START_OBJECT),
        $Helper::deserialize
    );
}

