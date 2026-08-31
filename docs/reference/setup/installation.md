---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/installation.html
---

# Installation [installation]

Requirements:

* Java 17 or later.
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


## HTTP client dependencies [http-client-dependencies]

The Java API Client communicates with {{es}} through an HTTP client, and two implementations are available:

* [Rest5Client](/reference/transport/rest5-client/index.md), the default and recommended implementation, based on the Apache HttpClient 5 library. It is included in the `elasticsearch-java` dependency, so no additional dependency is needed to use it.
* [RestClient](/reference/transport/rest-client/index.md), the legacy implementation, based on the deprecated Apache HttpClient 4 library. Since version 9.0 it is an optional dependency, meaning that it has to be added explicitly to the project.

Refer to [the transport layer documentation](/reference/transport/index.md) for guidance on which implementation to choose.

To use the legacy RestClient, add the following dependency, using the same version as `elasticsearch-java`:

```groovy subs=true
dependencies {
    implementation 'org.elasticsearch.client:elasticsearch-rest-client:{{version}}'
}
```

```xml subs=true
<project>
  <dependencies>

    <dependency>
      <groupId>org.elasticsearch.client</groupId>
      <artifactId>elasticsearch-rest-client</artifactId>
      <version>{{version}}</version>
    </dependency>

  </dependencies>
</project>
```

:::{note}
This is especially relevant when upgrading an application from version 8.x, where the legacy RestClient was the only available HTTP client and was included by default. Applications upgrading to 9.x that keep using the legacy RestClient must add this dependency to keep compiling. Refer to the [9.0.0 release notes](/release-notes/9-0-0.md) for the full list of breaking changes.
:::


## If you get ClassNotFoundException: jakarta.json.spi.JsonProvider [class-not-found-jsonprovider]

It may happen that after setting up the dependencies, your application fails with `ClassNotFoundException: jakarta.json.spi.JsonProvider`.

If this happens, you have to explicitly add the `jakarta.json:jakarta.json-api:2.1.3` dependency.

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
