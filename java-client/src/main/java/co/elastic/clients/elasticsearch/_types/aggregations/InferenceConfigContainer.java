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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceConfigContainer
public final class InferenceConfigContainer implements ToJsonp {
	@Nullable
	private final RegressionInferenceOptions regression;

	@Nullable
	private final ClassificationInferenceOptions classification;

	// ---------------------------------------------------------------------------------------------

	protected InferenceConfigContainer(Builder builder) {

		this.regression = builder.regression;
		this.classification = builder.classification;

	}

	/**
	 * Regression configuration for inference.
	 * <p>
	 * API name: {@code regression}
	 */
	@Nullable
	public RegressionInferenceOptions regression() {
		return this.regression;
	}

	/**
	 * Classification configuration for inference.
	 * <p>
	 * API name: {@code classification}
	 */
	@Nullable
	public ClassificationInferenceOptions classification() {
		return this.classification;
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

		if (this.regression != null) {

			generator.writeKey("regression");
			this.regression.toJsonp(generator, mapper);

		}
		if (this.classification != null) {

			generator.writeKey("classification");
			this.classification.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfigContainer}.
	 */
	public static class Builder implements ObjectBuilder<InferenceConfigContainer> {
		@Nullable
		private RegressionInferenceOptions regression;

		@Nullable
		private ClassificationInferenceOptions classification;

		/**
		 * Regression configuration for inference.
		 * <p>
		 * API name: {@code regression}
		 */
		public Builder regression(@Nullable RegressionInferenceOptions value) {
			this.regression = value;
			return this;
		}

		/**
		 * Regression configuration for inference.
		 * <p>
		 * API name: {@code regression}
		 */
		public Builder regression(
				Function<RegressionInferenceOptions.Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
			return this.regression(fn.apply(new RegressionInferenceOptions.Builder()).build());
		}

		/**
		 * Classification configuration for inference.
		 * <p>
		 * API name: {@code classification}
		 */
		public Builder classification(@Nullable ClassificationInferenceOptions value) {
			this.classification = value;
			return this;
		}

		/**
		 * Classification configuration for inference.
		 * <p>
		 * API name: {@code classification}
		 */
		public Builder classification(
				Function<ClassificationInferenceOptions.Builder, ObjectBuilder<ClassificationInferenceOptions>> fn) {
			return this.classification(fn.apply(new ClassificationInferenceOptions.Builder()).build());
		}

		/**
		 * Builds a {@link InferenceConfigContainer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfigContainer build() {

			return new InferenceConfigContainer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InferenceConfigContainer
	 */
	public static final JsonpDeserializer<InferenceConfigContainer> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InferenceConfigContainer::setupInferenceConfigContainerDeserializer);

	protected static void setupInferenceConfigContainerDeserializer(
			DelegatingDeserializer<InferenceConfigContainer.Builder> op) {

		op.add(Builder::regression, RegressionInferenceOptions.DESERIALIZER, "regression");
		op.add(Builder::classification, ClassificationInferenceOptions.DESERIALIZER, "classification");

	}

}
