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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.clone.Request
@JsonpDeserializable
public class CloneSnapshotRequest extends RequestBase implements JsonpSerializable {
	private final String indices;

	@Nullable
	private final String masterTimeout;

	private final String repository;

	private final String snapshot;

	private final String targetSnapshot;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private CloneSnapshotRequest(Builder builder) {

		this.indices = ModelTypeHelper.requireNonNull(builder.indices, this, "indices");
		this.masterTimeout = builder.masterTimeout;
		this.repository = ModelTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ModelTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.targetSnapshot = ModelTypeHelper.requireNonNull(builder.targetSnapshot, this, "targetSnapshot");
		this.timeout = builder.timeout;

	}

	public static CloneSnapshotRequest of(Function<Builder, ObjectBuilder<CloneSnapshotRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final String indices() {
		return this.indices;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
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
	 * Required - The name of the snapshot to clone from
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * Required - The name of the cloned snapshot to create
	 * <p>
	 * API name: {@code target_snapshot}
	 */
	public final String targetSnapshot() {
		return this.targetSnapshot;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("indices");
		generator.write(this.indices);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloneSnapshotRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CloneSnapshotRequest> {
		private String indices;

		@Nullable
		private String masterTimeout;

		private String repository;

		private String snapshot;

		private String targetSnapshot;

		@Nullable
		private String timeout;

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String value) {
			this.indices = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
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
		 * Required - The name of the snapshot to clone from
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Required - The name of the cloned snapshot to create
		 * <p>
		 * API name: {@code target_snapshot}
		 */
		public final Builder targetSnapshot(String value) {
			this.targetSnapshot = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link CloneSnapshotRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloneSnapshotRequest build() {
			_checkSingleUse();

			return new CloneSnapshotRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloneSnapshotRequest}
	 */
	public static final JsonpDeserializer<CloneSnapshotRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CloneSnapshotRequest::setupCloneSnapshotRequestDeserializer, Builder::build);

	protected static void setupCloneSnapshotRequestDeserializer(
			DelegatingDeserializer<CloneSnapshotRequest.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringDeserializer(), "indices");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.clone}".
	 */
	public static final Endpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _targetSnapshot = 1 << 0;
				final int _repository = 1 << 1;
				final int _snapshot = 1 << 2;

				int propsSet = 0;

				propsSet |= _targetSnapshot;
				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot | _targetSnapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot, buf);
					buf.append("/_clone");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.targetSnapshot, buf);
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
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CloneSnapshotResponse._DESERIALIZER);
}
