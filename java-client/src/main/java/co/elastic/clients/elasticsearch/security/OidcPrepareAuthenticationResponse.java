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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: security.oidc_prepare_authentication.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.oidc_prepare_authentication.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcPrepareAuthenticationResponse implements JsonpSerializable {
	private final String nonce;

	private final String realm;

	private final String redirect;

	private final String state;

	// ---------------------------------------------------------------------------------------------

	private OidcPrepareAuthenticationResponse(Builder builder) {

		this.nonce = ApiTypeHelper.requireNonNullWithDefault(builder.nonce, this, "nonce", this.nonce());
		this.realm = ApiTypeHelper.requireNonNullWithDefault(builder.realm, this, "realm", this.realm());
		this.redirect = ApiTypeHelper.requireNonNullWithDefault(builder.redirect, this, "redirect", this.redirect());
		this.state = ApiTypeHelper.requireNonNullWithDefault(builder.state, this, "state", this.state());

	}

	public static OidcPrepareAuthenticationResponse of(
			Function<Builder, ObjectBuilder<OidcPrepareAuthenticationResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nonce}
	 */
	public final String nonce() {
		return this.nonce;
	}

	/**
	 * Required - API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
	}

	/**
	 * Required - A URI that points to the authorization endpoint of the OpenID
	 * Connect Provider with all the parameters of the authentication request as
	 * HTTP GET parameters.
	 * <p>
	 * API name: {@code redirect}
	 */
	public final String redirect() {
		return this.redirect;
	}

	/**
	 * Required - API name: {@code state}
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

		generator.writeKey("realm");
		generator.write(this.realm);

		generator.writeKey("redirect");
		generator.write(this.redirect);

		generator.writeKey("state");
		generator.write(this.state);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcPrepareAuthenticationResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OidcPrepareAuthenticationResponse> {
		private String nonce;

		private String realm;

		private String redirect;

		private String state;

		/**
		 * Required - API name: {@code nonce}
		 */
		public final Builder nonce(String value) {
			this.nonce = value;
			return this;
		}

		/**
		 * Required - API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		/**
		 * Required - A URI that points to the authorization endpoint of the OpenID
		 * Connect Provider with all the parameters of the authentication request as
		 * HTTP GET parameters.
		 * <p>
		 * API name: {@code redirect}
		 */
		public final Builder redirect(String value) {
			this.redirect = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
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
		 * Builds a {@link OidcPrepareAuthenticationResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcPrepareAuthenticationResponse build() {
			_checkSingleUse();

			return new OidcPrepareAuthenticationResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcPrepareAuthenticationResponse}
	 */
	public static final JsonpDeserializer<OidcPrepareAuthenticationResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcPrepareAuthenticationResponse::setupOidcPrepareAuthenticationResponseDeserializer);

	protected static void setupOidcPrepareAuthenticationResponseDeserializer(
			ObjectDeserializer<OidcPrepareAuthenticationResponse.Builder> op) {

		op.add(Builder::nonce, JsonpDeserializer.stringDeserializer(), "nonce");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::redirect, JsonpDeserializer.stringDeserializer(), "redirect");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

}
