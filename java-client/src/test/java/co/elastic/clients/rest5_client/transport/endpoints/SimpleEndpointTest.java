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

package co.elastic.clients.rest5_client.transport.endpoints;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.CountResponse;
import co.elastic.clients.testkit.MockHttpClient;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleEndpointTest extends ModelTestCase {

    @Test
    public void testNoBodyForEmptyObject() throws Exception {

        List<TransportHttpClient.Request> requests = new ArrayList<>();

        MockHttpClient httpClient = new MockHttpClient() {
            @Override
            public Response performRequest(
                String endpointId, @Nullable Node node, Request request, TransportOptions option
            ) throws IOException {
                requests.add(request);
                return super.performRequest(endpointId, node, request, option);
            }
        };

        httpClient.add("/_count", "application/json", toJson(
            CountResponse.of(c -> c
                .count(1)
                .shards(s -> s.successful(1).failed(0).total(1))
        )));

        ElasticsearchTransport transport = new ElasticsearchTransportBase(httpClient, null, mapper) {};
        ElasticsearchClient client = new ElasticsearchClient(transport, null);

        client.count();
        client.count(c -> c.q("foo:bar"));
        client.count(c -> c.query(q -> q.term(t -> t.field("foo").value("bar"))));

        assertNull(requests.get(0).body());
        assertNull(requests.get(1).body());
        assertNotNull(requests.get(2).body());
    }
}
