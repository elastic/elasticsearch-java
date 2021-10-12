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

package co.elastic.clients.base;

import co.elastic.clients.base.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.junit.Test;

import static co.elastic.clients.base.UserAgent.DEFAULT_NAME;
import static co.elastic.clients.base.UserAgent.DEFAULT_VERSION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class UserAgentTest {

    private static final String DEFAULT_USER_AGENT = String.format("%s/%s", DEFAULT_NAME, DEFAULT_VERSION);

    private static final String CUSTOM_NAME = "ÜberClient";
    private static final String CUSTOM_VERSION = "1.0.13";
    private static final String CUSTOM_USER_AGENT = String.format("%s/%s", CUSTOM_NAME, CUSTOM_VERSION);

    private static final String CUSTOM_NAME_2 = "MegaClient";
    private static final String CUSTOM_VERSION_2 = "6.7.8";

    @Test
    public void testDefaultUserAgent() throws Exception {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        Transport transport = new RestClientTransport(restClient, null);
        assertEquals(DEFAULT_USER_AGENT, transport.userAgent());
    }

    @Test
    public void testCustomUserAgent() throws Exception {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        Transport transport = new RestClientTransport(restClient, null, null,
                new UserAgent(CUSTOM_NAME, CUSTOM_VERSION));
        assertEquals(CUSTOM_USER_AGENT, transport.userAgent());
    }

    @Test
    public void testManualUserAgent() throws Exception {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        Transport transport = new RestClientTransport(restClient, null,
                RequestOptions.DEFAULT.toBuilder().addHeader("User-Agent", CUSTOM_USER_AGENT).build());
        assertEquals(CUSTOM_USER_AGENT, transport.userAgent());
    }

    @Test
    public void testMultipleUserAgentsThrowsException() throws Exception {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Transport transport = new RestClientTransport(restClient, null,
                    RequestOptions.DEFAULT.toBuilder().addHeader("User-Agent", CUSTOM_USER_AGENT).build(),
                    new UserAgent(CUSTOM_NAME_2, CUSTOM_VERSION_2));
        });
    }

}
