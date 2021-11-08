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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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

// typedef: nodes.stats.Request

public class NodesStatsRequest extends RequestBase {
	private final List<String> completionFields;

	private final List<String> fielddataFields;

	private final List<String> fields;

	@Nullable
	private final Boolean groups;

	@Nullable
	private final Boolean includeSegmentFileSizes;

	@Nullable
	private final Boolean includeUnloadedSegments;

	private final List<String> indexMetric;

	@Nullable
	private final Level level;

	@Nullable
	private final String masterTimeout;

	private final List<String> metric;

	private final List<String> nodeId;

	@Nullable
	private final String timeout;

	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	private NodesStatsRequest(Builder builder) {

		this.completionFields = ModelTypeHelper.unmodifiable(builder.completionFields);
		this.fielddataFields = ModelTypeHelper.unmodifiable(builder.fielddataFields);
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.groups = builder.groups;
		this.includeSegmentFileSizes = builder.includeSegmentFileSizes;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.indexMetric = ModelTypeHelper.unmodifiable(builder.indexMetric);
		this.level = builder.level;
		this.masterTimeout = builder.masterTimeout;
		this.metric = ModelTypeHelper.unmodifiable(builder.metric);
		this.nodeId = ModelTypeHelper.unmodifiable(builder.nodeId);
		this.timeout = builder.timeout;
		this.types = ModelTypeHelper.unmodifiable(builder.types);

	}

	public static NodesStatsRequest of(Function<Builder, ObjectBuilder<NodesStatsRequest>> fn) {
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
	 * Comma-separated list of search groups to include in the search statistics.
	 * <p>
	 * API name: {@code groups}
	 */
	@Nullable
	public final Boolean groups() {
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
	 * Limit the information returned for indices metric to the specific index
	 * metrics. It can be used only if indices (or all) metric is specified.
	 * <p>
	 * API name: {@code index_metric}
	 */
	public final List<String> indexMetric() {
		return this.indexMetric;
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
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Limit the information returned to the specified metrics
	 * <p>
	 * API name: {@code metric}
	 */
	public final List<String> metric() {
		return this.metric;
	}

	/**
	 * Comma-separated list of node IDs or names used to limit returned information.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * A comma-separated list of document types for the indexing index metric.
	 * <p>
	 * API name: {@code types}
	 */
	public final List<String> types() {
		return this.types;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodesStatsRequest> {
		@Nullable
		private List<String> completionFields;

		@Nullable
		private List<String> fielddataFields;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean groups;

		@Nullable
		private Boolean includeSegmentFileSizes;

		@Nullable
		private Boolean includeUnloadedSegments;

		@Nullable
		private List<String> indexMetric;

		@Nullable
		private Level level;

		@Nullable
		private String masterTimeout;

		@Nullable
		private List<String> metric;

		@Nullable
		private List<String> nodeId;

		@Nullable
		private String timeout;

		@Nullable
		private List<String> types;

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 * <p>
		 * API name: {@code completion_fields}
		 */
		public final Builder completionFields(@Nullable List<String> value) {
			this.completionFields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 * <p>
		 * API name: {@code completion_fields}
		 */
		public final Builder completionFields(String... value) {
			this.completionFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 * <p>
		 * API name: {@code fielddata_fields}
		 */
		public final Builder fielddataFields(@Nullable List<String> value) {
			this.fielddataFields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 * <p>
		 * API name: {@code fielddata_fields}
		 */
		public final Builder fielddataFields(String... value) {
			this.fielddataFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Comma-separated list of search groups to include in the search statistics.
		 * <p>
		 * API name: {@code groups}
		 */
		public final Builder groups(@Nullable Boolean value) {
			this.groups = value;
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
		 * Limit the information returned for indices metric to the specific index
		 * metrics. It can be used only if indices (or all) metric is specified.
		 * <p>
		 * API name: {@code index_metric}
		 */
		public final Builder indexMetric(@Nullable List<String> value) {
			this.indexMetric = value;
			return this;
		}

		/**
		 * Limit the information returned for indices metric to the specific index
		 * metrics. It can be used only if indices (or all) metric is specified.
		 * <p>
		 * API name: {@code index_metric}
		 */
		public final Builder indexMetric(String... value) {
			this.indexMetric = Arrays.asList(value);
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
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Comma-separated list of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Comma-separated list of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(String... value) {
			this.nodeId = Arrays.asList(value);
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * A comma-separated list of document types for the indexing index metric.
		 * <p>
		 * API name: {@code types}
		 */
		public final Builder types(@Nullable List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * A comma-separated list of document types for the indexing index metric.
		 * <p>
		 * API name: {@code types}
		 */
		public final Builder types(String... value) {
			this.types = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link NodesStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesStatsRequest build() {
			_checkSingleUse();

			return new NodesStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.stats}".
	 */
	public static final Endpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;
				final int _indexMetric = 1 << 1;
				final int _nodeId = 1 << 2;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.metric()))
					propsSet |= _metric;
				if (ModelTypeHelper.isDefined(request.indexMetric()))
					propsSet |= _indexMetric;
				if (ModelTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/stats");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/stats");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == (_nodeId | _metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == (_metric | _indexMetric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.indexMetric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == (_nodeId | _metric | _indexMetric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/stats");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.indexMetric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (ModelTypeHelper.isDefined(request.types)) {
					params.put("types", request.types.stream().map(v -> v).collect(Collectors.joining(",")));
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
				if (request.groups != null) {
					params.put("groups", String.valueOf(request.groups));
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (ModelTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeSegmentFileSizes != null) {
					params.put("include_segment_file_sizes", String.valueOf(request.includeSegmentFileSizes));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, NodesStatsResponse._DESERIALIZER);
}
