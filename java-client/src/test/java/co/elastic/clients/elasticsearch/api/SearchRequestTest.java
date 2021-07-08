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

package co.elastic.clients.elasticsearch.api;

import co.elastic.clients.elasticsearch._global.SearchRequest;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import org.junit.Assert;
import org.junit.Test;

import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class SearchRequestTest extends Assert {

    @Test
    public void testSerialization() {

        // This checks that path parameters ("q") are not serialized as json
        // and variant containers ser/deser

        JsonProvider jp = JsonProvider.provider();

        SearchRequest request = new SearchRequest.Builder()
            .q("blah")
            .query(qb -> qb
                .type(tq -> tq.value("foo"))
            )
            .putAggs("myagg", ab -> ab.avg(jp.createValue("foo")))
            .build();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JsonProvider provider = JsonProvider.provider();
        JsonGenerator generator = provider.createGenerator(baos);

        request.toJsonp(generator, new JsonbJsonpMapper());
        generator.close();

        String str = baos.toString();

        assertEquals("{\"aggs\":{\"myagg\":{\"avg\":\"foo\"}},\"query\":{\"type\":{\"value\":\"foo\"}}}", str);

        JsonParser parser = provider.createParser(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));

        request = SearchRequest.DESERIALIZER.deserialize(parser, new JsonbJsonpMapper());

        assertTrue(request.query().isType());
        assertEquals("foo", request.query().type().value());
        assertNull(request.q());

    }
}
