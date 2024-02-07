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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: snapshot.delete.Request

/**
 * Deletes one or more snapshots.
 * 
 * @see <a href="../doc-files/api-spec.html#snapshot.delete.Request">API
 *      specification</a>
 */

public class DeleteSnapshotRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	private final String repository;

	private final String snapshot;

	// ---------------------------------------------------------------------------------------------

	private DeleteSnapshotRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ApiTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");

	}

	public static DeleteSnapshotRequest of(Function<Builder, ObjectBuilder<DeleteSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - A comma-separated list of snapshot names
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteSnapshotRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteSnapshotRequest> {
		@Nullable
		private Time masterTimeout;

		private String repository;

		private String snapshot;

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of snapshot names
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteSnapshotRequest build() {
			_checkSingleUse();

			return new DeleteSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete}".
	 */
	public static final Endpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.delete",

			// Request method
			request -> {
				return "DELETE";

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
					SimpleEndpoint.pathEncode(request.snapshot, buf);
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
					params.put("snapshot", request.snapshot);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteSnapshotResponse._DESERIALIZER);
}
