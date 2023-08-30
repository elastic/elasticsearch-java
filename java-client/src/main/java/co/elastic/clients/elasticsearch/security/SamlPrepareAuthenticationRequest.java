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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.saml_prepare_authentication.Request

/**
 * Creates a SAML authentication request (&lt;AuthnRequest&gt;) as a URL string,
 * based on the configuration of the respective SAML realm in Elasticsearch.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_prepare_authentication.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlPrepareAuthenticationRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String acs;

	@Nullable
	private final String realm;

	@Nullable
	private final String relayState;

	// ---------------------------------------------------------------------------------------------

	private SamlPrepareAuthenticationRequest(Builder builder) {

		this.acs = builder.acs;
		this.realm = builder.realm;
		this.relayState = builder.relayState;

	}

	public static SamlPrepareAuthenticationRequest of(
			Function<Builder, ObjectBuilder<SamlPrepareAuthenticationRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The Assertion Consumer Service URL that matches the one of the SAML realms in
	 * Elasticsearch. The realm is used to generate the authentication request. You
	 * must specify either this parameter or the realm parameter.
	 * <p>
	 * API name: {@code acs}
	 */
	@Nullable
	public final String acs() {
		return this.acs;
	}

	/**
	 * The name of the SAML realm in Elasticsearch for which the configuration is
	 * used to generate the authentication request. You must specify either this
	 * parameter or the acs parameter.
	 * <p>
	 * API name: {@code realm}
	 */
	@Nullable
	public final String realm() {
		return this.realm;
	}

	/**
	 * A string that will be included in the redirect URL that this API returns as
	 * the RelayState query parameter. If the Authentication Request is signed, this
	 * value is used as part of the signature computation.
	 * <p>
	 * API name: {@code relay_state}
	 */
	@Nullable
	public final String relayState() {
		return this.relayState;
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

		if (this.acs != null) {
			generator.writeKey("acs");
			generator.write(this.acs);

		}
		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}
		if (this.relayState != null) {
			generator.writeKey("relay_state");
			generator.write(this.relayState);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlPrepareAuthenticationRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlPrepareAuthenticationRequest> {
		@Nullable
		private String acs;

		@Nullable
		private String realm;

		@Nullable
		private String relayState;

		/**
		 * The Assertion Consumer Service URL that matches the one of the SAML realms in
		 * Elasticsearch. The realm is used to generate the authentication request. You
		 * must specify either this parameter or the realm parameter.
		 * <p>
		 * API name: {@code acs}
		 */
		public final Builder acs(@Nullable String value) {
			this.acs = value;
			return this;
		}

		/**
		 * The name of the SAML realm in Elasticsearch for which the configuration is
		 * used to generate the authentication request. You must specify either this
		 * parameter or the acs parameter.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(@Nullable String value) {
			this.realm = value;
			return this;
		}

		/**
		 * A string that will be included in the redirect URL that this API returns as
		 * the RelayState query parameter. If the Authentication Request is signed, this
		 * value is used as part of the signature computation.
		 * <p>
		 * API name: {@code relay_state}
		 */
		public final Builder relayState(@Nullable String value) {
			this.relayState = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlPrepareAuthenticationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlPrepareAuthenticationRequest build() {
			_checkSingleUse();

			return new SamlPrepareAuthenticationRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlPrepareAuthenticationRequest}
	 */
	public static final JsonpDeserializer<SamlPrepareAuthenticationRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlPrepareAuthenticationRequest::setupSamlPrepareAuthenticationRequestDeserializer);

	protected static void setupSamlPrepareAuthenticationRequestDeserializer(
			ObjectDeserializer<SamlPrepareAuthenticationRequest.Builder> op) {

		op.add(Builder::acs, JsonpDeserializer.stringDeserializer(), "acs");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::relayState, JsonpDeserializer.stringDeserializer(), "relay_state");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_prepare_authentication}".
	 */
	public static final Endpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.saml_prepare_authentication",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/saml/prepare";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SamlPrepareAuthenticationResponse._DESERIALIZER);
}
