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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: ml._types.TrainedModelDeploymentStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelDeploymentStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelDeploymentStats implements JsonpSerializable {
	@Nullable
	private final AdaptiveAllocationsSettings adaptiveAllocations;

	@Nullable
	private final TrainedModelDeploymentAllocationStatus allocationStatus;

	@Nullable
	private final String cacheSize;

	private final String deploymentId;

	@Nullable
	private final Integer errorCount;

	@Nullable
	private final Integer inferenceCount;

	private final String modelId;

	private final List<TrainedModelDeploymentNodesStats> nodes;

	@Nullable
	private final Integer numberOfAllocations;

	private final long peakThroughputPerMinute;

	private final TrainingPriority priority;

	@Nullable
	private final Integer queueCapacity;

	@Nullable
	private final Integer rejectedExecutionCount;

	@Nullable
	private final String reason;

	private final long startTime;

	@Nullable
	private final DeploymentAssignmentState state;

	@Nullable
	private final Integer threadsPerAllocation;

	@Nullable
	private final Integer timeoutCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelDeploymentStats(Builder builder) {

		this.adaptiveAllocations = builder.adaptiveAllocations;
		this.allocationStatus = builder.allocationStatus;
		this.cacheSize = builder.cacheSize;
		this.deploymentId = ApiTypeHelper.requireNonNullWithDefault(builder.deploymentId, this, "deploymentId",
				this.deploymentId());
		this.errorCount = builder.errorCount;
		this.inferenceCount = builder.inferenceCount;
		this.modelId = ApiTypeHelper.requireNonNullWithDefault(builder.modelId, this, "modelId", this.modelId());
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");
		this.numberOfAllocations = builder.numberOfAllocations;
		this.peakThroughputPerMinute = ApiTypeHelper.requireNonNullWithDefault(builder.peakThroughputPerMinute, this,
				"peakThroughputPerMinute", this.peakThroughputPerMinute());
		this.priority = ApiTypeHelper.requireNonNullWithDefault(builder.priority, this, "priority", this.priority());
		this.queueCapacity = builder.queueCapacity;
		this.rejectedExecutionCount = builder.rejectedExecutionCount;
		this.reason = builder.reason;
		this.startTime = ApiTypeHelper.requireNonNullWithDefault(builder.startTime, this, "startTime",
				this.startTime());
		this.state = builder.state;
		this.threadsPerAllocation = builder.threadsPerAllocation;
		this.timeoutCount = builder.timeoutCount;

	}

	public static TrainedModelDeploymentStats of(Function<Builder, ObjectBuilder<TrainedModelDeploymentStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code adaptive_allocations}
	 */
	@Nullable
	public final AdaptiveAllocationsSettings adaptiveAllocations() {
		return this.adaptiveAllocations;
	}

	/**
	 * The detailed allocation status for the deployment.
	 * <p>
	 * API name: {@code allocation_status}
	 */
	@Nullable
	public final TrainedModelDeploymentAllocationStatus allocationStatus() {
		return this.allocationStatus;
	}

	/**
	 * API name: {@code cache_size}
	 */
	@Nullable
	public final String cacheSize() {
		return this.cacheSize;
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
	 * The sum of <code>error_count</code> for all nodes in the deployment.
	 * <p>
	 * API name: {@code error_count}
	 */
	@Nullable
	public final Integer errorCount() {
		return this.errorCount;
	}

	/**
	 * The sum of <code>inference_count</code> for all nodes in the deployment.
	 * <p>
	 * API name: {@code inference_count}
	 */
	@Nullable
	public final Integer inferenceCount() {
		return this.inferenceCount;
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
	 * Required - The deployment stats for each node that currently has the model
	 * allocated. In serverless, stats are reported for a single unnamed virtual
	 * node.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final List<TrainedModelDeploymentNodesStats> nodes() {
		return this.nodes;
	}

	/**
	 * The number of allocations requested.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	@Nullable
	public final Integer numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * Required - API name: {@code peak_throughput_per_minute}
	 */
	public final long peakThroughputPerMinute() {
		return this.peakThroughputPerMinute;
	}

	/**
	 * Required - API name: {@code priority}
	 */
	public final TrainingPriority priority() {
		return this.priority;
	}

	/**
	 * The number of inference requests that can be queued before new requests are
	 * rejected.
	 * <p>
	 * API name: {@code queue_capacity}
	 */
	@Nullable
	public final Integer queueCapacity() {
		return this.queueCapacity;
	}

	/**
	 * The sum of <code>rejected_execution_count</code> for all nodes in the
	 * deployment. Individual nodes reject an inference request if the inference
	 * queue is full. The queue size is controlled by the
	 * <code>queue_capacity</code> setting in the start trained model deployment
	 * API.
	 * <p>
	 * API name: {@code rejected_execution_count}
	 */
	@Nullable
	public final Integer rejectedExecutionCount() {
		return this.rejectedExecutionCount;
	}

	/**
	 * The reason for the current deployment state. Usually only populated when the
	 * model is not deployed to a node.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - The epoch timestamp when the deployment started.
	 * <p>
	 * API name: {@code start_time}
	 */
	public final long startTime() {
		return this.startTime;
	}

	/**
	 * The overall state of the deployment.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final DeploymentAssignmentState state() {
		return this.state;
	}

	/**
	 * The number of threads used be each allocation during inference.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	@Nullable
	public final Integer threadsPerAllocation() {
		return this.threadsPerAllocation;
	}

	/**
	 * The sum of <code>timeout_count</code> for all nodes in the deployment.
	 * <p>
	 * API name: {@code timeout_count}
	 */
	@Nullable
	public final Integer timeoutCount() {
		return this.timeoutCount;
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

		if (this.adaptiveAllocations != null) {
			generator.writeKey("adaptive_allocations");
			this.adaptiveAllocations.serialize(generator, mapper);

		}
		if (this.allocationStatus != null) {
			generator.writeKey("allocation_status");
			this.allocationStatus.serialize(generator, mapper);

		}
		if (this.cacheSize != null) {
			generator.writeKey("cache_size");
			generator.write(this.cacheSize);

		}
		generator.writeKey("deployment_id");
		generator.write(this.deploymentId);

		if (this.errorCount != null) {
			generator.writeKey("error_count");
			generator.write(this.errorCount);

		}
		if (this.inferenceCount != null) {
			generator.writeKey("inference_count");
			generator.write(this.inferenceCount);

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartArray();
			for (TrainedModelDeploymentNodesStats item0 : this.nodes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.numberOfAllocations != null) {
			generator.writeKey("number_of_allocations");
			generator.write(this.numberOfAllocations);

		}
		generator.writeKey("peak_throughput_per_minute");
		generator.write(this.peakThroughputPerMinute);

		generator.writeKey("priority");
		this.priority.serialize(generator, mapper);
		if (this.queueCapacity != null) {
			generator.writeKey("queue_capacity");
			generator.write(this.queueCapacity);

		}
		if (this.rejectedExecutionCount != null) {
			generator.writeKey("rejected_execution_count");
			generator.write(this.rejectedExecutionCount);

		}
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		generator.writeKey("start_time");
		generator.write(this.startTime);

		if (this.state != null) {
			generator.writeKey("state");
			this.state.serialize(generator, mapper);
		}
		if (this.threadsPerAllocation != null) {
			generator.writeKey("threads_per_allocation");
			generator.write(this.threadsPerAllocation);

		}
		if (this.timeoutCount != null) {
			generator.writeKey("timeout_count");
			generator.write(this.timeoutCount);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelDeploymentStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelDeploymentStats> {
		@Nullable
		private AdaptiveAllocationsSettings adaptiveAllocations;

		@Nullable
		private TrainedModelDeploymentAllocationStatus allocationStatus;

		@Nullable
		private String cacheSize;

		private String deploymentId;

		@Nullable
		private Integer errorCount;

		@Nullable
		private Integer inferenceCount;

		private String modelId;

		private List<TrainedModelDeploymentNodesStats> nodes;

		@Nullable
		private Integer numberOfAllocations;

		private Long peakThroughputPerMinute;

		private TrainingPriority priority;

		@Nullable
		private Integer queueCapacity;

		@Nullable
		private Integer rejectedExecutionCount;

		@Nullable
		private String reason;

		private Long startTime;

		@Nullable
		private DeploymentAssignmentState state;

		@Nullable
		private Integer threadsPerAllocation;

		@Nullable
		private Integer timeoutCount;

		/**
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(@Nullable AdaptiveAllocationsSettings value) {
			this.adaptiveAllocations = value;
			return this;
		}

		/**
		 * API name: {@code adaptive_allocations}
		 */
		public final Builder adaptiveAllocations(
				Function<AdaptiveAllocationsSettings.Builder, ObjectBuilder<AdaptiveAllocationsSettings>> fn) {
			return this.adaptiveAllocations(fn.apply(new AdaptiveAllocationsSettings.Builder()).build());
		}

		/**
		 * The detailed allocation status for the deployment.
		 * <p>
		 * API name: {@code allocation_status}
		 */
		public final Builder allocationStatus(@Nullable TrainedModelDeploymentAllocationStatus value) {
			this.allocationStatus = value;
			return this;
		}

		/**
		 * The detailed allocation status for the deployment.
		 * <p>
		 * API name: {@code allocation_status}
		 */
		public final Builder allocationStatus(
				Function<TrainedModelDeploymentAllocationStatus.Builder, ObjectBuilder<TrainedModelDeploymentAllocationStatus>> fn) {
			return this.allocationStatus(fn.apply(new TrainedModelDeploymentAllocationStatus.Builder()).build());
		}

		/**
		 * API name: {@code cache_size}
		 */
		public final Builder cacheSize(@Nullable String value) {
			this.cacheSize = value;
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
		 * The sum of <code>error_count</code> for all nodes in the deployment.
		 * <p>
		 * API name: {@code error_count}
		 */
		public final Builder errorCount(@Nullable Integer value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * The sum of <code>inference_count</code> for all nodes in the deployment.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public final Builder inferenceCount(@Nullable Integer value) {
			this.inferenceCount = value;
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
		 * Required - The deployment stats for each node that currently has the model
		 * allocated. In serverless, stats are reported for a single unnamed virtual
		 * node.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodes</code>.
		 */
		public final Builder nodes(List<TrainedModelDeploymentNodesStats> list) {
			this.nodes = _listAddAll(this.nodes, list);
			return this;
		}

		/**
		 * Required - The deployment stats for each node that currently has the model
		 * allocated. In serverless, stats are reported for a single unnamed virtual
		 * node.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds one or more values to <code>nodes</code>.
		 */
		public final Builder nodes(TrainedModelDeploymentNodesStats value, TrainedModelDeploymentNodesStats... values) {
			this.nodes = _listAdd(this.nodes, value, values);
			return this;
		}

		/**
		 * Required - The deployment stats for each node that currently has the model
		 * allocated. In serverless, stats are reported for a single unnamed virtual
		 * node.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds a value to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(
				Function<TrainedModelDeploymentNodesStats.Builder, ObjectBuilder<TrainedModelDeploymentNodesStats>> fn) {
			return nodes(fn.apply(new TrainedModelDeploymentNodesStats.Builder()).build());
		}

		/**
		 * The number of allocations requested.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(@Nullable Integer value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * Required - API name: {@code peak_throughput_per_minute}
		 */
		public final Builder peakThroughputPerMinute(long value) {
			this.peakThroughputPerMinute = value;
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
		 * The number of inference requests that can be queued before new requests are
		 * rejected.
		 * <p>
		 * API name: {@code queue_capacity}
		 */
		public final Builder queueCapacity(@Nullable Integer value) {
			this.queueCapacity = value;
			return this;
		}

		/**
		 * The sum of <code>rejected_execution_count</code> for all nodes in the
		 * deployment. Individual nodes reject an inference request if the inference
		 * queue is full. The queue size is controlled by the
		 * <code>queue_capacity</code> setting in the start trained model deployment
		 * API.
		 * <p>
		 * API name: {@code rejected_execution_count}
		 */
		public final Builder rejectedExecutionCount(@Nullable Integer value) {
			this.rejectedExecutionCount = value;
			return this;
		}

		/**
		 * The reason for the current deployment state. Usually only populated when the
		 * model is not deployed to a node.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - The epoch timestamp when the deployment started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(long value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The overall state of the deployment.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable DeploymentAssignmentState value) {
			this.state = value;
			return this;
		}

		/**
		 * The number of threads used be each allocation during inference.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(@Nullable Integer value) {
			this.threadsPerAllocation = value;
			return this;
		}

		/**
		 * The sum of <code>timeout_count</code> for all nodes in the deployment.
		 * <p>
		 * API name: {@code timeout_count}
		 */
		public final Builder timeoutCount(@Nullable Integer value) {
			this.timeoutCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelDeploymentStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelDeploymentStats build() {
			_checkSingleUse();

			return new TrainedModelDeploymentStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelDeploymentStats}
	 */
	public static final JsonpDeserializer<TrainedModelDeploymentStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelDeploymentStats::setupTrainedModelDeploymentStatsDeserializer);

	protected static void setupTrainedModelDeploymentStatsDeserializer(
			ObjectDeserializer<TrainedModelDeploymentStats.Builder> op) {

		op.add(Builder::adaptiveAllocations, AdaptiveAllocationsSettings._DESERIALIZER, "adaptive_allocations");
		op.add(Builder::allocationStatus, TrainedModelDeploymentAllocationStatus._DESERIALIZER, "allocation_status");
		op.add(Builder::cacheSize, JsonpDeserializer.stringDeserializer(), "cache_size");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.integerDeserializer(), "inference_count");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(TrainedModelDeploymentNodesStats._DESERIALIZER),
				"nodes");
		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");
		op.add(Builder::peakThroughputPerMinute, JsonpDeserializer.longDeserializer(), "peak_throughput_per_minute");
		op.add(Builder::priority, TrainingPriority._DESERIALIZER, "priority");
		op.add(Builder::queueCapacity, JsonpDeserializer.integerDeserializer(), "queue_capacity");
		op.add(Builder::rejectedExecutionCount, JsonpDeserializer.integerDeserializer(), "rejected_execution_count");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::startTime, JsonpDeserializer.longDeserializer(), "start_time");
		op.add(Builder::state, DeploymentAssignmentState._DESERIALIZER, "state");
		op.add(Builder::threadsPerAllocation, JsonpDeserializer.integerDeserializer(), "threads_per_allocation");
		op.add(Builder::timeoutCount, JsonpDeserializer.integerDeserializer(), "timeout_count");

	}

}
