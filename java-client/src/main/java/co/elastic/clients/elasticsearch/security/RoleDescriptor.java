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
	private final String description;

	private final Map<String, JsonData> transientMetadata;

	// ---------------------------------------------------------------------------------------------

	protected RoleDescriptor(AbstractBuilder<?> builder) {

		this.cluster = ApiTypeHelper.unmodifiable(builder.cluster);
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.global = ApiTypeHelper.unmodifiable(builder.global);
		this.applications = ApiTypeHelper.unmodifiable(builder.applications);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);
		this.description = builder.description;
		this.transientMetadata = ApiTypeHelper.unmodifiable(builder.transientMetadata);

	}

	public static RoleDescriptor roleDescriptorOf(Function<Builder, ObjectBuilder<RoleDescriptor>> fn) {
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
	 * A list of users that the API keys can impersonate. <em>Note</em>: in
	 * Serverless, the run-as feature is disabled. For API compatibility, you can
	 * still specify an empty <code>run_as</code> field, but a non-empty list will
	 * be rejected.
	 * <p>
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * Optional description of the role descriptor
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
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
	 * Builder for {@link RoleDescriptor}.
	 */

	public static class Builder extends RoleDescriptor.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RoleDescriptor> {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
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
		private String description;

		@Nullable
		private Map<String, JsonData> transientMetadata;

		/**
		 * A list of cluster privileges. These privileges define the cluster level
		 * actions that API keys are able to execute.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final BuilderT cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return self();
		}

		/**
		 * A list of cluster privileges. These privileges define the cluster level
		 * actions that API keys are able to execute.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final BuilderT cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return self();
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final BuilderT indices(List<IndicesPrivileges> list) {
			this.indices = _listAddAll(this.indices, list);
			return self();
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final BuilderT indices(IndicesPrivileges value, IndicesPrivileges... values) {
			this.indices = _listAdd(this.indices, value, values);
			return self();
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final BuilderT indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
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
		public final BuilderT global(List<GlobalPrivilege> list) {
			this.global = _listAddAll(this.global, list);
			return self();
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
		public final BuilderT global(GlobalPrivilege value, GlobalPrivilege... values) {
			this.global = _listAdd(this.global, value, values);
			return self();
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
		public final BuilderT global(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn) {
			return global(fn.apply(new GlobalPrivilege.Builder()).build());
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>applications</code>.
		 */
		public final BuilderT applications(List<ApplicationPrivileges> list) {
			this.applications = _listAddAll(this.applications, list);
			return self();
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds one or more values to <code>applications</code>.
		 */
		public final BuilderT applications(ApplicationPrivileges value, ApplicationPrivileges... values) {
			this.applications = _listAdd(this.applications, value, values);
			return self();
		}

		/**
		 * A list of application privilege entries
		 * <p>
		 * API name: {@code applications}
		 * <p>
		 * Adds a value to <code>applications</code> using a builder lambda.
		 */
		public final BuilderT applications(
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
		public final BuilderT metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return self();
		}

		/**
		 * Optional meta-data. Within the metadata object, keys that begin with
		 * <code>_</code> are reserved for system usage.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final BuilderT metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return self();
		}

		/**
		 * A list of users that the API keys can impersonate. <em>Note</em>: in
		 * Serverless, the run-as feature is disabled. For API compatibility, you can
		 * still specify an empty <code>run_as</code> field, but a non-empty list will
		 * be rejected.
		 * <p>
		 * API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final BuilderT runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return self();
		}

		/**
		 * A list of users that the API keys can impersonate. <em>Note</em>: in
		 * Serverless, the run-as feature is disabled. For API compatibility, you can
		 * still specify an empty <code>run_as</code> field, but a non-empty list will
		 * be rejected.
		 * <p>
		 * API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final BuilderT runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return self();
		}

		/**
		 * Optional description of the role descriptor
		 * <p>
		 * API name: {@code description}
		 */
		public final BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * API name: {@code transient_metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transientMetadata</code>.
		 */
		public final BuilderT transientMetadata(Map<String, JsonData> map) {
			this.transientMetadata = _mapPutAll(this.transientMetadata, map);
			return self();
		}

		/**
		 * API name: {@code transient_metadata}
		 * <p>
		 * Adds an entry to <code>transientMetadata</code>.
		 */
		public final BuilderT transientMetadata(String key, JsonData value) {
			this.transientMetadata = _mapPut(this.transientMetadata, key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptor}
	 */
	public static final JsonpDeserializer<RoleDescriptor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleDescriptor::setupRoleDescriptorDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRoleDescriptorDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(AbstractBuilder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER),
				"indices", "index");
		op.add(AbstractBuilder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege._DESERIALIZER), "global");
		op.add(AbstractBuilder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(AbstractBuilder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(AbstractBuilder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"run_as");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::transientMetadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"transient_metadata");

	}

}
