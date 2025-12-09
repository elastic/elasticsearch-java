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
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MainCommonBenchmarkDirect64 {

    public static List<Elasticsearch64Doc> readMultipleObjects(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        try (MappingIterator<Elasticsearch64Doc> it =
                 mapper.readerFor(Elasticsearch64Doc.class).readValues(file)) {
            List<Elasticsearch64Doc> list = new ArrayList<>();
            while (it.hasNext()) {
                list.add(it.next());
            }
            return list;
        }
    }

    @Test
    public void test() throws IOException {

        File file = new File("/home/laura/Documents/Benchmarks/open_ai_corpus-initial-indexing_base64-1k.json"); // TODO test file

        List<Elasticsearch64Doc> docs = readMultipleObjects(file);

        // 9.3 local
        String serverUrl = "http://localhost:9200";
        String APIkey = "eUUzS09ab0JaV2ZBNnk4RS1kMU86YlhuZnh4TWZvc091ZzJISkN2NzF2Zw=="; // TODO Apikey

        try (ElasticsearchClient elasticsearchClient =
                 ElasticsearchClient.of(e -> e.host(serverUrl).apiKey(APIkey))) {

            if(elasticsearchClient.indices().exists(e -> e.index("vec-test-direct")).value()){
                elasticsearchClient.indices().delete(d -> d.index("vec-test-direct"));
                elasticsearchClient.indices().create(c -> c.index("vec-test-direct").withJson(new StringReader("{\n" +
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
            System.out.println("Starting bulk operations... \n");

            List<BulkOperation> bulkOperations = new ArrayList<>();

            for (Elasticsearch64Doc doc : docs) {

                BulkOperation op = BulkOperation.of(o -> o
                    .index(idx -> idx
                        .index("vec-test-direct")
                        .document(doc)
                    )
                );
                bulkOperations.add(op);
                if (bulkOperations.size() >= 500) {  // TODO choose chunk size
                    List<BulkOperation> finalBulkOperations = bulkOperations;
                    BulkRequest request = BulkRequest.of(b -> b.operations(finalBulkOperations));
                    elasticsearchClient.bulk(request);
                    bulkOperations = new ArrayList<>();
                }
            }

            Instant end = Instant.now();

            System.out.println("Finished in: " + Duration.between(start, end).toMillis() + "\n");
            double docsPerSec = 1000*1000 / Duration.between(start, end).toMillis();
            System.out.println("Docs per sec: " + docsPerSec + "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
