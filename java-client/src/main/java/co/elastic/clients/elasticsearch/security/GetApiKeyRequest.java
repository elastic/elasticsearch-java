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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_api_key.Request

/**
 * Retrieves information for one or more API keys. NOTE: If you have only the
 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
 * that you own. If you have <code>read_security</code>,
 * <code>manage_api_key</code> or greater privileges (including
 * <code>manage_security</code>), this API returns all API keys regardless of
 * ownership.
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

	@Nullable
	private final Boolean withLimitedBy;

	// ---------------------------------------------------------------------------------------------

	private GetApiKeyRequest(Builder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.owner = builder.owner;
		this.realmName = builder.realmName;
		this.username = builder.username;
		this.withLimitedBy = builder.withLimitedBy;

	}

	public static GetApiKeyRequest of(Function<Builder, ObjectBuilder<GetApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An API key id. This parameter cannot be used with any of <code>name</code>,
	 * <code>realm_name</code> or <code>username</code>.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * An API key name. This parameter cannot be used with any of <code>id</code>,
	 * <code>realm_name</code> or <code>username</code>. It supports prefix search
	 * with wildcard.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * A boolean flag that can be used to query API keys owned by the currently
	 * authenticated user. The <code>realm_name</code> or <code>username</code>
	 * parameters cannot be specified when this parameter is set to
	 * <code>true</code> as they are assumed to be the currently authenticated ones.
	 * <p>
	 * API name: {@code owner}
	 */
	@Nullable
	public final Boolean owner() {
		return this.owner;
	}

	/**
	 * The name of an authentication realm. This parameter cannot be used with
	 * either <code>id</code> or <code>name</code> or when <code>owner</code> flag
	 * is set to <code>true</code>.
	 * <p>
	 * API name: {@code realm_name}
	 */
	@Nullable
	public final String realmName() {
		return this.realmName;
	}

	/**
	 * The username of a user. This parameter cannot be used with either
	 * <code>id</code> or <code>name</code> or when <code>owner</code> flag is set
	 * to <code>true</code>.
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
	}

	/**
	 * Return the snapshot of the owner user's role descriptors associated with the
	 * API key. An API key's actual permission is the intersection of its assigned
	 * role descriptors and the owner user's role descriptors.
	 * <p>
	 * API name: {@code with_limited_by}
	 */
	@Nullable
	public final Boolean withLimitedBy() {
		return this.withLimitedBy;
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

		@Nullable
		private Boolean withLimitedBy;

		/**
		 * An API key id. This parameter cannot be used with any of <code>name</code>,
		 * <code>realm_name</code> or <code>username</code>.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * An API key name. This parameter cannot be used with any of <code>id</code>,
		 * <code>realm_name</code> or <code>username</code>. It supports prefix search
		 * with wildcard.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * A boolean flag that can be used to query API keys owned by the currently
		 * authenticated user. The <code>realm_name</code> or <code>username</code>
		 * parameters cannot be specified when this parameter is set to
		 * <code>true</code> as they are assumed to be the currently authenticated ones.
		 * <p>
		 * API name: {@code owner}
		 */
		public final Builder owner(@Nullable Boolean value) {
			this.owner = value;
			return this;
		}

		/**
		 * The name of an authentication realm. This parameter cannot be used with
		 * either <code>id</code> or <code>name</code> or when <code>owner</code> flag
		 * is set to <code>true</code>.
		 * <p>
		 * API name: {@code realm_name}
		 */
		public final Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * The username of a user. This parameter cannot be used with either
		 * <code>id</code> or <code>name</code> or when <code>owner</code> flag is set
		 * to <code>true</code>.
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * Return the snapshot of the owner user's role descriptors associated with the
		 * API key. An API key's actual permission is the intersection of its assigned
		 * role descriptors and the owner user's role descriptors.
		 * <p>
		 * API name: {@code with_limited_by}
		 */
		public final Builder withLimitedBy(@Nullable Boolean value) {
			this.withLimitedBy = value;
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

			// Path parameters
			request -> {
				return Collections.emptyMap();
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
				if (request.withLimitedBy != null) {
					params.put("with_limited_by", String.valueOf(request.withLimitedBy));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetApiKeyResponse._DESERIALIZER);
}
