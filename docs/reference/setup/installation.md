---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/installation.html
---

# Installation [installation]

Requirements:

* Java 8 or later.
* A JSON object mapping library to allow seamless integration of your application classes with the Elasticsearch API. The Java client has support for [Jackson](https://github.com/FasterXML/jackson) or a [JSON-B](https://github.com/eclipse-ee4j/jsonb-api) library like [Eclipse Yasson](https://github.com/eclipse-ee4j/yasson).

Releases are hosted on [Maven Central](https://search.maven.org/search?q=g:co.elastic.clients). If you are looking for a SNAPSHOT version, the Elastic Maven Snapshot repository is available at [https://snapshots.elastic.co/maven/](https://snapshots.elastic.co/maven/).


## Installation in a Gradle project [gradle]

```groovy subs=true
dependencies {
    implementation 'co.elastic.clients:elasticsearch-java:{{version}}'
}
```


## Installation in a Maven project [maven]

In the `pom.xml` of your project, add the following repository definition and dependencies:

```xml subs=true
<project>
  <dependencies>

    <dependency>
      <groupId>co.elastic.clients</groupId>
      <artifactId>elasticsearch-java</artifactId>
      <version>{{version}}</version>
    </dependency>

  </dependencies>
</project>
```


## If you get ClassNotFoundException: jakarta.json.spi.JsonProvider [class-not-found-jsonprovider]

It may happen that after setting up the dependencies, your application fails with `ClassNotFoundException: jakarta.json.spi.JsonProvider`.

If this happens, you have to explicitly add the `jakarta.json:jakarta.json-api:2.0.1` dependency.

```groovy
dependencies {
    ...
    implementation 'jakarta.json:jakarta.json-api:2.1.3'
}
```

```xml
<project>
  <dependencies>
    ...
    <dependency>
      <groupId>jakarta.json</groupId>
      <artifactId>jakarta.json-api</artifactId>
      <version>2.1.3</version>
    </dependency>

  </dependencies>
</project>
```

**Why is this needed?**

Some frameworks like Spring Boot or Helidon come with their Gradle and Maven plugins or their Maven BOM files to ease development and dependency management. These plugins and BOM define the versions to use for a number of well-known libraries.

One of these libraries can be `jakarta.json:json-api` that defines the standard Java JSON API. In version `1.x` this library used the `javax.json` package, while in version `2.x` it uses the `jakarta.json` package after [the transition from JavaEE to JakartaEE](https://blogs.oracle.com/javamagazine/post/transition-from-java-ee-to-jakarta-ee).

The Java API Client depends on version `2.1.3` of this library, in order to use the newer and future-proof `jakarta.json` package. But some build plugins and BOMs override the Java API Client’s dependency to use version `1.x` in the older `javax.json` namespace, resulting in `ClassNotFoundException: jakarta.json.spi.JsonProvider`.

Adding the correct version as top-level project dependency solves the problem.
