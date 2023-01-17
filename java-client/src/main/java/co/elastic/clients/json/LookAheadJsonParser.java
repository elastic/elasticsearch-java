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

import java.util.Map;

public interface LookAheadJsonParser extends JsonParser {

    /**
     * Look ahead the value of a text property in the JSON stream. The parser must be on the {@code START_OBJECT} event.
     *
     * @param name the field name to look up.
     * @param defaultValue default value if the field is not found.
     * @return a pair containing the field value (or {@code null} if not found), and a parser to be used to read the JSON object.
     */
    Map.Entry<String, JsonParser> lookAheadFieldValue(String name, String defaultValue);

    /**
     * In union types, find the variant to be used by looking up property names in the JSON stream until we find one that
     * uniquely identifies the variant.
     *
     * @param <Variant> the type of variant descriptors used by the caller.
     * @param variants a map of variant descriptors, keyed by the property name that uniquely identifies the variant.
     * @return a pair containing the variant descriptor (or {@code null} if not found), and a parser to be used to read the JSON object.
     */
    <Variant> Map.Entry<Variant, JsonParser> findVariant(Map<String, Variant> variants);
}
