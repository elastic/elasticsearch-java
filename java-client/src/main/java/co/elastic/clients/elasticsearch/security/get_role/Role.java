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
import co.elastic.clients.elasticsearch.security.TransientMetadataConfig;
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

	private final Map<String, JsonData> metadata;

	private final List<String> runAs;

	private final TransientMetadataConfig transientMetadata;

	private final List<ApplicationPrivileges> applications;

	private final List<RoleTemplate> roleTemplates;

	private final Map<String, Map<String, Map<String, List<String>>>> global;

	// ---------------------------------------------------------------------------------------------

	private Role(Builder builder) {

		this.cluster = ApiTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.runAs = ApiTypeHelper.unmodifiableRequired(builder.runAs, this, "runAs");
		this.transientMetadata = ApiTypeHelper.requireNonNull(builder.transientMetadata, this, "transientMetadata");
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
	public final TransientMetadataConfig transientMetadata() {
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
		generator.writeKey("transient_metadata");
		this.transientMetadata.serialize(generator, mapper);

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

		private Map<String, JsonData> metadata;

		private List<String> runAs;

		private TransientMetadataConfig transientMetadata;

		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<RoleTemplate> roleTemplates;

		@Nullable
		private Map<String, Map<String, Map<String, List<String>>>> global;

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
		 * Required - API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final Builder runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return this;
		}

		/**
		 * Required - API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final Builder runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(TransientMetadataConfig value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(
				Function<TransientMetadataConfig.Builder, ObjectBuilder<TransientMetadataConfig>> fn) {
			return this.transientMetadata(fn.apply(new TransientMetadataConfig.Builder()).build());
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
		op.add(Builder::transientMetadata, TransientMetadataConfig._DESERIALIZER, "transient_metadata");
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
