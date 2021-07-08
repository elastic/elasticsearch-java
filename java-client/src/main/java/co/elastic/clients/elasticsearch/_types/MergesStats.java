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

// typedef: _types.MergesStats
public final class MergesStats implements ToJsonp {
	private final Number current;

	private final Number currentDocs;

	@Nullable
	private final String currentSize;

	private final Number currentSizeInBytes;

	private final Number total;

	@Nullable
	private final String totalAutoThrottle;

	private final Number totalAutoThrottleInBytes;

	private final Number totalDocs;

	@Nullable
	private final String totalSize;

	private final Number totalSizeInBytes;

	@Nullable
	private final String totalStoppedTime;

	private final Number totalStoppedTimeInMillis;

	@Nullable
	private final String totalThrottledTime;

	private final Number totalThrottledTimeInMillis;

	@Nullable
	private final String totalTime;

	private final Number totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected MergesStats(Builder builder) {

		this.current = Objects.requireNonNull(builder.current, "current");
		this.currentDocs = Objects.requireNonNull(builder.currentDocs, "current_docs");
		this.currentSize = builder.currentSize;
		this.currentSizeInBytes = Objects.requireNonNull(builder.currentSizeInBytes, "current_size_in_bytes");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalAutoThrottle = builder.totalAutoThrottle;
		this.totalAutoThrottleInBytes = Objects.requireNonNull(builder.totalAutoThrottleInBytes,
				"total_auto_throttle_in_bytes");
		this.totalDocs = Objects.requireNonNull(builder.totalDocs, "total_docs");
		this.totalSize = builder.totalSize;
		this.totalSizeInBytes = Objects.requireNonNull(builder.totalSizeInBytes, "total_size_in_bytes");
		this.totalStoppedTime = builder.totalStoppedTime;
		this.totalStoppedTimeInMillis = Objects.requireNonNull(builder.totalStoppedTimeInMillis,
				"total_stopped_time_in_millis");
		this.totalThrottledTime = builder.totalThrottledTime;
		this.totalThrottledTimeInMillis = Objects.requireNonNull(builder.totalThrottledTimeInMillis,
				"total_throttled_time_in_millis");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	/**
	 * API name: {@code current}
	 */
	public Number current() {
		return this.current;
	}

	/**
	 * API name: {@code current_docs}
	 */
	public Number currentDocs() {
		return this.currentDocs;
	}

	/**
	 * API name: {@code current_size}
	 */
	@Nullable
	public String currentSize() {
		return this.currentSize;
	}

	/**
	 * API name: {@code current_size_in_bytes}
	 */
	public Number currentSizeInBytes() {
		return this.currentSizeInBytes;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code total_auto_throttle}
	 */
	@Nullable
	public String totalAutoThrottle() {
		return this.totalAutoThrottle;
	}

	/**
	 * API name: {@code total_auto_throttle_in_bytes}
	 */
	public Number totalAutoThrottleInBytes() {
		return this.totalAutoThrottleInBytes;
	}

	/**
	 * API name: {@code total_docs}
	 */
	public Number totalDocs() {
		return this.totalDocs;
	}

	/**
	 * API name: {@code total_size}
	 */
	@Nullable
	public String totalSize() {
		return this.totalSize;
	}

	/**
	 * API name: {@code total_size_in_bytes}
	 */
	public Number totalSizeInBytes() {
		return this.totalSizeInBytes;
	}

	/**
	 * API name: {@code total_stopped_time}
	 */
	@Nullable
	public String totalStoppedTime() {
		return this.totalStoppedTime;
	}

	/**
	 * API name: {@code total_stopped_time_in_millis}
	 */
	public Number totalStoppedTimeInMillis() {
		return this.totalStoppedTimeInMillis;
	}

	/**
	 * API name: {@code total_throttled_time}
	 */
	@Nullable
	public String totalThrottledTime() {
		return this.totalThrottledTime;
	}

	/**
	 * API name: {@code total_throttled_time_in_millis}
	 */
	public Number totalThrottledTimeInMillis() {
		return this.totalThrottledTimeInMillis;
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

		generator.writeKey("current");
		generator.write(this.current.doubleValue());

		generator.writeKey("current_docs");
		generator.write(this.currentDocs.doubleValue());

		if (this.currentSize != null) {

			generator.writeKey("current_size");
			generator.write(this.currentSize);

		}

		generator.writeKey("current_size_in_bytes");
		generator.write(this.currentSizeInBytes.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		if (this.totalAutoThrottle != null) {

			generator.writeKey("total_auto_throttle");
			generator.write(this.totalAutoThrottle);

		}

		generator.writeKey("total_auto_throttle_in_bytes");
		generator.write(this.totalAutoThrottleInBytes.doubleValue());

		generator.writeKey("total_docs");
		generator.write(this.totalDocs.doubleValue());

		if (this.totalSize != null) {

			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}

		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes.doubleValue());

		if (this.totalStoppedTime != null) {

			generator.writeKey("total_stopped_time");
			generator.write(this.totalStoppedTime);

		}

		generator.writeKey("total_stopped_time_in_millis");
		generator.write(this.totalStoppedTimeInMillis.doubleValue());

		if (this.totalThrottledTime != null) {

			generator.writeKey("total_throttled_time");
			generator.write(this.totalThrottledTime);

		}

		generator.writeKey("total_throttled_time_in_millis");
		generator.write(this.totalThrottledTimeInMillis.doubleValue());

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MergesStats}.
	 */
	public static class Builder implements ObjectBuilder<MergesStats> {
		private Number current;

		private Number currentDocs;

		@Nullable
		private String currentSize;

		private Number currentSizeInBytes;

		private Number total;

		@Nullable
		private String totalAutoThrottle;

		private Number totalAutoThrottleInBytes;

		private Number totalDocs;

		@Nullable
		private String totalSize;

		private Number totalSizeInBytes;

		@Nullable
		private String totalStoppedTime;

		private Number totalStoppedTimeInMillis;

		@Nullable
		private String totalThrottledTime;

		private Number totalThrottledTimeInMillis;

		@Nullable
		private String totalTime;

		private Number totalTimeInMillis;

		/**
		 * API name: {@code current}
		 */
		public Builder current(Number value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code current_docs}
		 */
		public Builder currentDocs(Number value) {
			this.currentDocs = value;
			return this;
		}

		/**
		 * API name: {@code current_size}
		 */
		public Builder currentSize(@Nullable String value) {
			this.currentSize = value;
			return this;
		}

		/**
		 * API name: {@code current_size_in_bytes}
		 */
		public Builder currentSizeInBytes(Number value) {
			this.currentSizeInBytes = value;
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
		 * API name: {@code total_auto_throttle}
		 */
		public Builder totalAutoThrottle(@Nullable String value) {
			this.totalAutoThrottle = value;
			return this;
		}

		/**
		 * API name: {@code total_auto_throttle_in_bytes}
		 */
		public Builder totalAutoThrottleInBytes(Number value) {
			this.totalAutoThrottleInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_docs}
		 */
		public Builder totalDocs(Number value) {
			this.totalDocs = value;
			return this;
		}

		/**
		 * API name: {@code total_size}
		 */
		public Builder totalSize(@Nullable String value) {
			this.totalSize = value;
			return this;
		}

		/**
		 * API name: {@code total_size_in_bytes}
		 */
		public Builder totalSizeInBytes(Number value) {
			this.totalSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_stopped_time}
		 */
		public Builder totalStoppedTime(@Nullable String value) {
			this.totalStoppedTime = value;
			return this;
		}

		/**
		 * API name: {@code total_stopped_time_in_millis}
		 */
		public Builder totalStoppedTimeInMillis(Number value) {
			this.totalStoppedTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_throttled_time}
		 */
		public Builder totalThrottledTime(@Nullable String value) {
			this.totalThrottledTime = value;
			return this;
		}

		/**
		 * API name: {@code total_throttled_time_in_millis}
		 */
		public Builder totalThrottledTimeInMillis(Number value) {
			this.totalThrottledTimeInMillis = value;
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
		 * Builds a {@link MergesStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MergesStats build() {

			return new MergesStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MergesStats
	 */
	public static final JsonpDeserializer<MergesStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MergesStats::setupMergesStatsDeserializer);

	protected static void setupMergesStatsDeserializer(DelegatingDeserializer<MergesStats.Builder> op) {

		op.add(Builder::current, JsonpDeserializer.numberDeserializer(), "current");
		op.add(Builder::currentDocs, JsonpDeserializer.numberDeserializer(), "current_docs");
		op.add(Builder::currentSize, JsonpDeserializer.stringDeserializer(), "current_size");
		op.add(Builder::currentSizeInBytes, JsonpDeserializer.numberDeserializer(), "current_size_in_bytes");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::totalAutoThrottle, JsonpDeserializer.stringDeserializer(), "total_auto_throttle");
		op.add(Builder::totalAutoThrottleInBytes, JsonpDeserializer.numberDeserializer(),
				"total_auto_throttle_in_bytes");
		op.add(Builder::totalDocs, JsonpDeserializer.numberDeserializer(), "total_docs");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.numberDeserializer(), "total_size_in_bytes");
		op.add(Builder::totalStoppedTime, JsonpDeserializer.stringDeserializer(), "total_stopped_time");
		op.add(Builder::totalStoppedTimeInMillis, JsonpDeserializer.numberDeserializer(),
				"total_stopped_time_in_millis");
		op.add(Builder::totalThrottledTime, JsonpDeserializer.stringDeserializer(), "total_throttled_time");
		op.add(Builder::totalThrottledTimeInMillis, JsonpDeserializer.numberDeserializer(),
				"total_throttled_time_in_millis");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.numberDeserializer(), "total_time_in_millis");

	}

}
