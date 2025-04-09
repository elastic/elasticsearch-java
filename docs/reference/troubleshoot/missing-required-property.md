---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/missing-required-property.html
---

# Missing required property [missing-required-property]

The Java API Client distinguishes optional and required properties. Optional properties are marked with the `@Nullable` annotation.

When an API object is built and a required property hasn’t been set, a `MissingRequiredPropertyException` is thrown. This applies both to request object built by your application and to response objects returned by Elasticsearch, so that you can be assured that a property that does not have the `@Nullable` annotation will never be `null`.

However, there may be bugs in the [Elasticsearch API specification](https://github.com/elastic/elasticsearch-specification) where a response object’s property is incorrectly required, leading to a `MissingRequiredPropertyException` when deserializing a response. If this happens, here’s how you can work around it:

* Make sure you use the latest release of the Java API Client. The issue may already have been fixed.
* If the issue is still present on the latest version, [open an issue](https://github.com/elastic/elasticsearch-java/issues/new/choose) so that we can fix it in the next release. Please help us to improve the Java API Client.
* Temporarily disable required property checks for the offending request:

::::{warning} 
This is a workaround. Do not consider this as a permanent solution, and please [open an issue](https://github.com/elastic/elasticsearch-java/issues/new/choose) so that the problem can be fixed in a future release.
::::


```java
    ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(true);
    SomeRequest request = SomeRequest.of(...);
    SomeResponse response = esClient.someApi(request);
    ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(false);
    // Do something with response
}
```

The `DANGEROUS_disableRequiredPropertiesCheck` method disables required property checks on the current thread, and for response deserialization in asynchronous requests. As its name implies, it is dangerous as it removes the guarantees of properties that are not `@Nullable`. This is a temporary workaround until the issue is fixed.

Note that the result of this method is an `AutoCloseable` object that resets required property checks to its previous setting. You can therefore use it in a try-with-resource block as follows:

```java
try (ApiTypeHelper.DisabledChecksHandle h =
        ApiTypeHelper.DANGEROUS_disableRequiredPropertiesCheck(true)) {
    SomeRequest request = SomeRequest.of(...);
    SomeResponse response = esClient.someApi(request);
    // Do something with response
}
```

