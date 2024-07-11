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
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
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

// typedef: _types.query_dsl.DecayPlacement

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DecayPlacement">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecayPlacement<TOrigin, TScale> implements JsonpSerializable {
	@Nullable
	private final Double decay;

	@Nullable
	private final TScale offset;

	@Nullable
	private final TScale scale;

	@Nullable
	private final TOrigin origin;

	@Nullable
	private final JsonpSerializer<TOrigin> tOriginSerializer;

	@Nullable
	private final JsonpSerializer<TScale> tScaleSerializer;

	// ---------------------------------------------------------------------------------------------

	private DecayPlacement(Builder<TOrigin, TScale> builder) {

		this.decay = builder.decay;
		this.offset = builder.offset;
		this.scale = builder.scale;
		this.origin = builder.origin;
		this.tOriginSerializer = builder.tOriginSerializer;
		this.tScaleSerializer = builder.tScaleSerializer;

	}

	public static <TOrigin, TScale> DecayPlacement<TOrigin, TScale> of(
			Function<Builder<TOrigin, TScale>, ObjectBuilder<DecayPlacement<TOrigin, TScale>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Defines how documents are scored at the distance given at scale.
	 * <p>
	 * API name: {@code decay}
	 */
	@Nullable
	public final Double decay() {
		return this.decay;
	}

	/**
	 * If defined, the decay function will only compute the decay function for
	 * documents with a distance greater than the defined <code>offset</code>.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final TScale offset() {
		return this.offset;
	}

	/**
	 * Defines the distance from origin + offset at which the computed score will
	 * equal <code>decay</code> parameter.
	 * <p>
	 * API name: {@code scale}
	 */
	@Nullable
	public final TScale scale() {
		return this.scale;
	}

	/**
	 * The point of origin used for calculating distance. Must be given as a number
	 * for numeric field, date for date fields and geo point for geo fields.
	 * <p>
	 * API name: {@code origin}
	 */
	@Nullable
	public final TOrigin origin() {
		return this.origin;
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

		if (this.decay != null) {
			generator.writeKey("decay");
			generator.write(this.decay);

		}
		if (this.offset != null) {
			generator.writeKey("offset");
			JsonpUtils.serialize(this.offset, generator, tScaleSerializer, mapper);

		}
		if (this.scale != null) {
			generator.writeKey("scale");
			JsonpUtils.serialize(this.scale, generator, tScaleSerializer, mapper);

		}
		if (this.origin != null) {
			generator.writeKey("origin");
			JsonpUtils.serialize(this.origin, generator, tOriginSerializer, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DecayPlacement}.
	 */

	public static class Builder<TOrigin, TScale> extends WithJsonObjectBuilderBase<Builder<TOrigin, TScale>>
			implements
				ObjectBuilder<DecayPlacement<TOrigin, TScale>> {
		@Nullable
		private Double decay;

		@Nullable
		private TScale offset;

		@Nullable
		private TScale scale;

		@Nullable
		private TOrigin origin;

		@Nullable
		private JsonpSerializer<TOrigin> tOriginSerializer;

		@Nullable
		private JsonpSerializer<TScale> tScaleSerializer;

		/**
		 * Defines how documents are scored at the distance given at scale.
		 * <p>
		 * API name: {@code decay}
		 */
		public final Builder<TOrigin, TScale> decay(@Nullable Double value) {
			this.decay = value;
			return this;
		}

		/**
		 * If defined, the decay function will only compute the decay function for
		 * documents with a distance greater than the defined <code>offset</code>.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder<TOrigin, TScale> offset(@Nullable TScale value) {
			this.offset = value;
			return this;
		}

		/**
		 * Defines the distance from origin + offset at which the computed score will
		 * equal <code>decay</code> parameter.
		 * <p>
		 * API name: {@code scale}
		 */
		public final Builder<TOrigin, TScale> scale(@Nullable TScale value) {
			this.scale = value;
			return this;
		}

		/**
		 * The point of origin used for calculating distance. Must be given as a number
		 * for numeric field, date for date fields and geo point for geo fields.
		 * <p>
		 * API name: {@code origin}
		 */
		public final Builder<TOrigin, TScale> origin(@Nullable TOrigin value) {
			this.origin = value;
			return this;
		}

		/**
		 * Serializer for TOrigin. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TOrigin, TScale> tOriginSerializer(@Nullable JsonpSerializer<TOrigin> value) {
			this.tOriginSerializer = value;
			return this;
		}

		/**
		 * Serializer for TScale. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TOrigin, TScale> tScaleSerializer(@Nullable JsonpSerializer<TScale> value) {
			this.tScaleSerializer = value;
			return this;
		}

		@Override
		protected Builder<TOrigin, TScale> self() {
			return this;
		}

		/**
		 * Builds a {@link DecayPlacement}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecayPlacement<TOrigin, TScale> build() {
			_checkSingleUse();

			return new DecayPlacement<TOrigin, TScale>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for DecayPlacement
	 */
	public static <TOrigin, TScale> JsonpDeserializer<DecayPlacement<TOrigin, TScale>> createDecayPlacementDeserializer(
			JsonpDeserializer<TOrigin> tOriginDeserializer, JsonpDeserializer<TScale> tScaleDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TOrigin, TScale>>) Builder::new,
				op -> DecayPlacement.setupDecayPlacementDeserializer(op, tOriginDeserializer, tScaleDeserializer));
	};

	/**
	 * Json deserializer for {@link DecayPlacement} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<DecayPlacement<Object, Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createDecayPlacementDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_types.query_dsl.DecayPlacement.TOrigin"),
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_types.query_dsl.DecayPlacement.TScale")));

	protected static <TOrigin, TScale> void setupDecayPlacementDeserializer(
			ObjectDeserializer<DecayPlacement.Builder<TOrigin, TScale>> op,
			JsonpDeserializer<TOrigin> tOriginDeserializer, JsonpDeserializer<TScale> tScaleDeserializer) {

		op.add(Builder::decay, JsonpDeserializer.doubleDeserializer(), "decay");
		op.add(Builder::offset, tScaleDeserializer, "offset");
		op.add(Builder::scale, tScaleDeserializer, "scale");
		op.add(Builder::origin, tOriginDeserializer, "origin");

	}

}
