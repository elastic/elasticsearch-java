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

package co.elastic.clients.elasticsearch.core;

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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _global.search.Request
@JsonpDeserializable
public final class SearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

	@Nullable
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Map<String, Aggregation> aggs;

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

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final List<String> index;

	@Nullable
	private final List<Map<String, Double>> indicesBoost;

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

	@Nullable
	private final List<Rescore> rescore;

	@Nullable
	private final String routing;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final String scroll;

	@Nullable
	private final List<String> searchAfter;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	@Nullable
	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	@Nullable
	private final List<String> stats;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
							 * (singleKey = false) | _global.search._types.SuggestContainer)
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
	private final Boolean typedKeys;

	@Nullable
	private final Boolean version;

	// ---------------------------------------------------------------------------------------------

	public SearchRequest(Builder builder) {

		this.source = builder.source;
		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
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
		this.typedKeys = builder.typedKeys;
		this.version = builder.version;

	}

	public SearchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Indicates which source fields are returned for matching documents. These
	 * fields are returned in the hits._source property of the search response.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /*
						 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
						 */ source() {
		return this.source;
	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Indicate if an error should be returned if there is a partial search failure
	 * or timeout
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * Specify whether wildcard and prefix queries should be analyzed (default:
	 * false)
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The analyzer to use for the query string
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * The number of shard results that should be reduced at once on the
	 * coordinating node. This value should be used as a protection mechanism to
	 * reduce the memory overhead per search request if the potential number of
	 * shards in the request can be large.
	 * <p>
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public Long batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * Indicates whether network round-trips should be minimized as part of
	 * cross-cluster search requests execution
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * The default operator for query string query (AND or OR)
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as default where no field prefix is given in the query
	 * string
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns doc values for field
	 * names matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public JsonValue /*
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
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, returns detailed information about score computation as part of a
	 * hit.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns values for field names
	 * matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue /* Union(_types.DateField | _types.Field) */> fields() {
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
	public Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Highlight highlight() {
		return this.highlight;
	}

	/**
	 * Whether specified concrete, expanded or aliased indices should be ignored
	 * when throttled
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of index names to search; use <code>_all</code> or
	 * empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Boosts the _score of documents from specified indices.
	 * <p>
	 * API name: {@code indices_boost}
	 */
	@Nullable
	public List<Map<String, Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * Specify whether format-based query failures (such as providing text to a
	 * numeric field) should be ignored
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
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
	public Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * The minimum compatible version that all shards involved in search should have
	 * for this request to be successful
	 * <p>
	 * API name: {@code min_compatible_shard_node}
	 */
	@Nullable
	public String minCompatibleShardNode() {
		return this.minCompatibleShardNode;
	}

	/**
	 * Minimum _score for matching documents. Documents with a lower _score are not
	 * included in the search results.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public Double minScore() {
		return this.minScore;
	}

	/**
	 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
	 * specify an &lt;index&gt; in the request path.
	 * <p>
	 * API name: {@code pit}
	 */
	@Nullable
	public PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public Query postFilter() {
		return this.postFilter;
	}

	/**
	 * A threshold that enforces a pre-filter roundtrip to prefilter search shards
	 * based on query rewriting if the number of shards the search request expands
	 * to exceeds the threshold. This filter roundtrip can limit the number of
	 * shards significantly if for instance a shard can not match any documents
	 * based on its rewrite method ie. if date filters are mandatory to match but
	 * the shard bounds and the query are disjoint.
	 * <p>
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Boolean profile() {
		return this.profile;
	}

	/**
	 * Query in the Lucene query string syntax
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public String q() {
		return this.q;
	}

	/**
	 * Defines the search definition using the Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public Query query() {
		return this.query;
	}

	/**
	 * Specify if request cache should be used for this request or not, defaults to
	 * index level setting
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code rescore}
	 */
	@Nullable
	public List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Retrieve a script evaluation (based on different fields) for each hit.
	 * <p>
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * Specify how long a consistent view of the index should be maintained for
	 * scrolled search
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public String scroll() {
		return this.scroll;
	}

	/**
	 * API name: {@code search_after}
	 */
	@Nullable
	public List<String> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * If true, returns sequence number and primary term of the last modification of
	 * each hit. See Optimistic concurrency control.
	 * <p>
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public Boolean seqNoPrimaryTerm() {
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
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * Stats groups to associate with the search. Each group maintains a statistics
	 * aggregation for its associated searches. You can retrieve these stats using
	 * the indices stats API.
	 * <p>
	 * API name: {@code stats}
	 */
	@Nullable
	public List<String> stats() {
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
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public JsonValue /*
						 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
						 * (singleKey = false) | _global.search._types.SuggestContainer)
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
	public Long terminateAfter() {
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
	public String timeout() {
		return this.timeout;
	}

	/**
	 * If true, calculate and return document scores, even if the scores are not
	 * used for sorting.
	 * <p>
	 * API name: {@code track_scores}
	 */
	@Nullable
	public Boolean trackScores() {
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
	public JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * Specify whether aggregation and suggester names should be prefixed by their
	 * respective types in the response
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * If true, returns document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
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
		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
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
		if (this.fields != null) {

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
		if (this.indicesBoost != null) {

			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				for (Map.Entry<String, Double> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					generator.write(item1.getValue());

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
		if (this.rescore != null) {

			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.searchAfter != null) {

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
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.stats != null) {

			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.storedFields != null) {

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
	 * Builder for {@link SearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<SearchRequest> {
		@Nullable
		private JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, Aggregation> aggs;

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
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
							 * (singleKey = false) | _global.search._types.SuggestContainer)
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
		private Boolean typedKeys;

		@Nullable
		private Boolean version;

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(
				@Nullable JsonValue /*
									 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
									 */ value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Aggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Aggregation value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Indicate if an error should be returned if there is a partial search failure
		 * or timeout
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * Specify whether wildcard and prefix queries should be analyzed (default:
		 * false)
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The analyzer to use for the query string
		 * <p>
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * The number of shard results that should be reduced at once on the
		 * coordinating node. This value should be used as a protection mechanism to
		 * reduce the memory overhead per search request if the potential number of
		 * shards in the request can be large.
		 * <p>
		 * API name: {@code batched_reduce_size}
		 */
		public Builder batchedReduceSize(@Nullable Long value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * Indicates whether network round-trips should be minimized as part of
		 * cross-cluster search requests execution
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * The default operator for query string query (AND or OR)
		 * <p>
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as default where no field prefix is given in the query
		 * string
		 * <p>
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(@Nullable JsonValue /*
															 * Union(Array<Union(_global.search._types.DocValueField |
															 * _types.Field)> | _global.search._types.DocValueField)
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
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * If true, returns detailed information about score computation as part of a
		 * hit.
		 * <p>
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<JsonValue /* Union(_types.DateField | _types.Field) */> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue /* Union(_types.DateField | _types.Field) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue /* Union(_types.DateField | _types.Field) */ value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Starting document offset. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * Whether specified concrete, expanded or aliased indices should be ignored
		 * when throttled
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(@Nullable List<Map<String, Double>> value) {
			this.indicesBoost = value;
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(Map<String, Double>... value) {
			this.indicesBoost = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indicesBoost(List)}, creating the list if needed.
		 */
		public Builder addIndicesBoost(Map<String, Double> value) {
			if (this.indicesBoost == null) {
				this.indicesBoost = new ArrayList<>();
			}
			this.indicesBoost.add(value);
			return this;
		}

		/**
		 * Specify whether format-based query failures (such as providing text to a
		 * numeric field) should be ignored
		 * <p>
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
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
		public Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * The minimum compatible version that all shards involved in search should have
		 * for this request to be successful
		 * <p>
		 * API name: {@code min_compatible_shard_node}
		 */
		public Builder minCompatibleShardNode(@Nullable String value) {
			this.minCompatibleShardNode = value;
			return this;
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the search results.
		 * <p>
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * A threshold that enforces a pre-filter roundtrip to prefilter search shards
		 * based on query rewriting if the number of shards the search request expands
		 * to exceeds the threshold. This filter roundtrip can limit the number of
		 * shards significantly if for instance a shard can not match any documents
		 * based on its rewrite method ie. if date filters are mandatory to match but
		 * the shard bounds and the query are disjoint.
		 * <p>
		 * API name: {@code pre_filter_shard_size}
		 */
		public Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax
		 * <p>
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specify if request cache should be used for this request or not, defaults to
		 * index level setting
		 * <p>
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(@Nullable List<Rescore> value) {
			this.rescore = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(Rescore... value) {
			this.rescore = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Rescore value) {
			if (this.rescore == null) {
				this.rescore = new ArrayList<>();
			}
			this.rescore.add(value);
			return this;
		}

		/**
		 * Set {@link #rescore(List)} to a singleton list.
		 */
		public Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.addRescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, RuntimeField value) {
			if (this.runtimeMappings == null) {
				this.runtimeMappings = new HashMap<>();
			}
			this.runtimeMappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * Specify how long a consistent view of the index should be maintained for
		 * scrolled search
		 * <p>
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable String value) {
			this.scroll = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(@Nullable List<String> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(String... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searchAfter(List)}, creating the list if needed.
		 */
		public Builder addSearchAfter(String value) {
			if (this.searchAfter == null) {
				this.searchAfter = new ArrayList<>();
			}
			this.searchAfter.add(value);
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * If true, returns sequence number and primary term of the last modification of
		 * each hit. See Optimistic concurrency control.
		 * <p>
		 * API name: {@code seq_no_primary_term}
		 */
		public Builder seqNoPrimaryTerm(@Nullable Boolean value) {
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
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue /* _global.search._types.SortCombinations */ value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 */
		public Builder stats(@Nullable List<String> value) {
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
		public Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(String value) {
			if (this.stats == null) {
				this.stats = new ArrayList<>();
			}
			this.stats.add(value);
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
		public Builder storedFields(@Nullable List<String> value) {
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
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder suggest(
				@Nullable JsonValue /*
									 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
									 * (singleKey = false) | _global.search._types.SuggestContainer)
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
		public Builder terminateAfter(@Nullable Long value) {
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
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * If true, calculate and return document scores, even if the scores are not
		 * used for sorting.
		 * <p>
		 * API name: {@code track_scores}
		 */
		public Builder trackScores(@Nullable Boolean value) {
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
		public Builder trackTotalHits(@Nullable JsonValue /* Union(_types.integer | internal.boolean) */ value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * Specify whether aggregation and suggester names should be prefixed by their
		 * respective types in the response
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * If true, returns document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link SearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchRequest build() {

			return new SearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchRequest}
	 */
	public static final JsonpDeserializer<SearchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchRequest::setupSearchRequestDeserializer, Builder::build);

	protected static void setupSearchRequestDeserializer(DelegatingDeserializer<SearchRequest.Builder> op) {

		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
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
	 * Endpoint "{@code search}".
	 */
	private static final SimpleEndpoint<SearchRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_search");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
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
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				if (request.allowPartialSearchResults != null) {
					params.put("allow_partial_search_results", String.valueOf(request.allowPartialSearchResults));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
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
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
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
	 * Create an "{@code search}" endpoint.
	 */
	public static <TDocument> Endpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> createSearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(SearchResponse.createSearchResponseDeserializer(tDocumentDeserializer));
	}
}
