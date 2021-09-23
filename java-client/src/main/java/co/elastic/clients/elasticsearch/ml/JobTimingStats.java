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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.JobTimingStats
public final class JobTimingStats implements JsonpSerializable {
	private final Number averageBucketProcessingTimeMs;

	private final Number bucketCount;

	private final Number exponentialAverageBucketProcessingTimeMs;

	private final Number exponentialAverageBucketProcessingTimePerHourMs;

	private final String jobId;

	private final Number totalBucketProcessingTimeMs;

	private final Number maximumBucketProcessingTimeMs;

	private final Number minimumBucketProcessingTimeMs;

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

	/**
	 * API name: {@code average_bucket_processing_time_ms}
	 */
	public Number averageBucketProcessingTimeMs() {
		return this.averageBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code bucket_count}
	 */
	public Number bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code exponential_average_bucket_processing_time_ms}
	 */
	public Number exponentialAverageBucketProcessingTimeMs() {
		return this.exponentialAverageBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code exponential_average_bucket_processing_time_per_hour_ms}
	 */
	public Number exponentialAverageBucketProcessingTimePerHourMs() {
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
	public Number totalBucketProcessingTimeMs() {
		return this.totalBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code maximum_bucket_processing_time_ms}
	 */
	public Number maximumBucketProcessingTimeMs() {
		return this.maximumBucketProcessingTimeMs;
	}

	/**
	 * API name: {@code minimum_bucket_processing_time_ms}
	 */
	public Number minimumBucketProcessingTimeMs() {
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
		generator.write(this.averageBucketProcessingTimeMs.doubleValue());

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount.doubleValue());

		generator.writeKey("exponential_average_bucket_processing_time_ms");
		generator.write(this.exponentialAverageBucketProcessingTimeMs.doubleValue());

		generator.writeKey("exponential_average_bucket_processing_time_per_hour_ms");
		generator.write(this.exponentialAverageBucketProcessingTimePerHourMs.doubleValue());

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("total_bucket_processing_time_ms");
		generator.write(this.totalBucketProcessingTimeMs.doubleValue());

		generator.writeKey("maximum_bucket_processing_time_ms");
		generator.write(this.maximumBucketProcessingTimeMs.doubleValue());

		generator.writeKey("minimum_bucket_processing_time_ms");
		generator.write(this.minimumBucketProcessingTimeMs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobTimingStats}.
	 */
	public static class Builder implements ObjectBuilder<JobTimingStats> {
		private Number averageBucketProcessingTimeMs;

		private Number bucketCount;

		private Number exponentialAverageBucketProcessingTimeMs;

		private Number exponentialAverageBucketProcessingTimePerHourMs;

		private String jobId;

		private Number totalBucketProcessingTimeMs;

		private Number maximumBucketProcessingTimeMs;

		private Number minimumBucketProcessingTimeMs;

		/**
		 * API name: {@code average_bucket_processing_time_ms}
		 */
		public Builder averageBucketProcessingTimeMs(Number value) {
			this.averageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(Number value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_bucket_processing_time_ms}
		 */
		public Builder exponentialAverageBucketProcessingTimeMs(Number value) {
			this.exponentialAverageBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_bucket_processing_time_per_hour_ms}
		 */
		public Builder exponentialAverageBucketProcessingTimePerHourMs(Number value) {
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
		public Builder totalBucketProcessingTimeMs(Number value) {
			this.totalBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code maximum_bucket_processing_time_ms}
		 */
		public Builder maximumBucketProcessingTimeMs(Number value) {
			this.maximumBucketProcessingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code minimum_bucket_processing_time_ms}
		 */
		public Builder minimumBucketProcessingTimeMs(Number value) {
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
	public static final JsonpDeserializer<JobTimingStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JobTimingStats::setupJobTimingStatsDeserializer);

	protected static void setupJobTimingStatsDeserializer(DelegatingDeserializer<JobTimingStats.Builder> op) {

		op.add(Builder::averageBucketProcessingTimeMs, JsonpDeserializer.numberDeserializer(),
				"average_bucket_processing_time_ms");
		op.add(Builder::bucketCount, JsonpDeserializer.numberDeserializer(), "bucket_count");
		op.add(Builder::exponentialAverageBucketProcessingTimeMs, JsonpDeserializer.numberDeserializer(),
				"exponential_average_bucket_processing_time_ms");
		op.add(Builder::exponentialAverageBucketProcessingTimePerHourMs, JsonpDeserializer.numberDeserializer(),
				"exponential_average_bucket_processing_time_per_hour_ms");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::totalBucketProcessingTimeMs, JsonpDeserializer.numberDeserializer(),
				"total_bucket_processing_time_ms");
		op.add(Builder::maximumBucketProcessingTimeMs, JsonpDeserializer.numberDeserializer(),
				"maximum_bucket_processing_time_ms");
		op.add(Builder::minimumBucketProcessingTimeMs, JsonpDeserializer.numberDeserializer(),
				"minimum_bucket_processing_time_ms");

	}

}
