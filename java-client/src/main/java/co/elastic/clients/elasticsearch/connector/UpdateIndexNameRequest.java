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
import jakarta.json.JsonValue;
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

// typedef: connector.update_index_name.Request

/**
 * Updates the index_name in the connector document
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.update_index_name.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateIndexNameRequest extends RequestBase implements JsonpSerializable {
	private final String connectorId;

	private final String indexName;

	private final boolean isExpNullIndexName;

	// ---------------------------------------------------------------------------------------------

	private UpdateIndexNameRequest(Builder builder) {

		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
		this.indexName = builder.indexName;
		this.isExpNullIndexName = builder.isExpNullIndexName;

	}

	public static UpdateIndexNameRequest of(Function<Builder, ObjectBuilder<UpdateIndexNameRequest>> fn) {
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
	 * Required - API name: {@code index_name}
	 */
	public final String indexName() {
		return this.indexName;
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

		if (!isExpNullIndexName) {
			generator.writeKey("index_name");
			generator.write(this.indexName);

		}

		else if (isExpNullIndexName) {
			generator.writeKey("index_name");
			generator.write(JsonValue.NULL);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateIndexNameRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateIndexNameRequest> {
		private String connectorId;

		private String indexName;

		private boolean isExpNullIndexName;

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
		 * Required - API name: {@code index_name}
		 */
		public final Builder indexName(String value) {
			this.indexName = value;
			this.isExpNullIndexName = false;
			return this;
		}

		/**
		 * Required - API name: {@code index_name}
		 */
		public final Builder indexNameWithNull() {
			this.isExpNullIndexName = true;
			this.indexName = null;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateIndexNameRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateIndexNameRequest build() {
			_checkSingleUse();

			return new UpdateIndexNameRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateIndexNameRequest}
	 */
	public static final JsonpDeserializer<UpdateIndexNameRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateIndexNameRequest::setupUpdateIndexNameRequestDeserializer);

	protected static void setupUpdateIndexNameRequestDeserializer(
			ObjectDeserializer<UpdateIndexNameRequest.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.update_index_name}".
	 */
	public static final Endpoint<UpdateIndexNameRequest, UpdateIndexNameResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.update_index_name",

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
					buf.append("/_index_name");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateIndexNameResponse._DESERIALIZER);
}
