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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.NodeStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.clear_cached_privileges.Response
public final class ClearCachedPrivilegesResponse implements ToJsonp {
	private final NodeStatistics _nodes;

	private final String clusterName;

	private final Map<String, ClusterNode> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ClearCachedPrivilegesResponse(Builder builder) {

		this._nodes = Objects.requireNonNull(builder._nodes, "_nodes");
		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code _nodes}
	 */
	public NodeStatistics _nodes() {
		return this._nodes;
	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, ClusterNode> nodes() {
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

		generator.writeKey("_nodes");
		this._nodes.toJsonp(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, ClusterNode> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedPrivilegesResponse}.
	 */
	public static class Builder implements ObjectBuilder<ClearCachedPrivilegesResponse> {
		private NodeStatistics _nodes;

		private String clusterName;

		private Map<String, ClusterNode> nodes;

		/**
		 * API name: {@code _nodes}
		 */
		public Builder _nodes(NodeStatistics value) {
			this._nodes = value;
			return this;
		}

		/**
		 * API name: {@code _nodes}
		 */
		public Builder _nodes(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this._nodes(fn.apply(new NodeStatistics.Builder()).build());
		}

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, ClusterNode> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, ClusterNode value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<ClusterNode.Builder, ObjectBuilder<ClusterNode>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new ClusterNode.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<ClusterNode.Builder, ObjectBuilder<ClusterNode>> fn) {
			return this.putNodes(key, fn.apply(new ClusterNode.Builder()).build());
		}

		/**
		 * Builds a {@link ClearCachedPrivilegesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedPrivilegesResponse build() {

			return new ClearCachedPrivilegesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClearCachedPrivilegesResponse
	 */
	public static final JsonpDeserializer<ClearCachedPrivilegesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClearCachedPrivilegesResponse::setupClearCachedPrivilegesResponseDeserializer);

	protected static void setupClearCachedPrivilegesResponseDeserializer(
			DelegatingDeserializer<ClearCachedPrivilegesResponse.Builder> op) {

		op.add(Builder::_nodes, NodeStatistics.DESERIALIZER, "_nodes");
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(ClusterNode.DESERIALIZER), "nodes");

	}

}
