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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelDeploymentNodesStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelDeploymentNodesStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelDeploymentNodesStats implements JsonpSerializable {
	private final double averageInferenceTimeMs;

	private final int errorCount;

	private final int inferenceCount;

	private final long lastAccess;

	private final int numberOfAllocations;

	private final int numberOfPendingRequests;

	private final int rejectionExecutionCount;

	private final TrainedModelAssignmentRoutingTable routingState;

	private final long startTime;

	private final int threadsPerAllocation;

	private final int timeoutCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelDeploymentNodesStats(Builder builder) {

		this.averageInferenceTimeMs = ApiTypeHelper.requireNonNull(builder.averageInferenceTimeMs, this,
				"averageInferenceTimeMs");
		this.errorCount = ApiTypeHelper.requireNonNull(builder.errorCount, this, "errorCount");
		this.inferenceCount = ApiTypeHelper.requireNonNull(builder.inferenceCount, this, "inferenceCount");
		this.lastAccess = ApiTypeHelper.requireNonNull(builder.lastAccess, this, "lastAccess");
		this.numberOfAllocations = ApiTypeHelper.requireNonNull(builder.numberOfAllocations, this,
				"numberOfAllocations");
		this.numberOfPendingRequests = ApiTypeHelper.requireNonNull(builder.numberOfPendingRequests, this,
				"numberOfPendingRequests");
		this.rejectionExecutionCount = ApiTypeHelper.requireNonNull(builder.rejectionExecutionCount, this,
				"rejectionExecutionCount");
		this.routingState = ApiTypeHelper.requireNonNull(builder.routingState, this, "routingState");
		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.threadsPerAllocation = ApiTypeHelper.requireNonNull(builder.threadsPerAllocation, this,
				"threadsPerAllocation");
		this.timeoutCount = ApiTypeHelper.requireNonNull(builder.timeoutCount, this, "timeoutCount");

	}

	public static TrainedModelDeploymentNodesStats of(
			Function<Builder, ObjectBuilder<TrainedModelDeploymentNodesStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The average time for each inference call to complete on this node.
	 * <p>
	 * API name: {@code average_inference_time_ms}
	 */
	public final double averageInferenceTimeMs() {
		return this.averageInferenceTimeMs;
	}

	/**
	 * Required - The number of errors when evaluating the trained model.
	 * <p>
	 * API name: {@code error_count}
	 */
	public final int errorCount() {
		return this.errorCount;
	}

	/**
	 * Required - The total number of inference calls made against this node for
	 * this model.
	 * <p>
	 * API name: {@code inference_count}
	 */
	public final int inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * Required - The epoch time stamp of the last inference call for the model on
	 * this node.
	 * <p>
	 * API name: {@code last_access}
	 */
	public final long lastAccess() {
		return this.lastAccess;
	}

	/**
	 * Required - The number of allocations assigned to this node.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	public final int numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * Required - The number of inference requests queued to be processed.
	 * <p>
	 * API name: {@code number_of_pending_requests}
	 */
	public final int numberOfPendingRequests() {
		return this.numberOfPendingRequests;
	}

	/**
	 * Required - The number of inference requests that were not processed because
	 * the queue was full.
	 * <p>
	 * API name: {@code rejection_execution_count}
	 */
	public final int rejectionExecutionCount() {
		return this.rejectionExecutionCount;
	}

	/**
	 * Required - The current routing state and reason for the current routing state
	 * for this allocation.
	 * <p>
	 * API name: {@code routing_state}
	 */
	public final TrainedModelAssignmentRoutingTable routingState() {
		return this.routingState;
	}

	/**
	 * Required - The epoch timestamp when the allocation started.
	 * <p>
	 * API name: {@code start_time}
	 */
	public final long startTime() {
		return this.startTime;
	}

	/**
	 * Required - The number of threads used by each allocation during inference.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	public final int threadsPerAllocation() {
		return this.threadsPerAllocation;
	}

	/**
	 * Required - The number of inference requests that timed out before being
	 * processed.
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

		generator.writeKey("average_inference_time_ms");
		generator.write(this.averageInferenceTimeMs);

		generator.writeKey("error_count");
		generator.write(this.errorCount);

		generator.writeKey("inference_count");
		generator.write(this.inferenceCount);

		generator.writeKey("last_access");
		generator.write(this.lastAccess);

		generator.writeKey("number_of_allocations");
		generator.write(this.numberOfAllocations);

		generator.writeKey("number_of_pending_requests");
		generator.write(this.numberOfPendingRequests);

		generator.writeKey("rejection_execution_count");
		generator.write(this.rejectionExecutionCount);

		generator.writeKey("routing_state");
		this.routingState.serialize(generator, mapper);

		generator.writeKey("start_time");
		generator.write(this.startTime);

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
	 * Builder for {@link TrainedModelDeploymentNodesStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelDeploymentNodesStats> {
		private Double averageInferenceTimeMs;

		private Integer errorCount;

		private Integer inferenceCount;

		private Long lastAccess;

		private Integer numberOfAllocations;

		private Integer numberOfPendingRequests;

		private Integer rejectionExecutionCount;

		private TrainedModelAssignmentRoutingTable routingState;

		private Long startTime;

		private Integer threadsPerAllocation;

		private Integer timeoutCount;

		/**
		 * Required - The average time for each inference call to complete on this node.
		 * <p>
		 * API name: {@code average_inference_time_ms}
		 */
		public final Builder averageInferenceTimeMs(double value) {
			this.averageInferenceTimeMs = value;
			return this;
		}

		/**
		 * Required - The number of errors when evaluating the trained model.
		 * <p>
		 * API name: {@code error_count}
		 */
		public final Builder errorCount(int value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * Required - The total number of inference calls made against this node for
		 * this model.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public final Builder inferenceCount(int value) {
			this.inferenceCount = value;
			return this;
		}

		/**
		 * Required - The epoch time stamp of the last inference call for the model on
		 * this node.
		 * <p>
		 * API name: {@code last_access}
		 */
		public final Builder lastAccess(long value) {
			this.lastAccess = value;
			return this;
		}

		/**
		 * Required - The number of allocations assigned to this node.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(int value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * Required - The number of inference requests queued to be processed.
		 * <p>
		 * API name: {@code number_of_pending_requests}
		 */
		public final Builder numberOfPendingRequests(int value) {
			this.numberOfPendingRequests = value;
			return this;
		}

		/**
		 * Required - The number of inference requests that were not processed because
		 * the queue was full.
		 * <p>
		 * API name: {@code rejection_execution_count}
		 */
		public final Builder rejectionExecutionCount(int value) {
			this.rejectionExecutionCount = value;
			return this;
		}

		/**
		 * Required - The current routing state and reason for the current routing state
		 * for this allocation.
		 * <p>
		 * API name: {@code routing_state}
		 */
		public final Builder routingState(TrainedModelAssignmentRoutingTable value) {
			this.routingState = value;
			return this;
		}

		/**
		 * Required - The current routing state and reason for the current routing state
		 * for this allocation.
		 * <p>
		 * API name: {@code routing_state}
		 */
		public final Builder routingState(
				Function<TrainedModelAssignmentRoutingTable.Builder, ObjectBuilder<TrainedModelAssignmentRoutingTable>> fn) {
			return this.routingState(fn.apply(new TrainedModelAssignmentRoutingTable.Builder()).build());
		}

		/**
		 * Required - The epoch timestamp when the allocation started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(long value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Required - The number of threads used by each allocation during inference.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(int value) {
			this.threadsPerAllocation = value;
			return this;
		}

		/**
		 * Required - The number of inference requests that timed out before being
		 * processed.
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
		 * Builds a {@link TrainedModelDeploymentNodesStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelDeploymentNodesStats build() {
			_checkSingleUse();

			return new TrainedModelDeploymentNodesStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelDeploymentNodesStats}
	 */
	public static final JsonpDeserializer<TrainedModelDeploymentNodesStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelDeploymentNodesStats::setupTrainedModelDeploymentNodesStatsDeserializer);

	protected static void setupTrainedModelDeploymentNodesStatsDeserializer(
			ObjectDeserializer<TrainedModelDeploymentNodesStats.Builder> op) {

		op.add(Builder::averageInferenceTimeMs, JsonpDeserializer.doubleDeserializer(), "average_inference_time_ms");
		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.integerDeserializer(), "inference_count");
		op.add(Builder::lastAccess, JsonpDeserializer.longDeserializer(), "last_access");
		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");
		op.add(Builder::numberOfPendingRequests, JsonpDeserializer.integerDeserializer(), "number_of_pending_requests");
		op.add(Builder::rejectionExecutionCount, JsonpDeserializer.integerDeserializer(), "rejection_execution_count");
		op.add(Builder::routingState, TrainedModelAssignmentRoutingTable._DESERIALIZER, "routing_state");
		op.add(Builder::startTime, JsonpDeserializer.longDeserializer(), "start_time");
		op.add(Builder::threadsPerAllocation, JsonpDeserializer.integerDeserializer(), "threads_per_allocation");
		op.add(Builder::timeoutCount, JsonpDeserializer.integerDeserializer(), "timeout_count");

	}

}
