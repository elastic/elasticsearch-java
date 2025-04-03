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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.Float;
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

// typedef: inference._types.VoyageAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.VoyageAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class VoyageAIServiceSettings implements JsonpSerializable {
	@Nullable
	private final Integer dimensions;

	private final String modelId;

	@Nullable
	private final RateLimitSetting rateLimit;

	@Nullable
	private final Float embeddingType;

	// ---------------------------------------------------------------------------------------------

	private VoyageAIServiceSettings(Builder builder) {

		this.dimensions = builder.dimensions;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.rateLimit = builder.rateLimit;
		this.embeddingType = builder.embeddingType;

	}

	public static VoyageAIServiceSettings of(Function<Builder, ObjectBuilder<VoyageAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of dimensions for resulting output embeddings. This setting maps
	 * to <code>output_dimension</code> in the VoyageAI documentation. Only for the
	 * <code>text_embedding</code> task type.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * VoyageAI documentation for the list of available text embedding and rerank
	 * models.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * VoyageAI. The <code>voyageai</code> service sets a default number of requests
	 * allowed per minute depending on the task type. For both
	 * <code>text_embedding</code> and <code>rerank</code>, it is set to
	 * <code>2000</code>.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * The data type for the embeddings to be returned. This setting maps to
	 * <code>output_dtype</code> in the VoyageAI documentation. Permitted values:
	 * float, int8, bit. <code>int8</code> is a synonym of <code>byte</code> in the
	 * VoyageAI documentation. <code>bit</code> is a synonym of <code>binary</code>
	 * in the VoyageAI documentation. Only for the <code>text_embedding</code> task
	 * type.
	 * <p>
	 * API name: {@code embedding_type}
	 */
	@Nullable
	public final Float embeddingType() {
		return this.embeddingType;
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

		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		if (this.embeddingType != null) {
			generator.writeKey("embedding_type");
			generator.write(this.embeddingType);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VoyageAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<VoyageAIServiceSettings> {
		@Nullable
		private Integer dimensions;

		private String modelId;

		@Nullable
		private RateLimitSetting rateLimit;

		@Nullable
		private Float embeddingType;

		/**
		 * The number of dimensions for resulting output embeddings. This setting maps
		 * to <code>output_dimension</code> in the VoyageAI documentation. Only for the
		 * <code>text_embedding</code> task type.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * VoyageAI documentation for the list of available text embedding and rerank
		 * models.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * VoyageAI. The <code>voyageai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For both
		 * <code>text_embedding</code> and <code>rerank</code>, it is set to
		 * <code>2000</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * VoyageAI. The <code>voyageai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For both
		 * <code>text_embedding</code> and <code>rerank</code>, it is set to
		 * <code>2000</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * The data type for the embeddings to be returned. This setting maps to
		 * <code>output_dtype</code> in the VoyageAI documentation. Permitted values:
		 * float, int8, bit. <code>int8</code> is a synonym of <code>byte</code> in the
		 * VoyageAI documentation. <code>bit</code> is a synonym of <code>binary</code>
		 * in the VoyageAI documentation. Only for the <code>text_embedding</code> task
		 * type.
		 * <p>
		 * API name: {@code embedding_type}
		 */
		public final Builder embeddingType(@Nullable Float value) {
			this.embeddingType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VoyageAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VoyageAIServiceSettings build() {
			_checkSingleUse();

			return new VoyageAIServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VoyageAIServiceSettings}
	 */
	public static final JsonpDeserializer<VoyageAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VoyageAIServiceSettings::setupVoyageAIServiceSettingsDeserializer);

	protected static void setupVoyageAIServiceSettingsDeserializer(
			ObjectDeserializer<VoyageAIServiceSettings.Builder> op) {

		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::embeddingType, JsonpDeserializer.floatDeserializer(), "embedding_type");

	}

}
