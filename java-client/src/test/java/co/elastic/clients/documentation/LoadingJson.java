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

package co.elastic.clients.documentation;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.aggregations.CalendarInterval;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import co.elastic.clients.json.JsonData;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;

public class LoadingJson extends ModelTestCase {

    private DocTestsTransport transport = new DocTestsTransport();
    private ElasticsearchClient client = new ElasticsearchClient(transport);

    @Test
    public void loadIndexDefinition() throws IOException {

        transport.setResult(CreateIndexResponse.of(b -> b
            .index("some-index")
            .shardsAcknowledged(true)
            .acknowledged(true)
        ));

        //tag::load-index
        InputStream jsonStream = this.getClass()
            .getResourceAsStream("some-index.json");

        CreateIndexRequest req = CreateIndexRequest.of(b -> b
            .index("some-index")
            .withJson(
                jsonStream, //<1>
                client._jsonpMapper() //<2>
            )
        );

        boolean created = client.indices().create(req).acknowledged();
        //end::load-index
    }

    @Test
    @Ignore
    public void ingestDocument() throws IOException {
        
        File dataDir = null;

        //tag::ingest-data
        FileReader file = new FileReader(new File(dataDir, "document-1.json"));

        IndexRequest<JsonData> req; //<1>

        req = IndexRequest.of(b -> b
            .index("some-index")
            .withJson(file, client._jsonpMapper())
        );

        client.index(req);
        //end::ingest-data
    }


    public void query1() throws IOException {
        //tag::query
        Reader queryJson = new StringReader(
            "{" +
            "  \"query\": {" +
            "    \"range\": {" +
            "      \"@timestamp\": {" +
            "        \"gt\": \"now-1w\"" +
            "      }" +
            "    }" +
            "  }" +
            "}");
        
        SearchRequest agg1 = SearchRequest.of(b -> b
            .withJson(queryJson, client._jsonpMapper()) //<1>
            .aggregations("max-cpu", a1 -> a1 //<2>
                .dateHistogram(h -> h
                    .field("@timestamp")
                    .calendarInterval(CalendarInterval.Hour)
                )
                .aggregations("max", a2 -> a2
                    .max(m -> m.field("host.cpu.usage"))
                )
            )
            .size(0)
        );

        Map<String, Aggregate> aggs1 = client
            .search(agg1, Void.class) //<3>
            .aggregations();
        //end::query
        
        //tag::query-and-agg
        Reader aggJson = new StringReader(
            "\"size\": 0, " +
            "\"aggs\": {" +
            "  \"hours\": {" +
            "    \"date_histogram\": {" +
            "      \"field\": \"@timestamp\"," +
            "      \"interval\": \"hour\"" +
            "    }," +
            "    \"aggs\": {" +
            "      \"max-cpu\": {" +
            "        \"max\": {" +
            "          \"field\": \"host.cpu.usage\"" +
            "        }" +
            "      }" +
            "    }" +
            "  }" +
            "}");
        
        SearchRequest agg2 = SearchRequest.of(b -> b
            .withJson(queryJson, client._jsonpMapper()) //<1>
            .withJson(aggJson, client._jsonpMapper()) //<2>
            .ignoreUnavailable(true) //<3>
        );

        Map<String, Aggregate> aggs2 = client
            .search(agg2, Void.class)
            .aggregations();
        //end::query-and-agg
    }
}
