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

package co.elastic.clients.elasticsearch.experiments;

import co.elastic.clients.elasticsearch.experiments.api.Bar;
import co.elastic.clients.elasticsearch.experiments.api.FooRequest;
import co.elastic.clients.elasticsearch.experiments.api.FooResponse;
import co.elastic.clients.elasticsearch.experiments.api.query.Query;
import co.elastic.clients.elasticsearch.experiments.api.query.TermsQuery;
import co.elastic.clients.elasticsearch.experiments.base.Client;
import co.elastic.clients.transport.Endpoint;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class ClientTests {

  @Test
  public void testClient() throws Exception {

    Client client = new Client(){
      @Override
      protected <RequestT, ResponseT, ErrorT> ResponseT performRequest(
          RequestT request, Endpoint<RequestT, ResponseT, ErrorT> endpoint
      ) throws IOException {
        // don't care for now, we're testing compilation
        return null;
      }
    };

    client.foo(fb -> fb
        .name("z")
        .value(1)
        .routing("fooo")
        .query(q -> q
            .bool(b-> b
                .add_must(m -> m.terms((TermsQuery) null))
            )
            //.terms(tq -> tq.term(""))
            .meta(Collections.emptyMap())
        )
    );

    // Builders everywhere
    FooResponse r1 = client.foo(
      FooRequest.builder()
        .name("z")
        .value(1)
        .bar(Bar.builder()
          .name("Raise the bar")
          .build()
        )
      .build()
    );

    // Illustrates creating an object outside of the client call
    TermsQuery filter = TermsQuery.builder()
      .field("foo")
      .term("bar")
      .build();

    Query filter2 = new Query.Builder()
        .terms(t -> t
            .field("foo")
            .term("bar")
        ).build();

    // Fluid lambda-based builders
    FooResponse r2 = client.foo(f -> f
      .name("z")
      .value(1)
      .bar(bar -> bar
        .name("Raise the bar")
      )
      .query(q -> q
        .bool(b -> b
          .add_must(q1 -> q1.terms(filter))
          .add_must(q1 -> q1
            .terms(t -> t.field("a").term("b"))
          )
          .add_must(q1 -> q1
            .terms(t -> t.field("a").term("b"))
          )
          .minimumShouldMatch(2)
        )
      )
    );
  }
}

