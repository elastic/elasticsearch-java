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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMappingException;
import co.elastic.clients.json.JsonpUtils;
import jakarta.json.stream.JsonParser;

import java.util.List;

public abstract class EsqlAdapterBase<T> implements EsqlAdapter<T> {

    /**
     * Reads the header of an ES|QL response, moving the parser at the beginning of the first value row.
     * The caller can then read row arrays until finding an end array that closes the top-level array.
     */
    public static EsqlMetadata readHeader(JsonParser parser, JsonpMapper mapper) {
        EsqlMetadata result = new EsqlMetadata();

        JsonpUtils.expectNextEvent(parser, JsonParser.Event.START_OBJECT);

        parse: while (JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME) != null) {
            switch (parser.getString()) {
                case "values": {
                    // We're done parsing header information
                    break parse;
                }
                case "columns": {
                    result.columns = JsonpDeserializer
                        .arrayDeserializer(EsqlMetadata.EsqlColumn._DESERIALIZER)
                        .deserialize(parser, mapper);
                    break;
                }
                case "took": {
                    JsonpUtils.expectNextEvent(parser, JsonParser.Event.VALUE_NUMBER);
                    result.took = parser.getLong();
                    break;
                }
                default: {
                    // Ignore everything else
                    JsonpUtils.skipValue(parser);
                    break;
                }
            }
        }

        if (result.columns == null) {
            throw new JsonpMappingException("Expecting a 'columns' property before 'values'.", parser.getLocation());
        }

        // Beginning of the `values` property
        JsonpUtils.expectNextEvent(parser, JsonParser.Event.START_ARRAY);

        return result;
    }

    /**
     * Checks the footer of an ES|QL response, once the values have been read.
     */
    public static void readFooter(JsonParser parser) {
        JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);
    }

}
