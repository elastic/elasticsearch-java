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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: security.get_user.Request

/**
 * Retrieves information about users in the native realm and built-in users.
 * 
 * @see <a href="../doc-files/api-spec.html#security.get_user.Request">API
 *      specification</a>
 */

public class GetUserRequest extends RequestBase {
	private final List<String> username;

	@Nullable
	private final Boolean withProfileUid;

	// ---------------------------------------------------------------------------------------------

	private GetUserRequest(Builder builder) {

		this.username = ApiTypeHelper.unmodifiable(builder.username);
		this.withProfileUid = builder.withProfileUid;

	}

	public static GetUserRequest of(Function<Builder, ObjectBuilder<GetUserRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An identifier for the user. You can specify multiple usernames as a
	 * comma-separated list. If you omit this parameter, the API retrieves
	 * information about all users.
	 * <p>
	 * API name: {@code username}
	 */
	public final List<String> username() {
		return this.username;
	}

	/**
	 * If true will return the User Profile ID for a user, if any.
	 * <p>
	 * API name: {@code with_profile_uid}
	 */
	@Nullable
	public final Boolean withProfileUid() {
		return this.withProfileUid;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUserRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<GetUserRequest> {
		@Nullable
		private List<String> username;

		@Nullable
		private Boolean withProfileUid;

		/**
		 * An identifier for the user. You can specify multiple usernames as a
		 * comma-separated list. If you omit this parameter, the API retrieves
		 * information about all users.
		 * <p>
		 * API name: {@code username}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>username</code>.
		 */
		public final Builder username(List<String> list) {
			this.username = _listAddAll(this.username, list);
			return this;
		}

		/**
		 * An identifier for the user. You can specify multiple usernames as a
		 * comma-separated list. If you omit this parameter, the API retrieves
		 * information about all users.
		 * <p>
		 * API name: {@code username}
		 * <p>
		 * Adds one or more values to <code>username</code>.
		 */
		public final Builder username(String value, String... values) {
			this.username = _listAdd(this.username, value, values);
			return this;
		}

		/**
		 * If true will return the User Profile ID for a user, if any.
		 * <p>
		 * API name: {@code with_profile_uid}
		 */
		public final Builder withProfileUid(@Nullable Boolean value) {
			this.withProfileUid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserRequest build() {
			_checkSingleUse();

			return new GetUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_user}".
	 */
	public static final Endpoint<GetUserRequest, GetUserResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_user",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.username()))
					propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.username.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _username = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.username()))
					propsSet |= _username;

				if (propsSet == (_username)) {
					params.put("username", request.username.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.withProfileUid != null) {
					params.put("with_profile_uid", String.valueOf(request.withProfileUid));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetUserResponse._DESERIALIZER);
}
