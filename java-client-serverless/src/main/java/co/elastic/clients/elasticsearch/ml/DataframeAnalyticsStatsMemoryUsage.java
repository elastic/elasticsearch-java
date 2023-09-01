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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsMemoryUsage

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsStatsMemoryUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsStatsMemoryUsage implements JsonpSerializable {
	@Nullable
	private final Long memoryReestimateBytes;

	private final long peakUsageBytes;

	private final String status;

	@Nullable
	private final Long timestamp;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsStatsMemoryUsage(Builder builder) {

		this.memoryReestimateBytes = builder.memoryReestimateBytes;
		this.peakUsageBytes = ApiTypeHelper.requireNonNull(builder.peakUsageBytes, this, "peakUsageBytes");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.timestamp = builder.timestamp;

	}

	public static DataframeAnalyticsStatsMemoryUsage of(
			Function<Builder, ObjectBuilder<DataframeAnalyticsStatsMemoryUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * This value is present when the status is hard_limit and it is a new estimate
	 * of how much memory the job needs.
	 * <p>
	 * API name: {@code memory_reestimate_bytes}
	 */
	@Nullable
	public final Long memoryReestimateBytes() {
		return this.memoryReestimateBytes;
	}

	/**
	 * Required - The number of bytes used at the highest peak of memory usage.
	 * <p>
	 * API name: {@code peak_usage_bytes}
	 */
	public final long peakUsageBytes() {
		return this.peakUsageBytes;
	}

	/**
	 * Required - The memory usage status.
	 * <p>
	 * API name: {@code status}
	 */
	public final String status() {
		return this.status;
	}

	/**
	 * The timestamp when memory usage was calculated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final Long timestamp() {
		return this.timestamp;
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

		if (this.memoryReestimateBytes != null) {
			generator.writeKey("memory_reestimate_bytes");
			generator.write(this.memoryReestimateBytes);

		}
		generator.writeKey("peak_usage_bytes");
		generator.write(this.peakUsageBytes);

		generator.writeKey("status");
		generator.write(this.status);

		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsMemoryUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsStatsMemoryUsage> {
		@Nullable
		private Long memoryReestimateBytes;

		private Long peakUsageBytes;

		private String status;

		@Nullable
		private Long timestamp;

		/**
		 * This value is present when the status is hard_limit and it is a new estimate
		 * of how much memory the job needs.
		 * <p>
		 * API name: {@code memory_reestimate_bytes}
		 */
		public final Builder memoryReestimateBytes(@Nullable Long value) {
			this.memoryReestimateBytes = value;
			return this;
		}

		/**
		 * Required - The number of bytes used at the highest peak of memory usage.
		 * <p>
		 * API name: {@code peak_usage_bytes}
		 */
		public final Builder peakUsageBytes(long value) {
			this.peakUsageBytes = value;
			return this;
		}

		/**
		 * Required - The memory usage status.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * The timestamp when memory usage was calculated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsMemoryUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsMemoryUsage build() {
			_checkSingleUse();

			return new DataframeAnalyticsStatsMemoryUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsMemoryUsage}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsMemoryUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalyticsStatsMemoryUsage::setupDataframeAnalyticsStatsMemoryUsageDeserializer);

	protected static void setupDataframeAnalyticsStatsMemoryUsageDeserializer(
			ObjectDeserializer<DataframeAnalyticsStatsMemoryUsage.Builder> op) {

		op.add(Builder::memoryReestimateBytes, JsonpDeserializer.longDeserializer(), "memory_reestimate_bytes");
		op.add(Builder::peakUsageBytes, JsonpDeserializer.longDeserializer(), "peak_usage_bytes");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
