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
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.util.EnumSet;

/**
 * Base interface for enumerations in API types. Members have a JSON representation and also accept
 * aliases when parsed from a string value.
 */
public interface JsonEnum extends JsonpSerializable {
    String jsonValue();

    @Nullable
    default String[] aliases() {
        return null;
    }

    @Override
    default void serialize(JsonGenerator generator, JsonpMapper params) {
        generator.write(jsonValue());
    }

    // Moved to JsonEnums. Will be deprecated at some point.
    class Deserializer<T extends JsonEnum> extends JsonEnums.Deserializer<T> {
        public Deserializer(T[] values) {
            super(values);
        }

        Deserializer(T[] values, EnumSet<JsonParser.Event> acceptedEvents) {
            super(values, acceptedEvents);
        }
    }
}
