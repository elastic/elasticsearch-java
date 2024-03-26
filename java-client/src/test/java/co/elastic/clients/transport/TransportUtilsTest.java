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

package co.elastic.clients.transport;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.json.SimpleJsonpMapper;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

public class TransportUtilsTest extends Assertions {

    @Test
    public void testNoSslContext() {
        assertThrows(
            SSLHandshakeException.class,
            () -> checkConnection(null)
        );
    }

    @Test
    public void testCaCertificate() throws Exception {
        byte[] cert = ElasticsearchTestServer.global().container().caCertAsBytes().get();

        checkConnection(
            TransportUtils.sslContextFromHttpCaCrt(new ByteArrayInputStream(cert))
        );
    }

    @Test void testCaFingerprint() throws Exception {
        byte[] pemCert = ElasticsearchTestServer.global().container().caCertAsBytes().get();

        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        Certificate x509cert = cf.generateCertificate(new ByteArrayInputStream(pemCert));

        // Compute SHA-256 fingerprint, which is what ES outputs at start time
        String fingerprint = fingerprint(x509cert.getEncoded(), "SHA-256");

        checkConnection(
            TransportUtils.sslContextFromCaFingerprint(fingerprint)
        );
    }

    @Test void testInvalidFingerprint() throws Exception {
        // Build a dummy SHA-256 signature
        String fingerprint = fingerprint("foobar".getBytes(StandardCharsets.UTF_8), "SHA-256");

        assertThrows(
            SSLHandshakeException.class,
            () -> checkConnection(
                TransportUtils.sslContextFromCaFingerprint(fingerprint)
            )
        );
    }

    private void checkConnection(SSLContext sslContext) throws Exception {
        ElasticsearchContainer container = ElasticsearchTestServer.global().container();

        BasicCredentialsProvider credsProv = new BasicCredentialsProvider();
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme")
        );

        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200), "https"))
            .setHttpClientConfigCallback(c -> c
                .setSSLContext(sslContext)
                .setDefaultCredentialsProvider(credsProv)
            )
            .build();

        RestClientTransport transport = new RestClientTransport(restClient, SimpleJsonpMapper.INSTANCE);
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        assertNotNull(esClient.info());
    }

    private String fingerprint(byte[] bytes, String algorithm) throws Exception {
        byte[] fingerprint;
        MessageDigest md = MessageDigest.getInstance(algorithm);
        md.update(bytes);
        fingerprint = md.digest();

        StringBuilder sb = new StringBuilder(fingerprint.length * 2);
        for(byte b: fingerprint) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
