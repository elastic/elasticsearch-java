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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.infer_trained_model_deployment.Response

@JsonpDeserializable
public class InferTrainedModelDeploymentResponse implements JsonpSerializable {
	private final List<TrainedModelEntities> entities;

	@Nullable
	private final Boolean isTruncated;

	private final List<String> predictedValue;

	@Nullable
	private final String predictedValueSequence;

	@Nullable
	private final Double predictionProbability;

	private final List<TopClassEntry> topClasses;

	@Nullable
	private final String warning;

	// ---------------------------------------------------------------------------------------------

	private InferTrainedModelDeploymentResponse(Builder builder) {

		this.entities = ApiTypeHelper.unmodifiable(builder.entities);
		this.isTruncated = builder.isTruncated;
		this.predictedValue = ApiTypeHelper.unmodifiable(builder.predictedValue);
		this.predictedValueSequence = builder.predictedValueSequence;
		this.predictionProbability = builder.predictionProbability;
		this.topClasses = ApiTypeHelper.unmodifiableRequired(builder.topClasses, this, "topClasses");
		this.warning = builder.warning;

	}

	public static InferTrainedModelDeploymentResponse of(
			Function<Builder, ObjectBuilder<InferTrainedModelDeploymentResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If the model is trained for named entity recognition (NER) tasks, the
	 * response contains the recognized entities.
	 * <p>
	 * API name: {@code entities}
	 */
	public final List<TrainedModelEntities> entities() {
		return this.entities;
	}

	/**
	 * Indicates whether the input text was truncated to meet the model's maximum
	 * sequence length limit. This property is present only when it is true.
	 * <p>
	 * API name: {@code is_truncated}
	 */
	@Nullable
	public final Boolean isTruncated() {
		return this.isTruncated;
	}

	/**
	 * If the model is trained for a text classification or zero shot classification
	 * task, the response is the predicted class. For named entity recognition (NER)
	 * tasks, it contains the annotated text output. For fill mask tasks, it
	 * contains the top prediction for replacing the mask token. For text embedding
	 * tasks, it contains the raw numerical text embedding values.
	 * <p>
	 * API name: {@code predicted_value}
	 */
	public final List<String> predictedValue() {
		return this.predictedValue;
	}

	/**
	 * For fill mask tasks, the response contains the input text sequence with the
	 * mask token replaced by the predicted value.
	 * <p>
	 * API name: {@code predicted_value_sequence}
	 */
	@Nullable
	public final String predictedValueSequence() {
		return this.predictedValueSequence;
	}

	/**
	 * Specifies a confidence score for the predicted value.
	 * <p>
	 * API name: {@code prediction_probability}
	 */
	@Nullable
	public final Double predictionProbability() {
		return this.predictionProbability;
	}

	/**
	 * Required - For fill mask, text classification, and zero shot classification
	 * tasks, the response contains a list of top class entries.
	 * <p>
	 * API name: {@code top_classes}
	 */
	public final List<TopClassEntry> topClasses() {
		return this.topClasses;
	}

	/**
	 * If the request failed, the response contains the reason for the failure.
	 * <p>
	 * API name: {@code warning}
	 */
	@Nullable
	public final String warning() {
		return this.warning;
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

		if (ApiTypeHelper.isDefined(this.entities)) {
			generator.writeKey("entities");
			generator.writeStartArray();
			for (TrainedModelEntities item0 : this.entities) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.isTruncated != null) {
			generator.writeKey("is_truncated");
			generator.write(this.isTruncated);

		}
		if (ApiTypeHelper.isDefined(this.predictedValue)) {
			generator.writeKey("predicted_value");
			generator.writeStartArray();
			for (String item0 : this.predictedValue) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.predictedValueSequence != null) {
			generator.writeKey("predicted_value_sequence");
			generator.write(this.predictedValueSequence);

		}
		if (this.predictionProbability != null) {
			generator.writeKey("prediction_probability");
			generator.write(this.predictionProbability);

		}
		if (ApiTypeHelper.isDefined(this.topClasses)) {
			generator.writeKey("top_classes");
			generator.writeStartArray();
			for (TopClassEntry item0 : this.topClasses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.warning != null) {
			generator.writeKey("warning");
			generator.write(this.warning);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferTrainedModelDeploymentResponse}.
	 */

	public static class Builder extends ObjectBuilderBase
			implements
				ObjectBuilder<InferTrainedModelDeploymentResponse> {
		@Nullable
		private List<TrainedModelEntities> entities;

		@Nullable
		private Boolean isTruncated;

		@Nullable
		private List<String> predictedValue;

		@Nullable
		private String predictedValueSequence;

		@Nullable
		private Double predictionProbability;

		private List<TopClassEntry> topClasses;

		@Nullable
		private String warning;

		/**
		 * If the model is trained for named entity recognition (NER) tasks, the
		 * response contains the recognized entities.
		 * <p>
		 * API name: {@code entities}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>entities</code>.
		 */
		public final Builder entities(List<TrainedModelEntities> list) {
			this.entities = _listAddAll(this.entities, list);
			return this;
		}

		/**
		 * If the model is trained for named entity recognition (NER) tasks, the
		 * response contains the recognized entities.
		 * <p>
		 * API name: {@code entities}
		 * <p>
		 * Adds one or more values to <code>entities</code>.
		 */
		public final Builder entities(TrainedModelEntities value, TrainedModelEntities... values) {
			this.entities = _listAdd(this.entities, value, values);
			return this;
		}

		/**
		 * If the model is trained for named entity recognition (NER) tasks, the
		 * response contains the recognized entities.
		 * <p>
		 * API name: {@code entities}
		 * <p>
		 * Adds a value to <code>entities</code> using a builder lambda.
		 */
		public final Builder entities(Function<TrainedModelEntities.Builder, ObjectBuilder<TrainedModelEntities>> fn) {
			return entities(fn.apply(new TrainedModelEntities.Builder()).build());
		}

		/**
		 * Indicates whether the input text was truncated to meet the model's maximum
		 * sequence length limit. This property is present only when it is true.
		 * <p>
		 * API name: {@code is_truncated}
		 */
		public final Builder isTruncated(@Nullable Boolean value) {
			this.isTruncated = value;
			return this;
		}

		/**
		 * If the model is trained for a text classification or zero shot classification
		 * task, the response is the predicted class. For named entity recognition (NER)
		 * tasks, it contains the annotated text output. For fill mask tasks, it
		 * contains the top prediction for replacing the mask token. For text embedding
		 * tasks, it contains the raw numerical text embedding values.
		 * <p>
		 * API name: {@code predicted_value}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>predictedValue</code>.
		 */
		public final Builder predictedValue(List<String> list) {
			this.predictedValue = _listAddAll(this.predictedValue, list);
			return this;
		}

		/**
		 * If the model is trained for a text classification or zero shot classification
		 * task, the response is the predicted class. For named entity recognition (NER)
		 * tasks, it contains the annotated text output. For fill mask tasks, it
		 * contains the top prediction for replacing the mask token. For text embedding
		 * tasks, it contains the raw numerical text embedding values.
		 * <p>
		 * API name: {@code predicted_value}
		 * <p>
		 * Adds one or more values to <code>predictedValue</code>.
		 */
		public final Builder predictedValue(String value, String... values) {
			this.predictedValue = _listAdd(this.predictedValue, value, values);
			return this;
		}

		/**
		 * For fill mask tasks, the response contains the input text sequence with the
		 * mask token replaced by the predicted value.
		 * <p>
		 * API name: {@code predicted_value_sequence}
		 */
		public final Builder predictedValueSequence(@Nullable String value) {
			this.predictedValueSequence = value;
			return this;
		}

		/**
		 * Specifies a confidence score for the predicted value.
		 * <p>
		 * API name: {@code prediction_probability}
		 */
		public final Builder predictionProbability(@Nullable Double value) {
			this.predictionProbability = value;
			return this;
		}

		/**
		 * Required - For fill mask, text classification, and zero shot classification
		 * tasks, the response contains a list of top class entries.
		 * <p>
		 * API name: {@code top_classes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>topClasses</code>.
		 */
		public final Builder topClasses(List<TopClassEntry> list) {
			this.topClasses = _listAddAll(this.topClasses, list);
			return this;
		}

		/**
		 * Required - For fill mask, text classification, and zero shot classification
		 * tasks, the response contains a list of top class entries.
		 * <p>
		 * API name: {@code top_classes}
		 * <p>
		 * Adds one or more values to <code>topClasses</code>.
		 */
		public final Builder topClasses(TopClassEntry value, TopClassEntry... values) {
			this.topClasses = _listAdd(this.topClasses, value, values);
			return this;
		}

		/**
		 * Required - For fill mask, text classification, and zero shot classification
		 * tasks, the response contains a list of top class entries.
		 * <p>
		 * API name: {@code top_classes}
		 * <p>
		 * Adds a value to <code>topClasses</code> using a builder lambda.
		 */
		public final Builder topClasses(Function<TopClassEntry.Builder, ObjectBuilder<TopClassEntry>> fn) {
			return topClasses(fn.apply(new TopClassEntry.Builder()).build());
		}

		/**
		 * If the request failed, the response contains the reason for the failure.
		 * <p>
		 * API name: {@code warning}
		 */
		public final Builder warning(@Nullable String value) {
			this.warning = value;
			return this;
		}

		/**
		 * Builds a {@link InferTrainedModelDeploymentResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferTrainedModelDeploymentResponse build() {
			_checkSingleUse();

			return new InferTrainedModelDeploymentResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferTrainedModelDeploymentResponse}
	 */
	public static final JsonpDeserializer<InferTrainedModelDeploymentResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					InferTrainedModelDeploymentResponse::setupInferTrainedModelDeploymentResponseDeserializer);

	protected static void setupInferTrainedModelDeploymentResponseDeserializer(
			ObjectDeserializer<InferTrainedModelDeploymentResponse.Builder> op) {

		op.add(Builder::entities, JsonpDeserializer.arrayDeserializer(TrainedModelEntities._DESERIALIZER), "entities");
		op.add(Builder::isTruncated, JsonpDeserializer.booleanDeserializer(), "is_truncated");
		op.add(Builder::predictedValue, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"predicted_value");
		op.add(Builder::predictedValueSequence, JsonpDeserializer.stringDeserializer(), "predicted_value_sequence");
		op.add(Builder::predictionProbability, JsonpDeserializer.doubleDeserializer(), "prediction_probability");
		op.add(Builder::topClasses, JsonpDeserializer.arrayDeserializer(TopClassEntry._DESERIALIZER), "top_classes");
		op.add(Builder::warning, JsonpDeserializer.stringDeserializer(), "warning");

	}

}
