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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataCounts
@JsonpDeserializable
public final class DataCounts implements JsonpSerializable {
	private final Long bucketCount;

	private final Long earliestRecordTimestamp;

	private final Long emptyBucketCount;

	private final Long inputBytes;

	private final Long inputFieldCount;

	private final Long inputRecordCount;

	private final Long invalidDateCount;

	private final String jobId;

	private final Long lastDataTime;

	private final Long latestEmptyBucketTimestamp;

	private final Long latestRecordTimestamp;

	private final Long latestSparseBucketTimestamp;

	private final Long latestBucketTimestamp;

	private final Long missingFieldCount;

	private final Long outOfOrderTimestampCount;

	private final Long processedFieldCount;

	private final Long processedRecordCount;

	private final Long sparseBucketCount;

	// ---------------------------------------------------------------------------------------------

	public DataCounts(Builder builder) {

		this.bucketCount = Objects.requireNonNull(builder.bucketCount, "bucket_count");
		this.earliestRecordTimestamp = Objects.requireNonNull(builder.earliestRecordTimestamp,
				"earliest_record_timestamp");
		this.emptyBucketCount = Objects.requireNonNull(builder.emptyBucketCount, "empty_bucket_count");
		this.inputBytes = Objects.requireNonNull(builder.inputBytes, "input_bytes");
		this.inputFieldCount = Objects.requireNonNull(builder.inputFieldCount, "input_field_count");
		this.inputRecordCount = Objects.requireNonNull(builder.inputRecordCount, "input_record_count");
		this.invalidDateCount = Objects.requireNonNull(builder.invalidDateCount, "invalid_date_count");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.lastDataTime = Objects.requireNonNull(builder.lastDataTime, "last_data_time");
		this.latestEmptyBucketTimestamp = Objects.requireNonNull(builder.latestEmptyBucketTimestamp,
				"latest_empty_bucket_timestamp");
		this.latestRecordTimestamp = Objects.requireNonNull(builder.latestRecordTimestamp, "latest_record_timestamp");
		this.latestSparseBucketTimestamp = Objects.requireNonNull(builder.latestSparseBucketTimestamp,
				"latest_sparse_bucket_timestamp");
		this.latestBucketTimestamp = Objects.requireNonNull(builder.latestBucketTimestamp, "latest_bucket_timestamp");
		this.missingFieldCount = Objects.requireNonNull(builder.missingFieldCount, "missing_field_count");
		this.outOfOrderTimestampCount = Objects.requireNonNull(builder.outOfOrderTimestampCount,
				"out_of_order_timestamp_count");
		this.processedFieldCount = Objects.requireNonNull(builder.processedFieldCount, "processed_field_count");
		this.processedRecordCount = Objects.requireNonNull(builder.processedRecordCount, "processed_record_count");
		this.sparseBucketCount = Objects.requireNonNull(builder.sparseBucketCount, "sparse_bucket_count");

	}

	/**
	 * API name: {@code bucket_count}
	 */
	public Long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code earliest_record_timestamp}
	 */
	public Long earliestRecordTimestamp() {
		return this.earliestRecordTimestamp;
	}

	/**
	 * API name: {@code empty_bucket_count}
	 */
	public Long emptyBucketCount() {
		return this.emptyBucketCount;
	}

	/**
	 * API name: {@code input_bytes}
	 */
	public Long inputBytes() {
		return this.inputBytes;
	}

	/**
	 * API name: {@code input_field_count}
	 */
	public Long inputFieldCount() {
		return this.inputFieldCount;
	}

	/**
	 * API name: {@code input_record_count}
	 */
	public Long inputRecordCount() {
		return this.inputRecordCount;
	}

	/**
	 * API name: {@code invalid_date_count}
	 */
	public Long invalidDateCount() {
		return this.invalidDateCount;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code last_data_time}
	 */
	public Long lastDataTime() {
		return this.lastDataTime;
	}

	/**
	 * API name: {@code latest_empty_bucket_timestamp}
	 */
	public Long latestEmptyBucketTimestamp() {
		return this.latestEmptyBucketTimestamp;
	}

	/**
	 * API name: {@code latest_record_timestamp}
	 */
	public Long latestRecordTimestamp() {
		return this.latestRecordTimestamp;
	}

	/**
	 * API name: {@code latest_sparse_bucket_timestamp}
	 */
	public Long latestSparseBucketTimestamp() {
		return this.latestSparseBucketTimestamp;
	}

	/**
	 * API name: {@code latest_bucket_timestamp}
	 */
	public Long latestBucketTimestamp() {
		return this.latestBucketTimestamp;
	}

	/**
	 * API name: {@code missing_field_count}
	 */
	public Long missingFieldCount() {
		return this.missingFieldCount;
	}

	/**
	 * API name: {@code out_of_order_timestamp_count}
	 */
	public Long outOfOrderTimestampCount() {
		return this.outOfOrderTimestampCount;
	}

	/**
	 * API name: {@code processed_field_count}
	 */
	public Long processedFieldCount() {
		return this.processedFieldCount;
	}

	/**
	 * API name: {@code processed_record_count}
	 */
	public Long processedRecordCount() {
		return this.processedRecordCount;
	}

	/**
	 * API name: {@code sparse_bucket_count}
	 */
	public Long sparseBucketCount() {
		return this.sparseBucketCount;
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

		generator.writeKey("earliest_record_timestamp");
		generator.write(this.earliestRecordTimestamp);

		generator.writeKey("empty_bucket_count");
		generator.write(this.emptyBucketCount);

		generator.writeKey("input_bytes");
		generator.write(this.inputBytes);

		generator.writeKey("input_field_count");
		generator.write(this.inputFieldCount);

		generator.writeKey("input_record_count");
		generator.write(this.inputRecordCount);

		generator.writeKey("invalid_date_count");
		generator.write(this.invalidDateCount);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("last_data_time");
		generator.write(this.lastDataTime);

		generator.writeKey("latest_empty_bucket_timestamp");
		generator.write(this.latestEmptyBucketTimestamp);

		generator.writeKey("latest_record_timestamp");
		generator.write(this.latestRecordTimestamp);

		generator.writeKey("latest_sparse_bucket_timestamp");
		generator.write(this.latestSparseBucketTimestamp);

		generator.writeKey("latest_bucket_timestamp");
		generator.write(this.latestBucketTimestamp);

		generator.writeKey("missing_field_count");
		generator.write(this.missingFieldCount);

		generator.writeKey("out_of_order_timestamp_count");
		generator.write(this.outOfOrderTimestampCount);

		generator.writeKey("processed_field_count");
		generator.write(this.processedFieldCount);

		generator.writeKey("processed_record_count");
		generator.write(this.processedRecordCount);

		generator.writeKey("sparse_bucket_count");
		generator.write(this.sparseBucketCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataCounts}.
	 */
	public static class Builder implements ObjectBuilder<DataCounts> {
		private Long bucketCount;

		private Long earliestRecordTimestamp;

		private Long emptyBucketCount;

		private Long inputBytes;

		private Long inputFieldCount;

		private Long inputRecordCount;

		private Long invalidDateCount;

		private String jobId;

		private Long lastDataTime;

		private Long latestEmptyBucketTimestamp;

		private Long latestRecordTimestamp;

		private Long latestSparseBucketTimestamp;

		private Long latestBucketTimestamp;

		private Long missingFieldCount;

		private Long outOfOrderTimestampCount;

		private Long processedFieldCount;

		private Long processedRecordCount;

		private Long sparseBucketCount;

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(Long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code earliest_record_timestamp}
		 */
		public Builder earliestRecordTimestamp(Long value) {
			this.earliestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code empty_bucket_count}
		 */
		public Builder emptyBucketCount(Long value) {
			this.emptyBucketCount = value;
			return this;
		}

		/**
		 * API name: {@code input_bytes}
		 */
		public Builder inputBytes(Long value) {
			this.inputBytes = value;
			return this;
		}

		/**
		 * API name: {@code input_field_count}
		 */
		public Builder inputFieldCount(Long value) {
			this.inputFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code input_record_count}
		 */
		public Builder inputRecordCount(Long value) {
			this.inputRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code invalid_date_count}
		 */
		public Builder invalidDateCount(Long value) {
			this.invalidDateCount = value;
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
		 * API name: {@code last_data_time}
		 */
		public Builder lastDataTime(Long value) {
			this.lastDataTime = value;
			return this;
		}

		/**
		 * API name: {@code latest_empty_bucket_timestamp}
		 */
		public Builder latestEmptyBucketTimestamp(Long value) {
			this.latestEmptyBucketTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code latest_record_timestamp}
		 */
		public Builder latestRecordTimestamp(Long value) {
			this.latestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code latest_sparse_bucket_timestamp}
		 */
		public Builder latestSparseBucketTimestamp(Long value) {
			this.latestSparseBucketTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code latest_bucket_timestamp}
		 */
		public Builder latestBucketTimestamp(Long value) {
			this.latestBucketTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code missing_field_count}
		 */
		public Builder missingFieldCount(Long value) {
			this.missingFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code out_of_order_timestamp_count}
		 */
		public Builder outOfOrderTimestampCount(Long value) {
			this.outOfOrderTimestampCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_field_count}
		 */
		public Builder processedFieldCount(Long value) {
			this.processedFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_record_count}
		 */
		public Builder processedRecordCount(Long value) {
			this.processedRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_bucket_count}
		 */
		public Builder sparseBucketCount(Long value) {
			this.sparseBucketCount = value;
			return this;
		}

		/**
		 * Builds a {@link DataCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataCounts build() {

			return new DataCounts(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataCounts}
	 */
	public static final JsonpDeserializer<DataCounts> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataCounts::setupDataCountsDeserializer, Builder::build);

	protected static void setupDataCountsDeserializer(DelegatingDeserializer<DataCounts.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::earliestRecordTimestamp, JsonpDeserializer.longDeserializer(), "earliest_record_timestamp");
		op.add(Builder::emptyBucketCount, JsonpDeserializer.longDeserializer(), "empty_bucket_count");
		op.add(Builder::inputBytes, JsonpDeserializer.longDeserializer(), "input_bytes");
		op.add(Builder::inputFieldCount, JsonpDeserializer.longDeserializer(), "input_field_count");
		op.add(Builder::inputRecordCount, JsonpDeserializer.longDeserializer(), "input_record_count");
		op.add(Builder::invalidDateCount, JsonpDeserializer.longDeserializer(), "invalid_date_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::lastDataTime, JsonpDeserializer.longDeserializer(), "last_data_time");
		op.add(Builder::latestEmptyBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_empty_bucket_timestamp");
		op.add(Builder::latestRecordTimestamp, JsonpDeserializer.longDeserializer(), "latest_record_timestamp");
		op.add(Builder::latestSparseBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_sparse_bucket_timestamp");
		op.add(Builder::latestBucketTimestamp, JsonpDeserializer.longDeserializer(), "latest_bucket_timestamp");
		op.add(Builder::missingFieldCount, JsonpDeserializer.longDeserializer(), "missing_field_count");
		op.add(Builder::outOfOrderTimestampCount, JsonpDeserializer.longDeserializer(), "out_of_order_timestamp_count");
		op.add(Builder::processedFieldCount, JsonpDeserializer.longDeserializer(), "processed_field_count");
		op.add(Builder::processedRecordCount, JsonpDeserializer.longDeserializer(), "processed_record_count");
		op.add(Builder::sparseBucketCount, JsonpDeserializer.longDeserializer(), "sparse_bucket_count");

	}

}
