---
navigation_title: Basic authentication
---

# Basic authentication setup for {{es}} Java REST 5 client

To use basic authentication in the REST 5 client, set a default authorization header:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-basic-auth
```java
var creds = Base64.getEncoder()
    .encodeToString("user:test-user-password".getBytes());

Rest5ClientBuilder restClient = Rest5Client
    .builder(new HttpHost("https", "localhost", 9200))
    .setDefaultHeaders(new Header[]{
        new BasicHeader("Authorization", "Basic " + creds)
    });

```

To configure authentication behavior, pass an `HttpClientConfigCallback` when building the `Rest5Client`. The callback's single method takes an instance of [`org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder`](https://hc.apache.org/httpcomponents-client-5.5.x/current/httpclient5/apidocs/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.html) as an argument and returns the same type, so you can modify the provided builder and return it for the client to use.

By default, the HTTP client uses preemptive authentication: it includes credentials in the initial request. You might want to use non-preemptive authentication, which sends a request without credentials and retries with the header after a `401 Unauthorized` challenge. To do this, set an `HttpClientConfigCallback` with auth caching disabled:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-disable-preemptive-auth
```java
HttpHost host = new HttpHost("http", "localhost", 9200);

var creds = Base64.getEncoder().encodeToString("user:test-user-password".getBytes());

Rest5ClientBuilder restClient = Rest5Client
    .builder(new HttpHost("https", "localhost", 9200))
    .setHttpClientConfigCallback(HttpAsyncClientBuilder::disableAuthCaching) <1>
    .setDefaultHeaders(new Header[]{
        new BasicHeader("Authorization", "Basic " + creds)
    });
```

1. Disables preemptive authentication

For more options, refer to [](other_authentication_methods.md).
