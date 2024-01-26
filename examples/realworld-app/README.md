# ![RealWorld Example App](rw-logo.png)

> ### Spring Boot + Elasticsearch codebase containing real world examples (CRUD, auth, advanced patterns, etc) that adheres to the [RealWorld](https://github.com/gothinkster/realworld) spec and API

### [RealWorld](https://github.com/gothinkster/realworld)

This codebase was created to demonstrate a fully fledged fullstack application built with **Java + Spring Boot +
Elasticsearch** including CRUD operations, authentication, routing, pagination, and more.

We've gone to great lengths to adhere to the **Java + Spring Boot + Elasticsearch** community styleguides & best
practices.

For more information on how to this works with other frontends/backends, head over to
the [RealWorld](https://github.com/gothinkster/realworld) repo.

# How it works

The application was made mainly demonstrate the
new [Elasticsearch Java API Client](https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/index.html).

The application was built with:

- [Java](https://www.java.com/en/) as programming language
- [Spring Boot](https://spring.io/projects/spring-boot) as dependency injection framework
- [Gradle](https://github.com/gradle/gradle) as build tool
- [Elasticsearch](https://github.com/elastic/elasticsearch) as database
- [Jackson](https://github.com/FasterXML/jackson-core) as data bind serialization/deserialization
- [Java JWT](https://github.com/jwtk/jjwt) for JWT implementation
- [Jaxb](https://github.com/jakartaee/jaxb-api) for JWT parsing
- [Slugify](https://github.com/slugify/slugify) for slug

Tests:

- [Junit](https://github.com/junit-team/junit4)
- [Testcontainers](https://github.com/testcontainers) to create an Elasticsearch instance

#### Structure

This is a multimodule gradle project:

- rw-database
    - Elasticsearch client connection, queries, document classes
- rw-rest
    - Spring rest controllers
- rw-server
    - Configuration and entrypoint. Main class: [SpringBootApp.java](rw-server/src/main/java/realworld/SpringBootApp.java)

# Getting started

#### JVM

A version of the JVM has to be installed, openjdk version "21.0.2" was used during development.

#### Elasticsearch

An Elasticsearch instance needs to be running for the application to start successfully.
To start one easily, a [docker-compose](docker-compose.yaml) is provided, it will start Elasticsearch on port 9200 and
Kibana on [5601](http://localhost:5601/app/home#/); otherwise, the connection properties can be changed in [application.properties](rw-server/src/main/resources/application.properties).

### Build:

> ./gradlew clean build

#### Start the server:

> ./gradlew run

#### Run

The application will start on [8080](http://localhost:8080/api) with `api` context, it can be changed
in [application.properties](rw-server/src/main/resources/application.properties).

### Unit tests

A basic [unit test](rw-database/src/test/java/realworld/db/UserServiceTest.java) using testcontainer (docker is
required).
