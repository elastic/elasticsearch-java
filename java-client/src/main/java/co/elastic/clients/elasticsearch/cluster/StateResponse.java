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

import co.elastic.clients.elasticsearch._types.NodeAttributes;
import co.elastic.clients.elasticsearch.cluster.state.ClusterStateBlocks;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.state.Response
public final class StateResponse implements ToJsonp {
	private final String clusterName;

	private final String clusterUuid;

	@Nullable
	private final String masterNode;

	@Nullable
	private final List<String> state;

	@Nullable
	private final String stateUuid;

	@Nullable
	private final Number version;

	@Nullable
	private final ClusterStateBlocks blocks;

	@Nullable
	private final ClusterStateMetadata metadata;

	@Nullable
	private final Map<String, NodeAttributes> nodes;

	@Nullable
	private final Map<String, JsonValue> routingTable;

	@Nullable
	private final ClusterStateRoutingNodes routingNodes;

	@Nullable
	private final ClusterStateSnapshots snapshots;

	@Nullable
	private final ClusterStateDeletedSnapshots snapshotDeletions;

	// ---------------------------------------------------------------------------------------------

	protected StateResponse(Builder builder) {

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.clusterUuid = Objects.requireNonNull(builder.clusterUuid, "cluster_uuid");
		this.masterNode = builder.masterNode;
		this.state = builder.state;
		this.stateUuid = builder.stateUuid;
		this.version = builder.version;
		this.blocks = builder.blocks;
		this.metadata = builder.metadata;
		this.nodes = builder.nodes;
		this.routingTable = builder.routingTable;
		this.routingNodes = builder.routingNodes;
		this.snapshots = builder.snapshots;
		this.snapshotDeletions = builder.snapshotDeletions;

	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code cluster_uuid}
	 */
	public String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * API name: {@code master_node}
	 */
	@Nullable
	public String masterNode() {
		return this.masterNode;
	}

	/**
	 * API name: {@code state}
	 */
	@Nullable
	public List<String> state() {
		return this.state;
	}

	/**
	 * API name: {@code state_uuid}
	 */
	@Nullable
	public String stateUuid() {
		return this.stateUuid;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code blocks}
	 */
	@Nullable
	public ClusterStateBlocks blocks() {
		return this.blocks;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public ClusterStateMetadata metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code nodes}
	 */
	@Nullable
	public Map<String, NodeAttributes> nodes() {
		return this.nodes;
	}

	/**
	 * API name: {@code routing_table}
	 */
	@Nullable
	public Map<String, JsonValue> routingTable() {
		return this.routingTable;
	}

	/**
	 * API name: {@code routing_nodes}
	 */
	@Nullable
	public ClusterStateRoutingNodes routingNodes() {
		return this.routingNodes;
	}

	/**
	 * API name: {@code snapshots}
	 */
	@Nullable
	public ClusterStateSnapshots snapshots() {
		return this.snapshots;
	}

	/**
	 * API name: {@code snapshot_deletions}
	 */
	@Nullable
	public ClusterStateDeletedSnapshots snapshotDeletions() {
		return this.snapshotDeletions;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		if (this.masterNode != null) {

			generator.writeKey("master_node");
			generator.write(this.masterNode);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.writeStartArray();
			for (String item0 : this.state) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.stateUuid != null) {

			generator.writeKey("state_uuid");
			generator.write(this.stateUuid);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this.blocks != null) {

			generator.writeKey("blocks");
			this.blocks.toJsonp(generator, mapper);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			this.metadata.toJsonp(generator, mapper);

		}
		if (this.nodes != null) {

			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeAttributes> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routingTable != null) {

			generator.writeKey("routing_table");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.routingTable.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.routingNodes != null) {

			generator.writeKey("routing_nodes");
			this.routingNodes.toJsonp(generator, mapper);

		}
		if (this.snapshots != null) {

			generator.writeKey("snapshots");
			this.snapshots.toJsonp(generator, mapper);

		}
		if (this.snapshotDeletions != null) {

			generator.writeKey("snapshot_deletions");
			this.snapshotDeletions.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StateResponse}.
	 */
	public static class Builder implements ObjectBuilder<StateResponse> {
		private String clusterName;

		private String clusterUuid;

		@Nullable
		private String masterNode;

		@Nullable
		private List<String> state;

		@Nullable
		private String stateUuid;

		@Nullable
		private Number version;

		@Nullable
		private ClusterStateBlocks blocks;

		@Nullable
		private ClusterStateMetadata metadata;

		@Nullable
		private Map<String, NodeAttributes> nodes;

		@Nullable
		private Map<String, JsonValue> routingTable;

		@Nullable
		private ClusterStateRoutingNodes routingNodes;

		@Nullable
		private ClusterStateSnapshots snapshots;

		@Nullable
		private ClusterStateDeletedSnapshots snapshotDeletions;

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code cluster_uuid}
		 */
		public Builder clusterUuid(String value) {
			this.clusterUuid = value;
			return this;
		}

		/**
		 * API name: {@code master_node}
		 */
		public Builder masterNode(@Nullable String value) {
			this.masterNode = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(@Nullable List<String> value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(String... value) {
			this.state = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #state(List)}, creating the list if needed.
		 */
		public Builder addState(String value) {
			if (this.state == null) {
				this.state = new ArrayList<>();
			}
			this.state.add(value);
			return this;
		}

		/**
		 * API name: {@code state_uuid}
		 */
		public Builder stateUuid(@Nullable String value) {
			this.stateUuid = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(@Nullable ClusterStateBlocks value) {
			this.blocks = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(Function<ClusterStateBlocks.Builder, ObjectBuilder<ClusterStateBlocks>> fn) {
			return this.blocks(fn.apply(new ClusterStateBlocks.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable ClusterStateMetadata value) {
			this.metadata = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(Function<ClusterStateMetadata.Builder, ObjectBuilder<ClusterStateMetadata>> fn) {
			return this.metadata(fn.apply(new ClusterStateMetadata.Builder()).build());
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(@Nullable Map<String, NodeAttributes> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, NodeAttributes value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeAttributes.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.putNodes(key, fn.apply(new NodeAttributes.Builder()).build());
		}

		/**
		 * API name: {@code routing_table}
		 */
		public Builder routingTable(@Nullable Map<String, JsonValue> value) {
			this.routingTable = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #routingTable(Map)}, creating the map if needed.
		 */
		public Builder putRoutingTable(String key, JsonValue value) {
			if (this.routingTable == null) {
				this.routingTable = new HashMap<>();
			}
			this.routingTable.put(key, value);
			return this;
		}

		/**
		 * API name: {@code routing_nodes}
		 */
		public Builder routingNodes(@Nullable ClusterStateRoutingNodes value) {
			this.routingNodes = value;
			return this;
		}

		/**
		 * API name: {@code routing_nodes}
		 */
		public Builder routingNodes(
				Function<ClusterStateRoutingNodes.Builder, ObjectBuilder<ClusterStateRoutingNodes>> fn) {
			return this.routingNodes(fn.apply(new ClusterStateRoutingNodes.Builder()).build());
		}

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(@Nullable ClusterStateSnapshots value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public Builder snapshots(Function<ClusterStateSnapshots.Builder, ObjectBuilder<ClusterStateSnapshots>> fn) {
			return this.snapshots(fn.apply(new ClusterStateSnapshots.Builder()).build());
		}

		/**
		 * API name: {@code snapshot_deletions}
		 */
		public Builder snapshotDeletions(@Nullable ClusterStateDeletedSnapshots value) {
			this.snapshotDeletions = value;
			return this;
		}

		/**
		 * API name: {@code snapshot_deletions}
		 */
		public Builder snapshotDeletions(
				Function<ClusterStateDeletedSnapshots.Builder, ObjectBuilder<ClusterStateDeletedSnapshots>> fn) {
			return this.snapshotDeletions(fn.apply(new ClusterStateDeletedSnapshots.Builder()).build());
		}

		/**
		 * Builds a {@link StateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StateResponse build() {

			return new StateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StateResponse
	 */
	public static final JsonpDeserializer<StateResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StateResponse::setupStateResponseDeserializer);

	protected static void setupStateResponseDeserializer(DelegatingDeserializer<StateResponse.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::masterNode, JsonpDeserializer.stringDeserializer(), "master_node");
		op.add(Builder::state, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "state");
		op.add(Builder::stateUuid, JsonpDeserializer.stringDeserializer(), "state_uuid");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::blocks, ClusterStateBlocks.DESERIALIZER, "blocks");
		op.add(Builder::metadata, ClusterStateMetadata.DESERIALIZER, "metadata");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(NodeAttributes.DESERIALIZER), "nodes");
		op.add(Builder::routingTable,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "routing_table");
		op.add(Builder::routingNodes, ClusterStateRoutingNodes.DESERIALIZER, "routing_nodes");
		op.add(Builder::snapshots, ClusterStateSnapshots.DESERIALIZER, "snapshots");
		op.add(Builder::snapshotDeletions, ClusterStateDeletedSnapshots.DESERIALIZER, "snapshot_deletions");

	}

}
