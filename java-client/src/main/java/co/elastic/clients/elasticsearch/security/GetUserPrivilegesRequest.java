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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_user_privileges.Request

/**
 * Retrieves security privileges for the logged in user.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_user_privileges.Request">API
 *      specification</a>
 */

public class GetUserPrivilegesRequest extends RequestBase {
	@Nullable
	private final String application;

	@Nullable
	private final String priviledge;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private GetUserPrivilegesRequest(Builder builder) {

		this.application = builder.application;
		this.priviledge = builder.priviledge;
		this.username = builder.username;

	}

	public static GetUserPrivilegesRequest of(Function<Builder, ObjectBuilder<GetUserPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name of the application. Application privileges are always associated
	 * with exactly one application. If you do not specify this parameter, the API
	 * returns information about all privileges for all applications.
	 * <p>
	 * API name: {@code application}
	 */
	@Nullable
	public final String application() {
		return this.application;
	}

	/**
	 * The name of the privilege. If you do not specify this parameter, the API
	 * returns information about all privileges for the requested application.
	 * <p>
	 * API name: {@code priviledge}
	 */
	@Nullable
	public final String priviledge() {
		return this.priviledge;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserPrivilegesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetUserPrivilegesRequest> {
		@Nullable
		private String application;

		@Nullable
		private String priviledge;

		@Nullable
		private String username;

		/**
		 * The name of the application. Application privileges are always associated
		 * with exactly one application. If you do not specify this parameter, the API
		 * returns information about all privileges for all applications.
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * The name of the privilege. If you do not specify this parameter, the API
		 * returns information about all privileges for the requested application.
		 * <p>
		 * API name: {@code priviledge}
		 */
		public final Builder priviledge(@Nullable String value) {
			this.priviledge = value;
			return this;
		}

		/**
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
		 * Builds a {@link GetUserPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserPrivilegesRequest build() {
			_checkSingleUse();

			return new GetUserPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_user_privileges}".
	 */
	public static final Endpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_user_privileges",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_security/user/_privileges";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.application != null) {
					params.put("application", request.application);
				}
				if (request.priviledge != null) {
					params.put("priviledge", request.priviledge);
				}
				if (request.username != null) {
					params.put("username", request.username);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetUserPrivilegesResponse._DESERIALIZER);
}
