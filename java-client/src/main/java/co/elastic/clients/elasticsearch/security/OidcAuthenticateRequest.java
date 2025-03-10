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
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: security.oidc_authenticate.Request

/**
 * Authenticate OpenID Connect.
 * <p>
 * Exchange an OpenID Connect authentication response message for an
 * Elasticsearch internal access token and refresh token that can be
 * subsequently used for authentication.
 * <p>
 * Elasticsearch exposes all the necessary OpenID Connect related functionality
 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
 * order to provide OpenID Connect based authentication, but can also be used by
 * other, custom web applications or other clients.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.oidc_authenticate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcAuthenticateRequest extends RequestBase implements JsonpSerializable {
	private final String nonce;

	@Nullable
	private final String realm;

	private final String redirectUri;

	private final String state;

	// ---------------------------------------------------------------------------------------------

	private OidcAuthenticateRequest(Builder builder) {

		this.nonce = ApiTypeHelper.requireNonNull(builder.nonce, this, "nonce");
		this.realm = builder.realm;
		this.redirectUri = ApiTypeHelper.requireNonNull(builder.redirectUri, this, "redirectUri");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static OidcAuthenticateRequest of(Function<Builder, ObjectBuilder<OidcAuthenticateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Associate a client session with an ID token and mitigate replay
	 * attacks. This value needs to be the same as the one that was provided to the
	 * <code>/_security/oidc/prepare</code> API or the one that was generated by
	 * Elasticsearch and included in the response to that call.
	 * <p>
	 * API name: {@code nonce}
	 */
	public final String nonce() {
		return this.nonce;
	}

	/**
	 * The name of the OpenID Connect realm. This property is useful in cases where
	 * multiple realms are defined.
	 * <p>
	 * API name: {@code realm}
	 */
	@Nullable
	public final String realm() {
		return this.realm;
	}

	/**
	 * Required - The URL to which the OpenID Connect Provider redirected the User
	 * Agent in response to an authentication request after a successful
	 * authentication. This URL must be provided as-is (URL encoded), taken from the
	 * body of the response or as the value of a location header in the response
	 * from the OpenID Connect Provider.
	 * <p>
	 * API name: {@code redirect_uri}
	 */
	public final String redirectUri() {
		return this.redirectUri;
	}

	/**
	 * Required - Maintain state between the authentication request and the
	 * response. This value needs to be the same as the one that was provided to the
	 * <code>/_security/oidc/prepare</code> API or the one that was generated by
	 * Elasticsearch and included in the response to that call.
	 * <p>
	 * API name: {@code state}
	 */
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

		generator.writeKey("nonce");
		generator.write(this.nonce);

		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}
		generator.writeKey("redirect_uri");
		generator.write(this.redirectUri);

		generator.writeKey("state");
		generator.write(this.state);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcAuthenticateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OidcAuthenticateRequest> {
		private String nonce;

		@Nullable
		private String realm;

		private String redirectUri;

		private String state;

		/**
		 * Required - Associate a client session with an ID token and mitigate replay
		 * attacks. This value needs to be the same as the one that was provided to the
		 * <code>/_security/oidc/prepare</code> API or the one that was generated by
		 * Elasticsearch and included in the response to that call.
		 * <p>
		 * API name: {@code nonce}
		 */
		public final Builder nonce(String value) {
			this.nonce = value;
			return this;
		}

		/**
		 * The name of the OpenID Connect realm. This property is useful in cases where
		 * multiple realms are defined.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(@Nullable String value) {
			this.realm = value;
			return this;
		}

		/**
		 * Required - The URL to which the OpenID Connect Provider redirected the User
		 * Agent in response to an authentication request after a successful
		 * authentication. This URL must be provided as-is (URL encoded), taken from the
		 * body of the response or as the value of a location header in the response
		 * from the OpenID Connect Provider.
		 * <p>
		 * API name: {@code redirect_uri}
		 */
		public final Builder redirectUri(String value) {
			this.redirectUri = value;
			return this;
		}

		/**
		 * Required - Maintain state between the authentication request and the
		 * response. This value needs to be the same as the one that was provided to the
		 * <code>/_security/oidc/prepare</code> API or the one that was generated by
		 * Elasticsearch and included in the response to that call.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(String value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OidcAuthenticateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcAuthenticateRequest build() {
			_checkSingleUse();

			return new OidcAuthenticateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcAuthenticateRequest}
	 */
	public static final JsonpDeserializer<OidcAuthenticateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcAuthenticateRequest::setupOidcAuthenticateRequestDeserializer);

	protected static void setupOidcAuthenticateRequestDeserializer(
			ObjectDeserializer<OidcAuthenticateRequest.Builder> op) {

		op.add(Builder::nonce, JsonpDeserializer.stringDeserializer(), "nonce");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::redirectUri, JsonpDeserializer.stringDeserializer(), "redirect_uri");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.oidc_authenticate}".
	 */
	public static final Endpoint<OidcAuthenticateRequest, OidcAuthenticateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.oidc_authenticate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/oidc/authenticate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, OidcAuthenticateResponse._DESERIALIZER);
}
