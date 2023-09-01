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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelDeploymentStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelDeploymentStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelDeploymentStats implements JsonpSerializable {
	private final TrainedModelDeploymentAllocationStatus allocationStatus;

	@Nullable
	private final String cacheSize;

	private final String deploymentId;

	private final int errorCount;

	private final int inferenceCount;

	private final String modelId;

	private final TrainedModelDeploymentNodesStats nodes;

	private final int numberOfAllocations;

	private final int queueCapacity;

	private final int rejectedExecutionCount;

	private final String reason;

	private final long startTime;

	private final DeploymentState state;

	private final int threadsPerAllocation;

	private final int timeoutCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelDeploymentStats(Builder builder) {

		this.allocationStatus = ApiTypeHelper.requireNonNull(builder.allocationStatus, this, "allocationStatus");
		this.cacheSize = builder.cacheSize;
		this.deploymentId = ApiTypeHelper.requireNonNull(builder.deploymentId, this, "deploymentId");
		this.errorCount = ApiTypeHelper.requireNonNull(builder.errorCount, this, "errorCount");
		this.inferenceCount = ApiTypeHelper.requireNonNull(builder.inferenceCount, this, "inferenceCount");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.nodes = ApiTypeHelper.requireNonNull(builder.nodes, this, "nodes");
		this.numberOfAllocations = ApiTypeHelper.requireNonNull(builder.numberOfAllocations, this,
				"numberOfAllocations");
		this.queueCapacity = ApiTypeHelper.requireNonNull(builder.queueCapacity, this, "queueCapacity");
		this.rejectedExecutionCount = ApiTypeHelper.requireNonNull(builder.rejectedExecutionCount, this,
				"rejectedExecutionCount");
		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.threadsPerAllocation = ApiTypeHelper.requireNonNull(builder.threadsPerAllocation, this,
				"threadsPerAllocation");
		this.timeoutCount = ApiTypeHelper.requireNonNull(builder.timeoutCount, this, "timeoutCount");

	}

	public static TrainedModelDeploymentStats of(Function<Builder, ObjectBuilder<TrainedModelDeploymentStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The detailed allocation status for the deployment.
	 * <p>
	 * API name: {@code allocation_status}
	 */
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
	 * Required - The sum of <code>error_count</code> for all nodes in the
	 * deployment.
	 * <p>
	 * API name: {@code error_count}
	 */
	public final int errorCount() {
		return this.errorCount;
	}

	/**
	 * Required - The sum of <code>inference_count</code> for all nodes in the
	 * deployment.
	 * <p>
	 * API name: {@code inference_count}
	 */
	public final int inferenceCount() {
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
	public final TrainedModelDeploymentNodesStats nodes() {
		return this.nodes;
	}

	/**
	 * Required - The number of allocations requested.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	public final int numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * Required - The number of inference requests that can be queued before new
	 * requests are rejected.
	 * <p>
	 * API name: {@code queue_capacity}
	 */
	public final int queueCapacity() {
		return this.queueCapacity;
	}

	/**
	 * Required - The sum of <code>rejected_execution_count</code> for all nodes in
	 * the deployment. Individual nodes reject an inference request if the inference
	 * queue is full. The queue size is controlled by the
	 * <code>queue_capacity</code> setting in the start trained model deployment
	 * API.
	 * <p>
	 * API name: {@code rejected_execution_count}
	 */
	public final int rejectedExecutionCount() {
		return this.rejectedExecutionCount;
	}

	/**
	 * Required - The reason for the current deployment state. Usually only
	 * populated when the model is not deployed to a node.
	 * <p>
	 * API name: {@code reason}
	 */
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
	 * Required - The overall state of the deployment.
	 * <p>
	 * API name: {@code state}
	 */
	public final DeploymentState state() {
		return this.state;
	}

	/**
	 * Required - The number of threads used be each allocation during inference.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	public final int threadsPerAllocation() {
		return this.threadsPerAllocation;
	}

	/**
	 * Required - The sum of <code>timeout_count</code> for all nodes in the
	 * deployment.
	 * <p>
	 * API name: {@code timeout_count}
	 */
	public final int timeoutCount() {
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

		generator.writeKey("allocation_status");
		this.allocationStatus.serialize(generator, mapper);

		if (this.cacheSize != null) {
			generator.writeKey("cache_size");
			generator.write(this.cacheSize);

		}
		generator.writeKey("deployment_id");
		generator.write(this.deploymentId);

		generator.writeKey("error_count");
		generator.write(this.errorCount);

		generator.writeKey("inference_count");
		generator.write(this.inferenceCount);

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("nodes");
		this.nodes.serialize(generator, mapper);

		generator.writeKey("number_of_allocations");
		generator.write(this.numberOfAllocations);

		generator.writeKey("queue_capacity");
		generator.write(this.queueCapacity);

		generator.writeKey("rejected_execution_count");
		generator.write(this.rejectedExecutionCount);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("start_time");
		generator.write(this.startTime);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("threads_per_allocation");
		generator.write(this.threadsPerAllocation);

		generator.writeKey("timeout_count");
		generator.write(this.timeoutCount);

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
		private TrainedModelDeploymentAllocationStatus allocationStatus;

		@Nullable
		private String cacheSize;

		private String deploymentId;

		private Integer errorCount;

		private Integer inferenceCount;

		private String modelId;

		private TrainedModelDeploymentNodesStats nodes;

		private Integer numberOfAllocations;

		private Integer queueCapacity;

		private Integer rejectedExecutionCount;

		private String reason;

		private Long startTime;

		private DeploymentState state;

		private Integer threadsPerAllocation;

		private Integer timeoutCount;

		/**
		 * Required - The detailed allocation status for the deployment.
		 * <p>
		 * API name: {@code allocation_status}
		 */
		public final Builder allocationStatus(TrainedModelDeploymentAllocationStatus value) {
			this.allocationStatus = value;
			return this;
		}

		/**
		 * Required - The detailed allocation status for the deployment.
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
		 * Required - The sum of <code>error_count</code> for all nodes in the
		 * deployment.
		 * <p>
		 * API name: {@code error_count}
		 */
		public final Builder errorCount(int value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * Required - The sum of <code>inference_count</code> for all nodes in the
		 * deployment.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public final Builder inferenceCount(int value) {
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
		 */
		public final Builder nodes(TrainedModelDeploymentNodesStats value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Required - The deployment stats for each node that currently has the model
		 * allocated. In serverless, stats are reported for a single unnamed virtual
		 * node.
		 * <p>
		 * API name: {@code nodes}
		 */
		public final Builder nodes(
				Function<TrainedModelDeploymentNodesStats.Builder, ObjectBuilder<TrainedModelDeploymentNodesStats>> fn) {
			return this.nodes(fn.apply(new TrainedModelDeploymentNodesStats.Builder()).build());
		}

		/**
		 * Required - The number of allocations requested.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(int value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * Required - The number of inference requests that can be queued before new
		 * requests are rejected.
		 * <p>
		 * API name: {@code queue_capacity}
		 */
		public final Builder queueCapacity(int value) {
			this.queueCapacity = value;
			return this;
		}

		/**
		 * Required - The sum of <code>rejected_execution_count</code> for all nodes in
		 * the deployment. Individual nodes reject an inference request if the inference
		 * queue is full. The queue size is controlled by the
		 * <code>queue_capacity</code> setting in the start trained model deployment
		 * API.
		 * <p>
		 * API name: {@code rejected_execution_count}
		 */
		public final Builder rejectedExecutionCount(int value) {
			this.rejectedExecutionCount = value;
			return this;
		}

		/**
		 * Required - The reason for the current deployment state. Usually only
		 * populated when the model is not deployed to a node.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(String value) {
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
		 * Required - The overall state of the deployment.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(DeploymentState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - The number of threads used be each allocation during inference.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(int value) {
			this.threadsPerAllocation = value;
			return this;
		}

		/**
		 * Required - The sum of <code>timeout_count</code> for all nodes in the
		 * deployment.
		 * <p>
		 * API name: {@code timeout_count}
		 */
		public final Builder timeoutCount(int value) {
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

		op.add(Builder::allocationStatus, TrainedModelDeploymentAllocationStatus._DESERIALIZER, "allocation_status");
		op.add(Builder::cacheSize, JsonpDeserializer.stringDeserializer(), "cache_size");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.integerDeserializer(), "inference_count");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::nodes, TrainedModelDeploymentNodesStats._DESERIALIZER, "nodes");
		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");
		op.add(Builder::queueCapacity, JsonpDeserializer.integerDeserializer(), "queue_capacity");
		op.add(Builder::rejectedExecutionCount, JsonpDeserializer.integerDeserializer(), "rejected_execution_count");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::startTime, JsonpDeserializer.longDeserializer(), "start_time");
		op.add(Builder::state, DeploymentState._DESERIALIZER, "state");
		op.add(Builder::threadsPerAllocation, JsonpDeserializer.integerDeserializer(), "threads_per_allocation");
		op.add(Builder::timeoutCount, JsonpDeserializer.integerDeserializer(), "timeout_count");

	}

}
