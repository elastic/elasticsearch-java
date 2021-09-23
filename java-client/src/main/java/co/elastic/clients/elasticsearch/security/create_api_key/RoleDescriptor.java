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

package co.elastic.clients.elasticsearch.security.create_api_key;

import co.elastic.clients.elasticsearch.security.ApplicationPrivileges;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_api_key.RoleDescriptor
public final class RoleDescriptor implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndexPrivileges> index;

	@Nullable
	private final List<ApplicationPrivileges> applications;

	// ---------------------------------------------------------------------------------------------

	public RoleDescriptor(Builder builder) {

		this.cluster = Objects.requireNonNull(builder.cluster, "cluster");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.applications = builder.applications;

	}

	/**
	 * API name: {@code cluster}
	 */
	public List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code index}
	 */
	public List<IndexPrivileges> index() {
		return this.index;
	}

	/**
	 * API name: {@code applications}
	 */
	@Nullable
	public List<ApplicationPrivileges> applications() {
		return this.applications;
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

		generator.writeKey("index");
		generator.writeStartArray();
		for (IndexPrivileges item0 : this.index) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.applications != null) {

			generator.writeKey("applications");
			generator.writeStartArray();
			for (ApplicationPrivileges item0 : this.applications) {
				item0.serialize(generator, mapper);

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

		private List<IndexPrivileges> index;

		@Nullable
		private List<ApplicationPrivileges> applications;

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
		 * API name: {@code index}
		 */
		public Builder index(List<IndexPrivileges> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(IndexPrivileges... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(IndexPrivileges value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Set {@link #index(List)} to a singleton list.
		 */
		public Builder index(Function<IndexPrivileges.Builder, ObjectBuilder<IndexPrivileges>> fn) {
			return this.index(fn.apply(new IndexPrivileges.Builder()).build());
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(Function<IndexPrivileges.Builder, ObjectBuilder<IndexPrivileges>> fn) {
			return this.addIndex(fn.apply(new IndexPrivileges.Builder()).build());
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
	 * Json deserializer for {@link RoleDescriptor}
	 */
	public static final JsonpDeserializer<RoleDescriptor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RoleDescriptor::setupRoleDescriptorDeserializer);

	protected static void setupRoleDescriptorDeserializer(DelegatingDeserializer<RoleDescriptor.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(IndexPrivileges.DESERIALIZER), "index");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges.DESERIALIZER),
				"applications");

	}

}
