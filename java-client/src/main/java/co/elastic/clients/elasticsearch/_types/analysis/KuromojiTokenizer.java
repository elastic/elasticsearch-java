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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.KuromojiTokenizer
@JsonpDeserializable
public final class KuromojiTokenizer extends TokenizerBase implements TokenizerVariant {
	private final boolean discardPunctuation;

	private final KuromojiTokenizationMode mode;

	private final int nbestCost;

	private final String nbestExamples;

	private final String userDictionary;

	private final List<String> userDictionaryRules;

	// ---------------------------------------------------------------------------------------------

	public KuromojiTokenizer(Builder builder) {
		super(builder);

		this.discardPunctuation = Objects.requireNonNull(builder.discardPunctuation, "discard_punctuation");
		this.mode = Objects.requireNonNull(builder.mode, "mode");
		this.nbestCost = Objects.requireNonNull(builder.nbestCost, "nbest_cost");
		this.nbestExamples = Objects.requireNonNull(builder.nbestExamples, "nbest_examples");
		this.userDictionary = Objects.requireNonNull(builder.userDictionary, "user_dictionary");
		this.userDictionaryRules = ModelTypeHelper.unmodifiableNonNull(builder.userDictionaryRules,
				"user_dictionary_rules");

	}

	public KuromojiTokenizer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "kuromoji_tokenizer";
	}

	/**
	 * Required - API name: {@code discard_punctuation}
	 */
	public boolean discardPunctuation() {
		return this.discardPunctuation;
	}

	/**
	 * Required - API name: {@code mode}
	 */
	public KuromojiTokenizationMode mode() {
		return this.mode;
	}

	/**
	 * Required - API name: {@code nbest_cost}
	 */
	public int nbestCost() {
		return this.nbestCost;
	}

	/**
	 * Required - API name: {@code nbest_examples}
	 */
	public String nbestExamples() {
		return this.nbestExamples;
	}

	/**
	 * Required - API name: {@code user_dictionary}
	 */
	public String userDictionary() {
		return this.userDictionary;
	}

	/**
	 * Required - API name: {@code user_dictionary_rules}
	 */
	public List<String> userDictionaryRules() {
		return this.userDictionaryRules;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_tokenizer");
		super.serializeInternal(generator, mapper);

		generator.writeKey("discard_punctuation");
		generator.write(this.discardPunctuation);

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);

		generator.writeKey("nbest_cost");
		generator.write(this.nbestCost);

		generator.writeKey("nbest_examples");
		generator.write(this.nbestExamples);

		generator.writeKey("user_dictionary");
		generator.write(this.userDictionary);

		generator.writeKey("user_dictionary_rules");
		generator.writeStartArray();
		for (String item0 : this.userDictionaryRules) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiTokenizer> {
		private Boolean discardPunctuation;

		private KuromojiTokenizationMode mode;

		private Integer nbestCost;

		private String nbestExamples;

		private String userDictionary;

		private List<String> userDictionaryRules;

		/**
		 * Required - API name: {@code discard_punctuation}
		 */
		public Builder discardPunctuation(boolean value) {
			this.discardPunctuation = value;
			return this;
		}

		/**
		 * Required - API name: {@code mode}
		 */
		public Builder mode(KuromojiTokenizationMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * Required - API name: {@code nbest_cost}
		 */
		public Builder nbestCost(int value) {
			this.nbestCost = value;
			return this;
		}

		/**
		 * Required - API name: {@code nbest_examples}
		 */
		public Builder nbestExamples(String value) {
			this.nbestExamples = value;
			return this;
		}

		/**
		 * Required - API name: {@code user_dictionary}
		 */
		public Builder userDictionary(String value) {
			this.userDictionary = value;
			return this;
		}

		/**
		 * Required - API name: {@code user_dictionary_rules}
		 */
		public Builder userDictionaryRules(List<String> value) {
			this.userDictionaryRules = value;
			return this;
		}

		/**
		 * Required - API name: {@code user_dictionary_rules}
		 */
		public Builder userDictionaryRules(String... value) {
			this.userDictionaryRules = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #userDictionaryRules(List)}, creating the list if
		 * needed.
		 */
		public Builder addUserDictionaryRules(String value) {
			if (this.userDictionaryRules == null) {
				this.userDictionaryRules = new ArrayList<>();
			}
			this.userDictionaryRules.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiTokenizer build() {

			return new KuromojiTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiTokenizer}
	 */
	public static final JsonpDeserializer<KuromojiTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KuromojiTokenizer::setupKuromojiTokenizerDeserializer, Builder::build);

	protected static void setupKuromojiTokenizerDeserializer(DelegatingDeserializer<KuromojiTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::discardPunctuation, JsonpDeserializer.booleanDeserializer(), "discard_punctuation");
		op.add(Builder::mode, KuromojiTokenizationMode._DESERIALIZER, "mode");
		op.add(Builder::nbestCost, JsonpDeserializer.integerDeserializer(), "nbest_cost");
		op.add(Builder::nbestExamples, JsonpDeserializer.stringDeserializer(), "nbest_examples");
		op.add(Builder::userDictionary, JsonpDeserializer.stringDeserializer(), "user_dictionary");
		op.add(Builder::userDictionaryRules,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "user_dictionary_rules");

		op.ignore("type");
	}

}
