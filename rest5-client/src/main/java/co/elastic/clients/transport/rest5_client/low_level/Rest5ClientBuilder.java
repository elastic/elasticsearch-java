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

package co.elastic.clients.transport.rest5_client.low_level;


import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.DefaultAuthenticationStrategy;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManager;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManagerBuilder;
import org.apache.hc.client5.http.routing.HttpRoutePlanner;
import org.apache.hc.client5.http.ssl.DefaultClientTlsStrategy;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.util.Timeout;
import org.apache.hc.core5.util.VersionInfo;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

import static co.elastic.clients.transport.rest5_client.low_level.LanguageRuntimeVersions.getRuntimeMetadata;

/**
 * Helps creating a new {@link Rest5Client}. Allows to set the most common http client configuration options
 * when internally
 * creating the underlying {@link org.apache.hc.client5.http.async.HttpAsyncClient}. Also allows to provide
 * an externally created
 * {@link org.apache.hc.client5.http.async.HttpAsyncClient} in case additional customization is needed.
 */
public final class Rest5ClientBuilder {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 1000;
    public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 30000;
    public static final int DEFAULT_RESPONSE_TIMEOUT_MILLIS = 0; // meaning infinite
    public static final int DEFAULT_MAX_CONN_PER_ROUTE = 10;
    public static final int DEFAULT_MAX_CONN_TOTAL = 30;

    static final String THREAD_NAME_PREFIX = "elasticsearch-rest-client-";
    private static final String THREAD_NAME_FORMAT = THREAD_NAME_PREFIX + "%d-thread-%d";

    public static final String VERSION;
    static final String META_HEADER_NAME = "X-Elastic-Client-Meta";
    static final String META_HEADER_VALUE;
    private static final String USER_AGENT_HEADER_VALUE;

    private static final Header[] EMPTY_HEADERS = new Header[0];

    private final List<Node> nodes;
    private CloseableHttpAsyncClient httpClient;
    private Consumer<HttpAsyncClientBuilder> httpClientConfigCallback;
    private Consumer<RequestConfig.Builder> requestConfigCallback;
    private Consumer<ConnectionConfig.Builder> connectionConfigCallback;
    private Consumer<PoolingAsyncClientConnectionManagerBuilder> connectionManagerCallback;
    private Consumer<PoolingAsyncClientConnectionManager> connectionManagerMonitor;
    private Header[] defaultHeaders = EMPTY_HEADERS;
    private Rest5Client.FailureListener failureListener;
    private SSLContext sslContext;
    private HttpHost proxy;
    private ProxySelector proxySelector;
    private HttpRoutePlanner routePlanner;
    private String pathPrefix;
    private NodeSelector nodeSelector = NodeSelector.ANY;
    private boolean strictDeprecationMode = false;
    private boolean compressionEnabled = false;
    private boolean metaHeaderEnabled = true;

    static {
        // Never fail on unknown version, even if an environment messed up their classpath enough that we
        // can't find it.
        // Better have incomplete telemetry than crashing user applications.
        String version = null;
        try (InputStream is = Rest5Client.class.getResourceAsStream("version.properties")) {
            if (is != null) {
                Properties versions = new Properties();
                versions.load(is);
                version = versions.getProperty("elasticsearch-client");
            }
        } catch (IOException e) {
            // Keep version unknown
        }

        if (version == null) {
            version = ""; // unknown values are reported as empty strings in X-Elastic-Client-Meta
        }

        VERSION = version;

        USER_AGENT_HEADER_VALUE = String.format(
            Locale.ROOT,
            "elasticsearch-java/%s (Java/%s)",
            VERSION.isEmpty() ? "Unknown" : VERSION,
            System.getProperty("java.version")
        );

        VersionInfo httpClientVersion = null;
        try {
            httpClientVersion = VersionInfo.loadVersionInfo(
                "org.apache.hc.core5",
                HttpAsyncClientBuilder.class.getClassLoader()

            );
        } catch (Exception e) {
            // Keep unknown
        }

        // Use a single 'p' suffix for all prerelease versions (snapshot, beta, etc).
        String metaVersion = version;
        int dashPos = metaVersion.indexOf('-');
        if (dashPos > 0) {
            metaVersion = metaVersion.substring(0, dashPos) + "p";
        }

        // service, language, transport, followed by additional information
        META_HEADER_VALUE = "es="
            + metaVersion
            + ",jv="
            + System.getProperty("java.specification.version")
            + ",t="
            + metaVersion
            + ",hc="
            + (httpClientVersion == null ? "" : httpClientVersion.getRelease())
            + getRuntimeMetadata();
    }

    /**
     * Creates a new builder instance and sets the hosts that the client will send requests to.
     *
     * @throws IllegalArgumentException if {@code nodes} is {@code null} or empty.
     */
    Rest5ClientBuilder(List<Node> nodes) {
        if (nodes == null || nodes.isEmpty()) {
            throw new IllegalArgumentException("nodes must not be null or empty");
        }
        for (Node node : nodes) {
            if (node == null) {
                throw new IllegalArgumentException("node cannot be null");
            }
        }
        this.nodes = nodes;
    }

    /**
     * Advanced setting, sets the rest client that will be used to handle requests.
     * The rest client has to be fully configured, as it will be used as provided,
     * also this will overwrite all builder setters.
     *
     * @throws NullPointerException if {@code httpAsyncClient} is {@code null}.
     */
    public Rest5ClientBuilder setHttpClient(CloseableHttpAsyncClient httpAsyncClient) {
        Objects.requireNonNull(httpAsyncClient, "custom rest client must not be null");
        this.httpClient = httpAsyncClient;
        return this;
    }

    /**
     * Sets the SSL context, which will be applied to all requests.
     *
     * @throws NullPointerException if {@code httpAsyncClient} is {@code null}.
     */
    public Rest5ClientBuilder setSSLContext(SSLContext sslContext) {
        Objects.requireNonNull(sslContext, "ssl context must not be null");
        this.sslContext = sslContext;
        return this;
    }

    public Rest5ClientBuilder setProxy(HttpHost proxy) {
        Objects.requireNonNull(proxy, "proxy must not be null");
        this.proxy = proxy;
        return this;
    }

    public Rest5ClientBuilder setProxySelector(ProxySelector proxySelector) {
        Objects.requireNonNull(proxySelector, "proxy selector must not be null");
        this.proxySelector = proxySelector;
        return this;
    }

    public Rest5ClientBuilder setRoutePlanner(HttpRoutePlanner routePlanner) {
        Objects.requireNonNull(routePlanner, "route planner must not be null");
        this.routePlanner = routePlanner;
        return this;
    }

    /**
     * Sets the default request headers, which will be sent along with each request.
     * <p>
     * Request-time headers will always overwrite any default headers.
     *
     * @throws NullPointerException if {@code defaultHeaders} or any header is {@code null}.
     */
    public Rest5ClientBuilder setDefaultHeaders(Header[] defaultHeaders) {
        Objects.requireNonNull(defaultHeaders, "defaultHeaders must not be null");
        for (Header defaultHeader : defaultHeaders) {
            Objects.requireNonNull(defaultHeader, "default header must not be null");
        }
        this.defaultHeaders = defaultHeaders;
        return this;
    }


    /**
     * Sets the {@link Rest5Client.FailureListener} to be notified for each request failure
     *
     * @throws NullPointerException if {@code failureListener} is {@code null}.
     */
    public Rest5ClientBuilder setFailureListener(Rest5Client.FailureListener failureListener) {
        Objects.requireNonNull(failureListener, "failureListener must not be null");
        this.failureListener = failureListener;
        return this;
    }


    /**
     * Sets the path's prefix for every request used by the http client.
     * <p>
     * For example, if this is set to "/my/path", then any client request will become <code>"/my/path/" +
     * endpoint</code>.
     * <p>
     * In essence, every request's {@code endpoint} is prefixed by this {@code pathPrefix}. The path prefix
     * is useful for when
     * Elasticsearch is behind a proxy that provides a base path or a proxy that requires all paths to
     * start with '/';
     * it is not intended for other purposes and it should not be supplied in other scenarios.
     *
     * @throws NullPointerException     if {@code pathPrefix} is {@code null}.
     * @throws IllegalArgumentException if {@code pathPrefix} is empty, or ends with more than one '/'.
     */
    public Rest5ClientBuilder setPathPrefix(String pathPrefix) {
        this.pathPrefix = cleanPathPrefix(pathPrefix);
        return this;
    }

    public static String cleanPathPrefix(String pathPrefix) {
        Objects.requireNonNull(pathPrefix, "pathPrefix must not be null");

        if (pathPrefix.isEmpty()) {
            throw new IllegalArgumentException("pathPrefix must not be empty");
        }

        String cleanPathPrefix = pathPrefix;
        if (!cleanPathPrefix.startsWith("/")) {
            cleanPathPrefix = "/" + cleanPathPrefix;
        }

        // best effort to ensure that it looks like "/base/path" rather than "/base/path/"
        if (cleanPathPrefix.endsWith("/") && cleanPathPrefix.length() > 1) {
            cleanPathPrefix = cleanPathPrefix.substring(0, cleanPathPrefix.length() - 1);

            if (cleanPathPrefix.endsWith("/")) {
                throw new IllegalArgumentException("pathPrefix is malformed. too many trailing slashes: [" + pathPrefix + "]");
            }
        }
        return cleanPathPrefix;
    }

    /**
     * Sets the {@link NodeSelector} to be used for all requests.
     *
     * @throws NullPointerException if the provided nodeSelector is null
     */
    public Rest5ClientBuilder setNodeSelector(NodeSelector nodeSelector) {
        Objects.requireNonNull(nodeSelector, "nodeSelector must not be null");
        this.nodeSelector = nodeSelector;
        return this;
    }

    /**
     * Whether the REST client should return any response containing at least
     * one warning header as a failure.
     */
    public Rest5ClientBuilder setStrictDeprecationMode(boolean strictDeprecationMode) {
        this.strictDeprecationMode = strictDeprecationMode;
        return this;
    }

    /**
     * Whether the REST client should compress requests using gzip content encoding and add the
     * "Accept-Encoding: gzip"
     * header to receive compressed responses.
     */
    public Rest5ClientBuilder setCompressionEnabled(boolean compressionEnabled) {
        this.compressionEnabled = compressionEnabled;
        return this;
    }

    /**
     * Whether to send a {@code X-Elastic-Client-Meta} header that describes the runtime environment. It
     * contains
     * information that is similar to what could be found in {@code User-Agent}. Using a separate header
     * allows
     * applications to use {@code User-Agent} for their own needs, e.g. to identify application version or
     * other
     * environment information. Defaults to {@code true}.
     */
    public Rest5ClientBuilder setMetaHeaderEnabled(boolean metadataEnabled) {
        this.metaHeaderEnabled = metadataEnabled;
        return this;
    }

    /**
     * Allows to customize the {@link CloseableHttpAsyncClient} being created and used by the
     * {@link Rest5Client}.
     * Commonly used to customize {@link HttpAsyncClientBuilder} without losing any other useful default
     * value that the {@link Rest5ClientBuilder} internally sets.
     * @throws NullPointerException if {@code httpClientConfigCallback} is {@code null}.
     */
    public Rest5ClientBuilder setHttpClientConfigCallback(Consumer<HttpAsyncClientBuilder> httpClientConfigCallback) {
        Objects.requireNonNull(httpClientConfigCallback, "httpClientConfigCallback must not be null");
        this.httpClientConfigCallback = httpClientConfigCallback;
        return this;
    }

    /**
     * Allows to customize the {@link RequestConfig} created by the {@link Rest5Client}
     * and used by the {@link CloseableHttpAsyncClient}.
     * Commonly used to customize {@link RequestConfig} without losing any other useful default
     * value that the {@link Rest5ClientBuilder} internally sets.
     * @throws NullPointerException if {@code requestConfigCallback} is {@code null}.
     */
    public Rest5ClientBuilder setRequestConfigCallback(Consumer<RequestConfig.Builder> requestConfigCallback) {
        Objects.requireNonNull(requestConfigCallback, "requestConfigCallback must not be null");
        this.requestConfigCallback = requestConfigCallback;
        return this;
    }

    /**
     * Allows to customize the {@link ConnectionConfig} created by the {@link Rest5Client}
     * and used by the {@link CloseableHttpAsyncClient}.
     * Commonly used to customize {@link ConnectionConfig} without losing any other useful default
     * value that the {@link Rest5ClientBuilder} internally sets.
     * @throws NullPointerException if {@code connectionConfigCallback} is {@code null}.
     */
    public Rest5ClientBuilder setConnectionConfigCallback(Consumer<ConnectionConfig.Builder> connectionConfigCallback) {
        Objects.requireNonNull(connectionConfigCallback, "connectionConfigCallback must not be null");
        this.connectionConfigCallback = connectionConfigCallback;
        return this;
    }

    /**
     * Allows to customize the {@link PoolingAsyncClientConnectionManager} created by the {@link Rest5Client}
     * and used by the {@link CloseableHttpAsyncClient}.
     * Commonly used to customize {@link PoolingAsyncClientConnectionManager} without losing any other useful default
     * value that the {@link Rest5ClientBuilder} internally sets.
     */
    public Rest5ClientBuilder setConnectionManagerCallback(Consumer<PoolingAsyncClientConnectionManagerBuilder> connectionManagerCallback) {
        this.connectionManagerCallback = connectionManagerCallback;
        return this;
    }

    /**
     * Allows to monitor the {@link PoolingAsyncClientConnectionManager} after it has been created.
     * This can be used to add custom monitoring or alerting for connection pool usage.
     */
    public Rest5ClientBuilder setConnectionManagerMonitor(Consumer<PoolingAsyncClientConnectionManager> connectionManagerMonitor) {
        this.connectionManagerMonitor = connectionManagerMonitor;
        return this;
    }

    /**
     * Creates a new {@link Rest5Client} based on the provided configuration.
     */
    public Rest5Client build() {
        if (failureListener == null) {
            failureListener = new Rest5Client.FailureListener();
        }
        CloseableHttpAsyncClient httpClient = this.createHttpClient();
        Rest5Client restClient = new Rest5Client(
            httpClient,
            defaultHeaders,
            nodes,
            pathPrefix,
            failureListener,
            nodeSelector,
            strictDeprecationMode,
            compressionEnabled,
            metaHeaderEnabled
        );
        httpClient.start();
        return restClient;
    }

    /**
     * Similar to {@code org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor
     * .DefaultThreadFactory} but with better thread names.
     */
    private static class RestClientThreadFactory implements ThreadFactory {
        private static final AtomicLong CLIENT_THREAD_POOL_ID_GENERATOR = new AtomicLong();

        private final long clientThreadPoolId = CLIENT_THREAD_POOL_ID_GENERATOR.getAndIncrement(); // 0-based
        private final AtomicLong clientThreadId = new AtomicLong();

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(
                runnable,
                String.format(Locale.ROOT, THREAD_NAME_FORMAT, clientThreadPoolId,
                    clientThreadId.incrementAndGet()) // 1-based
            );
        }
    }

    private CloseableHttpAsyncClient createHttpClient() {
        // if the user provided a client, using that one
        if (this.httpClient != null) {
            return this.httpClient;
        }
        // otherwise, creating a default instance of CloseableHttpAsyncClient

        // default timeouts are all 3 mins, replacing those
        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom()
            .setConnectionRequestTimeout(Timeout.of(DEFAULT_SOCKET_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS))
            .setResponseTimeout(Timeout.of(DEFAULT_RESPONSE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));

        if (requestConfigCallback != null) {
            requestConfigCallback.accept(requestConfigBuilder);
        }

        try {

            SSLContext sslContext = this.sslContext != null ? this.sslContext : SSLContext.getDefault();

            ConnectionConfig.Builder connectionConfigBuilder = ConnectionConfig.custom()
                .setConnectTimeout(Timeout.of(DEFAULT_CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS));
            if (connectionConfigCallback != null) {
                connectionConfigCallback.accept(connectionConfigBuilder);
            }

            PoolingAsyncClientConnectionManagerBuilder connectionManagerBuilder = 
                PoolingAsyncClientConnectionManagerBuilder.create()
                    .setDefaultConnectionConfig(connectionConfigBuilder.build())
                    .setMaxConnPerRoute(DEFAULT_MAX_CONN_PER_ROUTE)
                    .setMaxConnTotal(DEFAULT_MAX_CONN_TOTAL)
                    .setTlsStrategy(new DefaultClientTlsStrategy(sslContext))
                    // 配置连接池定期清理机制
                    .setValidateAfterInactivity(Timeout.of(5, TimeUnit.SECONDS))
                    // 配置连接存活时间
                    .setConnectionTimeToLive(Timeout.of(30, TimeUnit.MINUTES));

            if (connectionManagerCallback != null) {
                connectionManagerCallback.accept(connectionManagerBuilder);
            }
            PoolingAsyncClientConnectionManager connectionManager = connectionManagerBuilder.build();
            // 调用连接池监控回调
            if (connectionManagerMonitor != null) {
                connectionManagerMonitor.accept(connectionManager);
            }

            HttpAsyncClientBuilder httpClientBuilder = HttpAsyncClientBuilder.create()
                .setDefaultRequestConfig(requestConfigBuilder.build())
                .setConnectionManager(connectionManager)
                .setUserAgent(USER_AGENT_HEADER_VALUE)
                .setTargetAuthenticationStrategy(new DefaultAuthenticationStrategy())
                .setThreadFactory(new RestClientThreadFactory());

            if (this.proxy != null) {
                httpClientBuilder.setProxy(this.proxy);
            }
            if (this.proxySelector != null) {
                httpClientBuilder.setProxySelector(this.proxySelector);
            }
            if (this.routePlanner != null) {
                httpClientBuilder.setRoutePlanner(this.routePlanner);
            }
            if (httpClientConfigCallback != null) {
                httpClientConfigCallback.accept(httpClientBuilder);
            }

            return httpClientBuilder.build();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("could not create the default ssl context", e);
        }
    }

}
