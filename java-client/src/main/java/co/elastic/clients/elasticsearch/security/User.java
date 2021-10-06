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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.User
@JsonpDeserializable
public class User implements JsonpSerializable {
	@Nullable
	private final String email;

	@Nullable
	private final String fullName;

	private final Map<String, JsonData> metadata;

	private final List<String> roles;

	private final String username;

	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	public User(AbstractBuilder<?> builder) {

		this.email = builder.email;
		this.fullName = builder.fullName;
		this.metadata = ModelTypeHelper.unmodifiableNonNull(builder.metadata, "metadata");
		this.roles = ModelTypeHelper.unmodifiableNonNull(builder.roles, "roles");
		this.username = Objects.requireNonNull(builder.username, "username");
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");

	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public String email() {
		return this.email;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public String fullName() {
		return this.fullName;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public boolean enabled() {
		return this.enabled;
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

		generator.writeKey("metadata");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("roles");
		generator.writeStartArray();
		for (String item0 : this.roles) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link User}.
	 */
	public static class Builder extends User.AbstractBuilder<Builder> implements ObjectBuilder<User> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link User}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public User build() {

			return new User(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private String email;

		@Nullable
		private String fullName;

		private Map<String, JsonData> metadata;

		private List<String> roles;

		private String username;

		private Boolean enabled;

		/**
		 * API name: {@code email}
		 */
		public BuilderT email(@Nullable String value) {
			this.email = value;
			return self();
		}

		/**
		 * API name: {@code full_name}
		 */
		public BuilderT fullName(@Nullable String value) {
			this.fullName = value;
			return self();
		}

		/**
		 * Required - API name: {@code metadata}
		 */
		public BuilderT metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public BuilderT putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return self();
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public BuilderT roles(List<String> value) {
			this.roles = value;
			return self();
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public BuilderT roles(String... value) {
			this.roles = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public BuilderT addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return self();
		}

		/**
		 * Required - API name: {@code username}
		 */
		public BuilderT username(String value) {
			this.username = value;
			return self();
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public BuilderT enabled(boolean value) {
			this.enabled = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link User}
	 */
	public static final JsonpDeserializer<User> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			User::setupUserDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupUserDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(AbstractBuilder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(AbstractBuilder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(AbstractBuilder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"roles");
		op.add(AbstractBuilder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
