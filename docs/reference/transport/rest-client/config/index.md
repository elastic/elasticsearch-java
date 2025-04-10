---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-config.html
---

# Common configuration [java-rest-low-config]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

As explained in [Initialization](../usage/initialization.md), the `RestClientBuilder` supports providing both a `RequestConfigCallback` and an `HttpClientConfigCallback` which allow for any customization that the Apache Async Http Client exposes. Those callbacks make it possible to modify some specific behaviour of the client without overriding every other default configuration that the `RestClient` is initialized with. This section describes some common scenarios that require additional configuration for the low-level Java REST Client.








