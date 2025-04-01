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

import co.elastic.clients.transport.rest5_client.low_level.Node;
import org.apache.hc.core5.http.HttpHost;

import java.util.Collections;
import java.util.List;

/**
 * Mock implementation of {@link NodesSniffer}. Useful to prevent any connection attempt while testing builders etc.
 */
class MockNodesSniffer implements NodesSniffer {
    @Override
    public List<Node> sniff() {
        return Collections.singletonList(new Node(new HttpHost("localhost", 9200)));
    }
}
