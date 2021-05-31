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

import co.elastic.clients.elasticsearch._types.query_dsl.BoundingBox;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoHashGridAggregation
public final class GeoHashGridAggregation extends BucketAggregationBase {
	@Nullable
	private final BoundingBox bounds;

	@Nullable
	private final String field;

	@Nullable
	private final Number precision;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected GeoHashGridAggregation(Builder builder) {
		super(builder);
		this.bounds = builder.bounds;
		this.field = builder.field;
		this.precision = builder.precision;
		this.shardSize = builder.shardSize;
		this.size = builder.size;

	}

	/**
	 * API name: {@code bounds}
	 */
	@Nullable
	public BoundingBox bounds() {
		return this.bounds;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public Number precision() {
		return this.precision;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.bounds != null) {

			generator.writeKey("bounds");
			this.bounds.toJsonp(generator, mapper);

		}
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
			generator.write(this.shardSize.doubleValue());

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoHashGridAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoHashGridAggregation> {
		@Nullable
		private BoundingBox bounds;

		@Nullable
		private String field;

		@Nullable
		private Number precision;

		@Nullable
		private Number shardSize;

		@Nullable
		private Number size;

		/**
		 * API name: {@code bounds}
		 */
		public Builder bounds(@Nullable BoundingBox value) {
			this.bounds = value;
			return this;
		}

		/**
		 * API name: {@code bounds}
		 */
		public Builder bounds(Function<BoundingBox.Builder, ObjectBuilder<BoundingBox>> fn) {
			return this.bounds(fn.apply(new BoundingBox.Builder()).build());
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public Builder precision(@Nullable Number value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
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

			return new GeoHashGridAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GeoHashGridAggregation
	 */
	public static final JsonpValueParser<GeoHashGridAggregation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GeoHashGridAggregation::setupGeoHashGridAggregationParser);

	protected static void setupGeoHashGridAggregationParser(
			DelegatingJsonpValueParser<GeoHashGridAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseParser(op);
		op.add(Builder::bounds, BoundingBox.JSONP_PARSER, "bounds");
		op.add(Builder::field, JsonpValueParser.stringParser(), "field");
		op.add(Builder::precision, JsonpValueParser.numberParser(), "precision");
		op.add(Builder::shardSize, JsonpValueParser.numberParser(), "shard_size");
		op.add(Builder::size, JsonpValueParser.numberParser(), "size");

	}

}
