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
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_user_privileges.Request

public final class GetUserPrivilegesRequest extends RequestBase {
	@Nullable
	private final String application;

	@Nullable
	private final String priviledge;

	// ---------------------------------------------------------------------------------------------

	public GetUserPrivilegesRequest(Builder builder) {

		this.application = builder.application;
		this.priviledge = builder.priviledge;

	}

	public GetUserPrivilegesRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The name of the application. Application privileges are always associated
	 * with exactly one application. If you do not specify this parameter, the API
	 * returns information about all privileges for all applications.
	 * <p>
	 * API name: {@code application}
	 */
	@Nullable
	public String application() {
		return this.application;
	}

	/**
	 * The name of the privilege. If you do not specify this parameter, the API
	 * returns information about all privileges for the requested application.
	 * <p>
	 * API name: {@code priviledge}
	 */
	@Nullable
	public String priviledge() {
		return this.priviledge;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserPrivilegesRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetUserPrivilegesRequest> {
		@Nullable
		private String application;

		@Nullable
		private String priviledge;

		/**
		 * The name of the application. Application privileges are always associated
		 * with exactly one application. If you do not specify this parameter, the API
		 * returns information about all privileges for all applications.
		 * <p>
		 * API name: {@code application}
		 */
		public Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * The name of the privilege. If you do not specify this parameter, the API
		 * returns information about all privileges for the requested application.
		 * <p>
		 * API name: {@code priviledge}
		 */
		public Builder priviledge(@Nullable String value) {
			this.priviledge = value;
			return this;
		}

		/**
		 * Builds a {@link GetUserPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserPrivilegesRequest build() {

			return new GetUserPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_user_privileges}".
	 */
	public static final Endpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_security/user/_privileges";

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
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetUserPrivilegesResponse._DESERIALIZER);
}
