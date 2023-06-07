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

package co.elastic.clients.transport.netty;

import co.elastic.clients.transport.TransportOptions;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class DefaultOptions implements TransportOptions {
    private final Map<String, String> headers;
    private final Map<String, String> parameters;
    private final Function<List<String>, Boolean> onWarnings;

    public DefaultOptions() {
        this(Collections.emptyMap(), Collections.emptyMap(), null);
    }

    public DefaultOptions(TransportOptions options) {
        this(
            entriesToMap(options.headers()),
            options.queryParameters(),
            options.onWarnings()
        );
    }

    public DefaultOptions(
        Map<String, String> headers,
        Map<String, String> parameters,
        Function<List<String>, Boolean> onWarnings
    ) {
        this.headers = headers.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(headers);
        this.parameters = parameters.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(parameters);
        this.onWarnings = onWarnings;
    }

    @Override
    public Collection<Map.Entry<String, String>> headers() {
        return headers.entrySet();
    }

    @Override
    public Map<String, String> queryParameters() {
        return parameters;
    }

    @Override
    public Function<List<String>, Boolean> onWarnings() {
        return onWarnings;
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    private static <K, V> Map<K, V> entriesToMap(Collection<Map.Entry<K, V>> entries) {
        if (entries.isEmpty()) {
            return Collections.emptyMap();
        } else {
            HashMap<K, V> map = new HashMap<>();
            for (Map.Entry<K, V> entry: entries) {
                map.put(entry.getKey(), entry.getValue());
            }
            return map;
        }
    }

    public static class Builder implements TransportOptions.Builder {
        private Map<String, String> headers;
        private Map<String, String> parameters;
        private Function<List<String>, Boolean> onWarnings;

        public Builder() {
        }

        public Builder(DefaultOptions options) {
            this.headers = copyOrNull(options.headers);
            this.parameters = copyOrNull(options.parameters);
            this.onWarnings = options.onWarnings;
        }

        @Override
        public TransportOptions.Builder addHeader(String name, String value) {
            if (headers == null) {
                headers = new HashMap<>();
            }
            headers.put(name, value);
            return this;
        }

        @Override
        public TransportOptions.Builder setParameter(String name, String value) {
            if (parameters == null) {
                parameters = new HashMap<>();
            }
            parameters.put(name, value);
            return this;
        }

        @Override
        public TransportOptions.Builder onWarnings(Function<List<String>, Boolean> listener) {
            this.onWarnings = listener;
            return this;
        }

        @Override
        public TransportOptions build() {
            return new DefaultOptions(
                headers == null ? Collections.emptyMap() : headers,
                parameters == null ? Collections.emptyMap() : parameters,
                onWarnings
            );
        }

        private <K, V> Map<K, V> copyOrNull(Map<K, V> map) {
            return map.isEmpty() ? null : new HashMap<>(map);
        }
    }
}
