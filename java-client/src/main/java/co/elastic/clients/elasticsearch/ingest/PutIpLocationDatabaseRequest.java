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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
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
import jakarta.json.stream.JsonParser;
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

// typedef: ingest.put_ip_location_database.Request

/**
 * Create or update an IP geolocation database configuration.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest.put_ip_location_database.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutIpLocationDatabaseRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	private final DatabaseConfiguration configuration;

	// ---------------------------------------------------------------------------------------------

	private PutIpLocationDatabaseRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.configuration = ApiTypeHelper.requireNonNull(builder.configuration, this, "configuration");

	}

	public static PutIpLocationDatabaseRequest of(Function<Builder, ObjectBuilder<PutIpLocationDatabaseRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The database configuration identifier.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * A value of <code>-1</code> indicates that the request should never time out.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The period to wait for a response from all relevant nodes in the cluster
	 * after updating the cluster metadata. If no response is received before the
	 * timeout expires, the cluster metadata update still applies but the response
	 * indicates that it was not completely acknowledged. A value of <code>-1</code>
	 * indicates that the request should never time out.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Request body.
	 */
	public final DatabaseConfiguration configuration() {
		return this.configuration;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.configuration.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutIpLocationDatabaseRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutIpLocationDatabaseRequest> {
		private String id;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		private DatabaseConfiguration configuration;

		/**
		 * Required - The database configuration identifier.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * A value of <code>-1</code> indicates that the request should never time out.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * A value of <code>-1</code> indicates that the request should never time out.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * indicates that it was not completely acknowledged. A value of <code>-1</code>
		 * indicates that the request should never time out.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * indicates that it was not completely acknowledged. A value of <code>-1</code>
		 * indicates that the request should never time out.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Request body.
		 */
		public final Builder configuration(DatabaseConfiguration value) {
			this.configuration = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder configuration(
				Function<DatabaseConfiguration.Builder, ObjectBuilder<DatabaseConfiguration>> fn) {
			return this.configuration(fn.apply(new DatabaseConfiguration.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			DatabaseConfiguration value = (DatabaseConfiguration) DatabaseConfiguration._DESERIALIZER
					.deserialize(parser, mapper);
			return this.configuration(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutIpLocationDatabaseRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutIpLocationDatabaseRequest build() {
			_checkSingleUse();

			return new PutIpLocationDatabaseRequest(this);
		}
	}

	public static final JsonpDeserializer<PutIpLocationDatabaseRequest> _DESERIALIZER = createPutIpLocationDatabaseRequestDeserializer();
	protected static JsonpDeserializer<PutIpLocationDatabaseRequest> createPutIpLocationDatabaseRequestDeserializer() {

		JsonpDeserializer<DatabaseConfiguration> valueDeserializer = DatabaseConfiguration._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.configuration(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.put_ip_location_database}".
	 */
	public static final Endpoint<PutIpLocationDatabaseRequest, PutIpLocationDatabaseResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.put_ip_location_database",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/ip_location");
					buf.append("/database");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutIpLocationDatabaseResponse._DESERIALIZER);
}
