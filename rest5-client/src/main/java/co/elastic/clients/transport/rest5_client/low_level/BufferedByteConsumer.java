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
package co.elastic.clients.transport.rest5_client.low_level;

import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.ContentTooLongException;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.EntityDetails;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.nio.AsyncEntityConsumer;
import org.apache.hc.core5.http.nio.entity.AbstractBinDataConsumer;
import org.apache.hc.core5.util.ByteArrayBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;

import static co.elastic.clients.transport.rest5_client.low_level.Constants.DEFAULT_BUFFER_INITIAL_CAPACITY;

public class BufferedByteConsumer extends AbstractBinDataConsumer implements AsyncEntityConsumer<ByteArrayEntity> {

    private final int limit;
    private volatile ByteArrayBuffer buffer;
    private volatile FutureCallback<ByteArrayEntity> resultCallback;
    private volatile ContentType contentType;
    private volatile String contentEncoding;
    private volatile ByteArrayEntity result;

    public BufferedByteConsumer(int bufferLimit) {
        super();
        if (bufferLimit <= 0) {
            throw new IllegalArgumentException("Buffer limit must be greater than 0");
        }
        this.limit = bufferLimit;
        this.buffer = new ByteArrayBuffer(DEFAULT_BUFFER_INITIAL_CAPACITY);
    }

    @Override
    public void streamStart(final EntityDetails entityDetails,
                            final FutureCallback<ByteArrayEntity> resultCallback) {
        this.contentType = entityDetails != null ? ContentType.parse(entityDetails.getContentType()) : null;
        this.contentEncoding = entityDetails != null ? entityDetails.getContentEncoding() : null;
        this.resultCallback = resultCallback;
    }

    @Override
    protected int capacityIncrement() {
        return limit;
    }

    @Override
    protected void data(final ByteBuffer src, final boolean endOfStream) throws ContentTooLongException {
        if (buffer.length() + src.limit() > limit) {
            throw new ContentTooLongException(
                "entity content is too long [" + src.limit() + "] for the configured buffer limit [" + limit + "]"
            );
        }
        buffer.append(src);
    }

    @Override
    protected final void completed() throws IOException {
        result = new ByteArrayEntity(buffer.toByteArray(), contentType, contentEncoding);
        if (resultCallback != null) {
            resultCallback.completed(result);
        }
        releaseResources();
    }

    @Override
    public ByteArrayEntity getContent() {
        return result;
    }

    @Override
    public final void failed(final Exception cause) {
        if (resultCallback != null) {
            resultCallback.failed(cause);
        }
        releaseResources();
    }

    @Override
    public void releaseResources() {
        buffer.clear();
    }

}
