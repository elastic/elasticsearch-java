
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
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.elasticsearch.ElasticsearchContainer;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.time.Duration;

import static realworld.constant.Constants.*;

@Configuration
public class ElasticClientTest {

    @Bean
    public ElasticsearchClient elasticRestClient() throws IOException {
        // Creating the testcontainer
        String image = "docker.elastic.co/elasticsearch/elasticsearch:8.11.4";
        ElasticsearchContainer container = new ElasticsearchContainer(image)
            .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
            .withEnv("path.repo", "/tmp") // for snapshots
            .withStartupTimeout(Duration.ofSeconds(30))
            .withPassword("changeme");
        container.start();

        // Connection settings
        int port = container.getMappedPort(9200);
        HttpHost host = new HttpHost("localhost", port, "https");
        SSLContext sslContext = container.createSslContextFromCa();

        BasicCredentialsProvider credsProv = new BasicCredentialsProvider();
        credsProv.setCredentials(
            AuthScope.ANY, new UsernamePasswordCredentials("elastic", "changeme")
        );

        // Building the rest client
        RestClient restClient = RestClient.builder(host)
            .setHttpClientConfigCallback(hc -> hc
                .setDefaultCredentialsProvider(credsProv)
                .setSSLContext(sslContext)
            )
            .build();
        ObjectMapper mapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();
        ElasticsearchTransport transport = new RestClientTransport(restClient,
            new JacksonJsonpMapper(mapper));
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // Creating the indexes
        createSimpleIndex(esClient, USERS);
        createIndexWithDateMapping(esClient, ARTICLES);
        createIndexWithDateMapping(esClient, COMMENTS);

        return esClient;
    }

    private void createSimpleIndex(ElasticsearchClient esClient, String index) throws IOException {
        BooleanResponse indexRes = esClient.indices().exists(ex -> ex.index(index));
        if (!indexRes.value()) {
            esClient.indices().create(c -> c
                .index(index));
        }
    }

    private void createIndexWithDateMapping(ElasticsearchClient esClient, String index) throws IOException {
        BooleanResponse indexRes = esClient.indices().exists(ex -> ex.index(index));
        if (!indexRes.value()) {
            esClient.indices().create(c -> c
                .index(index)
                .mappings(m -> m
                    .properties("createdAt", p -> p
                        .date(d -> d))
                    .properties("updatedAt", p -> p
                        .date(d -> d))));

        }
    }
}
