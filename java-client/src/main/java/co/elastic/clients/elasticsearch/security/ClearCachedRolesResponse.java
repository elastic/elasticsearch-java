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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.clear_cached_roles.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.clear_cached_roles.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClearCachedRolesResponse implements JsonpSerializable {
	private final NodeStatistics nodeStats;

	private final String clusterName;

	private final Map<String, ClusterNode> nodes;

	// ---------------------------------------------------------------------------------------------

	private ClearCachedRolesResponse(Builder builder) {

		this.nodeStats = ApiTypeHelper.requireNonNull(builder.nodeStats, this, "nodeStats");
		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static ClearCachedRolesResponse of(Function<Builder, ObjectBuilder<ClearCachedRolesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _nodes}
	 */
	public final NodeStatistics nodeStats() {
		return this.nodeStats;
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, ClusterNode> nodes() {
		return this.nodes;
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

		generator.writeKey("_nodes");
		this.nodeStats.serialize(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, ClusterNode> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedRolesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClearCachedRolesResponse> {
		private NodeStatistics nodeStats;

		private String clusterName;

		private Map<String, ClusterNode> nodes;

		/**
		 * Required - API name: {@code _nodes}
		 */
		public final Builder nodeStats(NodeStatistics value) {
			this.nodeStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code _nodes}
		 */
		public final Builder nodeStats(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this.nodeStats(fn.apply(new NodeStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final Builder nodes(Map<String, ClusterNode> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final Builder nodes(String key, ClusterNode value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(String key, Function<ClusterNode.Builder, ObjectBuilder<ClusterNode>> fn) {
			return nodes(key, fn.apply(new ClusterNode.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearCachedRolesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedRolesResponse build() {
			_checkSingleUse();

			return new ClearCachedRolesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClearCachedRolesResponse}
	 */
	public static final JsonpDeserializer<ClearCachedRolesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClearCachedRolesResponse::setupClearCachedRolesResponseDeserializer);

	protected static void setupClearCachedRolesResponseDeserializer(
			ObjectDeserializer<ClearCachedRolesResponse.Builder> op) {

		op.add(Builder::nodeStats, NodeStatistics._DESERIALIZER, "_nodes");
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(ClusterNode._DESERIALIZER), "nodes");

	}

}
