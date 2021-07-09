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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.delete_by_query.Request
public final class DeleteByQueryRequest extends RequestBase implements ToJsonp {
	private final List<String> index;

	@Nullable
	private final List<String> type;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final JsonValue conflicts;

	@Nullable
	private final JsonValue defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Number from;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final Number requestsPerSecond;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final String q;

	@Nullable
	private final JsonValue scroll;

	@Nullable
	private final Number scrollSize;

	@Nullable
	private final JsonValue searchTimeout;

	@Nullable
	private final JsonValue searchType;

	@Nullable
	private final Number size;

	@Nullable
	private final Number slices;

	@Nullable
	private final List<String> sort;

	@Nullable
	private final JsonValue source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final List<String> stats;

	@Nullable
	private final Number terminateAfter;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Boolean version;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	@Nullable
	private final Number maxDocs;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final SlicedScroll slice;

	// ---------------------------------------------------------------------------------------------

	protected DeleteByQueryRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.allowNoIndices = builder.allowNoIndices;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.conflicts = builder.conflicts;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = builder.expandWildcards;
		this.from = builder.from;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.lenient = builder.lenient;
		this.preference = builder.preference;
		this.refresh = builder.refresh;
		this.requestCache = builder.requestCache;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.routing = builder.routing;
		this.q = builder.q;
		this.scroll = builder.scroll;
		this.scrollSize = builder.scrollSize;
		this.searchTimeout = builder.searchTimeout;
		this.searchType = builder.searchType;
		this.size = builder.size;
		this.slices = builder.slices;
		this.sort = builder.sort;
		this.source = builder.source;
		this.sourceExcludes = builder.sourceExcludes;
		this.sourceIncludes = builder.sourceIncludes;
		this.stats = builder.stats;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;
		this.maxDocs = builder.maxDocs;
		this.query = builder.query;
		this.slice = builder.slice;

	}

	/**
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public List<String> type() {
		return this.type;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * API name: {@code conflicts}
	 */
	@Nullable
	public JsonValue conflicts() {
		return this.conflicts;
	}

	/**
	 * API name: {@code default_operator}
	 */
	@Nullable
	public JsonValue defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public Boolean refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code request_cache}
	 */
	@Nullable
	public Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code q}
	 */
	@Nullable
	public String q() {
		return this.q;
	}

	/**
	 * API name: {@code scroll}
	 */
	@Nullable
	public JsonValue scroll() {
		return this.scroll;
	}

	/**
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public Number scrollSize() {
		return this.scrollSize;
	}

	/**
	 * API name: {@code search_timeout}
	 */
	@Nullable
	public JsonValue searchTimeout() {
		return this.searchTimeout;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public JsonValue searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code slices}
	 */
	@Nullable
	public Number slices() {
		return this.slices;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<String> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue source() {
		return this.source;
	}

	/**
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * API name: {@code stats}
	 */
	@Nullable
	public List<String> stats() {
		return this.stats;
	}

	/**
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public Number terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
	}

	/**
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	/**
	 * API name: {@code max_docs}
	 */
	@Nullable
	public Number maxDocs() {
		return this.maxDocs;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.maxDocs != null) {

			generator.writeKey("max_docs");
			generator.write(this.maxDocs.doubleValue());

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.slice != null) {

			generator.writeKey("slice");
			this.slice.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteByQueryRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteByQueryRequest> {
		private List<String> index;

		@Nullable
		private List<String> type;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private JsonValue conflicts;

		@Nullable
		private JsonValue defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Number from;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean lenient;

		@Nullable
		private String preference;

		@Nullable
		private Boolean refresh;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private Number requestsPerSecond;

		@Nullable
		private JsonValue routing;

		@Nullable
		private String q;

		@Nullable
		private JsonValue scroll;

		@Nullable
		private Number scrollSize;

		@Nullable
		private JsonValue searchTimeout;

		@Nullable
		private JsonValue searchType;

		@Nullable
		private Number size;

		@Nullable
		private Number slices;

		@Nullable
		private List<String> sort;

		@Nullable
		private JsonValue source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<String> stats;

		@Nullable
		private Number terminateAfter;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Boolean version;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

		@Nullable
		private Number maxDocs;

		@Nullable
		private QueryContainer query;

		@Nullable
		private SlicedScroll slice;

		/**
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
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
		 * API name: {@code type}
		 */
		public Builder type(@Nullable List<String> value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String... value) {
			this.type = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #type(List)}, creating the list if needed.
		 */
		public Builder addType(String value) {
			if (this.type == null) {
				this.type = new ArrayList<>();
			}
			this.type.add(value);
			return this;
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * API name: {@code conflicts}
		 */
		public Builder conflicts(@Nullable JsonValue value) {
			this.conflicts = value;
			return this;
		}

		/**
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable JsonValue value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(@Nullable Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable JsonValue value) {
			this.scroll = value;
			return this;
		}

		/**
		 * API name: {@code scroll_size}
		 */
		public Builder scrollSize(@Nullable Number value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * API name: {@code search_timeout}
		 */
		public Builder searchTimeout(@Nullable JsonValue value) {
			this.searchTimeout = value;
			return this;
		}

		/**
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable JsonValue value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slices}
		 */
		public Builder slices(@Nullable Number value) {
			this.slices = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<String> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(String... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(String value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
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
		 * API name: {@code terminate_after}
		 */
		public Builder terminateAfter(@Nullable Number value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * API name: {@code max_docs}
		 */
		public Builder maxDocs(@Nullable Number value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
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
		 * Builds a {@link DeleteByQueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteByQueryRequest build() {

			return new DeleteByQueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeleteByQueryRequest
	 */
	public static final JsonpDeserializer<DeleteByQueryRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DeleteByQueryRequest::setupDeleteByQueryRequestDeserializer);

	protected static void setupDeleteByQueryRequestDeserializer(
			DelegatingDeserializer<DeleteByQueryRequest.Builder> op) {

		op.add(Builder::maxDocs, JsonpDeserializer.numberDeserializer(), "max_docs");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::slice, SlicedScroll.DESERIALIZER, "slice");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code delete_by_query}".
	 */
	public static final Endpoint<DeleteByQueryRequest, DeleteByQueryResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_delete_by_query");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_delete_by_query");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.conflicts != null) {
					params.put("conflicts", request.conflicts.toString());
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", request.requestsPerSecond.toString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll.toString());
				}
				if (request.scrollSize != null) {
					params.put("scroll_size", request.scrollSize.toString());
				}
				if (request.searchTimeout != null) {
					params.put("search_timeout", request.searchTimeout.toString());
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				if (request.slices != null) {
					params.put("slices", request.slices.toString());
				}
				if (request.sort != null) {
					params.put("sort", request.sort.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.source != null) {
					params.put("_source", request.source.toString());
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.stats != null) {
					params.put("stats", request.stats.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.terminateAfter != null) {
					params.put("terminate_after", request.terminateAfter.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, DeleteByQueryResponse.DESERIALIZER);
}
