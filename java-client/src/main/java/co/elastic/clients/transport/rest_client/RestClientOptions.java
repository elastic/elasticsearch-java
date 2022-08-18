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

import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.Version;
import co.elastic.clients.util.VisibleForTesting;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.util.VersionInfo;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.WarningsHandler;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RestClientOptions implements TransportOptions {

    private final RequestOptions options;

    private static final String CLIENT_META_HEADER = "X-Elastic-Client-Meta";
    private static final String USER_AGENT_HEADER = "User-Agent";

    @VisibleForTesting
    static final String CLIENT_META_VALUE = getClientMeta();
    @VisibleForTesting
    static final String USER_AGENT_VALUE = getUserAgent();

    static RestClientOptions of(TransportOptions options) {
        if (options instanceof RestClientOptions) {
            return (RestClientOptions)options;

        } else {
            final Builder builder = new Builder(RequestOptions.DEFAULT.toBuilder());
            options.headers().forEach(h -> builder.addHeader(h.getKey(), h.getValue()));
            options.queryParameters().forEach(builder::setParameter);
            builder.onWarnings(options.onWarnings());
            return builder.build();
        }
    }

    public RestClientOptions(RequestOptions options) {
        this.options = addBuiltinHeaders(options.toBuilder()).build();
    }

    /**
     * Get the wrapped Rest Client request options
     */
    public RequestOptions restClientRequestOptions() {
        return this.options;
    }

    @Override
    public Collection<Map.Entry<String, String>> headers() {
        return options.getHeaders().stream()
            .map(h -> new AbstractMap.SimpleImmutableEntry<>(h.getName(), h.getValue()))
            .collect(Collectors.toList());
    }

    @Override
    public Map<String, String> queryParameters() {
        return options.getParameters();
    }

    /**
     * Called if there are warnings to determine if those warnings should fail the request.
     */
    @Override
    public Function<List<String>, Boolean> onWarnings() {
        final WarningsHandler handler = options.getWarningsHandler();
        if (handler == null) {
            return null;
        }

        return warnings -> options.getWarningsHandler().warningsShouldFailRequest(warnings);
    }

    @Override
    public Builder toBuilder() {
        return new Builder(options.toBuilder());
    }

    public static class Builder implements TransportOptions.Builder {

        private RequestOptions.Builder builder;

        public Builder(RequestOptions.Builder builder) {
            this.builder = builder;
        }

        /**
         * Get the wrapped Rest Client request options builder.
         */
        public RequestOptions.Builder restClientRequestOptionsBuilder() {
            return this.builder;
        }

        @Override
        public TransportOptions.Builder addHeader(String name, String value) {
            if (name.equalsIgnoreCase(CLIENT_META_HEADER)) {
                // Not overridable
                return this;
            }
            if (name.equalsIgnoreCase(USER_AGENT_HEADER)) {
                // We must remove our own user-agent from the options, or we'll end up with multiple values for the header
                builder.removeHeader(USER_AGENT_HEADER);
            }
            builder.addHeader(name, value);
            return this;
        }

        @Override
        public TransportOptions.Builder setParameter(String name, String value) {
            builder.addParameter(name, value);
            return this;
        }

        /**
         * Called if there are warnings to determine if those warnings should fail the request.
         */
        @Override
        public TransportOptions.Builder onWarnings(Function<List<String>, Boolean> listener) {
            if (listener == null) {
                builder.setWarningsHandler(null);
            } else {
                builder.setWarningsHandler(w -> {
                    if (w != null && !w.isEmpty()) {
                        return listener.apply(w);
                    } else {
                        return false;
                    }
                });
            }

            return this;
        }

        @Override
        public RestClientOptions build() {
            return new RestClientOptions(addBuiltinHeaders(builder).build());
        }
    }

    static RestClientOptions initialOptions() {
        return new RestClientOptions(RequestOptions.DEFAULT);
    }

    private static RequestOptions.Builder addBuiltinHeaders(RequestOptions.Builder builder) {
        builder.removeHeader(CLIENT_META_HEADER);
        builder.addHeader(CLIENT_META_HEADER, CLIENT_META_VALUE);
        if (builder.getHeaders().stream().noneMatch(h -> h.getName().equalsIgnoreCase(USER_AGENT_HEADER))) {
            builder.addHeader(USER_AGENT_HEADER, USER_AGENT_VALUE);
        }
        if (builder.getHeaders().stream().noneMatch(h -> h.getName().equalsIgnoreCase("Accept"))) {
            builder.addHeader("Accept", RestClientTransport.JsonContentType.toString());
        }

        return builder;
    }

    private static String getUserAgent() {
        return String.format(
            Locale.ROOT,
            "elastic-java/%s (Java/%s)",
            Version.VERSION == null ? "Unknown" : Version.VERSION.toString(),
            System.getProperty("java.version")
        );
    }

    private static String getClientMeta() {
        VersionInfo httpClientVersion = null;
        try {
            httpClientVersion = VersionInfo.loadVersionInfo(
                "org.apache.http.nio.client",
                HttpAsyncClientBuilder.class.getClassLoader()
            );
        } catch (Exception e) {
            // Keep unknown
        }

        // Use a single 'p' suffix for all prerelease versions (snapshot, beta, etc).
        String metaVersion = Version.VERSION == null ? "" : Version.VERSION.toString();
        int dashPos = metaVersion.indexOf('-');
        if (dashPos > 0) {
            metaVersion = metaVersion.substring(0, dashPos) + "p";
        }

        // service, language, transport, followed by additional information
        return "es="
            + metaVersion
            + ",jv="
            + System.getProperty("java.specification.version")
            + ",hl=2"
            + ",t="
            + metaVersion
            + ",hc="
            + (httpClientVersion == null ? "" : httpClientVersion.getRelease())
            + LanguageRuntimeVersions.getRuntimeMetadata();
    }
}
