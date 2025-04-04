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
import java.util.List;
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

// typedef: security.saml_authenticate.Request

/**
 * Authenticate SAML.
 * <p>
 * Submit a SAML response message to Elasticsearch for consumption.
 * <p>
 * NOTE: This API is intended for use by custom web applications other than
 * Kibana. If you are using Kibana, refer to the documentation for configuring
 * SAML single-sign-on on the Elastic Stack.
 * <p>
 * The SAML message that is submitted can be:
 * <ul>
 * <li>A response to a SAML authentication request that was previously created
 * using the SAML prepare authentication API.</li>
 * <li>An unsolicited SAML message in the case of an IdP-initiated single
 * sign-on (SSO) flow.</li>
 * </ul>
 * <p>
 * In either case, the SAML message needs to be a base64 encoded XML document
 * with a root element of <code>&lt;Response&gt;</code>.
 * <p>
 * After successful validation, Elasticsearch responds with an Elasticsearch
 * internal access token and refresh token that can be subsequently used for
 * authentication. This API endpoint essentially exchanges SAML responses that
 * indicate successful authentication in the IdP for Elasticsearch access and
 * refresh tokens, which can be used for authentication against Elasticsearch.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_authenticate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlAuthenticateRequest extends RequestBase implements JsonpSerializable {
	private final String content;

	private final List<String> ids;

	@Nullable
	private final String realm;

	// ---------------------------------------------------------------------------------------------

	private SamlAuthenticateRequest(Builder builder) {

		this.content = ApiTypeHelper.requireNonNull(builder.content, this, "content");
		this.ids = ApiTypeHelper.unmodifiableRequired(builder.ids, this, "ids");
		this.realm = builder.realm;

	}

	public static SamlAuthenticateRequest of(Function<Builder, ObjectBuilder<SamlAuthenticateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The SAML response as it was sent by the user's browser, usually a
	 * Base64 encoded XML document.
	 * <p>
	 * API name: {@code content}
	 */
	public final String content() {
		return this.content;
	}

	/**
	 * Required - A JSON array with all the valid SAML Request Ids that the caller
	 * of the API has for the current user.
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * The name of the realm that should authenticate the SAML response. Useful in
	 * cases where many SAML realms are defined.
	 * <p>
	 * API name: {@code realm}
	 */
	@Nullable
	public final String realm() {
		return this.realm;
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

		generator.writeKey("content");
		generator.write(this.content);

		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlAuthenticateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlAuthenticateRequest> {
		private String content;

		private List<String> ids;

		@Nullable
		private String realm;

		/**
		 * Required - The SAML response as it was sent by the user's browser, usually a
		 * Base64 encoded XML document.
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(String value) {
			this.content = value;
			return this;
		}

		/**
		 * Required - A JSON array with all the valid SAML Request Ids that the caller
		 * of the API has for the current user.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * Required - A JSON array with all the valid SAML Request Ids that the caller
		 * of the API has for the current user.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * The name of the realm that should authenticate the SAML response. Useful in
		 * cases where many SAML realms are defined.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(@Nullable String value) {
			this.realm = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlAuthenticateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlAuthenticateRequest build() {
			_checkSingleUse();

			return new SamlAuthenticateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlAuthenticateRequest}
	 */
	public static final JsonpDeserializer<SamlAuthenticateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlAuthenticateRequest::setupSamlAuthenticateRequestDeserializer);

	protected static void setupSamlAuthenticateRequestDeserializer(
			ObjectDeserializer<SamlAuthenticateRequest.Builder> op) {

		op.add(Builder::content, JsonpDeserializer.stringDeserializer(), "content");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_authenticate}".
	 */
	public static final Endpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.saml_authenticate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/saml/authenticate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SamlAuthenticateResponse._DESERIALIZER);
}
