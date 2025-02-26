---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-dependencies.html
---

# Dependencies [java-rest-low-usage-dependencies]

The low-level Java REST client internally uses the [Apache Http Async Client](https://hc.apache.org/httpcomponents-asyncclient-4.1.x/) to send http requests. It depends on the following artifacts, namely the async http client and its own transitive dependencies:

* org.apache.httpcomponents:httpasyncclient
* org.apache.httpcomponents:httpcore-nio
* org.apache.httpcomponents:httpclient
* org.apache.httpcomponents:httpcore
* commons-codec:commons-codec
* commons-logging:commons-logging

