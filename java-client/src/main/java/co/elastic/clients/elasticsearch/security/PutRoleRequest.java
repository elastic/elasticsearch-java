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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.get_role.TransientMetadata;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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

// typedef: security.put_role.Request
@JsonpDeserializable
public class PutRoleRequest extends RequestBase implements JsonpSerializable {
	private final List<ApplicationPrivileges> applications;

	private final List<ClusterPrivilege> cluster;

	private final Map<String, JsonData> global;

	private final List<IndicesPrivileges> indices;

	private final Map<String, JsonData> metadata;

	private final String name;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	private final List<String> runAs;

	@Nullable
	private final TransientMetadata transientMetadata;

	// ---------------------------------------------------------------------------------------------

	private PutRoleRequest(Builder builder) {

		this.applications = ModelTypeHelper.unmodifiable(builder.applications);
		this.cluster = ModelTypeHelper.unmodifiable(builder.cluster);
		this.global = ModelTypeHelper.unmodifiable(builder.global);
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.refresh = builder.refresh;
		this.runAs = ModelTypeHelper.unmodifiable(builder.runAs);
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
	public final List<ClusterPrivilege> cluster() {
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
	 * Required - Role name
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
	public final JsonValue /* _types.Refresh */ refresh() {
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
	public final TransientMetadata transientMetadata() {
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

		if (ModelTypeHelper.isDefined(this.applications)) {
			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (ClusterPrivilege item0 : this.cluster) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.global)) {
			generator.writeKey("global");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.global.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
		if (this.transientMetadata != null) {
			generator.writeKey("transient_metadata");
			this.transientMetadata.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutRoleRequest> {
		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private List<ClusterPrivilege> cluster;

		@Nullable
		private Map<String, JsonData> global;

		@Nullable
		private List<IndicesPrivileges> indices;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private List<String> runAs;

		@Nullable
		private TransientMetadata transientMetadata;

		/**
		 * A list of application privilege entries.
		 * <p>
		 * API name: {@code applications}
		 */
		public final Builder applications(@Nullable List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * A list of application privilege entries.
		 * <p>
		 * API name: {@code applications}
		 */
		public final Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * A list of application privilege entries.
		 * <p>
		 * API name: {@code applications}
		 */
		@SafeVarargs
		public final Builder applications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>>... fns) {
			this.applications = new ArrayList<>(fns.length);
			for (Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn : fns) {
				this.applications.add(fn.apply(new ApplicationPrivileges.Builder()).build());
			}
			return this;
		}

		/**
		 * A list of cluster privileges. These privileges define the cluster-level
		 * actions for users with this role.
		 * <p>
		 * API name: {@code cluster}
		 */
		public final Builder cluster(@Nullable List<ClusterPrivilege> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * A list of cluster privileges. These privileges define the cluster-level
		 * actions for users with this role.
		 * <p>
		 * API name: {@code cluster}
		 */
		public final Builder cluster(ClusterPrivilege... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * An object defining global privileges. A global privilege is a form of cluster
		 * privilege that is request-aware. Support for global privileges is currently
		 * limited to the management of application privileges.
		 * <p>
		 * API name: {@code global}
		 */
		public final Builder global(@Nullable Map<String, JsonData> value) {
			this.global = value;
			return this;
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(@Nullable List<IndicesPrivileges> value) {
			this.indices = value;
			return this;
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(IndicesPrivileges... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * A list of indices permissions entries.
		 * <p>
		 * API name: {@code indices}
		 */
		@SafeVarargs
		public final Builder indices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>>... fns) {
			this.indices = new ArrayList<>(fns.length);
			for (Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn : fns) {
				this.indices.add(fn.apply(new IndicesPrivileges.Builder()).build());
			}
			return this;
		}

		/**
		 * Optional metadata. Within the metadata object, keys that begin with an
		 * underscore (<code>_</code>) are reserved for system use.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - Role name
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
		public final Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A list of users that the owners of this role can impersonate.
		 * <p>
		 * API name: {@code run_as}
		 */
		public final Builder runAs(@Nullable List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * A list of users that the owners of this role can impersonate.
		 * <p>
		 * API name: {@code run_as}
		 */
		public final Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
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
		public final Builder transientMetadata(@Nullable TransientMetadata value) {
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
				Function<TransientMetadata.Builder, ObjectBuilder<TransientMetadata>> fn) {
			return this.transientMetadata(fn.apply(new TransientMetadata.Builder()).build());
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
			PutRoleRequest::setupPutRoleRequestDeserializer, Builder::build);

	protected static void setupPutRoleRequestDeserializer(DelegatingDeserializer<PutRoleRequest.Builder> op) {

		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(ClusterPrivilege._DESERIALIZER), "cluster");
		op.add(Builder::global, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "global");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges._DESERIALIZER), "indices");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata, TransientMetadata._DESERIALIZER, "transient_metadata");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role}".
	 */
	public static final Endpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRoleResponse._DESERIALIZER);
}
