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

import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpSerializationContext;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;

import jakarta.json.stream.JsonGenerator;

public class TermsQuery implements ToJsonp {

    private final String field;
    private final String term;

    public TermsQuery(TermsQuery.Builder builder) {
        this.field = builder.field;
        this.term = builder.term;
    }

    public String field() {
        return this.field;
    }

    public String term() {
        return this.term;
    }

    @Override
    public void toJsonp(JsonGenerator builder, JsonpSerializationContext params) {
        // We only serialize our content. It's the enclosing class responsibility to output the variant's discriminant.
        // This allows using this class in non-variant contexts.
        builder.writeStartObject();
        if (this.field != null) {
            builder.write("field", this.field);
        }

        if (this.term != null) {
            builder.write("term", this.term);
        }

        builder.writeEnd();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements ObjectBuilder<TermsQuery> {

        private String field;
        private String term;

        public Builder field(String v) {
            this.field = v;
            return this;
        }

        public Builder term(String v) {
            this.term = v;
            return this;
        }

        @Override
        public TermsQuery build() {
            return new TermsQuery(this);
        }
    }

    private static final JsonpValueParser<TermsQuery> PARSER;

    public static JsonpValueParser<TermsQuery> parser() {
        return PARSER;
    }

    static {
        JsonpObjectParser<Builder> op = new JsonpObjectParser<>(Builder::new);
        op.add(Builder::field, JsonpValueParser.stringParser(), "field");
        op.add(Builder::term, JsonpValueParser.stringParser(), "term");

        PARSER = new JsonpObjectBuilderParser<>(op);
    }
}
