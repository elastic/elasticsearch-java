---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_number_of_threads.html
---

# Number of threads [_number_of_threads]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

The Apache Http Async Client starts by default one dispatcher thread, and a number of worker threads used by the connection manager, as many as the number of locally detected processors (depending on what `Runtime.getRuntime().availableProcessors()` returns). The number of threads can be modified as follows:

```java
RestClientBuilder builder = RestClient.builder(
    new HttpHost("localhost", 9200))
    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
        @Override
        public HttpAsyncClientBuilder customizeHttpClient(
                HttpAsyncClientBuilder httpClientBuilder) {
            return httpClientBuilder.setDefaultIOReactorConfig(
                IOReactorConfig.custom()
                    .setIoThreadCount(1)
                    .build());
        }
    });
```

