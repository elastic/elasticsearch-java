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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.FieldSort;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.ScriptSource;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.TimeUnit;
import co.elastic.clients.elasticsearch._types.aggregations.TopMetrics;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch.core.MsearchRequest;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeRequest;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
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

    @Test
    @Disabled("just needs to compile")
    public void voidClassTDocumentOverload() throws IOException {
        // no need for a complete instance of the client,
        // nor testing anything, just checking that this compiles
        ElasticsearchClient client = ElasticsearchClient.of(e -> e.host("http://localhost:9200"));

        SearchResponse<Void> resp = client.search(s -> s, Void.class);
        SearchResponse<Void> respDefault = client.search(s -> s);
    }

    @Test
    public void searchRequestBodyOverloads() {

        // Normal search request
        SearchRequest searchRequest = SearchRequest.of(b -> b
            .size(10)
            .from(10)
            .query(q -> q
                .matchAll(m -> m)
            )
        );

        // Msearch compatibility
        MsearchRequest msearchRequestStandard = MsearchRequest.of(ms -> ms
            .searches(s -> s
                .header(h -> h.index("index"))
                .body(b -> b
                    .size(10)
                    .from(10)
                    .query(q -> q
                        .matchAll(m -> m)
                    )
                )
            )
        );

        MsearchRequest msearchRequestOverload = MsearchRequest.of(ms -> ms
            .searches(s -> s
                .header(h -> h.index("index"))
                .body(searchRequest)
            )
        );

        // Assert both variants result in the same serialization
        assertEquals(msearchRequestStandard.toString(), msearchRequestOverload.toString());

        // Script source compatibility
        ScriptSource scriptSourceStandard = ScriptSource.of(s -> s
            .scriptTemplate(t -> t
                .size(10)
                .from(10)
                .query(q -> q
                    .matchAll(m -> m)
                )
            )
        );

        ScriptSource scriptSourceOverload = ScriptSource.of(s -> s
            .scriptTemplate(searchRequest)
        );

        // Assert both variants result in the same serialization
        assertEquals(scriptSourceStandard.toString(), scriptSourceOverload.toString());
    }

    @Test
    public void timeOverload() {
        OpenPointInTimeRequest opr = OpenPointInTimeRequest.of(o -> o.index("test").keepAlive(k -> k.time(
            "5s")));
        OpenPointInTimeRequest opr1 =
            OpenPointInTimeRequest.of(o -> o.index("test").keepAlive(k -> k.time(5, TimeUnit.Seconds)));
        OpenPointInTimeRequest opr2 =
            OpenPointInTimeRequest.of(o -> o.index("test").keepAlive(Time.of(t -> t.time("5s"))));
        OpenPointInTimeRequest opr3 =
            OpenPointInTimeRequest.of(o -> o.index("test").keepAlive(Time.of(t -> t.time(5,
                TimeUnit.Seconds))));

        // Assert all variants result in the same serialization
        assertEquals(opr.toString(), opr1.toString());
        assertEquals(opr.toString(), opr2.toString());
        assertEquals(opr.toString(), opr3.toString());
    }
}
