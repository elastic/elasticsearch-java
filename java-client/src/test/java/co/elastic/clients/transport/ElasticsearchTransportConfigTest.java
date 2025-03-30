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

package co.elastic.clients.transport;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.rest5_client.Rest5ClientOptions;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest_client.RestClientOptions;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.elasticsearch.client.RequestOptions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ElasticsearchTransportConfigTest {

    @Test
    public void buildLegacy() {

        // create client with helper
        ElasticsearchClient client = ElasticsearchClient.of(b -> b
            .host("http://example.com")
            .usernameAndPassword("elastic", "changeme")
            .useLegacyTransport(true)
        );

        RestClientOptions options = new RestClientOptions(RequestOptions.DEFAULT, true);

        client = client.withTransportOptions(options);

        // checking options correctness
        assertTrue(client._transport().getClass().equals(RestClientTransport.class));
        assertTrue(client._transportOptions().keepResponseBodyOnException());
        assertTrue(client._transportOptions().headers().size() == 3);

        // token update utility: not supported on legacy transport
        ElasticsearchClient finalClient = client;
        assertThrows(UnsupportedOperationException.class, () -> finalClient._transportOptions().updateToken("token"));
    }

    @Test
    public void buildRest5() {

        // create client with helper
        ElasticsearchClient client = ElasticsearchClient.of(b -> b
            .host("http://example.com")
            .usernameAndPassword("elastic", "changeme")
        );

        Rest5ClientOptions options = new Rest5ClientOptions(co.elastic.clients.transport.rest5_client.low_level.RequestOptions.DEFAULT,
            true);

        client = client.withTransportOptions(options);

        // checking options correctness
        assertTrue(client._transport().getClass().equals(Rest5ClientTransport.class));
        assertTrue(client._transportOptions().keepResponseBodyOnException());
        assertTrue(client._transportOptions().headers().size() == 3);

        // token update utility: supported on new transport
        client._transportOptions().updateToken("token");
        assertTrue(client._transportOptions().headers().size() == 4);
        assertTrue(client._transportOptions().headers().stream().anyMatch(h -> h.getKey().equals(
            "Authorization")));
    }
}
