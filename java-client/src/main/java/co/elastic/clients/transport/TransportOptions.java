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

package co.elastic.clients.transport;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Container for all application-specific or request-specific
 * options, including headers, query parameters, timeouts and
 * warning handlers.
 *
 * This class is not publicly constructable. Instead, users
 * should use the {@link #DEFAULT} instance either directly or
 * as a basis for a {@link Builder} via the {@link #toBuilder()}
 * method.
 */
public class TransportOptions {

    public static final TransportOptions DEFAULT;

    static {
        TransportOptions options;
        try {
            options = new TransportOptions(

                // Default headers
                Arrays.asList(
                    AcceptType.forMediaType(MediaType.vendorElasticsearchJSON()).toHeader(),
                    ContentType.forMediaType(MediaType.vendorElasticsearchJSON()).toHeader(),
                    ClientMetadata.forLocalSystem().toHeader(),
                    UserAgent.DEFAULT.toHeader()
                ),

                // Default query parameters
                Collections.emptyList(),

                // Timeout
                null,

                // Warning callback
                null

            );
        } catch(Exception e) {
            // FIXME: revisit to have finer-grained fallbacks
            options = new TransportOptions(Collections.emptyList(), Collections.emptyList(), null, null);
            e.printStackTrace();
        }
        DEFAULT = options;
    }

    /**
     * Builder for constructing {@link TransportOptions} instances.
     * This is typically obtained via the {@link #toBuilder()}
     * method, i.e. {@code TransportOptions.DEFAULT.toBuilder()}.
     */
    public static class Builder {

        private final Map<String, Header> headers;
        private final Map<String, QueryParameter> queryParameters;
        private Duration timeout;
        private Consumer<List<String>> onWarning;

        private Builder() {
            this.headers = new HashMap<>();
            this.queryParameters = new HashMap<>();
            this.timeout = null;
            this.onWarning = null;
        }

        /**
         * Add a {@link Header}.
         *
         * {@link Header} instances can be constructed via a {@code toHeader}
         * method, such as {@code UserAgent.DEFAULT.toHeader()} or by using
         * the {@code Header.raw(...)} factory method.
         *
         * @param header {@link Header} to add
         * @return this {@link Builder} instance (for chaining)
         */
        public Builder withHeader(Header header) {
            headers.put(header.name(), header);
            return this;
        }

        public Builder withQueryParameter(QueryParameter parameter) {
            queryParameters.put(parameter.name(), parameter);
            return this;
        }

        public Builder withTimeout(Duration value) {
            timeout = value;
            return this;
        }

        public Builder withWarningHandler(Consumer<List<String>> callback) {
            onWarning = callback;
            return this;
        }

        /**
         * Return a {@link List} of all {@link Header} objects,
         * including those with null values.
         *
         * @return {@link List} of {@link Header} objects
         */
        public List<Header> headers() {
            return new ArrayList<>(headers.values());
        }

        /**
         * Return a {@link List} of all {@link QueryParameter}
         * objects, including those with null values.
         *
         * @return {@link List} of {@link QueryParameter} objects
         */
        public List<QueryParameter> queryParameters() {
            return new ArrayList<>(queryParameters.values());
        }

        public Duration timeout() {
            return timeout;
        }

        public Consumer<List<String>> onWarning() {
            return onWarning;
        }

        public TransportOptions build() {
            return new TransportOptions(headers.values(), queryParameters.values(), timeout, onWarning);
        }

    }

    private final Map<String, Header> headers;
    private final Map<String, QueryParameter> queryParameters;
    private final Duration timeout;
    private final Consumer<List<String>> onWarning;

    private TransportOptions(Iterable<Header> headers,
                           Iterable<QueryParameter> queryParameters,
                           Duration timeout,
                           Consumer<List<String>> onWarning) {
        this.headers = new HashMap<>();
        headers.forEach(header -> this.headers.put(header.name(), header));
        this.queryParameters = new HashMap<>();
        queryParameters.forEach(parameter -> this.queryParameters.put(parameter.name(), parameter));
        this.timeout = timeout;
        this.onWarning = onWarning;
    }


    /**
     * Return all headers with a non-null value.
     *
     * Internally, headers may contain null values, which can be used to
     * "silence" features such as tracking. While this information needs to
     * be propagated through the {@link Builder} process, it is not required
     * in the final compiled list of headers, which this method provides
     * access to.
     *
     * To access the full list of headers, including null-valued headers,
     * first convert to a {@link Builder}, e.g.:
     * {@code List<Header> allHeaders = options.toBuilder().headers();}
     *
     * @return list of {@link Header} objects
     */
    public List<Header> headers() {
        return headers.values().stream().filter(header ->
                header.value() != null).collect(Collectors.toList());
    }

    /**
     * Return all query parameters with a non-null value.
     *
     * Internally, parameters may contain null values, which can be used to
     * "silence" features if required. While this information needs to
     * be propagated through the {@link Builder} process, it is not required
     * in the final compiled list of parameters, which this method provides
     * access to.
     *
     * To access the full list of parameters, including null-valued parameters,
     * first convert to a {@link Builder}, e.g.:
     * {@code List<QueryParameter> allParameters = options.toBuilder().queryParameters();}
     *
     * @return list of {@link QueryParameter} objects
     */
    public List<QueryParameter> queryParameters() {
        return queryParameters.values().stream().filter(parameter ->
                parameter.value() != null).collect(Collectors.toList());
    }

    public Duration timeout() {
        return timeout;
    }

    public Consumer<List<String>> onWarning() {
        return onWarning;
    }

    /**
     * Obtain a {@link Builder} instance based on this object, copying
     * across all contained values.
     *
     * @return new {@link Builder} instance
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        // Use headers instead of headers() for full list
        headers.values().forEach(builder::withHeader);
        // Use queryParameters instead of queryParameters() for full list
        queryParameters.values().forEach(builder::withQueryParameter);
        if (timeout != null) {
            builder.withTimeout(timeout);
        }
        if (onWarning != null) {
            builder.withWarningHandler(onWarning);
        }
        return builder;
    }

}
