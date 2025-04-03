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

// typedef: inference._types.AzureOpenAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AzureOpenAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AzureOpenAIServiceSettings implements JsonpSerializable {
	@Nullable
	private final String apiKey;

	private final String apiVersion;

	private final String deploymentId;

	@Nullable
	private final String entraId;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String resourceName;

	// ---------------------------------------------------------------------------------------------

	private AzureOpenAIServiceSettings(Builder builder) {

		this.apiKey = builder.apiKey;
		this.apiVersion = ApiTypeHelper.requireNonNullWithDefault(builder.apiVersion, this, "apiVersion",
				this.apiVersion());
		this.deploymentId = ApiTypeHelper.requireNonNullWithDefault(builder.deploymentId, this, "deploymentId",
				this.deploymentId());
		this.entraId = builder.entraId;
		this.rateLimit = builder.rateLimit;
		this.resourceName = ApiTypeHelper.requireNonNullWithDefault(builder.resourceName, this, "resourceName",
				this.resourceName());

	}

	public static AzureOpenAIServiceSettings of(Function<Builder, ObjectBuilder<AzureOpenAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A valid API key for your Azure OpenAI account. You must specify either
	 * <code>api_key</code> or <code>entra_id</code>. If you do not provide either
	 * or you provide both, you will receive an error when you try to create your
	 * model.
	 * <p>
	 * IMPORTANT: You need to provide the API key only once, during the inference
	 * model creation. The get inference endpoint API does not retrieve your API
	 * key. After creating the inference model, you cannot change the associated API
	 * key. If you want to use a different API key, delete the inference model and
	 * recreate it with the same name and the updated API key.
	 * <p>
	 * API name: {@code api_key}
	 */
	@Nullable
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * Required - The Azure API version ID to use. It is recommended to use the
	 * latest supported non-preview version.
	 * <p>
	 * API name: {@code api_version}
	 */
	public final String apiVersion() {
		return this.apiVersion;
	}

	/**
	 * Required - The deployment name of your deployed models. Your Azure OpenAI
	 * deployments can be found though the Azure OpenAI Studio portal that is linked
	 * to your subscription.
	 * <p>
	 * API name: {@code deployment_id}
	 */
	public final String deploymentId() {
		return this.deploymentId;
	}

	/**
	 * A valid Microsoft Entra token. You must specify either <code>api_key</code>
	 * or <code>entra_id</code>. If you do not provide either or you provide both,
	 * you will receive an error when you try to create your model.
	 * <p>
	 * API name: {@code entra_id}
	 */
	@Nullable
	public final String entraId() {
		return this.entraId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Azure. The <code>azureopenai</code> service sets a default number of requests
	 * allowed per minute depending on the task type. For
	 * <code>text_embedding</code>, it is set to <code>1440</code>. For
	 * <code>completion</code>, it is set to <code>120</code>.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * Required - The name of your Azure OpenAI resource. You can find this from the
	 * list of resources in the Azure Portal for your subscription.
	 * <p>
	 * API name: {@code resource_name}
	 */
	public final String resourceName() {
		return this.resourceName;
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

		if (this.apiKey != null) {
			generator.writeKey("api_key");
			generator.write(this.apiKey);

		}
		generator.writeKey("api_version");
		generator.write(this.apiVersion);

		generator.writeKey("deployment_id");
		generator.write(this.deploymentId);

		if (this.entraId != null) {
			generator.writeKey("entra_id");
			generator.write(this.entraId);

		}
		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("resource_name");
		generator.write(this.resourceName);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AzureOpenAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AzureOpenAIServiceSettings> {
		@Nullable
		private String apiKey;

		private String apiVersion;

		private String deploymentId;

		@Nullable
		private String entraId;

		@Nullable
		private RateLimitSetting rateLimit;

		private String resourceName;

		/**
		 * A valid API key for your Azure OpenAI account. You must specify either
		 * <code>api_key</code> or <code>entra_id</code>. If you do not provide either
		 * or you provide both, you will receive an error when you try to create your
		 * model.
		 * <p>
		 * IMPORTANT: You need to provide the API key only once, during the inference
		 * model creation. The get inference endpoint API does not retrieve your API
		 * key. After creating the inference model, you cannot change the associated API
		 * key. If you want to use a different API key, delete the inference model and
		 * recreate it with the same name and the updated API key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(@Nullable String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Required - The Azure API version ID to use. It is recommended to use the
		 * latest supported non-preview version.
		 * <p>
		 * API name: {@code api_version}
		 */
		public final Builder apiVersion(String value) {
			this.apiVersion = value;
			return this;
		}

		/**
		 * Required - The deployment name of your deployed models. Your Azure OpenAI
		 * deployments can be found though the Azure OpenAI Studio portal that is linked
		 * to your subscription.
		 * <p>
		 * API name: {@code deployment_id}
		 */
		public final Builder deploymentId(String value) {
			this.deploymentId = value;
			return this;
		}

		/**
		 * A valid Microsoft Entra token. You must specify either <code>api_key</code>
		 * or <code>entra_id</code>. If you do not provide either or you provide both,
		 * you will receive an error when you try to create your model.
		 * <p>
		 * API name: {@code entra_id}
		 */
		public final Builder entraId(@Nullable String value) {
			this.entraId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Azure. The <code>azureopenai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For
		 * <code>text_embedding</code>, it is set to <code>1440</code>. For
		 * <code>completion</code>, it is set to <code>120</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Azure. The <code>azureopenai</code> service sets a default number of requests
		 * allowed per minute depending on the task type. For
		 * <code>text_embedding</code>, it is set to <code>1440</code>. For
		 * <code>completion</code>, it is set to <code>120</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * Required - The name of your Azure OpenAI resource. You can find this from the
		 * list of resources in the Azure Portal for your subscription.
		 * <p>
		 * API name: {@code resource_name}
		 */
		public final Builder resourceName(String value) {
			this.resourceName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AzureOpenAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AzureOpenAIServiceSettings build() {
			_checkSingleUse();

			return new AzureOpenAIServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AzureOpenAIServiceSettings}
	 */
	public static final JsonpDeserializer<AzureOpenAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AzureOpenAIServiceSettings::setupAzureOpenAIServiceSettingsDeserializer);

	protected static void setupAzureOpenAIServiceSettingsDeserializer(
			ObjectDeserializer<AzureOpenAIServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::apiVersion, JsonpDeserializer.stringDeserializer(), "api_version");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::entraId, JsonpDeserializer.stringDeserializer(), "entra_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::resourceName, JsonpDeserializer.stringDeserializer(), "resource_name");

	}

}
