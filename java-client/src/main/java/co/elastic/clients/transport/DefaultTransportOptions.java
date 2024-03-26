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

import co.elastic.clients.transport.http.HeaderMap;
import co.elastic.clients.util.ObjectBuilderBase;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Default implementation of {@link TransportOptions}. Extensions can use it as a base class to provide additional features.
 */
public class DefaultTransportOptions implements TransportOptions {
    private final HeaderMap headers;
    private final Map<String, String> parameters;
    private final Function<List<String>, Boolean> onWarnings;

    public static final DefaultTransportOptions EMPTY = new DefaultTransportOptions();

    public DefaultTransportOptions() {
        this(new HeaderMap(), Collections.emptyMap(), null);
    }

    public DefaultTransportOptions(
        @Nullable HeaderMap headers,
        @Nullable Map<String, String> parameters,
        @Nullable Function<List<String>, Boolean> onWarnings
    ) {
        this.headers = headers == null ? HeaderMap.EMPTY : headers;
        this.parameters = (parameters == null || parameters.isEmpty()) ?
            Collections.emptyMap() : Collections.unmodifiableMap(parameters);
        this.onWarnings = onWarnings;
    }

    protected DefaultTransportOptions(AbstractBuilder<?> builder) {
        this(builder.headers, builder.parameters, builder.onWarnings);
    }

    public static DefaultTransportOptions of(@Nullable TransportOptions options) {
        if (options == null) {
            return new DefaultTransportOptions(null, null, null);
        }
        if (options instanceof DefaultTransportOptions) {
            return (DefaultTransportOptions) options;
        }
        return new DefaultTransportOptions(
            new HeaderMap(entriesToMap(options.headers())),
            options.queryParameters(),
            options.onWarnings()
        );
    }

    @Override
    public Collection<Map.Entry<String, String>> headers() {
        return Collections.unmodifiableSet(headers.entrySet());
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

    public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
        extends ObjectBuilderBase implements TransportOptions.Builder {

        private HeaderMap headers;
        private Map<String, String> parameters;
        private Function<List<String>, Boolean> onWarnings;

        public AbstractBuilder() {
        }

        public AbstractBuilder(DefaultTransportOptions options) {
            this.headers = new HeaderMap(options.headers);
            this.parameters = copyOrNull(options.parameters);
            this.onWarnings = options.onWarnings;
        }

        protected abstract BuilderT self();

        @Override
        public BuilderT addHeader(String name, String value) {
            if (name.equalsIgnoreCase(HeaderMap.CLIENT_META)) {
                // Not overridable
                return self();
            }
            if (this.headers == null) {
                this.headers = new HeaderMap();
            }
            headers.add(name, value);
            return self();
        }

        @Override
        public BuilderT setHeader(String name, String value) {
            if (name.equalsIgnoreCase(HeaderMap.CLIENT_META)) {
                // Not overridable
                return self();
            }
            if (this.headers == null) {
                this.headers = new HeaderMap();
            }
            headers.put(name, value);
            return self();
        }

        @Override
        public BuilderT removeHeader(String name) {
            if (this.headers != null) {
                headers.remove(name);
            }
            return self();
        }

        @Override
        public BuilderT setParameter(String name, String value) {
            if (parameters == null) {
                parameters = new HashMap<>();
            }
            parameters.put(name, value);
            return self();
        }

        @Override
        public BuilderT removeParameter(String name) {
            if (parameters != null) {
                parameters.remove(name);
            };
            return self();
        }

        @Override
        public BuilderT onWarnings(Function<List<String>, Boolean> listener) {
            this.onWarnings = listener;
            return self();
        }

        private <K, V> Map<K, V> copyOrNull(Map<K, V> map) {
            return map.isEmpty() ? null : new HashMap<>(map);
        }
    }

    public static class Builder extends AbstractBuilder<Builder> {

        public Builder() {
            super();
        }

        public Builder(DefaultTransportOptions options) {
            super(options);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TransportOptions build() {
            _checkSingleUse();
            return new DefaultTransportOptions(this);
        }
    }
}
