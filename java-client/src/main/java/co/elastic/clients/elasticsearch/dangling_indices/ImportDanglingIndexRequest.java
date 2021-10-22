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

package co.elastic.clients.elasticsearch.dangling_indices;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: dangling_indices.import_dangling_index.Request

public final class ImportDanglingIndexRequest extends RequestBase {
	private final boolean acceptDataLoss;

	private final String indexUuid;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public ImportDanglingIndexRequest(Builder builder) {

		this.acceptDataLoss = Objects.requireNonNull(builder.acceptDataLoss, "accept_data_loss");
		this.indexUuid = Objects.requireNonNull(builder.indexUuid, "index_uuid");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public ImportDanglingIndexRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Must be set to true in order to import the dangling index
	 * <p>
	 * API name: {@code accept_data_loss}
	 */
	public boolean acceptDataLoss() {
		return this.acceptDataLoss;
	}

	/**
	 * Required - The UUID of the dangling index
	 * <p>
	 * API name: {@code index_uuid}
	 */
	public String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ImportDanglingIndexRequest}.
	 */
	public static class Builder implements ObjectBuilder<ImportDanglingIndexRequest> {
		private Boolean acceptDataLoss;

		private String indexUuid;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		/**
		 * Required - Must be set to true in order to import the dangling index
		 * <p>
		 * API name: {@code accept_data_loss}
		 */
		public Builder acceptDataLoss(boolean value) {
			this.acceptDataLoss = value;
			return this;
		}

		/**
		 * Required - The UUID of the dangling index
		 * <p>
		 * API name: {@code index_uuid}
		 */
		public Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link ImportDanglingIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ImportDanglingIndexRequest build() {

			return new ImportDanglingIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code dangling_indices.import_dangling_index}".
	 */
	public static final Endpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _indexUuid = 1 << 0;

				int propsSet = 0;

				propsSet |= _indexUuid;

				if (propsSet == (_indexUuid)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_dangling");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.indexUuid, buf);
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
				params.put("accept_data_loss", String.valueOf(request.acceptDataLoss));
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ImportDanglingIndexResponse._DESERIALIZER);
}
