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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.TrainedModelTreeNode

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.TrainedModelTreeNode">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelTreeNode implements JsonpSerializable {
	@Nullable
	private final String decisionType;

	@Nullable
	private final Boolean defaultLeft;

	@Nullable
	private final Double leafValue;

	@Nullable
	private final Integer leftChild;

	private final int nodeIndex;

	@Nullable
	private final Integer rightChild;

	@Nullable
	private final Integer splitFeature;

	@Nullable
	private final Integer splitGain;

	@Nullable
	private final Double threshold;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelTreeNode(Builder builder) {

		this.decisionType = builder.decisionType;
		this.defaultLeft = builder.defaultLeft;
		this.leafValue = builder.leafValue;
		this.leftChild = builder.leftChild;
		this.nodeIndex = ApiTypeHelper.requireNonNull(builder.nodeIndex, this, "nodeIndex");
		this.rightChild = builder.rightChild;
		this.splitFeature = builder.splitFeature;
		this.splitGain = builder.splitGain;
		this.threshold = builder.threshold;

	}

	public static TrainedModelTreeNode of(Function<Builder, ObjectBuilder<TrainedModelTreeNode>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code decision_type}
	 */
	@Nullable
	public final String decisionType() {
		return this.decisionType;
	}

	/**
	 * API name: {@code default_left}
	 */
	@Nullable
	public final Boolean defaultLeft() {
		return this.defaultLeft;
	}

	/**
	 * API name: {@code leaf_value}
	 */
	@Nullable
	public final Double leafValue() {
		return this.leafValue;
	}

	/**
	 * API name: {@code left_child}
	 */
	@Nullable
	public final Integer leftChild() {
		return this.leftChild;
	}

	/**
	 * Required - API name: {@code node_index}
	 */
	public final int nodeIndex() {
		return this.nodeIndex;
	}

	/**
	 * API name: {@code right_child}
	 */
	@Nullable
	public final Integer rightChild() {
		return this.rightChild;
	}

	/**
	 * API name: {@code split_feature}
	 */
	@Nullable
	public final Integer splitFeature() {
		return this.splitFeature;
	}

	/**
	 * API name: {@code split_gain}
	 */
	@Nullable
	public final Integer splitGain() {
		return this.splitGain;
	}

	/**
	 * API name: {@code threshold}
	 */
	@Nullable
	public final Double threshold() {
		return this.threshold;
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

		if (this.decisionType != null) {
			generator.writeKey("decision_type");
			generator.write(this.decisionType);

		}
		if (this.defaultLeft != null) {
			generator.writeKey("default_left");
			generator.write(this.defaultLeft);

		}
		if (this.leafValue != null) {
			generator.writeKey("leaf_value");
			generator.write(this.leafValue);

		}
		if (this.leftChild != null) {
			generator.writeKey("left_child");
			generator.write(this.leftChild);

		}
		generator.writeKey("node_index");
		generator.write(this.nodeIndex);

		if (this.rightChild != null) {
			generator.writeKey("right_child");
			generator.write(this.rightChild);

		}
		if (this.splitFeature != null) {
			generator.writeKey("split_feature");
			generator.write(this.splitFeature);

		}
		if (this.splitGain != null) {
			generator.writeKey("split_gain");
			generator.write(this.splitGain);

		}
		if (this.threshold != null) {
			generator.writeKey("threshold");
			generator.write(this.threshold);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelTreeNode}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelTreeNode> {
		@Nullable
		private String decisionType;

		@Nullable
		private Boolean defaultLeft;

		@Nullable
		private Double leafValue;

		@Nullable
		private Integer leftChild;

		private Integer nodeIndex;

		@Nullable
		private Integer rightChild;

		@Nullable
		private Integer splitFeature;

		@Nullable
		private Integer splitGain;

		@Nullable
		private Double threshold;

		/**
		 * API name: {@code decision_type}
		 */
		public final Builder decisionType(@Nullable String value) {
			this.decisionType = value;
			return this;
		}

		/**
		 * API name: {@code default_left}
		 */
		public final Builder defaultLeft(@Nullable Boolean value) {
			this.defaultLeft = value;
			return this;
		}

		/**
		 * API name: {@code leaf_value}
		 */
		public final Builder leafValue(@Nullable Double value) {
			this.leafValue = value;
			return this;
		}

		/**
		 * API name: {@code left_child}
		 */
		public final Builder leftChild(@Nullable Integer value) {
			this.leftChild = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_index}
		 */
		public final Builder nodeIndex(int value) {
			this.nodeIndex = value;
			return this;
		}

		/**
		 * API name: {@code right_child}
		 */
		public final Builder rightChild(@Nullable Integer value) {
			this.rightChild = value;
			return this;
		}

		/**
		 * API name: {@code split_feature}
		 */
		public final Builder splitFeature(@Nullable Integer value) {
			this.splitFeature = value;
			return this;
		}

		/**
		 * API name: {@code split_gain}
		 */
		public final Builder splitGain(@Nullable Integer value) {
			this.splitGain = value;
			return this;
		}

		/**
		 * API name: {@code threshold}
		 */
		public final Builder threshold(@Nullable Double value) {
			this.threshold = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelTreeNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelTreeNode build() {
			_checkSingleUse();

			return new TrainedModelTreeNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelTreeNode}
	 */
	public static final JsonpDeserializer<TrainedModelTreeNode> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelTreeNode::setupTrainedModelTreeNodeDeserializer);

	protected static void setupTrainedModelTreeNodeDeserializer(ObjectDeserializer<TrainedModelTreeNode.Builder> op) {

		op.add(Builder::decisionType, JsonpDeserializer.stringDeserializer(), "decision_type");
		op.add(Builder::defaultLeft, JsonpDeserializer.booleanDeserializer(), "default_left");
		op.add(Builder::leafValue, JsonpDeserializer.doubleDeserializer(), "leaf_value");
		op.add(Builder::leftChild, JsonpDeserializer.integerDeserializer(), "left_child");
		op.add(Builder::nodeIndex, JsonpDeserializer.integerDeserializer(), "node_index");
		op.add(Builder::rightChild, JsonpDeserializer.integerDeserializer(), "right_child");
		op.add(Builder::splitFeature, JsonpDeserializer.integerDeserializer(), "split_feature");
		op.add(Builder::splitGain, JsonpDeserializer.integerDeserializer(), "split_gain");
		op.add(Builder::threshold, JsonpDeserializer.doubleDeserializer(), "threshold");

	}

}
