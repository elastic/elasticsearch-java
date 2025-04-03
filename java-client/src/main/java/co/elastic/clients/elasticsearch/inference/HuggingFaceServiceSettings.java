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

// typedef: inference._types.HuggingFaceServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.HuggingFaceServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class HuggingFaceServiceSettings implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String url;

	// ---------------------------------------------------------------------------------------------

	private HuggingFaceServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNullWithDefault(builder.apiKey, this, "apiKey", this.apiKey());
		this.rateLimit = builder.rateLimit;
		this.url = ApiTypeHelper.requireNonNullWithDefault(builder.url, this, "url", this.url());

	}

	public static HuggingFaceServiceSettings of(Function<Builder, ObjectBuilder<HuggingFaceServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid access token for your HuggingFace account. You can create
	 * or find your access tokens on the HuggingFace settings page.
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
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Hugging Face. By default, the <code>hugging_face</code> service sets the
	 * number of requests allowed per minute to 3000.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * Required - The URL endpoint to use for the requests.
	 * <p>
	 * API name: {@code url}
	 */
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

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("url");
		generator.write(this.url);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HuggingFaceServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HuggingFaceServiceSettings> {
		private String apiKey;

		@Nullable
		private RateLimitSetting rateLimit;

		private String url;

		/**
		 * Required - A valid access token for your HuggingFace account. You can create
		 * or find your access tokens on the HuggingFace settings page.
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
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Hugging Face. By default, the <code>hugging_face</code> service sets the
		 * number of requests allowed per minute to 3000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Hugging Face. By default, the <code>hugging_face</code> service sets the
		 * number of requests allowed per minute to 3000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * Required - The URL endpoint to use for the requests.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HuggingFaceServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HuggingFaceServiceSettings build() {
			_checkSingleUse();

			return new HuggingFaceServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HuggingFaceServiceSettings}
	 */
	public static final JsonpDeserializer<HuggingFaceServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HuggingFaceServiceSettings::setupHuggingFaceServiceSettingsDeserializer);

	protected static void setupHuggingFaceServiceSettingsDeserializer(
			ObjectDeserializer<HuggingFaceServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
