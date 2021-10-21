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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.get_token.AccessTokenGrantType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_token.Request
@JsonpDeserializable
public final class GetTokenRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final AccessTokenGrantType grantType;

	@Nullable
	private final String kerberosTicket;

	@Nullable
	private final String password;

	@Nullable
	private final String refreshToken;

	@Nullable
	private final String scope;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	public GetTokenRequest(Builder builder) {

		this.grantType = builder.grantType;
		this.kerberosTicket = builder.kerberosTicket;
		this.password = builder.password;
		this.refreshToken = builder.refreshToken;
		this.scope = builder.scope;
		this.username = builder.username;

	}

	public GetTokenRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code grant_type}
	 */
	@Nullable
	public AccessTokenGrantType grantType() {
		return this.grantType;
	}

	/**
	 * API name: {@code kerberos_ticket}
	 */
	@Nullable
	public String kerberosTicket() {
		return this.kerberosTicket;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public String password() {
		return this.password;
	}

	/**
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * API name: {@code scope}
	 */
	@Nullable
	public String scope() {
		return this.scope;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public String username() {
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

		if (this.grantType != null) {

			generator.writeKey("grant_type");
			this.grantType.serialize(generator, mapper);
		}
		if (this.kerberosTicket != null) {

			generator.writeKey("kerberos_ticket");
			generator.write(this.kerberosTicket);

		}
		if (this.password != null) {

			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.refreshToken != null) {

			generator.writeKey("refresh_token");
			generator.write(this.refreshToken);

		}
		if (this.scope != null) {

			generator.writeKey("scope");
			generator.write(this.scope);

		}
		if (this.username != null) {

			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTokenRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetTokenRequest> {
		@Nullable
		private AccessTokenGrantType grantType;

		@Nullable
		private String kerberosTicket;

		@Nullable
		private String password;

		@Nullable
		private String refreshToken;

		@Nullable
		private String scope;

		@Nullable
		private String username;

		/**
		 * API name: {@code grant_type}
		 */
		public Builder grantType(@Nullable AccessTokenGrantType value) {
			this.grantType = value;
			return this;
		}

		/**
		 * API name: {@code kerberos_ticket}
		 */
		public Builder kerberosTicket(@Nullable String value) {
			this.kerberosTicket = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code refresh_token}
		 */
		public Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * API name: {@code scope}
		 */
		public Builder scope(@Nullable String value) {
			this.scope = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link GetTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTokenRequest build() {

			return new GetTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTokenRequest}
	 */
	public static final JsonpDeserializer<GetTokenRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetTokenRequest::setupGetTokenRequestDeserializer, Builder::build);

	protected static void setupGetTokenRequestDeserializer(DelegatingDeserializer<GetTokenRequest.Builder> op) {

		op.add(Builder::grantType, AccessTokenGrantType._DESERIALIZER, "grant_type");
		op.add(Builder::kerberosTicket, JsonpDeserializer.stringDeserializer(), "kerberos_ticket");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::scope, JsonpDeserializer.stringDeserializer(), "scope");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_token}".
	 */
	public static final Endpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/oauth2/token";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, GetTokenResponse._DESERIALIZER);
}
