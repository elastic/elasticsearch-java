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

package co.elastic.clients.util;

import co.elastic.clients.json.JsonpSerializationContext;
import co.elastic.clients.json.JsonpValueParser;

import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import javax.json.stream.JsonParsingException;

/**
 * A tagged union (also known as variant, sum type or coproduct) with two members.
 *
 * The union's value is one (and only one) of the possible variants. The variant in use is defined by the
 * {@link #tag()}'s value.
 *
 * @param <A> type of the first variant
 * @param <B> type of the second variant
 */

// Design note: we cannot require A and B, and by extension Union2, to implement ToJsonp as they can be builtin types
// like String or Integer

public class Union2<A, B> {

  /**
   * The variant tag.
   */
  public enum Tag{A, B};

  private final Tag tag;
  private final Object value;

  private Union2(Tag tag, Object value) {
    this.tag = tag;
    this.value = value;
  }

  /**
   * Creates a variant {@code A}.
   */
  public static <A, B> Union2<A, B> ofA(A value) {
    return new Union2<>(Tag.A, value);
  }

  /**
   * Creates a variant {@code B}.
   */
  public static <A, B> Union2<A, B> ofB(B value) {
    return new Union2<>(Tag.B, value);
  }

  /**
   * Get the variant's tag of this union.
   *
   * @return the variant's tag
   */
  public Tag tag() {
    return tag;
  }

  /**
   * Get the variant {@code A} of this union.
   *
   * @return the variant's value
   * @throws IllegalStateException if the union is not holding a variant {@code A}
   */
  public A a() {
    return getVariant(Tag.A);
  }

  /**
   * Get the variant {@code B} of this union.
   *
   * @return the variant's value
   * @throws IllegalStateException if the union is not holding a variant {@code B}
   */
  public B b() {
    return getVariant(Tag.B);
  }

  private <T> T getVariant(Tag tag) {
    if (this.tag != tag) throw new IllegalStateException("Union holds variant " + tag);

    @SuppressWarnings("unchecked")
    T result = (T)value;

    return result;
  }

  //-----------------------------------------------------------------------------------------------
  // Serialization / deserialization

  public void toJsonp(
    JsonGenerator builder, JsonpSerializationContext params,
    TriConsumer<A, JsonGenerator, JsonpSerializationContext> a,
    TriConsumer<B, JsonGenerator, JsonpSerializationContext> b
  ) {
    switch (this.tag) {
      case A:
        a.accept(this.a(), builder, params);
      case B:
        b.accept(this.b(), builder, params);
    }
  }

  public static class JsonpParser<A, B> extends JsonpValueParser<Union2<A, B>> {

    private final JsonpValueParser<A> parserA;
    private final JsonpValueParser<B> parserB;

    public JsonpParser(
        JsonpValueParser<A> parserA,
        JsonpValueParser<B> parserB
    ) {
      super(allAcceptedEvents(parserA, parserB));
      this.parserA = parserA;
      this.parserB = parserB;
    }

    @Override
    public Union2<A, B> parse(JsonParser parser, Params params, Event event) {
      if (parserA.accepts(event)) {
        return Union2.ofA(parserA.parse(parser, params, event));

      } else if (parserB.accepts(event)) {
        return Union2.ofB(parserB.parse(parser, params, event));

      } else {
        throw new JsonParsingException("Unexpected event [" + event + "]", parser.getLocation());
      }
    }
  }
}
