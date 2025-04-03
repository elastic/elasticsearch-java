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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
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

// typedef: ml._types.TrainedModelDeploymentNodesStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelDeploymentNodesStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelDeploymentNodesStats implements JsonpSerializable {
	@Nullable
	private final Double averageInferenceTimeMs;

	@Nullable
	private final Double averageInferenceTimeMsLastMinute;

	@Nullable
	private final Double averageInferenceTimeMsExcludingCacheHits;

	@Nullable
	private final Integer errorCount;

	@Nullable
	private final Long inferenceCount;

	@Nullable
	private final Long inferenceCacheHitCount;

	@Nullable
	private final Long inferenceCacheHitCountLastMinute;

	@Nullable
	private final Long lastAccess;

	@Nullable
	private final DiscoveryNodeContent node;

	@Nullable
	private final Integer numberOfAllocations;

	@Nullable
	private final Integer numberOfPendingRequests;

	private final long peakThroughputPerMinute;

	@Nullable
	private final Integer rejectionExecutionCount;

	private final TrainedModelAssignmentRoutingTable routingState;

	@Nullable
	private final Long startTime;

	@Nullable
	private final Integer threadsPerAllocation;

	private final int throughputLastMinute;

	@Nullable
	private final Integer timeoutCount;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelDeploymentNodesStats(Builder builder) {

		this.averageInferenceTimeMs = builder.averageInferenceTimeMs;
		this.averageInferenceTimeMsLastMinute = builder.averageInferenceTimeMsLastMinute;
		this.averageInferenceTimeMsExcludingCacheHits = builder.averageInferenceTimeMsExcludingCacheHits;
		this.errorCount = builder.errorCount;
		this.inferenceCount = builder.inferenceCount;
		this.inferenceCacheHitCount = builder.inferenceCacheHitCount;
		this.inferenceCacheHitCountLastMinute = builder.inferenceCacheHitCountLastMinute;
		this.lastAccess = builder.lastAccess;
		this.node = builder.node;
		this.numberOfAllocations = builder.numberOfAllocations;
		this.numberOfPendingRequests = builder.numberOfPendingRequests;
		this.peakThroughputPerMinute = ApiTypeHelper.requireNonNull(builder.peakThroughputPerMinute, this,
				"peakThroughputPerMinute", 0);
		this.rejectionExecutionCount = builder.rejectionExecutionCount;
		this.routingState = ApiTypeHelper.requireNonNull(builder.routingState, this, "routingState");
		this.startTime = builder.startTime;
		this.threadsPerAllocation = builder.threadsPerAllocation;
		this.throughputLastMinute = ApiTypeHelper.requireNonNull(builder.throughputLastMinute, this,
				"throughputLastMinute", 0);
		this.timeoutCount = builder.timeoutCount;

	}

	public static TrainedModelDeploymentNodesStats of(
			Function<Builder, ObjectBuilder<TrainedModelDeploymentNodesStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The average time for each inference call to complete on this node.
	 * <p>
	 * API name: {@code average_inference_time_ms}
	 */
	@Nullable
	public final Double averageInferenceTimeMs() {
		return this.averageInferenceTimeMs;
	}

	/**
	 * API name: {@code average_inference_time_ms_last_minute}
	 */
	@Nullable
	public final Double averageInferenceTimeMsLastMinute() {
		return this.averageInferenceTimeMsLastMinute;
	}

	/**
	 * The average time for each inference call to complete on this node, excluding
	 * cache
	 * <p>
	 * API name: {@code average_inference_time_ms_excluding_cache_hits}
	 */
	@Nullable
	public final Double averageInferenceTimeMsExcludingCacheHits() {
		return this.averageInferenceTimeMsExcludingCacheHits;
	}

	/**
	 * The number of errors when evaluating the trained model.
	 * <p>
	 * API name: {@code error_count}
	 */
	@Nullable
	public final Integer errorCount() {
		return this.errorCount;
	}

	/**
	 * The total number of inference calls made against this node for this model.
	 * <p>
	 * API name: {@code inference_count}
	 */
	@Nullable
	public final Long inferenceCount() {
		return this.inferenceCount;
	}

	/**
	 * API name: {@code inference_cache_hit_count}
	 */
	@Nullable
	public final Long inferenceCacheHitCount() {
		return this.inferenceCacheHitCount;
	}

	/**
	 * API name: {@code inference_cache_hit_count_last_minute}
	 */
	@Nullable
	public final Long inferenceCacheHitCountLastMinute() {
		return this.inferenceCacheHitCountLastMinute;
	}

	/**
	 * The epoch time stamp of the last inference call for the model on this node.
	 * <p>
	 * API name: {@code last_access}
	 */
	@Nullable
	public final Long lastAccess() {
		return this.lastAccess;
	}

	/**
	 * Information pertaining to the node.
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public final DiscoveryNodeContent node() {
		return this.node;
	}

	/**
	 * The number of allocations assigned to this node.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	@Nullable
	public final Integer numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * The number of inference requests queued to be processed.
	 * <p>
	 * API name: {@code number_of_pending_requests}
	 */
	@Nullable
	public final Integer numberOfPendingRequests() {
		return this.numberOfPendingRequests;
	}

	/**
	 * Required - API name: {@code peak_throughput_per_minute}
	 */
	public final long peakThroughputPerMinute() {
		return this.peakThroughputPerMinute;
	}

	/**
	 * The number of inference requests that were not processed because the queue
	 * was full.
	 * <p>
	 * API name: {@code rejection_execution_count}
	 */
	@Nullable
	public final Integer rejectionExecutionCount() {
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
	 * The epoch timestamp when the allocation started.
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public final Long startTime() {
		return this.startTime;
	}

	/**
	 * The number of threads used by each allocation during inference.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	@Nullable
	public final Integer threadsPerAllocation() {
		return this.threadsPerAllocation;
	}

	/**
	 * Required - API name: {@code throughput_last_minute}
	 */
	public final int throughputLastMinute() {
		return this.throughputLastMinute;
	}

	/**
	 * The number of inference requests that timed out before being processed.
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

		if (this.averageInferenceTimeMs != null) {
			generator.writeKey("average_inference_time_ms");
			generator.write(this.averageInferenceTimeMs);

		}
		if (this.averageInferenceTimeMsLastMinute != null) {
			generator.writeKey("average_inference_time_ms_last_minute");
			generator.write(this.averageInferenceTimeMsLastMinute);

		}
		if (this.averageInferenceTimeMsExcludingCacheHits != null) {
			generator.writeKey("average_inference_time_ms_excluding_cache_hits");
			generator.write(this.averageInferenceTimeMsExcludingCacheHits);

		}
		if (this.errorCount != null) {
			generator.writeKey("error_count");
			generator.write(this.errorCount);

		}
		if (this.inferenceCount != null) {
			generator.writeKey("inference_count");
			generator.write(this.inferenceCount);

		}
		if (this.inferenceCacheHitCount != null) {
			generator.writeKey("inference_cache_hit_count");
			generator.write(this.inferenceCacheHitCount);

		}
		if (this.inferenceCacheHitCountLastMinute != null) {
			generator.writeKey("inference_cache_hit_count_last_minute");
			generator.write(this.inferenceCacheHitCountLastMinute);

		}
		if (this.lastAccess != null) {
			generator.writeKey("last_access");
			generator.write(this.lastAccess);

		}
		if (this.node != null) {
			generator.writeKey("node");
			this.node.serialize(generator, mapper);

		}
		if (this.numberOfAllocations != null) {
			generator.writeKey("number_of_allocations");
			generator.write(this.numberOfAllocations);

		}
		if (this.numberOfPendingRequests != null) {
			generator.writeKey("number_of_pending_requests");
			generator.write(this.numberOfPendingRequests);

		}
		generator.writeKey("peak_throughput_per_minute");
		generator.write(this.peakThroughputPerMinute);

		if (this.rejectionExecutionCount != null) {
			generator.writeKey("rejection_execution_count");
			generator.write(this.rejectionExecutionCount);

		}
		generator.writeKey("routing_state");
		this.routingState.serialize(generator, mapper);

		if (this.startTime != null) {
			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.threadsPerAllocation != null) {
			generator.writeKey("threads_per_allocation");
			generator.write(this.threadsPerAllocation);

		}
		generator.writeKey("throughput_last_minute");
		generator.write(this.throughputLastMinute);

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
	 * Builder for {@link TrainedModelDeploymentNodesStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelDeploymentNodesStats> {
		@Nullable
		private Double averageInferenceTimeMs;

		@Nullable
		private Double averageInferenceTimeMsLastMinute;

		@Nullable
		private Double averageInferenceTimeMsExcludingCacheHits;

		@Nullable
		private Integer errorCount;

		@Nullable
		private Long inferenceCount;

		@Nullable
		private Long inferenceCacheHitCount;

		@Nullable
		private Long inferenceCacheHitCountLastMinute;

		@Nullable
		private Long lastAccess;

		@Nullable
		private DiscoveryNodeContent node;

		@Nullable
		private Integer numberOfAllocations;

		@Nullable
		private Integer numberOfPendingRequests;

		private Long peakThroughputPerMinute;

		@Nullable
		private Integer rejectionExecutionCount;

		private TrainedModelAssignmentRoutingTable routingState;

		@Nullable
		private Long startTime;

		@Nullable
		private Integer threadsPerAllocation;

		private Integer throughputLastMinute;

		@Nullable
		private Integer timeoutCount;

		/**
		 * The average time for each inference call to complete on this node.
		 * <p>
		 * API name: {@code average_inference_time_ms}
		 */
		public final Builder averageInferenceTimeMs(@Nullable Double value) {
			this.averageInferenceTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code average_inference_time_ms_last_minute}
		 */
		public final Builder averageInferenceTimeMsLastMinute(@Nullable Double value) {
			this.averageInferenceTimeMsLastMinute = value;
			return this;
		}

		/**
		 * The average time for each inference call to complete on this node, excluding
		 * cache
		 * <p>
		 * API name: {@code average_inference_time_ms_excluding_cache_hits}
		 */
		public final Builder averageInferenceTimeMsExcludingCacheHits(@Nullable Double value) {
			this.averageInferenceTimeMsExcludingCacheHits = value;
			return this;
		}

		/**
		 * The number of errors when evaluating the trained model.
		 * <p>
		 * API name: {@code error_count}
		 */
		public final Builder errorCount(@Nullable Integer value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * The total number of inference calls made against this node for this model.
		 * <p>
		 * API name: {@code inference_count}
		 */
		public final Builder inferenceCount(@Nullable Long value) {
			this.inferenceCount = value;
			return this;
		}

		/**
		 * API name: {@code inference_cache_hit_count}
		 */
		public final Builder inferenceCacheHitCount(@Nullable Long value) {
			this.inferenceCacheHitCount = value;
			return this;
		}

		/**
		 * API name: {@code inference_cache_hit_count_last_minute}
		 */
		public final Builder inferenceCacheHitCountLastMinute(@Nullable Long value) {
			this.inferenceCacheHitCountLastMinute = value;
			return this;
		}

		/**
		 * The epoch time stamp of the last inference call for the model on this node.
		 * <p>
		 * API name: {@code last_access}
		 */
		public final Builder lastAccess(@Nullable Long value) {
			this.lastAccess = value;
			return this;
		}

		/**
		 * Information pertaining to the node.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable DiscoveryNodeContent value) {
			this.node = value;
			return this;
		}

		/**
		 * Information pertaining to the node.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(Function<DiscoveryNodeContent.Builder, ObjectBuilder<DiscoveryNodeContent>> fn) {
			return this.node(fn.apply(new DiscoveryNodeContent.Builder()).build());
		}

		/**
		 * The number of allocations assigned to this node.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(@Nullable Integer value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * The number of inference requests queued to be processed.
		 * <p>
		 * API name: {@code number_of_pending_requests}
		 */
		public final Builder numberOfPendingRequests(@Nullable Integer value) {
			this.numberOfPendingRequests = value;
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
		 * The number of inference requests that were not processed because the queue
		 * was full.
		 * <p>
		 * API name: {@code rejection_execution_count}
		 */
		public final Builder rejectionExecutionCount(@Nullable Integer value) {
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
		 * The epoch timestamp when the allocation started.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable Long value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The number of threads used by each allocation during inference.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(@Nullable Integer value) {
			this.threadsPerAllocation = value;
			return this;
		}

		/**
		 * Required - API name: {@code throughput_last_minute}
		 */
		public final Builder throughputLastMinute(int value) {
			this.throughputLastMinute = value;
			return this;
		}

		/**
		 * The number of inference requests that timed out before being processed.
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
		op.add(Builder::averageInferenceTimeMsLastMinute, JsonpDeserializer.doubleDeserializer(),
				"average_inference_time_ms_last_minute");
		op.add(Builder::averageInferenceTimeMsExcludingCacheHits, JsonpDeserializer.doubleDeserializer(),
				"average_inference_time_ms_excluding_cache_hits");
		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::inferenceCount, JsonpDeserializer.longDeserializer(), "inference_count");
		op.add(Builder::inferenceCacheHitCount, JsonpDeserializer.longDeserializer(), "inference_cache_hit_count");
		op.add(Builder::inferenceCacheHitCountLastMinute, JsonpDeserializer.longDeserializer(),
				"inference_cache_hit_count_last_minute");
		op.add(Builder::lastAccess, JsonpDeserializer.longDeserializer(), "last_access");
		op.add(Builder::node, DiscoveryNodeContent._DESERIALIZER, "node");
		op.add(Builder::numberOfAllocations, JsonpDeserializer.integerDeserializer(), "number_of_allocations");
		op.add(Builder::numberOfPendingRequests, JsonpDeserializer.integerDeserializer(), "number_of_pending_requests");
		op.add(Builder::peakThroughputPerMinute, JsonpDeserializer.longDeserializer(), "peak_throughput_per_minute");
		op.add(Builder::rejectionExecutionCount, JsonpDeserializer.integerDeserializer(), "rejection_execution_count");
		op.add(Builder::routingState, TrainedModelAssignmentRoutingTable._DESERIALIZER, "routing_state");
		op.add(Builder::startTime, JsonpDeserializer.longDeserializer(), "start_time");
		op.add(Builder::threadsPerAllocation, JsonpDeserializer.integerDeserializer(), "threads_per_allocation");
		op.add(Builder::throughputLastMinute, JsonpDeserializer.integerDeserializer(), "throughput_last_minute");
		op.add(Builder::timeoutCount, JsonpDeserializer.integerDeserializer(), "timeout_count");

	}

}
