---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/connecting.html
---

# Connecting [connecting]

The Java API Client is structured around three main components:

* **API client classes**. These provide strongly typed data structures and methods for {{es}} APIs. Since the {{es}} API is large, it is structured in feature groups (also called “namespaces”), each having its own client class. {{es}} core features are implemented in the `ElasticsearchClient` class.
* **A JSON object mapper**. This maps your application classes to JSON and seamlessly integrates them with the API client.
* **A transport layer implementation**. This is where all HTTP request handling takes place.

This code snippet creates and wires together these three components:

% :::{include-code} src={{doc-tests-src}}/getting_started/ConnectingTest.java tag=create-client
```java
// URL and API key
String serverUrl = "https://localhost:9200";
String apiKey = "VnVhQ2ZHY0JDZGJrU...";

ElasticsearchClient esClient = ElasticsearchClient.of(b -> b
    .host(serverUrl)
    .apiKey(apiKey)
    // Use the Jackson mapper to deserialize JSON to application objects
    .jsonMapper(new JacksonJsonpMapper())
);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```

Authentication is managed by the [Java Low Level REST Client](/reference/transport/rest-client/index.md). For further details on configuring authentication, refer to [its documentation](/reference/transport/rest-client/config/basic_authentication.md).


## Your first request [_your_first_request]

The code snippet below searches all items from a “product” index whose name matches “bicycle” and return them as instances of a `Product` application class.

It illustrates the use of fluent functional builders to write search queries as concise DSL-like code. This pattern is explained in more detail in [*API conventions*](/reference/api-conventions/index.md).

% :::{include-code} src={{doc-tests-src}}/getting_started/ConnectingTest.java tag=first-request
```java
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
```

## Using a secure connection [using-a-secure-connection]

The [Java Low Level REST Client](/reference/transport/rest-client/index.md) documentation explains how to set up encrypted communications in detail.

In self-managed installations, Elasticsearch will start with security features like authentication and TLS enabled. To connect to the Elasticsearch cluster you’ll need to configure the Java API Client to use HTTPS with the generated CA certificate in order to make requests successfully.

When you start Elasticsearch for the first time you’ll see a distinct block like the one below in the output from Elasticsearch (you may have to scroll up if it’s been a while):

```
-> Elasticsearch security features have been automatically configured!
-> Authentication is enabled and cluster connections are encrypted.

->  Password for the elastic user (reset with `bin/elasticsearch-reset-password -u elastic`):
  lhQpLELkjkrawaBoaz0Q

->  HTTP CA certificate SHA-256 fingerprint:
  a52dd93511e8c6045e21f16654b77c9ee0f34aea26d9f40320b531c474676228
...
```

Note down the elastic user password and HTTP CA fingerprint for the next sections. In the examples below they will be stored in the variables `password` and `fingerprint` respectively.

Depending on the context, you have two options for verifying the HTTPS connection: either verifying with the CA certificate itself or using the CA certificate fingerprint. For both cases, the Java API Client’s `TransportUtils` class provides convenience methods to easily create an `SSLContext`.


### Verifying HTTPS with a certificate fingerprint [_verifying_https_with_a_certificate_fingerprint]

This method of verifying the HTTPS connection uses the certificate fingerprint value noted down earlier.

% :::{include-code} src={{doc-tests-src}}/getting_started/ConnectingTest.java tag=create-secure-client-fingerprint
```java
String fingerprint = "<certificate fingerprint>";

SSLContext sslContext = TransportUtils
    .sslContextFromCaFingerprint(fingerprint); // <1>

ElasticsearchClient esClient = ElasticsearchClient.of(b -> b
    .host(url) // <3>
    .usernameAndPassword(login, password) // <2>
    .sslContext(sslContext) // <4>
);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```

1. Create an `SSLContext` with the certificate fingerprint.
2. Set up authentication.
3. Do not forget to set the protocol to `https`!
4. Configure the http client with the SSL and authentication configurations.


Note that the certificate fingerprint can also be calculated using `openssl x509` with the certificate file:

```bash
openssl x509 -fingerprint -sha256 -noout -in /path/to/http_ca.crt
```

If you don’t have access to the generated CA file from Elasticsearch you can use the following script to output the root CA fingerprint of the Elasticsearch instance with `openssl s_client`:

```bash
openssl s_client -connect localhost:9200 -servername localhost -showcerts </dev/null 2>/dev/null \
  | openssl x509 -fingerprint -sha256 -noout -in /dev/stdin
```


### Verifying HTTPS with a CA certificate [_verifying_https_with_a_ca_certificate]

The generated root CA certificate can be found in the `certs` directory in your Elasticsearch config location. If you’re running Elasticsearch in Docker there is [additional documentation](docs-content://deploy-manage/deploy/self-managed/install-elasticsearch-with-docker.md) for retrieving the CA certificate.

Once you have made the `http_ca.crt` file available to your application, you can use it to set up the client:

% :::{include-code} src={{doc-tests-src}}/getting_started/ConnectingTest.java tag=create-secure-client-cert
```java
File certFile = new File("/path/to/http_ca.crt");

SSLContext sslContext = TransportUtils
    .sslContextFromHttpCaCrt(certFile); // <1>

ElasticsearchClient esClient = ElasticsearchClient.of(b -> b
    .host(url) // <3>
    .usernameAndPassword(login, password) // <2>
    .sslContext(sslContext) // <4>
);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```

1. Create an `SSLContext` with the `http_ca.crt` file.
2. Set up authentication.
3. Do not forget to set the protocol to `https`!
4. Configure the http client with the SSL and authentication configurations.


:::{include} /reference/_snippets/doc-tests-blurb.md
:::
