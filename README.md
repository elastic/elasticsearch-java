<img alt="Elastic logo" align="right" width="auto" height="auto" src="https://www.elastic.co/static-res/images/elastic-logo-200.png">

# Elasticsearch Java Client

The official Java client for [Elasticsearch](https://github.com/elastic/elasticsearch).

The Java client for Elasticsearch provides strongly typed requests and responses for all Elasticsearch APIs. It delegates protocol handling to an http client such as the [Elasticsearch Low Level REST client](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low.html) that takes care of all transport-level concerns (http connection establishment and pooling, retries, etc).

The `docs/design` folder contains records of the major decisions in the design of the API. Most notably:

- Object construction is based on the [builder pattern](https://www.informit.com/articles/article.aspx?p=1216151).
- Nested objects can be constructed with builder lambdas, allowing for clean and expressive DSL-like code.
- Optional values are represented as `null` with `@Nullable` annotations instead of the newer  `Optional`, the Java ecosystem being still very null-based.

## Installation

**[Download the latest version of Elasticsearch](https://www.elastic.co/downloads/elasticsearch)**
or
**[sign-up](https://cloud.elastic.co/registration?elektra=en-ess-sign-up-page)**
**for a free trial of Elastic Cloud**.

Refer to the [Installation section](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_installation)
of the getting started documentation.

## Connecting

Refer to the [Connecting section](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_connecting)
of the getting started documentation.

## Compatibility

The Elasticsearch client is compatible with currently maintained Java versions.

The Java client is forward compatible; meaning that the client supports
communicating with greater or equal minor versions of Elasticsearch without
breaking. It does not mean that the client automatically supports new features
of newer Elasticsearch versions; it is only possible after a release of a new
client version. For example, a 8.12 client version won't automatically support
the new features of the 8.13 version of Elasticsearch, the 8.13 client version
is required for that. Elasticsearch language clients are only backwards
compatible with default distributions and without guarantees made.

| Elasticsearch Version | Elasticsearch-Java Branch | Supported |
| --------------------- | ------------------------- | --------- |
| main                  | main                      |           |
| 8.x                   | 8.x                       | 8.x       |
| 7.x                   | 7.x                       | 7.17      |

## Usage

- [Creating an index](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_creating_an_index)
- [Indexing a document](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_indexing_documents)
- [Getting documents](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_getting_documents)
- [Searching documents](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_searching_documents)
- [Updating documents](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_updating_documents)
- [Deleting documents](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_deleting_documents)
- [Deleting an index](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/getting-started-java.html#_deleting_an_index)

## Documentation

Please refer to [the full documentation on elastic.co](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/index.html) for comprehensive information.

## Contributing

See [CONTRIBUTING.md](./CONTRIBUTING.md)

## Licence

This software is licensed under the [Apache License 2.0](https://github.com/elastic/elasticsearch-java/blob/main/LICENSE.txt).
