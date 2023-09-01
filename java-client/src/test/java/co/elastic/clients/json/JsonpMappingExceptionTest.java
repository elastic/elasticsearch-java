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

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class JsonpMappingExceptionTest extends ModelTestCase {

    @Test
    public void testObjectAndArrayPath() {

        String json = "{" +
            "  \"took\" : 9," +
            "  \"timed_out\" : false," +
            "  \"_shards\" : {" +
            "    \"total\" : 1," +
            "    \"successful\" : 1," +
            "    \"skipped\" : 0," +
            "    \"failed\" : 0" +
            "  }," +
            "  \"hits\" : {" +
            "    \"total\" : {" +
            "      \"value\" : 1," +
            "      \"relation\" : \"eq\"" +
            "    }," +
            "    \"max_score\" : 1.0," +
            "    \"hits\" : [" +
            "      {" +
            "        \"_index\" : \"test\"," +
            "        \"_id\" : \"8aSerXUBs1w7Wkuj31zd\"," +
            "        \"_score\" : \"1.0\"," +
            "        \"_source\" : {" +
            "          \"foo\" : \"bar\"" +
            "        }" +
            "      }," +
            "      {" +
            "        \"_index\" : \"test\"," +
            "        \"_id\" : \"8aSerXUBs1w7Wkuj31zd\"," +
            "        \"_score\" : \"abc\"," + // <====== error here
            "        \"_source\" : {" +
            "          \"foo\" : \"bar\"" +
            "        }" +
            "      }" +
            "    ]" +
            "  }" +
            "}";

        JsonpMappingException e = assertThrows(JsonpMappingException.class, () -> {
            // withJson() will read values of the generic parameter type as JsonData
            SearchResponse<JsonData> r = SearchResponse.of(b -> b
                .withJson(new StringReader(json))
            );
        });

        assertTrue(e.getMessage().contains("Error deserializing co.elastic.clients.elasticsearch.core.search.Hit"));
        assertTrue(e.getMessage().contains("java.lang.NumberFormatException"));

        // Also checks array index in path
        assertEquals("hits.hits[1]._score", e.path());
    }

    @Test
    public void testLookAhead() {

        String json =
            "{" +
            "  \"properties\": { " +
            "    \"foo-bar\": {" +
            "        \"type\": \"text\"," +
            "        \"baz\": false" +
            "    }" +
            "  }" +
            "}";

        // Error deserializing co.elastic.clients.elasticsearch._types.mapping.TextProperty:
        // Unknown field 'baz' (JSON path: properties['foo-bar'].baz) (...line no=1, column no=36, offset=35)

        JsonpMappingException e = assertThrows(JsonpMappingException.class, () -> {
            fromJson(json, TypeMapping.class);
        });

        // Check escaping of non identifier path elements and path from map elements
        assertEquals("properties['foo-bar'].baz", e.path());

        String msg = e.getMessage();
        assertTrue(msg.contains("Unknown field 'baz'"));
    }
}
