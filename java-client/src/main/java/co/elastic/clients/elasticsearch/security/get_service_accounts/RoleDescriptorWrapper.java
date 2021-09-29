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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_accounts.RoleDescriptorWrapper
@JsonpDeserializable
public final class RoleDescriptorWrapper implements JsonpSerializable {
	private final RoleDescriptor roleDescriptor;

	// ---------------------------------------------------------------------------------------------

	public RoleDescriptorWrapper(Builder builder) {

		this.roleDescriptor = Objects.requireNonNull(builder.roleDescriptor, "role_descriptor");

	}

	public RoleDescriptorWrapper(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code role_descriptor}
	 */
	public RoleDescriptor roleDescriptor() {
		return this.roleDescriptor;
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

		generator.writeKey("role_descriptor");
		this.roleDescriptor.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptorWrapper}.
	 */
	public static class Builder implements ObjectBuilder<RoleDescriptorWrapper> {
		private RoleDescriptor roleDescriptor;

		/**
		 * API name: {@code role_descriptor}
		 */
		public Builder roleDescriptor(RoleDescriptor value) {
			this.roleDescriptor = value;
			return this;
		}

		/**
		 * API name: {@code role_descriptor}
		 */
		public Builder roleDescriptor(Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return this.roleDescriptor(fn.apply(new RoleDescriptor.Builder()).build());
		}

		/**
		 * Builds a {@link RoleDescriptorWrapper}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptorWrapper build() {

			return new RoleDescriptorWrapper(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptorWrapper}
	 */
	public static final JsonpDeserializer<RoleDescriptorWrapper> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoleDescriptorWrapper::setupRoleDescriptorWrapperDeserializer, Builder::build);

	protected static void setupRoleDescriptorWrapperDeserializer(
			DelegatingDeserializer<RoleDescriptorWrapper.Builder> op) {

		op.add(Builder::roleDescriptor, RoleDescriptor._DESERIALIZER, "role_descriptor");

	}

}
