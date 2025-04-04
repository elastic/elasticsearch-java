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

package co.elastic.clients.transport.rest5_client;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jsonb.JsonbJsonpMapper;
import co.elastic.clients.transport.TransportException;
import co.elastic.clients.transport.Version;
import co.elastic.clients.transport.rest5_client.low_level.ResponseException;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.net.URLEncodedUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class RequestOptionsTest extends Assertions {

    private static HttpServer httpServer;
    private static Rest5Client restClient;

    @BeforeEach
    public void classSetup() throws IOException {

        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        httpServer.createContext("/", ex -> {
            if (ex.getRequestMethod().equals("HEAD")) {
                // Call to ping()
                ex.sendResponseHeaders(200, -1);
            }

            // Call to info()
            // Send back all request headers with a 501 that will cause an exception where we can access the LLRC response
            ex.getResponseHeaders().putAll(ex.getRequestHeaders());
            ex.sendResponseHeaders(501, 0);
            OutputStreamWriter out = new OutputStreamWriter(ex.getResponseBody(), StandardCharsets.UTF_8);
            for (Map.Entry<String, List<String>> header: ex.getRequestHeaders().entrySet()) {
                out.write("header-");
                out.write(header.getKey().toLowerCase(Locale.ROOT));
                out.write("=");
                out.write(header.getValue().get(0));
                out.write("\n");
            }
            final List<NameValuePair> params = URLEncodedUtils.parse(ex.getRequestURI(), StandardCharsets.UTF_8);
            for (NameValuePair param: params) {
                out.write("param-");
                out.write(param.getName());
                out.write("=");
                out.write(param.getValue());
            }
            out.close();
        });

        httpServer.start();
        restClient = Rest5Client.builder(new HttpHost("http",httpServer.getAddress().getHostString(),
            httpServer.getAddress().getPort())).build();
    }

    @AfterEach
    public void classTearDown() throws IOException {
        httpServer.stop(0);
        restClient.close();
    }

    private Properties getProps(ElasticsearchClient client) throws IOException {
        ResponseException ex = assertThrows(ResponseException.class, client::info);
        assertEquals(501, ex.getResponse().getStatusCode());
        Properties result = new Properties();
        result.load(ex.getResponse().getEntity().getContent());
        return result;
    }

    @Test
    public void testNonNullClientOptions() {
        final Rest5ClientTransport trsp = new Rest5ClientTransport(restClient, new JsonbJsonpMapper());
        final ElasticsearchClient client = new ElasticsearchClient(trsp);

        assertNotNull(client._transportOptions());
        assertSame(trsp.options(), client._transportOptions());
    }

    @Test
    public void testDefaultHeaders() throws IOException {
        final Rest5ClientTransport trsp = new Rest5ClientTransport(restClient, new JsonbJsonpMapper());
        final ElasticsearchClient client = new ElasticsearchClient(trsp);

        Properties props = getProps(client);

        assertTrue(props.getProperty("header-user-agent").startsWith("elastic-java/" + Version.VERSION.toString()));
        assertTrue(props.getProperty("header-x-elastic-client-meta").contains("es="));
        assertTrue(props.getProperty("header-x-elastic-client-meta").contains("hl=2"));
        assertEquals(
            "application/vnd.elasticsearch+json; compatible-with=" + Version.VERSION.major(),
            props.getProperty("header-accept")
        );
    }

    @Test
    public void testClientHeader() throws IOException {
        final Rest5ClientTransport trsp = new Rest5ClientTransport(restClient, new JsonbJsonpMapper());
        final ElasticsearchClient client = new ElasticsearchClient(trsp)
            .withTransportOptions(b -> b
                .addHeader("X-Foo", "Bar")
                .addHeader("uSer-agEnt", "MegaClient/1.2.3")
            );

        Properties props = getProps(client);
        assertEquals("Bar", props.getProperty("header-x-foo"));
        assertEquals("MegaClient/1.2.3", props.getProperty("header-user-agent"));
    }

    @Test
    public void testQueryParameter() throws IOException {
        final Rest5ClientTransport trsp = new Rest5ClientTransport(restClient, new JsonbJsonpMapper());
        final ElasticsearchClient client = new ElasticsearchClient(trsp)
            .withTransportOptions(trsp.options().with(
                    b -> b.setParameter("format", "pretty")
                )
            );

        Properties props = getProps(client);
        assertEquals("pretty", props.getProperty("param-format"));
    }

    @Test
    public void testMissingProductHeader() {
        final Rest5ClientTransport trsp = new Rest5ClientTransport(restClient, new JsonbJsonpMapper());
        final ElasticsearchClient client = new ElasticsearchClient(trsp);

        final TransportException ex = assertThrows(TransportException.class, client::ping);
        assertTrue(ex.getMessage().contains("Missing [X-Elastic-Product] header"));
    }
}
