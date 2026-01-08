package co.elastic.clients.elasticsearch._helpers.vector;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Base64VectorTest {

    static ElasticsearchClient elasticsearchClient;
    private static final String INDEX = "vec-64-ingest-test";

    @BeforeAll
    public static void setup() {
        var server = ElasticsearchTestServer.global();
        elasticsearchClient = ElasticsearchTestClient.createClient(server.url(), new JacksonJsonpMapper(),
            server.sslContext(), null);
    }

    @Test
    public void oneBase64VectorIngestTest() throws IOException {
        // Reading one example vector from file
        InputStream input = this.getClass()
            .getResourceAsStream("just-1-vector.json");

        ObjectMapper mapper = new ObjectMapper();
        JsonVector vectorDoc = mapper.readerFor(JsonVector.class).readValue(input);

        // Converting vector from array of floats to base64 using utility class
        CustomVectorDoc customVectorDoc = new CustomVectorDoc(vectorDoc.docid(),vectorDoc.title(), vectorDoc.text(), vectorDoc.emb());

        // Or, alternatively, explicitly use the setVector() method provided by AbstractBase64VectorDocument
        // CustomVectorDoc customVectorDocAlt = new CustomVectorDoc(vectorDoc.docid(),vectorDoc.title(), vectorDoc.text());
        // customVectorDocAlt.setVector(vectorDoc.emb());

        // Creating index explicitly indicating that the "vector" field will be of type dense vector
        // While usually elasticsearch is able to autodetect the field type when automatically creating an index,
        // in this specific case when using base64 string to represent vectors, it's necessary to manually map the
        // vector field as dense vector.
        if (elasticsearchClient.indices().exists(e -> e.index(INDEX)).value()) {
            elasticsearchClient.indices().delete(d -> d.index(INDEX));
            elasticsearchClient.indices().create(c -> c.index(INDEX)
                .withJson(new StringReader("{\n" +
                                           "    \"mappings\": {\n" +
                                           "      \"properties\": {\n" +
                                           "        \"text\": {\n" +
                                           "          \"type\": \"text\",\n" +
                                           "          \"fields\": {\n" +
                                           "            \"keyword\": {\n" +
                                           "              \"type\": \"keyword\",\n" +
                                           "              \"ignore_above\": 256\n" +
                                           "            }\n" +
                                           "          }\n" +
                                           "        },\n" +
                                           "        \"vector\": {\n" +
                                           "          \"type\": \"dense_vector\",\n" +
                                           "          \"dims\": 1536,\n" +
                                           "          \"index\": true,\n" +
                                           "          \"similarity\": \"cosine\",\n" +
                                           "          \"index_options\": {\n" +
                                           "            \"type\": \"flat\"\n" +
                                           "          }\n" +
                                           "        }\n" +
                                           "      }\n" +
                                           "    }\n" +
                                           "}")));
            elasticsearchClient.indices().refresh();
        }

        // Indexing the vector
        elasticsearchClient.index(i -> i
            .index(INDEX)
            .document(customVectorDoc)
        );

        // Refreshing to make sure we can query the vector
        elasticsearchClient.indices().refresh();

        // Asserting exactly 1 vector has been ingested
        assertEquals(1L, elasticsearchClient.indices().stats().all().total().docs().count());

        // Asserting vector can be deserialized
        SearchResponse<CustomVectorDoc> resp = elasticsearchClient.search(s -> s.index(INDEX),
            CustomVectorDoc.class);

        assertEquals(customVectorDoc.getVector(),resp.hits().hits().get(0).source().getVector());

        // Cleanup
        elasticsearchClient.indices().delete(d -> d.index(INDEX));
    }
}
