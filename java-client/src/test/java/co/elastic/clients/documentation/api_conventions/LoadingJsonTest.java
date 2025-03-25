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

package co.elastic.clients.documentation.api_conventions;

import co.elastic.clients.documentation.DocTestsTransport;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregate;
import co.elastic.clients.elasticsearch._types.aggregations.CalendarInterval;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.TotalHitsRelation;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.JsonData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoadingJsonTest extends ModelTestCase {

    private final DocTestsTransport transport = new DocTestsTransport();
    private final ElasticsearchClient client = new ElasticsearchClient(transport);

    private static final SearchResponse<JsonData> searchResponse = SearchResponse.of(b -> b
        .aggregations(new HashMap<>())
        .took(0)
        .timedOut(false)
        .hits(h -> h
            .total(t -> t.value(0).relation(TotalHitsRelation.Eq))
            .hits(new ArrayList<>())
        )
        .shards(s -> s
            .total(1)
            .failed(0)
            .successful(1)
        )
    );

    @Test
    public void loadIndexDefinition() throws IOException {

        transport.setResult(CreateIndexResponse.of(b -> b
            .index("some-index")
            .shardsAcknowledged(true)
            .acknowledged(true)
        ));

        //tag::load-index
        InputStream input = this.getClass()
            .getResourceAsStream("some-index.json"); //<1>

        CreateIndexRequest req = CreateIndexRequest.of(b -> b
            .index("some-index")
            .withJson(input) //<2>
        );

        boolean created = client.indices().create(req).acknowledged();
        //end::load-index
    }

    @Disabled
    @Test
    public void ingestDocument() throws IOException {
        
        File dataDir = null;

        //tag::ingest-data
        FileReader file = new FileReader(new File(dataDir, "document-1.json"));

        IndexRequest<JsonData> req; //<1>

        req = IndexRequest.of(b -> b
            .index("some-index")
            .withJson(file)
        );

        client.index(req);
        //end::ingest-data
    }

    @Test
    public void query1() throws IOException {
        transport.setResult(searchResponse);

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

        SearchRequest aggRequest = SearchRequest.of(b -> b
            .withJson(queryJson) //<1>
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

        Map<String, Aggregate> aggs = client
            .search(aggRequest, Void.class) //<3>
            .aggregations();
        //end::query
    }

    @Test
    public void query2() throws IOException {
        transport.setResult(searchResponse);

        //tag::query-and-agg
        Reader queryJson = new StringReader(
            "{" +
            "  \"query\": {" +
            "    \"range\": {" +
            "      \"@timestamp\": {" +
            "        \"gt\": \"now-1w\"" +
            "      }" +
            "    }" +
            "  }," +
            "  \"size\": 100" + //<1>
            "}");

        Reader aggregationJson = new StringReader(
            "{" +
            "  \"size\": 0, " + //<2>
            "  \"aggregations\": {" +
            "    \"hours\": {" +
            "      \"date_histogram\": {" +
            "        \"field\": \"@timestamp\"," +
            "        \"interval\": \"hour\"" +
            "      }," +
            "      \"aggregations\": {" +
            "        \"max-cpu\": {" +
            "          \"max\": {" +
            "            \"field\": \"host.cpu.usage\"" +
            "          }" +
            "        }" +
            "      }" +
            "    }" +
            "  }" +
            "}");

        SearchRequest aggRequest = SearchRequest.of(b -> b
            .withJson(queryJson) //<3>
            .withJson(aggregationJson) //<4>
            .ignoreUnavailable(true) //<5>
        );

        Map<String, Aggregate> aggs = client
            .search(aggRequest, Void.class)
            .aggregations();
        //end::query-and-agg
    }
}
