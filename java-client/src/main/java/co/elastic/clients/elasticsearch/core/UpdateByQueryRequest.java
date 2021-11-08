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

import co.elastic.clients.elasticsearch._types.Conflicts;
import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.update_by_query.Request
@JsonpDeserializable
public class UpdateByQueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final JsonValue /* Union(_types.Fields | internal.boolean) */ source;

	private final List<String> sourceExcludes;

	private final List<String> sourceIncludes;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Conflicts conflicts;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	private final List<ExpandWildcardOptions> expandWildcards;

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
	private final String pipeline;

	@Nullable
	private final String preference;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final Long requestsPerSecond;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final String scroll;

	@Nullable
	private final Long scrollSize;

	@Nullable
	private final String searchTimeout;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Long size;

	@Nullable
	private final SlicedScroll slice;

	@Nullable
	private final Long slices;

	private final List<String> sort;

	private final List<String> stats;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean version;

	@Nullable
	private final Boolean versionType;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private UpdateByQueryRequest(Builder builder) {

		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.allowNoIndices = builder.allowNoIndices;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.conflicts = builder.conflicts;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.from = builder.from;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.lenient = builder.lenient;
		this.maxDocs = builder.maxDocs;
		this.pipeline = builder.pipeline;
		this.preference = builder.preference;
		this.query = builder.query;
		this.refresh = builder.refresh;
		this.requestCache = builder.requestCache;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.routing = builder.routing;
		this.script = builder.script;
		this.scroll = builder.scroll;
		this.scrollSize = builder.scrollSize;
		this.searchTimeout = builder.searchTimeout;
		this.searchType = builder.searchType;
		this.size = builder.size;
		this.slice = builder.slice;
		this.slices = builder.slices;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.stats = ModelTypeHelper.unmodifiable(builder.stats);
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static UpdateByQueryRequest of(Function<Builder, ObjectBuilder<UpdateByQueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final JsonValue /* Union(_types.Fields | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * A list of fields to exclude from the returned _source field
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	public final List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A list of fields to extract and return from the _source field
	 * <p>
	 * API name: {@code _source_includes}
	 */
	public final List<String> sourceIncludes() {
		return this.sourceIncludes;
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
	 * API name: {@code conflicts}
	 */
	@Nullable
	public final Conflicts conflicts() {
		return this.conflicts;
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
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Starting offset (default: 0)
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Long from() {
		return this.from;
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
	 * Required - A comma-separated list of index names to search; use
	 * <code>_all</code> or empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
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
	 * API name: {@code max_docs}
	 */
	@Nullable
	public final Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * Ingest pipeline to set on index requests made by this action. (default: none)
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
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
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Should the affected indexes be refreshed?
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Specify if request cache should be used for this request or not, defaults to
	 * index level setting
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * The throttle to set on this request in sub-requests per second. -1 means no
	 * throttle.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Long requestsPerSecond() {
		return this.requestsPerSecond;
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
	 * API name: {@code script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * Specify how long a consistent view of the index should be maintained for
	 * scrolled search
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public final String scroll() {
		return this.scroll;
	}

	/**
	 * Size on the scroll request powering the update by query
	 * <p>
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public final Long scrollSize() {
		return this.scrollSize;
	}

	/**
	 * Explicit timeout for each search request. Defaults to no timeout.
	 * <p>
	 * API name: {@code search_timeout}
	 */
	@Nullable
	public final String searchTimeout() {
		return this.searchTimeout;
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
	 * API name: {@code size}
	 */
	@Nullable
	public final Long size() {
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
	 * The number of slices this task should be divided into. Defaults to 1, meaning
	 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
	 * <p>
	 * API name: {@code slices}
	 */
	@Nullable
	public final Long slices() {
		return this.slices;
	}

	/**
	 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<String> sort() {
		return this.sort;
	}

	/**
	 * Specific 'tag' of the request for logging and statistical purposes
	 * <p>
	 * API name: {@code stats}
	 */
	public final List<String> stats() {
		return this.stats;
	}

	/**
	 * The maximum number of documents to collect for each shard, upon reaching
	 * which the query execution will terminate early.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public final Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * Time each individual bulk request should wait for shards that are
	 * unavailable.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Specify whether to return document version as part of a hit
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
		return this.version;
	}

	/**
	 * Should the document increment the version number (internal) on hit or not
	 * (reindex)
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final Boolean versionType() {
		return this.versionType;
	}

	/**
	 * Sets the number of shard copies that must be active before proceeding with
	 * the update by query operation. Defaults to 1, meaning the primary shard only.
	 * Set to <code>all</code> for all shard copies, otherwise set to any
	 * non-negative value less than or equal to the total number of copies for the
	 * shard (number of replicas + 1)
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Should the request should block until the update by query operation is
	 * complete.
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

		if (this.conflicts != null) {
			generator.writeKey("conflicts");
			this.conflicts.serialize(generator, mapper);
		}
		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.script != null) {
			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.slice != null) {
			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateByQueryRequest> {
		@Nullable
		private JsonValue /* Union(_types.Fields | internal.boolean) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private String analyzer;

		@Nullable
		private Conflicts conflicts;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

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
		private String pipeline;

		@Nullable
		private String preference;

		@Nullable
		private Query query;

		@Nullable
		private Boolean refresh;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private Long requestsPerSecond;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private String scroll;

		@Nullable
		private Long scrollSize;

		@Nullable
		private String searchTimeout;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Long size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private Long slices;

		@Nullable
		private List<String> sort;

		@Nullable
		private List<String> stats;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean version;

		@Nullable
		private Boolean versionType;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable JsonValue /* Union(_types.Fields | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public final Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public final Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public final Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public final Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
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
		 * API name: {@code conflicts}
		 */
		public final Builder conflicts(@Nullable Conflicts value) {
			this.conflicts = value;
			return this;
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
		 * Starting offset (default: 0)
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Long value) {
			this.from = value;
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
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
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
		 * API name: {@code max_docs}
		 */
		public final Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * Ingest pipeline to set on index requests made by this action. (default: none)
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
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
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Should the affected indexes be refreshed?
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Specify if request cache should be used for this request or not, defaults to
		 * index level setting
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * The throttle to set on this request in sub-requests per second. -1 means no
		 * throttle.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Long value) {
			this.requestsPerSecond = value;
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
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * Specify how long a consistent view of the index should be maintained for
		 * scrolled search
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable String value) {
			this.scroll = value;
			return this;
		}

		/**
		 * Size on the scroll request powering the update by query
		 * <p>
		 * API name: {@code scroll_size}
		 */
		public final Builder scrollSize(@Nullable Long value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * Explicit timeout for each search request. Defaults to no timeout.
		 * <p>
		 * API name: {@code search_timeout}
		 */
		public final Builder searchTimeout(@Nullable String value) {
			this.searchTimeout = value;
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
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Long value) {
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
		 * The number of slices this task should be divided into. Defaults to 1, meaning
		 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(@Nullable Long value) {
			this.slices = value;
			return this;
		}

		/**
		 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<String> value) {
			this.sort = value;
			return this;
		}

		/**
		 * A comma-separated list of &lt;field&gt;:&lt;direction&gt; pairs
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(String... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Specific 'tag' of the request for logging and statistical purposes
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
		 * Specific 'tag' of the request for logging and statistical purposes
		 * <p>
		 * API name: {@code stats}
		 */
		public final Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * The maximum number of documents to collect for each shard, upon reaching
		 * which the query execution will terminate early.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public final Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * Time each individual bulk request should wait for shards that are
		 * unavailable.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specify whether to return document version as part of a hit
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Should the document increment the version number (internal) on hit or not
		 * (reindex)
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder versionType(@Nullable Boolean value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before proceeding with
		 * the update by query operation. Defaults to 1, meaning the primary shard only.
		 * Set to <code>all</code> for all shard copies, otherwise set to any
		 * non-negative value less than or equal to the total number of copies for the
		 * shard (number of replicas + 1)
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Should the request should block until the update by query operation is
		 * complete.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateByQueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryRequest build() {
			_checkSingleUse();

			return new UpdateByQueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateByQueryRequest}
	 */
	public static final JsonpDeserializer<UpdateByQueryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateByQueryRequest::setupUpdateByQueryRequestDeserializer, Builder::build);

	protected static void setupUpdateByQueryRequestDeserializer(
			DelegatingDeserializer<UpdateByQueryRequest.Builder> op) {

		op.add(Builder::conflicts, Conflicts._DESERIALIZER, "conflicts");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code update_by_query}".
	 */
	public static final Endpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_update_by_query");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.slices != null) {
					params.put("slices", String.valueOf(request.slices));
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
					params.put("timeout", request.timeout);
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
				if (ModelTypeHelper.isDefined(request.stats)) {
					params.put("stats", request.stats.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.versionType != null) {
					params.put("version_type", String.valueOf(request.versionType));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.searchTimeout != null) {
					params.put("search_timeout", request.searchTimeout);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll);
				}
				if (request.scrollSize != null) {
					params.put("scroll_size", String.valueOf(request.scrollSize));
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (ModelTypeHelper.isDefined(request.sort)) {
					params.put("sort", request.sort.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.jsonValue());
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.source != null) {
					params.put("_source", JsonpUtils.toString(request.source));
				}
				if (ModelTypeHelper.isDefined(request.sourceExcludes)) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				if (ModelTypeHelper.isDefined(request.sourceIncludes)) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateByQueryResponse._DESERIALIZER);
}
