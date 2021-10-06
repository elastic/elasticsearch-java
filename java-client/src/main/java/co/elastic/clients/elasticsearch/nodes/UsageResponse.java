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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch.nodes.usage.NodeUsage;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.usage.Response
@JsonpDeserializable
public final class UsageResponse extends NodesResponseBase {
	private final String clusterName;

	private final Map<String, NodeUsage> nodes;

	// ---------------------------------------------------------------------------------------------

	public UsageResponse(Builder builder) {
		super(builder);

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.nodes = ModelTypeHelper.unmodifiableNonNull(builder.nodes, "nodes");

	}

	public UsageResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public Map<String, NodeUsage> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, NodeUsage> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UsageResponse}.
	 */
	public static class Builder extends NodesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UsageResponse> {
		private String clusterName;

		private Map<String, NodeUsage> nodes;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 */
		public Builder nodes(Map<String, NodeUsage> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, NodeUsage value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeUsage.Builder, ObjectBuilder<NodeUsage>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeUsage.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<NodeUsage.Builder, ObjectBuilder<NodeUsage>> fn) {
			return this.putNodes(key, fn.apply(new NodeUsage.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UsageResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UsageResponse build() {

			return new UsageResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UsageResponse}
	 */
	public static final JsonpDeserializer<UsageResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			UsageResponse::setupUsageResponseDeserializer, Builder::build);

	protected static void setupUsageResponseDeserializer(DelegatingDeserializer<UsageResponse.Builder> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(NodeUsage._DESERIALIZER), "nodes");

	}

}
