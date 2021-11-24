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
/*
  // @variants internal tag='type'
  interface SomeUnion = UnionItemA | UnionItemB;

  interface VariantA {
    type: 'variant_a'
    variant_a_prop: String
  }

  interface VariantB {
    type: 'variant_b'
    variant_b_prop: String
  }
*/

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;

@JsonpDeserializable
public class SomeUnion implements TaggedUnion<SomeUnion.Kind, SomeUnionVariant>, JsonpSerializable {

    public enum Kind implements JsonEnum {
        VariantA("variant_a"),
        VariantB("variant_b");

        private final String jsonValue;

        Kind(String jsonValue) {
            this.jsonValue = jsonValue;
        }

        @Override
        public String jsonValue() {
            return null;
        }
    }

    private final SomeUnionVariant _value;
    private final Kind _type;

    public SomeUnion(Builder builder) {
        this._value = builder._value;
        this._type = builder._type;
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        // Delegate to the variant object
        if (_value instanceof JsonpSerializable) {
            ((JsonpSerializable)_value).serialize(generator, mapper);
        }
    }

    @Override
    public Kind _kind() {
        return _type;
    }

    @Override
    public SomeUnionVariant _get() {
        return _value;
    }

    public UVariantA variantA() {
        return TaggedUnionUtils.get(this, Kind.VariantA);
    }

    public UVariantB variantB() {
        return TaggedUnionUtils.get(this, Kind.VariantB);
    }

    static class Builder {

        private SomeUnionVariant _value;
        private Kind _type;

        // This "builder" doesn't allow building objects. It only contains methods to set a variant.
        // These methods return a builder class with no other methods. This enforces the choice of one and only one
        // variant at the type level (i.e. at compile time).

        // variant_a

        public ObjectBuilder<SomeUnion> variantA(UVariantA value) {
            this._value = value;
            this._type = Kind.VariantA;
            final SomeUnion result = build();
            return () -> result;
        }

        public ObjectBuilder<SomeUnion> variantA(Function<UVariantA.Builder, UVariantA.Builder> fn) {
            return this.variantA(fn.apply(new UVariantA.Builder()).build());
        }

        // variant_b

        public ObjectBuilder<SomeUnion> variantB(UVariantB value) {
            this._value = value;
            this._type = Kind.VariantB;
            final SomeUnion result = build();
            return () -> result;
        }

        public ObjectBuilder<SomeUnion> variantB(Function<UVariantB.Builder, UVariantB.Builder> fn) {
            return this.variantB(fn.apply(new UVariantB.Builder()).build());
        }

        protected SomeUnion build() {
            return new SomeUnion(this);
        }
    }

    public static final JsonpDeserializer<SomeUnion> _DESERIALIZER = ObjectBuilderDeserializer.lazy(SomeUnion.Builder::new,
        SomeUnion::setupSomeUnionDeserializer, SomeUnion.Builder::build);

    protected static void setupSomeUnionDeserializer(ObjectDeserializer<Builder> op) {
        op.add(SomeUnion.Builder::variantA, UVariantA._DESERIALIZER, "variant_a");
        op.add(SomeUnion.Builder::variantB, UVariantB._DESERIALIZER, "variant_b");

        op.setTypeProperty("type", null);
    }
}
