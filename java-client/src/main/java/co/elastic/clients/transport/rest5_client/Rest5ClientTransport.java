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

package co.elastic.clients.transport.rest5_client;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransportBase;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.instrumentation.Instrumentation;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;

import javax.annotation.Nullable;

public class Rest5ClientTransport extends ElasticsearchTransportBase {

    private final Rest5Client restClient;

    public Rest5ClientTransport(Rest5Client restClient, JsonpMapper jsonpMapper) {
        this(restClient, jsonpMapper, null);
    }

    public Rest5ClientTransport(Rest5Client restClient, JsonpMapper jsonpMapper, Rest5ClientOptions options) {
        super(new Rest5ClientHttpClient(restClient), options, jsonpMapper, null);
        this.restClient = restClient;
    }

    public Rest5ClientTransport(Rest5Client restClient, JsonpMapper jsonpMapper, Rest5ClientOptions options,
                                Instrumentation instrumentation) {
        super(new Rest5ClientHttpClient(restClient), options, jsonpMapper, instrumentation);
        this.restClient = restClient;
    }

    public Rest5Client restClient() {
        return this.restClient;
    }

    @Override
    public Transport withOptions(@Nullable TransportOptions options) {
        return new Rest5ClientTransport(restClient, mapper, Rest5ClientOptions.of(options), instrumentation);
    }

    /** INTERNAL, used only for tests. */
    @Override
    protected ElasticsearchTransportBase cloneWith(TransportOptions options, JsonpMapper mapper, Instrumentation instrumentation) {
        return new Rest5ClientTransport(
            restClient,
            mapper != null ? mapper : this.mapper,
            Rest5ClientOptions.of(options != null ? options : this.transportOptions),
            instrumentation != null ? instrumentation : this.instrumentation
        );
    }
}
