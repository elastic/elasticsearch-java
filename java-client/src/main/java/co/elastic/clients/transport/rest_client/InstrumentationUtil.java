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
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.semconv.trace.attributes.SemanticAttributes;
import org.apache.http.HttpHost;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InstrumentationUtil {

    private final OpenTelemetry openTelemetry;
    private final Tracer tracer;

    protected InstrumentationUtil(@Nullable OpenTelemetry openTelemetry) {
        if (openTelemetry == null) {
            this.openTelemetry = GlobalOpenTelemetry.get();
        } else {
            this.openTelemetry = openTelemetry;
        }
        tracer = this.openTelemetry.getTracer("elasticsearch-api");
    }

    protected <RequestT, ResponseT, ErrorT> Span createSpanForRequest(RequestT request,
                                                                      Endpoint<RequestT, ResponseT, ErrorT> endpoint) {
        String httpMethod = endpoint.method(request);
        String route = endpoint.route(request);

        Span span = tracer.spanBuilder(httpMethod + " " + route).setSpanKind(SpanKind.CLIENT).startSpan();
        if (span.isRecording()) {
            span.setAttribute(SemanticAttributes.DB_SYSTEM, "elasticsearch");
            span.setAttribute(SemanticAttributes.HTTP_METHOD, endpoint.method(request));
            span.setAttribute("url.path", endpoint.requestUrl(request));

            Map<String, String> queryParameters = endpoint.queryParameters(request);
            if (!queryParameters.isEmpty()) {
                String queryString =
                        queryParameters.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&"));
                span.setAttribute("url.query", queryString);
            }
            Map<String, String> pathParameters = endpoint.pathParameters(request);
            if (pathParameters.containsKey("index")) {
                String indexValue = pathParameters.get("index");
                span.setAttribute("db.elasticsearch.target", indexValue);
            }

            if (pathParameters.containsKey("id") && route.startsWith("/{index}/_") && route.endsWith("/{id}")) {
                String docId = pathParameters.get("id");
                span.setAttribute("db.elasticsearch.doc_id", docId);
            }
        }

        return span;
    }

    protected void captureHostInformation(@Nullable Span span, HttpHost host) {
        if(span == null){
            return;
        }
        span.setAttribute("server.address", host.getHostName());
        span.setAttribute("server.port", host.getPort());
        span.setAttribute("url.scheme", host.getSchemeName());
    }

    protected <RequestT> void captureBody(@Nullable Span span, RequestT request, Endpoint<RequestT, ?, ?> endpoint,
                                          List<ByteBuffer> lines) {
        if (shouldCaptureBody(span, request, endpoint)) {
            StringBuilder bodyString = new StringBuilder();
            for (ByteBuffer line : lines) {
                bodyString.append(StandardCharsets.UTF_8.decode(line));
                bodyString.append("\n");
            }

            span.setAttribute(SemanticAttributes.DB_STATEMENT, bodyString.toString());
        }
    }

    protected <RequestT> void captureBody(@Nullable Span span, RequestT request, Endpoint<RequestT, ?, ?> endpoint,
                                          ByteArrayOutputStream baos) {
        if (shouldCaptureBody(span, request, endpoint)) {
            span.setAttribute(SemanticAttributes.DB_STATEMENT, baos.toString());
        }
    }

    private <RequestT> boolean shouldCaptureBody(@Nullable Span span, RequestT request, Endpoint<RequestT, ?, ?> endpoint) {
        if (span == null || !span.isRecording()) {
            return false;
        }

        String route = endpoint.route(request);

        // We capture the request body in the span only for search-type requests.
        return route.contains("/_search") ||
                route.contains("/_msearch") ||
                route.contains("/_async_search") ||
                route.equals("/{index}/_terms_enum") ||
                route.startsWith("/_render/template") ||
                route.equals("/{index}/_mvt/{field}/{zoom}/{x}/{y}");
    }


}
