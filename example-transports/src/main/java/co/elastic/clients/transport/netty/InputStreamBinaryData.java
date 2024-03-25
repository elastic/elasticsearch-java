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

import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.NoCopyByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class InputStreamBinaryData implements BinaryData {

    private final String contentType;
    private final InputStream inputStream;
    private boolean consumed = false;

    public InputStreamBinaryData(String contentType, InputStream inputStream) {
        this.contentType = contentType;
        this.inputStream = inputStream;
    }

    @Override
    public String contentType() {
        return contentType;
    }

    @Override
    public void writeTo(OutputStream out) throws IOException {
        consume();
        try {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        } finally {
            inputStream.close();
        }
    }

    @Override
    public ByteBuffer asByteBuffer() throws IOException {
        consume();
        NoCopyByteArrayOutputStream baos = new NoCopyByteArrayOutputStream();
        writeTo(baos);
        return baos.asByteBuffer();
    }

    @Override
    public InputStream asInputStream() throws IOException {
        consume();
        return inputStream;
    }

    @Override
    public boolean isRepeatable() {
        return false;
    }

    @Override
    public long size() {
        return -1;
    }

    private void consume() throws IllegalStateException {
        if (consumed) {
            throw new IllegalStateException("Data has already been consumed");
        }
        consumed = true;
    }
}
