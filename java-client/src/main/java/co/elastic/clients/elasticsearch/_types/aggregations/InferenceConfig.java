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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceConfigContainer
public final class InferenceConfig implements JsonpSerializable {
	@Nullable
	private final RegressionInferenceOptions regression;

	@Nullable
	private final ClassificationInferenceOptions classification;

	// ---------------------------------------------------------------------------------------------

	public InferenceConfig(Builder builder) {

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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.regression != null) {

			generator.writeKey("regression");
			this.regression.serialize(generator, mapper);

		}
		if (this.classification != null) {

			generator.writeKey("classification");
			this.classification.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfig}.
	 */
	public static class Builder implements ObjectBuilder<InferenceConfig> {
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
		 * Builds a {@link InferenceConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfig build() {

			return new InferenceConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceConfig}
	 */
	public static final JsonpDeserializer<InferenceConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InferenceConfig::setupInferenceConfigDeserializer);

	protected static void setupInferenceConfigDeserializer(DelegatingDeserializer<InferenceConfig.Builder> op) {

		op.add(Builder::regression, RegressionInferenceOptions.DESERIALIZER, "regression");
		op.add(Builder::classification, ClassificationInferenceOptions.DESERIALIZER, "classification");

	}

}
