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
import co.elastic.clients.elasticsearch.security.get_token.AccessTokenGrantType;
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
import java.lang.String;
import java.util.Collections;
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

// typedef: security.get_token.Request

/**
 * Get a token.
 * <p>
 * Create a bearer token for access without requiring basic authentication. The
 * tokens are created by the Elasticsearch Token Service, which is automatically
 * enabled when you configure TLS on the HTTP interface. Alternatively, you can
 * explicitly enable the <code>xpack.security.authc.token.enabled</code>
 * setting. When you are running in production mode, a bootstrap check prevents
 * you from enabling the token service unless you also enable TLS on the HTTP
 * interface.
 * <p>
 * The get token API takes the same parameters as a typical OAuth 2.0 token API
 * except for the use of a JSON request body.
 * <p>
 * A successful get token API call returns a JSON structure that contains the
 * access token, the amount of time (seconds) that the token expires in, the
 * type, and the scope if available.
 * <p>
 * The tokens returned by the get token API have a finite period of time for
 * which they are valid and after that time period, they can no longer be used.
 * That time period is defined by the
 * <code>xpack.security.authc.token.timeout</code> setting. If you want to
 * invalidate a token immediately, you can do so by using the invalidate token
 * API.
 * 
 * @see <a href="../doc-files/api-spec.html#security.get_token.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTokenRequest extends RequestBase implements JsonpSerializable {
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

	private GetTokenRequest(Builder builder) {

		this.grantType = builder.grantType;
		this.kerberosTicket = builder.kerberosTicket;
		this.password = builder.password;
		this.refreshToken = builder.refreshToken;
		this.scope = builder.scope;
		this.username = builder.username;

	}

	public static GetTokenRequest of(Function<Builder, ObjectBuilder<GetTokenRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The type of grant. Supported grant types are: <code>password</code>,
	 * <code>_kerberos</code>, <code>client_credentials</code>, and
	 * <code>refresh_token</code>.
	 * <p>
	 * API name: {@code grant_type}
	 */
	@Nullable
	public final AccessTokenGrantType grantType() {
		return this.grantType;
	}

	/**
	 * The base64 encoded kerberos ticket. If you specify the <code>_kerberos</code>
	 * grant type, this parameter is required. This parameter is not valid with any
	 * other supported grant type.
	 * <p>
	 * API name: {@code kerberos_ticket}
	 */
	@Nullable
	public final String kerberosTicket() {
		return this.kerberosTicket;
	}

	/**
	 * The user's password. If you specify the <code>password</code> grant type,
	 * this parameter is required. This parameter is not valid with any other
	 * supported grant type.
	 * <p>
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * The string that was returned when you created the token, which enables you to
	 * extend its life. If you specify the <code>refresh_token</code> grant type,
	 * this parameter is required. This parameter is not valid with any other
	 * supported grant type.
	 * <p>
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * The scope of the token. Currently tokens are only issued for a scope of FULL
	 * regardless of the value sent with the request.
	 * <p>
	 * API name: {@code scope}
	 */
	@Nullable
	public final String scope() {
		return this.scope;
	}

	/**
	 * The username that identifies the user. If you specify the
	 * <code>password</code> grant type, this parameter is required. This parameter
	 * is not valid with any other supported grant type.
	 * <p>
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<GetTokenRequest> {
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
		 * The type of grant. Supported grant types are: <code>password</code>,
		 * <code>_kerberos</code>, <code>client_credentials</code>, and
		 * <code>refresh_token</code>.
		 * <p>
		 * API name: {@code grant_type}
		 */
		public final Builder grantType(@Nullable AccessTokenGrantType value) {
			this.grantType = value;
			return this;
		}

		/**
		 * The base64 encoded kerberos ticket. If you specify the <code>_kerberos</code>
		 * grant type, this parameter is required. This parameter is not valid with any
		 * other supported grant type.
		 * <p>
		 * API name: {@code kerberos_ticket}
		 */
		public final Builder kerberosTicket(@Nullable String value) {
			this.kerberosTicket = value;
			return this;
		}

		/**
		 * The user's password. If you specify the <code>password</code> grant type,
		 * this parameter is required. This parameter is not valid with any other
		 * supported grant type.
		 * <p>
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * The string that was returned when you created the token, which enables you to
		 * extend its life. If you specify the <code>refresh_token</code> grant type,
		 * this parameter is required. This parameter is not valid with any other
		 * supported grant type.
		 * <p>
		 * API name: {@code refresh_token}
		 */
		public final Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * The scope of the token. Currently tokens are only issued for a scope of FULL
		 * regardless of the value sent with the request.
		 * <p>
		 * API name: {@code scope}
		 */
		public final Builder scope(@Nullable String value) {
			this.scope = value;
			return this;
		}

		/**
		 * The username that identifies the user. If you specify the
		 * <code>password</code> grant type, this parameter is required. This parameter
		 * is not valid with any other supported grant type.
		 * <p>
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
		 * Builds a {@link GetTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTokenRequest build() {
			_checkSingleUse();

			return new GetTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTokenRequest}
	 */
	public static final JsonpDeserializer<GetTokenRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetTokenRequest::setupGetTokenRequestDeserializer);

	protected static void setupGetTokenRequestDeserializer(ObjectDeserializer<GetTokenRequest.Builder> op) {

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
	public static final Endpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_token",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/oauth2/token";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, GetTokenResponse._DESERIALIZER);
}
