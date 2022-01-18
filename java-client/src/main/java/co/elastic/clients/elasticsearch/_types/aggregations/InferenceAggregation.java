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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.InferenceAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceAggregation extends PipelineAggregationBase implements AggregationVariant {
	private final String modelId;

	@Nullable
	private final InferenceConfig inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	private InferenceAggregation(Builder builder) {
		super(builder);

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.inferenceConfig = builder.inferenceConfig;

	}

	public static InferenceAggregation of(Function<Builder, ObjectBuilder<InferenceAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Inference;
	}

	/**
	 * Required - API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * API name: {@code inference_config}
	 */
	@Nullable
	public final InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.inferenceConfig != null) {
			generator.writeKey("inference_config");
			this.inferenceConfig.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceAggregation> {
		private String modelId;

		@Nullable
		private InferenceConfig inferenceConfig;

		/**
		 * Required - API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(@Nullable InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceAggregation build() {
			_checkSingleUse();

			return new InferenceAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceAggregation}
	 */
	public static final JsonpDeserializer<InferenceAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceAggregation::setupInferenceAggregationDeserializer);

	protected static void setupInferenceAggregationDeserializer(ObjectDeserializer<InferenceAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");

	}

}
