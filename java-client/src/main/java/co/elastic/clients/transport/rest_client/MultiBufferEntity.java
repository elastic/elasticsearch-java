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

    private final Iterable<ByteBuffer> buffers;

    private Iterator<ByteBuffer> iterator;
    private volatile ByteBuffer currentBuffer;

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
        this.iterator = buffers.iterator();
        if (this.iterator.hasNext()) {
            this.currentBuffer = this.iterator.next().duplicate();
        } else {
            this.currentBuffer = null;
        }
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
        if (currentBuffer == null) {
            encoder.complete();
            return;
        }

        encoder.write(currentBuffer);

        if (!currentBuffer.hasRemaining()) {
            if (iterator.hasNext()) {
                currentBuffer = iterator.next().duplicate();
            } else {
                currentBuffer = null;
                encoder.complete();
            }
        }
    }
}
