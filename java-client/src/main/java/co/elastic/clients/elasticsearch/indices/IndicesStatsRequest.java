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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.Level;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.stats.Request

/**
 * Returns statistics for one or more indices. For data streams, the API
 * retrieves statistics for the stream’s backing indices.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.stats.Request">API
 *      specification</a>
 */

public class IndicesStatsRequest extends RequestBase {
	private final List<String> completionFields;

	private final List<ExpandWildcard> expandWildcards;

	private final List<String> fielddataFields;

	private final List<String> fields;

	@Nullable
	private final Boolean forbidClosedIndices;

	private final List<String> groups;

	@Nullable
	private final Boolean includeSegmentFileSizes;

	@Nullable
	private final Boolean includeUnloadedSegments;

	private final List<String> index;

	@Nullable
	private final Level level;

	private final List<String> metric;

	// ---------------------------------------------------------------------------------------------

	private IndicesStatsRequest(Builder builder) {

		this.completionFields = ApiTypeHelper.unmodifiable(builder.completionFields);
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.fielddataFields = ApiTypeHelper.unmodifiable(builder.fielddataFields);
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.forbidClosedIndices = builder.forbidClosedIndices;
		this.groups = ApiTypeHelper.unmodifiable(builder.groups);
		this.includeSegmentFileSizes = builder.includeSegmentFileSizes;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.level = builder.level;
		this.metric = ApiTypeHelper.unmodifiable(builder.metric);

	}

	public static IndicesStatsRequest of(Function<Builder, ObjectBuilder<IndicesStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in
	 * fielddata and suggest statistics.
	 * <p>
	 * API name: {@code completion_fields}
	 */
	public final List<String> completionFields() {
		return this.completionFields;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in
	 * fielddata statistics.
	 * <p>
	 * API name: {@code fielddata_fields}
	 */
	public final List<String> fielddataFields() {
		return this.fielddataFields;
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in the
	 * statistics.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * If true, statistics are not collected from closed indices.
	 * <p>
	 * API name: {@code forbid_closed_indices}
	 */
	@Nullable
	public final Boolean forbidClosedIndices() {
		return this.forbidClosedIndices;
	}

	/**
	 * Comma-separated list of search groups to include in the search statistics.
	 * <p>
	 * API name: {@code groups}
	 */
	public final List<String> groups() {
		return this.groups;
	}

	/**
	 * If true, the call reports the aggregated disk usage of each one of the Lucene
	 * index files (only applies if segment stats are requested).
	 * <p>
	 * API name: {@code include_segment_file_sizes}
	 */
	@Nullable
	public final Boolean includeSegmentFileSizes() {
		return this.includeSegmentFileSizes;
	}

	/**
	 * If true, the response includes information from segments that are not loaded
	 * into memory.
	 * <p>
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public final Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Indicates whether statistics are aggregated at the cluster, index, or shard
	 * level.
	 * <p>
	 * API name: {@code level}
	 */
	@Nullable
	public final Level level() {
		return this.level;
	}

	/**
	 * Limit the information returned the specific metrics.
	 * <p>
	 * API name: {@code metric}
	 */
	public final List<String> metric() {
		return this.metric;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IndicesStatsRequest> {
		@Nullable
		private List<String> completionFields;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private List<String> fielddataFields;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean forbidClosedIndices;

		@Nullable
		private List<String> groups;

		@Nullable
		private Boolean includeSegmentFileSizes;

		@Nullable
		private Boolean includeUnloadedSegments;

		@Nullable
		private List<String> index;

		@Nullable
		private Level level;

		@Nullable
		private List<String> metric;

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 * <p>
		 * API name: {@code completion_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>completionFields</code>.
		 */
		public final Builder completionFields(List<String> list) {
			this.completionFields = _listAddAll(this.completionFields, list);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 * <p>
		 * API name: {@code completion_fields}
		 * <p>
		 * Adds one or more values to <code>completionFields</code>.
		 */
		public final Builder completionFields(String value, String... values) {
			this.completionFields = _listAdd(this.completionFields, value, values);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
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
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
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
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 * <p>
		 * API name: {@code fielddata_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fielddataFields</code>.
		 */
		public final Builder fielddataFields(List<String> list) {
			this.fielddataFields = _listAddAll(this.fielddataFields, list);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 * <p>
		 * API name: {@code fielddata_fields}
		 * <p>
		 * Adds one or more values to <code>fielddataFields</code>.
		 */
		public final Builder fielddataFields(String value, String... values) {
			this.fielddataFields = _listAdd(this.fielddataFields, value, values);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * If true, statistics are not collected from closed indices.
		 * <p>
		 * API name: {@code forbid_closed_indices}
		 */
		public final Builder forbidClosedIndices(@Nullable Boolean value) {
			this.forbidClosedIndices = value;
			return this;
		}

		/**
		 * Comma-separated list of search groups to include in the search statistics.
		 * <p>
		 * API name: {@code groups}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>groups</code>.
		 */
		public final Builder groups(List<String> list) {
			this.groups = _listAddAll(this.groups, list);
			return this;
		}

		/**
		 * Comma-separated list of search groups to include in the search statistics.
		 * <p>
		 * API name: {@code groups}
		 * <p>
		 * Adds one or more values to <code>groups</code>.
		 */
		public final Builder groups(String value, String... values) {
			this.groups = _listAdd(this.groups, value, values);
			return this;
		}

		/**
		 * If true, the call reports the aggregated disk usage of each one of the Lucene
		 * index files (only applies if segment stats are requested).
		 * <p>
		 * API name: {@code include_segment_file_sizes}
		 */
		public final Builder includeSegmentFileSizes(@Nullable Boolean value) {
			this.includeSegmentFileSizes = value;
			return this;
		}

		/**
		 * If true, the response includes information from segments that are not loaded
		 * into memory.
		 * <p>
		 * API name: {@code include_unloaded_segments}
		 */
		public final Builder includeUnloadedSegments(@Nullable Boolean value) {
			this.includeUnloadedSegments = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
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
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
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
		 * Indicates whether statistics are aggregated at the cluster, index, or shard
		 * level.
		 * <p>
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable Level value) {
			this.level = value;
			return this;
		}

		/**
		 * Limit the information returned the specific metrics.
		 * <p>
		 * API name: {@code metric}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metric</code>.
		 */
		public final Builder metric(List<String> list) {
			this.metric = _listAddAll(this.metric, list);
			return this;
		}

		/**
		 * Limit the information returned the specific metrics.
		 * <p>
		 * API name: {@code metric}
		 * <p>
		 * Adds one or more values to <code>metric</code>.
		 */
		public final Builder metric(String value, String... values) {
			this.metric = _listAdd(this.metric, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesStatsRequest build() {
			_checkSingleUse();

			return new IndicesStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.stats}".
	 */
	public static final Endpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.stats",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.metric()))
					propsSet |= _metric;
				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_index | _metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _metric = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.metric()))
					propsSet |= _metric;
				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_metric)) {
					params.put("metric", request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == (_index | _metric)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					params.put("metric", request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.level != null) {
					params.put("level", request.level.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.completionFields)) {
					params.put("completion_fields",
							request.completionFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.fielddataFields)) {
					params.put("fielddata_fields",
							request.fielddataFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.groups)) {
					params.put("groups", request.groups.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (ApiTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.forbidClosedIndices != null) {
					params.put("forbid_closed_indices", String.valueOf(request.forbidClosedIndices));
				}
				if (request.includeSegmentFileSizes != null) {
					params.put("include_segment_file_sizes", String.valueOf(request.includeSegmentFileSizes));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, IndicesStatsResponse._DESERIALIZER);
}
