---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_encrypted_communication.html
---

# Encrypted communication [_encrypted_communication]

Encrypted communication using TLS can also be configured through the `HttpClientConfigCallback`. The [`org.apache.http.impl.nio.client.HttpAsyncClientBuilder`](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/current/httpasyncclient/apidocs/org/apache/http/impl/nio/client/HttpAsyncClientBuilder.md) received as an argument exposes multiple methods to configure encrypted communication: `setSSLContext`, `setSSLSessionStrategy` and `setConnectionManager`, in order of precedence from the least important.

When accessing an Elasticsearch cluster that is setup for TLS on the HTTP layer, the client needs to trust the certificate that Elasticsearch is using. The following is an example of setting up the client to trust the CA that has signed the certificate that Elasticsearch is using, when that CA certificate is available in a PKCS#12 keystore:

```java
Path trustStorePath = Paths.get("/path/to/truststore.p12");
KeyStore truststore = KeyStore.getInstance("pkcs12");
try (InputStream is = Files.newInputStream(trustStorePath)) {
    truststore.load(is, keyStorePass.toCharArray());
}
SSLContextBuilder sslBuilder = SSLContexts.custom()
    .loadTrustMaterial(truststore, null);
final SSLContext sslContext = sslBuilder.build();
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "https"))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
                HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder.setSSLContext(sslContext);
        }
    });
```

The following is an example of setting up the client to trust the CA that has signed the certificate that Elasticsearch is using, when that CA certificate is available as a PEM encoded file.

```java
Path caCertificatePath = Paths.get("/path/to/ca.crt");
CertificateFactory factory =
    CertificateFactory.getInstance("X.509");
Certificate trustedCa;
try (InputStream is = Files.newInputStream(caCertificatePath)) {
    trustedCa = factory.generateCertificate(is);
}
KeyStore trustStore = KeyStore.getInstance("pkcs12");
trustStore.load(null, null);
trustStore.setCertificateEntry("ca", trustedCa);
SSLContextBuilder sslContextBuilder = SSLContexts.custom()
    .loadTrustMaterial(trustStore, null);
final SSLContext sslContext = sslContextBuilder.build();
RestClient.builder(
    new HttpHost("localhost", 9200, "https"))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
            HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder.setSSLContext(sslContext);
        }
    });
```

When Elasticsearch is configured to require client TLS authentication, for example when a PKI realm is configured, the client needs to provide a client certificate during the TLS handshake in order to authenticate. The following is an example of setting up the client for TLS authentication with a certificate and a private key that are stored in a PKCS#12 keystore.

```java
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
SSLContextBuilder sslBuilder = SSLContexts.custom()
    .loadTrustMaterial(trustStore, null)
    .loadKeyMaterial(keyStore, keyStorePass.toCharArray());
final SSLContext sslContext = sslBuilder.build();
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "https"))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
            HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder.setSSLContext(sslContext);
        }
    });
```

If the client certificate and key are not available in a keystore but rather as PEM encoded files, you cannot use them directly to build an SSLContext. You must rely on external libraries to parse the PEM key into a PrivateKey instance. Alternatively, you can use external tools to build a keystore from your PEM files, as shown in the following example:

```
openssl pkcs12 -export -in client.crt -inkey private_key.pem \
        -name "client" -out client.p12
```

If no explicit configuration is provided, the [system default configuration](https://docs.oracle.com/javase/7/docs/technotes/guides/security/jsse/JSSERefGuide.md#CustomizingStores) will be used.

