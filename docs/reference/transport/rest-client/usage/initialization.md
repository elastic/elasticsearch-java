---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-initialization.html
---

# Initialization [java-rest-low-usage-initialization]

A `RestClient` instance can be built through the corresponding `RestClientBuilder` class, created via `RestClient#builder(HttpHost...)` static method. The only required argument is one or more hosts that the client will communicate with, provided as instances of [HttpHost](https://hc.apache.org/httpcomponents-core-4.4.x/current/httpcore/apidocs/org/apache/http/HttpHost.html) as follows:

```java
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200, "http"),
    new HttpHost("localhost", 9201, "http")).build();
```

The `RestClient` class is thread-safe and ideally has the same lifecycle as the application that uses it. It is important that it gets closed when no longer needed so that all the resources used by it get properly released, as well as the underlying http client instance and its threads:

```java
restClient.close();
```

`RestClientBuilder` also allows to optionally set the following configuration parameters while building the `RestClient` instance:

```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "http"));
Header[] defaultHeaders = new Header[]{new BasicHeader("header", "value")};
builder.setDefaultHeaders(defaultHeaders); <1>
```

1. Set the default headers that need to be sent with each request, to prevent having to specify them with each single request


```java
RestClientBuilder builder = RestClient.builder(
        new HttpHost("localhost", 9200, "http"));
builder.setFailureListener(new RestClient.FailureListener() {
    @Override
    public void onFailure(Node node) {
        <1>
    }
});
```

1. Set a listener that gets notified every time a node fails,  in case actions need to be taken. Used internally when sniffing on failure is enabled.


```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200, "http"));
builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS); <1>
```

1. Set the node selector to be used to filter the nodes the client will send requests to among the ones that are set to the client itself. This is useful for instance to prevent sending requests to dedicated master nodes when sniffing is enabled. By default the client sends requests to every configured node.


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


