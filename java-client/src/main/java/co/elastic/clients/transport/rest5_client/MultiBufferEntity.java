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

package co.elastic.clients.transport.rest5_client;

import co.elastic.clients.util.NoCopyByteArrayOutputStream;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.AbstractHttpEntity;
import org.apache.hc.core5.http.nio.AsyncEntityProducer;
import org.apache.hc.core5.http.nio.DataStreamChannel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An HTTP entity based on a sequence of byte buffers.
 */
class MultiBufferEntity extends AbstractHttpEntity implements AsyncEntityProducer {

    /**
     * Size of the buffer small input buffers are coalesced into before being handed to the channel.
     * <p>
     * Each {@link DataStreamChannel#write} becomes at most one HTTP/2 DATA frame, and httpcore5's
     * multiplexer emits a single frame per output event, so the frame payload size (16 KiB by default,
     * RFC 9113 §4.2) is the largest write that can be fully used. Over HTTP/1.1 it also amortizes the
     * per-write chunk header and session buffer maintenance.
     */
    static final int STAGING_BUFFER_SIZE = 16 * 1024;

    private final Iterable<ByteBuffer> buffers;

    private Iterator<ByteBuffer> iterator;
    /** Input buffer currently being consumed, {@code null} once the input is exhausted. Never empty. */
    private volatile ByteBuffer currentBuffer;
    /** Coalesced bytes not yet accepted by the channel, always in read mode. Allocated on first use. */
    private volatile ByteBuffer staging;

    private final AtomicReference<Exception> exceptionRef;

    MultiBufferEntity(Iterable<ByteBuffer> buffers, ContentType contentType) {
        super(contentType,null,true);
        this.buffers = buffers;
        this.exceptionRef = new AtomicReference<>();
        init();
    }

    @Override
    public void close() throws IOException {
        // Reset state, the request may be retried
        init();
    }

    private void init() {
        this.iterator = buffers.iterator();
        this.currentBuffer = null;
        advance();
        ByteBuffer staging = this.staging;
        if (staging != null) {
            staging.position(0).limit(0);
        }
    }

    /** Moves {@link #currentBuffer} to the next non-empty input buffer, or {@code null} if there is none. */
    private void advance() {
        while (iterator.hasNext()) {
            ByteBuffer next = iterator.next();
            if (next.hasRemaining()) {
                currentBuffer = next.duplicate();
                return;
            }
        }
        currentBuffer = null;
    }

    @Override
    public boolean isRepeatable() {
        return true;
    }

    @Override
    public void failed(Exception cause) {
        if (exceptionRef.compareAndSet(null, cause)) {
            releaseResources();
        }
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
    public int available() {
        ByteBuffer staging = this.staging;
        ByteBuffer current = this.currentBuffer;
        return (staging == null ? 0 : staging.remaining()) + (current == null ? 0 : current.remaining());
    }

    @Override
    public void produce(DataStreamChannel channel) throws IOException {
        // The input is typically many small buffers (e.g. one per NDJSON line of a bulk request). Each
        // write() below is at most one HTTP/2 DATA frame and, over HTTP/1.1, one chunk, so writing
        // them one by one is very expensive (issue #1339). Coalesce them into a staging buffer and
        // write that instead; input buffers that are already large are written directly.
        //
        // Keep going as long as the channel accepts everything: over HTTP/1.1 the encoder buffers up
        // to the socket send buffer, over HTTP/2 the multiplexer takes exactly one frame per output
        // event. Once a write is refused or partial (socket buffer full, frame or flow-control window
        // exhausted), return and wait for the next output event.
        while (true) {
            ByteBuffer out;
            if (staging != null && staging.hasRemaining()) {
                out = staging;
            } else if (currentBuffer == null) {
                channel.endStream();
                return;
            } else if (currentBuffer.remaining() >= STAGING_BUFFER_SIZE) {
                out = currentBuffer;
            } else {
                out = fillStaging();
            }

            channel.write(out);

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

    @Override
    public void releaseResources() {
        init();
    }
}
