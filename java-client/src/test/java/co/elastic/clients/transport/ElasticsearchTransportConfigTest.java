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
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import co.elastic.clients.elasticsearch.indices.GetAliasResponse;
import co.elastic.clients.transport.rest5_client.Rest5ClientOptions;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest_client.RestClientOptions;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;
import org.elasticsearch.client.RequestOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class ElasticsearchTransportConfigTest extends Assertions {

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
        assertEquals(client._transport().getClass(), RestClientTransport.class);
        assertTrue(client._transportOptions().keepResponseBodyOnException());
        assertEquals(3, client._transportOptions().headers().size());

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
        assertInstanceOf(Rest5ClientTransport.class, client._transport());
        assertTrue(client._transportOptions().keepResponseBodyOnException());
        assertEquals(3, client._transportOptions().headers().size());

        // token update utility: supported on new transport
        client._transportOptions().updateToken("token");
        assertEquals(4, client._transportOptions().headers().size());
        assertTrue(client._transportOptions().headers().stream().anyMatch(h -> h.getKey().equals(
            "Authorization")));
    }

    @Test
    public void credentialCombinations() {

        // Bare minimum is a host URL
        new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .build();

        assertThrows(IllegalArgumentException.class, () -> new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .usernameAndPassword("elastic", null)
            .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .usernameAndPassword(null, "password")
            .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .usernameAndPassword("elastic", "password")
            .token("token")
            .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .usernameAndPassword("elastic", "password")
            .apiKey("api_key")
            .build()
        );

        assertThrows(IllegalArgumentException.class, () -> new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .apiKey("api_key")
            .token("token")
            .build()
        );
    }

    @Test
    public void checkDefaultConfig() throws Exception {
        ElasticsearchTransportConfig.Default config = new ElasticsearchTransportConfig.Builder()
            .host("http://example.com")
            .build();

        try (var transport = config.buildTransport()) {
            assertInstanceOf(Rest5ClientTransport.class, transport);
        }
    }

    @Test
    public void testPathPrefix() throws IOException {
        HttpServer server = com.sun.net.httpserver.HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        server.createContext("/path-prefix/_alias", exchange -> {
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, 0);

            exchange.getResponseBody().write("{\"foo\":{\"aliases\":{}}}".getBytes(StandardCharsets.UTF_8));
            exchange.close();
        });

        server.start();

        var address = server.getAddress();
        var url = "http://" + address.getHostName() + ":" + address.getPort() + "/path-prefix";

        // No trailing slash
        try(var esClient = ElasticsearchClient.of(b -> b
            .host(url)
            .transportFactory(ElasticsearchTestClient.transportFactory())
        )) {
            GetAliasResponse alias = esClient.indices().getAlias();
            assertEquals(1, alias.aliases().size());
            assertNotNull(alias.aliases().get("foo"));
        }

        // Trailing slash
        try(var esClient = ElasticsearchClient.of(b -> b
            .host(url + "/")
            .transportFactory(ElasticsearchTestClient.transportFactory())
        )) {
            GetAliasResponse alias = esClient.indices().getAlias();
            assertEquals(1, alias.aliases().size());
            assertNotNull(alias.aliases().get("foo"));
        }

        server.stop(0);
    }
}
