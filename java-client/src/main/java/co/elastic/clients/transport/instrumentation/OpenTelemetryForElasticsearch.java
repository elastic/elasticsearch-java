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

package co.elastic.clients.transport.instrumentation;

import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.http.TransportHttpClient;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * An OpenTelemetry instrumentation for the Elasticsearch client.
 *
 * @see <a href="https://opentelemetry.io/docs/specs/semconv/database/elasticsearch/">OpenTelemetry semantic conventions
 *      for Elasticsearch</a>
 */

public class OpenTelemetryForElasticsearch implements Instrumentation {

    private static final Set<String> SEARCH_ENDPOINTS = new HashSet<>(Arrays.asList(
        "render_search_template",
        "terms_enum",
        "msearch_template",
        "eql.search",
        "msearch",
        "search_template",
        "async_search.submit",
        "search"
    ));

    private static final AttributeKey<String> ATTR_DB_SYSTEM = AttributeKey.stringKey("db.system");
    private static final AttributeKey<String> ATTR_DB_OPERATION = AttributeKey.stringKey("db.operation");
    private static final AttributeKey<String> ATTR_DB_STATEMENT = AttributeKey.stringKey("db.statement");
    // Use Semantic Convention keys once opentelemetry-semconv is stable
    //private static final AttributeKey<String> ATTR_DB_SYSTEM = SemanticAttributes.DB_SYSTEM;
    //private static final AttributeKey<String> ATTR_DB_OPERATION = SemanticAttributes.DB_OPERATION;
    //private static final AttributeKey<String> ATTR_DB_STATEMENT = SemanticAttributes.DB_STATEMENT;

    private static final AttributeKey<String> ATTR_HTTP_REQUEST_METHOD = AttributeKey.stringKey("http.request.method");
    private static final AttributeKey<String> ATTR_URL_FULL = AttributeKey.stringKey("url.full");
    private static final AttributeKey<String> ATTR_SERVER_ADDRESS = AttributeKey.stringKey("server.address");
    private static final AttributeKey<Long> ATTR_SERVER_PORT = AttributeKey.longKey("server.port");

    // Caching attributes keys to avoid unnecessary memory allocation
    private static final Map<String, AttributeKey<String>> attributesKeyCache = new ConcurrentHashMap<>();

    private static final String PATH_PART_PREFIX = "db.elasticsearch.path_parts.";

    // these reflect the config options in the OTel Java agent
    private static final boolean INSTRUMENTATION_ENABLED = Boolean.parseBoolean(
        ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.enabled", "true")
    );

    private static final boolean CAPTURE_SEARCH_BODY = Boolean.parseBoolean(
        ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.capture-search-query", "false")
    );

    private static final Log logger = LogFactory.getLog(OpenTelemetryForElasticsearch.class);

    private final Tracer tracer;
    private final boolean captureSearchBody;

    /**
     * Creates an OpenTelemetry instrumentation based on systems settings:
     * <ul>
     *     <li>{@code otel.instrumentation.elasticsearch.enabled} system property or
     *     {@code OTEL_INSTRUMENTATION_ELASTICSEARCH_ENABLED} environnement variable: if {@code true} instrumentation is enabled.
     *     Defaults to {@code true}.
     *     </li>
     *     <li>{@code otel.instrumentation.elasticsearch.capture-search-query} system property or
     *     {@code OTEL_INSTRUMENTATION_ELASTICSEARCH_CAPTURE_SEARCH_QUERY} environment variable: if {@code true} the request body
     *     of search requests will be captured. Defaults to {@code false}.
     *     </li>
     * </ul>
     *
     * @return an instrumentation, or {@code null} if instrumentation is disabled or no OTel agent has been configured.
     */
    public static @Nullable OpenTelemetryForElasticsearch getDefault() {

        // See https://opentelemetry.io/docs/instrumentation/java/automatic/agent-config/#configuring-the-agent
        boolean enabled = Boolean.parseBoolean(
            ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.enabled", "true")
        );

        if (!enabled) {
            return null;
        }

        OpenTelemetry openTelemetry = GlobalOpenTelemetry.get();
        if (openTelemetry == OpenTelemetry.noop()) {
            // Do not waste time with noop impls that do have a cost, even if marginal
            return null;
        }

        boolean captureSearchBody = Boolean.parseBoolean(
            ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.capture-search-query", "false")
        );

        return new OpenTelemetryForElasticsearch(openTelemetry, captureSearchBody);
    }

    /**
     * Creates an OpenTelemetry instrumentation.
     *
     * @param openTelemetry the OpenTelemetry implementation
     * @param captureSearchBody should search requests bodies be captured?
     */
    public OpenTelemetryForElasticsearch(OpenTelemetry openTelemetry, boolean captureSearchBody) {
        Version version = Version.VERSION;

        this.tracer = openTelemetry.tracerBuilder("elasticsearch-api")
            .setInstrumentationVersion(version == null ? "unknown" : version.toString())
            .setSchemaUrl("https://opentelemetry.io/schemas/1.21.0")
            .build();

        this.captureSearchBody = captureSearchBody;
    }

    @Override
    public <TRequest> Context newContext(TRequest request, Endpoint<TRequest, ?, ?> endpoint) {
        return new OTelContext(request, endpoint);
    }

    private boolean shouldCaptureBody(Span span, String endpointId) {
        return captureSearchBody && span.isRecording() && SEARCH_ENDPOINTS.contains(endpointId);
    }

    //---------------------------------------------------------------------------------------------

    class OTelContext implements Instrumentation.Context {

        private final Span span;
        private String endpointId;
        private String pathAndQuery = null;

        <TRequest> OTelContext(TRequest request, Endpoint<TRequest, ?, ?> endpoint) {

            // calling the instrumentation class should never throw an exception
            Span span;
            String endpointId;
            try {
                endpointId = endpoint.id();
                if (endpointId.startsWith("es/")) {
                    endpointId = endpointId.substring(3);
                }
                this.endpointId = endpointId;

                span = tracer.spanBuilder(endpointId).setSpanKind(SpanKind.CLIENT).startSpan();
                if (span.isRecording()) {
                    span.setAttribute(ATTR_DB_SYSTEM, "elasticsearch");
                    span.setAttribute(ATTR_DB_OPERATION, endpointId);
                    span.setAttribute(ATTR_HTTP_REQUEST_METHOD, endpoint.method(request));

                    for (Map.Entry<String, String> pathParamEntry : endpoint.pathParameters(request).entrySet()) {
                        AttributeKey<String> attributeKey = attributesKeyCache.computeIfAbsent(pathParamEntry.getKey(),
                            (key) -> AttributeKey.stringKey(PATH_PART_PREFIX + key));
                        span.setAttribute(attributeKey, pathParamEntry.getValue());
                    }
                }
            } catch (RuntimeException e) {
                logger.debug("Failed creating an OpenTelemetry span for endpoint '" + endpoint.id() + "'.", e);
                span = Span.getInvalid();
            }

            this.span = span;
        }

        @Override
        public void beforeSendingHttpRequest(TransportHttpClient.Request httpRequest, TransportOptions options) {
            // calling the instrumentation class should never throw an exception
            try {

                this.pathAndQuery = pathAndQuery(httpRequest, options);

                span.setAttribute(ATTR_HTTP_REQUEST_METHOD, httpRequest.method());
                Iterable<ByteBuffer> body = httpRequest.body();
                if (body != null && shouldCaptureBody(span, endpointId)) {
                    StringBuilder sb = new StringBuilder();
                    for (ByteBuffer buf: body) {
                        buf.mark();
                        sb.append(StandardCharsets.UTF_8.decode(buf));
                        buf.reset();
                    }
                    span.setAttribute(ATTR_DB_STATEMENT, sb.toString());
                }
            } catch (Exception e) {
                logger.debug("Failed reading HTTP body content for an OpenTelemetry span.", e);
            }
        }

        @Override
        public void afterReceivingHttpResponse(TransportHttpClient.Response httpResponse) {
            // calling the instrumentation class should never throw an exception
            try {
                if (span.isRecording()) {
                    URI uri = httpResponse.node().uri();
                    String fullUrl = uri.resolve(pathAndQuery).toString();

                    span.setAttribute(ATTR_URL_FULL, fullUrl);
                    span.setAttribute(ATTR_SERVER_PORT, uri.getPort());
                    span.setAttribute(ATTR_SERVER_ADDRESS, uri.getHost());
                }
            } catch (RuntimeException e) {
                logger.debug("Failed capturing response information for the OpenTelemetry span.", e);
                // ignore
            }
        }

        @Override
        public <TResponse> void afterDecodingApiResponse(TResponse apiResponse) {
            // Nothing
        }

        @Override
        public void recordException(Throwable throwable) {
            span.setStatus(StatusCode.ERROR, throwable.getMessage());
            span.recordException(throwable);
        }

        @Override
        public void close() {
            span.end();
        }

        @Override
        public ThreadScope makeCurrent() {
            return new OTelScope(this.span);
        }
    }

    //---------------------------------------------------------------------------------------------

    class OTelScope implements Instrumentation.ThreadScope {

        private final Scope scope;

        OTelScope(Span span) {
            this.scope = span.makeCurrent();
        }

        @Override
        public void close() {
            this.scope.close();
        }
    }

    //---------------------------------------------------------------------------------------------

    private String pathAndQuery(TransportHttpClient.Request request, TransportOptions options) {

        String path = request.path();
        path = path.length() > 0 && path.charAt(0) == '/' ? path.substring(1) : path;

        Map<String, String> requestParams = request.queryParams();
        Map<String, String> optionsParams = options == null ? Collections.emptyMap() : options.queryParameters();

        Map<String, String> allParams;
        if (requestParams.isEmpty()) {
            allParams = optionsParams;
        } else if (optionsParams.isEmpty()) {
            allParams = requestParams;
        } else {
            allParams = new HashMap<>(requestParams);
            allParams.putAll(optionsParams);
        }

        if (allParams.isEmpty()) {
            return path;
        }

        StringBuilder sb = new StringBuilder(path);
        char sep = '?';
        for (Map.Entry<String, String> e: allParams.entrySet()) {
            sb.append(sep);
            sep = '&';
            try {
                sb.append(URLEncoder.encode(e.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(e.getValue(), "UTF-8"));
            } catch (UnsupportedEncodingException ex) {
                // Should not happen
                throw new RuntimeException(ex);
            }
        }
        return sb.toString();
    }

    /**
     * Borrowed from io.opentelemetry.api.internal.ConfigUtil
     */
    private static final class ConfigUtil {
        /**
         * Find a configuration option first as a JVM system property, and second as an environment variable
         */
        private static String getConfigOption(String key, String defaultValue) {
            String normalizedKey = normalizePropertyKey(key);
            String systemProperty = System.getProperties().entrySet().stream()
                .filter(entry -> normalizedKey.equals(normalizePropertyKey(entry.getKey().toString())))
                .map(entry -> entry.getValue().toString())
                .findFirst()
                .orElse(null);
            if (systemProperty != null) {
                return systemProperty;
            }
            return System.getenv().entrySet().stream()
                .filter(entry -> normalizedKey.equals(normalizeEnvironmentVariableKey(entry.getKey())))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(defaultValue);
        }

        /**
         * Normalize an environment variable key by converting to lower case and replacing "_" with ".".
         */
        private static String normalizeEnvironmentVariableKey(String key) {
            return key.toLowerCase(Locale.ROOT).replace("_", ".");
        }

        /**
         * Normalize a property key by converting to lower case and replacing "-" with ".".
         */
        private static String normalizePropertyKey(String key) {
            return key.toLowerCase(Locale.ROOT).replace("-", ".");
        }
    }
}
