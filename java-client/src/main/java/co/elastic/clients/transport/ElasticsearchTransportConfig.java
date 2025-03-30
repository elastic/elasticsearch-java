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

public class ElasticsearchTransportConfig {
    private List<URI> hosts;
    private String username;
    private String password;
    private String token;
    private String apiKey;
    private SSLContext sslContext;
    private JsonpMapper mapper;
    private TransportOptions transportOptions;
    private Instrumentation instrumentation;
    private Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory;

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

    public Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory() {
        return transportFactory;
    }

    public ElasticsearchTransport buildTransport() {
        return this.transportFactory.apply(this);
    }

    //---------------------------------------------------------------------------------------------

    public static class Builder {

        public final ElasticsearchTransportConfig config = new ElasticsearchTransportConfig();

        public ElasticsearchTransportConfig build() {
            if (config.hosts() == null || config.hosts.isEmpty()) {
                throw new IllegalStateException("hosts cannot be empty");
            }

            if (config.mapper == null) {
                config.mapper = new JacksonJsonpMapper();
            }

            if (config.transportFactory == null) {
                config.transportFactory = Rest5ClientTransport::new;
            }

            return config;
        }

        public Builder host(String url) {
            try {
                config.hosts = List.of(new URI(url));
            } catch (URISyntaxException e) {
                // Avoid requiring a checked exception in the builder
                throw new RuntimeException(e);
            }
            return this;
        }

        public Builder host(URI url) {
            config.hosts = List.of(url);
            return this;
        }

        public Builder hosts(List<URI> hosts) {
            config.hosts = hosts;
            return this;
        }

        /**
         * Set the username and password to use to connect to Elasticsearch.
         */
        public Builder usernameAndPassword(String username, String password) {
            checkNull(config.token, "token", "username/password");
            checkNull(config.apiKey, "API key", "username/password");
            config.username = username;
            config.password = password;
            return this;
        }

        /**
         * Set the bearer token to use to authenticate to Elasticsearch.
         */
        public Builder token(String token) {
            checkNull(config.apiKey, "API key", "token");
            checkNull(config.username, "username", "token");
            config.token = token;
            return this;
        }

        /**
         * Set the API key to use to authenticate to Elasticsearch.
         */
        public Builder apiKey(String apiKey) {
            checkNull(config.token, "token", "API key");
            checkNull(config.username, "username", "API key");
            config.apiKey = apiKey;
            return this;
        }

        /**
         * Set the SSL context. See {@link co.elastic.clients.transport.TransportUtils} to create it
         * from certificate files or a certificate fingerprint.
         *
         * @see co.elastic.clients.transport.TransportUtils
         */
        public Builder sslContext(SSLContext sslContext) {
            config.sslContext = sslContext;
            return this;
        }

        public Builder setHosts(List<URI> hosts) {
            config.hosts = hosts;
            return this;
        }

        /**
         * Set the JSON mapper.
         */
        public Builder jsonMapper(JsonpMapper mapper) {
            config.mapper = mapper;
            return this;
        }

        public Builder instrumentation(Instrumentation instrumentation) {
            config.instrumentation = instrumentation;
            return this;
        }

        public Builder transportOptions(TransportOptions transportOptions) {
            config.transportOptions = transportOptions;
            return this;
        }

        /**
         * Sets lower level transport options. This method <em>adds</em> options to the ones already set, if any.
         */
        public Builder transportOptions(Function<TransportOptions.Builder, TransportOptions.Builder> fn) {
            var builder = config.transportOptions == null ? new DefaultTransportOptions.Builder() : config.transportOptions.toBuilder();
            config.transportOptions = fn.apply(builder).build();
            return this;
        }

        public Builder transportFactory(Function<ElasticsearchTransportConfig, ElasticsearchTransport> factory) {
            config.transportFactory = factory;
            return this;
        }

        /**
         * Should we use the legacy http implementation based on Elasticsearch's Low Level Rest Client?
         */
        public Builder useLegacyTransport(boolean useLegacyTransport) {
            if (useLegacyTransport) {
                config.transportFactory = RestClientTransport.FACTORY;
            } else {
                config.transportFactory = null;
            }
            return this;
        }

        private void checkNull(Object value, String name, String other) {
            if (value != null) {
                throw new IllegalStateException("Cannot set both " + other + " and " + name + ".");
            }
        }
    }
}
