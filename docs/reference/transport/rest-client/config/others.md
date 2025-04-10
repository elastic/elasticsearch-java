---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_others.html
---

# Others [_others]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

For any other required configuration needed, the Apache HttpAsyncClient docs should be consulted: [https://hc.apache.org/httpcomponents-asyncclient-4.1.x/](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/) .

::::{note}
If your application runs under the security manager you might be subject to the JVM default policies of caching positive hostname resolutions indefinitely and negative hostname resolutions for ten seconds. If the resolved addresses of the hosts to which you are connecting the client to vary with time then you might want to modify the default JVM behavior. These can be modified by adding [`networkaddress.cache.ttl=<timeout>`](https://docs.oracle.com/javase/8/docs/technotes/guides/net/properties.md) and [`networkaddress.cache.negative.ttl=<timeout>`](https://docs.oracle.com/javase/8/docs/technotes/guides/net/properties.md) to your [Java security policy](https://docs.oracle.com/javase/8/docs/technotes/guides/security/PolicyFiles.md).
::::


