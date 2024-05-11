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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
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

// typedef: security.get_api_key.Request

/**
 * Retrieves information for one or more API keys.
 * 
 * @see <a href="../doc-files/api-spec.html#security.get_api_key.Request">API
 *      specification</a>
 */

public class GetApiKeyRequest extends RequestBase {
	@Nullable
	private final String id;

	@Nullable
	private final String name;

	@Nullable
	private final Boolean owner;

	@Nullable
	private final String realmName;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private GetApiKeyRequest(Builder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.owner = builder.owner;
		this.realmName = builder.realmName;
		this.username = builder.username;

	}

	public static GetApiKeyRequest of(Function<Builder, ObjectBuilder<GetApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API key id of the API key to be retrieved
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API key name of the API key to be retrieved
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * flag to query API keys owned by the currently authenticated user
	 * <p>
	 * API name: {@code owner}
	 */
	@Nullable
	public final Boolean owner() {
		return this.owner;
	}

	/**
	 * realm name of the user who created this API key to be retrieved
	 * <p>
	 * API name: {@code realm_name}
	 */
	@Nullable
	public final String realmName() {
		return this.realmName;
	}

	/**
	 * user name of the user who created this API key to be retrieved
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetApiKeyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetApiKeyRequest> {
		@Nullable
		private String id;

		@Nullable
		private String name;

		@Nullable
		private Boolean owner;

		@Nullable
		private String realmName;

		@Nullable
		private String username;

		/**
		 * API key id of the API key to be retrieved
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API key name of the API key to be retrieved
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * flag to query API keys owned by the currently authenticated user
		 * <p>
		 * API name: {@code owner}
		 */
		public final Builder owner(@Nullable Boolean value) {
			this.owner = value;
			return this;
		}

		/**
		 * realm name of the user who created this API key to be retrieved
		 * <p>
		 * API name: {@code realm_name}
		 */
		public final Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * user name of the user who created this API key to be retrieved
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetApiKeyRequest build() {
			_checkSingleUse();

			return new GetApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_api_key}".
	 */
	public static final Endpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_api_key",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_security/api_key";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.owner != null) {
					params.put("owner", String.valueOf(request.owner));
				}
				if (request.name != null) {
					params.put("name", request.name);
				}
				if (request.id != null) {
					params.put("id", request.id);
				}
				if (request.realmName != null) {
					params.put("realm_name", request.realmName);
				}
				if (request.username != null) {
					params.put("username", request.username);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetApiKeyResponse._DESERIALIZER);
}
