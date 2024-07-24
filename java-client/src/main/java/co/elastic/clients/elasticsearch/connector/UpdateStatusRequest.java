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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
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

// typedef: connector.update_status.Request

/**
 * Updates the status of the connector
 * 
 * @see <a href="../doc-files/api-spec.html#connector.update_status.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateStatusRequest extends RequestBase implements JsonpSerializable {
	private final String connectorId;

	private final ConnectorStatus status;

	// ---------------------------------------------------------------------------------------------

	private UpdateStatusRequest(Builder builder) {

		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static UpdateStatusRequest of(Function<Builder, ObjectBuilder<UpdateStatusRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the connector to be updated
	 * <p>
	 * API name: {@code connector_id}
	 */
	public final String connectorId() {
		return this.connectorId;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ConnectorStatus status() {
		return this.status;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateStatusRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateStatusRequest> {
		private String connectorId;

		private ConnectorStatus status;

		/**
		 * Required - The unique identifier of the connector to be updated
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(String value) {
			this.connectorId = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ConnectorStatus value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateStatusRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateStatusRequest build() {
			_checkSingleUse();

			return new UpdateStatusRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateStatusRequest}
	 */
	public static final JsonpDeserializer<UpdateStatusRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateStatusRequest::setupUpdateStatusRequestDeserializer);

	protected static void setupUpdateStatusRequestDeserializer(ObjectDeserializer<UpdateStatusRequest.Builder> op) {

		op.add(Builder::status, ConnectorStatus._DESERIALIZER, "status");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.update_status}".
	 */
	public static final Endpoint<UpdateStatusRequest, UpdateStatusResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.update_status",

			// Request method
			request -> {
				return "PUT";

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
					buf.append("/_status");
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
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateStatusResponse._DESERIALIZER);
}
