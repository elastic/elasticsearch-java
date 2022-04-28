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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link TokenizerDefinition} variants.
 */
public class TokenizerDefinitionBuilders {
	private TokenizerDefinitionBuilders() {
	}

	/**
	 * Creates a builder for the {@link CharGroupTokenizer char_group}
	 * {@code TokenizerDefinition} variant.
	 */
	public static CharGroupTokenizer.Builder charGroup() {
		return new CharGroupTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link CharGroupTokenizer char_group}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition charGroup(
			Function<CharGroupTokenizer.Builder, ObjectBuilder<CharGroupTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.charGroup(fn.apply(new CharGroupTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link EdgeNGramTokenizer edge_ngram}
	 * {@code TokenizerDefinition} variant.
	 */
	public static EdgeNGramTokenizer.Builder edgeNgram() {
		return new EdgeNGramTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link EdgeNGramTokenizer edge_ngram}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition edgeNgram(
			Function<EdgeNGramTokenizer.Builder, ObjectBuilder<EdgeNGramTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.edgeNgram(fn.apply(new EdgeNGramTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuTokenizer icu_tokenizer}
	 * {@code TokenizerDefinition} variant.
	 */
	public static IcuTokenizer.Builder icuTokenizer() {
		return new IcuTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link IcuTokenizer icu_tokenizer}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition icuTokenizer(Function<IcuTokenizer.Builder, ObjectBuilder<IcuTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.icuTokenizer(fn.apply(new IcuTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeywordTokenizer keyword}
	 * {@code TokenizerDefinition} variant.
	 */
	public static KeywordTokenizer.Builder keyword() {
		return new KeywordTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link KeywordTokenizer keyword}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition keyword(Function<KeywordTokenizer.Builder, ObjectBuilder<KeywordTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.keyword(fn.apply(new KeywordTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiTokenizer kuromoji_tokenizer}
	 * {@code TokenizerDefinition} variant.
	 */
	public static KuromojiTokenizer.Builder kuromojiTokenizer() {
		return new KuromojiTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link KuromojiTokenizer
	 * kuromoji_tokenizer} {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition kuromojiTokenizer(
			Function<KuromojiTokenizer.Builder, ObjectBuilder<KuromojiTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.kuromojiTokenizer(fn.apply(new KuromojiTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LetterTokenizer letter}
	 * {@code TokenizerDefinition} variant.
	 */
	public static LetterTokenizer.Builder letter() {
		return new LetterTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link LetterTokenizer letter}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition letter(Function<LetterTokenizer.Builder, ObjectBuilder<LetterTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.letter(fn.apply(new LetterTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LowercaseTokenizer lowercase}
	 * {@code TokenizerDefinition} variant.
	 */
	public static LowercaseTokenizer.Builder lowercase() {
		return new LowercaseTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link LowercaseTokenizer lowercase}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition lowercase(
			Function<LowercaseTokenizer.Builder, ObjectBuilder<LowercaseTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.lowercase(fn.apply(new LowercaseTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NGramTokenizer ngram}
	 * {@code TokenizerDefinition} variant.
	 */
	public static NGramTokenizer.Builder ngram() {
		return new NGramTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link NGramTokenizer ngram}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition ngram(Function<NGramTokenizer.Builder, ObjectBuilder<NGramTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.ngram(fn.apply(new NGramTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NoriTokenizer nori_tokenizer}
	 * {@code TokenizerDefinition} variant.
	 */
	public static NoriTokenizer.Builder noriTokenizer() {
		return new NoriTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link NoriTokenizer nori_tokenizer}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition noriTokenizer(Function<NoriTokenizer.Builder, ObjectBuilder<NoriTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.noriTokenizer(fn.apply(new NoriTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PathHierarchyTokenizer path_hierarchy}
	 * {@code TokenizerDefinition} variant.
	 */
	public static PathHierarchyTokenizer.Builder pathHierarchy() {
		return new PathHierarchyTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link PathHierarchyTokenizer
	 * path_hierarchy} {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition pathHierarchy(
			Function<PathHierarchyTokenizer.Builder, ObjectBuilder<PathHierarchyTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.pathHierarchy(fn.apply(new PathHierarchyTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PatternTokenizer pattern}
	 * {@code TokenizerDefinition} variant.
	 */
	public static PatternTokenizer.Builder pattern() {
		return new PatternTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link PatternTokenizer pattern}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition pattern(Function<PatternTokenizer.Builder, ObjectBuilder<PatternTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.pattern(fn.apply(new PatternTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StandardTokenizer standard}
	 * {@code TokenizerDefinition} variant.
	 */
	public static StandardTokenizer.Builder standard() {
		return new StandardTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link StandardTokenizer standard}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition standard(
			Function<StandardTokenizer.Builder, ObjectBuilder<StandardTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.standard(fn.apply(new StandardTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UaxEmailUrlTokenizer uax_url_email}
	 * {@code TokenizerDefinition} variant.
	 */
	public static UaxEmailUrlTokenizer.Builder uaxUrlEmail() {
		return new UaxEmailUrlTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link UaxEmailUrlTokenizer
	 * uax_url_email} {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition uaxUrlEmail(
			Function<UaxEmailUrlTokenizer.Builder, ObjectBuilder<UaxEmailUrlTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.uaxUrlEmail(fn.apply(new UaxEmailUrlTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WhitespaceTokenizer whitespace}
	 * {@code TokenizerDefinition} variant.
	 */
	public static WhitespaceTokenizer.Builder whitespace() {
		return new WhitespaceTokenizer.Builder();
	}

	/**
	 * Creates a TokenizerDefinition of the {@link WhitespaceTokenizer whitespace}
	 * {@code TokenizerDefinition} variant.
	 */
	public static TokenizerDefinition whitespace(
			Function<WhitespaceTokenizer.Builder, ObjectBuilder<WhitespaceTokenizer>> fn) {
		TokenizerDefinition.Builder builder = new TokenizerDefinition.Builder();
		builder.whitespace(fn.apply(new WhitespaceTokenizer.Builder()).build());
		return builder.build();
	}

}
