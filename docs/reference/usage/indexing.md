---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/indexing.html
---

# Indexing single documents [indexing]

The Java API Client offers several ways to index data: you can provide application objects that will be automatically mapped to JSON, or you can provide raw JSON data. Using application objects is more suited to applications with a well-defined domain model, whereas raw JSON is more suited to logging use cases with semi-structured data.

In the examples below we use a `Product` domain object that has `sku`, `name` and `price` properties.

::::{note}
See the [{{es}} API documentation](https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create) for a full explanation of index requests.
::::



## Using the fluent DSL [_using_the_fluent_dsl]

The most direct way to build requests is using the fluent DSL. In the example below we index a product description in the `products` index, using the product’s SKU as the document identifier in the index. The `product` object will be mapped to JSON using the object mapper configured on the {{es}} client.

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-dsl]
```
-->
% :::include::start -- do not remove
```java
Product product = new Product("bk-1", "City bike", 123.0);

IndexResponse response = esClient.index(i -> i
    .index("products")
    .id(product.getSku())
    .document(product)
);

logger.info("Indexed with version " + response.version());
```
% :::include::end -- do not remove

You can also assign objects created with the DSL to variables. Java API Client classes have a static `of()` method for this, that creates an object with the DSL syntax.

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-dsl-of]
```
-->
% :::include::start -- do not remove
```java
Product product = new Product("bk-1", "City bike", 123.0);

IndexRequest<Product> request = IndexRequest.of(i -> i
    .index("products")
    .id(product.getSku())
    .document(product)
);

IndexResponse response = esClient.index(request);

logger.info("Indexed with version " + response.version());
```
% :::include::end -- do not remove

## Using classic builders [_using_classic_builders]

If you’re more used to the classic builder pattern, it is also available. Builder objects are used under the hood by the fluent DSL syntax.

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-builder]
```
-->
% :::include::start -- do not remove
```java
Product product = new Product("bk-1", "City bike", 123.0);

IndexRequest.Builder<Product> indexReqBuilder = new IndexRequest.Builder<>();
indexReqBuilder.index("product");
indexReqBuilder.id(product.getSku());
indexReqBuilder.document(product);

IndexResponse response = esClient.index(indexReqBuilder.build());

logger.info("Indexed with version " + response.version());
```
% :::include::end -- do not remove


## Using the asynchronous client [_using_the_asynchronous_client]

The examples above used the synchronous {{es}} client. All {{es}} APIs are also available in the asynchronous client, using the same request and response types. See also [Blocking and asynchronous clients](/reference/api-conventions/blocking-async.md) for additional details.

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-dsl-async]
```
-->
% :::include::start -- do not remove
```java
ElasticsearchAsyncClient esAsyncClient = new ElasticsearchAsyncClient(transport);

Product product = new Product("bk-1", "City bike", 123.0);

esAsyncClient.index(i -> i
    .index("products")
    .id(product.getSku())
    .document(product)
).whenComplete((response, exception) -> {
    if (exception != null) {
        logger.error("Failed to index", exception);
    } else {
        logger.info("Indexed with version " + response.version());
    }
});
```
% :::include::end -- do not remove


## Using raw JSON data [_using_raw_json_data]

When the data you want to index comes from external sources, having to create domain objects may be cumbersome or outright impossible with semi-structured data.

You can index data from an arbitrary source using `withJson()`. Using this method will read the source and use it for the index request’s `document` property. See [Creating API objects from JSON data](/reference/api-conventions/loading-json.md) for additional details.

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-json]
```
-->
% :::include::start -- do not remove
```java
Reader input = new StringReader(
    "{'@timestamp': '2022-04-08T13:55:32Z', 'level': 'warn', 'message': 'Some log message'}"
    .replace('\'', '"'));

IndexRequest<JsonData> request = IndexRequest.of(i -> i
    .index("logs")
    .withJson(input)
);

IndexResponse response = esClient.index(request);

logger.info("Indexed with version " + response.version());
```
% :::include::end -- do not remove

:::{include} /reference/_snippets/doc-tests-blurb.md
:::

