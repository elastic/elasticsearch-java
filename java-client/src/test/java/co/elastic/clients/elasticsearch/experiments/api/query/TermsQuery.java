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
    public void toJsonp(JsonGenerator builder, JsonpMapper mapper) {
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

    private static final JsonpDeserializer<TermsQuery> PARSER;

    public static JsonpDeserializer<TermsQuery> parser() {
        return PARSER;
    }

    static {
        ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);
        op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
        op.add(Builder::term, JsonpDeserializer.stringDeserializer(), "term");

        PARSER = new ObjectBuilderDeserializer<>(op);
    }
}
