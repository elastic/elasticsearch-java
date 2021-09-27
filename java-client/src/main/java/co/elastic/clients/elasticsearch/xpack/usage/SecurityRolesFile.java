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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRolesFile
@JsonpDeserializable
public final class SecurityRolesFile implements JsonpSerializable {
	private final Boolean dls;

	private final Boolean fls;

	private final Long size;

	// ---------------------------------------------------------------------------------------------

	public SecurityRolesFile(Builder builder) {

		this.dls = Objects.requireNonNull(builder.dls, "dls");
		this.fls = Objects.requireNonNull(builder.fls, "fls");
		this.size = Objects.requireNonNull(builder.size, "size");

	}

	/**
	 * API name: {@code dls}
	 */
	public Boolean dls() {
		return this.dls;
	}

	/**
	 * API name: {@code fls}
	 */
	public Boolean fls() {
		return this.fls;
	}

	/**
	 * API name: {@code size}
	 */
	public Long size() {
		return this.size;
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

		generator.writeKey("dls");
		generator.write(this.dls);

		generator.writeKey("fls");
		generator.write(this.fls);

		generator.writeKey("size");
		generator.write(this.size);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesFile}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRolesFile> {
		private Boolean dls;

		private Boolean fls;

		private Long size;

		/**
		 * API name: {@code dls}
		 */
		public Builder dls(Boolean value) {
			this.dls = value;
			return this;
		}

		/**
		 * API name: {@code fls}
		 */
		public Builder fls(Boolean value) {
			this.fls = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(Long value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesFile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesFile build() {

			return new SecurityRolesFile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesFile}
	 */
	public static final JsonpDeserializer<SecurityRolesFile> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SecurityRolesFile::setupSecurityRolesFileDeserializer, Builder::build);

	protected static void setupSecurityRolesFileDeserializer(DelegatingDeserializer<SecurityRolesFile.Builder> op) {

		op.add(Builder::dls, JsonpDeserializer.booleanDeserializer(), "dls");
		op.add(Builder::fls, JsonpDeserializer.booleanDeserializer(), "fls");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");

	}

}
