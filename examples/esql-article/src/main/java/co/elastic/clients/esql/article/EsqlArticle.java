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
package co.elastic.clients.esql.article;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._helpers.bulk.BulkIngester;
import co.elastic.clients.elasticsearch._helpers.esql.jdbc.ResultSetEsqlAdapter;
import co.elastic.clients.elasticsearch._helpers.esql.objects.ObjectsEsqlAdapter;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest5_client.RestClientTransport;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.RestClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class EsqlArticle {

    public static void main(String[] args) throws IOException, SQLException, InterruptedException {

        String serverUrl = System.getenv("server-url");
        String apiKey = System.getenv("api-key");
        String booksUrl = "https://raw.githubusercontent" +
            ".com/elastic/elasticsearch-php-examples/main/examples/ESQL/data/books.csv";

        try (RestClient restClient = RestClient
            .builder(HttpHost.create(serverUrl))
            .setDefaultHeaders(new Header[]{
                new BasicHeader("Authorization", "ApiKey " + apiKey)
            })
            .build()) {

            ObjectMapper mapper = JsonMapper.builder()
                .build();

            JacksonJsonpMapper jsonpMapper = new JacksonJsonpMapper(mapper);

            ElasticsearchTransport transport = new RestClientTransport(
                restClient, jsonpMapper);

            ElasticsearchClient client = new ElasticsearchClient(transport);

            if (!client.indices().exists(ex -> ex.index("books")).value()) {
                client.indices()
                    .create(c -> c
                        .index("books")
                        .mappings(mp -> mp
                            .properties("title", p -> p.text(t -> t))
                            .properties("description", p -> p.text(t -> t))
                            .properties("author", p -> p.text(t -> t))
                            .properties("year", p -> p.short_(s -> s))
                            .properties("publisher", p -> p.text(t -> t))
                            .properties("ratings", p -> p.halfFloat(hf -> hf))
                        ));
            }

            Instant start = Instant.now();
            System.out.println("Starting BulkIndexer... \n");

            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.builder()
                .addColumn("title") // same order as in the csv
                .addColumn("description")
                .addColumn("author")
                .addColumn("year")
                .addColumn("publisher")
                .addColumn("ratings")
                .setColumnSeparator(';')
                .setSkipFirstDataRow(true)
                .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(booksUrl))
                .build();

            HttpResponse<InputStream> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofInputStream());
            InputStream csvContentStream = response.body();

            MappingIterator<Book> it = csvMapper
                .readerFor(Book.class)
                .with(schema)
                .readValues(new InputStreamReader(csvContentStream));

            BulkIngester ingester = BulkIngester.of(bi -> bi
                .client(client)
                .maxConcurrentRequests(20)
                .maxOperations(5000));

            boolean hasNext = true;

            while (hasNext) {
                try {
                    Book book = it.nextValue();
                    ingester.add(BulkOperation.of(b -> b
                        .index(i -> i
                            .index("books")
                            .document(book))));
                    hasNext = it.hasNextValue();
                } catch (JsonParseException | InvalidFormatException e) {
                    // ignore malformed data
                }
            }

            ingester.close();

            client.indices().refresh();

            Instant end = Instant.now();

            System.out.println("Finished in: " + Duration.between(start, end).toMillis() + "\n");

            String queryAuthor =
                """
                        from books
                        | where author == "Isaac Asimov"
                        | sort year desc
                        | limit 10
                    """;

            List<Book> queryRes = (List<Book>) client.esql().query(ObjectsEsqlAdapter.of(Book.class),
                queryAuthor);

            System.out.println("~~~\nObject result author:\n" + queryRes.stream().map(Book::title).collect(Collectors.joining("\n")));

            try (ResultSet resultSet = client.esql().query(ResultSetEsqlAdapter.INSTANCE, queryAuthor)) {
                System.out.println("~~~\nResultSet result author:");
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("title"));
                }
            }

            String queryPublisher =
                """
                        from books
                        | where publisher == "Penguin"
                        | sort ratings desc
                        | limit 10
                        | sort title asc
                    """;

            queryRes = (List<Book>) client.esql().query(ObjectsEsqlAdapter.of(Book.class), queryPublisher);
            System.out.println("~~~\nObject result publisher:\n" + queryRes.stream().map(Book::title).collect(Collectors.joining("\n")));
        }
    }
}
