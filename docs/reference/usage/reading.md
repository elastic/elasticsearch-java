---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/reading.html
---

# Reading documents by id [reading]

Elasticsearch is all about search, but you may also want to access documents directly, knowing their identifier. The "get" request is meant for this.

::::{note}
See the [{{es}} API documentation](https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get) for a full explanation of get requests.
::::



## Reading a domain object [_reading_a_domain_object]

The example below reads the document with identifier `bk-1` from the `products` index.

The `get` request has two parameters:

* the first parameter is the actual request, built below with the fluent DSL
* the second parameter is the class we want the document’s JSON to be mapped to.

```java
GetResponse<Product> response = esClient.get(g -> g
    .index("products") <1>
    .id("bk-1"),
    Product.class      <2>
);

if (response.found()) {
    Product product = response.source();
    logger.info("Product name " + product.getName());
} else {
    logger.info ("Product not found");
}
```

1. The get request, with the index name and identifier.
2. The target class, here `Product`.



## Reading raw JSON [_reading_raw_json]

When your index contains semi-structured data or if you don’t have a domain object definition, you can also read the document as raw JSON data.

Raw JSON data is just another class that you can use as the result type for the get request. In the example below we use Jackson’s `ObjectNode`. We could also have used any JSON representation that can be deserialized by the JSON mapper associated to the `ElasticsearchClient`.

```java
GetResponse<ObjectNode> response = esClient.get(g -> g
    .index("products")
    .id("bk-1"),
    ObjectNode.class     <1>
);

if (response.found()) {
    ObjectNode json = response.source();
    String name = json.get("name").asText();
    logger.info("Product name " + name);
} else {
    logger.info("Product not found");
}
```

1. The target class is a raw JSON object.


:::{include} /reference/_snippets/doc-tests-blurb.md
:::

