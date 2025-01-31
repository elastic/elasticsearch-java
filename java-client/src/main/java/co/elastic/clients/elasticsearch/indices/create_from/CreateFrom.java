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

package co.elastic.clients.elasticsearch.indices.create_from;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
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
import java.lang.Boolean;
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

// typedef: indices.create_from.CreateFrom

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.create_from.CreateFrom">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateFrom implements JsonpSerializable {
	@Nullable
	private final TypeMapping mappingsOverride;

	@Nullable
	private final IndexSettings settingsOverride;

	@Nullable
	private final Boolean removeIndexBlocks;

	// ---------------------------------------------------------------------------------------------

	private CreateFrom(Builder builder) {

		this.mappingsOverride = builder.mappingsOverride;
		this.settingsOverride = builder.settingsOverride;
		this.removeIndexBlocks = builder.removeIndexBlocks;

	}

	public static CreateFrom of(Function<Builder, ObjectBuilder<CreateFrom>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Mappings overrides to be applied to the destination index (optional)
	 * <p>
	 * API name: {@code mappings_override}
	 */
	@Nullable
	public final TypeMapping mappingsOverride() {
		return this.mappingsOverride;
	}

	/**
	 * Settings overrides to be applied to the destination index (optional)
	 * <p>
	 * API name: {@code settings_override}
	 */
	@Nullable
	public final IndexSettings settingsOverride() {
		return this.settingsOverride;
	}

	/**
	 * If index blocks should be removed when creating destination index (optional)
	 * <p>
	 * API name: {@code remove_index_blocks}
	 */
	@Nullable
	public final Boolean removeIndexBlocks() {
		return this.removeIndexBlocks;
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

		if (this.mappingsOverride != null) {
			generator.writeKey("mappings_override");
			this.mappingsOverride.serialize(generator, mapper);

		}
		if (this.settingsOverride != null) {
			generator.writeKey("settings_override");
			this.settingsOverride.serialize(generator, mapper);

		}
		if (this.removeIndexBlocks != null) {
			generator.writeKey("remove_index_blocks");
			generator.write(this.removeIndexBlocks);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateFrom}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CreateFrom> {
		@Nullable
		private TypeMapping mappingsOverride;

		@Nullable
		private IndexSettings settingsOverride;

		@Nullable
		private Boolean removeIndexBlocks;

		/**
		 * Mappings overrides to be applied to the destination index (optional)
		 * <p>
		 * API name: {@code mappings_override}
		 */
		public final Builder mappingsOverride(@Nullable TypeMapping value) {
			this.mappingsOverride = value;
			return this;
		}

		/**
		 * Mappings overrides to be applied to the destination index (optional)
		 * <p>
		 * API name: {@code mappings_override}
		 */
		public final Builder mappingsOverride(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappingsOverride(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Settings overrides to be applied to the destination index (optional)
		 * <p>
		 * API name: {@code settings_override}
		 */
		public final Builder settingsOverride(@Nullable IndexSettings value) {
			this.settingsOverride = value;
			return this;
		}

		/**
		 * Settings overrides to be applied to the destination index (optional)
		 * <p>
		 * API name: {@code settings_override}
		 */
		public final Builder settingsOverride(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settingsOverride(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * If index blocks should be removed when creating destination index (optional)
		 * <p>
		 * API name: {@code remove_index_blocks}
		 */
		public final Builder removeIndexBlocks(@Nullable Boolean value) {
			this.removeIndexBlocks = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateFrom}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateFrom build() {
			_checkSingleUse();

			return new CreateFrom(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateFrom}
	 */
	public static final JsonpDeserializer<CreateFrom> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CreateFrom::setupCreateFromDeserializer);

	protected static void setupCreateFromDeserializer(ObjectDeserializer<CreateFrom.Builder> op) {

		op.add(Builder::mappingsOverride, TypeMapping._DESERIALIZER, "mappings_override");
		op.add(Builder::settingsOverride, IndexSettings._DESERIALIZER, "settings_override");
		op.add(Builder::removeIndexBlocks, JsonpDeserializer.booleanDeserializer(), "remove_index_blocks");

	}

}
