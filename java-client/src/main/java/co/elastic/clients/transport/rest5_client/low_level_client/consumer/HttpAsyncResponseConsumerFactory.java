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
package co.elastic.clients.transport.rest5_client.low_level_client.consumer;

import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.apache.hc.core5.http.nio.support.AbstractAsyncResponseConsumer;

import static org.elasticsearch.client.utils.Constants.DEFAULT_BUFFER_LIMIT;

/**
 * Factory used to create instances of {@link AsyncResponseConsumer}. Each request retry needs its own
 * instance of the
 * consumer object. Users can implement this interface and pass their own instance to the specialized
 * performRequest methods that accept an {@link HttpAsyncResponseConsumerFactory} instance as argument.
 */
public interface HttpAsyncResponseConsumerFactory {

    /**
     * Creates the default type of {@link AsyncResponseConsumer},
     * with a buffered consumer with a  limit of 100MB.
     */
    HttpAsyncResponseConsumerFactory DEFAULT =
        new BasicAsyncResponseConsumerFactory(DEFAULT_BUFFER_LIMIT);

    /**
     * Creates the {@link AbstractAsyncResponseConsumer}, called once per request attempt.
     */
    AsyncResponseConsumer<ClassicHttpResponse> createHttpAsyncResponseConsumer();

    /**
     * Default factory used to create instances of {@link AsyncResponseConsumer}.
     * Creates one instance of {@link BasicAsyncResponseConsumer} for each request attempt, with a
     * configurable
     * buffer limit which defaults to 100MB.
     */
    class BasicAsyncResponseConsumerFactory implements HttpAsyncResponseConsumerFactory {

        private final int bufferLimit;

        public BasicAsyncResponseConsumerFactory(int bufferLimit) {
            this.bufferLimit = bufferLimit;
        }

        @Override
        public AsyncResponseConsumer<ClassicHttpResponse> createHttpAsyncResponseConsumer() {
            return new BasicAsyncResponseConsumer(new BufferedByteConsumer(bufferLimit));
        }
    }
}
