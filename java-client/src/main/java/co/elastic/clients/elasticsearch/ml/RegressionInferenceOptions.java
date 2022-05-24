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

import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfig;
import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfigVariant;
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

// typedef: ml._types.RegressionInferenceOptions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.RegressionInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class RegressionInferenceOptions
		implements
			InferenceConfigUpdateVariant,
			InferenceConfigCreateVariant,
			InferenceConfigVariant,
			JsonpSerializable {
	@Nullable
	private final String resultsField;

	@Nullable
	private final Integer numTopFeatureImportanceValues;

	// ---------------------------------------------------------------------------------------------

	private RegressionInferenceOptions(Builder builder) {

		this.resultsField = builder.resultsField;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;

	}

	public static RegressionInferenceOptions of(Function<Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigUpdate variant kind.
	 */
	@Override
	public InferenceConfigUpdate.Kind _inferenceConfigUpdateKind() {
		return InferenceConfigUpdate.Kind.Regression;
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.Regression;
	}

	/**
	 * InferenceConfig variant kind.
	 */
	@Override
	public InferenceConfig.Kind _inferenceConfigKind() {
		return InferenceConfig.Kind.Regression;
	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction. Defaults to predicted_value.
	 * <p>
	 * API name: {@code results_field}
	 */
	@Nullable
	public final String resultsField() {
		return this.resultsField;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.numTopFeatureImportanceValues != null) {
			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegressionInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RegressionInferenceOptions> {
		@Nullable
		private String resultsField;

		@Nullable
		private Integer numTopFeatureImportanceValues;

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction. Defaults to predicted_value.
		 * <p>
		 * API name: {@code results_field}
		 */
		public final Builder resultsField(@Nullable String value) {
			this.resultsField = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RegressionInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RegressionInferenceOptions build() {
			_checkSingleUse();

			return new RegressionInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RegressionInferenceOptions}
	 */
	public static final JsonpDeserializer<RegressionInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RegressionInferenceOptions::setupRegressionInferenceOptionsDeserializer);

	protected static void setupRegressionInferenceOptionsDeserializer(
			ObjectDeserializer<RegressionInferenceOptions.Builder> op) {

		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.integerDeserializer(),
				"num_top_feature_importance_values");

	}

}
