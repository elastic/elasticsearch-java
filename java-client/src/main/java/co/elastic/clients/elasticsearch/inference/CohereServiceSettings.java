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

// typedef: inference._types.CohereServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CohereServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class CohereServiceSettings implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final CohereEmbeddingType embeddingType;

	@Nullable
	private final String modelId;

	@Nullable
	private final RateLimitSetting rateLimit;

	@Nullable
	private final CohereSimilarityType similarity;

	// ---------------------------------------------------------------------------------------------

	private CohereServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.embeddingType = builder.embeddingType;
		this.modelId = builder.modelId;
		this.rateLimit = builder.rateLimit;
		this.similarity = builder.similarity;

	}

	public static CohereServiceSettings of(Function<Builder, ObjectBuilder<CohereServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key for your Cohere account. You can find or create
	 * your Cohere API keys on the Cohere API key settings page.
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
	 * For a <code>text_embedding</code> task, the types of embeddings you want to
	 * get back. Use <code>byte</code> for signed int8 embeddings (this is a synonym
	 * of <code>int8</code>). Use <code>float</code> for the default float
	 * embeddings. Use <code>int8</code> for signed int8 embeddings.
	 * <p>
	 * API name: {@code embedding_type}
	 */
	@Nullable
	public final CohereEmbeddingType embeddingType() {
		return this.embeddingType;
	}

	/**
	 * For a <code>completion</code>, <code>rerank</code>, or
	 * <code>text_embedding</code> task, the name of the model to use for the
	 * inference task.
	 * <ul>
	 * <li>For the available <code>completion</code> models, refer to the
	 * <a href="https://docs.cohere.com/docs/models#command">Cohere command
	 * docs</a>.</li>
	 * <li>For the available <code>rerank</code> models, refer to the
	 * <a href="https://docs.cohere.com/reference/rerank-1">Cohere rerank
	 * docs</a>.</li>
	 * <li>For the available <code>text_embedding</code> models, refer to
	 * <a href="https://docs.cohere.com/reference/embed">Cohere embed docs</a>.</li>
	 * </ul>
	 * <p>
	 * The default value for a text embedding task is
	 * <code>embed-english-v2.0</code>.
	 * <p>
	 * API name: {@code model_id}
	 */
	@Nullable
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Cohere. By default, the <code>cohere</code> service sets the number of
	 * requests allowed per minute to 10000.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * The similarity measure. If the <code>embedding_type</code> is
	 * <code>float</code>, the default value is <code>dot_product</code>. If the
	 * <code>embedding_type</code> is <code>int8</code> or <code>byte</code>, the
	 * default value is <code>cosine</code>.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final CohereSimilarityType similarity() {
		return this.similarity;
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

		if (this.embeddingType != null) {
			generator.writeKey("embedding_type");
			this.embeddingType.serialize(generator, mapper);
		}
		if (this.modelId != null) {
			generator.writeKey("model_id");
			generator.write(this.modelId);

		}
		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			this.similarity.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CohereServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CohereServiceSettings> {
		private String apiKey;

		@Nullable
		private CohereEmbeddingType embeddingType;

		@Nullable
		private String modelId;

		@Nullable
		private RateLimitSetting rateLimit;

		@Nullable
		private CohereSimilarityType similarity;

		/**
		 * Required - A valid API key for your Cohere account. You can find or create
		 * your Cohere API keys on the Cohere API key settings page.
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
		 * For a <code>text_embedding</code> task, the types of embeddings you want to
		 * get back. Use <code>byte</code> for signed int8 embeddings (this is a synonym
		 * of <code>int8</code>). Use <code>float</code> for the default float
		 * embeddings. Use <code>int8</code> for signed int8 embeddings.
		 * <p>
		 * API name: {@code embedding_type}
		 */
		public final Builder embeddingType(@Nullable CohereEmbeddingType value) {
			this.embeddingType = value;
			return this;
		}

		/**
		 * For a <code>completion</code>, <code>rerank</code>, or
		 * <code>text_embedding</code> task, the name of the model to use for the
		 * inference task.
		 * <ul>
		 * <li>For the available <code>completion</code> models, refer to the
		 * <a href="https://docs.cohere.com/docs/models#command">Cohere command
		 * docs</a>.</li>
		 * <li>For the available <code>rerank</code> models, refer to the
		 * <a href="https://docs.cohere.com/reference/rerank-1">Cohere rerank
		 * docs</a>.</li>
		 * <li>For the available <code>text_embedding</code> models, refer to
		 * <a href="https://docs.cohere.com/reference/embed">Cohere embed docs</a>.</li>
		 * </ul>
		 * <p>
		 * The default value for a text embedding task is
		 * <code>embed-english-v2.0</code>.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Cohere. By default, the <code>cohere</code> service sets the number of
		 * requests allowed per minute to 10000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Cohere. By default, the <code>cohere</code> service sets the number of
		 * requests allowed per minute to 10000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * The similarity measure. If the <code>embedding_type</code> is
		 * <code>float</code>, the default value is <code>dot_product</code>. If the
		 * <code>embedding_type</code> is <code>int8</code> or <code>byte</code>, the
		 * default value is <code>cosine</code>.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable CohereSimilarityType value) {
			this.similarity = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CohereServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CohereServiceSettings build() {
			_checkSingleUse();

			return new CohereServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CohereServiceSettings}
	 */
	public static final JsonpDeserializer<CohereServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CohereServiceSettings::setupCohereServiceSettingsDeserializer);

	protected static void setupCohereServiceSettingsDeserializer(ObjectDeserializer<CohereServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::embeddingType, CohereEmbeddingType._DESERIALIZER, "embedding_type");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::similarity, CohereSimilarityType._DESERIALIZER, "similarity");

	}

}
