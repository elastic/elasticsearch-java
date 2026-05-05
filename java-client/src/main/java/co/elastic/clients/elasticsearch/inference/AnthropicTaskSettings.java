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
import java.lang.Float;
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

// typedef: inference._types.AnthropicTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AnthropicTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnthropicTaskSettings implements JsonpSerializable {
	private final int maxTokens;

	@Nullable
	private final Float temperature;

	@Nullable
	private final Integer topK;

	@Nullable
	private final Float topP;

	// ---------------------------------------------------------------------------------------------

	private AnthropicTaskSettings(Builder builder) {

		this.maxTokens = ApiTypeHelper.requireNonNull(builder.maxTokens, this, "maxTokens", 0);
		this.temperature = builder.temperature;
		this.topK = builder.topK;
		this.topP = builder.topP;

	}

	public static AnthropicTaskSettings of(Function<Builder, ObjectBuilder<AnthropicTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - For a <code>completion</code> task, it is the maximum number of
	 * tokens to generate before stopping.
	 * <p>
	 * API name: {@code max_tokens}
	 */
	public final int maxTokens() {
		return this.maxTokens;
	}

	/**
	 * For a <code>completion</code> task, it is the amount of randomness injected
	 * into the response. For more details about the supported range, refer to
	 * Anthropic documentation.
	 * <p>
	 * API name: {@code temperature}
	 */
	@Nullable
	public final Float temperature() {
		return this.temperature;
	}

	/**
	 * For a <code>completion</code> task, it specifies to only sample from the top
	 * K options for each subsequent token. It is recommended for advanced use cases
	 * only. You usually only need to use <code>temperature</code>.
	 * <p>
	 * API name: {@code top_k}
	 */
	@Nullable
	public final Integer topK() {
		return this.topK;
	}

	/**
	 * For a <code>completion</code> task, it specifies to use Anthropic's nucleus
	 * sampling. In nucleus sampling, Anthropic computes the cumulative distribution
	 * over all the options for each subsequent token in decreasing probability
	 * order and cuts it off once it reaches the specified probability. You should
	 * either alter <code>temperature</code> or <code>top_p</code>, but not both. It
	 * is recommended for advanced use cases only. You usually only need to use
	 * <code>temperature</code>.
	 * <p>
	 * API name: {@code top_p}
	 */
	@Nullable
	public final Float topP() {
		return this.topP;
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

		generator.writeKey("max_tokens");
		generator.write(this.maxTokens);

		if (this.temperature != null) {
			generator.writeKey("temperature");
			generator.write(this.temperature);

		}
		if (this.topK != null) {
			generator.writeKey("top_k");
			generator.write(this.topK);

		}
		if (this.topP != null) {
			generator.writeKey("top_p");
			generator.write(this.topP);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnthropicTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AnthropicTaskSettings> {
		private Integer maxTokens;

		@Nullable
		private Float temperature;

		@Nullable
		private Integer topK;

		@Nullable
		private Float topP;

		public Builder() {
		}
		private Builder(AnthropicTaskSettings instance) {
			this.maxTokens = instance.maxTokens;
			this.temperature = instance.temperature;
			this.topK = instance.topK;
			this.topP = instance.topP;

		}
		/**
		 * Required - For a <code>completion</code> task, it is the maximum number of
		 * tokens to generate before stopping.
		 * <p>
		 * API name: {@code max_tokens}
		 */
		public final Builder maxTokens(int value) {
			this.maxTokens = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it is the amount of randomness injected
		 * into the response. For more details about the supported range, refer to
		 * Anthropic documentation.
		 * <p>
		 * API name: {@code temperature}
		 */
		public final Builder temperature(@Nullable Float value) {
			this.temperature = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it specifies to only sample from the top
		 * K options for each subsequent token. It is recommended for advanced use cases
		 * only. You usually only need to use <code>temperature</code>.
		 * <p>
		 * API name: {@code top_k}
		 */
		public final Builder topK(@Nullable Integer value) {
			this.topK = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it specifies to use Anthropic's nucleus
		 * sampling. In nucleus sampling, Anthropic computes the cumulative distribution
		 * over all the options for each subsequent token in decreasing probability
		 * order and cuts it off once it reaches the specified probability. You should
		 * either alter <code>temperature</code> or <code>top_p</code>, but not both. It
		 * is recommended for advanced use cases only. You usually only need to use
		 * <code>temperature</code>.
		 * <p>
		 * API name: {@code top_p}
		 */
		public final Builder topP(@Nullable Float value) {
			this.topP = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnthropicTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnthropicTaskSettings build() {
			_checkSingleUse();

			return new AnthropicTaskSettings(this);
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
	 * Json deserializer for {@link AnthropicTaskSettings}
	 */
	public static final JsonpDeserializer<AnthropicTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnthropicTaskSettings::setupAnthropicTaskSettingsDeserializer);

	protected static void setupAnthropicTaskSettingsDeserializer(ObjectDeserializer<AnthropicTaskSettings.Builder> op) {

		op.add(Builder::maxTokens, JsonpDeserializer.integerDeserializer(), "max_tokens");
		op.add(Builder::temperature, JsonpDeserializer.floatDeserializer(), "temperature");
		op.add(Builder::topK, JsonpDeserializer.integerDeserializer(), "top_k");
		op.add(Builder::topP, JsonpDeserializer.floatDeserializer(), "top_p");

	}

}
