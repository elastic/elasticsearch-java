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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security._types.User
public class User implements ToJsonp {
	@Nullable
	private final String email;

	@Nullable
	private final String fullName;

	private final Map<String, JsonValue> metadata;

	private final List<String> roles;

	private final String username;

	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected User(AbstractBuilder<?> builder) {

		this.email = builder.email;
		this.fullName = builder.fullName;
		this.metadata = Objects.requireNonNull(builder.metadata, "metadata");
		this.roles = Objects.requireNonNull(builder.roles, "roles");
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
	 * API name: {@code metadata}
	 */
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code roles}
	 */
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

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

		private Map<String, JsonValue> metadata;

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
		 * API name: {@code metadata}
		 */
		public BuilderT metadata(Map<String, JsonValue> value) {
			this.metadata = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public BuilderT putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return self();
		}

		/**
		 * API name: {@code roles}
		 */
		public BuilderT roles(List<String> value) {
			this.roles = value;
			return self();
		}

		/**
		 * API name: {@code roles}
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
		 * API name: {@code username}
		 */
		public BuilderT username(String value) {
			this.username = value;
			return self();
		}

		/**
		 * API name: {@code enabled}
		 */
		public BuilderT enabled(Boolean value) {
			this.enabled = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for User
	 */
	public static final JsonpValueParser<User> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			User::setupUserParser);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupUserParser(
			DelegatingJsonpValueParser<BuilderT> op) {

		op.add(AbstractBuilder::email, JsonpValueParser.stringParser(), "email");
		op.add(AbstractBuilder::fullName, JsonpValueParser.stringParser(), "full_name");
		op.add(AbstractBuilder::metadata, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()),
				"metadata");
		op.add(AbstractBuilder::roles, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "roles");
		op.add(AbstractBuilder::username, JsonpValueParser.stringParser(), "username");
		op.add(AbstractBuilder::enabled, JsonpValueParser.booleanParser(), "enabled");

	}

}
