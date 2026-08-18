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

/**
 * Extension point for contributing additional attributes to the OpenTelemetry spans produced by
 * {@link OpenTelemetryForElasticsearch}.
 * <p>
 * This is the reusable alternative to adding a new configuration flag for every attribute: instead of baking each
 * new attribute into the instrumentation, callers (or Elastic itself) register a provider that contributes it. Elastic
 * ships {@link ClusterInfoProvider} as the default provider for cluster identity; anyone who needs an additional
 * attribute can implement this interface and register it the same way, with no changes to the core instrumentation.
 * <p>
 * Providers are invoked once the HTTP response has been received, so they can inspect response headers (for example the
 * {@code X-Found-Handling-Cluster} header set by the Elastic Cloud proxy) before deciding what to contribute.
 * <p>
 * Implementations <b>must not</b> block the calling thread: {@link #contribute(SpanAttributeContext)} runs on the
 * request path. Any expensive work (such as a network call) must be performed asynchronously and cached, and any
 * failure must be swallowed so it never affects the actual request.
 */
public interface SpanAttributeProvider {

    /**
     * Contribute attributes to the current Elasticsearch span.
     * <p>
     * Called after the HTTP response has been received. Implementations add attributes via
     * {@link SpanAttributeContext#setAttribute(String, String)}. This method must be cheap and non-blocking, and must
     * never throw: any exception is caught and logged at debug level by the caller.
     *
     * @param context the context for the current span, exposing response headers and the span attribute sink
     */
    void contribute(SpanAttributeContext context);
}
