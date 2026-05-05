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

package co.elastic.clients.elasticsearch.experiments.benchmark.base64vectors;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.ElasticsearchTestServer;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/*
This test compares the speed of serializing and sending vectors to the server
between the standard array of floats and the new base64 format introduced in 9.3
*/
@Disabled
public class MainCommonBenchmark64 {

    static ElasticsearchClient elasticsearchClient;

    @BeforeAll
    public static void setup() {
        elasticsearchClient = ElasticsearchTestServer.global().client();
    }

    public static List<ElasticsearchDoc> readMultipleObjects(InputStream file) throws IOException {
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


    public static String convertToBase64Bytes(float[] vec) {
        ByteBuffer buff = ByteBuffer.allocate(Float.BYTES * vec.length);
        for (int i = 0; i < vec.length; i++) {
            buff.putFloat(vec[i]);
        }
        return Base64.getEncoder().encodeToString(buff.array());
    }

    @Test
    public void benchmark20k() throws IOException {

        InputStream input = this.getClass()
            .getResourceAsStream("open_ai_corpus-initial-indexing-1k.json");

        List<ElasticsearchDoc> docs = readMultipleObjects(input);

        // warmup round
        List<BulkOperation> bulkOperations = new ArrayList<>();
        for (ElasticsearchDoc doc : docs) {

            BulkOperation op = BulkOperation.of(o -> o
                .index(idx -> idx
                    .index("warmup-index")
                    .document(doc)
                )
            );
            bulkOperations.add(op);
            if (bulkOperations.size() >= 100) {
                List<BulkOperation> finalBulkOperations = bulkOperations;
                BulkRequest request = BulkRequest.of(b -> b.operations(finalBulkOperations));
                elasticsearchClient.bulk(request);
                bulkOperations = new ArrayList<>();
            }
        }
        elasticsearchClient.indices().delete(d -> d.index("warmup-index"));


        List<BenchmarkOutput> result = new ArrayList<>();

        int[] chunks = {100, 250, 500, 1000};
        for (int chunk : chunks) {
            long[] floatTimes = new long[3];  // 3 runs averaged
            long[] base64Times = new long[3];  //same for base64
            for (int i = 0; i < 3; i++) {

                if (elasticsearchClient.indices().exists(e -> e.index("vec-test")).value()) {
                    elasticsearchClient.indices().delete(d -> d.index("vec-test"));
                    elasticsearchClient.indices().create(c -> c.index("vec-test")
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
                                                   "        \"emb\": {\n" +
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

                Instant start = Instant.now();

                bulkOperations = new ArrayList<>();

                for (int d = 0; d < 20; d++) { // repeating dataset 20 times
                    for (ElasticsearchDoc doc : docs) {

                        BulkOperation op = BulkOperation.of(o -> o
                            .index(idx -> idx
                                .index("vec-test")
                                .document(doc)
                            )
                        );
                        bulkOperations.add(op);
                        if (bulkOperations.size() >= chunk) {
                            List<BulkOperation> finalBulkOperations = bulkOperations;
                            BulkRequest request = BulkRequest.of(b -> b.operations(finalBulkOperations));
                            elasticsearchClient.bulk(request);
                            bulkOperations = new ArrayList<>();
                        }
                    }
                }

                Instant end = Instant.now();
                floatTimes[i] = Duration.between(start, end).toMillis();

                if (elasticsearchClient.indices().exists(e -> e.index("vec-test-64")).value()) {
                    elasticsearchClient.indices().delete(d -> d.index("vec-test-64"));
                    elasticsearchClient.indices().create(c -> c.index("vec-test-64")
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
                                                   "        \"emb\": {\n" +
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

                start = Instant.now();

                bulkOperations = new ArrayList<>();

                for (int d = 0; d < 20; d++) { // repeating dataset 20 times
                    for (ElasticsearchDoc doc : docs) {
                        Elasticsearch64Doc doc64 = new Elasticsearch64Doc(doc.docid(), doc.title(),
                            doc.text(),
                            convertToBase64Bytes(doc.emb()));

                        BulkOperation op = BulkOperation.of(o -> o
                            .index(idx -> idx
                                .index("vec-test-64")
                                .document(doc64)
                            )
                        );
                        bulkOperations.add(op);
                        if (bulkOperations.size() >= chunk) {
                            List<BulkOperation> finalBulkOperations = bulkOperations;
                            BulkRequest request =
                                BulkRequest.of(b -> b.operations(finalBulkOperations));
                            elasticsearchClient.bulk(request);
                            bulkOperations = new ArrayList<>();
                        }
                    }
                }

                end = Instant.now();
                base64Times[i] = Duration.between(start, end).toMillis();
            }
            // only counting the last 3, the first 3 are for warmup
            long totalFloat = (floatTimes[0] + floatTimes[1] + floatTimes[2]) / 3;
            long totalBase64 = (base64Times[0] + base64Times[1] + base64Times[2]) / 3;
            BenchmarkOutput benchmarkOutput = new BenchmarkOutput(20000, chunk,
                new BenchmarkOutput.Float32(totalFloat), new BenchmarkOutput.Base64(totalBase64));

            result.add(benchmarkOutput);
        }
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(result);
        System.out.println(json);

        elasticsearchClient.indices().delete(d -> d.index("vec-test"));
        elasticsearchClient.indices().delete(d -> d.index("vec-test-64"));
    }
}
