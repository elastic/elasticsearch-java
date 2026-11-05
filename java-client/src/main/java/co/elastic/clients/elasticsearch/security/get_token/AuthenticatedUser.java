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

package co.elastic.clients.elasticsearch.security.get_token;

import co.elastic.clients.elasticsearch.security.User;
import co.elastic.clients.elasticsearch.security.authenticate.AuthenticateApiKey;
import co.elastic.clients.elasticsearch.security.authenticate.ServiceToken;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: security.get_token.AuthenticatedUser

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_token.AuthenticatedUser">API
 *      specification</a>
 */
@JsonpDeserializable
public class AuthenticatedUser extends User {
	private final UserRealm authenticationRealm;

	private final UserRealm lookupRealm;

	@Nullable
	private final AuthenticationProvider authenticationProvider;

	private final String authenticationType;

	@Nullable
	private final AuthenticateApiKey apiKey;

	@Nullable
	private final ServiceToken token;

	// ---------------------------------------------------------------------------------------------

	private AuthenticatedUser(Builder builder) {
		super(builder);

		this.authenticationRealm = ApiTypeHelper.requireNonNull(builder.authenticationRealm, this,
				"authenticationRealm");
		this.lookupRealm = ApiTypeHelper.requireNonNull(builder.lookupRealm, this, "lookupRealm");
		this.authenticationProvider = builder.authenticationProvider;
		this.authenticationType = ApiTypeHelper.requireNonNull(builder.authenticationType, this, "authenticationType");
		this.apiKey = builder.apiKey;
		this.token = builder.token;

	}

	public static AuthenticatedUser of(Function<Builder, ObjectBuilder<AuthenticatedUser>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code authentication_realm}
	 */
	public final UserRealm authenticationRealm() {
		return this.authenticationRealm;
	}

	/**
	 * Required - API name: {@code lookup_realm}
	 */
	public final UserRealm lookupRealm() {
		return this.lookupRealm;
	}

	/**
	 * API name: {@code authentication_provider}
	 */
	@Nullable
	public final AuthenticationProvider authenticationProvider() {
		return this.authenticationProvider;
	}

	/**
	 * Required - API name: {@code authentication_type}
	 */
	public final String authenticationType() {
		return this.authenticationType;
	}

	/**
	 * Present when the authenticated user is an API key.
	 * <p>
	 * API name: {@code api_key}
	 */
	@Nullable
	public final AuthenticateApiKey apiKey() {
		return this.apiKey;
	}

	/**
	 * Present when the authenticated user is a service account, or authenticated
	 * with a token.
	 * <p>
	 * API name: {@code token}
	 */
	@Nullable
	public final ServiceToken token() {
		return this.token;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("authentication_realm");
		this.authenticationRealm.serialize(generator, mapper);

		generator.writeKey("lookup_realm");
		this.lookupRealm.serialize(generator, mapper);

		if (this.authenticationProvider != null) {
			generator.writeKey("authentication_provider");
			this.authenticationProvider.serialize(generator, mapper);

		}
		generator.writeKey("authentication_type");
		generator.write(this.authenticationType);

		if (this.apiKey != null) {
			generator.writeKey("api_key");
			this.apiKey.serialize(generator, mapper);

		}
		if (this.token != null) {
			generator.writeKey("token");
			this.token.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AuthenticatedUser}.
	 */

	public static class Builder extends User.AbstractBuilder<Builder> implements ObjectBuilder<AuthenticatedUser> {
		private UserRealm authenticationRealm;

		private UserRealm lookupRealm;

		@Nullable
		private AuthenticationProvider authenticationProvider;

		private String authenticationType;

		@Nullable
		private AuthenticateApiKey apiKey;

		@Nullable
		private ServiceToken token;

		public Builder() {
		}
		private Builder(AuthenticatedUser instance) {
			super(instance);
			this.authenticationRealm = instance.authenticationRealm;
			this.lookupRealm = instance.lookupRealm;
			this.authenticationProvider = instance.authenticationProvider;
			this.authenticationType = instance.authenticationType;
			this.apiKey = instance.apiKey;
			this.token = instance.token;

		}
		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(UserRealm value) {
			this.authenticationRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(Function<UserRealm.Builder, ObjectBuilder<UserRealm>> fn) {
			return this.authenticationRealm(fn.apply(new UserRealm.Builder()).build());
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(UserRealm value) {
			this.lookupRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(Function<UserRealm.Builder, ObjectBuilder<UserRealm>> fn) {
			return this.lookupRealm(fn.apply(new UserRealm.Builder()).build());
		}

		/**
		 * API name: {@code authentication_provider}
		 */
		public final Builder authenticationProvider(@Nullable AuthenticationProvider value) {
			this.authenticationProvider = value;
			return this;
		}

		/**
		 * API name: {@code authentication_provider}
		 */
		public final Builder authenticationProvider(
				Function<AuthenticationProvider.Builder, ObjectBuilder<AuthenticationProvider>> fn) {
			return this.authenticationProvider(fn.apply(new AuthenticationProvider.Builder()).build());
		}

		/**
		 * Required - API name: {@code authentication_type}
		 */
		public final Builder authenticationType(String value) {
			this.authenticationType = value;
			return this;
		}

		/**
		 * Present when the authenticated user is an API key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(@Nullable AuthenticateApiKey value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Present when the authenticated user is an API key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(Function<AuthenticateApiKey.Builder, ObjectBuilder<AuthenticateApiKey>> fn) {
			return this.apiKey(fn.apply(new AuthenticateApiKey.Builder()).build());
		}

		/**
		 * Present when the authenticated user is a service account, or authenticated
		 * with a token.
		 * <p>
		 * API name: {@code token}
		 */
		public final Builder token(@Nullable ServiceToken value) {
			this.token = value;
			return this;
		}

		/**
		 * Present when the authenticated user is a service account, or authenticated
		 * with a token.
		 * <p>
		 * API name: {@code token}
		 */
		public final Builder token(Function<ServiceToken.Builder, ObjectBuilder<ServiceToken>> fn) {
			return this.token(fn.apply(new ServiceToken.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AuthenticatedUser}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AuthenticatedUser build() {
			_checkSingleUse();

			return new AuthenticatedUser(this);
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
	 * Json deserializer for {@link AuthenticatedUser}
	 */
	public static final JsonpDeserializer<AuthenticatedUser> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AuthenticatedUser::setupAuthenticatedUserDeserializer);

	protected static void setupAuthenticatedUserDeserializer(ObjectDeserializer<AuthenticatedUser.Builder> op) {
		User.setupUserDeserializer(op);
		op.add(Builder::authenticationRealm, UserRealm._DESERIALIZER, "authentication_realm");
		op.add(Builder::lookupRealm, UserRealm._DESERIALIZER, "lookup_realm");
		op.add(Builder::authenticationProvider, AuthenticationProvider._DESERIALIZER, "authentication_provider");
		op.add(Builder::authenticationType, JsonpDeserializer.stringDeserializer(), "authentication_type");
		op.add(Builder::apiKey, AuthenticateApiKey._DESERIALIZER, "api_key");
		op.add(Builder::token, ServiceToken._DESERIALIZER, "token");

	}

}
