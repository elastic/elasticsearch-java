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
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.endpoints.DelegatingJsonEndpoint;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.IOUtils;
import org.testcontainers.shaded.org.bouncycastle.cert.ocsp.Req;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ElasticsearchTestServer implements AutoCloseable {

    private final String[] plugins;
    private volatile ElasticsearchContainer container;
    private String url;
    private SSLContext sslContext;
    private ElasticsearchClient client;
    private static String version;

    private static ElasticsearchTestServer global;
    private static final String artifactsSnapshotUrl = "https://artifacts-snapshot.elastic" +
                                                       ".co/elasticsearch/latest/";
    private static final String artifactLatest = "https://artifacts-snapshot.elastic" +
                                                 ".co/elasticsearch/latest/master.json";

    public static synchronized ElasticsearchTestServer global() {
        return global(null);
    }

    public static synchronized ElasticsearchTestServer global(@Nullable String password) {
        if (global == null) {

            // Try localhost:9200 with set password
            try {
                String pwd = password == null ? "changeme" : password;
                String localUrl = "http://localhost:9200";
                HttpURLConnection connection = (HttpURLConnection) new URL(localUrl).openConnection();
                connection.setRequestProperty("Authorization", "Basic " +
                                                               Base64.getEncoder().encodeToString(("elastic" +
                                                               ":" + pwd).getBytes(StandardCharsets.UTF_8)));

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
                System.out.println("Starting global ES test server version " + version);
                global = new ElasticsearchTestServer();
                global.start();
            }

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Stopping global ES test server version " + version);
                global.close();
            }));
        }
        return global;
    }

    public ElasticsearchTestServer(String... plugins) {
        this.plugins = plugins;
    }

    // Same value for all tests in a test run
    private static final int RAND = new Random().nextInt(100);

    protected void setup(String url, SSLContext sslContext) {
        this.url = url;
        this.sslContext = sslContext;
        this.client = ElasticsearchTestClient.createClient(url, null, sslContext, null);
    }

    private Version selectLatestVersion(Version version) {

        String out;
        try {
            String url = artifactsSnapshotUrl +
                         version.major() +
                         '.' +
                         version.minor() +
                         ".json";

            out = new Scanner(new URL(url).openStream(), "UTF-8")
                .useDelimiter("\\A").next();
        } catch (IOException e) {
            // Version not available, trying preview version
            try {
                out = new Scanner(new URL(artifactLatest).openStream(), "UTF-8")
                    .useDelimiter("\\A").next();
            } catch (IOException ex) {
                throw new RuntimeException("Elasticsearch server container version " + version + "not " +
                                           "available, exception is: " + ex.getMessage());
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        Map info = null;
        try {
            info = mapper.readValue(out, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Could not parse version info from artifact api, exception is: " + e.getMessage());
        }

        return Version.parse(info.get("version").toString());
    }

    public synchronized ElasticsearchTestServer start() {
        if (this.client != null) {
            return this;
        }

        Version version = selectLatestVersion(Version.VERSION);

        // using specific stable version for tests with plugins
        if (plugins.length > 0) {
            version = Version.VERSION.major() < 8 ? new Version(7, 17, 25, false) : new Version(8, 16, 0,
                false);
        }

        String esImage = "docker.elastic.co/elasticsearch/elasticsearch:" + version;
        this.version = version.toString();

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
            JsonEndpoint<Req, JsonData, ErrorResponse> endpoint0 = (JsonEndpoint<Req, JsonData,
                ErrorResponse>) request.getClass()
                .getDeclaredField("_ENDPOINT").get(null);
            endpoint = endpoint0;
        } catch (IllegalAccessException | NoSuchFieldException e) {
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

    public String url() {
        return url;
    }

    public SSLContext sslContext() {
        return sslContext;
    }

    public ElasticsearchClient client() {
        return client;
    }

    public ElasticsearchAsyncClient asyncClient() {
        return new ElasticsearchAsyncClient(client._transport(), client._transportOptions());
    }
}
