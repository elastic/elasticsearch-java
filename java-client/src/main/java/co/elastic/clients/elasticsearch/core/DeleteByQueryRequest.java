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

import co.elastic.clients.elasticsearch._types.Conflicts;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.Slices;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch._types.query_dsl.Operator;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
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

// typedef: _global.delete_by_query.Request

/**
 * Delete documents.
 * <p>
 * Deletes documents that match the specified query.
 * <p>
 * If the Elasticsearch security features are enabled, you must have the
 * following index privileges for the target data stream, index, or alias:
 * <ul>
 * <li><code>read</code></li>
 * <li><code>delete</code> or <code>write</code></li>
 * </ul>
 * <p>
 * You can specify the query criteria in the request URI or the request body
 * using the same syntax as the search API. When you submit a delete by query
 * request, Elasticsearch gets a snapshot of the data stream or index when it
 * begins processing the request and deletes matching documents using internal
 * versioning. If a document changes between the time that the snapshot is taken
 * and the delete operation is processed, it results in a version conflict and
 * the delete operation fails.
 * <p>
 * NOTE: Documents with a version equal to 0 cannot be deleted using delete by
 * query because internal versioning does not support 0 as a valid version
 * number.
 * <p>
 * While processing a delete by query request, Elasticsearch performs multiple
 * search requests sequentially to find all of the matching documents to delete.
 * A bulk delete request is performed for each batch of matching documents. If a
 * search or bulk request is rejected, the requests are retried up to 10 times,
 * with exponential back off. If the maximum retry limit is reached, processing
 * halts and all failed requests are returned in the response. Any delete
 * requests that completed successfully still stick, they are not rolled back.
 * <p>
 * You can opt to count version conflicts instead of halting and returning by
 * setting <code>conflicts</code> to <code>proceed</code>. Note that if you opt
 * to count version conflicts the operation could attempt to delete more
 * documents from the source than <code>max_docs</code> until it has
 * successfully deleted <code>max_docs documents</code>, or it has gone through
 * every document in the source query.
 * <p>
 * <strong>Throttling delete requests</strong>
 * <p>
 * To control the rate at which delete by query issues batches of delete
 * operations, you can set <code>requests_per_second</code> to any positive
 * decimal number. This pads each batch with a wait time to throttle the rate.
 * Set <code>requests_per_second</code> to <code>-1</code> to disable
 * throttling.
 * <p>
 * Throttling uses a wait time between batches so that the internal scroll
 * requests can be given a timeout that takes the request padding into account.
 * The padding time is the difference between the batch size divided by the
 * <code>requests_per_second</code> and the time spent writing. By default the
 * batch size is <code>1000</code>, so if <code>requests_per_second</code> is
 * set to <code>500</code>:
 * 
 * <pre>
 * <code>target_time = 1000 / 500 per second = 2 seconds
 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
 * </code>
 * </pre>
 * <p>
 * Since the batch is issued as a single <code>_bulk</code> request, large batch
 * sizes cause Elasticsearch to create many requests and wait before starting
 * the next set. This is &quot;bursty&quot; instead of &quot;smooth&quot;.
 * <p>
 * <strong>Slicing</strong>
 * <p>
 * Delete by query supports sliced scroll to parallelize the delete process.
 * This can improve efficiency and provide a convenient way to break the request
 * down into smaller parts.
 * <p>
 * Setting <code>slices</code> to <code>auto</code> lets Elasticsearch choose
 * the number of slices to use. This setting will use one slice per shard, up to
 * a certain limit. If there are multiple source data streams or indices, it
 * will choose the number of slices based on the index or backing index with the
 * smallest number of shards. Adding slices to the delete by query operation
 * creates sub-requests which means it has some quirks:
 * <ul>
 * <li>You can see these requests in the tasks APIs. These sub-requests are
 * &quot;child&quot; tasks of the task for the request with slices.</li>
 * <li>Fetching the status of the task for the request with slices only contains
 * the status of completed slices.</li>
 * <li>These sub-requests are individually addressable for things like
 * cancellation and rethrottling.</li>
 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
 * unfinished sub-request proportionally.</li>
 * <li>Canceling the request with <code>slices</code> will cancel each
 * sub-request.</li>
 * <li>Due to the nature of <code>slices</code> each sub-request won't get a
 * perfectly even portion of the documents. All documents will be addressed, but
 * some slices may be larger than others. Expect larger slices to have a more
 * even distribution.</li>
 * <li>Parameters like <code>requests_per_second</code> and
 * <code>max_docs</code> on a request with <code>slices</code> are distributed
 * proportionally to each sub-request. Combine that with the earlier point about
 * distribution being uneven and you should conclude that using
 * <code>max_docs</code> with <code>slices</code> might not result in exactly
 * <code>max_docs</code> documents being deleted.</li>
 * <li>Each sub-request gets a slightly different snapshot of the source data
 * stream or index though these are all taken at approximately the same
 * time.</li>
 * </ul>
 * <p>
 * If you're slicing manually or otherwise tuning automatic slicing, keep in
 * mind that:
 * <ul>
 * <li>Query performance is most efficient when the number of slices is equal to
 * the number of shards in the index or backing index. If that number is large
 * (for example, 500), choose a lower number as too many <code>slices</code>
 * hurts performance. Setting <code>slices</code> higher than the number of
 * shards generally does not improve efficiency and adds overhead.</li>
 * <li>Delete performance scales linearly across available resources with the
 * number of slices.</li>
 * </ul>
 * <p>
 * Whether query or delete performance dominates the runtime depends on the
 * documents being reindexed and cluster resources.
 * <p>
 * <strong>Cancel a delete by query operation</strong>
 * <p>
 * Any delete by query can be canceled using the task cancel API. For example:
 * 
 * <pre>
 * <code>POST _tasks/r1A2WoRbTwKZ516z6NEs5A:36619/_cancel
 * </code>
 * </pre>
 * <p>
 * The task ID can be found by using the get tasks API.
 * <p>
 * Cancellation should happen quickly but might take a few seconds. The get task
 * status API will continue to list the delete by query task until this task
 * checks that it has been cancelled and terminates itself.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.delete_by_query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteByQueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Conflicts conflicts;

	@Nullable
	private final Operator defaultOperator;

	@Nullable
	private final String df;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Long from;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final String preference;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final Float requestsPerSecond;

	@Nullable
	private final String routing;

	@Nullable
	private final Time scroll;

	@Nullable
	private final Long scrollSize;

	@Nullable
	private final Time searchTimeout;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final SlicedScroll slice;

	@Nullable
	private final Slices slices;

	private final List<String> sort;

	private final List<String> stats;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean version;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private DeleteByQueryRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.conflicts = builder.conflicts;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.from = builder.from;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.lenient = builder.lenient;
		this.maxDocs = builder.maxDocs;
		this.preference = builder.preference;
		this.q = builder.q;
		this.query = builder.query;
		this.refresh = builder.refresh;
		this.requestCache = builder.requestCache;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.routing = builder.routing;
		this.scroll = builder.scroll;
		this.scrollSize = builder.scrollSize;
		this.searchTimeout = builder.searchTimeout;
		this.searchType = builder.searchType;
		this.slice = builder.slice;
		this.slices = builder.slices;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.stats = ApiTypeHelper.unmodifiable(builder.stats);
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static DeleteByQueryRequest of(Function<Builder, ObjectBuilder<DeleteByQueryRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Analyzer to use for the query string. This parameter can be used only when
	 * the <code>q</code> query string parameter is specified.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * What to do if delete by query hits version conflicts: <code>abort</code> or
	 * <code>proceed</code>.
	 * <p>
	 * API name: {@code conflicts}
	 */
	@Nullable
	public final Conflicts conflicts() {
		return this.conflicts;
	}

	/**
	 * The default operator for query string query: <code>AND</code> or
	 * <code>OR</code>. This parameter can be used only when the <code>q</code>
	 * query string parameter is specified.
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public final Operator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as default where no field prefix is given in the query
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
	 * The type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. It supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Skips the specified number of documents.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Long from() {
		return this.from;
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
	 * Required - A comma-separated list of data streams, indices, and aliases to
	 * search. It supports wildcards (<code>*</code>). To search all data streams or
	 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
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
	 * The maximum number of documents to delete.
	 * <p>
	 * API name: {@code max_docs}
	 */
	@Nullable
	public final Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * The node or shard the operation should be performed on. It is random by
	 * default.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * A query in the Lucene query string syntax.
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public final String q() {
		return this.q;
	}

	/**
	 * The documents to delete specified with Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * If <code>true</code>, Elasticsearch refreshes all shards involved in the
	 * delete by query after the request completes. This is different than the
	 * delete API's <code>refresh</code> parameter, which causes just the shard that
	 * received the delete request to be refreshed. Unlike the delete API, it does
	 * not support <code>wait_for</code>.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * If <code>true</code>, the request cache is used for this request. Defaults to
	 * the index-level setting.
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * The throttle for this request in sub-requests per second.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * A custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * The period to retain the search context for scrolling.
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public final Time scroll() {
		return this.scroll;
	}

	/**
	 * The size of the scroll request that powers the operation.
	 * <p>
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public final Long scrollSize() {
		return this.scrollSize;
	}

	/**
	 * The explicit timeout for each search request. It defaults to no timeout.
	 * <p>
	 * API name: {@code search_timeout}
	 */
	@Nullable
	public final Time searchTimeout() {
		return this.searchTimeout;
	}

	/**
	 * The type of the search operation. Available options include
	 * <code>query_then_fetch</code> and <code>dfs_query_then_fetch</code>.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Slice the request manually using the provided slice ID and total number of
	 * slices.
	 * <p>
	 * API name: {@code slice}
	 */
	@Nullable
	public final SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * The number of slices this task should be divided into.
	 * <p>
	 * API name: {@code slices}
	 */
	@Nullable
	public final Slices slices() {
		return this.slices;
	}

	/**
	 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<String> sort() {
		return this.sort;
	}

	/**
	 * The specific <code>tag</code> of the request for logging and statistical
	 * purposes.
	 * <p>
	 * API name: {@code stats}
	 */
	public final List<String> stats() {
		return this.stats;
	}

	/**
	 * The maximum number of documents to collect for each shard. If a query reaches
	 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
	 * documents before sorting.
	 * <p>
	 * Use with caution. Elasticsearch applies this parameter to each shard handling
	 * the request. When possible, let Elasticsearch perform early termination
	 * automatically. Avoid specifying this parameter for requests that target data
	 * streams with backing indices across multiple data tiers.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * The period each deletion request waits for active shards.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, returns the document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
		return this.version;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to <code>all</code> or any positive integer up to the total
	 * number of shards in the index (<code>number_of_replicas+1</code>). The
	 * <code>timeout</code> value controls how long each write request waits for
	 * unavailable shards to become available.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * If <code>true</code>, the request blocks until the operation is complete. If
	 * <code>false</code>, Elasticsearch performs some preflight checks, launches
	 * the request, and returns a task you can use to cancel or get the status of
	 * the task. Elasticsearch creates a record of this task as a document at
	 * <code>.tasks/task/${taskId}</code>. When you are done with a task, you should
	 * delete the task document so Elasticsearch can reclaim the space.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
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

		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.slice != null) {
			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteByQueryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteByQueryRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private String analyzer;

		@Nullable
		private Conflicts conflicts;

		@Nullable
		private Operator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Long from;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Long maxDocs;

		@Nullable
		private String preference;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		@Nullable
		private Boolean refresh;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private Float requestsPerSecond;

		@Nullable
		private String routing;

		@Nullable
		private Time scroll;

		@Nullable
		private Long scrollSize;

		@Nullable
		private Time searchTimeout;

		@Nullable
		private SearchType searchType;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private Slices slices;

		@Nullable
		private List<String> sort;

		@Nullable
		private List<String> stats;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean version;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

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
		 * Analyzer to use for the query string. This parameter can be used only when
		 * the <code>q</code> query string parameter is specified.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * What to do if delete by query hits version conflicts: <code>abort</code> or
		 * <code>proceed</code>.
		 * <p>
		 * API name: {@code conflicts}
		 */
		public final Builder conflicts(@Nullable Conflicts value) {
			this.conflicts = value;
			return this;
		}

		/**
		 * The default operator for query string query: <code>AND</code> or
		 * <code>OR</code>. This parameter can be used only when the <code>q</code>
		 * query string parameter is specified.
		 * <p>
		 * API name: {@code default_operator}
		 */
		public final Builder defaultOperator(@Nullable Operator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as default where no field prefix is given in the query
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
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
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
		 * hidden data streams. It supports comma-separated values, such as
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
		 * Skips the specified number of documents.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Long value) {
			this.from = value;
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
		 * Required - A comma-separated list of data streams, indices, and aliases to
		 * search. It supports wildcards (<code>*</code>). To search all data streams or
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
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
		 * Required - A comma-separated list of data streams, indices, and aliases to
		 * search. It supports wildcards (<code>*</code>). To search all data streams or
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
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
		 * The maximum number of documents to delete.
		 * <p>
		 * API name: {@code max_docs}
		 */
		public final Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * The node or shard the operation should be performed on. It is random by
		 * default.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * A query in the Lucene query string syntax.
		 * <p>
		 * API name: {@code q}
		 */
		public final Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * The documents to delete specified with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * The documents to delete specified with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The documents to delete specified with Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		/**
		 * If <code>true</code>, Elasticsearch refreshes all shards involved in the
		 * delete by query after the request completes. This is different than the
		 * delete API's <code>refresh</code> parameter, which causes just the shard that
		 * received the delete request to be refreshed. Unlike the delete API, it does
		 * not support <code>wait_for</code>.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request cache is used for this request. Defaults to
		 * the index-level setting.
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * The throttle for this request in sub-requests per second.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * The period to retain the search context for scrolling.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable Time value) {
			this.scroll = value;
			return this;
		}

		/**
		 * The period to retain the search context for scrolling.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.scroll(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The size of the scroll request that powers the operation.
		 * <p>
		 * API name: {@code scroll_size}
		 */
		public final Builder scrollSize(@Nullable Long value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * The explicit timeout for each search request. It defaults to no timeout.
		 * <p>
		 * API name: {@code search_timeout}
		 */
		public final Builder searchTimeout(@Nullable Time value) {
			this.searchTimeout = value;
			return this;
		}

		/**
		 * The explicit timeout for each search request. It defaults to no timeout.
		 * <p>
		 * API name: {@code search_timeout}
		 */
		public final Builder searchTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.searchTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The type of the search operation. Available options include
		 * <code>query_then_fetch</code> and <code>dfs_query_then_fetch</code>.
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Slice the request manually using the provided slice ID and total number of
		 * slices.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * Slice the request manually using the provided slice ID and total number of
		 * slices.
		 * <p>
		 * API name: {@code slice}
		 */
		public final Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * The number of slices this task should be divided into.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(@Nullable Slices value) {
			this.slices = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(Function<Slices.Builder, ObjectBuilder<Slices>> fn) {
			return this.slices(fn.apply(new Slices.Builder()).build());
		}

		/**
		 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<String> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * A comma-separated list of <code>&lt;field&gt;:&lt;direction&gt;</code> pairs.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(String value, String... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * The specific <code>tag</code> of the request for logging and statistical
		 * purposes.
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
		 * The specific <code>tag</code> of the request for logging and statistical
		 * purposes.
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
		 * The maximum number of documents to collect for each shard. If a query reaches
		 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
		 * documents before sorting.
		 * <p>
		 * Use with caution. Elasticsearch applies this parameter to each shard handling
		 * the request. When possible, let Elasticsearch perform early termination
		 * automatically. Avoid specifying this parameter for requests that target data
		 * streams with backing indices across multiple data tiers.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * The period each deletion request waits for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period each deletion request waits for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, returns the document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>). The
		 * <code>timeout</code> value controls how long each write request waits for
		 * unavailable shards to become available.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>). The
		 * <code>timeout</code> value controls how long each write request waits for
		 * unavailable shards to become available.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request blocks until the operation is complete. If
		 * <code>false</code>, Elasticsearch performs some preflight checks, launches
		 * the request, and returns a task you can use to cancel or get the status of
		 * the task. Elasticsearch creates a record of this task as a document at
		 * <code>.tasks/task/${taskId}</code>. When you are done with a task, you should
		 * delete the task document so Elasticsearch can reclaim the space.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteByQueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteByQueryRequest build() {
			_checkSingleUse();

			return new DeleteByQueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteByQueryRequest}
	 */
	public static final JsonpDeserializer<DeleteByQueryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteByQueryRequest::setupDeleteByQueryRequestDeserializer);

	protected static void setupDeleteByQueryRequestDeserializer(ObjectDeserializer<DeleteByQueryRequest.Builder> op) {

		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code delete_by_query}".
	 */
	public static final Endpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/delete_by_query",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_delete_by_query");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.slices != null) {
					params.put("slices", request.slices._toJsonString());
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.terminateAfter != null) {
					params.put("terminate_after", String.valueOf(request.terminateAfter));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", String.valueOf(request.requestsPerSecond));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (ApiTypeHelper.isDefined(request.stats)) {
					params.put("stats", request.stats.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.conflicts != null) {
					params.put("conflicts", request.conflicts.jsonValue());
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.searchTimeout != null) {
					params.put("search_timeout", request.searchTimeout._toJsonString());
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll._toJsonString());
				}
				if (request.scrollSize != null) {
					params.put("scroll_size", String.valueOf(request.scrollSize));
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (ApiTypeHelper.isDefined(request.sort)) {
					params.put("sort", request.sort.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.jsonValue());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, DeleteByQueryResponse._DESERIALIZER);
}
