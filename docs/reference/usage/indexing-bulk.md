---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/indexing-bulk.html
---

# Bulk: indexing multiple documents [indexing-bulk]

Bulk requests allow sending multiple document-related operations to {{es}} in one request. When you have multiple documents to ingest, this is more efficient than sending each document with a separate request.

A bulk request can contain several kinds of operations:

* create a document, indexing it after ensuring it doesn’t already exist,
* index a document, creating it if needed and replacing it if it exists,
* update a document that already exists in place, either with a script or a partial document,
* delete a document.

::::{note}
See the [{{es}} API documentation](https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk) for a full explanation of bulk requests.
::::



## Indexing application objects [_indexing_application_objects]

A `BulkRequest` contains a collection of operations, each operation being a [type with several variants](/reference/api-conventions/variant-types.md). To create this request, it is convenient to use a builder object for the main request, and the fluent DSL for each operation.

The example below shows how to index a list or application objects.

```java
List<Product> products = fetchProducts();

BulkRequest.Builder br = new BulkRequest.Builder();

for (Product product : products) {
    br.operations(op -> op           <1>
        .index(idx -> idx            <2>
            .index("products")       <3>
            .id(product.getSku())
            .document(product)
        )
    );
}

BulkResponse result = esClient.bulk(br.build());

// Log errors, if any
if (result.errors()) {
    logger.error("Bulk had errors");
    for (BulkResponseItem item: result.items()) {
        if (item.error() != null) {
            logger.error(item.error().reason());
        }
    }
}
```

1. Adds an operation (remember that [list properties are additive](/reference/api-conventions/lists-maps.md)). `op` is is a builder for `BulkOperation` which is a [variant type](/reference/api-conventions/variant-types.md). This type has `index`, `create`, `update` and `delete` variants.
2. Selects the `index` operation variant, `idx` is a builder for `IndexOperation`.
3. Sets the properties for the index operation, similar to [single document indexing](indexing.md): index name, identifier and document.



## Indexing raw JSON data [indexing-raw-json-data]

The `document` property of a bulk index request can be any object that can be serialized to JSON using your Elasticsearch client’s JSON mapper. However, data that is ingested in bulk is often available as JSON text (e.g. files on disk), and parsing this JSON just to re-serialize it to send the bulk request would be a waste of resources. So documents in bulk operations can also be of type `BinaryData` that are sent verbatim (without parsing) to the {{es}} server.

In the example below we will use the Java API Client’s `BinaryData` to read json files from a log directory and send them in a bulk request.

```java
// List json log files in the log directory
File[] logFiles = logDir.listFiles(
    file -> file.getName().matches("log-.*\\.json")
);

BulkRequest.Builder br = new BulkRequest.Builder();

for (File file: logFiles) {
    FileInputStream input = new FileInputStream(file);
    BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

    br.operations(op -> op
        .index(idx -> idx
            .index("logs")
            .document(data)
        )
    );
}
```


## Streaming ingestion with the Bulk Ingester [_streaming_ingestion_with_the_bulk_ingester]

The `BulkIngester` simplifies the usage of the Bulk API by providing a utility class that allows index/update/delete operations to be transparently grouped in bulk requests. You only have to `add()` bulk operations to the ingester and it will take care of grouping and sending them in bulk according to its configuration.

The ingester will send a bulk request when one of the following criteria is met:

* the number of operations exceeds a maximum (defaults to 1000)
* the bulk request size in bytes exceeds a maximum (defaults to 5 MiB)
* a delay since the last request has expired (periodic flush, no default)

Additionally, you can define a maximum number of concurrent request waiting to be executed by {{es}} (defaults to 1). When that maximum is reached and the maximum number of operations have been collected, adding a new operation to the indexer will block. This is avoids overloading the {{es}} server by putting backpressure on the client application.

```java
BulkIngester<Void> ingester = BulkIngester.of(b -> b
    .client(esClient)    <1>
    .maxOperations(100)  <2>
    .flushInterval(1, TimeUnit.SECONDS) <3>
);

for (File file: logFiles) {
    FileInputStream input = new FileInputStream(file);
    BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

    ingester.add(op -> op <4>
        .index(idx -> idx
            .index("logs")
            .document(data)
        )
    );
}

ingester.close(); <5>
```

1. Sets the {{es}} client used to send bulk requests.
2. Sets the maximum number of operations to collect before sending a bulk request.
3. Sets the flush interval.
4. Adds a bulk operation to the ingester.
5. Closes the ingester to flush the pending operations and release resources.


Additionally, the bulk ingester accepts a listener so that your application can be notified of bulk requests that are sent and their result. To allow correlating bulk operations to application context, the `add()` method optionally accepts a `context` parameter. The type of this context parameter is used as the generic parameter of the `BulkIngester` object. You may have noticed the `Void` type in `BulkIngester<Void>` above: this is because we did not register a listener, and therefore did not care about context values.

The following example shows how you can use context values to implement a bulk ingestion listener: as previously it sends JSON log files in bulk, but tracks bulk request errors and failed operations. When an operation fails, depending on the error type you may want to re-add it to the ingester.

```java
BulkListener<String> listener = new BulkListener<String>() { <1>
    @Override
    public void beforeBulk(long executionId, BulkRequest request, List<String> contexts) {
    }

    @Override
    public void afterBulk(long executionId, BulkRequest request, List<String> contexts, BulkResponse response) {
        // The request was accepted, but may contain failed items.
        // The "context" list gives the file name for each bulk item.
        logger.debug("Bulk request " + executionId + " completed");
        for (int i = 0; i < contexts.size(); i++) {
            BulkResponseItem item = response.items().get(i);
            if (item.error() != null) {
                // Inspect the failure cause
                logger.error("Failed to index file " + contexts.get(i) + " - " + item.error().reason());
            }
        }
    }

    @Override
    public void afterBulk(long executionId, BulkRequest request, List<String> contexts, Throwable failure) {
        // The request could not be sent
        logger.debug("Bulk request " + executionId + " failed", failure);
    }
};

BulkIngester<String> ingester = BulkIngester.of(b -> b
    .client(esClient)
    .maxOperations(100)
    .flushInterval(1, TimeUnit.SECONDS)
    .listener(listener) <2>
);

for (File file: logFiles) {
    FileInputStream input = new FileInputStream(file);
    BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

    ingester.add(op -> op
        .index(idx -> idx
            .index("logs")
            .document(data)
        ),
        file.getName() <3>
    );
}

ingester.close();
```

1. Creates a listener where context values are strings for the ingested file name.
2. Registers the listener on the bulk ingester.
3. Sets the file name as the context value for a bulk operation.


The bulk ingest also exposes statistic information that allows monitoring the ingestion process and tune its configuration:

* number of operations added,
* number of calls to `add()` that were blocked because the maximum number of concurrent requests was reached (contention),
* number of bulk requests sent,
* number of bulk requests that were blocked because the maximum number of concurrent requests was reached.

:::{include} /reference/_snippets/doc-tests-blurb.md
:::

