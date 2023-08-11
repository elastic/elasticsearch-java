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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateHistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DateHistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateHistogramAggregation extends BucketAggregationBase implements AggregationVariant, PivotGroupByVariant {
	@Nullable
	private final CalendarInterval calendarInterval;

	@Nullable
	private final ExtendedBounds<FieldDateMath> extendedBounds;

	@Nullable
	private final ExtendedBounds<FieldDateMath> hardBounds;

	@Nullable
	private final String field;

	@Nullable
	private final Time fixedInterval;

	@Nullable
	private final String format;

	@Nullable
	private final Time interval;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final DateTime missing;

	@Nullable
	private final Time offset;

	private final List<NamedValue<SortOrder>> order;

	private final Map<String, JsonData> params;

	@Nullable
	private final Script script;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private DateHistogramAggregation(Builder builder) {
		super(builder);

		this.calendarInterval = builder.calendarInterval;
		this.extendedBounds = builder.extendedBounds;
		this.hardBounds = builder.hardBounds;
		this.field = builder.field;
		this.fixedInterval = builder.fixedInterval;
		this.format = builder.format;
		this.interval = builder.interval;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.offset = builder.offset;
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.script = builder.script;
		this.timeZone = builder.timeZone;
		this.keyed = builder.keyed;

	}

	public static DateHistogramAggregation of(Function<Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.DateHistogram;
	}

	/**
	 * PivotGroupBy variant kind.
	 */
	@Override
	public PivotGroupBy.Kind _pivotGroupByKind() {
		return PivotGroupBy.Kind.DateHistogram;
	}

	/**
	 * Calendar-aware interval. Can be specified using the unit name, such as
	 * <code>month</code>, or as a single unit quantity, such as <code>1M</code>.
	 * <p>
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public final CalendarInterval calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * Enables extending the bounds of the histogram beyond the data itself.
	 * <p>
	 * API name: {@code extended_bounds}
	 */
	@Nullable
	public final ExtendedBounds<FieldDateMath> extendedBounds() {
		return this.extendedBounds;
	}

	/**
	 * Limits the histogram to specified bounds.
	 * <p>
	 * API name: {@code hard_bounds}
	 */
	@Nullable
	public final ExtendedBounds<FieldDateMath> hardBounds() {
		return this.hardBounds;
	}

	/**
	 * The date field whose values are use to build a histogram.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * Fixed intervals: a fixed number of SI units and never deviate, regardless of
	 * where they fall on the calendar.
	 * <p>
	 * API name: {@code fixed_interval}
	 */
	@Nullable
	public final Time fixedInterval() {
		return this.fixedInterval;
	}

	/**
	 * The date format used to format <code>key_as_string</code> in the response. If
	 * no <code>format</code> is specified, the first date format specified in the
	 * field mapping is used.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code interval}
	 * 
	 * @deprecated 7.2.0 use <code>fixed_interval</code> or
	 *             <code>calendar_interval</code>
	 */
	@Deprecated
	@Nullable
	public final Time interval() {
		return this.interval;
	}

	/**
	 * Only returns buckets that have <code>min_doc_count</code> number of
	 * documents. By default, all buckets between the first bucket that matches
	 * documents and the last one are returned.
	 * <p>
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * The value to apply to documents that do not have a value. By default,
	 * documents without a value are ignored.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final DateTime missing() {
		return this.missing;
	}

	/**
	 * Changes the start value of each bucket by the specified positive
	 * (<code>+</code>) or negative offset (<code>-</code>) duration.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final Time offset() {
		return this.offset;
	}

	/**
	 * The order of the returned buckets.
	 * <p>
	 * API name: {@code order}
	 */
	public final List<NamedValue<SortOrder>> order() {
		return this.order;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * Time zone used for bucketing and rounding. Defaults to Coordinated Universal
	 * Time (UTC).
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	/**
	 * Set to <code>true</code> to associate a unique string key with each bucket
	 * and returns the ranges as a hash rather than an array.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.calendarInterval != null) {
			generator.writeKey("calendar_interval");
			this.calendarInterval.serialize(generator, mapper);
		}
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
		if (this.fixedInterval != null) {
			generator.writeKey("fixed_interval");
			this.fixedInterval.serialize(generator, mapper);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.interval != null) {
			generator.writeKey("interval");
			this.interval.serialize(generator, mapper);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);
		}
		if (this.offset != null) {
			generator.writeKey("offset");
			this.offset.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateHistogramAggregation> {
		@Nullable
		private CalendarInterval calendarInterval;

		@Nullable
		private ExtendedBounds<FieldDateMath> extendedBounds;

		@Nullable
		private ExtendedBounds<FieldDateMath> hardBounds;

		@Nullable
		private String field;

		@Nullable
		private Time fixedInterval;

		@Nullable
		private String format;

		@Nullable
		private Time interval;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private DateTime missing;

		@Nullable
		private Time offset;

		@Nullable
		private List<NamedValue<SortOrder>> order;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Script script;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean keyed;

		/**
		 * Calendar-aware interval. Can be specified using the unit name, such as
		 * <code>month</code>, or as a single unit quantity, such as <code>1M</code>.
		 * <p>
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(@Nullable CalendarInterval value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * Enables extending the bounds of the histogram beyond the data itself.
		 * <p>
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(@Nullable ExtendedBounds<FieldDateMath> value) {
			this.extendedBounds = value;
			return this;
		}

		/**
		 * Enables extending the bounds of the histogram beyond the data itself.
		 * <p>
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(
				Function<ExtendedBounds.Builder<FieldDateMath>, ObjectBuilder<ExtendedBounds<FieldDateMath>>> fn) {
			return this.extendedBounds(fn.apply(new ExtendedBounds.Builder<FieldDateMath>()).build());
		}

		/**
		 * Limits the histogram to specified bounds.
		 * <p>
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(@Nullable ExtendedBounds<FieldDateMath> value) {
			this.hardBounds = value;
			return this;
		}

		/**
		 * Limits the histogram to specified bounds.
		 * <p>
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(
				Function<ExtendedBounds.Builder<FieldDateMath>, ObjectBuilder<ExtendedBounds<FieldDateMath>>> fn) {
			return this.hardBounds(fn.apply(new ExtendedBounds.Builder<FieldDateMath>()).build());
		}

		/**
		 * The date field whose values are use to build a histogram.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * Fixed intervals: a fixed number of SI units and never deviate, regardless of
		 * where they fall on the calendar.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(@Nullable Time value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * Fixed intervals: a fixed number of SI units and never deviate, regardless of
		 * where they fall on the calendar.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.fixedInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The date format used to format <code>key_as_string</code> in the response. If
		 * no <code>format</code> is specified, the first date format specified in the
		 * field mapping is used.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 * 
		 * @deprecated 7.2.0 use <code>fixed_interval</code> or
		 *             <code>calendar_interval</code>
		 */
		@Deprecated
		public final Builder interval(@Nullable Time value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 * 
		 * @deprecated 7.2.0 use <code>fixed_interval</code> or
		 *             <code>calendar_interval</code>
		 */
		@Deprecated
		public final Builder interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Only returns buckets that have <code>min_doc_count</code> number of
		 * documents. By default, all buckets between the first bucket that matches
		 * documents and the last one are returned.
		 * <p>
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable DateTime value) {
			this.missing = value;
			return this;
		}

		/**
		 * Changes the start value of each bucket by the specified positive
		 * (<code>+</code>) or negative offset (<code>-</code>) duration.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Time value) {
			this.offset = value;
			return this;
		}

		/**
		 * Changes the start value of each bucket by the specified positive
		 * (<code>+</code>) or negative offset (<code>-</code>) duration.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.offset(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The order of the returned buckets.
		 * <p>
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<NamedValue<SortOrder>> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * The order of the returned buckets.
		 * <p>
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(NamedValue<SortOrder> value, NamedValue<SortOrder>... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
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
		 * Time zone used for bucketing and rounding. Defaults to Coordinated Universal
		 * Time (UTC).
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Set to <code>true</code> to associate a unique string key with each bucket
		 * and returns the ranges as a hash rather than an array.
		 * <p>
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
		 * Builds a {@link DateHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramAggregation build() {
			_checkSingleUse();

			return new DateHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramAggregation}
	 */
	public static final JsonpDeserializer<DateHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramAggregation::setupDateHistogramAggregationDeserializer);

	protected static void setupDateHistogramAggregationDeserializer(
			ObjectDeserializer<DateHistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::calendarInterval, CalendarInterval._DESERIALIZER, "calendar_interval");
		op.add(Builder::extendedBounds, ExtendedBounds.createExtendedBoundsDeserializer(FieldDateMath._DESERIALIZER),
				"extended_bounds");
		op.add(Builder::hardBounds, ExtendedBounds.createExtendedBoundsDeserializer(FieldDateMath._DESERIALIZER),
				"hard_bounds");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::fixedInterval, Time._DESERIALIZER, "fixed_interval");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::interval, Time._DESERIALIZER, "interval");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::missing, DateTime._DESERIALIZER, "missing");
		op.add(Builder::offset, Time._DESERIALIZER, "offset");
		op.add(Builder::order,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> SortOrder._DESERIALIZER)), "order");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
