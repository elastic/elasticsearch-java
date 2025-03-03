---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/aggregations.html
---

# Aggregations [aggregations]

An aggregation summarizes your data as metrics, statistics, or other analytics.

::::{note}
See the [{{es}} documentation](elasticsearch://reference/data-analysis/aggregations/index.md) for a full explanation of aggregations.
::::



## A simple aggregation [_a_simple_aggregation]

In the example below we run an aggregation that creates a price histogram from a product index, for the products whose name match a user-provided text. To achieve this, we use a search request that has a query (explained in [Searching for documents](/reference/searching.md)) and an aggregation definition.

This example is an analytics-type aggregation where we do not want to use the matching documents. A general pattern for search requests used for analytics is to set the result `size` to zero and the target class for search results to `Void`.

If that same aggregation was used for to display products and the price histogram as drill-down facets, we would have set `size` to a non-zero value and used `Product` as the target class to process the results.

```java
String searchText = "bike";

Query query = MatchQuery.of(m -> m
    .field("name")
    .query(searchText)
)._toQuery();

SearchResponse<Void> response = esClient.search(b -> b
    .index("products")
    .size(0) <1>
    .query(query) <2>
    .aggregations("price-histogram", a -> a <3>
        .histogram(h -> h <4>
            .field("price")
            .interval(50.0)
        )
    ),
    Void.class <5>
);
```

1. Set the number of matching documents to zero as we only use the price histogram.
2. Set the query that fill filter the products on which to run the aggregation
3. Create an aggregation named "price-histogram". You can add as many named aggregations as needed.
4. Select the `histogram` aggregation variant.
5. We do not care about matches (`size` is set to zero), using `Void` will ignore any document in the response.


The response contains an aggregation result for each aggregation in the request.

```java
List<HistogramBucket> buckets = response.aggregations()
    .get("price-histogram") <1>
    .histogram() <2>
    .buckets().array(); <3>

for (HistogramBucket bucket: buckets) {
    logger.info("There are " + bucket.docCount() +
        " bikes under " + bucket.key());
}
```

1. Get the results for the "price-histogram" aggregation.
2. Cast it down to the `histogram` variant results. This has to be consistent with the aggregation definition.
3. Buckets can be expressed as arrays or maps. This casts down to the array variant (the default).


The source code for the examples above can be found in the [Java API Client tests](https://github.com/elastic/elasticsearch-java/tree/master/java-client/src/test/java/co/elastic/clients/documentation).

