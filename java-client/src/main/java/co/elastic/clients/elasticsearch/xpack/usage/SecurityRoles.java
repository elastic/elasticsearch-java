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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRoles
@JsonpDeserializable
public class SecurityRoles implements JsonpSerializable {
	private final SecurityRolesNative native_;

	private final SecurityRolesDls dls;

	private final SecurityRolesFile file;

	// ---------------------------------------------------------------------------------------------

	private SecurityRoles(Builder builder) {

		this.native_ = ModelTypeHelper.requireNonNull(builder.native_, this, "native_");
		this.dls = ModelTypeHelper.requireNonNull(builder.dls, this, "dls");
		this.file = ModelTypeHelper.requireNonNull(builder.file, this, "file");

	}

	public static SecurityRoles of(Function<Builder, ObjectBuilder<SecurityRoles>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code native}
	 */
	public final SecurityRolesNative native_() {
		return this.native_;
	}

	/**
	 * Required - API name: {@code dls}
	 */
	public final SecurityRolesDls dls() {
		return this.dls;
	}

	/**
	 * Required - API name: {@code file}
	 */
	public final SecurityRolesFile file() {
		return this.file;
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

		generator.writeKey("native");
		this.native_.serialize(generator, mapper);

		generator.writeKey("dls");
		this.dls.serialize(generator, mapper);

		generator.writeKey("file");
		this.file.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRoles}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SecurityRoles> {
		private SecurityRolesNative native_;

		private SecurityRolesDls dls;

		private SecurityRolesFile file;

		/**
		 * Required - API name: {@code native}
		 */
		public final Builder native_(SecurityRolesNative value) {
			this.native_ = value;
			return this;
		}

		/**
		 * Required - API name: {@code native}
		 */
		public final Builder native_(Function<SecurityRolesNative.Builder, ObjectBuilder<SecurityRolesNative>> fn) {
			return this.native_(fn.apply(new SecurityRolesNative.Builder()).build());
		}

		/**
		 * Required - API name: {@code dls}
		 */
		public final Builder dls(SecurityRolesDls value) {
			this.dls = value;
			return this;
		}

		/**
		 * Required - API name: {@code dls}
		 */
		public final Builder dls(Function<SecurityRolesDls.Builder, ObjectBuilder<SecurityRolesDls>> fn) {
			return this.dls(fn.apply(new SecurityRolesDls.Builder()).build());
		}

		/**
		 * Required - API name: {@code file}
		 */
		public final Builder file(SecurityRolesFile value) {
			this.file = value;
			return this;
		}

		/**
		 * Required - API name: {@code file}
		 */
		public final Builder file(Function<SecurityRolesFile.Builder, ObjectBuilder<SecurityRolesFile>> fn) {
			return this.file(fn.apply(new SecurityRolesFile.Builder()).build());
		}

		/**
		 * Builds a {@link SecurityRoles}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRoles build() {
			_checkSingleUse();

			return new SecurityRoles(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRoles}
	 */
	public static final JsonpDeserializer<SecurityRoles> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SecurityRoles::setupSecurityRolesDeserializer, Builder::build);

	protected static void setupSecurityRolesDeserializer(DelegatingDeserializer<SecurityRoles.Builder> op) {

		op.add(Builder::native_, SecurityRolesNative._DESERIALIZER, "native");
		op.add(Builder::dls, SecurityRolesDls._DESERIALIZER, "dls");
		op.add(Builder::file, SecurityRolesFile._DESERIALIZER, "file");

	}

}
