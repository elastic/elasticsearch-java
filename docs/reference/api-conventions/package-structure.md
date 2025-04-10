---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/package-structure.html
---

# Package structure and namespace clients [package-structure]

The {{es}} API is large and is organized into feature groups, as can be seen in the [{{es}} API documentation](elasticsearch://reference/elasticsearch/rest-apis/index.md).

The Java API Client follows this structure: feature groups are called “namespaces”, and each namespace is located in a subpackage of `co.elastic.clients.elasticsearch`.

Each of the namespace clients can be accessed from the top level {{es}} client. The only exceptions are the “search” and “document” APIs which are located in the `core` subpackage and can be accessed on the main {{es}} client object.

The snippet below shows how to use the indices namespace client to create an index (the lambda syntax is explained in [Building API objects](building-objects.md)):

```java
// Create the "products" index
ElasticsearchClient client = ...
client.indices().create(c -> c.index("products"));
```

Namespace clients are very lightweight objects that can be created on the fly.

