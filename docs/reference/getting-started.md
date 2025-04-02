---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html
---

# Getting started [getting-started-java]

This page guides you through the installation process of the Java client, shows you how to instantiate the client, and how to perform basic Elasticsearch operations with it.


### Requirements [_requirements]

* Java 8 or later.
* A JSON object mapping library to allow seamless integration of your application classes with the Elasticsearch API. The examples below show usage with Jackson.


### Installation [_installation]


#### Installation in a Gradle project by using Jackson [_installation_in_a_gradle_project_by_using_jackson]

```groovy
dependencies {
    implementation 'co.elastic.clients:elasticsearch-java:9.0.0-beta1'
}
```


#### Installation in a Maven project by using Jackson [_installation_in_a_maven_project_by_using_jackson]

In the `pom.xml` of your project, add the following repository definition and dependencies:

```xml
<project>
  <dependencies>

    <dependency>
      <groupId>co.elastic.clients</groupId>
      <artifactId>elasticsearch-java</artifactId>
      <version>9.0.0-beta1</version>
    </dependency>

  </dependencies>
</project>
```

Refer to the [Installation](/reference/installation.md) page to learn more.


### Connecting [_connecting]

You can connect to the Elastic Cloud using an API key and the Elasticsearch endpoint.

```java
// URL and API key
String serverUrl = "https://localhost:9200";
String apiKey = "VnVhQ2ZHY0JDZGJrU...";

// Create the low-level client
RestClient restClient = RestClient
    .builder(HttpHost.create(serverUrl))
    .setDefaultHeaders(new Header[]{
        new BasicHeader("Authorization", "ApiKey " + apiKey)
    })
    .build();

// Create the transport with a Jackson mapper
ElasticsearchTransport transport = new RestClientTransport(
    restClient, new JacksonJsonpMapper());

// And create the API client
ElasticsearchClient esClient = new ElasticsearchClient(transport);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```

Your Elasticsearch endpoint can be found on the **My deployment** page of your deployment:

:::{image} images/es-endpoint.jpg
:alt: Finding Elasticsearch endpoint
:::

You can generate an API key on the **Management** page under Security.

:::{image} images/create-api-key.png
:alt: Create API key
:::

For other connection options, refer to the [Connecting](/reference/connecting.md) section.


### Operations [_operations]

Time to use Elasticsearch! This section walks you through the basic, and most important, operations of Elasticsearch. For more operations and more advanced examples, refer to the [*Using the Java API Client*](/reference/using-java-api-client.md) page.


#### Creating an index [_creating_an_index]

This is how you create the `product` index:

```java
esClient.indices().create(c -> c
    .index("products")
);
```


#### Indexing documents [_indexing_documents]

This is a simple way of indexing a document, here a `Product` application object:

```java
Product product = new Product("bk-1", "City bike", 123.0);

IndexResponse response = esClient.index(i -> i
    .index("products")
    .id(product.getSku())
    .document(product)
);

logger.info("Indexed with version " + response.version());
```


#### Getting documents [_getting_documents]

You can get documents by using the following code:

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



#### Searching documents [_searching_documents]

This is how you can create a single match query with the Java client:

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


#### Updating documents [_updating_documents]

This is how you can update a document, for example to add a new field:

```java
Product product = new Product("bk-1", "City bike", 123.0);

esClient.update(u -> u
        .index("products")
        .id("bk-1")
        .upsert(product),
    Product.class
);
```


#### Deleting documents [_deleting_documents]

```java
esClient.delete(d -> d.index("products").id("bk-1"));
```


#### Deleting an index [_deleting_an_index]

```java
esClient.indices().delete(d -> d
    .index("products")
);
```


## Examples [_examples]

The [examples](https://github.com/elastic/elasticsearch-java/tree/main/examples) folder in the Github repository contains full working examples showing how to set up and use the client.


## Further reading [_further_reading]

* Learn more about the [*API conventions*](/reference/api-conventions.md) of the Java client.
