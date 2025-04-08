---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/lists-and-maps.html
---

# Lists and maps [lists-and-maps]


## Additive builder setters [_additive_builder_setters]

Properties of type `List` and `Map` are exposed by object builders as a set of overloaded additive-only methods that *update* the property value, by appending to lists and adding new entries to maps (or replacing existing ones).

Object builders create immutable objects, and this also applies to list and map properties that are made immutable at object construction time.

```java
// Prepare a list of index names
List<String> names = Arrays.asList("idx-a", "idx-b", "idx-c");

// Prepare cardinality aggregations for fields "foo" and "bar"
Map<String, Aggregation> cardinalities = new HashMap<>();
cardinalities.put("foo-count", Aggregation.of(a -> a.cardinality(c -> c.field("foo"))));
cardinalities.put("bar-count", Aggregation.of(a -> a.cardinality(c -> c.field("bar"))));

// Prepare an aggregation that computes the average of the "size" field
final Aggregation avgSize = Aggregation.of(a -> a.avg(v -> v.field("size")));

SearchRequest search = SearchRequest.of(r -> r
    // Index list:
    // - add all elements of a list
    .index(names)
    // - add a single element
    .index("idx-d")
    // - add a vararg list of elements
    .index("idx-e", "idx-f", "idx-g")

    // Sort order list: add elements defined by builder lambdas
    .sort(s -> s.field(f -> f.field("foo").order(SortOrder.Asc)))
    .sort(s -> s.field(f -> f.field("bar").order(SortOrder.Desc)))

    // Aggregation map:
    // - add all entries of an existing map
    .aggregations(cardinalities)
    // - add a key/value entry
    .aggregations("avg-size", avgSize)
    // - add a key/value defined by a builder lambda
    .aggregations("price-histogram",
        a -> a.histogram(h -> h.field("price")))
);
```


## List and map values are never `null` [_list_and_map_values_are_never_null]

The {{es}} API has a lot of optional properties. For single-valued properties, the Java API Client represents missing optional values as `null`. Applications therefore have to null-check optional values before using them.

For lists and maps however, applications often only care about whether they’re empty or not, or even just iterate on their content. Using `null` values is then cumbersome. To avoid this, Java API Client collection properties are never `null`, and missing optional collections are returned as an empty collection.

If you ever need to distinguish between a missing (undefined) optional collection and an effectively-empty collection returned by {{es}}, the `ApiTypeHelper` class provides a utility method to distinguish them:

```java
NodeStatistics stats = NodeStatistics.of(b -> b
    .total(1)
    .failed(0)
    .successful(1)
);

// The `failures` list was not provided.
// - it's not null
assertNotNull(stats.failures());
// - it's empty
assertEquals(0, stats.failures().size());
// - and if needed we can know it was actually not defined
assertFalse(ApiTypeHelper.isDefined(stats.failures()));
```

:::{include} /reference/_snippets/doc-tests-blurb.md
:::

