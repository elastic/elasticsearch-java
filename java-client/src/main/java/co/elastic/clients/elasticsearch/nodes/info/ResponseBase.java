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

import co.elastic.clients.elasticsearch.nodes.NodesResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
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

// typedef: nodes.info.ResponseBase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.ResponseBase">API
 *      specification</a>
 */

public abstract class ResponseBase extends NodesResponseBase {
	private final String clusterName;

	private final Map<String, NodeInfo> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

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
	public final Map<String, NodeInfo> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfo> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NodesResponseBase.AbstractBuilder<BuilderT> {
		private String clusterName;

		private Map<String, NodeInfo> nodes;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final BuilderT clusterName(String value) {
			this.clusterName = value;
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final BuilderT nodes(Map<String, NodeInfo> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final BuilderT nodes(String key, NodeInfo value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final BuilderT nodes(String key, Function<NodeInfo.Builder, ObjectBuilder<NodeInfo>> fn) {
			return nodes(key, fn.apply(new NodeInfo.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(AbstractBuilder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(AbstractBuilder::nodes, JsonpDeserializer.stringMapDeserializer(NodeInfo._DESERIALIZER), "nodes");

	}

}
