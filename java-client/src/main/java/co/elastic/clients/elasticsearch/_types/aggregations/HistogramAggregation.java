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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.HistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.HistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class HistogramAggregation extends BucketAggregationBase implements AggregationVariant, PivotGroupByVariant {
	@Nullable
	private final ExtendedBounds<Double> extendedBounds;

	@Nullable
	private final ExtendedBounds<Double> hardBounds;

	@Nullable
	private final String field;

	@Nullable
	private final Double interval;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final Double missing;

	@Nullable
	private final Double offset;

	private final List<NamedValue<SortOrder>> order;

	@Nullable
	private final Script script;

	@Nullable
	private final String format;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private HistogramAggregation(Builder builder) {
		super(builder);

		this.extendedBounds = builder.extendedBounds;
		this.hardBounds = builder.hardBounds;
		this.field = builder.field;
		this.interval = builder.interval;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.offset = builder.offset;
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.script = builder.script;
		this.format = builder.format;
		this.keyed = builder.keyed;

	}

	public static HistogramAggregation of(Function<Builder, ObjectBuilder<HistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Histogram;
	}

	/**
	 * PivotGroupBy variant kind.
	 */
	@Override
	public PivotGroupBy.Kind _pivotGroupByKind() {
		return PivotGroupBy.Kind.Histogram;
	}

	/**
	 * API name: {@code extended_bounds}
	 */
	@Nullable
	public final ExtendedBounds<Double> extendedBounds() {
		return this.extendedBounds;
	}

	/**
	 * API name: {@code hard_bounds}
	 */
	@Nullable
	public final ExtendedBounds<Double> hardBounds() {
		return this.hardBounds;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code interval}
	 */
	@Nullable
	public final Double interval() {
		return this.interval;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final Double missing() {
		return this.missing;
	}

	/**
	 * API name: {@code offset}
	 */
	@Nullable
	public final Double offset() {
		return this.offset;
	}

	/**
	 * API name: {@code order}
	 */
	public final List<NamedValue<SortOrder>> order() {
		return this.order;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.extendedBounds != null) {
			generator.writeKey("extended_bounds");
			this.extendedBounds.serialize(generator, mapper);

		}
		if (this.hardBounds != null) {
			generator.writeKey("hard_bounds");
			this.hardBounds.serialize(generator, mapper);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.interval != null) {
			generator.writeKey("interval");
			generator.write(this.interval);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.offset != null) {
			generator.writeKey("offset");
			generator.write(this.offset);

		}
		if (ApiTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (NamedValue<SortOrder> item0 : this.order) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				item0.value().serialize(generator, mapper);
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

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
		private ExtendedBounds<Double> extendedBounds;

		@Nullable
		private ExtendedBounds<Double> hardBounds;

		@Nullable
		private String field;

		@Nullable
		private Double interval;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private Double missing;

		@Nullable
		private Double offset;

		@Nullable
		private List<NamedValue<SortOrder>> order;

		@Nullable
		private Script script;

		@Nullable
		private String format;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(@Nullable ExtendedBounds<Double> value) {
			this.extendedBounds = value;
			return this;
		}

		/**
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(
				Function<ExtendedBounds.Builder<Double>, ObjectBuilder<ExtendedBounds<Double>>> fn) {
			return this.extendedBounds(fn.apply(new ExtendedBounds.Builder<Double>()).build());
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(@Nullable ExtendedBounds<Double> value) {
			this.hardBounds = value;
			return this;
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(
				Function<ExtendedBounds.Builder<Double>, ObjectBuilder<ExtendedBounds<Double>>> fn) {
			return this.hardBounds(fn.apply(new ExtendedBounds.Builder<Double>()).build());
		}

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable Double value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable Double value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Double value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<NamedValue<SortOrder>> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(NamedValue<SortOrder> value, NamedValue<SortOrder>... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
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
			_checkSingleUse();

			return new HistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HistogramAggregation}
	 */
	public static final JsonpDeserializer<HistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HistogramAggregation::setupHistogramAggregationDeserializer);

	protected static void setupHistogramAggregationDeserializer(ObjectDeserializer<HistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::extendedBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.doubleDeserializer()),
				"extended_bounds");
		op.add(Builder::hardBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.doubleDeserializer()), "hard_bounds");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::interval, JsonpDeserializer.doubleDeserializer(), "interval");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::missing, JsonpDeserializer.doubleDeserializer(), "missing");
		op.add(Builder::offset, JsonpDeserializer.doubleDeserializer(), "offset");
		op.add(Builder::order,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> SortOrder._DESERIALIZER)), "order");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
