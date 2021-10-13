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
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedTimingStats
@JsonpDeserializable
public final class DatafeedTimingStats implements JsonpSerializable {
	private final long bucketCount;

	private final double exponentialAverageSearchTimePerHourMs;

	private final String jobId;

	private final long searchCount;

	private final double totalSearchTimeMs;

	private final Number averageSearchTimePerBucketMs;

	// ---------------------------------------------------------------------------------------------

	public DatafeedTimingStats(Builder builder) {

		this.bucketCount = Objects.requireNonNull(builder.bucketCount, "bucket_count");
		this.exponentialAverageSearchTimePerHourMs = Objects.requireNonNull(
				builder.exponentialAverageSearchTimePerHourMs, "exponential_average_search_time_per_hour_ms");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.searchCount = Objects.requireNonNull(builder.searchCount, "search_count");
		this.totalSearchTimeMs = Objects.requireNonNull(builder.totalSearchTimeMs, "total_search_time_ms");
		this.averageSearchTimePerBucketMs = Objects.requireNonNull(builder.averageSearchTimePerBucketMs,
				"average_search_time_per_bucket_ms");

	}

	public DatafeedTimingStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code bucket_count}
	 */
	public long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * Required - API name: {@code exponential_average_search_time_per_hour_ms}
	 */
	public double exponentialAverageSearchTimePerHourMs() {
		return this.exponentialAverageSearchTimePerHourMs;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code search_count}
	 */
	public long searchCount() {
		return this.searchCount;
	}

	/**
	 * Required - API name: {@code total_search_time_ms}
	 */
	public double totalSearchTimeMs() {
		return this.totalSearchTimeMs;
	}

	/**
	 * Required - API name: {@code average_search_time_per_bucket_ms}
	 */
	public Number averageSearchTimePerBucketMs() {
		return this.averageSearchTimePerBucketMs;
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

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		generator.writeKey("exponential_average_search_time_per_hour_ms");
		generator.write(this.exponentialAverageSearchTimePerHourMs);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("search_count");
		generator.write(this.searchCount);

		generator.writeKey("total_search_time_ms");
		generator.write(this.totalSearchTimeMs);

		generator.writeKey("average_search_time_per_bucket_ms");
		generator.write(this.averageSearchTimePerBucketMs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedTimingStats}.
	 */
	public static class Builder implements ObjectBuilder<DatafeedTimingStats> {
		private Long bucketCount;

		private Double exponentialAverageSearchTimePerHourMs;

		private String jobId;

		private Long searchCount;

		private Double totalSearchTimeMs;

		private Number averageSearchTimePerBucketMs;

		/**
		 * Required - API name: {@code bucket_count}
		 */
		public Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_average_search_time_per_hour_ms}
		 */
		public Builder exponentialAverageSearchTimePerHourMs(double value) {
			this.exponentialAverageSearchTimePerHourMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_count}
		 */
		public Builder searchCount(long value) {
			this.searchCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_search_time_ms}
		 */
		public Builder totalSearchTimeMs(double value) {
			this.totalSearchTimeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code average_search_time_per_bucket_ms}
		 */
		public Builder averageSearchTimePerBucketMs(Number value) {
			this.averageSearchTimePerBucketMs = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedTimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedTimingStats build() {

			return new DatafeedTimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedTimingStats}
	 */
	public static final JsonpDeserializer<DatafeedTimingStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatafeedTimingStats::setupDatafeedTimingStatsDeserializer, Builder::build);

	protected static void setupDatafeedTimingStatsDeserializer(DelegatingDeserializer<DatafeedTimingStats.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::exponentialAverageSearchTimePerHourMs, JsonpDeserializer.doubleDeserializer(),
				"exponential_average_search_time_per_hour_ms");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::searchCount, JsonpDeserializer.longDeserializer(), "search_count");
		op.add(Builder::totalSearchTimeMs, JsonpDeserializer.doubleDeserializer(), "total_search_time_ms");
		op.add(Builder::averageSearchTimePerBucketMs, JsonpDeserializer.numberDeserializer(),
				"average_search_time_per_bucket_ms");

	}

}
