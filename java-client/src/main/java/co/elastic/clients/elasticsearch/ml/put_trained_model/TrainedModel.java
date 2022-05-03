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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.TrainedModel

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.TrainedModel">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModel implements JsonpSerializable {
	@Nullable
	private final TrainedModelTree tree;

	@Nullable
	private final TrainedModelTreeNode treeNode;

	@Nullable
	private final Ensemble ensemble;

	// ---------------------------------------------------------------------------------------------

	private TrainedModel(Builder builder) {

		this.tree = builder.tree;
		this.treeNode = builder.treeNode;
		this.ensemble = builder.ensemble;

	}

	public static TrainedModel of(Function<Builder, ObjectBuilder<TrainedModel>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The definition for a binary decision tree.
	 * <p>
	 * API name: {@code tree}
	 */
	@Nullable
	public final TrainedModelTree tree() {
		return this.tree;
	}

	/**
	 * The definition of a node in a tree. There are two major types of nodes: leaf
	 * nodes and not-leaf nodes.
	 * <ul>
	 * <li>Leaf nodes only need node_index and leaf_value defined.</li>
	 * <li>All other nodes need split_feature, left_child, right_child, threshold,
	 * decision_type, and default_left defined.</li>
	 * </ul>
	 * <p>
	 * API name: {@code tree_node}
	 */
	@Nullable
	public final TrainedModelTreeNode treeNode() {
		return this.treeNode;
	}

	/**
	 * The definition for an ensemble model
	 * <p>
	 * API name: {@code ensemble}
	 */
	@Nullable
	public final Ensemble ensemble() {
		return this.ensemble;
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

		if (this.tree != null) {
			generator.writeKey("tree");
			this.tree.serialize(generator, mapper);

		}
		if (this.treeNode != null) {
			generator.writeKey("tree_node");
			this.treeNode.serialize(generator, mapper);

		}
		if (this.ensemble != null) {
			generator.writeKey("ensemble");
			this.ensemble.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModel}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TrainedModel> {
		@Nullable
		private TrainedModelTree tree;

		@Nullable
		private TrainedModelTreeNode treeNode;

		@Nullable
		private Ensemble ensemble;

		/**
		 * The definition for a binary decision tree.
		 * <p>
		 * API name: {@code tree}
		 */
		public final Builder tree(@Nullable TrainedModelTree value) {
			this.tree = value;
			return this;
		}

		/**
		 * The definition for a binary decision tree.
		 * <p>
		 * API name: {@code tree}
		 */
		public final Builder tree(Function<TrainedModelTree.Builder, ObjectBuilder<TrainedModelTree>> fn) {
			return this.tree(fn.apply(new TrainedModelTree.Builder()).build());
		}

		/**
		 * The definition of a node in a tree. There are two major types of nodes: leaf
		 * nodes and not-leaf nodes.
		 * <ul>
		 * <li>Leaf nodes only need node_index and leaf_value defined.</li>
		 * <li>All other nodes need split_feature, left_child, right_child, threshold,
		 * decision_type, and default_left defined.</li>
		 * </ul>
		 * <p>
		 * API name: {@code tree_node}
		 */
		public final Builder treeNode(@Nullable TrainedModelTreeNode value) {
			this.treeNode = value;
			return this;
		}

		/**
		 * The definition of a node in a tree. There are two major types of nodes: leaf
		 * nodes and not-leaf nodes.
		 * <ul>
		 * <li>Leaf nodes only need node_index and leaf_value defined.</li>
		 * <li>All other nodes need split_feature, left_child, right_child, threshold,
		 * decision_type, and default_left defined.</li>
		 * </ul>
		 * <p>
		 * API name: {@code tree_node}
		 */
		public final Builder treeNode(Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>> fn) {
			return this.treeNode(fn.apply(new TrainedModelTreeNode.Builder()).build());
		}

		/**
		 * The definition for an ensemble model
		 * <p>
		 * API name: {@code ensemble}
		 */
		public final Builder ensemble(@Nullable Ensemble value) {
			this.ensemble = value;
			return this;
		}

		/**
		 * The definition for an ensemble model
		 * <p>
		 * API name: {@code ensemble}
		 */
		public final Builder ensemble(Function<Ensemble.Builder, ObjectBuilder<Ensemble>> fn) {
			return this.ensemble(fn.apply(new Ensemble.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModel build() {
			_checkSingleUse();

			return new TrainedModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModel}
	 */
	public static final JsonpDeserializer<TrainedModel> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TrainedModel::setupTrainedModelDeserializer);

	protected static void setupTrainedModelDeserializer(ObjectDeserializer<TrainedModel.Builder> op) {

		op.add(Builder::tree, TrainedModelTree._DESERIALIZER, "tree");
		op.add(Builder::treeNode, TrainedModelTreeNode._DESERIALIZER, "tree_node");
		op.add(Builder::ensemble, Ensemble._DESERIALIZER, "ensemble");

	}

}
