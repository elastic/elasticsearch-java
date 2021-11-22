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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.analysis.TokenFilterDefinition
// union type: InternalTag[tag=type]
@JsonpDeserializable
public class TokenFilterDefinition
		implements
			TaggedUnion<TokenFilterDefinition.Kind, TokenFilterDefinitionVariant>,
			JsonpSerializable {

	/**
	 * {@link TokenFilterDefinition} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Asciifolding("asciifolding"),

		CommonGrams("common_grams"),

		Condition("condition"),

		DelimitedPayload("delimited_payload"),

		DictionaryDecompounder("dictionary_decompounder"),

		EdgeNgram("edge_ngram"),

		Elision("elision"),

		Fingerprint("fingerprint"),

		Hunspell("hunspell"),

		HyphenationDecompounder("hyphenation_decompounder"),

		IcuCollation("icu_collation"),

		IcuFolding("icu_folding"),

		IcuNormalizer("icu_normalizer"),

		IcuTokenizer("icu_tokenizer"),

		IcuTransform("icu_transform"),

		Kstem("kstem"),

		KeepTypes("keep_types"),

		Keep("keep"),

		KeywordMarker("keyword_marker"),

		KuromojiPartOfSpeech("kuromoji_part_of_speech"),

		KuromojiReadingform("kuromoji_readingform"),

		KuromojiStemmer("kuromoji_stemmer"),

		Length("length"),

		Limit("limit"),

		Lowercase("lowercase"),

		Multiplexer("multiplexer"),

		Ngram("ngram"),

		NoriPartOfSpeech("nori_part_of_speech"),

		PatternCapture("pattern_capture"),

		PatternReplace("pattern_replace"),

		Phonetic("phonetic"),

		PorterStem("porter_stem"),

		PredicateTokenFilter("predicate_token_filter"),

		RemoveDuplicates("remove_duplicates"),

		Reverse("reverse"),

		Shingle("shingle"),

		Snowball("snowball"),

		StemmerOverride("stemmer_override"),

		Stemmer("stemmer"),

		Stop("stop"),

		SynonymGraph("synonym_graph"),

		Synonym("synonym"),

		Trim("trim"),

		Truncate("truncate"),

		Unique("unique"),

		Uppercase("uppercase"),

		WordDelimiterGraph("word_delimiter_graph"),

		WordDelimiter("word_delimiter"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final TokenFilterDefinitionVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final TokenFilterDefinitionVariant _get() {
		return _value;
	}

	public TokenFilterDefinition(TokenFilterDefinitionVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._tokenFilterDefinitionKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TokenFilterDefinition(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TokenFilterDefinition of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code asciifolding}?
	 */
	public boolean isAsciifolding() {
		return _kind == Kind.Asciifolding;
	}

	/**
	 * Get the {@code asciifolding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code asciifolding} kind.
	 */
	public AsciiFoldingTokenFilter asciifolding() {
		return TaggedUnionUtils.get(this, Kind.Asciifolding);
	}

	/**
	 * Is this variant instance of kind {@code common_grams}?
	 */
	public boolean isCommonGrams() {
		return _kind == Kind.CommonGrams;
	}

	/**
	 * Get the {@code common_grams} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common_grams} kind.
	 */
	public CommonGramsTokenFilter commonGrams() {
		return TaggedUnionUtils.get(this, Kind.CommonGrams);
	}

	/**
	 * Is this variant instance of kind {@code condition}?
	 */
	public boolean isCondition() {
		return _kind == Kind.Condition;
	}

	/**
	 * Get the {@code condition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code condition} kind.
	 */
	public ConditionTokenFilter condition() {
		return TaggedUnionUtils.get(this, Kind.Condition);
	}

	/**
	 * Is this variant instance of kind {@code delimited_payload}?
	 */
	public boolean isDelimitedPayload() {
		return _kind == Kind.DelimitedPayload;
	}

	/**
	 * Get the {@code delimited_payload} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delimited_payload}
	 *             kind.
	 */
	public DelimitedPayloadTokenFilter delimitedPayload() {
		return TaggedUnionUtils.get(this, Kind.DelimitedPayload);
	}

	/**
	 * Is this variant instance of kind {@code dictionary_decompounder}?
	 */
	public boolean isDictionaryDecompounder() {
		return _kind == Kind.DictionaryDecompounder;
	}

	/**
	 * Get the {@code dictionary_decompounder} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code dictionary_decompounder} kind.
	 */
	public DictionaryDecompounderTokenFilter dictionaryDecompounder() {
		return TaggedUnionUtils.get(this, Kind.DictionaryDecompounder);
	}

	/**
	 * Is this variant instance of kind {@code edge_ngram}?
	 */
	public boolean isEdgeNgram() {
		return _kind == Kind.EdgeNgram;
	}

	/**
	 * Get the {@code edge_ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code edge_ngram} kind.
	 */
	public EdgeNGramTokenFilter edgeNgram() {
		return TaggedUnionUtils.get(this, Kind.EdgeNgram);
	}

	/**
	 * Is this variant instance of kind {@code elision}?
	 */
	public boolean isElision() {
		return _kind == Kind.Elision;
	}

	/**
	 * Get the {@code elision} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code elision} kind.
	 */
	public ElisionTokenFilter elision() {
		return TaggedUnionUtils.get(this, Kind.Elision);
	}

	/**
	 * Is this variant instance of kind {@code fingerprint}?
	 */
	public boolean isFingerprint() {
		return _kind == Kind.Fingerprint;
	}

	/**
	 * Get the {@code fingerprint} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fingerprint} kind.
	 */
	public FingerprintTokenFilter fingerprint() {
		return TaggedUnionUtils.get(this, Kind.Fingerprint);
	}

	/**
	 * Is this variant instance of kind {@code hunspell}?
	 */
	public boolean isHunspell() {
		return _kind == Kind.Hunspell;
	}

	/**
	 * Get the {@code hunspell} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hunspell} kind.
	 */
	public HunspellTokenFilter hunspell() {
		return TaggedUnionUtils.get(this, Kind.Hunspell);
	}

	/**
	 * Is this variant instance of kind {@code hyphenation_decompounder}?
	 */
	public boolean isHyphenationDecompounder() {
		return _kind == Kind.HyphenationDecompounder;
	}

	/**
	 * Get the {@code hyphenation_decompounder} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code hyphenation_decompounder} kind.
	 */
	public HyphenationDecompounderTokenFilter hyphenationDecompounder() {
		return TaggedUnionUtils.get(this, Kind.HyphenationDecompounder);
	}

	/**
	 * Is this variant instance of kind {@code icu_collation}?
	 */
	public boolean isIcuCollation() {
		return _kind == Kind.IcuCollation;
	}

	/**
	 * Get the {@code icu_collation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_collation} kind.
	 */
	public IcuCollationTokenFilter icuCollation() {
		return TaggedUnionUtils.get(this, Kind.IcuCollation);
	}

	/**
	 * Is this variant instance of kind {@code icu_folding}?
	 */
	public boolean isIcuFolding() {
		return _kind == Kind.IcuFolding;
	}

	/**
	 * Get the {@code icu_folding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_folding} kind.
	 */
	public IcuFoldingTokenFilter icuFolding() {
		return TaggedUnionUtils.get(this, Kind.IcuFolding);
	}

	/**
	 * Is this variant instance of kind {@code icu_normalizer}?
	 */
	public boolean isIcuNormalizer() {
		return _kind == Kind.IcuNormalizer;
	}

	/**
	 * Get the {@code icu_normalizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_normalizer} kind.
	 */
	public IcuNormalizationTokenFilter icuNormalizer() {
		return TaggedUnionUtils.get(this, Kind.IcuNormalizer);
	}

	/**
	 * Is this variant instance of kind {@code icu_tokenizer}?
	 */
	public boolean isIcuTokenizer() {
		return _kind == Kind.IcuTokenizer;
	}

	/**
	 * Get the {@code icu_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_tokenizer} kind.
	 */
	public IcuTokenizer icuTokenizer() {
		return TaggedUnionUtils.get(this, Kind.IcuTokenizer);
	}

	/**
	 * Is this variant instance of kind {@code icu_transform}?
	 */
	public boolean isIcuTransform() {
		return _kind == Kind.IcuTransform;
	}

	/**
	 * Get the {@code icu_transform} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_transform} kind.
	 */
	public IcuTransformTokenFilter icuTransform() {
		return TaggedUnionUtils.get(this, Kind.IcuTransform);
	}

	/**
	 * Is this variant instance of kind {@code kstem}?
	 */
	public boolean isKstem() {
		return _kind == Kind.Kstem;
	}

	/**
	 * Get the {@code kstem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kstem} kind.
	 */
	public KStemTokenFilter kstem() {
		return TaggedUnionUtils.get(this, Kind.Kstem);
	}

	/**
	 * Is this variant instance of kind {@code keep_types}?
	 */
	public boolean isKeepTypes() {
		return _kind == Kind.KeepTypes;
	}

	/**
	 * Get the {@code keep_types} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep_types} kind.
	 */
	public KeepTypesTokenFilter keepTypes() {
		return TaggedUnionUtils.get(this, Kind.KeepTypes);
	}

	/**
	 * Is this variant instance of kind {@code keep}?
	 */
	public boolean isKeep() {
		return _kind == Kind.Keep;
	}

	/**
	 * Get the {@code keep} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep} kind.
	 */
	public KeepWordsTokenFilter keep() {
		return TaggedUnionUtils.get(this, Kind.Keep);
	}

	/**
	 * Is this variant instance of kind {@code keyword_marker}?
	 */
	public boolean isKeywordMarker() {
		return _kind == Kind.KeywordMarker;
	}

	/**
	 * Get the {@code keyword_marker} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword_marker} kind.
	 */
	public KeywordMarkerTokenFilter keywordMarker() {
		return TaggedUnionUtils.get(this, Kind.KeywordMarker);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_part_of_speech}?
	 */
	public boolean isKuromojiPartOfSpeech() {
		return _kind == Kind.KuromojiPartOfSpeech;
	}

	/**
	 * Get the {@code kuromoji_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code kuromoji_part_of_speech} kind.
	 */
	public KuromojiPartOfSpeechTokenFilter kuromojiPartOfSpeech() {
		return TaggedUnionUtils.get(this, Kind.KuromojiPartOfSpeech);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_readingform}?
	 */
	public boolean isKuromojiReadingform() {
		return _kind == Kind.KuromojiReadingform;
	}

	/**
	 * Get the {@code kuromoji_readingform} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_readingform}
	 *             kind.
	 */
	public KuromojiReadingFormTokenFilter kuromojiReadingform() {
		return TaggedUnionUtils.get(this, Kind.KuromojiReadingform);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_stemmer}?
	 */
	public boolean isKuromojiStemmer() {
		return _kind == Kind.KuromojiStemmer;
	}

	/**
	 * Get the {@code kuromoji_stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_stemmer}
	 *             kind.
	 */
	public KuromojiStemmerTokenFilter kuromojiStemmer() {
		return TaggedUnionUtils.get(this, Kind.KuromojiStemmer);
	}

	/**
	 * Is this variant instance of kind {@code length}?
	 */
	public boolean isLength() {
		return _kind == Kind.Length;
	}

	/**
	 * Get the {@code length} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code length} kind.
	 */
	public LengthTokenFilter length() {
		return TaggedUnionUtils.get(this, Kind.Length);
	}

	/**
	 * Is this variant instance of kind {@code limit}?
	 */
	public boolean isLimit() {
		return _kind == Kind.Limit;
	}

	/**
	 * Get the {@code limit} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code limit} kind.
	 */
	public LimitTokenCountTokenFilter limit() {
		return TaggedUnionUtils.get(this, Kind.Limit);
	}

	/**
	 * Is this variant instance of kind {@code lowercase}?
	 */
	public boolean isLowercase() {
		return _kind == Kind.Lowercase;
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseTokenFilter lowercase() {
		return TaggedUnionUtils.get(this, Kind.Lowercase);
	}

	/**
	 * Is this variant instance of kind {@code multiplexer}?
	 */
	public boolean isMultiplexer() {
		return _kind == Kind.Multiplexer;
	}

	/**
	 * Get the {@code multiplexer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multiplexer} kind.
	 */
	public MultiplexerTokenFilter multiplexer() {
		return TaggedUnionUtils.get(this, Kind.Multiplexer);
	}

	/**
	 * Is this variant instance of kind {@code ngram}?
	 */
	public boolean isNgram() {
		return _kind == Kind.Ngram;
	}

	/**
	 * Get the {@code ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ngram} kind.
	 */
	public NGramTokenFilter ngram() {
		return TaggedUnionUtils.get(this, Kind.Ngram);
	}

	/**
	 * Is this variant instance of kind {@code nori_part_of_speech}?
	 */
	public boolean isNoriPartOfSpeech() {
		return _kind == Kind.NoriPartOfSpeech;
	}

	/**
	 * Get the {@code nori_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori_part_of_speech}
	 *             kind.
	 */
	public NoriPartOfSpeechTokenFilter noriPartOfSpeech() {
		return TaggedUnionUtils.get(this, Kind.NoriPartOfSpeech);
	}

	/**
	 * Is this variant instance of kind {@code pattern_capture}?
	 */
	public boolean isPatternCapture() {
		return _kind == Kind.PatternCapture;
	}

	/**
	 * Get the {@code pattern_capture} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_capture}
	 *             kind.
	 */
	public PatternCaptureTokenFilter patternCapture() {
		return TaggedUnionUtils.get(this, Kind.PatternCapture);
	}

	/**
	 * Is this variant instance of kind {@code pattern_replace}?
	 */
	public boolean isPatternReplace() {
		return _kind == Kind.PatternReplace;
	}

	/**
	 * Get the {@code pattern_replace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_replace}
	 *             kind.
	 */
	public PatternReplaceTokenFilter patternReplace() {
		return TaggedUnionUtils.get(this, Kind.PatternReplace);
	}

	/**
	 * Is this variant instance of kind {@code phonetic}?
	 */
	public boolean isPhonetic() {
		return _kind == Kind.Phonetic;
	}

	/**
	 * Get the {@code phonetic} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phonetic} kind.
	 */
	public PhoneticTokenFilter phonetic() {
		return TaggedUnionUtils.get(this, Kind.Phonetic);
	}

	/**
	 * Is this variant instance of kind {@code porter_stem}?
	 */
	public boolean isPorterStem() {
		return _kind == Kind.PorterStem;
	}

	/**
	 * Get the {@code porter_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code porter_stem} kind.
	 */
	public PorterStemTokenFilter porterStem() {
		return TaggedUnionUtils.get(this, Kind.PorterStem);
	}

	/**
	 * Is this variant instance of kind {@code predicate_token_filter}?
	 */
	public boolean isPredicateTokenFilter() {
		return _kind == Kind.PredicateTokenFilter;
	}

	/**
	 * Get the {@code predicate_token_filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code predicate_token_filter} kind.
	 */
	public PredicateTokenFilter predicateTokenFilter() {
		return TaggedUnionUtils.get(this, Kind.PredicateTokenFilter);
	}

	/**
	 * Is this variant instance of kind {@code remove_duplicates}?
	 */
	public boolean isRemoveDuplicates() {
		return _kind == Kind.RemoveDuplicates;
	}

	/**
	 * Get the {@code remove_duplicates} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove_duplicates}
	 *             kind.
	 */
	public RemoveDuplicatesTokenFilter removeDuplicates() {
		return TaggedUnionUtils.get(this, Kind.RemoveDuplicates);
	}

	/**
	 * Is this variant instance of kind {@code reverse}?
	 */
	public boolean isReverse() {
		return _kind == Kind.Reverse;
	}

	/**
	 * Get the {@code reverse} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse} kind.
	 */
	public ReverseTokenFilter reverse() {
		return TaggedUnionUtils.get(this, Kind.Reverse);
	}

	/**
	 * Is this variant instance of kind {@code shingle}?
	 */
	public boolean isShingle() {
		return _kind == Kind.Shingle;
	}

	/**
	 * Get the {@code shingle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shingle} kind.
	 */
	public ShingleTokenFilter shingle() {
		return TaggedUnionUtils.get(this, Kind.Shingle);
	}

	/**
	 * Is this variant instance of kind {@code snowball}?
	 */
	public boolean isSnowball() {
		return _kind == Kind.Snowball;
	}

	/**
	 * Get the {@code snowball} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code snowball} kind.
	 */
	public SnowballTokenFilter snowball() {
		return TaggedUnionUtils.get(this, Kind.Snowball);
	}

	/**
	 * Is this variant instance of kind {@code stemmer_override}?
	 */
	public boolean isStemmerOverride() {
		return _kind == Kind.StemmerOverride;
	}

	/**
	 * Get the {@code stemmer_override} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer_override}
	 *             kind.
	 */
	public StemmerOverrideTokenFilter stemmerOverride() {
		return TaggedUnionUtils.get(this, Kind.StemmerOverride);
	}

	/**
	 * Is this variant instance of kind {@code stemmer}?
	 */
	public boolean isStemmer() {
		return _kind == Kind.Stemmer;
	}

	/**
	 * Get the {@code stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer} kind.
	 */
	public StemmerTokenFilter stemmer() {
		return TaggedUnionUtils.get(this, Kind.Stemmer);
	}

	/**
	 * Is this variant instance of kind {@code stop}?
	 */
	public boolean isStop() {
		return _kind == Kind.Stop;
	}

	/**
	 * Get the {@code stop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stop} kind.
	 */
	public StopTokenFilter stop() {
		return TaggedUnionUtils.get(this, Kind.Stop);
	}

	/**
	 * Is this variant instance of kind {@code synonym_graph}?
	 */
	public boolean isSynonymGraph() {
		return _kind == Kind.SynonymGraph;
	}

	/**
	 * Get the {@code synonym_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym_graph} kind.
	 */
	public SynonymGraphTokenFilter synonymGraph() {
		return TaggedUnionUtils.get(this, Kind.SynonymGraph);
	}

	/**
	 * Is this variant instance of kind {@code synonym}?
	 */
	public boolean isSynonym() {
		return _kind == Kind.Synonym;
	}

	/**
	 * Get the {@code synonym} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym} kind.
	 */
	public SynonymTokenFilter synonym() {
		return TaggedUnionUtils.get(this, Kind.Synonym);
	}

	/**
	 * Is this variant instance of kind {@code trim}?
	 */
	public boolean isTrim() {
		return _kind == Kind.Trim;
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimTokenFilter trim() {
		return TaggedUnionUtils.get(this, Kind.Trim);
	}

	/**
	 * Is this variant instance of kind {@code truncate}?
	 */
	public boolean isTruncate() {
		return _kind == Kind.Truncate;
	}

	/**
	 * Get the {@code truncate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code truncate} kind.
	 */
	public TruncateTokenFilter truncate() {
		return TaggedUnionUtils.get(this, Kind.Truncate);
	}

	/**
	 * Is this variant instance of kind {@code unique}?
	 */
	public boolean isUnique() {
		return _kind == Kind.Unique;
	}

	/**
	 * Get the {@code unique} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code unique} kind.
	 */
	public UniqueTokenFilter unique() {
		return TaggedUnionUtils.get(this, Kind.Unique);
	}

	/**
	 * Is this variant instance of kind {@code uppercase}?
	 */
	public boolean isUppercase() {
		return _kind == Kind.Uppercase;
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseTokenFilter uppercase() {
		return TaggedUnionUtils.get(this, Kind.Uppercase);
	}

	/**
	 * Is this variant instance of kind {@code word_delimiter_graph}?
	 */
	public boolean isWordDelimiterGraph() {
		return _kind == Kind.WordDelimiterGraph;
	}

	/**
	 * Get the {@code word_delimiter_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter_graph}
	 *             kind.
	 */
	public WordDelimiterGraphTokenFilter wordDelimiterGraph() {
		return TaggedUnionUtils.get(this, Kind.WordDelimiterGraph);
	}

	/**
	 * Is this variant instance of kind {@code word_delimiter}?
	 */
	public boolean isWordDelimiter() {
		return _kind == Kind.WordDelimiter;
	}

	/**
	 * Get the {@code word_delimiter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter} kind.
	 */
	public WordDelimiterTokenFilter wordDelimiter() {
		return TaggedUnionUtils.get(this, Kind.WordDelimiter);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenFilterDefinition> {
		private Kind _kind;
		private TokenFilterDefinitionVariant _value;

		public Builder asciifolding(AsciiFoldingTokenFilter v) {
			this._kind = Kind.Asciifolding;
			this._value = v;
			return this;
		}

		public Builder asciifolding(Consumer<AsciiFoldingTokenFilter.Builder> fn) {
			AsciiFoldingTokenFilter.Builder builder = new AsciiFoldingTokenFilter.Builder();
			fn.accept(builder);
			return this.asciifolding(builder.build());
		}

		public Builder commonGrams(CommonGramsTokenFilter v) {
			this._kind = Kind.CommonGrams;
			this._value = v;
			return this;
		}

		public Builder commonGrams(Consumer<CommonGramsTokenFilter.Builder> fn) {
			CommonGramsTokenFilter.Builder builder = new CommonGramsTokenFilter.Builder();
			fn.accept(builder);
			return this.commonGrams(builder.build());
		}

		public Builder condition(ConditionTokenFilter v) {
			this._kind = Kind.Condition;
			this._value = v;
			return this;
		}

		public Builder condition(Consumer<ConditionTokenFilter.Builder> fn) {
			ConditionTokenFilter.Builder builder = new ConditionTokenFilter.Builder();
			fn.accept(builder);
			return this.condition(builder.build());
		}

		public Builder delimitedPayload(DelimitedPayloadTokenFilter v) {
			this._kind = Kind.DelimitedPayload;
			this._value = v;
			return this;
		}

		public Builder delimitedPayload(Consumer<DelimitedPayloadTokenFilter.Builder> fn) {
			DelimitedPayloadTokenFilter.Builder builder = new DelimitedPayloadTokenFilter.Builder();
			fn.accept(builder);
			return this.delimitedPayload(builder.build());
		}

		public Builder dictionaryDecompounder(DictionaryDecompounderTokenFilter v) {
			this._kind = Kind.DictionaryDecompounder;
			this._value = v;
			return this;
		}

		public Builder dictionaryDecompounder(Consumer<DictionaryDecompounderTokenFilter.Builder> fn) {
			DictionaryDecompounderTokenFilter.Builder builder = new DictionaryDecompounderTokenFilter.Builder();
			fn.accept(builder);
			return this.dictionaryDecompounder(builder.build());
		}

		public Builder edgeNgram(EdgeNGramTokenFilter v) {
			this._kind = Kind.EdgeNgram;
			this._value = v;
			return this;
		}

		public Builder edgeNgram(Consumer<EdgeNGramTokenFilter.Builder> fn) {
			EdgeNGramTokenFilter.Builder builder = new EdgeNGramTokenFilter.Builder();
			fn.accept(builder);
			return this.edgeNgram(builder.build());
		}

		public Builder elision(ElisionTokenFilter v) {
			this._kind = Kind.Elision;
			this._value = v;
			return this;
		}

		public Builder elision(Consumer<ElisionTokenFilter.Builder> fn) {
			ElisionTokenFilter.Builder builder = new ElisionTokenFilter.Builder();
			fn.accept(builder);
			return this.elision(builder.build());
		}

		public Builder fingerprint(FingerprintTokenFilter v) {
			this._kind = Kind.Fingerprint;
			this._value = v;
			return this;
		}

		public Builder fingerprint(Consumer<FingerprintTokenFilter.Builder> fn) {
			FingerprintTokenFilter.Builder builder = new FingerprintTokenFilter.Builder();
			fn.accept(builder);
			return this.fingerprint(builder.build());
		}

		public Builder hunspell(HunspellTokenFilter v) {
			this._kind = Kind.Hunspell;
			this._value = v;
			return this;
		}

		public Builder hunspell(Consumer<HunspellTokenFilter.Builder> fn) {
			HunspellTokenFilter.Builder builder = new HunspellTokenFilter.Builder();
			fn.accept(builder);
			return this.hunspell(builder.build());
		}

		public Builder hyphenationDecompounder(HyphenationDecompounderTokenFilter v) {
			this._kind = Kind.HyphenationDecompounder;
			this._value = v;
			return this;
		}

		public Builder hyphenationDecompounder(Consumer<HyphenationDecompounderTokenFilter.Builder> fn) {
			HyphenationDecompounderTokenFilter.Builder builder = new HyphenationDecompounderTokenFilter.Builder();
			fn.accept(builder);
			return this.hyphenationDecompounder(builder.build());
		}

		public Builder icuCollation(IcuCollationTokenFilter v) {
			this._kind = Kind.IcuCollation;
			this._value = v;
			return this;
		}

		public Builder icuCollation(Consumer<IcuCollationTokenFilter.Builder> fn) {
			IcuCollationTokenFilter.Builder builder = new IcuCollationTokenFilter.Builder();
			fn.accept(builder);
			return this.icuCollation(builder.build());
		}

		public Builder icuFolding(IcuFoldingTokenFilter v) {
			this._kind = Kind.IcuFolding;
			this._value = v;
			return this;
		}

		public Builder icuFolding(Consumer<IcuFoldingTokenFilter.Builder> fn) {
			IcuFoldingTokenFilter.Builder builder = new IcuFoldingTokenFilter.Builder();
			fn.accept(builder);
			return this.icuFolding(builder.build());
		}

		public Builder icuNormalizer(IcuNormalizationTokenFilter v) {
			this._kind = Kind.IcuNormalizer;
			this._value = v;
			return this;
		}

		public Builder icuNormalizer(Consumer<IcuNormalizationTokenFilter.Builder> fn) {
			IcuNormalizationTokenFilter.Builder builder = new IcuNormalizationTokenFilter.Builder();
			fn.accept(builder);
			return this.icuNormalizer(builder.build());
		}

		public Builder icuTokenizer(IcuTokenizer v) {
			this._kind = Kind.IcuTokenizer;
			this._value = v;
			return this;
		}

		public Builder icuTokenizer(Consumer<IcuTokenizer.Builder> fn) {
			IcuTokenizer.Builder builder = new IcuTokenizer.Builder();
			fn.accept(builder);
			return this.icuTokenizer(builder.build());
		}

		public Builder icuTransform(IcuTransformTokenFilter v) {
			this._kind = Kind.IcuTransform;
			this._value = v;
			return this;
		}

		public Builder icuTransform(Consumer<IcuTransformTokenFilter.Builder> fn) {
			IcuTransformTokenFilter.Builder builder = new IcuTransformTokenFilter.Builder();
			fn.accept(builder);
			return this.icuTransform(builder.build());
		}

		public Builder kstem(KStemTokenFilter v) {
			this._kind = Kind.Kstem;
			this._value = v;
			return this;
		}

		public Builder kstem(Consumer<KStemTokenFilter.Builder> fn) {
			KStemTokenFilter.Builder builder = new KStemTokenFilter.Builder();
			fn.accept(builder);
			return this.kstem(builder.build());
		}

		public Builder keepTypes(KeepTypesTokenFilter v) {
			this._kind = Kind.KeepTypes;
			this._value = v;
			return this;
		}

		public Builder keepTypes(Consumer<KeepTypesTokenFilter.Builder> fn) {
			KeepTypesTokenFilter.Builder builder = new KeepTypesTokenFilter.Builder();
			fn.accept(builder);
			return this.keepTypes(builder.build());
		}

		public Builder keep(KeepWordsTokenFilter v) {
			this._kind = Kind.Keep;
			this._value = v;
			return this;
		}

		public Builder keep(Consumer<KeepWordsTokenFilter.Builder> fn) {
			KeepWordsTokenFilter.Builder builder = new KeepWordsTokenFilter.Builder();
			fn.accept(builder);
			return this.keep(builder.build());
		}

		public Builder keywordMarker(KeywordMarkerTokenFilter v) {
			this._kind = Kind.KeywordMarker;
			this._value = v;
			return this;
		}

		public Builder keywordMarker(Consumer<KeywordMarkerTokenFilter.Builder> fn) {
			KeywordMarkerTokenFilter.Builder builder = new KeywordMarkerTokenFilter.Builder();
			fn.accept(builder);
			return this.keywordMarker(builder.build());
		}

		public Builder kuromojiPartOfSpeech(KuromojiPartOfSpeechTokenFilter v) {
			this._kind = Kind.KuromojiPartOfSpeech;
			this._value = v;
			return this;
		}

		public Builder kuromojiPartOfSpeech(Consumer<KuromojiPartOfSpeechTokenFilter.Builder> fn) {
			KuromojiPartOfSpeechTokenFilter.Builder builder = new KuromojiPartOfSpeechTokenFilter.Builder();
			fn.accept(builder);
			return this.kuromojiPartOfSpeech(builder.build());
		}

		public Builder kuromojiReadingform(KuromojiReadingFormTokenFilter v) {
			this._kind = Kind.KuromojiReadingform;
			this._value = v;
			return this;
		}

		public Builder kuromojiReadingform(Consumer<KuromojiReadingFormTokenFilter.Builder> fn) {
			KuromojiReadingFormTokenFilter.Builder builder = new KuromojiReadingFormTokenFilter.Builder();
			fn.accept(builder);
			return this.kuromojiReadingform(builder.build());
		}

		public Builder kuromojiStemmer(KuromojiStemmerTokenFilter v) {
			this._kind = Kind.KuromojiStemmer;
			this._value = v;
			return this;
		}

		public Builder kuromojiStemmer(Consumer<KuromojiStemmerTokenFilter.Builder> fn) {
			KuromojiStemmerTokenFilter.Builder builder = new KuromojiStemmerTokenFilter.Builder();
			fn.accept(builder);
			return this.kuromojiStemmer(builder.build());
		}

		public Builder length(LengthTokenFilter v) {
			this._kind = Kind.Length;
			this._value = v;
			return this;
		}

		public Builder length(Consumer<LengthTokenFilter.Builder> fn) {
			LengthTokenFilter.Builder builder = new LengthTokenFilter.Builder();
			fn.accept(builder);
			return this.length(builder.build());
		}

		public Builder limit(LimitTokenCountTokenFilter v) {
			this._kind = Kind.Limit;
			this._value = v;
			return this;
		}

		public Builder limit(Consumer<LimitTokenCountTokenFilter.Builder> fn) {
			LimitTokenCountTokenFilter.Builder builder = new LimitTokenCountTokenFilter.Builder();
			fn.accept(builder);
			return this.limit(builder.build());
		}

		public Builder lowercase(LowercaseTokenFilter v) {
			this._kind = Kind.Lowercase;
			this._value = v;
			return this;
		}

		public Builder lowercase(Consumer<LowercaseTokenFilter.Builder> fn) {
			LowercaseTokenFilter.Builder builder = new LowercaseTokenFilter.Builder();
			fn.accept(builder);
			return this.lowercase(builder.build());
		}

		public Builder multiplexer(MultiplexerTokenFilter v) {
			this._kind = Kind.Multiplexer;
			this._value = v;
			return this;
		}

		public Builder multiplexer(Consumer<MultiplexerTokenFilter.Builder> fn) {
			MultiplexerTokenFilter.Builder builder = new MultiplexerTokenFilter.Builder();
			fn.accept(builder);
			return this.multiplexer(builder.build());
		}

		public Builder ngram(NGramTokenFilter v) {
			this._kind = Kind.Ngram;
			this._value = v;
			return this;
		}

		public Builder ngram(Consumer<NGramTokenFilter.Builder> fn) {
			NGramTokenFilter.Builder builder = new NGramTokenFilter.Builder();
			fn.accept(builder);
			return this.ngram(builder.build());
		}

		public Builder noriPartOfSpeech(NoriPartOfSpeechTokenFilter v) {
			this._kind = Kind.NoriPartOfSpeech;
			this._value = v;
			return this;
		}

		public Builder noriPartOfSpeech(Consumer<NoriPartOfSpeechTokenFilter.Builder> fn) {
			NoriPartOfSpeechTokenFilter.Builder builder = new NoriPartOfSpeechTokenFilter.Builder();
			fn.accept(builder);
			return this.noriPartOfSpeech(builder.build());
		}

		public Builder patternCapture(PatternCaptureTokenFilter v) {
			this._kind = Kind.PatternCapture;
			this._value = v;
			return this;
		}

		public Builder patternCapture(Consumer<PatternCaptureTokenFilter.Builder> fn) {
			PatternCaptureTokenFilter.Builder builder = new PatternCaptureTokenFilter.Builder();
			fn.accept(builder);
			return this.patternCapture(builder.build());
		}

		public Builder patternReplace(PatternReplaceTokenFilter v) {
			this._kind = Kind.PatternReplace;
			this._value = v;
			return this;
		}

		public Builder patternReplace(Consumer<PatternReplaceTokenFilter.Builder> fn) {
			PatternReplaceTokenFilter.Builder builder = new PatternReplaceTokenFilter.Builder();
			fn.accept(builder);
			return this.patternReplace(builder.build());
		}

		public Builder phonetic(PhoneticTokenFilter v) {
			this._kind = Kind.Phonetic;
			this._value = v;
			return this;
		}

		public Builder phonetic(Consumer<PhoneticTokenFilter.Builder> fn) {
			PhoneticTokenFilter.Builder builder = new PhoneticTokenFilter.Builder();
			fn.accept(builder);
			return this.phonetic(builder.build());
		}

		public Builder porterStem(PorterStemTokenFilter v) {
			this._kind = Kind.PorterStem;
			this._value = v;
			return this;
		}

		public Builder porterStem(Consumer<PorterStemTokenFilter.Builder> fn) {
			PorterStemTokenFilter.Builder builder = new PorterStemTokenFilter.Builder();
			fn.accept(builder);
			return this.porterStem(builder.build());
		}

		public Builder predicateTokenFilter(PredicateTokenFilter v) {
			this._kind = Kind.PredicateTokenFilter;
			this._value = v;
			return this;
		}

		public Builder predicateTokenFilter(Consumer<PredicateTokenFilter.Builder> fn) {
			PredicateTokenFilter.Builder builder = new PredicateTokenFilter.Builder();
			fn.accept(builder);
			return this.predicateTokenFilter(builder.build());
		}

		public Builder removeDuplicates(RemoveDuplicatesTokenFilter v) {
			this._kind = Kind.RemoveDuplicates;
			this._value = v;
			return this;
		}

		public Builder removeDuplicates(Consumer<RemoveDuplicatesTokenFilter.Builder> fn) {
			RemoveDuplicatesTokenFilter.Builder builder = new RemoveDuplicatesTokenFilter.Builder();
			fn.accept(builder);
			return this.removeDuplicates(builder.build());
		}

		public Builder reverse(ReverseTokenFilter v) {
			this._kind = Kind.Reverse;
			this._value = v;
			return this;
		}

		public Builder reverse(Consumer<ReverseTokenFilter.Builder> fn) {
			ReverseTokenFilter.Builder builder = new ReverseTokenFilter.Builder();
			fn.accept(builder);
			return this.reverse(builder.build());
		}

		public Builder shingle(ShingleTokenFilter v) {
			this._kind = Kind.Shingle;
			this._value = v;
			return this;
		}

		public Builder shingle(Consumer<ShingleTokenFilter.Builder> fn) {
			ShingleTokenFilter.Builder builder = new ShingleTokenFilter.Builder();
			fn.accept(builder);
			return this.shingle(builder.build());
		}

		public Builder snowball(SnowballTokenFilter v) {
			this._kind = Kind.Snowball;
			this._value = v;
			return this;
		}

		public Builder snowball(Consumer<SnowballTokenFilter.Builder> fn) {
			SnowballTokenFilter.Builder builder = new SnowballTokenFilter.Builder();
			fn.accept(builder);
			return this.snowball(builder.build());
		}

		public Builder stemmerOverride(StemmerOverrideTokenFilter v) {
			this._kind = Kind.StemmerOverride;
			this._value = v;
			return this;
		}

		public Builder stemmerOverride(Consumer<StemmerOverrideTokenFilter.Builder> fn) {
			StemmerOverrideTokenFilter.Builder builder = new StemmerOverrideTokenFilter.Builder();
			fn.accept(builder);
			return this.stemmerOverride(builder.build());
		}

		public Builder stemmer(StemmerTokenFilter v) {
			this._kind = Kind.Stemmer;
			this._value = v;
			return this;
		}

		public Builder stemmer(Consumer<StemmerTokenFilter.Builder> fn) {
			StemmerTokenFilter.Builder builder = new StemmerTokenFilter.Builder();
			fn.accept(builder);
			return this.stemmer(builder.build());
		}

		public Builder stop(StopTokenFilter v) {
			this._kind = Kind.Stop;
			this._value = v;
			return this;
		}

		public Builder stop(Consumer<StopTokenFilter.Builder> fn) {
			StopTokenFilter.Builder builder = new StopTokenFilter.Builder();
			fn.accept(builder);
			return this.stop(builder.build());
		}

		public Builder synonymGraph(SynonymGraphTokenFilter v) {
			this._kind = Kind.SynonymGraph;
			this._value = v;
			return this;
		}

		public Builder synonymGraph(Consumer<SynonymGraphTokenFilter.Builder> fn) {
			SynonymGraphTokenFilter.Builder builder = new SynonymGraphTokenFilter.Builder();
			fn.accept(builder);
			return this.synonymGraph(builder.build());
		}

		public Builder synonym(SynonymTokenFilter v) {
			this._kind = Kind.Synonym;
			this._value = v;
			return this;
		}

		public Builder synonym(Consumer<SynonymTokenFilter.Builder> fn) {
			SynonymTokenFilter.Builder builder = new SynonymTokenFilter.Builder();
			fn.accept(builder);
			return this.synonym(builder.build());
		}

		public Builder trim(TrimTokenFilter v) {
			this._kind = Kind.Trim;
			this._value = v;
			return this;
		}

		public Builder trim(Consumer<TrimTokenFilter.Builder> fn) {
			TrimTokenFilter.Builder builder = new TrimTokenFilter.Builder();
			fn.accept(builder);
			return this.trim(builder.build());
		}

		public Builder truncate(TruncateTokenFilter v) {
			this._kind = Kind.Truncate;
			this._value = v;
			return this;
		}

		public Builder truncate(Consumer<TruncateTokenFilter.Builder> fn) {
			TruncateTokenFilter.Builder builder = new TruncateTokenFilter.Builder();
			fn.accept(builder);
			return this.truncate(builder.build());
		}

		public Builder unique(UniqueTokenFilter v) {
			this._kind = Kind.Unique;
			this._value = v;
			return this;
		}

		public Builder unique(Consumer<UniqueTokenFilter.Builder> fn) {
			UniqueTokenFilter.Builder builder = new UniqueTokenFilter.Builder();
			fn.accept(builder);
			return this.unique(builder.build());
		}

		public Builder uppercase(UppercaseTokenFilter v) {
			this._kind = Kind.Uppercase;
			this._value = v;
			return this;
		}

		public Builder uppercase(Consumer<UppercaseTokenFilter.Builder> fn) {
			UppercaseTokenFilter.Builder builder = new UppercaseTokenFilter.Builder();
			fn.accept(builder);
			return this.uppercase(builder.build());
		}

		public Builder wordDelimiterGraph(WordDelimiterGraphTokenFilter v) {
			this._kind = Kind.WordDelimiterGraph;
			this._value = v;
			return this;
		}

		public Builder wordDelimiterGraph(Consumer<WordDelimiterGraphTokenFilter.Builder> fn) {
			WordDelimiterGraphTokenFilter.Builder builder = new WordDelimiterGraphTokenFilter.Builder();
			fn.accept(builder);
			return this.wordDelimiterGraph(builder.build());
		}

		public Builder wordDelimiter(WordDelimiterTokenFilter v) {
			this._kind = Kind.WordDelimiter;
			this._value = v;
			return this;
		}

		public Builder wordDelimiter(Consumer<WordDelimiterTokenFilter.Builder> fn) {
			WordDelimiterTokenFilter.Builder builder = new WordDelimiterTokenFilter.Builder();
			fn.accept(builder);
			return this.wordDelimiter(builder.build());
		}

		public TokenFilterDefinition build() {
			_checkSingleUse();
			return new TokenFilterDefinition(this);
		}

	}

	protected static void setupTokenFilterDefinitionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::asciifolding, AsciiFoldingTokenFilter._DESERIALIZER, "asciifolding");
		op.add(Builder::commonGrams, CommonGramsTokenFilter._DESERIALIZER, "common_grams");
		op.add(Builder::condition, ConditionTokenFilter._DESERIALIZER, "condition");
		op.add(Builder::delimitedPayload, DelimitedPayloadTokenFilter._DESERIALIZER, "delimited_payload");
		op.add(Builder::dictionaryDecompounder, DictionaryDecompounderTokenFilter._DESERIALIZER,
				"dictionary_decompounder");
		op.add(Builder::edgeNgram, EdgeNGramTokenFilter._DESERIALIZER, "edge_ngram");
		op.add(Builder::elision, ElisionTokenFilter._DESERIALIZER, "elision");
		op.add(Builder::fingerprint, FingerprintTokenFilter._DESERIALIZER, "fingerprint");
		op.add(Builder::hunspell, HunspellTokenFilter._DESERIALIZER, "hunspell");
		op.add(Builder::hyphenationDecompounder, HyphenationDecompounderTokenFilter._DESERIALIZER,
				"hyphenation_decompounder");
		op.add(Builder::icuCollation, IcuCollationTokenFilter._DESERIALIZER, "icu_collation");
		op.add(Builder::icuFolding, IcuFoldingTokenFilter._DESERIALIZER, "icu_folding");
		op.add(Builder::icuNormalizer, IcuNormalizationTokenFilter._DESERIALIZER, "icu_normalizer");
		op.add(Builder::icuTokenizer, IcuTokenizer._DESERIALIZER, "icu_tokenizer");
		op.add(Builder::icuTransform, IcuTransformTokenFilter._DESERIALIZER, "icu_transform");
		op.add(Builder::kstem, KStemTokenFilter._DESERIALIZER, "kstem");
		op.add(Builder::keepTypes, KeepTypesTokenFilter._DESERIALIZER, "keep_types");
		op.add(Builder::keep, KeepWordsTokenFilter._DESERIALIZER, "keep");
		op.add(Builder::keywordMarker, KeywordMarkerTokenFilter._DESERIALIZER, "keyword_marker");
		op.add(Builder::kuromojiPartOfSpeech, KuromojiPartOfSpeechTokenFilter._DESERIALIZER, "kuromoji_part_of_speech");
		op.add(Builder::kuromojiReadingform, KuromojiReadingFormTokenFilter._DESERIALIZER, "kuromoji_readingform");
		op.add(Builder::kuromojiStemmer, KuromojiStemmerTokenFilter._DESERIALIZER, "kuromoji_stemmer");
		op.add(Builder::length, LengthTokenFilter._DESERIALIZER, "length");
		op.add(Builder::limit, LimitTokenCountTokenFilter._DESERIALIZER, "limit");
		op.add(Builder::lowercase, LowercaseTokenFilter._DESERIALIZER, "lowercase");
		op.add(Builder::multiplexer, MultiplexerTokenFilter._DESERIALIZER, "multiplexer");
		op.add(Builder::ngram, NGramTokenFilter._DESERIALIZER, "ngram");
		op.add(Builder::noriPartOfSpeech, NoriPartOfSpeechTokenFilter._DESERIALIZER, "nori_part_of_speech");
		op.add(Builder::patternCapture, PatternCaptureTokenFilter._DESERIALIZER, "pattern_capture");
		op.add(Builder::patternReplace, PatternReplaceTokenFilter._DESERIALIZER, "pattern_replace");
		op.add(Builder::phonetic, PhoneticTokenFilter._DESERIALIZER, "phonetic");
		op.add(Builder::porterStem, PorterStemTokenFilter._DESERIALIZER, "porter_stem");
		op.add(Builder::predicateTokenFilter, PredicateTokenFilter._DESERIALIZER, "predicate_token_filter");
		op.add(Builder::removeDuplicates, RemoveDuplicatesTokenFilter._DESERIALIZER, "remove_duplicates");
		op.add(Builder::reverse, ReverseTokenFilter._DESERIALIZER, "reverse");
		op.add(Builder::shingle, ShingleTokenFilter._DESERIALIZER, "shingle");
		op.add(Builder::snowball, SnowballTokenFilter._DESERIALIZER, "snowball");
		op.add(Builder::stemmerOverride, StemmerOverrideTokenFilter._DESERIALIZER, "stemmer_override");
		op.add(Builder::stemmer, StemmerTokenFilter._DESERIALIZER, "stemmer");
		op.add(Builder::stop, StopTokenFilter._DESERIALIZER, "stop");
		op.add(Builder::synonymGraph, SynonymGraphTokenFilter._DESERIALIZER, "synonym_graph");
		op.add(Builder::synonym, SynonymTokenFilter._DESERIALIZER, "synonym");
		op.add(Builder::trim, TrimTokenFilter._DESERIALIZER, "trim");
		op.add(Builder::truncate, TruncateTokenFilter._DESERIALIZER, "truncate");
		op.add(Builder::unique, UniqueTokenFilter._DESERIALIZER, "unique");
		op.add(Builder::uppercase, UppercaseTokenFilter._DESERIALIZER, "uppercase");
		op.add(Builder::wordDelimiterGraph, WordDelimiterGraphTokenFilter._DESERIALIZER, "word_delimiter_graph");
		op.add(Builder::wordDelimiter, WordDelimiterTokenFilter._DESERIALIZER, "word_delimiter");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<TokenFilterDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenFilterDefinition::setupTokenFilterDefinitionDeserializer, Builder::build);
}
