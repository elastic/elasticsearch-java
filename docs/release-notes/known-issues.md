---
navigation_title: "Known issues"

---

# Elasticsearch Java Client known issues [elasticsearch-java-client-known-issues]

For detailed issues, refer to the [Java client repo](https://github.com/elastic/elasticsearch-java/issues).


## 9.0.0 [known-issues-9-0-0]

The 9.0.0 version of the client uses the new built-in `Rest5Client`, instead of depending on `elasticsearch-rest-client`. But the 9.0.0 client still depends on Apache `commons-logging`, which causes the following exception when not available:
```
Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory
	at co.elastic.clients.transport.rest5_client.low_level.Rest5Client.<clinit>(Rest5Client.java:115)
	at co.elastic.clients.transport.rest5_client.Rest5ClientTransport.buildRest5Client(Rest5ClientTransport.java:65)
	at co.elastic.clients.transport.rest5_client.Rest5ClientTransport.<init>(Rest5ClientTransport.java:42)
	at co.elastic.clients.transport.ElasticsearchTransportConfig$Default.buildTransport(ElasticsearchTransportConfig.java:110)
	at co.elastic.clients.elasticsearch.ElasticsearchClient.of(ElasticsearchClient.java:190)
```
To fix this and use the new `Rest5Client`, add the `commons-logging` dependency:
```kotlin
// gradle
implementation("commons-logging:commons-logging:1.3.5")
```
```xml
<!--maven-->
<dependency>
    <groupId>commons-logging</groupId>
    <artifactId>commons-logging</artifactId>
    <version>1.3.5</version>
</dependency>
```

## 8.16.7 [known-issues-8-16-7]

8.16.7 is the first patch released without a matching rest-client version. The `elasticsearch-rest-client` dependency is missing, causing the following exception:
```
Could not resolve dependencies for project
[ERROR] dependency: org.elasticsearch.client:elasticsearch-rest-client:jar:8.16.7 (compile)
[ERROR] 	Could not find artifact org.elasticsearch.client:elasticsearch-rest-client:jar:8.16.7 in central (https://repo.maven.apache.org/maven2)
```
To use this version of the client, set the latest available version explicitly in the project:
```kotlin
// gradle
implementation("org.elasticsearch.client:elasticsearch-rest-client:8.16.6")
```
```xml
<!--maven-->
<dependency>
    <groupId>org.elasticsearch.client</groupId>
    <artifactId>elasticsearch-rest-client</artifactId>
    <version>8.16.6</version>
</dependency>
```