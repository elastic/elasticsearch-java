---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_timeouts.html
navigation_title: Timeouts
---

# Configuring Timeouts in the {{es}} Java REST client [_timeouts]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

Configuring requests timeouts can be done by providing an instance of `RequestConfigCallback` while building the `RestClient` through its builder. The interface has one method that receives an instance of [`org.apache.http.client.config.RequestConfig.Builder`](https://hc.apache.org/httpcomponents-client-4.5.x/current/httpclient/apidocs/org/apache/http/client/config/RequestConfig.Builder.html) as an argument and has the same return type. The request config builder can be modified and then returned. In the following example we increase the connect timeout (defaults to 1 second) and the socket timeout (defaults to 30 seconds).

```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200))
    .setRequestConfigCallback(
        new RestClientBuilder.RequestConfigCallback() {
            @Override
            public RequestConfig.Builder customizeRequestConfig(
                    RequestConfig.Builder requestConfigBuilder) {
                return requestConfigBuilder
                    .setConnectTimeout(5000)
                    .setSocketTimeout(60000);
            }
        });
```

Timeouts also can be set per request with RequestOptions, which overrides RestClient customizeRequestConfig.

```java
RequestConfig requestConfig = RequestConfig.custom()
    .setConnectTimeout(5000)
    .setSocketTimeout(60000)
    .build();
RequestOptions options = RequestOptions.DEFAULT.toBuilder()
    .setRequestConfig(requestConfig)
    .build();
```

