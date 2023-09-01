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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.MappingLimitSettingsFieldNameLength

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.MappingLimitSettingsFieldNameLength">API
 *      specification</a>
 */
@JsonpDeserializable
public class MappingLimitSettingsFieldNameLength implements JsonpSerializable {
	@Nullable
	private final Long limit;

	// ---------------------------------------------------------------------------------------------

	private MappingLimitSettingsFieldNameLength(Builder builder) {

		this.limit = builder.limit;

	}

	public static MappingLimitSettingsFieldNameLength of(
			Function<Builder, ObjectBuilder<MappingLimitSettingsFieldNameLength>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Setting for the maximum length of a field name. This setting isn’t really
	 * something that addresses mappings explosion but might still be useful if you
	 * want to limit the field length. It usually shouldn’t be necessary to set this
	 * setting. The default is okay unless a user starts to add a huge number of
	 * fields with really long names. Default is <code>Long.MAX_VALUE</code> (no
	 * limit).
	 * <p>
	 * API name: {@code limit}
	 */
	@Nullable
	public final Long limit() {
		return this.limit;
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

		if (this.limit != null) {
			generator.writeKey("limit");
			generator.write(this.limit);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MappingLimitSettingsFieldNameLength}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MappingLimitSettingsFieldNameLength> {
		@Nullable
		private Long limit;

		/**
		 * Setting for the maximum length of a field name. This setting isn’t really
		 * something that addresses mappings explosion but might still be useful if you
		 * want to limit the field length. It usually shouldn’t be necessary to set this
		 * setting. The default is okay unless a user starts to add a huge number of
		 * fields with really long names. Default is <code>Long.MAX_VALUE</code> (no
		 * limit).
		 * <p>
		 * API name: {@code limit}
		 */
		public final Builder limit(@Nullable Long value) {
			this.limit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MappingLimitSettingsFieldNameLength}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingLimitSettingsFieldNameLength build() {
			_checkSingleUse();

			return new MappingLimitSettingsFieldNameLength(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingLimitSettingsFieldNameLength}
	 */
	public static final JsonpDeserializer<MappingLimitSettingsFieldNameLength> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					MappingLimitSettingsFieldNameLength::setupMappingLimitSettingsFieldNameLengthDeserializer);

	protected static void setupMappingLimitSettingsFieldNameLengthDeserializer(
			ObjectDeserializer<MappingLimitSettingsFieldNameLength.Builder> op) {

		op.add(Builder::limit, JsonpDeserializer.longDeserializer(), "limit");

	}

}
