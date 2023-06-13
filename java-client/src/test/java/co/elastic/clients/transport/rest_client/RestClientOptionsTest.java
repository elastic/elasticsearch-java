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

package co.elastic.clients.transport.rest_client;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.SimpleJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class RestClientOptionsTest extends Assertions {

    /** Collected headers by test name */
    private static Map<String, Headers> collectedHeaders;
    private static final AtomicInteger testCounter = new AtomicInteger();
    private static HttpServer httpServer;

    private static final String MIME_TYPE = "application/vnd.elasticsearch+json; compatible-with=" + Version.VERSION.major();

    @BeforeAll
    public static void setup() throws IOException {
        collectedHeaders = new ConcurrentHashMap<>();
        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        // Register a handler on the core.exists("capture-handler/{name}") endpoint that will capture request headers.
        httpServer.createContext("/capture-headers/_doc/", exchange -> {
            String testName = exchange.getRequestURI().getPath().substring("/capture-headers/_doc/".length());
            System.out.println(exchange.getResponseHeaders());
            System.out.println();
            collectedHeaders.put(testName, exchange.getRequestHeaders());

            // Reply with an empty 200 response
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
        });

        httpServer.start();
    }

    @AfterAll
    public static void cleanup() {
        httpServer.stop(0);
        httpServer = null;
        collectedHeaders = null;
    }
    
    private ElasticsearchTransport newRestClientTransport(RestClient restClient, JsonpMapper mapper) {
        return newRestClientTransport(restClient, mapper, null);
    }

    private ElasticsearchTransport newRestClientTransport(RestClient restClient, JsonpMapper mapper, RestClientOptions options) {
        return new RestClientTransport(restClient, mapper, options);
        //return new RestClientMonolithTransport(restClient, mapper, options);
    }

    /**
     * Make a server call, capture request headers and check their consistency.
     *
     * @return the name of the entry in <code>collectedHeaders</code> for further inspection.
     */
    private String checkHeaders(ElasticsearchClient esClient) throws IOException {
        String testName = "test-" + testCounter.incrementAndGet();
        BooleanResponse exists = esClient.exists(r -> r.index("capture-headers").id(testName));
        assertTrue(exists.value());

        Headers headers = collectedHeaders.get(testName);
        assertNotNull(headers, "No headers collected for test " + testName);

        assertNotNull(headers.get("X-elastic-client-meta"), "Missing client meta header");
        assertEquals(RestClientOptions.CLIENT_META_VALUE, headers.get("X-elastic-client-meta").get(0));
        assertNotNull(headers.get("Accept"), "Missing 'Accept' header");
        assertEquals(MIME_TYPE, headers.get("Accept").get(0));

        for (Map.Entry<String, List<String>> entry: headers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return testName;
    }

    private void checkUserAgent(String testName, String value) {
        Headers headers = collectedHeaders.get(testName);
        assertNotNull(headers, "No headers collected for test " + testName);
        assertNotNull(headers.get("User-Agent"), "Missing 'User-Agent' header");
        assertEquals(value, headers.get("User-Agent").get(0));
    }

    @Test
    void testNoRequestOptions() throws Exception {
        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        ElasticsearchTransport transport = newRestClientTransport(llrc, new SimpleJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        String id = checkHeaders(esClient);
        checkUserAgent(id, RestClientOptions.USER_AGENT_VALUE);
    }

    @Test
    void testTransportRequestOptions() throws Exception {
        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        ElasticsearchTransport transport = newRestClientTransport(llrc, new SimpleJsonpMapper(),
            new RestClientOptions.Builder(RequestOptions.DEFAULT.toBuilder()).build()
        );
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        String id = checkHeaders(esClient);
        checkUserAgent(id, RestClientOptions.USER_AGENT_VALUE);
    }

    @Test
    void testClientRequestOptions() throws Exception {
        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        ElasticsearchTransport transport = newRestClientTransport(llrc, new SimpleJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport).withTransportOptions(
            new RestClientOptions.Builder(RequestOptions.DEFAULT.toBuilder()).build()
        );

        String id = checkHeaders(esClient);
        checkUserAgent(id, RestClientOptions.USER_AGENT_VALUE);
    }

    @Test
    void testLambdaOptionsBuilder() throws Exception {
        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        ElasticsearchTransport transport = newRestClientTransport(llrc, new SimpleJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport)
            .withTransportOptions(o -> o
                .addHeader("Foo", "bar")
                .addHeader("x-elastic-client-meta", "foo-bar-client")
            );

        String id = checkHeaders(esClient);
        checkUserAgent(id, RestClientOptions.USER_AGENT_VALUE);
    }

    @Test
    void testRequestOptionsOverridingBuiltin() throws Exception {
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
            .addHeader("user-agent", "FooBarAgent/1.0")
            .addHeader("x-elastic-client-meta", "foo-bar-client")
            .build();

        RestClient llrc = RestClient.builder(
            new HttpHost(httpServer.getAddress().getHostString(), httpServer.getAddress().getPort(), "http")
        ).build();

        ElasticsearchTransport transport = newRestClientTransport(llrc, new SimpleJsonpMapper(), new RestClientOptions(options));
        ElasticsearchClient esClient = new ElasticsearchClient(transport);
        // Should not override client meta
        String id = checkHeaders(esClient);
        // overriding user-agent is ok
        checkUserAgent(id, "FooBarAgent/1.0");
    }
}
