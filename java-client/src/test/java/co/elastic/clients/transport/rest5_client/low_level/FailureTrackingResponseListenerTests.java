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

import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.ProtocolVersion;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.message.RequestLine;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class FailureTrackingResponseListenerTests extends RestClientTestCase {

    @Test
    public void testOnSuccess() {
        MockResponseListener responseListener = new MockResponseListener();
        Rest5Client.FailureTrackingResponseListener listener =
            new Rest5Client.FailureTrackingResponseListener(responseListener);

        final Response response = mockResponse();
        listener.onSuccess(response);
        assertSame(response, responseListener.lastResponse.get());
        assertNull(responseListener.lastException.get());
    }

    @Test
    public void testOnFailure() {
        MockResponseListener responseListener = new MockResponseListener();
        Rest5Client.FailureTrackingResponseListener listener =
            new Rest5Client.FailureTrackingResponseListener(responseListener);
        int numIters = randomIntBetween(1, 10);
        Exception[] expectedExceptions = new Exception[numIters];
        for (int i = 0; i < numIters; i++) {
            RuntimeException runtimeException = new RuntimeException("test" + i);
            expectedExceptions[i] = runtimeException;
            listener.trackFailure(runtimeException);
            assertNull(responseListener.lastResponse.get());
            assertNull(responseListener.lastException.get());
        }

        if (randomBoolean()) {
            Response response = mockResponse();
            listener.onSuccess(response);
            assertSame(response, responseListener.lastResponse.get());
            assertNull(responseListener.lastException.get());
        } else {
            RuntimeException runtimeException = new RuntimeException("definitive");
            listener.onDefinitiveFailure(runtimeException);
            assertNull(responseListener.lastResponse.get());
            Throwable exception = responseListener.lastException.get();
            assertSame(runtimeException, exception);

            int i = numIters - 1;
            do {
                assertNotNull(exception.getSuppressed());
                assertEquals(1, exception.getSuppressed().length);
                assertSame(expectedExceptions[i--], exception.getSuppressed()[0]);
                exception = exception.getSuppressed()[0];
            } while (i >= 0);
        }
    }

    private static class MockResponseListener implements ResponseListener {
        private final AtomicReference<Response> lastResponse = new AtomicReference<>();
        private final AtomicReference<Exception> lastException = new AtomicReference<>();

        @Override
        public void onSuccess(Response response) {
            if (!this.lastResponse.compareAndSet(null, response)) {
                throw new IllegalStateException("onSuccess was called multiple times");
            }
        }

        @Override
        public void onFailure(Exception exception) {
            if (!this.lastException.compareAndSet(null, exception)) {
                throw new IllegalStateException("onFailure was called multiple times");
            }
        }
    }

    private static Response mockResponse() {
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        RequestLine requestLine = new RequestLine("GET", "/", protocolVersion);
        BasicClassicHttpResponse httpResponse = new BasicClassicHttpResponse(200, "OK");
        return new Response(requestLine, new HttpHost("localhost", 9200), httpResponse);
    }
}
