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

// typedef: indices._types.MappingLimitSettingsDepth

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.MappingLimitSettingsDepth">API
 *      specification</a>
 */
@JsonpDeserializable
public class MappingLimitSettingsDepth implements JsonpSerializable {
	@Nullable
	private final Long limit;

	// ---------------------------------------------------------------------------------------------

	private MappingLimitSettingsDepth(Builder builder) {

		this.limit = builder.limit;

	}

	public static MappingLimitSettingsDepth of(Function<Builder, ObjectBuilder<MappingLimitSettingsDepth>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The maximum depth for a field, which is measured as the number of inner
	 * objects. For instance, if all fields are defined at the root object level,
	 * then the depth is 1. If there is one object mapping, then the depth is 2,
	 * etc.
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
	 * Builder for {@link MappingLimitSettingsDepth}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MappingLimitSettingsDepth> {
		@Nullable
		private Long limit;

		/**
		 * The maximum depth for a field, which is measured as the number of inner
		 * objects. For instance, if all fields are defined at the root object level,
		 * then the depth is 1. If there is one object mapping, then the depth is 2,
		 * etc.
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
		 * Builds a {@link MappingLimitSettingsDepth}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingLimitSettingsDepth build() {
			_checkSingleUse();

			return new MappingLimitSettingsDepth(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingLimitSettingsDepth}
	 */
	public static final JsonpDeserializer<MappingLimitSettingsDepth> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MappingLimitSettingsDepth::setupMappingLimitSettingsDepthDeserializer);

	protected static void setupMappingLimitSettingsDepthDeserializer(
			ObjectDeserializer<MappingLimitSettingsDepth.Builder> op) {

		op.add(Builder::limit, JsonpDeserializer.longDeserializer(), "limit");

	}

}
