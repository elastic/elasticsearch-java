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

// typedef: security.saml_invalidate.Request

/**
 * Submits a SAML LogoutRequest message to Elasticsearch for consumption.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_invalidate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlInvalidateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String acs;

	private final String queryString;

	@Nullable
	private final String realm;

	// ---------------------------------------------------------------------------------------------

	private SamlInvalidateRequest(Builder builder) {

		this.acs = builder.acs;
		this.queryString = ApiTypeHelper.requireNonNull(builder.queryString, this, "queryString");
		this.realm = builder.realm;

	}

	public static SamlInvalidateRequest of(Function<Builder, ObjectBuilder<SamlInvalidateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The Assertion Consumer Service URL that matches the one of the SAML realm in
	 * Elasticsearch that should be used. You must specify either this parameter or
	 * the realm parameter.
	 * <p>
	 * API name: {@code acs}
	 */
	@Nullable
	public final String acs() {
		return this.acs;
	}

	/**
	 * Required - The query part of the URL that the user was redirected to by the
	 * SAML IdP to initiate the Single Logout. This query should include a single
	 * parameter named SAMLRequest that contains a SAML logout request that is
	 * deflated and Base64 encoded. If the SAML IdP has signed the logout request,
	 * the URL should include two extra parameters named SigAlg and Signature that
	 * contain the algorithm used for the signature and the signature value itself.
	 * In order for Elasticsearch to be able to verify the IdP’s signature, the
	 * value of the query_string field must be an exact match to the string provided
	 * by the browser. The client application must not attempt to parse or process
	 * the string in any way.
	 * <p>
	 * API name: {@code query_string}
	 */
	public final String queryString() {
		return this.queryString;
	}

	/**
	 * The name of the SAML realm in Elasticsearch the configuration. You must
	 * specify either this parameter or the acs parameter.
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

		if (this.acs != null) {
			generator.writeKey("acs");
			generator.write(this.acs);

		}
		generator.writeKey("query_string");
		generator.write(this.queryString);

		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlInvalidateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlInvalidateRequest> {
		@Nullable
		private String acs;

		private String queryString;

		@Nullable
		private String realm;

		/**
		 * The Assertion Consumer Service URL that matches the one of the SAML realm in
		 * Elasticsearch that should be used. You must specify either this parameter or
		 * the realm parameter.
		 * <p>
		 * API name: {@code acs}
		 */
		public final Builder acs(@Nullable String value) {
			this.acs = value;
			return this;
		}

		/**
		 * Required - The query part of the URL that the user was redirected to by the
		 * SAML IdP to initiate the Single Logout. This query should include a single
		 * parameter named SAMLRequest that contains a SAML logout request that is
		 * deflated and Base64 encoded. If the SAML IdP has signed the logout request,
		 * the URL should include two extra parameters named SigAlg and Signature that
		 * contain the algorithm used for the signature and the signature value itself.
		 * In order for Elasticsearch to be able to verify the IdP’s signature, the
		 * value of the query_string field must be an exact match to the string provided
		 * by the browser. The client application must not attempt to parse or process
		 * the string in any way.
		 * <p>
		 * API name: {@code query_string}
		 */
		public final Builder queryString(String value) {
			this.queryString = value;
			return this;
		}

		/**
		 * The name of the SAML realm in Elasticsearch the configuration. You must
		 * specify either this parameter or the acs parameter.
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
		 * Builds a {@link SamlInvalidateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlInvalidateRequest build() {
			_checkSingleUse();

			return new SamlInvalidateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlInvalidateRequest}
	 */
	public static final JsonpDeserializer<SamlInvalidateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlInvalidateRequest::setupSamlInvalidateRequestDeserializer);

	protected static void setupSamlInvalidateRequestDeserializer(ObjectDeserializer<SamlInvalidateRequest.Builder> op) {

		op.add(Builder::acs, JsonpDeserializer.stringDeserializer(), "acs");
		op.add(Builder::queryString, JsonpDeserializer.stringDeserializer(), "query_string");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_invalidate}".
	 */
	public static final Endpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.saml_invalidate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/saml/invalidate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SamlInvalidateResponse._DESERIALIZER);
}
