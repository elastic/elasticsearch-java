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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.HistogramAggregation
public final class HistogramAggregation extends BucketAggregationBase {
	@Nullable
	private final ExtendedBounds<Number> extendedBounds;

	@Nullable
	private final ExtendedBounds<Number> hardBounds;

	@Nullable
	private final String field;

	@Nullable
	private final Number interval;

	@Nullable
	private final Number minDocCount;

	@Nullable
	private final Number missing;

	@Nullable
	private final Number offset;

	@Nullable
	private final HistogramOrder order;

	@Nullable
	private final JsonValue script;

	@Nullable
	private final String format;

	// ---------------------------------------------------------------------------------------------

	protected HistogramAggregation(Builder builder) {
		super(builder);
		this.extendedBounds = builder.extendedBounds;
		this.hardBounds = builder.hardBounds;
		this.field = builder.field;
		this.interval = builder.interval;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.offset = builder.offset;
		this.order = builder.order;
		this.script = builder.script;
		this.format = builder.format;

	}

	/**
	 * API name: {@code extended_bounds}
	 */
	@Nullable
	public ExtendedBounds<Number> extendedBounds() {
		return this.extendedBounds;
	}

	/**
	 * API name: {@code hard_bounds}
	 */
	@Nullable
	public ExtendedBounds<Number> hardBounds() {
		return this.hardBounds;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code interval}
	 */
	@Nullable
	public Number interval() {
		return this.interval;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public Number minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public Number missing() {
		return this.missing;
	}

	/**
	 * API name: {@code offset}
	 */
	@Nullable
	public Number offset() {
		return this.offset;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public HistogramOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.extendedBounds != null) {

			generator.writeKey("extended_bounds");
			this.extendedBounds.toJsonp(generator, mapper);

		}
		if (this.hardBounds != null) {

			generator.writeKey("hard_bounds");
			this.hardBounds.toJsonp(generator, mapper);

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.interval != null) {

			generator.writeKey("interval");
			generator.write(this.interval.doubleValue());

		}
		if (this.minDocCount != null) {

			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount.doubleValue());

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.write(this.missing.doubleValue());

		}
		if (this.offset != null) {

			generator.writeKey("offset");
			generator.write(this.offset.doubleValue());

		}
		if (this.order != null) {

			generator.writeKey("order");
			this.order.toJsonp(generator, mapper);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HistogramAggregation> {
		@Nullable
		private ExtendedBounds<Number> extendedBounds;

		@Nullable
		private ExtendedBounds<Number> hardBounds;

		@Nullable
		private String field;

		@Nullable
		private Number interval;

		@Nullable
		private Number minDocCount;

		@Nullable
		private Number missing;

		@Nullable
		private Number offset;

		@Nullable
		private HistogramOrder order;

		@Nullable
		private JsonValue script;

		@Nullable
		private String format;

		/**
		 * API name: {@code extended_bounds}
		 */
		public Builder extendedBounds(@Nullable ExtendedBounds<Number> value) {
			this.extendedBounds = value;
			return this;
		}

		/**
		 * API name: {@code extended_bounds}
		 */
		public Builder extendedBounds(
				Function<ExtendedBounds.Builder<Number>, ObjectBuilder<ExtendedBounds<Number>>> fn) {
			return this.extendedBounds(fn.apply(new ExtendedBounds.Builder<Number>()).build());
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public Builder hardBounds(@Nullable ExtendedBounds<Number> value) {
			this.hardBounds = value;
			return this;
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public Builder hardBounds(Function<ExtendedBounds.Builder<Number>, ObjectBuilder<ExtendedBounds<Number>>> fn) {
			return this.hardBounds(fn.apply(new ExtendedBounds.Builder<Number>()).build());
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public Builder interval(@Nullable Number value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public Builder minDocCount(@Nullable Number value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable Number value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public Builder offset(@Nullable Number value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable HistogramOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(Function<HistogramOrder.Builder, ObjectBuilder<HistogramOrder>> fn) {
			return this.order(fn.apply(new HistogramOrder.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HistogramAggregation build() {

			return new HistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for HistogramAggregation
	 */
	public static final JsonpDeserializer<HistogramAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HistogramAggregation::setupHistogramAggregationDeserializer);

	protected static void setupHistogramAggregationDeserializer(
			DelegatingDeserializer<HistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::extendedBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.numberDeserializer()),
				"extended_bounds");
		op.add(Builder::hardBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.numberDeserializer()), "hard_bounds");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::interval, JsonpDeserializer.numberDeserializer(), "interval");
		op.add(Builder::minDocCount, JsonpDeserializer.numberDeserializer(), "min_doc_count");
		op.add(Builder::missing, JsonpDeserializer.numberDeserializer(), "missing");
		op.add(Builder::offset, JsonpDeserializer.numberDeserializer(), "offset");
		op.add(Builder::order, HistogramOrder.DESERIALIZER, "order");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");

	}

}
