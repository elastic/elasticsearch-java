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
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class SerializeToStringTest extends ModelTestCase {

    @Test
    public void testRequestWithGenericValueBody() {
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

        assertEquals("foo", json);
    }
}

