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

// typedef: inference._types.FireworksAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.FireworksAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class FireworksAIServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String modelId;

	@Nullable
	private final String url;

	@Nullable
	private final Integer dimensions;

	@Nullable
	private final FireworksAISimilarityType similarity;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private FireworksAIServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.url = builder.url;
		this.dimensions = builder.dimensions;
		this.similarity = builder.similarity;
		this.rateLimit = builder.rateLimit;

	}

	public static FireworksAIServiceSettings of(Function<Builder, ObjectBuilder<FireworksAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for your Fireworks AI account. You can find or
	 * create your API keys in the Fireworks AI dashboard.
	 * <p>
	 * IMPORTANT: You need to provide the API key only once, during the inference
	 * model creation. The get inference endpoint API does not retrieve your API
	 * key.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * Fireworks AI documentation for the list of available models for chat
	 * completion, completion, and text embedding. For text embedding, supported
	 * models include the Qwen3 embedding family (e.g.
	 * <code>fireworks/qwen3-embedding-8b</code>) and other models in the Fireworks
	 * model library.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The URL endpoint to use for the requests. If not provided, the default
	 * Fireworks AI API endpoint is used.
	 * <p>
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
		return this.url;
	}

	/**
	 * For a <code>text_embedding</code> task, the number of dimensions the
	 * resulting output embeddings should have. Variable-length embeddings are
	 * supported via this parameter.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
	}

	/**
	 * For a <code>text_embedding</code> task, the similarity measure. One of
	 * cosine, dot_product, l2_norm.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final FireworksAISimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the Fireworks AI API. Rate limit grouping is per API key only. By default,
	 * the <code>fireworksai</code> service sets the number of requests allowed per
	 * minute to 6000.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
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

		generator.writeKey("api_key");
		generator.write(this.apiKey);

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.url != null) {
			generator.writeKey("url");
			generator.write(this.url);

		}
		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			this.similarity.serialize(generator, mapper);
		}
		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FireworksAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FireworksAIServiceSettings> {
		private String apiKey;

		private String modelId;

		@Nullable
		private String url;

		@Nullable
		private Integer dimensions;

		@Nullable
		private FireworksAISimilarityType similarity;

		@Nullable
		private RateLimitSetting rateLimit;

		public Builder() {
		}
		private Builder(FireworksAIServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.modelId = instance.modelId;
			this.url = instance.url;
			this.dimensions = instance.dimensions;
			this.similarity = instance.similarity;
			this.rateLimit = instance.rateLimit;

		}
		/**
		 * Required - A valid API key for your Fireworks AI account. You can find or
		 * create your API keys in the Fireworks AI dashboard.
		 * <p>
		 * IMPORTANT: You need to provide the API key only once, during the inference
		 * model creation. The get inference endpoint API does not retrieve your API
		 * key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * Fireworks AI documentation for the list of available models for chat
		 * completion, completion, and text embedding. For text embedding, supported
		 * models include the Qwen3 embedding family (e.g.
		 * <code>fireworks/qwen3-embedding-8b</code>) and other models in the Fireworks
		 * model library.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The URL endpoint to use for the requests. If not provided, the default
		 * Fireworks AI API endpoint is used.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(@Nullable String value) {
			this.url = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the number of dimensions the
		 * resulting output embeddings should have. Variable-length embeddings are
		 * supported via this parameter.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the similarity measure. One of
		 * cosine, dot_product, l2_norm.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable FireworksAISimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Fireworks AI API. Rate limit grouping is per API key only. By default,
		 * the <code>fireworksai</code> service sets the number of requests allowed per
		 * minute to 6000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Fireworks AI API. Rate limit grouping is per API key only. By default,
		 * the <code>fireworksai</code> service sets the number of requests allowed per
		 * minute to 6000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FireworksAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FireworksAIServiceSettings build() {
			_checkSingleUse();

			return new FireworksAIServiceSettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FireworksAIServiceSettings}
	 */
	public static final JsonpDeserializer<FireworksAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FireworksAIServiceSettings::setupFireworksAIServiceSettingsDeserializer);

	protected static void setupFireworksAIServiceSettingsDeserializer(
			ObjectDeserializer<FireworksAIServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");
		op.add(Builder::similarity, FireworksAISimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
