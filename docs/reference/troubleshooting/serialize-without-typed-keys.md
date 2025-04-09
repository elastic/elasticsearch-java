---
navigation_title: Serializing without typed keys
---

# Serializing aggregations and suggestions without typed keys

{{es}} search requests accept a `typed_key` parameter that allow returning type information along with the name in aggregation and suggestion results (see Elasticsearch's aggregation documentation for additional details).

The Java API Client always adds this parameter to search requests, as type information is needed to know the concrete class that should be used to deserialize aggregation and suggestion results.

Symmetrically, the Java API Client also serializes aggregation and suggestion results using this `typed_keys` format, so that it can correctly deserialize the results of its own serialization.

% :::{include-code} src={{doc-tests-src}}/troubleshooting/TroubleShootingTests.java tag=aggregation-typed-keys
```java
JsonpMapper mapper = esClient._jsonpMapper();

StringWriter writer = new StringWriter();
try (JsonGenerator generator = mapper.jsonProvider().createGenerator(writer)) {
    mapper.serialize(searchResponse, generator);
}
String result = writer.toString();

// The aggregation property provides the "avg" type and "price" name
assertTrue(result.contains("\"aggregations\":{\"avg#price\":{\"value\":3.14}}}"));
```

However, in some use cases serializing objects in the `typed_keys` format may not be desirable, for example when the Java API Client is used in an application that acts as a front-end to other services that expect the default format for aggregations and suggestions.

You can disable `typed_keys` serialization by setting the `JsonpMapperFeatures.SERIALIZE_TYPED_KEYS` attribute to `false` on your mapper object:

% :::{include-code} src={{doc-tests-src}}/troubleshooting/TroubleShootingTests.java tag=aggregation-no-typed-keys
```java
// Create a new mapper with the typed_keys feature disabled
JsonpMapper mapper = esClient._jsonpMapper()
    .withAttribute(JsonpMapperFeatures.SERIALIZE_TYPED_KEYS, false);

StringWriter writer = new StringWriter();
try (JsonGenerator generator = mapper.jsonProvider().createGenerator(writer)) {
    mapper.serialize(searchResponse, generator);
}
String result = writer.toString();

// The aggregation only provides the "price" name
assertTrue(result.contains("\"aggregations\":{\"price\":{\"value\":3.14}}}"));
```
