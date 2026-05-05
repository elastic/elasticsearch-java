# Structure of generated model classes

* Status: accepted
* Deciders: @swallez
* Date: 2020-10-14

## Context and Problem Statement

Elasticsearch request and response objects are data classes: they have no attached behavior.

Java has two ways to represent such classes:
* as JavaBeans: mutable classes with getters and setters,
* as immutable data classes and an associated builder class.

## Decision Drivers <!-- optional -->

* Principle of least surprise compared to common practices.
* Ability to validate data and prevent inconsistent structures to be created.

We'll also look at interoperability with Kotlin and Scala, although this isn't a primary decision driver.

## Considered Options

### JavaBeans

This is the "traditional" way, which is heavily used in frameworks like Spring. JavaBeans are often mutable, except when used by reflection-based framework and libraries that directly modify private fields (like Spring, CDI or Jackson for JSON)

**API**

```java
public String getName();
public void setName(String v);
```

**Pros**

* Well-know pattern since the end of last century.

* Extensive tooling & library support.

**Cons**

* The class is mutable, which is more and more considered a bad practice.

* The class cannot know when all setters have been called, and so cannot enforce any internal consistency check except by exposing a validation method that has to be called explicitly.

* We don't need the extensive support mentioned above, as we will generate our fast serialization/deserialization `XContent` implementations.

**Interop**

* Can be used as Kotlin properties, since Kotlin uses the [JavaBeans convention](https://kotlinlang.org/docs/reference/java-interop.html) for properties in generated code.

* Must be used as Java-like method calls in Scala

### Immutable JavaBeans with a fluent builder

The [builder pattern](https://en.wikipedia.org/wiki/Builder_pattern) comes from the [GoF book](https://en.wikipedia.org/wiki/Design_Patterns) and has been formalized for Java in [Effective Java](https://www.informit.com/articles/article.aspx?p=1216151&seqNum=2).

**API**

```java
public class FooRequest {
    public String getName();
    public String getRouting();    
    
    public Builder builder(String name); // Required fields
    public Builder builder();
    public static class Builder {
        public Builder name(String name);
        public Builder routing(String name);
        public FooRequest build();
    }
}

FooRequest r = FooRequest.builder("foo")
    .routing("foo")
    .build();

String name = r.getName();
```

The first `build` method has parameters for required fields, making them required also at compile time. This approach works well when there's a limited number of parameters but can become inconvenient for long lists because of lack of named parameters in Java. This is why there's also the parameter-less variant, allowing the use of named setters. Required parameters will be checked in `build()` to ensure consistency of built objects.

The builder pattern is compatible with `XContent` serialization utilities: deserializing an object consists in deserializing its builder and then calling `build()`. This has the benefit of allowing additional consistency checks to happen if needed. Having a parameter-less variant of `build()` even in the presence of required fields also allows using XContent's `ObjectParser` instead of the less efficient `ConstructingObjectParser`.


**Pros**

* Allows immutable data structures.
* Fluent builder that alleviates the lack of named parameters in Java.
* Validation can happen in `build()`, ensuring no inconsistent object can be created while still allowing partially initialized builders to exist.

**Cons**

* Increases the generated code size. Would be cumbersome to write if it wasn't generated.
* The builder can be used to build several objects, so it has to retain the values that have been used previously. This may lead to structural sharing between the objects it creates. This is ok if the shared data is also immutable, so will require defensive copies of arrays and collections.

**Interop**

* Kotlin doesn't support set-only properties, so method call syntax will have to be used.
* Scala setters are generated as `<property>_$eq`, so method call syntax will have to be used.

Note that the builder pattern is mostly absent in the Kotlin and Scala ecosystems. This is because their methods support named parameters and parameters with default values, which provide all that is needed for a convenient builder even with a large number of parameters. Using the builder from these language works flawlessly, but a more native client could be essentially just about generating constructor functions with default values representing `None` for optional fields.


### Immutable data classes with a fluent builder

In the builder pattern the setters don't have the `set` prefix. We can do the same for getters. This is actually the syntax that will be used in the upcoming [Java record classes](https://www.baeldung.com/java-record-keyword).

**API**

```java
public class FooRequest {
    public String name();
    public String routing();    
    
    public Builder builder();
    public static class Builder {
        public Builder name(String name);
        public Builder routing(String name);
        public FooRequest build();
    }
}

FooRequest r = FooRequest.builder()
    .name("foo")
    .build();

String name = r.name();
```

**Pros**

* Modern syntax, future-proof with the upcoming records (and we may transition to records once they're stable).

**Cons**

* May not be compatible with some JavaBean-oriented tool? Not sure about an actual use case though.

**Interop**

* Differs from Kotlin's use of JavaBean conventions for properties. Method call syntax will have to be used.
* Compatible with and Scala's property getters, allowing paren-less access (i.e. `val name = r.name`).

### Immutable class with public fields + builder

Request classes are immutable data classes, so we don't expect getters to ever been overridden in a subclass and we can just expose properties as public final fields.

**API**

```java
public class FooRequest {
    public final String;
    public final String;    
    
    public Builder builder();
    public static class Builder {
        public Builder name(String name);
        public Builder routing(String name);
        public FooRequest build();
    }
}

FooRequest r = FooRequest.builder()
    .name("foo")
    .build();

String name = r.name;
```

**Pros**

* Bare minimum code to generate

**Cons**

* Rather unusual even if perfectly correct
* Many developers freak out when they see public class fields ;-)

**Interop**

Supported by both Kotlin and Scala.

## Decision Outcome

We will use a fluent builder with record-like getters (no `get` prefix), which is the most fluent syntax.

Although they separate setter methods from target objects, builders are also fully compatible with efficient deserialization.

This provides property-like access in Scala. Kotlin will require method calls but with limited visual clutter (no `get` prefix).

**Building nested objects**

There are many nested objects in the Elasticsearch API, which will also use the fluent builder pattern. Let's extend `FooRequest` with an innder `Bar` object:

```java
FooResponse r = client.foo(
  FooRequest.builder()
    .name("z")
    .bar(Bar.builder()
      .name("Raise the bar")
      .build()
    )
  .build()
);
```

Using nested builders adds some noise to the code and also requires adding import statements for nested objects (IDEs can help, but this breaks the coding flow).

Setters for nested objects will also be provided in an alternative form, talking as parameter a lambda expression that takes a newly-created builder for the nested class and returning that builder (or a different one of the same type):

```java
FooResponse r = client.foo(foo -> foo
  .name("z")
  .bar(bar -> bar
    .name("Raise the bar")
  )
);
```

Adding this alternative form on the client itself allows for very fluid code writing, requiring no additional imports, and leveraging IDE completion to the maximum extent possible.

For polymorphic nested objects the passed builder will be an "implementation dispatcher" providing access to builders for all concrete implementations. This approach provides a concise and readable DSL for complex structures:

```java
FooResponse r = client.foo(foo -> foo
  .name("z")
  .query(q -> q       // abstract query builder
    .terms(tq -> tq   // choose the terms query implementation
      .field("bar")   // build the terms query
      .values("baz")
    )
  )
);
```
