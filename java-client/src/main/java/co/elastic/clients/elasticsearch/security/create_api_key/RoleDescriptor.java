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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_api_key.RoleDescriptor
@JsonpDeserializable
public class RoleDescriptor implements JsonpSerializable {
	private final List<String> cluster;

	private final List<IndexPrivileges> index;

	private final List<ApplicationPrivileges> applications;

	// ---------------------------------------------------------------------------------------------

	private RoleDescriptor(Builder builder) {

		this.cluster = ModelTypeHelper.unmodifiableRequired(builder.cluster, this, "cluster");
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.applications = ModelTypeHelper.unmodifiable(builder.applications);

	}

	public static RoleDescriptor of(Function<Builder, ObjectBuilder<RoleDescriptor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final List<IndexPrivileges> index() {
		return this.index;
	}

	/**
	 * API name: {@code applications}
	 */
	public final List<ApplicationPrivileges> applications() {
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

		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (IndexPrivileges item0 : this.index) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.applications)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleDescriptor> {
		private List<String> cluster;

		private List<IndexPrivileges> index;

		@Nullable
		private List<ApplicationPrivileges> applications;

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
		 * Required - API name: {@code index}
		 */
		public final Builder index(List<IndexPrivileges> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(IndexPrivileges... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		@SafeVarargs
		public final Builder index(Function<IndexPrivileges.Builder, ObjectBuilder<IndexPrivileges>>... fns) {
			this.index = new ArrayList<>(fns.length);
			for (Function<IndexPrivileges.Builder, ObjectBuilder<IndexPrivileges>> fn : fns) {
				this.index.add(fn.apply(new IndexPrivileges.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public final Builder applications(@Nullable List<ApplicationPrivileges> value) {
			this.applications = value;
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public final Builder applications(ApplicationPrivileges... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
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
			RoleDescriptor::setupRoleDescriptorDeserializer, Builder::build);

	protected static void setupRoleDescriptorDeserializer(DelegatingDeserializer<RoleDescriptor.Builder> op) {

		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(IndexPrivileges._DESERIALIZER), "index");
		op.add(Builder::applications, JsonpDeserializer.arrayDeserializer(ApplicationPrivileges._DESERIALIZER),
				"applications");

	}

}
