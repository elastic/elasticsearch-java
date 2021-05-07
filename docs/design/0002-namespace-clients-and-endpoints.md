# Namespace clients and endpoints

* Status: accepted
* Deciders: @swallez
* Date: 2020-10-29

## Context and Problem Statement

An API endpoint is defined by 3 components:
* a request type, holding all the values sent to ES, either as path, query parameters, headers or request body.
* the "recipe" to build the http request from the request type (URL path template, etc),
* a response type, representing the information sent back by ES,
* an error type, representing error responses.

A high level client should expose APIs as a hierarchy of _namespace clients_ that have one method for each endpoint in that namespace (where "endpoint" is the combination of a request type, the encoding of the request)

This allows writing code in a fluent and strongly typed way, leveraging the IDE auto-completion features to guide developers in their use and discovery of the APIs.

The client should also be open for extension, in at least two areas:
- allow custom endpoints to be defined, to support plugins that extend the ES API,
- allow overriding response types, to use the [`filter_path` query parameter](https://www.elastic.co/guide/en/elasticsearch/reference/current/common-options.html#common-options-response-filtering) that allows removing fields from the response. As the filter may remove fields that are expected to exist in the standard response, a new - stripped down - response type must be provided by the user for the same request type and URL. This is real-world use case, as shown by [elasticsearch#53846](https://github.com/elastic/elasticsearch/issues/53846).

## Decision Drivers

* Fluent and type-safe API
* Leverage IDE completion for API and endpoint discovery
* Allow easy expansion to new endpoints and overriding of existing endpoints

## Considered Options

### Request classes define the endpoint

Request classes have a `send` method. This is the approach taken by some low-level clients like the Go (`Do(transport`) and Rust (`send()`, the request holding a reference to the transport) clients.

```java
FooRequest req = FooRequest.builder()
    .name("foo")
    .build();

Foo response = req.send(transport);
```

**Pros**

* All protocol aspects related to an API endpoint are in a single location.

**Cons**

* Doesn't allow overriding the response type.
* The request holding a reference to the transport leads to a coupling that prevents creating constant (`static`) requests.

### Separate endpoint object that glues request, response and URL encoding

In this approach the request object just holds data, and a separate `Endpoint` object provides everything the transport layer needs to create an http request. 

```java
public interface Endpoint<RequestT, ResponseT, ErrorT> {
    String method(RequestT request);
    String requestUrl(RequestT request);
    Map<String, String> queryParameters(RequestT request);
    Map<String, String> headers(RequestT request);
    boolean isError(int statusCode);
    @Nullable ContextParser<FromXContent.Params, ResponseT> responseParser();
    @Nullable ContextParser<FromXContent.Params, ErrorT> errorParser(int statusCode);
}
```

A base implementation allows to quickly create an implementation for ES requests. The endpoint for a request lives as a static constant in the request class.

```java
public static final Endpoint<FooRequest, FooResponse, ElasticsearchError> ENDPOINT =
    new Endpoint.Simple<>(
      r -> "POST",
      r -> "/foo",
      Endpoint.Simple.emptyMap(),
      Endpoint.Simple.emptyMap(),
      FooResponse.PARSER
    );
```

If a user wants to create a stripped-down version of the API with filtered field, they have to provide their own response class with a new endpoint that delegates to the original one.

```java
public static final Endpoint<FooRequest, ReducedFooResponse, ElasticsearchError> FILTERED =
    new Endpoint.Simple<>(
      FooRequest.ENDPOINT::method,
      FooRequest.ENDPOINT::requestUrl,
      FooRequest.ENDPOINT::headers,
      r -> Map.of("filter_path", "-*.big_field"), // should be a static value for realz
      ReducedFooResponse.PARSER
);
```

**Pros**

* Splits the request (which is pure data) and protocol encoding concerns.
* Allows to easily create a new endpoint with partial delegation to the original one.

**Cons**

* Exposes one additional constant object in request classes that is not needed for standard usage of the client.

## Decision Outcome

We will use the endpoint approach, which provides better decoupling between request data and request encoding, and also makes it easier to define custom filtered versions of an endpoint.

Note that for filtering use cases, both approaches require the user to provide a deserializer for their new response class. At the moment it requires to copy/paste the original response parser and delete filtered fields. 
