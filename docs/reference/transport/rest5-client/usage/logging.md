---
navigation_title: Logging
---

# Logging in the {{es}} Java REST 5 client

The Java REST 5 client uses the same logging library that the Apache Async Http Client uses: [Apache Commons Logging](https://commons.apache.org/proper/commons-logging/), which comes with support for a number of popular logging implementations. The java packages to enable logging for is `co.elastic.clients.transport.rest5_client`.

The request tracer logging can also be enabled to log every request and corresponding response in curl format. That comes handy when debugging, for instance in case a request needs to be manually executed to check whether it still yields the same response as it did. Enable trace logging for the `co.elastic.clients.transport.rest5_client.low_level.Request` class to have such log lines printed out. Do note that this type of logging is expensive and should not be enabled at all times in production environments, but rather temporarily used only when needed.




