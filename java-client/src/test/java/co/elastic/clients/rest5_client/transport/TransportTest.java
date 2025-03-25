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

package clients.rest5_client.transport;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.TransportException;
import co.elastic.clients.transport.http.RepeatableBodyResponse;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.transport.rest_client.RestClientOptions;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import co.elastic.clients.util.BinaryData;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.core5.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static co.elastic.clients.util.ContentType.APPLICATION_JSON;

public class TransportTest extends Assertions {

    @Test
    public void testXMLResponse() throws Exception {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(),
            0), 0);

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
            .builder(new HttpHost("http",httpServer.getAddress().getHostString(), httpServer.getAddress().getPort()))
            .build();

        ElasticsearchClient esClient = new ElasticsearchClient(new RestClientTransport(restClient,
            new JacksonJsonpMapper()));

        TransportException ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClient.cat().indices()
        );

        httpServer.stop(0);

        assertEquals(401, ex.statusCode());
        assertEquals("es/cat.indices", ex.endpointId());

        // Original response is transport-dependent
        Response restClientResponse = (Response) ex.response().originalResponse();
        assertEquals(401, restClientResponse.getStatusCode());
    }


    @Test
    public void testOriginalJsonBodyRetrievalException() throws Exception {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(),
            0), 0);

        httpServer.createContext("/_cat/indices", exchange -> {
            exchange.getResponseHeaders().put("Content-Type", Collections.singletonList(APPLICATION_JSON));
            exchange.getResponseHeaders().put("X-Elastic-Product", Collections.singletonList("Elasticsearch"
            ));
            exchange.sendResponseHeaders(200, 0);
            OutputStream out = exchange.getResponseBody();
            out.write(
                "definitely not json".getBytes(StandardCharsets.UTF_8)
            );
            out.close();
        });

        httpServer.start();

        RestClient restClient = RestClient
            .builder(new HttpHost("http",httpServer.getAddress().getHostString(), httpServer.getAddress().getPort()))
            .build();

        // no transport options, response is not RepeatableBodyResponse, original body cannot be retrieved
        ElasticsearchClient esClient = new ElasticsearchClient(new RestClientTransport(restClient,
            new JacksonJsonpMapper()));

        TransportException ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClient.cat().indices()
        );

        assertEquals(200, ex.statusCode());
        assertNotEquals(RepeatableBodyResponse.class, ex.response().getClass());

        // setting transport option
        RestClientOptions options = new RestClientOptions(RequestOptions.DEFAULT, true);

        ElasticsearchTransport transport = new RestClientTransport(
            restClient, new JacksonJsonpMapper(), options);

        ElasticsearchClient esClientOptions = new ElasticsearchClient(transport);

        ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClientOptions.cat().indices()
        );

        httpServer.stop(0);

        assertEquals(200, ex.statusCode());
        //TODO apparently the new byteentity is always repeatable
        // no need for the whole RepeatableBodyResponse if true?
        //assertEquals(RepeatableBodyResponse.class, ex.response().getClass());

        try (TransportHttpClient.Response repeatableResponse = ex.response()){
            BinaryData body = repeatableResponse.body();
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(body.asInputStream()));
                String read;

                while ((read = br.readLine()) != null) {
                    sb.append(read);
                }
                br.close();
            assertEquals("definitely not json",sb.toString());
        }
    }
}
