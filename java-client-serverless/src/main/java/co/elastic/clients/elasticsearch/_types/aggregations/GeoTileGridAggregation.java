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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
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
public class GeoTileGridAggregation extends BucketAggregationBase
		implements
			AggregationVariant,
			PivotGroupByVariant,
			JsonpSerializable {
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
	 * Field containing indexed <code>geo_point</code> or <code>geo_shape</code>
	 * values. If the field contains an array, <code>geotile_grid</code> aggregates
	 * all array values.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * Integer zoom of the key used to define cells/buckets in the results. Values
	 * outside of the range [0,29] will be rejected.
	 * <p>
	 * API name: {@code precision}
	 */
	@Nullable
	public final Number precision() {
		return this.precision;
	}

	/**
	 * Allows for more accurate counting of the top cells returned in the final
	 * result the aggregation. Defaults to returning
	 * <code>max(10,(size x number-of-shards))</code> buckets from each shard.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * The maximum number of buckets to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * A bounding box to filter the geo-points or geo-shapes in each bucket.
	 * <p>
	 * API name: {@code bounds}
	 */
	@Nullable
	public final GeoBounds bounds() {
		return this.bounds;
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
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
		 * Field containing indexed <code>geo_point</code> or <code>geo_shape</code>
		 * values. If the field contains an array, <code>geotile_grid</code> aggregates
		 * all array values.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * Integer zoom of the key used to define cells/buckets in the results. Values
		 * outside of the range [0,29] will be rejected.
		 * <p>
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Number value) {
			this.precision = value;
			return this;
		}

		/**
		 * Allows for more accurate counting of the top cells returned in the final
		 * result the aggregation. Defaults to returning
		 * <code>max(10,(size x number-of-shards))</code> buckets from each shard.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * The maximum number of buckets to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * A bounding box to filter the geo-points or geo-shapes in each bucket.
		 * <p>
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * A bounding box to filter the geo-points or geo-shapes in each bucket.
		 * <p>
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

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::precision, JsonpDeserializer.numberDeserializer(), "precision");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");

	}

}
