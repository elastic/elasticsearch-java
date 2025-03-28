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

package co.elastic.clients.elasticsearch._helpers.builders;

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.DefaultTransportOptions;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.instrumentation.Instrumentation;
import co.elastic.clients.transport.rest5_client.Rest5ClientOptions;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest5_client.low_level.Rest5ClientBuilder;
import co.elastic.clients.transport.rest_client.RestClientOptions;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

import javax.net.ssl.SSLContext;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.List;
import java.util.function.Function;

/**
 * Base builder class for Elasticsearch sync an async clients.
 *
 * @see ElasticsearchClient.Builder
 * @see ElasticsearchAsyncClient.Builder
 */
public abstract class ElasticsearchClientBuilderBase<T> {

    protected List<URI> hosts;
    protected String username;
    protected String password;
    protected String token;
    protected String apiKey;
    protected SSLContext sslContext;
    protected JsonpMapper mapper;
    protected TransportOptions transportOptions;
    protected Instrumentation instrumentation;
    protected boolean useLegacyTransport = false;

    public abstract T build();

    public ElasticsearchClientBuilderBase<T> host(String url)  {
        try {
            this.hosts = List.of(new URI(url));
        } catch (URISyntaxException e) {
            // Avoid requiring a checked exception in the builder
            throw new RuntimeException(e);
        }
        return this;
    }

    public ElasticsearchClientBuilderBase<T> host(URI url) {
        this.hosts = List.of(url);
        return this;
    }

    public ElasticsearchClientBuilderBase<T> hosts(List<URI> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Set the username and password to use to connect to Elasticsearch.
     */
    public ElasticsearchClientBuilderBase<T> usernameAndPassword(String username, String password) {
        checkNull(this.token, "token", "username/password");
        checkNull(this.apiKey, "API key", "username/password");
        this.username = username;
        this.password = password;
        return this;
    }

    /**
     * Set the bearer token to use to authenticate to Elasticsearch.
     */
    public ElasticsearchClientBuilderBase<T> token(String token) {
        checkNull(this.apiKey, "API key", "token");
        checkNull(this.username, "username", "token");
        this.token = token;
        return this;
    }

    /**
     * Set the API key to use to authenticate to Elasticsearch.
     */
    public ElasticsearchClientBuilderBase<T> apiKey(String apiKey) {
        checkNull(this.token, "token", "API key");
        checkNull(this.username, "username", "API key");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Set the SSL context. See {@link co.elastic.clients.transport.TransportUtils} to create it
     * from certificate files or a certificate fingerprint.
     *
     * @see co.elastic.clients.transport.TransportUtils
     */
    public ElasticsearchClientBuilderBase<T> sslContext(SSLContext sslContext) {
        this.sslContext = sslContext;
        return this;
    }

    public ElasticsearchClientBuilderBase<T> setHosts(List<URI> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Set the JSON mapper.
     */
    public ElasticsearchClientBuilderBase<T> jsonMapper(JsonpMapper mapper) {
        this.mapper = mapper;
        return this;
    }

    public ElasticsearchClientBuilderBase<T> instrumentation(Instrumentation instrumentation) {
        this.instrumentation = instrumentation;
        return this;
    }

    public ElasticsearchClientBuilderBase<T> transportOptions(TransportOptions transportOptions) {
        this.transportOptions = transportOptions;
        return this;
    }

    /**
     * Sets lower level transport options. This method <em>adds</em> options to the ones already set, if any.
     */
    public ElasticsearchClientBuilderBase<T> transportOptions(Function<TransportOptions.Builder, TransportOptions.Builder> fn) {
        var builder = this.transportOptions == null ? new DefaultTransportOptions.Builder() : transportOptions.toBuilder();
        this.transportOptions = fn.apply(builder).build();
        return this;
    }

    /**
     * Should we use the legacy http implementation based on Elasticsearch's Low Level Rest Client?
     */
    public ElasticsearchClientBuilderBase<T> useLegacyTransport(boolean useLegacyTransport) {
        this.useLegacyTransport = useLegacyTransport;
        return this;
    }

    protected ElasticsearchClient doBuild() {
        if (this.hosts == null || this.hosts.isEmpty()) {
            throw new IllegalArgumentException("hosts is required");
        }

        return useLegacyTransport ? buildRest4() : buildRest5();
    }

    public static ElasticsearchClient buildSync(ElasticsearchClientBuilderBase<?> builder) {
        return builder.doBuild();
    }

    public static ElasticsearchAsyncClient buildAsync(ElasticsearchClientBuilderBase<?> builder) {
        ElasticsearchClient client = builder.doBuild();
        TransportOptions clientOptions = client._transportOptions();
        if (client._transport().options() == clientOptions) {
            // No options defined at the client level
            clientOptions = null;
        }
        return new ElasticsearchAsyncClient(client._transport(), clientOptions);
    }

    private ElasticsearchClient buildRest5() {

        Rest5ClientBuilder restClientBuilder = Rest5Client.builder(hosts);

        if (this.username != null && this.password != null) {
            var cred = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
            restClientBuilder.setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "Basic " + cred)
            });
        } else if (this.apiKey != null) {
            restClientBuilder.setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "ApiKey " + apiKey)
            });
        } else if (this.token != null) {
            restClientBuilder.setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "Bearer " + token)
            });
        }

        if (this.sslContext != null) {
            restClientBuilder.setSSLContext(this.sslContext);
        }

        if (this.mapper == null) {
            ObjectMapper mapper = JsonMapper.builder().build();
            this.mapper = new JacksonJsonpMapper(mapper);
        }

        Rest5ClientTransport transport = new Rest5ClientTransport(
            restClientBuilder.build(),
            mapper,
            Rest5ClientOptions.of(transportOptions),
            instrumentation
        );
        return new ElasticsearchClient(transport);
    }

    private ElasticsearchClient buildRest4() {

        RestClientBuilder restClientBuilder = RestClient.builder(hosts.stream()
            .map(h -> HttpHost.create(h.toString())).toArray(HttpHost[]::new)
        );

        if (this.username != null && this.password != null) {
            var cred = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "Basic " + cred)
            });
        } else if (this.apiKey != null) {
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "ApiKey " + apiKey)
            });
        } else if (this.token != null) {
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "Bearer " + token)
            });
        }

        if (sslContext != null) {
            restClientBuilder.setHttpClientConfigCallback(hc -> hc.setSSLContext(sslContext));
        }

        if (this.mapper == null) {
            ObjectMapper mapper = JsonMapper.builder().build();
            this.mapper = new JacksonJsonpMapper(mapper);
        }

        RestClientTransport transport = new RestClientTransport(
            restClientBuilder.build(),
            mapper,
            RestClientOptions.of(transportOptions),
            instrumentation
        );
        return new ElasticsearchClient(transport);
    }

    private void checkNull(Object value, String name, String other) {
        if (value != null) {
            throw new IllegalStateException("Cannot set both " + other + " and " + name + ".");
        }
    }
}
