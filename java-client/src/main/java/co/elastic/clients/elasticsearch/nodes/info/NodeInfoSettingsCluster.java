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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.elasticsearch.indices.IndexRouting;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsCluster
public final class NodeInfoSettingsCluster implements ToJsonp {
	private final String name;

	@Nullable
	private final IndexRouting routing;

	private final NodeInfoSettingsClusterElection election;

	@Nullable
	private final String initialMasterNodes;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsCluster(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.routing = builder.routing;
		this.election = Objects.requireNonNull(builder.election, "election");
		this.initialMasterNodes = builder.initialMasterNodes;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public IndexRouting routing() {
		return this.routing;
	}

	/**
	 * API name: {@code election}
	 */
	public NodeInfoSettingsClusterElection election() {
		return this.election;
	}

	/**
	 * API name: {@code initial_master_nodes}
	 */
	@Nullable
	public String initialMasterNodes() {
		return this.initialMasterNodes;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.routing != null) {

			generator.writeKey("routing");
			this.routing.toJsonp(generator, mapper);

		}

		generator.writeKey("election");
		this.election.toJsonp(generator, mapper);

		if (this.initialMasterNodes != null) {

			generator.writeKey("initial_master_nodes");
			generator.write(this.initialMasterNodes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsCluster}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsCluster> {
		private String name;

		@Nullable
		private IndexRouting routing;

		private NodeInfoSettingsClusterElection election;

		@Nullable
		private String initialMasterNodes;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable IndexRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(Function<IndexRouting.Builder, ObjectBuilder<IndexRouting>> fn) {
			return this.routing(fn.apply(new IndexRouting.Builder()).build());
		}

		/**
		 * API name: {@code election}
		 */
		public Builder election(NodeInfoSettingsClusterElection value) {
			this.election = value;
			return this;
		}

		/**
		 * API name: {@code election}
		 */
		public Builder election(
				Function<NodeInfoSettingsClusterElection.Builder, ObjectBuilder<NodeInfoSettingsClusterElection>> fn) {
			return this.election(fn.apply(new NodeInfoSettingsClusterElection.Builder()).build());
		}

		/**
		 * API name: {@code initial_master_nodes}
		 */
		public Builder initialMasterNodes(@Nullable String value) {
			this.initialMasterNodes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsCluster build() {

			return new NodeInfoSettingsCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSettingsCluster
	 */
	public static final JsonpDeserializer<NodeInfoSettingsCluster> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSettingsCluster::setupNodeInfoSettingsClusterDeserializer);

	protected static void setupNodeInfoSettingsClusterDeserializer(
			DelegatingDeserializer<NodeInfoSettingsCluster.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::routing, IndexRouting.DESERIALIZER, "routing");
		op.add(Builder::election, NodeInfoSettingsClusterElection.DESERIALIZER, "election");
		op.add(Builder::initialMasterNodes, JsonpDeserializer.stringDeserializer(), "initial_master_nodes");

	}

}
