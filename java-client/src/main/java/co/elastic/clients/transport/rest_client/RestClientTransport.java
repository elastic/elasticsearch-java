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

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.ElasticsearchTransportConfig;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.instrumentation.Instrumentation;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

import javax.annotation.Nullable;
import java.util.Base64;
import java.util.Objects;

public class RestClientTransport extends ElasticsearchTransportBase {

    private final RestClient restClient;

    public RestClientTransport(ElasticsearchTransportConfig config) {
        this(
            buildRestClient(config),
            config.mapper(),
            RestClientOptions.of(config.transportOptions()),
            config.instrumentation()
        );
    }

    public RestClientTransport(RestClient restClient, JsonpMapper jsonpMapper) {
        this(restClient, jsonpMapper, null);
    }

    public RestClientTransport(RestClient restClient, JsonpMapper jsonpMapper, RestClientOptions options) {
        super(new RestClientHttpClient(restClient), options, jsonpMapper, null);
        this.restClient = restClient;
    }

    public RestClientTransport(RestClient restClient, JsonpMapper jsonpMapper, RestClientOptions options, Instrumentation instrumentation) {
        super(new RestClientHttpClient(restClient), options, jsonpMapper, instrumentation);
        this.restClient = restClient;
    }

    private static RestClient buildRestClient(ElasticsearchTransportConfig config) {
        RestClientBuilder restClientBuilder = RestClient.builder(config.hosts().stream()
            .map(h -> new HttpHost(h.getHost(), h.getPort(), h.getScheme())).toArray(HttpHost[]::new)
        );

        String prefix = config.hosts().get(0).getPath();
        if (config.hosts().size() > 1) {
            for (var host : config.hosts()) {
                if (!Objects.equals(host.getPath(), prefix)) {
                    throw new IllegalArgumentException(
                        "All hosts must have the same URL path (" +
                        config.hosts().get(0) + " and " + host + ")"
                    );
                }
            }
        }

        if (prefix != null && !prefix.isEmpty()) {
            restClientBuilder.setPathPrefix(prefix);
        }

        if (config.username() != null && config.password() != null) {
            var cred = Base64.getEncoder().encodeToString((config.username() + ":" + config.password()).getBytes());
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "Basic " + cred)
            });
        } else if (config.apiKey() != null) {
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "ApiKey " + config.apiKey())
            });
        } else if (config.token() != null) {
            restClientBuilder.setDefaultHeaders(new org.apache.http.Header[]{
                new org.apache.http.message.BasicHeader("Authorization", "Bearer " + config.token())
            });
        }

        if (config.sslContext() != null) {
            restClientBuilder.setHttpClientConfigCallback(hc -> hc.setSSLContext(config.sslContext()));
        }

        restClientBuilder.setCompressionEnabled(config.useCompression());

        return restClientBuilder.build();
    }

    public RestClient restClient() {
        return this.restClient;
    }


    @Override
    public Transport withOptions(@Nullable TransportOptions options) {
        return new RestClientTransport(restClient, mapper, RestClientOptions.of(options), instrumentation);
    }

    /** INTERNAL, used only for tests. */
    @Override
    protected ElasticsearchTransportBase cloneWith(TransportOptions options, JsonpMapper mapper, Instrumentation instrumentation) {
        return new RestClientTransport(
            restClient,
            mapper != null ? mapper : this.mapper,
            RestClientOptions.of(options != null ? options : this.transportOptions),
            instrumentation != null ? instrumentation : this.instrumentation
        );
    }
}
