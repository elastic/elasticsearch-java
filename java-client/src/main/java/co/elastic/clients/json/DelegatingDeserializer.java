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
import java.util.function.BiConsumer;

public abstract class DelegatingDeserializer<ObjectType> extends JsonpDeserializer<ObjectType> {
    public DelegatingDeserializer(EnumSet<JsonParser.Event> acceptedEvents) {
        super(acceptedEvents);
    }

    public abstract <FieldType> void add(
        BiConsumer<ObjectType, FieldType> setter,
        JsonpDeserializer<FieldType> valueParser,
        String name, String... deprecatedNames
    );

    /**
     * Used for SingleKeyDictionary properties where the JSON representation is a property name and a nested object.
     * This structure is flattened in the corresponding Java classes, and this method should be used to register
     * its setter.
     *
     * @param keySetter the key setter
     */
    public abstract void setKey(
        BiConsumer<ObjectType, String> keySetter
    );

    /**
     * Used for internally tagged variants containers to indicate the object's property that defines the variant type
     * @param name
     */
    public abstract void setTypeProperty(String name);

    /**
     * Used for internally tagged variants items to ignore their variant type property.
     * @param name
     */
    public void ignore(String name) {
        throw new UnsupportedOperationException();
    }
}
