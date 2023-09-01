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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonData;
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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.DecayPlacement

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DecayPlacement">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecayPlacement implements JsonpSerializable {
	@Nullable
	private final Double decay;

	@Nullable
	private final JsonData offset;

	@Nullable
	private final JsonData scale;

	@Nullable
	private final JsonData origin;

	// ---------------------------------------------------------------------------------------------

	private DecayPlacement(Builder builder) {

		this.decay = builder.decay;
		this.offset = builder.offset;
		this.scale = builder.scale;
		this.origin = builder.origin;

	}

	public static DecayPlacement of(Function<Builder, ObjectBuilder<DecayPlacement>> fn) {
		return fn.apply(new Builder()).build();
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
	public final JsonData offset() {
		return this.offset;
	}

	/**
	 * Defines the distance from origin + offset at which the computed score will
	 * equal <code>decay</code> parameter.
	 * <p>
	 * API name: {@code scale}
	 */
	@Nullable
	public final JsonData scale() {
		return this.scale;
	}

	/**
	 * The point of origin used for calculating distance. Must be given as a number
	 * for numeric field, date for date fields and geo point for geo fields.
	 * <p>
	 * API name: {@code origin}
	 */
	@Nullable
	public final JsonData origin() {
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
			this.offset.serialize(generator, mapper);

		}
		if (this.scale != null) {
			generator.writeKey("scale");
			this.scale.serialize(generator, mapper);

		}
		if (this.origin != null) {
			generator.writeKey("origin");
			this.origin.serialize(generator, mapper);

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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DecayPlacement> {
		@Nullable
		private Double decay;

		@Nullable
		private JsonData offset;

		@Nullable
		private JsonData scale;

		@Nullable
		private JsonData origin;

		/**
		 * Defines how documents are scored at the distance given at scale.
		 * <p>
		 * API name: {@code decay}
		 */
		public final Builder decay(@Nullable Double value) {
			this.decay = value;
			return this;
		}

		/**
		 * If defined, the decay function will only compute the decay function for
		 * documents with a distance greater than the defined <code>offset</code>.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable JsonData value) {
			this.offset = value;
			return this;
		}

		/**
		 * Defines the distance from origin + offset at which the computed score will
		 * equal <code>decay</code> parameter.
		 * <p>
		 * API name: {@code scale}
		 */
		public final Builder scale(@Nullable JsonData value) {
			this.scale = value;
			return this;
		}

		/**
		 * The point of origin used for calculating distance. Must be given as a number
		 * for numeric field, date for date fields and geo point for geo fields.
		 * <p>
		 * API name: {@code origin}
		 */
		public final Builder origin(@Nullable JsonData value) {
			this.origin = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DecayPlacement}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecayPlacement build() {
			_checkSingleUse();

			return new DecayPlacement(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DecayPlacement}
	 */
	public static final JsonpDeserializer<DecayPlacement> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DecayPlacement::setupDecayPlacementDeserializer);

	protected static void setupDecayPlacementDeserializer(ObjectDeserializer<DecayPlacement.Builder> op) {

		op.add(Builder::decay, JsonpDeserializer.doubleDeserializer(), "decay");
		op.add(Builder::offset, JsonData._DESERIALIZER, "offset");
		op.add(Builder::scale, JsonData._DESERIALIZER, "scale");
		op.add(Builder::origin, JsonData._DESERIALIZER, "origin");

	}

}
