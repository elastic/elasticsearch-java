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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
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

// typedef: _types.analysis.WordDelimiterTokenFilterBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.WordDelimiterTokenFilterBase">API
 *      specification</a>
 */

public abstract class WordDelimiterTokenFilterBase extends TokenFilterBase {
	@Nullable
	private final Boolean catenateAll;

	@Nullable
	private final Boolean catenateNumbers;

	@Nullable
	private final Boolean catenateWords;

	@Nullable
	private final Boolean generateNumberParts;

	@Nullable
	private final Boolean generateWordParts;

	@Nullable
	private final Boolean preserveOriginal;

	private final List<String> protectedWords;

	@Nullable
	private final String protectedWordsPath;

	@Nullable
	private final Boolean splitOnCaseChange;

	@Nullable
	private final Boolean splitOnNumerics;

	@Nullable
	private final Boolean stemEnglishPossessive;

	private final List<String> typeTable;

	@Nullable
	private final String typeTablePath;

	// ---------------------------------------------------------------------------------------------

	protected WordDelimiterTokenFilterBase(AbstractBuilder<?> builder) {
		super(builder);

		this.catenateAll = builder.catenateAll;
		this.catenateNumbers = builder.catenateNumbers;
		this.catenateWords = builder.catenateWords;
		this.generateNumberParts = builder.generateNumberParts;
		this.generateWordParts = builder.generateWordParts;
		this.preserveOriginal = builder.preserveOriginal;
		this.protectedWords = ApiTypeHelper.unmodifiable(builder.protectedWords);
		this.protectedWordsPath = builder.protectedWordsPath;
		this.splitOnCaseChange = builder.splitOnCaseChange;
		this.splitOnNumerics = builder.splitOnNumerics;
		this.stemEnglishPossessive = builder.stemEnglishPossessive;
		this.typeTable = ApiTypeHelper.unmodifiable(builder.typeTable);
		this.typeTablePath = builder.typeTablePath;

	}

	/**
	 * If <code>true</code>, the filter produces catenated tokens for chains of
	 * alphanumeric characters separated by non-alphabetic delimiters. Defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code catenate_all}
	 */
	@Nullable
	public final Boolean catenateAll() {
		return this.catenateAll;
	}

	/**
	 * If <code>true</code>, the filter produces catenated tokens for chains of
	 * numeric characters separated by non-alphabetic delimiters. Defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code catenate_numbers}
	 */
	@Nullable
	public final Boolean catenateNumbers() {
		return this.catenateNumbers;
	}

	/**
	 * If <code>true</code>, the filter produces catenated tokens for chains of
	 * alphabetical characters separated by non-alphabetic delimiters. Defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code catenate_words}
	 */
	@Nullable
	public final Boolean catenateWords() {
		return this.catenateWords;
	}

	/**
	 * If <code>true</code>, the filter includes tokens consisting of only numeric
	 * characters in the output. If <code>false</code>, the filter excludes these
	 * tokens from the output. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code generate_number_parts}
	 */
	@Nullable
	public final Boolean generateNumberParts() {
		return this.generateNumberParts;
	}

	/**
	 * If <code>true</code>, the filter includes tokens consisting of only
	 * alphabetical characters in the output. If <code>false</code>, the filter
	 * excludes these tokens from the output. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code generate_word_parts}
	 */
	@Nullable
	public final Boolean generateWordParts() {
		return this.generateWordParts;
	}

	/**
	 * If <code>true</code>, the filter includes the original version of any split
	 * tokens in the output. This original version includes non-alphanumeric
	 * delimiters. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code preserve_original}
	 */
	@Nullable
	public final Boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	/**
	 * Array of tokens the filter won’t split.
	 * <p>
	 * API name: {@code protected_words}
	 */
	public final List<String> protectedWords() {
		return this.protectedWords;
	}

	/**
	 * Path to a file that contains a list of tokens the filter won’t split. This
	 * path must be absolute or relative to the <code>config</code> location, and
	 * the file must be UTF-8 encoded. Each token in the file must be separated by a
	 * line break.
	 * <p>
	 * API name: {@code protected_words_path}
	 */
	@Nullable
	public final String protectedWordsPath() {
		return this.protectedWordsPath;
	}

	/**
	 * If <code>true</code>, the filter splits tokens at letter case transitions.
	 * For example: camelCase -&gt; [ camel, Case ]. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code split_on_case_change}
	 */
	@Nullable
	public final Boolean splitOnCaseChange() {
		return this.splitOnCaseChange;
	}

	/**
	 * If <code>true</code>, the filter splits tokens at letter-number transitions.
	 * For example: j2se -&gt; [ j, 2, se ]. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code split_on_numerics}
	 */
	@Nullable
	public final Boolean splitOnNumerics() {
		return this.splitOnNumerics;
	}

	/**
	 * If <code>true</code>, the filter removes the English possessive
	 * (<code>'s</code>) from the end of each token. For example: O'Neil's -&gt; [
	 * O, Neil ]. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code stem_english_possessive}
	 */
	@Nullable
	public final Boolean stemEnglishPossessive() {
		return this.stemEnglishPossessive;
	}

	/**
	 * Array of custom type mappings for characters. This allows you to map
	 * non-alphanumeric characters as numeric or alphanumeric to avoid splitting on
	 * those characters.
	 * <p>
	 * API name: {@code type_table}
	 */
	public final List<String> typeTable() {
		return this.typeTable;
	}

	/**
	 * Path to a file that contains custom type mappings for characters. This allows
	 * you to map non-alphanumeric characters as numeric or alphanumeric to avoid
	 * splitting on those characters.
	 * <p>
	 * API name: {@code type_table_path}
	 */
	@Nullable
	public final String typeTablePath() {
		return this.typeTablePath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.catenateAll != null) {
			generator.writeKey("catenate_all");
			generator.write(this.catenateAll);

		}
		if (this.catenateNumbers != null) {
			generator.writeKey("catenate_numbers");
			generator.write(this.catenateNumbers);

		}
		if (this.catenateWords != null) {
			generator.writeKey("catenate_words");
			generator.write(this.catenateWords);

		}
		if (this.generateNumberParts != null) {
			generator.writeKey("generate_number_parts");
			generator.write(this.generateNumberParts);

		}
		if (this.generateWordParts != null) {
			generator.writeKey("generate_word_parts");
			generator.write(this.generateWordParts);

		}
		if (this.preserveOriginal != null) {
			generator.writeKey("preserve_original");
			generator.write(this.preserveOriginal);

		}
		if (ApiTypeHelper.isDefined(this.protectedWords)) {
			generator.writeKey("protected_words");
			generator.writeStartArray();
			for (String item0 : this.protectedWords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.protectedWordsPath != null) {
			generator.writeKey("protected_words_path");
			generator.write(this.protectedWordsPath);

		}
		if (this.splitOnCaseChange != null) {
			generator.writeKey("split_on_case_change");
			generator.write(this.splitOnCaseChange);

		}
		if (this.splitOnNumerics != null) {
			generator.writeKey("split_on_numerics");
			generator.write(this.splitOnNumerics);

		}
		if (this.stemEnglishPossessive != null) {
			generator.writeKey("stem_english_possessive");
			generator.write(this.stemEnglishPossessive);

		}
		if (ApiTypeHelper.isDefined(this.typeTable)) {
			generator.writeKey("type_table");
			generator.writeStartArray();
			for (String item0 : this.typeTable) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.typeTablePath != null) {
			generator.writeKey("type_table_path");
			generator.write(this.typeTablePath);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				TokenFilterBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean catenateAll;

		@Nullable
		private Boolean catenateNumbers;

		@Nullable
		private Boolean catenateWords;

		@Nullable
		private Boolean generateNumberParts;

		@Nullable
		private Boolean generateWordParts;

		@Nullable
		private Boolean preserveOriginal;

		@Nullable
		private List<String> protectedWords;

		@Nullable
		private String protectedWordsPath;

		@Nullable
		private Boolean splitOnCaseChange;

		@Nullable
		private Boolean splitOnNumerics;

		@Nullable
		private Boolean stemEnglishPossessive;

		@Nullable
		private List<String> typeTable;

		@Nullable
		private String typeTablePath;

		/**
		 * If <code>true</code>, the filter produces catenated tokens for chains of
		 * alphanumeric characters separated by non-alphabetic delimiters. Defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code catenate_all}
		 */
		public final BuilderT catenateAll(@Nullable Boolean value) {
			this.catenateAll = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter produces catenated tokens for chains of
		 * numeric characters separated by non-alphabetic delimiters. Defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code catenate_numbers}
		 */
		public final BuilderT catenateNumbers(@Nullable Boolean value) {
			this.catenateNumbers = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter produces catenated tokens for chains of
		 * alphabetical characters separated by non-alphabetic delimiters. Defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code catenate_words}
		 */
		public final BuilderT catenateWords(@Nullable Boolean value) {
			this.catenateWords = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter includes tokens consisting of only numeric
		 * characters in the output. If <code>false</code>, the filter excludes these
		 * tokens from the output. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code generate_number_parts}
		 */
		public final BuilderT generateNumberParts(@Nullable Boolean value) {
			this.generateNumberParts = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter includes tokens consisting of only
		 * alphabetical characters in the output. If <code>false</code>, the filter
		 * excludes these tokens from the output. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code generate_word_parts}
		 */
		public final BuilderT generateWordParts(@Nullable Boolean value) {
			this.generateWordParts = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter includes the original version of any split
		 * tokens in the output. This original version includes non-alphanumeric
		 * delimiters. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code preserve_original}
		 */
		public final BuilderT preserveOriginal(@Nullable Boolean value) {
			this.preserveOriginal = value;
			return self();
		}

		/**
		 * Array of tokens the filter won’t split.
		 * <p>
		 * API name: {@code protected_words}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>protectedWords</code>.
		 */
		public final BuilderT protectedWords(List<String> list) {
			this.protectedWords = _listAddAll(this.protectedWords, list);
			return self();
		}

		/**
		 * Array of tokens the filter won’t split.
		 * <p>
		 * API name: {@code protected_words}
		 * <p>
		 * Adds one or more values to <code>protectedWords</code>.
		 */
		public final BuilderT protectedWords(String value, String... values) {
			this.protectedWords = _listAdd(this.protectedWords, value, values);
			return self();
		}

		/**
		 * Path to a file that contains a list of tokens the filter won’t split. This
		 * path must be absolute or relative to the <code>config</code> location, and
		 * the file must be UTF-8 encoded. Each token in the file must be separated by a
		 * line break.
		 * <p>
		 * API name: {@code protected_words_path}
		 */
		public final BuilderT protectedWordsPath(@Nullable String value) {
			this.protectedWordsPath = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter splits tokens at letter case transitions.
		 * For example: camelCase -&gt; [ camel, Case ]. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code split_on_case_change}
		 */
		public final BuilderT splitOnCaseChange(@Nullable Boolean value) {
			this.splitOnCaseChange = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter splits tokens at letter-number transitions.
		 * For example: j2se -&gt; [ j, 2, se ]. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code split_on_numerics}
		 */
		public final BuilderT splitOnNumerics(@Nullable Boolean value) {
			this.splitOnNumerics = value;
			return self();
		}

		/**
		 * If <code>true</code>, the filter removes the English possessive
		 * (<code>'s</code>) from the end of each token. For example: O'Neil's -&gt; [
		 * O, Neil ]. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code stem_english_possessive}
		 */
		public final BuilderT stemEnglishPossessive(@Nullable Boolean value) {
			this.stemEnglishPossessive = value;
			return self();
		}

		/**
		 * Array of custom type mappings for characters. This allows you to map
		 * non-alphanumeric characters as numeric or alphanumeric to avoid splitting on
		 * those characters.
		 * <p>
		 * API name: {@code type_table}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>typeTable</code>.
		 */
		public final BuilderT typeTable(List<String> list) {
			this.typeTable = _listAddAll(this.typeTable, list);
			return self();
		}

		/**
		 * Array of custom type mappings for characters. This allows you to map
		 * non-alphanumeric characters as numeric or alphanumeric to avoid splitting on
		 * those characters.
		 * <p>
		 * API name: {@code type_table}
		 * <p>
		 * Adds one or more values to <code>typeTable</code>.
		 */
		public final BuilderT typeTable(String value, String... values) {
			this.typeTable = _listAdd(this.typeTable, value, values);
			return self();
		}

		/**
		 * Path to a file that contains custom type mappings for characters. This allows
		 * you to map non-alphanumeric characters as numeric or alphanumeric to avoid
		 * splitting on those characters.
		 * <p>
		 * API name: {@code type_table_path}
		 */
		public final BuilderT typeTablePath(@Nullable String value) {
			this.typeTablePath = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWordDelimiterTokenFilterBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(AbstractBuilder::catenateAll, JsonpDeserializer.booleanDeserializer(), "catenate_all");
		op.add(AbstractBuilder::catenateNumbers, JsonpDeserializer.booleanDeserializer(), "catenate_numbers");
		op.add(AbstractBuilder::catenateWords, JsonpDeserializer.booleanDeserializer(), "catenate_words");
		op.add(AbstractBuilder::generateNumberParts, JsonpDeserializer.booleanDeserializer(), "generate_number_parts");
		op.add(AbstractBuilder::generateWordParts, JsonpDeserializer.booleanDeserializer(), "generate_word_parts");
		op.add(AbstractBuilder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");
		op.add(AbstractBuilder::protectedWords,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "protected_words");
		op.add(AbstractBuilder::protectedWordsPath, JsonpDeserializer.stringDeserializer(), "protected_words_path");
		op.add(AbstractBuilder::splitOnCaseChange, JsonpDeserializer.booleanDeserializer(), "split_on_case_change");
		op.add(AbstractBuilder::splitOnNumerics, JsonpDeserializer.booleanDeserializer(), "split_on_numerics");
		op.add(AbstractBuilder::stemEnglishPossessive, JsonpDeserializer.booleanDeserializer(),
				"stem_english_possessive");
		op.add(AbstractBuilder::typeTable, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"type_table");
		op.add(AbstractBuilder::typeTablePath, JsonpDeserializer.stringDeserializer(), "type_table_path");

	}

}
