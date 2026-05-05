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

package co.elastic.clients.elasticsearch.security;

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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: security.update_settings.Request

/**
 * Update security index settings.
 * <p>
 * Update the user-configurable settings for the security internal index
 * (<code>.security</code> and associated indices). Only a subset of settings
 * are allowed to be modified. This includes
 * <code>index.auto_expand_replicas</code> and
 * <code>index.number_of_replicas</code>.
 * <p>
 * NOTE: If <code>index.auto_expand_replicas</code> is set,
 * <code>index.number_of_replicas</code> will be ignored during updates.
 * <p>
 * If a specific index is not in use on the system and settings are provided for
 * it, the request will be rejected. This API does not yet support configuring
 * the settings for indices before they are in use.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.update_settings.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final SecuritySettings security;

	@Nullable
	private final SecuritySettings securityProfile;

	@Nullable
	private final SecuritySettings securityTokens;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private UpdateSettingsRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.security = builder.security;
		this.securityProfile = builder.securityProfile;
		this.securityTokens = builder.securityTokens;
		this.timeout = builder.timeout;

	}

	public static UpdateSettingsRequest of(Function<Builder, ObjectBuilder<UpdateSettingsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Settings for the index used for most security configuration, including native
	 * realm users and roles configured with the API.
	 * <p>
	 * API name: {@code security}
	 */
	@Nullable
	public final SecuritySettings security() {
		return this.security;
	}

	/**
	 * Settings for the index used to store profile information.
	 * <p>
	 * API name: {@code security-profile}
	 */
	@Nullable
	public final SecuritySettings securityProfile() {
		return this.securityProfile;
	}

	/**
	 * Settings for the index used to store tokens.
	 * <p>
	 * API name: {@code security-tokens}
	 */
	@Nullable
	public final SecuritySettings securityTokens() {
		return this.securityTokens;
	}

	/**
	 * The period to wait for a response. If no response is received before the
	 * timeout expires, the request fails and returns an error.
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

		if (this.security != null) {
			generator.writeKey("security");
			this.security.serialize(generator, mapper);

		}
		if (this.securityProfile != null) {
			generator.writeKey("security-profile");
			this.securityProfile.serialize(generator, mapper);

		}
		if (this.securityTokens != null) {
			generator.writeKey("security-tokens");
			this.securityTokens.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateSettingsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateSettingsRequest> {
		@Nullable
		private Time masterTimeout;

		@Nullable
		private SecuritySettings security;

		@Nullable
		private SecuritySettings securityProfile;

		@Nullable
		private SecuritySettings securityTokens;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(UpdateSettingsRequest instance) {
			this.masterTimeout = instance.masterTimeout;
			this.security = instance.security;
			this.securityProfile = instance.securityProfile;
			this.securityTokens = instance.securityTokens;
			this.timeout = instance.timeout;

		}
		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
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
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Settings for the index used for most security configuration, including native
		 * realm users and roles configured with the API.
		 * <p>
		 * API name: {@code security}
		 */
		public final Builder security(@Nullable SecuritySettings value) {
			this.security = value;
			return this;
		}

		/**
		 * Settings for the index used for most security configuration, including native
		 * realm users and roles configured with the API.
		 * <p>
		 * API name: {@code security}
		 */
		public final Builder security(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.security(fn.apply(new SecuritySettings.Builder()).build());
		}

		/**
		 * Settings for the index used to store profile information.
		 * <p>
		 * API name: {@code security-profile}
		 */
		public final Builder securityProfile(@Nullable SecuritySettings value) {
			this.securityProfile = value;
			return this;
		}

		/**
		 * Settings for the index used to store profile information.
		 * <p>
		 * API name: {@code security-profile}
		 */
		public final Builder securityProfile(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.securityProfile(fn.apply(new SecuritySettings.Builder()).build());
		}

		/**
		 * Settings for the index used to store tokens.
		 * <p>
		 * API name: {@code security-tokens}
		 */
		public final Builder securityTokens(@Nullable SecuritySettings value) {
			this.securityTokens = value;
			return this;
		}

		/**
		 * Settings for the index used to store tokens.
		 * <p>
		 * API name: {@code security-tokens}
		 */
		public final Builder securityTokens(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.securityTokens(fn.apply(new SecuritySettings.Builder()).build());
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
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
		 * Builds a {@link UpdateSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateSettingsRequest build() {
			_checkSingleUse();

			return new UpdateSettingsRequest(this);
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
	 * Json deserializer for {@link UpdateSettingsRequest}
	 */
	public static final JsonpDeserializer<UpdateSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateSettingsRequest::setupUpdateSettingsRequestDeserializer);

	protected static void setupUpdateSettingsRequestDeserializer(ObjectDeserializer<UpdateSettingsRequest.Builder> op) {

		op.add(Builder::security, SecuritySettings._DESERIALIZER, "security");
		op.add(Builder::securityProfile, SecuritySettings._DESERIALIZER, "security-profile");
		op.add(Builder::securityTokens, SecuritySettings._DESERIALIZER, "security-tokens");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.update_settings}".
	 */
	public static final Endpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.update_settings",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_security/settings";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
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

			}, SimpleEndpoint.emptyMap(), true, UpdateSettingsResponse._DESERIALIZER);
}
