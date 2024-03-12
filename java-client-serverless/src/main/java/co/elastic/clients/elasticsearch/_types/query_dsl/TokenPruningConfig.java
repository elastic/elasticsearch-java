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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

// typedef: _types.query_dsl.TokenPruningConfig

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.TokenPruningConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenPruningConfig implements JsonpSerializable {
	@Nullable
	private final Integer tokensFreqRatioThreshold;

	@Nullable
	private final Float tokensWeightThreshold;

	@Nullable
	private final Boolean onlyScorePrunedTokens;

	// ---------------------------------------------------------------------------------------------

	private TokenPruningConfig(Builder builder) {

		this.tokensFreqRatioThreshold = builder.tokensFreqRatioThreshold;
		this.tokensWeightThreshold = builder.tokensWeightThreshold;
		this.onlyScorePrunedTokens = builder.onlyScorePrunedTokens;

	}

	public static TokenPruningConfig of(Function<Builder, ObjectBuilder<TokenPruningConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Tokens whose frequency is more than this threshold times the average
	 * frequency of all tokens in the specified field are considered outliers and
	 * pruned.
	 * <p>
	 * API name: {@code tokens_freq_ratio_threshold}
	 */
	@Nullable
	public final Integer tokensFreqRatioThreshold() {
		return this.tokensFreqRatioThreshold;
	}

	/**
	 * Tokens whose weight is less than this threshold are considered nonsignificant
	 * and pruned.
	 * <p>
	 * API name: {@code tokens_weight_threshold}
	 */
	@Nullable
	public final Float tokensWeightThreshold() {
		return this.tokensWeightThreshold;
	}

	/**
	 * Whether to only score pruned tokens, vs only scoring kept tokens.
	 * <p>
	 * API name: {@code only_score_pruned_tokens}
	 */
	@Nullable
	public final Boolean onlyScorePrunedTokens() {
		return this.onlyScorePrunedTokens;
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

		if (this.tokensFreqRatioThreshold != null) {
			generator.writeKey("tokens_freq_ratio_threshold");
			generator.write(this.tokensFreqRatioThreshold);

		}
		if (this.tokensWeightThreshold != null) {
			generator.writeKey("tokens_weight_threshold");
			generator.write(this.tokensWeightThreshold);

		}
		if (this.onlyScorePrunedTokens != null) {
			generator.writeKey("only_score_pruned_tokens");
			generator.write(this.onlyScorePrunedTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TokenPruningConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TokenPruningConfig> {
		@Nullable
		private Integer tokensFreqRatioThreshold;

		@Nullable
		private Float tokensWeightThreshold;

		@Nullable
		private Boolean onlyScorePrunedTokens;

		/**
		 * Tokens whose frequency is more than this threshold times the average
		 * frequency of all tokens in the specified field are considered outliers and
		 * pruned.
		 * <p>
		 * API name: {@code tokens_freq_ratio_threshold}
		 */
		public final Builder tokensFreqRatioThreshold(@Nullable Integer value) {
			this.tokensFreqRatioThreshold = value;
			return this;
		}

		/**
		 * Tokens whose weight is less than this threshold are considered nonsignificant
		 * and pruned.
		 * <p>
		 * API name: {@code tokens_weight_threshold}
		 */
		public final Builder tokensWeightThreshold(@Nullable Float value) {
			this.tokensWeightThreshold = value;
			return this;
		}

		/**
		 * Whether to only score pruned tokens, vs only scoring kept tokens.
		 * <p>
		 * API name: {@code only_score_pruned_tokens}
		 */
		public final Builder onlyScorePrunedTokens(@Nullable Boolean value) {
			this.onlyScorePrunedTokens = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TokenPruningConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TokenPruningConfig build() {
			_checkSingleUse();

			return new TokenPruningConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TokenPruningConfig}
	 */
	public static final JsonpDeserializer<TokenPruningConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenPruningConfig::setupTokenPruningConfigDeserializer);

	protected static void setupTokenPruningConfigDeserializer(ObjectDeserializer<TokenPruningConfig.Builder> op) {

		op.add(Builder::tokensFreqRatioThreshold, JsonpDeserializer.integerDeserializer(),
				"tokens_freq_ratio_threshold");
		op.add(Builder::tokensWeightThreshold, JsonpDeserializer.floatDeserializer(), "tokens_weight_threshold");
		op.add(Builder::onlyScorePrunedTokens, JsonpDeserializer.booleanDeserializer(), "only_score_pruned_tokens");

	}

}
