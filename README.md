<img alt="Elastic logo" align="right" width="auto" height="auto" src="https://www.elastic.co/static-res/images/elastic-logo-200.png">

# Elasticsearch Java Client

The official Java client for [Elasticsearch](https://github.com/elastic/elasticsearch).

---

**Note: this project is still in beta.** This client is meant to replace the existing [Java High Level Client](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-high.html) and remove all dependencies to the Elasticsearch server code base.

---

The Java client for Elasticsearch provides strongly typed requests and responses for all Elasticsearch APIs. It delegates protocol handling to an http client such as the [Elasticsearch Low Level REST client](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-low.html) that takes care of all transport-level concerns (http connection establishment and pooling, retries, etc).

The `docs/design` folder contains records of the major decisions in the design of the API. Most notably:

- Object construction is based on the [builder pattern](https://www.informit.com/articles/article.aspx?p=1216151).
- Nested objects can be constructed with builder lambdas, allowing for clean and expressive DSL-like code.
- Optional values are represented as `null` with `@Nullable` annotations instead of the newer  `Optional`, the Java ecosystem being still very null-based.

## Getting started

Please refer to [the full documentation on elastic.co](https://www.elasticco/guide/en/elasticsearch/client/java-api-client/current/index.html) for comprehensive information.

### Installing the library

This library requires at least Java 8.

Along with this library, you also need a JSON/object mapping library. `elasticsearch-java` has built-in support for [Jackson](https://github.com/FasterXML/jackson) and [JSON-B](http://json-b.net/) implementations such as [Eclipse Yasson](https://github.com/eclipse-ee4j/yasson).

Releases are hosted on [Maven Central](https://search.maven.org/search?q=g:co.elastic.clients). If you are looking for a SNAPSHOT version, the Elastic Maven Snapshot repository is available at https://snapshots.elastic.co/maven/.

Gradle project (Groovy flavor) setup using Jackson:

```groovy
dependencies {
    implementation 'co.elastic.clients:elasticsearch-java:7.15.0'
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.12.3'
}
```

In the `pom.xml` for your project add the following repository definition and dependencies:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>co.elastic.clients</groupId>
      <artifactId>elasticsearch-java</artifactId>
      <version>7.15.0</version>
    </dependency>
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.12.3</version>
    </dependency>
  </dependencies>

</project>
```

### Your first request

```java
// Create the low-level client
RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();

// Create the transport that provides JSON and http services to API clients
Transport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

// And create our API client
ElasticsearchClient client = new ElasticsearchClient(transport);

// Search all items in an index that contains documents of type AppData
SearchResponse search = client.search(s -> s
    .index("test-index"),
    AppData.class
);

if (search.hits().hits().isEmpty()) {
    System.out.println("No match");
} else {
    for (Hit<AppData> hit : search.hits().hits()) {
        processAppData(hit._source());
    }
}
```

## Compatibility

The `main` branch targets the next major release (8.0) and the `7.x` branch targets the next minor release. Support is still incomplete as the API code is generated from the [Elasticsearch Specification](https://github.com/elastic/elasticsearch-specification) that is also still a work in progress.

The Elasticsearch Java client is forward compatible; meaning that the client supports communicating with greater minor versions of Elasticsearch. Elastic language clients are also backwards compatible with lesser supported minor Elasticsearch versions.

## Current status

Beta state means we don't expect large architectural changes and the library is already fairly usable. This library also essentially deals with request & response serialization & deserialization and delegates all http request processing to the battle-tested [Low Level Rest Client](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-low.html).

What's missing falls in two main categories, related to the [Elasticsearch specification](https://github.com/elastic/elasticsearch-specification):
* incomplete support for some data types used in specification (e.g. unions). Until they have been implemented in the code generator, they are represented as raw `JsonValue` objects.
* incomplete APIs: as the API specification is still incomplete, so are their implementations in this library since their code is entirely generated from the spec.

## Contributing

See [CONTRIBUTING.md](./CONTRIBUTING.md)

## Licence

This software is licensed under the [Apache License 2.0](https://github.com/elastic/elasticsearch-java/blob/main/LICENSE).
