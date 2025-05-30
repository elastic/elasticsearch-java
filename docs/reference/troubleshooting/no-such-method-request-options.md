---
navigation_title: "NoSuchMethodError: removeHeader"
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/no-such-method-request-options.html
---

# `NoSuchMethodError` when creating a client

In certain contexts you may encounter an error when creating the `ElasticsearchClient` saying that the method `RequestOptions$Builder.removeHeader` does not exist:

```java
java.lang.NoSuchMethodError: 'org.elasticsearch.client.RequestOptions$Builder org.elasticsearch.client.RequestOptions$Builder.removeHeader(java.lang.String)'
```

This method was introduced in `elasticsearch-rest-client` version 7.16.0. The error happens because your project is using an older version of this dependency.

This happens in particular when the project is using the [Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/), as this plugin [defines versions for commonly used libraries](https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-dependencies/build.gradle), including `elasticsearch-rest-client`. Depending on the version of Spring Boot used in the project, that version may be outdated.

To solve this issue, you have to add the `elasticsearch-rest-client` dependency explicitly in your project, with the same version as `elasticsearch-java` (see also [Installation](/reference/setup/installation.md)).

Using Gradle:

```groovy subs=true
implementation 'org.elasticsearch.client:elasticsearch-rest-client:{{version}}'
```

Using Maven:

```xml subs=true
<dependency>
    <groupId>org.elasticsearch.client</groupId>
    <artifactId>elasticsearch-rest-client</artifactId>
    <version>{{version}}</version>
</dependency>
```
