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

import co.elastic.clients.elasticsearch.core.ExistsRequest;
import co.elastic.clients.elasticsearch.logstash.PutPipelineRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanEndpointTest extends Assertions {

    @Test
    public void testHasRequestBody() {
        assertFalse(ExistsRequest._ENDPOINT.hasRequestBody());
        assertTrue(PutPipelineRequest._ENDPOINT.hasRequestBody());
    }
}
