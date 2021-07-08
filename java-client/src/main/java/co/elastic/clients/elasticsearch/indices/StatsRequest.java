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

// typedef: indices.stats.Request
public final class StatsRequest extends RequestBase {
	@Nullable
	private final List<String> metric;

	@Nullable
	private final List<String> index;

	@Nullable
	private final List<String> completionFields;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final List<String> fielddataFields;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean forbidClosedIndices;

	@Nullable
	private final List<String> groups;

	@Nullable
	private final Boolean includeSegmentFileSizes;

	@Nullable
	private final Boolean includeUnloadedSegments;

	@Nullable
	private final JsonValue level;

	@Nullable
	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	protected StatsRequest(Builder builder) {

		this.metric = builder.metric;
		this.index = builder.index;
		this.completionFields = builder.completionFields;
		this.expandWildcards = builder.expandWildcards;
		this.fielddataFields = builder.fielddataFields;
		this.fields = builder.fields;
		this.forbidClosedIndices = builder.forbidClosedIndices;
		this.groups = builder.groups;
		this.includeSegmentFileSizes = builder.includeSegmentFileSizes;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.level = builder.level;
		this.types = builder.types;

	}

	/**
	 * API name: {@code metric}
	 */
	@Nullable
	public List<String> metric() {
		return this.metric;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code completion_fields}
	 */
	@Nullable
	public List<String> completionFields() {
		return this.completionFields;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code fielddata_fields}
	 */
	@Nullable
	public List<String> fielddataFields() {
		return this.fielddataFields;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code forbid_closed_indices}
	 */
	@Nullable
	public Boolean forbidClosedIndices() {
		return this.forbidClosedIndices;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
	}

	/**
	 * API name: {@code include_segment_file_sizes}
	 */
	@Nullable
	public Boolean includeSegmentFileSizes() {
		return this.includeSegmentFileSizes;
	}

	/**
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
	}

	/**
	 * API name: {@code level}
	 */
	@Nullable
	public JsonValue level() {
		return this.level;
	}

	/**
	 * API name: {@code types}
	 */
	@Nullable
	public List<String> types() {
		return this.types;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<StatsRequest> {
		@Nullable
		private List<String> metric;

		@Nullable
		private List<String> index;

		@Nullable
		private List<String> completionFields;

		@Nullable
		private JsonValue expandWildcards;

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
		private JsonValue level;

		@Nullable
		private List<String> types;

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
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
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
		 * API name: {@code completion_fields}
		 */
		public Builder completionFields(@Nullable List<String> value) {
			this.completionFields = value;
			return this;
		}

		/**
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
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code fielddata_fields}
		 */
		public Builder fielddataFields(@Nullable List<String> value) {
			this.fielddataFields = value;
			return this;
		}

		/**
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
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
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
		 * API name: {@code forbid_closed_indices}
		 */
		public Builder forbidClosedIndices(@Nullable Boolean value) {
			this.forbidClosedIndices = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #groups(List)}, creating the list if needed.
		 */
		public Builder addGroups(String value) {
			if (this.groups == null) {
				this.groups = new ArrayList<>();
			}
			this.groups.add(value);
			return this;
		}

		/**
		 * API name: {@code include_segment_file_sizes}
		 */
		public Builder includeSegmentFileSizes(@Nullable Boolean value) {
			this.includeSegmentFileSizes = value;
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
		 * API name: {@code level}
		 */
		public Builder level(@Nullable JsonValue value) {
			this.level = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public Builder types(@Nullable List<String> value) {
			this.types = value;
			return this;
		}

		/**
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
	 * Endpoint "{@code indices.stats}".
	 */
	public static final Endpoint<StatsRequest, StatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (request.metric() != null)
					propsSet |= _metric;
				if (request.index() != null)
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
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_index | _metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_stats");
					buf.append("/");
					buf.append(request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
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
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.fielddataFields != null) {
					params.put("fielddata_fields",
							request.fielddataFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.fields != null) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.forbidClosedIndices != null) {
					params.put("forbid_closed_indices", String.valueOf(request.forbidClosedIndices));
				}
				if (request.groups != null) {
					params.put("groups", request.groups.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeSegmentFileSizes != null) {
					params.put("include_segment_file_sizes", String.valueOf(request.includeSegmentFileSizes));
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (request.level != null) {
					params.put("level", request.level.toString());
				}
				if (request.types != null) {
					params.put("types", request.types.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, StatsResponse.DESERIALIZER);
}
