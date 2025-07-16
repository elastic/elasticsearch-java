
# Timeouts

Configuring requests timeouts can be done by using the `setRequestConfigCallback` method while building the `RestClient`. In the following example we increase the connect timeout (defaults to 30 second) and the response timeout (defaults to 0, which is infinite).

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-timeouts
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("localhost", 9200))
    .setRequestConfigCallback(r -> r
        .setConnectTimeout(Timeout.of(5000, TimeUnit.MILLISECONDS))
        .setResponseTimeout(Timeout.of(30000, TimeUnit.MILLISECONDS))
        .build()
    );
```

Timeouts also can be set per request with RequestOptions, which overrides RestClient's builder. The RequestOptions can then be set in the Rest5ClientTransport constructor.

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-request-options-timeouts
```java
RequestConfig requestConfig = RequestConfig.custom()
    .setConnectTimeout(Timeout.ofMilliseconds(5000))
    .setConnectionRequestTimeout(Timeout.ofMilliseconds(60000))
    .build();

RequestOptions options = RequestOptions.DEFAULT.toBuilder()
    .setRequestConfig(requestConfig)
    .build();

ElasticsearchTransport transport = new Rest5ClientTransport(
    restClient, new JacksonJsonpMapper(), options);
```

