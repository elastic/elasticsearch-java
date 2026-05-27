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
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BufferedByteConsumerTest extends RestClientTestCase {

     @Test
     void testConstructor() {
         assertThrows(IllegalArgumentException.class, () -> new BufferedByteConsumer(0));
         assertThrows(IllegalArgumentException.class, () -> new BufferedByteConsumer(-1));
     }

     @Test
     void testCapacityIncrement() {
         int bufferLimit = 1024;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);
         assertEquals(bufferLimit, consumer.capacityIncrement());
     }

     @Test
     void testContentTooLongException() {
         int bufferLimit = 10;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         // Start the stream
         consumer.streamStart(null, null);

         // Try to add data that exceeds the limit
         byte[] data = "This is a long string that exceeds the buffer limit".getBytes(StandardCharsets.UTF_8);
         ByteBuffer buffer = ByteBuffer.wrap(data);

         ContentTooLongException exception = assertThrows(ContentTooLongException.class, () -> {
             consumer.data(buffer, false);
         });
         assertEquals("entity content is too long [51] for the configured buffer limit [10]", exception.getMessage());
     }

    @Test
    void testContentTooLongExceptionWithTwoCalls() {
        int bufferLimit = 100;
        BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

        // Start the stream
        consumer.streamStart(null, null);

        // Try to add data that exceeds the limit
        byte[] data = "This is a long string that exceeds the buffer limit".getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.wrap(data);

        ContentTooLongException exception = assertThrows(ContentTooLongException.class, () -> {
            consumer.data(buffer, false);
            consumer.data(buffer, false); // This should trigger the exception on the second call
        });
        assertEquals("entity content is too long [102] for the configured buffer limit [100]", exception.getMessage());
    }

     @Test
     void testContentTooLongExceptionWithCallback() throws Exception {
         int bufferLimit = 10;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         TestFutureCallback callback = new TestFutureCallback();
         consumer.streamStart(null, callback);

         // Try to add data that exceeds the limit
         byte[] data = "This is a long string that exceeds the buffer limit".getBytes(StandardCharsets.UTF_8);
         ByteBuffer buffer = ByteBuffer.wrap(data);

         try {
             consumer.data(buffer, false);
             fail("Expected ContentTooLongException");
         } catch (ContentTooLongException e) {
             // Verify the exception message contains the expected values
             assertTrue(e.getMessage().contains("entity content is too long"));
             assertTrue(e.getMessage().contains(String.valueOf(bufferLimit)));
         }
     }

     @Test
     void testSuccessfulDataConsumption() throws Exception {
         int bufferLimit = 100;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         TestFutureCallback callback = new TestFutureCallback();
         consumer.streamStart(null, callback);

         // Add data within the limit
         byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
         ByteBuffer buffer = ByteBuffer.wrap(data);

         consumer.data(buffer, true);
         consumer.completed();

         // Verify the callback was called successfully
         assertTrue(callback.isCompleted());
         assertFalse(callback.isFailed());
         assertNotNull(consumer.getContent());
     }

     @Test
     void testContentAtExactLimit() throws Exception {
         int bufferLimit = 13;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         consumer.streamStart(null, null);

         // Add data exactly at the limit
         byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
         ByteBuffer buffer = ByteBuffer.wrap(data);

         // Should not throw exception
         assertDoesNotThrow(() -> consumer.data(buffer, true));
     }

     @Test
     void testContentJustOverLimit() throws Exception {
         int bufferLimit = 12;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         consumer.streamStart(null, null);

         // Add data just over the limit
         byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
         ByteBuffer buffer = ByteBuffer.wrap(data);

         assertThrows(ContentTooLongException.class, () -> consumer.data(buffer, true));
     }

     @Test
     void testFailedCallback() {
         int bufferLimit = 100;
         BufferedByteConsumer consumer = new BufferedByteConsumer(bufferLimit);

         TestFutureCallback callback = new TestFutureCallback();
         consumer.streamStart(null, callback);

         Exception testException = new RuntimeException("Test exception");
         consumer.failed(testException);

         assertTrue(callback.isFailed());
         assertEquals(testException, callback.getException());
     }

     private static class TestFutureCallback implements FutureCallback<ByteArrayEntity> {
         private boolean completed = false;
         private boolean failed = false;
         private ByteArrayEntity result;
         private Exception exception;

         @Override
         public void completed(ByteArrayEntity result) {
             this.completed = true;
             this.result = result;
         }

         @Override
         public void failed(Exception ex) {
             this.failed = true;
             this.exception = ex;
         }

         @Override
         public void cancelled() {
             // Not used in tests
         }

         public boolean isCompleted() {
             return completed;
         }

         public boolean isFailed() {
             return failed;
         }

         public ByteArrayEntity getResult() {
             return result;
         }

         public Exception getException() {
             return exception;
         }
     }

}