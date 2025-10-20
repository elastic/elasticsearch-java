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
package co.elastic.clients.transport.rest5_client.low_level.sniffer;

import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest5_client.low_level.RestClientTestCase;
import org.apache.hc.core5.http.HttpHost;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SnifferBuilderTests extends RestClientTestCase {

    @Test
    public void testBuild() throws Exception {
        int numNodes = randomIntBetween(1, 5);
        HttpHost[] hosts = new HttpHost[numNodes];
        for (int i = 0; i < numNodes; i++) {
            hosts[i] = new HttpHost("localhost", 9200 + i);
        }

        try (Rest5Client client = Rest5Client.builder(hosts).build()) {
            try {
                Sniffer.builder(null).build();
                fail("should have failed");
            } catch (NullPointerException e) {
                assertEquals("restClient cannot be null", e.getMessage());
            }

            try {
                Sniffer.builder(client).setSniffIntervalMillis(randomIntBetween(Integer.MIN_VALUE, 0));
                fail("should have failed");
            } catch (IllegalArgumentException e) {
                assertEquals("sniffIntervalMillis must be greater than 0", e.getMessage());
            }

            try {
                Sniffer.builder(client).setSniffAfterFailureDelayMillis(randomIntBetween(Integer.MIN_VALUE, 0));
                fail("should have failed");
            } catch (IllegalArgumentException e) {
                assertEquals("sniffAfterFailureDelayMillis must be greater than 0", e.getMessage());
            }

            try {
                Sniffer.builder(client).setNodesSniffer(null);
                fail("should have failed");
            } catch (NullPointerException e) {
                assertEquals("nodesSniffer cannot be null", e.getMessage());
            }

            try (Sniffer sniffer = Sniffer.builder(client).build()) {
                assertNotNull(sniffer);
            }

            SnifferBuilder builder = Sniffer.builder(client);
            if (getRandom().nextBoolean()) {
                builder.setSniffIntervalMillis(randomIntBetween(1, Integer.MAX_VALUE));
            }
            if (getRandom().nextBoolean()) {
                builder.setSniffAfterFailureDelayMillis(randomIntBetween(1, Integer.MAX_VALUE));
            }
            if (getRandom().nextBoolean()) {
                builder.setNodesSniffer(new MockNodesSniffer());
            }

            try (Sniffer sniffer = builder.build()) {
                assertNotNull(sniffer);
            }
        }
    }
}
