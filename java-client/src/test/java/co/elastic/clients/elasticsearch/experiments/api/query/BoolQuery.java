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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.Union2;

import javax.annotation.Nullable;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class BoolQuery implements ToJsonp {

    private final Collection<Query> should;
    private final Collection<Query> must;
    private final Union2<Integer, String> minimumShouldMatch;

    public BoolQuery(BoolQuery.Builder builder) {
        this.should = builder.should;
        this.must = builder.must;
        this.minimumShouldMatch = builder.minimumShouldMatch;
    }

    @Override
    public void toJsonp(JsonGenerator builder, JsonpMapper mapper) {
        builder.writeStartObject();

        if (should != null) {
            builder.writeKey("should");
            builder.writeStartArray();
            for (Query v: should) v.toJsonp(builder, mapper);
            builder.writeEnd();
        }

        if (should != null) {
            builder.writeKey("must");
            builder.writeStartArray();
            for (Query v: must) v.toJsonp(builder, mapper);
            builder.writeEnd();
        }

        if (minimumShouldMatch != null) {
            builder.writeKey("minimum_should_match");
            // Unions have to be expanded inline as serialization depends on the value type.
            this.minimumShouldMatch.toJsonp(builder, mapper,
                (v, b, p) -> builder.write(v),
                (v, b, p) -> builder.write(v)
            );
        }

        builder.writeEnd();
    }

    public static class Builder implements ObjectBuilder<BoolQuery> {

        private Collection<Query> should;
        private Collection<Query> must;
        private Union2<Integer, String> minimumShouldMatch;

        public BoolQuery.Builder should(Collection<Query> v) {
            this.should = v;
            return this;
        }

        public BoolQuery.Builder add_should(@Nullable Query v) {
            if (v == null) return this;
            if (this.should == null) this.should = new ArrayList<>();
            this.should.add(v);
            return this;
        }

        public BoolQuery.Builder add_should(Function<Query.Builder, ObjectBuilder<Query>> v) {
            return add_should(v.apply(new Query.Builder()).build());
        }

        public BoolQuery.Builder must(Collection<Query> v) {
            this.must = v;
            return this;
        }

        public BoolQuery.Builder add_must(@Nullable Query v) {
            if (v == null) return this;
            if (this.must == null) this.must = new ArrayList<>();
            this.must.add(v);
            return this;
        }

        public BoolQuery.Builder add_must(Function<Query.Builder, ObjectBuilder<Query>> v) {
            return add_must(v.apply(new Query.Builder()).build());
        }

        // Expand all union members
        // TODO: check unions with nested structures and fluent builders
        public BoolQuery.Builder minimumShouldMatch(int v) {
            return minimumShouldMatch(Union2.ofA(v));
        }

        public BoolQuery.Builder minimumShouldMatch(String v) {
            return minimumShouldMatch(Union2.ofB(v));
        }

        public BoolQuery.Builder minimumShouldMatch(Union2<Integer, String> v) {
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

        op.add(Builder::must, JsonpDeserializer.arrayDeserializer(Query.parser()), "must");
        op.add(Builder::should, JsonpDeserializer.arrayDeserializer(Query.parser()), "should");

        op.add(Builder::minimumShouldMatch, new Union2.JsonpParser<>(
            JsonpDeserializer.integerDeserializer(),
            JsonpDeserializer.stringDeserializer()
        ), "minimum_should_match");

        PARSER = new ObjectBuilderDeserializer<>(op);
    }

}
