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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeohexGridAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeohexGridAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeohexGridAggregation extends BucketAggregationBase implements AggregationVariant {
	private final String field;

	@Nullable
	private final Integer precision;

	@Nullable
	private final GeoBounds bounds;

	@Nullable
	private final Integer size;

	@Nullable
	private final Integer shardSize;

	// ---------------------------------------------------------------------------------------------

	private GeohexGridAggregation(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.precision = builder.precision;
		this.bounds = builder.bounds;
		this.size = builder.size;
		this.shardSize = builder.shardSize;

	}

	public static GeohexGridAggregation of(Function<Builder, ObjectBuilder<GeohexGridAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.GeohexGrid;
	}

	/**
	 * Required - Field containing indexed geo-point values. Must be explicitly
	 * mapped as a <code>geo_point</code> field. If the field contains an array
	 * <code>geohex_grid</code> aggregates all array values.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Integer zoom of the key used to defined cells or buckets in the results.
	 * Value should be between 0-15.
	 * <p>
	 * API name: {@code precision}
	 */
	@Nullable
	public final Integer precision() {
		return this.precision;
	}

	/**
	 * Bounding box used to filter the geo-points in each bucket.
	 * <p>
	 * API name: {@code bounds}
	 */
	@Nullable
	public final GeoBounds bounds() {
		return this.bounds;
	}

	/**
	 * Maximum number of buckets to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Number of buckets returned from each shard.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.precision != null) {
			generator.writeKey("precision");
			generator.write(this.precision);

		}
		if (this.bounds != null) {
			generator.writeKey("bounds");
			this.bounds.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeohexGridAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeohexGridAggregation> {
		private String field;

		@Nullable
		private Integer precision;

		@Nullable
		private GeoBounds bounds;

		@Nullable
		private Integer size;

		@Nullable
		private Integer shardSize;

		/**
		 * Required - Field containing indexed geo-point values. Must be explicitly
		 * mapped as a <code>geo_point</code> field. If the field contains an array
		 * <code>geohex_grid</code> aggregates all array values.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Integer zoom of the key used to defined cells or buckets in the results.
		 * Value should be between 0-15.
		 * <p>
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Integer value) {
			this.precision = value;
			return this;
		}

		/**
		 * Bounding box used to filter the geo-points in each bucket.
		 * <p>
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * Bounding box used to filter the geo-points in each bucket.
		 * <p>
		 * API name: {@code bounds}
		 */
		public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.bounds(fn.apply(new GeoBounds.Builder()).build());
		}

		/**
		 * Maximum number of buckets to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Number of buckets returned from each shard.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeohexGridAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeohexGridAggregation build() {
			_checkSingleUse();

			return new GeohexGridAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeohexGridAggregation}
	 */
	public static final JsonpDeserializer<GeohexGridAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeohexGridAggregation::setupGeohexGridAggregationDeserializer);

	protected static void setupGeohexGridAggregationDeserializer(ObjectDeserializer<GeohexGridAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::precision, JsonpDeserializer.integerDeserializer(), "precision");
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");

	}

}
