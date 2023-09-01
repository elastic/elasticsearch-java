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

// typedef: ml._types.DataframeEvaluationClassification

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationClassification">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationClassification implements DataframeEvaluationVariant, JsonpSerializable {
	private final String actualField;

	@Nullable
	private final String predictedField;

	@Nullable
	private final String topClassesField;

	@Nullable
	private final DataframeEvaluationClassificationMetrics metrics;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationClassification(Builder builder) {

		this.actualField = ApiTypeHelper.requireNonNull(builder.actualField, this, "actualField");
		this.predictedField = builder.predictedField;
		this.topClassesField = builder.topClassesField;
		this.metrics = builder.metrics;

	}

	public static DataframeEvaluationClassification of(
			Function<Builder, ObjectBuilder<DataframeEvaluationClassification>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeEvaluation variant kind.
	 */
	@Override
	public DataframeEvaluation.Kind _dataframeEvaluationKind() {
		return DataframeEvaluation.Kind.Classification;
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
	 * The field in the index which contains the predicted value, in other words the
	 * results of the classification analysis.
	 * <p>
	 * API name: {@code predicted_field}
	 */
	@Nullable
	public final String predictedField() {
		return this.predictedField;
	}

	/**
	 * The field of the index which is an array of documents of the form {
	 * &quot;class_name&quot;: XXX, &quot;class_probability&quot;: YYY }. This field
	 * must be defined as nested in the mappings.
	 * <p>
	 * API name: {@code top_classes_field}
	 */
	@Nullable
	public final String topClassesField() {
		return this.topClassesField;
	}

	/**
	 * Specifies the metrics that are used for the evaluation.
	 * <p>
	 * API name: {@code metrics}
	 */
	@Nullable
	public final DataframeEvaluationClassificationMetrics metrics() {
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

		if (this.predictedField != null) {
			generator.writeKey("predicted_field");
			generator.write(this.predictedField);

		}
		if (this.topClassesField != null) {
			generator.writeKey("top_classes_field");
			generator.write(this.topClassesField);

		}
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
	 * Builder for {@link DataframeEvaluationClassification}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeEvaluationClassification> {
		private String actualField;

		@Nullable
		private String predictedField;

		@Nullable
		private String topClassesField;

		@Nullable
		private DataframeEvaluationClassificationMetrics metrics;

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
		 * The field in the index which contains the predicted value, in other words the
		 * results of the classification analysis.
		 * <p>
		 * API name: {@code predicted_field}
		 */
		public final Builder predictedField(@Nullable String value) {
			this.predictedField = value;
			return this;
		}

		/**
		 * The field of the index which is an array of documents of the form {
		 * &quot;class_name&quot;: XXX, &quot;class_probability&quot;: YYY }. This field
		 * must be defined as nested in the mappings.
		 * <p>
		 * API name: {@code top_classes_field}
		 */
		public final Builder topClassesField(@Nullable String value) {
			this.topClassesField = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation.
		 * <p>
		 * API name: {@code metrics}
		 */
		public final Builder metrics(@Nullable DataframeEvaluationClassificationMetrics value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Specifies the metrics that are used for the evaluation.
		 * <p>
		 * API name: {@code metrics}
		 */
		public final Builder metrics(
				Function<DataframeEvaluationClassificationMetrics.Builder, ObjectBuilder<DataframeEvaluationClassificationMetrics>> fn) {
			return this.metrics(fn.apply(new DataframeEvaluationClassificationMetrics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationClassification}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationClassification build() {
			_checkSingleUse();

			return new DataframeEvaluationClassification(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationClassification}
	 */
	public static final JsonpDeserializer<DataframeEvaluationClassification> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluationClassification::setupDataframeEvaluationClassificationDeserializer);

	protected static void setupDataframeEvaluationClassificationDeserializer(
			ObjectDeserializer<DataframeEvaluationClassification.Builder> op) {

		op.add(Builder::actualField, JsonpDeserializer.stringDeserializer(), "actual_field");
		op.add(Builder::predictedField, JsonpDeserializer.stringDeserializer(), "predicted_field");
		op.add(Builder::topClassesField, JsonpDeserializer.stringDeserializer(), "top_classes_field");
		op.add(Builder::metrics, DataframeEvaluationClassificationMetrics._DESERIALIZER, "metrics");

	}

}
