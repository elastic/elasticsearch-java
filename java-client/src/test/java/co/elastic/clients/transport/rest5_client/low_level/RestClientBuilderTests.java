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

import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClients;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.message.BasicHeader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RestClientBuilderTests extends RestClientTestCase {

    @Test
    public void testBuild() throws IOException {
        try {
            Rest5Client.builder((HttpHost[]) null);
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("hosts must not be null nor empty", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost[]{});
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("hosts must not be null nor empty", e.getMessage());
        }

        try {
            Rest5Client.builder((Node[]) null);
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("nodes must not be null or empty", e.getMessage());
        }

        try {
            Rest5Client.builder(new Node[]{});
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("nodes must not be null or empty", e.getMessage());
        }

        try {
            Rest5Client.builder(new Node(new HttpHost("localhost", 9200)), null);
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("node cannot be null", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200), null);
            fail("should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("host cannot be null", e.getMessage());
        }

        try (Rest5Client restClient = Rest5Client.builder(new HttpHost("localhost", 9200)).build()) {
            assertNotNull(restClient);
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setDefaultHeaders(null);
            fail("should have failed");
        } catch (NullPointerException e) {
            assertEquals("defaultHeaders must not be null", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setDefaultHeaders(new Header[]{null});
            fail("should have failed");
        } catch (NullPointerException e) {
            assertEquals("default header must not be null", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setFailureListener(null);
            fail("should have failed");
        } catch (NullPointerException e) {
            assertEquals("failureListener must not be null", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setHttpClient(null);
            fail("should have failed");
        } catch (NullPointerException e) {
            assertEquals("custom rest client must not be null", e.getMessage());
        }

        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setSSLContext(null);
            fail("should have failed");
        } catch (NullPointerException e) {
            assertEquals("ssl context must not be null", e.getMessage());
        }

        int numNodes = randomIntBetween(1, 5);
        HttpHost[] hosts = new HttpHost[numNodes];
        for (int i = 0; i < numNodes; i++) {
            hosts[i] = new HttpHost("localhost", 9200 + i);
        }
        Rest5ClientBuilder builder = Rest5Client.builder(hosts);
        CloseableHttpAsyncClient httpclient = HttpAsyncClients.custom()
            .build();
        if (randomBoolean()) {
            builder.setHttpClient(httpclient);
        }
        if (randomBoolean()) {
            int numHeaders = randomIntBetween(1, 5);
            Header[] headers = new Header[numHeaders];
            for (int i = 0; i < numHeaders; i++) {
                headers[i] = new BasicHeader("header" + i, "value");
            }
            builder.setDefaultHeaders(headers);
        }
        if (randomBoolean()) {
            String pathPrefix = (randomBoolean() ? "/" : "") + randomAsciiLettersOfLengthBetween(2, 5);
            while (pathPrefix.length() < 20 && randomBoolean()) {
                pathPrefix += "/" + randomAsciiLettersOfLengthBetween(3, 6);
            }
            builder.setPathPrefix(pathPrefix + (randomBoolean() ? "/" : ""));
        }
        try (Rest5Client restClient = builder.build()) {
            assertNotNull(restClient);
        }
    }

    public void testSetPathPrefixNull() {
        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setPathPrefix(null);
            fail("pathPrefix set to null should fail!");
        } catch (final NullPointerException e) {
            assertEquals("pathPrefix must not be null", e.getMessage());
        }
    }

    @Test
    public void testSetPathPrefixEmpty() {
        assertSetPathPrefixThrows("");
    }

    @Test
    public void testSetPathPrefixMalformed() {
        assertSetPathPrefixThrows("//");
        assertSetPathPrefixThrows("base/path//");
    }

    private static void assertSetPathPrefixThrows(final String pathPrefix) {
        try {
            Rest5Client.builder(new HttpHost("localhost", 9200)).setPathPrefix(pathPrefix);
            fail("path prefix [" + pathPrefix + "] should have failed");
        } catch (final IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString(pathPrefix));
        }
    }
}
