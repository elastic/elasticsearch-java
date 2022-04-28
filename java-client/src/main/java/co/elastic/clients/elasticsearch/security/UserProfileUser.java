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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.UserProfileUser

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.UserProfileUser">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserProfileUser implements JsonpSerializable {
	@Nullable
	private final String email;

	@Nullable
	private final String fullName;

	private final Map<String, JsonData> metadata;

	private final List<String> roles;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	private UserProfileUser(Builder builder) {

		this.email = builder.email;
		this.fullName = builder.fullName;
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");

	}

	public static UserProfileUser of(Function<Builder, ObjectBuilder<UserProfileUser>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final String email() {
		return this.email;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public final String fullName() {
		return this.fullName;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code username}
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
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("username");
		generator.write(this.username);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserProfileUser}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<UserProfileUser> {
		@Nullable
		private String email;

		@Nullable
		private String fullName;

		private Map<String, JsonData> metadata;

		private List<String> roles;

		private String username;

		/**
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public final Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code username}
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
		 * Builds a {@link UserProfileUser}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserProfileUser build() {
			_checkSingleUse();

			return new UserProfileUser(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserProfileUser}
	 */
	public static final JsonpDeserializer<UserProfileUser> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			UserProfileUser::setupUserProfileUserDeserializer);

	protected static void setupUserProfileUserDeserializer(ObjectDeserializer<UserProfileUser.Builder> op) {

		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

}
