# Representing optional values in model classes

* Status: [accepted]
* Deciders: @swallez
* Date: 2020-10-13

## Context and Problem Statement

There are a lot of optional values in APIs both in query parameters (all optional) and request bodies. They are less frequent in response bodies.

There are two concerns when considering the representation of optional values in Java:
- optional object values (e.g. strings or other data structures)
- optional primitive values (e.g. integers)

Java 8 introduced `Optional` and specialized classes for a limited number of primitive types, namely `OptionalInt`, `OptionalLong` and `OptionalDouble` (but nothing for `byte`, `short` and `float`).

Should we use these or use `null` for missing optional data? Can we also mitigate the memory cost of boxing with these null-safe wrappers?

## Decision Drivers <!-- optional -->

* Principle of less surprise
* Consistency between object and primitive fields
* Performance (memory/GC strain) for structures with a large number of optional fields

We'll also look at interoperability with Kotlin and Scala, although this isn't a primary decision driver.

## Considered Options

In the examples below we'll use 4 fields, grabbed from different endpoints for illustrative purposes:
* `name`: a required String,
* `routing`: an optional String,
* `value`: required integer
* `size`: optional integer

### Use `Optional` and friends

**API**

```java
// Required String
public String name();
public void name(String v);

// Optional String
public Optional<String> routing();
public void routing(Optional<String> v);
public void routing(@Nullable String v);

// Required int
public int value();
public void value(int v);

// Optional int
public OptionalInt size();
public void size(OptionalInt v);
public void size(@Nullable Integer v);
```

All `Optional` parameters are required to be non null. The setter variants accepting unwrapped nullable values are provided as a convenience to allow writing e.g. `request.routing("foo")`.

**Pros**

This is a "modern Java" approach that avoids the use of `null`, aligned with the evolution of Java towards functional programming with lambdas and streams.

**Cons**

* Brian Goetz (Java platform architect) [strongly advised](https://stackoverflow.com/a/26328555/12495925) to not use `Option` as a general-purpose `Maybe` type, and in particular _"You should almost never use it as a field of something or a method parameter. Routinely using it as a return value for getters would definitely be over-use"_. IntelliJ even has [inspections](https://www.jetbrains.com/help/idea/list-of-java-inspections.html#abstraction-issues) that warn about `Optional` fields and parameters.

    One of the underlying reasons is that `null` is so prevalent that developers may pass a `null` value for an `Option` parameter, which then would have to be null-checked anyway ([more in-depth discussion](https://www.baeldung.com/java-optional#misuages)).
      
    We can however use `Optional` sanely: fields can be stored as nullable references, and translated to `Optional` when the getter is called. This also avoids excessive allocation of wrapping objects that may be long lived, and instead uses short-lived objects whose allocation may even be eliminated by inlining or escape analysis.
    
    ```java
    // Optional property
    @Nullable private String routing
  
    public Optional<String> routing() {
      return Optional.of(this.routing);
    }
  
    public void routing(Optional<String> v) {
      this.routing = v.orElse(null);
    }  
    ```

* The primitive optionals (`OptionalInt`, etc) are second-class citizens compared to `Optional` and lack all functional primitives (`map`, `filter` et al). Brian Goetz said they will be [deprecated with project Valhalla](https://twitter.com/BrianGoetz/status/1317918097387507713) (value classes).

**Language interoperability:**

* Kotlin has [first-class null-safe support](https://kotlinlang.org/docs/reference/null-safety.html), so `Optional` wrappers will actually get in the way.

* Scala (2.13+) has [`OptionConverters`](https://www.scala-lang.org/api/current/scala/jdk/OptionConverters$.html) to map `Optional` to/from `Option`. Converting a nullable value into an option is trivial though: `val maybeValue = Option(value)`.



### Nullable values and `@Nullable` & `@NotNull` annotations

Use the old-fashioned `null` to represent missing values. It's the traditional Java way, and `Optional` aficionados can still use `Optional.ofNullable(someNullableThing())` to lift nullable values into the null-safe world.

To make the contract explicit to developers and IDEs, getters and parameters are annotated with `@Nullable` and `@NotNull` annotations.

**API**

```java
// Required String
@NotNull public String name();
public void name(@NotNull String v);

// Optional String
@Nullable public String routing();
public void routing(@Nullable String v);

// Required int
public int value();
public void value(int v);

// Optional int
@Nullable public Integer size();
public void size(@Nullable Integer v);
```

**Pros**

This is (like it or not) how it's been done in Java since the early days. Java8 introduced `Optional` but it's seldom used except in stream/functional-style context. For that purpose we can easily lift a nullable value to an optional using `Optional.ofNullable(v)`.

**Cons**

`NullPointerException` are possible. The use of `@Nullable` annotations will however help IDEs and static code analyzers to spot potential issues.

**Language interoperability**

* Kotlin: in line with the language's first-class null safe features

* Scala: nullable references can easily be lifted using `Option(v)` 

## Decision Outcome

Proper ergonomic optional support isn't there (yet?) in Java. So **we will use nullable references for optional fields.**

The Client code will however be **fully annotated with `Nullable` and `NotNullable` annotations** to make the contract explicit and leverage IDEs and static analysis tools capabilities.

Lifting nullable references to `Optional` (or `Option` in Scala) is easy, so writing null-safe code will be easy. 
