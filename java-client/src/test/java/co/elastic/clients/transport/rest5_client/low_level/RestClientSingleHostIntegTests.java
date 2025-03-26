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

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.hc.client5.http.async.methods.SimpleHttpRequest;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.DefaultAuthenticationStrategy;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.mocksocket.MockHttpServer;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.getAllStatusCodes;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.randomHttpMethod;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.randomStatusCode;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 * Integration test to check interaction between {@link Rest5Client} and {@link org.apache.hc.client5.http
 * .async.HttpAsyncClient}.
 * Works against a real http server, one single host.
 */

public class RestClientSingleHostIntegTests extends RestClientTestCase {

    private HttpServer httpServer;
    private Rest5Client restClient;
    private String pathPrefix;
    private Header[] defaultHeaders;
    private WaitForCancelHandler waitForCancelHandler;

    @Before
    public void startHttpServer() throws Exception {
        // set version.properties, just for testing, version won't be updated
        System.setProperty("versions.elasticsearch","8.17.0");
        pathPrefix = randomBoolean() ? "/testPathPrefix/" + randomAsciiLettersOfLengthBetween(1, 5) : "";
        httpServer = createHttpServer();
        defaultHeaders = RestClientTestUtil.randomHeaders(getRandom(), "Header-default");
        restClient = createRestClient(false, true, true);
    }

    private HttpServer createHttpServer() throws Exception {
        HttpServer mockServer =
            MockHttpServer.createHttp(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        mockServer.start();
        // returns a different status code depending on the path
        for (int statusCode : getAllStatusCodes()) {
            mockServer.createContext(pathPrefix + "/" + statusCode, new ResponseHandler(statusCode));
        }
        waitForCancelHandler = new WaitForCancelHandler();
        mockServer.createContext(pathPrefix + "/wait", waitForCancelHandler);
        return mockServer;
    }

    private static class WaitForCancelHandler implements HttpHandler {

        private final CountDownLatch cancelHandlerLatch = new CountDownLatch(1);

        void cancelDone() {
            cancelHandlerLatch.countDown();
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                cancelHandlerLatch.await();
            } catch (InterruptedException ignore) {
            } finally {
                exchange.sendResponseHeaders(200, 0);
                exchange.close();
            }
        }
    }

    private static class ResponseHandler implements HttpHandler {
        private final int statusCode;

        ResponseHandler(int statusCode) {
            this.statusCode = statusCode;
        }

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            // copy request body to response body so we can verify it was sent
            StringBuilder body = new StringBuilder();
            try (InputStreamReader reader = new InputStreamReader(httpExchange.getRequestBody(), UTF_8)) {
                char[] buffer = new char[256];
                int read;
                while ((read = reader.read(buffer)) != -1) {
                    body.append(buffer, 0, read);
                }
            }
            // copy request headers to response headers so we can verify they were sent
            Headers requestHeaders = httpExchange.getRequestHeaders();
            Headers responseHeaders = httpExchange.getResponseHeaders();
            for (Map.Entry<String, List<String>> header : requestHeaders.entrySet()) {
                responseHeaders.put(header.getKey(), header.getValue());
            }
            httpExchange.getRequestBody().close();
            httpExchange.sendResponseHeaders(statusCode, body.length() == 0 ? -1 : body.length());
            if (body.length() > 0) {
                try (OutputStream out = httpExchange.getResponseBody()) {
                    out.write(body.toString().getBytes(UTF_8));
                }
            }
            httpExchange.close();
        }
    }

    private Rest5Client createRestClient(final boolean useAuth, final boolean usePreemptiveAuth,
                                        final boolean enableMetaHeader) {
        HttpHost host = new HttpHost(httpServer.getAddress().getHostString(),
            httpServer.getAddress().getPort());

        final Rest5ClientBuilder restClientBuilder =
            Rest5Client.builder(host).setDefaultHeaders(defaultHeaders);
        if (pathPrefix.length() > 0) {
            restClientBuilder.setPathPrefix(pathPrefix);
        }

        restClientBuilder.setMetaHeaderEnabled(enableMetaHeader);


        if (useAuth) {
            // provide the username/password for every request
            var creds = Base64.getEncoder().encodeToString("user:pass".getBytes());

            HttpAsyncClientBuilder httpclientBuilder = HttpAsyncClients.custom();

            httpclientBuilder.setDefaultHeaders(Arrays.asList(new BasicHeader("Authorization",
                "Basic " + creds)));

            if (!usePreemptiveAuth) {
                httpclientBuilder
                    .disableAuthCaching()
                    .setTargetAuthenticationStrategy(new DefaultAuthenticationStrategy());
            }
            restClientBuilder.setHttpClient(httpclientBuilder.build());
        }

        return restClientBuilder.build();
    }

    @After
    public void stopHttpServers() throws IOException {
        restClient.close();
        restClient = null;
        httpServer.stop(0);
        httpServer = null;
    }

    /*
     * Tests sending a bunch of async requests works well (e.g. no TimeoutException from the leased pool)
     * See https://github.com/elastic/elasticsearch/issues/24069
     */

    public void testManyAsyncRequests() throws Exception {
        int iters = randomIntBetween(500, 1000);
        final CountDownLatch latch = new CountDownLatch(iters);
        final List<Exception> exceptions = new CopyOnWriteArrayList<>();
        for (int i = 0; i < iters; i++) {
            Request request = new Request("PUT", "/200");
            request.setEntity(new StringEntity("{}", ContentType.APPLICATION_JSON));
            restClient.performRequestAsync(request, new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    latch.countDown();
                }

                @Override
                public void onFailure(Exception exception) {
                    exceptions.add(exception);
                    latch.countDown();
                }
            });
        }

        assertTrue("timeout waiting for requests to be sent", latch.await(10, TimeUnit.SECONDS));
        if (exceptions.isEmpty() == false) {
            AssertionError error = new AssertionError(
                "expected no failures but got some. see suppressed for first 10 of [" + exceptions.size() + "] failures"
            );
            for (Exception exception : exceptions.subList(0, Math.min(10, exceptions.size()))) {
                error.addSuppressed(exception);
            }
            throw error;
        }
    }

    public void testCancelAsyncRequest() throws Exception {
        Request request = new Request(randomHttpMethod(getRandom()), "/wait");
        CountDownLatch requestLatch = new CountDownLatch(1);
        AtomicReference<Exception> error = new AtomicReference<>();
        Cancellable cancellable = restClient.performRequestAsync(request, new ResponseListener() {
            @Override
            public void onSuccess(Response response) {
                throw new AssertionError("onResponse called unexpectedly");
            }

            @Override
            public void onFailure(Exception exception) {
                error.set(exception);
                requestLatch.countDown();
            }
        });
        cancellable.cancel();
        waitForCancelHandler.cancelDone();
        assertTrue(requestLatch.await(5, TimeUnit.SECONDS));
        assertThat(error.get(), instanceOf(CancellationException.class));
    }

    /**
     * This test verifies some assumptions that we rely upon around the way the async http client works
     * when reusing the same request
     * throughout multiple retries, and the use of the
     * {@link org.apache.hc.client5.http.classic.methods.HttpUriRequestBase#abort()} method.
     * In fact the low-level REST client reuses the same request instance throughout multiple retries, and
     * relies on the http client
     * to set the future ref to the request properly so that when abort is called, the proper future gets
     * cancelled.
     */
    public void testRequestResetAndAbort() throws Exception {
        try (CloseableHttpAsyncClient client = HttpAsyncClientBuilder.create().build()) {
            client.start();
            HttpHost httpHost = new HttpHost(httpServer.getAddress().getHostString(),
                httpServer.getAddress().getPort());
            HttpGet httpGet = new HttpGet(httpHost.toURI() + pathPrefix + "/200");

            // calling abort before the request is sent is a no-op
            httpGet.abort();
            assertTrue(httpGet.isAborted());

            {
                httpGet.reset();
                assertFalse(httpGet.isAborted());
                httpGet.abort();
                Future<SimpleHttpResponse> future = client.execute(SimpleHttpRequest.copy(httpGet), null);
                httpGet.setDependency((org.apache.hc.core5.concurrent.Cancellable) future);
                try {
                    future.get();
                    fail("expected cancellation exception");
                } catch (CancellationException e) {
                    // expected
                }
                assertTrue(future.isCancelled());
            }
            {
                httpGet.reset();
                Future<SimpleHttpResponse> future = client.execute(SimpleHttpRequest.copy(httpGet), null);
                httpGet.setDependency((org.apache.hc.core5.concurrent.Cancellable) future);

                assertFalse(httpGet.isAborted());
                httpGet.abort();
                assertTrue(httpGet.isAborted());
                try {
                    assertTrue(future.isDone());
                    future.get();
                } catch (CancellationException e) {
                    // expected sometimes - if the future was cancelled before executing successfully
                }
            }
            {
                httpGet.reset();
                assertFalse(httpGet.isAborted());
                Future<SimpleHttpResponse> future = client.execute(SimpleHttpRequest.copy(httpGet), null);
                httpGet.setDependency((org.apache.hc.core5.concurrent.Cancellable) future);

                assertFalse(httpGet.isAborted());
                assertEquals(200, future.get().getCode());
                assertFalse(future.isCancelled());
            }
        }
    }

    /**
     * End to end test for delete with body. We test it explicitly as it is not supported
     * out of the box by {@link HttpAsyncClients}.
     * Exercises the test http server ability to send back whatever body it received.
     */
    public void testDeleteWithBody() throws Exception {
        bodyTest("DELETE");
    }

    /**
     * End to end test for get with body. We test it explicitly as it is not supported
     * out of the box by {@link HttpAsyncClients}.
     * Exercises the test http server ability to send back whatever body it received.
     */
    public void testGetWithBody() throws Exception {
        bodyTest("GET");
    }

    public void testEncodeParams() throws Exception {
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "this/is/the/routing");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=this%2Fis%2Fthe%2Frouting",
                response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "this|is|the|routing");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=this%7Cis%7Cthe%7Crouting",
                response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "routing#1");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=routing%231", response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "中文");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=%E4%B8%AD%E6%96%87", response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "foo bar");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=foo%20bar", response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "foo+bar");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=foo%2Bbar", response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "foo/bar");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=foo%2Fbar", response.getRequestLine().getUri());
        }
        {
            Request request = new Request("PUT", "/200");
            request.addParameter("routing", "foo^bar");
            Response response = RestClientSingleHostTests.performRequestSyncOrAsync(restClient, request);
            assertEquals(pathPrefix + "/200?routing=foo%5Ebar", response.getRequestLine().getUri());
        }
    }

    /**
     * Verify that credentials are sent on the first request with preemptive auth enabled (default when
     * provided with credentials).
     */
    public void testPreemptiveAuthEnabled() throws Exception {
        final String[] methods = {"POST", "PUT", "GET", "DELETE"};

        try (Rest5Client restClient = createRestClient(true, true, true)) {
            for (final String method : methods) {
                final Response response = bodyTest(restClient, method);

                assertThat(response.getHeader("Authorization"), startsWith("Basic"));
            }
        }
    }

    private Response bodyTest(final String method) throws Exception {
        return bodyTest(restClient, method);
    }

    private Response bodyTest(final Rest5Client client, final String method) throws Exception {
        int statusCode = randomStatusCode(getRandom());
        return bodyTest(client, method, statusCode, new Header[0]);
    }

    private Response bodyTest(Rest5Client client, String method, int statusCode, Header[] headers) throws Exception {
        String requestBody = "{ \"field\": \"value\" }";
        Request request = new Request(method, "/" + statusCode);
        request.setJsonEntity(requestBody);
        RequestOptions.Builder options = request.getOptions().toBuilder();
        for (Header header : headers) {
            options.addHeader(header.getName(), header.getValue());
        }
        request.setOptions(options);
        Response esResponse;
        try {
            esResponse = RestClientSingleHostTests.performRequestSyncOrAsync(client, request);
        } catch (ResponseException e) {
            esResponse = e.getResponse();
        }
        assertEquals(method, esResponse.getRequestLine().getMethod());
        assertEquals(statusCode, esResponse.getStatusCode());
        assertEquals(pathPrefix + "/" + statusCode, esResponse.getRequestLine().getUri());
        assertEquals(requestBody, EntityUtils.toString(esResponse.getEntity()));

        return esResponse;
    }
}
