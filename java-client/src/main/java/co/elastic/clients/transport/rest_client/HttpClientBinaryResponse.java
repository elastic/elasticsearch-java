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

package co.elastic.clients.transport.rest_client;

import co.elastic.clients.transport.endpoints.BinaryResponse;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.io.InputStream;

class HttpClientBinaryResponse implements BinaryResponse {
    private final HttpEntity entity;
    private boolean consumed = false;

    HttpClientBinaryResponse(HttpEntity entity) {
        this.entity = entity;
    }

    @Override
    public String contentType() {
        Header h = entity.getContentType();
        return h == null ? "application/octet-stream" : h.getValue();
    }

    @Override
    public long contentLength() {
        long len = entity.getContentLength();
        return len < 0 ? -1 : entity.getContentLength();
    }

    @Override
    public InputStream content() throws IOException {
        if (consumed) {
            throw new IllegalStateException("Response content has already been consumed");
        }
        consumed = true;
        return entity.getContent();
    }
}
