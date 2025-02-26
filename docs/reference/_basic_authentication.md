---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_basic_authentication.html
---

# Basic authentication [_basic_authentication]

Configuring basic authentication can be done by providing an `HttpClientConfigCallback` while building the `RestClient` through its builder. The interface has one method that receives an instance of [`org.apache.http.impl.nio.client.HttpAsyncClientBuilder`](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/current/httpasyncclient/apidocs/org/apache/http/impl/nio/client/HttpAsyncClientBuilder.md) as an argument and has the same return type. The http client builder can be modified and then returned. In the following example we set a default credentials provider that requires basic authentication.

```java
final CredentialsProvider credentialsProvider =
    new BasicCredentialsProvider();
credentialsProvider.setCredentials(AuthScope.ANY,
    new UsernamePasswordCredentials("user", "test-user-password"));

RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
                HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder
                .setDefaultCredentialsProvider(credentialsProvider);
        }
    });
```

Preemptive Authentication can be disabled, which means that every request will be sent without authorization headers to see if it is accepted and, upon receiving an HTTP 401 response, it will resend the exact same request with the basic authentication header. If you wish to do this, then you can do so by disabling it via the `HttpAsyncClientBuilder`:

```java
final CredentialsProvider credentialsProvider =
    new BasicCredentialsProvider();
credentialsProvider.setCredentials(AuthScope.ANY,
    new UsernamePasswordCredentials("user", "test-user-password"));

RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
                HttpAsyncClientBuilder httpClientBuilder) {
            httpClientBuilder.disableAuthCaching(); <1>
            return httpClientBuilder
                .setDefaultCredentialsProvider(credentialsProvider);
        }
    });
```

1. Disable preemptive authentication


