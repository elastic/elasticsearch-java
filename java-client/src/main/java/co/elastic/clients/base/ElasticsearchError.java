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

package co.elastic.clients.base;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

@JsonpDeserializable
public final class ElasticsearchError implements JsonpSerializable {
  private final int status;

  private final JsonValue error;

  // ---------------------------------------------------------------------------------------------

  public ElasticsearchError(ElasticsearchError.Builder builder) {

    this.status = Objects.requireNonNull(builder.status, "status");
    this.error = Objects.requireNonNull(builder.error, "error");

  }

  public ElasticsearchError(Function<ElasticsearchError.Builder, ElasticsearchError.Builder> fn) {
    this(fn.apply(new ElasticsearchError.Builder()));
  }

  /**
   * API name: {@code status}
   */
  public int status() {
    return this.status;
  }

  /**
   * API name: {@code error}
   */
  public JsonValue error() {
    return this.error;
  }

  /**
   * Serialize this object to JSON.
   */
  public void serialize(JsonGenerator generator, JsonpMapper mapper) {
    generator.writeStartObject();
    serializeInternal(generator, mapper);
    generator.writeEnd();
  }

  protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

    generator.writeKey("status");
    generator.write(this.status);

    generator.writeKey("error");
    generator.write(this.error);

  }

  // ---------------------------------------------------------------------------------------------

  /**
   * Builder for {@link ElasticsearchError}.
   */
  public static class Builder implements ObjectBuilder<ElasticsearchError> {
    private Integer status;

    private JsonValue error;

    /**
     * API name: {@code status}
     */
    public ElasticsearchError.Builder status(int value) {
      this.status = value;
      return this;
    }

    /**
     * API name: {@code error}
     */
    public ElasticsearchError.Builder error(JsonValue value) {
      this.error = value;
      return this;
    }

    /**
     * Builds a {@link ElasticsearchError}.
     *
     * @throws NullPointerException
     *             if some of the required fields are null.
     */
    public ElasticsearchError build() {

      return new ElasticsearchError(this);
    }
  }

  // ---------------------------------------------------------------------------------------------

  /**
   * Json deserializer for {@link ElasticsearchError}
   */
  public static final JsonpDeserializer<ElasticsearchError> _DESERIALIZER = ObjectBuilderDeserializer
      .lazy(ElasticsearchError.Builder::new, ElasticsearchError::setupElasticsearchErrorDeserializer, ElasticsearchError.Builder::build);

  protected static void setupElasticsearchErrorDeserializer(DelegatingDeserializer<ElasticsearchError.Builder> op) {

    op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");
    op.add(ElasticsearchError.Builder::error, JsonpDeserializer.jsonValueDeserializer(), "error");

  }
}
