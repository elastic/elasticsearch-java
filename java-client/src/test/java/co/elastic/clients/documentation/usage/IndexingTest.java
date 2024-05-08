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
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.JsonData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.io.StringReader;

public class IndexingTest extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient esClient = new ElasticsearchClient(transport);

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    IndexResponse result = IndexResponse.of(r -> r
        .index("product")
        .id("bk-1")
        .version(1)
        .primaryTerm(1L)
        .seqNo(1L)
        .result(Result.Created)
        .shards(s -> s.total(1).successful(1).failed(0))
    );

    @Test
    @Disabled
    public void createIndex() throws Exception {
        //tag::create-products-index
        esClient.indices().create(c -> c
            .index("products")
        );
        //end::create-products-index
    }

    @Test
    @Disabled
    public void deleteIndex() throws Exception {
        //tag::delete-products-index
        esClient.indices().delete(d -> d
            .index("products")
        );
        //end::delete-products-index
    }

    @Test
    public void singleDocumentDSL() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::single-doc-dsl
        Product product = new Product("bk-1", "City bike", 123.0);

        IndexResponse response = esClient.index(i -> i
            .index("products")
            .id(product.getSku())
            .document(product)
        );

        logger.info("Indexed with version " + response.version());
        //end::single-doc-dsl
    }

    @Test
    public void singleDocumentDSLwithOf() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::single-doc-dsl-of
        Product product = new Product("bk-1", "City bike", 123.0);

        IndexRequest<Product> request = IndexRequest.of(i -> i
            .index("products")
            .id(product.getSku())
            .document(product)
        );

        IndexResponse response = esClient.index(request);

        logger.info("Indexed with version " + response.version());
        //end::single-doc-dsl-of
    }

    @Test
    public void singleDocumentBuilder() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::single-doc-builder
        Product product = new Product("bk-1", "City bike", 123.0);

        IndexRequest.Builder<Product> indexReqBuilder = new IndexRequest.Builder<>();
        indexReqBuilder.index("product");
        indexReqBuilder.id(product.getSku());
        indexReqBuilder.document(product);

        IndexResponse response = esClient.index(indexReqBuilder.build());

        logger.info("Indexed with version " + response.version());
        //end::single-doc-builder
    }

    @Test
    public void singleDocumentDSLAsync() throws Exception {

        // Stub response
        transport.setResult(result);

        //tag::single-doc-dsl-async
        ElasticsearchAsyncClient esAsyncClient = new ElasticsearchAsyncClient(transport);

        Product product = new Product("bk-1", "City bike", 123.0);

        esAsyncClient.index(i -> i
            .index("products")
            .id(product.getSku())
            .document(product)
        ).whenComplete((response, exception) -> {
            if (exception != null) {
                logger.error("Failed to index", exception);
            } else {
                logger.info("Indexed with version " + response.version());
            }
        });
        //end::single-doc-dsl-async
    }

    @Test
    public void singleDocumentJson() throws Exception {
        // Stub response
        transport.setResult(result);

        //tag::single-doc-json
        Reader input = new StringReader(
            "{'@timestamp': '2022-04-08T13:55:32Z', 'level': 'warn', 'message': 'Some log message'}"
            .replace('\'', '"'));

        IndexRequest<JsonData> request = IndexRequest.of(i -> i
            .index("logs")
            .withJson(input)
        );

        IndexResponse response = esClient.index(request);

        logger.info("Indexed with version " + response.version());
        //end::single-doc-json

        assertEquals("warn", request.document().toJson().asJsonObject().getString("level"));
        assertEquals(
            "{\"@timestamp\":\"2022-04-08T13:55:32Z\",\"level\":\"warn\",\"message\":\"Some log message\"}",
            toJson(request)
        );
    }

    @Test
    public void deleteDocument() throws Exception {
        //tag::single-doc-delete
        esClient.delete(d -> d.index("products").id("bk-1"));
        //end::single-doc-delete
    }

    @Test
    @Disabled
    public void updateDoc() throws Exception {
        //tag::single-doc-update
        Product product = new Product("bk-1", "City bike", 123.0);

        esClient.update(u -> u
                .index("products")
                .id("bk-1")
                .upsert(product),
            Product.class
        );
        //end::single-doc-update
    }
}
