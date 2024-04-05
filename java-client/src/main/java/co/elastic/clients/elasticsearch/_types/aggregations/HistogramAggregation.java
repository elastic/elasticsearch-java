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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
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

// typedef: _types.aggregations.HistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.HistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class HistogramAggregation extends BucketAggregationBase
		implements
			AggregationVariant,
			PivotGroupByVariant,
			JsonpSerializable {
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
	 * Enables extending the bounds of the histogram beyond the data itself.
	 * <p>
	 * API name: {@code extended_bounds}
	 */
	@Nullable
	public final ExtendedBounds<Double> extendedBounds() {
		return this.extendedBounds;
	}

	/**
	 * Limits the range of buckets in the histogram. It is particularly useful in
	 * the case of open data ranges that can result in a very large number of
	 * buckets.
	 * <p>
	 * API name: {@code hard_bounds}
	 */
	@Nullable
	public final ExtendedBounds<Double> hardBounds() {
		return this.hardBounds;
	}

	/**
	 * The name of the field to aggregate on.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * The interval for the buckets. Must be a positive decimal.
	 * <p>
	 * API name: {@code interval}
	 */
	@Nullable
	public final Double interval() {
		return this.interval;
	}

	/**
	 * Only returns buckets that have <code>min_doc_count</code> number of
	 * documents. By default, the response will fill gaps in the histogram with
	 * empty buckets.
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
	public final Double missing() {
		return this.missing;
	}

	/**
	 * By default, the bucket keys start with 0 and then continue in even spaced
	 * steps of <code>interval</code>. The bucket boundaries can be shifted by using
	 * the <code>offset</code> option.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final Double offset() {
		return this.offset;
	}

	/**
	 * The sort order of the returned buckets. By default, the returned buckets are
	 * sorted by their key ascending.
	 * <p>
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
	 * If <code>true</code>, returns buckets as a hash instead of an array, keyed by
	 * the bucket keys.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
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
		 * Enables extending the bounds of the histogram beyond the data itself.
		 * <p>
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(@Nullable ExtendedBounds<Double> value) {
			this.extendedBounds = value;
			return this;
		}

		/**
		 * Enables extending the bounds of the histogram beyond the data itself.
		 * <p>
		 * API name: {@code extended_bounds}
		 */
		public final Builder extendedBounds(
				Function<ExtendedBounds.Builder<Double>, ObjectBuilder<ExtendedBounds<Double>>> fn) {
			return this.extendedBounds(fn.apply(new ExtendedBounds.Builder<Double>()).build());
		}

		/**
		 * Limits the range of buckets in the histogram. It is particularly useful in
		 * the case of open data ranges that can result in a very large number of
		 * buckets.
		 * <p>
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(@Nullable ExtendedBounds<Double> value) {
			this.hardBounds = value;
			return this;
		}

		/**
		 * Limits the range of buckets in the histogram. It is particularly useful in
		 * the case of open data ranges that can result in a very large number of
		 * buckets.
		 * <p>
		 * API name: {@code hard_bounds}
		 */
		public final Builder hardBounds(
				Function<ExtendedBounds.Builder<Double>, ObjectBuilder<ExtendedBounds<Double>>> fn) {
			return this.hardBounds(fn.apply(new ExtendedBounds.Builder<Double>()).build());
		}

		/**
		 * The name of the field to aggregate on.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * The interval for the buckets. Must be a positive decimal.
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable Double value) {
			this.interval = value;
			return this;
		}

		/**
		 * Only returns buckets that have <code>min_doc_count</code> number of
		 * documents. By default, the response will fill gaps in the histogram with
		 * empty buckets.
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
		public final Builder missing(@Nullable Double value) {
			this.missing = value;
			return this;
		}

		/**
		 * By default, the bucket keys start with 0 and then continue in even spaced
		 * steps of <code>interval</code>. The bucket boundaries can be shifted by using
		 * the <code>offset</code> option.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Double value) {
			this.offset = value;
			return this;
		}

		/**
		 * The sort order of the returned buckets. By default, the returned buckets are
		 * sorted by their key ascending.
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
		 * The sort order of the returned buckets. By default, the returned buckets are
		 * sorted by their key ascending.
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
		 * If <code>true</code>, returns buckets as a hash instead of an array, keyed by
		 * the bucket keys.
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
