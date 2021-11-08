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
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.Level;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.stats.Request

public class IndicesStatsRequest extends RequestBase {
	private final List<String> completionFields;

	private final List<ExpandWildcardOptions> expandWildcards;

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

	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	private IndicesStatsRequest(Builder builder) {

		this.completionFields = ModelTypeHelper.unmodifiable(builder.completionFields);
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.fielddataFields = ModelTypeHelper.unmodifiable(builder.fielddataFields);
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.forbidClosedIndices = builder.forbidClosedIndices;
		this.groups = ModelTypeHelper.unmodifiable(builder.groups);
		this.includeSegmentFileSizes = builder.includeSegmentFileSizes;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.level = builder.level;
		this.metric = ModelTypeHelper.unmodifiable(builder.metric);
		this.types = ModelTypeHelper.unmodifiable(builder.types);

	}

	public static IndicesStatsRequest of(Function<Builder, ObjectBuilder<IndicesStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of fields for the <code>completion</code> index metric
	 * (supports wildcards)
	 * <p>
	 * API name: {@code completion_fields}
	 */
	public final List<String> completionFields() {
		return this.completionFields;
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
	 * A comma-separated list of fields for the <code>fielddata</code> index metric
	 * (supports wildcards)
	 * <p>
	 * API name: {@code fielddata_fields}
	 */
	public final List<String> fielddataFields() {
		return this.fielddataFields;
	}

	/**
	 * A comma-separated list of fields for <code>fielddata</code> and
	 * <code>completion</code> index metric (supports wildcards)
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * If set to false stats will also collected from closed indices if explicitly
	 * specified or if expand_wildcards expands to closed indices
	 * <p>
	 * API name: {@code forbid_closed_indices}
	 */
	@Nullable
	public final Boolean forbidClosedIndices() {
		return this.forbidClosedIndices;
	}

	/**
	 * A comma-separated list of search groups for <code>search</code> index metric
	 * <p>
	 * API name: {@code groups}
	 */
	public final List<String> groups() {
		return this.groups;
	}

	/**
	 * Whether to report the aggregated disk usage of each one of the Lucene index
	 * files (only applies if segment stats are requested)
	 * <p>
	 * API name: {@code include_segment_file_sizes}
	 */
	@Nullable
	public final Boolean includeSegmentFileSizes() {
		return this.includeSegmentFileSizes;
	}

	/**
	 * If set to true segment stats will include stats for segments that are not
	 * currently loaded into memory
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
	 * Return stats aggregated at cluster, index or shard level
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

	/**
	 * A comma-separated list of document types for the <code>indexing</code> index
	 * metric
	 * <p>
	 * API name: {@code types}
	 */
	public final List<String> types() {
		return this.types;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesStatsRequest> {
		@Nullable
		private List<String> completionFields;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

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

		@Nullable
		private List<String> types;

		/**
		 * A comma-separated list of fields for the <code>completion</code> index metric
		 * (supports wildcards)
		 * <p>
		 * API name: {@code completion_fields}
		 */
		public final Builder completionFields(@Nullable List<String> value) {
			this.completionFields = value;
			return this;
		}

		/**
		 * A comma-separated list of fields for the <code>completion</code> index metric
		 * (supports wildcards)
		 * <p>
		 * API name: {@code completion_fields}
		 */
		public final Builder completionFields(String... value) {
			this.completionFields = Arrays.asList(value);
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
		 * A comma-separated list of fields for the <code>fielddata</code> index metric
		 * (supports wildcards)
		 * <p>
		 * API name: {@code fielddata_fields}
		 */
		public final Builder fielddataFields(@Nullable List<String> value) {
			this.fielddataFields = value;
			return this;
		}

		/**
		 * A comma-separated list of fields for the <code>fielddata</code> index metric
		 * (supports wildcards)
		 * <p>
		 * API name: {@code fielddata_fields}
		 */
		public final Builder fielddataFields(String... value) {
			this.fielddataFields = Arrays.asList(value);
			return this;
		}

		/**
		 * A comma-separated list of fields for <code>fielddata</code> and
		 * <code>completion</code> index metric (supports wildcards)
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * A comma-separated list of fields for <code>fielddata</code> and
		 * <code>completion</code> index metric (supports wildcards)
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * If set to false stats will also collected from closed indices if explicitly
		 * specified or if expand_wildcards expands to closed indices
		 * <p>
		 * API name: {@code forbid_closed_indices}
		 */
		public final Builder forbidClosedIndices(@Nullable Boolean value) {
			this.forbidClosedIndices = value;
			return this;
		}

		/**
		 * A comma-separated list of search groups for <code>search</code> index metric
		 * <p>
		 * API name: {@code groups}
		 */
		public final Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * A comma-separated list of search groups for <code>search</code> index metric
		 * <p>
		 * API name: {@code groups}
		 */
		public final Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Whether to report the aggregated disk usage of each one of the Lucene index
		 * files (only applies if segment stats are requested)
		 * <p>
		 * API name: {@code include_segment_file_sizes}
		 */
		public final Builder includeSegmentFileSizes(@Nullable Boolean value) {
			this.includeSegmentFileSizes = value;
			return this;
		}

		/**
		 * If set to true segment stats will include stats for segments that are not
		 * currently loaded into memory
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
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Return stats aggregated at cluster, index or shard level
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
		 */
		public final Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Limit the information returned the specific metrics.
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * A comma-separated list of document types for the <code>indexing</code> index
		 * metric
		 * <p>
		 * API name: {@code types}
		 */
		public final Builder types(@Nullable List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * A comma-separated list of document types for the <code>indexing</code> index
		 * metric
		 * <p>
		 * API name: {@code types}
		 */
		public final Builder types(String... value) {
			this.types = Arrays.asList(value);
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
	public static final Endpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.metric()))
					propsSet |= _metric;
				if (ModelTypeHelper.isDefined(request.index()))
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ModelTypeHelper.isDefined(request.types)) {
					params.put("types", request.types.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.level != null) {
					params.put("level", request.level.jsonValue());
				}
				if (ModelTypeHelper.isDefined(request.completionFields)) {
					params.put("completion_fields",
							request.completionFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ModelTypeHelper.isDefined(request.fielddataFields)) {
					params.put("fielddata_fields",
							request.fielddataFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ModelTypeHelper.isDefined(request.groups)) {
					params.put("groups", request.groups.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (ModelTypeHelper.isDefined(request.fields)) {
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
