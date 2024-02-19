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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.elasticsearch.indices.IndexRouting;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes.info.NodeInfoSettingsCluster

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoSettingsCluster">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsCluster implements JsonpSerializable {
	private final String name;

	@Nullable
	private final IndexRouting routing;

	private final NodeInfoSettingsClusterElection election;

	private final List<String> initialMasterNodes;

	@Nullable
	private final DeprecationIndexing deprecationIndexing;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsCluster(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.routing = builder.routing;
		this.election = ApiTypeHelper.requireNonNull(builder.election, this, "election");
		this.initialMasterNodes = ApiTypeHelper.unmodifiable(builder.initialMasterNodes);
		this.deprecationIndexing = builder.deprecationIndexing;

	}

	public static NodeInfoSettingsCluster of(Function<Builder, ObjectBuilder<NodeInfoSettingsCluster>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final IndexRouting routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code election}
	 */
	public final NodeInfoSettingsClusterElection election() {
		return this.election;
	}

	/**
	 * API name: {@code initial_master_nodes}
	 */
	public final List<String> initialMasterNodes() {
		return this.initialMasterNodes;
	}

	/**
	 * API name: {@code deprecation_indexing}
	 */
	@Nullable
	public final DeprecationIndexing deprecationIndexing() {
		return this.deprecationIndexing;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.routing != null) {
			generator.writeKey("routing");
			this.routing.serialize(generator, mapper);

		}
		generator.writeKey("election");
		this.election.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.initialMasterNodes)) {
			generator.writeKey("initial_master_nodes");
			generator.writeStartArray();
			for (String item0 : this.initialMasterNodes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.deprecationIndexing != null) {
			generator.writeKey("deprecation_indexing");
			this.deprecationIndexing.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsCluster}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoSettingsCluster> {
		private String name;

		@Nullable
		private IndexRouting routing;

		private NodeInfoSettingsClusterElection election;

		@Nullable
		private List<String> initialMasterNodes;

		@Nullable
		private DeprecationIndexing deprecationIndexing;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable IndexRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(Function<IndexRouting.Builder, ObjectBuilder<IndexRouting>> fn) {
			return this.routing(fn.apply(new IndexRouting.Builder()).build());
		}

		/**
		 * Required - API name: {@code election}
		 */
		public final Builder election(NodeInfoSettingsClusterElection value) {
			this.election = value;
			return this;
		}

		/**
		 * Required - API name: {@code election}
		 */
		public final Builder election(
				Function<NodeInfoSettingsClusterElection.Builder, ObjectBuilder<NodeInfoSettingsClusterElection>> fn) {
			return this.election(fn.apply(new NodeInfoSettingsClusterElection.Builder()).build());
		}

		/**
		 * API name: {@code initial_master_nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>initialMasterNodes</code>.
		 */
		public final Builder initialMasterNodes(List<String> list) {
			this.initialMasterNodes = _listAddAll(this.initialMasterNodes, list);
			return this;
		}

		/**
		 * API name: {@code initial_master_nodes}
		 * <p>
		 * Adds one or more values to <code>initialMasterNodes</code>.
		 */
		public final Builder initialMasterNodes(String value, String... values) {
			this.initialMasterNodes = _listAdd(this.initialMasterNodes, value, values);
			return this;
		}

		/**
		 * API name: {@code deprecation_indexing}
		 */
		public final Builder deprecationIndexing(@Nullable DeprecationIndexing value) {
			this.deprecationIndexing = value;
			return this;
		}

		/**
		 * API name: {@code deprecation_indexing}
		 */
		public final Builder deprecationIndexing(
				Function<DeprecationIndexing.Builder, ObjectBuilder<DeprecationIndexing>> fn) {
			return this.deprecationIndexing(fn.apply(new DeprecationIndexing.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsCluster build() {
			_checkSingleUse();

			return new NodeInfoSettingsCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsCluster}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsCluster> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsCluster::setupNodeInfoSettingsClusterDeserializer);

	protected static void setupNodeInfoSettingsClusterDeserializer(
			ObjectDeserializer<NodeInfoSettingsCluster.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::routing, IndexRouting._DESERIALIZER, "routing");
		op.add(Builder::election, NodeInfoSettingsClusterElection._DESERIALIZER, "election");
		op.add(Builder::initialMasterNodes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"initial_master_nodes");
		op.add(Builder::deprecationIndexing, DeprecationIndexing._DESERIALIZER, "deprecation_indexing");

	}

}
