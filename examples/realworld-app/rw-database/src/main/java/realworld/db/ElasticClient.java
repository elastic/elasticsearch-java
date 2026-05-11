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

package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

import static realworld.constant.Constants.*;

@Configuration
public class ElasticClient {

    @Value("${elasticsearch.server.url}")
    private String serverUrl;

    @Value("${elasticsearch.api.key}")
    private String apiKey;

    /**
     * Creates the ElasticsearchClient and the indexes needed
     *
     * @return a configured ElasticsearchClient
     */
    @Bean
    public ElasticsearchClient elasticRestClient() throws IOException {

        // Create the low-level client
        RestClient restClient = RestClient
            .builder(HttpHost.create(serverUrl))
            .setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "ApiKey " + apiKey)
            })
            .build();

        // The transport layer of the Elasticsearch client requires a json object mapper to
        // define how to serialize/deserialize java objects. The mapper can be customized by adding
        // modules, for example since the Article and Comment object both have Instant fields, the
        // JavaTimeModule is added to provide support for java 8 Time classes, which the mapper itself does
        // not support.
        ObjectMapper mapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();

        // Create the transport with the Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(
            restClient, new JacksonJsonpMapper(mapper));

        // Create the API client
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Creating the indexes
        createSimpleIndex(esClient, USERS);
        createIndexWithDateMapping(esClient, ARTICLES);
        createIndexWithDateMapping(esClient, COMMENTS);

        return esClient;
    }

    /**
     * Plain simple
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-index_.html">index</a>
     * creation with an
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-exists.html">
     * exists</a> check
     */
    private void createSimpleIndex(ElasticsearchClient esClient, String index) throws IOException {
        BooleanResponse indexRes = esClient.indices().exists(ex -> ex.index(index));
        if (!indexRes.value()) {
            esClient.indices().create(c -> c
                .index(index));
        }
    }

    /**
     * If no explicit mapping is defined, elasticsearch will dynamically map types when converting data to
     * the json
     * format. Adding explicit mapping to the date fields assures that no precision will be lost. More
     * information about
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/dynamic-field-mapping.html">dynamic
     * field mapping</a>, more on <a
     * href="https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-date-format
     * .html">mapping date
     * format </a>
     */
    private void createIndexWithDateMapping(ElasticsearchClient esClient, String index) throws IOException {
        BooleanResponse indexRes = esClient.indices().exists(ex -> ex.index(index));
        if (!indexRes.value()) {
            esClient.indices().create(c -> c
                .index(index)
                .mappings(m -> m
                    .properties("createdAt", p -> p
                        .date(d -> d.format("strict_date_optional_time")))
                    .properties("updatedAt", p -> p
                        .date(d -> d.format("strict_date_optional_time")))));

        }
    }
}
