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

import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.JsonpDeserializer;

public class ElasticsearchError {

  // TODO: add fields for the detailed representation of errors
  // See org.elasticsearch.rest.BytesRestResponse.build() and ElasticsearchException

  private int status;
  private String error;

  private ElasticsearchError() {}

  public ElasticsearchError(int status, String error) {
    this.status = status;
    this.error = error;
  }

  public int status() {
    return this.status;
  }

  private void status(int status) {
    this.status = status;
  }

  public String error() {
    return this.error;
  }

  private void error(String error) {
    this.error = error;
  }

  public static final JsonpDeserializer<ElasticsearchError> PARSER;

  static {
    ObjectDeserializer<ElasticsearchError> op = new ObjectDeserializer<>(
        ElasticsearchError::new
    );

    op.add(ElasticsearchError::status, "status");
    op.add(ElasticsearchError::error, JsonpDeserializer.stringDeserializer(), "error");

    PARSER = op;
  }
}
