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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.FieldCollapse;
import co.elastic.clients.elasticsearch.core.search.Highlight;
import co.elastic.clients.elasticsearch.core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch.core.search.Rescore;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: async_search.submit.Request
@JsonpDeserializable
public class SubmitRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean allowPartialSearchResults;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Long batchedReduceSize;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final JsonValue /*
							 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
							 * _global.search._types.DocValueField)
							 */ docvalueFields;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean explain;

	private final List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	private final List<Map<String, Double>> indicesBoost;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final String minCompatibleShardNode;

	@Nullable
	private final Double minScore;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final Query postFilter;

	@Nullable
	private final Long preFilterShardSize;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean requestCache;

	private final List<Rescore> rescore;

	@Nullable
	private final String routing;

	private final Map<String, RuntimeField> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final String scroll;

	private final List<String> searchAfter;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	private final List<String> stats;

	private final List<String> storedFields;

	@Nullable
	private final JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer> |
							 * _global.search._types.SuggestContainer)
							 */ suggest;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits;

	@Nullable
	private final Boolean version;

	@Nullable
	private final String waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private SubmitRequest(Builder builder) {

		this.source = builder.source;
		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.allowNoIndices = builder.allowNoIndices;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.batchedReduceSize = builder.batchedReduceSize;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.collapse = builder.collapse;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.docvalueFields = builder.docvalueFields;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.explain = builder.explain;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.indicesBoost = ModelTypeHelper.unmodifiable(builder.indicesBoost);
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.lenient = builder.lenient;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.minCompatibleShardNode = builder.minCompatibleShardNode;
		this.minScore = builder.minScore;
		this.pit = builder.pit;
		this.postFilter = builder.postFilter;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.preference = builder.preference;
		this.profile = builder.profile;
		this.q = builder.q;
		this.query = builder.query;
		this.requestCache = builder.requestCache;
		this.rescore = ModelTypeHelper.unmodifiable(builder.rescore);
		this.routing = builder.routing;
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.scroll = builder.scroll;
		this.searchAfter = ModelTypeHelper.unmodifiable(builder.searchAfter);
		this.searchType = builder.searchType;
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.stats = ModelTypeHelper.unmodifiable(builder.stats);
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.suggest = builder.suggest;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.trackTotalHits = builder.trackTotalHits;
		this.version = builder.version;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static SubmitRequest of(Function<Builder, ObjectBuilder<SubmitRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates which source fields are returned for matching documents. These
	 * fields are returned in the hits._source property of the search response.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source() {
		return this.source;
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Indicate if an error should be returned if there is a partial search failure
	 * or timeout
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public final Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * Specify whether wildcard and prefix queries should be analyzed (default:
	 * false)
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public final Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The analyzer to use for the query string
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * The number of shard results that should be reduced at once on the
	 * coordinating node. This value should be used as the granularity at which
	 * progress results will be made available.
	 * <p>
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public final Long batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public final FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * The default operator for query string query (AND or OR)
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public final DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as default where no field prefix is given in the query
	 * string
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public final String df() {
		return this.df;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns doc values for field
	 * names matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
							 * _global.search._types.DocValueField)
							 */ docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, returns detailed information about score computation as part of a
	 * hit.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns values for field names
	 * matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<JsonValue /* Union(_types.DateField | _types.Field) */> fields() {
		return this.fields;
	}

	/**
	 * Starting document offset. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public final Highlight highlight() {
		return this.highlight;
	}

	/**
	 * Whether specified concrete, expanded or aliased indices should be ignored
	 * when throttled
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of index names to search; use <code>_all</code> or
	 * empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Boosts the _score of documents from specified indices.
	 * <p>
	 * API name: {@code indices_boost}
	 */
	public final List<Map<String, Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * Update the time interval in which the results (partial or final) for this
	 * search will be available
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final String keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Control whether the response should be stored in the cluster if it completed
	 * within the provided [wait_for_completion] time (default: false)
	 * <p>
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public final Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * Specify whether format-based query failures (such as providing text to a
	 * numeric field) should be ignored
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * The number of concurrent shard requests per node this search executes
	 * concurrently. This value should be used to limit the impact of the search on
	 * the cluster in order to limit the number of concurrent shard requests
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public final Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * API name: {@code min_compatible_shard_node}
	 */
	@Nullable
	public final String minCompatibleShardNode() {
		return this.minCompatibleShardNode;
	}

	/**
	 * Minimum _score for matching documents. Documents with a lower _score are not
	 * included in the search results.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Double minScore() {
		return this.minScore;
	}

	/**
	 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
	 * specify an &lt;index&gt; in the request path.
	 * <p>
	 * API name: {@code pit}
	 */
	@Nullable
	public final PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public final Query postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public final Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public final Boolean profile() {
		return this.profile;
	}

	/**
	 * Query in the Lucene query string syntax
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public final String q() {
		return this.q;
	}

	/**
	 * Defines the search definition using the Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Specify if request cache should be used for this request or not, defaults to
	 * true
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code rescore}
	 */
	public final List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Retrieve a script evaluation (based on different fields) for each hit.
	 * <p>
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code scroll}
	 */
	@Nullable
	public final String scroll() {
		return this.scroll;
	}

	/**
	 * API name: {@code search_after}
	 */
	public final List<String> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * If true, returns sequence number and primary term of the last modification of
	 * each hit. See Optimistic concurrency control.
	 * <p>
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public final Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * The number of hits to return. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public final SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * Stats groups to associate with the search. Each group maintains a statistics
	 * aggregation for its associated searches. You can retrieve these stats using
	 * the indices stats API.
	 * <p>
	 * API name: {@code stats}
	 */
	public final List<String> stats() {
		return this.stats;
	}

	/**
	 * List of stored fields to return as part of a hit. If no fields are specified,
	 * no stored fields are included in the response. If this field is specified,
	 * the _source parameter defaults to false. You can pass _source: true to return
	 * both source fields and stored fields in the search response.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer> |
							 * _global.search._types.SuggestContainer)
							 */ suggest() {
		return this.suggest;
	}

	/**
	 * Maximum number of documents to collect for each shard. If a query reaches
	 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
	 * documents before sorting. Defaults to 0, which does not terminate query
	 * execution early.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * Specifies the period of time to wait for a response from each shard. If no
	 * response is received before the timeout expires, the request fails and
	 * returns an error. Defaults to no timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * If true, calculate and return document scores, even if the scores are not
	 * used for sorting.
	 * <p>
	 * API name: {@code track_scores}
	 */
	@Nullable
	public final Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * Number of hits matching the query to count accurately. If true, the exact
	 * number of hits is returned at the cost of some performance. If false, the
	 * response does not include the total number of hits matching the query.
	 * Defaults to 10,000 hits.
	 * <p>
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public final JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * If true, returns document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
		return this.version;
	}

	/**
	 * Specify the time that the request should block waiting for the final response
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public final String waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.source != null) {
			generator.writeKey("_source");
			generator.write(this.source);

		}
		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.collapse != null) {
			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}
		if (this.docvalueFields != null) {
			generator.writeKey("docvalue_fields");
			generator.write(this.docvalueFields);

		}
		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue /* Union(_types.DateField | _types.Field) */ item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.highlight != null) {
			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.indicesBoost)) {
			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, Double> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.minScore != null) {
			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.pit != null) {
			generator.writeKey("pit");
			this.pit.serialize(generator, mapper);

		}
		if (this.postFilter != null) {
			generator.writeKey("post_filter");
			this.postFilter.serialize(generator, mapper);

		}
		if (this.profile != null) {
			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.rescore)) {
			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (String item0 : this.searchAfter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.seqNoPrimaryTerm != null) {
			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.slice != null) {
			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.stats)) {
			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.storedFields)) {
			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.suggest != null) {
			generator.writeKey("suggest");
			generator.write(this.suggest);

		}
		if (this.terminateAfter != null) {
			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			generator.write(this.timeout);

		}
		if (this.trackScores != null) {
			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.trackTotalHits != null) {
			generator.writeKey("track_total_hits");
			generator.write(this.trackTotalHits);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SubmitRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SubmitRequest> {
		@Nullable
		private JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private String analyzer;

		@Nullable
		private Long batchedReduceSize;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private JsonValue /*
							 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
							 * _global.search._types.DocValueField)
							 */ docvalueFields;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private List<Map<String, Double>> indicesBoost;

		@Nullable
		private String keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private String minCompatibleShardNode;

		@Nullable
		private Double minScore;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private Query postFilter;

		@Nullable
		private Long preFilterShardSize;

		@Nullable
		private String preference;

		@Nullable
		private Boolean profile;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private String routing;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private String scroll;

		@Nullable
		private List<String> searchAfter;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private Integer size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		@Nullable
		private List<String> stats;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer> |
							 * _global.search._types.SuggestContainer)
							 */ suggest;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits;

		@Nullable
		private Boolean version;

		@Nullable
		private String waitForCompletionTimeout;

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(
				@Nullable JsonValue /*
									 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
									 */ value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 */
		public final Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		public final Builder aggregations(
				Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Indicate if an error should be returned if there is a partial search failure
		 * or timeout
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public final Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * Specify whether wildcard and prefix queries should be analyzed (default:
		 * false)
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public final Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The analyzer to use for the query string
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * The number of shard results that should be reduced at once on the
		 * coordinating node. This value should be used as the granularity at which
		 * progress results will be made available.
		 * <p>
		 * API name: {@code batched_reduce_size}
		 */
		public final Builder batchedReduceSize(@Nullable Long value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * The default operator for query string query (AND or OR)
		 * <p>
		 * API name: {@code default_operator}
		 */
		public final Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as default where no field prefix is given in the query
		 * string
		 * <p>
		 * API name: {@code df}
		 */
		public final Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(
				@Nullable JsonValue /*
									 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
									 * _global.search._types.DocValueField)
									 */ value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * If true, returns detailed information about score computation as part of a
		 * hit.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<JsonValue /* Union(_types.DateField | _types.Field) */> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(JsonValue /* Union(_types.DateField | _types.Field) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Starting document offset. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * Whether specified concrete, expanded or aliased indices should be ignored
		 * when throttled
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public final Builder indicesBoost(@Nullable List<Map<String, Double>> value) {
			this.indicesBoost = value;
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public final Builder indicesBoost(Map<String, Double>... value) {
			this.indicesBoost = Arrays.asList(value);
			return this;
		}

		/**
		 * Update the time interval in which the results (partial or final) for this
		 * search will be available
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Control whether the response should be stored in the cluster if it completed
		 * within the provided [wait_for_completion] time (default: false)
		 * <p>
		 * API name: {@code keep_on_completion}
		 */
		public final Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * Specify whether format-based query failures (such as providing text to a
		 * numeric field) should be ignored
		 * <p>
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * The number of concurrent shard requests per node this search executes
		 * concurrently. This value should be used to limit the impact of the search on
		 * the cluster in order to limit the number of concurrent shard requests
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public final Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * API name: {@code min_compatible_shard_node}
		 */
		public final Builder minCompatibleShardNode(@Nullable String value) {
			this.minCompatibleShardNode = value;
			return this;
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the search results.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code pre_filter_shard_size}
		 */
		public final Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public final Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax
		 * <p>
		 * API name: {@code q}
		 */
		public final Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specify if request cache should be used for this request or not, defaults to
		 * true
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public final Builder rescore(@Nullable List<Rescore> value) {
			this.rescore = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public final Builder rescore(Rescore... value) {
			this.rescore = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		@SafeVarargs
		public final Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>>... fns) {
			this.rescore = new ArrayList<>(fns.length);
			for (Function<Rescore.Builder, ObjectBuilder<Rescore>> fn : fns) {
				this.rescore.add(fn.apply(new Rescore.Builder()).build());
			}
			return this;
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public final Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		public final Builder runtimeMappings(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtimeMappings(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 */
		public final Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		public final Builder scriptFields(
				Function<MapBuilder<String, ScriptField, ScriptField.Builder>, ObjectBuilder<Map<String, ScriptField>>> fn) {
			return scriptFields(fn.apply(new MapBuilder<>(ScriptField.Builder::new)).build());
		}

		/**
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable String value) {
			this.scroll = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public final Builder searchAfter(@Nullable List<String> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public final Builder searchAfter(String... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * If true, returns sequence number and primary term of the last modification of
		 * each hit. See Optimistic concurrency control.
		 * <p>
		 * API name: {@code seq_no_primary_term}
		 */
		public final Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * The number of hits to return. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public final Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public final Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public final Builder suggest(
				@Nullable JsonValue /*
									 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer> |
									 * _global.search._types.SuggestContainer)
									 */ value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Maximum number of documents to collect for each shard. If a query reaches
		 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
		 * documents before sorting. Defaults to 0, which does not terminate query
		 * execution early.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * Specifies the period of time to wait for a response from each shard. If no
		 * response is received before the timeout expires, the request fails and
		 * returns an error. Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * If true, calculate and return document scores, even if the scores are not
		 * used for sorting.
		 * <p>
		 * API name: {@code track_scores}
		 */
		public final Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If true, the exact
		 * number of hits is returned at the cost of some performance. If false, the
		 * response does not include the total number of hits matching the query.
		 * Defaults to 10,000 hits.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable JsonValue /* Union(_types.integer | internal.boolean) */ value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * If true, returns document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Specify the time that the request should block waiting for the final response
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link SubmitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SubmitRequest build() {
			_checkSingleUse();

			return new SubmitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SubmitRequest}
	 */
	public static final JsonpDeserializer<SubmitRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SubmitRequest::setupSubmitRequestDeserializer, Builder::build);

	protected static void setupSubmitRequestDeserializer(DelegatingDeserializer<SubmitRequest.Builder> op) {

		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::docvalueFields, JsonpDeserializer.jsonValueDeserializer(), "docvalue_fields");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::indicesBoost,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer())),
				"indices_boost");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::postFilter, Query._DESERIALIZER, "post_filter");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"search_after");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::suggest, JsonpDeserializer.jsonValueDeserializer(), "suggest");
		op.add(Builder::terminateAfter, JsonpDeserializer.longDeserializer(), "terminate_after");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::trackTotalHits, JsonpDeserializer.jsonValueDeserializer(), "track_total_hits");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.submit}".
	 */
	private static final SimpleEndpoint<SubmitRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_async_search");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_async_search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("typed_keys", "true");
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", String.valueOf(request.preFilterShardSize));
				}
				if (request.minCompatibleShardNode != null) {
					params.put("min_compatible_shard_node", request.minCompatibleShardNode);
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.keepOnCompletion != null) {
					params.put("keep_on_completion", String.valueOf(request.keepOnCompletion));
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (request.allowPartialSearchResults != null) {
					params.put("allow_partial_search_results", String.valueOf(request.allowPartialSearchResults));
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll);
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout);
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.jsonValue());
				}
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive);
				}
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				if (request.batchedReduceSize != null) {
					params.put("batched_reduce_size", String.valueOf(request.batchedReduceSize));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code async_search.submit}" endpoint.
	 */
	public static <TDocument> Endpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> createSubmitEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(SubmitResponse.createSubmitResponseDeserializer(tDocumentDeserializer));
	}
}
