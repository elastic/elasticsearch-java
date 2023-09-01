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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.NlpBertTokenizationConfig

/**
 * BERT and MPNet tokenization configuration options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.NlpBertTokenizationConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class NlpBertTokenizationConfig implements TokenizationConfigVariant, JsonpSerializable {
	@Nullable
	private final Boolean doLowerCase;

	@Nullable
	private final Boolean withSpecialTokens;

	@Nullable
	private final Integer maxSequenceLength;

	@Nullable
	private final TokenizationTruncate truncate;

	@Nullable
	private final Integer span;

	// ---------------------------------------------------------------------------------------------

	private NlpBertTokenizationConfig(Builder builder) {

		this.doLowerCase = builder.doLowerCase;
		this.withSpecialTokens = builder.withSpecialTokens;
		this.maxSequenceLength = builder.maxSequenceLength;
		this.truncate = builder.truncate;
		this.span = builder.span;

	}

	public static NlpBertTokenizationConfig of(Function<Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizationConfig variant kind.
	 */
	@Override
	public TokenizationConfig.Kind _tokenizationConfigKind() {
		return TokenizationConfig.Kind.Mpnet;
	}

	/**
	 * Should the tokenizer lower case the text
	 * <p>
	 * API name: {@code do_lower_case}
	 */
	@Nullable
	public final Boolean doLowerCase() {
		return this.doLowerCase;
	}

	/**
	 * Is tokenization completed with special tokens
	 * <p>
	 * API name: {@code with_special_tokens}
	 */
	@Nullable
	public final Boolean withSpecialTokens() {
		return this.withSpecialTokens;
	}

	/**
	 * Maximum input sequence length for the model
	 * <p>
	 * API name: {@code max_sequence_length}
	 */
	@Nullable
	public final Integer maxSequenceLength() {
		return this.maxSequenceLength;
	}

	/**
	 * Should tokenization input be automatically truncated before sending to the
	 * model for inference
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final TokenizationTruncate truncate() {
		return this.truncate;
	}

	/**
	 * Tokenization spanning options. Special value of -1 indicates no spanning
	 * takes place
	 * <p>
	 * API name: {@code span}
	 */
	@Nullable
	public final Integer span() {
		return this.span;
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

		if (this.doLowerCase != null) {
			generator.writeKey("do_lower_case");
			generator.write(this.doLowerCase);

		}
		if (this.withSpecialTokens != null) {
			generator.writeKey("with_special_tokens");
			generator.write(this.withSpecialTokens);

		}
		if (this.maxSequenceLength != null) {
			generator.writeKey("max_sequence_length");
			generator.write(this.maxSequenceLength);

		}
		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}
		if (this.span != null) {
			generator.writeKey("span");
			generator.write(this.span);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NlpBertTokenizationConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NlpBertTokenizationConfig> {
		@Nullable
		private Boolean doLowerCase;

		@Nullable
		private Boolean withSpecialTokens;

		@Nullable
		private Integer maxSequenceLength;

		@Nullable
		private TokenizationTruncate truncate;

		@Nullable
		private Integer span;

		/**
		 * Should the tokenizer lower case the text
		 * <p>
		 * API name: {@code do_lower_case}
		 */
		public final Builder doLowerCase(@Nullable Boolean value) {
			this.doLowerCase = value;
			return this;
		}

		/**
		 * Is tokenization completed with special tokens
		 * <p>
		 * API name: {@code with_special_tokens}
		 */
		public final Builder withSpecialTokens(@Nullable Boolean value) {
			this.withSpecialTokens = value;
			return this;
		}

		/**
		 * Maximum input sequence length for the model
		 * <p>
		 * API name: {@code max_sequence_length}
		 */
		public final Builder maxSequenceLength(@Nullable Integer value) {
			this.maxSequenceLength = value;
			return this;
		}

		/**
		 * Should tokenization input be automatically truncated before sending to the
		 * model for inference
		 * <p>
		 * API name: {@code truncate}
		 */
		public final Builder truncate(@Nullable TokenizationTruncate value) {
			this.truncate = value;
			return this;
		}

		/**
		 * Tokenization spanning options. Special value of -1 indicates no spanning
		 * takes place
		 * <p>
		 * API name: {@code span}
		 */
		public final Builder span(@Nullable Integer value) {
			this.span = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NlpBertTokenizationConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NlpBertTokenizationConfig build() {
			_checkSingleUse();

			return new NlpBertTokenizationConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NlpBertTokenizationConfig}
	 */
	public static final JsonpDeserializer<NlpBertTokenizationConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NlpBertTokenizationConfig::setupNlpBertTokenizationConfigDeserializer);

	protected static void setupNlpBertTokenizationConfigDeserializer(
			ObjectDeserializer<NlpBertTokenizationConfig.Builder> op) {

		op.add(Builder::doLowerCase, JsonpDeserializer.booleanDeserializer(), "do_lower_case");
		op.add(Builder::withSpecialTokens, JsonpDeserializer.booleanDeserializer(), "with_special_tokens");
		op.add(Builder::maxSequenceLength, JsonpDeserializer.integerDeserializer(), "max_sequence_length");
		op.add(Builder::truncate, TokenizationTruncate._DESERIALIZER, "truncate");
		op.add(Builder::span, JsonpDeserializer.integerDeserializer(), "span");

	}

}
