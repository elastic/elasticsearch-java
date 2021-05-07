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

import javax.json.stream.JsonParser;
import java.util.function.Function;

/**
 * An object parser based on a builder object parser and a build function
 */
public class JsonpObjectBuildFuncParser<T, B> extends JsonpValueParser<T> {

    private final JsonpValueParser<B> builderParser;
    private final Function<B, T> build;

    public JsonpObjectBuildFuncParser(JsonpValueParser<B> builderParser, Function<B, T> build) {
        super(builderParser.acceptedEvents());
        this.builderParser = builderParser;
        this.build = build;
    }

    @Override
    public T parse(JsonParser parser, Params params, JsonParser.Event event) {
        B builder = builderParser.parse(parser, params, event);
        return build.apply(builder);
    }
}
