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
import java.lang.Integer;
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

// typedef: inference._types.JinaAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.JinaAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class JinaAIServiceSettings implements JsonpSerializable {
	private final String apiKey;

	private final String modelId;

	@Nullable
	private final RateLimitSetting rateLimit;

	@Nullable
	private final JinaAISimilarityType similarity;

	@Nullable
	private final Integer dimensions;

	@Nullable
	private final JinaAIElementType elementType;

	// ---------------------------------------------------------------------------------------------

	private JinaAIServiceSettings(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.rateLimit = builder.rateLimit;
		this.similarity = builder.similarity;
		this.dimensions = builder.dimensions;
		this.elementType = builder.elementType;

	}

	public static JinaAIServiceSettings of(Function<Builder, ObjectBuilder<JinaAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid API key of your JinaAI account.
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
	 * Required - The name of the model to use for the inference task.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * JinaAI. By default, the <code>jinaai</code> service sets the number of
	 * requests allowed per minute to 2000 for all task types.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * For a <code>text_embedding</code> task, the similarity measure. One of
	 * cosine, dot_product, l2_norm. The default values varies with the embedding
	 * type. For example, a float embedding type uses a <code>dot_product</code>
	 * similarity measure by default.
	 * <p>
	 * API name: {@code similarity}
	 */
	@Nullable
	public final JinaAISimilarityType similarity() {
		return this.similarity;
	}

	/**
	 * For a <code>text_embedding</code> task, the number of dimensions the
	 * resulting output embeddings should have. By default, the model's standard
	 * output dimension is used. Refer to the Jina documentation for more
	 * information.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
	}

	/**
	 * For a <code>text_embedding</code> task, the data type returned by the model.
	 * Use <code>bit</code> for binary embeddings, which are encoded as bytes with
	 * signed int8 precision. Use <code>binary</code> for binary embeddings, which
	 * are encoded as bytes with signed int8 precision (this is a synonym of
	 * <code>bit</code>). Use <code>float</code> for the default float embeddings.
	 * <p>
	 * API name: {@code element_type}
	 */
	@Nullable
	public final JinaAIElementType elementType() {
		return this.elementType;
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

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		if (this.similarity != null) {
			generator.writeKey("similarity");
			this.similarity.serialize(generator, mapper);
		}
		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}
		if (this.elementType != null) {
			generator.writeKey("element_type");
			this.elementType.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JinaAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<JinaAIServiceSettings> {
		private String apiKey;

		private String modelId;

		@Nullable
		private RateLimitSetting rateLimit;

		@Nullable
		private JinaAISimilarityType similarity;

		@Nullable
		private Integer dimensions;

		@Nullable
		private JinaAIElementType elementType;

		public Builder() {
		}
		private Builder(JinaAIServiceSettings instance) {
			this.apiKey = instance.apiKey;
			this.modelId = instance.modelId;
			this.rateLimit = instance.rateLimit;
			this.similarity = instance.similarity;
			this.dimensions = instance.dimensions;
			this.elementType = instance.elementType;

		}
		/**
		 * Required - A valid API key of your JinaAI account.
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
		 * Required - The name of the model to use for the inference task.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * JinaAI. By default, the <code>jinaai</code> service sets the number of
		 * requests allowed per minute to 2000 for all task types.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * JinaAI. By default, the <code>jinaai</code> service sets the number of
		 * requests allowed per minute to 2000 for all task types.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * For a <code>text_embedding</code> task, the similarity measure. One of
		 * cosine, dot_product, l2_norm. The default values varies with the embedding
		 * type. For example, a float embedding type uses a <code>dot_product</code>
		 * similarity measure by default.
		 * <p>
		 * API name: {@code similarity}
		 */
		public final Builder similarity(@Nullable JinaAISimilarityType value) {
			this.similarity = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the number of dimensions the
		 * resulting output embeddings should have. By default, the model's standard
		 * output dimension is used. Refer to the Jina documentation for more
		 * information.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the data type returned by the model.
		 * Use <code>bit</code> for binary embeddings, which are encoded as bytes with
		 * signed int8 precision. Use <code>binary</code> for binary embeddings, which
		 * are encoded as bytes with signed int8 precision (this is a synonym of
		 * <code>bit</code>). Use <code>float</code> for the default float embeddings.
		 * <p>
		 * API name: {@code element_type}
		 */
		public final Builder elementType(@Nullable JinaAIElementType value) {
			this.elementType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JinaAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JinaAIServiceSettings build() {
			_checkSingleUse();

			return new JinaAIServiceSettings(this);
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
	 * Json deserializer for {@link JinaAIServiceSettings}
	 */
	public static final JsonpDeserializer<JinaAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, JinaAIServiceSettings::setupJinaAIServiceSettingsDeserializer);

	protected static void setupJinaAIServiceSettingsDeserializer(ObjectDeserializer<JinaAIServiceSettings.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::similarity, JinaAISimilarityType._DESERIALIZER, "similarity");
		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");
		op.add(Builder::elementType, JinaAIElementType._DESERIALIZER, "element_type");

	}

}
