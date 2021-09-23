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

package co.elastic.clients.elasticsearch.security.get_token;

import co.elastic.clients.elasticsearch.security.User;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_token.AuthenticatedUser
public final class AuthenticatedUser extends User {
	private final UserRealm authenticationRealm;

	private final UserRealm lookupRealm;

	@Nullable
	private final AuthenticationProvider authenticationProvider;

	private final String authenticationType;

	// ---------------------------------------------------------------------------------------------

	public AuthenticatedUser(Builder builder) {
		super(builder);

		this.authenticationRealm = Objects.requireNonNull(builder.authenticationRealm, "authentication_realm");
		this.lookupRealm = Objects.requireNonNull(builder.lookupRealm, "lookup_realm");
		this.authenticationProvider = builder.authenticationProvider;
		this.authenticationType = Objects.requireNonNull(builder.authenticationType, "authentication_type");

	}

	/**
	 * API name: {@code authentication_realm}
	 */
	public UserRealm authenticationRealm() {
		return this.authenticationRealm;
	}

	/**
	 * API name: {@code lookup_realm}
	 */
	public UserRealm lookupRealm() {
		return this.lookupRealm;
	}

	/**
	 * API name: {@code authentication_provider}
	 */
	@Nullable
	public AuthenticationProvider authenticationProvider() {
		return this.authenticationProvider;
	}

	/**
	 * API name: {@code authentication_type}
	 */
	public String authenticationType() {
		return this.authenticationType;
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

		/**
		 * API name: {@code authentication_realm}
		 */
		public Builder authenticationRealm(UserRealm value) {
			this.authenticationRealm = value;
			return this;
		}

		/**
		 * API name: {@code authentication_realm}
		 */
		public Builder authenticationRealm(Function<UserRealm.Builder, ObjectBuilder<UserRealm>> fn) {
			return this.authenticationRealm(fn.apply(new UserRealm.Builder()).build());
		}

		/**
		 * API name: {@code lookup_realm}
		 */
		public Builder lookupRealm(UserRealm value) {
			this.lookupRealm = value;
			return this;
		}

		/**
		 * API name: {@code lookup_realm}
		 */
		public Builder lookupRealm(Function<UserRealm.Builder, ObjectBuilder<UserRealm>> fn) {
			return this.lookupRealm(fn.apply(new UserRealm.Builder()).build());
		}

		/**
		 * API name: {@code authentication_provider}
		 */
		public Builder authenticationProvider(@Nullable AuthenticationProvider value) {
			this.authenticationProvider = value;
			return this;
		}

		/**
		 * API name: {@code authentication_provider}
		 */
		public Builder authenticationProvider(
				Function<AuthenticationProvider.Builder, ObjectBuilder<AuthenticationProvider>> fn) {
			return this.authenticationProvider(fn.apply(new AuthenticationProvider.Builder()).build());
		}

		/**
		 * API name: {@code authentication_type}
		 */
		public Builder authenticationType(String value) {
			this.authenticationType = value;
			return this;
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

			return new AuthenticatedUser(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AuthenticatedUser}
	 */
	public static final JsonpDeserializer<AuthenticatedUser> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AuthenticatedUser::setupAuthenticatedUserDeserializer);

	protected static void setupAuthenticatedUserDeserializer(DelegatingDeserializer<AuthenticatedUser.Builder> op) {
		User.setupUserDeserializer(op);
		op.add(Builder::authenticationRealm, UserRealm.DESERIALIZER, "authentication_realm");
		op.add(Builder::lookupRealm, UserRealm.DESERIALIZER, "lookup_realm");
		op.add(Builder::authenticationProvider, AuthenticationProvider.DESERIALIZER, "authentication_provider");
		op.add(Builder::authenticationType, JsonpDeserializer.stringDeserializer(), "authentication_type");

	}

}
