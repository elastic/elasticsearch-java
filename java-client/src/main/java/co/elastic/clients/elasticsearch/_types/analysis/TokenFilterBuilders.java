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

/**
 * Builders for {@link TokenFilter} variants.
 */
public class TokenFilterBuilders {
	private TokenFilterBuilders() {
	}

	/**
	 * Creates a builder for the {@link AsciiFoldingTokenFilter asciifolding}
	 * {@code TokenFilter} variant.
	 */
	public static AsciiFoldingTokenFilter.Builder asciifolding() {
		return new AsciiFoldingTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link CommonGramsTokenFilter common_grams}
	 * {@code TokenFilter} variant.
	 */
	public static CommonGramsTokenFilter.Builder commonGrams() {
		return new CommonGramsTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link ConditionTokenFilter condition}
	 * {@code TokenFilter} variant.
	 */
	public static ConditionTokenFilter.Builder condition() {
		return new ConditionTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link DelimitedPayloadTokenFilter
	 * delimited_payload} {@code TokenFilter} variant.
	 */
	public static DelimitedPayloadTokenFilter.Builder delimitedPayload() {
		return new DelimitedPayloadTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link DictionaryDecompounderTokenFilter
	 * dictionary_decompounder} {@code TokenFilter} variant.
	 */
	public static DictionaryDecompounderTokenFilter.Builder dictionaryDecompounder() {
		return new DictionaryDecompounderTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link EdgeNGramTokenFilter edge_ngram}
	 * {@code TokenFilter} variant.
	 */
	public static EdgeNGramTokenFilter.Builder edgeNgram() {
		return new EdgeNGramTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link ElisionTokenFilter elision}
	 * {@code TokenFilter} variant.
	 */
	public static ElisionTokenFilter.Builder elision() {
		return new ElisionTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link FingerprintTokenFilter fingerprint}
	 * {@code TokenFilter} variant.
	 */
	public static FingerprintTokenFilter.Builder fingerprint() {
		return new FingerprintTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link HunspellTokenFilter hunspell}
	 * {@code TokenFilter} variant.
	 */
	public static HunspellTokenFilter.Builder hunspell() {
		return new HunspellTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link HyphenationDecompounderTokenFilter
	 * hyphenation_decompounder} {@code TokenFilter} variant.
	 */
	public static HyphenationDecompounderTokenFilter.Builder hyphenationDecompounder() {
		return new HyphenationDecompounderTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuCollationTokenFilter icu_collation}
	 * {@code TokenFilter} variant.
	 */
	public static IcuCollationTokenFilter.Builder icuCollation() {
		return new IcuCollationTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuFoldingTokenFilter icu_folding}
	 * {@code TokenFilter} variant.
	 */
	public static IcuFoldingTokenFilter.Builder icuFolding() {
		return new IcuFoldingTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuNormalizationTokenFilter icu_normalizer}
	 * {@code TokenFilter} variant.
	 */
	public static IcuNormalizationTokenFilter.Builder icuNormalizer() {
		return new IcuNormalizationTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuTokenizer icu_tokenizer}
	 * {@code TokenFilter} variant.
	 */
	public static IcuTokenizer.Builder icuTokenizer() {
		return new IcuTokenizer.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuTransformTokenFilter icu_transform}
	 * {@code TokenFilter} variant.
	 */
	public static IcuTransformTokenFilter.Builder icuTransform() {
		return new IcuTransformTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KStemTokenFilter kstem} {@code TokenFilter}
	 * variant.
	 */
	public static KStemTokenFilter.Builder kstem() {
		return new KStemTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KeepTypesTokenFilter keep_types}
	 * {@code TokenFilter} variant.
	 */
	public static KeepTypesTokenFilter.Builder keepTypes() {
		return new KeepTypesTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KeepWordsTokenFilter keep}
	 * {@code TokenFilter} variant.
	 */
	public static KeepWordsTokenFilter.Builder keep() {
		return new KeepWordsTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KeywordMarkerTokenFilter keyword_marker}
	 * {@code TokenFilter} variant.
	 */
	public static KeywordMarkerTokenFilter.Builder keywordMarker() {
		return new KeywordMarkerTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KuromojiPartOfSpeechTokenFilter
	 * kuromoji_part_of_speech} {@code TokenFilter} variant.
	 */
	public static KuromojiPartOfSpeechTokenFilter.Builder kuromojiPartOfSpeech() {
		return new KuromojiPartOfSpeechTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KuromojiReadingFormTokenFilter
	 * kuromoji_readingform} {@code TokenFilter} variant.
	 */
	public static KuromojiReadingFormTokenFilter.Builder kuromojiReadingform() {
		return new KuromojiReadingFormTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KuromojiStemmerTokenFilter kuromoji_stemmer}
	 * {@code TokenFilter} variant.
	 */
	public static KuromojiStemmerTokenFilter.Builder kuromojiStemmer() {
		return new KuromojiStemmerTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link LengthTokenFilter length}
	 * {@code TokenFilter} variant.
	 */
	public static LengthTokenFilter.Builder length() {
		return new LengthTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link LimitTokenCountTokenFilter limit}
	 * {@code TokenFilter} variant.
	 */
	public static LimitTokenCountTokenFilter.Builder limit() {
		return new LimitTokenCountTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link LowercaseTokenFilter lowercase}
	 * {@code TokenFilter} variant.
	 */
	public static LowercaseTokenFilter.Builder lowercase() {
		return new LowercaseTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link MultiplexerTokenFilter multiplexer}
	 * {@code TokenFilter} variant.
	 */
	public static MultiplexerTokenFilter.Builder multiplexer() {
		return new MultiplexerTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link NGramTokenFilter ngram} {@code TokenFilter}
	 * variant.
	 */
	public static NGramTokenFilter.Builder ngram() {
		return new NGramTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link NoriPartOfSpeechTokenFilter
	 * nori_part_of_speech} {@code TokenFilter} variant.
	 */
	public static NoriPartOfSpeechTokenFilter.Builder noriPartOfSpeech() {
		return new NoriPartOfSpeechTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PatternCaptureTokenFilter pattern_capture}
	 * {@code TokenFilter} variant.
	 */
	public static PatternCaptureTokenFilter.Builder patternCapture() {
		return new PatternCaptureTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PatternReplaceTokenFilter pattern_replace}
	 * {@code TokenFilter} variant.
	 */
	public static PatternReplaceTokenFilter.Builder patternReplace() {
		return new PatternReplaceTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PhoneticTokenFilter phonetic}
	 * {@code TokenFilter} variant.
	 */
	public static PhoneticTokenFilter.Builder phonetic() {
		return new PhoneticTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PorterStemTokenFilter porter_stem}
	 * {@code TokenFilter} variant.
	 */
	public static PorterStemTokenFilter.Builder porterStem() {
		return new PorterStemTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PredicateTokenFilter predicate_token_filter}
	 * {@code TokenFilter} variant.
	 */
	public static PredicateTokenFilter.Builder predicateTokenFilter() {
		return new PredicateTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link RemoveDuplicatesTokenFilter
	 * remove_duplicates} {@code TokenFilter} variant.
	 */
	public static RemoveDuplicatesTokenFilter.Builder removeDuplicates() {
		return new RemoveDuplicatesTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link ReverseTokenFilter reverse}
	 * {@code TokenFilter} variant.
	 */
	public static ReverseTokenFilter.Builder reverse() {
		return new ReverseTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link ShingleTokenFilter shingle}
	 * {@code TokenFilter} variant.
	 */
	public static ShingleTokenFilter.Builder shingle() {
		return new ShingleTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link SnowballTokenFilter snowball}
	 * {@code TokenFilter} variant.
	 */
	public static SnowballTokenFilter.Builder snowball() {
		return new SnowballTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link StemmerOverrideTokenFilter stemmer_override}
	 * {@code TokenFilter} variant.
	 */
	public static StemmerOverrideTokenFilter.Builder stemmerOverride() {
		return new StemmerOverrideTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link StemmerTokenFilter stemmer}
	 * {@code TokenFilter} variant.
	 */
	public static StemmerTokenFilter.Builder stemmer() {
		return new StemmerTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link StopTokenFilter stop} {@code TokenFilter}
	 * variant.
	 */
	public static StopTokenFilter.Builder stop() {
		return new StopTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link SynonymGraphTokenFilter synonym_graph}
	 * {@code TokenFilter} variant.
	 */
	public static SynonymGraphTokenFilter.Builder synonymGraph() {
		return new SynonymGraphTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link SynonymTokenFilter synonym}
	 * {@code TokenFilter} variant.
	 */
	public static SynonymTokenFilter.Builder synonym() {
		return new SynonymTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link TrimTokenFilter trim} {@code TokenFilter}
	 * variant.
	 */
	public static TrimTokenFilter.Builder trim() {
		return new TrimTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link TruncateTokenFilter truncate}
	 * {@code TokenFilter} variant.
	 */
	public static TruncateTokenFilter.Builder truncate() {
		return new TruncateTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link UniqueTokenFilter unique}
	 * {@code TokenFilter} variant.
	 */
	public static UniqueTokenFilter.Builder unique() {
		return new UniqueTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link UppercaseTokenFilter uppercase}
	 * {@code TokenFilter} variant.
	 */
	public static UppercaseTokenFilter.Builder uppercase() {
		return new UppercaseTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link WordDelimiterGraphTokenFilter
	 * word_delimiter_graph} {@code TokenFilter} variant.
	 */
	public static WordDelimiterGraphTokenFilter.Builder wordDelimiterGraph() {
		return new WordDelimiterGraphTokenFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link WordDelimiterTokenFilter word_delimiter}
	 * {@code TokenFilter} variant.
	 */
	public static WordDelimiterTokenFilter.Builder wordDelimiter() {
		return new WordDelimiterTokenFilter.Builder();
	}

}
