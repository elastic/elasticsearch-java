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

import co.elastic.clients.transport.Endpoint;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.semconv.trace.attributes.SemanticAttributes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.elasticsearch.client.Response;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Instrumentation {

    private static final Set<String> SEARCH_ENDPOINTS = new HashSet<>(Arrays.asList(
            "render_search_template",
            "terms_enum",
            "msearch_template",
            "eql.search",
            "msearch",
            "search_template",
            "async_search.submit",
            "search"));


    // these reflect the config options in the OTel Java agent
    private static final boolean INSTRUMENTATION_ENABLED =
            Boolean.parseBoolean(
                    ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.enabled", "true"));

    private static final boolean CAPTURE_SEARCH_BODY =
            Boolean.parseBoolean(
                    ConfigUtil.getConfigOption("otel.instrumentation.elasticsearch.capture-search-query", "false"));

    private static final Log logger = LogFactory.getLog(Instrumentation.class);

    // Caching attributes keys to avoid unnecessary memory allocation
    private static final Map<String, AttributeKey<String>> attributesKeyCache = new ConcurrentHashMap<>();

    private final Tracer tracer;

    public Instrumentation(@Nullable OpenTelemetry openTelemetry) {
        if (openTelemetry == null) {
            openTelemetry = GlobalOpenTelemetry.get();
        }

        tracer = openTelemetry.getTracer("elasticsearch-api");
    }

    public <RequestT, ResponseT, ErrorT> Span createSpanForRequest(RequestT request,
                                                                   Endpoint<RequestT, ResponseT, ErrorT> endpoint) {
        // calling the instrumentation class should never throw an exception
        try {
            if (!INSTRUMENTATION_ENABLED) {
                return Span.getInvalid();
            }

            Span span = tracer.spanBuilder(endpoint.id()).setSpanKind(SpanKind.CLIENT).startSpan();
            if (isInvalidSpan(span)) {
                span.setAttribute(OTelAttributes.DB_SYSTEM, "elasticsearch");
                span.setAttribute(OTelAttributes.DB_OPERATION, endpoint.id());
                span.setAttribute(OTelAttributes.HTTP_REQUEST_METHOD, endpoint.method(request));

                for (Map.Entry<String, String> pathParamEntry : endpoint.pathParameters(request).entrySet()) {
                    AttributeKey<String> attributeKey = attributesKeyCache.computeIfAbsent(pathParamEntry.getKey(),
                            (key) -> AttributeKey.stringKey(OTelAttributes.PATH_PART_PREFIX + key));
                    span.setAttribute(attributeKey, pathParamEntry.getValue());
                }
            }

            return span;
        } catch (RuntimeException e) {
            logger.debug("Failed creating an OpenTelemetry span for endpoint '" + endpoint.id() + "'.", e);
            return Span.getInvalid();
        }
    }

    public void captureResponseInformation(@Nullable Span span, Response response) {
        // calling the instrumentation class should never throw an exception
        try {
            if (isInvalidSpan(span)) {
                return;
            }
            Objects.requireNonNull(span);

            HttpHost host = response.getHost();
            String uri = response.getRequestLine().getUri();
            uri = uri.startsWith("/") ? uri : "/" + uri;
            String fullUrl = host.toURI() + uri;

            span.setAttribute(OTelAttributes.URL_FULL, fullUrl);
            span.setAttribute(OTelAttributes.SERVER_PORT, host.getPort());
            span.setAttribute(OTelAttributes.SERVER_ADDRESS, host.getHostName());
        } catch (RuntimeException e) {
            logger.debug("Failed capturing response information for the OpenTelemetry span.", e);
            // ignore
        }
    }

    public <RequestT> void captureBody(@Nullable Span span, Endpoint<RequestT, ?, ?> endpoint,
                                       HttpEntity httpEntity) {
        // calling the instrumentation class should never throw an exception
        try {
            if (shouldCaptureBody(span, endpoint, httpEntity)) {

                String body = new BufferedReader(
                        new InputStreamReader(httpEntity.getContent(), StandardCharsets.UTF_8))
                        .lines()
                        .collect(Collectors.joining());

                span.setAttribute(OTelAttributes.DB_STATEMENT, body);
            }
        } catch (Exception e) {
            logger.debug("Failed reading HTTP body content for an OpenTelemetry span.", e);
        }
    }

    private <RequestT> boolean shouldCaptureBody(@Nullable Span span, Endpoint<RequestT, ?, ?> endpoint, HttpEntity httpEntity) {
        return !isInvalidSpan(span)
                && CAPTURE_SEARCH_BODY
                && SEARCH_ENDPOINTS.contains(endpoint.id())
                && httpEntity != null
                && httpEntity.isRepeatable();
    }

    private boolean isInvalidSpan(@Nullable Span span) {
        return !INSTRUMENTATION_ENABLED || span == null || !span.isRecording();
    }

    private static final class OTelAttributes {
        private static final AttributeKey<String> DB_SYSTEM = SemanticAttributes.DB_SYSTEM;
        private static final AttributeKey<String> DB_OPERATION = SemanticAttributes.DB_OPERATION;
        private static final AttributeKey<String> DB_STATEMENT = SemanticAttributes.DB_STATEMENT;
        private static final AttributeKey<String> HTTP_REQUEST_METHOD = AttributeKey.stringKey("http.request.method");
        private static final AttributeKey<String> URL_FULL = AttributeKey.stringKey("url.full");
        private static final AttributeKey<String> SERVER_ADDRESS = AttributeKey.stringKey("server.address");
        private static final AttributeKey<Long> SERVER_PORT = AttributeKey.longKey("server.port");

        private static final String PATH_PART_PREFIX = "db.elasticsearch.path_parts.";
    }

    private static final class ConfigUtil {
        private static String getConfigOption(String key, String defaultValue) {
            String normalizedKey = normalizePropertyKey(key);
            String systemProperty =
                    System.getProperties().entrySet().stream()
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
