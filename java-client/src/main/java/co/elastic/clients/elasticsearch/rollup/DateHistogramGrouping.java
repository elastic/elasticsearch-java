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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: rollup._types.DateHistogramGrouping

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#rollup._types.DateHistogramGrouping">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateHistogramGrouping implements JsonpSerializable {
	@Nullable
	private final Time delay;

	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final Time interval;

	@Nullable
	private final Time calendarInterval;

	@Nullable
	private final Time fixedInterval;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private DateHistogramGrouping(Builder builder) {

		this.delay = builder.delay;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.format = builder.format;
		this.interval = builder.interval;
		this.calendarInterval = builder.calendarInterval;
		this.fixedInterval = builder.fixedInterval;
		this.timeZone = builder.timeZone;

	}

	public static DateHistogramGrouping of(Function<Builder, ObjectBuilder<DateHistogramGrouping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * How long to wait before rolling up new documents. By default, the indexer
	 * attempts to roll up all data that is available. However, it is not uncommon
	 * for data to arrive out of order. The indexer is unable to deal with data that
	 * arrives after a time-span has been rolled up. You need to specify a delay
	 * that matches the longest period of time you expect out-of-order data to
	 * arrive.
	 * <p>
	 * API name: {@code delay}
	 */
	@Nullable
	public final Time delay() {
		return this.delay;
	}

	/**
	 * Required - The date field that is to be rolled up.
	 * <p>
	 * API name: {@code field}
	 */
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
	 * API name: {@code interval}
	 */
	@Nullable
	public final Time interval() {
		return this.interval;
	}

	/**
	 * The interval of time buckets to be generated when rolling up.
	 * <p>
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public final Time calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * The interval of time buckets to be generated when rolling up.
	 * <p>
	 * API name: {@code fixed_interval}
	 */
	@Nullable
	public final Time fixedInterval() {
		return this.fixedInterval;
	}

	/**
	 * Defines what <code>time_zone</code> the rollup documents are stored as.
	 * Unlike raw data, which can shift timezones on the fly, rolled documents have
	 * to be stored with a specific timezone. By default, rollup documents are
	 * stored in <code>UTC</code>.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
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

		if (this.delay != null) {
			generator.writeKey("delay");
			this.delay.serialize(generator, mapper);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.interval != null) {
			generator.writeKey("interval");
			this.interval.serialize(generator, mapper);

		}
		if (this.calendarInterval != null) {
			generator.writeKey("calendar_interval");
			this.calendarInterval.serialize(generator, mapper);

		}
		if (this.fixedInterval != null) {
			generator.writeKey("fixed_interval");
			this.fixedInterval.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramGrouping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DateHistogramGrouping> {
		@Nullable
		private Time delay;

		private String field;

		@Nullable
		private String format;

		@Nullable
		private Time interval;

		@Nullable
		private Time calendarInterval;

		@Nullable
		private Time fixedInterval;

		@Nullable
		private String timeZone;

		/**
		 * How long to wait before rolling up new documents. By default, the indexer
		 * attempts to roll up all data that is available. However, it is not uncommon
		 * for data to arrive out of order. The indexer is unable to deal with data that
		 * arrives after a time-span has been rolled up. You need to specify a delay
		 * that matches the longest period of time you expect out-of-order data to
		 * arrive.
		 * <p>
		 * API name: {@code delay}
		 */
		public final Builder delay(@Nullable Time value) {
			this.delay = value;
			return this;
		}

		/**
		 * How long to wait before rolling up new documents. By default, the indexer
		 * attempts to roll up all data that is available. However, it is not uncommon
		 * for data to arrive out of order. The indexer is unable to deal with data that
		 * arrives after a time-span has been rolled up. You need to specify a delay
		 * that matches the longest period of time you expect out-of-order data to
		 * arrive.
		 * <p>
		 * API name: {@code delay}
		 */
		public final Builder delay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.delay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The date field that is to be rolled up.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
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
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable Time value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public final Builder interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The interval of time buckets to be generated when rolling up.
		 * <p>
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(@Nullable Time value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * The interval of time buckets to be generated when rolling up.
		 * <p>
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.calendarInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The interval of time buckets to be generated when rolling up.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(@Nullable Time value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * The interval of time buckets to be generated when rolling up.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.fixedInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Defines what <code>time_zone</code> the rollup documents are stored as.
		 * Unlike raw data, which can shift timezones on the fly, rolled documents have
		 * to be stored with a specific timezone. By default, rollup documents are
		 * stored in <code>UTC</code>.
		 * <p>
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
		 * Builds a {@link DateHistogramGrouping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramGrouping build() {
			_checkSingleUse();

			return new DateHistogramGrouping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramGrouping}
	 */
	public static final JsonpDeserializer<DateHistogramGrouping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramGrouping::setupDateHistogramGroupingDeserializer);

	protected static void setupDateHistogramGroupingDeserializer(ObjectDeserializer<DateHistogramGrouping.Builder> op) {

		op.add(Builder::delay, Time._DESERIALIZER, "delay");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::interval, Time._DESERIALIZER, "interval");
		op.add(Builder::calendarInterval, Time._DESERIALIZER, "calendar_interval");
		op.add(Builder::fixedInterval, Time._DESERIALIZER, "fixed_interval");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
