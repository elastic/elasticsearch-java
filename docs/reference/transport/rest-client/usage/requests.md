---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-requests.html
---

# Performing requests [java-rest-low-usage-requests]

:::{include} /reference/_snippets/legacy-rest-client.md
:::

Once the `RestClient` has been created, requests can be sent by calling either `performRequest` or `performRequestAsync`. `performRequest` is synchronous and will block the calling thread and return the `Response` when the request is successful or throw an exception if it fails. `performRequestAsync` is asynchronous and accepts a `ResponseListener` argument that it calls with a `Response` when the request is successful or with an `Exception` if it fails.

This is synchronous:

```java
Request request = new Request(
    "GET",  <1>
    "/");   <2>
Response response = restClient.performRequest(request);
```

1. The HTTP method (`GET`, `POST`, `HEAD`, etc)
2. The endpoint on the server


And this is asynchronous:

```java
Request request = new Request(
    "GET",  <1>
    "/");   <2>
Cancellable cancellable = restClient.performRequestAsync(request,
    new ResponseListener() {
        @Override
        public void onSuccess(Response response) {
            <3>
        }

        @Override
        public void onFailure(Exception exception) {
            <4>
        }
});
```

1. The HTTP method (`GET`, `POST`, `HEAD`, etc)
2. The endpoint on the server
3. Handle the response
4. Handle the failure


You can add request parameters to the request object:

```java
request.addParameter("pretty", "true");
```

You can set the body of the request to any `HttpEntity`:

```java
request.setEntity(new NStringEntity(
        "{\"json\":\"text\"}",
        ContentType.APPLICATION_JSON));
```

::::{important}
The `ContentType` specified for the `HttpEntity` is important because it will be used to set the `Content-Type` header so that Elasticsearch can properly parse the content.
::::


You can also set it to a `String` which will default to a `ContentType` of `application/json`.

```java
request.setJsonEntity("{\"json\":\"text\"}");
```

## RequestOptions [java-rest-low-usage-request-options]

The `RequestOptions` class holds parts of the request that should be shared between many requests in the same application. You can make a singleton instance and share it between all requests:

```java
private static final RequestOptions COMMON_OPTIONS;
static {
    RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
    builder.addHeader("Authorization", "Bearer " + TOKEN); <1>
    builder.setHttpAsyncResponseConsumerFactory(           <2>
        new HttpAsyncResponseConsumerFactory
            .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
    COMMON_OPTIONS = builder.build();
}
```

1. Add any headers needed by all requests.
2. Customize the response consumer.


`addHeader` is for headers that are required for authorization or to work with a proxy in front of Elasticsearch. There is no need to set the `Content-Type` header because the client will automatically set that from the `HttpEntity` attached to the request.

You can set the `NodeSelector` which controls which nodes will receive requests. `NodeSelector.SKIP_DEDICATED_MASTERS` is a good choice.

You can also customize the response consumer used to buffer the asynchronous responses. The default consumer will buffer up to 100MB of response on the JVM heap. If the response is larger then the request will fail. You could, for example, lower the maximum size which might be useful if you are running in a heap constrained environment like the example above.

Once you’ve created the singleton you can use it when making requests:

```java
request.setOptions(COMMON_OPTIONS);
```

You can also customize these options on a per request basis. For example, this adds an extra header:

```java
RequestOptions.Builder options = COMMON_OPTIONS.toBuilder();
options.addHeader("cats", "knock things off of other things");
request.setOptions(options);
```


## Multiple parallel asynchronous actions [_multiple_parallel_asynchronous_actions]

The client is quite happy to execute many actions in parallel. The following example indexes many documents in parallel. In a real world scenario you’d probably want to use the `_bulk` API instead, but the example is illustrative.

```java
final CountDownLatch latch = new CountDownLatch(documents.length);
for (int i = 0; i < documents.length; i++) {
    Request request = new Request("PUT", "/posts/doc/" + i);
    //let's assume that the documents are stored in an HttpEntity array
    request.setEntity(documents[i]);
    restClient.performRequestAsync(
            request,
            new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    <1>
                    latch.countDown();
                }

                @Override
                public void onFailure(Exception exception) {
                    <2>
                    latch.countDown();
                }
            }
    );
}
latch.await();
```

1. Process the returned response
2. Handle the returned exception, due to communication error or a response with status code that indicates an error



## Cancelling asynchronous requests [_cancelling_asynchronous_requests]

The `performRequestAsync` method returns a `Cancellable` that exposes a single public method called `cancel`. Such method can be called to cancel the on-going request. Cancelling a request will result in aborting the http request through the underlying http client. On the server side, this does not automatically translate to the execution of that request being cancelled, which needs to be specifically implemented in the API itself.

The use of the `Cancellable` instance is optional and you can safely ignore this if you don’t need it. A typical usecase for this would be using this together with frameworks like Rx Java or the Kotlin’s `suspendCancellableCoRoutine`. Cancelling no longer needed requests is a good way to avoid putting unnecessary load on Elasticsearch.

```java
Request request = new Request("GET", "/posts/_search");
Cancellable cancellable = restClient.performRequestAsync(
    request,
    new ResponseListener() {
        @Override
        public void onSuccess(Response response) {
          // Process the returned response, in case it was
          // ready before the request got cancelled
        }

        @Override
        public void onFailure(Exception exception) {
          // Handle the returned exception, which will most
          // likely be a `CancellationException` as the request
          // got cancelled
        }
    }
);
cancellable.cancel();
```
