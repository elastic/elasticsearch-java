# elasticsearch-java

Next Generation [Elasticsearch](https://github.com/elastic/elasticsearch) High Level Java client

_**This project is still a work in progress**_

This high-level client provides strongly typed requests and responses for all Elasticsearch APIs.
It uses the Java low-level client for all transport-level concerns (http connection establishment and pooling, retries, etc).

The `docs/design` folder contains records of the major decisions in the design of the API. Most notably:

- Object construction is based on the [fluent builder pattern](https://www.informit.com/articles/article.aspx?p=1216151).
- Nested objects can be constructed with builder lambdas, allowing for clean and expressive DSL-like code.
- Optional values are represented as `null` with `@Nullable` annotations instead of the newer  `Optional`, the Java ecosystem being still very null-based.

## Getting started

### Installing the library

While still a work in progress, this library is published on a private Maven repository hosted on [GitHub Packages](https://docs.github.com/en/packages).

It can be added to a Gradle project (Groovy flavor) as follows:

```groovy
repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/elastic/elasticsearch-java")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation 'co.elastic.clients:java-client:1.0.0-SNAPSHOT'
}
```

### Your first request

```java
// Create the low-level client
RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();

// Build the high-level client
ElasticsearchClient client = new ElasticsearchClient(restClient);

// Search all items in an index
SearchResponse search = client.search(s -> s
    .index("test-index")
);

if (search.hits().hits().isEmpty()) {
    System.out.println("No match");
} else {
    //...
}
```
