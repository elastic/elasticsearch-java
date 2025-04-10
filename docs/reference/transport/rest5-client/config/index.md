
# Common configuration

As explained in [Initialization](../usage/initialization.md), the `RestClientBuilder` supports providing both a `RequestConfigCallback` and an `HttpClientConfigCallback` which allow for any customization that the Apache Async Http Client exposes. Those callbacks make it possible to modify some specific behaviour of the client without overriding every other default configuration that the `Rest5Client` is initialized with. This section describes some common scenarios that require additional configuration for the low-level Java REST Client.

<!--
TODO update RequestConfigCallback
-->






