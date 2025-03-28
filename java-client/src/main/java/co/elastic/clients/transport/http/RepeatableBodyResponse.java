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

package co.elastic.clients.transport.http;

import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ByteArrayBinaryData;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.List;

public class RepeatableBodyResponse implements TransportHttpClient.Response {

    private final TransportHttpClient.Response response;
    private final BinaryData body;

    public static TransportHttpClient.Response of(TransportHttpClient.Response response) throws IOException {
        BinaryData body = response.body();
        if (body == null || body.isRepeatable()) {
            return response;
        }
        return new RepeatableBodyResponse(response);
    }

    public RepeatableBodyResponse(TransportHttpClient.Response response) throws IOException {
        this.response = response;
        this.body = new ByteArrayBinaryData(response.body());
    }

    @Override
    public Node node() {
        return response.node();
    }

    @Override
    public int statusCode() {
        return response.statusCode();
    }

    @Nullable
    @Override
    public String header(String name) {
        return response.header(name);
    }

    @Override
    public List<String> headers(String name) {
        return response.headers(name);
    }

    @Nullable
    @Override
    public BinaryData body() throws IOException {
        return this.body;
    }

    @Nullable
    @Override
    public Object originalResponse() {
        return response.originalResponse();
    }

    @Override
    public void close() throws IOException {
        response.close();
    }
}
