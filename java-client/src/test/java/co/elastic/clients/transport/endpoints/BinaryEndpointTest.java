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

package co.elastic.clients.transport.endpoints;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.json.SimpleJsonpMapper;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class BinaryEndpointTest extends Assertions {

    /** Collected headers by test name */
    private static HttpServer httpServer;

    @BeforeAll
    public static void setup() throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        // Register a handler on the core.exists("capture-handler/{name}") endpoint that will capture request headers.
        httpServer.createContext("/foo/_mvt/bar/1/0/0", exchange -> {
            // Reply with an empty 200 response
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.getResponseHeaders().set("Content-Type", "application/vnd.hello-world");
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write("Hello world".getBytes(StandardCharsets.UTF_8));
            exchange.close();
        });

        httpServer.start();
    }

    @AfterAll
    public static void cleanup() {
        httpServer.stop(0);
        httpServer = null;
    }

    @Test
    public void testMvtSearch() throws IOException {
        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        RestClientTransport transport = new RestClientTransport(llrc, new SimpleJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        BinaryResponse resp = esClient.searchMvt(s -> s
            .index("foo")
            .field("bar")
            .x(0)
            .y(0)
            .zoom(1)
        );


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];

        try(InputStream input = resp.content()) {
            int len;
            while ((len = input.read(buffer)) > 0) {
                baos.write(buffer, 0, len);
            }
        }

        assertEquals("application/vnd.hello-world", resp.contentType());
        assertEquals("Hello world", baos.toString(StandardCharsets.UTF_8.name()));
    }

    @Test
    public void convertJsonToBinaryEndpoint() throws IOException {

        ElasticsearchClient esClient = ElasticsearchTestServer.global().client();

        // Create the search request
        SearchRequest request = SearchRequest.of(b -> b);

        // Create a binary endpoint from the regular search endpoint. It will not deserialize
        // the response and instead will just return the raw response input stream.
        BinaryEndpoint<SearchRequest> binarySearchEndpoint = SearchRequest._ENDPOINT.withBinaryResponse();

        // Force typed_keys to false, so that aggregations names do not hold type information
        TransportOptions options = esClient._transportOptions().toBuilder()
            .setParameter("typed_keys", "false")
            .build();

        // Call Elasticsearch by providing the transport the request and endpoint
        BinaryResponse binaryResponse = esClient._transport().performRequest(request, binarySearchEndpoint, options);

        // Do something with the response
        String response = IOUtils.toString(binaryResponse.content(), StandardCharsets.UTF_8);
        assertTrue(response.matches("\\{\"took\":\\d+,\"timed_out\":false.*"));
    }
}
