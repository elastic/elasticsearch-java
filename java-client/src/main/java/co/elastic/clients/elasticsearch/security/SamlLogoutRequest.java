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

// typedef: security.saml_logout.Request

/**
 * Submits a request to invalidate an access token and refresh token.
 * 
 * @see <a href="../doc-files/api-spec.html#security.saml_logout.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlLogoutRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String refreshToken;

	private final String token;

	// ---------------------------------------------------------------------------------------------

	private SamlLogoutRequest(Builder builder) {

		this.refreshToken = builder.refreshToken;
		this.token = ApiTypeHelper.requireNonNull(builder.token, this, "token");

	}

	public static SamlLogoutRequest of(Function<Builder, ObjectBuilder<SamlLogoutRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The refresh token that was returned as a response to calling the SAML
	 * authenticate API. Alternatively, the most recent refresh token that was
	 * received after refreshing the original access token.
	 * <p>
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * Required - The access token that was returned as a response to calling the
	 * SAML authenticate API. Alternatively, the most recent token that was received
	 * after refreshing the original one by using a refresh_token.
	 * <p>
	 * API name: {@code token}
	 */
	public final String token() {
		return this.token;
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

		if (this.refreshToken != null) {
			generator.writeKey("refresh_token");
			generator.write(this.refreshToken);

		}
		generator.writeKey("token");
		generator.write(this.token);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlLogoutRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlLogoutRequest> {
		@Nullable
		private String refreshToken;

		private String token;

		/**
		 * The refresh token that was returned as a response to calling the SAML
		 * authenticate API. Alternatively, the most recent refresh token that was
		 * received after refreshing the original access token.
		 * <p>
		 * API name: {@code refresh_token}
		 */
		public final Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * Required - The access token that was returned as a response to calling the
		 * SAML authenticate API. Alternatively, the most recent token that was received
		 * after refreshing the original one by using a refresh_token.
		 * <p>
		 * API name: {@code token}
		 */
		public final Builder token(String value) {
			this.token = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlLogoutRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlLogoutRequest build() {
			_checkSingleUse();

			return new SamlLogoutRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlLogoutRequest}
	 */
	public static final JsonpDeserializer<SamlLogoutRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlLogoutRequest::setupSamlLogoutRequestDeserializer);

	protected static void setupSamlLogoutRequestDeserializer(ObjectDeserializer<SamlLogoutRequest.Builder> op) {

		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_logout}".
	 */
	public static final Endpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.saml_logout",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/saml/logout";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SamlLogoutResponse._DESERIALIZER);
}
