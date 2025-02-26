---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/searching.html
---

# Searching for documents [searching]

Indexed documents are available for search in near real-time.

::::{note}
See the {{es}} documentation for a full explanation of search requests: [search your data](docs-content://solutions/search/querying-for-search.md), [the query DSL](docs-content://solutions/search/querying-for-search.md), and [search APIs](https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-search).
::::



## Simple search query [_simple_search_query]

There are many types of search queries that can be combined. We will start with the simple text match query, searching for bikes in the `products` index.

The search result has a `hits` properties that contains the documents that matched the query along with information about the total number of matches that exist in the index.

The total value comes with a relation that indicates if the total is exact (`eq` — equal) or approximate (`gte` — greater than or equal).

Each returned document comes with its relevance score and additional information about its location in the index.

```java
String searchText = "bike";

SearchResponse<Product> response = esClient.search(s -> s
    .index("products") <1>
    .query(q -> q      <2>
        .match(t -> t   <3>
            .field("name")  <4>
            .query(searchText)
        )
    ),
    Product.class      <5>
);

TotalHits total = response.hits().total();
boolean isExactResult = total.relation() == TotalHitsRelation.Eq;

if (isExactResult) {
    logger.info("There are " + total.value() + " results");
} else {
    logger.info("There are more than " + total.value() + " results");
}

List<Hit<Product>> hits = response.hits().hits();
for (Hit<Product> hit: hits) {
    Product product = hit.source();
    logger.info("Found product " + product.getSku() + ", score " + hit.score());
}
```

1. Name of the index we want to search.
2. The query part of the search request (a search request can also have other components like [aggregations](/reference/aggregations.md)).
3. Choose a query variant among the many available. We choose here the match query (full text search).
4. Configure the match query: we search for a term in the `name` field.
5. The target class for the matching documents. We use `Product` here, just like in [get request](/reference/reading.md) examples.


Similarly to [get](/reference/reading.md) operations, you can fetch documents matching your query as raw JSON by using a corresponding target class instead of `Product`, like JSON-P’s `JsonValue` or Jackson’s `ObjectNode`.


## Nested search queries [_nested_search_queries]

{{es}} allows individual queries to be combined to build more complex search requests. In the example below we will search for bikes with a maximum price of 200.

```java
String searchText = "bike";
double maxPrice = 200.0;

// Search by product name
Query byName = MatchQuery.of(m -> m <1>
    .field("name")
    .query(searchText)
)._toQuery(); <2>

// Search by max price
Query byMaxPrice = RangeQuery.of(r -> r
    .number(n -> n
    .field("price")
    .gte(maxPrice)) <3>
)._toQuery();

// Combine name and price queries to search the product index
SearchResponse<Product> response = esClient.search(s -> s
    .index("products")
    .query(q -> q
        .bool(b -> b <4>
            .must(byName) <5>
            .must(byMaxPrice)
        )
    ),
    Product.class
);

List<Hit<Product>> hits = response.hits().hits();
for (Hit<Product> hit: hits) {
    Product product = hit.source();
    logger.info("Found product " + product.getSku() + ", score " + hit.score());
}
```

1. We’re creating the queries for individual criteria separately.
2. A `MatchQuery` is a query *variant* that we have to turn into the `Query` *union type*. See [variant types](/reference/variant-types.md) for additional details.
3. {{es}} range query accepts a large range of value types. We create here a JSON representation of the maximum price.
4. The search query is a boolean query that combines the text search and max price queries.
5. Both queries are added as `must` as we want results to match all criteria.



## Templated search [_templated_search]

A search template is a stored search that you can run with different variables. Search templates let you change your searches without modifying your application code.

Before running a template search, you first have to create the template. This is a stored script that returns the search request body, and is usually defined as a Mustache template. This stored script can be created outside the application, and also with the Java API Client:

```java
// Create a script
esClient.putScript(r -> r
    .id("query-script") <1>
    .script(s -> s
        .lang("mustache")
        .source("{\"query\":{\"match\":{\"{{field}}\":\"{{value}}\"}}}")
    ));
```

1. Identifier of the template script to create.


To use the search template, use the `searchTemplate` method to refer to the script and provide values for its parameters:

```java
SearchTemplateResponse<Product> response = esClient.searchTemplate(r -> r
        .index("some-index")
        .id("query-script") <1>
        .params("field", JsonData.of("some-field")) <2>
        .params("value", JsonData.of("some-data")),
    Product.class
);

List<Hit<Product>> hits = response.hits().hits();
for (Hit<Product> hit: hits) {
    Product product = hit.source();
    logger.info("Found product " + product.getSku() + ", score " + hit.score());
}
```

1. Identifier of the template script to use.
2. Template parameter values.


For more in-depth information, see the [{{es}} search template documentation](docs-content://solutions/search/search-templates.md).

The source code for the examples above can be found in the [Java API Client tests](https://github.com/elastic/elasticsearch-java/tree/master/java-client/src/test/java/co/elastic/clients/documentation).

