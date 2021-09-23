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

// typedef: ml.post_data.Response
public final class PostDataResponse implements JsonpSerializable {
	private final Number bucketCount;

	private final Number earliestRecordTimestamp;

	private final Number emptyBucketCount;

	private final Number inputBytes;

	private final Number inputFieldCount;

	private final Number inputRecordCount;

	private final Number invalidDateCount;

	private final String jobId;

	private final Number lastDataTime;

	private final Number latestRecordTimestamp;

	private final Number missingFieldCount;

	private final Number outOfOrderTimestampCount;

	private final Number processedFieldCount;

	private final Number processedRecordCount;

	private final Number sparseBucketCount;

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
	public Number bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code earliest_record_timestamp}
	 */
	public Number earliestRecordTimestamp() {
		return this.earliestRecordTimestamp;
	}

	/**
	 * API name: {@code empty_bucket_count}
	 */
	public Number emptyBucketCount() {
		return this.emptyBucketCount;
	}

	/**
	 * API name: {@code input_bytes}
	 */
	public Number inputBytes() {
		return this.inputBytes;
	}

	/**
	 * API name: {@code input_field_count}
	 */
	public Number inputFieldCount() {
		return this.inputFieldCount;
	}

	/**
	 * API name: {@code input_record_count}
	 */
	public Number inputRecordCount() {
		return this.inputRecordCount;
	}

	/**
	 * API name: {@code invalid_date_count}
	 */
	public Number invalidDateCount() {
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
	public Number lastDataTime() {
		return this.lastDataTime;
	}

	/**
	 * API name: {@code latest_record_timestamp}
	 */
	public Number latestRecordTimestamp() {
		return this.latestRecordTimestamp;
	}

	/**
	 * API name: {@code missing_field_count}
	 */
	public Number missingFieldCount() {
		return this.missingFieldCount;
	}

	/**
	 * API name: {@code out_of_order_timestamp_count}
	 */
	public Number outOfOrderTimestampCount() {
		return this.outOfOrderTimestampCount;
	}

	/**
	 * API name: {@code processed_field_count}
	 */
	public Number processedFieldCount() {
		return this.processedFieldCount;
	}

	/**
	 * API name: {@code processed_record_count}
	 */
	public Number processedRecordCount() {
		return this.processedRecordCount;
	}

	/**
	 * API name: {@code sparse_bucket_count}
	 */
	public Number sparseBucketCount() {
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
		generator.write(this.bucketCount.doubleValue());

		generator.writeKey("earliest_record_timestamp");
		generator.write(this.earliestRecordTimestamp.doubleValue());

		generator.writeKey("empty_bucket_count");
		generator.write(this.emptyBucketCount.doubleValue());

		generator.writeKey("input_bytes");
		generator.write(this.inputBytes.doubleValue());

		generator.writeKey("input_field_count");
		generator.write(this.inputFieldCount.doubleValue());

		generator.writeKey("input_record_count");
		generator.write(this.inputRecordCount.doubleValue());

		generator.writeKey("invalid_date_count");
		generator.write(this.invalidDateCount.doubleValue());

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("last_data_time");
		generator.write(this.lastDataTime.doubleValue());

		generator.writeKey("latest_record_timestamp");
		generator.write(this.latestRecordTimestamp.doubleValue());

		generator.writeKey("missing_field_count");
		generator.write(this.missingFieldCount.doubleValue());

		generator.writeKey("out_of_order_timestamp_count");
		generator.write(this.outOfOrderTimestampCount.doubleValue());

		generator.writeKey("processed_field_count");
		generator.write(this.processedFieldCount.doubleValue());

		generator.writeKey("processed_record_count");
		generator.write(this.processedRecordCount.doubleValue());

		generator.writeKey("sparse_bucket_count");
		generator.write(this.sparseBucketCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostDataResponse}.
	 */
	public static class Builder implements ObjectBuilder<PostDataResponse> {
		private Number bucketCount;

		private Number earliestRecordTimestamp;

		private Number emptyBucketCount;

		private Number inputBytes;

		private Number inputFieldCount;

		private Number inputRecordCount;

		private Number invalidDateCount;

		private String jobId;

		private Number lastDataTime;

		private Number latestRecordTimestamp;

		private Number missingFieldCount;

		private Number outOfOrderTimestampCount;

		private Number processedFieldCount;

		private Number processedRecordCount;

		private Number sparseBucketCount;

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(Number value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code earliest_record_timestamp}
		 */
		public Builder earliestRecordTimestamp(Number value) {
			this.earliestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code empty_bucket_count}
		 */
		public Builder emptyBucketCount(Number value) {
			this.emptyBucketCount = value;
			return this;
		}

		/**
		 * API name: {@code input_bytes}
		 */
		public Builder inputBytes(Number value) {
			this.inputBytes = value;
			return this;
		}

		/**
		 * API name: {@code input_field_count}
		 */
		public Builder inputFieldCount(Number value) {
			this.inputFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code input_record_count}
		 */
		public Builder inputRecordCount(Number value) {
			this.inputRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code invalid_date_count}
		 */
		public Builder invalidDateCount(Number value) {
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
		public Builder lastDataTime(Number value) {
			this.lastDataTime = value;
			return this;
		}

		/**
		 * API name: {@code latest_record_timestamp}
		 */
		public Builder latestRecordTimestamp(Number value) {
			this.latestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code missing_field_count}
		 */
		public Builder missingFieldCount(Number value) {
			this.missingFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code out_of_order_timestamp_count}
		 */
		public Builder outOfOrderTimestampCount(Number value) {
			this.outOfOrderTimestampCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_field_count}
		 */
		public Builder processedFieldCount(Number value) {
			this.processedFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code processed_record_count}
		 */
		public Builder processedRecordCount(Number value) {
			this.processedRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_bucket_count}
		 */
		public Builder sparseBucketCount(Number value) {
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
	public static final JsonpDeserializer<PostDataResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostDataResponse::setupPostDataResponseDeserializer);

	protected static void setupPostDataResponseDeserializer(DelegatingDeserializer<PostDataResponse.Builder> op) {

		op.add(Builder::bucketCount, JsonpDeserializer.numberDeserializer(), "bucket_count");
		op.add(Builder::earliestRecordTimestamp, JsonpDeserializer.numberDeserializer(), "earliest_record_timestamp");
		op.add(Builder::emptyBucketCount, JsonpDeserializer.numberDeserializer(), "empty_bucket_count");
		op.add(Builder::inputBytes, JsonpDeserializer.numberDeserializer(), "input_bytes");
		op.add(Builder::inputFieldCount, JsonpDeserializer.numberDeserializer(), "input_field_count");
		op.add(Builder::inputRecordCount, JsonpDeserializer.numberDeserializer(), "input_record_count");
		op.add(Builder::invalidDateCount, JsonpDeserializer.numberDeserializer(), "invalid_date_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::lastDataTime, JsonpDeserializer.numberDeserializer(), "last_data_time");
		op.add(Builder::latestRecordTimestamp, JsonpDeserializer.numberDeserializer(), "latest_record_timestamp");
		op.add(Builder::missingFieldCount, JsonpDeserializer.numberDeserializer(), "missing_field_count");
		op.add(Builder::outOfOrderTimestampCount, JsonpDeserializer.numberDeserializer(),
				"out_of_order_timestamp_count");
		op.add(Builder::processedFieldCount, JsonpDeserializer.numberDeserializer(), "processed_field_count");
		op.add(Builder::processedRecordCount, JsonpDeserializer.numberDeserializer(), "processed_record_count");
		op.add(Builder::sparseBucketCount, JsonpDeserializer.numberDeserializer(), "sparse_bucket_count");

	}

}
