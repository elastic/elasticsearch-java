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

// typedef: security.oidc_prepare_authentication.Request

/**
 * Prepare OpenID connect authentication. Create an oAuth 2.0 authentication
 * request as a URL string based on the configuration of the OpenID Connect
 * authentication realm in Elasticsearch.
 * <p>
 * The response of this API is a URL pointing to the Authorization Endpoint of
 * the configured OpenID Connect Provider, which can be used to redirect the
 * browser of the user in order to continue the authentication process.
 * <p>
 * Elasticsearch exposes all the necessary OpenID Connect related functionality
 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
 * order to provide OpenID Connect based authentication, but can also be used by
 * other, custom web applications or other clients.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.oidc_prepare_authentication.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcPrepareAuthenticationRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String iss;

	@Nullable
	private final String loginHint;

	@Nullable
	private final String nonce;

	@Nullable
	private final String realm;

	@Nullable
	private final String state;

	// ---------------------------------------------------------------------------------------------

	private OidcPrepareAuthenticationRequest(Builder builder) {

		this.iss = builder.iss;
		this.loginHint = builder.loginHint;
		this.nonce = builder.nonce;
		this.realm = builder.realm;
		this.state = builder.state;

	}

	public static OidcPrepareAuthenticationRequest of(
			Function<Builder, ObjectBuilder<OidcPrepareAuthenticationRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * In the case of a third party initiated single sign on, this is the issuer
	 * identifier for the OP that the RP is to send the authentication request to.
	 * It cannot be specified when <em>realm</em> is specified. One of
	 * <em>realm</em> or <em>iss</em> is required.
	 * <p>
	 * API name: {@code iss}
	 */
	@Nullable
	public final String iss() {
		return this.iss;
	}

	/**
	 * In the case of a third party initiated single sign on, it is a string value
	 * that is included in the authentication request as the <em>login_hint</em>
	 * parameter. This parameter is not valid when <em>realm</em> is specified.
	 * <p>
	 * API name: {@code login_hint}
	 */
	@Nullable
	public final String loginHint() {
		return this.loginHint;
	}

	/**
	 * The value used to associate a client session with an ID token and to mitigate
	 * replay attacks. If the caller of the API does not provide a value,
	 * Elasticsearch will generate one with sufficient entropy and return it in the
	 * response.
	 * <p>
	 * API name: {@code nonce}
	 */
	@Nullable
	public final String nonce() {
		return this.nonce;
	}

	/**
	 * The name of the OpenID Connect realm in Elasticsearch the configuration of
	 * which should be used in order to generate the authentication request. It
	 * cannot be specified when <em>iss</em> is specified. One of <em>realm</em> or
	 * <em>iss</em> is required.
	 * <p>
	 * API name: {@code realm}
	 */
	@Nullable
	public final String realm() {
		return this.realm;
	}

	/**
	 * The value used to maintain state between the authentication request and the
	 * response, typically used as a Cross-Site Request Forgery mitigation. If the
	 * caller of the API does not provide a value, Elasticsearch will generate one
	 * with sufficient entropy and return it in the response.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final String state() {
		return this.state;
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

		if (this.iss != null) {
			generator.writeKey("iss");
			generator.write(this.iss);

		}
		if (this.loginHint != null) {
			generator.writeKey("login_hint");
			generator.write(this.loginHint);

		}
		if (this.nonce != null) {
			generator.writeKey("nonce");
			generator.write(this.nonce);

		}
		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}
		if (this.state != null) {
			generator.writeKey("state");
			generator.write(this.state);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcPrepareAuthenticationRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OidcPrepareAuthenticationRequest> {
		@Nullable
		private String iss;

		@Nullable
		private String loginHint;

		@Nullable
		private String nonce;

		@Nullable
		private String realm;

		@Nullable
		private String state;

		/**
		 * In the case of a third party initiated single sign on, this is the issuer
		 * identifier for the OP that the RP is to send the authentication request to.
		 * It cannot be specified when <em>realm</em> is specified. One of
		 * <em>realm</em> or <em>iss</em> is required.
		 * <p>
		 * API name: {@code iss}
		 */
		public final Builder iss(@Nullable String value) {
			this.iss = value;
			return this;
		}

		/**
		 * In the case of a third party initiated single sign on, it is a string value
		 * that is included in the authentication request as the <em>login_hint</em>
		 * parameter. This parameter is not valid when <em>realm</em> is specified.
		 * <p>
		 * API name: {@code login_hint}
		 */
		public final Builder loginHint(@Nullable String value) {
			this.loginHint = value;
			return this;
		}

		/**
		 * The value used to associate a client session with an ID token and to mitigate
		 * replay attacks. If the caller of the API does not provide a value,
		 * Elasticsearch will generate one with sufficient entropy and return it in the
		 * response.
		 * <p>
		 * API name: {@code nonce}
		 */
		public final Builder nonce(@Nullable String value) {
			this.nonce = value;
			return this;
		}

		/**
		 * The name of the OpenID Connect realm in Elasticsearch the configuration of
		 * which should be used in order to generate the authentication request. It
		 * cannot be specified when <em>iss</em> is specified. One of <em>realm</em> or
		 * <em>iss</em> is required.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(@Nullable String value) {
			this.realm = value;
			return this;
		}

		/**
		 * The value used to maintain state between the authentication request and the
		 * response, typically used as a Cross-Site Request Forgery mitigation. If the
		 * caller of the API does not provide a value, Elasticsearch will generate one
		 * with sufficient entropy and return it in the response.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OidcPrepareAuthenticationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcPrepareAuthenticationRequest build() {
			_checkSingleUse();

			return new OidcPrepareAuthenticationRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcPrepareAuthenticationRequest}
	 */
	public static final JsonpDeserializer<OidcPrepareAuthenticationRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcPrepareAuthenticationRequest::setupOidcPrepareAuthenticationRequestDeserializer);

	protected static void setupOidcPrepareAuthenticationRequestDeserializer(
			ObjectDeserializer<OidcPrepareAuthenticationRequest.Builder> op) {

		op.add(Builder::iss, JsonpDeserializer.stringDeserializer(), "iss");
		op.add(Builder::loginHint, JsonpDeserializer.stringDeserializer(), "login_hint");
		op.add(Builder::nonce, JsonpDeserializer.stringDeserializer(), "nonce");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.oidc_prepare_authentication}".
	 */
	public static final Endpoint<OidcPrepareAuthenticationRequest, OidcPrepareAuthenticationResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.oidc_prepare_authentication",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/oidc/prepare";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, OidcPrepareAuthenticationResponse._DESERIALIZER);
}
