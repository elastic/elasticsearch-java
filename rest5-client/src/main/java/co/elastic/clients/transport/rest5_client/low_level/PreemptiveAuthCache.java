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

import org.apache.hc.client5.http.auth.AuthCache;
import org.apache.hc.client5.http.auth.AuthScheme;
import org.apache.hc.client5.http.auth.AuthScope;
import org.apache.hc.client5.http.auth.Credentials;
import org.apache.hc.client5.http.auth.CredentialsProvider;
import org.apache.hc.client5.http.auth.StandardAuthScheme;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.hc.client5.http.impl.auth.BasicScheme;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.URIScheme;

/**
 * Authenticates requests to a node preemptively with the Basic credentials of the client's credentials provider,
 * if it has some for that node. This behaves exactly like the httpclient4 {@code BasicAuthCache} used by the legacy
 * {@code RestClient}, which httpclient5 can't replicate since its cached schemes must already hold the credentials.
 * <p>
 * One instance is used per attempt: credentials are looked up in the attempt's context, where the http client sets
 * its credentials provider.
 */
class PreemptiveAuthCache implements AuthCache {

    private final HttpHost node;
    private final HttpClientContext context;

    PreemptiveAuthCache(HttpHost node, HttpClientContext context) {
        this.node = node;
        this.context = context;
    }

    @Override
    public AuthScheme get(HttpHost host) {
        // Only the node: credentials meant for Elasticsearch must not be sent to a proxy
        if (!sameOrigin(host, node)) {
            return null;
        }
        CredentialsProvider credentialsProvider = context.getCredentialsProvider();
        if (credentialsProvider == null) {
            return null;
        }
        Credentials credentials = credentialsProvider.getCredentials(
            new AuthScope(host, null, StandardAuthScheme.BASIC), context
        );
        if (!(credentials instanceof UsernamePasswordCredentials)) {
            return null;
        }
        BasicScheme scheme = new BasicScheme();
        scheme.initPreemptive(credentials);
        return scheme;
    }

    @Override
    public void put(HttpHost host, AuthScheme authScheme) {
        // Nothing to remember: the scheme is created again for each attempt
    }

    @Override
    public void remove(HttpHost host) {
    }

    @Override
    public void clear() {
    }

    private static boolean sameOrigin(HttpHost a, HttpHost b) {
        return a.getSchemeName().equalsIgnoreCase(b.getSchemeName())
            && a.getHostName().equalsIgnoreCase(b.getHostName())
            && port(a) == port(b);
    }

    private static int port(HttpHost host) {
        if (host.getPort() >= 0) {
            return host.getPort();
        }
        return URIScheme.HTTPS.same(host.getSchemeName()) ? 443 : 80;
    }
}
