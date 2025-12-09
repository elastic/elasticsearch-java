package co.elastic.clients;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MainCommonBenchmark {

    public static List<ElasticsearchDoc> readMultipleObjects(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        try (MappingIterator<ElasticsearchDoc> it =
                 mapper.readerFor(ElasticsearchDoc.class).readValues(file)) {
            List<ElasticsearchDoc> list = new ArrayList<>();
            while (it.hasNext()) {
                list.add(it.next());
            }
            return list;
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File(""); // TODO test file

        List<ElasticsearchDoc> docs = readMultipleObjects(file);

        // 9.3 local
        String serverUrl = "http://localhost:9200";
        String APIkey = ""; // TODO Apikey

        try (ElasticsearchClient elasticsearchClient =
                 ElasticsearchClient.of(e -> e.host(serverUrl).apiKey(APIkey))) {

            Instant start = Instant.now();
            System.out.println("Starting bulk operations... \n");

            List<BulkOperation> bulkOperations = new ArrayList<>();

            for (ElasticsearchDoc doc : docs) {

                BulkOperation op = BulkOperation.of(o -> o
                    .index(idx -> idx
                        .index("vec-test")
                        .document(doc)
                    )
                );
                bulkOperations.add(op);
                if (bulkOperations.size() >= 100) {  // TODO choose chunk size
                    List<BulkOperation> finalBulkOperations = bulkOperations;
                    BulkRequest request = BulkRequest.of(b -> b.operations(finalBulkOperations));
                    elasticsearchClient.bulk(request);
                    bulkOperations = new ArrayList<>();
                }
            }

            Instant end = Instant.now();

            System.out.println("Finished in: " + Duration.between(start, end).toMillis() + "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
