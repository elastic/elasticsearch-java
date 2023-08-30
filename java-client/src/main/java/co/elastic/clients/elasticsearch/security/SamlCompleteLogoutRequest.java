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
import co.elastic.clients.transport.endpoints.BooleanEndpoint;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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

// typedef: security.saml_complete_logout.Request

/**
 * Verifies the logout response sent from the SAML IdP.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_complete_logout.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlCompleteLogoutRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String content;

	private final List<String> ids;

	@Nullable
	private final String queryString;

	private final String realm;

	// ---------------------------------------------------------------------------------------------

	private SamlCompleteLogoutRequest(Builder builder) {

		this.content = builder.content;
		this.ids = ApiTypeHelper.unmodifiableRequired(builder.ids, this, "ids");
		this.queryString = builder.queryString;
		this.realm = ApiTypeHelper.requireNonNull(builder.realm, this, "realm");

	}

	public static SamlCompleteLogoutRequest of(Function<Builder, ObjectBuilder<SamlCompleteLogoutRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If the SAML IdP sends the logout response with the HTTP-Post binding, this
	 * field must be set to the value of the SAMLResponse form parameter from the
	 * logout response.
	 * <p>
	 * API name: {@code content}
	 */
	@Nullable
	public final String content() {
		return this.content;
	}

	/**
	 * Required - A json array with all the valid SAML Request Ids that the caller
	 * of the API has for the current user.
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * If the SAML IdP sends the logout response with the HTTP-Redirect binding,
	 * this field must be set to the query string of the redirect URI.
	 * <p>
	 * API name: {@code query_string}
	 */
	@Nullable
	public final String queryString() {
		return this.queryString;
	}

	/**
	 * Required - The name of the SAML realm in Elasticsearch for which the
	 * configuration is used to verify the logout response.
	 * <p>
	 * API name: {@code realm}
	 */
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

		if (this.content != null) {
			generator.writeKey("content");
			generator.write(this.content);

		}
		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.queryString != null) {
			generator.writeKey("query_string");
			generator.write(this.queryString);

		}
		generator.writeKey("realm");
		generator.write(this.realm);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlCompleteLogoutRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlCompleteLogoutRequest> {
		@Nullable
		private String content;

		private List<String> ids;

		@Nullable
		private String queryString;

		private String realm;

		/**
		 * If the SAML IdP sends the logout response with the HTTP-Post binding, this
		 * field must be set to the value of the SAMLResponse form parameter from the
		 * logout response.
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(@Nullable String value) {
			this.content = value;
			return this;
		}

		/**
		 * Required - A json array with all the valid SAML Request Ids that the caller
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
		 * Required - A json array with all the valid SAML Request Ids that the caller
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
		 * If the SAML IdP sends the logout response with the HTTP-Redirect binding,
		 * this field must be set to the query string of the redirect URI.
		 * <p>
		 * API name: {@code query_string}
		 */
		public final Builder queryString(@Nullable String value) {
			this.queryString = value;
			return this;
		}

		/**
		 * Required - The name of the SAML realm in Elasticsearch for which the
		 * configuration is used to verify the logout response.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlCompleteLogoutRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlCompleteLogoutRequest build() {
			_checkSingleUse();

			return new SamlCompleteLogoutRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlCompleteLogoutRequest}
	 */
	public static final JsonpDeserializer<SamlCompleteLogoutRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlCompleteLogoutRequest::setupSamlCompleteLogoutRequestDeserializer);

	protected static void setupSamlCompleteLogoutRequestDeserializer(
			ObjectDeserializer<SamlCompleteLogoutRequest.Builder> op) {

		op.add(Builder::content, JsonpDeserializer.stringDeserializer(), "content");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::queryString, JsonpDeserializer.stringDeserializer(), "query_string");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_complete_logout}".
	 */
	public static final Endpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse> _ENDPOINT = new BooleanEndpoint<>(
			"es/security.saml_complete_logout",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/saml/complete_logout";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, null);
}
