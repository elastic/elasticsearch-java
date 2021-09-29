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

package co.elastic.clients.elasticsearch.security.get_role;

import co.elastic.clients.elasticsearch.security.ApplicationPrivileges;
import co.elastic.clients.elasticsearch.security.IndicesPrivileges;
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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_role.Role
@JsonpDeserializable
public final class Role implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	private final Map<String, JsonData> metadata;

	private final List<String> runAs;

	private final TransientMetadata transientMetadata;

	private final List<ApplicationPrivileges> applications;

	@Nullable
	private final List<JsonValue /* security.get_role.RoleTemplate */> roleTemplates;

	// ---------------------------------------------------------------------------------------------

	public Role(Builder builder) {

		this.cluster = ModelTypeHelper.unmodifiableNonNull(builder.cluster, "cluster");
		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");
		this.metadata = ModelTypeHelper.unmodifiableNonNull(builder.metadata, "metadata");
		this.runAs = ModelTypeHelper.unmodifiableNonNull(builder.runAs, "run_as");
		this.transientMetadata = Objects.requireNonNull(builder.transientMetadata, "transient_metadata");
		this.applications = ModelTypeHelper.unmodifiableNonNull(builder.applications, "applications");
		this.roleTemplates = ModelTypeHelper.unmodifiable(builder.roleTemplates);

	}

	public Role(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code cluster}
	 */
	public List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<IndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code metadata}
	 */
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code run_as}
	 */
	public List<String> runAs() {
		return this.runAs;
	}

	/**
	 * API name: {@code transient_metadata}
	 */
	public TransientMetadata transientMetadata() {
		return this.transientMetadata;
	}

	/**
	 * API name: {@code applications}
	 */
	public List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * API name: {@code role_templates}
	 */
	@Nullable
	public List<JsonValue /* security.get_role.RoleTemplate */> roleTemplates() {
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

		generator.writeKey("cluster");
		generator.writeStartArray();
		for (String item0 : this.cluster) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("indices");
		generator.writeStartArray();
		for (IndicesPrivileges item0 : this.indices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("metadata");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("run_as");
		generator.writeStartArray();
		for (String item0 : this.runAs) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("transient_metadata");
		this.transientMetadata.serialize(generator, mapper);

		generator.writeKey("applications");
		generator.writeStartArray();
		for (ApplicationPrivileges item0 : this.applications) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.roleTemplates != null) {

			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (JsonValue /* security.get_role.RoleTemplate */ item0 : this.roleTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Role}.
	 */
	public static class Builder implements ObjectBuilder<Role> {
		private List<String> cluster;

		private List<IndicesPrivileges> indices;

		private Map<String, JsonData> metadata;

		private List<String> runAs;

		private TransientMetadata transientMetadata;

		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<JsonValue /* security.get_role.RoleTemplate */> roleTemplates;

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(List<String> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(String... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #cluster(List)}, creating the list if needed. 4
		 */
		public Builder addCluster(String value) {
			if (this.cluster == null) {
				this.cluster = new ArrayList<>();
			}
			this.cluster.add(value);
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<IndicesPrivileges> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(IndicesPrivileges... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed. 4
		 */
		public Builder addIndices(IndicesPrivileges value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Set {@link #indices(List)} to a singleton list.
		 */
		public Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return this.indices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed. 5
		 */
		public Builder addIndices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return this.addIndices(fn.apply(new IndicesPrivileges.Builder()).build());
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
		 * API name: {@code run_as}
		 */
		public Builder runAs(List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #runAs(List)}, creating the list if needed. 4
		 */
		public Builder addRunAs(String value) {
			if (this.runAs == null) {
				this.runAs = new ArrayList<>();
			}
			this.runAs.add(value);
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 */
		public Builder transientMetadata(TransientMetadata value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 */
		public Builder transientMetadata(Function<TransientMetadata.Builder, ObjectBuilder<TransientMetadata>> fn) {
			return this.transientMetadata(fn.apply(new TransientMetadata.Builder()).build());
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #applications(List)}, creating the list if needed. 4
		 */
		public Builder addApplications(ApplicationPrivileges value) {
			if (this.applications == null) {
				this.applications = new ArrayList<>();
			}
			this.applications.add(value);
			return this;
		}

		/**
		 * Set {@link #applications(List)} to a singleton list.
		 */
		public Builder applications(Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return this.applications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #applications(List)}, creating the list if needed. 5
		 */
		public Builder addApplications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return this.addApplications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code role_templates}
		 */
		public Builder roleTemplates(@Nullable List<JsonValue /* security.get_role.RoleTemplate */> value) {
			this.roleTemplates = value;
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public Builder roleTemplates(JsonValue /* security.get_role.RoleTemplate */... value) {
			this.roleTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roleTemplates(List)}, creating the list if needed. 4
		 */
		public Builder addRoleTemplates(JsonValue /* security.get_role.RoleTemplate */ value) {
			if (this.roleTemplates == null) {
				this.roleTemplates = new ArrayList<>();
			}
			this.roleTemplates.add(value);
			return this;
		}

		/**
		 * Builds a {@link Role}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Role build() {

			return new Role(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Role}
	 */
	public static final JsonpDeserializer<Role> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Role::setupRoleDeserializer, Builder::build);

	protected static void setupRoleDeserializer(DelegatingDeserializer<Role.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadata._DESERIALIZER, "transient_metadata");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"role_templates");

	}

}
