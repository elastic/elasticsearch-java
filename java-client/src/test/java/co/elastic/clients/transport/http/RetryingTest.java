package co.elastic.clients.transport.http;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.BackoffPolicy;

import java.net.SocketException;
import java.util.List;
import java.util.Set;

public class RetryingTest {

    public static void main(String[] args) {
        String serverUrl = "http://localhost:9200";
        String apikey = "wrong";

        try (ElasticsearchClient client = ElasticsearchClient.of(e -> e
            .host(serverUrl)
            .apiKey(apikey)
            .retryConfig(r -> r
                .backoffPolicy(BackoffPolicy.constantBackoff(5000L,5))
            )
        )) {
            client
                .withTransportOptions(t -> t.retryConfig(r -> r.backoffPolicy(BackoffPolicy.noBackoff())))
                .ping();
        }
        catch (Exception e) {
            //
        }
    }
}
