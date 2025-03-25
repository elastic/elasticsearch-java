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
package co.elastic.clients.transport.rest5_client.low_level.consumer;

import org.apache.hc.core5.http.ContentTooLongException;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.nio.entity.AbstractBinAsyncEntityConsumer;
import org.apache.hc.core5.util.ByteArrayBuffer;

import java.nio.ByteBuffer;

import static co.elastic.clients.transport.rest5_client.low_level.utils.Constants.DEFAULT_BUFFER_INITIAL_CAPACITY;

public class BufferedByteConsumer extends AbstractBinAsyncEntityConsumer<ByteArrayEntity> {

    private volatile ByteArrayBuffer buffer;
    private final int limit;
    private ContentType contentType;

    public BufferedByteConsumer(int bufferLimit) {
        super();
        if (bufferLimit <= 0) {
            throw new IllegalArgumentException("Buffer limit must be greater than 0");
        }
        this.limit = bufferLimit;
        this.buffer = new ByteArrayBuffer(DEFAULT_BUFFER_INITIAL_CAPACITY);
    }

    @Override
    protected void streamStart(final ContentType contentType) {
        this.contentType = contentType;
    }

    @Override
    protected int capacityIncrement() {
        return limit;
    }

    @Override
    protected void data(final ByteBuffer src, final boolean endOfStream) throws ContentTooLongException {
        if (src.capacity() > limit) { //TODO why though? the server already has a 100MB limit. also, this method is called multiple times. check if should be src.capacity + buffer.length
            throw new ContentTooLongException(
                "entity content is too long [" + src.capacity() + "] for the configured buffer limit [" + limit + "]"
            );
        }
        buffer.append(src);
    }

    @Override
    protected ByteArrayEntity generateContent() {
        return new ByteArrayEntity(buffer.toByteArray(), contentType);
    }

    @Override
    public void releaseResources() {
        buffer.clear();
    }

}
