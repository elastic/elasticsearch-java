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
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransportBodyResponseException extends TransportException {

    private String originalBody;

    public TransportBodyResponseException(InputStream originalBody,TransportHttpClient.Response response, String message, String endpointId,
                              Throwable cause) {
        super(response, message, endpointId, cause);
        try {
            if (originalBody != null) {
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(originalBody));
                String read;

                while ((read=br.readLine()) != null) {
                    sb.append(read);
                }

                br.close();
                this.originalBody = sb.toString();
                // Closing original body input stream
                originalBody.close();
            }

            // Make sure the response is closed to free up resources.
            response.close();
        } catch (Exception e) {
            this.addSuppressed(e);
        }
    }

    /**
     * The original response body, before json deserialization.
     */
    @Nullable
    public String originalBody() {
        return originalBody;
    }
}
