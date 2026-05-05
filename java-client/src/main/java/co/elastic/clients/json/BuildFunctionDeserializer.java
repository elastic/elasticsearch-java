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

package co.elastic.clients.json;

import jakarta.json.stream.JsonParser;

import java.util.function.Function;

/**
 * An object deserializer based on a builder object deserializer and a build function.
 * Used in tagged unions that have union-level properties (aka "container properties").
 */
public class BuildFunctionDeserializer<B, T> extends DelegatingDeserializer<T, B> {

    private final JsonpDeserializer<B> builderDeserializer;
    private final Function<B, T> build;

    public BuildFunctionDeserializer(JsonpDeserializer<B> builderDeserializer, Function<B, T> build) {
        this.builderDeserializer = builderDeserializer;
        this.build = build;
    }

    @Override
    protected JsonpDeserializer<B> unwrap() {
        return builderDeserializer;
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper) {
        B builder = builderDeserializer.deserialize(parser, mapper);
        return builder == null ? null : build.apply(builder);
    }

    @Override
    public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
        B builder = builderDeserializer.deserialize(parser, mapper, event);
        return builder == null ? null : build.apply(builder);
    }
}
