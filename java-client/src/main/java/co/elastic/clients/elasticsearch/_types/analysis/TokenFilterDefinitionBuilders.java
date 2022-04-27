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
 * Builders for {@link TokenFilterDefinition} variants.
 */
public class TokenFilterDefinitionBuilders {
	private TokenFilterDefinitionBuilders() {
	}

	/**
	 * Creates a builder for the {@link AsciiFoldingTokenFilter asciifolding}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static AsciiFoldingTokenFilter.Builder asciifolding() {
		return new AsciiFoldingTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link AsciiFoldingTokenFilter
	 * asciifolding} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition asciifolding(
			Function<AsciiFoldingTokenFilter.Builder, ObjectBuilder<AsciiFoldingTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.asciifolding(fn.apply(new AsciiFoldingTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CommonGramsTokenFilter common_grams}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static CommonGramsTokenFilter.Builder commonGrams() {
		return new CommonGramsTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link CommonGramsTokenFilter
	 * common_grams} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition commonGrams(
			Function<CommonGramsTokenFilter.Builder, ObjectBuilder<CommonGramsTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.commonGrams(fn.apply(new CommonGramsTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ConditionTokenFilter condition}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static ConditionTokenFilter.Builder condition() {
		return new ConditionTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link ConditionTokenFilter condition}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition condition(
			Function<ConditionTokenFilter.Builder, ObjectBuilder<ConditionTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.condition(fn.apply(new ConditionTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DelimitedPayloadTokenFilter
	 * delimited_payload} {@code TokenFilterDefinition} variant.
	 */
	public static DelimitedPayloadTokenFilter.Builder delimitedPayload() {
		return new DelimitedPayloadTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link DelimitedPayloadTokenFilter
	 * delimited_payload} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition delimitedPayload(
			Function<DelimitedPayloadTokenFilter.Builder, ObjectBuilder<DelimitedPayloadTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.delimitedPayload(fn.apply(new DelimitedPayloadTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DictionaryDecompounderTokenFilter
	 * dictionary_decompounder} {@code TokenFilterDefinition} variant.
	 */
	public static DictionaryDecompounderTokenFilter.Builder dictionaryDecompounder() {
		return new DictionaryDecompounderTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the
	 * {@link DictionaryDecompounderTokenFilter dictionary_decompounder}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition dictionaryDecompounder(
			Function<DictionaryDecompounderTokenFilter.Builder, ObjectBuilder<DictionaryDecompounderTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.dictionaryDecompounder(fn.apply(new DictionaryDecompounderTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link EdgeNGramTokenFilter edge_ngram}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static EdgeNGramTokenFilter.Builder edgeNgram() {
		return new EdgeNGramTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link EdgeNGramTokenFilter
	 * edge_ngram} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition edgeNgram(
			Function<EdgeNGramTokenFilter.Builder, ObjectBuilder<EdgeNGramTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.edgeNgram(fn.apply(new EdgeNGramTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ElisionTokenFilter elision}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static ElisionTokenFilter.Builder elision() {
		return new ElisionTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link ElisionTokenFilter elision}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition elision(
			Function<ElisionTokenFilter.Builder, ObjectBuilder<ElisionTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.elision(fn.apply(new ElisionTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FingerprintTokenFilter fingerprint}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static FingerprintTokenFilter.Builder fingerprint() {
		return new FingerprintTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link FingerprintTokenFilter
	 * fingerprint} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition fingerprint(
			Function<FingerprintTokenFilter.Builder, ObjectBuilder<FingerprintTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.fingerprint(fn.apply(new FingerprintTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HunspellTokenFilter hunspell}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static HunspellTokenFilter.Builder hunspell() {
		return new HunspellTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link HunspellTokenFilter hunspell}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition hunspell(
			Function<HunspellTokenFilter.Builder, ObjectBuilder<HunspellTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.hunspell(fn.apply(new HunspellTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HyphenationDecompounderTokenFilter
	 * hyphenation_decompounder} {@code TokenFilterDefinition} variant.
	 */
	public static HyphenationDecompounderTokenFilter.Builder hyphenationDecompounder() {
		return new HyphenationDecompounderTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the
	 * {@link HyphenationDecompounderTokenFilter hyphenation_decompounder}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition hyphenationDecompounder(
			Function<HyphenationDecompounderTokenFilter.Builder, ObjectBuilder<HyphenationDecompounderTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.hyphenationDecompounder(fn.apply(new HyphenationDecompounderTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuCollationTokenFilter icu_collation}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static IcuCollationTokenFilter.Builder icuCollation() {
		return new IcuCollationTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link IcuCollationTokenFilter
	 * icu_collation} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition icuCollation(
			Function<IcuCollationTokenFilter.Builder, ObjectBuilder<IcuCollationTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.icuCollation(fn.apply(new IcuCollationTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuFoldingTokenFilter icu_folding}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static IcuFoldingTokenFilter.Builder icuFolding() {
		return new IcuFoldingTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link IcuFoldingTokenFilter
	 * icu_folding} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition icuFolding(
			Function<IcuFoldingTokenFilter.Builder, ObjectBuilder<IcuFoldingTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.icuFolding(fn.apply(new IcuFoldingTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuNormalizationTokenFilter icu_normalizer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static IcuNormalizationTokenFilter.Builder icuNormalizer() {
		return new IcuNormalizationTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link IcuNormalizationTokenFilter
	 * icu_normalizer} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition icuNormalizer(
			Function<IcuNormalizationTokenFilter.Builder, ObjectBuilder<IcuNormalizationTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.icuNormalizer(fn.apply(new IcuNormalizationTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuTokenizer icu_tokenizer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static IcuTokenizer.Builder icuTokenizer() {
		return new IcuTokenizer.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link IcuTokenizer icu_tokenizer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition icuTokenizer(Function<IcuTokenizer.Builder, ObjectBuilder<IcuTokenizer>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.icuTokenizer(fn.apply(new IcuTokenizer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuTransformTokenFilter icu_transform}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static IcuTransformTokenFilter.Builder icuTransform() {
		return new IcuTransformTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link IcuTransformTokenFilter
	 * icu_transform} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition icuTransform(
			Function<IcuTransformTokenFilter.Builder, ObjectBuilder<IcuTransformTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.icuTransform(fn.apply(new IcuTransformTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KStemTokenFilter kstem}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static KStemTokenFilter.Builder kstem() {
		return new KStemTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KStemTokenFilter kstem}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition kstem(Function<KStemTokenFilter.Builder, ObjectBuilder<KStemTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.kstem(fn.apply(new KStemTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeepTypesTokenFilter keep_types}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static KeepTypesTokenFilter.Builder keepTypes() {
		return new KeepTypesTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KeepTypesTokenFilter
	 * keep_types} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition keepTypes(
			Function<KeepTypesTokenFilter.Builder, ObjectBuilder<KeepTypesTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.keepTypes(fn.apply(new KeepTypesTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeepWordsTokenFilter keep}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static KeepWordsTokenFilter.Builder keep() {
		return new KeepWordsTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KeepWordsTokenFilter keep}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition keep(
			Function<KeepWordsTokenFilter.Builder, ObjectBuilder<KeepWordsTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.keep(fn.apply(new KeepWordsTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeywordMarkerTokenFilter keyword_marker}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static KeywordMarkerTokenFilter.Builder keywordMarker() {
		return new KeywordMarkerTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KeywordMarkerTokenFilter
	 * keyword_marker} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition keywordMarker(
			Function<KeywordMarkerTokenFilter.Builder, ObjectBuilder<KeywordMarkerTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.keywordMarker(fn.apply(new KeywordMarkerTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiPartOfSpeechTokenFilter
	 * kuromoji_part_of_speech} {@code TokenFilterDefinition} variant.
	 */
	public static KuromojiPartOfSpeechTokenFilter.Builder kuromojiPartOfSpeech() {
		return new KuromojiPartOfSpeechTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KuromojiPartOfSpeechTokenFilter
	 * kuromoji_part_of_speech} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition kuromojiPartOfSpeech(
			Function<KuromojiPartOfSpeechTokenFilter.Builder, ObjectBuilder<KuromojiPartOfSpeechTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.kuromojiPartOfSpeech(fn.apply(new KuromojiPartOfSpeechTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiReadingFormTokenFilter
	 * kuromoji_readingform} {@code TokenFilterDefinition} variant.
	 */
	public static KuromojiReadingFormTokenFilter.Builder kuromojiReadingform() {
		return new KuromojiReadingFormTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KuromojiReadingFormTokenFilter
	 * kuromoji_readingform} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition kuromojiReadingform(
			Function<KuromojiReadingFormTokenFilter.Builder, ObjectBuilder<KuromojiReadingFormTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.kuromojiReadingform(fn.apply(new KuromojiReadingFormTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiStemmerTokenFilter kuromoji_stemmer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static KuromojiStemmerTokenFilter.Builder kuromojiStemmer() {
		return new KuromojiStemmerTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link KuromojiStemmerTokenFilter
	 * kuromoji_stemmer} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition kuromojiStemmer(
			Function<KuromojiStemmerTokenFilter.Builder, ObjectBuilder<KuromojiStemmerTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.kuromojiStemmer(fn.apply(new KuromojiStemmerTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LengthTokenFilter length}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static LengthTokenFilter.Builder length() {
		return new LengthTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link LengthTokenFilter length}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition length(
			Function<LengthTokenFilter.Builder, ObjectBuilder<LengthTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.length(fn.apply(new LengthTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LimitTokenCountTokenFilter limit}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static LimitTokenCountTokenFilter.Builder limit() {
		return new LimitTokenCountTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link LimitTokenCountTokenFilter
	 * limit} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition limit(
			Function<LimitTokenCountTokenFilter.Builder, ObjectBuilder<LimitTokenCountTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.limit(fn.apply(new LimitTokenCountTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LowercaseTokenFilter lowercase}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static LowercaseTokenFilter.Builder lowercase() {
		return new LowercaseTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link LowercaseTokenFilter lowercase}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition lowercase(
			Function<LowercaseTokenFilter.Builder, ObjectBuilder<LowercaseTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.lowercase(fn.apply(new LowercaseTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MultiplexerTokenFilter multiplexer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static MultiplexerTokenFilter.Builder multiplexer() {
		return new MultiplexerTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link MultiplexerTokenFilter
	 * multiplexer} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition multiplexer(
			Function<MultiplexerTokenFilter.Builder, ObjectBuilder<MultiplexerTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.multiplexer(fn.apply(new MultiplexerTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NGramTokenFilter ngram}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static NGramTokenFilter.Builder ngram() {
		return new NGramTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link NGramTokenFilter ngram}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition ngram(Function<NGramTokenFilter.Builder, ObjectBuilder<NGramTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.ngram(fn.apply(new NGramTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NoriPartOfSpeechTokenFilter
	 * nori_part_of_speech} {@code TokenFilterDefinition} variant.
	 */
	public static NoriPartOfSpeechTokenFilter.Builder noriPartOfSpeech() {
		return new NoriPartOfSpeechTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link NoriPartOfSpeechTokenFilter
	 * nori_part_of_speech} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition noriPartOfSpeech(
			Function<NoriPartOfSpeechTokenFilter.Builder, ObjectBuilder<NoriPartOfSpeechTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.noriPartOfSpeech(fn.apply(new NoriPartOfSpeechTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PatternCaptureTokenFilter pattern_capture}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static PatternCaptureTokenFilter.Builder patternCapture() {
		return new PatternCaptureTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link PatternCaptureTokenFilter
	 * pattern_capture} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition patternCapture(
			Function<PatternCaptureTokenFilter.Builder, ObjectBuilder<PatternCaptureTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.patternCapture(fn.apply(new PatternCaptureTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PatternReplaceTokenFilter pattern_replace}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static PatternReplaceTokenFilter.Builder patternReplace() {
		return new PatternReplaceTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link PatternReplaceTokenFilter
	 * pattern_replace} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition patternReplace(
			Function<PatternReplaceTokenFilter.Builder, ObjectBuilder<PatternReplaceTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.patternReplace(fn.apply(new PatternReplaceTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PhoneticTokenFilter phonetic}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static PhoneticTokenFilter.Builder phonetic() {
		return new PhoneticTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link PhoneticTokenFilter phonetic}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition phonetic(
			Function<PhoneticTokenFilter.Builder, ObjectBuilder<PhoneticTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.phonetic(fn.apply(new PhoneticTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PorterStemTokenFilter porter_stem}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static PorterStemTokenFilter.Builder porterStem() {
		return new PorterStemTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link PorterStemTokenFilter
	 * porter_stem} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition porterStem(
			Function<PorterStemTokenFilter.Builder, ObjectBuilder<PorterStemTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.porterStem(fn.apply(new PorterStemTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PredicateTokenFilter predicate_token_filter}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static PredicateTokenFilter.Builder predicateTokenFilter() {
		return new PredicateTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link PredicateTokenFilter
	 * predicate_token_filter} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition predicateTokenFilter(
			Function<PredicateTokenFilter.Builder, ObjectBuilder<PredicateTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.predicateTokenFilter(fn.apply(new PredicateTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RemoveDuplicatesTokenFilter
	 * remove_duplicates} {@code TokenFilterDefinition} variant.
	 */
	public static RemoveDuplicatesTokenFilter.Builder removeDuplicates() {
		return new RemoveDuplicatesTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link RemoveDuplicatesTokenFilter
	 * remove_duplicates} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition removeDuplicates(
			Function<RemoveDuplicatesTokenFilter.Builder, ObjectBuilder<RemoveDuplicatesTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.removeDuplicates(fn.apply(new RemoveDuplicatesTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ReverseTokenFilter reverse}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static ReverseTokenFilter.Builder reverse() {
		return new ReverseTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link ReverseTokenFilter reverse}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition reverse(
			Function<ReverseTokenFilter.Builder, ObjectBuilder<ReverseTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.reverse(fn.apply(new ReverseTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ShingleTokenFilter shingle}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static ShingleTokenFilter.Builder shingle() {
		return new ShingleTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link ShingleTokenFilter shingle}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition shingle(
			Function<ShingleTokenFilter.Builder, ObjectBuilder<ShingleTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.shingle(fn.apply(new ShingleTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SnowballTokenFilter snowball}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static SnowballTokenFilter.Builder snowball() {
		return new SnowballTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link SnowballTokenFilter snowball}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition snowball(
			Function<SnowballTokenFilter.Builder, ObjectBuilder<SnowballTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.snowball(fn.apply(new SnowballTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StemmerOverrideTokenFilter stemmer_override}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static StemmerOverrideTokenFilter.Builder stemmerOverride() {
		return new StemmerOverrideTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link StemmerOverrideTokenFilter
	 * stemmer_override} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition stemmerOverride(
			Function<StemmerOverrideTokenFilter.Builder, ObjectBuilder<StemmerOverrideTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.stemmerOverride(fn.apply(new StemmerOverrideTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StemmerTokenFilter stemmer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static StemmerTokenFilter.Builder stemmer() {
		return new StemmerTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link StemmerTokenFilter stemmer}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition stemmer(
			Function<StemmerTokenFilter.Builder, ObjectBuilder<StemmerTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.stemmer(fn.apply(new StemmerTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StopTokenFilter stop}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static StopTokenFilter.Builder stop() {
		return new StopTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link StopTokenFilter stop}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition stop(Function<StopTokenFilter.Builder, ObjectBuilder<StopTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.stop(fn.apply(new StopTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SynonymGraphTokenFilter synonym_graph}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static SynonymGraphTokenFilter.Builder synonymGraph() {
		return new SynonymGraphTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link SynonymGraphTokenFilter
	 * synonym_graph} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition synonymGraph(
			Function<SynonymGraphTokenFilter.Builder, ObjectBuilder<SynonymGraphTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.synonymGraph(fn.apply(new SynonymGraphTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SynonymTokenFilter synonym}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static SynonymTokenFilter.Builder synonym() {
		return new SynonymTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link SynonymTokenFilter synonym}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition synonym(
			Function<SynonymTokenFilter.Builder, ObjectBuilder<SynonymTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.synonym(fn.apply(new SynonymTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TrimTokenFilter trim}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TrimTokenFilter.Builder trim() {
		return new TrimTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link TrimTokenFilter trim}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition trim(Function<TrimTokenFilter.Builder, ObjectBuilder<TrimTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.trim(fn.apply(new TrimTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TruncateTokenFilter truncate}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TruncateTokenFilter.Builder truncate() {
		return new TruncateTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link TruncateTokenFilter truncate}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition truncate(
			Function<TruncateTokenFilter.Builder, ObjectBuilder<TruncateTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.truncate(fn.apply(new TruncateTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UniqueTokenFilter unique}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static UniqueTokenFilter.Builder unique() {
		return new UniqueTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link UniqueTokenFilter unique}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition unique(
			Function<UniqueTokenFilter.Builder, ObjectBuilder<UniqueTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.unique(fn.apply(new UniqueTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UppercaseTokenFilter uppercase}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static UppercaseTokenFilter.Builder uppercase() {
		return new UppercaseTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link UppercaseTokenFilter uppercase}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition uppercase(
			Function<UppercaseTokenFilter.Builder, ObjectBuilder<UppercaseTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.uppercase(fn.apply(new UppercaseTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WordDelimiterGraphTokenFilter
	 * word_delimiter_graph} {@code TokenFilterDefinition} variant.
	 */
	public static WordDelimiterGraphTokenFilter.Builder wordDelimiterGraph() {
		return new WordDelimiterGraphTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link WordDelimiterGraphTokenFilter
	 * word_delimiter_graph} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition wordDelimiterGraph(
			Function<WordDelimiterGraphTokenFilter.Builder, ObjectBuilder<WordDelimiterGraphTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.wordDelimiterGraph(fn.apply(new WordDelimiterGraphTokenFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WordDelimiterTokenFilter word_delimiter}
	 * {@code TokenFilterDefinition} variant.
	 */
	public static WordDelimiterTokenFilter.Builder wordDelimiter() {
		return new WordDelimiterTokenFilter.Builder();
	}

	/**
	 * Creates a TokenFilterDefinition of the {@link WordDelimiterTokenFilter
	 * word_delimiter} {@code TokenFilterDefinition} variant.
	 */
	public static TokenFilterDefinition wordDelimiter(
			Function<WordDelimiterTokenFilter.Builder, ObjectBuilder<WordDelimiterTokenFilter>> fn) {
		TokenFilterDefinition.Builder builder = new TokenFilterDefinition.Builder();
		builder.wordDelimiter(fn.apply(new WordDelimiterTokenFilter.Builder()).build());
		return builder.build();
	}

}
