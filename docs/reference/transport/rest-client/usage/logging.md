---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-logging.html
---

# Logging [java-rest-low-usage-logging]

The Java REST client uses the same logging library that the Apache Async Http Client uses: [Apache Commons Logging](https://commons.apache.org/proper/commons-logging/), which comes with support for a number of popular logging implementations. The java packages to enable logging for are `org.elasticsearch.client` for the client itself and `org.elasticsearch.client.sniffer` for the sniffer.

The request tracer logging can also be enabled to log every request and corresponding response in curl format. That comes handy when debugging, for instance in case a request needs to be manually executed to check whether it still yields the same response as it did. Enable trace logging for the `tracer` package to have such log lines printed out. Do note that this type of logging is expensive and should not be enabled at all times in production environments, but rather temporarily used only when needed.

## Logback [_logback]

### Trace Logs [_trace_logs]

In order to enable trace logs for logback, we have to use [jcl-over-slf4j bridging module](https://www.slf4j.org/legacy.html#jclOverSLF4J).

1. Add the following to your Gradle setting:

    ```groovy
    dependencies {
        implementation('org.slf4j:slf4j-api:1.8.0-beta2')
        implementation('ch.qos.logback:logback-classic:1.3.0-alpha4')
        implementation('org.slf4j:jcl-over-slf4j:1.8.0-beta2')
    }
    ```

2. Exclude `commons-logging.jar`:

    ```groovy
    dependencies {
        configurations.all {
            exclude group: "commons-logging", module: "commons-logging"
        }
    }
    ```

3. Add a tracer logger in Logback configuration:

    ```xml
    <logger name="tracer" level="TRACE" additivity="false">
        <appender-ref ref="your_appender_block_name" />
    </logger>
    ```



### RestClient Debug Logs [_restclient_debug_logs]

To enable debug logs for `RestClient` class, add the following to your Logback configuration:

```xml
<logger name="org.elasticsearch.client.RestClient" level="DEBUG" additivity="false">
    <appender-ref ref="your_appender_block_name" />
</logger>
```



