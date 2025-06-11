# Contributing

The Elasticsearch Java client is open source and we love to receive contributions from our community.

There are many ways to contribute, from writing tutorials or blog posts, improving the documentation, submitting bug reports and feature requests or writing code.

## Sign the Contributor License Agreement

We do ask that you sign the [Contiributor License Agreement](https://www.elastic.co/contributor-agreement)
before we can accept pull requests from you.

## Development

### Prerequisites

You need at least Java 17 to build the project. The project is built with `Gradle`. You don't have to install it, and can use the provided `gradlew` that will install the required version if needed.

Docker is used for some tests to spawn an Elasticsearch server.

### Project structure

This is a multi-project build. The Java client is in the [`java-client`](./java-client) subproject. Additional subprojects will come with more extensive API tests and examples.

The `co.elastic.clients.elasticsearch` package and its children are all entirely generated, and the generator is not part of this repository. Because of this, PRs will not work for this part of the code. If you want to suggest changes to the generated code, open an issue describing how the code should look like, so that we can discuss on updating the generator.

Other packages contain support classes and frameworks that provide the plumbing between the generated code and the http client and JSON object mapping libraries. PRs are more than welcome on code in these packages.

### Before you open a PR

To save everybody's time, please make sure that `./gradlew check` is successful before opening a PR with your changes. This will check the code style and run the tests.
