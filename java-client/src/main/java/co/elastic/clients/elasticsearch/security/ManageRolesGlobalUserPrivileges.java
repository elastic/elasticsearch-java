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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: security._types.ManageRolesGlobalUserPrivileges

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.ManageRolesGlobalUserPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class ManageRolesGlobalUserPrivileges implements JsonpSerializable {
	@Nullable
	private final ManageRolesPrivileges manage;

	// ---------------------------------------------------------------------------------------------

	private ManageRolesGlobalUserPrivileges(Builder builder) {

		this.manage = builder.manage;

	}

	public static ManageRolesGlobalUserPrivileges of(
			Function<Builder, ObjectBuilder<ManageRolesGlobalUserPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The index-scoped role management privileges. Absent when the
	 * <code>role</code> section is present but grants no privileges.
	 * <p>
	 * API name: {@code manage}
	 */
	@Nullable
	public final ManageRolesPrivileges manage() {
		return this.manage;
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

		if (this.manage != null) {
			generator.writeKey("manage");
			this.manage.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ManageRolesGlobalUserPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ManageRolesGlobalUserPrivileges> {
		@Nullable
		private ManageRolesPrivileges manage;

		public Builder() {
		}
		private Builder(ManageRolesGlobalUserPrivileges instance) {
			this.manage = instance.manage;

		}
		/**
		 * The index-scoped role management privileges. Absent when the
		 * <code>role</code> section is present but grants no privileges.
		 * <p>
		 * API name: {@code manage}
		 */
		public final Builder manage(@Nullable ManageRolesPrivileges value) {
			this.manage = value;
			return this;
		}

		/**
		 * The index-scoped role management privileges. Absent when the
		 * <code>role</code> section is present but grants no privileges.
		 * <p>
		 * API name: {@code manage}
		 */
		public final Builder manage(Function<ManageRolesPrivileges.Builder, ObjectBuilder<ManageRolesPrivileges>> fn) {
			return this.manage(fn.apply(new ManageRolesPrivileges.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ManageRolesGlobalUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ManageRolesGlobalUserPrivileges build() {
			_checkSingleUse();

			return new ManageRolesGlobalUserPrivileges(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ManageRolesGlobalUserPrivileges}
	 */
	public static final JsonpDeserializer<ManageRolesGlobalUserPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ManageRolesGlobalUserPrivileges::setupManageRolesGlobalUserPrivilegesDeserializer);

	protected static void setupManageRolesGlobalUserPrivilegesDeserializer(
			ObjectDeserializer<ManageRolesGlobalUserPrivileges.Builder> op) {

		op.add(Builder::manage, ManageRolesPrivileges._DESERIALIZER, "manage");

	}

}
