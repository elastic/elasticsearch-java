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
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
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


    public static String convertToBase64Bytes(Float[] vec) {
        ByteBuffer buff = ByteBuffer.allocate(Float.BYTES * vec.length);
        for (int i = 0; i < vec.length; i++) {
            buff.putFloat(vec[i]);
        }
        return Base64.getEncoder().encodeToString(buff.array());
    }

    @Test
    public void test() throws IOException {

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

                Elasticsearch64Doc doc64 = new Elasticsearch64Doc(doc.docid(), doc.title(), doc.text(),
                    convertToBase64Bytes(doc.emb().toArray(new Float[0])));

                BulkOperation op = BulkOperation.of(o -> o
                    .index(idx -> idx
                        .index("vec-test")
                        .document(doc64)
                    )
                );
                bulkOperations.add(op);
                if (bulkOperations.size() >= 100) { // TODO choose chunk size
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
