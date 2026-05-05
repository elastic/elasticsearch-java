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

/**
 * Base interface for tagged union types (also known as sum types or variants).
 * <p>
 * It provides access to the current variant kind and its value.
 *
 * @param <Tag> the tag type that defines the possible variants (an enum).
 * @param <BaseType> the closest common ancestor type to all variant values.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Tagged_union">Tagged Union on Wikipedia</a>
 */
public interface TaggedUnion<Tag extends Enum<?>, BaseType> {

    /**
     * Get the of the kind of variant held by this object.
     *
     * @return the variant kind
     */
    Tag _kind();

    BaseType _get();
}
