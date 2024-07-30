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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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

// typedef: connector.delete.Request

/**
 * Deletes a connector.
 * 
 * @see <a href="../doc-files/api-spec.html#connector.delete.Request">API
 *      specification</a>
 */

public class DeleteConnectorRequest extends RequestBase {
	private final String connectorId;

	@Nullable
	private final Boolean deleteSyncJobs;

	// ---------------------------------------------------------------------------------------------

	private DeleteConnectorRequest(Builder builder) {

		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
		this.deleteSyncJobs = builder.deleteSyncJobs;

	}

	public static DeleteConnectorRequest of(Function<Builder, ObjectBuilder<DeleteConnectorRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the connector to be deleted
	 * <p>
	 * API name: {@code connector_id}
	 */
	public final String connectorId() {
		return this.connectorId;
	}

	/**
	 * A flag indicating if associated sync jobs should be also removed. Defaults to
	 * false.
	 * <p>
	 * API name: {@code delete_sync_jobs}
	 */
	@Nullable
	public final Boolean deleteSyncJobs() {
		return this.deleteSyncJobs;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteConnectorRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteConnectorRequest> {
		private String connectorId;

		@Nullable
		private Boolean deleteSyncJobs;

		/**
		 * Required - The unique identifier of the connector to be deleted
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(String value) {
			this.connectorId = value;
			return this;
		}

		/**
		 * A flag indicating if associated sync jobs should be also removed. Defaults to
		 * false.
		 * <p>
		 * API name: {@code delete_sync_jobs}
		 */
		public final Builder deleteSyncJobs(@Nullable Boolean value) {
			this.deleteSyncJobs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteConnectorRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteConnectorRequest build() {
			_checkSingleUse();

			return new DeleteConnectorRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.delete}".
	 */
	public static final Endpoint<DeleteConnectorRequest, DeleteConnectorResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.delete",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_connector");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.connectorId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					params.put("connectorId", request.connectorId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.deleteSyncJobs != null) {
					params.put("delete_sync_jobs", String.valueOf(request.deleteSyncJobs));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteConnectorResponse._DESERIALIZER);
}
