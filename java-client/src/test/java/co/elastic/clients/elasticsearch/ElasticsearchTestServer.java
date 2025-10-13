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
import org.apache.commons.io.FileUtils;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.IOUtils;
import org.testcontainers.utility.DockerImageName;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Random;

public class ElasticsearchTestServer implements AutoCloseable {

    private final String[] plugins;
    private volatile ElasticsearchContainer container;
    private String url;
    private SSLContext sslContext;
    private ElasticsearchClient client;

    private static ElasticsearchTestServer global;
    // TODO problem: missing preview versions
    private static final String artifactsApiUrl = "https://artifacts.elastic.co/releases/stack.json";

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

    // Same value for all tests in a test run
    private static final int RAND = new Random().nextInt(100);

    protected void setup(String url, SSLContext sslContext) {
        this.url = url;
        this.sslContext = sslContext;
        this.client = ElasticsearchTestClient.createClient(url, null, sslContext);
    }

    private Version selectLatestVersion(Version version, String info) {
        if (info.contains(version.toString())) {
            return version;
        }
        // if no version X.Y.0 was found, we give up
        if (version.maintenance() == 0) {
            throw new RuntimeException("Elasticsearch server container version: " + version + " not yet " +
                "available");
        }
        String prerelease = version.isPreRelease() ? "SNAPSHOT" : null;
        return selectLatestVersion(new Version(version.major(), version.minor(), version.maintenance() - 1,
            prerelease, null), info);
    }

    private String fetchAndWriteVersionInfo(File file) throws IOException {
        String versionInfo = IOUtils.toString(new URL(artifactsApiUrl), StandardCharsets.UTF_8);
        FileUtils.writeStringToFile(file, versionInfo, StandardCharsets.UTF_8);
        return versionInfo;
    }

    private Version getLatestAvailableServerVersion(Version version) {
        try {
            // check if there's cached information
            ClassLoader classLoader = getClass().getClassLoader();
            URL location = classLoader.getResource("./co/elastic/clients/version.json");

            // writing the info on file before returning
            if (location == null) {
                File file = new File(classLoader.getResource("./co/elastic/clients").getFile() + "/version" +
                    ".json");
                String versionInfo = fetchAndWriteVersionInfo(file);
                return selectLatestVersion(version, versionInfo);
            }

            File file = new File(location.getFile());

            // info file was found, but it's expired
            if (Instant.ofEpochMilli(file.lastModified()).isBefore(Instant.now().minus(24,
                ChronoUnit.HOURS))) {
                String versionInfo = fetchAndWriteVersionInfo(file);
                return selectLatestVersion(version, versionInfo);
            }

            // info file exists and it has new info
            String versionInfo = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            return selectLatestVersion(version, versionInfo);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized ElasticsearchTestServer start() {
        if (this.client != null) {
            return this;
        }

        Version version = getLatestAvailableServerVersion(Version.VERSION);

        // using specific stable version for tests with plugins
        if (plugins.length > 0) {
            version = Version.VERSION.major() < 8 ? new Version(7, 17, 25, false) : new Version(8, 16, 0,
                false);
        }

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
