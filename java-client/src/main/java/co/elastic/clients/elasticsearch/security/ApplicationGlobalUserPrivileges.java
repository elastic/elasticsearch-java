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

// typedef: security._types.ApplicationGlobalUserPrivileges
@JsonpDeserializable
public final class ApplicationGlobalUserPrivileges implements JsonpSerializable {
	private final ManageUserPrivileges manage;

	// ---------------------------------------------------------------------------------------------

	public ApplicationGlobalUserPrivileges(Builder builder) {

		this.manage = Objects.requireNonNull(builder.manage, "manage");

	}

	/**
	 * API name: {@code manage}
	 */
	public ManageUserPrivileges manage() {
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

		generator.writeKey("manage");
		this.manage.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApplicationGlobalUserPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<ApplicationGlobalUserPrivileges> {
		private ManageUserPrivileges manage;

		/**
		 * API name: {@code manage}
		 */
		public Builder manage(ManageUserPrivileges value) {
			this.manage = value;
			return this;
		}

		/**
		 * API name: {@code manage}
		 */
		public Builder manage(Function<ManageUserPrivileges.Builder, ObjectBuilder<ManageUserPrivileges>> fn) {
			return this.manage(fn.apply(new ManageUserPrivileges.Builder()).build());
		}

		/**
		 * Builds a {@link ApplicationGlobalUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationGlobalUserPrivileges build() {

			return new ApplicationGlobalUserPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApplicationGlobalUserPrivileges}
	 */
	public static final JsonpDeserializer<ApplicationGlobalUserPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApplicationGlobalUserPrivileges::setupApplicationGlobalUserPrivilegesDeserializer,
					Builder::build);

	protected static void setupApplicationGlobalUserPrivilegesDeserializer(
			DelegatingDeserializer<ApplicationGlobalUserPrivileges.Builder> op) {

		op.add(Builder::manage, ManageUserPrivileges._DESERIALIZER, "manage");

	}

}
