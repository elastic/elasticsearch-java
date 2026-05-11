---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-maven.html
navigation_title: Maven repository
---

# Maven repository for {{es}} Java REST client [java-rest-low-usage-maven]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

The low-level Java REST client is hosted on [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.elasticsearch.client%22). The minimum Java version required is `1.8`.

The low-level REST client is subject to the same release cycle as Elasticsearch. Replace the version with the desired client version, first released with `5.0.0-alpha4`. There is no relation between the client version and the Elasticsearch version that the client can communicate with. The low-level REST client is compatible with all Elasticsearch versions.

If you are looking for a SNAPSHOT version, the Elastic Maven Snapshot repository is available at [https://snapshots.elastic.co/maven/](https://snapshots.elastic.co/maven/).

## Maven configuration [java-rest-low-usage-maven-maven]

Here is how you can configure the dependency using maven as a dependency manager. Add the following to your `pom.xml` file:

```xml subs=true
<dependency>
    <groupId>org.elasticsearch.client</groupId>
    <artifactId>elasticsearch-rest-client</artifactId>
    <version>{{version}}</version>
</dependency>
```


## Gradle configuration [java-rest-low-usage-maven-gradle]

Here is how you can configure the dependency using gradle as a dependency manager. Add the following to your `build.gradle` file:

```groovy subs=true
dependencies {
    compile 'org.elasticsearch.client:elasticsearch-rest-client:{{version}}'
}
```


