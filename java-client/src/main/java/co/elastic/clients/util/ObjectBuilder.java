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

import java.util.function.Function;

/**
 * Base interface for all object builders.
 *
 * @param <T> the type that will be built.
 */
public interface ObjectBuilder<T> {
  T build();

  /**
   * Creates an object builder that always returns the same value.
   */
  static <T> ObjectBuilder<T> constant(T value) {
    return new ObjectBuilder<T>() {
      @Override
      public T build() {
        return value;
      }
    };
  }

  /**
   * Creates an {@code ObjectBuilder} from a builder object and a build function
   */
  static <B, U> ObjectBuilder<U> of(B builder, Function<B, U> buildFn) {
    return () -> buildFn.apply(builder);
  }
}
