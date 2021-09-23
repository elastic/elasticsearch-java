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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.JobStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlInferenceTrainedModels
public final class MlInferenceTrainedModels implements JsonpSerializable {
	@Nullable
	private final JobStatistics estimatedOperations;

	@Nullable
	private final JobStatistics estimatedHeapMemoryUsageBytes;

	@Nullable
	private final MlInferenceTrainedModelsCount count;

	private final MlCounter all;

	// ---------------------------------------------------------------------------------------------

	public MlInferenceTrainedModels(Builder builder) {

		this.estimatedOperations = builder.estimatedOperations;
		this.estimatedHeapMemoryUsageBytes = builder.estimatedHeapMemoryUsageBytes;
		this.count = builder.count;
		this.all = Objects.requireNonNull(builder.all, "_all");

	}

	/**
	 * API name: {@code estimated_operations}
	 */
	@Nullable
	public JobStatistics estimatedOperations() {
		return this.estimatedOperations;
	}

	/**
	 * API name: {@code estimated_heap_memory_usage_bytes}
	 */
	@Nullable
	public JobStatistics estimatedHeapMemoryUsageBytes() {
		return this.estimatedHeapMemoryUsageBytes;
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public MlInferenceTrainedModelsCount count() {
		return this.count;
	}

	/**
	 * API name: {@code _all}
	 */
	public MlCounter all() {
		return this.all;
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

		if (this.estimatedOperations != null) {

			generator.writeKey("estimated_operations");
			this.estimatedOperations.serialize(generator, mapper);

		}
		if (this.estimatedHeapMemoryUsageBytes != null) {

			generator.writeKey("estimated_heap_memory_usage_bytes");
			this.estimatedHeapMemoryUsageBytes.serialize(generator, mapper);

		}
		if (this.count != null) {

			generator.writeKey("count");
			this.count.serialize(generator, mapper);

		}

		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceTrainedModels}.
	 */
	public static class Builder implements ObjectBuilder<MlInferenceTrainedModels> {
		@Nullable
		private JobStatistics estimatedOperations;

		@Nullable
		private JobStatistics estimatedHeapMemoryUsageBytes;

		@Nullable
		private MlInferenceTrainedModelsCount count;

		private MlCounter all;

		/**
		 * API name: {@code estimated_operations}
		 */
		public Builder estimatedOperations(@Nullable JobStatistics value) {
			this.estimatedOperations = value;
			return this;
		}

		/**
		 * API name: {@code estimated_operations}
		 */
		public Builder estimatedOperations(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.estimatedOperations(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public Builder estimatedHeapMemoryUsageBytes(@Nullable JobStatistics value) {
			this.estimatedHeapMemoryUsageBytes = value;
			return this;
		}

		/**
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public Builder estimatedHeapMemoryUsageBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.estimatedHeapMemoryUsageBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(@Nullable MlInferenceTrainedModelsCount value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(
				Function<MlInferenceTrainedModelsCount.Builder, ObjectBuilder<MlInferenceTrainedModelsCount>> fn) {
			return this.count(fn.apply(new MlInferenceTrainedModelsCount.Builder()).build());
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder all(MlCounter value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder all(Function<MlCounter.Builder, ObjectBuilder<MlCounter>> fn) {
			return this.all(fn.apply(new MlCounter.Builder()).build());
		}

		/**
		 * Builds a {@link MlInferenceTrainedModels}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceTrainedModels build() {

			return new MlInferenceTrainedModels(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceTrainedModels}
	 */
	public static final JsonpDeserializer<MlInferenceTrainedModels> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MlInferenceTrainedModels::setupMlInferenceTrainedModelsDeserializer);

	protected static void setupMlInferenceTrainedModelsDeserializer(
			DelegatingDeserializer<MlInferenceTrainedModels.Builder> op) {

		op.add(Builder::estimatedOperations, JobStatistics.DESERIALIZER, "estimated_operations");
		op.add(Builder::estimatedHeapMemoryUsageBytes, JobStatistics.DESERIALIZER, "estimated_heap_memory_usage_bytes");
		op.add(Builder::count, MlInferenceTrainedModelsCount.DESERIALIZER, "count");
		op.add(Builder::all, MlCounter.DESERIALIZER, "_all");

	}

}
