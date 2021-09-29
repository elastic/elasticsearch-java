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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.cluster.allocation_explain.AllocationDecision;
import co.elastic.clients.elasticsearch.cluster.allocation_explain.ClusterInfo;
import co.elastic.clients.elasticsearch.cluster.allocation_explain.CurrentNode;
import co.elastic.clients.elasticsearch.cluster.allocation_explain.Decision;
import co.elastic.clients.elasticsearch.cluster.allocation_explain.NodeAllocationExplanation;
import co.elastic.clients.elasticsearch.cluster.allocation_explain.UnassignedInformation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.Response
@JsonpDeserializable
public final class AllocationExplainResponse implements JsonpSerializable {
	@Nullable
	private final String allocateExplanation;

	@Nullable
	private final String allocationDelay;

	@Nullable
	private final Long allocationDelayInMillis;

	@Nullable
	private final Decision canAllocate;

	@Nullable
	private final Decision canMoveToOtherNode;

	@Nullable
	private final Decision canRebalanceCluster;

	@Nullable
	private final List<AllocationDecision> canRebalanceClusterDecisions;

	@Nullable
	private final Decision canRebalanceToOtherNode;

	@Nullable
	private final List<AllocationDecision> canRemainDecisions;

	@Nullable
	private final Decision canRemainOnCurrentNode;

	@Nullable
	private final ClusterInfo clusterInfo;

	@Nullable
	private final String configuredDelay;

	@Nullable
	private final Long configuredDelayInMillis;

	@Nullable
	private final CurrentNode currentNode;

	private final String currentState;

	private final String index;

	@Nullable
	private final String moveExplanation;

	@Nullable
	private final List<NodeAllocationExplanation> nodeAllocationDecisions;

	private final boolean primary;

	@Nullable
	private final String rebalanceExplanation;

	@Nullable
	private final String remainingDelay;

	@Nullable
	private final Long remainingDelayInMillis;

	private final int shard;

	@Nullable
	private final UnassignedInformation unassignedInfo;

	@Nullable
	private final String note;

	// ---------------------------------------------------------------------------------------------

	public AllocationExplainResponse(Builder builder) {

		this.allocateExplanation = builder.allocateExplanation;
		this.allocationDelay = builder.allocationDelay;
		this.allocationDelayInMillis = builder.allocationDelayInMillis;
		this.canAllocate = builder.canAllocate;
		this.canMoveToOtherNode = builder.canMoveToOtherNode;
		this.canRebalanceCluster = builder.canRebalanceCluster;
		this.canRebalanceClusterDecisions = ModelTypeHelper.unmodifiable(builder.canRebalanceClusterDecisions);
		this.canRebalanceToOtherNode = builder.canRebalanceToOtherNode;
		this.canRemainDecisions = ModelTypeHelper.unmodifiable(builder.canRemainDecisions);
		this.canRemainOnCurrentNode = builder.canRemainOnCurrentNode;
		this.clusterInfo = builder.clusterInfo;
		this.configuredDelay = builder.configuredDelay;
		this.configuredDelayInMillis = builder.configuredDelayInMillis;
		this.currentNode = builder.currentNode;
		this.currentState = Objects.requireNonNull(builder.currentState, "current_state");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.moveExplanation = builder.moveExplanation;
		this.nodeAllocationDecisions = ModelTypeHelper.unmodifiable(builder.nodeAllocationDecisions);
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.rebalanceExplanation = builder.rebalanceExplanation;
		this.remainingDelay = builder.remainingDelay;
		this.remainingDelayInMillis = builder.remainingDelayInMillis;
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.unassignedInfo = builder.unassignedInfo;
		this.note = builder.note;

	}

	public AllocationExplainResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code allocate_explanation}
	 */
	@Nullable
	public String allocateExplanation() {
		return this.allocateExplanation;
	}

	/**
	 * API name: {@code allocation_delay}
	 */
	@Nullable
	public String allocationDelay() {
		return this.allocationDelay;
	}

	/**
	 * API name: {@code allocation_delay_in_millis}
	 */
	@Nullable
	public Long allocationDelayInMillis() {
		return this.allocationDelayInMillis;
	}

	/**
	 * API name: {@code can_allocate}
	 */
	@Nullable
	public Decision canAllocate() {
		return this.canAllocate;
	}

	/**
	 * API name: {@code can_move_to_other_node}
	 */
	@Nullable
	public Decision canMoveToOtherNode() {
		return this.canMoveToOtherNode;
	}

	/**
	 * API name: {@code can_rebalance_cluster}
	 */
	@Nullable
	public Decision canRebalanceCluster() {
		return this.canRebalanceCluster;
	}

	/**
	 * API name: {@code can_rebalance_cluster_decisions}
	 */
	@Nullable
	public List<AllocationDecision> canRebalanceClusterDecisions() {
		return this.canRebalanceClusterDecisions;
	}

	/**
	 * API name: {@code can_rebalance_to_other_node}
	 */
	@Nullable
	public Decision canRebalanceToOtherNode() {
		return this.canRebalanceToOtherNode;
	}

	/**
	 * API name: {@code can_remain_decisions}
	 */
	@Nullable
	public List<AllocationDecision> canRemainDecisions() {
		return this.canRemainDecisions;
	}

	/**
	 * API name: {@code can_remain_on_current_node}
	 */
	@Nullable
	public Decision canRemainOnCurrentNode() {
		return this.canRemainOnCurrentNode;
	}

	/**
	 * API name: {@code cluster_info}
	 */
	@Nullable
	public ClusterInfo clusterInfo() {
		return this.clusterInfo;
	}

	/**
	 * API name: {@code configured_delay}
	 */
	@Nullable
	public String configuredDelay() {
		return this.configuredDelay;
	}

	/**
	 * API name: {@code configured_delay_in_millis}
	 */
	@Nullable
	public Long configuredDelayInMillis() {
		return this.configuredDelayInMillis;
	}

	/**
	 * API name: {@code current_node}
	 */
	@Nullable
	public CurrentNode currentNode() {
		return this.currentNode;
	}

	/**
	 * API name: {@code current_state}
	 */
	public String currentState() {
		return this.currentState;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code move_explanation}
	 */
	@Nullable
	public String moveExplanation() {
		return this.moveExplanation;
	}

	/**
	 * API name: {@code node_allocation_decisions}
	 */
	@Nullable
	public List<NodeAllocationExplanation> nodeAllocationDecisions() {
		return this.nodeAllocationDecisions;
	}

	/**
	 * API name: {@code primary}
	 */
	public boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code rebalance_explanation}
	 */
	@Nullable
	public String rebalanceExplanation() {
		return this.rebalanceExplanation;
	}

	/**
	 * API name: {@code remaining_delay}
	 */
	@Nullable
	public String remainingDelay() {
		return this.remainingDelay;
	}

	/**
	 * API name: {@code remaining_delay_in_millis}
	 */
	@Nullable
	public Long remainingDelayInMillis() {
		return this.remainingDelayInMillis;
	}

	/**
	 * API name: {@code shard}
	 */
	public int shard() {
		return this.shard;
	}

	/**
	 * API name: {@code unassigned_info}
	 */
	@Nullable
	public UnassignedInformation unassignedInfo() {
		return this.unassignedInfo;
	}

	/**
	 * API name: {@code note}
	 */
	@Nullable
	public String note() {
		return this.note;
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

		if (this.allocateExplanation != null) {

			generator.writeKey("allocate_explanation");
			generator.write(this.allocateExplanation);

		}
		if (this.allocationDelay != null) {

			generator.writeKey("allocation_delay");
			generator.write(this.allocationDelay);

		}
		if (this.allocationDelayInMillis != null) {

			generator.writeKey("allocation_delay_in_millis");
			generator.write(this.allocationDelayInMillis);

		}
		if (this.canAllocate != null) {

			generator.writeKey("can_allocate");
			this.canAllocate.serialize(generator, mapper);
		}
		if (this.canMoveToOtherNode != null) {

			generator.writeKey("can_move_to_other_node");
			this.canMoveToOtherNode.serialize(generator, mapper);
		}
		if (this.canRebalanceCluster != null) {

			generator.writeKey("can_rebalance_cluster");
			this.canRebalanceCluster.serialize(generator, mapper);
		}
		if (this.canRebalanceClusterDecisions != null) {

			generator.writeKey("can_rebalance_cluster_decisions");
			generator.writeStartArray();
			for (AllocationDecision item0 : this.canRebalanceClusterDecisions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.canRebalanceToOtherNode != null) {

			generator.writeKey("can_rebalance_to_other_node");
			this.canRebalanceToOtherNode.serialize(generator, mapper);
		}
		if (this.canRemainDecisions != null) {

			generator.writeKey("can_remain_decisions");
			generator.writeStartArray();
			for (AllocationDecision item0 : this.canRemainDecisions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.canRemainOnCurrentNode != null) {

			generator.writeKey("can_remain_on_current_node");
			this.canRemainOnCurrentNode.serialize(generator, mapper);
		}
		if (this.clusterInfo != null) {

			generator.writeKey("cluster_info");
			this.clusterInfo.serialize(generator, mapper);

		}
		if (this.configuredDelay != null) {

			generator.writeKey("configured_delay");
			generator.write(this.configuredDelay);

		}
		if (this.configuredDelayInMillis != null) {

			generator.writeKey("configured_delay_in_millis");
			generator.write(this.configuredDelayInMillis);

		}
		if (this.currentNode != null) {

			generator.writeKey("current_node");
			this.currentNode.serialize(generator, mapper);

		}

		generator.writeKey("current_state");
		generator.write(this.currentState);

		generator.writeKey("index");
		generator.write(this.index);

		if (this.moveExplanation != null) {

			generator.writeKey("move_explanation");
			generator.write(this.moveExplanation);

		}
		if (this.nodeAllocationDecisions != null) {

			generator.writeKey("node_allocation_decisions");
			generator.writeStartArray();
			for (NodeAllocationExplanation item0 : this.nodeAllocationDecisions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("primary");
		generator.write(this.primary);

		if (this.rebalanceExplanation != null) {

			generator.writeKey("rebalance_explanation");
			generator.write(this.rebalanceExplanation);

		}
		if (this.remainingDelay != null) {

			generator.writeKey("remaining_delay");
			generator.write(this.remainingDelay);

		}
		if (this.remainingDelayInMillis != null) {

			generator.writeKey("remaining_delay_in_millis");
			generator.write(this.remainingDelayInMillis);

		}

		generator.writeKey("shard");
		generator.write(this.shard);

		if (this.unassignedInfo != null) {

			generator.writeKey("unassigned_info");
			this.unassignedInfo.serialize(generator, mapper);

		}
		if (this.note != null) {

			generator.writeKey("note");
			generator.write(this.note);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationExplainResponse}.
	 */
	public static class Builder implements ObjectBuilder<AllocationExplainResponse> {
		@Nullable
		private String allocateExplanation;

		@Nullable
		private String allocationDelay;

		@Nullable
		private Long allocationDelayInMillis;

		@Nullable
		private Decision canAllocate;

		@Nullable
		private Decision canMoveToOtherNode;

		@Nullable
		private Decision canRebalanceCluster;

		@Nullable
		private List<AllocationDecision> canRebalanceClusterDecisions;

		@Nullable
		private Decision canRebalanceToOtherNode;

		@Nullable
		private List<AllocationDecision> canRemainDecisions;

		@Nullable
		private Decision canRemainOnCurrentNode;

		@Nullable
		private ClusterInfo clusterInfo;

		@Nullable
		private String configuredDelay;

		@Nullable
		private Long configuredDelayInMillis;

		@Nullable
		private CurrentNode currentNode;

		private String currentState;

		private String index;

		@Nullable
		private String moveExplanation;

		@Nullable
		private List<NodeAllocationExplanation> nodeAllocationDecisions;

		private Boolean primary;

		@Nullable
		private String rebalanceExplanation;

		@Nullable
		private String remainingDelay;

		@Nullable
		private Long remainingDelayInMillis;

		private Integer shard;

		@Nullable
		private UnassignedInformation unassignedInfo;

		@Nullable
		private String note;

		/**
		 * API name: {@code allocate_explanation}
		 */
		public Builder allocateExplanation(@Nullable String value) {
			this.allocateExplanation = value;
			return this;
		}

		/**
		 * API name: {@code allocation_delay}
		 */
		public Builder allocationDelay(@Nullable String value) {
			this.allocationDelay = value;
			return this;
		}

		/**
		 * API name: {@code allocation_delay_in_millis}
		 */
		public Builder allocationDelayInMillis(@Nullable Long value) {
			this.allocationDelayInMillis = value;
			return this;
		}

		/**
		 * API name: {@code can_allocate}
		 */
		public Builder canAllocate(@Nullable Decision value) {
			this.canAllocate = value;
			return this;
		}

		/**
		 * API name: {@code can_move_to_other_node}
		 */
		public Builder canMoveToOtherNode(@Nullable Decision value) {
			this.canMoveToOtherNode = value;
			return this;
		}

		/**
		 * API name: {@code can_rebalance_cluster}
		 */
		public Builder canRebalanceCluster(@Nullable Decision value) {
			this.canRebalanceCluster = value;
			return this;
		}

		/**
		 * API name: {@code can_rebalance_cluster_decisions}
		 */
		public Builder canRebalanceClusterDecisions(@Nullable List<AllocationDecision> value) {
			this.canRebalanceClusterDecisions = value;
			return this;
		}

		/**
		 * API name: {@code can_rebalance_cluster_decisions}
		 */
		public Builder canRebalanceClusterDecisions(AllocationDecision... value) {
			this.canRebalanceClusterDecisions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #canRebalanceClusterDecisions(List)}, creating the list
		 * if needed. 4
		 */
		public Builder addCanRebalanceClusterDecisions(AllocationDecision value) {
			if (this.canRebalanceClusterDecisions == null) {
				this.canRebalanceClusterDecisions = new ArrayList<>();
			}
			this.canRebalanceClusterDecisions.add(value);
			return this;
		}

		/**
		 * Set {@link #canRebalanceClusterDecisions(List)} to a singleton list.
		 */
		public Builder canRebalanceClusterDecisions(
				Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.canRebalanceClusterDecisions(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * Add a value to {@link #canRebalanceClusterDecisions(List)}, creating the list
		 * if needed. 5
		 */
		public Builder addCanRebalanceClusterDecisions(
				Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.addCanRebalanceClusterDecisions(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * API name: {@code can_rebalance_to_other_node}
		 */
		public Builder canRebalanceToOtherNode(@Nullable Decision value) {
			this.canRebalanceToOtherNode = value;
			return this;
		}

		/**
		 * API name: {@code can_remain_decisions}
		 */
		public Builder canRemainDecisions(@Nullable List<AllocationDecision> value) {
			this.canRemainDecisions = value;
			return this;
		}

		/**
		 * API name: {@code can_remain_decisions}
		 */
		public Builder canRemainDecisions(AllocationDecision... value) {
			this.canRemainDecisions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #canRemainDecisions(List)}, creating the list if
		 * needed. 4
		 */
		public Builder addCanRemainDecisions(AllocationDecision value) {
			if (this.canRemainDecisions == null) {
				this.canRemainDecisions = new ArrayList<>();
			}
			this.canRemainDecisions.add(value);
			return this;
		}

		/**
		 * Set {@link #canRemainDecisions(List)} to a singleton list.
		 */
		public Builder canRemainDecisions(Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.canRemainDecisions(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * Add a value to {@link #canRemainDecisions(List)}, creating the list if
		 * needed. 5
		 */
		public Builder addCanRemainDecisions(
				Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.addCanRemainDecisions(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * API name: {@code can_remain_on_current_node}
		 */
		public Builder canRemainOnCurrentNode(@Nullable Decision value) {
			this.canRemainOnCurrentNode = value;
			return this;
		}

		/**
		 * API name: {@code cluster_info}
		 */
		public Builder clusterInfo(@Nullable ClusterInfo value) {
			this.clusterInfo = value;
			return this;
		}

		/**
		 * API name: {@code cluster_info}
		 */
		public Builder clusterInfo(Function<ClusterInfo.Builder, ObjectBuilder<ClusterInfo>> fn) {
			return this.clusterInfo(fn.apply(new ClusterInfo.Builder()).build());
		}

		/**
		 * API name: {@code configured_delay}
		 */
		public Builder configuredDelay(@Nullable String value) {
			this.configuredDelay = value;
			return this;
		}

		/**
		 * API name: {@code configured_delay_in_millis}
		 */
		public Builder configuredDelayInMillis(@Nullable Long value) {
			this.configuredDelayInMillis = value;
			return this;
		}

		/**
		 * API name: {@code current_node}
		 */
		public Builder currentNode(@Nullable CurrentNode value) {
			this.currentNode = value;
			return this;
		}

		/**
		 * API name: {@code current_node}
		 */
		public Builder currentNode(Function<CurrentNode.Builder, ObjectBuilder<CurrentNode>> fn) {
			return this.currentNode(fn.apply(new CurrentNode.Builder()).build());
		}

		/**
		 * API name: {@code current_state}
		 */
		public Builder currentState(String value) {
			this.currentState = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code move_explanation}
		 */
		public Builder moveExplanation(@Nullable String value) {
			this.moveExplanation = value;
			return this;
		}

		/**
		 * API name: {@code node_allocation_decisions}
		 */
		public Builder nodeAllocationDecisions(@Nullable List<NodeAllocationExplanation> value) {
			this.nodeAllocationDecisions = value;
			return this;
		}

		/**
		 * API name: {@code node_allocation_decisions}
		 */
		public Builder nodeAllocationDecisions(NodeAllocationExplanation... value) {
			this.nodeAllocationDecisions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeAllocationDecisions(List)}, creating the list if
		 * needed. 4
		 */
		public Builder addNodeAllocationDecisions(NodeAllocationExplanation value) {
			if (this.nodeAllocationDecisions == null) {
				this.nodeAllocationDecisions = new ArrayList<>();
			}
			this.nodeAllocationDecisions.add(value);
			return this;
		}

		/**
		 * Set {@link #nodeAllocationDecisions(List)} to a singleton list.
		 */
		public Builder nodeAllocationDecisions(
				Function<NodeAllocationExplanation.Builder, ObjectBuilder<NodeAllocationExplanation>> fn) {
			return this.nodeAllocationDecisions(fn.apply(new NodeAllocationExplanation.Builder()).build());
		}

		/**
		 * Add a value to {@link #nodeAllocationDecisions(List)}, creating the list if
		 * needed. 5
		 */
		public Builder addNodeAllocationDecisions(
				Function<NodeAllocationExplanation.Builder, ObjectBuilder<NodeAllocationExplanation>> fn) {
			return this.addNodeAllocationDecisions(fn.apply(new NodeAllocationExplanation.Builder()).build());
		}

		/**
		 * API name: {@code primary}
		 */
		public Builder primary(boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code rebalance_explanation}
		 */
		public Builder rebalanceExplanation(@Nullable String value) {
			this.rebalanceExplanation = value;
			return this;
		}

		/**
		 * API name: {@code remaining_delay}
		 */
		public Builder remainingDelay(@Nullable String value) {
			this.remainingDelay = value;
			return this;
		}

		/**
		 * API name: {@code remaining_delay_in_millis}
		 */
		public Builder remainingDelayInMillis(@Nullable Long value) {
			this.remainingDelayInMillis = value;
			return this;
		}

		/**
		 * API name: {@code shard}
		 */
		public Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public Builder unassignedInfo(@Nullable UnassignedInformation value) {
			this.unassignedInfo = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public Builder unassignedInfo(
				Function<UnassignedInformation.Builder, ObjectBuilder<UnassignedInformation>> fn) {
			return this.unassignedInfo(fn.apply(new UnassignedInformation.Builder()).build());
		}

		/**
		 * API name: {@code note}
		 */
		public Builder note(@Nullable String value) {
			this.note = value;
			return this;
		}

		/**
		 * Builds a {@link AllocationExplainResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationExplainResponse build() {

			return new AllocationExplainResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationExplainResponse}
	 */
	public static final JsonpDeserializer<AllocationExplainResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AllocationExplainResponse::setupAllocationExplainResponseDeserializer, Builder::build);

	protected static void setupAllocationExplainResponseDeserializer(
			DelegatingDeserializer<AllocationExplainResponse.Builder> op) {

		op.add(Builder::allocateExplanation, JsonpDeserializer.stringDeserializer(), "allocate_explanation");
		op.add(Builder::allocationDelay, JsonpDeserializer.stringDeserializer(), "allocation_delay");
		op.add(Builder::allocationDelayInMillis, JsonpDeserializer.longDeserializer(), "allocation_delay_in_millis");
		op.add(Builder::canAllocate, Decision._DESERIALIZER, "can_allocate");
		op.add(Builder::canMoveToOtherNode, Decision._DESERIALIZER, "can_move_to_other_node");
		op.add(Builder::canRebalanceCluster, Decision._DESERIALIZER, "can_rebalance_cluster");
		op.add(Builder::canRebalanceClusterDecisions,
				JsonpDeserializer.arrayDeserializer(AllocationDecision._DESERIALIZER),
				"can_rebalance_cluster_decisions");
		op.add(Builder::canRebalanceToOtherNode, Decision._DESERIALIZER, "can_rebalance_to_other_node");
		op.add(Builder::canRemainDecisions, JsonpDeserializer.arrayDeserializer(AllocationDecision._DESERIALIZER),
				"can_remain_decisions");
		op.add(Builder::canRemainOnCurrentNode, Decision._DESERIALIZER, "can_remain_on_current_node");
		op.add(Builder::clusterInfo, ClusterInfo._DESERIALIZER, "cluster_info");
		op.add(Builder::configuredDelay, JsonpDeserializer.stringDeserializer(), "configured_delay");
		op.add(Builder::configuredDelayInMillis, JsonpDeserializer.longDeserializer(), "configured_delay_in_millis");
		op.add(Builder::currentNode, CurrentNode._DESERIALIZER, "current_node");
		op.add(Builder::currentState, JsonpDeserializer.stringDeserializer(), "current_state");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::moveExplanation, JsonpDeserializer.stringDeserializer(), "move_explanation");
		op.add(Builder::nodeAllocationDecisions,
				JsonpDeserializer.arrayDeserializer(NodeAllocationExplanation._DESERIALIZER),
				"node_allocation_decisions");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::rebalanceExplanation, JsonpDeserializer.stringDeserializer(), "rebalance_explanation");
		op.add(Builder::remainingDelay, JsonpDeserializer.stringDeserializer(), "remaining_delay");
		op.add(Builder::remainingDelayInMillis, JsonpDeserializer.longDeserializer(), "remaining_delay_in_millis");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::unassignedInfo, UnassignedInformation._DESERIALIZER, "unassigned_info");
		op.add(Builder::note, JsonpDeserializer.stringDeserializer(), "note");

	}

}
