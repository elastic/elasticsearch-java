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
import javax.annotation.Nullable;

// typedef: _types.BulkStats
@JsonpDeserializable
public final class BulkStats implements JsonpSerializable {
	private final long totalOperations;

	@Nullable
	private final String totalTime;

	private final long totalTimeInMillis;

	@Nullable
	private final String totalSize;

	private final long totalSizeInBytes;

	@Nullable
	private final String avgTime;

	private final long avgTimeInMillis;

	@Nullable
	private final String avgSize;

	private final long avgSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public BulkStats(Builder builder) {

		this.totalOperations = Objects.requireNonNull(builder.totalOperations, "total_operations");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");
		this.totalSize = builder.totalSize;
		this.totalSizeInBytes = Objects.requireNonNull(builder.totalSizeInBytes, "total_size_in_bytes");
		this.avgTime = builder.avgTime;
		this.avgTimeInMillis = Objects.requireNonNull(builder.avgTimeInMillis, "avg_time_in_millis");
		this.avgSize = builder.avgSize;
		this.avgSizeInBytes = Objects.requireNonNull(builder.avgSizeInBytes, "avg_size_in_bytes");

	}

	/**
	 * API name: {@code total_operations}
	 */
	public long totalOperations() {
		return this.totalOperations;
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
	public long totalTimeInMillis() {
		return this.totalTimeInMillis;
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
	public long totalSizeInBytes() {
		return this.totalSizeInBytes;
	}

	/**
	 * API name: {@code avg_time}
	 */
	@Nullable
	public String avgTime() {
		return this.avgTime;
	}

	/**
	 * API name: {@code avg_time_in_millis}
	 */
	public long avgTimeInMillis() {
		return this.avgTimeInMillis;
	}

	/**
	 * API name: {@code avg_size}
	 */
	@Nullable
	public String avgSize() {
		return this.avgSize;
	}

	/**
	 * API name: {@code avg_size_in_bytes}
	 */
	public long avgSizeInBytes() {
		return this.avgSizeInBytes;
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

		generator.writeKey("total_operations");
		generator.write(this.totalOperations);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

		if (this.totalSize != null) {

			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}

		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes);

		if (this.avgTime != null) {

			generator.writeKey("avg_time");
			generator.write(this.avgTime);

		}

		generator.writeKey("avg_time_in_millis");
		generator.write(this.avgTimeInMillis);

		if (this.avgSize != null) {

			generator.writeKey("avg_size");
			generator.write(this.avgSize);

		}

		generator.writeKey("avg_size_in_bytes");
		generator.write(this.avgSizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkStats}.
	 */
	public static class Builder implements ObjectBuilder<BulkStats> {
		private Long totalOperations;

		@Nullable
		private String totalTime;

		private Long totalTimeInMillis;

		@Nullable
		private String totalSize;

		private Long totalSizeInBytes;

		@Nullable
		private String avgTime;

		private Long avgTimeInMillis;

		@Nullable
		private String avgSize;

		private Long avgSizeInBytes;

		/**
		 * API name: {@code total_operations}
		 */
		public Builder totalOperations(long value) {
			this.totalOperations = value;
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
		public Builder totalTimeInMillis(long value) {
			this.totalTimeInMillis = value;
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
		public Builder totalSizeInBytes(long value) {
			this.totalSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code avg_time}
		 */
		public Builder avgTime(@Nullable String value) {
			this.avgTime = value;
			return this;
		}

		/**
		 * API name: {@code avg_time_in_millis}
		 */
		public Builder avgTimeInMillis(long value) {
			this.avgTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code avg_size}
		 */
		public Builder avgSize(@Nullable String value) {
			this.avgSize = value;
			return this;
		}

		/**
		 * API name: {@code avg_size_in_bytes}
		 */
		public Builder avgSizeInBytes(long value) {
			this.avgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link BulkStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkStats build() {

			return new BulkStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkStats}
	 */
	public static final JsonpDeserializer<BulkStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkStats::setupBulkStatsDeserializer, Builder::build);

	protected static void setupBulkStatsDeserializer(DelegatingDeserializer<BulkStats.Builder> op) {

		op.add(Builder::totalOperations, JsonpDeserializer.longDeserializer(), "total_operations");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.longDeserializer(), "total_size_in_bytes");
		op.add(Builder::avgTime, JsonpDeserializer.stringDeserializer(), "avg_time");
		op.add(Builder::avgTimeInMillis, JsonpDeserializer.longDeserializer(), "avg_time_in_millis");
		op.add(Builder::avgSize, JsonpDeserializer.stringDeserializer(), "avg_size");
		op.add(Builder::avgSizeInBytes, JsonpDeserializer.longDeserializer(), "avg_size_in_bytes");

	}

}
