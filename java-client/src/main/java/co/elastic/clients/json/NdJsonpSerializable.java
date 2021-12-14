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

import java.util.Iterator;

/**
 * Marks a class a being serialized as nd-json (e.g. bulk requests).
 * <p>
 * If an item returned by the iterator implements {@link NdJsonpSerializable}, it should also be output as nd-json.
 * This allows flattening nested structures (e.g. a bulk index operation and its document). However, if this object returns itself
 * as part of the iterator values, it then has to be serialized and not flattened again (which would lead to an infinite loop).
 */
public interface NdJsonpSerializable {
    Iterator<?> _serializables();
}
