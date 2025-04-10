
# Initialization

A `Rest5Client` instance can be built through the corresponding `Rest5ClientBuilder` class, created via `Rest5Client#builder(...)` static method. The only required argument is one or more URLs or `HttpHost` that the client will communicate with as follows:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-init
```java
Rest5Client restClient = Rest5Client.builder(
    URI.create("http://localhost:9200"),
    URI.create("http://localhost:9201")
).build();
```

The `RestClient` class is thread-safe and ideally has the same lifecycle as the application that uses it. It is important that it gets closed when no longer needed so that all the resources used by it get properly released, as well as the underlying http client instance and its threads:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-close
```java
restClient.close();
```

`RestClientBuilder` also allows to optionally set the following configuration parameters while building the `RestClient` instance:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-init-default-headers
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("http", "localhost", 9200));

Header[] defaultHeaders = new Header[]{new BasicHeader("header", "value")};
builder.setDefaultHeaders(defaultHeaders); // <1>
```

1. Set the default headers that need to be sent with each request, to prevent having to specify them with each single request


% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-init-failure-listener
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("http", "localhost", 9200));

builder.setFailureListener(new Rest5Client.FailureListener() {
    @Override
    public void onFailure(Node node) {
        // <1>
    }
});
```

1. Set a listener that gets notified every time a node fails,  in case actions need to be taken. Used internally when sniffing on failure is enabled.


% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-init-node-selector
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("http", "localhost", 9200));

builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS); // <1>
```

1. Set the node selector to be used to filter the nodes the client will send requests to among the ones that are set to the client itself. This is useful for instance to prevent sending requests to dedicated master nodes when sniffing is enabled. By default the client sends requests to every configured node.

<!--
TODO - Replacement?
```java
RestClientBuilder builder = RestClient.builder(
        new HttpHost("localhost", 9200, "http"));
builder.setRequestConfigCallback(
    new RestClientBuilder.RequestConfigCallback() {
        @Override
        public RequestConfig.Builder customizeRequestConfig(
                RequestConfig.Builder requestConfigBuilder) {
            return requestConfigBuilder.setSocketTimeout(10000); <1>
        }
    });
```

1. Set a callback that allows to modify the default request configuration (e.g. request timeouts, authentication, or anything that the [`org.apache.http.client.config.RequestConfig.Builder`](https://hc.apache.org/httpcomponents-client-4.5.x/current/httpclient/apidocs/org/apache/http/client/config/RequestConfig.Builder.html) allows to set)
-->

<!--
TODO - Replacement?
```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "http"));
builder.setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
                HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder.setProxy(
                new HttpHost("proxy", 9000, "http"));  <1>
        }
    });
```

1. Set a callback that allows to modify the http client configuration (e.g. encrypted communication over ssl, or anything that the [`org.apache.http.impl.nio.client.HttpAsyncClientBuilder`](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/current/httpasyncclient/apidocs/org/apache/http/impl/nio/client/HttpAsyncClientBuilder.html) allows to set)

-->
