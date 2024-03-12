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

import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ByteArrayBinaryData;

import java.io.IOException;
import java.io.InputStream;

public class BinaryDataResponse implements BinaryResponse {

    private final BinaryData data;

    public BinaryDataResponse(BinaryData data) {
        this.data = data;
    }

    @Override
    public String contentType() {
        return data.contentType();
    }

    @Override
    public long contentLength() {
        return data.size();
    }

    @Override
    public InputStream content() throws IOException {
        return data.asInputStream();
    }

    @Override
    public void close() throws IOException {
    }

    public static BinaryDataResponse of(byte[] data, String contentType) {
        return new BinaryDataResponse(new ByteArrayBinaryData(data, contentType));
    }
}
