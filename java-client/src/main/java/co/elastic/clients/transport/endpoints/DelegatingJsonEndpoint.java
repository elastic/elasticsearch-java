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

package co.elastic.clients.transport.endpoints;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.transport.JsonEndpoint;

import javax.annotation.Nullable;
import java.util.Map;

public class DelegatingJsonEndpoint<Req, Res, Err> implements JsonEndpoint<Req, Res, Err> {

    protected final JsonEndpoint<Req, Res, Err> endpoint;

    public DelegatingJsonEndpoint(JsonEndpoint<Req, Res, Err> endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public String id() {
        return endpoint.id();
    }

    @Override
    public String method(Req request) {
        return endpoint.method(request);
    }

    @Override
    public String requestUrl(Req request) {
        return endpoint.requestUrl(request);
    }

    @Override
    public Map<String, String> queryParameters(Req request) {
        return endpoint.queryParameters(request);
    }

    @Override
    public Map<String, String> headers(Req request) {
        return endpoint.headers(request);
    }

    @Override
    public boolean hasRequestBody() {
        return endpoint.hasRequestBody();
    }

    @Override
    @Nullable
    public JsonpDeserializer<Res> responseDeserializer() {
        return endpoint.responseDeserializer();
    }

    @Override
    public boolean isError(int statusCode) {
        return endpoint.isError(statusCode);
    }

    @Override
    @Nullable
    public JsonpDeserializer<Err> errorDeserializer(int statusCode) {
        return endpoint.errorDeserializer(statusCode);
    }
}
