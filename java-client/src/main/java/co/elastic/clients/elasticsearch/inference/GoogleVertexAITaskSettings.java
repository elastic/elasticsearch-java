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
import java.lang.Boolean;
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

// typedef: inference._types.GoogleVertexAITaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.GoogleVertexAITaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class GoogleVertexAITaskSettings implements JsonpSerializable {
	@Nullable
	private final Boolean autoTruncate;

	@Nullable
	private final Integer topN;

	@Nullable
	private final ThinkingConfig thinkingConfig;

	@Nullable
	private final Integer maxTokens;

	// ---------------------------------------------------------------------------------------------

	private GoogleVertexAITaskSettings(Builder builder) {

		this.autoTruncate = builder.autoTruncate;
		this.topN = builder.topN;
		this.thinkingConfig = builder.thinkingConfig;
		this.maxTokens = builder.maxTokens;

	}

	public static GoogleVertexAITaskSettings of(Function<Builder, ObjectBuilder<GoogleVertexAITaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>text_embedding</code> task, truncate inputs longer than the
	 * maximum token length automatically.
	 * <p>
	 * API name: {@code auto_truncate}
	 */
	@Nullable
	public final Boolean autoTruncate() {
		return this.autoTruncate;
	}

	/**
	 * For a <code>rerank</code> task, the number of the top N documents that should
	 * be returned.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
		return this.topN;
	}

	/**
	 * For a <code>completion</code> or <code>chat_completion</code> task, allows
	 * configuration of the thinking features for the model. Refer to the Google
	 * documentation for the allowable configurations for each model type.
	 * <p>
	 * API name: {@code thinking_config}
	 */
	@Nullable
	public final ThinkingConfig thinkingConfig() {
		return this.thinkingConfig;
	}

	/**
	 * For <code>completion</code> and <code>chat_completion</code> tasks, specifies
	 * the <code>max_tokens</code> value for requests sent to the Google Model
	 * Garden <code>anthropic</code> provider. If <code>provider</code> is not set
	 * to <code>anthropic</code>, this field is ignored. If <code>max_tokens</code>
	 * is specified - it must be a positive integer. If not specified, the default
	 * value of 1024 is used. Anthropic models require <code>max_tokens</code> to be
	 * set for each request. Please refer to the Anthropic documentation for more
	 * information.
	 * <p>
	 * API name: {@code max_tokens}
	 */
	@Nullable
	public final Integer maxTokens() {
		return this.maxTokens;
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

		if (this.autoTruncate != null) {
			generator.writeKey("auto_truncate");
			generator.write(this.autoTruncate);

		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}
		if (this.thinkingConfig != null) {
			generator.writeKey("thinking_config");
			this.thinkingConfig.serialize(generator, mapper);

		}
		if (this.maxTokens != null) {
			generator.writeKey("max_tokens");
			generator.write(this.maxTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GoogleVertexAITaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GoogleVertexAITaskSettings> {
		@Nullable
		private Boolean autoTruncate;

		@Nullable
		private Integer topN;

		@Nullable
		private ThinkingConfig thinkingConfig;

		@Nullable
		private Integer maxTokens;

		/**
		 * For a <code>text_embedding</code> task, truncate inputs longer than the
		 * maximum token length automatically.
		 * <p>
		 * API name: {@code auto_truncate}
		 */
		public final Builder autoTruncate(@Nullable Boolean value) {
			this.autoTruncate = value;
			return this;
		}

		/**
		 * For a <code>rerank</code> task, the number of the top N documents that should
		 * be returned.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		/**
		 * For a <code>completion</code> or <code>chat_completion</code> task, allows
		 * configuration of the thinking features for the model. Refer to the Google
		 * documentation for the allowable configurations for each model type.
		 * <p>
		 * API name: {@code thinking_config}
		 */
		public final Builder thinkingConfig(@Nullable ThinkingConfig value) {
			this.thinkingConfig = value;
			return this;
		}

		/**
		 * For a <code>completion</code> or <code>chat_completion</code> task, allows
		 * configuration of the thinking features for the model. Refer to the Google
		 * documentation for the allowable configurations for each model type.
		 * <p>
		 * API name: {@code thinking_config}
		 */
		public final Builder thinkingConfig(Function<ThinkingConfig.Builder, ObjectBuilder<ThinkingConfig>> fn) {
			return this.thinkingConfig(fn.apply(new ThinkingConfig.Builder()).build());
		}

		/**
		 * For <code>completion</code> and <code>chat_completion</code> tasks, specifies
		 * the <code>max_tokens</code> value for requests sent to the Google Model
		 * Garden <code>anthropic</code> provider. If <code>provider</code> is not set
		 * to <code>anthropic</code>, this field is ignored. If <code>max_tokens</code>
		 * is specified - it must be a positive integer. If not specified, the default
		 * value of 1024 is used. Anthropic models require <code>max_tokens</code> to be
		 * set for each request. Please refer to the Anthropic documentation for more
		 * information.
		 * <p>
		 * API name: {@code max_tokens}
		 */
		public final Builder maxTokens(@Nullable Integer value) {
			this.maxTokens = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GoogleVertexAITaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GoogleVertexAITaskSettings build() {
			_checkSingleUse();

			return new GoogleVertexAITaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GoogleVertexAITaskSettings}
	 */
	public static final JsonpDeserializer<GoogleVertexAITaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GoogleVertexAITaskSettings::setupGoogleVertexAITaskSettingsDeserializer);

	protected static void setupGoogleVertexAITaskSettingsDeserializer(
			ObjectDeserializer<GoogleVertexAITaskSettings.Builder> op) {

		op.add(Builder::autoTruncate, JsonpDeserializer.booleanDeserializer(), "auto_truncate");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");
		op.add(Builder::thinkingConfig, ThinkingConfig._DESERIALIZER, "thinking_config");
		op.add(Builder::maxTokens, JsonpDeserializer.integerDeserializer(), "max_tokens");

	}

}
