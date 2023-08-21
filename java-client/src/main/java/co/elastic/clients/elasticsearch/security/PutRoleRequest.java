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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_role.Request

/**
 * The role management APIs are generally the preferred way to manage roles,
 * rather than using file-based role management. The create or update roles API
 * cannot update roles that are defined in roles files.
 * 
 * @see <a href="../doc-files/api-spec.html#security.put_role.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRoleRequest extends RequestBase implements JsonpSerializable {
	private final List<ApplicationPrivileges> applications;

	private final List<String> cluster;

	private final Map<String, JsonData> global;

	private final List<IndicesPrivileges> indices;

	private final Map<String, JsonData> metadata;

	private final String name;

	@Nullable
	private final Refresh refresh;

	private final List<String> runAs;

	@Nullable
	private final TransientMetadataConfig transientMetadata;

	// ---------------------------------------------------------------------------------------------

	private PutRoleRequest(Builder builder) {

		this.applications = ApiTypeHelper.unmodifiable(builder.applications);
		this.cluster = ApiTypeHelper.unmodifiable(builder.cluster);
		this.global = ApiTypeHelper.unmodifiable(builder.global);
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.refresh = builder.refresh;
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);
		this.transientMetadata = builder.transientMetadata;

	}

	public static PutRoleRequest of(Function<Builder, ObjectBuilder<PutRoleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A list of application privilege entries.
	 * <p>
	 * API name: {@code applications}
	 */
	public final List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * A list of cluster privileges. These privileges define the cluster-level
	 * actions for users with this role.
	 * <p>
	 * API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * An object defining global privileges. A global privilege is a form of cluster
	 * privilege that is request-aware. Support for global privileges is currently
	 * limited to the management of application privileges.
	 * <p>
	 * API name: {@code global}
	 */
	public final Map<String, JsonData> global() {
		return this.global;
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
	 * Optional metadata. Within the metadata object, keys that begin with an
	 * underscore (<code>_</code>) are reserved for system use.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - The name of the role.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * A list of users that the owners of this role can impersonate.
	 * <p>
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
	}

	/**
	 * Indicates roles that might be incompatible with the current cluster license,
	 * specifically roles with document and field level security. When the cluster
	 * license doesn’t allow certain features for a given role, this parameter is
	 * updated dynamically to list the incompatible features. If
	 * <code>enabled</code> is <code>false</code>, the role is ignored, but is still
	 * listed in the response from the authenticate API.
	 * <p>
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

		if (ApiTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.global.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
		if (this.transientMetadata != null) {
			generator.writeKey("transient_metadata");
			this.transientMetadata.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutRoleRequest> {
		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<String> cluster;

		@Nullable
		private Map<String, JsonData> global;

		@Nullable
		private List<IndicesPrivileges> indices;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		@Nullable
		private Refresh refresh;

		@Nullable
		private List<String> runAs;

		@Nullable
		private TransientMetadataConfig transientMetadata;

		/**
		 * A list of application privilege entries.
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
		 * A list of application privilege entries.
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
		 * A list of application privilege entries.
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
		 * A list of cluster privileges. These privileges define the cluster-level
		 * actions for users with this role.
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
		 * A list of cluster privileges. These privileges define the cluster-level
		 * actions for users with this role.
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
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>global</code>.
		 */
		public final Builder global(Map<String, JsonData> map) {
			this.global = _mapPutAll(this.global, map);
			return this;
		}

		/**
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 * <p>
		 * Adds an entry to <code>global</code>.
		 */
		public final Builder global(String key, JsonData value) {
			this.global = _mapPut(this.global, key, value);
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
		 * Optional metadata. Within the metadata object, keys that begin with an
		 * underscore (<code>_</code>) are reserved for system use.
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
		 * Optional metadata. Within the metadata object, keys that begin with an
		 * underscore (<code>_</code>) are reserved for system use.
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
		 * Required - The name of the role.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A list of users that the owners of this role can impersonate.
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
		 * A list of users that the owners of this role can impersonate.
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
		 * Indicates roles that might be incompatible with the current cluster license,
		 * specifically roles with document and field level security. When the cluster
		 * license doesn’t allow certain features for a given role, this parameter is
		 * updated dynamically to list the incompatible features. If
		 * <code>enabled</code> is <code>false</code>, the role is ignored, but is still
		 * listed in the response from the authenticate API.
		 * <p>
		 * API name: {@code transient_metadata}
		 */
		public final Builder transientMetadata(@Nullable TransientMetadataConfig value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * Indicates roles that might be incompatible with the current cluster license,
		 * specifically roles with document and field level security. When the cluster
		 * license doesn’t allow certain features for a given role, this parameter is
		 * updated dynamically to list the incompatible features. If
		 * <code>enabled</code> is <code>false</code>, the role is ignored, but is still
		 * listed in the response from the authenticate API.
		 * <p>
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
		 * Builds a {@link PutRoleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleRequest build() {
			_checkSingleUse();

			return new PutRoleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleRequest}
	 */
	public static final JsonpDeserializer<PutRoleRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutRoleRequest::setupPutRoleRequestDeserializer);

	protected static void setupPutRoleRequestDeserializer(ObjectDeserializer<PutRoleRequest.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::global, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadataConfig._DESERIALIZER, "transient_metadata");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role}".
	 */
	public static final Endpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.put_role",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRoleResponse._DESERIALIZER);
}
