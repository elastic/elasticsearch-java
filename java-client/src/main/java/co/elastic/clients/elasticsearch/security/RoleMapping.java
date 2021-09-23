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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleMapping
public final class RoleMapping implements JsonpSerializable {
	private final Boolean enabled;

	private final Map<String, JsonData> metadata;

	private final List<String> roles;

	private final RoleMappingRule rules;

	@Nullable
	private final List<JsonValue> roleTemplates;

	// ---------------------------------------------------------------------------------------------

	public RoleMapping(Builder builder) {

		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.metadata = Objects.requireNonNull(builder.metadata, "metadata");
		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.rules = Objects.requireNonNull(builder.rules, "rules");
		this.roleTemplates = builder.roleTemplates;

	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code metadata}
	 */
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code roles}
	 */
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code rules}
	 */
	public RoleMappingRule rules() {
		return this.rules;
	}

	/**
	 * API name: {@code role_templates}
	 */
	@Nullable
	public List<JsonValue> roleTemplates() {
		return this.roleTemplates;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

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

		generator.writeKey("rules");
		this.rules.serialize(generator, mapper);

		if (this.roleTemplates != null) {

			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (JsonValue item0 : this.roleTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleMapping}.
	 */
	public static class Builder implements ObjectBuilder<RoleMapping> {
		private Boolean enabled;

		private Map<String, JsonData> metadata;

		private List<String> roles;

		private RoleMappingRule rules;

		@Nullable
		private List<JsonValue> roleTemplates;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public Builder rules(RoleMappingRule value) {
			this.rules = value;
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public Builder rules(Function<RoleMappingRule.Builder, ObjectBuilder<RoleMappingRule>> fn) {
			return this.rules(fn.apply(new RoleMappingRule.Builder()).build());
		}

		/**
		 * API name: {@code role_templates}
		 */
		public Builder roleTemplates(@Nullable List<JsonValue> value) {
			this.roleTemplates = value;
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public Builder roleTemplates(JsonValue... value) {
			this.roleTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roleTemplates(List)}, creating the list if needed.
		 */
		public Builder addRoleTemplates(JsonValue value) {
			if (this.roleTemplates == null) {
				this.roleTemplates = new ArrayList<>();
			}
			this.roleTemplates.add(value);
			return this;
		}

		/**
		 * Builds a {@link RoleMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleMapping build() {

			return new RoleMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleMapping}
	 */
	public static final JsonpDeserializer<RoleMapping> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RoleMapping::setupRoleMappingDeserializer);

	protected static void setupRoleMappingDeserializer(DelegatingDeserializer<RoleMapping.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::rules, RoleMappingRule.DESERIALIZER, "rules");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"role_templates");

	}

}
