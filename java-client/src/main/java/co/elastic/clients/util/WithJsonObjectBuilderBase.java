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

package co.elastic.clients.util;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.DelegatingJsonpMapper;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperBase;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.WithJson;
import jakarta.json.stream.JsonParser;

/**
 * Base class for object builders that can read themselves from JSON.
 * <p>
 * If the concrete class has generic parameters, <code>withJson()</code> will deserialize them as {@link JsonData}, unless
 * the mapper has a deserializer attribute for that generic parameter's name.
 */
public abstract class WithJsonObjectBuilderBase<B> extends ObjectBuilderBase implements WithJson<B> {

    protected abstract B self();

    @Override
    public B withJson(JsonParser parser, JsonpMapper mapper) {
        JsonpDeserializer<?> classDeser = JsonpMapperBase.findDeserializer(this.getClass().getEnclosingClass());
        if (classDeser == null) {
            throw new IllegalArgumentException("Class " + this.getClass().getEnclosingClass() + " cannot be read from JSON");
        }

        // Generic parameters are always deserialized to JsonData unless the parent mapper can provide a deserializer
        mapper = new WithJsonMapper(mapper);

        @SuppressWarnings("unchecked")
        ObjectDeserializer<B> builderDeser = (ObjectDeserializer<B>) DelegatingDeserializer.unwrap(classDeser);
        return builderDeser.deserialize(self(), parser, mapper, parser.next());
    }

    private static class WithJsonMapper extends DelegatingJsonpMapper {
        WithJsonMapper(JsonpMapper parent) {
            super(parent);
        }

        @Override
        public <T> T attribute(String name) {
            T attr = mapper.attribute(name);
            if (attr == null && name.startsWith("co.elastic.clients:Deserializer")) {
                @SuppressWarnings("unchecked")
                T result = (T)JsonData._DESERIALIZER;
                return result;
            } else {
                return attr;
            }
        }

        @Override
        public <T> JsonpMapper withAttribute(String name, T value) {
            return new WithJsonMapper(this.mapper.withAttribute(name, value));
        }
    }
}
