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

package co.elastic.clients;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class MainCommonBenchmark64 {

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


    public static String convertToBase64Bytes(float[] vec) {
        ByteBuffer buff = ByteBuffer.allocate(Float.BYTES * vec.length);
        for (int i = 0; i < vec.length; i++) {
            buff.putFloat(vec[i]);
        }
        return Base64.getEncoder().encodeToString(buff.array());
    }

    @Test
    public void test() throws IOException {

        // TODO test file
        File file = new File("");

        List<ElasticsearchDoc> docs = readMultipleObjects(file);

        // 9.3 local
        String serverUrl = "http://localhost:9200";
        String APIkey = ""; // TODO Apikey

        int[] chunks = {100, 250, 500, 1000};
        for (int chunk : chunks) {
            long[] times = new long[10];
            for (int i = 0; i < 5; i++) {

                try (ElasticsearchClient elasticsearchClient =
                         ElasticsearchClient.of(e -> e.host(serverUrl).apiKey(APIkey))) {


                    if (elasticsearchClient.indices().exists(e -> e.index("vec-test-64")).value()) {
                        elasticsearchClient.indices().delete(d -> d.index("vec-test-64"));
                        elasticsearchClient.indices().create(c -> c.index("vec-test-64").withJson(new StringReader("{\n" +
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
                    }

                    Instant start = Instant.now();

                    List<BulkOperation> bulkOperations = new ArrayList<>();

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
                            BulkRequest request = BulkRequest.of(b -> b.operations(finalBulkOperations));
                            elasticsearchClient.bulk(request);
                            bulkOperations = new ArrayList<>();
                        }
                    }

                    Instant end = Instant.now();
                    times[i] = Duration.between(start, end).toMillis();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Chunk size: " + chunk + "\n");
            long total = Arrays.stream(times).sum() / 10;
            System.out.println("Ingest float: " + 1000 * 1000 / total + "\n");
        }
    }
}
