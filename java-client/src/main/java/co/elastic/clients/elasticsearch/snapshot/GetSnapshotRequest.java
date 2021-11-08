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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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

// typedef: snapshot.get.Request

public class GetSnapshotRequest extends RequestBase {
	@Nullable
	private final Boolean human;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeRepository;

	@Nullable
	private final Boolean indexDetails;

	@Nullable
	private final String masterTimeout;

	private final String repository;

	private final List<String> snapshot;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private GetSnapshotRequest(Builder builder) {

		this.human = builder.human;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeRepository = builder.includeRepository;
		this.indexDetails = builder.indexDetails;
		this.masterTimeout = builder.masterTimeout;
		this.repository = ModelTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ModelTypeHelper.unmodifiableRequired(builder.snapshot, this, "snapshot");
		this.verbose = builder.verbose;

	}

	public static GetSnapshotRequest of(Function<Builder, ObjectBuilder<GetSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code human}
	 */
	@Nullable
	public final Boolean human() {
		return this.human;
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
	 * Whether to include the repository name in the snapshot info. Defaults to
	 * true.
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
	 * Required - Comma-separated list of snapshot repository names used to limit
	 * the request. Wildcard (*) expressions are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetSnapshotRequest> {
		@Nullable
		private Boolean human;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeRepository;

		@Nullable
		private Boolean indexDetails;

		@Nullable
		private String masterTimeout;

		private String repository;

		private List<String> snapshot;

		@Nullable
		private Boolean verbose;

		/**
		 * API name: {@code human}
		 */
		public final Builder human(@Nullable Boolean value) {
			this.human = value;
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
		 * Whether to include the repository name in the snapshot info. Defaults to
		 * true.
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
		public final Builder snapshot(List<String> value) {
			this.snapshot = value;
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
		 */
		public final Builder snapshot(String... value) {
			this.snapshot = Arrays.asList(value);
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
	public static final Endpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.includeRepository != null) {
					params.put("include_repository", String.valueOf(request.includeRepository));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.indexDetails != null) {
					params.put("index_details", String.valueOf(request.indexDetails));
				}
				if (request.human != null) {
					params.put("human", String.valueOf(request.human));
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetSnapshotResponse._DESERIALIZER);
}
