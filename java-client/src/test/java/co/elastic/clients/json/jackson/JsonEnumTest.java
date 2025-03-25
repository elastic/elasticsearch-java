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

package co.elastic.clients.json.jackson;

import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringFlag;
import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

public class JsonEnumTest extends ModelTestCase {

    @Test
    public void testPipeSeparatedEnum() {
        {
            // Empty flags
            String jsonNoFlags = "{\"query\":\"foo\"}";
            SimpleQueryStringQuery q = SimpleQueryStringQuery.of(b -> b
                .query("foo")
            );
            q = checkJsonRoundtrip(q, jsonNoFlags);
            assertEquals("foo", q.query());
            assertTrue(q.flags().isEmpty());
        }

        {
            // With flags
            String jsonWithFlags = "{\"flags\":\"AND|NEAR\",\"query\":\"foo\"}";
            SimpleQueryStringQuery q = SimpleQueryStringQuery.of(b -> b
                .query("foo")
                .flags(SimpleQueryStringFlag.And, SimpleQueryStringFlag.Near)
            );
            q = checkJsonRoundtrip(q, jsonWithFlags);
            assertEquals("foo", q.query());
            assertEquals(2, q.flags().size());
            assertEquals(SimpleQueryStringFlag.And, q.flags().get(0));
            assertEquals(SimpleQueryStringFlag.Near, q.flags().get(1));
        }
    }
}
