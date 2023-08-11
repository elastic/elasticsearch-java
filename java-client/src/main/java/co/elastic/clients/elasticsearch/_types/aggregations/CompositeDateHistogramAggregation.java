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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeDateHistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeDateHistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeDateHistogramAggregation extends CompositeAggregationBase {
	@Nullable
	private final String format;

	@Nullable
	private final Time calendarInterval;

	@Nullable
	private final Time fixedInterval;

	@Nullable
	private final Time offset;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private CompositeDateHistogramAggregation(Builder builder) {
		super(builder);

		this.format = builder.format;
		this.calendarInterval = builder.calendarInterval;
		this.fixedInterval = builder.fixedInterval;
		this.offset = builder.offset;
		this.timeZone = builder.timeZone;

	}

	public static CompositeDateHistogramAggregation of(
			Function<Builder, ObjectBuilder<CompositeDateHistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
	 * present
	 * <p>
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public final Time calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
	 * present
	 * <p>
	 * API name: {@code fixed_interval}
	 */
	@Nullable
	public final Time fixedInterval() {
		return this.fixedInterval;
	}

	/**
	 * API name: {@code offset}
	 */
	@Nullable
	public final Time offset() {
		return this.offset;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.calendarInterval != null) {
			generator.writeKey("calendar_interval");
			this.calendarInterval.serialize(generator, mapper);

		}
		if (this.fixedInterval != null) {
			generator.writeKey("fixed_interval");
			this.fixedInterval.serialize(generator, mapper);

		}
		if (this.offset != null) {
			generator.writeKey("offset");
			this.offset.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeDateHistogramAggregation}.
	 */

	public static class Builder extends CompositeAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompositeDateHistogramAggregation> {
		@Nullable
		private String format;

		@Nullable
		private Time calendarInterval;

		@Nullable
		private Time fixedInterval;

		@Nullable
		private Time offset;

		@Nullable
		private String timeZone;

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
		 * present
		 * <p>
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(@Nullable Time value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
		 * present
		 * <p>
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.calendarInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
		 * present
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(@Nullable Time value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * Either <code>calendar_interval</code> or <code>fixed_interval</code> must be
		 * present
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.fixedInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable Time value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public final Builder offset(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.offset(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeDateHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeDateHistogramAggregation build() {
			_checkSingleUse();

			return new CompositeDateHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeDateHistogramAggregation}
	 */
	public static final JsonpDeserializer<CompositeDateHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeDateHistogramAggregation::setupCompositeDateHistogramAggregationDeserializer);

	protected static void setupCompositeDateHistogramAggregationDeserializer(
			ObjectDeserializer<CompositeDateHistogramAggregation.Builder> op) {
		CompositeAggregationBase.setupCompositeAggregationBaseDeserializer(op);
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::calendarInterval, Time._DESERIALIZER, "calendar_interval");
		op.add(Builder::fixedInterval, Time._DESERIALIZER, "fixed_interval");
		op.add(Builder::offset, Time._DESERIALIZER, "offset");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
