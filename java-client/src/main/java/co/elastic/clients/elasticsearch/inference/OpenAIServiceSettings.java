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

// typedef: inference._types.OpenAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.OpenAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenAIServiceSettings implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final Integer dimensions;

	private final String modelId;

	@Nullable
	private final String organizationId;

	@Nullable
	private final RateLimitSetting rateLimit;

	@Nullable
	private final OpenAISimilarityType similarity;

	@Nullable
	private final String url;

	// ---------------------------------------------------------------------------------------------

	private OpenAIServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.dimensions = builder.dimensions;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.organizationId = builder.organizationId;
		this.rateLimit = builder.rateLimit;
		this.similarity = builder.similarity;
		this.url = builder.url;

	}

	public static OpenAIServiceSettings of(Function<Builder, ObjectBuilder<OpenAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key of your OpenAI account. You can find your OpenAI
	 * API keys in your OpenAI account under the API keys section.
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
	 * The number of dimensions the resulting output embeddings should have. It is
	 * supported only in <code>text-embedding-3</code> and later models. If it is
	 * not set, the OpenAI defined default for the model is used.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * OpenAI documentation for the list of available text embedding models.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The unique identifier for your organization. You can find the Organization ID
	 * in your OpenAI account under <em>Settings &gt; Organizations</em>.
	 * <p>
	 * API name: {@code organization_id}
	 */
	@Nullable
	public final String organizationId() {
		return this.organizationId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * OpenAI. The <code>openai</code> service sets a default number of requests
	 * allowed per minute depending on the task type. For
	 * <code>text_embedding</code>, it is set to <code>3000</code>. For
	 * <code>completion</code>, it is set to <code>500</code>.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * For a <code>text_embedding</code> task, the similarity measure. One of
	 * cosine, dot_product, l2_norm. Defaults to <code>dot_product</code>.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final OpenAISimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * The URL endpoint to use for the requests. It can be changed for testing
	 * purposes.
	 * <p>
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
		return this.url;
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

		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}
		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.organizationId != null) {
			generator.writeKey("organization_id");
			generator.write(this.organizationId);

		}
		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			this.similarity.serialize(generator, mapper);
		}
		if (this.url != null) {
			generator.writeKey("url");
			generator.write(this.url);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OpenAIServiceSettings> {
		private String apiKey;

		@Nullable
		private Integer dimensions;

		private String modelId;

		@Nullable
		private String organizationId;

		@Nullable
		private RateLimitSetting rateLimit;

		@Nullable
		private OpenAISimilarityType similarity;

		@Nullable
		private String url;

		public Builder() {
		}
		private Builder(OpenAIServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.dimensions = instance.dimensions;
			this.modelId = instance.modelId;
			this.organizationId = instance.organizationId;
			this.rateLimit = instance.rateLimit;
			this.similarity = instance.similarity;
			this.url = instance.url;

		}
		/**
		 * Required - A valid API key of your OpenAI account. You can find your OpenAI
		 * API keys in your OpenAI account under the API keys section.
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
		 * The number of dimensions the resulting output embeddings should have. It is
		 * supported only in <code>text-embedding-3</code> and later models. If it is
		 * not set, the OpenAI defined default for the model is used.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * OpenAI documentation for the list of available text embedding models.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The unique identifier for your organization. You can find the Organization ID
		 * in your OpenAI account under <em>Settings &gt; Organizations</em>.
		 * <p>
		 * API name: {@code organization_id}
		 */
		public final Builder organizationId(@Nullable String value) {
			this.organizationId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * OpenAI. The <code>openai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For
		 * <code>text_embedding</code>, it is set to <code>3000</code>. For
		 * <code>completion</code>, it is set to <code>500</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * OpenAI. The <code>openai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For
		 * <code>text_embedding</code>, it is set to <code>3000</code>. For
		 * <code>completion</code>, it is set to <code>500</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * For a <code>text_embedding</code> task, the similarity measure. One of
		 * cosine, dot_product, l2_norm. Defaults to <code>dot_product</code>.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable OpenAISimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * The URL endpoint to use for the requests. It can be changed for testing
		 * purposes.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(@Nullable String value) {
			this.url = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenAIServiceSettings build() {
			_checkSingleUse();

			return new OpenAIServiceSettings(this);
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
	 * Json deserializer for {@link OpenAIServiceSettings}
	 */
	public static final JsonpDeserializer<OpenAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OpenAIServiceSettings::setupOpenAIServiceSettingsDeserializer);

	protected static void setupOpenAIServiceSettingsDeserializer(ObjectDeserializer<OpenAIServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::organizationId, JsonpDeserializer.stringDeserializer(), "organization_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::similarity, OpenAISimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
