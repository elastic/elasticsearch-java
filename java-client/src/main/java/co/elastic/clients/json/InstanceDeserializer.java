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

import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.QuadFunction;
import jakarta.json.stream.JsonParser;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A deserializer that populates an existing class instance.
 * <p>
 * The instance and result types may be different to handle cases like variant builders where the instance isn't
 * a builder until we have selected a variant.
 */
public interface InstanceDeserializer<InstanceType, ResultType> {

    ResultType deserialize(InstanceType instance, JsonParser parser, JsonpMapper mapper, JsonParser.Event event);

    static <I, R> InstanceDeserializer<I, R> of(QuadFunction<I, JsonParser, JsonpMapper, JsonParser.Event, R> fn) {
        return new InstanceDeserializer<I, R>() {
            @Override
            public R deserialize(I instance, JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
                return fn.apply(instance, parser, mapper, event);
            }
        };
    }

    static <B, T> InstanceDeserializer<B, ObjectBuilder<T>> lazy(
        Supplier<B> builderCtor,
        Consumer<DelegatingDeserializer<B>> builderSetup,
        Function<B, T> buildFn
    ) {
        return new LazyInstanceDeserializer<B, ObjectBuilder<T>>(() -> {
            ObjectDeserializer<B> builderDeser = new ObjectDeserializer<B>(builderCtor);
            builderSetup.accept(builderDeser);
            return new BuildFunctionInstanceDeserializer<>(builderDeser, buildFn);
        });
    }

    class LazyInstanceDeserializer<B, T> implements InstanceDeserializer<B, T> {
        private final Supplier<InstanceDeserializer<B, T>> ctor;
        private volatile InstanceDeserializer<B, T> deserializer = null;

        LazyInstanceDeserializer(Supplier<InstanceDeserializer<B, T>> ctor) {
            this.ctor = ctor;
        }

        @Override
        public T deserialize(B instance, JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            // See SEI CERT LCK10-J https://wiki.sei.cmu.edu/confluence/x/6zdGBQ
            InstanceDeserializer<B, T> d = deserializer;
            if (d == null) {
                synchronized (this) {
                    if (deserializer == null) {
                        d = ctor.get();
                        deserializer = d;
                    }
                }
            }

            return d.deserialize(instance, parser, mapper, event);
        }
    }
}
