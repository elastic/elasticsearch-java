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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: security._types.ApplicationGlobalUserPrivileges
@JsonpDeserializable
public class ApplicationGlobalUserPrivileges implements JsonpSerializable {
	private final ManageUserPrivileges manage;

	// ---------------------------------------------------------------------------------------------

	private ApplicationGlobalUserPrivileges(Builder builder) {

		this.manage = ModelTypeHelper.requireNonNull(builder.manage, this, "manage");

	}

	public static ApplicationGlobalUserPrivileges of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code manage}
	 */
	public final ManageUserPrivileges manage() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ApplicationGlobalUserPrivileges> {
		private ManageUserPrivileges manage;

		/**
		 * Required - API name: {@code manage}
		 */
		public final Builder manage(ManageUserPrivileges value) {
			this.manage = value;
			return this;
		}

		/**
		 * Required - API name: {@code manage}
		 */
		public final Builder manage(Consumer<ManageUserPrivileges.Builder> fn) {
			ManageUserPrivileges.Builder builder = new ManageUserPrivileges.Builder();
			fn.accept(builder);
			return this.manage(builder.build());
		}

		/**
		 * Builds a {@link ApplicationGlobalUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApplicationGlobalUserPrivileges build() {
			_checkSingleUse();

			return new ApplicationGlobalUserPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApplicationGlobalUserPrivileges}
	 */
	public static final JsonpDeserializer<ApplicationGlobalUserPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApplicationGlobalUserPrivileges::setupApplicationGlobalUserPrivilegesDeserializer);

	protected static void setupApplicationGlobalUserPrivilegesDeserializer(
			ObjectDeserializer<ApplicationGlobalUserPrivileges.Builder> op) {

		op.add(Builder::manage, ManageUserPrivileges._DESERIALIZER, "manage");

	}

}
