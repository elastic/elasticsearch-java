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

import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.nio.AsyncEntityProducer;
import org.apache.hc.core5.http.nio.DataStreamChannel;
import org.apache.hc.core5.util.Args;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import static co.elastic.clients.transport.rest5_client.low_level.Constants.DEFAULT_BUFFER_INITIAL_CAPACITY;

/**
 * Basic implementation of {@link AsyncEntityProducer}
 */
class BasicAsyncEntityProducer implements AsyncEntityProducer {

    private final HttpEntity entity;
    private final ByteBuffer buffer;
    private final AtomicReference<ReadableByteChannel> channelRef;
    private final AtomicReference<Exception> exceptionRef;
    private final String contentType;
    private final boolean isChunked;
    private boolean eof;

    /**
     * Create new basic entity producer
     */
    BasicAsyncEntityProducer(final HttpEntity entity, final int bufferSize) {
        this.entity = Args.notNull(entity, "Http Entity");
        this.buffer = ByteBuffer.allocate(bufferSize);
        this.channelRef = new AtomicReference<>();
        this.exceptionRef = new AtomicReference<>();
        this.contentType = entity.getContentType();
        this.isChunked = entity.isChunked();
    }

    /**
     * Create new basic entity producer with default buffer limit of 100MB
     */
    BasicAsyncEntityProducer(final HttpEntity entity) {
        this(entity, DEFAULT_BUFFER_INITIAL_CAPACITY);
    }

    @Override
    public boolean isRepeatable() {
        return entity.isRepeatable();
    }

    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public long getContentLength() {
        return entity.getContentLength();
    }

    @Override
    public int available() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getContentEncoding() {
        return entity.getContentEncoding();
    }

    @Override
    public boolean isChunked() {
        return this.isChunked;
    }

    @Override
    public Set<String> getTrailerNames() {
        return entity.getTrailerNames();
    }

    @Override
    public void produce(final DataStreamChannel dataStream) throws IOException {
        ReadableByteChannel channel = channelRef.get();
        if (channel == null) {
            channel = Channels.newChannel(entity.getContent());
            channelRef.getAndSet(channel);
        }
        if (!eof) {
            final int bytesRead = channel.read(buffer);
            if (bytesRead < 0) {
                eof = true;
            }
        }
        if (buffer.position() > 0) {
            ((Buffer) buffer).flip();
            dataStream.write(buffer);
            buffer.compact();
        }
        if (eof && buffer.position() == 0) {
            dataStream.endStream();
            releaseResources();
        }
    }

    @Override
    public void failed(final Exception cause) {
        if (exceptionRef.compareAndSet(null, cause)) {
            releaseResources();
        }
    }

    @Override
    public void releaseResources() {
        eof = false;
        ReadableByteChannel channel = channelRef.getAndSet(null);
        if (channel != null) {
            try {
                channel.close();
            } catch (IOException e) {
            }
        }
    }

}
