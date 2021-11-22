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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_role.Role
@JsonpDeserializable
public class Role implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	private final Map<String, JsonData> metadata;

	private final List<String> runAs;

	private final TransientMetadata transientMetadata;

	private final List<ApplicationPrivileges> applications;

	private final List<RoleTemplate> roleTemplates;

	// ---------------------------------------------------------------------------------------------

	private Role(Builder builder) {

		this.cluster = ModelTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.metadata = ModelTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.runAs = ModelTypeHelper.unmodifiableRequired(builder.runAs, this, "runAs");
		this.transientMetadata = ModelTypeHelper.requireNonNull(builder.transientMetadata, this, "transientMetadata");
		this.applications = ModelTypeHelper.unmodifiableRequired(builder.applications, this, "applications");
		this.roleTemplates = ModelTypeHelper.unmodifiable(builder.roleTemplates);

	}

	public static Role of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<IndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * Required - API name: {@code transient_metadata}
	 */
	public final TransientMetadata transientMetadata() {
		return this.transientMetadata;
	}

	/**
	 * Required - API name: {@code applications}
	 */
	public final List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * API name: {@code role_templates}
	 */
	public final List<RoleTemplate> roleTemplates() {
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

		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesPrivileges item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("transient_metadata");
		this.transientMetadata.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.roleTemplates)) {
			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (RoleTemplate item0 : this.roleTemplates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Role}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Role> {
		private List<String> cluster;

		private List<IndicesPrivileges> indices;

		private Map<String, JsonData> metadata;

		private List<String> runAs;

		private TransientMetadata transientMetadata;

		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<RoleTemplate> roleTemplates;

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(List<String> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(String... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<IndicesPrivileges> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(IndicesPrivileges... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(
				Function<ListBuilder<IndicesPrivileges, IndicesPrivileges.Builder>, ObjectBuilder<List<IndicesPrivileges>>> fn) {
			return indices(fn.apply(new ListBuilder<>(IndicesPrivileges.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code metadata}
		 */
		public final Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 */
		public final Builder runAs(List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 */
		public final Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(TransientMetadata value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(Consumer<TransientMetadata.Builder> fn) {
			TransientMetadata.Builder builder = new TransientMetadata.Builder();
			fn.accept(builder);
			return this.transientMetadata(builder.build());
		}

		/**
		 * Required - API name: {@code applications}
		 */
		public final Builder applications(List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 */
		public final Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 */
		public final Builder applications(
				Function<ListBuilder<ApplicationPrivileges, ApplicationPrivileges.Builder>, ObjectBuilder<List<ApplicationPrivileges>>> fn) {
			return applications(fn.apply(new ListBuilder<>(ApplicationPrivileges.Builder::new)).build());
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(@Nullable List<RoleTemplate> value) {
			this.roleTemplates = value;
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(RoleTemplate... value) {
			this.roleTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 */
		public final Builder roleTemplates(
				Function<ListBuilder<RoleTemplate, RoleTemplate.Builder>, ObjectBuilder<List<RoleTemplate>>> fn) {
			return roleTemplates(fn.apply(new ListBuilder<>(RoleTemplate.Builder::new)).build());
		}

		/**
		 * Builds a {@link Role}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Role build() {
			_checkSingleUse();

			return new Role(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Role}
	 */
	public static final JsonpDeserializer<Role> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Role::setupRoleDeserializer);

	protected static void setupRoleDeserializer(ObjectDeserializer<Role.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadata._DESERIALIZER, "transient_metadata");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(RoleTemplate._DESERIALIZER),
				"role_templates");

	}

}
