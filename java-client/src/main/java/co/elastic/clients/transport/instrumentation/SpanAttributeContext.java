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

import javax.annotation.Nullable;

/**
 * The context handed to a {@link SpanAttributeProvider} for a single Elasticsearch span. It exposes read access to the
 * HTTP response headers and a sink to stamp attributes onto the span, without leaking the underlying OpenTelemetry
 * {@code Span} type into the extension API.
 */
public interface SpanAttributeContext {

    /**
     * Returns the first value of the given response header, or {@code null} if absent. Header names are
     * case-insensitive. Useful for providers that pick up cluster identity from a proxy-supplied header (for example
     * {@code X-Found-Handling-Cluster} on Elastic Cloud) before falling back to active discovery.
     */
    @Nullable
    String responseHeader(String name);

    /**
     * Stamps an attribute onto the current span. A {@code null} value is ignored, so providers can call this
     * unconditionally with a possibly-unresolved value.
     */
    void setAttribute(String key, @Nullable String value);
}
