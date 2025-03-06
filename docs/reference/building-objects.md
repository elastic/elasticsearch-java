---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/building-objects.html
---

# Building API objects [building-objects]


## Builder objects [_builder_objects]

All data types in the Java API Client are immutable. Object creation uses the [builder pattern](https://www.informit.com/articles/article.aspx?p=1216151&seqNum=2) that was popularized in **Effective Java** in 2008.

```java
ElasticsearchClient client = ...
CreateIndexResponse createResponse = client.indices().create(
    new CreateIndexRequest.Builder()
        .index("my-index")
        .aliases("foo",
            new Alias.Builder().isWriteIndex(true).build()
        )
        .build()
);
```

Note that a builder should not be reused after its `build()` method has been called.


## Builder lambda expressions [_builder_lambda_expressions]

Although this works nicely, having to instantiate builder classes and call the `build()` method is a bit verbose. So every property setter in the Java API Client also accepts a lambda expression that takes a newly created builder as a parameter and returns a populated builder. The snippet above can also be written as:

```java
ElasticsearchClient client = ...
CreateIndexResponse createResponse = client.indices()
    .create(createIndexBuilder -> createIndexBuilder
        .index("my-index")
        .aliases("foo", aliasBuilder -> aliasBuilder
            .isWriteIndex(true)
        )
    );
```

This approach allows for much more concise code, and also avoids importing classes (and even remembering their names) since types are inferred from the method parameter signature.

Note in the above example that builder variables are only used to start a chain of property setters. The names of these variables are therefore unimportant and can be shortened to improve readability:

```java
ElasticsearchClient client = ...
CreateIndexResponse createResponse = client.indices()
    .create(c -> c
        .index("my-index")
        .aliases("foo", a -> a
            .isWriteIndex(true)
        )
    );
```

Builder lambdas become particularly useful with complex nested queries like the one below, taken from the [intervals query API documentation](elasticsearch://docs/reference/query-languages/query-dsl-intervals-query.md).

This example also highlights a useful naming convention for builder parameters in deeply nested structures. For lambda expressions with a single argument, Kotlin provides the implicit `it` parameter and Scala allows use of `_`. This can be approximated in Java by using an underscore or a single letter prefix followed by a number representing the depth level (i.e. `_0`, `_1`, or `b0`, `b1` and so on). Not only does this remove the need to create throw-away variable names, but it also improves code readability. Correct indentation also allows the structure of the query to stand out.

```java
ElasticsearchClient client = ...
SearchResponse<SomeApplicationData> results = client
    .search(b0 -> b0
        .query(b1 -> b1
            .intervals(b2 -> b2
                .field("my_text")
                .allOf(b3 -> b3
                    .ordered(true)
                    .intervals(b4 -> b4
                        .match(b5 -> b5
                            .query("my favorite food")
                            .maxGaps(0)
                            .ordered(true)
                        )
                    )
                    .intervals(b4 -> b4
                        .anyOf(b5 -> b5
                            .intervals(b6 -> b6
                                .match(b7 -> b7
                                    .query("hot water")
                                )
                            )
                            .intervals(b6 -> b6
                                .match(b7 -> b7
                                    .query("cold porridge")
                                )
                            )
                        )
                    )
                )
            )
        ),
    SomeApplicationData.class <1>
);
```

1. Search results will be mapped to `SomeApplicationData` instances to be readily available to the application.


The source code for the examples above can be found in the [Java API Client tests](https://github.com/elastic/elasticsearch-java/tree/master/java-client/src/test/java/co/elastic/clients/documentation).

