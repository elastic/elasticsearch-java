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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RegressionInferenceOptions
@JsonpDeserializable
public final class RegressionInferenceOptions implements JsonpSerializable {
	@Nullable
	private final String resultsField;

	@Nullable
	private final Integer numTopFeatureImportanceValues;

	// ---------------------------------------------------------------------------------------------

	public RegressionInferenceOptions(Builder builder) {

		this.resultsField = builder.resultsField;
		this.numTopFeatureImportanceValues = builder.numTopFeatureImportanceValues;

	}

	public RegressionInferenceOptions(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
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
	 * Specifies the maximum number of feature importance values per document. By
	 * default, it is zero and no feature importance calculation occurs.
	 * <p>
	 * API name: {@code num_top_feature_importance_values}
	 */
	@Nullable
	public Integer numTopFeatureImportanceValues() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegressionInferenceOptions}.
	 */
	public static class Builder implements ObjectBuilder<RegressionInferenceOptions> {
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
		public Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * Specifies the maximum number of feature importance values per document. By
		 * default, it is zero and no feature importance calculation occurs.
		 * <p>
		 * API name: {@code num_top_feature_importance_values}
		 */
		public Builder numTopFeatureImportanceValues(@Nullable Integer value) {
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
	 * Json deserializer for {@link RegressionInferenceOptions}
	 */
	public static final JsonpDeserializer<RegressionInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, RegressionInferenceOptions::setupRegressionInferenceOptionsDeserializer, Builder::build);

	protected static void setupRegressionInferenceOptionsDeserializer(
			DelegatingDeserializer<RegressionInferenceOptions.Builder> op) {

		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::numTopFeatureImportanceValues, JsonpDeserializer.integerDeserializer(),
				"num_top_feature_importance_values");

	}

}
