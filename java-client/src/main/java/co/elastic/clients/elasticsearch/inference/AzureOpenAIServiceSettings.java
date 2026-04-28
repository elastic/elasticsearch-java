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
import java.util.List;
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

	@Nullable
	private final String clientId;

	@Nullable
	private final String clientSecret;

	private final String deploymentId;

	@Nullable
	private final String entraId;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String resourceName;

	private final List<String> scopes;

	@Nullable
	private final String tenantId;

	// ---------------------------------------------------------------------------------------------

	private AzureOpenAIServiceSettings(Builder builder) {

		this.apiKey = builder.apiKey;
		this.apiVersion = ApiTypeHelper.requireNonNull(builder.apiVersion, this, "apiVersion");
		this.clientId = builder.clientId;
		this.clientSecret = builder.clientSecret;
		this.deploymentId = ApiTypeHelper.requireNonNull(builder.deploymentId, this, "deploymentId");
		this.entraId = builder.entraId;
		this.rateLimit = builder.rateLimit;
		this.resourceName = ApiTypeHelper.requireNonNull(builder.resourceName, this, "resourceName");
		this.scopes = ApiTypeHelper.unmodifiable(builder.scopes);
		this.tenantId = builder.tenantId;

	}

	public static AzureOpenAIServiceSettings of(Function<Builder, ObjectBuilder<AzureOpenAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A valid API key for your Azure OpenAI account.
	 * <p>
	 * IMPORTANT: You must specify either <code>api_key</code>,
	 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
	 * one or you provide more than one of them, you will receive an error when you
	 * try to create your endpoint.
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
	 * For OAuth 2.0 authentication using the client credentials grant flow. The
	 * application ID that's assigned to your app.
	 * <p>
	 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
	 * tenant_id, and client_secret together. If one of the fields is missing, you
	 * will receive an error when you try to create your endpoint.
	 * <p>
	 * API name: {@code client_id}
	 */
	@Nullable
	public final String clientId() {
		return this.clientId;
	}

	/**
	 * For OAuth 2.0 authentication using the client credentials grant flow. The
	 * application secret that you created in the Microsoft app registration portal
	 * for your app.
	 * <p>
	 * IMPORTANT: You must specify either <code>api_key</code>,
	 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
	 * one or you provide more than one of them, you will receive an error when you
	 * try to create your endpoint.
	 * <p>
	 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
	 * tenant_id, and client_secret together. If one of the fields is missing, you
	 * will receive an error when you try to create your endpoint.
	 * <p>
	 * API name: {@code client_secret}
	 */
	@Nullable
	public final String clientSecret() {
		return this.clientSecret;
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
	 * A valid Microsoft Entra token.
	 * <p>
	 * IMPORTANT: You must specify either <code>api_key</code>,
	 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
	 * one or you provide more than one of them, you will receive an error when you
	 * try to create your endpoint.
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
	 * <code>completion</code> and <code>chat_completion</code>, it is set to
	 * <code>120</code>.
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
	 * For OAuth 2.0 authentication using the client credentials grant flow. The
	 * resource identifier (application ID URI) of the resource you want, suffixed
	 * with .default For example:
	 * 
	 * <pre>
	 * <code>&quot;scopes&quot;: [
	 *   &quot;https://cognitiveservices.azure.com/.default&quot;
	 * ]
	 * </code>
	 * </pre>
	 * <p>
	 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
	 * tenant_id, and client_secret together. If one of the fields is missing, you
	 * will receive an error when you try to create your endpoint.
	 * <p>
	 * API name: {@code scopes}
	 */
	public final List<String> scopes() {
		return this.scopes;
	}

	/**
	 * For OAuth 2.0 authentication using the client credentials grant flow. The
	 * directory tenant the application plans to operate against.
	 * <p>
	 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
	 * tenant_id, and client_secret together. If one of the fields is missing, you
	 * will receive an error when you try to create your endpoint.
	 * <p>
	 * API name: {@code tenant_id}
	 */
	@Nullable
	public final String tenantId() {
		return this.tenantId;
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

		if (this.clientId != null) {
			generator.writeKey("client_id");
			generator.write(this.clientId);

		}
		if (this.clientSecret != null) {
			generator.writeKey("client_secret");
			generator.write(this.clientSecret);

		}
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

		if (ApiTypeHelper.isDefined(this.scopes)) {
			generator.writeKey("scopes");
			generator.writeStartArray();
			for (String item0 : this.scopes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.tenantId != null) {
			generator.writeKey("tenant_id");
			generator.write(this.tenantId);

		}

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

		@Nullable
		private String clientId;

		@Nullable
		private String clientSecret;

		private String deploymentId;

		@Nullable
		private String entraId;

		@Nullable
		private RateLimitSetting rateLimit;

		private String resourceName;

		@Nullable
		private List<String> scopes;

		@Nullable
		private String tenantId;

		public Builder() {
		}
		private Builder(AzureOpenAIServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.apiVersion = instance.apiVersion;
			this.clientId = instance.clientId;
			this.clientSecret = instance.clientSecret;
			this.deploymentId = instance.deploymentId;
			this.entraId = instance.entraId;
			this.rateLimit = instance.rateLimit;
			this.resourceName = instance.resourceName;
			this.scopes = instance.scopes;
			this.tenantId = instance.tenantId;

		}
		/**
		 * A valid API key for your Azure OpenAI account.
		 * <p>
		 * IMPORTANT: You must specify either <code>api_key</code>,
		 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
		 * one or you provide more than one of them, you will receive an error when you
		 * try to create your endpoint.
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
		 * For OAuth 2.0 authentication using the client credentials grant flow. The
		 * application ID that's assigned to your app.
		 * <p>
		 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
		 * tenant_id, and client_secret together. If one of the fields is missing, you
		 * will receive an error when you try to create your endpoint.
		 * <p>
		 * API name: {@code client_id}
		 */
		public final Builder clientId(@Nullable String value) {
			this.clientId = value;
			return this;
		}

		/**
		 * For OAuth 2.0 authentication using the client credentials grant flow. The
		 * application secret that you created in the Microsoft app registration portal
		 * for your app.
		 * <p>
		 * IMPORTANT: You must specify either <code>api_key</code>,
		 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
		 * one or you provide more than one of them, you will receive an error when you
		 * try to create your endpoint.
		 * <p>
		 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
		 * tenant_id, and client_secret together. If one of the fields is missing, you
		 * will receive an error when you try to create your endpoint.
		 * <p>
		 * API name: {@code client_secret}
		 */
		public final Builder clientSecret(@Nullable String value) {
			this.clientSecret = value;
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
		 * A valid Microsoft Entra token.
		 * <p>
		 * IMPORTANT: You must specify either <code>api_key</code>,
		 * <code>entra_id</code>, or <code>client_secret</code>. If you do not provide
		 * one or you provide more than one of them, you will receive an error when you
		 * try to create your endpoint.
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
		 * <code>completion</code> and <code>chat_completion</code>, it is set to
		 * <code>120</code>.
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
		 * <code>completion</code> and <code>chat_completion</code>, it is set to
		 * <code>120</code>.
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

		/**
		 * For OAuth 2.0 authentication using the client credentials grant flow. The
		 * resource identifier (application ID URI) of the resource you want, suffixed
		 * with .default For example:
		 * 
		 * <pre>
		 * <code>&quot;scopes&quot;: [
		 *   &quot;https://cognitiveservices.azure.com/.default&quot;
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
		 * tenant_id, and client_secret together. If one of the fields is missing, you
		 * will receive an error when you try to create your endpoint.
		 * <p>
		 * API name: {@code scopes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>scopes</code>.
		 */
		public final Builder scopes(List<String> list) {
			this.scopes = _listAddAll(this.scopes, list);
			return this;
		}

		/**
		 * For OAuth 2.0 authentication using the client credentials grant flow. The
		 * resource identifier (application ID URI) of the resource you want, suffixed
		 * with .default For example:
		 * 
		 * <pre>
		 * <code>&quot;scopes&quot;: [
		 *   &quot;https://cognitiveservices.azure.com/.default&quot;
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
		 * tenant_id, and client_secret together. If one of the fields is missing, you
		 * will receive an error when you try to create your endpoint.
		 * <p>
		 * API name: {@code scopes}
		 * <p>
		 * Adds one or more values to <code>scopes</code>.
		 */
		public final Builder scopes(String value, String... values) {
			this.scopes = _listAdd(this.scopes, value, values);
			return this;
		}

		/**
		 * For OAuth 2.0 authentication using the client credentials grant flow. The
		 * directory tenant the application plans to operate against.
		 * <p>
		 * IMPORTANT: To configure OAuth 2.0, you must specify client_id, scopes,
		 * tenant_id, and client_secret together. If one of the fields is missing, you
		 * will receive an error when you try to create your endpoint.
		 * <p>
		 * API name: {@code tenant_id}
		 */
		public final Builder tenantId(@Nullable String value) {
			this.tenantId = value;
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
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
		op.add(Builder::clientId, JsonpDeserializer.stringDeserializer(), "client_id");
		op.add(Builder::clientSecret, JsonpDeserializer.stringDeserializer(), "client_secret");
		op.add(Builder::deploymentId, JsonpDeserializer.stringDeserializer(), "deployment_id");
		op.add(Builder::entraId, JsonpDeserializer.stringDeserializer(), "entra_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::resourceName, JsonpDeserializer.stringDeserializer(), "resource_name");
		op.add(Builder::scopes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "scopes");
		op.add(Builder::tenantId, JsonpDeserializer.stringDeserializer(), "tenant_id");

	}

}
