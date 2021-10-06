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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationRegression
@JsonpDeserializable
public final class DataframeEvaluationRegression implements DataframeEvaluationVariant, JsonpSerializable {
	private final String actualField;

	private final String predictedField;

	@Nullable
	private final DataframeEvaluationRegressionMetrics metrics;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationRegression(Builder builder) {

		this.actualField = Objects.requireNonNull(builder.actualField, "actual_field");
		this.predictedField = Objects.requireNonNull(builder.predictedField, "predicted_field");
		this.metrics = builder.metrics;

	}

	public DataframeEvaluationRegression(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link DataframeEvaluation} variant type
	 */
	@Override
	public String _variantType() {
		return "regression";
	}

	/**
	 * Required - The field of the index which contains the ground truth. The data
	 * type of this field must be numerical.
	 * <p>
	 * API name: {@code actual_field}
	 */
	public String actualField() {
		return this.actualField;
	}

	/**
	 * Required - The field in the index that contains the predicted value, in other
	 * words the results of the regression analysis.
	 * <p>
	 * API name: {@code predicted_field}
	 */
	public String predictedField() {
		return this.predictedField;
	}

	/**
	 * Specifies the metrics that are used for the evaluation. For more information
	 * on mse, msle, and huber, consult the Jupyter notebook on regression loss
	 * functions.
	 * <p>
	 * API name: {@code metrics}
	 */
	@Nullable
	public DataframeEvaluationRegressionMetrics metrics() {
		return this.metrics;
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

		generator.writeKey("actual_field");
		generator.write(this.actualField);

		generator.writeKey("predicted_field");
		generator.write(this.predictedField);

		if (this.metrics != null) {

			generator.writeKey("metrics");
			this.metrics.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationRegression}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationRegression> {
		private String actualField;

		private String predictedField;

		@Nullable
		private DataframeEvaluationRegressionMetrics metrics;

		/**
		 * Required - The field of the index which contains the ground truth. The data
		 * type of this field must be numerical.
		 * <p>
		 * API name: {@code actual_field}
		 */
		public Builder actualField(String value) {
			this.actualField = value;
			return this;
		}

		/**
		 * Required - The field in the index that contains the predicted value, in other
		 * words the results of the regression analysis.
		 * <p>
		 * API name: {@code predicted_field}
		 */
		public Builder predictedField(String value) {
			this.predictedField = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation. For more information
		 * on mse, msle, and huber, consult the Jupyter notebook on regression loss
		 * functions.
		 * <p>
		 * API name: {@code metrics}
		 */
		public Builder metrics(@Nullable DataframeEvaluationRegressionMetrics value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation. For more information
		 * on mse, msle, and huber, consult the Jupyter notebook on regression loss
		 * functions.
		 * <p>
		 * API name: {@code metrics}
		 */
		public Builder metrics(
				Function<DataframeEvaluationRegressionMetrics.Builder, ObjectBuilder<DataframeEvaluationRegressionMetrics>> fn) {
			return this.metrics(fn.apply(new DataframeEvaluationRegressionMetrics.Builder()).build());
		}

		/**
		 * Builds a {@link DataframeEvaluationRegression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationRegression build() {

			return new DataframeEvaluationRegression(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationRegression}
	 */
	public static final JsonpDeserializer<DataframeEvaluationRegression> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, DataframeEvaluationRegression::setupDataframeEvaluationRegressionDeserializer,
			Builder::build);

	protected static void setupDataframeEvaluationRegressionDeserializer(
			DelegatingDeserializer<DataframeEvaluationRegression.Builder> op) {

		op.add(Builder::actualField, JsonpDeserializer.stringDeserializer(), "actual_field");
		op.add(Builder::predictedField, JsonpDeserializer.stringDeserializer(), "predicted_field");
		op.add(Builder::metrics, DataframeEvaluationRegressionMetrics._DESERIALIZER, "metrics");

	}

}
