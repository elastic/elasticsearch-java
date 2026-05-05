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

// typedef: inference._types.LlamaServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.LlamaServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class LlamaServiceSettings implements JsonpSerializable {
	private final String url;

	private final String modelId;

	@Nullable
	private final Integer maxInputTokens;

	@Nullable
	private final LlamaSimilarityType similarity;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private LlamaServiceSettings(Builder builder) {

		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.maxInputTokens = builder.maxInputTokens;
		this.similarity = builder.similarity;
		this.rateLimit = builder.rateLimit;

	}

	public static LlamaServiceSettings of(Function<Builder, ObjectBuilder<LlamaServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The URL endpoint of the Llama stack endpoint. URL must contain:
	 * <ul>
	 * <li>For <code>text_embedding</code> task -
	 * <code>/v1/inference/embeddings</code>.</li>
	 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
	 * <code>/v1/openai/v1/chat/completions</code>.</li>
	 * </ul>
	 * <p>
	 * API name: {@code url}
	 */
	public final String url() {
		return this.url;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * Llama downloading models documentation for different ways of getting a list
	 * of available models and downloading them. Service has been tested and
	 * confirmed to be working with the following models:
	 * <ul>
	 * <li>For <code>text_embedding</code> task -
	 * <code>all-MiniLM-L6-v2</code>.</li>
	 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
	 * <code>llama3.2:3b</code>.</li>
	 * </ul>
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * For a <code>text_embedding</code> task, the maximum number of tokens per
	 * input before chunking occurs.
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
	public final LlamaSimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the Llama API. By default, the <code>llama</code> service sets the number of
	 * requests allowed per minute to 3000.
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

		generator.writeKey("url");
		generator.write(this.url);

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
	 * Builder for {@link LlamaServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LlamaServiceSettings> {
		private String url;

		private String modelId;

		@Nullable
		private Integer maxInputTokens;

		@Nullable
		private LlamaSimilarityType similarity;

		@Nullable
		private RateLimitSetting rateLimit;

		public Builder() {
		}
		private Builder(LlamaServiceSettings instance) {
			this.url = instance.url;
			this.modelId = instance.modelId;
			this.maxInputTokens = instance.maxInputTokens;
			this.similarity = instance.similarity;
			this.rateLimit = instance.rateLimit;

		}
		/**
		 * Required - The URL endpoint of the Llama stack endpoint. URL must contain:
		 * <ul>
		 * <li>For <code>text_embedding</code> task -
		 * <code>/v1/inference/embeddings</code>.</li>
		 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
		 * <code>/v1/openai/v1/chat/completions</code>.</li>
		 * </ul>
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * Llama downloading models documentation for different ways of getting a list
		 * of available models and downloading them. Service has been tested and
		 * confirmed to be working with the following models:
		 * <ul>
		 * <li>For <code>text_embedding</code> task -
		 * <code>all-MiniLM-L6-v2</code>.</li>
		 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
		 * <code>llama3.2:3b</code>.</li>
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
		 * input before chunking occurs.
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
		public final Builder similarity(@Nullable LlamaSimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Llama API. By default, the <code>llama</code> service sets the number of
		 * requests allowed per minute to 3000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Llama API. By default, the <code>llama</code> service sets the number of
		 * requests allowed per minute to 3000.
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
		 * Builds a {@link LlamaServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LlamaServiceSettings build() {
			_checkSingleUse();

			return new LlamaServiceSettings(this);
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
	 * Json deserializer for {@link LlamaServiceSettings}
	 */
	public static final JsonpDeserializer<LlamaServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LlamaServiceSettings::setupLlamaServiceSettingsDeserializer);

	protected static void setupLlamaServiceSettingsDeserializer(ObjectDeserializer<LlamaServiceSettings.Builder> op) {

		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::maxInputTokens, JsonpDeserializer.integerDeserializer(), "max_input_tokens");
		op.add(Builder::similarity, LlamaSimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
