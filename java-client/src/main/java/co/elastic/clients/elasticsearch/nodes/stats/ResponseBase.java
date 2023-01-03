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

package co.elastic.clients.elasticsearch.nodes.stats;

import co.elastic.clients.elasticsearch.nodes.NodesResponseBase;
import co.elastic.clients.elasticsearch.nodes.Stats;
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

// typedef: nodes.stats.ResponseBase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.stats.ResponseBase">API
 *      specification</a>
 */

public abstract class ResponseBase extends NodesResponseBase {
	@Nullable
	private final String clusterName;

	private final Map<String, Stats> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.clusterName = builder.clusterName;
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	/**
	 * API name: {@code cluster_name}
	 */
	@Nullable
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, Stats> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.clusterName != null) {
			generator.writeKey("cluster_name");
			generator.write(this.clusterName);

		}
		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, Stats> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NodesResponseBase.AbstractBuilder<BuilderT> {
		@Nullable
		private String clusterName;

		private Map<String, Stats> nodes;

		/**
		 * API name: {@code cluster_name}
		 */
		public final BuilderT clusterName(@Nullable String value) {
			this.clusterName = value;
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final BuilderT nodes(Map<String, Stats> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final BuilderT nodes(String key, Stats value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final BuilderT nodes(String key, Function<Stats.Builder, ObjectBuilder<Stats>> fn) {
			return nodes(key, fn.apply(new Stats.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(AbstractBuilder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(AbstractBuilder::nodes, JsonpDeserializer.stringMapDeserializer(Stats._DESERIALIZER), "nodes");

	}

}
