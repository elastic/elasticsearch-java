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

package co.elastic.clients.elasticsearch.security.get_service_accounts;

import co.elastic.clients.elasticsearch.security.ApplicationPrivileges;
import co.elastic.clients.elasticsearch.security.GlobalPrivilege;
import co.elastic.clients.elasticsearch.security.IndicesPrivileges;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
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

// typedef: security.get_service_accounts.RoleDescriptor
public final class RoleDescriptor implements ToJsonp {
	private final List<String> cluster;

	private final List<IndicesPrivileges> indices;

	@Nullable
	private final List<GlobalPrivilege> global;

	@Nullable
	private final List<ApplicationPrivileges> applications;

	@Nullable
	private final Map<String, JsonValue> metadata;

	@Nullable
	private final List<String> runAs;

	@Nullable
	private final Map<String, JsonValue> transientMetadata;

	// ---------------------------------------------------------------------------------------------

	protected RoleDescriptor(Builder builder) {

		this.cluster = Objects.requireNonNull(builder.cluster, "cluster");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.global = builder.global;
		this.applications = builder.applications;
		this.metadata = builder.metadata;
		this.runAs = builder.runAs;
		this.transientMetadata = builder.transientMetadata;

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
	 * API name: {@code global}
	 */
	@Nullable
	public List<GlobalPrivilege> global() {
		return this.global;
	}

	/**
	 * API name: {@code applications}
	 */
	@Nullable
	public List<ApplicationPrivileges> applications() {
		return this.applications;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code run_as}
	 */
	@Nullable
	public List<String> runAs() {
		return this.runAs;
	}

	/**
	 * API name: {@code transient_metadata}
	 */
	@Nullable
	public Map<String, JsonValue> transientMetadata() {
		return this.transientMetadata;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("cluster");
		generator.writeStartArray();
		for (String item0 : this.cluster) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("indices");
		generator.writeStartArray();
		for (IndicesPrivileges item0 : this.indices) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.global != null) {

			generator.writeKey("global");
			generator.writeStartArray();
			for (GlobalPrivilege item0 : this.global) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.applications != null) {

			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.runAs != null) {

			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.transientMetadata != null) {

			generator.writeKey("transient_metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.transientMetadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptor}.
	 */
	public static class Builder implements ObjectBuilder<RoleDescriptor> {
		private List<String> cluster;

		private List<IndicesPrivileges> indices;

		@Nullable
		private List<GlobalPrivilege> global;

		@Nullable
		private List<ApplicationPrivileges> applications;

		@Nullable
		private Map<String, JsonValue> metadata;

		@Nullable
		private List<String> runAs;

		@Nullable
		private Map<String, JsonValue> transientMetadata;

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
		 * Add a value to {@link #cluster(List)}, creating the list if needed.
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
		 * Add a value to {@link #indices(List)}, creating the list if needed.
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
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(Function<IndicesPrivileges.Builder, ObjectBuilder<IndicesPrivileges>> fn) {
			return this.addIndices(fn.apply(new IndicesPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code global}
		 */
		public Builder global(@Nullable List<GlobalPrivilege> value) {
			this.global = value;
			return this;
		}

		/**
		 * API name: {@code global}
		 */
		public Builder global(GlobalPrivilege... value) {
			this.global = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #global(List)}, creating the list if needed.
		 */
		public Builder addGlobal(GlobalPrivilege value) {
			if (this.global == null) {
				this.global = new ArrayList<>();
			}
			this.global.add(value);
			return this;
		}

		/**
		 * Set {@link #global(List)} to a singleton list.
		 */
		public Builder global(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn) {
			return this.global(fn.apply(new GlobalPrivilege.Builder()).build());
		}

		/**
		 * Add a value to {@link #global(List)}, creating the list if needed.
		 */
		public Builder addGlobal(Function<GlobalPrivilege.Builder, ObjectBuilder<GlobalPrivilege>> fn) {
			return this.addGlobal(fn.apply(new GlobalPrivilege.Builder()).build());
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(@Nullable List<ApplicationPrivileges> value) {
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
		 * Add a value to {@link #applications(List)}, creating the list if needed.
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
		 * Add a value to {@link #applications(List)}, creating the list if needed.
		 */
		public Builder addApplications(
				Function<ApplicationPrivileges.Builder, ObjectBuilder<ApplicationPrivileges>> fn) {
			return this.addApplications(fn.apply(new ApplicationPrivileges.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(@Nullable List<String> value) {
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
		 * Add a value to {@link #runAs(List)}, creating the list if needed.
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
		public Builder transientMetadata(@Nullable Map<String, JsonValue> value) {
			this.transientMetadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transientMetadata(Map)}, creating the map if
		 * needed.
		 */
		public Builder putTransientMetadata(String key, JsonValue value) {
			if (this.transientMetadata == null) {
				this.transientMetadata = new HashMap<>();
			}
			this.transientMetadata.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link RoleDescriptor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptor build() {

			return new RoleDescriptor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RoleDescriptor
	 */
	public static final JsonpDeserializer<RoleDescriptor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RoleDescriptor::setupRoleDescriptorDeserializer);

	protected static void setupRoleDescriptorDeserializer(DelegatingDeserializer<RoleDescriptor.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesPrivileges.DESERIALIZER), "indices");
		op.add(Builder::global, JsonpDeserializer.arrayDeserializer(GlobalPrivilege.DESERIALIZER), "global");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges.DESERIALIZER),
				"applications");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");
		op.add(Builder::transientMetadata,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"transient_metadata");

	}

}
