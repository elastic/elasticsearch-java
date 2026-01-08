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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.KnnSearch;
import co.elastic.clients.elasticsearch._types.Rank;
import co.elastic.clients.elasticsearch._types.RankVariant;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Retriever;
import co.elastic.clients.elasticsearch._types.RetrieverVariant;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationVariant;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.FieldAndFormat;
import co.elastic.clients.elasticsearch._types.query_dsl.Operator;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.elasticsearch.core.search.FieldCollapse;
import co.elastic.clients.elasticsearch.core.search.Highlight;
import co.elastic.clients.elasticsearch.core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch.core.search.Rescore;
import co.elastic.clients.elasticsearch.core.search.RescoreVariant;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.elasticsearch.core.search.Suggester;
import co.elastic.clients.elasticsearch.core.search.TrackHits;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.search.Request

/**
 * Run a search.
 * <p>
 * Get search hits that match the query defined in the request. You can provide
 * search queries using the <code>q</code> query string parameter or the request
 * body. If both are specified, only the query parameter is used.
 * <p>
 * If the Elasticsearch security features are enabled, you must have the read
 * index privilege for the target data stream, index, or alias. For
 * cross-cluster search, refer to the documentation about configuring CCS
 * privileges. To search a point in time (PIT) for an alias, you must have the
 * <code>read</code> index privilege for the alias's data streams or indices.
 * <p>
 * <strong>Search slicing</strong>
 * <p>
 * When paging through a large number of documents, it can be helpful to split
 * the search into multiple slices to consume them independently with the
 * <code>slice</code> and <code>pit</code> properties. By default the splitting
 * is done first on the shards, then locally on each shard. The local splitting
 * partitions the shard into contiguous ranges based on Lucene document IDs.
 * <p>
 * For instance if the number of shards is equal to 2 and you request 4 slices,
 * the slices 0 and 2 are assigned to the first shard and the slices 1 and 3 are
 * assigned to the second shard.
 * <p>
 * IMPORTANT: The same point-in-time ID should be used for all slices. If
 * different PIT IDs are used, slices can overlap and miss documents. This
 * situation can occur because the splitting criterion is based on Lucene
 * document IDs, which are not stable across changes to the index.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.search.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final SourceConfig source;

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
	private final Operator defaultOperator;

	@Nullable
	private final String df;

	private final List<FieldAndFormat> docvalueFields;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean explain;

	private final Map<String, JsonData> ext;

	private final List<FieldAndFormat> fields;

	@Nullable
	private final Boolean forceSyntheticSource;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeNamedQueriesScore;

	private final List<String> index;

	private final List<NamedValue<Double>> indicesBoost;

	private final List<KnnSearch> knn;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Integer maxConcurrentShardRequests;

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
	private final String projectRouting;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	@Nullable
	private final Rank rank;

	@Nullable
	private final Boolean requestCache;

	private final List<Rescore> rescore;

	@Nullable
	private final Retriever retriever;

	private final List<String> routing;

	private final Map<String, RuntimeField> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Time scroll;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	private final List<SortOptions> sort;

	private final List<String> stats;

	private final List<String> storedFields;

	@Nullable
	private final Suggester suggest;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final TrackHits trackTotalHits;

	@Nullable
	private final Boolean version;

	// ---------------------------------------------------------------------------------------------

	private SearchRequest(Builder builder) {

		this.source = builder.source;
		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.allowNoIndices = builder.allowNoIndices;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.batchedReduceSize = builder.batchedReduceSize;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.collapse = builder.collapse;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.docvalueFields = ApiTypeHelper.unmodifiable(builder.docvalueFields);
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.explain = builder.explain;
		this.ext = ApiTypeHelper.unmodifiable(builder.ext);
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.forceSyntheticSource = builder.forceSyntheticSource;
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeNamedQueriesScore = builder.includeNamedQueriesScore;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.indicesBoost = ApiTypeHelper.unmodifiable(builder.indicesBoost);
		this.knn = ApiTypeHelper.unmodifiable(builder.knn);
		this.lenient = builder.lenient;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.minScore = builder.minScore;
		this.pit = builder.pit;
		this.postFilter = builder.postFilter;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.preference = builder.preference;
		this.profile = builder.profile;
		this.projectRouting = builder.projectRouting;
		this.q = builder.q;
		this.query = builder.query;
		this.rank = builder.rank;
		this.requestCache = builder.requestCache;
		this.rescore = ApiTypeHelper.unmodifiable(builder.rescore);
		this.retriever = builder.retriever;
		this.routing = ApiTypeHelper.unmodifiable(builder.routing);
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.scroll = builder.scroll;
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.searchType = builder.searchType;
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.stats = ApiTypeHelper.unmodifiable(builder.stats);
		this.storedFields = ApiTypeHelper.unmodifiable(builder.storedFields);
		this.suggest = builder.suggest;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.trackTotalHits = builder.trackTotalHits;
		this.version = builder.version;

	}

	public static SearchRequest of(Function<Builder, ObjectBuilder<SearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The source fields that are returned for matching documents. These fields are
	 * returned in the <code>hits._source</code> property of the search response. If
	 * the <code>stored_fields</code> property is specified, the
	 * <code>_source</code> property defaults to <code>false</code>. Otherwise, it
	 * defaults to <code>true</code>.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * Defines the aggregations that are run as part of the search request.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
	 * error if an index starts with <code>foo</code> but no index starts with
	 * <code>bar</code>.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If <code>true</code> and there are shard request timeouts or shard failures,
	 * the request returns partial results. If <code>false</code>, it returns an
	 * error with no partial results.
	 * <p>
	 * To override the default behavior, you can set the
	 * <code>search.default_allow_partial_results</code> cluster setting to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public final Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * If <code>true</code>, wildcard and prefix queries are analyzed. This
	 * parameter can be used only when the <code>q</code> query string parameter is
	 * specified.
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public final Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The analyzer to use for the query string. This parameter can be used only
	 * when the <code>q</code> query string parameter is specified.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * The number of shard results that should be reduced at once on the
	 * coordinating node. If the potential number of shards in the request can be
	 * large, this value should be used as a protection mechanism to reduce the
	 * memory overhead per search request.
	 * <p>
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public final Long batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * If <code>true</code>, network round-trips between the coordinating node and
	 * the remote clusters are minimized when running cross-cluster search (CCS)
	 * requests.
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Collapses search results the values of the specified field.
	 * <p>
	 * API name: {@code collapse}
	 */
	@Nullable
	public final FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * The default operator for the query string query: <code>and</code> or
	 * <code>or</code>. This parameter can be used only when the <code>q</code>
	 * query string parameter is specified.
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public final Operator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as a default when no field prefix is given in the query
	 * string. This parameter can be used only when the <code>q</code> query string
	 * parameter is specified.
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public final String df() {
		return this.df;
	}

	/**
	 * An array of wildcard (<code>*</code>) field patterns. The request returns doc
	 * values for field names matching these patterns in the
	 * <code>hits.fields</code> property of the response.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	public final List<FieldAndFormat> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * The type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. It supports comma-separated values such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>true</code>, the request returns detailed information about score
	 * computation as part of a hit.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * Configuration of search extensions defined by Elasticsearch plugins.
	 * <p>
	 * API name: {@code ext}
	 */
	public final Map<String, JsonData> ext() {
		return this.ext;
	}

	/**
	 * An array of wildcard (<code>*</code>) field patterns. The request returns
	 * values for field names matching these patterns in the
	 * <code>hits.fields</code> property of the response.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<FieldAndFormat> fields() {
		return this.fields;
	}

	/**
	 * Should this request force synthetic _source? Use this to test if the mapping
	 * supports synthetic _source and to get a sense of the worst case performance.
	 * Fetches with this enabled will be slower the enabling synthetic source
	 * natively in the index.
	 * <p>
	 * API name: {@code force_synthetic_source}
	 */
	@Nullable
	public final Boolean forceSyntheticSource() {
		return this.forceSyntheticSource;
	}

	/**
	 * The starting document offset, which must be non-negative. By default, you
	 * cannot page through more than 10,000 hits using the <code>from</code> and
	 * <code>size</code> parameters. To page through more hits, use the
	 * <code>search_after</code> parameter.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Specifies the highlighter to use for retrieving highlighted snippets from one
	 * or more fields in your search results.
	 * <p>
	 * API name: {@code highlight}
	 */
	@Nullable
	public final Highlight highlight() {
		return this.highlight;
	}

	/**
	 * If <code>true</code>, concrete, expanded or aliased indices will be ignored
	 * when frozen.
	 * <p>
	 * API name: {@code ignore_throttled}
	 * 
	 * @deprecated 7.16.0
	 */
	@Deprecated
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If <code>true</code>, the response includes the score contribution from any
	 * named queries.
	 * <p>
	 * This functionality reruns each named query on every hit in a search response.
	 * Typically, this adds a small overhead to a request. However, using
	 * computationally expensive named queries on a large number of hits may add
	 * significant overhead.
	 * <p>
	 * API name: {@code include_named_queries_score}
	 */
	@Nullable
	public final Boolean includeNamedQueriesScore() {
		return this.includeNamedQueriesScore;
	}

	/**
	 * A comma-separated list of data streams, indices, and aliases to search. It
	 * supports wildcards (<code>*</code>). To search all data streams and indices,
	 * omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Boost the <code>_score</code> of documents from specified indices. The boost
	 * value is the factor by which scores are multiplied. A boost value greater
	 * than <code>1.0</code> increases the score. A boost value between
	 * <code>0</code> and <code>1.0</code> decreases the score.
	 * <p>
	 * API name: {@code indices_boost}
	 */
	public final List<NamedValue<Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * The approximate kNN search to run.
	 * <p>
	 * API name: {@code knn}
	 */
	public final List<KnnSearch> knn() {
		return this.knn;
	}

	/**
	 * If <code>true</code>, format-based query failures (such as providing text to
	 * a numeric field) in the query string will be ignored. This parameter can be
	 * used only when the <code>q</code> query string parameter is specified.
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * The number of concurrent shard requests per node that the search runs
	 * concurrently. This value should be used to limit the impact of the search on
	 * the cluster in order to limit the number of concurrent shard requests.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public final Integer maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * The minimum <code>_score</code> for matching documents. Documents with a
	 * lower <code>_score</code> are not included in search results and results
	 * collected by aggregations.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public final Double minScore() {
		return this.minScore;
	}

	/**
	 * Limit the search to a point in time (PIT). If you provide a PIT, you cannot
	 * specify an <code>&lt;index&gt;</code> in the request path.
	 * <p>
	 * API name: {@code pit}
	 */
	@Nullable
	public final PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * Use the <code>post_filter</code> parameter to filter search results. The
	 * search hits are filtered after the aggregations are calculated. A post filter
	 * has no impact on the aggregation results.
	 * <p>
	 * API name: {@code post_filter}
	 */
	@Nullable
	public final Query postFilter() {
		return this.postFilter;
	}

	/**
	 * A threshold that enforces a pre-filter roundtrip to prefilter search shards
	 * based on query rewriting if the number of shards the search request expands
	 * to exceeds the threshold. This filter roundtrip can limit the number of
	 * shards significantly if for instance a shard can not match any documents
	 * based on its rewrite method (if date filters are mandatory to match but the
	 * shard bounds and the query are disjoint). When unspecified, the pre-filter
	 * phase is executed if any of these conditions is met:
	 * <ul>
	 * <li>The request targets more than 128 shards.</li>
	 * <li>The request targets one or more read-only index.</li>
	 * <li>The primary sort of the query targets an indexed field.</li>
	 * </ul>
	 * <p>
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public final Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * The nodes and shards used for the search. By default, Elasticsearch selects
	 * from eligible nodes and shards using adaptive replica selection, accounting
	 * for allocation awareness. Valid values are:
	 * <ul>
	 * <li><code>_only_local</code> to run the search only on shards on the local
	 * node.</li>
	 * <li><code>_local</code> to, if possible, run the search on shards on the
	 * local node, or if not, select shards using the default method.</li>
	 * <li><code>_only_nodes:&lt;node-id&gt;,&lt;node-id&gt;</code> to run the
	 * search on only the specified nodes IDs. If suitable shards exist on more than
	 * one selected node, use shards on those nodes using the default method. If
	 * none of the specified nodes are available, select shards from any available
	 * node using the default method.</li>
	 * <li><code>_prefer_nodes:&lt;node-id&gt;,&lt;node-id&gt;</code> to if
	 * possible, run the search on the specified nodes IDs. If not, select shards
	 * using the default method.</li>
	 * <li><code>_shards:&lt;shard&gt;,&lt;shard&gt;</code> to run the search only
	 * on the specified shards. You can combine this value with other
	 * <code>preference</code> values. However, the <code>_shards</code> value must
	 * come first. For example: <code>_shards:2,3|_local</code>.</li>
	 * <li><code>&lt;custom-string&gt;</code> (any string that does not start with
	 * <code>_</code>) to route searches with the same
	 * <code>&lt;custom-string&gt;</code> to the same shards in the same order.</li>
	 * </ul>
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * Set to <code>true</code> to return detailed timing information about the
	 * execution of individual components in a search request. NOTE: This is a
	 * debugging tool and adds significant overhead to search execution.
	 * <p>
	 * API name: {@code profile}
	 */
	@Nullable
	public final Boolean profile() {
		return this.profile;
	}

	/**
	 * Specifies a subset of projects to target for the search using project
	 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
	 * _alias tag and a single value (possibly wildcarded). Examples:
	 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
	 * only.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	/**
	 * A query in the Lucene query string syntax. Query parameter searches do not
	 * support the full Elasticsearch Query DSL but are handy for testing.
	 * <p>
	 * IMPORTANT: This parameter overrides the query parameter in the request body.
	 * If both parameters are specified, documents matching the query request body
	 * parameter are not returned.
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public final String q() {
		return this.q;
	}

	/**
	 * The search definition using the Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * The Reciprocal Rank Fusion (RRF) to use.
	 * <p>
	 * API name: {@code rank}
	 */
	@Nullable
	public final Rank rank() {
		return this.rank;
	}

	/**
	 * If <code>true</code>, the caching of search results is enabled for requests
	 * where <code>size</code> is <code>0</code>. It defaults to index level
	 * settings.
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * Can be used to improve precision by reordering just the top (for example 100
	 * - 500) documents returned by the <code>query</code> and
	 * <code>post_filter</code> phases.
	 * <p>
	 * API name: {@code rescore}
	 */
	public final List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * A retriever is a specification to describe top documents returned from a
	 * search. A retriever replaces other elements of the search API that also
	 * return top documents such as <code>query</code> and <code>knn</code>.
	 * <p>
	 * API name: {@code retriever}
	 */
	@Nullable
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * A custom value that is used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	public final List<String> routing() {
		return this.routing;
	}

	/**
	 * One or more runtime fields in the search request. These fields take
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
	 * The period to retain the search context for scrolling. By default, this value
	 * cannot exceed <code>1d</code> (24 hours). You can change this limit by using
	 * the <code>search.max_keep_alive</code> cluster-level setting.
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public final Time scroll() {
		return this.scroll;
	}

	/**
	 * Used to retrieve the next page of hits using a set of sort values from the
	 * previous page.
	 * <p>
	 * API name: {@code search_after}
	 */
	public final List<FieldValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * Indicates how distributed term frequencies are calculated for relevance
	 * scoring.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * If <code>true</code>, the request returns sequence number and primary term of
	 * the last modification of each hit.
	 * <p>
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public final Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * The number of hits to return, which must not be negative. By default, you
	 * cannot page through more than 10,000 hits using the <code>from</code> and
	 * <code>size</code> parameters. To page through more hits, use the
	 * <code>search_after</code> property.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Split a scrolled search into multiple slices that can be consumed
	 * independently.
	 * <p>
	 * API name: {@code slice}
	 */
	@Nullable
	public final SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * The stats groups to associate with the search. Each group maintains a
	 * statistics aggregation for its associated searches. You can retrieve these
	 * stats using the indices stats API.
	 * <p>
	 * API name: {@code stats}
	 */
	public final List<String> stats() {
		return this.stats;
	}

	/**
	 * A comma-separated list of stored fields to return as part of a hit. If no
	 * fields are specified, no stored fields are included in the response. If this
	 * field is specified, the <code>_source</code> property defaults to
	 * <code>false</code>. You can pass <code>_source: true</code> to return both
	 * source fields and stored fields in the search response.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * Defines a suggester that provides similar looking terms based on a provided
	 * text.
	 * <p>
	 * API name: {@code suggest}
	 */
	@Nullable
	public final Suggester suggest() {
		return this.suggest;
	}

	/**
	 * The maximum number of documents to collect for each shard. If a query reaches
	 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
	 * documents before sorting.
	 * <p>
	 * IMPORTANT: Use with caution. Elasticsearch applies this property to each
	 * shard handling the request. When possible, let Elasticsearch perform early
	 * termination automatically. Avoid specifying this property for requests that
	 * target data streams with backing indices across multiple data tiers.
	 * <p>
	 * If set to <code>0</code> (default), the query does not terminate early.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * The period of time to wait for a response from each shard. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * Defaults to no timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, calculate and return document scores, even if the
	 * scores are not used for sorting.
	 * <p>
	 * API name: {@code track_scores}
	 */
	@Nullable
	public final Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * Number of hits matching the query to count accurately. If <code>true</code>,
	 * the exact number of hits is returned at the cost of some performance. If
	 * <code>false</code>, the response does not include the total number of hits
	 * matching the query.
	 * <p>
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public final TrackHits trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * If <code>true</code>, the request returns the document version as part of a
	 * hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
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
			this.source.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.aggregations)) {
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
		if (ApiTypeHelper.isDefined(this.docvalueFields)) {
			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.docvalueFields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (ApiTypeHelper.isDefined(this.ext)) {
			generator.writeKey("ext");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.ext.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.fields) {
				item0.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.indicesBoost)) {
			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (NamedValue<Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				generator.write(item0.value());

				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.knn)) {
			generator.writeKey("knn");
			generator.writeStartArray();
			for (KnnSearch item0 : this.knn) {
				item0.serialize(generator, mapper);

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
		if (this.projectRouting != null) {
			generator.writeKey("project_routing");
			generator.write(this.projectRouting);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.rank != null) {
			generator.writeKey("rank");
			this.rank.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.rescore)) {
			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.retriever != null) {
			generator.writeKey("retriever");
			this.retriever.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (FieldValue item0 : this.searchAfter) {
				item0.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.stats)) {
			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.storedFields)) {
			generator.writeKey("stored_fields");
			if (this.storedFields.size() == 1) {
				String singleItem = this.storedFields.get(0);
				generator.write(singleItem);

			} else {
				generator.writeStartArray();
				for (String item0 : this.storedFields) {
					generator.write(item0);

				}
				generator.writeEnd();
			}

		}
		if (this.suggest != null) {
			generator.writeKey("suggest");
			this.suggest.serialize(generator, mapper);

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
			this.trackTotalHits.serialize(generator, mapper);

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

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<SearchRequest> {
		@Nullable
		private SourceConfig source;

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
		private Operator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<FieldAndFormat> docvalueFields;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private Map<String, JsonData> ext;

		@Nullable
		private List<FieldAndFormat> fields;

		@Nullable
		private Boolean forceSyntheticSource;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeNamedQueriesScore;

		@Nullable
		private List<String> index;

		@Nullable
		private List<NamedValue<Double>> indicesBoost;

		@Nullable
		private List<KnnSearch> knn;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Integer maxConcurrentShardRequests;

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
		private String projectRouting;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		@Nullable
		private Rank rank;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private Retriever retriever;

		@Nullable
		private List<String> routing;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Time scroll;

		@Nullable
		private List<FieldValue> searchAfter;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private Integer size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private List<String> stats;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Suggester suggest;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private TrackHits trackTotalHits;

		@Nullable
		private Boolean version;

		/**
		 * The source fields that are returned for matching documents. These fields are
		 * returned in the <code>hits._source</code> property of the search response. If
		 * the <code>stored_fields</code> property is specified, the
		 * <code>_source</code> property defaults to <code>false</code>. Otherwise, it
		 * defaults to <code>true</code>.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * The source fields that are returned for matching documents. These fields are
		 * returned in the <code>hits._source</code> property of the search response. If
		 * the <code>stored_fields</code> property is specified, the
		 * <code>_source</code> property defaults to <code>false</code>. Otherwise, it
		 * defaults to <code>true</code>.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceConfig.Builder, ObjectBuilder<SourceConfig>> fn) {
			return this.source(fn.apply(new SourceConfig.Builder()).build());
		}

		/**
		 * Defines the aggregations that are run as part of the search request.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * Defines the aggregations that are run as part of the search request.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * Defines the aggregations that are run as part of the search request.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, AggregationVariant value) {
			this.aggregations = _mapPut(this.aggregations, key, value._toAggregation());
			return this;
		}

		/**
		 * Defines the aggregations that are run as part of the search request.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
		 * error if an index starts with <code>foo</code> but no index starts with
		 * <code>bar</code>.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If <code>true</code> and there are shard request timeouts or shard failures,
		 * the request returns partial results. If <code>false</code>, it returns an
		 * error with no partial results.
		 * <p>
		 * To override the default behavior, you can set the
		 * <code>search.default_allow_partial_results</code> cluster setting to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public final Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * If <code>true</code>, wildcard and prefix queries are analyzed. This
		 * parameter can be used only when the <code>q</code> query string parameter is
		 * specified.
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public final Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The analyzer to use for the query string. This parameter can be used only
		 * when the <code>q</code> query string parameter is specified.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * The number of shard results that should be reduced at once on the
		 * coordinating node. If the potential number of shards in the request can be
		 * large, this value should be used as a protection mechanism to reduce the
		 * memory overhead per search request.
		 * <p>
		 * API name: {@code batched_reduce_size}
		 */
		public final Builder batchedReduceSize(@Nullable Long value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * If <code>true</code>, network round-trips between the coordinating node and
		 * the remote clusters are minimized when running cross-cluster search (CCS)
		 * requests.
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Collapses search results the values of the specified field.
		 * <p>
		 * API name: {@code collapse}
		 */
		public final Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * Collapses search results the values of the specified field.
		 * <p>
		 * API name: {@code collapse}
		 */
		public final Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * The default operator for the query string query: <code>and</code> or
		 * <code>or</code>. This parameter can be used only when the <code>q</code>
		 * query string parameter is specified.
		 * <p>
		 * API name: {@code default_operator}
		 */
		public final Builder defaultOperator(@Nullable Operator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as a default when no field prefix is given in the query
		 * string. This parameter can be used only when the <code>q</code> query string
		 * parameter is specified.
		 * <p>
		 * API name: {@code df}
		 */
		public final Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns doc
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docvalueFields</code>.
		 */
		public final Builder docvalueFields(List<FieldAndFormat> list) {
			this.docvalueFields = _listAddAll(this.docvalueFields, list);
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns doc
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds one or more values to <code>docvalueFields</code>.
		 */
		public final Builder docvalueFields(FieldAndFormat value, FieldAndFormat... values) {
			this.docvalueFields = _listAdd(this.docvalueFields, value, values);
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns doc
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 * <p>
		 * Adds a value to <code>docvalueFields</code> using a builder lambda.
		 */
		public final Builder docvalueFields(Function<FieldAndFormat.Builder, ObjectBuilder<FieldAndFormat>> fn) {
			return docvalueFields(fn.apply(new FieldAndFormat.Builder()).build());
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values such as
		 * <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the request returns detailed information about score
		 * computation as part of a hit.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Configuration of search extensions defined by Elasticsearch plugins.
		 * <p>
		 * API name: {@code ext}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ext</code>.
		 */
		public final Builder ext(Map<String, JsonData> map) {
			this.ext = _mapPutAll(this.ext, map);
			return this;
		}

		/**
		 * Configuration of search extensions defined by Elasticsearch plugins.
		 * <p>
		 * API name: {@code ext}
		 * <p>
		 * Adds an entry to <code>ext</code>.
		 */
		public final Builder ext(String key, JsonData value) {
			this.ext = _mapPut(this.ext, key, value);
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<FieldAndFormat> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(FieldAndFormat value, FieldAndFormat... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * An array of wildcard (<code>*</code>) field patterns. The request returns
		 * values for field names matching these patterns in the
		 * <code>hits.fields</code> property of the response.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<FieldAndFormat.Builder, ObjectBuilder<FieldAndFormat>> fn) {
			return fields(fn.apply(new FieldAndFormat.Builder()).build());
		}

		/**
		 * Should this request force synthetic _source? Use this to test if the mapping
		 * supports synthetic _source and to get a sense of the worst case performance.
		 * Fetches with this enabled will be slower the enabling synthetic source
		 * natively in the index.
		 * <p>
		 * API name: {@code force_synthetic_source}
		 */
		public final Builder forceSyntheticSource(@Nullable Boolean value) {
			this.forceSyntheticSource = value;
			return this;
		}

		/**
		 * The starting document offset, which must be non-negative. By default, you
		 * cannot page through more than 10,000 hits using the <code>from</code> and
		 * <code>size</code> parameters. To page through more hits, use the
		 * <code>search_after</code> parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the highlighter to use for retrieving highlighted snippets from one
		 * or more fields in your search results.
		 * <p>
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * Specifies the highlighter to use for retrieving highlighted snippets from one
		 * or more fields in your search results.
		 * <p>
		 * API name: {@code highlight}
		 */
		public final Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * If <code>true</code>, concrete, expanded or aliased indices will be ignored
		 * when frozen.
		 * <p>
		 * API name: {@code ignore_throttled}
		 * 
		 * @deprecated 7.16.0
		 */
		@Deprecated
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes the score contribution from any
		 * named queries.
		 * <p>
		 * This functionality reruns each named query on every hit in a search response.
		 * Typically, this adds a small overhead to a request. However, using
		 * computationally expensive named queries on a large number of hits may add
		 * significant overhead.
		 * <p>
		 * API name: {@code include_named_queries_score}
		 */
		public final Builder includeNamedQueriesScore(@Nullable Boolean value) {
			this.includeNamedQueriesScore = value;
			return this;
		}

		/**
		 * A comma-separated list of data streams, indices, and aliases to search. It
		 * supports wildcards (<code>*</code>). To search all data streams and indices,
		 * omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * A comma-separated list of data streams, indices, and aliases to search. It
		 * supports wildcards (<code>*</code>). To search all data streams and indices,
		 * omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Boost the <code>_score</code> of documents from specified indices. The boost
		 * value is the factor by which scores are multiplied. A boost value greater
		 * than <code>1.0</code> increases the score. A boost value between
		 * <code>0</code> and <code>1.0</code> decreases the score.
		 * <p>
		 * API name: {@code indices_boost}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indicesBoost</code>.
		 */
		public final Builder indicesBoost(List<NamedValue<Double>> list) {
			this.indicesBoost = _listAddAll(this.indicesBoost, list);
			return this;
		}

		/**
		 * Boost the <code>_score</code> of documents from specified indices. The boost
		 * value is the factor by which scores are multiplied. A boost value greater
		 * than <code>1.0</code> increases the score. A boost value between
		 * <code>0</code> and <code>1.0</code> decreases the score.
		 * <p>
		 * API name: {@code indices_boost}
		 * <p>
		 * Adds one or more values to <code>indicesBoost</code>.
		 */
		@SafeVarargs
		public final Builder indicesBoost(NamedValue<Double> value, NamedValue<Double>... values) {
			this.indicesBoost = _listAdd(this.indicesBoost, value, values);
			return this;
		}

		/**
		 * The approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>knn</code>.
		 */
		public final Builder knn(List<KnnSearch> list) {
			this.knn = _listAddAll(this.knn, list);
			return this;
		}

		/**
		 * The approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds one or more values to <code>knn</code>.
		 */
		public final Builder knn(KnnSearch value, KnnSearch... values) {
			this.knn = _listAdd(this.knn, value, values);
			return this;
		}

		/**
		 * The approximate kNN search to run.
		 * <p>
		 * API name: {@code knn}
		 * <p>
		 * Adds a value to <code>knn</code> using a builder lambda.
		 */
		public final Builder knn(Function<KnnSearch.Builder, ObjectBuilder<KnnSearch>> fn) {
			return knn(fn.apply(new KnnSearch.Builder()).build());
		}

		/**
		 * If <code>true</code>, format-based query failures (such as providing text to
		 * a numeric field) in the query string will be ignored. This parameter can be
		 * used only when the <code>q</code> query string parameter is specified.
		 * <p>
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * The number of concurrent shard requests per node that the search runs
		 * concurrently. This value should be used to limit the impact of the search on
		 * the cluster in order to limit the number of concurrent shard requests.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public final Builder maxConcurrentShardRequests(@Nullable Integer value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * The minimum <code>_score</code> for matching documents. Documents with a
		 * lower <code>_score</code> are not included in search results and results
		 * collected by aggregations.
		 * <p>
		 * API name: {@code min_score}
		 */
		public final Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Limit the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an <code>&lt;index&gt;</code> in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * Limit the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an <code>&lt;index&gt;</code> in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public final Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * Use the <code>post_filter</code> parameter to filter search results. The
		 * search hits are filtered after the aggregations are calculated. A post filter
		 * has no impact on the aggregation results.
		 * <p>
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * Use the <code>post_filter</code> parameter to filter search results. The
		 * search hits are filtered after the aggregations are calculated. A post filter
		 * has no impact on the aggregation results.
		 * <p>
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Use the <code>post_filter</code> parameter to filter search results. The
		 * search hits are filtered after the aggregations are calculated. A post filter
		 * has no impact on the aggregation results.
		 * <p>
		 * API name: {@code post_filter}
		 */
		public final Builder postFilter(QueryVariant value) {
			this.postFilter = value._toQuery();
			return this;
		}

		/**
		 * A threshold that enforces a pre-filter roundtrip to prefilter search shards
		 * based on query rewriting if the number of shards the search request expands
		 * to exceeds the threshold. This filter roundtrip can limit the number of
		 * shards significantly if for instance a shard can not match any documents
		 * based on its rewrite method (if date filters are mandatory to match but the
		 * shard bounds and the query are disjoint). When unspecified, the pre-filter
		 * phase is executed if any of these conditions is met:
		 * <ul>
		 * <li>The request targets more than 128 shards.</li>
		 * <li>The request targets one or more read-only index.</li>
		 * <li>The primary sort of the query targets an indexed field.</li>
		 * </ul>
		 * <p>
		 * API name: {@code pre_filter_shard_size}
		 */
		public final Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * The nodes and shards used for the search. By default, Elasticsearch selects
		 * from eligible nodes and shards using adaptive replica selection, accounting
		 * for allocation awareness. Valid values are:
		 * <ul>
		 * <li><code>_only_local</code> to run the search only on shards on the local
		 * node.</li>
		 * <li><code>_local</code> to, if possible, run the search on shards on the
		 * local node, or if not, select shards using the default method.</li>
		 * <li><code>_only_nodes:&lt;node-id&gt;,&lt;node-id&gt;</code> to run the
		 * search on only the specified nodes IDs. If suitable shards exist on more than
		 * one selected node, use shards on those nodes using the default method. If
		 * none of the specified nodes are available, select shards from any available
		 * node using the default method.</li>
		 * <li><code>_prefer_nodes:&lt;node-id&gt;,&lt;node-id&gt;</code> to if
		 * possible, run the search on the specified nodes IDs. If not, select shards
		 * using the default method.</li>
		 * <li><code>_shards:&lt;shard&gt;,&lt;shard&gt;</code> to run the search only
		 * on the specified shards. You can combine this value with other
		 * <code>preference</code> values. However, the <code>_shards</code> value must
		 * come first. For example: <code>_shards:2,3|_local</code>.</li>
		 * <li><code>&lt;custom-string&gt;</code> (any string that does not start with
		 * <code>_</code>) to route searches with the same
		 * <code>&lt;custom-string&gt;</code> to the same shards in the same order.</li>
		 * </ul>
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Set to <code>true</code> to return detailed timing information about the
		 * execution of individual components in a search request. NOTE: This is a
		 * debugging tool and adds significant overhead to search execution.
		 * <p>
		 * API name: {@code profile}
		 */
		public final Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * Specifies a subset of projects to target for the search using project
		 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
		 * _alias tag and a single value (possibly wildcarded). Examples:
		 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
		 * only.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		/**
		 * A query in the Lucene query string syntax. Query parameter searches do not
		 * support the full Elasticsearch Query DSL but are handy for testing.
		 * <p>
		 * IMPORTANT: This parameter overrides the query parameter in the request body.
		 * If both parameters are specified, documents matching the query request body
		 * parameter are not returned.
		 * <p>
		 * API name: {@code q}
		 */
		public final Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * The search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * The search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		/**
		 * The Reciprocal Rank Fusion (RRF) to use.
		 * <p>
		 * API name: {@code rank}
		 */
		public final Builder rank(@Nullable Rank value) {
			this.rank = value;
			return this;
		}

		/**
		 * The Reciprocal Rank Fusion (RRF) to use.
		 * <p>
		 * API name: {@code rank}
		 */
		public final Builder rank(Function<Rank.Builder, ObjectBuilder<Rank>> fn) {
			return this.rank(fn.apply(new Rank.Builder()).build());
		}

		/**
		 * The Reciprocal Rank Fusion (RRF) to use.
		 * <p>
		 * API name: {@code rank}
		 */
		public final Builder rank(RankVariant value) {
			this.rank = value._toRank();
			return this;
		}

		/**
		 * If <code>true</code>, the caching of search results is enabled for requests
		 * where <code>size</code> is <code>0</code>. It defaults to index level
		 * settings.
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * Can be used to improve precision by reordering just the top (for example 100
		 * - 500) documents returned by the <code>query</code> and
		 * <code>post_filter</code> phases.
		 * <p>
		 * API name: {@code rescore}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rescore</code>.
		 */
		public final Builder rescore(List<Rescore> list) {
			this.rescore = _listAddAll(this.rescore, list);
			return this;
		}

		/**
		 * Can be used to improve precision by reordering just the top (for example 100
		 * - 500) documents returned by the <code>query</code> and
		 * <code>post_filter</code> phases.
		 * <p>
		 * API name: {@code rescore}
		 * <p>
		 * Adds one or more values to <code>rescore</code>.
		 */
		public final Builder rescore(Rescore value, Rescore... values) {
			this.rescore = _listAdd(this.rescore, value, values);
			return this;
		}

		/**
		 * Can be used to improve precision by reordering just the top (for example 100
		 * - 500) documents returned by the <code>query</code> and
		 * <code>post_filter</code> phases.
		 * <p>
		 * API name: {@code rescore}
		 * <p>
		 * Adds one or more values to <code>rescore</code>.
		 */
		public final Builder rescore(RescoreVariant value, RescoreVariant... values) {
			this.rescore = _listAdd(this.rescore, value._toRescore());
			for (RescoreVariant v : values) {
				_listAdd(this.rescore, v._toRescore());
			}
			return this;
		}

		/**
		 * Can be used to improve precision by reordering just the top (for example 100
		 * - 500) documents returned by the <code>query</code> and
		 * <code>post_filter</code> phases.
		 * <p>
		 * API name: {@code rescore}
		 * <p>
		 * Adds a value to <code>rescore</code> using a builder lambda.
		 */
		public final Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * A retriever is a specification to describe top documents returned from a
		 * search. A retriever replaces other elements of the search API that also
		 * return top documents such as <code>query</code> and <code>knn</code>.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(@Nullable Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * A retriever is a specification to describe top documents returned from a
		 * search. A retriever replaces other elements of the search API that also
		 * return top documents such as <code>query</code> and <code>knn</code>.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * A retriever is a specification to describe top documents returned from a
		 * search. A retriever replaces other elements of the search API that also
		 * return top documents such as <code>query</code> and <code>knn</code>.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>routing</code>.
		 */
		public final Builder routing(List<String> list) {
			this.routing = _listAddAll(this.routing, list);
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds one or more values to <code>routing</code>.
		 */
		public final Builder routing(String value, String... values) {
			this.routing = _listAdd(this.routing, value, values);
			return this;
		}

		/**
		 * One or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * One or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * One or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(Map<String, ScriptField> map) {
			this.scriptFields = _mapPutAll(this.scriptFields, map);
			return this;
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(String key, ScriptField value) {
			this.scriptFields = _mapPut(this.scriptFields, key, value);
			return this;
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code> using a builder lambda.
		 */
		public final Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return scriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * The period to retain the search context for scrolling. By default, this value
		 * cannot exceed <code>1d</code> (24 hours). You can change this limit by using
		 * the <code>search.max_keep_alive</code> cluster-level setting.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable Time value) {
			this.scroll = value;
			return this;
		}

		/**
		 * The period to retain the search context for scrolling. By default, this value
		 * cannot exceed <code>1d</code> (24 hours). You can change this limit by using
		 * the <code>search.max_keep_alive</code> cluster-level setting.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.scroll(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(List<FieldValue> list) {
			this.searchAfter = _listAddAll(this.searchAfter, list);
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(FieldValue value, FieldValue... values) {
			this.searchAfter = _listAdd(this.searchAfter, value, values);
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(String value, String... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			for (String v : values) {
				_listAdd(this.searchAfter, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(long value, long... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			for (long v : values) {
				_listAdd(this.searchAfter, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(double value, double... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			for (double v : values) {
				_listAdd(this.searchAfter, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(boolean value, boolean... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			for (boolean v : values) {
				_listAdd(this.searchAfter, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Used to retrieve the next page of hits using a set of sort values from the
		 * previous page.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds a value to <code>searchAfter</code> using a builder lambda.
		 */
		public final Builder searchAfter(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return searchAfter(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Indicates how distributed term frequencies are calculated for relevance
		 * scoring.
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request returns sequence number and primary term of
		 * the last modification of each hit.
		 * <p>
		 * API name: {@code seq_no_primary_term}
		 */
		public final Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * The number of hits to return, which must not be negative. By default, you
		 * cannot page through more than 10,000 hits using the <code>from</code> and
		 * <code>size</code> parameters. To page through more hits, use the
		 * <code>search_after</code> property.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Split a scrolled search into multiple slices that can be consumed
		 * independently.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * Split a scrolled search into multiple slices that can be consumed
		 * independently.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * The stats groups to associate with the search. Each group maintains a
		 * statistics aggregation for its associated searches. You can retrieve these
		 * stats using the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stats</code>.
		 */
		public final Builder stats(List<String> list) {
			this.stats = _listAddAll(this.stats, list);
			return this;
		}

		/**
		 * The stats groups to associate with the search. Each group maintains a
		 * statistics aggregation for its associated searches. You can retrieve these
		 * stats using the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 * <p>
		 * Adds one or more values to <code>stats</code>.
		 */
		public final Builder stats(String value, String... values) {
			this.stats = _listAdd(this.stats, value, values);
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return as part of a hit. If no
		 * fields are specified, no stored fields are included in the response. If this
		 * field is specified, the <code>_source</code> property defaults to
		 * <code>false</code>. You can pass <code>_source: true</code> to return both
		 * source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>storedFields</code>.
		 */
		public final Builder storedFields(List<String> list) {
			this.storedFields = _listAddAll(this.storedFields, list);
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return as part of a hit. If no
		 * fields are specified, no stored fields are included in the response. If this
		 * field is specified, the <code>_source</code> property defaults to
		 * <code>false</code>. You can pass <code>_source: true</code> to return both
		 * source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds one or more values to <code>storedFields</code>.
		 */
		public final Builder storedFields(String value, String... values) {
			this.storedFields = _listAdd(this.storedFields, value, values);
			return this;
		}

		/**
		 * Defines a suggester that provides similar looking terms based on a provided
		 * text.
		 * <p>
		 * API name: {@code suggest}
		 */
		public final Builder suggest(@Nullable Suggester value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Defines a suggester that provides similar looking terms based on a provided
		 * text.
		 * <p>
		 * API name: {@code suggest}
		 */
		public final Builder suggest(Function<Suggester.Builder, ObjectBuilder<Suggester>> fn) {
			return this.suggest(fn.apply(new Suggester.Builder()).build());
		}

		/**
		 * The maximum number of documents to collect for each shard. If a query reaches
		 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
		 * documents before sorting.
		 * <p>
		 * IMPORTANT: Use with caution. Elasticsearch applies this property to each
		 * shard handling the request. When possible, let Elasticsearch perform early
		 * termination automatically. Avoid specifying this property for requests that
		 * target data streams with backing indices across multiple data tiers.
		 * <p>
		 * If set to <code>0</code> (default), the query does not terminate early.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * The period of time to wait for a response from each shard. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * If <code>true</code>, calculate and return document scores, even if the
		 * scores are not used for sorting.
		 * <p>
		 * API name: {@code track_scores}
		 */
		public final Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If <code>true</code>,
		 * the exact number of hits is returned at the cost of some performance. If
		 * <code>false</code>, the response does not include the total number of hits
		 * matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(@Nullable TrackHits value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * Number of hits matching the query to count accurately. If <code>true</code>,
		 * the exact number of hits is returned at the cost of some performance. If
		 * <code>false</code>, the response does not include the total number of hits
		 * matching the query.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public final Builder trackTotalHits(Function<TrackHits.Builder, ObjectBuilder<TrackHits>> fn) {
			return this.trackTotalHits(fn.apply(new TrackHits.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request returns the document version as part of a
		 * hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchRequest build() {
			_checkSingleUse();

			return new SearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchRequest}
	 */
	public static final JsonpDeserializer<SearchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchRequest::setupSearchRequestDeserializer);

	protected static void setupSearchRequestDeserializer(ObjectDeserializer<SearchRequest.Builder> op) {

		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER),
				"docvalue_fields");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::ext, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "ext");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER), "fields");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::indicesBoost, JsonpDeserializer.arrayDeserializer(
				NamedValue.deserializer(() -> JsonpDeserializer.doubleDeserializer())), "indices_boost");
		op.add(Builder::knn, JsonpDeserializer.arrayDeserializer(KnnSearch._DESERIALIZER), "knn");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::postFilter, Query._DESERIALIZER, "post_filter");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::projectRouting, JsonpDeserializer.stringDeserializer(), "project_routing");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::rank, Rank._DESERIALIZER, "rank");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::suggest, Suggester._DESERIALIZER, "suggest");
		op.add(Builder::terminateAfter, JsonpDeserializer.longDeserializer(), "terminate_after");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::trackTotalHits, TrackHits._DESERIALIZER, "track_total_hits");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search}".
	 */
	public static final SimpleEndpoint<SearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/search",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
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
				if (request.forceSyntheticSource != null) {
					params.put("force_synthetic_source", String.valueOf(request.forceSyntheticSource));
				}
				if (request.includeNamedQueriesScore != null) {
					params.put("include_named_queries_score", String.valueOf(request.includeNamedQueriesScore));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (ApiTypeHelper.isDefined(request.routing)) {
					params.put("routing", request.routing.stream().map(v -> v).collect(Collectors.joining(",")));
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
				if (request.allowPartialSearchResults != null) {
					params.put("allow_partial_search_results", String.valueOf(request.allowPartialSearchResults));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
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
					params.put("scroll", request.scroll._toJsonString());
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
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				if (request.batchedReduceSize != null) {
					params.put("batched_reduce_size", String.valueOf(request.batchedReduceSize));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code search}" endpoint.
	 */
	public static <TDocument> Endpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> createSearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT
				.withResponseDeserializer(SearchResponse.createSearchResponseDeserializer(tDocumentDeserializer));
	}
}
