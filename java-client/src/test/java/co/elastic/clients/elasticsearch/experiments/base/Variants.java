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

package co.elastic.clients.elasticsearch.experiments.base;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpSerializable;

import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Describes the variants of a base class, providing their name and parsers. It is representation-agnostic.
 */
public class Variants<T> {

  private Function<Builder<T>, Builder<T>> builderFunc;

  private Map<Class<?>, String> variantNames;
  private Map<String, JsonpDeserializer<? extends T>> parsers;

  /**
   * Builds a new {@code Variants} from a builder-creation function. This approach allows the object to be built lazily,
   * which is needed for recursive variant data structures (e.g. a query can be a boolean query that itself contains
   * other queries).
   *
   * This is required because cyclic dependencies between static class initialization code can lead to unexpected
   * behaviour (a subclass static init may be called while static init of the parent class is not finished).
   */
  public Variants(Function<Builder<T>, Builder<T>> b) {
    this.builderFunc = b;
  }

  public Variants(Builder<T> builder) {
    this.variantNames = builder.variantNames;
    this.parsers = builder.parsers;
  }

  public String variantName(Class<? extends T> clazz) {
    build();
    return variantNames.get(clazz);
  }

  public JsonpDeserializer<? extends T> variantParser(String name) {
    build();
    return parsers.get(name);
  }

  private void build() {
    if (builderFunc != null) {
      Builder<T> builder = builderFunc.apply(new Builder<>());
      this.variantNames = builder.variantNames;
      this.parsers = builder.parsers;
      this.builderFunc = null;
    }
  }

  //-------------------------------------------------------------------------------------------------------------------

  public static <BT> Builder<BT> builder() {
    return new Builder<>();
  }

  public static class Builder<BT> {
    private final Map<Class<?>, String> variantNames = new HashMap<>();
    private final Map<String, JsonpDeserializer<? extends BT>> parsers = new HashMap<>();

    public Builder<BT> add(String name, Class<? extends BT> clazz, JsonpDeserializer<? extends BT> parser) {
      variantNames.put(clazz, name);
      parsers.put(name, parser);
      return this;
    }

    public Variants<BT> build() {
      return new Variants<>(this);
    }
  }

  //-------------------------------------------------------------------------------------------------------------------

  /**
   * Variant serializer/deserializer using externally tagged JSON.
   * <p>
   * See <a href="https://serde.rs/enum-representations.html">Enumerations in Serde.rs</a> that clearly explains the
   * various strategies to represent polymorphic values in JSON.
   */
  public static class ExternallyTagged {

    /**
     * Creates a parser for externally tagged variants
     */
    public static <T> JsonpDeserializer<T> pparser(Variants<T> variants) {
      return JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT), (parser, params, event) -> {
        JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);

        String variant = parser.getString();
        JsonpDeserializer<? extends T> variantParser = variants.variantParser(variant);

        if (variantParser == null) {
          throw new JsonParsingException("Unknown variant [" + variant + "]", parser.getLocation());
        }

        T result = variantParser.deserialize(parser, params);

        JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);

        return result;
      });
    }

    /**
     * Serializes an externally tagged variant object
     */

    public static <T extends JsonpSerializable> void serialize(
        Variants<T> variants, T v, JsonGenerator builder, JsonpMapper mapper
    ) {
      @SuppressWarnings("unchecked")
      String variant = variants.variantName((Class<? extends T>)v.getClass());

      if (variant == null) {
        throw new IllegalArgumentException("No variant name found for " + v.getClass().getName());
      }

      builder.writeStartObject();
      builder.writeKey(variant);
      v.serialize(builder, mapper);
      builder.writeEnd();
    }
  }
}
