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

package co.elastic.clients.transport.endpoints;

import java.io.IOException;
import java.io.InputStream;

/**
 * Response for API endpoints that return non-JSON content.
 * <p>
 * <b>Note</b>: binary responses hold a reference to the transport layer's response body. As such, they must be closed
 * to ensure that any associated resources are released. Alternatively you can also close the {@link #content()} stream.
 */
public interface BinaryResponse extends AutoCloseable {

    /**
     * The response content type. If not known, defaults to {@code application/octet-stream}.
     */
    String contentType();

    /**
     * The content length, or {@code -1} if not known.
     */
    long contentLength();

    /**
     * The response body. This method can be called only once and will throw an {@link IllegalStateException} on subsequent calls.
     * <p>
     * Calling {@link InputStream#close()} on the result has the same effect as calling {@link #close()} on this object.
     *
     * @throws IOException if the stream could not be created
     * @throws IllegalStateException if this method has already been called
     */
    InputStream content() throws IOException;

    /**
     * Releases any resources associated with this response.
     */
    @Override
    void close() throws IOException;
}
