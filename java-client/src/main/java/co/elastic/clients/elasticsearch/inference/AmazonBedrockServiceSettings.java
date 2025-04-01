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

// typedef: inference._types.AmazonBedrockServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AmazonBedrockServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AmazonBedrockServiceSettings implements JsonpSerializable {
	private final String accessKey;

	private final String model;

	@Nullable
	private final String provider;

	private final String region;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String secretKey;

	// ---------------------------------------------------------------------------------------------

	private AmazonBedrockServiceSettings(Builder builder) {

		this.accessKey = ApiTypeHelper.requireNonNull(builder.accessKey, this, "accessKey");
		this.model = ApiTypeHelper.requireNonNull(builder.model, this, "model");
		this.provider = builder.provider;
		this.region = ApiTypeHelper.requireNonNull(builder.region, this, "region");
		this.rateLimit = builder.rateLimit;
		this.secretKey = ApiTypeHelper.requireNonNull(builder.secretKey, this, "secretKey");

	}

	public static AmazonBedrockServiceSettings of(Function<Builder, ObjectBuilder<AmazonBedrockServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid AWS access key that has permissions to use Amazon Bedrock
	 * and access to models for inference requests.
	 * <p>
	 * API name: {@code access_key}
	 */
	public final String accessKey() {
		return this.accessKey;
	}

	/**
	 * Required - The base model ID or an ARN to a custom model based on a
	 * foundational model. The base model IDs can be found in the Amazon Bedrock
	 * documentation. Note that the model ID must be available for the provider
	 * chosen and your IAM user must have access to the model.
	 * <p>
	 * API name: {@code model}
	 */
	public final String model() {
		return this.model;
	}

	/**
	 * The model provider for your deployment. Note that some providers may support
	 * only certain task types. Supported providers include:
	 * <ul>
	 * <li><code>amazontitan</code> - available for <code>text_embedding</code> and
	 * <code>completion</code> task types</li>
	 * <li><code>anthropic</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>ai21labs</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>cohere</code> - available for <code>text_embedding</code> and
	 * <code>completion</code> task types</li>
	 * <li><code>meta</code> - available for <code>completion</code> task type
	 * only</li>
	 * <li><code>mistral</code> - available for <code>completion</code> task type
	 * only</li>
	 * </ul>
	 * <p>
	 * API name: {@code provider}
	 */
	@Nullable
	public final String provider() {
		return this.provider;
	}

	/**
	 * Required - The region that your model or ARN is deployed in. The list of
	 * available regions per model can be found in the Amazon Bedrock documentation.
	 * <p>
	 * API name: {@code region}
	 */
	public final String region() {
		return this.region;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Watsonx. By default, the <code>watsonxai</code> service sets the number of
	 * requests allowed per minute to 120.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * Required - A valid AWS secret key that is paired with the
	 * <code>access_key</code>. For informationg about creating and managing access
	 * and secret keys, refer to the AWS documentation.
	 * <p>
	 * API name: {@code secret_key}
	 */
	public final String secretKey() {
		return this.secretKey;
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

		generator.writeKey("access_key");
		generator.write(this.accessKey);

		generator.writeKey("model");
		generator.write(this.model);

		if (this.provider != null) {
			generator.writeKey("provider");
			generator.write(this.provider);

		}
		generator.writeKey("region");
		generator.write(this.region);

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("secret_key");
		generator.write(this.secretKey);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AmazonBedrockServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AmazonBedrockServiceSettings> {
		private String accessKey;

		private String model;

		@Nullable
		private String provider;

		private String region;

		@Nullable
		private RateLimitSetting rateLimit;

		private String secretKey;

		/**
		 * Required - A valid AWS access key that has permissions to use Amazon Bedrock
		 * and access to models for inference requests.
		 * <p>
		 * API name: {@code access_key}
		 */
		public final Builder accessKey(String value) {
			this.accessKey = value;
			return this;
		}

		/**
		 * Required - The base model ID or an ARN to a custom model based on a
		 * foundational model. The base model IDs can be found in the Amazon Bedrock
		 * documentation. Note that the model ID must be available for the provider
		 * chosen and your IAM user must have access to the model.
		 * <p>
		 * API name: {@code model}
		 */
		public final Builder model(String value) {
			this.model = value;
			return this;
		}

		/**
		 * The model provider for your deployment. Note that some providers may support
		 * only certain task types. Supported providers include:
		 * <ul>
		 * <li><code>amazontitan</code> - available for <code>text_embedding</code> and
		 * <code>completion</code> task types</li>
		 * <li><code>anthropic</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>ai21labs</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>cohere</code> - available for <code>text_embedding</code> and
		 * <code>completion</code> task types</li>
		 * <li><code>meta</code> - available for <code>completion</code> task type
		 * only</li>
		 * <li><code>mistral</code> - available for <code>completion</code> task type
		 * only</li>
		 * </ul>
		 * <p>
		 * API name: {@code provider}
		 */
		public final Builder provider(@Nullable String value) {
			this.provider = value;
			return this;
		}

		/**
		 * Required - The region that your model or ARN is deployed in. The list of
		 * available regions per model can be found in the Amazon Bedrock documentation.
		 * <p>
		 * API name: {@code region}
		 */
		public final Builder region(String value) {
			this.region = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Watsonx. By default, the <code>watsonxai</code> service sets the number of
		 * requests allowed per minute to 120.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Watsonx. By default, the <code>watsonxai</code> service sets the number of
		 * requests allowed per minute to 120.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * Required - A valid AWS secret key that is paired with the
		 * <code>access_key</code>. For informationg about creating and managing access
		 * and secret keys, refer to the AWS documentation.
		 * <p>
		 * API name: {@code secret_key}
		 */
		public final Builder secretKey(String value) {
			this.secretKey = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AmazonBedrockServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AmazonBedrockServiceSettings build() {
			_checkSingleUse();

			return new AmazonBedrockServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AmazonBedrockServiceSettings}
	 */
	public static final JsonpDeserializer<AmazonBedrockServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AmazonBedrockServiceSettings::setupAmazonBedrockServiceSettingsDeserializer);

	protected static void setupAmazonBedrockServiceSettingsDeserializer(
			ObjectDeserializer<AmazonBedrockServiceSettings.Builder> op) {

		op.add(Builder::accessKey, JsonpDeserializer.stringDeserializer(), "access_key");
		op.add(Builder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(Builder::provider, JsonpDeserializer.stringDeserializer(), "provider");
		op.add(Builder::region, JsonpDeserializer.stringDeserializer(), "region");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::secretKey, JsonpDeserializer.stringDeserializer(), "secret_key");

	}

}
