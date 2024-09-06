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

// typedef: ingest.put_geoip_database.Request

/**
 * Returns information about one or more geoip database configurations.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest.put_geoip_database.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutGeoipDatabaseRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Time masterTimeout;

	private final Maxmind maxmind;

	private final String name;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutGeoipDatabaseRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.maxmind = ApiTypeHelper.requireNonNull(builder.maxmind, this, "maxmind");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.timeout = builder.timeout;

	}

	public static PutGeoipDatabaseRequest of(Function<Builder, ObjectBuilder<PutGeoipDatabaseRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - ID of the database configuration to create or update.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The configuration necessary to identify which IP geolocation
	 * provider to use to download the database, as well as any provider-specific
	 * configuration necessary for such downloading. At present, the only supported
	 * provider is maxmind, and the maxmind provider requires that an account_id
	 * (string) is configured.
	 * <p>
	 * API name: {@code maxmind}
	 */
	public final Maxmind maxmind() {
		return this.maxmind;
	}

	/**
	 * Required - The provider-assigned name of the IP geolocation database to
	 * download.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		generator.writeKey("maxmind");
		this.maxmind.serialize(generator, mapper);

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutGeoipDatabaseRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutGeoipDatabaseRequest> {
		private String id;

		@Nullable
		private Time masterTimeout;

		private Maxmind maxmind;

		private String name;

		@Nullable
		private Time timeout;

		/**
		 * Required - ID of the database configuration to create or update.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The configuration necessary to identify which IP geolocation
		 * provider to use to download the database, as well as any provider-specific
		 * configuration necessary for such downloading. At present, the only supported
		 * provider is maxmind, and the maxmind provider requires that an account_id
		 * (string) is configured.
		 * <p>
		 * API name: {@code maxmind}
		 */
		public final Builder maxmind(Maxmind value) {
			this.maxmind = value;
			return this;
		}

		/**
		 * Required - The configuration necessary to identify which IP geolocation
		 * provider to use to download the database, as well as any provider-specific
		 * configuration necessary for such downloading. At present, the only supported
		 * provider is maxmind, and the maxmind provider requires that an account_id
		 * (string) is configured.
		 * <p>
		 * API name: {@code maxmind}
		 */
		public final Builder maxmind(Function<Maxmind.Builder, ObjectBuilder<Maxmind>> fn) {
			return this.maxmind(fn.apply(new Maxmind.Builder()).build());
		}

		/**
		 * Required - The provider-assigned name of the IP geolocation database to
		 * download.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
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
		 * Builds a {@link PutGeoipDatabaseRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutGeoipDatabaseRequest build() {
			_checkSingleUse();

			return new PutGeoipDatabaseRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutGeoipDatabaseRequest}
	 */
	public static final JsonpDeserializer<PutGeoipDatabaseRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutGeoipDatabaseRequest::setupPutGeoipDatabaseRequestDeserializer);

	protected static void setupPutGeoipDatabaseRequestDeserializer(
			ObjectDeserializer<PutGeoipDatabaseRequest.Builder> op) {

		op.add(Builder::maxmind, Maxmind._DESERIALIZER, "maxmind");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.put_geoip_database}".
	 */
	public static final Endpoint<PutGeoipDatabaseRequest, PutGeoipDatabaseResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.put_geoip_database",

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
					buf.append("/geoip");
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

			}, SimpleEndpoint.emptyMap(), true, PutGeoipDatabaseResponse._DESERIALIZER);
}
