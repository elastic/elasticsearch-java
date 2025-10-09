# JSON framework

## Context and Problem Statement

JSON serialization and deserialization are key elements of the Java client's performance (memory and CPU).

The classic approach in Java used by many libraries is to use reflection to instantiate and populate objects. The major problem of this approach is that reflection is slow. JSON frameworks also need to build complex representations of class structure that can add up in large API surfaces like Elasticsearch's.

We can leverage the fact that the ES Java client is heavily based on code generation to produce code that avoids reflection all together and uses simpler data structures.

[Jackson's Afterburner](https://github.com/FasterXML/jackson-modules-base/tree/2.x/afterburner) uses a somehow similar approach, using dynamic bytecode generation at runtime. In our context we know the data structures ahead of time, so we can generate code ahead of time and skip the overhead of runtime bytecode generation.

## Decision Drivers

* Limit memory usage
* Avoid costly features like reflection

## Considered Options

### Serialization

Only one option was considered: every object class implements `JsonpSerializable` that has a single `serialize()` method that writes the object to a streaming JSON generator. The code of this method is generated for every class, delegating to common utility classes where needed.

On top of that, the `JsonpSerializer` interface allows serializing any value, including primitive types and user-provided objects. A `JsonpMapper` can lookup a serializer for any value type.

The rest of this document will address deserialization.

### Deserialization

Deserialization is more involved than serialization, as we must deal with complex JSON that sometimes allows representing a single structure using different forms (e.g. single-element arrays as a single value, property shortcuts, strings for any scalar type, etc.)

We considered two levels of code generation:

* generate a custom deserializer function per type that reads and parses the JSON stream
* generate the construction of an object that handles the deserialization and calls setter methods on the object builder, similar to Elasticsearch's `ObjectParser`

## Decision Outcome

Generating a custom function per type would be the most performant, since a deserializer object that calls setter methods (as lambda expressions) adds some overhead compared to direct calls.

However, a code generator is a program that produces a program. Kind of "meta programming". Given the complexity of deserialization and the unknown unknowns at the beginning of this project, we decided to us the second approach (a deserializer object that calls setters) even if it's less performant, in order to speed up development. It's still a lot more performant than using reflection!

## Detailed design

### Building blocks

`JsonpDeserializer` is the common interface for all deserializers it provides two groups of methods:
* methods to know or test if that deserializer accepts a given JSON event. This is useful to disambiguate some variations and of course check that the JSON stream is what is expected.
* methods to deserialize a value, either at the current position in the stream, or from an event that was previously read.

This interface also provides static deserializers for all scalar types (string, integer, etc.)

The `ObjectDeserializer` is used to deserialize regular structures:
- it has a map of serializers for every field, with their aliases,
- supports shortcut properties,
- handles `AdditionalProperty` and `AdditionalProperties`,
- handles `SingleKeyDictionary` types that are flattened when represented as Java code.

### Building an object deserializer

We'll use `TermQuery` as an illustration as it uses most of `ObjectDeserializer` features.

The generator produces a `setup<TypeName>Deserializer` method that does the configuration. This separate method is needed when a class has subclasses, as it will also be called to set up deserializers of child classes, as illustrated below by calling the `QueryBase` set up method (and is also why it's `protected`).

```java
protected static void setupTermQueryDeserializer(ObjectDeserializer<TermQuery.Builder> op) {
    QueryBase.setupQueryBaseDeserializer(op);
    op.add(Builder::value, FieldValue._DESERIALIZER, "value");
    op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");

    op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
    op.shortcutProperty("value", true);
}
```

The `setKey` call is the implementation of `SingleKeyDictionary`: it will "lift" the enclosing property name as a value of one the object's field. Like if `{"some-field":{"value":1.0}}` was actually `{"field":"some-field","value":1.0}`.

The `shortcutProperty` call configures the "value" property as being the shortcut, i.e. `{"some-field":1.0}` is interpreted as `{"some-field":{"value":1.0}}`.

And then we can create the actual deserializer:

```java
public static final JsonpDeserializer<TermQuery> _DESERIALIZER =
    ObjectBuilderDeserializer.lazy(
        Builder::new,
        TermQuery::setupTermQueryDeserializer
    );
```

`ObjectBuilderDeserializer` wraps an `ObjectDeserializer` with the mechanics needed to create a builder, deserialize it, and create the actual object afterward. It is built with the builder's constructor and the setup method.

### Lazy deserializers

The `lazy` method builds an implementation of `Deserializer` that will effectively lazily build the `ObjectBuilderDeserializer` the first time it's called. There are two main reasons for this approach.

#### Circular dependencies and static initializers

The JVM will run static field initializers as part of the class initialization that happens when a class is first referenced in an application. The static initializers of the parent class and of the classes referenced by the current class's static initializers are called before initializing the class itself.

While this works for the majority of cases, this can cause issues in the case of recursive dependencies between the static initializers of different classes. This results in fancy things line NPEs or stack overflows at class loading time!

And there are a number of circular dependencies in the Java client, mainly in queries and aggregations. Limiting class initialization to just creating a lazy wrapper avoids any problem at class loading time.

#### Request-only classes don't need deserializers?

API classes in the Java client can be used in requests, in responses, or both. Classes in the first category (requests only) don't need a deserializer. So incurring the cost of creating a deserializer when the class is loaded would just be wasteful.

We could have decided to _not_ add deserializers to request-only classes, but that would have prevented the implementation of `withJson()`. This method allows users to create request objects from a JSON string. Under the hood it calls the object's deserializer.

In this scenario, having a lazily initialized deserializer enables some interesting features while paying the price for its creation only if it's actually used.

### Container deserializers

Variant containers (i.e. externally tagged types like `Query`) use `ObjectDeserializer` explained above. The container class (that implements `TaggedUnion`) has a "pseudo-property" for each of the variants and regular properties for container-level fields.

### Internally tagged variants deserialization

Internally tagged variants (with a `"type"` property) and require peeking inside the JSON object to find out what their actual variant is. This is the role of `JsonpUtils.lookAheadFieldValue()`: it will read JSON events until finding the property that defines the variant, and return that property's value and a JSON parser that will traverse the buffered data.

### Untagged union deserialization

Untagged unions (without a discriminant) deserialization is handled by `UnionDeserializer`. It is configured by adding each of the union members with their deserializers. Union members can be of two kinds:

- objects: their fields will be used to build "member handlers" associated to field names that uniquely identify the member. If member `X` has fields `a` and `b`, and member `Y` has fields `b` and `c`, then finding an `a` property identifies member `X` while `b` doesn't allow disambiguating variants.  

- non-objects, like array or string: the JSON event type will be used to identify the variant.

Like seen previously with internally tagged variants, `UnionDeserializer` will look a head and buffer JSON events until finding the information needed to identify the variant. The events that were buffered are then replayed to deserialize the selected variant.
