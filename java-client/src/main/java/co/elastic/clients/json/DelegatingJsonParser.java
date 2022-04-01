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

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonLocation;
import jakarta.json.stream.JsonParser;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Stream;

public abstract class DelegatingJsonParser implements JsonParser {

    private final JsonParser parser;

    public DelegatingJsonParser(JsonParser parser) {
        this.parser = parser;
    }

    @Override
    public boolean hasNext() {
        return parser.hasNext();
    }

    @Override
    public Event next() {
        return parser.next();
    }

    @Override
    public String getString() {
        return parser.getString();
    }

    @Override
    public boolean isIntegralNumber() {
        return parser.isIntegralNumber();
    }

    @Override
    public int getInt() {
        return parser.getInt();
    }

    @Override
    public long getLong() {
        return parser.getLong();
    }

    @Override
    public BigDecimal getBigDecimal() {
        return parser.getBigDecimal();
    }

    @Override
    public JsonLocation getLocation() {
        return parser.getLocation();
    }

    @Override
    public JsonObject getObject() {
        return parser.getObject();
    }

    @Override
    public JsonValue getValue() {
        return parser.getValue();
    }

    @Override
    public JsonArray getArray() {
        return parser.getArray();
    }

    @Override
    public Stream<JsonValue> getArrayStream() {
        return parser.getArrayStream();
    }

    @Override
    public Stream<Map.Entry<String, JsonValue>> getObjectStream() {
        return parser.getObjectStream();
    }

    @Override
    public Stream<JsonValue> getValueStream() {
        return parser.getValueStream();
    }

    @Override
    public void skipArray() {
        parser.skipArray();
    }

    @Override
    public void skipObject() {
        parser.skipObject();
    }

    @Override
    public void close() {
        parser.close();
    }
}
