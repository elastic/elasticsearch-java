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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.GeoBounds;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeGeoTileGridAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeGeoTileGridAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeGeoTileGridAggregation extends CompositeAggregationBase {
	@Nullable
	private final Integer precision;

	@Nullable
	private final GeoBounds bounds;

	// ---------------------------------------------------------------------------------------------

	private CompositeGeoTileGridAggregation(Builder builder) {
		super(builder);

		this.precision = builder.precision;
		this.bounds = builder.bounds;

	}

	public static CompositeGeoTileGridAggregation of(
			Function<Builder, ObjectBuilder<CompositeGeoTileGridAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final Integer precision() {
		return this.precision;
	}

	/**
	 * API name: {@code bounds}
	 */
	@Nullable
	public final GeoBounds bounds() {
		return this.bounds;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.precision != null) {
			generator.writeKey("precision");
			generator.write(this.precision);

		}
		if (this.bounds != null) {
			generator.writeKey("bounds");
			this.bounds.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeGeoTileGridAggregation}.
	 */

	public static class Builder extends CompositeAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompositeGeoTileGridAggregation> {
		@Nullable
		private Integer precision;

		@Nullable
		private GeoBounds bounds;

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Integer value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.bounds(fn.apply(new GeoBounds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeGeoTileGridAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeGeoTileGridAggregation build() {
			_checkSingleUse();

			return new CompositeGeoTileGridAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeGeoTileGridAggregation}
	 */
	public static final JsonpDeserializer<CompositeGeoTileGridAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeGeoTileGridAggregation::setupCompositeGeoTileGridAggregationDeserializer);

	protected static void setupCompositeGeoTileGridAggregationDeserializer(
			ObjectDeserializer<CompositeGeoTileGridAggregation.Builder> op) {
		CompositeAggregationBase.setupCompositeAggregationBaseDeserializer(op);
		op.add(Builder::precision, JsonpDeserializer.integerDeserializer(), "precision");
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");

	}

}
