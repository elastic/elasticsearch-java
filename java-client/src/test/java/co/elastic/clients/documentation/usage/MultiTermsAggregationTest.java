package co.elastic.clients.documentation.usage;

import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.MultiTermLookup;
import co.elastic.clients.elasticsearch._types.aggregations.MultiTermsAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregationCollectMode;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.model.ModelTestCase;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class MultiTermsAggregationTest extends ModelTestCase {

    @Test
    public void testCreateMultiTermsAggregationWithOptionalFields() {
        MultiTermsAggregation multiTermsAggregation = new MultiTermsAggregation.Builder()
                .terms(new MultiTermLookup.Builder().field("field-1").build(), new MultiTermLookup.Builder().field("field-2").build())
                .size(10)
                .shardSize(1)
                .showTermDocCountError(false)
                .order(List.of(Map.of("field", SortOrder.Asc)))
                .minDocCount(1)
                .shardMinDocCount(2L)
                .collectMode(TermsAggregationCollectMode.DepthFirst)
                .build();
        Aggregation aggregation = new Aggregation.Builder().multiTerms(multiTermsAggregation).build();
        SearchRequest request = new SearchRequest.Builder().aggregations(Map.of("multi_terms", aggregation)).build();
        String expectedValue = "{\"aggregations\":{\"multi_terms\":{\"multi_terms\":{\"terms\":[{\"field\":\"field-1\"},{\"field\":\"field-2\"}],\"size\":10,\"shard_size\":1,\"show_term_doc_count_error\":false,\"min_doc_count\":1,\"collect_mode\":\"depth_first\",\"shard_min_doc_count\":2,\"order\":[{\"field\":\"asc\"}]}}}}";
        assertEquals(expectedValue, toJson(request));
    }

    @Test
    public void testcreateMultiTermsAggregationWithoutOptionFields() {
        MultiTermsAggregation multiTermsAggregation = new MultiTermsAggregation.Builder()
                .terms(new MultiTermLookup.Builder().field("field-1").build(), new MultiTermLookup.Builder().field("field-2").build())
                .build();
        Aggregation aggregation = new Aggregation.Builder().multiTerms(multiTermsAggregation).build();
        SearchRequest request = new SearchRequest.Builder().aggregations(Map.of("multi_terms", aggregation)).build();
        String expectedValue = "{\"aggregations\":{\"multi_terms\":{\"multi_terms\":{\"terms\":[{\"field\":\"field-1\"},{\"field\":\"field-2\"}]}}}}";
        assertEquals(expectedValue, toJson(request));
    }
}