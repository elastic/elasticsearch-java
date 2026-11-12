---
navigation_title: Timeouts
---

# Configuring timeouts in the {{es}} Java REST 5 client

You can set timeouts when building the `Rest5Client`:

- The **connect timeout** is the maximum time for establishing a TCP connection, including the TLS handshake. The connect timeout is set on `ConnectionConfig`.
- The **socket timeout** is the maximum time to wait for I/O on an established socket. The socket timeout is set on `ConnectionConfig`.
- The **response timeout** is the maximum period to wait for response data. The response timeout is set on `RequestConfig`. 
- The **connection request timeout** is the maximum time for leasing a connection from the pool. The connection request timeout is set on `RequestConfig`. 

To configure timeouts, use `setConnectionConfigCallback` and `setRequestConfigCallback` while building the `Rest5Client`. The following example sets a 10-second connect timeout, a 10-second socket timeout, and a 20-second response timeout:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-timeouts
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("http", "localhost", 9200)) <1>
    .setConnectionConfigCallback(connectConf -> connectConf
        .setConnectTimeout(Timeout.ofSeconds(10))
        .setSocketTimeout(Timeout.ofSeconds(10)))
    .setRequestConfigCallback(r -> r
        .setResponseTimeout(Timeout.ofSeconds(20))
    );
```

1. Specify `https` for TLS.

You can also set per-request timeouts using `RequestOptions`, which override the builder defaults. The following example sets a response timeout of 60 seconds, as well as a connection request timeout of 1 second (to limit pooled connection wait time), for a single search request:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-request-options-timeouts
```java
RequestConfig requestConfig = RequestConfig.custom()
    .setResponseTimeout(Timeout.ofSeconds(60))
    .setConnectionRequestTimeout(Timeout.ofSeconds(1))
    .build();

Rest5ClientOptions options = new Rest5ClientOptions.Builder(
    RequestOptions.DEFAULT.toBuilder().setRequestConfig(requestConfig)
).build();

SearchResponse<Product> response = esClient
    .withTransportOptions(options) // <1>
    .search(s -> s.index("products"), Product.class);
```

1. `withTransportOptions` returns a client that uses these options, sharing the transport of `esClient`. To use these options for all requests instead, pass them to the `Rest5ClientTransport` constructor.

::::{note}
Per-request timeouts are ignored in versions 9.0.0 to 9.3.x of the client. In those versions, set timeouts when building the `Rest5Client`. Refer to [Known issues](/release-notes/known-issues.md#known-issues-9-x-up-to-9-5-6) for details.
::::
