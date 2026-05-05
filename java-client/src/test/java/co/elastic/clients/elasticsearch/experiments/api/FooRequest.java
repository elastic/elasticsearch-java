/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.experiments.api;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.experiments.api.query2.Query;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.Objects.requireNonNull;

// Implementing ToXContent is optional, only if there's a request body
public class FooRequest implements JsonpSerializable {

  //===========================================
  // Fields and getters
  //===========================================

  //-------------------------------------------
  // A required String

  private final String name;

  @Nonnull
  public final String name() {
    return this.name;
  }

  //-------------------------------------------
  // An optional String

  private final String routing;

  @Nullable
  public final String routing() {
    return this.routing;
  }

  //-------------------------------------------
  // A required primitive type

  private final int value;

  public int value() {
    return this.value;
  }

  //-------------------------------------------
  // An optional primitive type, represented as a nullable boxed value

  private final Integer size;

  /**
   * Description for field {@code size}
   */
  @Nullable
  public final Integer size() {
    return this.size;
  }

  //-------------------------------------------
  // An optional array

  private final List<String> indices;

  /**
   * A string[] property
   */
  @Nullable
  public final List<String> indices() {
    return this.indices;
  }

  //-------------------------------------------
  // An optional sub-object

  private final Bar bar;

  @Nullable
  public Bar bar() {
    return this.bar;
  }

  //-------------------------------------------
  // An optional query

  private final Query query;

  @Nullable
  public Query query() {
    return this.query;
  }

  //-------------------------------------------

  public FooRequest(Builder builder) {
    this.name = builder.name;
    this.routing = builder.routing;
    this.value = builder.value;
    this.size = builder.size;
    this.indices = builder.indices;
    this.bar = builder.bar;
    this.query = builder.query;
  }


  //===========================================
  // Builder
  //===========================================

  public static class Builder implements ObjectBuilder<FooRequest> {
    protected String name;
    protected String routing;
    protected int value;
    protected boolean value$isSet = false;
    protected Integer size;
    protected List<String> indices;
    protected Bar bar;
    protected Query query;

    public final Builder name(@Nonnull String v) {
      this.name = requireNonNull(v);
      return this;
    }

    public final Builder routing(String v) {
      this.routing = v;
      return this;
    }

    public final Builder value(int v) {
      this.value = v;
      this.value$isSet = true;
      return this;
    }

    public final Builder size(@Nullable Integer v) {
      this.size = v;
      return this;
    }

    public final Builder indices(@Nullable List<String> v) {
      indices = v;
      return this;
    }

    // Convenience variant with varargs
    public final Builder indices(String... v) {
      indices = Arrays.asList(v);
      return this;
    }

    public Builder bar(@Nullable Bar v) {
      bar = v;
      return this;
    }

    public Builder bar(Function<Bar.Builder, ObjectBuilder<Bar>> b) {
      return bar(b.apply(new Bar.Builder()).build());
    }

    public Builder query(Query v) {
      this.query = v;
      return this;
    }

    public Builder query(Function<Query.Builder, ObjectBuilder<Query>> b) {
      return query(b.apply(new Query.Builder()).build());
    }

    public FooRequest build() {
      requireNonNull(this.name, "'name' was not set");
      requireTrue(this.value$isSet, "'value' was not set");
      return new FooRequest(this);
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  // Constructor with required fields
  public static Builder builder(String name, int size) {
    Builder result = new Builder();
    result.name(name);
    result.size(size);
    return result;
  }

  //===========================================
  // Serialization
  //===========================================

  @Override
  public void serialize(JsonGenerator builder, JsonpMapper mapper) {
    builder.writeStartObject();

    // Classic approach is to use the deserialization field's preferred name:
    //
    //   if (buckets.isPresent()) builder.field(INT_FIELD.getPreferredName(), buckets.getAsInt());
    //
    // In a generated code context we can use the string constant, which also avoids declaring ParseField if we
    // only serialize (e.g. requests)

    // required field
    builder.write("name", this.name);

    // optional field
    if (this.routing != null) builder.write("routing", this.routing);

    // required field
    builder.write("value", value);

    // optional field
    if (this.size != null) builder.write("size", this.size.intValue());

    // We could just call this and let the builder will handle it by itself with:
    //
    //   if (this.indices != null) builder.field("indices", this.indices);
    //
    // But the logic is a bit involved (like checking circular dependencies) so we use a more direct implementation:
    if (this.indices != null) {
      builder.writeKey("indices").writeStartArray();
      for (String str : this.indices) builder.write(str);
      builder.writeEnd();
    }

    if (this.bar != null) {
      builder.writeKey("bar");
      this.bar.serialize(builder, mapper);
    }

    if (this.query != null) {
      builder.writeKey("query");
      this.query.serialize(builder, mapper);
    }

    builder.writeEnd();
  }

  //===========================================
  // Deserialization
  // (formally not needed for requests)
  //===========================================

  private static final JsonpDeserializer<FooRequest> PARSER;

  public static JsonpDeserializer<FooRequest> parser() {
    return PARSER;
  }

  static {
    ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

    op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
    op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
    op.add(Builder::value, "value"); // primitive type
    op.add(Builder::size, "size");
    op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "indices");
    op.add(Builder::bar, Bar.parser(), "bar");
    op.add(Builder::query, Query.parser(), "query");

    PARSER = new ObjectBuilderDeserializer<>(op);
  }

  //===========================================
  // Endpoint
  //===========================================

  public static final Endpoint<FooRequest, FooResponse, ErrorResponse> ENDPOINT =
    new SimpleEndpoint<>(
      "foo",
      r -> "POST",
      r -> "/foo",
      SimpleEndpoint.emptyMap(),
      SimpleEndpoint.emptyMap(),
      SimpleEndpoint.emptyMap(),
      true,
      FooResponse.PARSER
    );

  public static void requireTrue(boolean v, String message) {
    if (!v) throw new IllegalStateException(message);
  }
}
