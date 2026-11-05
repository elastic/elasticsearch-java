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

// typedef: security._types.WriteProfileGlobalUserPrivileges

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.WriteProfileGlobalUserPrivileges">API
 *      specification</a>
 */
@JsonpDeserializable
public class WriteProfileGlobalUserPrivileges implements JsonpSerializable {
	@Nullable
	private final ManageUserPrivileges write;

	// ---------------------------------------------------------------------------------------------

	private WriteProfileGlobalUserPrivileges(Builder builder) {

		this.write = builder.write;

	}

	public static WriteProfileGlobalUserPrivileges of(
			Function<Builder, ObjectBuilder<WriteProfileGlobalUserPrivileges>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The applications for which user profile data can be written. Absent when the
	 * <code>profile</code> section is present but grants no privileges.
	 * <p>
	 * API name: {@code write}
	 */
	@Nullable
	public final ManageUserPrivileges write() {
		return this.write;
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

		if (this.write != null) {
			generator.writeKey("write");
			this.write.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WriteProfileGlobalUserPrivileges}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<WriteProfileGlobalUserPrivileges> {
		@Nullable
		private ManageUserPrivileges write;

		public Builder() {
		}
		private Builder(WriteProfileGlobalUserPrivileges instance) {
			this.write = instance.write;

		}
		/**
		 * The applications for which user profile data can be written. Absent when the
		 * <code>profile</code> section is present but grants no privileges.
		 * <p>
		 * API name: {@code write}
		 */
		public final Builder write(@Nullable ManageUserPrivileges value) {
			this.write = value;
			return this;
		}

		/**
		 * The applications for which user profile data can be written. Absent when the
		 * <code>profile</code> section is present but grants no privileges.
		 * <p>
		 * API name: {@code write}
		 */
		public final Builder write(Function<ManageUserPrivileges.Builder, ObjectBuilder<ManageUserPrivileges>> fn) {
			return this.write(fn.apply(new ManageUserPrivileges.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WriteProfileGlobalUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WriteProfileGlobalUserPrivileges build() {
			_checkSingleUse();

			return new WriteProfileGlobalUserPrivileges(this);
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
	 * Json deserializer for {@link WriteProfileGlobalUserPrivileges}
	 */
	public static final JsonpDeserializer<WriteProfileGlobalUserPrivileges> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WriteProfileGlobalUserPrivileges::setupWriteProfileGlobalUserPrivilegesDeserializer);

	protected static void setupWriteProfileGlobalUserPrivilegesDeserializer(
			ObjectDeserializer<WriteProfileGlobalUserPrivileges.Builder> op) {

		op.add(Builder::write, ManageUserPrivileges._DESERIALIZER, "write");

	}

}
