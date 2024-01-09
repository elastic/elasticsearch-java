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

@Configuration
public class ElasticClient {

    @Value("${elasticsearch.server.url}")
    private String serverUrl;

    @Value("${elasticsearch.api.key}")
    private String apiKey;

    @Bean
    public ElasticsearchClient elasticRestClient() throws IOException {

        // Create the low-level client
        RestClient restClient = RestClient
                .builder(HttpHost.create(serverUrl))
                .setDefaultHeaders(new Header[] {
                        new BasicHeader("Authorization", "ApiKey " + apiKey)
                })
                .build();

        ObjectMapper mapper = JsonMapper.builder() // or different mapper for other format
                .addModule(new JavaTimeModule())
                // and possibly other configuration, modules, then:
                .build();

        // Create the transport with a Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper(mapper));

        // And create the API client
        ElasticsearchClient esClient = new ElasticsearchClient(transport);

        // check and/or create indexes

        // TODO remove, for testing
//        esClient.indices().delete(del -> del
//                .ignoreUnavailable(true)
//                .index("users"));
//
//                esClient.indices().delete(del -> del
//                .ignoreUnavailable(true)
//                .index("articles"));

        BooleanResponse indexResU = esClient.indices().exists(ex -> ex.index("users")); //TODO constant
        if (!indexResU.value()) {
            esClient.indices().create(c -> c
                    .index("users"));
        }

        BooleanResponse indexResA = esClient.indices().exists(ex -> ex.index("articles")); //TODO constant
        if (!indexResA.value()) {
            esClient.indices().create(c -> c
                    .index("articles"));
        }

        BooleanResponse indexResC = esClient.indices().exists(ex -> ex.index("comments")); //TODO constant
        if (!indexResC.value()) {
            esClient.indices().create(c -> c
                    .index("comments"));
        }

        return esClient;

    }
}
