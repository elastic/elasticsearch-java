# Java API client for the Elasticsearch Serverless Service.

A flavor of the Java API client for the upcoming [Elasticsearch Serverless Service](https://www.elastic.co/search-labs/stateless-your-new-state-of-find-with-elasticsearch).


The major difference is that Elasticsearch Serverless will abstract all infrastructure concerns from users, and as such has a reduced API surface. This new flavor of the Elasticsearch Java API client uses the same base framework and same package names as the "regular" client, but with a reduced number of APIs.

It is meant for users who want to ensure their code will work on the current Elasticsearch and the upcoming Serverless flavor.

## Usage

In the initial preview phase, this new flavor of the Java API client is published on the [GitHub project's Maven repository](https://github.com/elastic/elasticsearch-java/packages/1934787).

To install it, you need to add this repository to your project. This requires to authenticate to GitHub with an application token. Example with Gradle:

```
repositories {
    maven {
        name = "GitHubElasticsearchJava"
        url = uri("https://maven.pkg.github.com/elastic/elasticsearch-java")
        // See https://docs.gradle.org/current/samples/sample_publishing_credentials.html
        credentials(PasswordCredentials::class)
    }
}

dependencies {
    implementation("co.elastic.clients", "elasticsearch-java-serverless", "1.0.0-20231031-SNAPSHOT")
}
```

## Implementation details

This project is parallel to [java-client](../java-client). The Java packages that are common to both projects are shared using symbolic links from this project to [java-client](../java-client). This ensures minimal disruption in the code layout and build system while avoiding code duplication.

In the future, the Java API client will be split into different modules, and there will be parent modules for the two flavors with dependencies on child modules.




