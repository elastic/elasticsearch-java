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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.aggregations.DateRangeAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DateRangeAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateRangeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final FieldValue missing;

	private final List<DateRangeExpression> ranges;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private DateRangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.format = builder.format;
		this.missing = builder.missing;
		this.ranges = ApiTypeHelper.unmodifiable(builder.ranges);
		this.timeZone = builder.timeZone;
		this.keyed = builder.keyed;

	}

	public static DateRangeAggregation of(Function<Builder, ObjectBuilder<DateRangeAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.DateRange;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final FieldValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code ranges}
	 */
	public final List<DateRangeExpression> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
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
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.ranges)) {
			generator.writeKey("ranges");
			generator.writeStartArray();
			for (DateRangeExpression item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

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
	 * Builder for {@link DateRangeAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateRangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private String format;

		@Nullable
		private FieldValue missing;

		@Nullable
		private List<DateRangeExpression> ranges;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable FieldValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.missing(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(String value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(long value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(double value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(boolean value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ranges</code>.
		 */
		public final Builder ranges(List<DateRangeExpression> list) {
			this.ranges = _listAddAll(this.ranges, list);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds one or more values to <code>ranges</code>.
		 */
		public final Builder ranges(DateRangeExpression value, DateRangeExpression... values) {
			this.ranges = _listAdd(this.ranges, value, values);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds a value to <code>ranges</code> using a builder lambda.
		 */
		public final Builder ranges(Function<DateRangeExpression.Builder, ObjectBuilder<DateRangeExpression>> fn) {
			return ranges(fn.apply(new DateRangeExpression.Builder()).build());
		}

		/**
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
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
		 * Builds a {@link DateRangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeAggregation build() {
			_checkSingleUse();

			return new DateRangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeAggregation}
	 */
	public static final JsonpDeserializer<DateRangeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateRangeAggregation::setupDateRangeAggregationDeserializer);

	protected static void setupDateRangeAggregationDeserializer(ObjectDeserializer<DateRangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::missing, FieldValue._DESERIALIZER, "missing");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(DateRangeExpression._DESERIALIZER), "ranges");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
