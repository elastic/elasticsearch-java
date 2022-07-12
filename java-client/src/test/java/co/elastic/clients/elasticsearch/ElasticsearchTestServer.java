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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.endpoints.DelegatingJsonEndpoint;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

import java.io.IOException;
import java.time.Duration;

public class ElasticsearchTestServer implements AutoCloseable {

    private volatile ElasticsearchContainer container;
    private int port;
    private final JsonpMapper mapper = new JsonbJsonpMapper();
    private RestClient restClient;
    private ElasticsearchTransport transport;
    private ElasticsearchClient client;

    private static ElasticsearchTestServer global;

    public static synchronized ElasticsearchTestServer global() {
        if (global == null) {
            System.out.println("Starting global ES test server.");
            global = new ElasticsearchTestServer();
            global.setup();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Stopping global ES test server.");
                global.close();
            }));
        }
        return global;
    }

    private synchronized void setup() {
        container = new ElasticsearchContainer("docker.elastic.co/elasticsearch/elasticsearch:7.17.4")
            .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
            .withEnv("path.repo", "/tmp") // for snapshots
            .withStartupTimeout(Duration.ofSeconds(30))
            .withPassword("changeme");
        container.start();
        port = container.getMappedPort(9200);

        BasicCredentialsProvider credsProv = new BasicCredentialsProvider();
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme")
        );
        restClient = RestClient.builder(new HttpHost("localhost", port))
            .setHttpClientConfigCallback(hc -> hc.setDefaultCredentialsProvider(credsProv))
            .build();
        transport = new RestClientTransport(restClient, mapper);
        client = new ElasticsearchClient(transport);
    }

    /**
     * Send a request to a server and return the response as JSON. Useful to debug response format issues.
     */
    public static <Req> JsonData getJsonResponse(ElasticsearchClient client, Req request) throws IOException {

        JsonEndpoint<Req, JsonData, ErrorResponse> endpoint;

        try {
            @SuppressWarnings("unchecked")
            JsonEndpoint<Req, JsonData, ErrorResponse> endpoint0 = (JsonEndpoint<Req, JsonData, ErrorResponse>) request.getClass()
                .getDeclaredField("_ENDPOINT").get(null);
            endpoint = endpoint0;
        } catch (IllegalAccessException|NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        DelegatingJsonEndpoint<Req, JsonData, ErrorResponse> jsonEndpoint =
            new DelegatingJsonEndpoint<Req, JsonData, ErrorResponse>(endpoint) {
                @Override
                public JsonpDeserializer<JsonData> responseDeserializer() {
                    return JsonData._DESERIALIZER;
                }
            };

        return client._transport().performRequest(request, jsonEndpoint, client._transportOptions());
    }

    @Override
    public void close() {
        if (this == global) {
            // Closed with a shutdown hook
            return;
        }

        if (container != null) {
            container.stop();
        }
        container = null;
    }

    public int port() {
        return port;
    }

    public RestClient restClient() {
        return restClient;
    }

    public ElasticsearchTransport transport() {
        return transport;
    }

    public JsonpMapper mapper() {
        return mapper;
    }

    public ElasticsearchClient client() {
        return client;
    }

    public ElasticsearchAsyncClient asyncClient() {
        return new ElasticsearchAsyncClient(client._transport(), client._transportOptions());
    }
}
