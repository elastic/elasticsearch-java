---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/_maven_repository.html
navigation_title: Maven Repository
---

# Maven repository for {{es}} Java REST client sniffer [_maven_repository]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

The REST client sniffer is subject to the same release cycle as Elasticsearch. Replace the version with the desired sniffer version, first released with `5.0.0-alpha4`. There is no relation between the sniffer version and the Elasticsearch version that the client can communicate with. Sniffer supports fetching the nodes list from Elasticsearch 2.x and onwards.

If you are looking for a SNAPSHOT version, the Elastic Maven Snapshot repository is available at [https://snapshots.elastic.co/maven/](https://snapshots.elastic.co/maven/).

## Maven configuration [_maven_configuration]

Here is how you can configure the dependency using maven as a dependency manager. Add the following to your `pom.xml` file:

```xml subs=true
<dependency>
    <groupId>org.elasticsearch.client</groupId>
    <artifactId>elasticsearch-rest-client-sniffer</artifactId>
    <version>{{version}}</version>
</dependency>
```


## Gradle configuration [_gradle_configuration]

Here is how you can configure the dependency using gradle as a dependency manager. Add the following to your `build.gradle` file:

```groovy subs=true
dependencies {
    compile 'org.elasticsearch.client:elasticsearch-rest-client-sniffer:{{version}}'
}
```


