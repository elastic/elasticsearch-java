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

package co.elastic.clients.elasticsearch.inference.put_amazonbedrock;

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

// typedef: inference.put_amazonbedrock.AmazonBedrockTaskSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.put_amazonbedrock.AmazonBedrockTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AmazonBedrockTaskSettings implements JsonpSerializable {
	@Nullable
	private final Integer maxNewTokens;

	@Nullable
	private final Float temperature;

	@Nullable
	private final Float topK;

	@Nullable
	private final Float topP;

	// ---------------------------------------------------------------------------------------------

	private AmazonBedrockTaskSettings(Builder builder) {

		this.maxNewTokens = builder.maxNewTokens;
		this.temperature = builder.temperature;
		this.topK = builder.topK;
		this.topP = builder.topP;

	}

	public static AmazonBedrockTaskSettings of(Function<Builder, ObjectBuilder<AmazonBedrockTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>completion</code> task, it sets the maximum number for the output
	 * tokens to be generated.
	 * <p>
	 * API name: {@code max_new_tokens}
	 */
	@Nullable
	public final Integer maxNewTokens() {
		return this.maxNewTokens;
	}

	/**
	 * For a <code>completion</code> task, it is a number between 0.0 and 1.0 that
	 * controls the apparent creativity of the results. At temperature 0.0 the model
	 * is most deterministic, at temperature 1.0 most random. It should not be used
	 * if <code>top_p</code> or <code>top_k</code> is specified.
	 * <p>
	 * API name: {@code temperature}
	 */
	@Nullable
	public final Float temperature() {
		return this.temperature;
	}

	/**
	 * For a <code>completion</code> task, it limits samples to the top-K most
	 * likely words, balancing coherence and variability. It is only available for
	 * anthropic, cohere, and mistral providers. It is an alternative to
	 * <code>temperature</code>; it should not be used if <code>temperature</code>
	 * is specified.
	 * <p>
	 * API name: {@code top_k}
	 */
	@Nullable
	public final Float topK() {
		return this.topK;
	}

	/**
	 * For a <code>completion</code> task, it is a number in the range of 0.0 to
	 * 1.0, to eliminate low-probability tokens. Top-p uses nucleus sampling to
	 * select top tokens whose sum of likelihoods does not exceed a certain value,
	 * ensuring both variety and coherence. It is an alternative to
	 * <code>temperature</code>; it should not be used if <code>temperature</code>
	 * is specified.
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

		if (this.maxNewTokens != null) {
			generator.writeKey("max_new_tokens");
			generator.write(this.maxNewTokens);

		}
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
	 * Builder for {@link AmazonBedrockTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AmazonBedrockTaskSettings> {
		@Nullable
		private Integer maxNewTokens;

		@Nullable
		private Float temperature;

		@Nullable
		private Float topK;

		@Nullable
		private Float topP;

		/**
		 * For a <code>completion</code> task, it sets the maximum number for the output
		 * tokens to be generated.
		 * <p>
		 * API name: {@code max_new_tokens}
		 */
		public final Builder maxNewTokens(@Nullable Integer value) {
			this.maxNewTokens = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it is a number between 0.0 and 1.0 that
		 * controls the apparent creativity of the results. At temperature 0.0 the model
		 * is most deterministic, at temperature 1.0 most random. It should not be used
		 * if <code>top_p</code> or <code>top_k</code> is specified.
		 * <p>
		 * API name: {@code temperature}
		 */
		public final Builder temperature(@Nullable Float value) {
			this.temperature = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it limits samples to the top-K most
		 * likely words, balancing coherence and variability. It is only available for
		 * anthropic, cohere, and mistral providers. It is an alternative to
		 * <code>temperature</code>; it should not be used if <code>temperature</code>
		 * is specified.
		 * <p>
		 * API name: {@code top_k}
		 */
		public final Builder topK(@Nullable Float value) {
			this.topK = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, it is a number in the range of 0.0 to
		 * 1.0, to eliminate low-probability tokens. Top-p uses nucleus sampling to
		 * select top tokens whose sum of likelihoods does not exceed a certain value,
		 * ensuring both variety and coherence. It is an alternative to
		 * <code>temperature</code>; it should not be used if <code>temperature</code>
		 * is specified.
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
		 * Builds a {@link AmazonBedrockTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AmazonBedrockTaskSettings build() {
			_checkSingleUse();

			return new AmazonBedrockTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AmazonBedrockTaskSettings}
	 */
	public static final JsonpDeserializer<AmazonBedrockTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AmazonBedrockTaskSettings::setupAmazonBedrockTaskSettingsDeserializer);

	protected static void setupAmazonBedrockTaskSettingsDeserializer(
			ObjectDeserializer<AmazonBedrockTaskSettings.Builder> op) {

		op.add(Builder::maxNewTokens, JsonpDeserializer.integerDeserializer(), "max_new_tokens");
		op.add(Builder::temperature, JsonpDeserializer.floatDeserializer(), "temperature");
		op.add(Builder::topK, JsonpDeserializer.floatDeserializer(), "top_k");
		op.add(Builder::topP, JsonpDeserializer.floatDeserializer(), "top_p");

	}

}
