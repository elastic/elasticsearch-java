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

package co.elastic.clients.documentation.rest5_client;

import co.elastic.clients.transport.rest5_client.low_level.Cancellable;
import co.elastic.clients.transport.rest5_client.low_level.HttpAsyncResponseConsumerFactory;
import co.elastic.clients.transport.rest5_client.low_level.Node;
import co.elastic.clients.transport.rest5_client.low_level.NodeSelector;
import co.elastic.clients.transport.rest5_client.low_level.Request;
import co.elastic.clients.transport.rest5_client.low_level.RequestOptions;
import co.elastic.clients.transport.rest5_client.low_level.Response;
import co.elastic.clients.transport.rest5_client.low_level.ResponseListener;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest5_client.low_level.Rest5ClientBuilder;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManager;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManagerBuilder;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.RequestLine;
import org.apache.hc.core5.reactor.IOReactorConfig;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.Timeout;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Base64;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * This class is used to generate the Java low-level REST client documentation.
 * You need to wrap your code between two tags like:
 * // tag::example[]
 * // end::example[]
 * <p>
 * Where example is your tag name.
 * <p>
 * Then in the documentation, you can extract what is between tag and end tags with
 * ["source","java",subs="attributes,callouts,macros"]
 * --------------------------------------------------
 * include-tagged::{doc-tests}/RestClientDocumentation.java[example]
 * --------------------------------------------------
 * <p>
 * Note that this is not a test class as we are only interested in testing that docs snippets compile. We
 * don't want
 * to send requests to a node and we don't even have the tools to do it.
 */
@SuppressWarnings("unused")
public class RestClientDocumentation {
    private static final String TOKEN = "DUMMY";

    //tag::rest-client-options-singleton
    private static final RequestOptions COMMON_OPTIONS;

    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT
            .toBuilder()
            .addHeader("Authorization", "Bearer " + TOKEN) // <1>
            .setHttpAsyncResponseConsumerFactory(           // <2>
                HttpAsyncResponseConsumerFactory.DEFAULT
            );

        COMMON_OPTIONS = builder.build();
    }
    //end::rest-client-options-singleton

    @SuppressWarnings("unused")
    public void usage() throws IOException, InterruptedException, ParseException {

        //tag::rest-client-init
        Rest5Client restClient = Rest5Client.builder(
            URI.create("http://localhost:9200"),
            URI.create("http://localhost:9201")
        ).build();
        //end::rest-client-init

        //tag::rest-client-close
        restClient.close();
        //end::rest-client-close

        {
            //tag::rest-client-init-default-headers
            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("http", "localhost", 9200));

            Header[] defaultHeaders = new Header[]{new BasicHeader("header", "value")};
            builder.setDefaultHeaders(defaultHeaders); // <1>
            //end::rest-client-init-default-headers
        }
        {
            //tag::rest-client-init-node-selector
            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("http", "localhost", 9200));

            builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS); // <1>
            //end::rest-client-init-node-selector
        }
        {
            //tag::rest-client-init-allocation-aware-selector
            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("http", "localhost", 9200));

            builder.setNodeSelector(nodes -> { // <1>
                /*
                 * Prefer any node that belongs to rack_one. If none is around
                 * we will go to another rack till it's time to try and revive
                 * some of the nodes that belong to rack_one.
                 */
                boolean foundOne = false;
                for (Node node : nodes) {
                    String rackId = node.getAttributes().get("rack_id").get(0);
                    if ("rack_one".equals(rackId)) {
                        foundOne = true;
                        break;
                    }
                }
                if (foundOne) {
                    Iterator<Node> nodesIt = nodes.iterator();
                    while (nodesIt.hasNext()) {
                        Node node = nodesIt.next();
                        String rackId = node.getAttributes().get("rack_id").get(0);
                        if (!"rack_one".equals(rackId)) {
                            nodesIt.remove();
                        }
                    }
                }
            });
            //end::rest-client-init-allocation-aware-selector
        }
        {
            //tag::rest-client-init-failure-listener
            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("http", "localhost", 9200));

            builder.setFailureListener(new Rest5Client.FailureListener() {
                @Override
                public void onFailure(Node node) {
                    // <1>
                }
            });
            //end::rest-client-init-failure-listener
        }
        {
            //tag::rest-client-init-request-custom-client
            PoolingAsyncClientConnectionManager connectionManager =
                PoolingAsyncClientConnectionManagerBuilder.create()
                    .setMaxConnPerRoute(5)
                    .build();

            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("http", "localhost", 9200))
                .setHttpClientConfigCallback(c -> c
                    .setConnectionManager(connectionManager)
                );
            //end::rest-client-init-request-config-callback
        }

        {
            //tag::rest-client-sync
            Request request = new Request(
                "GET",  // <1>
                "/");   // <2>

            Response response = restClient.performRequest(request);
            //end::rest-client-sync
        }
        {
            //tag::rest-client-async
            Request request = new Request(
                "GET",  // <1>
                "/");   // <2>

            Cancellable cancellable = restClient.performRequestAsync(
                request,
                new ResponseListener() {
                    @Override
                    public void onSuccess(Response response) {
                        // <3>
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        // <4>
                    }
                });
            //end::rest-client-async
        }
        {
            Request request = new Request("GET", "/");

            //tag::rest-client-parameters
            request.addParameter("pretty", "true");
            //end::rest-client-parameters

            //tag::rest-client-body
            request.setEntity(new StringEntity(
                "{\"json\":\"text\"}",
                ContentType.APPLICATION_JSON));
            //end::rest-client-body

            //tag::rest-client-body-shorter
            request.setJsonEntity("{\"json\":\"text\"}");
            //end::rest-client-body-shorter

            //tag::rest-client-options-set-singleton
            request.setOptions(COMMON_OPTIONS);
            //end::rest-client-options-set-singleton
            {
                //tag::rest-client-options-customize-header
                RequestOptions.Builder options = COMMON_OPTIONS.toBuilder();
                options.addHeader("cats", "knock things off of other things");
                request.setOptions(options);
                //end::rest-client-options-customize-header
            }
        }
        {
            HttpEntity[] documents = new HttpEntity[10];
            //tag::rest-client-async-example
            final CountDownLatch latch = new CountDownLatch(documents.length);
            for (int i = 0; i < documents.length; i++) {
                Request request = new Request("PUT", "/posts/doc/" + i);
                //let's assume that the documents are stored in an HttpEntity array
                request.setEntity(documents[i]);
                restClient.performRequestAsync(
                    request,
                    new ResponseListener() {
                        @Override
                        public void onSuccess(Response response) {
                            // <1>
                            latch.countDown();
                        }

                        @Override
                        public void onFailure(Exception exception) {
                            // <2>
                            latch.countDown();
                        }
                    }
                );
            }
            latch.await();
            //end::rest-client-async-example
        }
        {
            //tag::rest-client-async-cancel
            Request request = new Request("GET", "/posts/_search");
            Cancellable cancellable = restClient.performRequestAsync(
                request,
                new ResponseListener() {
                    @Override
                    public void onSuccess(Response response) {
                        // <1>
                    }

                    @Override
                    public void onFailure(Exception exception) {
                        // <2>
                    }
                }
            );
            cancellable.cancel();
            //end::rest-client-async-cancel
        }
        {
            //tag::rest-client-response2
            Response response = restClient.performRequest(new Request("GET", "/"));

            RequestLine requestLine = response.getRequestLine(); // <1>
            HttpHost host = response.getHost(); // <2>
            int statusCode = response.getStatusCode(); // <3>
            Header[] headers = response.getHeaders(); // <4>
            String responseBody = EntityUtils.toString(response.getEntity()); // <5>
            //end::rest-client-response2
        }
    }

    @SuppressWarnings("unused")
    public void commonConfiguration() throws Exception {
        {
            //tag::rest-client-config-timeouts
            RequestConfig.Builder requestConfigBuilder = RequestConfig.custom()
                .setConnectTimeout(Timeout.of(5000, TimeUnit.MILLISECONDS));

            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("localhost", 9200))
                .setHttpClientConfigCallback(c -> c
                    .setDefaultRequestConfig(requestConfigBuilder.build()));
            //end::rest-client-config-timeouts
        }
        {
            //tag::rest-client-config-request-options-timeouts
            RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(5000))
                .setConnectionRequestTimeout(Timeout.ofMilliseconds(60000))
                .build();

            RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .setRequestConfig(requestConfig)
                .build();
            //end::rest-client-config-request-options-timeouts
        }
        {
            //tag::rest-client-config-threads

            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("localhost", 9200))
                .setHttpClientConfigCallback(c -> c
                    .setIOReactorConfig(IOReactorConfig.custom().setIoThreadCount(1).build()
                ));
            //end::rest-client-config-threads
        }
        {
            //tag::rest-client-config-basic-auth
            var creds = Base64.getEncoder()
                .encodeToString("user:test-user-password".getBytes());

            Rest5ClientBuilder restClient = Rest5Client
                .builder(new HttpHost("https", "localhost", 9200))
                .setDefaultHeaders(new Header[]{
                    new BasicHeader("Authorization", "Basic " + creds)
                });

            //end::rest-client-config-basic-auth
        }
        {
            //tag::rest-client-config-disable-preemptive-auth
            HttpHost host = new HttpHost("http", "localhost", 9200);

            var creds = Base64.getEncoder().encodeToString("user:test-user-password".getBytes());

            Rest5ClientBuilder restClient = Rest5Client
                .builder(new HttpHost("https", "localhost", 9200))
                .setHttpClientConfigCallback(HttpAsyncClientBuilder::disableAuthCaching) // <1>
                .setDefaultHeaders(new Header[]{
                    new BasicHeader("Authorization", "Basic " + creds)
                });
            //end::rest-client-config-disable-preemptive-auth
        }
        {
            String keyStorePass = "";
            //tag::rest-client-config-encrypted-communication
            Path trustStorePath = Paths.get("/path/to/truststore.p12");
            KeyStore truststore = KeyStore.getInstance("pkcs12");
            try (InputStream is = Files.newInputStream(trustStorePath)) {
                truststore.load(is, keyStorePass.toCharArray());
            }

            SSLContext sslContext = SSLContexts.custom()
                .loadTrustMaterial(truststore, null)
                .build();

            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("https", "localhost", 9200))
                .setSSLContext(sslContext);
            //end::rest-client-config-encrypted-communication
        }
        {
            //tag::rest-client-config-trust-ca-pem
            Path caCertificatePath = Paths.get("/path/to/ca.crt");
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            Certificate trustedCa;
            try (InputStream is = Files.newInputStream(caCertificatePath)) {
                trustedCa = factory.generateCertificate(is);
            }

            KeyStore trustStore = KeyStore.getInstance("pkcs12");
            trustStore.load(null, null);
            trustStore.setCertificateEntry("ca", trustedCa);

            SSLContext sslContext = SSLContexts.custom()
                .loadTrustMaterial(trustStore, null)
                .build();

            Rest5Client
                .builder(new HttpHost("https", "localhost", 9200))
                .setSSLContext(sslContext);
            //end::rest-client-config-trust-ca-pem
        }
        {
            String trustStorePass = "";
            String keyStorePass = "";
            //tag::rest-client-config-mutual-tls-authentication
            Path trustStorePath = Paths.get("/path/to/your/truststore.p12");
            Path keyStorePath = Paths.get("/path/to/your/keystore.p12");
            KeyStore trustStore = KeyStore.getInstance("pkcs12");
            KeyStore keyStore = KeyStore.getInstance("pkcs12");

            try (InputStream is = Files.newInputStream(trustStorePath)) {
                trustStore.load(is, trustStorePass.toCharArray());
            }

            try (InputStream is = Files.newInputStream(keyStorePath)) {
                keyStore.load(is, keyStorePass.toCharArray());
            }

            SSLContext sslContext = SSLContexts.custom()
                .loadTrustMaterial(trustStore, null)
                .loadKeyMaterial(keyStore, keyStorePass.toCharArray())
                .build();

            Rest5Client
                .builder(new HttpHost("https", "localhost", 9200))
                .setSSLContext(sslContext);
            //end::rest-client-config-mutual-tls-authentication
        }
        {
            //tag::rest-client-auth-bearer-token
            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("https", "localhost", 9200));

            Header[] defaultHeaders = new Header[]{ new BasicHeader(
                "Authorization",
                "Bearer u6iuAxZ0RG1Kcm5jVFI4eU4tZU9aVFEwT2F3"
            )};

            builder.setDefaultHeaders(defaultHeaders);
            //end::rest-client-auth-bearer-token
        }
        {
            //tag::rest-client-auth-api-key
            String apiKeyId = "uqlEyn8B_gQ_jlvwDIvM";
            String apiKeySecret = "HxHWk2m4RN-V_qg9cDpuX";
            String apiKeyAuth = Base64.getEncoder().encodeToString(
                    (apiKeyId + ":" + apiKeySecret).getBytes(StandardCharsets.UTF_8)
            );

            Rest5ClientBuilder builder = Rest5Client
                .builder(new HttpHost("https", "localhost", 9200));

            Header[] defaultHeaders = new Header[]{ new BasicHeader(
                "Authorization",
                "ApiKey " + apiKeyAuth
            )};

            builder.setDefaultHeaders(defaultHeaders);
            //end::rest-client-auth-api-key
        }
    }
}
