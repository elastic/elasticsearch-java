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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.saml_service_provider_metadata.Request

/**
 * Generate SAML metadata for a SAML 2.0 Service Provider.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_service_provider_metadata.Request">API
 *      specification</a>
 */

public class SamlServiceProviderMetadataRequest extends RequestBase {
	private final String realmName;

	// ---------------------------------------------------------------------------------------------

	private SamlServiceProviderMetadataRequest(Builder builder) {

		this.realmName = ApiTypeHelper.requireNonNull(builder.realmName, this, "realmName");

	}

	public static SamlServiceProviderMetadataRequest of(
			Function<Builder, ObjectBuilder<SamlServiceProviderMetadataRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the SAML realm in Elasticsearch.
	 * <p>
	 * API name: {@code realm_name}
	 */
	public final String realmName() {
		return this.realmName;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlServiceProviderMetadataRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SamlServiceProviderMetadataRequest> {
		private String realmName;

		/**
		 * Required - The name of the SAML realm in Elasticsearch.
		 * <p>
		 * API name: {@code realm_name}
		 */
		public final Builder realmName(String value) {
			this.realmName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlServiceProviderMetadataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlServiceProviderMetadataRequest build() {
			_checkSingleUse();

			return new SamlServiceProviderMetadataRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.saml_service_provider_metadata}".
	 */
	public static final Endpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.saml_service_provider_metadata",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _realmName = 1 << 0;

				int propsSet = 0;

				propsSet |= _realmName;

				if (propsSet == (_realmName)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/saml");
					buf.append("/metadata");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.realmName, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _realmName = 1 << 0;

				int propsSet = 0;

				propsSet |= _realmName;

				if (propsSet == (_realmName)) {
					params.put("realmName", request.realmName);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, SamlServiceProviderMetadataResponse._DESERIALIZER);
}
