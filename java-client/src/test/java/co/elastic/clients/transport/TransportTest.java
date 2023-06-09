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

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.sun.net.httpserver.HttpServer;
import org.apache.http.HttpHost;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class TransportTest extends Assertions {

    @Test
    public void testXMLResponse() throws Exception {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        httpServer.createContext("/_cat/indices", exchange -> {
            exchange.sendResponseHeaders(401, 0);
            OutputStream out = exchange.getResponseBody();
            out.write(
                "<?xml version=\"1.0\"?><error>Error</error>".getBytes(StandardCharsets.UTF_8)
            );
            out.close();
        });

        httpServer.start();
        InetSocketAddress address = httpServer.getAddress();

        RestClient restClient = RestClient
            .builder(new HttpHost(address.getHostString(), address.getPort(), "http"))
            .build();

        ElasticsearchClient esClient = new ElasticsearchClient(new RestClientTransport(restClient, new JacksonJsonpMapper()));

        TransportException ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClient.cat().indices()
        );

        httpServer.stop(0);

        assertEquals(401, ex.statusCode());
        assertEquals("es/cat.indices", ex.endpointId());

        // Original response is transport-dependent
        Response restClientResponse = (Response)ex.response().originalResponse();
        assertEquals(401, restClientResponse.getStatusLine().getStatusCode());
    }
}
