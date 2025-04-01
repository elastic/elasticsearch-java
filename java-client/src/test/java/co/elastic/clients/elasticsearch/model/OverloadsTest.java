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

import co.elastic.clients.elasticsearch._types.FieldSort;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.aggregations.TopMetrics;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OverloadsTest extends ModelTestCase {

    @Test
    public void variantOverloads() {
        // A variant can be used when a union or container is expected
        MatchAllQuery maq = MatchAllQuery.of(b -> b);

        SearchRequest sr = SearchRequest.of(b -> b.query(maq));
        assertEquals(maq, sr.query().matchAll());
    }

    @Test
    public void fieldValueOverloads() {
        FieldSort fs = FieldSort.of(b -> b.field("field").missing(42));

        assertTrue(fs.missing().isLong());
        assertEquals(42, fs.missing().longValue());
    }

    @Test
    public void dictionaryAndArrayOverloads() {
        TopMetrics tm = TopMetrics.of(b -> b
            .metrics("foo", 13.37)
            .sort("bar") // Required property
        );

        assertTrue(tm.metrics().get("foo").isDouble());
        assertEquals(13.37, tm.metrics().get("foo").doubleValue());
    }

    @Test
    public void arrayOverloads() {
        TopMetrics tm = TopMetrics.of(b -> b
            .metrics("foo", 0) // Required property
            .sort("bar")
            .sort(42)
        );

        List<FieldValue> sort = tm.sort();

        assertTrue(sort.get(0).isString());
        assertEquals("bar", sort.get(0).stringValue());

        assertTrue(sort.get(1).isLong());
        assertEquals(42, sort.get(1).longValue());
    }
}
