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

// typedef: _types.BulkStats
public final class BulkStats implements JsonpSerializable {
	private final Number totalOperations;

	@Nullable
	private final String totalTime;

	private final Number totalTimeInMillis;

	@Nullable
	private final JsonValue totalSize;

	private final Number totalSizeInBytes;

	@Nullable
	private final String avgTime;

	private final Number avgTimeInMillis;

	@Nullable
	private final JsonValue avgSize;

	private final Number avgSizeInBytes;

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
	public Number totalOperations() {
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
	public Number totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * API name: {@code total_size}
	 */
	@Nullable
	public JsonValue totalSize() {
		return this.totalSize;
	}

	/**
	 * API name: {@code total_size_in_bytes}
	 */
	public Number totalSizeInBytes() {
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
	public Number avgTimeInMillis() {
		return this.avgTimeInMillis;
	}

	/**
	 * API name: {@code avg_size}
	 */
	@Nullable
	public JsonValue avgSize() {
		return this.avgSize;
	}

	/**
	 * API name: {@code avg_size_in_bytes}
	 */
	public Number avgSizeInBytes() {
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
		generator.write(this.totalOperations.doubleValue());

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis.doubleValue());

		if (this.totalSize != null) {

			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}

		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes.doubleValue());

		if (this.avgTime != null) {

			generator.writeKey("avg_time");
			generator.write(this.avgTime);

		}

		generator.writeKey("avg_time_in_millis");
		generator.write(this.avgTimeInMillis.doubleValue());

		if (this.avgSize != null) {

			generator.writeKey("avg_size");
			generator.write(this.avgSize);

		}

		generator.writeKey("avg_size_in_bytes");
		generator.write(this.avgSizeInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkStats}.
	 */
	public static class Builder implements ObjectBuilder<BulkStats> {
		private Number totalOperations;

		@Nullable
		private String totalTime;

		private Number totalTimeInMillis;

		@Nullable
		private JsonValue totalSize;

		private Number totalSizeInBytes;

		@Nullable
		private String avgTime;

		private Number avgTimeInMillis;

		@Nullable
		private JsonValue avgSize;

		private Number avgSizeInBytes;

		/**
		 * API name: {@code total_operations}
		 */
		public Builder totalOperations(Number value) {
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
		public Builder totalTimeInMillis(Number value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_size}
		 */
		public Builder totalSize(@Nullable JsonValue value) {
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
		 * API name: {@code avg_time}
		 */
		public Builder avgTime(@Nullable String value) {
			this.avgTime = value;
			return this;
		}

		/**
		 * API name: {@code avg_time_in_millis}
		 */
		public Builder avgTimeInMillis(Number value) {
			this.avgTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code avg_size}
		 */
		public Builder avgSize(@Nullable JsonValue value) {
			this.avgSize = value;
			return this;
		}

		/**
		 * API name: {@code avg_size_in_bytes}
		 */
		public Builder avgSizeInBytes(Number value) {
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
	public static final JsonpDeserializer<BulkStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BulkStats::setupBulkStatsDeserializer);

	protected static void setupBulkStatsDeserializer(DelegatingDeserializer<BulkStats.Builder> op) {

		op.add(Builder::totalOperations, JsonpDeserializer.numberDeserializer(), "total_operations");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.numberDeserializer(), "total_time_in_millis");
		op.add(Builder::totalSize, JsonpDeserializer.jsonValueDeserializer(), "total_size");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.numberDeserializer(), "total_size_in_bytes");
		op.add(Builder::avgTime, JsonpDeserializer.stringDeserializer(), "avg_time");
		op.add(Builder::avgTimeInMillis, JsonpDeserializer.numberDeserializer(), "avg_time_in_millis");
		op.add(Builder::avgSize, JsonpDeserializer.jsonValueDeserializer(), "avg_size");
		op.add(Builder::avgSizeInBytes, JsonpDeserializer.numberDeserializer(), "avg_size_in_bytes");

	}

}
