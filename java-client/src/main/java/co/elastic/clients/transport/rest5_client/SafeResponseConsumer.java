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

import co.elastic.clients.transport.rest5_client.low_level.HttpAsyncResponseConsumerFactory;
import co.elastic.clients.transport.rest5_client.low_level.RequestOptions;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.EntityDetails;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.apache.hc.core5.http.nio.CapacityChannel;
import org.apache.hc.core5.http.protocol.HttpContext;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * A response consumer that will propagate Errors as RuntimeExceptions to avoid crashing the IOReactor.
 */
public class SafeResponseConsumer<T> implements AsyncResponseConsumer<T> {

    private final AsyncResponseConsumer<T> delegate;

    public SafeResponseConsumer(AsyncResponseConsumer<T> delegate) {
        this.delegate = delegate;
    }

    /**
     * A consumer factory that safely wraps the one provided by {@code RequestOptions.DEFAULT}.
     */
    public static final HttpAsyncResponseConsumerFactory DEFAULT_FACTORY = () -> new SafeResponseConsumer<>(
        RequestOptions.DEFAULT.getHttpAsyncResponseConsumerFactory().createHttpAsyncResponseConsumer()
    );

    /**
     * Same as {@code RequestOptions.DEFAULT} with a safe consumer factory
     */
    public static final RequestOptions DEFAULT_REQUEST_OPTIONS = RequestOptions.DEFAULT
        .toBuilder()
        .setHttpAsyncResponseConsumerFactory(DEFAULT_FACTORY)
        .build();

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable thr) throws T {
        throw (T) thr;
    }

    @Override
    public void consumeResponse(HttpResponse response, EntityDetails entityDetails, HttpContext context,
                                FutureCallback<T> resultCallback) {
        try {
            delegate.consumeResponse(response, entityDetails, context, resultCallback);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error consuming response", e);
        }
    }

    @Override
    public void informationResponse(HttpResponse response, HttpContext context) {
        try {
            delegate.informationResponse(response, context);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error information response", e);
        }
    }

    @Override
    public void failed(Exception cause) {
        try {
            delegate.failed(cause);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error handling failure", e);
        }
    }

    @Override
    public void updateCapacity(CapacityChannel capacityChannel) {
        try {
            delegate.updateCapacity(capacityChannel);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error updating capacity", e);
        }
    }

    @Override
    public void consume(ByteBuffer src) {
        try {
            delegate.consume(src);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error consuming data", e);
        }
    }

    @Override
    public void streamEnd(List<? extends Header> trailers) {
        try {
            delegate.streamEnd(trailers);
        } catch (Exception e) {
            throwUnchecked(e);
        } catch (Throwable e) {
            throw new RuntimeException("Error triggering stream end", e);
        }
    }

    @Override
    public void releaseResources() {
        delegate.releaseResources();
    }
}
