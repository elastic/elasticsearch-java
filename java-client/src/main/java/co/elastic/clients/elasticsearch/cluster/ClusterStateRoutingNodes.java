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

import co.elastic.clients.elasticsearch._types.NodeShard;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateRoutingNodes
public final class ClusterStateRoutingNodes implements ToJsonp {
	private final List<NodeShard> unassigned;

	private final Map<String, List<NodeShard>> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ClusterStateRoutingNodes(Builder builder) {

		this.unassigned = Objects.requireNonNull(builder.unassigned, "unassigned");
		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code unassigned}
	 */
	public List<NodeShard> unassigned() {
		return this.unassigned;
	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, List<NodeShard>> nodes() {
		return this.nodes;
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

		generator.writeKey("unassigned");
		generator.writeStartArray();
		for (NodeShard item0 : this.unassigned) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, List<NodeShard>> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (NodeShard item1 : item0.getValue()) {
				item1.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateRoutingNodes}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateRoutingNodes> {
		private List<NodeShard> unassigned;

		private Map<String, List<NodeShard>> nodes;

		/**
		 * API name: {@code unassigned}
		 */
		public Builder unassigned(List<NodeShard> value) {
			this.unassigned = value;
			return this;
		}

		/**
		 * API name: {@code unassigned}
		 */
		public Builder unassigned(NodeShard... value) {
			this.unassigned = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #unassigned(List)}, creating the list if needed.
		 */
		public Builder addUnassigned(NodeShard value) {
			if (this.unassigned == null) {
				this.unassigned = new ArrayList<>();
			}
			this.unassigned.add(value);
			return this;
		}

		/**
		 * Set {@link #unassigned(List)} to a singleton list.
		 */
		public Builder unassigned(Function<NodeShard.Builder, ObjectBuilder<NodeShard>> fn) {
			return this.unassigned(fn.apply(new NodeShard.Builder()).build());
		}

		/**
		 * Add a value to {@link #unassigned(List)}, creating the list if needed.
		 */
		public Builder addUnassigned(Function<NodeShard.Builder, ObjectBuilder<NodeShard>> fn) {
			return this.addUnassigned(fn.apply(new NodeShard.Builder()).build());
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, List<NodeShard>> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, List<NodeShard> value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ClusterStateRoutingNodes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateRoutingNodes build() {

			return new ClusterStateRoutingNodes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterStateRoutingNodes
	 */
	public static final JsonpDeserializer<ClusterStateRoutingNodes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterStateRoutingNodes::setupClusterStateRoutingNodesDeserializer);

	protected static void setupClusterStateRoutingNodesDeserializer(
			DelegatingDeserializer<ClusterStateRoutingNodes.Builder> op) {

		op.add(Builder::unassigned, JsonpDeserializer.arrayDeserializer(NodeShard.DESERIALIZER), "unassigned");
		op.add(Builder::nodes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(NodeShard.DESERIALIZER)),
				"nodes");

	}

}
