---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/exception-conventions.html
---

# Exceptions [exception-conventions]

Client methods can throw two kinds of exceptions:

* Requests that were received by the {{es}} server but that were rejected (validation error, server internal timeout exceeded, etc) will produce an `ElasticsearchException`. This exception contains details about the error, provided by {{es}}.
* Requests that failed to reach the server (network error, server unavailable, etc) will produce a `TransportException`. That exception’s cause is the exception thrown by the lower-level implementation. In the case of the `RestClientTransport` it will be a `ResponseException` that contains the low level HTTP response.

