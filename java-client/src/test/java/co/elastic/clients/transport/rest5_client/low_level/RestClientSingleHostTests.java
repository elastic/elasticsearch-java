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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hc.client5.http.ConnectTimeoutException;
import org.apache.hc.client5.http.classic.methods.HttpHead;
import org.apache.hc.client5.http.classic.methods.HttpOptions;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.classic.methods.HttpTrace;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.ConnectionClosedException;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpRequest;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.nio.AsyncDataProducer;
import org.apache.hc.core5.http.nio.AsyncRequestProducer;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.apache.hc.core5.net.URIBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.stubbing.Answer;

import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.canHaveBody;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.getAllErrorStatusCodes;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.getHttpMethods;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.getOkStatusCodes;
import static co.elastic.clients.transport.rest5_client.low_level.RestClientTestUtil.randomStatusCode;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Tests for basic functionality of {@link Rest5Client} against one single host: tests http requests being
 * sent, headers,
 * body, different status codes and corresponding responses/exceptions.
 * Relies on a mock http client to intercept requests and return desired responses based on request path.
 */
public class RestClientSingleHostTests extends RestClientTestCase {
    private static final Log logger = LogFactory.getLog(RestClientSingleHostTests.class);

    private ExecutorService exec = Executors.newFixedThreadPool(1);
    private Rest5Client restClient;
    private Header[] defaultHeaders;
    private Node node;
    private CloseableHttpAsyncClient httpClient;
    private HostsTrackingFailureListener failureListener;
    private boolean strictDeprecationMode;

    @BeforeEach
    public void createRestClient() {
        httpClient = mockHttpClient(exec);
        defaultHeaders = RestClientTestUtil.randomHeaders("Header-default");
        node = new Node(new HttpHost("localhost", 9200));
        failureListener = new HostsTrackingFailureListener();
        strictDeprecationMode = randomBoolean();
        restClient = new Rest5Client(
            this.httpClient,
            defaultHeaders,
            singletonList(node),
            null,
            failureListener,
            NodeSelector.ANY,
            strictDeprecationMode,
            false,
            false
        );
    }

    @SuppressWarnings("unchecked")
    static CloseableHttpAsyncClient mockHttpClient(final ExecutorService exec) {
        CloseableHttpAsyncClient httpClient = mock(CloseableHttpAsyncClient.class);
        when(
            httpClient.<HttpResponse>execute(
                any(AsyncRequestProducer.class),
                any(AsyncResponseConsumer.class),
                any(HttpClientContext.class),
                nullable(FutureCallback.class)
            )
        ).thenAnswer((Answer<Future<HttpResponse>>) invocationOnMock -> {
            final AsyncRequestProducer requestProducer =
                (AsyncRequestProducer) invocationOnMock.getArguments()[0];
            final FutureCallback<HttpResponse> futureCallback =
                (FutureCallback<HttpResponse>) invocationOnMock.getArguments()[3];
            // Call the callback asynchronous to better simulate how async http client works
            return exec.submit(() -> {
                if (futureCallback != null) {
                    try {
                        HttpResponse httpResponse = responseOrException(requestProducer);
                        futureCallback.completed(httpResponse);
                    } catch (Exception e) {
                        futureCallback.failed(e);
                    }
                    return null;
                }
                return responseOrException(requestProducer);
            });
        });
        return httpClient;
    }

    private static HttpResponse responseOrException(AsyncDataProducer requestProducer) throws Exception {
        // request is private in BasicRequestProducer, need to make it accessible first
        Field requestField = requestProducer.getClass().getDeclaredField("request");
        requestField.setAccessible(true);
        final HttpRequest request = (HttpRequest) requestField.get(requestProducer);
        final HttpHost httpHost = new HttpHost(request.getAuthority().getHostName(),
            request.getAuthority().getPort());
        // return the desired status code or exception depending on the path
        switch (request.getPath()) {
            case "/soe":
                throw new SocketTimeoutException(httpHost.toString());
            case "/coe":
                throw new ConnectTimeoutException(httpHost.toString());
            case "/ioe":
                throw new IOException(httpHost.toString());
            case "/closed":
                throw new ConnectionClosedException();
            case "/handshake":
                throw new SSLHandshakeException("");
            case "/uri":
                throw new URISyntaxException("", "");
            case "/runtime":
                throw new RuntimeException();
            default:
                int statusCode = Integer.parseInt(request.getPath().substring(1));

                final BasicClassicHttpResponse httpResponse = new BasicClassicHttpResponse(statusCode, "");
                Optional<HttpEntity> entity = retrieveEntity(requestProducer);

                // return the same body that was sent
                if (entity.isPresent()) {
                    assertTrue("the entity is not repeatable, cannot set it to the response directly",
                        entity.get().isRepeatable());
                    httpResponse.setEntity(entity.get());
                }
                // return the same headers that were sent
                httpResponse.setHeaders(request.getHeaders());
                return httpResponse;
        }
    }

    private static Optional<HttpEntity> retrieveEntity(AsyncDataProducer requestProducer) throws NoSuchFieldException, IllegalAccessException {
        // entity is in the dataProducer field, both are private
        Field dataProducerField = requestProducer.getClass().getDeclaredField("dataProducer");
        dataProducerField.setAccessible(true);
        final BasicAsyncEntityProducer dataProducer =
            (BasicAsyncEntityProducer) dataProducerField.get(requestProducer);

        if (dataProducer != null) {
            Field entityField = dataProducer.getClass().getDeclaredField("entity");
            entityField.setAccessible(true);
            return Optional.ofNullable((HttpEntity) entityField.get(dataProducer));
        }
        return Optional.empty();
    }

    /**
     * Shutdown the executor so we don't leak threads into other test runs.
     */
    @AfterEach
    public void shutdownExec() {
        exec.shutdown();
    }

    /**
     * Verifies the content of the {@link HttpRequest} that's internally created and passed through to the
     * http client
     */
    @SuppressWarnings("unchecked")
    @Test
    public void testInternalHttpRequest() throws Exception {
        ArgumentCaptor<AsyncRequestProducer> requestArgumentCaptor = ArgumentCaptor.forClass
            (AsyncRequestProducer.class);
        int times = 0;
        for (String httpMethod : getHttpMethods()) {
            HttpRequest expectedRequest = performRandomRequest(httpMethod);
            verify(httpClient, times(++times)).<HttpResponse>execute(
                requestArgumentCaptor.capture(),
                any(AsyncResponseConsumer.class),
                any(HttpClientContext.class),
                nullable(FutureCallback.class)
            );
            AsyncRequestProducer requestProducer = requestArgumentCaptor.getValue();
            Field requestField = requestProducer.getClass().getDeclaredField("request");
            requestField.setAccessible(true);
            final HttpRequest actualRequest = (HttpRequest) requestField.get(requestProducer);
            assertEquals(expectedRequest.getRequestUri(), actualRequest.getRequestUri());
            assertArrayEquals(expectedRequest.getHeaders(), actualRequest.getHeaders());
            if (canHaveBody(expectedRequest) && expectedRequest instanceof BasicClassicHttpRequest) {
                Optional<HttpEntity> actualEntity = retrieveEntity(requestProducer);
                if (actualEntity.isPresent()) {
                    HttpEntity expectedEntity = ((BasicClassicHttpRequest) expectedRequest).getEntity();
                    assertEquals(EntityUtils.toString(expectedEntity),
                        EntityUtils.toString(actualEntity.get()));
                }
            }
        }
    }

    /**
     * End to end test for ok status codes
     */
    @Test
    public void testOkStatusCodes() throws Exception {
        for (String method : getHttpMethods()) {
            for (int okStatusCode : getOkStatusCodes()) {
                Response response = performRequestSyncOrAsync(restClient, new Request(method,
                    "/" + okStatusCode));
                assertThat(response.getStatusCode(), equalTo(okStatusCode));
            }
        }
        failureListener.assertNotCalled();
    }

    /**
     * End to end test for error status codes: they should cause an exception to be thrown
     */
    @Test
    public void testErrorStatusCodes() throws Exception {
        for (String method : getHttpMethods()) {
            // error status codes should cause an exception to be thrown
            for (int errorStatusCode : getAllErrorStatusCodes()) {
                try {
                    Request request = new Request(method, "/" + errorStatusCode);
                    Response response = restClient.performRequest(request);
                    fail("request should have failed");
                } catch (ResponseException e) {
                    assertEquals(errorStatusCode, e.getResponse().getStatusCode());
                    assertExceptionStackContainsCallingMethod(e);
                }
            }
        }
    }

    @Test
    public void testPerformRequestIOExceptions() throws Exception {
        for (String method : getHttpMethods()) {
            // IOExceptions should be let bubble up
            try {
                restClient.performRequest(new Request(method, "/ioe"));
                fail("request should have failed");
            } catch (IOException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
            try {
                restClient.performRequest(new Request(method, "/coe"));
                fail("request should have failed");
            } catch (ConnectTimeoutException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
            try {
                restClient.performRequest(new Request(method, "/soe"));
                fail("request should have failed");
            } catch (SocketTimeoutException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
            try {
                restClient.performRequest(new Request(method, "/closed"));
                fail("request should have failed");
            } catch (ConnectionClosedException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
            try {
                restClient.performRequest(new Request(method, "/handshake"));
                fail("request should have failed");
            } catch (SSLHandshakeException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
        }
    }

    @Test
    public void testPerformRequestRuntimeExceptions() throws Exception {
        for (String method : getHttpMethods()) {
            try {
                restClient.performRequest(new Request(method, "/runtime"));
                fail("request should have failed");
            } catch (RuntimeException e) {
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
        }
    }

    @Test
    public void testPerformRequestExceptions() throws Exception {
        for (String method : getHttpMethods()) {
            try {
                restClient.performRequest(new Request(method, "/uri"));
                fail("request should have failed");
            } catch (RuntimeException e) {
                assertThat(e.getCause(), instanceOf(URISyntaxException.class));
                // And we do all that so the thrown exception has our method in the stacktrace
                assertExceptionStackContainsCallingMethod(e);
            }
            failureListener.assertCalled(singletonList(node));
        }
    }

    /**
     * End to end test for request and response body. Exercises the mock http client ability to send back
     * whatever body it has received.
     */
    @Test
    public void testBody() throws Exception {
        String body = "{ \"field\": \"value\" }";
        StringEntity entity = new StringEntity(body, ContentType.APPLICATION_JSON);
        for (String method : Arrays.asList("DELETE", "GET", "PATCH", "POST", "PUT")) {
            for (int okStatusCode : getOkStatusCodes()) {
                Request request = new Request(method, "/" + okStatusCode);
                request.setEntity(entity);
                Response response = restClient.performRequest(request);
                assertThat(response.getStatusCode(), equalTo(okStatusCode));
                assertThat(EntityUtils.toString(response.getEntity()), equalTo(body));
            }
            for (int errorStatusCode : getAllErrorStatusCodes()) {
                Request request = new Request(method, "/" + errorStatusCode);
                request.setEntity(entity);
                try {
                    restClient.performRequest(request);
                    fail("request should have failed");
                } catch (ResponseException e) {
                    Response response = e.getResponse();
                    assertThat(response.getStatusCode(), equalTo(errorStatusCode));
                    assertThat(EntityUtils.toString(response.getEntity()), equalTo(body));
                    assertExceptionStackContainsCallingMethod(e);
                }
            }
        }
        for (String method : Arrays.asList("HEAD", "OPTIONS", "TRACE")) {
            Request request = new Request(method, "/" + randomStatusCode());
            request.setEntity(entity);
            try {
                performRequestSyncOrAsync(restClient, request);
                fail("request should have failed");
            } catch (UnsupportedOperationException e) {
                assertThat(e.getMessage(), equalTo(method + " with body is not supported"));
            }
        }
    }

    /**
     * End to end test for request and response headers. Exercises the mock http client ability to send back
     * whatever headers it has received.
     */
    @Test
    public void testHeaders() throws Exception {
        for (String method : getHttpMethods()) {
            final Header[] requestHeaders = RestClientTestUtil.randomHeaders( "Header");
            final int statusCode = randomStatusCode();
            Request request = new Request(method, "/" + statusCode);
            RequestOptions.Builder options = request.getOptions().toBuilder();
            for (Header requestHeader : requestHeaders) {
                options.addHeader(requestHeader.getName(), requestHeader.getValue());
            }
            request.setOptions(options);
            Response esResponse;
            try {
                esResponse = performRequestSyncOrAsync(restClient, request);
            } catch (ResponseException e) {
                esResponse = e.getResponse();
            }
            assertThat(esResponse.getStatusCode(), equalTo(statusCode));
            assertHeaders(defaultHeaders, requestHeaders, esResponse.getHeaders(),
                Collections.<String>emptySet());
            assertFalse(esResponse.hasWarnings());
        }
    }

    @Test
    public void testDeprecationWarnings() throws Exception {
        String chars = randomAsciiAlphanumOfLength(5);
        assertDeprecationWarnings(singletonList("poorly formatted " + chars), singletonList("poorly " +
            "formatted " + chars));
        assertDeprecationWarnings(singletonList(formatWarningWithoutDate(chars)), singletonList(chars));
        assertDeprecationWarnings(singletonList(formatWarning(chars)), singletonList(chars));
        assertDeprecationWarnings(
            Arrays.asList(formatWarning(chars), "another one", "and another"),
            Arrays.asList(chars, "another one", "and another")
        );
        assertDeprecationWarnings(Arrays.asList("ignorable one", "and another"), Arrays.asList("ignorable " +
            "one", "and another"));
        assertDeprecationWarnings(singletonList("exact"), singletonList("exact"));
        assertDeprecationWarnings(Collections.<String>emptyList(), Collections.<String>emptyList());

        String proxyWarning = "112 - \"network down\" \"Sat, 25 Aug 2012 23:34:45 GMT\"";
        assertDeprecationWarnings(singletonList(proxyWarning), singletonList(proxyWarning));
    }

    private enum DeprecationWarningOption {
        PERMISSIVE {
            protected WarningsHandler warningsHandler() {
                return WarningsHandler.PERMISSIVE;
            }
        },
        STRICT {
            protected WarningsHandler warningsHandler() {
                return WarningsHandler.STRICT;
            }
        },
        FILTERED {
            protected WarningsHandler warningsHandler() {
                return new WarningsHandler() {
                    @Override
                    public boolean warningsShouldFailRequest(List<String> warnings) {
                        for (String warning : warnings) {
                            if (false == warning.startsWith("ignorable")) {
                                return true;
                            }
                        }
                        return false;
                    }
                };
            }
        },
        EXACT {
            protected WarningsHandler warningsHandler() {
                return new WarningsHandler() {
                    @Override
                    public boolean warningsShouldFailRequest(List<String> warnings) {
                        return false == warnings.equals(Arrays.asList("exact"));
                    }
                };
            }
        };

        protected abstract WarningsHandler warningsHandler();
    }

    private void assertDeprecationWarnings(List<String> warningHeaderTexts, List<String> warningBodyTexts) throws Exception {
        String method = randomFrom(getHttpMethods());
        Request request = new Request(method, "/200");
        RequestOptions.Builder options = request.getOptions().toBuilder();
        for (String warningHeaderText : warningHeaderTexts) {
            options.addHeader("Warning", warningHeaderText);
        }

        final boolean expectFailure;
        if (randomBoolean()) {
            logger.info("checking strictWarningsMode=[" + strictDeprecationMode + "] and warnings=" + warningBodyTexts);
            expectFailure = strictDeprecationMode && false == warningBodyTexts.isEmpty();
        } else {
            DeprecationWarningOption warningOption = randomFrom(DeprecationWarningOption.values());
            logger.info("checking warningOption=" + warningOption + " and warnings=" + warningBodyTexts);
            options.setWarningsHandler(warningOption.warningsHandler());
            expectFailure = warningOption.warningsHandler().warningsShouldFailRequest(warningBodyTexts);
        }
        request.setOptions(options);

        Response response;
        if (expectFailure) {
            try {
                performRequestSyncOrAsync(restClient, request);
                fail("expected WarningFailureException from warnings");
                return;
            } catch (WarningFailureException e) {
                if (false == warningBodyTexts.isEmpty()) {
                    assertThat(e.getMessage(), containsString("\nWarnings: " + warningBodyTexts));
                }
                response = e.getResponse();
            }
        } else {
            response = performRequestSyncOrAsync(restClient, request);
        }
        assertEquals(false == warningBodyTexts.isEmpty(), response.hasWarnings());
        assertEquals(warningBodyTexts, response.getWarnings());
    }

    /**
     * Emulates Elasticsearch's HeaderWarningLogger.formatWarning in simple
     * cases. We don't have that available because we're testing against 1.7.
     */
    private static String formatWarningWithoutDate(String warningBody) {
        final String hash = new String(new byte[40], StandardCharsets.UTF_8).replace('\0', 'e');
        return "299 Elasticsearch-1.2.2-SNAPSHOT-" + hash + " \"" + warningBody + "\"";
    }

    private static String formatWarning(String warningBody) {
        return formatWarningWithoutDate(warningBody) + " \"Mon, 01 Jan 2001 00:00:00 GMT\"";
    }

    private HttpUriRequest performRandomRequest(String method) throws Exception {
        String uriAsString = "/" + randomStatusCode();
        Request request = new Request(method, uriAsString);
        URIBuilder uriBuilder = new URIBuilder(uriAsString);
        if (randomBoolean()) {
            int numParams = randomIntBetween(1, 3);
            for (int i = 0; i < numParams; i++) {
                String name = "param-" + i;
                String value = randomAsciiAlphanumOfLengthBetween(3, 10);
                request.addParameter(name, value);
                uriBuilder.addParameter(name, value);
            }
        }
        URI uri = uriBuilder.build();

        HttpUriRequestBase expectedRequest;
        switch (method) {
            case "DELETE":
                expectedRequest = new HttpDeleteWithEntity(uri);
                break;
            case "GET":
                expectedRequest = new HttpGetWithEntity(uri);
                break;
            case "HEAD":
                expectedRequest = new HttpHead(uri);
                break;
            case "OPTIONS":
                expectedRequest = new HttpOptions(uri);
                break;
            case "PATCH":
                expectedRequest = new HttpPatch(uri);
                break;
            case "POST":
                expectedRequest = new HttpPost(uri);
                break;
            case "PUT":
                expectedRequest = new HttpPut(uri);
                break;
            case "TRACE":
                expectedRequest = new HttpTrace(uri);
                break;
            default:
                throw new UnsupportedOperationException("method not supported: " + method);
        }

        if (canHaveBody(expectedRequest) && randomBoolean()) {
            HttpEntity entity = new StringEntity(randomAsciiAlphanumOfLengthBetween(10, 100),
                ContentType.APPLICATION_JSON);
            (expectedRequest).setEntity(entity);
            request.setEntity(entity);
        }

        final Set<String> uniqueNames = new HashSet<>();
        if (randomBoolean()) {
            Header[] headers = RestClientTestUtil.randomHeaders("Header");
            RequestOptions.Builder options = request.getOptions().toBuilder();
            for (Header header : headers) {
                options.addHeader(header.getName(), header.getValue());
                expectedRequest.addHeader(new RequestOptions.ReqHeader(header.getName(), header.getValue()));
                uniqueNames.add(header.getName());
            }
            request.setOptions(options);
        }
        for (Header defaultHeader : defaultHeaders) {
            // request level headers override default headers
            if (uniqueNames.contains(defaultHeader.getName()) == false) {
                expectedRequest.addHeader(defaultHeader);
            }
        }
        try {
            performRequestSyncOrAsync(restClient, request);
        } catch (Exception e) {
            // all good
        }
        return expectedRequest;
    }

    static Response performRequestSyncOrAsync(Rest5Client restClient, Request request) throws Exception {
        // randomize between sync and async methods
        if (randomBoolean()) {
            return restClient.performRequest(request);
        } else {
            final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
            final AtomicReference<Response> responseRef = new AtomicReference<>();
            final CountDownLatch latch = new CountDownLatch(1);
            restClient.performRequestAsync(request, new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    responseRef.set(response);
                    latch.countDown();

                }

                @Override
                public void onFailure(Exception exception) {
                    exceptionRef.set(exception);
                    latch.countDown();
                }
            });
            latch.await();
            if (exceptionRef.get() != null) {
                throw exceptionRef.get();
            }
            return responseRef.get();
        }
    }

    /**
     * Asserts that the provided {@linkplain Exception} contains the method
     * that called this <strong>somewhere</strong> on its stack. This is
     * normally the case for synchronous calls but {@link Rest5Client} performs
     * synchronous calls by performing asynchronous calls and blocking the
     * current thread until the call returns so it has to take special care
     * to make sure that the caller shows up in the exception. We use this
     * assertion to make sure that we don't break that "special care".
     */
    private static void assertExceptionStackContainsCallingMethod(Throwable t) {
        // 0 is getStackTrace
        // 1 is this method
        // 2 is the caller, what we want
        StackTraceElement myMethod = Thread.currentThread().getStackTrace()[2];
        for (StackTraceElement se : t.getStackTrace()) {
            if (se.getClassName().equals(myMethod.getClassName()) && se.getMethodName().equals(myMethod.getMethodName())) {
                return;
            }
        }
        StringWriter stack = new StringWriter();
        t.printStackTrace(new PrintWriter(stack));
        fail("didn't find the calling method (looks like " + myMethod + ") in:\n" + stack);
    }
}
