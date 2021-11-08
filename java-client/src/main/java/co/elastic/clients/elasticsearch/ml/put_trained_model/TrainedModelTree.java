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
import co.elastic.clients.util.ObjectBuilderBase;
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
public class TrainedModelTree implements JsonpSerializable {
	private final List<String> classificationLabels;

	private final List<String> featureNames;

	@Nullable
	private final String targetType;

	private final List<TrainedModelTreeNode> treeStructure;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelTree(Builder builder) {

		this.classificationLabels = ModelTypeHelper.unmodifiable(builder.classificationLabels);
		this.featureNames = ModelTypeHelper.unmodifiableRequired(builder.featureNames, this, "featureNames");
		this.targetType = builder.targetType;
		this.treeStructure = ModelTypeHelper.unmodifiableRequired(builder.treeStructure, this, "treeStructure");

	}

	public static TrainedModelTree of(Function<Builder, ObjectBuilder<TrainedModelTree>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code classification_labels}
	 */
	public final List<String> classificationLabels() {
		return this.classificationLabels;
	}

	/**
	 * Required - API name: {@code feature_names}
	 */
	public final List<String> featureNames() {
		return this.featureNames;
	}

	/**
	 * API name: {@code target_type}
	 */
	@Nullable
	public final String targetType() {
		return this.targetType;
	}

	/**
	 * Required - API name: {@code tree_structure}
	 */
	public final List<TrainedModelTreeNode> treeStructure() {
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

		if (ModelTypeHelper.isDefined(this.classificationLabels)) {
			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.featureNames)) {
			generator.writeKey("feature_names");
			generator.writeStartArray();
			for (String item0 : this.featureNames) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.targetType != null) {
			generator.writeKey("target_type");
			generator.write(this.targetType);

		}
		if (ModelTypeHelper.isDefined(this.treeStructure)) {
			generator.writeKey("tree_structure");
			generator.writeStartArray();
			for (TrainedModelTreeNode item0 : this.treeStructure) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelTree}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelTree> {
		@Nullable
		private List<String> classificationLabels;

		private List<String> featureNames;

		@Nullable
		private String targetType;

		private List<TrainedModelTreeNode> treeStructure;

		/**
		 * API name: {@code classification_labels}
		 */
		public final Builder classificationLabels(@Nullable List<String> value) {
			this.classificationLabels = value;
			return this;
		}

		/**
		 * API name: {@code classification_labels}
		 */
		public final Builder classificationLabels(String... value) {
			this.classificationLabels = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 */
		public final Builder featureNames(List<String> value) {
			this.featureNames = value;
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 */
		public final Builder featureNames(String... value) {
			this.featureNames = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code target_type}
		 */
		public final Builder targetType(@Nullable String value) {
			this.targetType = value;
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 */
		public final Builder treeStructure(List<TrainedModelTreeNode> value) {
			this.treeStructure = value;
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 */
		public final Builder treeStructure(TrainedModelTreeNode... value) {
			this.treeStructure = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 */
		@SafeVarargs
		public final Builder treeStructure(
				Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>>... fns) {
			this.treeStructure = new ArrayList<>(fns.length);
			for (Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>> fn : fns) {
				this.treeStructure.add(fn.apply(new TrainedModelTreeNode.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link TrainedModelTree}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelTree build() {
			_checkSingleUse();

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
