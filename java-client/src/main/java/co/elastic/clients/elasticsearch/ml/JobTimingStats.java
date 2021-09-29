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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobTimingStats
@JsonpDeserializable
public final class JobTimingStats implements JsonpSerializable {
	private final double averageBucketProcessingTimeMs;

	private final long bucketCount;

	private final double exponentialAverageBucketProcessingTimeMs;

	private final double exponentialAverageBucketProcessingTimePerHourMs;

	private final String jobId;

	private final double totalBucketProcessingTimeMs;

	private final double maximumBucketProcessingTimeMs;

	private final double minimumBucketProcessingTimeMs;

	// ---------------------------------------------------------------------------------------------

	public JobTimingStats(Builder builder) {

		this.averageBucketProcessingTimeMs = Objects.requireNonNull(builder.averageBucketProcessingTimeMs,
				"average_bucket_processing_time_ms");
		this.bucketCount = Objects.requireNonNull(builder.bucketCount, "bucket_count");
		this.exponentialAverageBucketProcessingTimeMs = Objects.requireNonNull(
				builder.exponentialAverageBucketProcessingTimeMs, "exponential_average_bucket_processing_time_ms");
		this.exponentialAverageBucketProcessingTimePerHourMs = Objects.requireNonNull(
				builder.exponentialAverageBucketProcessingTimePerHourMs,
				"exponential_average_bucket_processing_time_per_hour_ms");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.totalBucketProcessingTimeMs = Objects.requireNonNull(builder.totalBucketProcessingTimeMs,
				"total_bucket_processing_time_ms");
		this.maximumBucketProcessingTimeMs = Objects.requireNonNull(builder.maximumBucketProcessingTimeMs,
				"maximum_bucket_processing_time_ms");
		this.minimumBucketProcessingTimeMs = Objects.requireNonNull(builder.minimumBucketProcessingTimeMs,
				"minimum_bucket_processing_time_ms");

	}

	public JobTimingStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code average_bucket_processing_time_ms}
	 */
	public double averageBucketProcessingTimeMs() {
		return this.averageBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code bucket_count}
	 */
	public long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code exponential_average_bucket_processing_time_ms}
	 */
	public double exponentialAverageBucketProcessingTimeMs() {
		return this.exponentialAverageBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code exponential_average_bucket_processing_time_per_hour_ms}
	 */
	public double exponentialAverageBucketProcessingTimePerHourMs() {
		return this.exponentialAverageBucketProcessingTimePerHourMs;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code total_bucket_processing_time_ms}
	 */
	public double totalBucketProcessingTimeMs() {
		return this.totalBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code maximum_bucket_processing_time_ms}
	 */
	public double maximumBucketProcessingTimeMs() {
		return this.maximumBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code minimum_bucket_processing_time_ms}
	 */
	public double minimumBucketProcessingTimeMs() {
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

		generator.writeKey("average_bucket_processing_time_ms");
		generator.write(this.averageBucketProcessingTimeMs);

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		generator.writeKey("exponential_average_bucket_processing_time_ms");
		generator.write(this.exponentialAverageBucketProcessingTimeMs);

		generator.writeKey("exponential_average_bucket_processing_time_per_hour_ms");
		generator.write(this.exponentialAverageBucketProcessingTimePerHourMs);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("total_bucket_processing_time_ms");
		generator.write(this.totalBucketProcessingTimeMs);

		generator.writeKey("maximum_bucket_processing_time_ms");
		generator.write(this.maximumBucketProcessingTimeMs);

		generator.writeKey("minimum_bucket_processing_time_ms");
		generator.write(this.minimumBucketProcessingTimeMs);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobTimingStats}.
	 */
	public static class Builder implements ObjectBuilder<JobTimingStats> {
		private Double averageBucketProcessingTimeMs;

		private Long bucketCount;

		private Double exponentialAverageBucketProcessingTimeMs;

		private Double exponentialAverageBucketProcessingTimePerHourMs;

		private String jobId;

		private Double totalBucketProcessingTimeMs;

		private Double maximumBucketProcessingTimeMs;

		private Double minimumBucketProcessingTimeMs;

		/**
		 * API name: {@code average_bucket_processing_time_ms}
		 */
		public Builder averageBucketProcessingTimeMs(double value) {
			this.averageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_bucket_processing_time_ms}
		 */
		public Builder exponentialAverageBucketProcessingTimeMs(double value) {
			this.exponentialAverageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_bucket_processing_time_per_hour_ms}
		 */
		public Builder exponentialAverageBucketProcessingTimePerHourMs(double value) {
			this.exponentialAverageBucketProcessingTimePerHourMs = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code total_bucket_processing_time_ms}
		 */
		public Builder totalBucketProcessingTimeMs(double value) {
			this.totalBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code maximum_bucket_processing_time_ms}
		 */
		public Builder maximumBucketProcessingTimeMs(double value) {
			this.maximumBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code minimum_bucket_processing_time_ms}
		 */
		public Builder minimumBucketProcessingTimeMs(double value) {
			this.minimumBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * Builds a {@link JobTimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobTimingStats build() {

			return new JobTimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobTimingStats}
	 */
	public static final JsonpDeserializer<JobTimingStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobTimingStats::setupJobTimingStatsDeserializer, Builder::build);

	protected static void setupJobTimingStatsDeserializer(DelegatingDeserializer<JobTimingStats.Builder> op) {

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
