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

//TODO rewrite
package clients.rest5_client.documentation.getting_started;

public class ConnectingTest {

    /*@Disabled // we don't have a running ES
    @Test
    public void createClient() throws Exception {
        //tag::create-client
        // URL and API key
        String serverUrl = "https://localhost:9200";
        String apiKey = "VnVhQ2ZHY0JDZGJrU...";

        // Create the low-level client
        RestClient restClient = RestClient
            .builder(HttpHost.create(serverUrl))
            .setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "ApiKey " + apiKey)
            })
            .build();

        // Create the transport with a Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(
            restClient, new JacksonJsonpMapper());

        // And create the API client
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Use the client...

        // Close the client, also closing the underlying transport object and network connections.
        esClient.close();
        //end::create-client

        //tag::first-request
        SearchResponse<Product> search = esClient.search(s -> s
            .index("products")
            .query(q -> q
                .term(t -> t
                    .field("name")
                    .value(v -> v.stringValue("bicycle"))
                )),
            Product.class);

        for (Hit<Product> hit: search.hits().hits()) {
            processProduct(hit.source());
        }
        //end::first-request
    }

    @Disabled // we don't have a running ES
    @Test
    public void createClientWithOpenTelemetry() throws Exception {
        //tag::create-client-otel
        // URL and API key
        String serverUrl = "https://localhost:9200";
        String apiKey = "VnVhQ2ZHY0JDZGJrU...";

        // Create the low-level client
        RestClient restClient = RestClient
            .builder(HttpHost.create(serverUrl))
            .setDefaultHeaders(new Header[]{
                    new BasicHeader("Authorization", "ApiKey " + apiKey)
            })
            .build();
        // Create and configure custom OpenTelemetry instance
        OpenTelemetry customOtel = OpenTelemetrySdk.builder().build();

        // Create Instrumentation instance using the custom OpenTelemetry instance
        // Second constructor argument allows to enable/disable search body capturing
        OpenTelemetryForElasticsearch esOtelInstrumentation =
            new OpenTelemetryForElasticsearch(customOtel, false);

        // Create the transport with the custom Instrumentation instance
        ElasticsearchTransport transport = new RestClientTransport(
            restClient, new JacksonJsonpMapper(), null, esOtelInstrumentation
        );

        // And create the API client
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Use the client...

        // Close the client, also closing the underlying transport object and network connections.
        esClient.close();
        //end::create-client-otel
    }

    @Disabled // we don't have a running ES
    @Test
    public void createSecureClientCert() throws Exception {

        // Create the low-level client
        String host = "localhost";
        int port = 9200;
        String login = "elastic";
        String password = "changeme";

        //tag::create-secure-client-cert
        File certFile = new File("/path/to/http_ca.crt");

        SSLContext sslContext = TransportUtils
            .sslContextFromHttpCaCrt(certFile); // <1>

        BasicCredentialsProvider credsProv = new BasicCredentialsProvider(); // <2>
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials(login, password)
        );

        RestClient restClient = RestClient
            .builder(new HttpHost(host, port, "https")) // <3>
            .setHttpClientConfigCallback(hc -> hc
                .setSSLContext(sslContext) // <4>
                .setDefaultCredentialsProvider(credsProv)
            )
            .build();

        // Create the transport and the API client
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Use the client...

        // Close the client, also closing the underlying transport object and network connections.
        esClient.close();
        //end::create-secure-client-cert
    }

    @Disabled // we don't have a running ES
    @Test
    public void createSecureClientFingerPrint() throws Exception {

        // Create the low-level client
        String host = "localhost";
        int port = 9200;
        String login = "elastic";
        String password = "changeme";

        //tag::create-secure-client-fingerprint
        String fingerprint = "<certificate fingerprint>";

        SSLContext sslContext = TransportUtils
            .sslContextFromCaFingerprint(fingerprint); // <1>

        BasicCredentialsProvider credsProv = new BasicCredentialsProvider(); // <2>
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials(login, password)
        );

        RestClient restClient = RestClient
            .builder(new HttpHost(host, port, "https")) // <3>
            .setHttpClientConfigCallback(hc -> hc
                .setSSLContext(sslContext) // <4>
                .setDefaultCredentialsProvider(credsProv)
            )
            .build();

        // Create the transport and the API client
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Use the client...

        // Close the client, also closing the underlying transport object and network connections.
        esClient.close();
        //end::create-secure-client-fingerprint
    }

    private void processProduct(Product p) {}*/

}

