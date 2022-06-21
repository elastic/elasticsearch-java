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
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkResponseItem;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpMapper;
import jakarta.json.spi.JsonProvider;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexingBulkTest extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient esClient = new ElasticsearchClient(transport);

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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

    //tag::read-json
    public static JsonData readJson(InputStream input, ElasticsearchClient esClient) {
        JsonpMapper jsonpMapper = esClient._transport().jsonpMapper();
        JsonProvider jsonProvider = jsonpMapper.jsonProvider();

        return JsonData.from(jsonProvider.createParser(input), jsonpMapper);
    }
    //end::read-json

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
            JsonData json = readJson(new FileInputStream(file), esClient);

            br.operations(op -> op
                .index(idx -> idx
                    .index("logs")
                    .document(json)
                )
            );
        }
        //end::bulk-json
    }
}
