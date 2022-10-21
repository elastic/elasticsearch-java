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
import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.UpdateRequest;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.model.ModelTestCase;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdatingTest extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient esClient = new ElasticsearchClient(transport);

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    UpdateResponse<Product> result = UpdateResponse.of(u -> u
        .index("product")
        .id("bk-1")
        .version(2)
        .seqNo(2)
        .result(Result.Updated)
        .primaryTerm(1)
        .shards(s -> s.total(1).successful(1).failed(0)));

    @Test
    public void singleDocumentDSLwithOf() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::update-by-id-dsl
        Product product = new Product("bk-1", "City bike", 123.0); // <1>
        ProductName productName = new ProductName("Track bike"); // <2>

        UpdateResponse<Product> response = esClient.update(u -> u
            .index("product") // <3>
            .id(product.getSku())
            .document(productName),
            Product.class // <4>
        );

        logger.info("Updated with version " + response.version());
        //end::update-by-id-dsl
    }

    @Test
    public void singleDocumentBuilder() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::update-by-id-builder
        Product product = new Product("bk-1", "City bike", 123.0);
        ProductName productName = new ProductName("Track bike");

        UpdateRequest.Builder<Product, ProductName> updateReqBuilder = new UpdateRequest.Builder<>(); // <1>
        updateReqBuilder.index("product");
        updateReqBuilder.id(product.getSku());
        updateReqBuilder.document(productName);

        UpdateResponse<Product> response = esClient.update(
                updateReqBuilder.build(),
                Product.class
        );

        logger.info("Updated with version " + response.version());
        //end::update-by-id-builder
    }

    @Test
    public void singleDocumentDSLAsync() {

        // Stub response
        transport.setResult(result);

        //tag::update-by-id-dsl-async
        ElasticsearchAsyncClient esAsyncClient = new ElasticsearchAsyncClient(transport);

        Product product = new Product("bk-1", "City bike", 123.0);
        ProductName productName = new ProductName("Track bike");

        esAsyncClient.update(u -> u
            .index("product")
            .id(product.getSku())
            .document(productName),
            Product.class
        ).whenComplete((response, exception) -> {
            if (exception != null) {
                logger.error("Failed to update", exception);
            } else {
                logger.info("Updated with version " + response.version());
            }
        });
        //end::update-by-id-dsl-async
    }

}
