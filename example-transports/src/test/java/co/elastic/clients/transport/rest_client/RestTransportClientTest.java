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

import co.elastic.clients.transport.TransportHttpClientTest;
import co.elastic.clients.transport.http.TransportHttpClient;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

public class RestTransportClientTest extends TransportHttpClientTest<RestClientHttpClient> {

    public RestTransportClientTest() {
        super(createClient());
    }

    private static RestClientHttpClient createClient() {
        RestClient restClient = RestClient.builder(
            new HttpHost(server.getAddress().getAddress(), server.getAddress().getPort(), "http")
        ).build();

        return new RestClientHttpClient(restClient);
    }
}
