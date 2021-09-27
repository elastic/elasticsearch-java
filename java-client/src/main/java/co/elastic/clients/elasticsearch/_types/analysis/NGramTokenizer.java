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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.NGramTokenizer
@JsonpDeserializable
public final class NGramTokenizer extends TokenizerBase implements TokenizerVariant {
	private final String customTokenChars;

	private final Integer maxGram;

	private final Integer minGram;

	private final List<TokenChar> tokenChars;

	// ---------------------------------------------------------------------------------------------

	public NGramTokenizer(Builder builder) {
		super(builder);

		this.customTokenChars = Objects.requireNonNull(builder.customTokenChars, "custom_token_chars");
		this.maxGram = Objects.requireNonNull(builder.maxGram, "max_gram");
		this.minGram = Objects.requireNonNull(builder.minGram, "min_gram");
		this.tokenChars = Objects.requireNonNull(builder.tokenChars, "token_chars");

	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "ngram";
	}

	/**
	 * API name: {@code custom_token_chars}
	 */
	public String customTokenChars() {
		return this.customTokenChars;
	}

	/**
	 * API name: {@code max_gram}
	 */
	public Integer maxGram() {
		return this.maxGram;
	}

	/**
	 * API name: {@code min_gram}
	 */
	public Integer minGram() {
		return this.minGram;
	}

	/**
	 * API name: {@code token_chars}
	 */
	public List<TokenChar> tokenChars() {
		return this.tokenChars;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "ngram");
		super.serializeInternal(generator, mapper);

		generator.writeKey("custom_token_chars");
		generator.write(this.customTokenChars);

		generator.writeKey("max_gram");
		generator.write(this.maxGram);

		generator.writeKey("min_gram");
		generator.write(this.minGram);

		generator.writeKey("token_chars");
		generator.writeStartArray();
		for (TokenChar item0 : this.tokenChars) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NGramTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NGramTokenizer> {
		private String customTokenChars;

		private Integer maxGram;

		private Integer minGram;

		private List<TokenChar> tokenChars;

		/**
		 * API name: {@code custom_token_chars}
		 */
		public Builder customTokenChars(String value) {
			this.customTokenChars = value;
			return this;
		}

		/**
		 * API name: {@code max_gram}
		 */
		public Builder maxGram(Integer value) {
			this.maxGram = value;
			return this;
		}

		/**
		 * API name: {@code min_gram}
		 */
		public Builder minGram(Integer value) {
			this.minGram = value;
			return this;
		}

		/**
		 * API name: {@code token_chars}
		 */
		public Builder tokenChars(List<TokenChar> value) {
			this.tokenChars = value;
			return this;
		}

		/**
		 * API name: {@code token_chars}
		 */
		public Builder tokenChars(TokenChar... value) {
			this.tokenChars = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokenChars(List)}, creating the list if needed.
		 */
		public Builder addTokenChars(TokenChar value) {
			if (this.tokenChars == null) {
				this.tokenChars = new ArrayList<>();
			}
			this.tokenChars.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NGramTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NGramTokenizer build() {

			return new NGramTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NGramTokenizer}
	 */
	public static final JsonpDeserializer<NGramTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NGramTokenizer::setupNGramTokenizerDeserializer, Builder::build);

	protected static void setupNGramTokenizerDeserializer(DelegatingDeserializer<NGramTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::customTokenChars, JsonpDeserializer.stringDeserializer(), "custom_token_chars");
		op.add(Builder::maxGram, JsonpDeserializer.integerDeserializer(), "max_gram");
		op.add(Builder::minGram, JsonpDeserializer.integerDeserializer(), "min_gram");
		op.add(Builder::tokenChars, JsonpDeserializer.arrayDeserializer(TokenChar._DESERIALIZER), "token_chars");

		op.ignore("type");
	}

}
