---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/blocking-and-async.html
---

# Blocking and asynchronous clients [blocking-and-async]

API clients come in two flavors: blocking and asynchronous. All methods on asynchronous clients return a standard `CompletableFuture`.

Both flavors can be used at the same time depending on your needs, sharing the same transport object:

```java
ElasticsearchTransport transport = ...

// Synchronous blocking client
ElasticsearchClient client = new ElasticsearchClient(transport);

if (client.exists(b -> b.index("products").id("foo")).value()) {
    logger.info("product exists");
}

// Asynchronous non-blocking client
ElasticsearchAsyncClient asyncClient =
    new ElasticsearchAsyncClient(transport);

asyncClient
    .exists(b -> b.index("products").id("foo"))
    .whenComplete((response, exception) -> {
        if (exception != null) {
            logger.error("Failed to index", exception);
        } else {
            logger.info("Product exists");
        }
    });
```

Although we won’t go in deeper details on asynchronous programming in Java, remember to handle failures of asynchronous tasks. It’s easy to overlook them and have errors go unnoticed.

The source code for the examples above can be found in the [Java API Client tests](https://github.com/elastic/elasticsearch-java/tree/master/java-client/src/test/java/co/elastic/clients/documentation).

