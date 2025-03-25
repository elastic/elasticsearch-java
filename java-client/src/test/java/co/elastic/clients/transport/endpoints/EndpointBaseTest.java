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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.core.PingRequest;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.transport.Endpoint;
import org.junit.jupiter.api.Test;

public class EndpointBaseTest extends ModelTestCase {

    @Test
    public void testPathEncoding() {
        assertEquals("abCD12;-_*", pathEncode("abCD12;-_*"));
        assertEquals("XYZ%5B", pathEncode("XYZ["));
        assertEquals("xyz%7B", pathEncode("xyz{"));
        assertEquals("foo%2Fbar", pathEncode("foo/bar"));
        assertEquals("foo%20bar", pathEncode("foo bar"));
        assertEquals("f%C3%AAl%C3%A9", pathEncode("fêlé"));
    }

    private String pathEncode(String s) {
        StringBuilder sb = new StringBuilder();
        EndpointBase.pathEncode(s, sb);
        return sb.toString();
    }

    @Test
    public void testErrorDecoding() {
        Endpoint<PingRequest, BooleanResponse, ErrorResponse> endpoint = PingRequest._ENDPOINT;

        {
            String json = "{\"error\":\"some error\"}";

            ErrorResponse response = fromJson(json, endpoint.errorDeserializer(404));
            assertEquals(404, response.status());
            assertEquals("some error", response.error().reason());
            assertEquals("http_status_404", response.error().type());
        }

        {
            String json = "{\"status\":401,\"error\":{\"type\":\"the_error_type\",\"reason\":\"some error\"}}";

            ErrorResponse response = fromJson(json, endpoint.errorDeserializer(404));
            assertEquals(401, response.status()); // value in response body has precedence
            assertEquals("some error", response.error().reason());
            assertEquals("the_error_type", response.error().type());
        }
    }
}
