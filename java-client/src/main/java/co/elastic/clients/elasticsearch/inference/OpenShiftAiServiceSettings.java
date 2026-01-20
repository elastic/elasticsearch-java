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

// typedef: inference._types.OpenShiftAiServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.OpenShiftAiServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenShiftAiServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String url;

	@Nullable
	private final String modelId;

	@Nullable
	private final Integer maxInputTokens;

	@Nullable
	private final OpenShiftAiSimilarityType similarity;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private OpenShiftAiServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");
		this.modelId = builder.modelId;
		this.maxInputTokens = builder.maxInputTokens;
		this.similarity = builder.similarity;
		this.rateLimit = builder.rateLimit;

	}

	public static OpenShiftAiServiceSettings of(Function<Builder, ObjectBuilder<OpenShiftAiServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for your OpenShift AI endpoint. Can be found in
	 * <code>Token authentication</code> section of model related information.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * Required - The URL of the OpenShift AI hosted model endpoint.
	 * <p>
	 * API name: {@code url}
	 */
	public final String url() {
		return this.url;
	}

	/**
	 * The name of the model to use for the inference task. Refer to the hosted
	 * model's documentation for the name if needed. Service has been tested and
	 * confirmed to be working with the following models:
	 * <ul>
	 * <li>For <code>text_embedding</code> task - <code>gritlm-7b</code>.</li>
	 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
	 * <code>llama-31-8b-instruct</code>.</li>
	 * <li>For <code>rerank</code> task - <code>bge-reranker-v2-m3</code>.</li>
	 * </ul>
	 * <p>
	 * API name: {@code model_id}
	 */
	@Nullable
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
	 * cosine, dot_product, l2_norm. If not specified, the default dot_product value
	 * is used.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final OpenShiftAiSimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the OpenShift AI API. By default, the <code>openshift_ai</code> service sets
	 * the number of requests allowed per minute to 3000.
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

		generator.writeKey("url");
		generator.write(this.url);

		if (this.modelId != null) {
			generator.writeKey("model_id");
			generator.write(this.modelId);

		}
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
	 * Builder for {@link OpenShiftAiServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OpenShiftAiServiceSettings> {
		private String apiKey;

		private String url;

		@Nullable
		private String modelId;

		@Nullable
		private Integer maxInputTokens;

		@Nullable
		private OpenShiftAiSimilarityType similarity;

		@Nullable
		private RateLimitSetting rateLimit;

		public Builder() {
		}
		private Builder(OpenShiftAiServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.url = instance.url;
			this.modelId = instance.modelId;
			this.maxInputTokens = instance.maxInputTokens;
			this.similarity = instance.similarity;
			this.rateLimit = instance.rateLimit;

		}
		/**
		 * Required - A valid API key for your OpenShift AI endpoint. Can be found in
		 * <code>Token authentication</code> section of model related information.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Required - The URL of the OpenShift AI hosted model endpoint.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		/**
		 * The name of the model to use for the inference task. Refer to the hosted
		 * model's documentation for the name if needed. Service has been tested and
		 * confirmed to be working with the following models:
		 * <ul>
		 * <li>For <code>text_embedding</code> task - <code>gritlm-7b</code>.</li>
		 * <li>For <code>completion</code> and <code>chat_completion</code> tasks -
		 * <code>llama-31-8b-instruct</code>.</li>
		 * <li>For <code>rerank</code> task - <code>bge-reranker-v2-m3</code>.</li>
		 * </ul>
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(@Nullable String value) {
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
		 * cosine, dot_product, l2_norm. If not specified, the default dot_product value
		 * is used.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable OpenShiftAiSimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the OpenShift AI API. By default, the <code>openshift_ai</code> service sets
		 * the number of requests allowed per minute to 3000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the OpenShift AI API. By default, the <code>openshift_ai</code> service sets
		 * the number of requests allowed per minute to 3000.
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
		 * Builds a {@link OpenShiftAiServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenShiftAiServiceSettings build() {
			_checkSingleUse();

			return new OpenShiftAiServiceSettings(this);
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
	 * Json deserializer for {@link OpenShiftAiServiceSettings}
	 */
	public static final JsonpDeserializer<OpenShiftAiServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OpenShiftAiServiceSettings::setupOpenShiftAiServiceSettingsDeserializer);

	protected static void setupOpenShiftAiServiceSettingsDeserializer(
			ObjectDeserializer<OpenShiftAiServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::maxInputTokens, JsonpDeserializer.integerDeserializer(), "max_input_tokens");
		op.add(Builder::similarity, OpenShiftAiSimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
