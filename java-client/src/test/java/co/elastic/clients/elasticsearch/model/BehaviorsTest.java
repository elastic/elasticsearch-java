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

import co.elastic.clients.base.ElasticsearchCatRequest;
import co.elastic.clients.base.ElasticsearchCommonRequest;
import co.elastic.clients.elasticsearch._core.IndexRequest;
import co.elastic.clients.elasticsearch._types.ShapeRelation;
import co.elastic.clients.elasticsearch._types.query_dsl.ShapeQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import co.elastic.clients.elasticsearch.cat.ShardsRequest;
import org.junit.Test;

public class BehaviorsTest extends ModelTestCase {

    @Test
    public void testSingleKeyDictionary() {
        TermQuery q = new TermQuery.Builder()
            .queryName("query-name")
            .field("field-name")
            .value("some-value")
            .build();

        q = checkJsonRoundtrip(q, "{\"field-name\":{\"_name\":\"query-name\",\"value\":\"some-value\"}}");

        assertEquals("query-name", q.queryName());
        assertEquals("field-name", q.field());
        assertEquals("some-value", q.value());
    }

    @Test
    public void testAdditionalProperty() {
        ShapeQuery q = new ShapeQuery.Builder()
            .queryName("query-name")
            .field("field-name")
            .shape(_0 -> _0
                .ignoreUnmapped(true)
                .relation(ShapeRelation.Disjoint)
            )
            .build();

        q = checkJsonRoundtrip(q,
            "{\"field-name\":{\"ignore_unmapped\":true,\"relation\":\"disjoint\"},\"_name\":\"query-name\"}"
        );

        assertEquals("query-name", q.queryName());
        assertTrue(q.shape().ignoreUnmapped());
        assertEquals(ShapeRelation.Disjoint, q.shape().relation());
        System.out.println(toJson(q));
    }

    @Test
    public void testRequestMarkers() {
        assertTrue(ElasticsearchCommonRequest.class.isAssignableFrom(IndexRequest.class));
        assertTrue(ElasticsearchCatRequest.class.isAssignableFrom(ShardsRequest.class));
    }
}
