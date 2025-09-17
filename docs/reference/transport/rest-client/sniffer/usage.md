---
mapped_pages:
  - https://www.elastic.co/docs/reference/elasticsearch/clients/java/transport/rest-client/usage.html
navigation_title: Usage
---

# Getting started with the {{es}} Java REST client [_usage]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

Once a `RestClient` instance has been created as shown in [Initialization](../usage/initialization.md), a `Sniffer` can be associated to it. The `Sniffer` will make use of the provided `RestClient` to periodically (every 5 minutes by default) fetch the list of current nodes from the cluster and update them by calling `RestClient#setNodes`.

```java
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200, "http"))
    .build();
Sniffer sniffer = Sniffer.builder(restClient).build();
```

It is important to close the `Sniffer` so that its background thread gets properly shutdown and all of its resources are released. The `Sniffer` object should have the same lifecycle as the `RestClient` and get closed right before the client:

```java
sniffer.close();
restClient.close();
```

The `Sniffer` updates the nodes by default every 5 minutes. This interval can be customized by providing it (in milliseconds) as follows:

```java
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200, "http"))
    .build();
Sniffer sniffer = Sniffer.builder(restClient)
    .setSniffIntervalMillis(60000).build();
```

It is also possible to enable sniffing on failure, meaning that after each failure the nodes list gets updated straightaway rather than at the following ordinary sniffing round. In this case a `SniffOnFailureListener` needs to be created at first and provided at `RestClient` creation. Also once the `Sniffer` is later created, it needs to be associated with that same `SniffOnFailureListener` instance, which will be notified at each failure and use the `Sniffer` to perform the additional sniffing round as described.

```java
SniffOnFailureListener sniffOnFailureListener =
    new SniffOnFailureListener();
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200))
    .setFailureListener(sniffOnFailureListener) <1>
    .build();
Sniffer sniffer = Sniffer.builder(restClient)
    .setSniffAfterFailureDelayMillis(30000) <2>
    .build();
sniffOnFailureListener.setSniffer(sniffer); <3>
```

1. Set the failure listener to the `RestClient` instance
2. When sniffing on failure, not only do the nodes get updated after each failure, but an additional sniffing round is also scheduled sooner than usual, by default one minute after the failure, assuming that things will go back to normal and we want to detect that as soon as possible. Said interval can be customized at `Sniffer` creation time through the `setSniffAfterFailureDelayMillis` method. Note that this last configuration parameter has no effect in case sniffing on failure is not enabled like explained above.
3. Set the `Sniffer` instance to the failure listener


The Elasticsearch Nodes Info api doesn’t return the protocol to use when connecting to the nodes but only their `host:port` key-pair, hence `http` is used by default. In case `https` should be used instead, the `ElasticsearchNodesSniffer` instance has to be manually created and provided as follows:

```java
RestClient restClient = RestClient.builder(
        new HttpHost("localhost", 9200, "http"))
        .build();
NodesSniffer nodesSniffer = new ElasticsearchNodesSniffer(
        restClient,
        ElasticsearchNodesSniffer.DEFAULT_SNIFF_REQUEST_TIMEOUT,
        ElasticsearchNodesSniffer.Scheme.HTTPS);
Sniffer sniffer = Sniffer.builder(restClient)
        .setNodesSniffer(nodesSniffer).build();
```

In the same way it is also possible to customize the `sniffRequestTimeout`, which defaults to one second. That is the `timeout` parameter provided as a query string parameter when calling the Nodes Info api, so that when the timeout expires on the server side, a valid response is still returned although it may contain only a subset of the nodes that are part of the cluster, the ones that have responded until then.

```java
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200, "http"))
    .build();
NodesSniffer nodesSniffer = new ElasticsearchNodesSniffer(
    restClient,
    TimeUnit.SECONDS.toMillis(5),
    ElasticsearchNodesSniffer.Scheme.HTTP);
Sniffer sniffer = Sniffer.builder(restClient)
    .setNodesSniffer(nodesSniffer).build();
```

Also, a custom `NodesSniffer` implementation can be provided for advanced use cases that may require fetching the nodes from external sources rather than from Elasticsearch:

```java
RestClient restClient = RestClient.builder(
    new HttpHost("localhost", 9200, "http"))
    .build();
NodesSniffer nodesSniffer = new NodesSniffer() {
        @Override
        public List<Node> sniff() throws IOException {
            return null; <1>
        }
    };
Sniffer sniffer = Sniffer.builder(restClient)
    .setNodesSniffer(nodesSniffer).build();
```

1. Fetch the hosts from the external source


