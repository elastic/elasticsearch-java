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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.delete.Request

public final class DeleteSnapshotRequest extends RequestBase {
	@Nullable
	private final String masterTimeout;

	private final String repository;

	private final String snapshot;

	// ---------------------------------------------------------------------------------------------

	public DeleteSnapshotRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");

	}

	public DeleteSnapshotRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * Required - A comma-separated list of snapshot names
	 * <p>
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteSnapshotRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteSnapshotRequest> {
		@Nullable
		private String masterTimeout;

		private String repository;

		private String snapshot;

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of snapshot names
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteSnapshotRequest build() {

			return new DeleteSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete}".
	 */
	public static final Endpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteSnapshotResponse._DESERIALIZER);
}
