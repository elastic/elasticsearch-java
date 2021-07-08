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

package co.elastic.clients.elasticsearch.experiments.api.query;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Map;
import java.util.function.Function;

// TODO: add a generic parameter that constrains the variant type? Allows e.g. to restrict sub aggregations
// to bucket and metric aggregations
public class Query extends TaggedUnion<Query.Tag, ToJsonp> implements ToJsonp {

    public enum Tag implements StringEnum {
        bool("bool"),
        terms("terms"),
        ;

        private final String jsonValue;

        Tag(String jsonValue) {
            this.jsonValue = jsonValue;
        }

        public String jsonValue() {
            return this.jsonValue;
        }

        public static Deserializer<Tag> PARSER =
            new Deserializer<>(Tag.values());
    }

    // A container-level property that lives besides the variant, like "meta" and "aggs" in aggregations
    private Map<String, JsonValue> meta;

    private Query(Builder builder) {
        super(builder.$tag, builder.$variant);
        this.meta = builder.meta;
    }

    // Accessors to container properties
    public Map<String, JsonValue> meta() {
        return this.meta;
    }

    // Accessors to variants
    public boolean isBool() {
        return is(Tag.bool);
    }

    public BoolQuery bool() {
        return get(Tag.bool);
    }

    public boolean isTerms() {
        return is(Tag.terms);
    }

    public TermsQuery terms() {
        return get(Tag.terms);
    }

    @Override
    public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        generator.writeKey(tag.jsonValue);
        value.toJsonp(generator, mapper);
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

        private ToJsonp $variant;
        private Tag $tag;
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
            this.$tag = Tag.bool;
            return new ContainerBuilder();
        }

        public ContainerBuilder bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> f) {
            return this.bool(f.apply(new BoolQuery.Builder()).build());
        }

        public ContainerBuilder terms(TermsQuery v) {
            this.$variant = v;
            this.$tag = Tag.terms;
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
