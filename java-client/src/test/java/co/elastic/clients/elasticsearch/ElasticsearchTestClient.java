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
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.ElasticsearchTransportConfig;
import co.elastic.clients.transport.rest5_client.Rest5ClientTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import java.security.SecureRandom;
import java.util.function.Function;

public class ElasticsearchTestClient {

    protected enum ClientImpl {
        Rest4,
        Rest5;

        Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory() {
            return switch (this) {
                case Rest4 -> RestClientTransport::new;
                case Rest5 -> Rest5ClientTransport::new;
            };
        }
    }

    // Same value for all tests in a test run
    private static final ClientImpl flavor;

    static {
        var flavors = ClientImpl.values();
        flavor = flavors[new SecureRandom().nextInt(flavors.length)];
    }

    private static JsonpMapper mapper(JsonpMapper mapper) {
        return mapper != null ? mapper : new JsonbJsonpMapper();
    }

    public static ElasticsearchClient createClient(String url, @Nullable JsonpMapper mapper,
                                                   @Nullable SSLContext sslContext,
                                                   @Nullable String password) {
        System.out.println("Using a " + flavor + " client");

        String pwd = password == null ? "changeme" : password;

        return ElasticsearchClient.of(b -> b
            .host(url)
            .jsonMapper(mapper(mapper))
            .usernameAndPassword("elastic", pwd)
            .sslContext(sslContext)
            .transportFactory(flavor.transportFactory())
        );
    }

    public static ElasticsearchClient createClient(HttpServer server, @Nullable JsonpMapper mapper) {
        var address = server.getAddress();
        return createClient("http://" + address.getHostString() + ":" + address.getPort(), mapper, null,
            null);
    }

    public static Function<ElasticsearchTransportConfig, ElasticsearchTransport> transportFactory() {
        System.out.println("Using a " + flavor + " client");
        return flavor.transportFactory();
    }
}
