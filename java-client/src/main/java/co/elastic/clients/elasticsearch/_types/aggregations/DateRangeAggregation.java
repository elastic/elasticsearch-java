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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateRangeAggregation
public final class DateRangeAggregation extends BucketAggregationBase {
	@Nullable
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final JsonValue missing;

	@Nullable
	private final List<DateRangeExpression> ranges;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	public DateRangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.format = builder.format;
		this.missing = builder.missing;
		this.ranges = builder.ranges;
		this.timeZone = builder.timeZone;
		this.keyed = builder.keyed;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public JsonValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code ranges}
	 */
	@Nullable
	public List<DateRangeExpression> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public Boolean keyed() {
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
			generator.write(this.missing);

		}
		if (this.ranges != null) {

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
		private JsonValue missing;

		@Nullable
		private List<DateRangeExpression> ranges;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable JsonValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(@Nullable List<DateRangeExpression> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(DateRangeExpression... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(DateRangeExpression value) {
			if (this.ranges == null) {
				this.ranges = new ArrayList<>();
			}
			this.ranges.add(value);
			return this;
		}

		/**
		 * Set {@link #ranges(List)} to a singleton list.
		 */
		public Builder ranges(Function<DateRangeExpression.Builder, ObjectBuilder<DateRangeExpression>> fn) {
			return this.ranges(fn.apply(new DateRangeExpression.Builder()).build());
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(Function<DateRangeExpression.Builder, ObjectBuilder<DateRangeExpression>> fn) {
			return this.addRanges(fn.apply(new DateRangeExpression.Builder()).build());
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public Builder keyed(@Nullable Boolean value) {
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

			return new DateRangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeAggregation}
	 */
	public static final JsonpDeserializer<DateRangeAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DateRangeAggregation::setupDateRangeAggregationDeserializer);

	protected static void setupDateRangeAggregationDeserializer(
			DelegatingDeserializer<DateRangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::missing, JsonpDeserializer.jsonValueDeserializer(), "missing");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(DateRangeExpression.DESERIALIZER), "ranges");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
