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

import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentTooLongException;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.apache.hc.core5.http.nio.ContentDecoder;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

import static org.mockito.Mockito.mock;

public class BasicAsyncResponseConsumerTests extends RestClientTestCase {

    // maximum buffer that this test ends up allocating is 50MB
    private static final int MAX_TEST_BUFFER_SIZE = 50 * 1024 * 1024;

    @Test
    public void testResponseProcessing() throws Exception {
        ContentDecoder contentDecoder = mock(ContentDecoder.class);
        HttpContext httpContext = mock(HttpContext.class);

        AsyncResponseConsumer<ClassicHttpResponse> consumer =
            new HttpAsyncResponseConsumerFactory.BasicAsyncResponseConsumerFactory(MAX_TEST_BUFFER_SIZE)
                .createHttpAsyncResponseConsumer();

        BasicClassicHttpResponse httpResponse = new BasicClassicHttpResponse(200, "OK");
        ByteArrayEntity entity = new ByteArrayEntity("test".getBytes(), ContentType.APPLICATION_JSON);
        httpResponse.setEntity(entity);

        // everything goes well, no exception thrown
        consumer.consumeResponse(httpResponse, entity, httpContext, null);
        consumer.consume(ByteBuffer.wrap("test".getBytes()));
    }

    @Test
    public void testBufferLimit() throws Exception {
        HttpContext httpContext = mock(HttpContext.class);

        AsyncResponseConsumer<ClassicHttpResponse> consumer =
            new HttpAsyncResponseConsumerFactory.BasicAsyncResponseConsumerFactory(MAX_TEST_BUFFER_SIZE)
                .createHttpAsyncResponseConsumer();

        ByteArrayEntity entity = new ByteArrayEntity("test".getBytes(), ContentType.APPLICATION_JSON);
        BasicClassicHttpResponse httpResponse = new BasicClassicHttpResponse(200, "OK");
        httpResponse.setEntity(entity);

        // should throw exception
        consumer.consumeResponse(httpResponse, entity, httpContext, null);
        Assert.assertThrows(ContentTooLongException.class,
            () -> consumer.consume(ByteBuffer.allocate(MAX_TEST_BUFFER_SIZE + 1)));
    }
}
