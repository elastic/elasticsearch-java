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

package co.elastic.clients.elasticsearch._helpers.builders.rest5_client;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.rest5_client.Rest5ClientOptions;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest5_client.low_level.Rest5ClientBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.message.BasicHeader;

import javax.net.ssl.SSLContext;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Optional;

// TODO do we want separate builder subclasses to make sure that only 1 auth method has been provided?
public class ElasticsearchClientBuilder {

    private HttpHost host;
    private String username;
    private String password;
    private String token;
    private String apiKey;
    private SSLContext sslContext;
    private JsonpMapper mapper;
    private Rest5ClientOptions transportOptions;

    public ElasticsearchClientBuilder host(String url) throws URISyntaxException {
        this.host = HttpHost.create(url);
        return this;
    }

    public ElasticsearchClientBuilder usernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    public ElasticsearchClientBuilder token(String token) {
        this.token = token;
        return this;
    }

    public ElasticsearchClientBuilder apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public ElasticsearchClientBuilder sslContext(SSLContext sslContext) {
        this.sslContext = sslContext;
        return this;
    }

    public ElasticsearchClientBuilder jsonMapper(JsonpMapper mapper) {
        this.mapper = mapper;
        return this;
    }

    public ElasticsearchClientBuilder transportOptions(Rest5ClientOptions transportOptions) {
        this.transportOptions = transportOptions;
        return this;
    }

    public ElasticsearchClient build() {

        // defaulting to localhost
        if (this.host == null) {
            try {
                this.host = HttpHost.create("http://localhost:9200");
            } catch (URISyntaxException e) {
                // can't throw
            }
        }

        Rest5ClientBuilder restClientBuilder = Rest5Client.builder(host);

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

        try {
            restClientBuilder.setSSLContext(Optional.ofNullable(sslContext).orElse(SSLContext.getDefault()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        if (this.mapper == null) {
            ObjectMapper mapper = JsonMapper.builder().build();
            this.mapper = new JacksonJsonpMapper(mapper);
        }

        Rest5ClientTransport transport = new Rest5ClientTransport(restClientBuilder.build(), mapper, transportOptions);
        return new ElasticsearchClient(transport);
    }
}
