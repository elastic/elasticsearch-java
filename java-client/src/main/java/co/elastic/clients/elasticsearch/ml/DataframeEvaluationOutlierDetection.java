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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationOutlierDetection

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationOutlierDetection">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationOutlierDetection implements DataframeEvaluationVariant, JsonpSerializable {
	private final String actualField;

	private final String predictedProbabilityField;

	@Nullable
	private final DataframeEvaluationOutlierDetectionMetrics metrics;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationOutlierDetection(Builder builder) {

		this.actualField = ApiTypeHelper.requireNonNull(builder.actualField, this, "actualField");
		this.predictedProbabilityField = ApiTypeHelper.requireNonNull(builder.predictedProbabilityField, this,
				"predictedProbabilityField");
		this.metrics = builder.metrics;

	}

	public static DataframeEvaluationOutlierDetection of(
			Function<Builder, ObjectBuilder<DataframeEvaluationOutlierDetection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeEvaluation variant kind.
	 */
	@Override
	public DataframeEvaluation.Kind _dataframeEvaluationKind() {
		return DataframeEvaluation.Kind.OutlierDetection;
	}

	/**
	 * Required - The field of the index which contains the ground truth. The data
	 * type of this field can be boolean or integer. If the data type is integer,
	 * the value has to be either 0 (false) or 1 (true).
	 * <p>
	 * API name: {@code actual_field}
	 */
	public final String actualField() {
		return this.actualField;
	}

	/**
	 * Required - The field of the index that defines the probability of whether the
	 * item belongs to the class in question or not. It’s the field that contains
	 * the results of the analysis.
	 * <p>
	 * API name: {@code predicted_probability_field}
	 */
	public final String predictedProbabilityField() {
		return this.predictedProbabilityField;
	}

	/**
	 * Specifies the metrics that are used for the evaluation.
	 * <p>
	 * API name: {@code metrics}
	 */
	@Nullable
	public final DataframeEvaluationOutlierDetectionMetrics metrics() {
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

		generator.writeKey("predicted_probability_field");
		generator.write(this.predictedProbabilityField);

		if (this.metrics != null) {
			generator.writeKey("metrics");
			this.metrics.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationOutlierDetection}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeEvaluationOutlierDetection> {
		private String actualField;

		private String predictedProbabilityField;

		@Nullable
		private DataframeEvaluationOutlierDetectionMetrics metrics;

		/**
		 * Required - The field of the index which contains the ground truth. The data
		 * type of this field can be boolean or integer. If the data type is integer,
		 * the value has to be either 0 (false) or 1 (true).
		 * <p>
		 * API name: {@code actual_field}
		 */
		public final Builder actualField(String value) {
			this.actualField = value;
			return this;
		}

		/**
		 * Required - The field of the index that defines the probability of whether the
		 * item belongs to the class in question or not. It’s the field that contains
		 * the results of the analysis.
		 * <p>
		 * API name: {@code predicted_probability_field}
		 */
		public final Builder predictedProbabilityField(String value) {
			this.predictedProbabilityField = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation.
		 * <p>
		 * API name: {@code metrics}
		 */
		public final Builder metrics(@Nullable DataframeEvaluationOutlierDetectionMetrics value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation.
		 * <p>
		 * API name: {@code metrics}
		 */
		public final Builder metrics(
				Function<DataframeEvaluationOutlierDetectionMetrics.Builder, ObjectBuilder<DataframeEvaluationOutlierDetectionMetrics>> fn) {
			return this.metrics(fn.apply(new DataframeEvaluationOutlierDetectionMetrics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationOutlierDetection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationOutlierDetection build() {
			_checkSingleUse();

			return new DataframeEvaluationOutlierDetection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationOutlierDetection}
	 */
	public static final JsonpDeserializer<DataframeEvaluationOutlierDetection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationOutlierDetection::setupDataframeEvaluationOutlierDetectionDeserializer);

	protected static void setupDataframeEvaluationOutlierDetectionDeserializer(
			ObjectDeserializer<DataframeEvaluationOutlierDetection.Builder> op) {

		op.add(Builder::actualField, JsonpDeserializer.stringDeserializer(), "actual_field");
		op.add(Builder::predictedProbabilityField, JsonpDeserializer.stringDeserializer(),
				"predicted_probability_field");
		op.add(Builder::metrics, DataframeEvaluationOutlierDetectionMetrics._DESERIALIZER, "metrics");

	}

}
