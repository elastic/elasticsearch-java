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

package co.elastic.clients.transport;

import co.elastic.clients.ApiClient;
import co.elastic.clients.json.JsonpMapper;

import javax.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * The transport layer that allows {@link ApiClient}s to send requests.
 */
public interface Transport extends Closeable {

    <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    ) throws IOException;

    <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint,
        @Nullable TransportOptions options
    );

    JsonpMapper jsonpMapper();

    /**
     * Default options used by this transport if none are provided in {@link #performRequest(Object, Endpoint, TransportOptions)} or
     * {@link #performRequestAsync(Object, Endpoint, TransportOptions)};
     */
    TransportOptions options();
}
