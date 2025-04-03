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

// typedef: inference._types.MistralServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.MistralServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class MistralServiceSettings implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final Integer maxInputTokens;

	private final String model;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private MistralServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNullWithDefault(builder.apiKey, this, "apiKey", this.apiKey());
		this.maxInputTokens = builder.maxInputTokens;
		this.model = ApiTypeHelper.requireNonNullWithDefault(builder.model, this, "model", this.model());
		this.rateLimit = builder.rateLimit;

	}

	public static MistralServiceSettings of(Function<Builder, ObjectBuilder<MistralServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key of your Mistral account. You can find your Mistral
	 * API keys or you can create a new one on the API Keys page.
	 * <p>
	 * IMPORTANT: You need to provide the API key only once, during the inference
	 * model creation. The get inference endpoint API does not retrieve your API
	 * key. After creating the inference model, you cannot change the associated API
	 * key. If you want to use a different API key, delete the inference model and
	 * recreate it with the same name and the updated API key.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * The maximum number of tokens per input before chunking occurs.
	 * <p>
	 * API name: {@code max_input_tokens}
	 */
	@Nullable
	public final Integer maxInputTokens() {
		return this.maxInputTokens;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * Mistral models documentation for the list of available text embedding models.
	 * <p>
	 * API name: {@code model}
	 */
	public final String model() {
		return this.model;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the Mistral API. By default, the <code>mistral</code> service sets the number
	 * of requests allowed per minute to 240.
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

		if (this.maxInputTokens != null) {
			generator.writeKey("max_input_tokens");
			generator.write(this.maxInputTokens);

		}
		generator.writeKey("model");
		generator.write(this.model);

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
	 * Builder for {@link MistralServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MistralServiceSettings> {
		private String apiKey;

		@Nullable
		private Integer maxInputTokens;

		private String model;

		@Nullable
		private RateLimitSetting rateLimit;

		/**
		 * Required - A valid API key of your Mistral account. You can find your Mistral
		 * API keys or you can create a new one on the API Keys page.
		 * <p>
		 * IMPORTANT: You need to provide the API key only once, during the inference
		 * model creation. The get inference endpoint API does not retrieve your API
		 * key. After creating the inference model, you cannot change the associated API
		 * key. If you want to use a different API key, delete the inference model and
		 * recreate it with the same name and the updated API key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * The maximum number of tokens per input before chunking occurs.
		 * <p>
		 * API name: {@code max_input_tokens}
		 */
		public final Builder maxInputTokens(@Nullable Integer value) {
			this.maxInputTokens = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * Mistral models documentation for the list of available text embedding models.
		 * <p>
		 * API name: {@code model}
		 */
		public final Builder model(String value) {
			this.model = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Mistral API. By default, the <code>mistral</code> service sets the number
		 * of requests allowed per minute to 240.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the Mistral API. By default, the <code>mistral</code> service sets the number
		 * of requests allowed per minute to 240.
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
		 * Builds a {@link MistralServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MistralServiceSettings build() {
			_checkSingleUse();

			return new MistralServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MistralServiceSettings}
	 */
	public static final JsonpDeserializer<MistralServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MistralServiceSettings::setupMistralServiceSettingsDeserializer);

	protected static void setupMistralServiceSettingsDeserializer(
			ObjectDeserializer<MistralServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::maxInputTokens, JsonpDeserializer.integerDeserializer(), "max_input_tokens");
		op.add(Builder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
