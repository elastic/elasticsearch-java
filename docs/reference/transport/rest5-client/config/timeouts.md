
# Timeouts

Configuring requests timeouts can be done by providing an instance of `RequestConfigCallback` while building the `RestClient` through its builder. The interface has one method that receives an instance of [`org.apache.http.client.config.RequestConfig.Builder`](https://hc.apache.org/httpcomponents-client-4.5.x/current/httpclient/apidocs/org/apache/http/client/config/RequestConfig.Builder.html) as an argument and has the same return type. The request config builder can be modified and then returned. In the following example we increase the connect timeout (defaults to 1 second) and the socket timeout (defaults to 30 seconds).

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-timeouts
```java
RequestConfig.Builder requestConfigBuilder = RequestConfig.custom()
    .setConnectTimeout(Timeout.of(5000, TimeUnit.MILLISECONDS));

CloseableHttpAsyncClient httpclient = HttpAsyncClients.custom()
    .setDefaultRequestConfig(requestConfigBuilder.build())
    .build();

Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("localhost", 9200))
    .setHttpClient(httpclient);
```

Timeouts also can be set per request with RequestOptions, which overrides RestClient customizeRequestConfig.

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-request-options-timeouts
```java
RequestConfig requestConfig = RequestConfig.custom()
    .setConnectTimeout(Timeout.ofMilliseconds(5000))
    .setConnectionRequestTimeout(Timeout.ofMilliseconds(60000))
    .build();

RequestOptions options = RequestOptions.DEFAULT.toBuilder()
    .setRequestConfig(requestConfig)
    .build();
```

