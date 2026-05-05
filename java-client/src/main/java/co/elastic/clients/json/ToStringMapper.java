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

import jakarta.json.stream.JsonGenerator;

class ToStringMapper extends SimpleJsonpMapper {

    static final ToStringMapper INSTANCE = new ToStringMapper();

    private static final JsonpSerializer<?> toStringSerializer = new JsonpSerializer<Object>() {
        @Override
        public void serialize(Object value, JsonGenerator generator, JsonpMapper mapper) {
            if (value == null) {
                generator.writeNull();
            } else {
                generator.write(value.toString());
            }
        }
    };

    @Override
    @SuppressWarnings("unchecked")
    protected <T> JsonpSerializer<T> getDefaultSerializer(T value) {
        return (JsonpSerializer<T>)toStringSerializer;
    }
}
