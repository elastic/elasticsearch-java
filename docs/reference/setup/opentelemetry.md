---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/opentelemetry.html
---

# Using OpenTelemetry [opentelemetry]

You can use [OpenTelemetry](https://opentelemetry.io/) to monitor the performance and behavior of your {{es}} requests through the Java API Client. The Java API Client comes with built-in OpenTelemetry instrumentation that emits [distributed tracing spans](docs-content://solutions/observability/apps/traces-2.md) by default. With that, applications [instrumented with OpenTelemetry](https://opentelemetry.io/docs/instrumentation/java/manual/) or running the [OpenTelemetry Java Agent](https://opentelemetry.io/docs/instrumentation/java/automatic/) are inherently enriched with additional spans that contain insightful information about the execution of the {{es}} requests.

The native instrumentation in the Java API Client follows the [OpenTelemetry Semantic Conventions for {{es}}](https://opentelemetry.io/docs/specs/semconv/database/elasticsearch/). In particular, the instrumentation in the client covers the logical layer of {{es}} requests. A single span per request is created that is processed by the service through the Java API Client. The following image shows a trace that records the handling of three different {{es}} requests: an `index`, `get` and a search `request`:

:::{image} images/otel-waterfall-instrumented-without-http.jpg
:alt: Distributed trace with {{es}} spans
:class: screenshot
:::

Usually, OpenTelemetry agents and auto-instrumentation modules come with instrumentation support for HTTP-level communication. In this case, in addition to the logical {{es}} client requests, spans will be captured for the physical HTTP requests emitted by the client. The following image shows a trace with both, {{es}} spans (in blue) and the corresponding HTTP-level spans (in red):

:::{image} images/otel-waterfall-instrumented.jpg
:alt: Distributed trace with {{es}} and HTTP spans
:class: screenshot
:::

Advanced Java API Client behavior such as nodes round-robin and request retries are revealed through the combination of logical {{es}} spans and the physical HTTP spans. The following example shows an `index` request in a scenario with two {{es}} nodes:

:::{image} images/otel-waterfall-retries.jpg
:alt: Distributed trace with request retries
:class: screenshot
:::

The first node is unavailable and results in an HTTP error, while the retry to the second node succeeds. Both HTTP requests are subsumed by the logical {{es}} request span (in blue).


## Setup the OpenTelemetry instrumentation [_setup_the_opentelemetry_instrumentation]

When using the [OpenTelemetry Java SDK manually](https://opentelemetry.io/docs/instrumentation/java/manual) or using the [OpenTelemetry Java Agent](https://opentelemetry.io/docs/instrumentation/java/automatic/), the Java API Client’s OpenTelemetry instrumentation is enabled by default and uses the *globally* registered OpenTelemetry SDK instance (i.e. `GlobalOpenTelemetry`). So, if you don’t use a custom, local OpenTelemetry SDK instance, there is no explicit setup required to use the Java API Client’s OpenTelemetry instrumentation.


### Using a custom OpenTelemetry instance [_using_a_custom_opentelemetry_instance]

In case you are using [manual OpenTelemetry instrumentation](https://opentelemetry.io/docs/instrumentation/java/manual/#example) with a custom OpenTelemetry SDK instance that is *not registered globally*, you can create the Java API Client using a custom OpenTelemetry instance. The following code snippet shows an example of using a custom OpenTelemetry instance.

```java
// URL and API key
String serverUrl = "https://localhost:9200";
String apiKey = "VnVhQ2ZHY0JDZGJrU...";

// Create the low-level client
RestClient restClient = RestClient
    .builder(HttpHost.create(serverUrl))
    .setDefaultHeaders(new Header[]{
            new BasicHeader("Authorization", "ApiKey " + apiKey)
    })
    .build();
// Create and configure custom OpenTelemetry instance
OpenTelemetry customOtel = OpenTelemetrySdk.builder().build();

// Create Instrumentation instance using the custom OpenTelemetry instance
// Second constructor argument allows to enable/disable search body capturing
OpenTelemetryForElasticsearch esOtelInstrumentation =
    new OpenTelemetryForElasticsearch(customOtel, false);

// Create the transport with the custom Instrumentation instance
ElasticsearchTransport transport = new RestClientTransport(
    restClient, new JacksonJsonpMapper(), null, esOtelInstrumentation
);

// And create the API client
ElasticsearchClient esClient = new ElasticsearchClient(transport);

// Use the client...

// Close the client, also closing the underlying transport object and network connections.
esClient.close();
```


## Configuring the OpenTelemetry instrumentation [_configuring_the_opentelemetry_instrumentation]

You can configure the OpenTelemetry instrumentation either through Java System properties or Environment Variables. The following configuration options are available.


### Enable / Disable the OpenTelemetry instrumentation [opentelemetry-config-enable]

With this configuration option you can enable (default) or disable the built-in OpenTelemetry instrumentation.

**Default:** `true`

|     |     |
| --- | --- |
| Java System Property | `otel.instrumentation.elasticsearch.enabled` |
| Environment Variable | `OTEL_INSTRUMENTATION_ELASTICSEARCH_ENABLED` |


### Capture search request bodies [_capture_search_request_bodies]

Per default, the built-in OpenTelemetry instrumentation does not capture request bodies due to data privacy considerations. You can use this option to enable capturing of search queries from the the request bodies of {{es}} search requests in case you wish to gather this information regardless.

**Default:** `false`

|     |     |
| --- | --- |
| Java System Property | `otel.instrumentation.elasticsearch.capture-search-query` |
| Environment Variable | `OTEL_INSTRUMENTATION_ELASTICSEARCH_CAPTURE_SEARCH_QUERY` |


## Overhead [_overhead]

The OpenTelemetry instrumentation (as any other monitoring approach) may come with a little overhead on CPU, memory and/or latency. The overhead may only occur when the instrumentation is enabled (default) and an OpenTelemetry SDK (or an OpenTelemetry Agent) is active in the target application. In case that either the instrumentation is disabled or no OpenTelemetry SDK (or OpenTelemetry Agent) is active with the target application, there is no monitoring overhead expected when using the client.

Even when the instrumentation is enabled and is being actively used (by an OpenTelemetry SDK), in the vast majority of cases the overhead is very small and negligible. In edge cases in which there is a noticable overhead the [instrumentation can be explicitly disabled](#opentelemetry-config-enable) to eliminate any potential overhead effect of the instrumentation.
