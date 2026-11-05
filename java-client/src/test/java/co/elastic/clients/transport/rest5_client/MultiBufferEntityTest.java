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

import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.nio.DataStreamChannel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiBufferEntityTest {

    @Test
    public void testBulkRequest() throws IOException {

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        httpServer.createContext("/_bulk", exchange -> {
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            byte[] bytes = IOUtils.toByteArray(exchange.getRequestBody());
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write(bytes);
            exchange.close();
        });

        httpServer.start();

        Rest5Client restClient =
            Rest5Client.builder(new HttpHost(httpServer.getAddress().getAddress(), httpServer.getAddress().getPort())).build();

        BulkRequest req = BulkRequest.of(_0 -> _0
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("abc")
                    .document("abc-doc")
                ))
            .operations(_1 -> _1
                .create(_2 -> _2
                    .index("foo")
                    .id("def")
                    .document("def-doc")
                ))
            .operations(_1 -> _1
                .update(_2 -> _2
                    .index("foo")
                    .id("gh")
                    .action(_3 -> _3
                        .docAsUpsert(true)
                        .doc("gh-doc"))
                )
            )
        );
        Rest5ClientTransport transport = new Rest5ClientTransport(restClient, new JacksonJsonpMapper());

        BinaryResponse binaryResponse = transport.performRequest(req, BulkRequest._ENDPOINT.withBinaryResponse(), null);

        String str = IOUtils.toString(binaryResponse.content(), StandardCharsets.UTF_8);

        httpServer.stop(0);
        transport.close();

        Assertions.assertEquals(
            "{\"create\":{\"_id\":\"abc\",\"_index\":\"foo\"}}\n" +
            "\"abc-doc\"\n" +
            "{\"create\":{\"_id\":\"def\",\"_index\":\"foo\"}}\n" +
            "\"def-doc\"\n" +
            "{\"update\":{\"_id\":\"gh\",\"_index\":\"foo\"}}\n" +
            "{\"doc\":\"gh-doc\",\"doc_as_upsert\":true}\n",
            str
        );
    }

    // Scenario 1: bytes left in staging by a partial write are sent before anything else.
    @Test
    public void testUnsentStagedBytesAreSentFirst() throws IOException {
        List<ByteBuffer> body = bulkBody(2000);

        // Like a socket that only takes 1000 bytes per output event
        FakeChannel channel = new FakeChannel(1000, Integer.MAX_VALUE);
        drain(entity(body), channel, body);

        // Like the HTTP/2 multiplexer: one frame per output event
        channel = new FakeChannel(MultiBufferEntity.STAGING_BUFFER_SIZE, 1);
        drain(entity(body), channel, body);

        assertUntouched(body);
    }

    // Scenario 2: the stream is ended once, and only after the whole body has been written.
    @Test
    public void testEndOfStream() throws IOException {
        for (List<ByteBuffer> body : Arrays.asList(
            Collections.<ByteBuffer>emptyList(),
            Arrays.asList(piece(0, 0), piece(0, 1))
        )) {
            FakeChannel channel = new FakeChannel(Integer.MAX_VALUE, Integer.MAX_VALUE);
            MultiBufferEntity entity = entity(body);
            Assertions.assertEquals(0, entity.available());
            entity.produce(channel);
            Assertions.assertEquals(1, channel.endStreamCount);
            Assertions.assertTrue(channel.writeSizes.isEmpty());
        }

        List<ByteBuffer> body = bulkBody(2000);
        FakeChannel channel = new FakeChannel(MultiBufferEntity.STAGING_BUFFER_SIZE, 1);
        drain(entity(body), channel, body);
    }

    // Scenario 3: large buffers and the last buffer are written directly, without copying.
    @Test
    public void testLargeAndLastBuffersAreWrittenDirectly() throws IOException {
        ByteBuffer large = piece(20_000, 0);
        ByteBuffer last = piece(100, 1);
        List<ByteBuffer> body = Arrays.asList(large, last);

        FakeChannel channel = new FakeChannel(Integer.MAX_VALUE, Integer.MAX_VALUE);
        drain(entity(body), channel, body);
        Assertions.assertEquals(Arrays.asList(20_000, 100), channel.writeSizes);
        Assertions.assertSame(large.array(), channel.writtenArrays.get(0));
        Assertions.assertSame(last.array(), channel.writtenArrays.get(1));

        // Over HTTP/2 the large buffer is only partially accepted, and resumed on the next event
        drain(entity(body), new FakeChannel(MultiBufferEntity.STAGING_BUFFER_SIZE, 1), body);

        // A single small buffer never goes through staging
        ByteBuffer single = piece(200, 2);
        body = Collections.singletonList(single);
        channel = new FakeChannel(Integer.MAX_VALUE, Integer.MAX_VALUE);
        drain(entity(body), channel, body);
        Assertions.assertEquals(Collections.singletonList(200), channel.writeSizes);
        Assertions.assertSame(single.array(), channel.writtenArrays.get(0));

        assertUntouched(body);
    }

    // Scenario 4: small buffers are coalesced into full staging-size writes.
    @Test
    public void testSmallBuffersAreCoalesced() throws IOException {
        List<ByteBuffer> body = bulkBody(2000);
        int total = concat(body).length;
        int expectedWrites = (total + MultiBufferEntity.STAGING_BUFFER_SIZE - 1) / MultiBufferEntity.STAGING_BUFFER_SIZE;

        FakeChannel channel = new FakeChannel(Integer.MAX_VALUE, Integer.MAX_VALUE);
        drain(entity(body), channel, body);
        Assertions.assertEquals(expectedWrites, channel.writeSizes.size());
        for (int i = 0; i < expectedWrites - 1; i++) {
            Assertions.assertEquals(MultiBufferEntity.STAGING_BUFFER_SIZE, channel.writeSizes.get(i));
        }

        // Over HTTP/2, each output event carries a full frame
        channel = new FakeChannel(MultiBufferEntity.STAGING_BUFFER_SIZE, 1);
        Assertions.assertEquals(expectedWrites, drain(entity(body), channel, body));

        assertUntouched(body);
    }

    @Test
    public void testRetryResendsFullBody() throws IOException {
        List<ByteBuffer> body = bulkBody(2000);
        MultiBufferEntity entity = entity(body);

        // Attempts interrupted by close() and failed() are both reset
        for (int attempt = 0; attempt < 2; attempt++) {
            FakeChannel interrupted = new FakeChannel(1000, Integer.MAX_VALUE);
            for (int i = 0; i < 3; i++) {
                interrupted.newEvent();
                entity.produce(interrupted);
            }
            if (attempt == 0) {
                entity.close();
            } else {
                entity.failed(new IOException("test"));
            }
            drain(entity, new FakeChannel(1000, Integer.MAX_VALUE), body);
        }
        assertUntouched(body);
    }

    //---------------------------------------------------------------------------------------------

    private static final ByteBuffer SEPARATOR = ByteBuffer.wrap(new byte[]{'\n'});

    /**
     * Items of varying size, each followed by the same shared separator, like a bulk request body. Empty
     * buffers are added at the start, in the middle and at the end, and must be skipped.
     */
    private static List<ByteBuffer> bulkBody(int items) {
        List<ByteBuffer> body = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            if (i % 500 == 0) {
                body.add(piece(0, 0));
            }
            body.add(piece(20 + i % 100, i));
            body.add(SEPARATOR);
        }
        body.add(piece(0, 0));
        return body;
    }

    private static ByteBuffer piece(int size, int seed) {
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) (seed + i);
        }
        return ByteBuffer.wrap(bytes);
    }

    private static byte[] concat(List<ByteBuffer> body) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (ByteBuffer buffer : body) {
            out.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
        }
        return out.toByteArray();
    }

    private static MultiBufferEntity entity(List<ByteBuffer> body) {
        return new MultiBufferEntity(body, ContentType.APPLICATION_JSON);
    }

    /** Input buffers must not be consumed, as they are shared (separator) and reused on retries. */
    private static void assertUntouched(List<ByteBuffer> body) {
        for (ByteBuffer buffer : body) {
            Assertions.assertEquals(0, buffer.position());
            Assertions.assertEquals(buffer.capacity(), buffer.limit());
        }
    }

    /**
     * Calls {@code produce()} once per output event until the stream is ended, checks that the received bytes
     * are the body, and returns the number of output events.
     */
    private static int drain(MultiBufferEntity entity, FakeChannel channel, List<ByteBuffer> body) throws IOException {
        byte[] expected = concat(body);
        int events = 0;
        while (channel.endStreamCount == 0) {
            Assertions.assertTrue(++events < 1_000_000, "no progress");
            // The HTTP/2 stream handler only asks for output while data is available
            if (entity.available() == 0) {
                Assertions.assertEquals(expected.length, channel.received.size());
            }
            channel.newEvent();
            entity.produce(channel);
        }
        Assertions.assertEquals(1, channel.endStreamCount);
        Assertions.assertArrayEquals(expected, channel.received.toByteArray());
        Assertions.assertEquals(0, entity.available());
        Assertions.assertArrayEquals(expected, IOUtils.toByteArray(entity.getContent()));
        return events;
    }

    /**
     * A channel accepting at most {@code bytesPerEvent} bytes in at most {@code writesPerEvent} writes per output
     * event, like a socket that fills up (HTTP/1.1) or the HTTP/2 multiplexer, which takes one frame per event.
     */
    private static class FakeChannel implements DataStreamChannel {
        private final int bytesPerEvent;
        private final int writesPerEvent;
        private int bytesLeft;
        private int writesLeft;

        final ByteArrayOutputStream received = new ByteArrayOutputStream();
        final List<Integer> writeSizes = new ArrayList<>();
        final List<byte[]> writtenArrays = new ArrayList<>();
        int endStreamCount;

        FakeChannel(int bytesPerEvent, int writesPerEvent) {
            this.bytesPerEvent = bytesPerEvent;
            this.writesPerEvent = writesPerEvent;
            newEvent();
        }

        void newEvent() {
            bytesLeft = bytesPerEvent;
            writesLeft = writesPerEvent;
        }

        @Override
        public int write(ByteBuffer src) {
            Assertions.assertEquals(0, endStreamCount, "write after end of stream");
            int n = Math.min(src.remaining(), bytesLeft);
            if (writesLeft == 0 || n == 0) {
                return 0;
            }
            writesLeft--;
            bytesLeft -= n;
            writeSizes.add(n);
            writtenArrays.add(src.array());
            received.write(src.array(), src.arrayOffset() + src.position(), n);
            src.position(src.position() + n);
            return n;
        }

        @Override
        public void requestOutput() {
        }

        @Override
        public void endStream() {
            endStreamCount++;
        }

        @Override
        public void endStream(List<? extends Header> trailers) {
            endStream();
        }
    }
}
