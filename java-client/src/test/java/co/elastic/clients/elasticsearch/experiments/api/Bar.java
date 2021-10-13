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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import javax.annotation.Nullable;

public class Bar implements JsonpSerializable {

  private final String name;

  @Nullable
  public String name() {
    return this.name;
  }

  public Bar(Bar.Builder builder) {
    this.name = builder.name;
  }

  @Override
  public void serialize(JsonGenerator builder, JsonpMapper mapper) {
    builder.writeStartObject();
    if (this.name != null) builder.write("name", this.name);
    builder.writeEnd();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder implements ObjectBuilder<Bar> {
    private String name;

    public Bar.Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }

    public Bar build() {
      return new Bar(this);
    }
  }

  private static final JsonpDeserializer<Bar> PARSER;

  public static JsonpDeserializer<Bar> parser() {
    return PARSER;
  }

  static {
    ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

    op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

    PARSER = new ObjectBuilderDeserializer<>(op);
  }
}
