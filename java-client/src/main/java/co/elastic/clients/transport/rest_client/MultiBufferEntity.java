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

import co.elastic.clients.util.NoCopyByteArrayOutputStream;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.ContentEncoder;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.entity.HttpAsyncContentProducer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;

/**
 * An HTTP entity based on a sequence of byte buffers.
 */
class MultiBufferEntity extends AbstractHttpEntity implements HttpAsyncContentProducer {

    /**
     * Small input buffers are coalesced up to this size before writing, since each write is one HTTP chunk.
     * The staging buffer is never allocated for single-buffer bodies, such as most non-bulk requests.
     */
    static final int STAGING_BUFFER_SIZE = 16 * 1024;

    private final Iterable<ByteBuffer> buffers;

    private Iterator<ByteBuffer> iterator;
    /** Input buffer currently being consumed, {@code null} once the input is exhausted. Never empty. */
    private volatile ByteBuffer currentBuffer;
    /** Coalesced bytes not yet accepted by the encoder, always in read mode. Allocated on first use. */
    private volatile ByteBuffer staging;

    MultiBufferEntity(Iterable<ByteBuffer> buffers, ContentType contentType) {
        this.buffers = buffers;
        setChunked(true);
        if (contentType != null) {
            setContentType(contentType.toString());
        }
        init();
    }

    @Override
    public void close() throws IOException {
        // Reset state, the request may be retried
        init();
    }

    private void init() {
        Iterator<ByteBuffer> localIterator = this.buffers.iterator();
        this.currentBuffer = nextNonEmpty(localIterator);
        this.iterator = localIterator;
        ByteBuffer staging = this.staging;
        if (staging != null) {
            staging.position(0).limit(0);
        }
    }

    /** Moves {@link #currentBuffer} to the next non-empty input buffer, or {@code null} if there is none. */
    private void advance() {
        currentBuffer = nextNonEmpty(iterator);
    }

    private static ByteBuffer nextNonEmpty(Iterator<ByteBuffer> iterator) {
        while (iterator.hasNext()) {
            ByteBuffer next = iterator.next();
            if (next.hasRemaining()) {
                return next.duplicate();
            }
        }
        return null;
    }

    @Override
    public boolean isRepeatable() {
        return true;
    }

    @Override
    public long getContentLength() {
        // Use chunked encoding
        return -1;
    }

    @Override
    public boolean isStreaming() {
        return false;
    }

    @Override
    public InputStream getContent() throws IOException, UnsupportedOperationException {
        NoCopyByteArrayOutputStream baos = new NoCopyByteArrayOutputStream();
        writeTo(baos);
        return baos.asInputStream();
    }

    @Override
    public void writeTo(OutputStream out) throws IOException {
        WritableByteChannel channel = Channels.newChannel(out);
        for (ByteBuffer buffer: buffers) {
            channel.write(buffer.duplicate());
        }
    }

    @Override
    public void produceContent(ContentEncoder encoder, IOControl ioControl) throws IOException {
        // Each write() is one HTTP chunk, so small buffers are coalesced. Each iteration:
        // 1. Staging has unsent bytes: send those first, they come before anything in currentBuffer.
        // 2. Staging is empty and there is no current buffer: the body is complete, complete the encoder.
        // 3. The current buffer is large, or it's the last one: write it directly, copying is useless.
        // 4. Otherwise small buffers follow: coalesce them into staging and write that.
        // Loops while the encoder accepts everything, returns on a refused or partial write to resume later.
        while (true) {
            ByteBuffer out;
            if (staging != null && staging.hasRemaining()) {
                out = staging;
            } else if (currentBuffer == null) {
                encoder.complete();
                return;
            } else if (currentBuffer.remaining() >= STAGING_BUFFER_SIZE || !iterator.hasNext()) {
                out = currentBuffer;
            } else {
                out = fillStaging();
            }

            encoder.write(out);

            if (out == currentBuffer && !out.hasRemaining()) {
                advance();
            }
            if (out.hasRemaining()) {
                return;
            }
        }
    }

    /** Copies as much input as fits into the (empty) staging buffer and returns it, ready to be read. */
    private ByteBuffer fillStaging() {
        ByteBuffer staging = this.staging;
        if (staging == null) {
            staging = ByteBuffer.allocate(STAGING_BUFFER_SIZE);
            this.staging = staging;
        }
        staging.clear();
        while (currentBuffer != null && staging.hasRemaining()) {
            ByteBuffer src = currentBuffer;
            int n = Math.min(src.remaining(), staging.remaining());
            int srcLimit = src.limit();
            src.limit(src.position() + n);
            staging.put(src);
            src.limit(srcLimit);
            if (!src.hasRemaining()) {
                advance();
            }
        }
        staging.flip();
        return staging;
    }
}
