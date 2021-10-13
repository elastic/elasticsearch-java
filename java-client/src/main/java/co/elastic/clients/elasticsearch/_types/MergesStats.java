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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.MergesStats
@JsonpDeserializable
public final class MergesStats implements JsonpSerializable {
	private final long current;

	private final long currentDocs;

	@Nullable
	private final String currentSize;

	private final long currentSizeInBytes;

	private final long total;

	@Nullable
	private final String totalAutoThrottle;

	private final long totalAutoThrottleInBytes;

	private final long totalDocs;

	@Nullable
	private final String totalSize;

	private final long totalSizeInBytes;

	@Nullable
	private final String totalStoppedTime;

	private final long totalStoppedTimeInMillis;

	@Nullable
	private final String totalThrottledTime;

	private final long totalThrottledTimeInMillis;

	@Nullable
	private final String totalTime;

	private final long totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public MergesStats(Builder builder) {

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

	public MergesStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code current}
	 */
	public long current() {
		return this.current;
	}

	/**
	 * Required - API name: {@code current_docs}
	 */
	public long currentDocs() {
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
	 * Required - API name: {@code current_size_in_bytes}
	 */
	public long currentSizeInBytes() {
		return this.currentSizeInBytes;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public long total() {
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
	 * Required - API name: {@code total_auto_throttle_in_bytes}
	 */
	public long totalAutoThrottleInBytes() {
		return this.totalAutoThrottleInBytes;
	}

	/**
	 * Required - API name: {@code total_docs}
	 */
	public long totalDocs() {
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
	 * Required - API name: {@code total_size_in_bytes}
	 */
	public long totalSizeInBytes() {
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
	 * Required - API name: {@code total_stopped_time_in_millis}
	 */
	public long totalStoppedTimeInMillis() {
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
	 * Required - API name: {@code total_throttled_time_in_millis}
	 */
	public long totalThrottledTimeInMillis() {
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
	 * Required - API name: {@code total_time_in_millis}
	 */
	public long totalTimeInMillis() {
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

		generator.writeKey("current");
		generator.write(this.current);

		generator.writeKey("current_docs");
		generator.write(this.currentDocs);

		if (this.currentSize != null) {

			generator.writeKey("current_size");
			generator.write(this.currentSize);

		}

		generator.writeKey("current_size_in_bytes");
		generator.write(this.currentSizeInBytes);

		generator.writeKey("total");
		generator.write(this.total);

		if (this.totalAutoThrottle != null) {

			generator.writeKey("total_auto_throttle");
			generator.write(this.totalAutoThrottle);

		}

		generator.writeKey("total_auto_throttle_in_bytes");
		generator.write(this.totalAutoThrottleInBytes);

		generator.writeKey("total_docs");
		generator.write(this.totalDocs);

		if (this.totalSize != null) {

			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}

		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes);

		if (this.totalStoppedTime != null) {

			generator.writeKey("total_stopped_time");
			generator.write(this.totalStoppedTime);

		}

		generator.writeKey("total_stopped_time_in_millis");
		generator.write(this.totalStoppedTimeInMillis);

		if (this.totalThrottledTime != null) {

			generator.writeKey("total_throttled_time");
			generator.write(this.totalThrottledTime);

		}

		generator.writeKey("total_throttled_time_in_millis");
		generator.write(this.totalThrottledTimeInMillis);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MergesStats}.
	 */
	public static class Builder implements ObjectBuilder<MergesStats> {
		private Long current;

		private Long currentDocs;

		@Nullable
		private String currentSize;

		private Long currentSizeInBytes;

		private Long total;

		@Nullable
		private String totalAutoThrottle;

		private Long totalAutoThrottleInBytes;

		private Long totalDocs;

		@Nullable
		private String totalSize;

		private Long totalSizeInBytes;

		@Nullable
		private String totalStoppedTime;

		private Long totalStoppedTimeInMillis;

		@Nullable
		private String totalThrottledTime;

		private Long totalThrottledTimeInMillis;

		@Nullable
		private String totalTime;

		private Long totalTimeInMillis;

		/**
		 * Required - API name: {@code current}
		 */
		public Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_docs}
		 */
		public Builder currentDocs(long value) {
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
		 * Required - API name: {@code current_size_in_bytes}
		 */
		public Builder currentSizeInBytes(long value) {
			this.currentSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(long value) {
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
		 * Required - API name: {@code total_auto_throttle_in_bytes}
		 */
		public Builder totalAutoThrottleInBytes(long value) {
			this.totalAutoThrottleInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_docs}
		 */
		public Builder totalDocs(long value) {
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
		 * Required - API name: {@code total_size_in_bytes}
		 */
		public Builder totalSizeInBytes(long value) {
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
		 * Required - API name: {@code total_stopped_time_in_millis}
		 */
		public Builder totalStoppedTimeInMillis(long value) {
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
		 * Required - API name: {@code total_throttled_time_in_millis}
		 */
		public Builder totalThrottledTimeInMillis(long value) {
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
		 * Required - API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(long value) {
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
	 * Json deserializer for {@link MergesStats}
	 */
	public static final JsonpDeserializer<MergesStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MergesStats::setupMergesStatsDeserializer, Builder::build);

	protected static void setupMergesStatsDeserializer(DelegatingDeserializer<MergesStats.Builder> op) {

		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::currentDocs, JsonpDeserializer.longDeserializer(), "current_docs");
		op.add(Builder::currentSize, JsonpDeserializer.stringDeserializer(), "current_size");
		op.add(Builder::currentSizeInBytes, JsonpDeserializer.longDeserializer(), "current_size_in_bytes");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::totalAutoThrottle, JsonpDeserializer.stringDeserializer(), "total_auto_throttle");
		op.add(Builder::totalAutoThrottleInBytes, JsonpDeserializer.longDeserializer(), "total_auto_throttle_in_bytes");
		op.add(Builder::totalDocs, JsonpDeserializer.longDeserializer(), "total_docs");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.longDeserializer(), "total_size_in_bytes");
		op.add(Builder::totalStoppedTime, JsonpDeserializer.stringDeserializer(), "total_stopped_time");
		op.add(Builder::totalStoppedTimeInMillis, JsonpDeserializer.longDeserializer(), "total_stopped_time_in_millis");
		op.add(Builder::totalThrottledTime, JsonpDeserializer.stringDeserializer(), "total_throttled_time");
		op.add(Builder::totalThrottledTimeInMillis, JsonpDeserializer.longDeserializer(),
				"total_throttled_time_in_millis");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");

	}

}
