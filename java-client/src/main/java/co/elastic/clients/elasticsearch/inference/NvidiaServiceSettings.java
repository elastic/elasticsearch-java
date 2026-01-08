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

// typedef: inference._types.NvidiaServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.NvidiaServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class NvidiaServiceSettings implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final String url;

	private final String modelId;

	@Nullable
	private final Integer maxInputTokens;

	@Nullable
	private final NvidiaSimilarityType similarity;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private NvidiaServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.url = builder.url;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.maxInputTokens = builder.maxInputTokens;
		this.similarity = builder.similarity;
		this.rateLimit = builder.rateLimit;

	}

	public static NvidiaServiceSettings of(Function<Builder, ObjectBuilder<NvidiaServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for your Nvidia endpoint. Can be found in
	 * <code>API Keys</code> section of Nvidia account settings.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * The URL of the Nvidia model endpoint. If not provided, the default endpoint
	 * URL is used depending on the task type:
	 * <ul>
	 * <li>For <code>text_embedding</code> task -
	 * <code>https://integrate.api.nvidia.com/v1/embeddings</code>.</li>
	 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
	 * <code>https://integrate.api.nvidia.com/v1/chat/completions</code>.</li>
	 * <li>For <code>rerank</code> task -
	 * <code>https://ai.api.nvidia.com/v1/retrieval/nvidia/reranking</code>.</li>
	 * </ul>
	 * <p>
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
		return this.url;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * model's documentation for the name if needed. Service has been tested and
	 * confirmed to be working with the following models:
	 * <ul>
	 * <li>For <code>text_embedding</code> task -
	 * <code>nvidia/llama-3.2-nv-embedqa-1b-v2</code>.</li>
	 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
	 * <code>microsoft/phi-3-mini-128k-instruct</code>.</li>
	 * <li>For <code>rerank</code> task - <code>nv-rerank-qa-mistral-4b:1</code>.
	 * Service doesn't support <code>text_embedding</code> task
	 * <code>baai/bge-m3</code> and <code>nvidia/nvclip</code> models due to them
	 * not recognizing the <code>input_type</code> parameter.</li>
	 * </ul>
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * For a <code>text_embedding</code> task, the maximum number of tokens per
	 * input. Inputs exceeding this value are truncated prior to sending to the
	 * Nvidia API.
	 * <p>
	 * API name: {@code max_input_tokens}
	 */
	@Nullable
	public final Integer maxInputTokens() {
		return this.maxInputTokens;
	}

	/**
	 * For a <code>text_embedding</code> task, the similarity measure. One of
	 * cosine, dot_product, l2_norm.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final NvidiaSimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the Nvidia API. By default, the <code>nvidia</code> service sets the number
	 * of requests allowed per minute to 3000.
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

		if (this.url != null) {
			generator.writeKey("url");
			generator.write(this.url);

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.maxInputTokens != null) {
			generator.writeKey("max_input_tokens");
			generator.write(this.maxInputTokens);

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
	 * Builder for {@link NvidiaServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NvidiaServiceSettings> {
		private String apiKey;

		@Nullable
		private String url;

		private String modelId;

		@Nullable
		private Integer maxInputTokens;

		@Nullable
		private NvidiaSimilarityType similarity;

		@Nullable
		private RateLimitSetting rateLimit;

		/**
		 * Required - A valid API key for your Nvidia endpoint. Can be found in
		 * <code>API Keys</code> section of Nvidia account settings.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * The URL of the Nvidia model endpoint. If not provided, the default endpoint
		 * URL is used depending on the task type:
		 * <ul>
		 * <li>For <code>text_embedding</code> task -
		 * <code>https://integrate.api.nvidia.com/v1/embeddings</code>.</li>
		 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
		 * <code>https://integrate.api.nvidia.com/v1/chat/completions</code>.</li>
		 * <li>For <code>rerank</code> task -
		 * <code>https://ai.api.nvidia.com/v1/retrieval/nvidia/reranking</code>.</li>
		 * </ul>
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(@Nullable String value) {
			this.url = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * model's documentation for the name if needed. Service has been tested and
		 * confirmed to be working with the following models:
		 * <ul>
		 * <li>For <code>text_embedding</code> task -
		 * <code>nvidia/llama-3.2-nv-embedqa-1b-v2</code>.</li>
		 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
		 * <code>microsoft/phi-3-mini-128k-instruct</code>.</li>
		 * <li>For <code>rerank</code> task - <code>nv-rerank-qa-mistral-4b:1</code>.
		 * Service doesn't support <code>text_embedding</code> task
		 * <code>baai/bge-m3</code> and <code>nvidia/nvclip</code> models due to them
		 * not recognizing the <code>input_type</code> parameter.</li>
		 * </ul>
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the maximum number of tokens per
		 * input. Inputs exceeding this value are truncated prior to sending to the
		 * Nvidia API.
		 * <p>
		 * API name: {@code max_input_tokens}
		 */
		public final Builder maxInputTokens(@Nullable Integer value) {
			this.maxInputTokens = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the similarity measure. One of
		 * cosine, dot_product, l2_norm.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable NvidiaSimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Nvidia API. By default, the <code>nvidia</code> service sets the number
		 * of requests allowed per minute to 3000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Nvidia API. By default, the <code>nvidia</code> service sets the number
		 * of requests allowed per minute to 3000.
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
		 * Builds a {@link NvidiaServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NvidiaServiceSettings build() {
			_checkSingleUse();

			return new NvidiaServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NvidiaServiceSettings}
	 */
	public static final JsonpDeserializer<NvidiaServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NvidiaServiceSettings::setupNvidiaServiceSettingsDeserializer);

	protected static void setupNvidiaServiceSettingsDeserializer(ObjectDeserializer<NvidiaServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::maxInputTokens, JsonpDeserializer.integerDeserializer(), "max_input_tokens");
		op.add(Builder::similarity, NvidiaSimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
