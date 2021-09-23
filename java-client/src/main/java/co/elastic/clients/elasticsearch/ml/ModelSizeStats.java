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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSizeStats
public final class ModelSizeStats implements JsonpSerializable {
	private final Number bucketAllocationFailuresCount;

	private final String jobId;

	private final JsonValue logTime;

	private final MemoryStatus memoryStatus;

	private final Number modelBytes;

	private final Number modelBytesExceeded;

	private final Number modelBytesMemoryLimit;

	private final Number peakModelBytes;

	@Nullable
	private final String assignmentMemoryBasis;

	private final String resultType;

	private final Number totalByFieldCount;

	private final Number totalOverFieldCount;

	private final Number totalPartitionFieldCount;

	private final CategorizationStatus categorizationStatus;

	private final Number categorizedDocCount;

	private final Number deadCategoryCount;

	private final Number failedCategoryCount;

	private final Number frequentCategoryCount;

	private final Number rareCategoryCount;

	private final Number totalCategoryCount;

	@Nullable
	private final Number timestamp;

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

	/**
	 * API name: {@code bucket_allocation_failures_count}
	 */
	public Number bucketAllocationFailuresCount() {
		return this.bucketAllocationFailuresCount;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code log_time}
	 */
	public JsonValue logTime() {
		return this.logTime;
	}

	/**
	 * API name: {@code memory_status}
	 */
	public MemoryStatus memoryStatus() {
		return this.memoryStatus;
	}

	/**
	 * API name: {@code model_bytes}
	 */
	public Number modelBytes() {
		return this.modelBytes;
	}

	/**
	 * API name: {@code model_bytes_exceeded}
	 */
	public Number modelBytesExceeded() {
		return this.modelBytesExceeded;
	}

	/**
	 * API name: {@code model_bytes_memory_limit}
	 */
	public Number modelBytesMemoryLimit() {
		return this.modelBytesMemoryLimit;
	}

	/**
	 * API name: {@code peak_model_bytes}
	 */
	public Number peakModelBytes() {
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
	 * API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * API name: {@code total_by_field_count}
	 */
	public Number totalByFieldCount() {
		return this.totalByFieldCount;
	}

	/**
	 * API name: {@code total_over_field_count}
	 */
	public Number totalOverFieldCount() {
		return this.totalOverFieldCount;
	}

	/**
	 * API name: {@code total_partition_field_count}
	 */
	public Number totalPartitionFieldCount() {
		return this.totalPartitionFieldCount;
	}

	/**
	 * API name: {@code categorization_status}
	 */
	public CategorizationStatus categorizationStatus() {
		return this.categorizationStatus;
	}

	/**
	 * API name: {@code categorized_doc_count}
	 */
	public Number categorizedDocCount() {
		return this.categorizedDocCount;
	}

	/**
	 * API name: {@code dead_category_count}
	 */
	public Number deadCategoryCount() {
		return this.deadCategoryCount;
	}

	/**
	 * API name: {@code failed_category_count}
	 */
	public Number failedCategoryCount() {
		return this.failedCategoryCount;
	}

	/**
	 * API name: {@code frequent_category_count}
	 */
	public Number frequentCategoryCount() {
		return this.frequentCategoryCount;
	}

	/**
	 * API name: {@code rare_category_count}
	 */
	public Number rareCategoryCount() {
		return this.rareCategoryCount;
	}

	/**
	 * API name: {@code total_category_count}
	 */
	public Number totalCategoryCount() {
		return this.totalCategoryCount;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public Number timestamp() {
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
		generator.write(this.bucketAllocationFailuresCount.doubleValue());

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("log_time");
		generator.write(this.logTime);

		generator.writeKey("memory_status");
		this.memoryStatus.serialize(generator, mapper);

		generator.writeKey("model_bytes");
		generator.write(this.modelBytes.doubleValue());

		generator.writeKey("model_bytes_exceeded");
		generator.write(this.modelBytesExceeded.doubleValue());

		generator.writeKey("model_bytes_memory_limit");
		generator.write(this.modelBytesMemoryLimit.doubleValue());

		generator.writeKey("peak_model_bytes");
		generator.write(this.peakModelBytes.doubleValue());

		if (this.assignmentMemoryBasis != null) {

			generator.writeKey("assignment_memory_basis");
			generator.write(this.assignmentMemoryBasis);

		}

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("total_by_field_count");
		generator.write(this.totalByFieldCount.doubleValue());

		generator.writeKey("total_over_field_count");
		generator.write(this.totalOverFieldCount.doubleValue());

		generator.writeKey("total_partition_field_count");
		generator.write(this.totalPartitionFieldCount.doubleValue());

		generator.writeKey("categorization_status");
		this.categorizationStatus.serialize(generator, mapper);

		generator.writeKey("categorized_doc_count");
		generator.write(this.categorizedDocCount.doubleValue());

		generator.writeKey("dead_category_count");
		generator.write(this.deadCategoryCount.doubleValue());

		generator.writeKey("failed_category_count");
		generator.write(this.failedCategoryCount.doubleValue());

		generator.writeKey("frequent_category_count");
		generator.write(this.frequentCategoryCount.doubleValue());

		generator.writeKey("rare_category_count");
		generator.write(this.rareCategoryCount.doubleValue());

		generator.writeKey("total_category_count");
		generator.write(this.totalCategoryCount.doubleValue());

		if (this.timestamp != null) {

			generator.writeKey("timestamp");
			generator.write(this.timestamp.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSizeStats}.
	 */
	public static class Builder implements ObjectBuilder<ModelSizeStats> {
		private Number bucketAllocationFailuresCount;

		private String jobId;

		private JsonValue logTime;

		private MemoryStatus memoryStatus;

		private Number modelBytes;

		private Number modelBytesExceeded;

		private Number modelBytesMemoryLimit;

		private Number peakModelBytes;

		@Nullable
		private String assignmentMemoryBasis;

		private String resultType;

		private Number totalByFieldCount;

		private Number totalOverFieldCount;

		private Number totalPartitionFieldCount;

		private CategorizationStatus categorizationStatus;

		private Number categorizedDocCount;

		private Number deadCategoryCount;

		private Number failedCategoryCount;

		private Number frequentCategoryCount;

		private Number rareCategoryCount;

		private Number totalCategoryCount;

		@Nullable
		private Number timestamp;

		/**
		 * API name: {@code bucket_allocation_failures_count}
		 */
		public Builder bucketAllocationFailuresCount(Number value) {
			this.bucketAllocationFailuresCount = value;
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
		 * API name: {@code log_time}
		 */
		public Builder logTime(JsonValue value) {
			this.logTime = value;
			return this;
		}

		/**
		 * API name: {@code memory_status}
		 */
		public Builder memoryStatus(MemoryStatus value) {
			this.memoryStatus = value;
			return this;
		}

		/**
		 * API name: {@code model_bytes}
		 */
		public Builder modelBytes(Number value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * API name: {@code model_bytes_exceeded}
		 */
		public Builder modelBytesExceeded(Number value) {
			this.modelBytesExceeded = value;
			return this;
		}

		/**
		 * API name: {@code model_bytes_memory_limit}
		 */
		public Builder modelBytesMemoryLimit(Number value) {
			this.modelBytesMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code peak_model_bytes}
		 */
		public Builder peakModelBytes(Number value) {
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
		 * API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * API name: {@code total_by_field_count}
		 */
		public Builder totalByFieldCount(Number value) {
			this.totalByFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code total_over_field_count}
		 */
		public Builder totalOverFieldCount(Number value) {
			this.totalOverFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code total_partition_field_count}
		 */
		public Builder totalPartitionFieldCount(Number value) {
			this.totalPartitionFieldCount = value;
			return this;
		}

		/**
		 * API name: {@code categorization_status}
		 */
		public Builder categorizationStatus(CategorizationStatus value) {
			this.categorizationStatus = value;
			return this;
		}

		/**
		 * API name: {@code categorized_doc_count}
		 */
		public Builder categorizedDocCount(Number value) {
			this.categorizedDocCount = value;
			return this;
		}

		/**
		 * API name: {@code dead_category_count}
		 */
		public Builder deadCategoryCount(Number value) {
			this.deadCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code failed_category_count}
		 */
		public Builder failedCategoryCount(Number value) {
			this.failedCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code frequent_category_count}
		 */
		public Builder frequentCategoryCount(Number value) {
			this.frequentCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code rare_category_count}
		 */
		public Builder rareCategoryCount(Number value) {
			this.rareCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code total_category_count}
		 */
		public Builder totalCategoryCount(Number value) {
			this.totalCategoryCount = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(@Nullable Number value) {
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
	public static final JsonpDeserializer<ModelSizeStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ModelSizeStats::setupModelSizeStatsDeserializer);

	protected static void setupModelSizeStatsDeserializer(DelegatingDeserializer<ModelSizeStats.Builder> op) {

		op.add(Builder::bucketAllocationFailuresCount, JsonpDeserializer.numberDeserializer(),
				"bucket_allocation_failures_count");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::logTime, JsonpDeserializer.jsonValueDeserializer(), "log_time");
		op.add(Builder::memoryStatus, MemoryStatus.DESERIALIZER, "memory_status");
		op.add(Builder::modelBytes, JsonpDeserializer.numberDeserializer(), "model_bytes");
		op.add(Builder::modelBytesExceeded, JsonpDeserializer.numberDeserializer(), "model_bytes_exceeded");
		op.add(Builder::modelBytesMemoryLimit, JsonpDeserializer.numberDeserializer(), "model_bytes_memory_limit");
		op.add(Builder::peakModelBytes, JsonpDeserializer.numberDeserializer(), "peak_model_bytes");
		op.add(Builder::assignmentMemoryBasis, JsonpDeserializer.stringDeserializer(), "assignment_memory_basis");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::totalByFieldCount, JsonpDeserializer.numberDeserializer(), "total_by_field_count");
		op.add(Builder::totalOverFieldCount, JsonpDeserializer.numberDeserializer(), "total_over_field_count");
		op.add(Builder::totalPartitionFieldCount, JsonpDeserializer.numberDeserializer(),
				"total_partition_field_count");
		op.add(Builder::categorizationStatus, CategorizationStatus.DESERIALIZER, "categorization_status");
		op.add(Builder::categorizedDocCount, JsonpDeserializer.numberDeserializer(), "categorized_doc_count");
		op.add(Builder::deadCategoryCount, JsonpDeserializer.numberDeserializer(), "dead_category_count");
		op.add(Builder::failedCategoryCount, JsonpDeserializer.numberDeserializer(), "failed_category_count");
		op.add(Builder::frequentCategoryCount, JsonpDeserializer.numberDeserializer(), "frequent_category_count");
		op.add(Builder::rareCategoryCount, JsonpDeserializer.numberDeserializer(), "rare_category_count");
		op.add(Builder::totalCategoryCount, JsonpDeserializer.numberDeserializer(), "total_category_count");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");

	}

}
