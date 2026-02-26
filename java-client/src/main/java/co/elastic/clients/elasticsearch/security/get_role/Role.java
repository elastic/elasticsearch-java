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

package co.elastic.clients.elasticsearch.security.get_role;

import co.elastic.clients.elasticsearch.security.ApplicationPrivileges;
import co.elastic.clients.elasticsearch.security.ClusterPrivilege;
import co.elastic.clients.elasticsearch.security.IndicesPrivileges;
import co.elastic.clients.elasticsearch.security.RemoteClusterPrivileges;
import co.elastic.clients.elasticsearch.security.RemoteIndicesPrivileges;
import co.elastic.clients.elasticsearch.security.RoleTemplate;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
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

// typedef: security.get_role.Role

/**
 *
 * @see <a href="../../doc-files/api-spec.html#security.get_role.Role">API
 *      specification</a>
 */
@JsonpDeserializable
public class Role implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	private final List<RemoteIndicesPrivileges> remoteIndices;

	private final List<RemoteClusterPrivileges> remoteCluster;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String description;

	private final List<String> runAs;

	private final Map<String, JsonData> transientMetadata;

	private final List<ApplicationPrivileges> applications;

	private final List<RoleTemplate> roleTemplates;

	private final Map<String, Map<String, Map<String, List<String>>>> global;

	// ---------------------------------------------------------------------------------------------

	private Role(Builder builder) {

		this.cluster = ApiTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.remoteIndices = ApiTypeHelper.unmodifiable(builder.remoteIndices);
		this.remoteCluster = ApiTypeHelper.unmodifiable(builder.remoteCluster);
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.description = builder.description;
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);
		this.transientMetadata = ApiTypeHelper.unmodifiable(builder.transientMetadata);
		this.applications = ApiTypeHelper.unmodifiableRequired(builder.applications, this, "applications");
		this.roleTemplates = ApiTypeHelper.unmodifiable(builder.roleTemplates);
		this.global = ApiTypeHelper.unmodifiable(builder.global);

	}

	public static Role of(Function<Builder, ObjectBuilder<Role>> fn) {
		return fn.apply(new Builder()).build();
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
	 * API name: {@code remote_indices}
	 */
	public final List<RemoteIndicesPrivileges> remoteIndices() {
		return this.remoteIndices;
	}

	/**
	 * API name: {@code remote_cluster}
	 */
	public final List<RemoteClusterPrivileges> remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * API name: {@code transient_metadata}
	 */
	public final Map<String, JsonData> transientMetadata() {
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
	 * API name: {@code global}
	 */
	public final Map<String, Map<String, Map<String, List<String>>>> global() {
		return this.global;
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

		if (ApiTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesPrivileges item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.remoteIndices)) {
			generator.writeKey("remote_indices");
			generator.writeStartArray();
			for (RemoteIndicesPrivileges item0 : this.remoteIndices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.remoteCluster)) {
			generator.writeKey("remote_cluster");
			generator.writeStartArray();
			for (RemoteClusterPrivileges item0 : this.remoteCluster) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

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
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.transientMetadata)) {
			generator.writeKey("transient_metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transientMetadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.roleTemplates)) {
			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (RoleTemplate item0 : this.roleTemplates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, Map<String, List<String>>>> item0 : this.global.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, Map<String, List<String>>> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.writeStartObject();
						if (item1.getValue() != null) {
							for (Map.Entry<String, List<String>> item2 : item1.getValue().entrySet()) {
								generator.writeKey(item2.getKey());
								generator.writeStartArray();
								if (item2.getValue() != null) {
									for (String item3 : item2.getValue()) {
										generator.write(item3);

									}
								}
								generator.writeEnd();

							}
						}
						generator.writeEnd();

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Role}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Role> {
		private List<String> cluster;

		private List<IndicesPrivileges> indices;

		@Nullable
		private List<RemoteIndicesPrivileges> remoteIndices;

		@Nullable
		private List<RemoteClusterPrivileges> remoteCluster;

		private Map<String, JsonData> metadata;

		@Nullable
		private String description;

		@Nullable
		private List<String> runAs;

		@Nullable
		private Map<String, JsonData> transientMetadata;

		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<RoleTemplate> roleTemplates;

		@Nullable
		private Map<String, Map<String, Map<String, List<String>>>> global;

		public Builder() {
		}
		private Builder(Role instance) {
			this.cluster = instance.cluster;
			this.indices = instance.indices;
			this.remoteIndices = instance.remoteIndices;
			this.remoteCluster = instance.remoteCluster;
			this.metadata = instance.metadata;
			this.description = instance.description;
			this.runAs = instance.runAs;
			this.transientMetadata = instance.transientMetadata;
			this.applications = instance.applications;
			this.roleTemplates = instance.roleTemplates;
			this.global = instance.global;

		}
		/**
		 * Required - API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final Builder cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final Builder cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 * <p>
		 * Adds one or more enum values to <code>cluster</code>.
		 */
		public final Builder cluster(ClusterPrivilege value, ClusterPrivilege... values) {
			this.cluster = _listAdd(this.cluster, value.jsonValue(),
					Arrays.stream(values).map(ClusterPrivilege::jsonValue).toArray(String[]::new));
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<IndicesPrivileges> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(IndicesPrivileges value, IndicesPrivileges... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return indices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>remoteIndices</code>.
		 */
		public final Builder remoteIndices(List<RemoteIndicesPrivileges> list) {
			this.remoteIndices = _listAddAll(this.remoteIndices, list);
			return this;
		}

		/**
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds one or more values to <code>remoteIndices</code>.
		 */
		public final Builder remoteIndices(RemoteIndicesPrivileges value, RemoteIndicesPrivileges... values) {
			this.remoteIndices = _listAdd(this.remoteIndices, value, values);
			return this;
		}

		/**
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds a value to <code>remoteIndices</code> using a builder lambda.
		 */
		public final Builder remoteIndices(
				Function<RemoteIndicesPrivileges.Builder, ObjectBuilder<RemoteIndicesPrivileges>> fn) {
			return remoteIndices(fn.apply(new RemoteIndicesPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(List<RemoteClusterPrivileges> list) {
			this.remoteCluster = _listAddAll(this.remoteCluster, list);
			return this;
		}

		/**
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds one or more values to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(RemoteClusterPrivileges value, RemoteClusterPrivileges... values) {
			this.remoteCluster = _listAdd(this.remoteCluster, value, values);
			return this;
		}

		/**
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds a value to <code>remoteCluster</code> using a builder lambda.
		 */
		public final Builder remoteCluster(
				Function<RemoteClusterPrivileges.Builder, ObjectBuilder<RemoteClusterPrivileges>> fn) {
			return remoteCluster(fn.apply(new RemoteClusterPrivileges.Builder()).build());
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
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final Builder runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return this;
		}

		/**
		 * API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final Builder runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transientMetadata</code>.
		 */
		public final Builder transientMetadata(Map<String, JsonData> map) {
			this.transientMetadata = _mapPutAll(this.transientMetadata, map);
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 * <p>
		 * Adds an entry to <code>transientMetadata</code>.
		 */
		public final Builder transientMetadata(String key, JsonData value) {
			this.transientMetadata = _mapPut(this.transientMetadata, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>applications</code>.
		 */
		public final Builder applications(List<ApplicationPrivileges> list) {
			this.applications = _listAddAll(this.applications, list);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds one or more values to <code>applications</code>.
		 */
		public final Builder applications(ApplicationPrivileges value, ApplicationPrivileges... values) {
			this.applications = _listAdd(this.applications, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code applications}
		 * <p>
		 * Adds a value to <code>applications</code> using a builder lambda.
		 */
		public final Builder applications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return applications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code role_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roleTemplates</code>.
		 */
		public final Builder roleTemplates(List<RoleTemplate> list) {
			this.roleTemplates = _listAddAll(this.roleTemplates, list);
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 * <p>
		 * Adds one or more values to <code>roleTemplates</code>.
		 */
		public final Builder roleTemplates(RoleTemplate value, RoleTemplate... values) {
			this.roleTemplates = _listAdd(this.roleTemplates, value, values);
			return this;
		}

		/**
		 * API name: {@code role_templates}
		 * <p>
		 * Adds a value to <code>roleTemplates</code> using a builder lambda.
		 */
		public final Builder roleTemplates(Function<RoleTemplate.Builder, ObjectBuilder<RoleTemplate>> fn) {
			return roleTemplates(fn.apply(new RoleTemplate.Builder()).build());
		}

		/**
		 * API name: {@code global}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>global</code>.
		 */
		public final Builder global(Map<String, Map<String, Map<String, List<String>>>> map) {
			this.global = _mapPutAll(this.global, map);
			return this;
		}

		/**
		 * API name: {@code global}
		 * <p>
		 * Adds an entry to <code>global</code>.
		 */
		public final Builder global(String key, Map<String, Map<String, List<String>>> value) {
			this.global = _mapPut(this.global, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
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
		op.add(Builder::remoteIndices, JsonpDeserializer.arrayDeserializer(RemoteIndicesPrivileges._DESERIALIZER),
				"remote_indices");
		op.add(Builder::remoteCluster, JsonpDeserializer.arrayDeserializer(RemoteClusterPrivileges._DESERIALIZER),
				"remote_cluster");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"transient_metadata");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(RoleTemplate._DESERIALIZER),
				"role_templates");
		op.add(Builder::global,
				JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(
								JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())))),
				"global");

	}

}
