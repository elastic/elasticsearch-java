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
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: security.change_password.Request

/**
 * Changes the passwords of users in the native realm and built-in users.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.change_password.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChangePasswordRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String password;

	@Nullable
	private final String passwordHash;

	@Nullable
	private final Refresh refresh;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private ChangePasswordRequest(Builder builder) {

		this.password = builder.password;
		this.passwordHash = builder.passwordHash;
		this.refresh = builder.refresh;
		this.username = builder.username;

	}

	public static ChangePasswordRequest of(Function<Builder, ObjectBuilder<ChangePasswordRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The new password value. Passwords must be at least 6 characters long.
	 * <p>
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * A hash of the new password value. This must be produced using the same
	 * hashing algorithm as has been configured for password storage. For more
	 * details, see the explanation of the
	 * <code>xpack.security.authc.password_hashing.algorithm</code> setting.
	 * <p>
	 * API name: {@code password_hash}
	 */
	@Nullable
	public final String passwordHash() {
		return this.passwordHash;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * The user whose password you want to change. If you do not specify this
	 * parameter, the password is changed for the current user.
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
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

		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.passwordHash != null) {
			generator.writeKey("password_hash");
			generator.write(this.passwordHash);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChangePasswordRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ChangePasswordRequest> {
		@Nullable
		private String password;

		@Nullable
		private String passwordHash;

		@Nullable
		private Refresh refresh;

		@Nullable
		private String username;

		/**
		 * The new password value. Passwords must be at least 6 characters long.
		 * <p>
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * A hash of the new password value. This must be produced using the same
		 * hashing algorithm as has been configured for password storage. For more
		 * details, see the explanation of the
		 * <code>xpack.security.authc.password_hashing.algorithm</code> setting.
		 * <p>
		 * API name: {@code password_hash}
		 */
		public final Builder passwordHash(@Nullable String value) {
			this.passwordHash = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * The user whose password you want to change. If you do not specify this
		 * parameter, the password is changed for the current user.
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
		 * Builds a {@link ChangePasswordRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChangePasswordRequest build() {
			_checkSingleUse();

			return new ChangePasswordRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChangePasswordRequest}
	 */
	public static final JsonpDeserializer<ChangePasswordRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChangePasswordRequest::setupChangePasswordRequestDeserializer);

	protected static void setupChangePasswordRequestDeserializer(ObjectDeserializer<ChangePasswordRequest.Builder> op) {

		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::passwordHash, JsonpDeserializer.stringDeserializer(), "password_hash");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.change_password}".
	 */
	public static final Endpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.change_password",

			// Request method
			request -> {
				return "PUT";

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
					SimpleEndpoint.pathEncode(request.username, buf);
					buf.append("/_password");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/_password");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _username = 1 << 0;

				int propsSet = 0;

				if (request.username() != null)
					propsSet |= _username;

				if (propsSet == (_username)) {
					params.put("username", request.username);
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ChangePasswordResponse._DESERIALIZER);
}
