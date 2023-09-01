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
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobTimingStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.JobTimingStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class JobTimingStats implements JsonpSerializable {
	@Nullable
	private final Double averageBucketProcessingTimeMs;

	private final long bucketCount;

	@Nullable
	private final Double exponentialAverageBucketProcessingTimeMs;

	private final double exponentialAverageBucketProcessingTimePerHourMs;

	private final String jobId;

	private final double totalBucketProcessingTimeMs;

	@Nullable
	private final Double maximumBucketProcessingTimeMs;

	@Nullable
	private final Double minimumBucketProcessingTimeMs;

	// ---------------------------------------------------------------------------------------------

	private JobTimingStats(Builder builder) {

		this.averageBucketProcessingTimeMs = builder.averageBucketProcessingTimeMs;
		this.bucketCount = ApiTypeHelper.requireNonNull(builder.bucketCount, this, "bucketCount");
		this.exponentialAverageBucketProcessingTimeMs = builder.exponentialAverageBucketProcessingTimeMs;
		this.exponentialAverageBucketProcessingTimePerHourMs = ApiTypeHelper.requireNonNull(
				builder.exponentialAverageBucketProcessingTimePerHourMs, this,
				"exponentialAverageBucketProcessingTimePerHourMs");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.totalBucketProcessingTimeMs = ApiTypeHelper.requireNonNull(builder.totalBucketProcessingTimeMs, this,
				"totalBucketProcessingTimeMs");
		this.maximumBucketProcessingTimeMs = builder.maximumBucketProcessingTimeMs;
		this.minimumBucketProcessingTimeMs = builder.minimumBucketProcessingTimeMs;

	}

	public static JobTimingStats of(Function<Builder, ObjectBuilder<JobTimingStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code average_bucket_processing_time_ms}
	 */
	@Nullable
	public final Double averageBucketProcessingTimeMs() {
		return this.averageBucketProcessingTimeMs;
	}

	/**
	 * Required - API name: {@code bucket_count}
	 */
	public final long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code exponential_average_bucket_processing_time_ms}
	 */
	@Nullable
	public final Double exponentialAverageBucketProcessingTimeMs() {
		return this.exponentialAverageBucketProcessingTimeMs;
	}

	/**
	 * Required - API name:
	 * {@code exponential_average_bucket_processing_time_per_hour_ms}
	 */
	public final double exponentialAverageBucketProcessingTimePerHourMs() {
		return this.exponentialAverageBucketProcessingTimePerHourMs;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code total_bucket_processing_time_ms}
	 */
	public final double totalBucketProcessingTimeMs() {
		return this.totalBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code maximum_bucket_processing_time_ms}
	 */
	@Nullable
	public final Double maximumBucketProcessingTimeMs() {
		return this.maximumBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code minimum_bucket_processing_time_ms}
	 */
	@Nullable
	public final Double minimumBucketProcessingTimeMs() {
		return this.minimumBucketProcessingTimeMs;
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

		if (this.averageBucketProcessingTimeMs != null) {
			generator.writeKey("average_bucket_processing_time_ms");
			generator.write(this.averageBucketProcessingTimeMs);

		}
		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		if (this.exponentialAverageBucketProcessingTimeMs != null) {
			generator.writeKey("exponential_average_bucket_processing_time_ms");
			generator.write(this.exponentialAverageBucketProcessingTimeMs);

		}
		generator.writeKey("exponential_average_bucket_processing_time_per_hour_ms");
		generator.write(this.exponentialAverageBucketProcessingTimePerHourMs);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("total_bucket_processing_time_ms");
		generator.write(this.totalBucketProcessingTimeMs);

		if (this.maximumBucketProcessingTimeMs != null) {
			generator.writeKey("maximum_bucket_processing_time_ms");
			generator.write(this.maximumBucketProcessingTimeMs);

		}
		if (this.minimumBucketProcessingTimeMs != null) {
			generator.writeKey("minimum_bucket_processing_time_ms");
			generator.write(this.minimumBucketProcessingTimeMs);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobTimingStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JobTimingStats> {
		@Nullable
		private Double averageBucketProcessingTimeMs;

		private Long bucketCount;

		@Nullable
		private Double exponentialAverageBucketProcessingTimeMs;

		private Double exponentialAverageBucketProcessingTimePerHourMs;

		private String jobId;

		private Double totalBucketProcessingTimeMs;

		@Nullable
		private Double maximumBucketProcessingTimeMs;

		@Nullable
		private Double minimumBucketProcessingTimeMs;

		/**
		 * API name: {@code average_bucket_processing_time_ms}
		 */
		public final Builder averageBucketProcessingTimeMs(@Nullable Double value) {
			this.averageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code bucket_count}
		 */
		public final Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_bucket_processing_time_ms}
		 */
		public final Builder exponentialAverageBucketProcessingTimeMs(@Nullable Double value) {
			this.exponentialAverageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * Required - API name:
		 * {@code exponential_average_bucket_processing_time_per_hour_ms}
		 */
		public final Builder exponentialAverageBucketProcessingTimePerHourMs(double value) {
			this.exponentialAverageBucketProcessingTimePerHourMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_bucket_processing_time_ms}
		 */
		public final Builder totalBucketProcessingTimeMs(double value) {
			this.totalBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code maximum_bucket_processing_time_ms}
		 */
		public final Builder maximumBucketProcessingTimeMs(@Nullable Double value) {
			this.maximumBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code minimum_bucket_processing_time_ms}
		 */
		public final Builder minimumBucketProcessingTimeMs(@Nullable Double value) {
			this.minimumBucketProcessingTimeMs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JobTimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobTimingStats build() {
			_checkSingleUse();

			return new JobTimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobTimingStats}
	 */
	public static final JsonpDeserializer<JobTimingStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobTimingStats::setupJobTimingStatsDeserializer);

	protected static void setupJobTimingStatsDeserializer(ObjectDeserializer<JobTimingStats.Builder> op) {

		op.add(Builder::averageBucketProcessingTimeMs, JsonpDeserializer.doubleDeserializer(),
				"average_bucket_processing_time_ms");
		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::exponentialAverageBucketProcessingTimeMs, JsonpDeserializer.doubleDeserializer(),
				"exponential_average_bucket_processing_time_ms");
		op.add(Builder::exponentialAverageBucketProcessingTimePerHourMs, JsonpDeserializer.doubleDeserializer(),
				"exponential_average_bucket_processing_time_per_hour_ms");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::totalBucketProcessingTimeMs, JsonpDeserializer.doubleDeserializer(),
				"total_bucket_processing_time_ms");
		op.add(Builder::maximumBucketProcessingTimeMs, JsonpDeserializer.doubleDeserializer(),
				"maximum_bucket_processing_time_ms");
		op.add(Builder::minimumBucketProcessingTimeMs, JsonpDeserializer.doubleDeserializer(),
				"minimum_bucket_processing_time_ms");

	}

}
