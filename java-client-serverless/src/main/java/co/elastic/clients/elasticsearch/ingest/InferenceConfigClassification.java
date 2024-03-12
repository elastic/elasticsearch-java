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

package co.elastic.clients.elasticsearch.ingest;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ingest._types.InferenceConfigClassification

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.InferenceConfigClassification">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceConfigClassification implements InferenceConfigVariant, JsonpSerializable {
	@Nullable
	private final Integer numTopClasses;

	@Nullable
	private final Integer numTopFeatureImportanceValues;

	@Nullable
	private final String resultsField;

	@Nullable
	private final String topClassesResultsField;

	@Nullable
	private final String predictionFieldType;

	// ---------------------------------------------------------------------------------------------

	private InferenceConfigClassification(Builder builder) {

		this.numTopClasses = builder.numTopClasses;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;
		this.resultsField = builder.resultsField;
		this.topClassesResultsField = builder.topClassesResultsField;
		this.predictionFieldType = builder.predictionFieldType;

	}

	public static InferenceConfigClassification of(Function<Builder, ObjectBuilder<InferenceConfigClassification>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfig variant kind.
	 */
	@Override
	public InferenceConfig.Kind _inferenceConfigKind() {
		return InferenceConfig.Kind.Classification;
	}

	/**
	 * Specifies the number of top class predictions to return.
	 * <p>
	 * API name: {@code num_top_classes}
	 */
	@Nullable
	public final Integer numTopClasses() {
		return this.numTopClasses;
	}

	/**
	 * Specifies the maximum number of feature importance values per document.
	 * <p>
	 * API name: {@code num_top_feature_importance_values}
	 */
	@Nullable
	public final Integer numTopFeatureImportanceValues() {
		return this.numTopFeatureImportanceValues;
	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction.
	 * <p>
	 * API name: {@code results_field}
	 */
	@Nullable
	public final String resultsField() {
		return this.resultsField;
	}

	/**
	 * Specifies the field to which the top classes are written.
	 * <p>
	 * API name: {@code top_classes_results_field}
	 */
	@Nullable
	public final String topClassesResultsField() {
		return this.topClassesResultsField;
	}

	/**
	 * Specifies the type of the predicted field to write. Valid values are:
	 * <code>string</code>, <code>number</code>, <code>boolean</code>.
	 * <p>
	 * API name: {@code prediction_field_type}
	 */
	@Nullable
	public final String predictionFieldType() {
		return this.predictionFieldType;
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
			generator.write(this.numTopClasses);

		}
		if (this.numTopFeatureImportanceValues != null) {
			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues);

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.topClassesResultsField != null) {
			generator.writeKey("top_classes_results_field");
			generator.write(this.topClassesResultsField);

		}
		if (this.predictionFieldType != null) {
			generator.writeKey("prediction_field_type");
			generator.write(this.predictionFieldType);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfigClassification}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferenceConfigClassification> {
		@Nullable
		private Integer numTopClasses;

		@Nullable
		private Integer numTopFeatureImportanceValues;

		@Nullable
		private String resultsField;

		@Nullable
		private String topClassesResultsField;

		@Nullable
		private String predictionFieldType;

		/**
		 * Specifies the number of top class predictions to return.
		 * <p>
		 * API name: {@code num_top_classes}
		 */
		public final Builder numTopClasses(@Nullable Integer value) {
			this.numTopClasses = value;
			return this;
		}

		/**
		 * Specifies the maximum number of feature importance values per document.
		 * <p>
		 * API name: {@code num_top_feature_importance_values}
		 */
		public final Builder numTopFeatureImportanceValues(@Nullable Integer value) {
			this.numTopFeatureImportanceValues = value;
			return this;
		}

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction.
		 * <p>
		 * API name: {@code results_field}
		 */
		public final Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * Specifies the field to which the top classes are written.
		 * <p>
		 * API name: {@code top_classes_results_field}
		 */
		public final Builder topClassesResultsField(@Nullable String value) {
			this.topClassesResultsField = value;
			return this;
		}

		/**
		 * Specifies the type of the predicted field to write. Valid values are:
		 * <code>string</code>, <code>number</code>, <code>boolean</code>.
		 * <p>
		 * API name: {@code prediction_field_type}
		 */
		public final Builder predictionFieldType(@Nullable String value) {
			this.predictionFieldType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceConfigClassification}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfigClassification build() {
			_checkSingleUse();

			return new InferenceConfigClassification(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceConfigClassification}
	 */
	public static final JsonpDeserializer<InferenceConfigClassification> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceConfigClassification::setupInferenceConfigClassificationDeserializer);

	protected static void setupInferenceConfigClassificationDeserializer(
			ObjectDeserializer<InferenceConfigClassification.Builder> op) {

		op.add(Builder::numTopClasses, JsonpDeserializer.integerDeserializer(), "num_top_classes");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.integerDeserializer(),
				"num_top_feature_importance_values");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::topClassesResultsField, JsonpDeserializer.stringDeserializer(), "top_classes_results_field");
		op.add(Builder::predictionFieldType, JsonpDeserializer.stringDeserializer(), "prediction_field_type");

	}

}
