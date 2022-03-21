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

import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Collections;

public class SerializeToStringTest extends ModelTestCase {

    @Test
    public void testIndexResponse() {
        IndexResponse resp = IndexResponse.of(r -> r
                .index("foo")
                .id("1")
                .primaryTerm(1)
                .seqNo(1)
                .version(1)
                .shards(s -> s.successful(1).failed(0).total(1))
                .result(Result.Created)
        );

        String json = mapper.serializeToString(resp);

        assertEquals("{\"_id\":\"1\",\"_index\":\"foo\",\"_primary_term\":1,\"result\":\"created\",\"_seq_no\":1,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0},\"_version\":1}", json);
    }

    @Test
    public void testSearchResponse() {
        SearchResponse resp = SearchResponse.searchResponseOf(r -> r
                .took(10)
                .shards(s -> s.successful(1).failed(0).total(1))
                .timedOut(false)
                .hits(h -> h
                        .total(t -> t.value(0).relation(TotalHitsRelation.Eq))
                        .hits(Collections.emptyList())
                )
        );

        String json = mapper.serializeToString(resp);

        assertEquals("{\"took\":10,\"timed_out\":false,\"_shards\":{\"failed\":0.0,\"successful\":1.0,\"total\":1.0},\"hits\":{\"total\":{\"relation\":\"eq\",\"value\":0},\"hits\":[]}}", json);
    }
}

