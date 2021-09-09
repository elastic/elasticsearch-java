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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: snapshot.delete_repository.Request
public final class DeleteRepositoryRequest extends RequestBase {
	private final List<String> repository;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected DeleteRepositoryRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	/**
	 * Name of the snapshot repository to unregister. Wildcard (<code>*</code>)
	 * patterns are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public List<String> repository() {
		return this.repository;
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
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRepositoryRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteRepositoryRequest> {
		private List<String> repository;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		/**
		 * Name of the snapshot repository to unregister. Wildcard (<code>*</code>)
		 * patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(List<String> value) {
			this.repository = value;
			return this;
		}

		/**
		 * Name of the snapshot repository to unregister. Wildcard (<code>*</code>)
		 * patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String... value) {
			this.repository = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #repository(List)}, creating the list if needed.
		 */
		public Builder addRepository(String value) {
			if (this.repository == null) {
				this.repository = new ArrayList<>();
			}
			this.repository.add(value);
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
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteRepositoryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRepositoryRequest build() {

			return new DeleteRepositoryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete_repository}".
	 */
	public static final Endpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;

				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository.stream().map(v -> v).collect(Collectors.joining(",")));
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

			}, Endpoint.Simple.emptyMap(), false, DeleteRepositoryResponse.DESERIALIZER);
}
