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

// typedef: security._types.RoleDescriptorRead

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RoleDescriptorRead">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleDescriptorRead implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	private final List<RemoteIndicesPrivileges> remoteIndices;

	private final List<RemoteClusterPrivileges> remoteCluster;

	private final List<GlobalPrivilege> global;

	private final List<ApplicationPrivileges> applications;

	private final Map<String, JsonData> metadata;

	private final List<String> runAs;

	@Nullable
	private final String description;

	@Nullable
	private final Restriction restriction;

	private final Map<String, JsonData> transientMetadata;

	// ---------------------------------------------------------------------------------------------

	private RoleDescriptorRead(Builder builder) {

		this.cluster = ApiTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.remoteIndices = ApiTypeHelper.unmodifiable(builder.remoteIndices);
		this.remoteCluster = ApiTypeHelper.unmodifiable(builder.remoteCluster);
		this.global = ApiTypeHelper.unmodifiable(builder.global);
		this.applications = ApiTypeHelper.unmodifiable(builder.applications);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);
		this.description = builder.description;
		this.restriction = builder.restriction;
		this.transientMetadata = ApiTypeHelper.unmodifiable(builder.transientMetadata);

	}

	public static RoleDescriptorRead of(Function<Builder, ObjectBuilder<RoleDescriptorRead>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A list of cluster privileges. These privileges define the cluster
	 * level actions that API keys are able to execute.
	 * <p>
	 * API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - A list of indices permissions entries.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<IndicesPrivileges> indices() {
		return this.indices;
	}

	/**
	 * A list of indices permissions for remote clusters.
	 * <p>
	 * API name: {@code remote_indices}
	 */
	public final List<RemoteIndicesPrivileges> remoteIndices() {
		return this.remoteIndices;
	}

	/**
	 * A list of cluster permissions for remote clusters. NOTE: This is limited a
	 * subset of the cluster permissions.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final List<RemoteClusterPrivileges> remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * An object defining global privileges. A global privilege is a form of cluster
	 * privilege that is request-aware. Support for global privileges is currently
	 * limited to the management of application privileges.
	 * <p>
	 * API name: {@code global}
	 */
	public final List<GlobalPrivilege> global() {
		return this.global;
	}

	/**
	 * A list of application privilege entries
	 * <p>
	 * API name: {@code applications}
	 */
	public final List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * Optional meta-data. Within the metadata object, keys that begin with
	 * <code>_</code> are reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * A list of users that the API keys can impersonate.
	 * <p>
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * An optional description of the role descriptor.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * A restriction for when the role descriptor is allowed to be effective.
	 * <p>
	 * API name: {@code restriction}
	 */
	@Nullable
	public final Restriction restriction() {
		return this.restriction;
	}

	/**
	 * API name: {@code transient_metadata}
	 */
	public final Map<String, JsonData> transientMetadata() {
		return this.transientMetadata;
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
		if (ApiTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartArray();
			for (GlobalPrivilege item0 : this.global) {
				item0.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.restriction != null) {
			generator.writeKey("restriction");
			this.restriction.serialize(generator, mapper);

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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptorRead}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RoleDescriptorRead> {
		private List<String> cluster;

		private List<IndicesPrivileges> indices;

		@Nullable
		private List<RemoteIndicesPrivileges> remoteIndices;

		@Nullable
		private List<RemoteClusterPrivileges> remoteCluster;

		@Nullable
		private List<GlobalPrivilege> global;

		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private List<String> runAs;

		@Nullable
		private String description;

		@Nullable
		private Restriction restriction;

		@Nullable
		private Map<String, JsonData> transientMetadata;

		/**
		 * Required - A list of cluster privileges. These privileges define the cluster
		 * level actions that API keys are able to execute.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final Builder cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return this;
		}

		/**
		 * Required - A list of cluster privileges. These privileges define the cluster
		 * level actions that API keys are able to execute.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final Builder cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return this;
		}

		/**
		 * Required - A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<IndicesPrivileges> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(IndicesPrivileges value, IndicesPrivileges... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return indices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * A list of indices permissions for remote clusters.
		 * <p>
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>remoteIndices</code>.
		 */
		public final Builder remoteIndices(List<RemoteIndicesPrivileges> list) {
			this.remoteIndices = _listAddAll(this.remoteIndices, list);
			return this;
		}

		/**
		 * A list of indices permissions for remote clusters.
		 * <p>
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds one or more values to <code>remoteIndices</code>.
		 */
		public final Builder remoteIndices(RemoteIndicesPrivileges value, RemoteIndicesPrivileges... values) {
			this.remoteIndices = _listAdd(this.remoteIndices, value, values);
			return this;
		}

		/**
		 * A list of indices permissions for remote clusters.
		 * <p>
		 * API name: {@code remote_indices}
		 * <p>
		 * Adds a value to <code>remoteIndices</code> using a builder lambda.
		 */
		public final Builder remoteIndices(
				Function<RemoteIndicesPrivileges.Builder, ObjectBuilder<RemoteIndicesPrivileges>> fn) {
			return remoteIndices(fn.apply(new RemoteIndicesPrivileges.Builder()).build());
		}

		/**
		 * A list of cluster permissions for remote clusters. NOTE: This is limited a
		 * subset of the cluster permissions.
		 * <p>
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(List<RemoteClusterPrivileges> list) {
			this.remoteCluster = _listAddAll(this.remoteCluster, list);
			return this;
		}

		/**
		 * A list of cluster permissions for remote clusters. NOTE: This is limited a
		 * subset of the cluster permissions.
		 * <p>
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds one or more values to <code>remoteCluster</code>.
		 */
		public final Builder remoteCluster(RemoteClusterPrivileges value, RemoteClusterPrivileges... values) {
			this.remoteCluster = _listAdd(this.remoteCluster, value, values);
			return this;
		}

		/**
		 * A list of cluster permissions for remote clusters. NOTE: This is limited a
		 * subset of the cluster permissions.
		 * <p>
		 * API name: {@code remote_cluster}
		 * <p>
		 * Adds a value to <code>remoteCluster</code> using a builder lambda.
		 */
		public final Builder remoteCluster(
				Function<RemoteClusterPrivileges.Builder, ObjectBuilder<RemoteClusterPrivileges>> fn) {
			return remoteCluster(fn.apply(new RemoteClusterPrivileges.Builder()).build());
		}

		/**
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>global</code>.
		 */
		public final Builder global(List<GlobalPrivilege> list) {
			this.global = _listAddAll(this.global, list);
			return this;
		}

		/**
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 * <p>
		 * Adds one or more values to <code>global</code>.
		 */
		public final Builder global(GlobalPrivilege value, GlobalPrivilege... values) {
			this.global = _listAdd(this.global, value, values);
			return this;
		}

		/**
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 * <p>
		 * Adds a value to <code>global</code> using a builder lambda.
		 */
		public final Builder global(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn) {
			return global(fn.apply(new GlobalPrivilege.Builder()).build());
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>applications</code>.
		 */
		public final Builder applications(List<ApplicationPrivileges> list) {
			this.applications = _listAddAll(this.applications, list);
			return this;
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds one or more values to <code>applications</code>.
		 */
		public final Builder applications(ApplicationPrivileges value, ApplicationPrivileges... values) {
			this.applications = _listAdd(this.applications, value, values);
			return this;
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds a value to <code>applications</code> using a builder lambda.
		 */
		public final Builder applications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return applications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * Optional meta-data. Within the metadata object, keys that begin with
		 * <code>_</code> are reserved for system usage.
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
		 * Optional meta-data. Within the metadata object, keys that begin with
		 * <code>_</code> are reserved for system usage.
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
		 * A list of users that the API keys can impersonate.
		 * <p>
		 * API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final Builder runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return this;
		}

		/**
		 * A list of users that the API keys can impersonate.
		 * <p>
		 * API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final Builder runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return this;
		}

		/**
		 * An optional description of the role descriptor.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * A restriction for when the role descriptor is allowed to be effective.
		 * <p>
		 * API name: {@code restriction}
		 */
		public final Builder restriction(@Nullable Restriction value) {
			this.restriction = value;
			return this;
		}

		/**
		 * A restriction for when the role descriptor is allowed to be effective.
		 * <p>
		 * API name: {@code restriction}
		 */
		public final Builder restriction(Function<Restriction.Builder, ObjectBuilder<Restriction>> fn) {
			return this.restriction(fn.apply(new Restriction.Builder()).build());
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoleDescriptorRead}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptorRead build() {
			_checkSingleUse();

			return new RoleDescriptorRead(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptorRead}
	 */
	public static final JsonpDeserializer<RoleDescriptorRead> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoleDescriptorRead::setupRoleDescriptorReadDeserializer);

	protected static void setupRoleDescriptorReadDeserializer(ObjectDeserializer<RoleDescriptorRead.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices",
				"index");
		op.add(Builder::remoteIndices, JsonpDeserializer.arrayDeserializer(RemoteIndicesPrivileges._DESERIALIZER),
				"remote_indices");
		op.add(Builder::remoteCluster, JsonpDeserializer.arrayDeserializer(RemoteClusterPrivileges._DESERIALIZER),
				"remote_cluster");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege._DESERIALIZER), "global");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::restriction, Restriction._DESERIALIZER, "restriction");
		op.add(Builder::transientMetadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"transient_metadata");

	}

}
