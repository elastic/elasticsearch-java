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

// typedef: inference._types.AzureAiStudioServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AzureAiStudioServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AzureAiStudioServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String endpointType;

	private final String target;

	private final String provider;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private AzureAiStudioServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.endpointType = ApiTypeHelper.requireNonNull(builder.endpointType, this, "endpointType");
		this.target = ApiTypeHelper.requireNonNull(builder.target, this, "target");
		this.provider = ApiTypeHelper.requireNonNull(builder.provider, this, "provider");
		this.rateLimit = builder.rateLimit;

	}

	public static AzureAiStudioServiceSettings of(Function<Builder, ObjectBuilder<AzureAiStudioServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key of your Azure AI Studio model deployment. This key
	 * can be found on the overview page for your deployment in the management
	 * section of your Azure AI Studio account.
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
	 * Required - The type of endpoint that is available for deployment through
	 * Azure AI Studio: <code>token</code> or <code>realtime</code>. The
	 * <code>token</code> endpoint type is for &quot;pay as you go&quot; endpoints
	 * that are billed per token. The <code>realtime</code> endpoint type is for
	 * &quot;real-time&quot; endpoints that are billed per hour of usage.
	 * <p>
	 * API name: {@code endpoint_type}
	 */
	public final String endpointType() {
		return this.endpointType;
	}

	/**
	 * Required - The target URL of your Azure AI Studio model deployment. This can
	 * be found on the overview page for your deployment in the management section
	 * of your Azure AI Studio account.
	 * <p>
	 * API name: {@code target}
	 */
	public final String target() {
		return this.target;
	}

	/**
	 * Required - The model provider for your deployment. Note that some providers
	 * may support only certain task types. Supported providers include:
	 * <ul>
	 * <li><code>cohere</code> - available for <code>text_embedding</code>,
	 * <code>rerank</code> and <code>completion</code> task types</li>
	 * <li><code>databricks</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>meta</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>microsoft_phi</code> - available for <code>completion</code> task
	 * type only</li>
	 * <li><code>mistral</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>openai</code> - available for <code>text_embedding</code> and
	 * <code>completion</code> task types</li>
	 * </ul>
	 * <p>
	 * API name: {@code provider}
	 */
	public final String provider() {
		return this.provider;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Azure AI Studio. By default, the <code>azureaistudio</code> service sets the
	 * number of requests allowed per minute to 240.
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

		generator.writeKey("endpoint_type");
		generator.write(this.endpointType);

		generator.writeKey("target");
		generator.write(this.target);

		generator.writeKey("provider");
		generator.write(this.provider);

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
	 * Builder for {@link AzureAiStudioServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AzureAiStudioServiceSettings> {
		private String apiKey;

		private String endpointType;

		private String target;

		private String provider;

		@Nullable
		private RateLimitSetting rateLimit;

		public Builder() {
		}
		private Builder(AzureAiStudioServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.endpointType = instance.endpointType;
			this.target = instance.target;
			this.provider = instance.provider;
			this.rateLimit = instance.rateLimit;

		}
		/**
		 * Required - A valid API key of your Azure AI Studio model deployment. This key
		 * can be found on the overview page for your deployment in the management
		 * section of your Azure AI Studio account.
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
		 * Required - The type of endpoint that is available for deployment through
		 * Azure AI Studio: <code>token</code> or <code>realtime</code>. The
		 * <code>token</code> endpoint type is for &quot;pay as you go&quot; endpoints
		 * that are billed per token. The <code>realtime</code> endpoint type is for
		 * &quot;real-time&quot; endpoints that are billed per hour of usage.
		 * <p>
		 * API name: {@code endpoint_type}
		 */
		public final Builder endpointType(String value) {
			this.endpointType = value;
			return this;
		}

		/**
		 * Required - The target URL of your Azure AI Studio model deployment. This can
		 * be found on the overview page for your deployment in the management section
		 * of your Azure AI Studio account.
		 * <p>
		 * API name: {@code target}
		 */
		public final Builder target(String value) {
			this.target = value;
			return this;
		}

		/**
		 * Required - The model provider for your deployment. Note that some providers
		 * may support only certain task types. Supported providers include:
		 * <ul>
		 * <li><code>cohere</code> - available for <code>text_embedding</code>,
		 * <code>rerank</code> and <code>completion</code> task types</li>
		 * <li><code>databricks</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>meta</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>microsoft_phi</code> - available for <code>completion</code> task
		 * type only</li>
		 * <li><code>mistral</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>openai</code> - available for <code>text_embedding</code> and
		 * <code>completion</code> task types</li>
		 * </ul>
		 * <p>
		 * API name: {@code provider}
		 */
		public final Builder provider(String value) {
			this.provider = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Azure AI Studio. By default, the <code>azureaistudio</code> service sets the
		 * number of requests allowed per minute to 240.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Azure AI Studio. By default, the <code>azureaistudio</code> service sets the
		 * number of requests allowed per minute to 240.
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
		 * Builds a {@link AzureAiStudioServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AzureAiStudioServiceSettings build() {
			_checkSingleUse();

			return new AzureAiStudioServiceSettings(this);
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
	 * Json deserializer for {@link AzureAiStudioServiceSettings}
	 */
	public static final JsonpDeserializer<AzureAiStudioServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AzureAiStudioServiceSettings::setupAzureAiStudioServiceSettingsDeserializer);

	protected static void setupAzureAiStudioServiceSettingsDeserializer(
			ObjectDeserializer<AzureAiStudioServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::endpointType, JsonpDeserializer.stringDeserializer(), "endpoint_type");
		op.add(Builder::target, JsonpDeserializer.stringDeserializer(), "target");
		op.add(Builder::provider, JsonpDeserializer.stringDeserializer(), "provider");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
