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
public class BasicAsyncEntityProducer implements AsyncEntityProducer {

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
    public BasicAsyncEntityProducer(final HttpEntity entity, final int bufferSize) {
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
    public BasicAsyncEntityProducer(final HttpEntity entity) {
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
