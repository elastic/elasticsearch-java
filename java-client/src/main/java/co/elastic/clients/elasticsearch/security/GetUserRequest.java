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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.get_user.Request
public final class GetUserRequest extends RequestBase {
	@Nullable
	private final List<String> username;

	// ---------------------------------------------------------------------------------------------

	public GetUserRequest(Builder builder) {

		this.username = builder.username;

	}

	/**
	 * An identifier for the user. You can specify multiple usernames as a
	 * comma-separated list. If you omit this parameter, the API retrieves
	 * information about all users.
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public List<String> username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetUserRequest> {
		@Nullable
		private List<String> username;

		/**
		 * An identifier for the user. You can specify multiple usernames as a
		 * comma-separated list. If you omit this parameter, the API retrieves
		 * information about all users.
		 * <p>
		 * API name: {@code username}
		 */
		public Builder username(@Nullable List<String> value) {
			this.username = value;
			return this;
		}

		/**
		 * An identifier for the user. You can specify multiple usernames as a
		 * comma-separated list. If you omit this parameter, the API retrieves
		 * information about all users.
		 * <p>
		 * API name: {@code username}
		 */
		public Builder username(String... value) {
			this.username = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #username(List)}, creating the list if needed.
		 */
		public Builder addUsername(String value) {
			if (this.username == null) {
				this.username = new ArrayList<>();
			}
			this.username.add(value);
			return this;
		}

		/**
		 * Builds a {@link GetUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserRequest build() {

			return new GetUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_user}".
	 */
	public static final Endpoint<GetUserRequest, GetUserResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				if (request.username() != null)
					propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					buf.append(request.username.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, GetUserResponse.DESERIALIZER);
}
