# AGENTS.md

This file provides guidance to AI coding agents working with code in this repository.
`CLAUDE.md` points to this file — they are the same guidance, do not update both.

Official Elasticsearch Java client. Maven coordinates: `co.elastic.clients:elasticsearch-java`.
It provides strongly typed requests and responses for all Elasticsearch APIs and delegates
transport-level concerns (connection pooling, retries, node discovery) to a low-level HTTP client.

See [`README.md`](./README.md) and the [full documentation on elastic.co](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/index.html)
for user-facing information.

## Generated vs. hand-written code

This is the single most important thing to understand before editing anything.

- **The `co.elastic.clients.elasticsearch` package and all its children are entirely generated**
  from the [Elasticsearch specification](https://github.com/elastic/elasticsearch-specification) 
  (except `elasticsearch/_helpers/`) by the Java generator, which lives in a separate, private repository.
  **Do NOT hand-edit these files** - changes are overwritten on the next generation.
  To change generated code, open an issue describing the desired output so the generator can be
  updated (see [`CONTRIBUTING.md`](./CONTRIBUTING.md)).
- **Everything else is hand-written** support/framework code and is where PRs are welcome:
  `co.elastic.clients.json` (JSON mapping), `co.elastic.clients.transport` (transport + endpoints),
  `co.elastic.clients.util`.

## Backwards Compatibility

This is a public library with external consumers. Additive changes (new endpoints, new fields,
new overloads) are fine. Note that because generated code tracks the API specification, some
breaking changes are considered acceptable even in patch releases — the exact policy is documented
in [docs/reference/breaking-changes-policy.md](./docs/reference/breaking-changes-policy.md).
For the client/server version support matrix, see [`README.md`](./README.md).

## Commands

The project uses Gradle. Use the bundled wrapper (`./gradlew`); do not install Gradle separately.
It is a multi-project build — subprojects are `java-client`, `rest5-client`, and `tools`.

```bash
./gradlew check                              # checkstyle + all tests (run before opening a PR)
./gradlew :java-client:test                  # tests for the main client only
./gradlew :java-client:test --tests "co.elastic.clients.SomeTest"   # a single test class
./gradlew :java-client:checkstyleMain        # style checks only
./gradlew :java-client:forbiddenApisMain     # forbidden-apis checks only
./gradlew build                              # full build
```

- Requires **Java 17+**.
- **Docker** must be running for tests that spin up an Elasticsearch server via Testcontainers.

## Key Rules

- **Never hand-edit generated code** (see [Generated vs. hand-written code](#generated-vs-hand-written-code)).
- Every source file must start with the Apache 2.0 license header (see any existing `.java` file, e.g. [`ApiClient.java`](./java-client/src/main/java/co/elastic/clients/ApiClient.java)). Checkstyle enforces this.
- Style is enforced by **Checkstyle** (`config/checkstyle`) and **forbidden-apis** (`config/forbidden-apis.txt`). If you must call a forbidden API, annotate with `@AllowForbiddenApis` and justify it.
- Optional values use `@Nullable` (not `Optional`) — this is a deliberate design decision.
- Before finishing, always run `./gradlew check`.

## Regeneration

Client regeneration and spec compilation are driven by the `Makefile` (a symlink into the
Java generator repo, e.g. `make generate-client`, `make check`). This depends on sibling checkouts
of the Java generator and `elasticsearch-specification` and is not something to run as part of a
normal framework change. See [`CONTRIBUTING.md`](./CONTRIBUTING.md) and the Java generator for the
authoritative workflow.

## Commits and Pull Requests

- Make sure `./gradlew check` passes before opening a PR (see [`CONTRIBUTING.md`](./CONTRIBUTING.md)).
- Contributors must sign the [Contributor License Agreement](https://www.elastic.co/contributor-agreement).
- Keep each PR focused on a single logical change. PRs against generated code will not be
  accepted — open an issue instead (see above).
- Documentation code samples are real tests: the snippets in `docs/` come from
  `java-client/src/test/java/co/elastic/clients/documentation`. Update the corresponding test when
  changing a documented example.

## Architecture

Design decisions are recorded as ADRs in [`docs/design/`](./docs/design), and API conventions are
documented under [`docs/reference/api-conventions/`](./docs/reference/api-conventions). The notes
below are an orientation, not a replacement for those.

### Clients

- **`ElasticsearchClient`** — blocking (synchronous) API.
- **`ElasticsearchAsyncClient`** — asynchronous API returning `CompletableFuture`.

Both are organized into **namespace clients**: feature groups (e.g. `indices`, `ml`, `security`)
are subpackages of `co.elastic.clients.elasticsearch`, each accessible from the top-level client
(e.g. `client.indices().create(...)`). Search and document APIs live in the `core` subpackage and
are exposed directly on the main client. See
[api-conventions/package-structure.md](./docs/reference/api-conventions/package-structure.md).

### Request/response model

- Request and response objects are **immutable data classes built with fluent builders**, and
  nested objects can be built with builder lambdas for DSL-like code
  (ADR [0001](./docs/design/0001-model-classes-structure.md)).
- Each endpoint is described by a separate **`Endpoint`** object (method, URL, query params,
  response/error parsers) rather than by the request itself, which decouples request data from
  protocol encoding (ADR [0002](./docs/design/0002-namespace-clients-and-endpoints.md)).

### Package layout (`java-client/src/main/java/co/elastic/clients`)

| Path | Description |
| ---------------- | ------------------------------------------------------------------- |
| `elasticsearch/` | **Generated** API: namespace clients, request/response/type classes |
| `elasticsearch/_helpers/` | Hand-maintained helpers (BulkIngester, ES\|QL, vector) |
| `transport/` | Transport abstraction, `Endpoint`, transport options, instrumentation, HTTP client bindings |
| `json/` | JSONP-based (de)serialization framework (`JsonpMapper`, Jackson & JSON-B backends) |
| `util/` | Shared utilities |
| `ApiClient.java` | Base class shared by all namespace clients |

The JSON framework choice (JSONP / `jakarta.json` with Jackson and JSON-B backends) is covered in
ADR [0003](./docs/design/0003-json-framework.md).

### Other subprojects

- **`rest5-client/`** — Apache HttpClient 5 port of the low-level REST client, published as a
  standalone library (see [`rest5-client/README.md`](./rest5-client/README.md)).
- **`tools/`** — build-time tooling (e.g. documentation include expansion).
- **`example-transports/`** — experimental, non-production `TransportHttpClient` implementations
  used as examples.
- **`examples/`** — standalone example applications.
