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

package co.elastic.clients.elasticsearch.security;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.activate_user_profile.Request

/**
 * Creates or updates a user profile on behalf of another user.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.activate_user_profile.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ActivateUserProfileRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String accessToken;

	private final GrantType grantType;

	@Nullable
	private final String password;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private ActivateUserProfileRequest(Builder builder) {

		this.accessToken = builder.accessToken;
		this.grantType = ApiTypeHelper.requireNonNull(builder.grantType, this, "grantType");
		this.password = builder.password;
		this.username = builder.username;

	}

	public static ActivateUserProfileRequest of(Function<Builder, ObjectBuilder<ActivateUserProfileRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code access_token}
	 */
	@Nullable
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - API name: {@code grant_type}
	 */
	public final GrantType grantType() {
		return this.grantType;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
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

		if (this.accessToken != null) {
			generator.writeKey("access_token");
			generator.write(this.accessToken);

		}
		generator.writeKey("grant_type");
		this.grantType.serialize(generator, mapper);
		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.username != null) {
			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActivateUserProfileRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ActivateUserProfileRequest> {
		@Nullable
		private String accessToken;

		private GrantType grantType;

		@Nullable
		private String password;

		@Nullable
		private String username;

		/**
		 * API name: {@code access_token}
		 */
		public final Builder accessToken(@Nullable String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code grant_type}
		 */
		public final Builder grantType(GrantType value) {
			this.grantType = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ActivateUserProfileRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActivateUserProfileRequest build() {
			_checkSingleUse();

			return new ActivateUserProfileRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ActivateUserProfileRequest}
	 */
	public static final JsonpDeserializer<ActivateUserProfileRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ActivateUserProfileRequest::setupActivateUserProfileRequestDeserializer);

	protected static void setupActivateUserProfileRequestDeserializer(
			ObjectDeserializer<ActivateUserProfileRequest.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::grantType, GrantType._DESERIALIZER, "grant_type");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.activate_user_profile}".
	 */
	public static final Endpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.activate_user_profile",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/profile/_activate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ActivateUserProfileResponse._DESERIALIZER);
}
