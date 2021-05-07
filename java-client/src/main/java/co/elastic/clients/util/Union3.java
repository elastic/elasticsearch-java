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

public class Union3<A, B, C> {

  public enum Tag{A, B, C};

  private final Tag tag;
  private final Object value;

  private Union3(Tag tag, Object value) {
    this.tag = tag;
    this.value = value;
  }

  public static <A, B, C> Union3<A, B, C> ofA(A value) {
    return build(Tag.A, value);
  }

  public static <A, B, C> Union3<A, B, C> ofB(B value) {
    return build(Tag.B, value);
  }

  public static <A, B, C> Union3<A, B, C> ofC(C value) {
    return build(Tag.C, value);
  }

  private static <A, B, C> Union3<A, B, C> build(Tag tag, Object v) {
    Union3<A, B, C> result = new Union3<>(tag, v);
    return result;
  }

  public Tag tag() {
    return tag;
  }

  public A a() {
    return getVariant(Tag.A);
  }

  public B b() {
    return getVariant(Tag.B);
  }

  public C c() {
    return getVariant(Tag.C);
  }

  @SuppressWarnings("unchecked")
  private <T> T getVariant(Tag tag) {
    if (this.tag != tag) throw new IllegalStateException("Union holds variant " + tag);
    return (T) value;
  }
}
