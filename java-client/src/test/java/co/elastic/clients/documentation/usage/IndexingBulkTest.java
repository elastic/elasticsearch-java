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

package co.elastic.clients.documentation.usage;

import co.elastic.clients.documentation.DocTestsTransport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._helpers.bulk.BulkIngester;
import co.elastic.clients.elasticsearch._helpers.bulk.BulkListener;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ContentType;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IndexingBulkTest extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient esClient = new ElasticsearchClient(transport);

    private final Log logger = LogFactory.getLog(this.getClass());

    BulkResponse result = BulkResponse.of(r -> r
        .errors(false)
        .items(Collections.emptyList())
        .took(1)
    );

    private List<Product> fetchProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("bk-1", "City Bike", 123.0));
        list.add(new Product("bk-2", "Mountain Bike", 134.0));
        return list;
    }

    @Test
    public void indexBulk() throws Exception {
        transport.setResult(result);

        //tag::bulk-objects
        List<Product> products = fetchProducts();

        BulkRequest.Builder br = new BulkRequest.Builder();

        for (Product product : products) {
            br.operations(op -> op           //<1>
                .index(idx -> idx            //<2>
                    .index("products")       //<3>
                    .id(product.getSku())
                    .document(product)
                )
            );
        }

        BulkResponse result = esClient.bulk(br.build());

        // Log errors, if any
        if (result.errors()) {
            logger.error("Bulk had errors");
            for (BulkResponseItem item: result.items()) {
                if (item.error() != null) {
                    logger.error(item.error().reason());
                }
            }
        }
        //end::bulk-objects
    }

    @Test
    public void indexBulkJson() throws Exception {
        transport.setResult(result);

        File logDir = new File(".");

        //tag::bulk-json
        // List json log files in the log directory
        File[] logFiles = logDir.listFiles(
            file -> file.getName().matches("log-.*\\.json")
        );

        BulkRequest.Builder br = new BulkRequest.Builder();

        for (File file: logFiles) {
            FileInputStream input = new FileInputStream(file);
            BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

            br.operations(op -> op
                .index(idx -> idx
                    .index("logs")
                    .document(data)
                )
            );
        }
        //end::bulk-json
    }

    @Test
    public void useBulkIndexer() throws Exception {

        File logDir = new File(".");
        File[] logFiles = logDir.listFiles(
            file -> file.getName().matches("log-.*\\.json")
        );

        //tag::bulk-ingester-setup
        BulkIngester<Void> ingester = BulkIngester.of(b -> b
            .client(esClient)    // <1>
            .maxOperations(100)  // <2>
            .flushInterval(1, TimeUnit.SECONDS) // <3>
        );

        for (File file: logFiles) {
            FileInputStream input = new FileInputStream(file);
            BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

            ingester.add(op -> op // <4>
                .index(idx -> idx
                    .index("logs")
                    .document(data)
                )
            );
        }

        ingester.close(); // <5>
        //end::bulk-ingester-setup

    }

    @Test
    public void useBulkIndexerWithContext() throws Exception {

        File[] logFiles = new File[]{};

        //tag::bulk-ingester-context
        BulkListener<String> listener = new BulkListener<String>() { // <1>
            @Override
            public void beforeBulk(long executionId, BulkRequest request, List<String> contexts) {
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<String> contexts, BulkResponse response) {
                // The request was accepted, but may contain failed items.
                // The "context" list gives the file name for each bulk item.
                logger.debug("Bulk request " + executionId + " completed");
                for (int i = 0; i < contexts.size(); i++) {
                    BulkResponseItem item = response.items().get(i);
                    if (item.error() != null) {
                        // Inspect the failure cause
                        logger.error("Failed to index file " + contexts.get(i) + " - " + item.error().reason());
                    }
                }
            }

            @Override
            public void afterBulk(long executionId, BulkRequest request, List<String> contexts, Throwable failure) {
                // The request could not be sent
                logger.debug("Bulk request " + executionId + " failed", failure);
            }
        };

        BulkIngester<String> ingester = BulkIngester.of(b -> b
            .client(esClient)
            .maxOperations(100)
            .flushInterval(1, TimeUnit.SECONDS)
            .listener(listener) // <2>
        );

        for (File file: logFiles) {
            FileInputStream input = new FileInputStream(file);
            BinaryData data = BinaryData.of(IOUtils.toByteArray(input), ContentType.APPLICATION_JSON);

            ingester.add(op -> op
                .index(idx -> idx
                    .index("logs")
                    .document(data)
                ),
                file.getName() // <3>
            );
        }

        ingester.close();
        //end::bulk-ingester-context

    }
}
