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

package co.elastic.clients.elasticsearch.experiments;


import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._global.SearchResponse;
import co.elastic.clients.elasticsearch.indices.CreateResponse;
import co.elastic.clients.elasticsearch.indices.GetResponse;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

import java.io.IOException;
import java.time.Duration;

public class RequestTest extends Assert {

    private static ElasticsearchContainer container;

    @BeforeClass
    public static void setup() {
        container = new ElasticsearchContainer("docker.elastic.co/elasticsearch/elasticsearch:7.12.1")
            .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
            .withStartupTimeout(Duration.ofSeconds(30));
        container.start();

    }

    @AfterClass
    public static void tearDown() {
        if (container != null) {
            container.stop();
        }
    }

    @Test
    public void testInitialConnection() throws IOException {
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        Transport transport = new Transport(restClient);
        ElasticsearchClient client = new ElasticsearchClient(transport);

        assertTrue(client.ping().value());

        final CreateResponse createResponse = client.indices().create(b -> b.index("my-index"));
        assertTrue(createResponse.acknowledged());
        assertTrue(createResponse.shardsAcknowledged());

        final GetResponse hasIndex = client.indices().get(b -> b.index("my-index"));
        assertFalse(hasIndex.value().isEmpty());
    }

    @Test
    public void someTest() throws Exception {

        // Create the low-level client
        RestClient restClient = RestClient.builder(new HttpHost("localhost", container.getMappedPort(9200))).build();
        // Build the high-level client
        Transport transport = new Transport(restClient);


        ElasticsearchClient client = new ElasticsearchClient(transport);

        // Create an index
        CreateResponse createIndexResponse = client.indices().create(b -> b
            .index("test")
            .includeTypeName(true)
        );

        assertEquals("test", createIndexResponse.index());

        // Check that it actually exists. Example of a boolean response
        BooleanResponse existsResponse = client.indices().exists(b -> b.index("test"));
        assertTrue(existsResponse.value());

        // Would be nice to have index tagged as "preferred field" to generate this:
        // BooleanResponse existsResponse = client.indices().exists("test");

        // Search, adding some options
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
            .addHeader("x-super-header", "bar")
            .build();

        SearchResponse<String> search = client
            .withRequestOptions(options)
            .search(b -> b
                .index("test")//, "foo", "bar")
                .allowNoIndices(true)
                .explain(true),
                String.class
        );

        System.out.println(search.hits().total().asJsonObject().getInt("value") + " hits");


    }
}
