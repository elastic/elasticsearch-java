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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _types.query_dsl.DecayFunctionBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DecayFunctionBase">API
 *      specification</a>
 */

public abstract class DecayFunctionBase<TOrigin, TScale> implements JsonpSerializable {
	private final String field;

	private final DecayPlacement<TOrigin, TScale> placement;

	@Nullable
	private final MultiValueMode multiValueMode;

	@Nullable
	private final JsonpSerializer<TOrigin> tOriginSerializer;

	@Nullable
	private final JsonpSerializer<TScale> tScaleSerializer;

	// ---------------------------------------------------------------------------------------------

	protected DecayFunctionBase(AbstractBuilder<TOrigin, TScale, ?> builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.placement = ApiTypeHelper.requireNonNull(builder.placement, this, "placement");

		this.multiValueMode = builder.multiValueMode;
		this.tOriginSerializer = builder.tOriginSerializer;
		this.tScaleSerializer = builder.tScaleSerializer;

	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final DecayPlacement<TOrigin, TScale> placement() {
		return this.placement;
	}

	/**
	 * Determines how the distance is calculated when a field used for computing the
	 * decay contains multiple values.
	 * <p>
	 * API name: {@code multi_value_mode}
	 */
	@Nullable
	public final MultiValueMode multiValueMode() {
		return this.multiValueMode;
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
		generator.writeKey(this.field);
		this.placement.serialize(generator, mapper);

		if (this.multiValueMode != null) {
			generator.writeKey("multi_value_mode");
			this.multiValueMode.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<TOrigin, TScale, BuilderT extends AbstractBuilder<TOrigin, TScale, BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String field;

		private DecayPlacement<TOrigin, TScale> placement;

		/**
		 * Required -
		 */
		public final BuilderT field(String value) {
			this.field = value;
			return self();
		}

		/**
		 * Required -
		 */
		public final BuilderT placement(DecayPlacement<TOrigin, TScale> value) {
			this.placement = value;
			return self();
		}

		/**
		 * Required -
		 */
		public final BuilderT placement(
				Function<DecayPlacement.Builder<TOrigin, TScale>, ObjectBuilder<DecayPlacement<TOrigin, TScale>>> fn) {
			return this.placement(fn.apply(new DecayPlacement.Builder<TOrigin, TScale>()).build());
		}

		@Nullable
		private MultiValueMode multiValueMode;

		@Nullable
		private JsonpSerializer<TOrigin> tOriginSerializer;

		@Nullable
		private JsonpSerializer<TScale> tScaleSerializer;

		/**
		 * Determines how the distance is calculated when a field used for computing the
		 * decay contains multiple values.
		 * <p>
		 * API name: {@code multi_value_mode}
		 */
		public final BuilderT multiValueMode(@Nullable MultiValueMode value) {
			this.multiValueMode = value;
			return self();
		}

		/**
		 * Serializer for TOrigin. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tOriginSerializer(@Nullable JsonpSerializer<TOrigin> value) {
			this.tOriginSerializer = value;
			return self();
		}

		/**
		 * Serializer for TScale. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tScaleSerializer(@Nullable JsonpSerializer<TScale> value) {
			this.tScaleSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TOrigin, TScale, BuilderT extends AbstractBuilder<TOrigin, TScale, BuilderT>> void setupDecayFunctionBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TOrigin> tOriginDeserializer,
			JsonpDeserializer<TScale> tScaleDeserializer) {

		op.add(AbstractBuilder::multiValueMode, MultiValueMode._DESERIALIZER, "multi_value_mode");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.placement(DecayPlacement.createDecayPlacementDeserializer(tOriginDeserializer, tScaleDeserializer)
					.deserialize(parser, mapper));
		});

	}

}
