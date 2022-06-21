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

package co.elastic.clients.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;

public class LazyDeserializerTest extends Assertions {

    @Test
    public void testConcurrentInit() throws Exception {
        // See https://github.com/elastic/elasticsearch-java/issues/58

        final LazyDeserializer<String> ld = new LazyDeserializer<>(JsonpDeserializer::stringDeserializer);

        CompletableFuture<JsonpDeserializer<String>> fut1;
        CompletableFuture<JsonpDeserializer<String>> fut2;

        // Lock the mutex and start 2 threads that will compete for it.
        synchronized (ld) {
            fut1 = futureUnwrap(ld);
            fut2 = futureUnwrap(ld);
        }

        // We should see the same non-null results everywhere
        assertNotNull(fut1.get());
        assertNotNull(fut2.get());

        final JsonpDeserializer<String> unwrapped = ld.unwrap();
        assertEquals(unwrapped, fut1.get());
        assertEquals(unwrapped, fut2.get());

    }

    private CompletableFuture<JsonpDeserializer<String>> futureUnwrap(LazyDeserializer<String> d) {

        final CompletableFuture<JsonpDeserializer<String>> result = new CompletableFuture<>();

        new Thread(() -> {
            try {
                result.complete(d.unwrap());
            } catch (Throwable e) {
                result.completeExceptionally(e);
            }
        }).start();

        return result;
    }
}
