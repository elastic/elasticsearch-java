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

// typedef: inference._types.AlibabaCloudServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AlibabaCloudServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AlibabaCloudServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String host;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String serviceId;

	private final String workspace;

	// ---------------------------------------------------------------------------------------------

	private AlibabaCloudServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.host = ApiTypeHelper.requireNonNull(builder.host, this, "host");
		this.rateLimit = builder.rateLimit;
		this.serviceId = ApiTypeHelper.requireNonNull(builder.serviceId, this, "serviceId");
		this.workspace = ApiTypeHelper.requireNonNull(builder.workspace, this, "workspace");

	}

	public static AlibabaCloudServiceSettings of(Function<Builder, ObjectBuilder<AlibabaCloudServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for the AlibabaCloud AI Search API.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * Required - The name of the host address used for the inference task. You can
	 * find the host address in the API keys section of the documentation.
	 * <p>
	 * API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * AlibabaCloud AI Search. By default, the <code>alibabacloud-ai-search</code>
	 * service sets the number of requests allowed per minute to <code>1000</code>.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * Required - The name of the model service to use for the inference task. The
	 * following service IDs are available for the <code>completion</code> task:
	 * <ul>
	 * <li><code>ops-qwen-turbo</code></li>
	 * <li><code>qwen-turbo</code></li>
	 * <li><code>qwen-plus</code></li>
	 * <li><code>qwen-max ÷ qwen-max-longcontext</code></li>
	 * </ul>
	 * <p>
	 * The following service ID is available for the <code>rerank</code> task:
	 * <ul>
	 * <li><code>ops-bge-reranker-larger</code></li>
	 * </ul>
	 * <p>
	 * The following service ID is available for the <code>sparse_embedding</code>
	 * task:
	 * <ul>
	 * <li><code>ops-text-sparse-embedding-001</code></li>
	 * </ul>
	 * <p>
	 * The following service IDs are available for the <code>text_embedding</code>
	 * task:
	 * <p>
	 * <code>ops-text-embedding-001</code> <code>ops-text-embedding-zh-001</code>
	 * <code>ops-text-embedding-en-001</code> <code>ops-text-embedding-002</code>
	 * <p>
	 * API name: {@code service_id}
	 */
	public final String serviceId() {
		return this.serviceId;
	}

	/**
	 * Required - The name of the workspace used for the inference task.
	 * <p>
	 * API name: {@code workspace}
	 */
	public final String workspace() {
		return this.workspace;
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

		generator.writeKey("host");
		generator.write(this.host);

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("service_id");
		generator.write(this.serviceId);

		generator.writeKey("workspace");
		generator.write(this.workspace);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AlibabaCloudServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AlibabaCloudServiceSettings> {
		private String apiKey;

		private String host;

		@Nullable
		private RateLimitSetting rateLimit;

		private String serviceId;

		private String workspace;

		/**
		 * Required - A valid API key for the AlibabaCloud AI Search API.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Required - The name of the host address used for the inference task. You can
		 * find the host address in the API keys section of the documentation.
		 * <p>
		 * API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * AlibabaCloud AI Search. By default, the <code>alibabacloud-ai-search</code>
		 * service sets the number of requests allowed per minute to <code>1000</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * AlibabaCloud AI Search. By default, the <code>alibabacloud-ai-search</code>
		 * service sets the number of requests allowed per minute to <code>1000</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * Required - The name of the model service to use for the inference task. The
		 * following service IDs are available for the <code>completion</code> task:
		 * <ul>
		 * <li><code>ops-qwen-turbo</code></li>
		 * <li><code>qwen-turbo</code></li>
		 * <li><code>qwen-plus</code></li>
		 * <li><code>qwen-max ÷ qwen-max-longcontext</code></li>
		 * </ul>
		 * <p>
		 * The following service ID is available for the <code>rerank</code> task:
		 * <ul>
		 * <li><code>ops-bge-reranker-larger</code></li>
		 * </ul>
		 * <p>
		 * The following service ID is available for the <code>sparse_embedding</code>
		 * task:
		 * <ul>
		 * <li><code>ops-text-sparse-embedding-001</code></li>
		 * </ul>
		 * <p>
		 * The following service IDs are available for the <code>text_embedding</code>
		 * task:
		 * <p>
		 * <code>ops-text-embedding-001</code> <code>ops-text-embedding-zh-001</code>
		 * <code>ops-text-embedding-en-001</code> <code>ops-text-embedding-002</code>
		 * <p>
		 * API name: {@code service_id}
		 */
		public final Builder serviceId(String value) {
			this.serviceId = value;
			return this;
		}

		/**
		 * Required - The name of the workspace used for the inference task.
		 * <p>
		 * API name: {@code workspace}
		 */
		public final Builder workspace(String value) {
			this.workspace = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AlibabaCloudServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AlibabaCloudServiceSettings build() {
			_checkSingleUse();

			return new AlibabaCloudServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AlibabaCloudServiceSettings}
	 */
	public static final JsonpDeserializer<AlibabaCloudServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AlibabaCloudServiceSettings::setupAlibabaCloudServiceSettingsDeserializer);

	protected static void setupAlibabaCloudServiceSettingsDeserializer(
			ObjectDeserializer<AlibabaCloudServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::serviceId, JsonpDeserializer.stringDeserializer(), "service_id");
		op.add(Builder::workspace, JsonpDeserializer.stringDeserializer(), "workspace");

	}

}
