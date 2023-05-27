package co.elastic.clients.transport.rest_client;

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import com.sun.net.httpserver.HttpServer;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import io.opentelemetry.semconv.resource.attributes.ResourceAttributes;
import io.opentelemetry.semconv.trace.attributes.SemanticAttributes;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class InstrumentationTest {
    private static final String INDEX = "test-index";
    private static final String DOC_ID = "1234567";
    private static final String DOC_RESPONSE = "{\n" +
            "  \"_index\": \"" + INDEX + "\",\n" +
            "  \"_id\": \"" + DOC_ID + "\",\n" +
            "  \"_version\": 1,\n" +
            "  \"_seq_no\": 0,\n" +
            "  \"_primary_term\": 1,\n" +
            "  \"found\": true,\n" +
            "  \"_source\": {\n" +
            "    \"@timestamp\": \"2099-11-15T14:12:12\",\n" +
            "    \"message\": \"GET /search HTTP/1.1 200 1070000\"\n" +
            "  }\n" +
            "}";
    private static final String SEARCH_RESPONSE = "{\n" +
            "  \"took\": 5,\n" +
            "  \"timed_out\": false,\n" +
            "  \"_shards\": {\n" +
            "    \"total\": 1,\n" +
            "    \"successful\": 1,\n" +
            "    \"skipped\": 0,\n" +
            "    \"failed\": 0\n" +
            "  },\n" +
            "  \"hits\": {\n" +
            "    \"total\": {\n" +
            "      \"value\": 1,\n" +
            "      \"relation\": \"eq\"\n" +
            "    },\n" +
            "    \"max_score\": 1.3862942,\n" +
            "    \"hits\": [\n" +
            "      {\n" +
            "        \"_index\": \"" + INDEX + "\",\n" +
            "        \"_id\": \"" + DOC_ID + "\",\n" +
            "        \"_score\": 1.3862942,\n" +
            "        \"_source\": {\n" +
            "           \"@timestamp\": \"2099-11-15T14:12:12\",\n" +
            "           \"message\": \"GET /search HTTP/1.1 200 1070000\"\n" +
            "        }\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";
    public static final String DB_ELASTICSEARCH_TARGET = "db.elasticsearch.target";
    public static final String DB_ELASTICSEARCH_DOC_ID = "db.elasticsearch.doc_id";
    public static final String URL_PATH = "url.path";
    public static final String URL_SCHEME = "url.scheme";
    public static final String SERVER_ADDRESS = "server.address";
    public static final String SERVER_PORT = "server.port";
    private static HttpServer httpServer;
    private static MockSpanExporter spanExporter;
    private static OpenTelemetry openTelemetry;
    private static RestClientTransport transport;
    private static ElasticsearchClient client;
    private static ElasticsearchAsyncClient asyncClient;

    @BeforeAll
    public static void setup() throws IOException {
        setupOTel();
        setupHttpServer();
        setupClient();
    }

    @AfterAll
    public static void cleanUp() throws IOException {
        httpServer.stop(0);
        transport.close();
    }

    private static void setupClient() {
        RestClient restClient =
                RestClient.builder(new HttpHost(httpServer.getAddress().getAddress(), httpServer.getAddress().getPort())).build();

        transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

        client = new ElasticsearchClient(transport);
        asyncClient = new ElasticsearchAsyncClient(transport);
    }

    private static void setupHttpServer() throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);

        // handler for GetRequest
        httpServer.createContext("/" + INDEX + "/_doc/" + DOC_ID, exchange -> {
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write(DOC_RESPONSE.getBytes());
            exchange.close();
        });

        // handler for SearchRequest
        httpServer.createContext("/" + INDEX + "/_search", exchange -> {
            exchange.getResponseHeaders().set("X-Elastic-Product", "Elasticsearch");
            exchange.sendResponseHeaders(200, 0);
            exchange.getResponseBody().write(SEARCH_RESPONSE.getBytes());
            exchange.close();
        });

        httpServer.start();
    }

    private static void setupOTel() {
        Resource resource = Resource.getDefault()
                .merge(Resource.create(Attributes.of(ResourceAttributes.SERVICE_NAME, "es-api-test")));

        spanExporter = new MockSpanExporter();

        SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder()
                .addSpanProcessor(SimpleSpanProcessor.create(spanExporter))
                .setResource(resource)
                .build();

        openTelemetry = OpenTelemetrySdk.builder()
                .setTracerProvider(sdkTracerProvider)
                .buildAndRegisterGlobal();
    }

    @BeforeEach
    public void reset() {
        spanExporter.reset();
    }

    @Test
    public void testGetRequest() throws IOException, InterruptedException {
        client.get(r -> r.index(INDEX).id(DOC_ID), Object.class);
        Assertions.assertEquals(spanExporter.getSpans().size(), 1);
        SpanData span = spanExporter.getSpans().get(0);
        Assertions.assertEquals("GET /{index}/_doc/{id}", span.getName());
        Assertions.assertEquals(INDEX, span.getAttributes().get(AttributeKey.stringKey(DB_ELASTICSEARCH_TARGET)));
        Assertions.assertEquals(DOC_ID, span.getAttributes().get(AttributeKey.stringKey(DB_ELASTICSEARCH_DOC_ID)));
        Assertions.assertEquals("GET", span.getAttributes().get(SemanticAttributes.HTTP_METHOD));
        Assertions.assertEquals("elasticsearch", span.getAttributes().get(SemanticAttributes.DB_SYSTEM));
        Assertions.assertEquals("/" + INDEX + "/_doc/" + DOC_ID, span.getAttributes().get(AttributeKey.stringKey(URL_PATH)));
        Assertions.assertEquals("http", span.getAttributes().get(AttributeKey.stringKey(URL_SCHEME)));
        Assertions.assertEquals(httpServer.getAddress().getHostName(), span.getAttributes().get(AttributeKey.stringKey(SERVER_ADDRESS)));
        Assertions.assertEquals(httpServer.getAddress().getPort(), span.getAttributes().get(AttributeKey.longKey(SERVER_PORT)));
    }

    @Test
    public void testSearchRequest() throws IOException, InterruptedException {
        Query query = Query.of(q -> q.term(t -> t.field("x").value("y")));
        String queryAsString = query.toString().replace("Query: ", "{\"query\":") + "}";
        client.search(r -> r.index(INDEX).query(query), Object.class);
        Assertions.assertEquals(spanExporter.getSpans().size(), 1);
        SpanData span = spanExporter.getSpans().get(0);
        Assertions.assertEquals("POST /{index}/_search", span.getName());
        Assertions.assertEquals(INDEX, span.getAttributes().get(AttributeKey.stringKey(DB_ELASTICSEARCH_TARGET)));
        Assertions.assertEquals(queryAsString, span.getAttributes().get(SemanticAttributes.DB_STATEMENT));
    }

    @Test
    public void testAsyncSearchRequest() throws IOException, InterruptedException, TimeoutException, ExecutionException {
        Query query = Query.of(q -> q.term(t -> t.field("x").value("y")));
        String queryAsString = query.toString().replace("Query: ", "{\"query\":") + "}";
        Future future = asyncClient.search(r -> r.index(INDEX).query(query), Object.class);
        future.get(2, TimeUnit.SECONDS);
        spanExporter.awaitNumSpans(1, 2000);
        Assertions.assertEquals(spanExporter.getSpans().size(), 1);
        SpanData span = spanExporter.getSpans().get(0);
        Assertions.assertEquals("POST /{index}/_search", span.getName());
        Assertions.assertEquals(INDEX, span.getAttributes().get(AttributeKey.stringKey(DB_ELASTICSEARCH_TARGET)));
        Assertions.assertEquals(queryAsString, span.getAttributes().get(SemanticAttributes.DB_STATEMENT));
    }

    private static class MockSpanExporter implements SpanExporter {

        private final List<SpanData> spans = new ArrayList();

        @Override
        public CompletableResultCode export(Collection<SpanData> spans) {
            this.spans.addAll(spans);
            synchronized (this) {
                notifyAll();
            }
            return CompletableResultCode.ofSuccess();
        }

        @Override
        public CompletableResultCode flush() {
            return CompletableResultCode.ofSuccess();
        }

        @Override
        public CompletableResultCode shutdown() {
            spans.clear();
            return CompletableResultCode.ofSuccess();
        }

        public List<SpanData> getSpans() {
            return spans;
        }

        public void reset() {
            spans.clear();
        }

        public synchronized void awaitNumSpans(int num, long timeoutMillis) throws InterruptedException {
            while(spans.size() < num){
                wait(timeoutMillis);
            }
        }
    }
}
