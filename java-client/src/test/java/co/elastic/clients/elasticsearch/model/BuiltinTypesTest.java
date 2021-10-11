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

package co.elastic.clients.elasticsearch.model;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch._types.query_dsl.SpanGapQuery;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import org.junit.Test;

import java.util.List;

public class BuiltinTypesTest extends ModelTestCase {

    @Test
    public void testPrimitiveTypes() {

        assertGetterType(Integer.class, SearchRequest.class, "size");

        // Lenient boolean: 'query_string.lenient'?: boolean | string
        // Also tests field names with '.'
        assertGetterType(Boolean.class, IndexSettings.class, "queryStringLenient");

    }

    @Test
    public void testLenientArray() {
        // index: Indices --> type Indices = IndexName | IndexName[]
        assertGetterType(List.class, SearchRequest.class, "index");
    }

    @Test
    public void testSpanGapQuery() {
        // Hand-written class

        SpanGapQuery q = new SpanGapQuery.Builder()
            .field("a-field")
            .spanWidth(12)
            .build();

        q = checkJsonRoundtrip(q, "{\"a-field\":12}");

        assertEquals("a-field", q.field());
        assertEquals(12, q.spanWidth());
    }

    @Test
    public void testErrorResponse() {
        String json = "{\"error\":{\"root_cause\":[{\"type\":\"index_not_found_exception\",\"reason\":\"no such index [doesnotexist]\"," +
            "\"resource.type\":\"index_expression\",\"resource.id\":\"doesnotexist\",\"index_uuid\":\"_na_\"," +
            "\"index\":\"doesnotexist\"}],\"type\":\"index_not_found_exception\",\"reason\":\"no such index [doesnotexist]\",\"resource" +
            ".type\":\"index_expression\",\"resource.id\":\"doesnotexist\",\"index_uuid\":\"_na_\",\"index\":\"doesnotexist\"}," +
            "\"status\":404}";

        System.out.println(json);

        ElasticsearchError error = fromJson(json, ElasticsearchError.class);

        assertEquals(404, error.status());
        assertEquals("index_not_found_exception", error.error().asJsonObject().getString("type"));
    }
}
