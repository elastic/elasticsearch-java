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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: inference._types.RateLimitSetting

/**
 * This setting helps to minimize the number of rate limit errors returned from
 * the service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.RateLimitSetting">API
 *      specification</a>
 */
@JsonpDeserializable
public class RateLimitSetting implements JsonpSerializable {
	@Nullable
	private final Integer requestsPerMinute;

	// ---------------------------------------------------------------------------------------------

	private RateLimitSetting(Builder builder) {

		this.requestsPerMinute = builder.requestsPerMinute;

	}

	public static RateLimitSetting of(Function<Builder, ObjectBuilder<RateLimitSetting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of requests allowed per minute. By default, the number of requests
	 * allowed per minute is set by each service as follows:
	 * <ul>
	 * <li><code>alibabacloud-ai-search</code> service: <code>1000</code></li>
	 * <li><code>anthropic</code> service: <code>50</code></li>
	 * <li><code>azureaistudio</code> service: <code>240</code></li>
	 * <li><code>azureopenai</code> service and task type
	 * <code>text_embedding</code>: <code>1440</code></li>
	 * <li><code>azureopenai</code> service and task type <code>completion</code>:
	 * <code>120</code></li>
	 * <li><code>cohere</code> service: <code>10000</code></li>
	 * <li><code>elastic</code> service and task type <code>chat_completion</code>:
	 * <code>240</code></li>
	 * <li><code>googleaistudio</code> service: <code>360</code></li>
	 * <li><code>googlevertexai</code> service: <code>30000</code></li>
	 * <li><code>hugging_face</code> service: <code>3000</code></li>
	 * <li><code>jinaai</code> service: <code>2000</code></li>
	 * <li><code>llama</code> service: <code>3000</code></li>
	 * <li><code>mistral</code> service: <code>240</code></li>
	 * <li><code>openai</code> service and task type <code>text_embedding</code>:
	 * <code>3000</code></li>
	 * <li><code>openai</code> service and task type <code>completion</code>:
	 * <code>500</code></li>
	 * <li><code>voyageai</code> service: <code>2000</code></li>
	 * <li><code>watsonxai</code> service: <code>120</code></li>
	 * </ul>
	 * <p>
	 * API name: {@code requests_per_minute}
	 */
	@Nullable
	public final Integer requestsPerMinute() {
		return this.requestsPerMinute;
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

		if (this.requestsPerMinute != null) {
			generator.writeKey("requests_per_minute");
			generator.write(this.requestsPerMinute);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RateLimitSetting}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RateLimitSetting> {
		@Nullable
		private Integer requestsPerMinute;

		/**
		 * The number of requests allowed per minute. By default, the number of requests
		 * allowed per minute is set by each service as follows:
		 * <ul>
		 * <li><code>alibabacloud-ai-search</code> service: <code>1000</code></li>
		 * <li><code>anthropic</code> service: <code>50</code></li>
		 * <li><code>azureaistudio</code> service: <code>240</code></li>
		 * <li><code>azureopenai</code> service and task type
		 * <code>text_embedding</code>: <code>1440</code></li>
		 * <li><code>azureopenai</code> service and task type <code>completion</code>:
		 * <code>120</code></li>
		 * <li><code>cohere</code> service: <code>10000</code></li>
		 * <li><code>elastic</code> service and task type <code>chat_completion</code>:
		 * <code>240</code></li>
		 * <li><code>googleaistudio</code> service: <code>360</code></li>
		 * <li><code>googlevertexai</code> service: <code>30000</code></li>
		 * <li><code>hugging_face</code> service: <code>3000</code></li>
		 * <li><code>jinaai</code> service: <code>2000</code></li>
		 * <li><code>llama</code> service: <code>3000</code></li>
		 * <li><code>mistral</code> service: <code>240</code></li>
		 * <li><code>openai</code> service and task type <code>text_embedding</code>:
		 * <code>3000</code></li>
		 * <li><code>openai</code> service and task type <code>completion</code>:
		 * <code>500</code></li>
		 * <li><code>voyageai</code> service: <code>2000</code></li>
		 * <li><code>watsonxai</code> service: <code>120</code></li>
		 * </ul>
		 * <p>
		 * API name: {@code requests_per_minute}
		 */
		public final Builder requestsPerMinute(@Nullable Integer value) {
			this.requestsPerMinute = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RateLimitSetting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RateLimitSetting build() {
			_checkSingleUse();

			return new RateLimitSetting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RateLimitSetting}
	 */
	public static final JsonpDeserializer<RateLimitSetting> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RateLimitSetting::setupRateLimitSettingDeserializer);

	protected static void setupRateLimitSettingDeserializer(ObjectDeserializer<RateLimitSetting.Builder> op) {

		op.add(Builder::requestsPerMinute, JsonpDeserializer.integerDeserializer(), "requests_per_minute");

	}

}
