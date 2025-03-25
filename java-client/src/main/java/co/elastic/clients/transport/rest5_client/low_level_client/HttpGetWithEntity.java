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
package co.elastic.clients.transport.rest5_client.low_level_client;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;

import java.net.URI;

/**
 * Allows to send GET requests providing a body (not supported out of the box)
 */
final class HttpGetWithEntity extends HttpUriRequestBase {

    static final String METHOD_NAME = HttpGet.METHOD_NAME;

    public HttpGetWithEntity(URI requestUri) {
        super(METHOD_NAME, requestUri);
    }

    @Override
    public String getMethod() {
        return METHOD_NAME;
    }
}
