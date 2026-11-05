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

import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.ContentEncoder;
import org.elasticsearch.client.RestClient;
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

        RestClient restClient =
            RestClient.builder(new HttpHost(httpServer.getAddress().getAddress(), httpServer.getAddress().getPort())).build();

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
        RestClientTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

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
        int total = concat(body).length;

        drain(entity(body), new FakeEncoder(7), body);
        // Every output event fills the encoder
        Assertions.assertEquals((total + 999) / 1000, drain(entity(body), new FakeEncoder(1000), body));

        assertUntouched(body);
    }

    // Scenario 2: the encoder is completed once, and only after the whole body has been written.
    @Test
    public void testEndOfStream() throws IOException {
        for (List<ByteBuffer> body : Arrays.asList(
            Collections.<ByteBuffer>emptyList(),
            Arrays.asList(piece(0, 0), piece(0, 1))
        )) {
            FakeEncoder encoder = new FakeEncoder(Integer.MAX_VALUE);
            entity(body).produceContent(encoder, null);
            Assertions.assertEquals(1, encoder.completeCount);
            Assertions.assertEquals(0, encoder.received.size());
        }

        List<ByteBuffer> body = bulkBody(2000);
        drain(entity(body), new FakeEncoder(1000), body);
    }

    // Scenario 3: large buffers and the last buffer are written directly, without copying.
    @Test
    public void testLargeAndLastBuffersAreWrittenDirectly() throws IOException {
        ByteBuffer large = piece(20_000, 0);
        ByteBuffer last = piece(100, 1);
        List<ByteBuffer> body = Arrays.asList(large, last);

        FakeEncoder encoder = new FakeEncoder(Integer.MAX_VALUE);
        drain(entity(body), encoder, body);
        Assertions.assertEquals(Arrays.asList(20_000, 100), encoder.writeSizes);
        Assertions.assertSame(large.array(), encoder.writtenArrays.get(0));
        Assertions.assertSame(last.array(), encoder.writtenArrays.get(1));

        // The large buffer is only partially accepted, and resumed on the next event
        drain(entity(body), new FakeEncoder(1000), body);

        // A single small buffer never goes through staging
        ByteBuffer single = piece(200, 2);
        body = Collections.singletonList(single);
        encoder = new FakeEncoder(Integer.MAX_VALUE);
        drain(entity(body), encoder, body);
        Assertions.assertEquals(Collections.singletonList(200), encoder.writeSizes);
        Assertions.assertSame(single.array(), encoder.writtenArrays.get(0));

        assertUntouched(body);
    }

    // Scenario 4: small buffers are coalesced into full staging-size writes, in a single call while the encoder
    // accepts them.
    @Test
    public void testSmallBuffersAreCoalesced() throws IOException {
        List<ByteBuffer> body = bulkBody(2000);
        int total = concat(body).length;
        int expectedWrites = (total + MultiBufferEntity.STAGING_BUFFER_SIZE - 1) / MultiBufferEntity.STAGING_BUFFER_SIZE;

        FakeEncoder encoder = new FakeEncoder(Integer.MAX_VALUE);
        Assertions.assertEquals(1, drain(entity(body), encoder, body));
        Assertions.assertEquals(expectedWrites, encoder.writeSizes.size());
        for (int i = 0; i < expectedWrites - 1; i++) {
            Assertions.assertEquals(MultiBufferEntity.STAGING_BUFFER_SIZE, encoder.writeSizes.get(i));
        }

        assertUntouched(body);
    }

    @Test
    public void testRetryResendsFullBody() throws IOException {
        List<ByteBuffer> body = bulkBody(2000);
        MultiBufferEntity entity = entity(body);

        FakeEncoder failed = new FakeEncoder(1000);
        for (int i = 0; i < 3; i++) {
            failed.newEvent();
            entity.produceContent(failed, null);
        }
        entity.close();

        drain(entity, new FakeEncoder(1000), body);
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
     * Calls {@code produceContent()} once per output event until the encoder is completed, checks that the
     * received bytes are the body, and returns the number of output events.
     */
    private static int drain(MultiBufferEntity entity, FakeEncoder encoder, List<ByteBuffer> body) throws IOException {
        int events = 0;
        while (!encoder.isCompleted()) {
            Assertions.assertTrue(++events < 1_000_000, "no progress");
            encoder.newEvent();
            entity.produceContent(encoder, null);
        }
        Assertions.assertEquals(1, encoder.completeCount);
        Assertions.assertArrayEquals(concat(body), encoder.received.toByteArray());
        Assertions.assertArrayEquals(concat(body), IOUtils.toByteArray(entity.getContent()));
        return events;
    }

    /** An encoder accepting at most {@code bytesPerEvent} bytes per output event, like a socket that fills up. */
    private static class FakeEncoder implements ContentEncoder {
        private final int bytesPerEvent;
        private int bytesLeft;

        final ByteArrayOutputStream received = new ByteArrayOutputStream();
        final List<Integer> writeSizes = new ArrayList<>();
        final List<byte[]> writtenArrays = new ArrayList<>();
        int completeCount;

        FakeEncoder(int bytesPerEvent) {
            this.bytesPerEvent = bytesPerEvent;
            newEvent();
        }

        void newEvent() {
            bytesLeft = bytesPerEvent;
        }

        @Override
        public int write(ByteBuffer src) {
            Assertions.assertEquals(0, completeCount, "write after completion");
            int n = Math.min(src.remaining(), bytesLeft);
            if (n == 0) {
                return 0;
            }
            bytesLeft -= n;
            writeSizes.add(n);
            writtenArrays.add(src.array());
            received.write(src.array(), src.arrayOffset() + src.position(), n);
            src.position(src.position() + n);
            return n;
        }

        @Override
        public void complete() {
            completeCount++;
        }

        @Override
        public boolean isCompleted() {
            return completeCount > 0;
        }
    }
}
