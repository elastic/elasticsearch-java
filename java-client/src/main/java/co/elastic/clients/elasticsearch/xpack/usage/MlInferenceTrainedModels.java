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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.JobStatistics;
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

// typedef: xpack.usage.MlInferenceTrainedModels

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceTrainedModels">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceTrainedModels implements JsonpSerializable {
	@Nullable
	private final JobStatistics estimatedOperations;

	@Nullable
	private final JobStatistics estimatedHeapMemoryUsageBytes;

	@Nullable
	private final MlInferenceTrainedModelsCount count;

	private final MlCounter all;

	@Nullable
	private final JobStatistics modelSizeBytes;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceTrainedModels(Builder builder) {

		this.estimatedOperations = builder.estimatedOperations;
		this.estimatedHeapMemoryUsageBytes = builder.estimatedHeapMemoryUsageBytes;
		this.count = builder.count;
		this.all = ApiTypeHelper.requireNonNull(builder.all, this, "all");
		this.modelSizeBytes = builder.modelSizeBytes;

	}

	public static MlInferenceTrainedModels of(Function<Builder, ObjectBuilder<MlInferenceTrainedModels>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code estimated_operations}
	 */
	@Nullable
	public final JobStatistics estimatedOperations() {
		return this.estimatedOperations;
	}

	/**
	 * API name: {@code estimated_heap_memory_usage_bytes}
	 */
	@Nullable
	public final JobStatistics estimatedHeapMemoryUsageBytes() {
		return this.estimatedHeapMemoryUsageBytes;
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final MlInferenceTrainedModelsCount count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code _all}
	 */
	public final MlCounter all() {
		return this.all;
	}

	/**
	 * API name: {@code model_size_bytes}
	 */
	@Nullable
	public final JobStatistics modelSizeBytes() {
		return this.modelSizeBytes;
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

		if (this.modelSizeBytes != null) {
			generator.writeKey("model_size_bytes");
			this.modelSizeBytes.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceTrainedModels}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceTrainedModels> {
		@Nullable
		private JobStatistics estimatedOperations;

		@Nullable
		private JobStatistics estimatedHeapMemoryUsageBytes;

		@Nullable
		private MlInferenceTrainedModelsCount count;

		private MlCounter all;

		@Nullable
		private JobStatistics modelSizeBytes;

		/**
		 * API name: {@code estimated_operations}
		 */
		public final Builder estimatedOperations(@Nullable JobStatistics value) {
			this.estimatedOperations = value;
			return this;
		}

		/**
		 * API name: {@code estimated_operations}
		 */
		public final Builder estimatedOperations(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.estimatedOperations(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public final Builder estimatedHeapMemoryUsageBytes(@Nullable JobStatistics value) {
			this.estimatedHeapMemoryUsageBytes = value;
			return this;
		}

		/**
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public final Builder estimatedHeapMemoryUsageBytes(
				Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.estimatedHeapMemoryUsageBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable MlInferenceTrainedModelsCount value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public final Builder count(
				Function<MlInferenceTrainedModelsCount.Builder, ObjectBuilder<MlInferenceTrainedModelsCount>> fn) {
			return this.count(fn.apply(new MlInferenceTrainedModelsCount.Builder()).build());
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(MlCounter value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(Function<MlCounter.Builder, ObjectBuilder<MlCounter>> fn) {
			return this.all(fn.apply(new MlCounter.Builder()).build());
		}

		/**
		 * API name: {@code model_size_bytes}
		 */
		public final Builder modelSizeBytes(@Nullable JobStatistics value) {
			this.modelSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code model_size_bytes}
		 */
		public final Builder modelSizeBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.modelSizeBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceTrainedModels}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceTrainedModels build() {
			_checkSingleUse();

			return new MlInferenceTrainedModels(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceTrainedModels}
	 */
	public static final JsonpDeserializer<MlInferenceTrainedModels> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceTrainedModels::setupMlInferenceTrainedModelsDeserializer);

	protected static void setupMlInferenceTrainedModelsDeserializer(
			ObjectDeserializer<MlInferenceTrainedModels.Builder> op) {

		op.add(Builder::estimatedOperations, JobStatistics._DESERIALIZER, "estimated_operations");
		op.add(Builder::estimatedHeapMemoryUsageBytes, JobStatistics._DESERIALIZER,
				"estimated_heap_memory_usage_bytes");
		op.add(Builder::count, MlInferenceTrainedModelsCount._DESERIALIZER, "count");
		op.add(Builder::all, MlCounter._DESERIALIZER, "_all");
		op.add(Builder::modelSizeBytes, JobStatistics._DESERIALIZER, "model_size_bytes");

	}

}
