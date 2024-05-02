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
import co.elastic.clients.json.JsonData;
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

// typedef: connector.update_configuration.Request

/**
 * Updates the configuration field in the connector document
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.update_configuration.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateConfigurationRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, ConnectorConfigProperties> configuration;

	private final String connectorId;

	private final Map<String, JsonData> values;

	// ---------------------------------------------------------------------------------------------

	private UpdateConfigurationRequest(Builder builder) {

		this.configuration = ApiTypeHelper.unmodifiable(builder.configuration);
		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
		this.values = ApiTypeHelper.unmodifiable(builder.values);

	}

	public static UpdateConfigurationRequest of(Function<Builder, ObjectBuilder<UpdateConfigurationRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code configuration}
	 */
	public final Map<String, ConnectorConfigProperties> configuration() {
		return this.configuration;
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
	 * API name: {@code values}
	 */
	public final Map<String, JsonData> values() {
		return this.values;
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

		if (ApiTypeHelper.isDefined(this.configuration)) {
			generator.writeKey("configuration");
			generator.writeStartObject();
			for (Map.Entry<String, ConnectorConfigProperties> item0 : this.configuration.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.values.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateConfigurationRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateConfigurationRequest> {
		@Nullable
		private Map<String, ConnectorConfigProperties> configuration;

		private String connectorId;

		@Nullable
		private Map<String, JsonData> values;

		/**
		 * API name: {@code configuration}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>configuration</code>.
		 */
		public final Builder configuration(Map<String, ConnectorConfigProperties> map) {
			this.configuration = _mapPutAll(this.configuration, map);
			return this;
		}

		/**
		 * API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code>.
		 */
		public final Builder configuration(String key, ConnectorConfigProperties value) {
			this.configuration = _mapPut(this.configuration, key, value);
			return this;
		}

		/**
		 * API name: {@code configuration}
		 * <p>
		 * Adds an entry to <code>configuration</code> using a builder lambda.
		 */
		public final Builder configuration(String key,
				Function<ConnectorConfigProperties.Builder, ObjectBuilder<ConnectorConfigProperties>> fn) {
			return configuration(key, fn.apply(new ConnectorConfigProperties.Builder()).build());
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

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>values</code>.
		 */
		public final Builder values(Map<String, JsonData> map) {
			this.values = _mapPutAll(this.values, map);
			return this;
		}

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds an entry to <code>values</code>.
		 */
		public final Builder values(String key, JsonData value) {
			this.values = _mapPut(this.values, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateConfigurationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateConfigurationRequest build() {
			_checkSingleUse();

			return new UpdateConfigurationRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateConfigurationRequest}
	 */
	public static final JsonpDeserializer<UpdateConfigurationRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateConfigurationRequest::setupUpdateConfigurationRequestDeserializer);

	protected static void setupUpdateConfigurationRequestDeserializer(
			ObjectDeserializer<UpdateConfigurationRequest.Builder> op) {

		op.add(Builder::configuration, JsonpDeserializer.stringMapDeserializer(ConnectorConfigProperties._DESERIALIZER),
				"configuration");
		op.add(Builder::values, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "values");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.update_configuration}".
	 */
	public static final Endpoint<UpdateConfigurationRequest, UpdateConfigurationResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.update_configuration",

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
					buf.append("/_configuration");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateConfigurationResponse._DESERIALIZER);
}
