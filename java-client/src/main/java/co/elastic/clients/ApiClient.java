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

package co.elastic.clients;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapperBase;

import javax.annotation.Nullable;
import java.lang.reflect.Type;
import java.util.function.Function;

public abstract class ApiClient<T extends Transport, Self extends ApiClient<T, Self>> {

    protected final T transport;
    protected final TransportOptions transportOptions;

    protected ApiClient(T transport, TransportOptions transportOptions) {
        this.transport = transport;
        this.transportOptions = transportOptions;
    }

    protected <V> JsonpDeserializer<V> getDeserializer(Type type) {
        // Try the built-in deserializers first to avoid repeated lookups in the Jsonp mapper for client-defined classes
        JsonpDeserializer<V> result = JsonpMapperBase.findDeserializer(type);
        if (result != null) {
            return result;
        }

        return JsonpDeserializer.of(type);
    }

    /**
     * Creates a new client with some request options
     */
    public abstract Self withTransportOptions(@Nullable TransportOptions transportOptions);

    /**
     * Creates a new client with additional request options
     *
     * @param fn a lambda expression that takes the current options as input
     */
    public Self withTransportOptions(Function<TransportOptions.Builder, TransportOptions.Builder> fn) {
        return withTransportOptions(fn.apply(_transportOptions().toBuilder()).build());
    }

    /**
     * Get the transport used by this client to handle communication with the server.
     */
    public T _transport() {
        return this.transport;
    }

    /**
     * Get the transport options used for this client. If the client has no custom options, falls back to the transport's options.
     */
    public TransportOptions _transportOptions() {
        return this.transportOptions == null ? transport.options() : transportOptions;
    }

    /**
     * Get the JSON mapper used to map API objects to/from JSON.
     * <p>
     * Shortcut for <code>_transport().jsonpMapper()</code>
     */
    public JsonpMapper _jsonpMapper() {
        return transport.jsonpMapper();
    }
}
