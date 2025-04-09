
# Reading responses

The `Response` object, either returned by the synchronous `performRequest` methods or received as an argument in `ResponseListener#onSuccess(Response)`, wraps the response object returned by the http client and exposes some additional information.

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-response2
```java
Response response = restClient.performRequest(new Request("GET", "/"));

RequestLine requestLine = response.getRequestLine(); // <1>
HttpHost host = response.getHost(); // <2>
int statusCode = response.getStatusCode(); // <3>
Header[] headers = response.getHeaders(); // <4>
String responseBody = EntityUtils.toString(response.getEntity()); // <5>
```

1. Information about the performed request
2. The host that returned the response
3. The response status line, from which you can for instance retrieve the status code
4. The response headers, which can also be retrieved by name though `getHeader(String)`
5. The response body enclosed in an [`org.apache.http.HttpEntity`](https://hc.apache.org/httpcomponents-core-4.4.x/current/httpcore/apidocs/org/apache/http/HttpEntity.html) object


When performing a request, an exception is thrown (or received as an argument in `ResponseListener#onFailure(Exception)` in the following scenarios:

`IOException`
:   communication problem (e.g. SocketTimeoutException)

`ResponseException`
:   a response was returned, but its status code indicated an error (not `2xx`). A `ResponseException` originates from a valid http response, hence it exposes its corresponding `Response` object which gives access to the returned response.

::::{note}
A `ResponseException` is **not** thrown for `HEAD` requests that return a `404` status code because it is an expected `HEAD` response that simply denotes that the resource is not found. All other HTTP methods (e.g., `GET`) throw a `ResponseException` for `404` responses unless the `ignore` parameter contains `404`. `ignore` is a special client parameter that doesn’t get sent to Elasticsearch and contains a comma separated list of error status codes. It allows to control whether some error status code should be treated as an expected response rather than as an exception. This is useful for instance with the get api as it can return `404` when the document is missing, in which case the response body will not contain an error but rather the usual get api response, just without the document as it was not found.
::::


Note that the low-level client doesn’t expose any helper for json marshalling and un-marshalling. Users are free to use the library that they prefer for that purpose.

The underlying Apache Async Http Client ships with different `HttpEntity` implementations that allow to provide the request body in different formats (stream, byte array, string etc.). As for reading the response body, the `HttpEntity#getContent` method comes handy which returns an `InputStream` reading from the previously buffered response body. As an alternative, it is possible to provide a custom `HttpAsyncResponseConsumer` that controls how bytes are read and buffered.

<!--
TODO update HttpAsyncResponseConsumer above
-->
