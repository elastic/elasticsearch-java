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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Integer;
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

// typedef: snapshot.get.Request

/**
 * Returns information about a snapshot.
 * 
 * @see <a href="../doc-files/api-spec.html#snapshot.get.Request">API
 *      specification</a>
 */

public class GetSnapshotRequest extends RequestBase {
	@Nullable
	private final String after;

	@Nullable
	private final String fromSortValue;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeRepository;

	@Nullable
	private final Boolean indexDetails;

	@Nullable
	private final Boolean indexNames;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Integer offset;

	@Nullable
	private final SortOrder order;

	private final String repository;

	@Nullable
	private final Integer size;

	@Nullable
	private final String slmPolicyFilter;

	private final List<String> snapshot;

	@Nullable
	private final SnapshotSort sort;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private GetSnapshotRequest(Builder builder) {

		this.after = builder.after;
		this.fromSortValue = builder.fromSortValue;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeRepository = builder.includeRepository;
		this.indexDetails = builder.indexDetails;
		this.indexNames = builder.indexNames;
		this.masterTimeout = builder.masterTimeout;
		this.offset = builder.offset;
		this.order = builder.order;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.size = builder.size;
		this.slmPolicyFilter = builder.slmPolicyFilter;
		this.snapshot = ApiTypeHelper.unmodifiableRequired(builder.snapshot, this, "snapshot");
		this.sort = builder.sort;
		this.verbose = builder.verbose;

	}

	public static GetSnapshotRequest of(Function<Builder, ObjectBuilder<GetSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Offset identifier to start pagination from as returned by the next field in
	 * the response body.
	 * <p>
	 * API name: {@code after}
	 */
	@Nullable
	public final String after() {
		return this.after;
	}

	/**
	 * Value of the current sort column at which to start retrieval. Can either be a
	 * string snapshot- or repository name when sorting by snapshot or repository
	 * name, a millisecond time value or a number when sorting by index- or shard
	 * count.
	 * <p>
	 * API name: {@code from_sort_value}
	 */
	@Nullable
	public final String fromSortValue() {
		return this.fromSortValue;
	}

	/**
	 * If false, the request returns an error for any snapshots that are
	 * unavailable.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If true, returns the repository name in each snapshot.
	 * <p>
	 * API name: {@code include_repository}
	 */
	@Nullable
	public final Boolean includeRepository() {
		return this.includeRepository;
	}

	/**
	 * If true, returns additional information about each index in the snapshot
	 * comprising the number of shards in the index, the total size of the index in
	 * bytes, and the maximum number of segments per shard in the index. Defaults to
	 * false, meaning that this information is omitted.
	 * <p>
	 * API name: {@code index_details}
	 */
	@Nullable
	public final Boolean indexDetails() {
		return this.indexDetails;
	}

	/**
	 * If true, returns the name of each index in each snapshot.
	 * <p>
	 * API name: {@code index_names}
	 */
	@Nullable
	public final Boolean indexNames() {
		return this.indexNames;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Numeric offset to start pagination from based on the snapshots matching this
	 * request. Using a non-zero value for this parameter is mutually exclusive with
	 * using the after parameter. Defaults to 0.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final Integer offset() {
		return this.offset;
	}

	/**
	 * Sort order. Valid values are asc for ascending and desc for descending order.
	 * Defaults to asc, meaning ascending order.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
	}

	/**
	 * Required - Comma-separated list of snapshot repository names used to limit
	 * the request. Wildcard (*) expressions are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Maximum number of snapshots to return. Defaults to 0 which means return all
	 * that match the request without limit.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Filter snapshots by a comma-separated list of SLM policy names that snapshots
	 * belong to. Also accepts wildcards (*) and combinations of wildcards followed
	 * by exclude patterns starting with -. To include snapshots not created by an
	 * SLM policy you can use the special pattern _none that will match all
	 * snapshots without an SLM policy.
	 * <p>
	 * API name: {@code slm_policy_filter}
	 */
	@Nullable
	public final String slmPolicyFilter() {
		return this.slmPolicyFilter;
	}

	/**
	 * Required - Comma-separated list of snapshot names to retrieve. Also accepts
	 * wildcards (*).
	 * <ul>
	 * <li>To get information about all snapshots in a registered repository, use a
	 * wildcard (*) or _all.</li>
	 * <li>To get information about any snapshots that are currently running, use
	 * _current.</li>
	 * </ul>
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final List<String> snapshot() {
		return this.snapshot;
	}

	/**
	 * Allows setting a sort order for the result. Defaults to start_time, i.e.
	 * sorting by snapshot start time stamp.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final SnapshotSort sort() {
		return this.sort;
	}

	/**
	 * If true, returns additional information about each snapshot such as the
	 * version of Elasticsearch which took the snapshot, the start and end times of
	 * the snapshot, and the number of shards snapshotted.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public final Boolean verbose() {
		return this.verbose;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSnapshotRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetSnapshotRequest> {
		@Nullable
		private String after;

		@Nullable
		private String fromSortValue;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeRepository;

		@Nullable
		private Boolean indexDetails;

		@Nullable
		private Boolean indexNames;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Integer offset;

		@Nullable
		private SortOrder order;

		private String repository;

		@Nullable
		private Integer size;

		@Nullable
		private String slmPolicyFilter;

		private List<String> snapshot;

		@Nullable
		private SnapshotSort sort;

		@Nullable
		private Boolean verbose;

		/**
		 * Offset identifier to start pagination from as returned by the next field in
		 * the response body.
		 * <p>
		 * API name: {@code after}
		 */
		public final Builder after(@Nullable String value) {
			this.after = value;
			return this;
		}

		/**
		 * Value of the current sort column at which to start retrieval. Can either be a
		 * string snapshot- or repository name when sorting by snapshot or repository
		 * name, a millisecond time value or a number when sorting by index- or shard
		 * count.
		 * <p>
		 * API name: {@code from_sort_value}
		 */
		public final Builder fromSortValue(@Nullable String value) {
			this.fromSortValue = value;
			return this;
		}

		/**
		 * If false, the request returns an error for any snapshots that are
		 * unavailable.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If true, returns the repository name in each snapshot.
		 * <p>
		 * API name: {@code include_repository}
		 */
		public final Builder includeRepository(@Nullable Boolean value) {
			this.includeRepository = value;
			return this;
		}

		/**
		 * If true, returns additional information about each index in the snapshot
		 * comprising the number of shards in the index, the total size of the index in
		 * bytes, and the maximum number of segments per shard in the index. Defaults to
		 * false, meaning that this information is omitted.
		 * <p>
		 * API name: {@code index_details}
		 */
		public final Builder indexDetails(@Nullable Boolean value) {
			this.indexDetails = value;
			return this;
		}

		/**
		 * If true, returns the name of each index in each snapshot.
		 * <p>
		 * API name: {@code index_names}
		 */
		public final Builder indexNames(@Nullable Boolean value) {
			this.indexNames = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Numeric offset to start pagination from based on the snapshots matching this
		 * request. Using a non-zero value for this parameter is mutually exclusive with
		 * using the after parameter. Defaults to 0.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Integer value) {
			this.offset = value;
			return this;
		}

		/**
		 * Sort order. Valid values are asc for ascending and desc for descending order.
		 * Defaults to asc, meaning ascending order.
		 * <p>
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable SortOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of snapshot repository names used to limit
		 * the request. Wildcard (*) expressions are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Maximum number of snapshots to return. Defaults to 0 which means return all
		 * that match the request without limit.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Filter snapshots by a comma-separated list of SLM policy names that snapshots
		 * belong to. Also accepts wildcards (*) and combinations of wildcards followed
		 * by exclude patterns starting with -. To include snapshots not created by an
		 * SLM policy you can use the special pattern _none that will match all
		 * snapshots without an SLM policy.
		 * <p>
		 * API name: {@code slm_policy_filter}
		 */
		public final Builder slmPolicyFilter(@Nullable String value) {
			this.slmPolicyFilter = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of snapshot names to retrieve. Also accepts
		 * wildcards (*).
		 * <ul>
		 * <li>To get information about all snapshots in a registered repository, use a
		 * wildcard (*) or _all.</li>
		 * <li>To get information about any snapshots that are currently running, use
		 * _current.</li>
		 * </ul>
		 * <p>
		 * API name: {@code snapshot}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>snapshot</code>.
		 */
		public final Builder snapshot(List<String> list) {
			this.snapshot = _listAddAll(this.snapshot, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of snapshot names to retrieve. Also accepts
		 * wildcards (*).
		 * <ul>
		 * <li>To get information about all snapshots in a registered repository, use a
		 * wildcard (*) or _all.</li>
		 * <li>To get information about any snapshots that are currently running, use
		 * _current.</li>
		 * </ul>
		 * <p>
		 * API name: {@code snapshot}
		 * <p>
		 * Adds one or more values to <code>snapshot</code>.
		 */
		public final Builder snapshot(String value, String... values) {
			this.snapshot = _listAdd(this.snapshot, value, values);
			return this;
		}

		/**
		 * Allows setting a sort order for the result. Defaults to start_time, i.e.
		 * sorting by snapshot start time stamp.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable SnapshotSort value) {
			this.sort = value;
			return this;
		}

		/**
		 * If true, returns additional information about each snapshot such as the
		 * version of Elasticsearch which took the snapshot, the start and end times of
		 * the snapshot, and the number of shards snapshotted.
		 * <p>
		 * API name: {@code verbose}
		 */
		public final Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSnapshotRequest build() {
			_checkSingleUse();

			return new GetSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.get}".
	 */
	public static final Endpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					params.put("repository", request.repository);
					params.put("snapshot", request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.offset != null) {
					params.put("offset", String.valueOf(request.offset));
				}
				if (request.fromSortValue != null) {
					params.put("from_sort_value", request.fromSortValue);
				}
				if (request.indexNames != null) {
					params.put("index_names", String.valueOf(request.indexNames));
				}
				if (request.indexDetails != null) {
					params.put("index_details", String.valueOf(request.indexDetails));
				}
				if (request.sort != null) {
					params.put("sort", request.sort.jsonValue());
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.includeRepository != null) {
					params.put("include_repository", String.valueOf(request.includeRepository));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.after != null) {
					params.put("after", request.after);
				}
				if (request.slmPolicyFilter != null) {
					params.put("slm_policy_filter", request.slmPolicyFilter);
				}
				if (request.order != null) {
					params.put("order", request.order.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetSnapshotResponse._DESERIALIZER);
}
