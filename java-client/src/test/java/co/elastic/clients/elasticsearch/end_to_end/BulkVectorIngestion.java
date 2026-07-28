package co.elastic.clients.elasticsearch.end_to_end;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._helpers.bulk.BulkIngester;

import java.io.IOException;
import java.util.List;

public class BulkVectorIngestion {

    public record JsonVector(String text, float[] emb) {
    }

    private static final List<JsonVector> DOCS = List.of(
        new JsonVector("First document", new float[]{0.1f, 0.2f, 0.3f}),
        new JsonVector("Second document", new float[]{0.4f, 0.5f, 0.6f}),
        new JsonVector("3", new float[]{0.7f, 0.8f, 0.9f})
    );

    public static void main(String[] args) throws IOException {

        try (ElasticsearchClient esClient = ElasticsearchClient.of(e -> e.host("host").apiKey("apikey"));
             BulkIngester<Void> ingester = BulkIngester.of(b -> b.client(esClient))) {

            esClient.indices().create(c -> c
                .index("vector-index")
                .mappings(m -> m
                    .properties("emb", p -> p.denseVector(t -> t))
                )
            );

            DOCS.forEach(doc -> ingester.add(op -> op
                .index(idx -> idx
                    .index("vector-index")
                    .document(doc)
                )
            ));
        }
    }
}
