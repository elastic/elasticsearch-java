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

package co.elastic.clients.elasticsearch.experiments.api.query2;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.UnionVariant;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;

import java.util.Map;
import java.util.function.Function;

public class Query implements TaggedUnion<Query.Variant>, JsonpSerializable {

    public interface Variant extends UnionVariant, JsonpSerializable {
        default Query _toQuery() {
            return new Query(this);
        }
    }

    private static final String BOOL = "bool";
    private static final String TERMS = "terms";

    private final String _variantType;
    private final Variant _variantValue;

    @Override
    public String _type() {
        return _variantType;
    }

    @Override
    public Variant _get() {
        return _variantValue;
    }

    // A container-level property that lives besides the variant, like "meta" and "aggs" in aggregations
    private Map<String, JsonValue> meta;

    public Query(Variant value) {
        this._variantType = value._variantType();
        this._variantValue = value;
    }

    private Query(Builder builder) {
        this._variantType = builder.$tag;
        this._variantValue = builder.$variant;

        this.meta = builder.meta;
    }

    // Accessors to container properties
    public Map<String, JsonValue> meta() {
        return this.meta;
    }

    public BoolQuery bool() {
        return TaggedUnionUtils.get(this, BOOL);
    }

    public TermsQuery terms() {
        return TaggedUnionUtils.get(this, TERMS);
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        generator.writeKey(_variantType);
        if (_variantValue instanceof JsonpSerializable) {
            ((JsonpSerializable) _variantValue).serialize(generator, mapper);
        } else {
            // Other serialization
        }
        if (meta != null) {
            generator.writeStartObject("meta");
            for (Map.Entry<String, JsonValue> e: meta.entrySet()) {
                generator.write(e.getKey(), e.getValue());
            }
            generator.writeEnd();
        }
        generator.writeEnd();
    }

    public static class Builder {

        private Variant $variant;
        private String $tag;
        private Map<String, JsonValue> meta;

        // Container properties
        public Builder meta(Map<String, JsonValue> value) {
            this.meta = value;
            return this;
        }

        // Variants
        //
        // We return a container builder and not a builder. This is because a union accepts a single variant and we
        // don't want to allow choosing more than one yet we still want to be able to set container-level properties

        public ContainerBuilder bool(BoolQuery v) {
            this.$variant = v;
            this.$tag = "bool";
            return new ContainerBuilder();
        }

        // If we don't have container properties, the container builder is not necessary
        public ObjectBuilder<Query> foo() {
            return ObjectBuilder.of(this, Builder::build);
        }

        public ContainerBuilder bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> f) {
            return this.bool(f.apply(new BoolQuery.Builder()).build());
        }

        public ContainerBuilder terms(TermsQuery v) {
            this.$variant = v;
            this.$tag = "terms";
            return new ContainerBuilder();
        }

        public ContainerBuilder terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> f) {
            return this.terms(f.apply(new TermsQuery.Builder()).build());
        }

        // Protected, only called by the container
        protected Query build() {
            return new Query(this);
        }

        /**
         * A builder that only contains container-level properties. If we don't have such properties, this
         * can be replaced with an {@code ObjectBuilder<Query>}
         */
        public class ContainerBuilder implements ObjectBuilder<Query> {

            public ContainerBuilder meta(Map<String, JsonValue> value) {
                Builder.this.meta(value);
                return this;
            }

            public Query build() {
                return Builder.this.build();
            }
        }
    }

    private static volatile JsonpDeserializer<Query> PARSER;

    public static JsonpDeserializer<Query> parser() {
        if (PARSER == null) {
            ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);
            op.add(Builder::bool, BoolQuery.parser(), "bool");
            op.add(Builder::terms, TermsQuery.parser(), "terms");
            // parser for "meta" (a map)

            PARSER = new BuildFunctionDeserializer<>(op, Builder::build);
        }

        return PARSER;
    }


}
