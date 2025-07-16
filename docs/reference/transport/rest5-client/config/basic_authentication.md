
# Basic authentication

Configuring basic authentication can be done by providing an `HttpClientConfigCallback` while building the `RestClient` through its builder. The interface has one method that receives an instance of [`org.apache.http.impl.nio.client.HttpAsyncClientBuilder`](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/current/httpasyncclient/apidocs/org/apache/http/impl/nio/client/HttpAsyncClientBuilder.html) as an argument and has the same return type. The http client builder can be modified and then returned. In the following example we set a default credentials provider that requires basic authentication.

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

Preemptive Authentication can be disabled, which means that every request will be sent without authorization headers to see if it is accepted and, upon receiving an HTTP 401 response, it will resend the exact same request with the basic authentication header. If you wish to do this, then you can do so by disabling it via the `HttpClientConfigCallback`:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-disable-preemptive-auth
```java
HttpHost host = new HttpHost("http", "localhost", 9200);

var creds = Base64.getEncoder().encodeToString("user:test-user-password".getBytes());

Rest5ClientBuilder restClient = Rest5Client
    .builder(new HttpHost("https", "localhost", 9200))
    .setHttpClientConfigCallback(HttpAsyncClientBuilder::disableAuthCaching)
    .setDefaultHeaders(new Header[]{
        new BasicHeader("Authorization", "Basic " + creds)
    });
```

1. Disable preemptive authentication


