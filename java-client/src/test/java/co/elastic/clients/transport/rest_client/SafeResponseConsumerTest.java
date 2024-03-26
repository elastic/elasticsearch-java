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

import com.sun.net.httpserver.HttpServer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.ContentDecoder;
import org.apache.http.nio.IOControl;
import org.elasticsearch.client.HeapBufferedAsyncResponseConsumer;
import org.elasticsearch.client.HttpAsyncResponseConsumerFactory;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SafeResponseConsumerTest {

    static HttpServer Server;
    static HttpHost ESHost;

    // A consumer factory that throws an Error, to simulate the effect of an OOME
    static HttpAsyncResponseConsumerFactory FailingConsumerFactory = () -> new HeapBufferedAsyncResponseConsumer(100 * 1024 * 1024) {
        @Override
        protected void onResponseReceived(HttpResponse httpResponse) throws HttpException, IOException {
            super.onResponseReceived(httpResponse);
        }

        @Override
        protected void onContentReceived(ContentDecoder decoder, IOControl ioctrl) throws IOException {
            super.onContentReceived(decoder, ioctrl);
            throw new Error("Error in onContentReceived");
        }

        @Override
        protected void onEntityEnclosed(HttpEntity entity, ContentType contentType) throws IOException {
            super.onEntityEnclosed(entity, contentType);
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

    @Test
    public void testReactorDeath() throws Exception {

        // Request options that will simulate an OOME and cause the reactor to die
        RequestOptions.Builder failingOptionsBuilder = RequestOptions.DEFAULT.toBuilder();
        failingOptionsBuilder.setHttpAsyncResponseConsumerFactory(FailingConsumerFactory);
        RequestOptions failingOptions = failingOptionsBuilder.build();

        RestClient restClient = RestClient.builder(ESHost).build();

        // First request, to warm things up.
        // An "indice exists" request, that has no response body
        Request existsReq = new Request("HEAD", "/index-name");
        restClient.performRequest(existsReq);

        try {
            Request infoReq = new Request("GET", "/");
            infoReq.setOptions(failingOptions);

            restClient.performRequest(infoReq);
            Assertions.fail("First request should not succeed");
        } catch(Exception t) {
//             System.err.println("Request 1 error");
//             t.printStackTrace();
        }

        Thread.sleep(1000);

        try {
            // 2nd request with no specific options
            Request infoReq = new Request("GET", "/");
            restClient.performRequest(infoReq);
            Assertions.fail("Second request should not succeed");
        } catch(Exception t) {
//            System.err.println("Request 2 error");
//            t.printStackTrace();
        }

        restClient.close();
    }

    @Test
    public void testReactorSurvival() throws Exception {

        // Request options that will simulate an OOME and wrapped in the safe consumer that will
        // avoid the reactor's death
        RequestOptions.Builder protectedFailingOptionsBuilder = RequestOptions.DEFAULT.toBuilder();
        protectedFailingOptionsBuilder.setHttpAsyncResponseConsumerFactory(() ->
            new SafeResponseConsumer<>(FailingConsumerFactory.createHttpAsyncResponseConsumer())
        );
        RequestOptions protectedFailingOptions = protectedFailingOptionsBuilder.build();

        RestClient restClient = RestClient.builder(ESHost).build();

        // First request, to warm things up.
        // An "indice exists" request, that has no response body
        Request existsReq = new Request("HEAD", "/index-name");
        restClient.performRequest(existsReq);

        try {
            Request infoReq = new Request("GET", "/");
            infoReq.setOptions(protectedFailingOptions);

            restClient.performRequest(infoReq);
            Assertions.fail("First request should not succeed");
        } catch(Exception t) {
            // System.err.println("Request 1 error");
            // t.printStackTrace();
        }

        {
            // 2nd request with no specific options
            Request infoReq = new Request("GET", "/");

            Response resp = restClient.performRequest(infoReq);
            Assertions.assertEquals(200, resp.getStatusLine().getStatusCode());
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
