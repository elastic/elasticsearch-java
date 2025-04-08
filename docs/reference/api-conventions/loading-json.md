---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/loading-json.html
---

# Creating API objects from JSON data [loading-json]

A common workflow during application development with Elasticsearch is to use the Kibana Developer Console to interactively prepare and test queries, aggregations, index mappings and other complex API calls. This results in working JSON snippets that you may want to use in your application.

As translating these JSON snippets to Java code can be time-consuming and error-prone, most of the data classes in the Java API Client can be loaded from JSON text: object builders have `withJson()` methods that populate the builder from raw JSON. This also allows you to combine dynamically loaded JSON with programmatic construction of objects.

Under the hood, the `withJson()` methods call the object’s deserializer. The JSON text’s structure and value types therefore have to be correct for the target data structure. Using `withJson()` keeps the strong typing guarantees of the Java API Client.


## Examples [_examples_2]


### Loading an index definition from a resource file [_loading_an_index_definition_from_a_resource_file]

Consider a resource file `some-index.json` containing an index definition:

```json
{
  "mappings": {
    "properties": {
      "field1": { "type": "text" }
    }
  }
}
```

You can create an index from that definition as follows:

<!-- :::include
```java
:::{include} {doc-tests-src}/api_conventions/LoadingJsonTest.java[load-index]
```
-->
% :::include::start -- do not remove
```java
InputStream input = this.getClass()
    .getResourceAsStream("some-index.json"); // <1>

CreateIndexRequest req = CreateIndexRequest.of(b -> b
    .index("some-index")
    .withJson(input) // <2>
);

boolean created = client.indices().create(req).acknowledged();
```
% :::include::end -- do not remove

1. open an input stream for the JSON resource file.
2. populate the index creation request with the resource file contents.



### Ingesting documents from JSON files [_ingesting_documents_from_json_files]

Similarly, you can read documents to be stored in {{es}} from data files:

<!-- :::include
```java
:::{include} {doc-tests-src}/api_conventions/LoadingJsonTest.java[ingest-data]
```
-->
% :::include::start -- do not remove
```java
FileReader file = new FileReader(new File(dataDir, "document-1.json"));

IndexRequest<JsonData> req; // <1>

req = IndexRequest.of(b -> b
    .index("some-index")
    .withJson(file)
);

client.index(req);
```
% :::include::end -- do not remove

1. when calling `withJson()` on data structures that have generic type parameters, these generic types will be considered to be `JsonData`.



### Creating a search request combining JSON and programmatic construction [_creating_a_search_request_combining_json_and_programmatic_construction]

You can combine `withJson()` with regular calls to setter methods. The example below loads the query part of a search request from a `String` and programmatically adds an aggregation.

<!-- :::include
```java
:::{include} {doc-tests-src}/api_conventions/LoadingJsonTest.java[query]
```
-->
% :::include::start -- do not remove
```java
Reader queryJson = new StringReader(
    "{" +
    "  \"query\": {" +
    "    \"range\": {" +
    "      \"@timestamp\": {" +
    "        \"gt\": \"now-1w\"" +
    "      }" +
    "    }" +
    "  }" +
    "}");

SearchRequest aggRequest = SearchRequest.of(b -> b
    .withJson(queryJson) // <1>
    .aggregations("max-cpu", a1 -> a1 // <2>
        .dateHistogram(h -> h
            .field("@timestamp")
            .calendarInterval(CalendarInterval.Hour)
        )
        .aggregations("max", a2 -> a2
            .max(m -> m.field("host.cpu.usage"))
        )
    )
    .size(0)
);

Map<String, Aggregate> aggs = client
    .search(aggRequest, Void.class) // <3>
    .aggregations();
```
% :::include::end -- do not remove

1. loads the query from the JSON string.
2. adds the aggregation.
3. since this is an aggregation we don’t care about result documents and set their target class to `Void`, meaning they will just be ignored. Note that setting `size` to zero actually prevents any document from being returned.



### Creating a search request from multiple JSON snippets [_creating_a_search_request_from_multiple_json_snippets]

The `withJson()` methods are partial deserializers: the properties loaded from the JSON will set property values or replace the previous ones, but will not reset other properties not found in the JSON input. You can use this to combine multiple JSON snippets to build complex search requests. In the example below, we combine separate definitions of a query that selects some documents and an aggregation that is run on the results of this query.

<!-- :::include
```java
:::{include} {doc-tests-src}/api_conventions/LoadingJsonTest.java[query-and-agg]
```
-->
% :::include::start -- do not remove
```java
Reader queryJson = new StringReader(
    "{" +
    "  \"query\": {" +
    "    \"range\": {" +
    "      \"@timestamp\": {" +
    "        \"gt\": \"now-1w\"" +
    "      }" +
    "    }" +
    "  }," +
    "  \"size\": 100" + // <1>
    "}");

Reader aggregationJson = new StringReader(
    "{" +
    "  \"size\": 0, " + // <2>
    "  \"aggregations\": {" +
    "    \"hours\": {" +
    "      \"date_histogram\": {" +
    "        \"field\": \"@timestamp\"," +
    "        \"interval\": \"hour\"" +
    "      }," +
    "      \"aggregations\": {" +
    "        \"max-cpu\": {" +
    "          \"max\": {" +
    "            \"field\": \"host.cpu.usage\"" +
    "          }" +
    "        }" +
    "      }" +
    "    }" +
    "  }" +
    "}");

SearchRequest aggRequest = SearchRequest.of(b -> b
    .withJson(queryJson) // <3>
    .withJson(aggregationJson) // <4>
    .ignoreUnavailable(true) // <5>
);

Map<String, Aggregate> aggs = client
    .search(aggRequest, Void.class)
    .aggregations();
```
% :::include::end -- do not remove

1. set max number of returned document to 100 for queries.
2. we do not want any matching document in aggregations.
3. loads the query part of the request.
4. loads the aggregation part of the request (overwrites `size` from the query).
5. additional request properties set programmatically.


Notice that order matters when the JSON snippets have some common properties: just as when setting property values programmatically, the last value that is set for a property overwrites the previous one.

:::{include} /reference/_snippets/doc-tests-blurb.md
:::

