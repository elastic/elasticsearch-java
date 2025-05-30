---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/method-naming.html
---

# Method naming conventions [method-naming]

Classes in the Java API Client contain two kinds of methods and properties:

* Methods and properties that are part of the API, such as `ElasticsearchClient.search()` or `SearchResponse.maxScore()`. They are derived from their respective names in the {{es}} JSON API using the standard Java `camelCaseNaming` convention.
* Methods and properties that are part of the framework on which the Java API Client is built, such as `Query._kind()`. These methods and properties are prefixed with an underscore to both avoid any naming conflicts with API names, and as an easy way to distinguish the API from the framework.

