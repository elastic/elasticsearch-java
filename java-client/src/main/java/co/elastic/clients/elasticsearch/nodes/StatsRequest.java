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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: nodes.stats.Request
public final class StatsRequest extends RequestBase {
	@Nullable
	private final String nodeId;

	@Nullable
	private final List<String> metric;

	@Nullable
	private final List<String> indexMetric;

	@Nullable
	private final List<String> completionFields;

	@Nullable
	private final List<String> fielddataFields;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean groups;

	@Nullable
	private final Boolean includeSegmentFileSizes;

	@Nullable
	private final JsonValue level;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final List<String> types;

	@Nullable
	private final Boolean includeUnloadedSegments;

	// ---------------------------------------------------------------------------------------------

	protected StatsRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.metric = builder.metric;
		this.indexMetric = builder.indexMetric;
		this.completionFields = builder.completionFields;
		this.fielddataFields = builder.fielddataFields;
		this.fields = builder.fields;
		this.groups = builder.groups;
		this.includeSegmentFileSizes = builder.includeSegmentFileSizes;
		this.level = builder.level;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.types = builder.types;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;

	}

	/**
	 * Comma-separated list of node IDs or names used to limit returned information.
	 *
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code metric}
	 */
	@Nullable
	public List<String> metric() {
		return this.metric;
	}

	/**
	 * Limit the information returned for indices metric to the specific index
	 * metrics. It can be used only if indices (or all) metric is specified.
	 *
	 * API name: {@code index_metric}
	 */
	@Nullable
	public List<String> indexMetric() {
		return this.indexMetric;
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in
	 * fielddata and suggest statistics.
	 *
	 * API name: {@code completion_fields}
	 */
	@Nullable
	public List<String> completionFields() {
		return this.completionFields;
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in
	 * fielddata statistics.
	 *
	 * API name: {@code fielddata_fields}
	 */
	@Nullable
	public List<String> fielddataFields() {
		return this.fielddataFields;
	}

	/**
	 * Comma-separated list or wildcard expressions of fields to include in the
	 * statistics.
	 *
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Comma-separated list of search groups to include in the search statistics.
	 *
	 * API name: {@code groups}
	 */
	@Nullable
	public Boolean groups() {
		return this.groups;
	}

	/**
	 * If true, the call reports the aggregated disk usage of each one of the Lucene
	 * index files (only applies if segment stats are requested).
	 *
	 * API name: {@code include_segment_file_sizes}
	 */
	@Nullable
	public Boolean includeSegmentFileSizes() {
		return this.includeSegmentFileSizes;
	}

	/**
	 * Indicates whether statistics are aggregated at the cluster, index, or shard
	 * level.
	 *
	 * API name: {@code level}
	 */
	@Nullable
	public JsonValue level() {
		return this.level;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 *
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 *
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * A comma-separated list of document types for the indexing index metric.
	 *
	 * API name: {@code types}
	 */
	@Nullable
	public List<String> types() {
		return this.types;
	}

	/**
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<StatsRequest> {
		@Nullable
		private String nodeId;

		@Nullable
		private List<String> metric;

		@Nullable
		private List<String> indexMetric;

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
		private JsonValue level;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private List<String> types;

		@Nullable
		private Boolean includeUnloadedSegments;

		/**
		 * Comma-separated list of node IDs or names used to limit returned information.
		 *
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code metric}
		 */
		public Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * API name: {@code metric}
		 */
		public Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metric(List)}, creating the list if needed.
		 */
		public Builder addMetric(String value) {
			if (this.metric == null) {
				this.metric = new ArrayList<>();
			}
			this.metric.add(value);
			return this;
		}

		/**
		 * Limit the information returned for indices metric to the specific index
		 * metrics. It can be used only if indices (or all) metric is specified.
		 *
		 * API name: {@code index_metric}
		 */
		public Builder indexMetric(@Nullable List<String> value) {
			this.indexMetric = value;
			return this;
		}

		/**
		 * Limit the information returned for indices metric to the specific index
		 * metrics. It can be used only if indices (or all) metric is specified.
		 *
		 * API name: {@code index_metric}
		 */
		public Builder indexMetric(String... value) {
			this.indexMetric = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexMetric(List)}, creating the list if needed.
		 */
		public Builder addIndexMetric(String value) {
			if (this.indexMetric == null) {
				this.indexMetric = new ArrayList<>();
			}
			this.indexMetric.add(value);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 *
		 * API name: {@code completion_fields}
		 */
		public Builder completionFields(@Nullable List<String> value) {
			this.completionFields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata and suggest statistics.
		 *
		 * API name: {@code completion_fields}
		 */
		public Builder completionFields(String... value) {
			this.completionFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #completionFields(List)}, creating the list if needed.
		 */
		public Builder addCompletionFields(String value) {
			if (this.completionFields == null) {
				this.completionFields = new ArrayList<>();
			}
			this.completionFields.add(value);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 *
		 * API name: {@code fielddata_fields}
		 */
		public Builder fielddataFields(@Nullable List<String> value) {
			this.fielddataFields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in
		 * fielddata statistics.
		 *
		 * API name: {@code fielddata_fields}
		 */
		public Builder fielddataFields(String... value) {
			this.fielddataFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fielddataFields(List)}, creating the list if needed.
		 */
		public Builder addFielddataFields(String value) {
			if (this.fielddataFields == null) {
				this.fielddataFields = new ArrayList<>();
			}
			this.fielddataFields.add(value);
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 *
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expressions of fields to include in the
		 * statistics.
		 *
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Comma-separated list of search groups to include in the search statistics.
		 *
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable Boolean value) {
			this.groups = value;
			return this;
		}

		/**
		 * If true, the call reports the aggregated disk usage of each one of the Lucene
		 * index files (only applies if segment stats are requested).
		 *
		 * API name: {@code include_segment_file_sizes}
		 */
		public Builder includeSegmentFileSizes(@Nullable Boolean value) {
			this.includeSegmentFileSizes = value;
			return this;
		}

		/**
		 * Indicates whether statistics are aggregated at the cluster, index, or shard
		 * level.
		 *
		 * API name: {@code level}
		 */
		public Builder level(@Nullable JsonValue value) {
			this.level = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 *
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 *
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * A comma-separated list of document types for the indexing index metric.
		 *
		 * API name: {@code types}
		 */
		public Builder types(@Nullable List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * A comma-separated list of document types for the indexing index metric.
		 *
		 * API name: {@code types}
		 */
		public Builder types(String... value) {
			this.types = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #types(List)}, creating the list if needed.
		 */
		public Builder addTypes(String value) {
			if (this.types == null) {
				this.types = new ArrayList<>();
			}
			this.types.add(value);
			return this;
		}

		/**
		 * API name: {@code include_unloaded_segments}
		 */
		public Builder includeUnloadedSegments(@Nullable Boolean value) {
			this.includeUnloadedSegments = value;
			return this;
		}

		/**
		 * Builds a {@link StatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsRequest build() {

			return new StatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.stats}".
	 */
	public static final Endpoint<StatsRequest, StatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;
				final int _metric = 1 << 1;
				final int _indexMetric = 1 << 2;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;
				if (request.metric() != null)
					propsSet |= _metric;
				if (request.indexMetric() != null)
					propsSet |= _indexMetric;

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
					buf.append(request.nodeId);
					buf.append("/stats");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_nodeId | _metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId);
					buf.append("/stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_metric | _indexMetric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.indexMetric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_nodeId | _metric | _indexMetric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId);
					buf.append("/stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.indexMetric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.completionFields != null) {
					params.put("completion_fields",
							request.completionFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.fielddataFields != null) {
					params.put("fielddata_fields",
							request.fielddataFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.fields != null) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.groups != null) {
					params.put("groups", String.valueOf(request.groups));
				}
				if (request.includeSegmentFileSizes != null) {
					params.put("include_segment_file_sizes", String.valueOf(request.includeSegmentFileSizes));
				}
				if (request.level != null) {
					params.put("level", request.level.toString());
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.types != null) {
					params.put("types", request.types.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, StatsResponse.DESERIALIZER);
}
