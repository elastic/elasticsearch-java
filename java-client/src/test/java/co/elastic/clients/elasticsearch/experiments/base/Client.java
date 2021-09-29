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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.experiments.api.FooRequest;
import co.elastic.clients.elasticsearch.experiments.api.FooResponse;
import co.elastic.clients.util.ObjectBuilder;

import java.io.IOException;
import java.util.function.Function;

public class Client {

  private Transport transport;

  public FooResponse foo(FooRequest request) throws IOException {
    return performRequest(request, FooRequest.ENDPOINT);
  }

  public FooResponse foo(Function<FooRequest.Builder, ObjectBuilder<FooRequest>> b) throws IOException {
    return foo(b.apply(new FooRequest.Builder()).build());
  }

  protected <RequestT, ResponseT, ErrorT> ResponseT performRequest(
      RequestT request, Endpoint<RequestT, ResponseT, ErrorT> endpoint
  ) throws IOException {
    return transport.performRequest(request, endpoint);
  }
}
