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

// typedef: security._types.RoleDescriptor

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.RoleDescriptor">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleDescriptor implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	private final List<GlobalPrivilege> global;

	private final List<ApplicationPrivileges> applications;

	private final Map<String, JsonData> metadata;

	private final List<String> runAs;

	@Nullable
	private final TransientMetadataConfig transientMetadata;

	// ---------------------------------------------------------------------------------------------

	private RoleDescriptor(Builder builder) {

		this.cluster = ApiTypeHelper.unmodifiable(builder.cluster);
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.global = ApiTypeHelper.unmodifiable(builder.global);
		this.applications = ApiTypeHelper.unmodifiable(builder.applications);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);
		this.transientMetadata = builder.transientMetadata;

	}

	public static RoleDescriptor of(Function<Builder, ObjectBuilder<RoleDescriptor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A list of cluster privileges. These privileges define the cluster level
	 * actions that API keys are able to execute.
	 * <p>
	 * API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * A list of indices permissions entries.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<IndicesPrivileges> indices() {
		return this.indices;
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
	 * API name: {@code transient_metadata}
	 */
	@Nullable
	public final TransientMetadataConfig transientMetadata() {
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
		if (this.transientMetadata != null) {
			generator.writeKey("transient_metadata");
			this.transientMetadata.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RoleDescriptor> {
		@Nullable
		private List<String> cluster;

		@Nullable
		private List<IndicesPrivileges> indices;

		@Nullable
		private List<GlobalPrivilege> global;

		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private List<String> runAs;

		@Nullable
		private TransientMetadataConfig transientMetadata;

		/**
		 * A list of cluster privileges. These privileges define the cluster level
		 * actions that API keys are able to execute.
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
		 * A list of cluster privileges. These privileges define the cluster level
		 * actions that API keys are able to execute.
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
		 * A list of indices permissions entries.
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
		 * A list of indices permissions entries.
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
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return indices(fn.apply(new IndicesPrivileges.Builder()).build());
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
		 * API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(@Nullable TransientMetadataConfig value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(
				Function<TransientMetadataConfig.Builder, ObjectBuilder<TransientMetadataConfig>> fn) {
			return this.transientMetadata(fn.apply(new TransientMetadataConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoleDescriptor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptor build() {
			_checkSingleUse();

			return new RoleDescriptor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptor}
	 */
	public static final JsonpDeserializer<RoleDescriptor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleDescriptor::setupRoleDescriptorDeserializer);

	protected static void setupRoleDescriptorDeserializer(ObjectDeserializer<RoleDescriptor.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices",
				"index");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege._DESERIALIZER), "global");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadataConfig._DESERIALIZER, "transient_metadata");

	}

}
