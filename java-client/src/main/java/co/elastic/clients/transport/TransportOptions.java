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

package co.elastic.clients.transport;

import co.elastic.clients.util.ObjectBuilder;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Container for all application-specific or request-specific options, including headers, query parameters and warning handlers.
 */
public interface TransportOptions {

    Collection<Map.Entry<String, String>> headers();

    Map<String, String> queryParameters();

    Function<List<String>, Boolean> onWarnings();

    void updateToken(String token);

    /**
     * If {@code true}, the response body in {@code TransportException.response().body()} is guaranteed to be
     * replayable (i.e. buffered), even if the original response was streamed. This allows inspecting the
     * response body in case of error.
     */
    boolean keepResponseBodyOnException();

    Builder toBuilder();

    default TransportOptions with(Consumer<Builder> fn) {
        Builder builder = toBuilder();
        fn.accept(builder);
        return builder.build();
    }

    interface Builder extends ObjectBuilder<TransportOptions> {

        Builder addHeader(String name, String value);

        Builder setHeader(String name, String value);

        Builder removeHeader(String name);

        Builder setParameter(String name, String value);

        Builder removeParameter(String name);

        Builder onWarnings(Function<List<String>, Boolean> listener);

        /**
         * Should the response body be buffered and made available in {@code TransportException.response().body()}?
         * This setting guarantees that the response body is buffered for inspection if parsing fails, even if originally
         * streamed by the http library.
         */
        Builder keepResponseBodyOnException(boolean value);
    }
}
