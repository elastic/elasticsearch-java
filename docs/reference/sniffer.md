---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/sniffer.html
---

# Sniffer [sniffer]

Minimal library that allows to automatically discover nodes from a running Elasticsearch cluster and set them to an existing `RestClient` instance. It retrieves by default the nodes that belong to the cluster using the Nodes Info api and uses jackson to parse the obtained json response.

Compatible with Elasticsearch 2.x and onwards.




