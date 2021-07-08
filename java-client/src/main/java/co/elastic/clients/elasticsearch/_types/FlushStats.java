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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.FlushStats
public final class FlushStats implements ToJsonp {
	private final Number periodic;

	private final Number total;

	@Nullable
	private final String totalTime;

	private final Number totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected FlushStats(Builder builder) {

		this.periodic = Objects.requireNonNull(builder.periodic, "periodic");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	/**
	 * API name: {@code periodic}
	 */
	public Number periodic() {
		return this.periodic;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public String totalTime() {
		return this.totalTime;
	}

	/**
	 * API name: {@code total_time_in_millis}
	 */
	public Number totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("periodic");
		generator.write(this.periodic.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushStats}.
	 */
	public static class Builder implements ObjectBuilder<FlushStats> {
		private Number periodic;

		private Number total;

		@Nullable
		private String totalTime;

		private Number totalTimeInMillis;

		/**
		 * API name: {@code periodic}
		 */
		public Builder periodic(Number value) {
			this.periodic = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(Number value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link FlushStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushStats build() {

			return new FlushStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FlushStats
	 */
	public static final JsonpDeserializer<FlushStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FlushStats::setupFlushStatsDeserializer);

	protected static void setupFlushStatsDeserializer(DelegatingDeserializer<FlushStats.Builder> op) {

		op.add(Builder::periodic, JsonpDeserializer.numberDeserializer(), "periodic");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.numberDeserializer(), "total_time_in_millis");

	}

}
