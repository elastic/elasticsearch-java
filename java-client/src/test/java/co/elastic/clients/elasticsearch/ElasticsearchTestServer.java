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
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.endpoints.DelegatingJsonEndpoint;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.IOUtils;
import org.testcontainers.utility.DockerImageName;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;

public class ElasticsearchTestServer implements AutoCloseable {

    private final String[] plugins;
    private volatile ElasticsearchContainer container;
    private final JsonpMapper mapper = new JsonbJsonpMapper();
    private RestClient restClient;
    private ElasticsearchTransport transport;
    private ElasticsearchClient client;

    private static ElasticsearchTestServer global;

    public static synchronized ElasticsearchTestServer global() {
        if (global == null) {

            // Try localhost:9200
            try {
                String localUrl = "http://localhost:9200";
                HttpURLConnection connection = (HttpURLConnection) new URL(localUrl).openConnection();
                connection.setRequestProperty("Authorization", "Basic " +
                    Base64.getEncoder().encodeToString("elastic:changeme".getBytes(StandardCharsets.UTF_8)));

                try (InputStream input = connection.getInputStream()) {
                    String content = IOUtils.toString(input, StandardCharsets.UTF_8);
                    if (content.contains("You Know, for Search")) {
                        System.out.println("Found a running ES server at http://localhost:9200/");

                        global = new ElasticsearchTestServer();
                        global.setup(localUrl, null);
                    }
                }
            } catch (Exception e) {
                // Create container
                System.out.println("Starting global ES test server.");
                global = new ElasticsearchTestServer();
                global.start();
            }

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Stopping global ES test server.");
                global.close();
            }));
        }
        return global;
    }

    public ElasticsearchTestServer(String... plugins) {
        this.plugins = plugins;
    }

    protected void setup(String url, SSLContext sslContext) {
        BasicCredentialsProvider credsProv = new BasicCredentialsProvider();
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme")
        );
        restClient = RestClient.builder(HttpHost.create(url))
            .setHttpClientConfigCallback(hc -> hc
                .setDefaultCredentialsProvider(credsProv)
                .setSSLContext(sslContext)
            )
            .build();
        transport = new RestClientTransport(restClient, mapper);
        client = new ElasticsearchClient(transport);
    }

    public synchronized ElasticsearchTestServer start() {
        if (this.client != null) {
            return this;
        }

        Version version = Version.VERSION.major() < 8 ? new Version(7,17,5,false) : new Version(8,12,0,false);

        // Note we could use version.major() + "." + version.minor() + "-SNAPSHOT" but plugins won't install on a snapshot version
        String esImage = "docker.elastic.co/elasticsearch/elasticsearch:" + version;

        DockerImageName image;
        if (plugins.length == 0) {
            image = DockerImageName.parse(esImage);
        } else {
            String esWithPluginsImage = new ImageFromDockerfile()
                .withDockerfileFromBuilder(b -> {
                        b.from(esImage);
                        for (String plugin : plugins) {
                            b.run("/usr/share/elasticsearch/bin/elasticsearch-plugin", "install", plugin);
                        }
                    }
                ).get();

            image = DockerImageName
                .parse(esWithPluginsImage)
                .asCompatibleSubstituteFor("docker.elastic.co/elasticsearch/elasticsearch");
        }

        container = new ElasticsearchContainer(image)
            .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
            .withEnv("path.repo", "/tmp") // for snapshots
            .withStartupTimeout(Duration.ofSeconds(30))
            .withPassword("changeme");
        container.start();

        boolean useTLS = version.major() >= 8;

        SSLContext sslContext = useTLS ? container.createSslContextFromCa() : null;
        String url = (useTLS ? "https://" : "http://") + container.getHttpHostAddress();

        setup(url, sslContext);

        return this;
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

    public ElasticsearchContainer container() {
        return this.container;
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
