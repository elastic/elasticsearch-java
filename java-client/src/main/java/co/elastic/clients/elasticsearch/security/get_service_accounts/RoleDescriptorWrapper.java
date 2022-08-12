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

import co.elastic.clients.elasticsearch.security.RoleDescriptorRead;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_accounts.RoleDescriptorWrapper

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_accounts.RoleDescriptorWrapper">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleDescriptorWrapper implements JsonpSerializable {
	private final RoleDescriptorRead roleDescriptor;

	// ---------------------------------------------------------------------------------------------

	private RoleDescriptorWrapper(Builder builder) {

		this.roleDescriptor = ApiTypeHelper.requireNonNull(builder.roleDescriptor, this, "roleDescriptor");

	}

	public static RoleDescriptorWrapper of(Function<Builder, ObjectBuilder<RoleDescriptorWrapper>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code role_descriptor}
	 */
	public final RoleDescriptorRead roleDescriptor() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleDescriptorWrapper}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RoleDescriptorWrapper> {
		private RoleDescriptorRead roleDescriptor;

		/**
		 * Required - API name: {@code role_descriptor}
		 */
		public final Builder roleDescriptor(RoleDescriptorRead value) {
			this.roleDescriptor = value;
			return this;
		}

		/**
		 * Required - API name: {@code role_descriptor}
		 */
		public final Builder roleDescriptor(
				Function<RoleDescriptorRead.Builder, ObjectBuilder<RoleDescriptorRead>> fn) {
			return this.roleDescriptor(fn.apply(new RoleDescriptorRead.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoleDescriptorWrapper}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleDescriptorWrapper build() {
			_checkSingleUse();

			return new RoleDescriptorWrapper(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleDescriptorWrapper}
	 */
	public static final JsonpDeserializer<RoleDescriptorWrapper> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoleDescriptorWrapper::setupRoleDescriptorWrapperDeserializer);

	protected static void setupRoleDescriptorWrapperDeserializer(ObjectDeserializer<RoleDescriptorWrapper.Builder> op) {

		op.add(Builder::roleDescriptor, RoleDescriptorRead._DESERIALIZER, "role_descriptor");

	}

}
