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

// typedef: snapshot.status.Request

/**
 * Get the snapshot status. Get a detailed description of the current state for
 * each shard participating in the snapshot.
 * <p>
 * Note that this API should be used only to obtain detailed shard-level
 * information for ongoing snapshots. If this detail is not needed or you want
 * to obtain information about one or more existing snapshots, use the get
 * snapshot API.
 * <p>
 * If you omit the <code>&lt;snapshot&gt;</code> request path parameter, the
 * request retrieves information only for currently running snapshots. This
 * usage is preferred. If needed, you can specify
 * <code>&lt;repository&gt;</code> and <code>&lt;snapshot&gt;</code> to retrieve
 * information for specific snapshots, even if they're not currently running.
 * <p>
 * WARNING: Using the API to return the status of any snapshots other than
 * currently running snapshots can be expensive. The API requires a read from
 * the repository for each shard in each snapshot. For example, if you have 100
 * snapshots with 1,000 shards each, an API request that includes all snapshots
 * will require 100,000 reads (100 snapshots x 1,000 shards).
 * <p>
 * Depending on the latency of your storage, such requests can take an extremely
 * long time to return results. These requests can also tax machine resources
 * and, when using cloud storage, incur high processing costs.
 * 
 * @see <a href="../doc-files/api-spec.html#snapshot.status.Request">API
 *      specification</a>
 */

public class SnapshotStatusRequest extends RequestBase {
	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final String repository;

	private final List<String> snapshot;

	// ---------------------------------------------------------------------------------------------

	private SnapshotStatusRequest(Builder builder) {

		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;
		this.repository = builder.repository;
		this.snapshot = ApiTypeHelper.unmodifiable(builder.snapshot);

	}

	public static SnapshotStatusRequest of(Function<Builder, ObjectBuilder<SnapshotStatusRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>false</code>, the request returns an error for any snapshots that
	 * are unavailable. If <code>true</code>, the request ignores snapshots that are
	 * unavailable, such as those that are corrupted or temporarily cannot be
	 * returned.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The snapshot repository name used to limit the request. It supports wildcards
	 * (<code>*</code>) if <code>&lt;snapshot&gt;</code> isn't specified.
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public final String repository() {
		return this.repository;
	}

	/**
	 * A comma-separated list of snapshots to retrieve status for. The default is
	 * currently running snapshots. Wildcards (<code>*</code>) are not supported.
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final List<String> snapshot() {
		return this.snapshot;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotStatusRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SnapshotStatusRequest> {
		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private String repository;

		@Nullable
		private List<String> snapshot;

		/**
		 * If <code>false</code>, the request returns an error for any snapshots that
		 * are unavailable. If <code>true</code>, the request ignores snapshots that are
		 * unavailable, such as those that are corrupted or temporarily cannot be
		 * returned.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The snapshot repository name used to limit the request. It supports wildcards
		 * (<code>*</code>) if <code>&lt;snapshot&gt;</code> isn't specified.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * A comma-separated list of snapshots to retrieve status for. The default is
		 * currently running snapshots. Wildcards (<code>*</code>) are not supported.
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
		 * A comma-separated list of snapshots to retrieve status for. The default is
		 * currently running snapshots. Wildcards (<code>*</code>) are not supported.
		 * <p>
		 * API name: {@code snapshot}
		 * <p>
		 * Adds one or more values to <code>snapshot</code>.
		 */
		public final Builder snapshot(String value, String... values) {
			this.snapshot = _listAdd(this.snapshot, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotStatusRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotStatusRequest build() {
			_checkSingleUse();

			return new SnapshotStatusRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.status}".
	 */
	public static final Endpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.status",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (ApiTypeHelper.isDefined(request.snapshot()))
					propsSet |= _snapshot;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/_status");
					return buf.toString();
				}
				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/_status");
					return buf.toString();
				}
				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/_status");
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

				if (request.repository() != null)
					propsSet |= _repository;
				if (ApiTypeHelper.isDefined(request.snapshot()))
					propsSet |= _snapshot;

				if (propsSet == 0) {
				}
				if (propsSet == (_repository)) {
					params.put("repository", request.repository);
				}
				if (propsSet == (_repository | _snapshot)) {
					params.put("repository", request.repository);
					params.put("snapshot", request.snapshot.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SnapshotStatusResponse._DESERIALIZER);
}
