---
navigation_title: Transport layer
---

# The transport layer
 
`ElasticsearchClient` exposes the Elasticsearch APIs using high level objects and data structures. It relies on a `Transport` implementation for lower level concerns that include:

* JSON serialization and deserialization, by delegating to a `JsonpMapper`.
* network communication: HTTP, TLS, load-balancing among cluster nodes, etc.

## JSON mappers

The Java API client comes with two JSON mapping implementations:

* `JacksonJsonpMapper`, the default implementation based on the popular [Jackson](https://github.com/FasterXML/jackson) library.
* `JsonbJsonpMapper`, based on the JakartaEE JSONP specification, which allows using any implementation of this specification such as [Eclipse Parsson](https://github.com/eclipse-ee4j/parsson)

Which implementation should you use?

Unless you have specific requirements, use the default Jackson implementation.

## HTTP implementations

The Java API client comes with two HTTP implementations:

* [](rest5-client/index.md), the default implementation, based on the Apache http client library version 5. It's a direct port of the previous version to this new library.
* [Rest Client](rest-client/index.md), the legacy implementation that has existed since Elasticsearch version 7, based on the Apache http client library version 4.

Which implementation should you use?
* if you're starting a new application, use the default Rest 5 Client.
* if you're upgrading an existing application, consider upgrading to Rest 5 Client. Adapting your client creation code to the newer Apache http library should be releatively straightforward.
* if you're upgrading an application with a heavily customized Rest Client configuration, then consider staying with this legacy version. Be mindful however that it may be removed in the next major release.
