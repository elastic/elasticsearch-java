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

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.nio.ContentDecoder;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.protocol.HttpAsyncResponseConsumer;
import org.apache.http.protocol.HttpContext;
import org.elasticsearch.client.HttpAsyncResponseConsumerFactory;
import org.elasticsearch.client.RequestOptions;

import java.io.IOException;

/**
 * A response consumer that will propagate Errors as RuntimeExceptions to avoid crashing the IOReactor.
 */
public class SafeResponseConsumer<T> implements HttpAsyncResponseConsumer<T> {

    private final HttpAsyncResponseConsumer<T> delegate;

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

    public SafeResponseConsumer(HttpAsyncResponseConsumer<T> delegate) {
        this.delegate = delegate;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable thr) throws T {
        throw (T) thr;
    }

    @Override
    public void responseReceived(HttpResponse response) throws IOException, HttpException {
        try {
            delegate.responseReceived(response);
        } catch(Exception e) {
            throwUnchecked(e);
        } catch(Throwable e) {
            throw new RuntimeException("Error receiving response", e);
        }
    }

    @Override
    public void consumeContent(ContentDecoder decoder, IOControl ioControl) throws IOException {
        try {
            delegate.consumeContent(decoder, ioControl);
        } catch(Exception e) {
            throwUnchecked(e);
        } catch(Throwable e) {
            throw new RuntimeException("Error consuming content", e);
        }
    }

    @Override
    public void responseCompleted(HttpContext context) {
        try {
            delegate.responseCompleted(context);
        } catch(Exception e) {
            throwUnchecked(e);
        } catch(Throwable e) {
            throw new RuntimeException("Error completing response", e);
        }
    }

    @Override
    public void failed(Exception ex) {
        try {
            delegate.failed(ex);
        } catch(Exception e) {
            throwUnchecked(e);
        } catch(Throwable e) {
            throw new RuntimeException("Error handling failure", e);
        }
    }

    @Override
    public Exception getException() {
        return delegate.getException();
    }

    @Override
    public T getResult() {
        return delegate.getResult();
    }

    @Override
    public boolean isDone() {
        return delegate.isDone();
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }

    @Override
    public boolean cancel() {
        return delegate.cancel();
    }
}
