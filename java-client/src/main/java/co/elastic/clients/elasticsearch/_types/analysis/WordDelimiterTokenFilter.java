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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.WordDelimiterTokenFilter
@JsonpDeserializable
public final class WordDelimiterTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final Boolean catenateAll;

	private final Boolean catenateNumbers;

	private final Boolean catenateWords;

	private final Boolean generateNumberParts;

	private final Boolean generateWordParts;

	private final Boolean preserveOriginal;

	private final List<String> protectedWords;

	private final String protectedWordsPath;

	private final Boolean splitOnCaseChange;

	private final Boolean splitOnNumerics;

	private final Boolean stemEnglishPossessive;

	private final List<String> typeTable;

	private final String typeTablePath;

	// ---------------------------------------------------------------------------------------------

	public WordDelimiterTokenFilter(Builder builder) {
		super(builder);

		this.catenateAll = Objects.requireNonNull(builder.catenateAll, "catenate_all");
		this.catenateNumbers = Objects.requireNonNull(builder.catenateNumbers, "catenate_numbers");
		this.catenateWords = Objects.requireNonNull(builder.catenateWords, "catenate_words");
		this.generateNumberParts = Objects.requireNonNull(builder.generateNumberParts, "generate_number_parts");
		this.generateWordParts = Objects.requireNonNull(builder.generateWordParts, "generate_word_parts");
		this.preserveOriginal = Objects.requireNonNull(builder.preserveOriginal, "preserve_original");
		this.protectedWords = Objects.requireNonNull(builder.protectedWords, "protected_words");
		this.protectedWordsPath = Objects.requireNonNull(builder.protectedWordsPath, "protected_words_path");
		this.splitOnCaseChange = Objects.requireNonNull(builder.splitOnCaseChange, "split_on_case_change");
		this.splitOnNumerics = Objects.requireNonNull(builder.splitOnNumerics, "split_on_numerics");
		this.stemEnglishPossessive = Objects.requireNonNull(builder.stemEnglishPossessive, "stem_english_possessive");
		this.typeTable = Objects.requireNonNull(builder.typeTable, "type_table");
		this.typeTablePath = Objects.requireNonNull(builder.typeTablePath, "type_table_path");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "word_delimiter";
	}

	/**
	 * API name: {@code catenate_all}
	 */
	public Boolean catenateAll() {
		return this.catenateAll;
	}

	/**
	 * API name: {@code catenate_numbers}
	 */
	public Boolean catenateNumbers() {
		return this.catenateNumbers;
	}

	/**
	 * API name: {@code catenate_words}
	 */
	public Boolean catenateWords() {
		return this.catenateWords;
	}

	/**
	 * API name: {@code generate_number_parts}
	 */
	public Boolean generateNumberParts() {
		return this.generateNumberParts;
	}

	/**
	 * API name: {@code generate_word_parts}
	 */
	public Boolean generateWordParts() {
		return this.generateWordParts;
	}

	/**
	 * API name: {@code preserve_original}
	 */
	public Boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	/**
	 * API name: {@code protected_words}
	 */
	public List<String> protectedWords() {
		return this.protectedWords;
	}

	/**
	 * API name: {@code protected_words_path}
	 */
	public String protectedWordsPath() {
		return this.protectedWordsPath;
	}

	/**
	 * API name: {@code split_on_case_change}
	 */
	public Boolean splitOnCaseChange() {
		return this.splitOnCaseChange;
	}

	/**
	 * API name: {@code split_on_numerics}
	 */
	public Boolean splitOnNumerics() {
		return this.splitOnNumerics;
	}

	/**
	 * API name: {@code stem_english_possessive}
	 */
	public Boolean stemEnglishPossessive() {
		return this.stemEnglishPossessive;
	}

	/**
	 * API name: {@code type_table}
	 */
	public List<String> typeTable() {
		return this.typeTable;
	}

	/**
	 * API name: {@code type_table_path}
	 */
	public String typeTablePath() {
		return this.typeTablePath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "word_delimiter");
		super.serializeInternal(generator, mapper);

		generator.writeKey("catenate_all");
		generator.write(this.catenateAll);

		generator.writeKey("catenate_numbers");
		generator.write(this.catenateNumbers);

		generator.writeKey("catenate_words");
		generator.write(this.catenateWords);

		generator.writeKey("generate_number_parts");
		generator.write(this.generateNumberParts);

		generator.writeKey("generate_word_parts");
		generator.write(this.generateWordParts);

		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

		generator.writeKey("protected_words");
		generator.writeStartArray();
		for (String item0 : this.protectedWords) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("protected_words_path");
		generator.write(this.protectedWordsPath);

		generator.writeKey("split_on_case_change");
		generator.write(this.splitOnCaseChange);

		generator.writeKey("split_on_numerics");
		generator.write(this.splitOnNumerics);

		generator.writeKey("stem_english_possessive");
		generator.write(this.stemEnglishPossessive);

		generator.writeKey("type_table");
		generator.writeStartArray();
		for (String item0 : this.typeTable) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("type_table_path");
		generator.write(this.typeTablePath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WordDelimiterTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WordDelimiterTokenFilter> {
		private Boolean catenateAll;

		private Boolean catenateNumbers;

		private Boolean catenateWords;

		private Boolean generateNumberParts;

		private Boolean generateWordParts;

		private Boolean preserveOriginal;

		private List<String> protectedWords;

		private String protectedWordsPath;

		private Boolean splitOnCaseChange;

		private Boolean splitOnNumerics;

		private Boolean stemEnglishPossessive;

		private List<String> typeTable;

		private String typeTablePath;

		/**
		 * API name: {@code catenate_all}
		 */
		public Builder catenateAll(Boolean value) {
			this.catenateAll = value;
			return this;
		}

		/**
		 * API name: {@code catenate_numbers}
		 */
		public Builder catenateNumbers(Boolean value) {
			this.catenateNumbers = value;
			return this;
		}

		/**
		 * API name: {@code catenate_words}
		 */
		public Builder catenateWords(Boolean value) {
			this.catenateWords = value;
			return this;
		}

		/**
		 * API name: {@code generate_number_parts}
		 */
		public Builder generateNumberParts(Boolean value) {
			this.generateNumberParts = value;
			return this;
		}

		/**
		 * API name: {@code generate_word_parts}
		 */
		public Builder generateWordParts(Boolean value) {
			this.generateWordParts = value;
			return this;
		}

		/**
		 * API name: {@code preserve_original}
		 */
		public Builder preserveOriginal(Boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		/**
		 * API name: {@code protected_words}
		 */
		public Builder protectedWords(List<String> value) {
			this.protectedWords = value;
			return this;
		}

		/**
		 * API name: {@code protected_words}
		 */
		public Builder protectedWords(String... value) {
			this.protectedWords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #protectedWords(List)}, creating the list if needed.
		 */
		public Builder addProtectedWords(String value) {
			if (this.protectedWords == null) {
				this.protectedWords = new ArrayList<>();
			}
			this.protectedWords.add(value);
			return this;
		}

		/**
		 * API name: {@code protected_words_path}
		 */
		public Builder protectedWordsPath(String value) {
			this.protectedWordsPath = value;
			return this;
		}

		/**
		 * API name: {@code split_on_case_change}
		 */
		public Builder splitOnCaseChange(Boolean value) {
			this.splitOnCaseChange = value;
			return this;
		}

		/**
		 * API name: {@code split_on_numerics}
		 */
		public Builder splitOnNumerics(Boolean value) {
			this.splitOnNumerics = value;
			return this;
		}

		/**
		 * API name: {@code stem_english_possessive}
		 */
		public Builder stemEnglishPossessive(Boolean value) {
			this.stemEnglishPossessive = value;
			return this;
		}

		/**
		 * API name: {@code type_table}
		 */
		public Builder typeTable(List<String> value) {
			this.typeTable = value;
			return this;
		}

		/**
		 * API name: {@code type_table}
		 */
		public Builder typeTable(String... value) {
			this.typeTable = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #typeTable(List)}, creating the list if needed.
		 */
		public Builder addTypeTable(String value) {
			if (this.typeTable == null) {
				this.typeTable = new ArrayList<>();
			}
			this.typeTable.add(value);
			return this;
		}

		/**
		 * API name: {@code type_table_path}
		 */
		public Builder typeTablePath(String value) {
			this.typeTablePath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WordDelimiterTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WordDelimiterTokenFilter build() {

			return new WordDelimiterTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WordDelimiterTokenFilter}
	 */
	public static final JsonpDeserializer<WordDelimiterTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WordDelimiterTokenFilter::setupWordDelimiterTokenFilterDeserializer, Builder::build);

	protected static void setupWordDelimiterTokenFilterDeserializer(
			DelegatingDeserializer<WordDelimiterTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::catenateAll, JsonpDeserializer.booleanDeserializer(), "catenate_all");
		op.add(Builder::catenateNumbers, JsonpDeserializer.booleanDeserializer(), "catenate_numbers");
		op.add(Builder::catenateWords, JsonpDeserializer.booleanDeserializer(), "catenate_words");
		op.add(Builder::generateNumberParts, JsonpDeserializer.booleanDeserializer(), "generate_number_parts");
		op.add(Builder::generateWordParts, JsonpDeserializer.booleanDeserializer(), "generate_word_parts");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");
		op.add(Builder::protectedWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"protected_words");
		op.add(Builder::protectedWordsPath, JsonpDeserializer.stringDeserializer(), "protected_words_path");
		op.add(Builder::splitOnCaseChange, JsonpDeserializer.booleanDeserializer(), "split_on_case_change");
		op.add(Builder::splitOnNumerics, JsonpDeserializer.booleanDeserializer(), "split_on_numerics");
		op.add(Builder::stemEnglishPossessive, JsonpDeserializer.booleanDeserializer(), "stem_english_possessive");
		op.add(Builder::typeTable, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"type_table");
		op.add(Builder::typeTablePath, JsonpDeserializer.stringDeserializer(), "type_table_path");

		op.ignore("type");
	}

}
