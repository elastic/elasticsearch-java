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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSizeStats
@JsonpDeserializable
public final class ModelSizeStats implements JsonpSerializable {
	private final long bucketAllocationFailuresCount;

	private final String jobId;

	private final String logTime;

	private final MemoryStatus memoryStatus;

	private final long modelBytes;

	private final long modelBytesExceeded;

	private final long modelBytesMemoryLimit;

	private final long peakModelBytes;

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

	public ModelSizeStats(Builder builder) {

		this.bucketAllocationFailuresCount = Objects.requireNonNull(builder.bucketAllocationFailuresCount,
				"bucket_allocation_failures_count");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.logTime = Objects.requireNonNull(builder.logTime, "log_time");
		this.memoryStatus = Objects.requireNonNull(builder.memoryStatus, "memory_status");
		this.modelBytes = Objects.requireNonNull(builder.modelBytes, "model_bytes");
		this.modelBytesExceeded = Objects.requireNonNull(builder.modelBytesExceeded, "model_bytes_exceeded");
		this.modelBytesMemoryLimit = Objects.requireNonNull(builder.modelBytesMemoryLimit, "model_bytes_memory_limit");
		this.peakModelBytes = Objects.requireNonNull(builder.peakModelBytes, "peak_model_bytes");
		this.assignmentMemoryBasis = builder.assignmentMemoryBasis;
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.totalByFieldCount = Objects.requireNonNull(builder.totalByFieldCount, "total_by_field_count");
		this.totalOverFieldCount = Objects.requireNonNull(builder.totalOverFieldCount, "total_over_field_count");
		this.totalPartitionFieldCount = Objects.requireNonNull(builder.totalPartitionFieldCount,
				"total_partition_field_count");
		this.categorizationStatus = Objects.requireNonNull(builder.categorizationStatus, "categorization_status");
		this.categorizedDocCount = Objects.requireNonNull(builder.categorizedDocCount, "categorized_doc_count");
		this.deadCategoryCount = Objects.requireNonNull(builder.deadCategoryCount, "dead_category_count");
		this.failedCategoryCount = Objects.requireNonNull(builder.failedCategoryCount, "failed_category_count");
		this.frequentCategoryCount = Objects.requireNonNull(builder.frequentCategoryCount, "frequent_category_count");
		this.rareCategoryCount = Objects.requireNonNull(builder.rareCategoryCount, "rare_category_count");
		this.totalCategoryCount = Objects.requireNonNull(builder.totalCategoryCount, "total_category_count");
		this.timestamp = builder.timestamp;

	}

	public ModelSizeStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code bucket_allocation_failures_count}
	 */
	public long bucketAllocationFailuresCount() {
		return this.bucketAllocationFailuresCount;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code log_time}
	 */
	public String logTime() {
		return this.logTime;
	}

	/**
	 * Required - API name: {@code memory_status}
	 */
	public MemoryStatus memoryStatus() {
		return this.memoryStatus;
	}

	/**
	 * Required - API name: {@code model_bytes}
	 */
	public long modelBytes() {
		return this.modelBytes;
	}

	/**
	 * Required - API name: {@code model_bytes_exceeded}
	 */
	public long modelBytesExceeded() {
		return this.modelBytesExceeded;
	}

	/**
	 * Required - API name: {@code model_bytes_memory_limit}
	 */
	public long modelBytesMemoryLimit() {
		return this.modelBytesMemoryLimit;
	}

	/**
	 * Required - API name: {@code peak_model_bytes}
	 */
	public long peakModelBytes() {
		return this.peakModelBytes;
	}

	/**
	 * API name: {@code assignment_memory_basis}
	 */
	@Nullable
	public String assignmentMemoryBasis() {
		return this.assignmentMemoryBasis;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code total_by_field_count}
	 */
	public long totalByFieldCount() {
		return this.totalByFieldCount;
	}

	/**
	 * Required - API name: {@code total_over_field_count}
	 */
	public long totalOverFieldCount() {
		return this.totalOverFieldCount;
	}

	/**
	 * Required - API name: {@code total_partition_field_count}
	 */
	public long totalPartitionFieldCount() {
		return this.totalPartitionFieldCount;
	}

	/**
	 * Required - API name: {@code categorization_status}
	 */
	public CategorizationStatus categorizationStatus() {
		return this.categorizationStatus;
	}

	/**
	 * Required - API name: {@code categorized_doc_count}
	 */
	public int categorizedDocCount() {
		return this.categorizedDocCount;
	}

	/**
	 * Required - API name: {@code dead_category_count}
	 */
	public int deadCategoryCount() {
		return this.deadCategoryCount;
	}

	/**
	 * Required - API name: {@code failed_category_count}
	 */
	public int failedCategoryCount() {
		return this.failedCategoryCount;
	}

	/**
	 * Required - API name: {@code frequent_category_count}
	 */
	public int frequentCategoryCount() {
		return this.frequentCategoryCount;
	}

	/**
	 * Required - API name: {@code rare_category_count}
	 */
	public int rareCategoryCount() {
		return this.rareCategoryCount;
	}

	/**
	 * Required - API name: {@code total_category_count}
	 */
	public int totalCategoryCount() {
		return this.totalCategoryCount;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public Long timestamp() {
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
		generator.write(this.logTime);

		generator.writeKey("memory_status");
		this.memoryStatus.serialize(generator, mapper);

		generator.writeKey("model_bytes");
		generator.write(this.modelBytes);

		generator.writeKey("model_bytes_exceeded");
		generator.write(this.modelBytesExceeded);

		generator.writeKey("model_bytes_memory_limit");
		generator.write(this.modelBytesMemoryLimit);

		generator.writeKey("peak_model_bytes");
		generator.write(this.peakModelBytes);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSizeStats}.
	 */
	public static class Builder implements ObjectBuilder<ModelSizeStats> {
		private Long bucketAllocationFailuresCount;

		private String jobId;

		private String logTime;

		private MemoryStatus memoryStatus;

		private Long modelBytes;

		private Long modelBytesExceeded;

		private Long modelBytesMemoryLimit;

		private Long peakModelBytes;

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
		public Builder bucketAllocationFailuresCount(long value) {
			this.bucketAllocationFailuresCount = value;
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
		 * Required - API name: {@code log_time}
		 */
		public Builder logTime(String value) {
			this.logTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_status}
		 */
		public Builder memoryStatus(MemoryStatus value) {
			this.memoryStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_bytes}
		 */
		public Builder modelBytes(long value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_bytes_exceeded}
		 */
		public Builder modelBytesExceeded(long value) {
			this.modelBytesExceeded = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_bytes_memory_limit}
		 */
		public Builder modelBytesMemoryLimit(long value) {
			this.modelBytesMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code peak_model_bytes}
		 */
		public Builder peakModelBytes(long value) {
			this.peakModelBytes = value;
			return this;
		}

		/**
		 * API name: {@code assignment_memory_basis}
		 */
		public Builder assignmentMemoryBasis(@Nullable String value) {
			this.assignmentMemoryBasis = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_by_field_count}
		 */
		public Builder totalByFieldCount(long value) {
			this.totalByFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_over_field_count}
		 */
		public Builder totalOverFieldCount(long value) {
			this.totalOverFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_partition_field_count}
		 */
		public Builder totalPartitionFieldCount(long value) {
			this.totalPartitionFieldCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code categorization_status}
		 */
		public Builder categorizationStatus(CategorizationStatus value) {
			this.categorizationStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code categorized_doc_count}
		 */
		public Builder categorizedDocCount(int value) {
			this.categorizedDocCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code dead_category_count}
		 */
		public Builder deadCategoryCount(int value) {
			this.deadCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_category_count}
		 */
		public Builder failedCategoryCount(int value) {
			this.failedCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code frequent_category_count}
		 */
		public Builder frequentCategoryCount(int value) {
			this.frequentCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code rare_category_count}
		 */
		public Builder rareCategoryCount(int value) {
			this.rareCategoryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_category_count}
		 */
		public Builder totalCategoryCount(int value) {
			this.totalCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ModelSizeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSizeStats build() {

			return new ModelSizeStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelSizeStats}
	 */
	public static final JsonpDeserializer<ModelSizeStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ModelSizeStats::setupModelSizeStatsDeserializer, Builder::build);

	protected static void setupModelSizeStatsDeserializer(DelegatingDeserializer<ModelSizeStats.Builder> op) {

		op.add(Builder::bucketAllocationFailuresCount, JsonpDeserializer.longDeserializer(),
				"bucket_allocation_failures_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::logTime, JsonpDeserializer.stringDeserializer(), "log_time");
		op.add(Builder::memoryStatus, MemoryStatus._DESERIALIZER, "memory_status");
		op.add(Builder::modelBytes, JsonpDeserializer.longDeserializer(), "model_bytes");
		op.add(Builder::modelBytesExceeded, JsonpDeserializer.longDeserializer(), "model_bytes_exceeded");
		op.add(Builder::modelBytesMemoryLimit, JsonpDeserializer.longDeserializer(), "model_bytes_memory_limit");
		op.add(Builder::peakModelBytes, JsonpDeserializer.longDeserializer(), "peak_model_bytes");
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
