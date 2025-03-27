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
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.http.RepeatableBodyResponse;
import co.elastic.clients.transport.instrumentation.Instrumentation;
import co.elastic.clients.util.BinaryData;
import com.sun.net.httpserver.HttpServer;
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

    // Make the protected method publicly visible in tests
    public static ElasticsearchTransportBase cloneTransportWith(
        ElasticsearchTransportBase transport,
        TransportOptions options,
        JsonpMapper mapper,
        Instrumentation instrumentation
    ) {
        return transport.cloneWith(options, mapper, instrumentation);
    }

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

        ElasticsearchClient esClient = ElasticsearchTestClient.createClient(httpServer, null);

        TransportException ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClient.cat().indices()
        );

        httpServer.stop(0);

        assertEquals(401, ex.statusCode());
        assertEquals("es/cat.indices", ex.endpointId());
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
        InetSocketAddress address = httpServer.getAddress();

        var esClient = ElasticsearchTestClient.createClient(httpServer, null);

        TransportException ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClient.cat().indices()
        );

        assertEquals(200, ex.statusCode());
        assertNotEquals(RepeatableBodyResponse.class, ex.response().getClass());

        // setting transport option
        var transport = (ElasticsearchTransport) esClient._transport().withOptions(o -> o.keepResponseBodyOnException(true));
        ElasticsearchClient esClientOptions = new ElasticsearchClient(transport, null);

        ex = Assertions.assertThrows(
            TransportException.class,
            () -> esClientOptions.cat().indices()
        );

        httpServer.stop(0);

        assertEquals(200, ex.statusCode());

        try (var response = ex.response()){
            BinaryData body = response.body();
            assertTrue(body.isRepeatable());
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
