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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSizeStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.ModelSizeStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelSizeStats implements JsonpSerializable {
	private final long bucketAllocationFailuresCount;

	private final String jobId;

	private final DateTime logTime;

	private final MemoryStatus memoryStatus;

	private final String modelBytes;

	@Nullable
	private final String modelBytesExceeded;

	@Nullable
	private final String modelBytesMemoryLimit;

	@Nullable
	private final String peakModelBytes;

	@Nullable
	private final String assignmentMemoryBasis;

	private final String resultType;

	private final long totalByFieldCount;

	private final long totalOverFieldCount;

	private final long totalPartitionFieldCount;

	private final CategorizationStatus categorizationStatus;

	private final int categorizedDocCount;

	private final int deadCategoryCount;

	private final int failedCategoryCount;

	private final int frequentCategoryCount;

	private final int rareCategoryCount;

	private final int totalCategoryCount;

	@Nullable
	private final Long timestamp;

	// ---------------------------------------------------------------------------------------------

	private ModelSizeStats(Builder builder) {

		this.bucketAllocationFailuresCount = ApiTypeHelper.requireNonNull(builder.bucketAllocationFailuresCount, this,
				"bucketAllocationFailuresCount");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.logTime = ApiTypeHelper.requireNonNull(builder.logTime, this, "logTime");
		this.memoryStatus = ApiTypeHelper.requireNonNull(builder.memoryStatus, this, "memoryStatus");
		this.modelBytes = ApiTypeHelper.requireNonNull(builder.modelBytes, this, "modelBytes");
		this.modelBytesExceeded = builder.modelBytesExceeded;
		this.modelBytesMemoryLimit = builder.modelBytesMemoryLimit;
		this.peakModelBytes = builder.peakModelBytes;
		this.assignmentMemoryBasis = builder.assignmentMemoryBasis;
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.totalByFieldCount = ApiTypeHelper.requireNonNull(builder.totalByFieldCount, this, "totalByFieldCount");
		this.totalOverFieldCount = ApiTypeHelper.requireNonNull(builder.totalOverFieldCount, this,
				"totalOverFieldCount");
		this.totalPartitionFieldCount = ApiTypeHelper.requireNonNull(builder.totalPartitionFieldCount, this,
				"totalPartitionFieldCount");
		this.categorizationStatus = ApiTypeHelper.requireNonNull(builder.categorizationStatus, this,
				"categorizationStatus");
		this.categorizedDocCount = ApiTypeHelper.requireNonNull(builder.categorizedDocCount, this,
				"categorizedDocCount");
		this.deadCategoryCount = ApiTypeHelper.requireNonNull(builder.deadCategoryCount, this, "deadCategoryCount");
		this.failedCategoryCount = ApiTypeHelper.requireNonNull(builder.failedCategoryCount, this,
				"failedCategoryCount");
		this.frequentCategoryCount = ApiTypeHelper.requireNonNull(builder.frequentCategoryCount, this,
				"frequentCategoryCount");
		this.rareCategoryCount = ApiTypeHelper.requireNonNull(builder.rareCategoryCount, this, "rareCategoryCount");
		this.totalCategoryCount = ApiTypeHelper.requireNonNull(builder.totalCategoryCount, this, "totalCategoryCount");
		this.timestamp = builder.timestamp;

	}

	public static ModelSizeStats of(Function<Builder, ObjectBuilder<ModelSizeStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bucket_allocation_failures_count}
	 */
	public final long bucketAllocationFailuresCount() {
		return this.bucketAllocationFailuresCount;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code log_time}
	 */
	public final DateTime logTime() {
		return this.logTime;
	}

	/**
	 * Required - API name: {@code memory_status}
	 */
	public final MemoryStatus memoryStatus() {
		return this.memoryStatus;
	}

	/**
	 * Required - API name: {@code model_bytes}
	 */
	public final String modelBytes() {
		return this.modelBytes;
	}

	/**
	 * API name: {@code model_bytes_exceeded}
	 */
	@Nullable
	public final String modelBytesExceeded() {
		return this.modelBytesExceeded;
	}

	/**
	 * API name: {@code model_bytes_memory_limit}
	 */
	@Nullable
	public final String modelBytesMemoryLimit() {
		return this.modelBytesMemoryLimit;
	}

	/**
	 * API name: {@code peak_model_bytes}
	 */
	@Nullable
	public final String peakModelBytes() {
		return this.peakModelBytes;
	}

	/**
	 * API name: {@code assignment_memory_basis}
	 */
	@Nullable
	public final String assignmentMemoryBasis() {
		return this.assignmentMemoryBasis;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code total_by_field_count}
	 */
	public final long totalByFieldCount() {
		return this.totalByFieldCount;
	}

	/**
	 * Required - API name: {@code total_over_field_count}
	 */
	public final long totalOverFieldCount() {
		return this.totalOverFieldCount;
	}

	/**
	 * Required - API name: {@code total_partition_field_count}
	 */
	public final long totalPartitionFieldCount() {
		return this.totalPartitionFieldCount;
	}

	/**
	 * Required - API name: {@code categorization_status}
	 */
	public final CategorizationStatus categorizationStatus() {
		return this.categorizationStatus;
	}

	/**
	 * Required - API name: {@code categorized_doc_count}
	 */
	public final int categorizedDocCount() {
		return this.categorizedDocCount;
	}

	/**
	 * Required - API name: {@code dead_category_count}
	 */
	public final int deadCategoryCount() {
		return this.deadCategoryCount;
	}

	/**
	 * Required - API name: {@code failed_category_count}
	 */
	public final int failedCategoryCount() {
		return this.failedCategoryCount;
	}

	/**
	 * Required - API name: {@code frequent_category_count}
	 */
	public final int frequentCategoryCount() {
		return this.frequentCategoryCount;
	}

	/**
	 * Required - API name: {@code rare_category_count}
	 */
	public final int rareCategoryCount() {
		return this.rareCategoryCount;
	}

	/**
	 * Required - API name: {@code total_category_count}
	 */
	public final int totalCategoryCount() {
		return this.totalCategoryCount;
	}

	/**
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

		generator.writeKey("bucket_allocation_failures_count");
		generator.write(this.bucketAllocationFailuresCount);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("log_time");
		this.logTime.serialize(generator, mapper);
		generator.writeKey("memory_status");
		this.memoryStatus.serialize(generator, mapper);
		generator.writeKey("model_bytes");
		generator.write(this.modelBytes);

		if (this.modelBytesExceeded != null) {
			generator.writeKey("model_bytes_exceeded");
			generator.write(this.modelBytesExceeded);

		}
		if (this.modelBytesMemoryLimit != null) {
			generator.writeKey("model_bytes_memory_limit");
			generator.write(this.modelBytesMemoryLimit);

		}
		if (this.peakModelBytes != null) {
			generator.writeKey("peak_model_bytes");
			generator.write(this.peakModelBytes);

		}
		if (this.assignmentMemoryBasis != null) {
			generator.writeKey("assignment_memory_basis");
			generator.write(this.assignmentMemoryBasis);

		}
		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("total_by_field_count");
		generator.write(this.totalByFieldCount);

		generator.writeKey("total_over_field_count");
		generator.write(this.totalOverFieldCount);

		generator.writeKey("total_partition_field_count");
		generator.write(this.totalPartitionFieldCount);

		generator.writeKey("categorization_status");
		this.categorizationStatus.serialize(generator, mapper);
		generator.writeKey("categorized_doc_count");
		generator.write(this.categorizedDocCount);

		generator.writeKey("dead_category_count");
		generator.write(this.deadCategoryCount);

		generator.writeKey("failed_category_count");
		generator.write(this.failedCategoryCount);

		generator.writeKey("frequent_category_count");
		generator.write(this.frequentCategoryCount);

		generator.writeKey("rare_category_count");
		generator.write(this.rareCategoryCount);

		generator.writeKey("total_category_count");
		generator.write(this.totalCategoryCount);

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
	 * Builder for {@link ModelSizeStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ModelSizeStats> {
		private Long bucketAllocationFailuresCount;

		private String jobId;

		private DateTime logTime;

		private MemoryStatus memoryStatus;

		private String modelBytes;

		@Nullable
		private String modelBytesExceeded;

		@Nullable
		private String modelBytesMemoryLimit;

		@Nullable
		private String peakModelBytes;

		@Nullable
		private String assignmentMemoryBasis;

		private String resultType;

		private Long totalByFieldCount;

		private Long totalOverFieldCount;

		private Long totalPartitionFieldCount;

		private CategorizationStatus categorizationStatus;

		private Integer categorizedDocCount;

		private Integer deadCategoryCount;

		private Integer failedCategoryCount;

		private Integer frequentCategoryCount;

		private Integer rareCategoryCount;

		private Integer totalCategoryCount;

		@Nullable
		private Long timestamp;

		/**
		 * Required - API name: {@code bucket_allocation_failures_count}
		 */
		public final Builder bucketAllocationFailuresCount(long value) {
			this.bucketAllocationFailuresCount = value;
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
		 * Required - API name: {@code log_time}
		 */
		public final Builder logTime(DateTime value) {
			this.logTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_status}
		 */
		public final Builder memoryStatus(MemoryStatus value) {
			this.memoryStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_bytes}
		 */
		public final Builder modelBytes(String value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * API name: {@code model_bytes_exceeded}
		 */
		public final Builder modelBytesExceeded(@Nullable String value) {
			this.modelBytesExceeded = value;
			return this;
		}

		/**
		 * API name: {@code model_bytes_memory_limit}
		 */
		public final Builder modelBytesMemoryLimit(@Nullable String value) {
			this.modelBytesMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code peak_model_bytes}
		 */
		public final Builder peakModelBytes(@Nullable String value) {
			this.peakModelBytes = value;
			return this;
		}

		/**
		 * API name: {@code assignment_memory_basis}
		 */
		public final Builder assignmentMemoryBasis(@Nullable String value) {
			this.assignmentMemoryBasis = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_by_field_count}
		 */
		public final Builder totalByFieldCount(long value) {
			this.totalByFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_over_field_count}
		 */
		public final Builder totalOverFieldCount(long value) {
			this.totalOverFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_partition_field_count}
		 */
		public final Builder totalPartitionFieldCount(long value) {
			this.totalPartitionFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code categorization_status}
		 */
		public final Builder categorizationStatus(CategorizationStatus value) {
			this.categorizationStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code categorized_doc_count}
		 */
		public final Builder categorizedDocCount(int value) {
			this.categorizedDocCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code dead_category_count}
		 */
		public final Builder deadCategoryCount(int value) {
			this.deadCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_category_count}
		 */
		public final Builder failedCategoryCount(int value) {
			this.failedCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code frequent_category_count}
		 */
		public final Builder frequentCategoryCount(int value) {
			this.frequentCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code rare_category_count}
		 */
		public final Builder rareCategoryCount(int value) {
			this.rareCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_category_count}
		 */
		public final Builder totalCategoryCount(int value) {
			this.totalCategoryCount = value;
			return this;
		}

		/**
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
		 * Builds a {@link ModelSizeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSizeStats build() {
			_checkSingleUse();

			return new ModelSizeStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelSizeStats}
	 */
	public static final JsonpDeserializer<ModelSizeStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ModelSizeStats::setupModelSizeStatsDeserializer);

	protected static void setupModelSizeStatsDeserializer(ObjectDeserializer<ModelSizeStats.Builder> op) {

		op.add(Builder::bucketAllocationFailuresCount, JsonpDeserializer.longDeserializer(),
				"bucket_allocation_failures_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::logTime, DateTime._DESERIALIZER, "log_time");
		op.add(Builder::memoryStatus, MemoryStatus._DESERIALIZER, "memory_status");
		op.add(Builder::modelBytes, JsonpDeserializer.stringDeserializer(), "model_bytes");
		op.add(Builder::modelBytesExceeded, JsonpDeserializer.stringDeserializer(), "model_bytes_exceeded");
		op.add(Builder::modelBytesMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_bytes_memory_limit");
		op.add(Builder::peakModelBytes, JsonpDeserializer.stringDeserializer(), "peak_model_bytes");
		op.add(Builder::assignmentMemoryBasis, JsonpDeserializer.stringDeserializer(), "assignment_memory_basis");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::totalByFieldCount, JsonpDeserializer.longDeserializer(), "total_by_field_count");
		op.add(Builder::totalOverFieldCount, JsonpDeserializer.longDeserializer(), "total_over_field_count");
		op.add(Builder::totalPartitionFieldCount, JsonpDeserializer.longDeserializer(), "total_partition_field_count");
		op.add(Builder::categorizationStatus, CategorizationStatus._DESERIALIZER, "categorization_status");
		op.add(Builder::categorizedDocCount, JsonpDeserializer.integerDeserializer(), "categorized_doc_count");
		op.add(Builder::deadCategoryCount, JsonpDeserializer.integerDeserializer(), "dead_category_count");
		op.add(Builder::failedCategoryCount, JsonpDeserializer.integerDeserializer(), "failed_category_count");
		op.add(Builder::frequentCategoryCount, JsonpDeserializer.integerDeserializer(), "frequent_category_count");
		op.add(Builder::rareCategoryCount, JsonpDeserializer.integerDeserializer(), "rare_category_count");
		op.add(Builder::totalCategoryCount, JsonpDeserializer.integerDeserializer(), "total_category_count");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
