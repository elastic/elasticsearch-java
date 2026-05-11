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

package co.elastic.clients.elasticsearch._helpers.esql.jdbc;

import co.elastic.clients.elasticsearch._helpers.esql.EsqlAdapterBase;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlMetadata;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.UnexpectedJsonEventException;
import jakarta.json.stream.JsonParser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class JsonpCursor implements Cursor {

    private final JsonParser parser;
    private final JsonpMapper mapper;
    private final List<JdbcColumnInfo> columns;
    private List<Object> record = new ArrayList<>();

    JsonpCursor(EsqlMetadata metadata, JsonParser parser, JsonpMapper mapper) {
        this.parser = parser;
        this.mapper = mapper;

        this.columns = metadata.columns.stream()
            .map(col -> {
                try {
                    return new JdbcColumnInfo(col.name(), col.type());
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toList());
    }

    @Override
    public List<JdbcColumnInfo> columns() {
        return columns;
    }

    @Override
    public boolean next() throws SQLException {
        if (record == null) {
            // We're done
            return false;
        }

        JsonParser.Event event = parser.next();
        if (event != JsonParser.Event.START_ARRAY) {
            // End of values
            record = null;
            JsonpUtils.expectEvent(parser, JsonParser.Event.END_ARRAY, event);
            EsqlAdapterBase.readFooter(parser);
            return false;
        }

        record.clear();
        while ((event = parser.next()) != JsonParser.Event.END_ARRAY) {
            record.add(readValue(parser, event));
        }

        return true;
    }

    private Object readValue(JsonParser parser, JsonParser.Event event) {
        switch (event) {
            case VALUE_STRING:
                return parser.getString();
            case VALUE_NUMBER:
                return parser.isIntegralNumber() ? parser.getLong() : parser.getBigDecimal().doubleValue();
            case VALUE_FALSE:
                return Boolean.FALSE;
            case VALUE_TRUE:
                return Boolean.TRUE;
            case VALUE_NULL:
                return null;
            case START_OBJECT: {
                Map<String, Object> map = new HashMap<>();
                while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
                    String key = JsonpUtils.expectKeyName(parser, event);
                    map.put(key, readValue(parser, parser.next()));
                }
                return map;
            }
            case START_ARRAY: {
                List<Object> list = new ArrayList<>();
                while ((event = parser.next()) != JsonParser.Event.END_ARRAY) {
                    list.add(readValue(parser, event));
                }
                return list;
            }
            default:
                throw new UnexpectedJsonEventException(parser, event);
        }
    }

    @Override
    public Object column(int column) {
        return record.get(column);
    }

    @Override
    public int batchSize() {
        return 0;
    }

    @Override
    public void close() throws SQLException {
        // Consume the JSON stream
        while (next()) {
            // Nothing
        }
    }

    @Override
    public List<String> warnings() {
        return Collections.emptyList();
    }

    @Override
    public void clearWarnings() {
    }
}
