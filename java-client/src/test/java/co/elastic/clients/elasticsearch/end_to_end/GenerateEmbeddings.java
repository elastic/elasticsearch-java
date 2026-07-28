package co.elastic.clients.elasticsearch.end_to_end;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._helpers.bulk.BulkIngester;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GenerateEmbeddings {

    private static final List<String> TEXTS = List.of(
        "Yellowstone National Park spans Wyoming, Montana, and Idaho, covering over 2.2 million acres. It is famous for the geyser Old Faithful and sits atop the Yellowstone Caldera, a supervolcano.",
        "Yosemite National Park covers over 750,000 acres in California. A UNESCO World Heritage Site, it is best known for its granite cliffs, waterfalls, and giant sequoia trees.",
        "Rocky Mountain National Park is known for its mountainous terrain, including Longs Peak, the highest in the park. It is a popular destination for hiking, camping, and wildlife viewing."
    );

    public static void main(String[] args) throws IOException {

        try (ElasticsearchClient esClient = ElasticsearchClient.of(e -> e.host("host").apiKey("apikey"));
             BulkIngester<Void> ingester = BulkIngester.of(b -> b.client(esClient))) {

            esClient.indices().create(c -> c
                .index("my_semantic_vectors")
                .mappings(m -> m
                    .properties("text", p -> p.semanticText(t -> t))
                )
            );

            TEXTS.forEach(text -> ingester.add(op -> op
                .index(i -> i
                    .index("my_semantic_vectors")
                    .document(Map.of("text", text))
                )
            ));
        }
    }
}
