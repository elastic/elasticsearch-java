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
import co.elastic.clients.elasticsearch._types.GeoHashPrecision;
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

// typedef: _types.aggregations.GeoHashGridAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoHashGridAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoHashGridAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final GeoBounds bounds;

	@Nullable
	private final String field;

	@Nullable
	private final GeoHashPrecision precision;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GeoHashGridAggregation(Builder builder) {

		this.bounds = builder.bounds;
		this.field = builder.field;
		this.precision = builder.precision;
		this.shardSize = builder.shardSize;
		this.size = builder.size;

	}

	public static GeoHashGridAggregation of(Function<Builder, ObjectBuilder<GeoHashGridAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.GeohashGrid;
	}

	/**
	 * The bounding box to filter the points in each bucket.
	 * <p>
	 * API name: {@code bounds}
	 */
	@Nullable
	public final GeoBounds bounds() {
		return this.bounds;
	}

	/**
	 * Field containing indexed <code>geo_point</code> or <code>geo_shape</code>
	 * values. If the field contains an array, <code>geohash_grid</code> aggregates
	 * all array values.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * The string length of the geohashes used to define cells/buckets in the
	 * results.
	 * <p>
	 * API name: {@code precision}
	 */
	@Nullable
	public final GeoHashPrecision precision() {
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
	 * The maximum number of geohash buckets to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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

		if (this.bounds != null) {
			generator.writeKey("bounds");
			this.bounds.serialize(generator, mapper);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.precision != null) {
			generator.writeKey("precision");
			this.precision.serialize(generator, mapper);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoHashGridAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoHashGridAggregation> {
		@Nullable
		private GeoBounds bounds;

		@Nullable
		private String field;

		@Nullable
		private GeoHashPrecision precision;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Integer size;

		/**
		 * The bounding box to filter the points in each bucket.
		 * <p>
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * The bounding box to filter the points in each bucket.
		 * <p>
		 * API name: {@code bounds}
		 */
		public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.bounds(fn.apply(new GeoBounds.Builder()).build());
		}

		/**
		 * Field containing indexed <code>geo_point</code> or <code>geo_shape</code>
		 * values. If the field contains an array, <code>geohash_grid</code> aggregates
		 * all array values.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * The string length of the geohashes used to define cells/buckets in the
		 * results.
		 * <p>
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable GeoHashPrecision value) {
			this.precision = value;
			return this;
		}

		/**
		 * The string length of the geohashes used to define cells/buckets in the
		 * results.
		 * <p>
		 * API name: {@code precision}
		 */
		public final Builder precision(Function<GeoHashPrecision.Builder, ObjectBuilder<GeoHashPrecision>> fn) {
			return this.precision(fn.apply(new GeoHashPrecision.Builder()).build());
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
		 * The maximum number of geohash buckets to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoHashGridAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoHashGridAggregation build() {
			_checkSingleUse();

			return new GeoHashGridAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoHashGridAggregation}
	 */
	public static final JsonpDeserializer<GeoHashGridAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoHashGridAggregation::setupGeoHashGridAggregationDeserializer);

	protected static void setupGeoHashGridAggregationDeserializer(
			ObjectDeserializer<GeoHashGridAggregation.Builder> op) {

		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::precision, GeoHashPrecision._DESERIALIZER, "precision");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
