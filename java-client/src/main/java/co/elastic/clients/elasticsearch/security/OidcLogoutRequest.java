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

// typedef: security.oidc_logout.Request

/**
 * Logout of OpenID Connect. Invalidate an access token and a refresh token that
 * were generated as a response to the <code>/_security/oidc/authenticate</code>
 * API.
 * <p>
 * If the OpenID Connect authentication realm in Elasticsearch is accordingly
 * configured, the response to this call will contain a URI pointing to the end
 * session endpoint of the OpenID Connect Provider in order to perform single
 * logout.
 * <p>
 * Elasticsearch exposes all the necessary OpenID Connect related functionality
 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
 * order to provide OpenID Connect based authentication, but can also be used by
 * other, custom web applications or other clients.
 * 
 * @see <a href="../doc-files/api-spec.html#security.oidc_logout.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcLogoutRequest extends RequestBase implements JsonpSerializable {
	private final String accessToken;

	@Nullable
	private final String refreshToken;

	// ---------------------------------------------------------------------------------------------

	private OidcLogoutRequest(Builder builder) {

		this.accessToken = ApiTypeHelper.requireNonNull(builder.accessToken, this, "accessToken");
		this.refreshToken = builder.refreshToken;

	}

	public static OidcLogoutRequest of(Function<Builder, ObjectBuilder<OidcLogoutRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The access token to be invalidated.
	 * <p>
	 * API name: {@code access_token}
	 */
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * The refresh token to be invalidated.
	 * <p>
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public final String refreshToken() {
		return this.refreshToken;
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

		if (this.refreshToken != null) {
			generator.writeKey("refresh_token");
			generator.write(this.refreshToken);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcLogoutRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OidcLogoutRequest> {
		private String accessToken;

		@Nullable
		private String refreshToken;

		/**
		 * Required - The access token to be invalidated.
		 * <p>
		 * API name: {@code access_token}
		 */
		public final Builder accessToken(String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * The refresh token to be invalidated.
		 * <p>
		 * API name: {@code refresh_token}
		 */
		public final Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OidcLogoutRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcLogoutRequest build() {
			_checkSingleUse();

			return new OidcLogoutRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcLogoutRequest}
	 */
	public static final JsonpDeserializer<OidcLogoutRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcLogoutRequest::setupOidcLogoutRequestDeserializer);

	protected static void setupOidcLogoutRequestDeserializer(ObjectDeserializer<OidcLogoutRequest.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.oidc_logout}".
	 */
	public static final Endpoint<OidcLogoutRequest, OidcLogoutResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.oidc_logout",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/oidc/logout";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, OidcLogoutResponse._DESERIALIZER);
}
