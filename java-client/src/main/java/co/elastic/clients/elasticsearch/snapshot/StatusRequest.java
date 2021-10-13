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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
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

// typedef: snapshot.status.Request

public final class StatusRequest extends RequestBase {
	@Nullable
	private final String repository;

	@Nullable
	private final List<String> snapshot;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final String masterTimeout;

	// ---------------------------------------------------------------------------------------------

	public StatusRequest(Builder builder) {

		this.repository = builder.repository;
		this.snapshot = ModelTypeHelper.unmodifiable(builder.snapshot);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;

	}

	public StatusRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * A comma-separated list of snapshot names
	 * <p>
	 * API name: {@code snapshot}
	 */
	@Nullable
	public List<String> snapshot() {
		return this.snapshot;
	}

	/**
	 * Whether to ignore unavailable snapshots, defaults to false which means a
	 * SnapshotMissingException is thrown
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatusRequest}.
	 */
	public static class Builder implements ObjectBuilder<StatusRequest> {
		@Nullable
		private String repository;

		@Nullable
		private List<String> snapshot;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private String masterTimeout;

		/**
		 * A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * A comma-separated list of snapshot names
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(@Nullable List<String> value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * A comma-separated list of snapshot names
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String... value) {
			this.snapshot = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #snapshot(List)}, creating the list if needed.
		 */
		public Builder addSnapshot(String value) {
			if (this.snapshot == null) {
				this.snapshot = new ArrayList<>();
			}
			this.snapshot.add(value);
			return this;
		}

		/**
		 * Whether to ignore unavailable snapshots, defaults to false which means a
		 * SnapshotMissingException is thrown
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

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
		 * Builds a {@link StatusRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatusRequest build() {

			return new StatusRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.status}".
	 */
	public static final Endpoint<StatusRequest, StatusResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.snapshot() != null)
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StatusResponse._DESERIALIZER);
}
