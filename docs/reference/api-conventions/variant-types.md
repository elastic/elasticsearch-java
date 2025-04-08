---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/variant-types.html
---

# Variant types [variant-types]

The {{es}} API has a lot of variant types: queries, aggregations, field mappings, analyzers, and so on. Finding the correct class name in such large collections can be challenging.

The Java API Client builders make this easy: the builders for variant types, such as `Query`, have methods for each of the available implementations. We’ve seen this in action above with `intervals` (a kind of query) and `allOf`, `match` and `anyOf` (various kinds of intervals).

This is because variant objects in the Java API Client are implementations of a “tagged union”: they contain the identifier (or tag) of the variant they hold and the value for that variant. For example, a `Query` object can contain an `IntervalsQuery` with tag `intervals`, a `TermQuery` with tag `term`, and so on. This approach allows writing fluent code where you can let the IDE completion features guide you to build and navigate complex nested structures:

Variant builders have setter methods for every available implementation. They use the same conventions as regular properties and accept both a builder lambda expression and a ready-made object of the actual type of the variant. Here’s an example to build a term query:

```java
Query query = new Query.Builder()
    .term(t -> t                          <1>
        .field("name")                    <2>
        .value(v -> v.stringValue("foo"))
    )
    .build();                             <3>
```

1. Choose the `term` variant to build a term query.
2. Build the terms query with a builder lambda expression.
3. Build the `Query` that now holds a `TermQuery` object of kind `term`.


Variant objects have getter methods for every available implementation. These methods check that the object actually holds a variant of that kind and return the value downcasted to the correct type. They throw an `IllegalStateException` otherwise. This approach allows writing fluent code to traverse variants.

```java
assertEquals("foo", query.term().value().stringValue());
```

Variant objects also provide information on the variant kind they currently hold:

* with `is` methods for each of the variant kinds: `isTerm()`, `isIntervals()`, `isFuzzy()`, etc.
* with a nested `Kind` enumeration that defines all variant kinds.

This information can then be used to navigate down into specific variants after checking their actual kind:

```java
if (query.isTerm()) { <1>
    doSomething(query.term());
}

switch(query._kind()) { <2>
    case Term:
        doSomething(query.term());
        break;
    case Intervals:
        doSomething(query.intervals());
        break;
    default:
        doSomething(query._kind(), query._get()); <3>
}
```

1. Test if the variant is of a specific kind.
2. Test a larger set of variant kinds.
3. Get the kind and value held by the variant object.



## Custom extensions provided by {{es}} plugins [variant-types-custom]

{{es}} accepts plugins that can extend the available variants for a number of types. This includes queries, aggregations, text analyzers and tokenizers, ingest processors, etc.

The Java API Client classes for these types accept a `_custom` variant in addition to the builtin ones. This allows you to use these plugin-defined extensions by providing arbitrary JSON in requests, and also receive arbitrary JSON produced by the plugins in responses.

In the examples below we use a hypothetical plugin that adds a `sphere-distance` aggregation that groups documents containing 3D coordinates according to their distance to a reference location.

To create a custom aggregation, use the `_custom()` aggregation type and provide its identifier, defined by the plugin, and parameters. The parameters can be any object or value that can be serialized to JSON. In the example below we use a simple map:

```java
Map<String, Object> params = new HashMap<>(); <1>
params.put("interval", 10);
params.put("scale", "log");
params.put("origin", new Double[]{145.0, 12.5, 1649.0});

SearchRequest request = SearchRequest.of(r -> r
    .index("stars")
    .aggregations("neighbors", agg -> agg
        ._custom("sphere-distance", params) <2>
    )
);
```

1. Parameters for the custom aggregation.
2. Create a custom aggregation named `neighbors` of kind `sphere-distance` with its parameters.


The results of custom variants are returned as raw JSON represented by a `JsonData` object. You can then traverse the JSON tree to get the data. Since this is not always convenient, you can also define classes that represent that JSON data and deserialize them from the raw JSON.

Traversing the JSON tree:

```java
SearchResponse<Void> response = esClient.search(request, Void.class); <1>

JsonData neighbors = response
    .aggregations().get("neighbors")
    ._custom(); <2>

JsonArray buckets = neighbors.toJson() <3>
    .asJsonObject()
    .getJsonArray("buckets");

for (JsonValue item : buckets) {
    JsonObject bucket = item.asJsonObject();
    double key = bucket.getJsonNumber("key").doubleValue();
    double docCount = bucket.getJsonNumber("doc_count").longValue();
    doSomething(key, docCount);
}
```

1. Use `Void` if you’re only interested in aggregation results, not search hits (see also [Aggregations](/reference/usage/aggregations.md)).
2. Get the `neighbors` aggregation result as custom JSON result.
3. Traverse the JSON tree to extract the result data.


Using a class that represents the custom aggregation results:

```java
SearchResponse<Void> response = esClient.search(request, Void.class);

SphereDistanceAggregate neighbors = response
    .aggregations().get("neighbors")
    ._custom()
    .to(SphereDistanceAggregate.class); <1>

for (Bucket bucket : neighbors.buckets()) {
    doSomething(bucket.key(), bucket.docCount());
}
```

1. Deserialize the custom JSON to a dedicated `SphereDistanceAggregate` class.


Where `SphereDistanceAggregate` can be defined as follows:

```java
public static class SphereDistanceAggregate {
    private final List<Bucket> buckets;
    @JsonCreator
    public SphereDistanceAggregate(
        @JsonProperty("buckets") List<Bucket> buckets
    ) {
        this.buckets = buckets;
    }
    public List<Bucket> buckets() {
        return buckets;
    };
}

public static class Bucket {
    private final double key;
    private final double docCount;
    @JsonCreator
    public Bucket(
        @JsonProperty("key") double key,
        @JsonProperty("doc_count") double docCount) {
        this.key = key;
        this.docCount = docCount;
    }
    public double key() {
        return key;
    }
    public double docCount() {
        return docCount;
    }
}
```

:::{include} /reference/_snippets/doc-tests-blurb.md
:::
