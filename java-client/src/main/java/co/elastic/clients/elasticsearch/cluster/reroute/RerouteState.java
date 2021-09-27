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

package co.elastic.clients.elasticsearch.cluster.reroute;

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.elasticsearch._types.NodeAttributes;
import co.elastic.clients.elasticsearch.cluster.ClusterStateDeletedSnapshots;
import co.elastic.clients.elasticsearch.cluster.ClusterStateMetadata;
import co.elastic.clients.elasticsearch.cluster.ClusterStateRoutingNodes;
import co.elastic.clients.elasticsearch.cluster.ClusterStateSnapshots;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.RerouteState
@JsonpDeserializable
public final class RerouteState implements JsonpSerializable {
	private final String clusterUuid;

	@Nullable
	private final String stateUuid;

	@Nullable
	private final String masterNode;

	@Nullable
	private final Long version;

	@Nullable
	private final EmptyObject blocks;

	@Nullable
	private final Map<String, NodeAttributes> nodes;

	@Nullable
	private final RoutingTable routingTable;

	@Nullable
	private final ClusterStateRoutingNodes routingNodes;

	@Nullable
	private final Map<String, String> securityTokens;

	@Nullable
	private final ClusterStateSnapshots snapshots;

	@Nullable
	private final ClusterStateDeletedSnapshots snapshotDeletions;

	@Nullable
	private final ClusterStateMetadata metadata;

	// ---------------------------------------------------------------------------------------------

	public RerouteState(Builder builder) {

		this.clusterUuid = Objects.requireNonNull(builder.clusterUuid, "cluster_uuid");
		this.stateUuid = builder.stateUuid;
		this.masterNode = builder.masterNode;
		this.version = builder.version;
		this.blocks = builder.blocks;
		this.nodes = builder.nodes;
		this.routingTable = builder.routingTable;
		this.routingNodes = builder.routingNodes;
		this.securityTokens = builder.securityTokens;
		this.snapshots = builder.snapshots;
		this.snapshotDeletions = builder.snapshotDeletions;
		this.metadata = builder.metadata;

	}

	/**
	 * API name: {@code cluster_uuid}
	 */
	public String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * API name: {@code state_uuid}
	 */
	@Nullable
	public String stateUuid() {
		return this.stateUuid;
	}

	/**
	 * API name: {@code master_node}
	 */
	@Nullable
	public String masterNode() {
		return this.masterNode;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code blocks}
	 */
	@Nullable
	public EmptyObject blocks() {
		return this.blocks;
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
	public RoutingTable routingTable() {
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
	 * API name: {@code security_tokens}
	 */
	@Nullable
	public Map<String, String> securityTokens() {
		return this.securityTokens;
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
	 * API name: {@code metadata}
	 */
	@Nullable
	public ClusterStateMetadata metadata() {
		return this.metadata;
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

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		if (this.stateUuid != null) {

			generator.writeKey("state_uuid");
			generator.write(this.stateUuid);

		}
		if (this.masterNode != null) {

			generator.writeKey("master_node");
			generator.write(this.masterNode);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.blocks != null) {

			generator.writeKey("blocks");
			this.blocks.serialize(generator, mapper);

		}
		if (this.nodes != null) {

			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeAttributes> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.routingTable != null) {

			generator.writeKey("routing_table");
			this.routingTable.serialize(generator, mapper);

		}
		if (this.routingNodes != null) {

			generator.writeKey("routing_nodes");
			this.routingNodes.serialize(generator, mapper);

		}
		if (this.securityTokens != null) {

			generator.writeKey("security_tokens");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.securityTokens.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.snapshots != null) {

			generator.writeKey("snapshots");
			this.snapshots.serialize(generator, mapper);

		}
		if (this.snapshotDeletions != null) {

			generator.writeKey("snapshot_deletions");
			this.snapshotDeletions.serialize(generator, mapper);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			this.metadata.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteState}.
	 */
	public static class Builder implements ObjectBuilder<RerouteState> {
		private String clusterUuid;

		@Nullable
		private String stateUuid;

		@Nullable
		private String masterNode;

		@Nullable
		private Long version;

		@Nullable
		private EmptyObject blocks;

		@Nullable
		private Map<String, NodeAttributes> nodes;

		@Nullable
		private RoutingTable routingTable;

		@Nullable
		private ClusterStateRoutingNodes routingNodes;

		@Nullable
		private Map<String, String> securityTokens;

		@Nullable
		private ClusterStateSnapshots snapshots;

		@Nullable
		private ClusterStateDeletedSnapshots snapshotDeletions;

		@Nullable
		private ClusterStateMetadata metadata;

		/**
		 * API name: {@code cluster_uuid}
		 */
		public Builder clusterUuid(String value) {
			this.clusterUuid = value;
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
		 * API name: {@code master_node}
		 */
		public Builder masterNode(@Nullable String value) {
			this.masterNode = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(@Nullable EmptyObject value) {
			this.blocks = value;
			return this;
		}

		/**
		 * API name: {@code blocks}
		 */
		public Builder blocks(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.blocks(fn.apply(new EmptyObject.Builder()).build());
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
		public Builder routingTable(@Nullable RoutingTable value) {
			this.routingTable = value;
			return this;
		}

		/**
		 * API name: {@code routing_table}
		 */
		public Builder routingTable(Function<RoutingTable.Builder, ObjectBuilder<RoutingTable>> fn) {
			return this.routingTable(fn.apply(new RoutingTable.Builder()).build());
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
		 * API name: {@code security_tokens}
		 */
		public Builder securityTokens(@Nullable Map<String, String> value) {
			this.securityTokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #securityTokens(Map)}, creating the map if needed.
		 */
		public Builder putSecurityTokens(String key, String value) {
			if (this.securityTokens == null) {
				this.securityTokens = new HashMap<>();
			}
			this.securityTokens.put(key, value);
			return this;
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
		 * Builds a {@link RerouteState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteState build() {

			return new RerouteState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteState}
	 */
	public static final JsonpDeserializer<RerouteState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteState::setupRerouteStateDeserializer, Builder::build);

	protected static void setupRerouteStateDeserializer(DelegatingDeserializer<RerouteState.Builder> op) {

		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::stateUuid, JsonpDeserializer.stringDeserializer(), "state_uuid");
		op.add(Builder::masterNode, JsonpDeserializer.stringDeserializer(), "master_node");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::blocks, EmptyObject._DESERIALIZER, "blocks");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(NodeAttributes._DESERIALIZER), "nodes");
		op.add(Builder::routingTable, RoutingTable._DESERIALIZER, "routing_table");
		op.add(Builder::routingNodes, ClusterStateRoutingNodes._DESERIALIZER, "routing_nodes");
		op.add(Builder::securityTokens, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"security_tokens");
		op.add(Builder::snapshots, ClusterStateSnapshots._DESERIALIZER, "snapshots");
		op.add(Builder::snapshotDeletions, ClusterStateDeletedSnapshots._DESERIALIZER, "snapshot_deletions");
		op.add(Builder::metadata, ClusterStateMetadata._DESERIALIZER, "metadata");

	}

}
