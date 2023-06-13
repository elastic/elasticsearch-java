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

package co.elastic.clients.transport.netty;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class NettyElasticsearchTransport extends ElasticsearchTransportBase {

    public NettyElasticsearchTransport(TransportHttpClient.Node node, TransportOptions options, JsonpMapper jsonpMapper) {
        super(new SingleNodeHttpClient(new NettyTransportHttpClient(), node), options, jsonpMapper);
    }

    public static class SingleNodeHttpClient implements TransportHttpClient {
        private final TransportHttpClient client;
        private final Node node;

        public SingleNodeHttpClient(TransportHttpClient client, Node node) {
            this.client = client;
            this.node = node;
        }

        @Override
        public TransportOptions createOptions(@Nullable TransportOptions options) {
            return client.createOptions(options);
        }

        @Override
        public Response performRequest(
            String endpointId, @Nullable Node ignoredNode, Request request, TransportOptions options
        ) throws IOException {
            return client.performRequest(endpointId, node, request, options);
        }

        @Override
        public CompletableFuture<Response> performRequestAsync(
            String endpointId, @Nullable Node ignoredNode, Request request, TransportOptions options
        ) {
            return client.performRequestAsync(endpointId, node, request, options);
        }

        @Override
        public void close() throws IOException {
            client.close();
        }
    }
}
