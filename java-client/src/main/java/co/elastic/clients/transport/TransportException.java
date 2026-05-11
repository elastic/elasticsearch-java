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

import co.elastic.clients.transport.http.TransportHttpClient;

import javax.annotation.Nullable;
import java.io.IOException;

public class TransportException extends IOException {

    private final String endpointId;
    private final TransportHttpClient.Response response;

    public TransportException(TransportHttpClient.Response response, String message, String endpointId) {
        this(response, message, endpointId, null);
    }

    public TransportException(TransportHttpClient.Response response, String message, String endpointId, Throwable cause) {
        super(
            "node: " + response.node() + ", status: " + response.statusCode() + ", " +
            (endpointId == null ? message : "[" + endpointId + "] " + message),
            cause
        );
        this.response = response;
        this.endpointId = endpointId;

        // Make sure the response is closed to free up resources.
        try {
            response.close();
        } catch (Exception e) {
            this.addSuppressed(e);
        }
    }

    /**
     * Status code returned by the http resquest
     */
    public int statusCode() {
        return response.statusCode();
    }

    /**
     * Identifier of the API endpoint that caused the exception, if known.
     */
    @Nullable
    public String endpointId() {
        return endpointId;
    }

    public TransportHttpClient.Response response() {
        return response;
    }
}
