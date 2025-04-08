---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html
---

# Getting started [getting-started-java]

This page guides you through the installation process of the Java client, shows you how to instantiate the client, and how to perform basic Elasticsearch operations with it.


### Requirements [_requirements]

* Java 17 or later.
* A JSON object mapping library to allow seamless integration of your application classes with the Elasticsearch API. The examples below show usage with Jackson, which is the default.


### Installation [_installation]


#### Installation in a Gradle project by using Jackson [_installation_in_a_gradle_project_by_using_jackson]

```groovy subs=true
dependencies {
    implementation 'co.elastic.clients:elasticsearch-java:{{version}}'
}
```


#### Installation in a Maven project by using Jackson [_installation_in_a_maven_project_by_using_jackson]

In the `pom.xml` of your project, add the following repository definition and dependencies:

```xml subs=true
<project>
  <dependencies>

    <dependency>
      <groupId>co.elastic.clients</groupId>
      <artifactId>elasticsearch-java</artifactId>
      <version>{{version}}</version>
    </dependency>

  </dependencies>
</project>
```

Refer to the [Installation](setup/installation.md) page to learn more.


### Connecting [_connecting]

You can connect to the Elastic Cloud using an API key and the Elasticsearch endpoint.

<!-- :::include
```java
:::{include} {doc-tests-src}/getting_started/ConnectingTest.java[create-client]
```
-->
% :::include::start -- do not remove
```java
// URL and API key
String serverUrl = "https://localhost:9200";
String apiKey = "VnVhQ2ZHY0JDZGJrU...";

ElasticsearchClient esClient = ElasticsearchClient.of(b -> b
    .host(serverUrl)
    .apiKey(apiKey)
    // Use the Jackson mapper to deserialize JSON to application objects
    .jsonMapper(new JacksonJsonpMapper())
);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```
% :::include::end -- do not remove

Your Elasticsearch endpoint can be found on the **My deployment** page of your deployment:

:::{image} images/es-endpoint.jpg
:alt: Finding Elasticsearch endpoint
:::

You can generate an API key on the **Management** page under Security.

:::{image} images/create-api-key.png
:alt: Create API key
:::

For other connection options, refer to the [Connecting](setup/connecting.md) section.


### Operations [_operations]

Time to use Elasticsearch! This section walks you through the basic, and most important, operations of Elasticsearch. For more operations and more advanced examples, refer to the [*Using the Java API Client*](usage/index.md) page.


#### Creating an index [_creating_an_index]

This is how you create the `product` index:

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[create-products-index]
```
-->
% :::include::start -- do not remove
```java
esClient.indices().create(c -> c
    .index("products")
);
```
% :::include::end -- do not remove


#### Indexing documents [_indexing_documents]

This is a simple way of indexing a document, here a `Product` application object:

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


#### Getting documents [_getting_documents]

You can get documents by using the following code:

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/ReadingTest.java[get-by-id]
```
-->
% :::include::start -- do not remove
```java
GetResponse<Product> response = esClient.get(g -> g
    .index("products") // <1>
    .id("bk-1"),
    Product.class      // <2>
);

if (response.found()) {
    Product product = response.source();
    logger.info("Product name " + product.getName());
} else {
    logger.info ("Product not found");
}
```
% :::include::end -- do not remove

1. The get request, with the index name and identifier.
2. The target class, here `Product`.



#### Searching documents [_searching_documents]

This is how you can create a single match query with the Java client:

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/SearchingTest.java[search-getting-started]
```
-->
% :::include::start -- do not remove
```java
String searchText = "bike";

SearchResponse<Product> response = esClient.search(s -> s
        .index("products")
        .query(q -> q
            .match(t -> t
                .field("name")
                .query(searchText)
            )
        ),
    Product.class
);
```
% :::include::end -- do not remove


#### Updating documents [_updating_documents]

This is how you can update a document, for example to add a new field:

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-update]
```
-->
% :::include::start -- do not remove
```java
Product product = new Product("bk-1", "City bike", 123.0);

esClient.update(u -> u
        .index("products")
        .id("bk-1")
        .upsert(product),
    Product.class
);
```
% :::include::end -- do not remove


#### Deleting documents [_deleting_documents]

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[single-doc-delete]
```
-->
% :::include::start -- do not remove
```java
esClient.delete(d -> d.index("products").id("bk-1"));
```
% :::include::end -- do not remove


#### Deleting an index [_deleting_an_index]

<!-- :::include
```java
:::{include} {doc-tests-src}/usage/IndexingTest.java[delete-products-index]
```
-->
% :::include::start -- do not remove
```java
esClient.indices().delete(d -> d
    .index("products")
);
```
% :::include::end -- do not remove


## Examples [_examples]

The [examples](https://github.com/elastic/elasticsearch-java/tree/main/examples) folder in the Github repository contains full working examples showing how to set up and use the client.


## Further reading [_further_reading]

* Learn more about the [*API conventions*](api-conventions/index.md) of the Java client.
