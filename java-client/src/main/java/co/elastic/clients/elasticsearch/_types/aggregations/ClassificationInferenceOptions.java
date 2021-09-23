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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ClassificationInferenceOptions
public final class ClassificationInferenceOptions implements JsonpSerializable {
	@Nullable
	private final Number numTopClasses;

	@Nullable
	private final Number numTopFeatureImportanceValues;

	@Nullable
	private final String predictionFieldType;

	@Nullable
	private final String resultsField;

	@Nullable
	private final String topClassesResultsField;

	// ---------------------------------------------------------------------------------------------

	public ClassificationInferenceOptions(Builder builder) {

		this.numTopClasses = builder.numTopClasses;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;
		this.predictionFieldType = builder.predictionFieldType;
		this.resultsField = builder.resultsField;
		this.topClassesResultsField = builder.topClassesResultsField;

	}

	/**
	 * Specifies the number of top class predictions to return. Defaults to 0.
	 * <p>
	 * API name: {@code num_top_classes}
	 */
	@Nullable
	public Number numTopClasses() {
		return this.numTopClasses;
	}

	/**
	 * Specifies the maximum number of feature importance values per document. By
	 * default, it is zero and no feature importance calculation occurs.
	 * <p>
	 * API name: {@code num_top_feature_importance_values}
	 */
	@Nullable
	public Number numTopFeatureImportanceValues() {
		return this.numTopFeatureImportanceValues;
	}

	/**
	 * Specifies the type of the predicted field to write. Acceptable values are:
	 * string, number, boolean. When boolean is provided 1.0 is transformed to true
	 * and 0.0 to false.
	 * <p>
	 * API name: {@code prediction_field_type}
	 */
	@Nullable
	public String predictionFieldType() {
		return this.predictionFieldType;
	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction. Defaults to predicted_value.
	 * <p>
	 * API name: {@code results_field}
	 */
	@Nullable
	public String resultsField() {
		return this.resultsField;
	}

	/**
	 * Specifies the field to which the top classes are written. Defaults to
	 * top_classes.
	 * <p>
	 * API name: {@code top_classes_results_field}
	 */
	@Nullable
	public String topClassesResultsField() {
		return this.topClassesResultsField;
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

		if (this.numTopClasses != null) {

			generator.writeKey("num_top_classes");
			generator.write(this.numTopClasses.doubleValue());

		}
		if (this.numTopFeatureImportanceValues != null) {

			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues.doubleValue());

		}
		if (this.predictionFieldType != null) {

			generator.writeKey("prediction_field_type");
			generator.write(this.predictionFieldType);

		}
		if (this.resultsField != null) {

			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.topClassesResultsField != null) {

			generator.writeKey("top_classes_results_field");
			generator.write(this.topClassesResultsField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClassificationInferenceOptions}.
	 */
	public static class Builder implements ObjectBuilder<ClassificationInferenceOptions> {
		@Nullable
		private Number numTopClasses;

		@Nullable
		private Number numTopFeatureImportanceValues;

		@Nullable
		private String predictionFieldType;

		@Nullable
		private String resultsField;

		@Nullable
		private String topClassesResultsField;

		/**
		 * Specifies the number of top class predictions to return. Defaults to 0.
		 * <p>
		 * API name: {@code num_top_classes}
		 */
		public Builder numTopClasses(@Nullable Number value) {
			this.numTopClasses = value;
			return this;
		}

		/**
		 * Specifies the maximum number of feature importance values per document. By
		 * default, it is zero and no feature importance calculation occurs.
		 * <p>
		 * API name: {@code num_top_feature_importance_values}
		 */
		public Builder numTopFeatureImportanceValues(@Nullable Number value) {
			this.numTopFeatureImportanceValues = value;
			return this;
		}

		/**
		 * Specifies the type of the predicted field to write. Acceptable values are:
		 * string, number, boolean. When boolean is provided 1.0 is transformed to true
		 * and 0.0 to false.
		 * <p>
		 * API name: {@code prediction_field_type}
		 */
		public Builder predictionFieldType(@Nullable String value) {
			this.predictionFieldType = value;
			return this;
		}

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction. Defaults to predicted_value.
		 * <p>
		 * API name: {@code results_field}
		 */
		public Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * Specifies the field to which the top classes are written. Defaults to
		 * top_classes.
		 * <p>
		 * API name: {@code top_classes_results_field}
		 */
		public Builder topClassesResultsField(@Nullable String value) {
			this.topClassesResultsField = value;
			return this;
		}

		/**
		 * Builds a {@link ClassificationInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClassificationInferenceOptions build() {

			return new ClassificationInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClassificationInferenceOptions}
	 */
	public static final JsonpDeserializer<ClassificationInferenceOptions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClassificationInferenceOptions::setupClassificationInferenceOptionsDeserializer);

	protected static void setupClassificationInferenceOptionsDeserializer(
			DelegatingDeserializer<ClassificationInferenceOptions.Builder> op) {

		op.add(Builder::numTopClasses, JsonpDeserializer.numberDeserializer(), "num_top_classes");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.numberDeserializer(),
				"num_top_feature_importance_values");
		op.add(Builder::predictionFieldType, JsonpDeserializer.stringDeserializer(), "prediction_field_type");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::topClassesResultsField, JsonpDeserializer.stringDeserializer(), "top_classes_results_field");

	}

}
