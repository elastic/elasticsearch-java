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

// typedef: connector.update_api_key_id.Request

/**
 * Updates the API key id in the connector document
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.update_api_key_id.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateApiKeyIdRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String apiKeyId;

	@Nullable
	private final String apiKeySecretId;

	private final String connectorId;

	// ---------------------------------------------------------------------------------------------

	private UpdateApiKeyIdRequest(Builder builder) {

		this.apiKeyId = builder.apiKeyId;
		this.apiKeySecretId = builder.apiKeySecretId;
		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");

	}

	public static UpdateApiKeyIdRequest of(Function<Builder, ObjectBuilder<UpdateApiKeyIdRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code api_key_id}
	 */
	@Nullable
	public final String apiKeyId() {
		return this.apiKeyId;
	}

	/**
	 * API name: {@code api_key_secret_id}
	 */
	@Nullable
	public final String apiKeySecretId() {
		return this.apiKeySecretId;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.apiKeyId != null) {
			generator.writeKey("api_key_id");
			generator.write(this.apiKeyId);

		}
		if (this.apiKeySecretId != null) {
			generator.writeKey("api_key_secret_id");
			generator.write(this.apiKeySecretId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateApiKeyIdRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateApiKeyIdRequest> {
		@Nullable
		private String apiKeyId;

		@Nullable
		private String apiKeySecretId;

		private String connectorId;

		/**
		 * API name: {@code api_key_id}
		 */
		public final Builder apiKeyId(@Nullable String value) {
			this.apiKeyId = value;
			return this;
		}

		/**
		 * API name: {@code api_key_secret_id}
		 */
		public final Builder apiKeySecretId(@Nullable String value) {
			this.apiKeySecretId = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the connector to be updated
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(String value) {
			this.connectorId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateApiKeyIdRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateApiKeyIdRequest build() {
			_checkSingleUse();

			return new UpdateApiKeyIdRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateApiKeyIdRequest}
	 */
	public static final JsonpDeserializer<UpdateApiKeyIdRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateApiKeyIdRequest::setupUpdateApiKeyIdRequestDeserializer);

	protected static void setupUpdateApiKeyIdRequestDeserializer(ObjectDeserializer<UpdateApiKeyIdRequest.Builder> op) {

		op.add(Builder::apiKeyId, JsonpDeserializer.stringDeserializer(), "api_key_id");
		op.add(Builder::apiKeySecretId, JsonpDeserializer.stringDeserializer(), "api_key_secret_id");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.update_api_key_id}".
	 */
	public static final Endpoint<UpdateApiKeyIdRequest, UpdateApiKeyIdResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.update_api_key_id",

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
					buf.append("/_api_key_id");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateApiKeyIdResponse._DESERIALIZER);
}
