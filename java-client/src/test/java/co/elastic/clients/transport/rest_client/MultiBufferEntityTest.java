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

import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class MultiBufferEntityTest {

    @Test
    public void testBulkRequest() throws IOException {

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        httpServer.createContext("/_bulk", exchange -> {
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            byte[] bytes = IOUtils.toByteArray(exchange.getRequestBody());
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write(bytes);
            exchange.close();
        });

        httpServer.start();

        RestClient restClient =
            RestClient.builder(new HttpHost(httpServer.getAddress().getAddress(), httpServer.getAddress().getPort())).build();

        BulkRequest req = BulkRequest.of(_0 -> _0
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("abc")
                    .document("abc-doc")
                ))
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("def")
                    .document("def-doc")
                ))
            .operations(_1 -> _1
                .update(_2 -> _2
                    .index("foo")
                    .id("gh")
                    .action(_3 -> _3
                        .docAsUpsert(true)
                        .doc("gh-doc"))
                )
            )
        );
        RestClientTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

        BinaryResponse binaryResponse = transport.performRequest(req, BulkRequest._ENDPOINT.withBinaryResponse(), null);

        String str = IOUtils.toString(binaryResponse.content(), StandardCharsets.UTF_8);

        httpServer.stop(0);
        transport.close();

        Assertions.assertEquals(
            "{\"create\":{\"_id\":\"abc\",\"_index\":\"foo\"}}\n" +
            "\"abc-doc\"\n" +
            "{\"create\":{\"_id\":\"def\",\"_index\":\"foo\"}}\n" +
            "\"def-doc\"\n" +
            "{\"update\":{\"_id\":\"gh\",\"_index\":\"foo\"}}\n" +
            "{\"doc\":\"gh-doc\",\"doc_as_upsert\":true}\n",
            str
        );
    }
}
