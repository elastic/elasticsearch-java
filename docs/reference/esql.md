---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/esql.html
---

# ES|QL in the Java client [esql]

This page helps you understand and use [ES|QL](docs-content://explore-analyze/query-filter/languages/esql.md) in the Java client.

There are two ways to use ES|QL in the Java API Client:

* Use the Elasticsearch [ES|QL API](https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-esql) directly: This is the most flexible approach, but it’s also the most complex because you must handle results in their raw form. You can choose the precise format of results, such as JSON, CSV, or text.
* Use ES|QL mapping helpers: These mappers take care of parsing the raw response into something readily usable by the application. Several mappers are available for different use cases, such as object mapping, cursor traversal of results, and dataframes. You can also define your own mapper for specific use cases.


## How to use the ES|QL API [esql-how-to]

The [ES|QL query API](https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-esql) allows you to specify how results should be returned. You can choose a [response format](docs-content://explore-analyze/query-filter/languages/esql-rest.md#esql-rest-format) such as CSV, text, or JSON, then fine-tune it with parameters like column separators and locale.

Because the response varies widely depending on the format, the Java API Client has a BinaryData object you can use according to the format specified in the request.

The following example gets ES|QL results as CSV and parses them:

```java
String queryAuthor =
    """
        from books
        | where author == "Isaac Asimov"
        | sort year desc
        | limit 10
    """;

BinaryResponse response = client.esql().query(q -> q
    .format("csv")
    .delimiter(",")
    .query(queryAuthor));

String result = new BufferedReader(new InputStreamReader(response.content()))
    .lines().collect(Collectors.joining("\n"));
```


## Consume ES|QL results [esql-consume-results]

The previous example showed that although the raw ES|QL API offers maximum flexibility, additional work is required in order to make use of the result data.

To simplify things, try working with these three main representations of ES|QL results (each with its own mapping helper):

* **Objects**, where each row in the results is mapped to an object from your application domain. This is similar to what ORMs (object relational mappers) commonly do.

    ```java
    List<Book> queryRes = (List<Book>) client.esql().query(ObjectsEsqlAdapter.of(Book.class), queryAuthor);
    ```

* **Cursors**, where you scan the results row by row and access the data using column names. This is similar to database access libraries.

    ```java
    ResultSet resultSet = client.esql().query(ResultSetEsqlAdapter.INSTANCE, queryAuthor);
    ```



## Define your own mapping [esql-custom-mapping]

Although the mappers provided by the Java API Client cover many use cases, your application might require a custom mapping. You can write your own mapper and use it in a similar way as the built-in ones.

Note that mappers are meant to provide a more usable representation of ES|QL results—not to process the result data. Data processing should be based on the output of a result mapper.

Here’s an example mapper that returns a simple column-oriented representation of the data:

```java
public class CustomStringAdapter extends EsqlAdapterBase<String> {

    public static final CustomStringAdapter INSTANCE = new CustomStringAdapter();

    @Override
    public String format() {
        return "json";
    }

    @Override
    public boolean columnar() {
        return true;
    }

    @Override
    public String deserialize(ApiClient<ElasticsearchTransport, ?> client, QueryRequest request,
                              BinaryResponse response)
        throws IOException {
        return new BufferedReader(new InputStreamReader(response.content()))
            .lines().collect(Collectors.joining("\n"));
    }
}
```
