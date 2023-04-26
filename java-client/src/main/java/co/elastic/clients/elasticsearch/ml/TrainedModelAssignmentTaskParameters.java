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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelAssignmentTaskParameters

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAssignmentTaskParameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAssignmentTaskParameters implements JsonpSerializable {
	private final int modelBytes;

	private final String modelId;

	private final String deploymentId;

	private final String cacheSize;

	private final int numberOfAllocations;

	private final TrainingPriority priority;

	private final int queueCapacity;

	private final int threadsPerAllocation;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAssignmentTaskParameters(Builder builder) {

		this.modelBytes = ApiTypeHelper.requireNonNull(builder.modelBytes, this, "modelBytes");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.deploymentId = ApiTypeHelper.requireNonNull(builder.deploymentId, this, "deploymentId");
		this.cacheSize = ApiTypeHelper.requireNonNull(builder.cacheSize, this, "cacheSize");
		this.numberOfAllocations = ApiTypeHelper.requireNonNull(builder.numberOfAllocations, this,
				"numberOfAllocations");
		this.priority = ApiTypeHelper.requireNonNull(builder.priority, this, "priority");
		this.queueCapacity = ApiTypeHelper.requireNonNull(builder.queueCapacity, this, "queueCapacity");
		this.threadsPerAllocation = ApiTypeHelper.requireNonNull(builder.threadsPerAllocation, this,
				"threadsPerAllocation");

	}

	public static TrainedModelAssignmentTaskParameters of(
			Function<Builder, ObjectBuilder<TrainedModelAssignmentTaskParameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The size of the trained model in bytes.
	 * <p>
	 * API name: {@code model_bytes}
	 */
	public final int modelBytes() {
		return this.modelBytes;
	}

	/**
	 * Required - The unique identifier for the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The unique identifier for the trained model deployment.
	 * <p>
	 * API name: {@code deployment_id}
	 */
	public final String deploymentId() {
		return this.deploymentId;
	}

	/**
	 * Required - The size of the trained model cache.
	 * <p>
	 * API name: {@code cache_size}
	 */
	public final String cacheSize() {
		return this.cacheSize;
	}

	/**
	 * Required - The total number of allocations this model is assigned across ML
	 * nodes.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	public final int numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * Required - API name: {@code priority}
	 */
	public final TrainingPriority priority() {
		return this.priority;
	}

	/**
	 * Required - Number of inference requests are allowed in the queue at a time.
	 * <p>
	 * API name: {@code queue_capacity}
	 */
	public final int queueCapacity() {
		return this.queueCapacity;
	}

	/**
	 * Required - Number of threads per allocation.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	public final int threadsPerAllocation() {
		return this.threadsPerAllocation;
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

		generator.writeKey("model_bytes");
		generator.write(this.modelBytes);

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("deployment_id");
		generator.write(this.deploymentId);

		generator.writeKey("cache_size");
		generator.write(this.cacheSize);

		generator.writeKey("number_of_allocations");
		generator.write(this.numberOfAllocations);

		generator.writeKey("priority");
		this.priority.serialize(generator, mapper);
		generator.writeKey("queue_capacity");
		generator.write(this.queueCapacity);

		generator.writeKey("threads_per_allocation");
		generator.write(this.threadsPerAllocation);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelAssignmentTaskParameters}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAssignmentTaskParameters> {
		private Integer modelBytes;

		private String modelId;

		private String deploymentId;

		private String cacheSize;

		private Integer numberOfAllocations;

		private TrainingPriority priority;

		private Integer queueCapacity;

		private Integer threadsPerAllocation;

		/**
		 * Required - The size of the trained model in bytes.
		 * <p>
		 * API name: {@code model_bytes}
		 */
		public final Builder modelBytes(int value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * Required - The unique identifier for the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The unique identifier for the trained model deployment.
		 * <p>
		 * API name: {@code deployment_id}
		 */
		public final Builder deploymentId(String value) {
			this.deploymentId = value;
			return this;
		}

		/**
		 * Required - The size of the trained model cache.
		 * <p>
		 * API name: {@code cache_size}
		 */
		public final Builder cacheSize(String value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * Required - The total number of allocations this model is assigned across ML
		 * nodes.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(int value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * Required - API name: {@code priority}
		 */
		public final Builder priority(TrainingPriority value) {
			this.priority = value;
			return this;
		}

		/**
		 * Required - Number of inference requests are allowed in the queue at a time.
		 * <p>
		 * API name: {@code queue_capacity}
		 */
		public final Builder queueCapacity(int value) {
			this.queueCapacity = value;
			return this;
		}

		/**
		 * Required - Number of threads per allocation.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(int value) {
			this.threadsPerAllocation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAssignmentTaskParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAssignmentTaskParameters build() {
			_checkSingleUse();

			return new TrainedModelAssignmentTaskParameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAssignmentTaskParameters}
	 */
	public static final JsonpDeserializer<TrainedModelAssignmentTaskParameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					TrainedModelAssignmentTaskParameters::setupTrainedModelAssignmentTaskParametersDeserializer);

	protected static void setupTrainedModelAssignmentTaskParametersDeserializer(
			ObjectDeserializer<TrainedModelAssignmentTaskParameters.Builder> op) {

		op.add(Builder::modelBytes, JsonpDeserializer.integerDeserializer(), "model_bytes");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::cacheSize, JsonpDeserializer.stringDeserializer(), "cache_size");
		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");
		op.add(Builder::priority, TrainingPriority._DESERIALIZER, "priority");
		op.add(Builder::queueCapacity, JsonpDeserializer.integerDeserializer(), "queue_capacity");
		op.add(Builder::threadsPerAllocation, JsonpDeserializer.integerDeserializer(), "threads_per_allocation");

	}

}
