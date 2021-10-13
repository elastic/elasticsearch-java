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

import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import org.junit.Test;

public class VariantsTest extends ModelTestCase {

    @Test
    public void testNested() {
        // nested containers: query > intervals > interval
        // intervals is a single key dictionary
        // query has container properties

        Query q = new Query(_0 -> _0
            .intervals(_1 -> _1
                .queryName("my-query")
                .field("a_field")
                .anyOf(_2 -> _2
                    .addIntervals(_3 -> _3
                        .match(_4 -> _4
                            .query("match-query")
                            .analyzer("lowercase")
                        )
                    )
                )
            )
        );

        assertEquals(Query.INTERVALS, q._type());
        assertNotNull(q.intervals());
        assertEquals("a_field", q.intervals().field());
        assertEquals(1, q.intervals().anyOf().intervals().size());
        assertEquals("lowercase", q.intervals().anyOf().intervals().get(0).match().analyzer());

        String json = toJson(q);

        assertEquals("{\"intervals\":{\"a_field\":{\"_name\":\"my-query\"," +
            "\"any_of\":{\"intervals\":[{\"match\":{\"analyzer\":\"lowercase\",\"query\":\"match-query\"}}]}}}}", json);

        Query q2 = fromJson(json, Query.class);
        assertEquals(json, toJson(q2));

        assertEquals(Query.INTERVALS, q2._type());
        assertNotNull(q2.intervals());
        assertEquals("a_field", q2.intervals().field());
        assertEquals(1, q2.intervals().anyOf().intervals().size());
        assertEquals("lowercase", q2.intervals().anyOf().intervals().get(0).match().analyzer());

    }

    @Test
    public void testInternalTag() {
        String expected = "{\"type\":\"ip\",\"fields\":{\"a-field\":{\"type\":\"float\",\"coerce\":true}},\"boost\":1" +
            ".0,\"index\":true}";

        Property p = new Property(_0 -> _0
            .ip(_1 -> _1
                .index(true)
                .boost(1.0)
                .fields("a-field", _2 -> _2
                    .float_(_3 -> _3
                        .coerce(true)
                    )
                )
            )
        );

        assertEquals(expected, toJson(p));

        Property property = fromJson(expected, Property.class);
        assertTrue(property.ip().index());
        assertEquals(1.0, property.ip().boost().doubleValue(), 0.09);

        assertTrue(property.ip().fields().get("a-field").float_().coerce());
    }

    @Test
    public void testBuilders() {
        Query q = new Query(QueryBuilders.exists().field("foo"));

        assertEquals("{\"exists\":{\"field\":\"foo\"}}", toJson(q));
    }
}
