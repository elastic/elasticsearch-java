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

import co.elastic.clients.elasticsearch._types.DistanceUnit;
import co.elastic.clients.elasticsearch._types.GeoDistanceType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoDistanceAggregation
@JsonpDeserializable
public final class GeoDistanceAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final String field;

	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ origin;

	@Nullable
	private final List<AggregationRange> ranges;

	@Nullable
	private final DistanceUnit unit;

	// ---------------------------------------------------------------------------------------------

	public GeoDistanceAggregation(Builder builder) {
		super(builder);

		this.distanceType = builder.distanceType;
		this.field = builder.field;
		this.origin = builder.origin;
		this.ranges = builder.ranges;
		this.unit = builder.unit;

	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_distance";
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code origin}
	 */
	@Nullable
	public JsonValue /* _types.query_dsl.GeoLocation */ origin() {
		return this.origin;
	}

	/**
	 * API name: {@code ranges}
	 */
	@Nullable
	public List<AggregationRange> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public DistanceUnit unit() {
		return this.unit;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.distanceType != null) {

			generator.writeKey("distance_type");
			this.distanceType.serialize(generator, mapper);
		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.origin != null) {

			generator.writeKey("origin");
			generator.write(this.origin);

		}
		if (this.ranges != null) {

			generator.writeKey("ranges");
			generator.writeStartArray();
			for (AggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.unit != null) {

			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoDistanceAggregation> {
		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private String field;

		@Nullable
		private JsonValue /* _types.query_dsl.GeoLocation */ origin;

		@Nullable
		private List<AggregationRange> ranges;

		@Nullable
		private DistanceUnit unit;

		/**
		 * API name: {@code distance_type}
		 */
		public Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code origin}
		 */
		public Builder origin(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.origin = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(@Nullable List<AggregationRange> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(AggregationRange... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(AggregationRange value) {
			if (this.ranges == null) {
				this.ranges = new ArrayList<>();
			}
			this.ranges.add(value);
			return this;
		}

		/**
		 * Set {@link #ranges(List)} to a singleton list.
		 */
		public Builder ranges(Function<AggregationRange.Builder, ObjectBuilder<AggregationRange>> fn) {
			return this.ranges(fn.apply(new AggregationRange.Builder()).build());
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(Function<AggregationRange.Builder, ObjectBuilder<AggregationRange>> fn) {
			return this.addRanges(fn.apply(new AggregationRange.Builder()).build());
		}

		/**
		 * API name: {@code unit}
		 */
		public Builder unit(@Nullable DistanceUnit value) {
			this.unit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceAggregation build() {

			return new GeoDistanceAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceAggregation}
	 */
	public static final JsonpDeserializer<GeoDistanceAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoDistanceAggregation::setupGeoDistanceAggregationDeserializer, Builder::build);

	protected static void setupGeoDistanceAggregationDeserializer(
			DelegatingDeserializer<GeoDistanceAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::origin, JsonpDeserializer.jsonValueDeserializer(), "origin");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(AggregationRange._DESERIALIZER), "ranges");
		op.add(Builder::unit, DistanceUnit._DESERIALIZER, "unit");

	}

}
