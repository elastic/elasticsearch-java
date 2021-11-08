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

import co.elastic.clients.elasticsearch.security.get_token.AuthenticatedUser;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_token.Response
@JsonpDeserializable
public class GetTokenResponse implements JsonpSerializable {
	private final String accessToken;

	private final long expiresIn;

	@Nullable
	private final String scope;

	private final String type;

	private final String refreshToken;

	@Nullable
	private final String kerberosAuthenticationResponseToken;

	private final AuthenticatedUser authentication;

	// ---------------------------------------------------------------------------------------------

	private GetTokenResponse(Builder builder) {

		this.accessToken = ModelTypeHelper.requireNonNull(builder.accessToken, this, "accessToken");
		this.expiresIn = ModelTypeHelper.requireNonNull(builder.expiresIn, this, "expiresIn");
		this.scope = builder.scope;
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.refreshToken = ModelTypeHelper.requireNonNull(builder.refreshToken, this, "refreshToken");
		this.kerberosAuthenticationResponseToken = builder.kerberosAuthenticationResponseToken;
		this.authentication = ModelTypeHelper.requireNonNull(builder.authentication, this, "authentication");

	}

	public static GetTokenResponse of(Function<Builder, ObjectBuilder<GetTokenResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code access_token}
	 */
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - API name: {@code expires_in}
	 */
	public final long expiresIn() {
		return this.expiresIn;
	}

	/**
	 * API name: {@code scope}
	 */
	@Nullable
	public final String scope() {
		return this.scope;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code refresh_token}
	 */
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * API name: {@code kerberos_authentication_response_token}
	 */
	@Nullable
	public final String kerberosAuthenticationResponseToken() {
		return this.kerberosAuthenticationResponseToken;
	}

	/**
	 * Required - API name: {@code authentication}
	 */
	public final AuthenticatedUser authentication() {
		return this.authentication;
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

		generator.writeKey("access_token");
		generator.write(this.accessToken);

		generator.writeKey("expires_in");
		generator.write(this.expiresIn);

		if (this.scope != null) {
			generator.writeKey("scope");
			generator.write(this.scope);

		}
		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("refresh_token");
		generator.write(this.refreshToken);

		if (this.kerberosAuthenticationResponseToken != null) {
			generator.writeKey("kerberos_authentication_response_token");
			generator.write(this.kerberosAuthenticationResponseToken);

		}
		generator.writeKey("authentication");
		this.authentication.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTokenResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetTokenResponse> {
		private String accessToken;

		private Long expiresIn;

		@Nullable
		private String scope;

		private String type;

		private String refreshToken;

		@Nullable
		private String kerberosAuthenticationResponseToken;

		private AuthenticatedUser authentication;

		/**
		 * Required - API name: {@code access_token}
		 */
		public final Builder accessToken(String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code expires_in}
		 */
		public final Builder expiresIn(long value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * API name: {@code scope}
		 */
		public final Builder scope(@Nullable String value) {
			this.scope = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code refresh_token}
		 */
		public final Builder refreshToken(String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * API name: {@code kerberos_authentication_response_token}
		 */
		public final Builder kerberosAuthenticationResponseToken(@Nullable String value) {
			this.kerberosAuthenticationResponseToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication}
		 */
		public final Builder authentication(AuthenticatedUser value) {
			this.authentication = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication}
		 */
		public final Builder authentication(Function<AuthenticatedUser.Builder, ObjectBuilder<AuthenticatedUser>> fn) {
			return this.authentication(fn.apply(new AuthenticatedUser.Builder()).build());
		}

		/**
		 * Builds a {@link GetTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTokenResponse build() {
			_checkSingleUse();

			return new GetTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTokenResponse}
	 */
	public static final JsonpDeserializer<GetTokenResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetTokenResponse::setupGetTokenResponseDeserializer, Builder::build);

	protected static void setupGetTokenResponseDeserializer(DelegatingDeserializer<GetTokenResponse.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::expiresIn, JsonpDeserializer.longDeserializer(), "expires_in");
		op.add(Builder::scope, JsonpDeserializer.stringDeserializer(), "scope");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::kerberosAuthenticationResponseToken, JsonpDeserializer.stringDeserializer(),
				"kerberos_authentication_response_token");
		op.add(Builder::authentication, AuthenticatedUser._DESERIALIZER, "authentication");

	}

}
