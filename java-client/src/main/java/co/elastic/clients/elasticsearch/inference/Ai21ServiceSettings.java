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

// typedef: inference._types.Ai21ServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.Ai21ServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ai21ServiceSettings implements JsonpSerializable {
	private final String modelId;

	@Nullable
	private final String apiKey;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private Ai21ServiceSettings(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.apiKey = builder.apiKey;
		this.rateLimit = builder.rateLimit;

	}

	public static Ai21ServiceSettings of(Function<Builder, ObjectBuilder<Ai21ServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * AI21 models documentation for the list of supported models and versions.
	 * Service has been tested and confirmed to be working for
	 * <code>completion</code> and <code>chat_completion</code> tasks with the
	 * following models:
	 * <ul>
	 * <li><code>jamba-mini</code></li>
	 * <li><code>jamba-large</code></li>
	 * </ul>
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * A valid API key for accessing AI21 API.
	 * <p>
	 * IMPORTANT: You need to provide the API key only once, during the inference
	 * model creation. The get inference endpoint API does not retrieve your API
	 * key.
	 * <p>
	 * API name: {@code api_key}
	 */
	@Nullable
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * the AI21 API. By default, the <code>ai21</code> service sets the number of
	 * requests allowed per minute to 200. Please refer to AI21 documentation for
	 * more details.
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.apiKey != null) {
			generator.writeKey("api_key");
			generator.write(this.apiKey);

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
	 * Builder for {@link Ai21ServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<Ai21ServiceSettings> {
		private String modelId;

		@Nullable
		private String apiKey;

		@Nullable
		private RateLimitSetting rateLimit;

		public Builder() {
		}
		private Builder(Ai21ServiceSettings instance) {
			this.modelId = instance.modelId;
			this.apiKey = instance.apiKey;
			this.rateLimit = instance.rateLimit;

		}
		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * AI21 models documentation for the list of supported models and versions.
		 * Service has been tested and confirmed to be working for
		 * <code>completion</code> and <code>chat_completion</code> tasks with the
		 * following models:
		 * <ul>
		 * <li><code>jamba-mini</code></li>
		 * <li><code>jamba-large</code></li>
		 * </ul>
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * A valid API key for accessing AI21 API.
		 * <p>
		 * IMPORTANT: You need to provide the API key only once, during the inference
		 * model creation. The get inference endpoint API does not retrieve your API
		 * key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(@Nullable String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the AI21 API. By default, the <code>ai21</code> service sets the number of
		 * requests allowed per minute to 200. Please refer to AI21 documentation for
		 * more details.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * the AI21 API. By default, the <code>ai21</code> service sets the number of
		 * requests allowed per minute to 200. Please refer to AI21 documentation for
		 * more details.
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
		 * Builds a {@link Ai21ServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ai21ServiceSettings build() {
			_checkSingleUse();

			return new Ai21ServiceSettings(this);
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
	 * Json deserializer for {@link Ai21ServiceSettings}
	 */
	public static final JsonpDeserializer<Ai21ServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, Ai21ServiceSettings::setupAi21ServiceSettingsDeserializer);

	protected static void setupAi21ServiceSettingsDeserializer(ObjectDeserializer<Ai21ServiceSettings.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
