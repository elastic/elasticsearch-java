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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.post_data.Response
@JsonpDeserializable
public final class PostDataResponse implements JsonpSerializable {
	private final long bucketCount;

	private final int earliestRecordTimestamp;

	private final long emptyBucketCount;

	private final long inputBytes;

	private final long inputFieldCount;

	private final long inputRecordCount;

	private final long invalidDateCount;

	private final String jobId;

	private final int lastDataTime;

	private final int latestRecordTimestamp;

	private final long missingFieldCount;

	private final long outOfOrderTimestampCount;

	private final long processedFieldCount;

	private final long processedRecordCount;

	private final long sparseBucketCount;

	// ---------------------------------------------------------------------------------------------

	public PostDataResponse(Builder builder) {

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
		this.latestRecordTimestamp = Objects.requireNonNull(builder.latestRecordTimestamp, "latest_record_timestamp");
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
	public long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code earliest_record_timestamp}
	 */
	public int earliestRecordTimestamp() {
		return this.earliestRecordTimestamp;
	}

	/**
	 * API name: {@code empty_bucket_count}
	 */
	public long emptyBucketCount() {
		return this.emptyBucketCount;
	}

	/**
	 * API name: {@code input_bytes}
	 */
	public long inputBytes() {
		return this.inputBytes;
	}

	/**
	 * API name: {@code input_field_count}
	 */
	public long inputFieldCount() {
		return this.inputFieldCount;
	}

	/**
	 * API name: {@code input_record_count}
	 */
	public long inputRecordCount() {
		return this.inputRecordCount;
	}

	/**
	 * API name: {@code invalid_date_count}
	 */
	public long invalidDateCount() {
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
	public int lastDataTime() {
		return this.lastDataTime;
	}

	/**
	 * API name: {@code latest_record_timestamp}
	 */
	public int latestRecordTimestamp() {
		return this.latestRecordTimestamp;
	}

	/**
	 * API name: {@code missing_field_count}
	 */
	public long missingFieldCount() {
		return this.missingFieldCount;
	}

	/**
	 * API name: {@code out_of_order_timestamp_count}
	 */
	public long outOfOrderTimestampCount() {
		return this.outOfOrderTimestampCount;
	}

	/**
	 * API name: {@code processed_field_count}
	 */
	public long processedFieldCount() {
		return this.processedFieldCount;
	}

	/**
	 * API name: {@code processed_record_count}
	 */
	public long processedRecordCount() {
		return this.processedRecordCount;
	}

	/**
	 * API name: {@code sparse_bucket_count}
	 */
	public long sparseBucketCount() {
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

		generator.writeKey("latest_record_timestamp");
		generator.write(this.latestRecordTimestamp);

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
	 * Builder for {@link PostDataResponse}.
	 */
	public static class Builder implements ObjectBuilder<PostDataResponse> {
		private Long bucketCount;

		private Integer earliestRecordTimestamp;

		private Long emptyBucketCount;

		private Long inputBytes;

		private Long inputFieldCount;

		private Long inputRecordCount;

		private Long invalidDateCount;

		private String jobId;

		private Integer lastDataTime;

		private Integer latestRecordTimestamp;

		private Long missingFieldCount;

		private Long outOfOrderTimestampCount;

		private Long processedFieldCount;

		private Long processedRecordCount;

		private Long sparseBucketCount;

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(long value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code earliest_record_timestamp}
		 */
		public Builder earliestRecordTimestamp(int value) {
			this.earliestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code empty_bucket_count}
		 */
		public Builder emptyBucketCount(long value) {
			this.emptyBucketCount = value;
			return this;
		}

		/**
		 * API name: {@code input_bytes}
		 */
		public Builder inputBytes(long value) {
			this.inputBytes = value;
			return this;
		}

		/**
		 * API name: {@code input_field_count}
		 */
		public Builder inputFieldCount(long value) {
			this.inputFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code input_record_count}
		 */
		public Builder inputRecordCount(long value) {
			this.inputRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code invalid_date_count}
		 */
		public Builder invalidDateCount(long value) {
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
		public Builder lastDataTime(int value) {
			this.lastDataTime = value;
			return this;
		}

		/**
		 * API name: {@code latest_record_timestamp}
		 */
		public Builder latestRecordTimestamp(int value) {
			this.latestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code missing_field_count}
		 */
		public Builder missingFieldCount(long value) {
			this.missingFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code out_of_order_timestamp_count}
		 */
		public Builder outOfOrderTimestampCount(long value) {
			this.outOfOrderTimestampCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_field_count}
		 */
		public Builder processedFieldCount(long value) {
			this.processedFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_record_count}
		 */
		public Builder processedRecordCount(long value) {
			this.processedRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_bucket_count}
		 */
		public Builder sparseBucketCount(long value) {
			this.sparseBucketCount = value;
			return this;
		}

		/**
		 * Builds a {@link PostDataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostDataResponse build() {

			return new PostDataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostDataResponse}
	 */
	public static final JsonpDeserializer<PostDataResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PostDataResponse::setupPostDataResponseDeserializer, Builder::build);

	protected static void setupPostDataResponseDeserializer(DelegatingDeserializer<PostDataResponse.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::earliestRecordTimestamp, JsonpDeserializer.integerDeserializer(), "earliest_record_timestamp");
		op.add(Builder::emptyBucketCount, JsonpDeserializer.longDeserializer(), "empty_bucket_count");
		op.add(Builder::inputBytes, JsonpDeserializer.longDeserializer(), "input_bytes");
		op.add(Builder::inputFieldCount, JsonpDeserializer.longDeserializer(), "input_field_count");
		op.add(Builder::inputRecordCount, JsonpDeserializer.longDeserializer(), "input_record_count");
		op.add(Builder::invalidDateCount, JsonpDeserializer.longDeserializer(), "invalid_date_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::lastDataTime, JsonpDeserializer.integerDeserializer(), "last_data_time");
		op.add(Builder::latestRecordTimestamp, JsonpDeserializer.integerDeserializer(), "latest_record_timestamp");
		op.add(Builder::missingFieldCount, JsonpDeserializer.longDeserializer(), "missing_field_count");
		op.add(Builder::outOfOrderTimestampCount, JsonpDeserializer.longDeserializer(), "out_of_order_timestamp_count");
		op.add(Builder::processedFieldCount, JsonpDeserializer.longDeserializer(), "processed_field_count");
		op.add(Builder::processedRecordCount, JsonpDeserializer.longDeserializer(), "processed_record_count");
		op.add(Builder::sparseBucketCount, JsonpDeserializer.longDeserializer(), "sparse_bucket_count");

	}

}
