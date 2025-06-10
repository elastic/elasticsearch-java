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

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.instrumentation.Instrumentation;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.function.Function;

public abstract class ElasticsearchTransportConfig {
    protected List<URI> hosts;
    protected String username;
    protected String password;
    protected String token;
    protected String apiKey;
    protected boolean useCompression = false;
    protected SSLContext sslContext;
    protected JsonpMapper mapper;
    protected TransportOptions transportOptions;
    protected Instrumentation instrumentation;

    public List<URI> hosts() {
        return hosts;
    }

    @Nullable
    public String username() {
        return username;
    }

    @Nullable
    public String password() {
        return password;
    }

    @Nullable
    public String token() {
        return token;
    }

    @Nullable
    public String apiKey() {
        return apiKey;
    }

    public boolean useCompression() {
        return useCompression;
    }

    @Nullable
    public SSLContext sslContext() {
        return sslContext;
    }

    public JsonpMapper mapper() {
        return mapper;
    }

    public TransportOptions transportOptions() {
        return transportOptions;
    }

    @Nullable
    public Instrumentation instrumentation() {
        return instrumentation;
    }

    public abstract ElasticsearchTransport buildTransport();

    //---------------------------------------------------------------------------------------------

    /**
     * Default configuration that can be used with any transport implementation. If no transport
     * factory is defined with {@link #transportFactory}, a {@link Rest5ClientTransport} is used.
     */
    public static class Default extends ElasticsearchTransportConfig {

        protected Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory;

        public Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory() {
            return transportFactory;
        }

        public ElasticsearchTransport buildTransport() {
            return this.transportFactory.apply(this);
        }
    }

    /**
     * Builder for {@link Default} transport configurations.
     */
    public static class Builder extends ElasticsearchTransportConfig.AbstractBuilder<Builder> {
        private final Default dconfig;

        public Builder() {
            this(new Default());
        }

        private Builder(Default dconfig) {
            super(dconfig);
            // Typed accessor to this.config
            this.dconfig = dconfig;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Should we use the legacy http implementation based on Elasticsearch's Low Level Rest Client?
         * <p>
         * Shortcut for {@code transportFactory(RestClientTransport::new)}.
         *
         * @see RestClientTransport
         */
        public Builder useLegacyTransport(boolean useLegacyTransport) {
            if (useLegacyTransport) {
                dconfig.transportFactory = RestClientTransport::new;
            } else {
                dconfig.transportFactory = null;
            }
            return this;
        }

        /**
         * Defines the factory function to create a transport with this configuration.
         *
         * @see #buildTransport()
         */
        public Builder transportFactory(Function<ElasticsearchTransportConfig, ElasticsearchTransport> factory) {
            dconfig.transportFactory = factory;
            return this;
        }

        @Override
        public Default build() {
            Default config = (Default) super.build();

            // Default transport implementation
            if (config.transportFactory == null) {
                config.transportFactory = Rest5ClientTransport::new;
            }

            return config;
        }
    }

    //---------------------------------------------------------------------------------------------

    public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
        protected final ElasticsearchTransportConfig config;

        public AbstractBuilder(ElasticsearchTransportConfig config) {
            this.config = config;
        }

        protected abstract BuilderT self();

        protected ElasticsearchTransportConfig build() {

            //---- Validate credentials

            if (config.username != null) {
                checkNull(config.token, "token", "username/password");
                checkNull(config.apiKey, "API key", "username/password");
                if (config.password == null) {
                    throw new IllegalArgumentException("password required with username");
                }
            } else if (config.password != null) {
                throw new IllegalArgumentException("username required with password");
            }

            if (config.token != null) {
                checkNull(config.apiKey, "API key", "token");
                checkNull(config.username, "username", "token");
            }

            if (config.apiKey != null) {
                checkNull(config.token, "token", "API key");
                checkNull(config.username, "username", "API key");
            }

            //---- Validate other settings

            if (config.hosts() == null || config.hosts.isEmpty()) {
                throw new IllegalArgumentException("hosts cannot be empty");
            }

            if (config.mapper == null) {
                config.mapper = new JacksonJsonpMapper();
            }

            return config;
        }

        /**
         * Elasticsearch host location
         */
        public BuilderT host(String url) {
            try {
                config.hosts = List.of(new URI(url));
            } catch (URISyntaxException e) {
                // Avoid requiring a checked exception in the builder
                throw new RuntimeException(e);
            }
            return self();
        }

        /**
         * Elasticsearch host location
         */
        public BuilderT host(URI url) {
            config.hosts = List.of(url);
            return self();
        }

        /**
         * Elasticsearch hosts locations
         */
        public BuilderT hosts(List<URI> hosts) {
            config.hosts = hosts;
            return self();
        }

        /**
         * Set the username and password to use to connect to Elasticsearch.
         */
        public BuilderT usernameAndPassword(String username, String password) {
            config.username = username;
            config.password = password;
            return self();
        }

        /**
         * Set the bearer token to use to authenticate to Elasticsearch.
         */
        public BuilderT token(String token) {
            config.token = token;
            return self();
        }

        /**
         * Set the API key to use to authenticate to Elasticsearch.
         */
        public BuilderT apiKey(String apiKey) {
            config.apiKey = apiKey;
            return self();
        }

        /**
         * Should request and response body compression be used?
         */
        public BuilderT useCompression(boolean useCompression) {
            this.config.useCompression = useCompression;
            return self();
        }

        /**
         * SSL context to use for https connections. See {@link co.elastic.clients.transport.TransportUtils} to create it
         * from a certificate file or a certificate fingerprint.
         *
         * @see co.elastic.clients.transport.TransportUtils
         */
        public BuilderT sslContext(SSLContext sslContext) {
            config.sslContext = sslContext;
            return self();
        }

        /**
         * The JSON mapper to use. Defaults to {@link JacksonJsonpMapper}.
         */
        public BuilderT jsonMapper(JsonpMapper mapper) {
            config.mapper = mapper;
            return self();
        }

        /**
         * Transport instrumentation to log client traffic. See
         * {@link co.elastic.clients.transport.instrumentation.OpenTelemetryForElasticsearch} for OpenTelemetry integration.
         */
        public BuilderT instrumentation(Instrumentation instrumentation) {
            config.instrumentation = instrumentation;
            return self();
        }

        /**
         * Lower level transport options.
         */
        public BuilderT transportOptions(TransportOptions transportOptions) {
            config.transportOptions = transportOptions;
            return self();
        }

        /**
         * Lower level transport options. This method <em>adds</em> options to the ones already set, if any.
         */
        public BuilderT transportOptions(Function<TransportOptions.Builder, TransportOptions.Builder> fn) {
            var builder = config.transportOptions == null ? new DefaultTransportOptions.Builder() : config.transportOptions.toBuilder();
            config.transportOptions = fn.apply(builder).build();
            return self();
        }

        protected void checkNull(Object value, String name, String other) {
            if (value != null) {
                throw new IllegalArgumentException("Cannot set both " + other + " and " + name + ".");
            }
        }
    }
}
