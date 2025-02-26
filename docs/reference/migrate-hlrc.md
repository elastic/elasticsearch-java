---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/migrate-hlrc.html
---

# Migrating from the High Level Rest Client [migrate-hlrc]

The {{es}} Java API Client is an entirely new client library that has no relation to the older High Level Rest Client (HLRC). This was a deliberate choice to provide a library that is independent from the {{es}} server code and that provides a very consistent and easier to use API for all {{es}} features.

Migrating from the HLRC therefore requires some code rewrite in your application. This transition can however happen progressively as the two client libraries can coexist in a single application with no operational overhead.


## Compatibility mode: using a 7.17 client with {{es}} 8.x [_compatibility_mode_using_a_7_17_client_with_es_8_x]

The HLRC version `7.17` can be used with {{es}} version `8.x` by enabling HLRC’s compatibility mode (see code sample below). In this mode HLRC sends additional headers that instruct {{es}} `8.x` to behave like a `7.x` server.

The Java API Client doesn’t need this setting as compatibility mode is always enabled.

You can use the HLRC version `7.x` with the Java API Client version `8.x`:

```groovy
dependencies {
    implementation 'co.elastic.clients:elasticsearch-java:9.0.0-beta1'
    implementation 'org.elasticsearch.client:elasticsearch-rest-high-level-client:7.17.4'
    // other dependencies <1>
}
```

1. See [Installation](/reference/installation.md)



## Using the same http client with the HLRC and the Java API Client [_using_the_same_http_client_with_the_hlrc_and_the_java_api_client]

To avoid any operational overhead during the transition phase where an application would use both the HLRC and the new Java API Client, both clients can share the same Low Level Rest Client, which is the network layer that manages all connections, round-robin strategies, node sniffing, and so on.

The code below shows how to initialize both clients with the same HTTP client:

```java
// Create the low-level client
RestClient httpClient = RestClient.builder(
    new HttpHost("localhost", 9200)
).build();

// Create the HLRC
RestHighLevelClient hlrc = new RestHighLevelClientBuilder(httpClient)
    .setApiCompatibilityMode(true) <1>
    .build();

// Create the Java API Client with the same low level client
ElasticsearchTransport transport = new RestClientTransport(
    httpClient,
    new JacksonJsonpMapper()
);

ElasticsearchClient esClient = new ElasticsearchClient(transport);

// hlrc and esClient share the same httpClient
```

1. Enables compatibility mode that allows HLRC `7.17` to work with {{es}} `8.x`.



## Transition strategies [_transition_strategies]

There are different ways you can start transitioning away from the HLRC in your application code.

For example:

* keep the existing code as-is and use the new Java API Client for new features in your application, then later migrate the existing code,
* rewrite the parts of your application where the new Java API Client is much easier to use than that of the HLRC, like everything related to search,
* rewrite those parts where you need to map application objects to/from JSON, by leveraging the tight integration of the new Java API Client with JSON object mappers.

