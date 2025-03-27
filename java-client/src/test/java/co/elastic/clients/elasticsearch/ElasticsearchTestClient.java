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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import java.net.URI;
import java.security.SecureRandom;
import java.util.Base64;

public class ElasticsearchTestClient {

    protected enum ClientImpl { Rest4, Rest5 }

    // Same value for all tests in a test run
    private static final ClientImpl flavor;
    static {
        var flavors = ClientImpl.values();
        flavor = flavors[new SecureRandom().nextInt(flavors.length)];
    }

    private static JsonpMapper mapper(JsonpMapper mapper) {
        return mapper != null ? mapper : new JsonbJsonpMapper();
    }

    public static ElasticsearchClient createClient(String url, @Nullable JsonpMapper mapper, @Nullable SSLContext sslContext) {
        System.out.println("Using a " + flavor + " client");
        return switch (flavor) {
            case Rest4 -> createRest4Client(url, mapper, sslContext);
            case Rest5 -> createRest5Client(url, mapper, sslContext);
        };
    }

    public static ElasticsearchClient createClient(HttpServer server, @Nullable JsonpMapper mapper) {
        var address = server.getAddress();
        return createClient("http://" + address.getHostString() + ":" + address.getPort(), mapper, null);
    }

    public static ElasticsearchClient createRest4Client(String url, @Nullable JsonpMapper mapper, @Nullable SSLContext sslContext) {
        BasicCredentialsProvider credsProv = new BasicCredentialsProvider();
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme")
        );
        var restClient = RestClient.builder(HttpHost.create(url))
            .setHttpClientConfigCallback(hc -> hc
                .setDefaultCredentialsProvider(credsProv)
                .setSSLContext(sslContext)
            )
            .build();
        var transport = new RestClientTransport(restClient, mapper(mapper));
        return new ElasticsearchClient(transport);
    }

    public static ElasticsearchClient createRest5Client(String url, @Nullable JsonpMapper mapper, @Nullable SSLContext sslContext) {
        var pwd = Base64.getEncoder().encodeToString("elastic:changeme".getBytes());
        var restClientBuilder = Rest5Client.builder(org.apache.hc.core5.http.HttpHost.create(URI.create(url)))
            .setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "Basic " + pwd)
            });

        if (sslContext != null) {
            restClientBuilder.setSSLContext(sslContext);
        }

        var transport = new Rest5ClientTransport(restClientBuilder.build(), mapper(mapper));
        return new ElasticsearchClient(transport);
    }
}
