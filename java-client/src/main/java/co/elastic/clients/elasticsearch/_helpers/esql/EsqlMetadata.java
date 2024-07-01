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

package co.elastic.clients.elasticsearch._helpers.esql;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;

import java.util.List;

public class EsqlMetadata {

    @JsonpDeserializable
    public static class EsqlColumn {
        private String name;
        private String type;

        public String name() {
            return name;
        }

        public String type() {
            return type;
        }

        public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EsqlColumn> {
            EsqlColumn object = new EsqlColumn();

            public Builder name(String value) {
                object.name = value;
                return this;
            }

            public Builder type(String value) {
                object.type = value;
                return this;
            }

            @Override
            public EsqlColumn build() {
                _checkSingleUse();
                return object;
            }
        }

        public static final JsonpDeserializer<EsqlColumn> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
            EsqlColumn.Builder::new, EsqlColumn::setupEsqlColumnDeserializer
        );

        protected static void setupEsqlColumnDeserializer(ObjectDeserializer<EsqlColumn.Builder> op) {
            op.add(EsqlColumn.Builder::name, JsonpDeserializer.stringDeserializer(), "name");
            op.add(EsqlColumn.Builder::type, JsonpDeserializer.stringDeserializer(), "type");
        }
    }

    public List<EsqlColumn> columns;
}
