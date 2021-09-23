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

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.recovery.TranslogStatus
public final class TranslogStatus implements JsonpSerializable {
	private final JsonValue percent;

	private final Number recovered;

	private final Number total;

	private final Number totalOnStart;

	@Nullable
	private final String totalTime;

	private final JsonValue totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public TranslogStatus(Builder builder) {

		this.percent = Objects.requireNonNull(builder.percent, "percent");
		this.recovered = Objects.requireNonNull(builder.recovered, "recovered");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalOnStart = Objects.requireNonNull(builder.totalOnStart, "total_on_start");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	/**
	 * API name: {@code percent}
	 */
	public JsonValue percent() {
		return this.percent;
	}

	/**
	 * API name: {@code recovered}
	 */
	public Number recovered() {
		return this.recovered;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code total_on_start}
	 */
	public Number totalOnStart() {
		return this.totalOnStart;
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
	public JsonValue totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		generator.writeKey("percent");
		generator.write(this.percent);

		generator.writeKey("recovered");
		generator.write(this.recovered.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("total_on_start");
		generator.write(this.totalOnStart.doubleValue());

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslogStatus}.
	 */
	public static class Builder implements ObjectBuilder<TranslogStatus> {
		private JsonValue percent;

		private Number recovered;

		private Number total;

		private Number totalOnStart;

		@Nullable
		private String totalTime;

		private JsonValue totalTimeInMillis;

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(JsonValue value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code recovered}
		 */
		public Builder recovered(Number value) {
			this.recovered = value;
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
		 * API name: {@code total_on_start}
		 */
		public Builder totalOnStart(Number value) {
			this.totalOnStart = value;
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
		public Builder totalTimeInMillis(JsonValue value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link TranslogStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslogStatus build() {

			return new TranslogStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslogStatus}
	 */
	public static final JsonpDeserializer<TranslogStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TranslogStatus::setupTranslogStatusDeserializer);

	protected static void setupTranslogStatusDeserializer(DelegatingDeserializer<TranslogStatus.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.jsonValueDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.numberDeserializer(), "recovered");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::totalOnStart, JsonpDeserializer.numberDeserializer(), "total_on_start");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "total_time_in_millis");

	}

}
