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

package co.elastic.clients.elasticsearch.dangling_indices;

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

// typedef: dangling_indices.delete_dangling_index.Request

/**
 * Delete a dangling index.
 * <p>
 * If Elasticsearch encounters index data that is absent from the current
 * cluster state, those indices are considered to be dangling. For example, this
 * can happen if you delete more than
 * <code>cluster.indices.tombstones.size</code> indices while an Elasticsearch
 * node is offline.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#dangling_indices.delete_dangling_index.Request">API
 *      specification</a>
 */

public class DeleteDanglingIndexRequest extends RequestBase {
	@Nullable
	private final Boolean acceptDataLoss;

	private final String indexUuid;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private DeleteDanglingIndexRequest(Builder builder) {

		this.acceptDataLoss = builder.acceptDataLoss;
		this.indexUuid = ApiTypeHelper.requireNonNull(builder.indexUuid, this, "indexUuid");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static DeleteDanglingIndexRequest of(Function<Builder, ObjectBuilder<DeleteDanglingIndexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * This parameter must be set to true to acknowledge that it will no longer be
	 * possible to recove data from the dangling index.
	 * <p>
	 * API name: {@code accept_data_loss}
	 */
	@Nullable
	public final Boolean acceptDataLoss() {
		return this.acceptDataLoss;
	}

	/**
	 * Required - The UUID of the index to delete. Use the get dangling indices API
	 * to find the UUID.
	 * <p>
	 * API name: {@code index_uuid}
	 */
	public final String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * The period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The period to wait for a response.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteDanglingIndexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteDanglingIndexRequest> {
		@Nullable
		private Boolean acceptDataLoss;

		private String indexUuid;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(DeleteDanglingIndexRequest instance) {
			this.acceptDataLoss = instance.acceptDataLoss;
			this.indexUuid = instance.indexUuid;
			this.masterTimeout = instance.masterTimeout;
			this.timeout = instance.timeout;

		}
		/**
		 * This parameter must be set to true to acknowledge that it will no longer be
		 * possible to recove data from the dangling index.
		 * <p>
		 * API name: {@code accept_data_loss}
		 */
		public final Builder acceptDataLoss(@Nullable Boolean value) {
			this.acceptDataLoss = value;
			return this;
		}

		/**
		 * Required - The UUID of the index to delete. Use the get dangling indices API
		 * to find the UUID.
		 * <p>
		 * API name: {@code index_uuid}
		 */
		public final Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The period to wait for a response.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteDanglingIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteDanglingIndexRequest build() {
			_checkSingleUse();

			return new DeleteDanglingIndexRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code dangling_indices.delete_dangling_index}".
	 */
	public static final Endpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/dangling_indices.delete_dangling_index",

			// Request method
			request -> {
				return "DELETE";

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _indexUuid = 1 << 0;

				int propsSet = 0;

				propsSet |= _indexUuid;

				if (propsSet == (_indexUuid)) {
					params.put("indexUuid", request.indexUuid);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.acceptDataLoss != null) {
					params.put("accept_data_loss", String.valueOf(request.acceptDataLoss));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteDanglingIndexResponse._DESERIALIZER);
}
