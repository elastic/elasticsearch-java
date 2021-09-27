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

import co.elastic.clients.elasticsearch._core.SearchRequest;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import org.junit.Assert;
import org.junit.Test;

import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class RequestEncodingTest extends ModelTestCase {

    @Test
    public void testParametersNotInJson() {

        // This checks that path parameters ("q") are not serialized as json
        // and variant containers ser/deser

        SearchRequest request = new SearchRequest.Builder()
            .q("blah")
            .query(b1 -> b1
                .type(b2 -> b2
                    .value("foo"))
            )
            .putAggs("myagg", b1 -> b1
                .avg(b2 -> b2
                    .field("foo"))
            )
            .build();

        JsonbJsonpMapper mapper = new JsonbJsonpMapper();
        String str = toJson(request, mapper);

        assertEquals("{\"aggs\":{\"myagg\":{\"avg\":{\"field\":\"foo\"}}},\"query\":{\"type\":{\"value\":\"foo\"}}}", str);

        request = fromJson(str, SearchRequest.class, mapper);

        assertTrue(request.query()._is(Query.TYPE));
        assertEquals("foo", request.query().type().value());
        assertNull(request.q());

    }
}
