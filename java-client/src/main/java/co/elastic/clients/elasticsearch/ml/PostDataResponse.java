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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml.post_data.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.post_data.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostDataResponse implements JsonpSerializable {
	private final String jobId;

	private final long processedRecordCount;

	private final long processedFieldCount;

	private final long inputBytes;

	private final long inputFieldCount;

	private final long invalidDateCount;

	private final long missingFieldCount;

	private final long outOfOrderTimestampCount;

	private final long emptyBucketCount;

	private final long sparseBucketCount;

	private final long bucketCount;

	@Nullable
	private final Long earliestRecordTimestamp;

	@Nullable
	private final Long latestRecordTimestamp;

	@Nullable
	private final Long lastDataTime;

	@Nullable
	private final Long latestEmptyBucketTimestamp;

	@Nullable
	private final Long latestSparseBucketTimestamp;

	private final long inputRecordCount;

	@Nullable
	private final Long logTime;

	// ---------------------------------------------------------------------------------------------

	private PostDataResponse(Builder builder) {

		this.jobId = ApiTypeHelper.requireNonNullWithDefault(builder.jobId, this, "jobId", this.jobId());
		this.processedRecordCount = ApiTypeHelper.requireNonNullWithDefault(builder.processedRecordCount, this,
				"processedRecordCount", this.processedRecordCount());
		this.processedFieldCount = ApiTypeHelper.requireNonNullWithDefault(builder.processedFieldCount, this,
				"processedFieldCount", this.processedFieldCount());
		this.inputBytes = ApiTypeHelper.requireNonNullWithDefault(builder.inputBytes, this, "inputBytes",
				this.inputBytes());
		this.inputFieldCount = ApiTypeHelper.requireNonNullWithDefault(builder.inputFieldCount, this, "inputFieldCount",
				this.inputFieldCount());
		this.invalidDateCount = ApiTypeHelper.requireNonNullWithDefault(builder.invalidDateCount, this,
				"invalidDateCount", this.invalidDateCount());
		this.missingFieldCount = ApiTypeHelper.requireNonNullWithDefault(builder.missingFieldCount, this,
				"missingFieldCount", this.missingFieldCount());
		this.outOfOrderTimestampCount = ApiTypeHelper.requireNonNullWithDefault(builder.outOfOrderTimestampCount, this,
				"outOfOrderTimestampCount", this.outOfOrderTimestampCount());
		this.emptyBucketCount = ApiTypeHelper.requireNonNullWithDefault(builder.emptyBucketCount, this,
				"emptyBucketCount", this.emptyBucketCount());
		this.sparseBucketCount = ApiTypeHelper.requireNonNullWithDefault(builder.sparseBucketCount, this,
				"sparseBucketCount", this.sparseBucketCount());
		this.bucketCount = ApiTypeHelper.requireNonNullWithDefault(builder.bucketCount, this, "bucketCount",
				this.bucketCount());
		this.earliestRecordTimestamp = builder.earliestRecordTimestamp;
		this.latestRecordTimestamp = builder.latestRecordTimestamp;
		this.lastDataTime = builder.lastDataTime;
		this.latestEmptyBucketTimestamp = builder.latestEmptyBucketTimestamp;
		this.latestSparseBucketTimestamp = builder.latestSparseBucketTimestamp;
		this.inputRecordCount = ApiTypeHelper.requireNonNullWithDefault(builder.inputRecordCount, this,
				"inputRecordCount", this.inputRecordCount());
		this.logTime = builder.logTime;

	}

	public static PostDataResponse of(Function<Builder, ObjectBuilder<PostDataResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code processed_record_count}
	 */
	public final long processedRecordCount() {
		return this.processedRecordCount;
	}

	/**
	 * Required - API name: {@code processed_field_count}
	 */
	public final long processedFieldCount() {
		return this.processedFieldCount;
	}

	/**
	 * Required - API name: {@code input_bytes}
	 */
	public final long inputBytes() {
		return this.inputBytes;
	}

	/**
	 * Required - API name: {@code input_field_count}
	 */
	public final long inputFieldCount() {
		return this.inputFieldCount;
	}

	/**
	 * Required - API name: {@code invalid_date_count}
	 */
	public final long invalidDateCount() {
		return this.invalidDateCount;
	}

	/**
	 * Required - API name: {@code missing_field_count}
	 */
	public final long missingFieldCount() {
		return this.missingFieldCount;
	}

	/**
	 * Required - API name: {@code out_of_order_timestamp_count}
	 */
	public final long outOfOrderTimestampCount() {
		return this.outOfOrderTimestampCount;
	}

	/**
	 * Required - API name: {@code empty_bucket_count}
	 */
	public final long emptyBucketCount() {
		return this.emptyBucketCount;
	}

	/**
	 * Required - API name: {@code sparse_bucket_count}
	 */
	public final long sparseBucketCount() {
		return this.sparseBucketCount;
	}

	/**
	 * Required - API name: {@code bucket_count}
	 */
	public final long bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code earliest_record_timestamp}
	 */
	@Nullable
	public final Long earliestRecordTimestamp() {
		return this.earliestRecordTimestamp;
	}

	/**
	 * API name: {@code latest_record_timestamp}
	 */
	@Nullable
	public final Long latestRecordTimestamp() {
		return this.latestRecordTimestamp;
	}

	/**
	 * API name: {@code last_data_time}
	 */
	@Nullable
	public final Long lastDataTime() {
		return this.lastDataTime;
	}

	/**
	 * API name: {@code latest_empty_bucket_timestamp}
	 */
	@Nullable
	public final Long latestEmptyBucketTimestamp() {
		return this.latestEmptyBucketTimestamp;
	}

	/**
	 * API name: {@code latest_sparse_bucket_timestamp}
	 */
	@Nullable
	public final Long latestSparseBucketTimestamp() {
		return this.latestSparseBucketTimestamp;
	}

	/**
	 * Required - API name: {@code input_record_count}
	 */
	public final long inputRecordCount() {
		return this.inputRecordCount;
	}

	/**
	 * API name: {@code log_time}
	 */
	@Nullable
	public final Long logTime() {
		return this.logTime;
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

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("processed_record_count");
		generator.write(this.processedRecordCount);

		generator.writeKey("processed_field_count");
		generator.write(this.processedFieldCount);

		generator.writeKey("input_bytes");
		generator.write(this.inputBytes);

		generator.writeKey("input_field_count");
		generator.write(this.inputFieldCount);

		generator.writeKey("invalid_date_count");
		generator.write(this.invalidDateCount);

		generator.writeKey("missing_field_count");
		generator.write(this.missingFieldCount);

		generator.writeKey("out_of_order_timestamp_count");
		generator.write(this.outOfOrderTimestampCount);

		generator.writeKey("empty_bucket_count");
		generator.write(this.emptyBucketCount);

		generator.writeKey("sparse_bucket_count");
		generator.write(this.sparseBucketCount);

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		if (this.earliestRecordTimestamp != null) {
			generator.writeKey("earliest_record_timestamp");
			generator.write(this.earliestRecordTimestamp);

		}
		if (this.latestRecordTimestamp != null) {
			generator.writeKey("latest_record_timestamp");
			generator.write(this.latestRecordTimestamp);

		}
		if (this.lastDataTime != null) {
			generator.writeKey("last_data_time");
			generator.write(this.lastDataTime);

		}
		if (this.latestEmptyBucketTimestamp != null) {
			generator.writeKey("latest_empty_bucket_timestamp");
			generator.write(this.latestEmptyBucketTimestamp);

		}
		if (this.latestSparseBucketTimestamp != null) {
			generator.writeKey("latest_sparse_bucket_timestamp");
			generator.write(this.latestSparseBucketTimestamp);

		}
		generator.writeKey("input_record_count");
		generator.write(this.inputRecordCount);

		if (this.logTime != null) {
			generator.writeKey("log_time");
			generator.write(this.logTime);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostDataResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PostDataResponse> {
		private String jobId;

		private Long processedRecordCount;

		private Long processedFieldCount;

		private Long inputBytes;

		private Long inputFieldCount;

		private Long invalidDateCount;

		private Long missingFieldCount;

		private Long outOfOrderTimestampCount;

		private Long emptyBucketCount;

		private Long sparseBucketCount;

		private Long bucketCount;

		@Nullable
		private Long earliestRecordTimestamp;

		@Nullable
		private Long latestRecordTimestamp;

		@Nullable
		private Long lastDataTime;

		@Nullable
		private Long latestEmptyBucketTimestamp;

		@Nullable
		private Long latestSparseBucketTimestamp;

		private Long inputRecordCount;

		@Nullable
		private Long logTime;

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code processed_record_count}
		 */
		public final Builder processedRecordCount(long value) {
			this.processedRecordCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code processed_field_count}
		 */
		public final Builder processedFieldCount(long value) {
			this.processedFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_bytes}
		 */
		public final Builder inputBytes(long value) {
			this.inputBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_field_count}
		 */
		public final Builder inputFieldCount(long value) {
			this.inputFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code invalid_date_count}
		 */
		public final Builder invalidDateCount(long value) {
			this.invalidDateCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code missing_field_count}
		 */
		public final Builder missingFieldCount(long value) {
			this.missingFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code out_of_order_timestamp_count}
		 */
		public final Builder outOfOrderTimestampCount(long value) {
			this.outOfOrderTimestampCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code empty_bucket_count}
		 */
		public final Builder emptyBucketCount(long value) {
			this.emptyBucketCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code sparse_bucket_count}
		 */
		public final Builder sparseBucketCount(long value) {
			this.sparseBucketCount = value;
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
		 * API name: {@code earliest_record_timestamp}
		 */
		public final Builder earliestRecordTimestamp(@Nullable Long value) {
			this.earliestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code latest_record_timestamp}
		 */
		public final Builder latestRecordTimestamp(@Nullable Long value) {
			this.latestRecordTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code last_data_time}
		 */
		public final Builder lastDataTime(@Nullable Long value) {
			this.lastDataTime = value;
			return this;
		}

		/**
		 * API name: {@code latest_empty_bucket_timestamp}
		 */
		public final Builder latestEmptyBucketTimestamp(@Nullable Long value) {
			this.latestEmptyBucketTimestamp = value;
			return this;
		}

		/**
		 * API name: {@code latest_sparse_bucket_timestamp}
		 */
		public final Builder latestSparseBucketTimestamp(@Nullable Long value) {
			this.latestSparseBucketTimestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code input_record_count}
		 */
		public final Builder inputRecordCount(long value) {
			this.inputRecordCount = value;
			return this;
		}

		/**
		 * API name: {@code log_time}
		 */
		public final Builder logTime(@Nullable Long value) {
			this.logTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostDataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostDataResponse build() {
			_checkSingleUse();

			return new PostDataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostDataResponse}
	 */
	public static final JsonpDeserializer<PostDataResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PostDataResponse::setupPostDataResponseDeserializer);

	protected static void setupPostDataResponseDeserializer(ObjectDeserializer<PostDataResponse.Builder> op) {

		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::processedRecordCount, JsonpDeserializer.longDeserializer(), "processed_record_count");
		op.add(Builder::processedFieldCount, JsonpDeserializer.longDeserializer(), "processed_field_count");
		op.add(Builder::inputBytes, JsonpDeserializer.longDeserializer(), "input_bytes");
		op.add(Builder::inputFieldCount, JsonpDeserializer.longDeserializer(), "input_field_count");
		op.add(Builder::invalidDateCount, JsonpDeserializer.longDeserializer(), "invalid_date_count");
		op.add(Builder::missingFieldCount, JsonpDeserializer.longDeserializer(), "missing_field_count");
		op.add(Builder::outOfOrderTimestampCount, JsonpDeserializer.longDeserializer(), "out_of_order_timestamp_count");
		op.add(Builder::emptyBucketCount, JsonpDeserializer.longDeserializer(), "empty_bucket_count");
		op.add(Builder::sparseBucketCount, JsonpDeserializer.longDeserializer(), "sparse_bucket_count");
		op.add(Builder::bucketCount, JsonpDeserializer.longDeserializer(), "bucket_count");
		op.add(Builder::earliestRecordTimestamp, JsonpDeserializer.longDeserializer(), "earliest_record_timestamp");
		op.add(Builder::latestRecordTimestamp, JsonpDeserializer.longDeserializer(), "latest_record_timestamp");
		op.add(Builder::lastDataTime, JsonpDeserializer.longDeserializer(), "last_data_time");
		op.add(Builder::latestEmptyBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_empty_bucket_timestamp");
		op.add(Builder::latestSparseBucketTimestamp, JsonpDeserializer.longDeserializer(),
				"latest_sparse_bucket_timestamp");
		op.add(Builder::inputRecordCount, JsonpDeserializer.longDeserializer(), "input_record_count");
		op.add(Builder::logTime, JsonpDeserializer.longDeserializer(), "log_time");

	}

}
