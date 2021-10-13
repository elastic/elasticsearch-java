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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup._types.DateHistogramGrouping
@JsonpDeserializable
public final class DateHistogramGrouping implements JsonpSerializable {
	@Nullable
	private final String delay;

	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final String interval;

	@Nullable
	private final String calendarInterval;

	@Nullable
	private final String fixedInterval;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	public DateHistogramGrouping(Builder builder) {

		this.delay = builder.delay;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.format = builder.format;
		this.interval = builder.interval;
		this.calendarInterval = builder.calendarInterval;
		this.fixedInterval = builder.fixedInterval;
		this.timeZone = builder.timeZone;

	}

	public DateHistogramGrouping(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code delay}
	 */
	@Nullable
	public String delay() {
		return this.delay;
	}

	/**
	 * Required - API name: {@code field}
	 */
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
	 * API name: {@code interval}
	 */
	@Nullable
	public String interval() {
		return this.interval;
	}

	/**
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public String calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * API name: {@code fixed_interval}
	 */
	@Nullable
	public String fixedInterval() {
		return this.fixedInterval;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
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
			generator.write(this.delay);

		}

		generator.writeKey("field");
		generator.write(this.field);

		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.interval != null) {

			generator.writeKey("interval");
			generator.write(this.interval);

		}
		if (this.calendarInterval != null) {

			generator.writeKey("calendar_interval");
			generator.write(this.calendarInterval);

		}
		if (this.fixedInterval != null) {

			generator.writeKey("fixed_interval");
			generator.write(this.fixedInterval);

		}
		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramGrouping}.
	 */
	public static class Builder implements ObjectBuilder<DateHistogramGrouping> {
		@Nullable
		private String delay;

		private String field;

		@Nullable
		private String format;

		@Nullable
		private String interval;

		@Nullable
		private String calendarInterval;

		@Nullable
		private String fixedInterval;

		@Nullable
		private String timeZone;

		/**
		 * API name: {@code delay}
		 */
		public Builder delay(@Nullable String value) {
			this.delay = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
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
		 * API name: {@code interval}
		 */
		public Builder interval(@Nullable String value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code calendar_interval}
		 */
		public Builder calendarInterval(@Nullable String value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * API name: {@code fixed_interval}
		 */
		public Builder fixedInterval(@Nullable String value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Builds a {@link DateHistogramGrouping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramGrouping build() {

			return new DateHistogramGrouping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramGrouping}
	 */
	public static final JsonpDeserializer<DateHistogramGrouping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramGrouping::setupDateHistogramGroupingDeserializer, Builder::build);

	protected static void setupDateHistogramGroupingDeserializer(
			DelegatingDeserializer<DateHistogramGrouping.Builder> op) {

		op.add(Builder::delay, JsonpDeserializer.stringDeserializer(), "delay");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::interval, JsonpDeserializer.stringDeserializer(), "interval");
		op.add(Builder::calendarInterval, JsonpDeserializer.stringDeserializer(), "calendar_interval");
		op.add(Builder::fixedInterval, JsonpDeserializer.stringDeserializer(), "fixed_interval");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
