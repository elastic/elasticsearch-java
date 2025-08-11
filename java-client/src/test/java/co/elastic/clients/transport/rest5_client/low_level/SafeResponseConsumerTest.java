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

package co.elastic.clients.transport.rest5_client.low_level;

import co.elastic.clients.transport.rest5_client.SafeResponseConsumer;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SafeResponseConsumerTest {

    static HttpServer Server;
    static HttpHost ESHost;

    // A consumer factory that throws an Error, to simulate the effect of an OOME
    static HttpAsyncResponseConsumerFactory FailingConsumerFactory =
        () -> new BasicAsyncResponseConsumer(new BufferedByteConsumer(100 * 1024 * 1024)) {
            @Override
            public void informationResponse(HttpResponse response, HttpContext context) {
                super.informationResponse(response, context);
            }

            @Override
            protected BasicClassicHttpResponse buildResult(HttpResponse response, ByteArrayEntity entity,
                                                           ContentType contentType) {
                super.buildResult(response, entity, contentType);
                throw new Error("Error in buildResult");
            }
        };

    @BeforeAll
    public static void setup() throws Exception {
        Server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        Server.start();

        Server.createContext("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");

            if (path.equals("/")) {
                byte[] bytes = Info.getBytes(StandardCharsets.UTF_8);
                exchange.sendResponseHeaders(200, bytes.length);
                exchange.getResponseBody().write(bytes);
                exchange.close();
                return;
            }

            exchange.sendResponseHeaders(404, -1);
            exchange.close();
        });

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                Server.stop(1);
            } catch (Exception e) {
                // Ignore
            }
        }));

        ESHost = new HttpHost(Server.getAddress().getAddress(), Server.getAddress().getPort());
    }

    @AfterAll
    public static void tearDown() {
        Server.stop(0);
    }

    // testReactorDeath cannot be tested, as the io reactor thread gets stuck and the test never completes

    @Test
    public void testReactorSurvival() throws Exception {

        // Request options that will simulate an OOME and wrapped in the safe consumer that will
        // avoid the reactor's death
        RequestOptions.Builder protectedFailingOptionsBuilder = RequestOptions.DEFAULT.toBuilder();
        protectedFailingOptionsBuilder.setHttpAsyncResponseConsumerFactory(() ->
            new SafeResponseConsumer<>(FailingConsumerFactory.createHttpAsyncResponseConsumer())
        );
        RequestOptions protectedFailingOptions = protectedFailingOptionsBuilder.build();

        Rest5Client restClient = Rest5Client.builder(ESHost).build();

        // First request, to warm things up.
        // An "indice exists" request, that has no response body
        Request existsReq = new Request("HEAD", "/index-name");
        restClient.performRequest(existsReq);

        try {
            Request infoReq = new Request("GET", "/");
            infoReq.setOptions(protectedFailingOptions);

            restClient.performRequest(infoReq);
            Assertions.fail("First request should not succeed");
        } catch (Exception t) {
            System.err.println("Request 1 error");
        }
        {
            // 2nd request with no specific options
            Request infoReq = new Request("GET", "/");

            Response resp = restClient.performRequest(infoReq);
            Assertions.assertEquals(200, resp.getStatusCode());
        }
        {
            // final request to make sure that the reactor isn't closed
            restClient.performRequest(existsReq);
        }
        restClient.close();
    }

    private static final String Info = "{\n" +
        "  \"cluster_name\": \"foo\",\n" +
        "  \"cluster_uuid\": \"bar\",\n" +
        "  \"version\": {\n" +
        "    \"build_date\": \"2022-01-28T08:36:04.875279988Z\",\n" +
        "    \"minimum_wire_compatibility_version\": \"6.8.0\",\n" +
        "    \"build_hash\": \"bee86328705acaa9a6daede7140defd4d9ec56bd\",\n" +
        "    \"number\": \"7.17.0\",\n" +
        "    \"lucene_version\": \"8.11.1\",\n" +
        "    \"minimum_index_compatibility_version\": \"6.0.0-beta1\",\n" +
        "    \"build_flavor\": \"default\",\n" +
        "    \"build_snapshot\": false,\n" +
        "    \"build_type\": \"docker\"\n" +
        "  },\n" +
        "  \"name\": \"instance-0000000000\",\n" +
        "  \"tagline\": \"You Know, for Search\"\n" +
        "}";
}
