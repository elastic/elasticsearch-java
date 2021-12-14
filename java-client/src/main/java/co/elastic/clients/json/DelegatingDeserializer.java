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

import java.util.EnumSet;

public abstract class DelegatingDeserializer<T, U> implements JsonpDeserializer<T> {

    protected abstract JsonpDeserializer<U> unwrap();

    @Override
    public EnumSet<JsonParser.Event> nativeEvents() {
        return unwrap().nativeEvents();
    }

    @Override
    public EnumSet<JsonParser.Event> acceptedEvents() {
        return unwrap().acceptedEvents();
    }

    public abstract static class SameType<T> extends DelegatingDeserializer<T, T> {
        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper) {
            return unwrap().deserialize(parser, mapper);
        }

        @Override
        public T deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            return unwrap().deserialize(parser, mapper, event);
        }
    }

    /**
     * Unwraps a deserializer. The object type of the result may be different from that of {@code deserializer}
     * and unwrapping can happen several times, until the result is no more a {@code DelegatingDeserializer}.
     */
    public static JsonpDeserializer<?> unwrap(JsonpDeserializer<?> deserializer) {
        while (deserializer instanceof co.elastic.clients.json.DelegatingDeserializer) {
            deserializer = ((co.elastic.clients.json.DelegatingDeserializer<?,?>) deserializer).unwrap();
        }
        return deserializer;
    }
}
