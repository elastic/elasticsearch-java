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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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

// typedef: security.put_user.Request

/**
 * Create or update users.
 * <p>
 * Add and update users in the native realm. A password is required for adding a
 * new user but is optional when updating an existing user. To change a user's
 * password without updating any other fields, use the change password API.
 * 
 * @see <a href="../doc-files/api-spec.html#security.put_user.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutUserRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String email;

	@Nullable
	private final Boolean enabled;

	@Nullable
	private final String fullName;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String password;

	@Nullable
	private final String passwordHash;

	@Nullable
	private final Refresh refresh;

	private final List<String> roles;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	private PutUserRequest(Builder builder) {

		this.email = builder.email;
		this.enabled = builder.enabled;
		this.fullName = builder.fullName;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.password = builder.password;
		this.passwordHash = builder.passwordHash;
		this.refresh = builder.refresh;
		this.roles = ApiTypeHelper.unmodifiable(builder.roles);
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");

	}

	public static PutUserRequest of(Function<Builder, ObjectBuilder<PutUserRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The email of the user.
	 * <p>
	 * API name: {@code email}
	 */
	@Nullable
	public final String email() {
		return this.email;
	}

	/**
	 * Specifies whether the user is enabled.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * The full name of the user.
	 * <p>
	 * API name: {@code full_name}
	 */
	@Nullable
	public final String fullName() {
		return this.fullName;
	}

	/**
	 * Arbitrary metadata that you want to associate with the user.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The user's password. Passwords must be at least 6 characters long. When
	 * adding a user, one of <code>password</code> or <code>password_hash</code> is
	 * required. When updating an existing user, the password is optional, so that
	 * other fields on the user (such as their roles) may be updated without
	 * modifying the user's password
	 * <p>
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * A hash of the user's password. This must be produced using the same hashing
	 * algorithm as has been configured for password storage. For more details, see
	 * the explanation of the
	 * <code>xpack.security.authc.password_hashing.algorithm</code> setting in the
	 * user cache and password hash algorithm documentation. Using this parameter
	 * allows the client to pre-hash the password for performance and/or
	 * confidentiality reasons. The <code>password</code> parameter and the
	 * <code>password_hash</code> parameter cannot be used in the same request.
	 * <p>
	 * API name: {@code password_hash}
	 */
	@Nullable
	public final String passwordHash() {
		return this.passwordHash;
	}

	/**
	 * Valid values are <code>true</code>, <code>false</code>, and
	 * <code>wait_for</code>. These values have the same meaning as in the index
	 * API, but the default value for this API is true.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * A set of roles the user has. The roles determine the user's access
	 * permissions. To create a user without any roles, specify an empty list
	 * (<code>[]</code>).
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - An identifier for the user.
	 * <p>
	 * NOTE: Usernames must be at least 1 and no more than 507 characters. They can
	 * contain alphanumeric characters (a-z, A-Z, 0-9), spaces, punctuation, and
	 * printable symbols in the Basic Latin (ASCII) block. Leading or trailing
	 * whitespace is not allowed.
	 * <p>
	 * API name: {@code username}
	 */
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

		if (this.email != null) {
			generator.writeKey("email");
			generator.write(this.email);

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.fullName != null) {
			generator.writeKey("full_name");
			generator.write(this.fullName);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.passwordHash != null) {
			generator.writeKey("password_hash");
			generator.write(this.passwordHash);

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutUserRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutUserRequest> {
		@Nullable
		private String email;

		@Nullable
		private Boolean enabled;

		@Nullable
		private String fullName;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String password;

		@Nullable
		private String passwordHash;

		@Nullable
		private Refresh refresh;

		@Nullable
		private List<String> roles;

		private String username;

		/**
		 * The email of the user.
		 * <p>
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * Specifies whether the user is enabled.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * The full name of the user.
		 * <p>
		 * API name: {@code full_name}
		 */
		public final Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the user.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the user.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * The user's password. Passwords must be at least 6 characters long. When
		 * adding a user, one of <code>password</code> or <code>password_hash</code> is
		 * required. When updating an existing user, the password is optional, so that
		 * other fields on the user (such as their roles) may be updated without
		 * modifying the user's password
		 * <p>
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * A hash of the user's password. This must be produced using the same hashing
		 * algorithm as has been configured for password storage. For more details, see
		 * the explanation of the
		 * <code>xpack.security.authc.password_hashing.algorithm</code> setting in the
		 * user cache and password hash algorithm documentation. Using this parameter
		 * allows the client to pre-hash the password for performance and/or
		 * confidentiality reasons. The <code>password</code> parameter and the
		 * <code>password_hash</code> parameter cannot be used in the same request.
		 * <p>
		 * API name: {@code password_hash}
		 */
		public final Builder passwordHash(@Nullable String value) {
			this.passwordHash = value;
			return this;
		}

		/**
		 * Valid values are <code>true</code>, <code>false</code>, and
		 * <code>wait_for</code>. These values have the same meaning as in the index
		 * API, but the default value for this API is true.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A set of roles the user has. The roles determine the user's access
		 * permissions. To create a user without any roles, specify an empty list
		 * (<code>[]</code>).
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * A set of roles the user has. The roles determine the user's access
		 * permissions. To create a user without any roles, specify an empty list
		 * (<code>[]</code>).
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Required - An identifier for the user.
		 * <p>
		 * NOTE: Usernames must be at least 1 and no more than 507 characters. They can
		 * contain alphanumeric characters (a-z, A-Z, 0-9), spaces, punctuation, and
		 * printable symbols in the Basic Latin (ASCII) block. Leading or trailing
		 * whitespace is not allowed.
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutUserRequest build() {
			_checkSingleUse();

			return new PutUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutUserRequest}
	 */
	public static final JsonpDeserializer<PutUserRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutUserRequest::setupPutUserRequestDeserializer);

	protected static void setupPutUserRequestDeserializer(ObjectDeserializer<PutUserRequest.Builder> op) {

		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::passwordHash, JsonpDeserializer.stringDeserializer(), "password_hash");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_user}".
	 */
	public static final Endpoint<PutUserRequest, PutUserResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.put_user",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.username, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _username = 1 << 0;

				int propsSet = 0;

				propsSet |= _username;

				if (propsSet == (_username)) {
					params.put("username", request.username);
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

			}, SimpleEndpoint.emptyMap(), true, PutUserResponse._DESERIALIZER);
}
