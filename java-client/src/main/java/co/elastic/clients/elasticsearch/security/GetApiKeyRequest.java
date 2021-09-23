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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.get_api_key.Request
public final class GetApiKeyRequest extends RequestBase {
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

	public GetApiKeyRequest(Builder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.owner = builder.owner;
		this.realmName = builder.realmName;
		this.username = builder.username;

	}

	/**
	 * API key id of the API key to be retrieved
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API key name of the API key to be retrieved
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * flag to query API keys owned by the currently authenticated user
	 * <p>
	 * API name: {@code owner}
	 */
	@Nullable
	public Boolean owner() {
		return this.owner;
	}

	/**
	 * realm name of the user who created this API key to be retrieved
	 * <p>
	 * API name: {@code realm_name}
	 */
	@Nullable
	public String realmName() {
		return this.realmName;
	}

	/**
	 * user name of the user who created this API key to be retrieved
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public String username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetApiKeyRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetApiKeyRequest> {
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
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API key name of the API key to be retrieved
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * flag to query API keys owned by the currently authenticated user
		 * <p>
		 * API name: {@code owner}
		 */
		public Builder owner(@Nullable Boolean value) {
			this.owner = value;
			return this;
		}

		/**
		 * realm name of the user who created this API key to be retrieved
		 * <p>
		 * API name: {@code realm_name}
		 */
		public Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * user name of the user who created this API key to be retrieved
		 * <p>
		 * API name: {@code username}
		 */
		public Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link GetApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetApiKeyRequest build() {

			return new GetApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_api_key}".
	 */
	public static final Endpoint<GetApiKeyRequest, GetApiKeyResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
				if (request.id != null) {
					params.put("id", request.id);
				}
				if (request.name != null) {
					params.put("name", request.name);
				}
				if (request.owner != null) {
					params.put("owner", String.valueOf(request.owner));
				}
				if (request.realmName != null) {
					params.put("realm_name", request.realmName);
				}
				if (request.username != null) {
					params.put("username", request.username);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetApiKeyResponse.DESERIALIZER);
}
