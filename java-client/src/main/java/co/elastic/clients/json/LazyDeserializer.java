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

import java.util.function.Supplier;

/**
 * A deserializer that delegates to another deserializer that is lazily created. This is needed to initialize deserializers as
 * static fields. As some classes have cyclic dependencies, creating dependent deserializers lazily avoids cyclic dependencies
 * between static class initialization code, which can lead to unwanted things like NPEs or stack overflows.
 *
 * @see JsonpDeserializable
 * @see <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.4">Initialization of Classes and Interfaces</a>
 */
public class LazyDeserializer<T> extends DelegatingDeserializer.SameType<T> {

    private final Supplier<JsonpDeserializer<T>> ctor;
    private volatile JsonpDeserializer<T> deserializer = null;

    public LazyDeserializer(Supplier<JsonpDeserializer<T>> ctor) {
        this.ctor = ctor;
    }

    protected JsonpDeserializer<T> unwrap() {
        // See SEI CERT LCK10-J https://wiki.sei.cmu.edu/confluence/x/6zdGBQ
        JsonpDeserializer<T> d = deserializer;
        if (d != null) {
            return d;
        } else {
            synchronized (this) {
                if (deserializer == null) {
                    deserializer = ctor.get();
                }
            }
            return deserializer;
        }
    }
}
