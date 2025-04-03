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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.SecurityRolesFile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.SecurityRolesFile">API
 *      specification</a>
 */
@JsonpDeserializable
public class SecurityRolesFile implements JsonpSerializable {
	private final boolean dls;

	private final boolean fls;

	private final long size;

	// ---------------------------------------------------------------------------------------------

	private SecurityRolesFile(Builder builder) {

		this.dls = ApiTypeHelper.requireNonNull(builder.dls, this, "dls", false);
		this.fls = ApiTypeHelper.requireNonNull(builder.fls, this, "fls", false);
		this.size = ApiTypeHelper.requireNonNull(builder.size, this, "size", 0);

	}

	public static SecurityRolesFile of(Function<Builder, ObjectBuilder<SecurityRolesFile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dls}
	 */
	public final boolean dls() {
		return this.dls;
	}

	/**
	 * Required - API name: {@code fls}
	 */
	public final boolean fls() {
		return this.fls;
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final long size() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesFile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SecurityRolesFile> {
		private Boolean dls;

		private Boolean fls;

		private Long size;

		/**
		 * Required - API name: {@code dls}
		 */
		public final Builder dls(boolean value) {
			this.dls = value;
			return this;
		}

		/**
		 * Required - API name: {@code fls}
		 */
		public final Builder fls(boolean value) {
			this.fls = value;
			return this;
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(long value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesFile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesFile build() {
			_checkSingleUse();

			return new SecurityRolesFile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesFile}
	 */
	public static final JsonpDeserializer<SecurityRolesFile> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SecurityRolesFile::setupSecurityRolesFileDeserializer);

	protected static void setupSecurityRolesFileDeserializer(ObjectDeserializer<SecurityRolesFile.Builder> op) {

		op.add(Builder::dls, JsonpDeserializer.booleanDeserializer(), "dls");
		op.add(Builder::fls, JsonpDeserializer.booleanDeserializer(), "fls");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");

	}

}
