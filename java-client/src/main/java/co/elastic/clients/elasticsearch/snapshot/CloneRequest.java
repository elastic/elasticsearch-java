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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot.clone.Request
public final class CloneRequest extends RequestBase implements ToJsonp {
	private final String repository;

	private final String snapshot;

	private final String targetSnapshot;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	private final String indices;

	// ---------------------------------------------------------------------------------------------

	protected CloneRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.targetSnapshot = Objects.requireNonNull(builder.targetSnapshot, "target_snapshot");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.indices = Objects.requireNonNull(builder.indices, "indices");

	}

	/**
	 * A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * The name of the snapshot to clone from
	 * <p>
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * The name of the cloned snapshot to create
	 * <p>
	 * API name: {@code target_snapshot}
	 */
	public String targetSnapshot() {
		return this.targetSnapshot;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code indices}
	 */
	public String indices() {
		return this.indices;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("indices");
		generator.write(this.indices);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloneRequest}.
	 */
	public static class Builder implements ObjectBuilder<CloneRequest> {
		private String repository;

		private String snapshot;

		private String targetSnapshot;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		private String indices;

		/**
		 * A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * The name of the snapshot to clone from
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * The name of the cloned snapshot to create
		 * <p>
		 * API name: {@code target_snapshot}
		 */
		public Builder targetSnapshot(String value) {
			this.targetSnapshot = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String value) {
			this.indices = value;
			return this;
		}

		/**
		 * Builds a {@link CloneRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloneRequest build() {

			return new CloneRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CloneRequest
	 */
	public static final JsonpDeserializer<CloneRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CloneRequest::setupCloneRequestDeserializer);

	protected static void setupCloneRequestDeserializer(DelegatingDeserializer<CloneRequest.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringDeserializer(), "indices");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.clone}".
	 */
	public static final Endpoint<CloneRequest, CloneResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;
				final int _targetSnapshot = 1 << 2;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (request.snapshot() != null)
					propsSet |= _snapshot;
				if (request.targetSnapshot() != null)
					propsSet |= _targetSnapshot;

				if (propsSet == (_repository | _snapshot | _targetSnapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/");
					buf.append(request.snapshot);
					buf.append("/_clone");
					buf.append("/");
					buf.append(request.targetSnapshot);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, CloneResponse.DESERIALIZER);
}
