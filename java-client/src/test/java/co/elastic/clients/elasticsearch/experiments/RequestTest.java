/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
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


import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._global.SearchResponse;
import co.elastic.clients.elasticsearch.indices.CreateResponse;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.junit.Test;

import javax.json.JsonValue;

public class RequestTest {

    @Test
    public void someTest() throws Exception {

        // Create the low-level client
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        // Build the high-level client
        ElasticsearchClient client = new ElasticsearchClient(restClient);

        SearchResponse search = client.search(s -> s
            .index("test-index")
        );

        if (search.hits().hits().isEmpty()) {
            System.out.println("No match");
        } else {
            //...
        }

        client.indices().create(b -> b
            .index("foo")
            .settings(null)
        );


        // Create an index
        CreateResponse createIndexResponse = client.indices().create(b -> b
            .index("test")
            .includeTypeName(true)
        );

        String created = createIndexResponse.index();

        // Search, adding some options
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
            .addHeader("x-super-header", "bar")
            .build();

        SearchResponse search = client
            .withRequestOptions(options)
            .search(b -> b
                .index("test", "foo", "bar")
                .allowNoIndices(true)
                .index("blah")
                .addIndex("foo")
                .addIndex("bar")
                .addRescore(rb -> rb.windowSize(1))
                .explain(true)
        );

        client.search(__ -> __
            .fields((JsonValue) null));

        System.out.println(search.hits().total().asJsonObject().getInt("value") + " hits");


    }
}
