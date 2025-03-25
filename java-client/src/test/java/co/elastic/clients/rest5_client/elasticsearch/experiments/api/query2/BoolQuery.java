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

package clients.rest5_client.elasticsearch.experiments.api.query2;

import co.elastic.clients.elasticsearch.experiments.api.query2.Query;
import co.elastic.clients.elasticsearch.experiments.api.query2.Union2;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class BoolQuery implements co.elastic.clients.elasticsearch.experiments.api.query2.Query.Variant, JsonpSerializable {

    private final Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> should;
    private final Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> must;
    private final co.elastic.clients.elasticsearch.experiments.api.query2.Union2<Integer, String> minimumShouldMatch;

    public BoolQuery(Builder builder) {
        this.should = builder.should;
        this.must = builder.must;
        this.minimumShouldMatch = builder.minimumShouldMatch;
    }

    @Override
    public co.elastic.clients.elasticsearch.experiments.api.query2.Query.Kind _variantType() {
        return co.elastic.clients.elasticsearch.experiments.api.query2.Query.Kind.Bool;
    }

    public Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> should() {
        return should;
    }

    public Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> must() {
        return must;
    }

    public co.elastic.clients.elasticsearch.experiments.api.query2.Union2<Integer, String> minimumShouldMatch() {
        return minimumShouldMatch;
    }

    @Override
    public void serialize(JsonGenerator builder, JsonpMapper mapper) {
        builder.writeStartObject();

        if (should != null) {
            builder.writeKey("should");
            builder.writeStartArray();
            for (co.elastic.clients.elasticsearch.experiments.api.query2.Query v: should) v.serialize(builder, mapper);
            builder.writeEnd();
        }

        if (should != null) {
            builder.writeKey("must");
            builder.writeStartArray();
            for (co.elastic.clients.elasticsearch.experiments.api.query2.Query v: must) v.serialize(builder, mapper);
            builder.writeEnd();
        }

        if (minimumShouldMatch != null) {
            builder.writeKey("minimum_should_match");
            // Unions have to be expanded inline as serialization depends on the value type.
            this.minimumShouldMatch.serialize(builder, mapper,
                (v, b, p) -> builder.write(v),
                (v, b, p) -> builder.write(v)
            );
        }

        builder.writeEnd();
    }

    public static class Builder implements ObjectBuilder<BoolQuery> {

        private Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> should;
        private Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> must;
        private co.elastic.clients.elasticsearch.experiments.api.query2.Union2<Integer, String> minimumShouldMatch;

        public Builder should(Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> v) {
            this.should = v;
            return this;
        }

        public Builder add_should(@Nullable co.elastic.clients.elasticsearch.experiments.api.query2.Query v) {
            if (v == null) return this;
            if (this.should == null) this.should = new ArrayList<>();
            this.should.add(v);
            return this;
        }

        public Builder add_should(Function<co.elastic.clients.elasticsearch.experiments.api.query2.Query.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.experiments.api.query2.Query>> v) {
            return add_should(v.apply(new co.elastic.clients.elasticsearch.experiments.api.query2.Query.Builder()).build());
        }

        public Builder must(Collection<co.elastic.clients.elasticsearch.experiments.api.query2.Query> v) {
            this.must = v;
            return this;
        }

        public Builder add_must(@Nullable co.elastic.clients.elasticsearch.experiments.api.query2.Query v) {
            if (v == null) return this;
            if (this.must == null) this.must = new ArrayList<>();
            this.must.add(v);
            return this;
        }

        public Builder add_must(Function<co.elastic.clients.elasticsearch.experiments.api.query2.Query.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.experiments.api.query2.Query>> v) {
            return add_must(v.apply(new co.elastic.clients.elasticsearch.experiments.api.query2.Query.Builder()).build());
        }

        // Expand all union members
        // TODO: check unions with nested structures and fluent builders
        public Builder minimumShouldMatch(int v) {
            return minimumShouldMatch(co.elastic.clients.elasticsearch.experiments.api.query2.Union2.ofA(v));
        }

        public Builder minimumShouldMatch(String v) {
            return minimumShouldMatch(co.elastic.clients.elasticsearch.experiments.api.query2.Union2.ofB(v));
        }

        public Builder minimumShouldMatch(co.elastic.clients.elasticsearch.experiments.api.query2.Union2<Integer, String> v) {
            this.minimumShouldMatch = v;
            return this;
        }

        @Override
        public BoolQuery build() {
            return new BoolQuery(this);
        }
    }

    private static final JsonpDeserializer<BoolQuery> PARSER;

    public static JsonpDeserializer<BoolQuery> parser() {
        return PARSER;
    }

    static {
        ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

        op.add(Builder::must, JsonpDeserializer.arrayDeserializer(co.elastic.clients.elasticsearch.experiments.api.query2.Query.parser()), "must");
        op.add(Builder::should, JsonpDeserializer.arrayDeserializer(Query.parser()), "should");

        op.add(Builder::minimumShouldMatch, new Union2.JsonpParser<>(
            JsonpDeserializer.integerDeserializer(),
            JsonpDeserializer.stringDeserializer()
        ), "minimum_should_match");

        PARSER = new ObjectBuilderDeserializer<>(op);
    }

}
