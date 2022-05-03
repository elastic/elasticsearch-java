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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.TrainedModelTree

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.TrainedModelTree">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelTree implements JsonpSerializable {
	private final List<String> classificationLabels;

	private final List<String> featureNames;

	@Nullable
	private final String targetType;

	private final List<TrainedModelTreeNode> treeStructure;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelTree(Builder builder) {

		this.classificationLabels = ApiTypeHelper.unmodifiable(builder.classificationLabels);
		this.featureNames = ApiTypeHelper.unmodifiableRequired(builder.featureNames, this, "featureNames");
		this.targetType = builder.targetType;
		this.treeStructure = ApiTypeHelper.unmodifiableRequired(builder.treeStructure, this, "treeStructure");

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

		if (ApiTypeHelper.isDefined(this.classificationLabels)) {
			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.featureNames)) {
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
		if (ApiTypeHelper.isDefined(this.treeStructure)) {
			generator.writeKey("tree_structure");
			generator.writeStartArray();
			for (TrainedModelTreeNode item0 : this.treeStructure) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link TrainedModelTree}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TrainedModelTree> {
		@Nullable
		private List<String> classificationLabels;

		private List<String> featureNames;

		@Nullable
		private String targetType;

		private List<TrainedModelTreeNode> treeStructure;

		/**
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(List<String> list) {
			this.classificationLabels = _listAddAll(this.classificationLabels, list);
			return this;
		}

		/**
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds one or more values to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(String value, String... values) {
			this.classificationLabels = _listAdd(this.classificationLabels, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureNames</code>.
		 */
		public final Builder featureNames(List<String> list) {
			this.featureNames = _listAddAll(this.featureNames, list);
			return this;
		}

		/**
		 * Required - API name: {@code feature_names}
		 * <p>
		 * Adds one or more values to <code>featureNames</code>.
		 */
		public final Builder featureNames(String value, String... values) {
			this.featureNames = _listAdd(this.featureNames, value, values);
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>treeStructure</code>.
		 */
		public final Builder treeStructure(List<TrainedModelTreeNode> list) {
			this.treeStructure = _listAddAll(this.treeStructure, list);
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 * <p>
		 * Adds one or more values to <code>treeStructure</code>.
		 */
		public final Builder treeStructure(TrainedModelTreeNode value, TrainedModelTreeNode... values) {
			this.treeStructure = _listAdd(this.treeStructure, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code tree_structure}
		 * <p>
		 * Adds a value to <code>treeStructure</code> using a builder lambda.
		 */
		public final Builder treeStructure(
				Function<TrainedModelTreeNode.Builder, ObjectBuilder<TrainedModelTreeNode>> fn) {
			return treeStructure(fn.apply(new TrainedModelTreeNode.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			TrainedModelTree::setupTrainedModelTreeDeserializer);

	protected static void setupTrainedModelTreeDeserializer(ObjectDeserializer<TrainedModelTree.Builder> op) {

		op.add(Builder::classificationLabels,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "classification_labels");
		op.add(Builder::featureNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_names");
		op.add(Builder::targetType, JsonpDeserializer.stringDeserializer(), "target_type");
		op.add(Builder::treeStructure, JsonpDeserializer.arrayDeserializer(TrainedModelTreeNode._DESERIALIZER),
				"tree_structure");

	}

}
