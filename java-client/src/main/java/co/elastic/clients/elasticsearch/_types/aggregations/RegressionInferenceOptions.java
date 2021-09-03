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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RegressionInferenceOptions
public final class RegressionInferenceOptions implements ToJsonp {
	private final String resultsField;

	@Nullable
	private final Number numTopFeatureImportanceValues;

	// ---------------------------------------------------------------------------------------------

	protected RegressionInferenceOptions(Builder builder) {

		this.resultsField = Objects.requireNonNull(builder.resultsField, "results_field");
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;

	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction. Defaults to predicted_value.
	 * <p>
	 * API name: {@code results_field}
	 */
	public String resultsField() {
		return this.resultsField;
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
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("results_field");
		generator.write(this.resultsField);

		if (this.numTopFeatureImportanceValues != null) {

			generator.writeKey("num_top_feature_importance_values");
			generator.write(this.numTopFeatureImportanceValues.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegressionInferenceOptions}.
	 */
	public static class Builder implements ObjectBuilder<RegressionInferenceOptions> {
		private String resultsField;

		@Nullable
		private Number numTopFeatureImportanceValues;

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction. Defaults to predicted_value.
		 * <p>
		 * API name: {@code results_field}
		 */
		public Builder resultsField(String value) {
			this.resultsField = value;
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
		 * Builds a {@link RegressionInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RegressionInferenceOptions build() {

			return new RegressionInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RegressionInferenceOptions
	 */
	public static final JsonpDeserializer<RegressionInferenceOptions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RegressionInferenceOptions::setupRegressionInferenceOptionsDeserializer);

	protected static void setupRegressionInferenceOptionsDeserializer(
			DelegatingDeserializer<RegressionInferenceOptions.Builder> op) {

		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.numberDeserializer(),
				"num_top_feature_importance_values");

	}

}
