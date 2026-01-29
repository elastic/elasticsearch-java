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

// typedef: inference._types.DeepSeekServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.DeepSeekServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeepSeekServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String modelId;

	@Nullable
	private final String url;

	// ---------------------------------------------------------------------------------------------

	private DeepSeekServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.url = builder.url;

	}

	public static DeepSeekServiceSettings of(Function<Builder, ObjectBuilder<DeepSeekServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for your DeepSeek account. You can find or create
	 * your DeepSeek API keys on the DeepSeek API key page.
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
	 * Required - For a <code>completion</code> or <code>chat_completion</code>
	 * task, the name of the model to use for the inference task.
	 * <p>
	 * For the available <code>completion</code> and <code>chat_completion</code>
	 * models, refer to the
	 * <a href="https://api-docs.deepseek.com/quick_start/pricing">DeepSeek Models
	 * &amp; Pricing docs</a>.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The URL endpoint to use for the requests. Defaults to
	 * <code>https://api.deepseek.com/chat/completions</code>.
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

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
	 * Builder for {@link DeepSeekServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DeepSeekServiceSettings> {
		private String apiKey;

		private String modelId;

		@Nullable
		private String url;

		public Builder() {
		}
		private Builder(DeepSeekServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.modelId = instance.modelId;
			this.url = instance.url;

		}
		/**
		 * Required - A valid API key for your DeepSeek account. You can find or create
		 * your DeepSeek API keys on the DeepSeek API key page.
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
		 * Required - For a <code>completion</code> or <code>chat_completion</code>
		 * task, the name of the model to use for the inference task.
		 * <p>
		 * For the available <code>completion</code> and <code>chat_completion</code>
		 * models, refer to the
		 * <a href="https://api-docs.deepseek.com/quick_start/pricing">DeepSeek Models
		 * &amp; Pricing docs</a>.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The URL endpoint to use for the requests. Defaults to
		 * <code>https://api.deepseek.com/chat/completions</code>.
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
		 * Builds a {@link DeepSeekServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeepSeekServiceSettings build() {
			_checkSingleUse();

			return new DeepSeekServiceSettings(this);
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
	 * Json deserializer for {@link DeepSeekServiceSettings}
	 */
	public static final JsonpDeserializer<DeepSeekServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeepSeekServiceSettings::setupDeepSeekServiceSettingsDeserializer);

	protected static void setupDeepSeekServiceSettingsDeserializer(
			ObjectDeserializer<DeepSeekServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
