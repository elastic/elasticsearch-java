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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.GeoBounds;
import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Number;
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

// typedef: _types.aggregations.GeoTileGridAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoTileGridAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoTileGridAggregation extends BucketAggregationBase implements AggregationVariant, PivotGroupByVariant {
	@Nullable
	private final String field;

	@Nullable
	private final Number precision;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Integer size;

	@Nullable
	private final GeoBounds bounds;

	// ---------------------------------------------------------------------------------------------

	private GeoTileGridAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.precision = builder.precision;
		this.shardSize = builder.shardSize;
		this.size = builder.size;
		this.bounds = builder.bounds;

	}

	public static GeoTileGridAggregation of(Function<Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.GeotileGrid;
	}

	/**
	 * PivotGroupBy variant kind.
	 */
	@Override
	public PivotGroupBy.Kind _pivotGroupByKind() {
		return PivotGroupBy.Kind.GeotileGrid;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final Number precision() {
		return this.precision;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.precision != null) {
			generator.writeKey("precision");
			generator.write(this.precision.doubleValue());

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.bounds != null) {
			generator.writeKey("bounds");
			this.bounds.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoTileGridAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoTileGridAggregation> {
		@Nullable
		private String field;

		@Nullable
		private Number precision;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Integer size;

		@Nullable
		private GeoBounds bounds;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Number value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
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
		 * Builds a {@link GeoTileGridAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoTileGridAggregation build() {
			_checkSingleUse();

			return new GeoTileGridAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoTileGridAggregation}
	 */
	public static final JsonpDeserializer<GeoTileGridAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoTileGridAggregation::setupGeoTileGridAggregationDeserializer);

	protected static void setupGeoTileGridAggregationDeserializer(
			ObjectDeserializer<GeoTileGridAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::precision, JsonpDeserializer.numberDeserializer(), "precision");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");

	}

}
