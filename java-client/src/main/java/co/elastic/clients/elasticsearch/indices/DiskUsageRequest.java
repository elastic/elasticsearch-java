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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.TimeUnit;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: indices.disk_usage.Request

public final class DiskUsageRequest extends RequestBase {
	private final String index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean flush;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final TimeUnit masterTimeout;

	@Nullable
	private final TimeUnit timeout;

	@Nullable
	private final Boolean runExpensiveTasks;

	@Nullable
	private final String waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	public DiskUsageRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.flush = builder.flush;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.runExpensiveTasks = builder.runExpensiveTasks;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public DiskUsageRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and aliases used to
	 * limit the request. It’s recommended to execute this API with a single index
	 * (or the latest backing index of a data stream) as the API consumes resources
	 * significantly.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * If false, the request returns an error if any wildcard expression, index
	 * alias, or _all value targets only missing or closed indices. This behavior
	 * applies even if the request targets other open indices. For example, a
	 * request targeting foo*,bar* returns an error if an index starts with foo but
	 * no index starts with bar.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as open,hidden.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, the API performs a flush before analysis. If false, the response may
	 * not include uncommitted data.
	 * <p>
	 * API name: {@code flush}
	 */
	@Nullable
	public Boolean flush() {
		return this.flush;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public TimeUnit masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public TimeUnit timeout() {
		return this.timeout;
	}

	/**
	 * Analyzing field disk usage is resource-intensive. To use the API, this
	 * parameter must be set to true.
	 * <p>
	 * API name: {@code run_expensive_tasks}
	 */
	@Nullable
	public Boolean runExpensiveTasks() {
		return this.runExpensiveTasks;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to all or any positive integer up to the total number of
	 * shards in the index (number_of_replicas+1). Default: 1, the primary shard.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public String waitForActiveShards() {
		return this.waitForActiveShards;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiskUsageRequest}.
	 */
	public static class Builder implements ObjectBuilder<DiskUsageRequest> {
		private String index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean flush;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private TimeUnit masterTimeout;

		@Nullable
		private TimeUnit timeout;

		@Nullable
		private Boolean runExpensiveTasks;

		@Nullable
		private String waitForActiveShards;

		/**
		 * Required - Comma-separated list of data streams, indices, and aliases used to
		 * limit the request. It’s recommended to execute this API with a single index
		 * (or the latest backing index of a data stream) as the API consumes resources
		 * significantly.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * If false, the request returns an error if any wildcard expression, index
		 * alias, or _all value targets only missing or closed indices. This behavior
		 * applies even if the request targets other open indices. For example, a
		 * request targeting foo*,bar* returns an error if an index starts with foo but
		 * no index starts with bar.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as open,hidden.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as open,hidden.
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
		 * If true, the API performs a flush before analysis. If false, the response may
		 * not include uncommitted data.
		 * <p>
		 * API name: {@code flush}
		 */
		public Builder flush(@Nullable Boolean value) {
			this.flush = value;
			return this;
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable TimeUnit value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable TimeUnit value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Analyzing field disk usage is resource-intensive. To use the API, this
		 * parameter must be set to true.
		 * <p>
		 * API name: {@code run_expensive_tasks}
		 */
		public Builder runExpensiveTasks(@Nullable Boolean value) {
			this.runExpensiveTasks = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to all or any positive integer up to the total number of
		 * shards in the index (number_of_replicas+1). Default: 1, the primary shard.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable String value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Builds a {@link DiskUsageRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiskUsageRequest build() {

			return new DiskUsageRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.disk_usage}".
	 */
	public static final Endpoint<DiskUsageRequest, DiskUsageResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_disk_usage");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.flush != null) {
					params.put("flush", String.valueOf(request.flush));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.runExpensiveTasks != null) {
					params.put("run_expensive_tasks", String.valueOf(request.runExpensiveTasks));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DiskUsageResponse._DESERIALIZER);
}
