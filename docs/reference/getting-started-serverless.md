---
mapped_pages:
  - https://www.elastic.co/guide/en/serverless/current/elasticsearch-java-client-getting-started.html
navigation_title: Getting started in {{serverless}}
---

# Getting started with the Java API client in {{serverless-full}}[elasticsearch-java-client-getting-started]

This page guides you through the installation process of the Java client, shows you how to initialize the client, and how to perform basic {{es}} operations with it.

See the [Java client](/reference/index.md) documentation for more detailed usage instructions.

::::{note}
The same client is used for {{es3}}, on-premise and managed Elasticsearch. Some API endpoints are however not available in {{es3}}.

::::



## Requirements [elasticsearch-java-client-getting-started-requirements]

* Java 8 or later.
* A JSON object mapping library to allow seamless integration of your application classes with the {{es}} API. The examples below show usage with Jackson.


## Installation [elasticsearch-java-client-getting-started-installation]

You can add the Java client to your Java project using either Gradle or Maven.

Use the version with the highest version number found on [Maven Central](https://search.maven.org/artifact/co.elastic.clients/elasticsearch-java), like `8.16.1`. We refer to it as `elasticVersion` in the configuration examples below.


### Using Gradle [elasticsearch-java-client-getting-started-using-gradle]

You can install the Java client as a Gradle dependency:

```groovy
dependencies {
    implementation "co.elastic.clients:elasticsearch-java:${elasticVersion}"
    implementation "com.fasterxml.jackson.core:jackson-databind:2.17.0"
}
```


### Using Maven [elasticsearch-java-client-getting-started-using-maven]

You can install the Java client as a Maven dependency, add the following to the `pom.xml` of your project:

```xml
<project>
    <dependencies>

        <dependency>
            <groupId>co.elastic.clients</groupId>
            <artifactId>elasticsearch-java</artifactId>
            <version>${elasticVersion}</version>
        </dependency>

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.17.0</version>
        </dependency>

    </dependencies>
</project>
```


## Initialize the client [elasticsearch-java-client-getting-started-initialize-the-client]

Initialize the client using your API key and {{es}} endpoint:

```java
// URL and API key
String serverUrl = "https://...elastic.cloud";
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
```

To get API keys for the {{es}} endpoint for a project, see [Get started](docs-content://solutions/search/get-started.md).


## Using the API [elasticsearch-java-client-getting-started-using-the-api]

After you initialized the client, you can start ingesting documents.


### Creating an index and ingesting documents [elasticsearch-java-client-getting-started-creating-an-index-and-ingesting-documents]

The following is an example of indexing a document, here a `Product` application object in the `products` index:

```java
Product product = new Product("bk-1", "City bike", 123.0);

IndexResponse response = esClient.index(i -> i
    .index("products")
    .id(product.getSku())
    .document(product)
);

logger.info("Indexed with version " + response.version());
```


### Searching [elasticsearch-java-client-getting-started-searching]

Now that some data is available, you can search your documents using the `search` API:

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

A few things to note in the above example:

* The search query is built using a hierarchy of lambda expressions that closely follows the {{es}} HTTP API. Lambda expressions allows you to be guided by your IDE’s autocompletion, without having to import (or even know!) the actual classes representing a query.
* The last parameter `Product.class` instructs the client to return results as `Product` application objects instead of raw JSON.


### Updating [elasticsearch-java-client-getting-started-updating]

You can update your documents using the `update` API:

```java
Product product = new Product("bk-1", "City bike", 123.0);

esClient.update(u -> u
        .index("products")
        .id("bk-1")
        .upsert(product),
    Product.class
);
```


### Delete [elasticsearch-java-client-getting-started-delete]

You can also delete documents:

```java
esClient.delete(d -> d.index("products").id("bk-1"));
```


### Deleting an index [elasticsearch-java-client-getting-started-deleting-an-index]

```java
esClient.indices().delete(d -> d.index("products"));
```

