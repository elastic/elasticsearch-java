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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.TrainedModelTree
@JsonpDeserializable
public final class TrainedModelTree implements JsonpSerializable {
	@Nullable
	private final List<String> classificationLabels;

	private final List<String> featureNames;

	@Nullable
	private final String targetType;

	private final List<TrainedModelTreeNode> treeStructure;

	// ---------------------------------------------------------------------------------------------

	public TrainedModelTree(Builder builder) {

		this.classificationLabels = ModelTypeHelper.unmodifiable(builder.classificationLabels);
		this.featureNames = ModelTypeHelper.unmodifiableNonNull(builder.featureNames, "feature_names");
		this.targetType = builder.targetType;
		this.treeStructure = ModelTypeHelper.unmodifiableNonNull(builder.treeStructure, "tree_structure");

	}

	public TrainedModelTree(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code classification_labels}
	 */
	@Nullable
	public List<String> classificationLabels() {
		return this.classificationLabels;
	}

	/**
	 * Required - API name: {@code feature_names}
	 */
	public List<String> featureNames() {
		return this.featureNames;
	}

	/**
	 * API name: {@code target_type}
	 */
	@Nullable
	public String targetType() {
		return this.targetType;
	}

	/**
	 * Required - API name: {@code tree_structure}
	 */
	public List<TrainedModelTreeNode> treeStructure() {
		return this.treeStructure;
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

		if (this.classificationLabels != null) {

			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("feature_names");
		generator.writeStartArray();
		for (String item0 : this.featureNames) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.targetType != null) {

			generator.writeKey("target_type");
			generator.write(this.targetType);

		}

		generator.writeKey("tree_structure");
		generator.writeStartArray();
		for (TrainedModelTreeNode item0 : this.treeStructure) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelTree}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelTree> {
		@Nullable
		private List<String> classificationLabels;

		private List<String> featureNames;

		@Nullable
		private String targetType;

		private List<TrainedModelTreeNode> treeStructure;

		/**
		 * API name: {@code classification_labels}
		 */
		public Builder classificationLabels(@Nullable List<String> value) {
			this.classificationLabels = value;
			return this;
		}

		/**
		 * API name: {@code classification_labels}
		 */
		public Builder classificationLabels(String... value) {
			this.classificationLabels = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #classificationLabels(List)}, creating the list if
		 * needed.
		 */
		public Builder addClassificationLabels(String value) {
			if (this.classificationLabels == null) {
				this.classificationLabels = new ArrayList<>();
			}
			this.classificationLabels.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 */
		public Builder featureNames(List<String> value) {
			this.featureNames = value;
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 */
		public Builder featureNames(String... value) {
			this.featureNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #featureNames(List)}, creating the list if needed.
		 */
		public Builder addFeatureNames(String value) {
			if (this.featureNames == null) {
				this.featureNames = new ArrayList<>();
			}
			this.featureNames.add(value);
			return this;
		}

		/**
		 * API name: {@code target_type}
		 */
		public Builder targetType(@Nullable String value) {
			this.targetType = value;
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 */
		public Builder treeStructure(List<TrainedModelTreeNode> value) {
			this.treeStructure = value;
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 */
		public Builder treeStructure(TrainedModelTreeNode... value) {
			this.treeStructure = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #treeStructure(List)}, creating the list if needed.
		 */
		public Builder addTreeStructure(TrainedModelTreeNode value) {
			if (this.treeStructure == null) {
				this.treeStructure = new ArrayList<>();
			}
			this.treeStructure.add(value);
			return this;
		}

		/**
		 * Set {@link #treeStructure(List)} to a singleton list.
		 */
		public Builder treeStructure(Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>> fn) {
			return this.treeStructure(fn.apply(new TrainedModelTreeNode.Builder()).build());
		}

		/**
		 * Add a value to {@link #treeStructure(List)}, creating the list if needed.
		 */
		public Builder addTreeStructure(
				Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>> fn) {
			return this.addTreeStructure(fn.apply(new TrainedModelTreeNode.Builder()).build());
		}

		/**
		 * Builds a {@link TrainedModelTree}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelTree build() {

			return new TrainedModelTree(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelTree}
	 */
	public static final JsonpDeserializer<TrainedModelTree> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TrainedModelTree::setupTrainedModelTreeDeserializer, Builder::build);

	protected static void setupTrainedModelTreeDeserializer(DelegatingDeserializer<TrainedModelTree.Builder> op) {

		op.add(Builder::classificationLabels,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "classification_labels");
		op.add(Builder::featureNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_names");
		op.add(Builder::targetType, JsonpDeserializer.stringDeserializer(), "target_type");
		op.add(Builder::treeStructure, JsonpDeserializer.arrayDeserializer(TrainedModelTreeNode._DESERIALIZER),
				"tree_structure");

	}

}
