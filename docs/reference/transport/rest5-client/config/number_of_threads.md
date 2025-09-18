---
mapped_pages:
  - https://www.elastic.co/docs/reference/elasticsearch/clients/java/transport/rest5-client/config/number_of_threads.html
navigation_title: Number of threads
---

# Setting number of threads in the {{es}} Java REST 5 client

The Apache Http Async Client starts by default one dispatcher thread, and a number of worker threads used by the connection manager, as many as the number of locally detected processors (depending on what `Runtime.getRuntime().availableProcessors()` returns). The number of threads can be modified as follows:

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-config-threads
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("localhost", 9200))
    .setHttpClientConfigCallback(c -> c
        .setIOReactorConfig(IOReactorConfig.custom()
            .setIoThreadCount(1).build()
        )
    );
```
